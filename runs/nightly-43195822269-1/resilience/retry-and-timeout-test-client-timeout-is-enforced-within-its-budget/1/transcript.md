# Transcript: A slow server cannot hang the client

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#clientTimeoutIsEnforcedWithinItsBudget` |
| Features | FEAT-RES-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-dcb6d904-30ad-45b2-acf9-6d1504e7891a` |
| 2 | `POST /v1/auth/token` | 200 | 27 | `qa-0153c74e-0535-4f9c-86e5-71f13ddd79f5` |
| 3 | `GET /v1/accounts/me` | error | 824 | `qa-7081bb6a-d5fa-4282-a0c6-ebe0b540dabe` |
| 4 | `GET /v1/accounts/me` | error | 806 | `qa-12f1c681-b530-44c4-9ae4-300a6eab1e1b` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-d00fab23-f25e-454a-813a-d99962659da0` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-b705e8e7-9bac-458f-8eab-71f9457636be` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dcb6d904-30ad-45b2-acf9-6d1504e7891a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcb6d904-30ad-45b2-acf9-6d1504e7891a
Content-Type: application/json

--- request body ---
{"handle":"qa-5b119c123b04","displayName":"QA 5b119c123b04","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcb6d904-30ad-45b2-acf9-6d1504e7891a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-5b119c123b04
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4fbb7c56-c3af-403c-9071-9c31b99ab40a","handle":"qa-5b119c123b04","displayName":"QA 5b119c123b04","region":"eu","role":"user","createdAt":"2026-11-12T09:56:36.894468349Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0153c74e-0535-4f9c-86e5-71f13ddd79f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0153c74e-0535-4f9c-86e5-71f13ddd79f5
Content-Type: application/json

--- request body ---
{"handle":"qa-5b119c123b04","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0153c74e-0535-4f9c-86e5-71f13ddd79f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4fbb7c56-c3af-403c-9071-9c31b99ab40a"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-7081bb6a-d5fa-4282-a0c6-ebe0b540dabe

--- request headers ---
Accept: application/json
X-Fault-Key: 6f6896e8-db7d-415d-8fe4-37fa4d1eaa75
X-Fault: latency=4000
X-Correlation-Id: qa-7081bb6a-d5fa-4282-a0c6-ebe0b540dabe
Content-Type: application/json

--- response: none in 824 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-12f1c681-b530-44c4-9ae4-300a6eab1e1b

--- request headers ---
Accept: application/json
X-Fault-Key: 6f6896e8-db7d-415d-8fe4-37fa4d1eaa75
X-Fault: latency=4000
X-Correlation-Id: qa-12f1c681-b530-44c4-9ae4-300a6eab1e1b
Content-Type: application/json

--- response: none in 806 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d00fab23-f25e-454a-813a-d99962659da0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d00fab23-f25e-454a-813a-d99962659da0
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d00fab23-f25e-454a-813a-d99962659da0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b705e8e7-9bac-458f-8eab-71f9457636be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b705e8e7-9bac-458f-8eab-71f9457636be
Content-Type: application/json

--- request body ---
{"handle":"qa-5b119c123b04","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b705e8e7-9bac-458f-8eab-71f9457636be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b705e8e7-9bac-458f-8eab-71f9457636be"}
```
