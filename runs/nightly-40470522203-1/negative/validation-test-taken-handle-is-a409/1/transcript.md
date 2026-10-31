# Transcript: A handle that is already taken is a 409

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#takenHandleIsA409` |
| Features | FEAT-ACCT-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 522 | `qa-4537423e-3cd0-4ad7-aa8e-887224bc2da1` |
| 2 | `POST /v1/accounts` | 409 | 30 | `qa-fc5eee16-d4d4-41c5-83d6-0ab622a6b913` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-565a65f1-1cba-4002-a3d0-cc166854019a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-ed28544f-2e26-42e8-bc93-557e83d67c72` |
| 5 | `POST /v1/auth/token` | 401 | 28 | `qa-8cefd256-c08e-4b5a-b2b7-f7689ceea8fb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4537423e-3cd0-4ad7-aa8e-887224bc2da1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4537423e-3cd0-4ad7-aa8e-887224bc2da1
Content-Type: application/json

--- request body ---
{"handle":"qa-43b0091d590e","displayName":"QA 43b0091d590e","password":"****","region":"eu"}

--- response: 201 in 522 ms ---
Date: Tue, 27 Oct 2026 08:00:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-4537423e-3cd0-4ad7-aa8e-887224bc2da1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 11
Location: /v1/accounts/qa-43b0091d590e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3140ef4a-3fbb-49d7-92c6-0c17defa9bee","handle":"qa-43b0091d590e","displayName":"QA 43b0091d590e","region":"eu","role":"user","createdAt":"2026-10-27T08:00:28.846611050Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fc5eee16-d4d4-41c5-83d6-0ab622a6b913

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc5eee16-d4d4-41c5-83d6-0ab622a6b913
Content-Type: application/json

--- request body ---
{"handle":"qa-43b0091d590e","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 30 ms ---
Date: Tue, 27 Oct 2026 08:00:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc5eee16-d4d4-41c5-83d6-0ab622a6b913
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-43b0091d590e' is in use.","instance":"/v1/accounts","correlationId":"qa-fc5eee16-d4d4-41c5-83d6-0ab622a6b913"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-565a65f1-1cba-4002-a3d0-cc166854019a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-565a65f1-1cba-4002-a3d0-cc166854019a
Content-Type: application/json

--- request body ---
{"handle":"qa-43b0091d590e","password":"****"}

--- response: 200 in 53 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-565a65f1-1cba-4002-a3d0-cc166854019a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3140ef4a-3fbb-49d7-92c6-0c17defa9bee"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ed28544f-2e26-42e8-bc93-557e83d67c72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed28544f-2e26-42e8-bc93-557e83d67c72
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ed28544f-2e26-42e8-bc93-557e83d67c72
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-8cefd256-c08e-4b5a-b2b7-f7689ceea8fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cefd256-c08e-4b5a-b2b7-f7689ceea8fb
Content-Type: application/json

--- request body ---
{"handle":"qa-43b0091d590e","password":"****"}

--- response: 401 in 28 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8cefd256-c08e-4b5a-b2b7-f7689ceea8fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8cefd256-c08e-4b5a-b2b7-f7689ceea8fb"}
```
