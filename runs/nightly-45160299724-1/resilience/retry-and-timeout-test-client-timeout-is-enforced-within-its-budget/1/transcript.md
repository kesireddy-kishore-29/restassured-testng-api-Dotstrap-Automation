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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-ba6b89b9-9bab-427f-bbd0-27c94df43ed3` |
| 2 | `POST /v1/auth/token` | 200 | 28 | `qa-9a62e650-996d-45f2-8830-a379aeadf96a` |
| 3 | `GET /v1/accounts/me` | error | 811 | `qa-3b3eb701-09aa-4f1c-84d8-e1f10054450b` |
| 4 | `GET /v1/accounts/me` | error | 806 | `qa-fe2a1922-befc-4a2f-a458-6e4f14342a33` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-83bede9c-87eb-4f5d-b7aa-9c56bbd21f3e` |
| 6 | `POST /v1/auth/token` | 401 | 4 | `qa-8f3b3822-83e4-4a54-8f96-c246c5975b8c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ba6b89b9-9bab-427f-bbd0-27c94df43ed3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba6b89b9-9bab-427f-bbd0-27c94df43ed3
Content-Type: application/json

--- request body ---
{"handle":"qa-ce3a6f978322","displayName":"QA ce3a6f978322","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba6b89b9-9bab-427f-bbd0-27c94df43ed3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-ce3a6f978322
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a20151ca-efb5-41c1-97dc-196bcef5f55d","handle":"qa-ce3a6f978322","displayName":"QA ce3a6f978322","region":"eu","role":"user","createdAt":"2026-11-23T10:55:02.814756743Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9a62e650-996d-45f2-8830-a379aeadf96a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a62e650-996d-45f2-8830-a379aeadf96a
Content-Type: application/json

--- request body ---
{"handle":"qa-ce3a6f978322","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a62e650-996d-45f2-8830-a379aeadf96a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a20151ca-efb5-41c1-97dc-196bcef5f55d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-3b3eb701-09aa-4f1c-84d8-e1f10054450b

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 9b8d5cb3-e5e8-4f55-b8d9-9c67d0b087a5
X-Correlation-Id: qa-3b3eb701-09aa-4f1c-84d8-e1f10054450b
Content-Type: application/json

--- response: none in 811 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe2a1922-befc-4a2f-a458-6e4f14342a33

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 9b8d5cb3-e5e8-4f55-b8d9-9c67d0b087a5
X-Correlation-Id: qa-fe2a1922-befc-4a2f-a458-6e4f14342a33
Content-Type: application/json

--- response: none in 806 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-83bede9c-87eb-4f5d-b7aa-9c56bbd21f3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83bede9c-87eb-4f5d-b7aa-9c56bbd21f3e
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-83bede9c-87eb-4f5d-b7aa-9c56bbd21f3e
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
correlation: qa-8f3b3822-83e4-4a54-8f96-c246c5975b8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f3b3822-83e4-4a54-8f96-c246c5975b8c
Content-Type: application/json

--- request body ---
{"handle":"qa-ce3a6f978322","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f3b3822-83e4-4a54-8f96-c246c5975b8c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f3b3822-83e4-4a54-8f96-c246c5975b8c"}
```
