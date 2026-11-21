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
| 1 | `POST /v1/accounts` | 201 | 382 | `qa-4e5b191d-2e75-4fb1-8525-50908c4c6394` |
| 2 | `POST /v1/accounts` | 409 | 16 | `qa-25f4545c-ce38-44d8-bca9-1c9d9e2bbfef` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-a86c934f-9cdb-4c6d-a995-686990398b39` |
| 4 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-6d4f9944-6b48-4297-bb66-561d7c4f81af` |
| 5 | `POST /v1/auth/token` | 401 | 20 | `qa-0957fb42-c453-4d7a-a7c5-cacb40130138` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4e5b191d-2e75-4fb1-8525-50908c4c6394

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e5b191d-2e75-4fb1-8525-50908c4c6394
Content-Type: application/json

--- request body ---
{"handle":"qa-093e6a7505d9","displayName":"QA 093e6a7505d9","password":"****","region":"eu"}

--- response: 201 in 382 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e5b191d-2e75-4fb1-8525-50908c4c6394
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-093e6a7505d9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3886366e-3b46-4c65-b374-e4b4a00e0a4f","handle":"qa-093e6a7505d9","displayName":"QA 093e6a7505d9","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.496639911Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-25f4545c-ce38-44d8-bca9-1c9d9e2bbfef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25f4545c-ce38-44d8-bca9-1c9d9e2bbfef
Content-Type: application/json

--- request body ---
{"handle":"qa-093e6a7505d9","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25f4545c-ce38-44d8-bca9-1c9d9e2bbfef
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

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-093e6a7505d9' is in use.","instance":"/v1/accounts","correlationId":"qa-25f4545c-ce38-44d8-bca9-1c9d9e2bbfef"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a86c934f-9cdb-4c6d-a995-686990398b39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a86c934f-9cdb-4c6d-a995-686990398b39
Content-Type: application/json

--- request body ---
{"handle":"qa-093e6a7505d9","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a86c934f-9cdb-4c6d-a995-686990398b39
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3886366e-3b46-4c65-b374-e4b4a00e0a4f"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d4f9944-6b48-4297-bb66-561d7c4f81af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d4f9944-6b48-4297-bb66-561d7c4f81af
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d4f9944-6b48-4297-bb66-561d7c4f81af
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
correlation: qa-0957fb42-c453-4d7a-a7c5-cacb40130138

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0957fb42-c453-4d7a-a7c5-cacb40130138
Content-Type: application/json

--- request body ---
{"handle":"qa-093e6a7505d9","password":"****"}

--- response: 401 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0957fb42-c453-4d7a-a7c5-cacb40130138
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0957fb42-c453-4d7a-a7c5-cacb40130138"}
```
