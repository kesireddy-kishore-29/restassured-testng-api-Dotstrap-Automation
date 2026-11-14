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
| 1 | `POST /v1/accounts` | 201 | 54 | `qa-8c08da18-9f75-49ab-95ba-f8c392b19ae1` |
| 2 | `POST /v1/auth/token` | 200 | 28 | `qa-a654a770-1de9-42b0-846c-c9c6a4311651` |
| 3 | `GET /v1/accounts/me` | error | 816 | `qa-2bbb87c1-a6e2-420a-829c-f41e5cf1c8b9` |
| 4 | `GET /v1/accounts/me` | error | 805 | `qa-2b73c1b6-2358-4085-bbbb-f13e0c0fcba7` |
| 5 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-1a7f5c91-b3db-4321-a1cb-4bd91447ed8e` |
| 6 | `POST /v1/auth/token` | 401 | 6 | `qa-6fcec7b3-4f99-4101-a129-86c5e9dccb7a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8c08da18-9f75-49ab-95ba-f8c392b19ae1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c08da18-9f75-49ab-95ba-f8c392b19ae1
Content-Type: application/json

--- request body ---
{"handle":"qa-66fd032c5797","displayName":"QA 66fd032c5797","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c08da18-9f75-49ab-95ba-f8c392b19ae1
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
Location: /v1/accounts/qa-66fd032c5797
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4766ff2-87d3-4d64-80f9-99352c83468e","handle":"qa-66fd032c5797","displayName":"QA 66fd032c5797","region":"eu","role":"user","createdAt":"2026-11-14T09:05:15.477931287Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a654a770-1de9-42b0-846c-c9c6a4311651

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a654a770-1de9-42b0-846c-c9c6a4311651
Content-Type: application/json

--- request body ---
{"handle":"qa-66fd032c5797","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-a654a770-1de9-42b0-846c-c9c6a4311651
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e4766ff2-87d3-4d64-80f9-99352c83468e"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-2bbb87c1-a6e2-420a-829c-f41e5cf1c8b9

--- request headers ---
Accept: application/json
X-Fault-Key: 14d76607-d527-442e-98a0-086ffcfde489
X-Fault: latency=4000
X-Correlation-Id: qa-2bbb87c1-a6e2-420a-829c-f41e5cf1c8b9
Content-Type: application/json

--- response: none in 816 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b73c1b6-2358-4085-bbbb-f13e0c0fcba7

--- request headers ---
Accept: application/json
X-Fault-Key: 14d76607-d527-442e-98a0-086ffcfde489
X-Fault: latency=4000
X-Correlation-Id: qa-2b73c1b6-2358-4085-bbbb-f13e0c0fcba7
Content-Type: application/json

--- response: none in 805 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1a7f5c91-b3db-4321-a1cb-4bd91447ed8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a7f5c91-b3db-4321-a1cb-4bd91447ed8e
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1a7f5c91-b3db-4321-a1cb-4bd91447ed8e
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
correlation: qa-6fcec7b3-4f99-4101-a129-86c5e9dccb7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fcec7b3-4f99-4101-a129-86c5e9dccb7a
Content-Type: application/json

--- request body ---
{"handle":"qa-66fd032c5797","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fcec7b3-4f99-4101-a129-86c5e9dccb7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6fcec7b3-4f99-4101-a129-86c5e9dccb7a"}
```
