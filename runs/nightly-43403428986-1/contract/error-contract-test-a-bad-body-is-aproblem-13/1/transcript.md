# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-5943dcf3-241e-47db-9ed9-f5ac5a42ec6d` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-26f327cd-c59f-4dde-a4e2-f8337931dd8b` |
| 3 | `POST /v1/auth/token` | 200 | 51 | `qa-752515fa-68e0-440e-a738-ceb14083733d` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-3d2d7a0e-3131-4754-8f41-b16d9813dd68` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 19 | `qa-ae7e2d4e-16b4-4f7b-b0c0-5d537d78fc99` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-d05035b7-01b5-40a5-823d-5d5d06f927c6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-6462694f-368f-48f1-8ecd-105f7b96a2ec` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-adf62d89-0e63-4a82-b149-fe5f75f6886b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b3ff6536-f0c5-4818-9e3f-68d8d6863ce4` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-4d90c687-8bae-42b8-b84e-a81de00e41a0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5943dcf3-241e-47db-9ed9-f5ac5a42ec6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5943dcf3-241e-47db-9ed9-f5ac5a42ec6d
Content-Type: application/json

--- request body ---
{"handle":"qa-6dbc3b70e4af","displayName":"QA 6dbc3b70e4af","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-5943dcf3-241e-47db-9ed9-f5ac5a42ec6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Location: /v1/accounts/qa-6dbc3b70e4af
X-Served-Region: eu
Content-Length: 181

{"id":"acc_043422ed-a2d2-48bc-b491-3a6674ff4ff5","handle":"qa-6dbc3b70e4af","displayName":"QA 6dbc3b70e4af","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.099505834Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-26f327cd-c59f-4dde-a4e2-f8337931dd8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26f327cd-c59f-4dde-a4e2-f8337931dd8b
Content-Type: application/json

--- request body ---
{"handle":"qa-a651a7b0a8e5","displayName":"QA a651a7b0a8e5","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-26f327cd-c59f-4dde-a4e2-f8337931dd8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 7
Location: /v1/accounts/qa-a651a7b0a8e5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bb5ae80d-51ea-4ea5-a983-560d5a258751","handle":"qa-a651a7b0a8e5","displayName":"QA a651a7b0a8e5","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.142147427Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-752515fa-68e0-440e-a738-ceb14083733d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-752515fa-68e0-440e-a738-ceb14083733d
Content-Type: application/json

--- request body ---
{"handle":"qa-6dbc3b70e4af","password":"****"}

--- response: 200 in 51 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-752515fa-68e0-440e-a738-ceb14083733d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_043422ed-a2d2-48bc-b491-3a6674ff4ff5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3d2d7a0e-3131-4754-8f41-b16d9813dd68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d2d7a0e-3131-4754-8f41-b16d9813dd68
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a651a7b0a8e5","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d2d7a0e-3131-4754-8f41-b16d9813dd68
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
Location: /v1/conversations/cnv_223bbaa5-9958-4dad-bc69-9383dd64f3b5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_223bbaa5-9958-4dad-bc69-9383dd64f3b5","subject":"Error contract","status":"open","region":"eu","participants":["qa-6dbc3b70e4af","qa-a651a7b0a8e5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:08.253572086Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_223bbaa5-9958-4dad-bc69-9383dd64f3b5/messages
correlation: qa-ae7e2d4e-16b4-4f7b-b0c0-5d537d78fc99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae7e2d4e-16b4-4f7b-b0c0-5d537d78fc99
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae7e2d4e-16b4-4f7b-b0c0-5d537d78fc99
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_223bbaa5-9958-4dad-bc69-9383dd64f3b5/messages","correlationId":"qa-ae7e2d4e-16b4-4f7b-b0c0-5d537d78fc99"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d05035b7-01b5-40a5-823d-5d5d06f927c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d05035b7-01b5-40a5-823d-5d5d06f927c6
Content-Type: application/json

--- request body ---
{"handle":"qa-a651a7b0a8e5","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-d05035b7-01b5-40a5-823d-5d5d06f927c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bb5ae80d-51ea-4ea5-a983-560d5a258751"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6462694f-368f-48f1-8ecd-105f7b96a2ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6462694f-368f-48f1-8ecd-105f7b96a2ec
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6462694f-368f-48f1-8ecd-105f7b96a2ec
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-adf62d89-0e63-4a82-b149-fe5f75f6886b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adf62d89-0e63-4a82-b149-fe5f75f6886b
Content-Type: application/json

--- request body ---
{"handle":"qa-a651a7b0a8e5","password":"****"}

--- response: 401 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-adf62d89-0e63-4a82-b149-fe5f75f6886b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-adf62d89-0e63-4a82-b149-fe5f75f6886b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b3ff6536-f0c5-4818-9e3f-68d8d6863ce4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3ff6536-f0c5-4818-9e3f-68d8d6863ce4
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b3ff6536-f0c5-4818-9e3f-68d8d6863ce4
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-4d90c687-8bae-42b8-b84e-a81de00e41a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d90c687-8bae-42b8-b84e-a81de00e41a0
Content-Type: application/json

--- request body ---
{"handle":"qa-6dbc3b70e4af","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d90c687-8bae-42b8-b84e-a81de00e41a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4d90c687-8bae-42b8-b84e-a81de00e41a0"}
```
