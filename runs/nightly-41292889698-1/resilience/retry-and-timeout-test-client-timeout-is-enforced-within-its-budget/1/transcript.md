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
| 1 | `POST /v1/accounts` | 201 | 490 | `qa-75ed2104-e8b3-40f4-a1cf-d894f563574d` |
| 2 | `POST /v1/auth/token` | 200 | 46 | `qa-87780a6b-d4c2-498c-9e79-77c6ac10b8d7` |
| 3 | `GET /v1/accounts/me` | error | 836 | `qa-17596d27-7e0f-410b-84fb-20ff354f874b` |
| 4 | `GET /v1/accounts/me` | error | 811 | `qa-ea50098a-cd48-4a8c-be32-90da47c0198c` |
| 5 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-96a74730-6f12-4ac1-9516-8c445bfeadb7` |
| 6 | `POST /v1/auth/token` | 401 | 6 | `qa-0cdd9340-99ec-4a78-b948-e6e40852a60b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-75ed2104-e8b3-40f4-a1cf-d894f563574d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75ed2104-e8b3-40f4-a1cf-d894f563574d
Content-Type: application/json

--- request body ---
{"handle":"qa-1cc06baca912","displayName":"QA 1cc06baca912","password":"****","region":"eu"}

--- response: 201 in 490 ms ---
Date: Sun, 01 Nov 2026 09:23:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-75ed2104-e8b3-40f4-a1cf-d894f563574d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-1cc06baca912
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88d76c5d-234c-47dc-a9cc-57fb464174a1","handle":"qa-1cc06baca912","displayName":"QA 1cc06baca912","region":"eu","role":"user","createdAt":"2026-11-01T09:23:29.287907522Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-87780a6b-d4c2-498c-9e79-77c6ac10b8d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87780a6b-d4c2-498c-9e79-77c6ac10b8d7
Content-Type: application/json

--- request body ---
{"handle":"qa-1cc06baca912","password":"****"}

--- response: 200 in 46 ms ---
Date: Sun, 01 Nov 2026 09:23:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-87780a6b-d4c2-498c-9e79-77c6ac10b8d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_88d76c5d-234c-47dc-a9cc-57fb464174a1"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-17596d27-7e0f-410b-84fb-20ff354f874b

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: aa7c8bfc-626c-43e0-8c96-74eafe339e82
X-Correlation-Id: qa-17596d27-7e0f-410b-84fb-20ff354f874b
Content-Type: application/json

--- response: none in 836 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea50098a-cd48-4a8c-be32-90da47c0198c

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: aa7c8bfc-626c-43e0-8c96-74eafe339e82
X-Correlation-Id: qa-ea50098a-cd48-4a8c-be32-90da47c0198c
Content-Type: application/json

--- response: none in 811 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-96a74730-6f12-4ac1-9516-8c445bfeadb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96a74730-6f12-4ac1-9516-8c445bfeadb7
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-96a74730-6f12-4ac1-9516-8c445bfeadb7
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
correlation: qa-0cdd9340-99ec-4a78-b948-e6e40852a60b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cdd9340-99ec-4a78-b948-e6e40852a60b
Content-Type: application/json

--- request body ---
{"handle":"qa-1cc06baca912","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0cdd9340-99ec-4a78-b948-e6e40852a60b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0cdd9340-99ec-4a78-b948-e6e40852a60b"}
```
