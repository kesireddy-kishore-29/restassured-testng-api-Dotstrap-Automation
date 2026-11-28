# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-dcac85f7-c7d9-4b05-8cca-b68bb6beb1d6` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-e6ab8b49-f3ba-46c8-9d57-10ff5768a333` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-81751d2f-ebe6-48b6-ad3c-cfcaf8e427b8` |
| 4 | `POST /v1/conversations` | 201 | 32 | `qa-20b5ad02-918e-43aa-820c-1c1d1410d009` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 14 | `qa-1508ccb6-cd87-4eb1-abe5-74f6038556da` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-44c91ea3-5c8a-4c83-989b-3ad60a9f33c3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-86fb97c1-d7e6-4d1f-a075-39999d5887a9` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-8841fc71-cd79-4f78-86cb-1ed85f658aaf` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-dac1f7b6-e850-4dce-bb11-8b4493873b15` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-08f037a1-bc75-402d-a740-e61ac12c38e0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dcac85f7-c7d9-4b05-8cca-b68bb6beb1d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcac85f7-c7d9-4b05-8cca-b68bb6beb1d6
Content-Type: application/json

--- request body ---
{"handle":"qa-bb7305af8ede","displayName":"QA bb7305af8ede","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcac85f7-c7d9-4b05-8cca-b68bb6beb1d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 8
Location: /v1/accounts/qa-bb7305af8ede
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f57654fb-5fd1-40c5-9550-2e6f2a39b8c7","handle":"qa-bb7305af8ede","displayName":"QA bb7305af8ede","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.784735615Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e6ab8b49-f3ba-46c8-9d57-10ff5768a333

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6ab8b49-f3ba-46c8-9d57-10ff5768a333
Content-Type: application/json

--- request body ---
{"handle":"qa-5473c1c23523","displayName":"QA 5473c1c23523","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6ab8b49-f3ba-46c8-9d57-10ff5768a333
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 7
Location: /v1/accounts/qa-5473c1c23523
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9029b87d-689d-44ef-a6c6-a25f45b372f2","handle":"qa-5473c1c23523","displayName":"QA 5473c1c23523","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.850773722Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-81751d2f-ebe6-48b6-ad3c-cfcaf8e427b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81751d2f-ebe6-48b6-ad3c-cfcaf8e427b8
Content-Type: application/json

--- request body ---
{"handle":"qa-bb7305af8ede","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-81751d2f-ebe6-48b6-ad3c-cfcaf8e427b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f57654fb-5fd1-40c5-9550-2e6f2a39b8c7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-20b5ad02-918e-43aa-820c-1c1d1410d009

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20b5ad02-918e-43aa-820c-1c1d1410d009
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5473c1c23523","subject":"Error contract","message":"Hi"}

--- response: 201 in 32 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-20b5ad02-918e-43aa-820c-1c1d1410d009
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
Location: /v1/conversations/cnv_5d9dae31-57d9-44f6-8c7c-6a046649b64f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5d9dae31-57d9-44f6-8c7c-6a046649b64f","subject":"Error contract","status":"open","region":"eu","participants":["qa-bb7305af8ede","qa-5473c1c23523"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.921019670Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5d9dae31-57d9-44f6-8c7c-6a046649b64f/messages
correlation: qa-1508ccb6-cd87-4eb1-abe5-74f6038556da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1508ccb6-cd87-4eb1-abe5-74f6038556da
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1508ccb6-cd87-4eb1-abe5-74f6038556da
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_5d9dae31-57d9-44f6-8c7c-6a046649b64f/messages","correlationId":"qa-1508ccb6-cd87-4eb1-abe5-74f6038556da"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-44c91ea3-5c8a-4c83-989b-3ad60a9f33c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44c91ea3-5c8a-4c83-989b-3ad60a9f33c3
Content-Type: application/json

--- request body ---
{"handle":"qa-5473c1c23523","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-44c91ea3-5c8a-4c83-989b-3ad60a9f33c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9029b87d-689d-44ef-a6c6-a25f45b372f2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-86fb97c1-d7e6-4d1f-a075-39999d5887a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86fb97c1-d7e6-4d1f-a075-39999d5887a9
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-86fb97c1-d7e6-4d1f-a075-39999d5887a9
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
correlation: qa-8841fc71-cd79-4f78-86cb-1ed85f658aaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8841fc71-cd79-4f78-86cb-1ed85f658aaf
Content-Type: application/json

--- request body ---
{"handle":"qa-5473c1c23523","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8841fc71-cd79-4f78-86cb-1ed85f658aaf
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8841fc71-cd79-4f78-86cb-1ed85f658aaf"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dac1f7b6-e850-4dce-bb11-8b4493873b15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dac1f7b6-e850-4dce-bb11-8b4493873b15
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dac1f7b6-e850-4dce-bb11-8b4493873b15
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
correlation: qa-08f037a1-bc75-402d-a740-e61ac12c38e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08f037a1-bc75-402d-a740-e61ac12c38e0
Content-Type: application/json

--- request body ---
{"handle":"qa-bb7305af8ede","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08f037a1-bc75-402d-a740-e61ac12c38e0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-08f037a1-bc75-402d-a740-e61ac12c38e0"}
```
