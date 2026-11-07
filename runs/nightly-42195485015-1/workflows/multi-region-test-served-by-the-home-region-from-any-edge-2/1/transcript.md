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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-0ab84ab3-f67e-4742-884a-06c5c1b52a8f` |
| 2 | `POST /v1/auth/token` | 200 | 33 | `qa-d4d84865-b375-4d65-b032-094443162e90` |
| 3 | `GET /v1/accounts/me` | 200 | 15 | `qa-abb4d2d4-f94d-4dc4-ad40-2cd5c52e4aec` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-416ba1e3-2a4d-4f40-81da-b89d41161e35` |
| 5 | `POST /v1/auth/token` | 401 | 17 | `qa-ddf6a312-aeba-472e-8e75-dc9c862382f1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0ab84ab3-f67e-4742-884a-06c5c1b52a8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ab84ab3-f67e-4742-884a-06c5c1b52a8f
Content-Type: application/json

--- request body ---
{"handle":"qa-9ac2b8eb4aa7","displayName":"QA 9ac2b8eb4aa7","password":"****","region":"us"}

--- response: 201 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ab84ab3-f67e-4742-884a-06c5c1b52a8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-9ac2b8eb4aa7
X-Served-Region: us
Content-Length: 181

{"id":"acc_17d4aefe-ce7b-476e-ade1-4e2a0e5121be","handle":"qa-9ac2b8eb4aa7","displayName":"QA 9ac2b8eb4aa7","region":"us","role":"user","createdAt":"2026-11-06T09:30:32.409609089Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d4d84865-b375-4d65-b032-094443162e90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4d84865-b375-4d65-b032-094443162e90
Content-Type: application/json

--- request body ---
{"handle":"qa-9ac2b8eb4aa7","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4d84865-b375-4d65-b032-094443162e90
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_17d4aefe-ce7b-476e-ade1-4e2a0e5121be"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-abb4d2d4-f94d-4dc4-ad40-2cd5c52e4aec

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-abb4d2d4-f94d-4dc4-ad40-2cd5c52e4aec
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-abb4d2d4-f94d-4dc4-ad40-2cd5c52e4aec
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

{"id":"acc_17d4aefe-ce7b-476e-ade1-4e2a0e5121be","handle":"qa-9ac2b8eb4aa7","displayName":"QA 9ac2b8eb4aa7","region":"us","role":"user","createdAt":"2026-11-06T09:30:32.409609089Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-416ba1e3-2a4d-4f40-81da-b89d41161e35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-416ba1e3-2a4d-4f40-81da-b89d41161e35
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-416ba1e3-2a4d-4f40-81da-b89d41161e35
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
correlation: qa-ddf6a312-aeba-472e-8e75-dc9c862382f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddf6a312-aeba-472e-8e75-dc9c862382f1
Content-Type: application/json

--- request body ---
{"handle":"qa-9ac2b8eb4aa7","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddf6a312-aeba-472e-8e75-dc9c862382f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ddf6a312-aeba-472e-8e75-dc9c862382f1"}
```
