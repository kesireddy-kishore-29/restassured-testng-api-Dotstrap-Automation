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
| 1 | `POST /v1/accounts` | 201 | 536 | `qa-ae90f00c-a274-46cb-99b4-1ed5873c778f` |
| 2 | `POST /v1/accounts` | 409 | 26 | `qa-090b1416-959c-4f50-9b46-fb1cf2e67fcb` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-026ab08d-3c9b-4abe-9ffc-f861828428dd` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-6da5463f-733c-4830-aa24-24076bbed166` |
| 5 | `POST /v1/auth/token` | 401 | 17 | `qa-e6f9af5f-6e9d-4ec4-913e-383daa27c10b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ae90f00c-a274-46cb-99b4-1ed5873c778f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae90f00c-a274-46cb-99b4-1ed5873c778f
Content-Type: application/json

--- request body ---
{"handle":"qa-a4b7093f84b7","displayName":"QA a4b7093f84b7","password":"****","region":"eu"}

--- response: 201 in 536 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae90f00c-a274-46cb-99b4-1ed5873c778f
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
Location: /v1/accounts/qa-a4b7093f84b7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5f996cbe-e9ab-4cfd-90c4-f81a5310ddfa","handle":"qa-a4b7093f84b7","displayName":"QA a4b7093f84b7","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.642479702Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-090b1416-959c-4f50-9b46-fb1cf2e67fcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-090b1416-959c-4f50-9b46-fb1cf2e67fcb
Content-Type: application/json

--- request body ---
{"handle":"qa-a4b7093f84b7","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-090b1416-959c-4f50-9b46-fb1cf2e67fcb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-a4b7093f84b7' is in use.","instance":"/v1/accounts","correlationId":"qa-090b1416-959c-4f50-9b46-fb1cf2e67fcb"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-026ab08d-3c9b-4abe-9ffc-f861828428dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-026ab08d-3c9b-4abe-9ffc-f861828428dd
Content-Type: application/json

--- request body ---
{"handle":"qa-a4b7093f84b7","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-026ab08d-3c9b-4abe-9ffc-f861828428dd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5f996cbe-e9ab-4cfd-90c4-f81a5310ddfa"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6da5463f-733c-4830-aa24-24076bbed166

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6da5463f-733c-4830-aa24-24076bbed166
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6da5463f-733c-4830-aa24-24076bbed166
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
correlation: qa-e6f9af5f-6e9d-4ec4-913e-383daa27c10b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6f9af5f-6e9d-4ec4-913e-383daa27c10b
Content-Type: application/json

--- request body ---
{"handle":"qa-a4b7093f84b7","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e6f9af5f-6e9d-4ec4-913e-383daa27c10b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e6f9af5f-6e9d-4ec4-913e-383daa27c10b"}
```
