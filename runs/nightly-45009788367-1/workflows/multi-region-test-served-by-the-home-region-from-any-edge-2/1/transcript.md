# Transcript: Requests are served by the home region, whichever edge they arrive at [US, in]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[2]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 501 | `qa-15cc769b-123b-443c-bab8-201e7cea9606` |
| 2 | `POST /v1/auth/token` | 200 | 39 | `qa-88a66cff-0beb-4fa8-a6a0-ea33ed172f3a` |
| 3 | `GET /v1/accounts/me` | 200 | 58 | `qa-91009d2d-0abc-4ca4-a961-4e4fb19e5743` |
| 4 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-c3598f00-bef4-4cc3-b73c-6c88eb684e2b` |
| 5 | `POST /v1/auth/token` | 401 | 20 | `qa-5155824e-5343-4969-8d07-e206b3de6255` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-15cc769b-123b-443c-bab8-201e7cea9606

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15cc769b-123b-443c-bab8-201e7cea9606
Content-Type: application/json

--- request body ---
{"handle":"qa-6da3d0bb0551","displayName":"QA 6da3d0bb0551","password":"****","region":"us"}

--- response: 201 in 501 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-15cc769b-123b-443c-bab8-201e7cea9606
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-6da3d0bb0551
X-Served-Region: us
Content-Length: 181

{"id":"acc_f5a7d74a-29d5-4f79-a692-e7d524a38464","handle":"qa-6da3d0bb0551","displayName":"QA 6da3d0bb0551","region":"us","role":"user","createdAt":"2026-11-22T09:54:48.301937059Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-88a66cff-0beb-4fa8-a6a0-ea33ed172f3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88a66cff-0beb-4fa8-a6a0-ea33ed172f3a
Content-Type: application/json

--- request body ---
{"handle":"qa-6da3d0bb0551","password":"****"}

--- response: 200 in 39 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-88a66cff-0beb-4fa8-a6a0-ea33ed172f3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f5a7d74a-29d5-4f79-a692-e7d524a38464"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-91009d2d-0abc-4ca4-a961-4e4fb19e5743

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-91009d2d-0abc-4ca4-a961-4e4fb19e5743
Content-Type: application/json

--- response: 200 in 58 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-91009d2d-0abc-4ca4-a961-4e4fb19e5743
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: in
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 181

{"id":"acc_f5a7d74a-29d5-4f79-a692-e7d524a38464","handle":"qa-6da3d0bb0551","displayName":"QA 6da3d0bb0551","region":"us","role":"user","createdAt":"2026-11-22T09:54:48.301937059Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c3598f00-bef4-4cc3-b73c-6c88eb684e2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3598f00-bef4-4cc3-b73c-6c88eb684e2b
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c3598f00-bef4-4cc3-b73c-6c88eb684e2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: us
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-5155824e-5343-4969-8d07-e206b3de6255

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5155824e-5343-4969-8d07-e206b3de6255
Content-Type: application/json

--- request body ---
{"handle":"qa-6da3d0bb0551","password":"****"}

--- response: 401 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5155824e-5343-4969-8d07-e206b3de6255
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5155824e-5343-4969-8d07-e206b3de6255"}
```
