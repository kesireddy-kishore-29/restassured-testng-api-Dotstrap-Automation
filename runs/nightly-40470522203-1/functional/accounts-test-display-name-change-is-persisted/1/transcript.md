# Transcript: A new display name is stored and returned

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#displayNameChangeIsPersisted` |
| Features | FEAT-ACCT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 438 | `qa-5b09772c-9d1f-4265-9b89-5f3e21d46ef4` |
| 2 | `POST /v1/auth/token` | 200 | 71 | `qa-dadfd409-76e4-472a-b107-b73c9002bbc5` |
| 3 | `PATCH /v1/accounts/me` | 200 | 54 | `qa-8148ac1c-b81f-46f6-aca5-9cdeae879db6` |
| 4 | `GET /v1/accounts/me` | 200 | 15 | `qa-2afd5d16-5ea8-454f-a4e0-a51ee4ce450c` |
| 5 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-ef0860c6-a8b5-48c1-9312-52f79d214048` |
| 6 | `POST /v1/auth/token` | 401 | 36 | `qa-15ea5216-ac14-43e3-84dd-3fdd2f7cb16f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5b09772c-9d1f-4265-9b89-5f3e21d46ef4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b09772c-9d1f-4265-9b89-5f3e21d46ef4
Content-Type: application/json

--- request body ---
{"handle":"qa-eb60759bad85","displayName":"QA eb60759bad85","password":"****","region":"eu"}

--- response: 201 in 438 ms ---
Date: Tue, 27 Oct 2026 08:00:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b09772c-9d1f-4265-9b89-5f3e21d46ef4
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
Location: /v1/accounts/qa-eb60759bad85
X-Served-Region: eu
Content-Length: 181

{"id":"acc_97748477-ce29-4f56-b8aa-76f9bdee2916","handle":"qa-eb60759bad85","displayName":"QA eb60759bad85","region":"eu","role":"user","createdAt":"2026-10-27T08:00:29.785544782Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-dadfd409-76e4-472a-b107-b73c9002bbc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dadfd409-76e4-472a-b107-b73c9002bbc5
Content-Type: application/json

--- request body ---
{"handle":"qa-eb60759bad85","password":"****"}

--- response: 200 in 71 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-dadfd409-76e4-472a-b107-b73c9002bbc5
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_97748477-ce29-4f56-b8aa-76f9bdee2916"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-8148ac1c-b81f-46f6-aca5-9cdeae879db6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8148ac1c-b81f-46f6-aca5-9cdeae879db6
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 54 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-8148ac1c-b81f-46f6-aca5-9cdeae879db6
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
Content-Length: 179

{"id":"acc_97748477-ce29-4f56-b8aa-76f9bdee2916","handle":"qa-eb60759bad85","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-27T08:00:29.785544782Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-2afd5d16-5ea8-454f-a4e0-a51ee4ce450c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2afd5d16-5ea8-454f-a4e0-a51ee4ce450c
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-2afd5d16-5ea8-454f-a4e0-a51ee4ce450c
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
X-Served-Region: eu
Content-Length: 179

{"id":"acc_97748477-ce29-4f56-b8aa-76f9bdee2916","handle":"qa-eb60759bad85","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-27T08:00:29.785544782Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef0860c6-a8b5-48c1-9312-52f79d214048

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef0860c6-a8b5-48c1-9312-52f79d214048
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef0860c6-a8b5-48c1-9312-52f79d214048
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-15ea5216-ac14-43e3-84dd-3fdd2f7cb16f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15ea5216-ac14-43e3-84dd-3fdd2f7cb16f
Content-Type: application/json

--- request body ---
{"handle":"qa-eb60759bad85","password":"****"}

--- response: 401 in 36 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15ea5216-ac14-43e3-84dd-3fdd2f7cb16f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-15ea5216-ac14-43e3-84dd-3fdd2f7cb16f"}
```
