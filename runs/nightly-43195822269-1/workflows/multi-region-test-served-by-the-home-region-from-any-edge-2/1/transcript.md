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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-c1c27802-41b4-428a-bb5b-22d8ca44c966` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-931c9ced-6883-4f67-8e30-43e3a6dc3a6e` |
| 3 | `GET /v1/accounts/me` | 200 | 10 | `qa-1c1d7b54-d000-4a35-bdc2-0bd831a062d5` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-ed625a9e-cfbd-4e20-8878-a04e0f75560a` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-b855a500-03d1-4619-aed7-f7cb83fe8d82` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c1c27802-41b4-428a-bb5b-22d8ca44c966

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1c27802-41b4-428a-bb5b-22d8ca44c966
Content-Type: application/json

--- request body ---
{"handle":"qa-6b72a4c47e79","displayName":"QA 6b72a4c47e79","password":"****","region":"us"}

--- response: 201 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1c27802-41b4-428a-bb5b-22d8ca44c966
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-6b72a4c47e79
X-Served-Region: us
Content-Length: 181

{"id":"acc_cb313d88-4572-4420-8762-7599d327347d","handle":"qa-6b72a4c47e79","displayName":"QA 6b72a4c47e79","region":"us","role":"user","createdAt":"2026-11-12T09:56:38.019800451Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-931c9ced-6883-4f67-8e30-43e3a6dc3a6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-931c9ced-6883-4f67-8e30-43e3a6dc3a6e
Content-Type: application/json

--- request body ---
{"handle":"qa-6b72a4c47e79","password":"****"}

--- response: 200 in 43 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-931c9ced-6883-4f67-8e30-43e3a6dc3a6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb313d88-4572-4420-8762-7599d327347d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-1c1d7b54-d000-4a35-bdc2-0bd831a062d5

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-1c1d7b54-d000-4a35-bdc2-0bd831a062d5
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c1d7b54-d000-4a35-bdc2-0bd831a062d5
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

{"id":"acc_cb313d88-4572-4420-8762-7599d327347d","handle":"qa-6b72a4c47e79","displayName":"QA 6b72a4c47e79","region":"us","role":"user","createdAt":"2026-11-12T09:56:38.019800451Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ed625a9e-cfbd-4e20-8878-a04e0f75560a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed625a9e-cfbd-4e20-8878-a04e0f75560a
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ed625a9e-cfbd-4e20-8878-a04e0f75560a
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
correlation: qa-b855a500-03d1-4619-aed7-f7cb83fe8d82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b855a500-03d1-4619-aed7-f7cb83fe8d82
Content-Type: application/json

--- request body ---
{"handle":"qa-6b72a4c47e79","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b855a500-03d1-4619-aed7-f7cb83fe8d82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b855a500-03d1-4619-aed7-f7cb83fe8d82"}
```
