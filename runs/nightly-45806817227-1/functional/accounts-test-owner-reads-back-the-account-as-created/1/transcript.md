# Transcript: The owner reads back exactly what was created

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#ownerReadsBackTheAccountAsCreated` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-f65d6aa9-684f-437c-814f-0d11eb4ee1a5` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-3ca2b5de-2fda-48f9-96ea-1491433032a1` |
| 3 | `GET /v1/accounts/me` | 200 | 15 | `qa-546d951e-a9b5-4c69-8909-7c3041acb3d2` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-880d0180-9262-4c68-95e6-3efe776180e9` |
| 5 | `POST /v1/auth/token` | 401 | 14 | `qa-8307c7b3-1efc-474f-80f9-227cbdbb4586` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f65d6aa9-684f-437c-814f-0d11eb4ee1a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f65d6aa9-684f-437c-814f-0d11eb4ee1a5
Content-Type: application/json

--- request body ---
{"handle":"qa-1a71b0ea6829","displayName":"QA 1a71b0ea6829","password":"****","region":"in"}

--- response: 201 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f65d6aa9-684f-437c-814f-0d11eb4ee1a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-1a71b0ea6829
X-Served-Region: in
Content-Length: 181

{"id":"acc_04ff071a-ac4f-47a2-a46d-62d15abd0c26","handle":"qa-1a71b0ea6829","displayName":"QA 1a71b0ea6829","region":"in","role":"user","createdAt":"2026-11-26T11:02:34.287913638Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3ca2b5de-2fda-48f9-96ea-1491433032a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ca2b5de-2fda-48f9-96ea-1491433032a1
Content-Type: application/json

--- request body ---
{"handle":"qa-1a71b0ea6829","password":"****"}

--- response: 200 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ca2b5de-2fda-48f9-96ea-1491433032a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_04ff071a-ac4f-47a2-a46d-62d15abd0c26"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-546d951e-a9b5-4c69-8909-7c3041acb3d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-546d951e-a9b5-4c69-8909-7c3041acb3d2
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-546d951e-a9b5-4c69-8909-7c3041acb3d2
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
X-Served-Region: in
Content-Length: 181

{"id":"acc_04ff071a-ac4f-47a2-a46d-62d15abd0c26","handle":"qa-1a71b0ea6829","displayName":"QA 1a71b0ea6829","region":"in","role":"user","createdAt":"2026-11-26T11:02:34.287913638Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-880d0180-9262-4c68-95e6-3efe776180e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-880d0180-9262-4c68-95e6-3efe776180e9
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-880d0180-9262-4c68-95e6-3efe776180e9
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
X-Served-Region: in
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-8307c7b3-1efc-474f-80f9-227cbdbb4586

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8307c7b3-1efc-474f-80f9-227cbdbb4586
Content-Type: application/json

--- request body ---
{"handle":"qa-1a71b0ea6829","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8307c7b3-1efc-474f-80f9-227cbdbb4586
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8307c7b3-1efc-474f-80f9-227cbdbb4586"}
```
