# Transcript: Every operation in the OpenAPI document answers as documented (checked per response)

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#everyOperationConformsToTheOpenApiDocument` |
| Features | FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 23 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 454 | `qa-ecae7c87-db79-461f-811f-74f7e3ac8de1` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-988a9875-e066-4968-9bf6-827190274b7d` |
| 3 | `GET /health` | 200 | 51 | `qa-dbe0ea0a-5fc6-4bd6-b62e-052ace096323` |
| 4 | `POST /v1/auth/token` | 200 | 47 | `qa-befe464a-4fa5-4007-adac-6c86fac28532` |
| 5 | `GET /v1/accounts/me` | 200 | 34 | `qa-ded7eb4a-f02e-4de7-9b0d-ead89c72e83c` |
| 6 | `PATCH /v1/accounts/me` | 200 | 35 | `qa-74b23a02-f6cc-4948-bbf1-0421b9467857` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 14 | `qa-eaacccbe-c0ba-4717-bf99-791fae2275e4` |
| 8 | `POST /v1/conversations` | 201 | 12 | `qa-8191006a-fb87-489b-a045-36d7ca0094b4` |
| 9 | `GET /v1/conversations` | 200 | 16 | `qa-b27b110a-aa3a-4a65-a553-cbce185a5302` |
| 10 | `POST /v1/auth/token` | 200 | 32 | `qa-7abfafe7-ad71-4027-bfdb-f97cffd8ea13` |
| 11 | `GET /v1/conversations/{id}` | 200 | 18 | `qa-0f753131-b621-4f85-9e11-2730c98a50c4` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 16 | `qa-0f18eebb-9abd-4489-b0fd-f469b01fabc0` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-25852a89-4f1b-49d8-bf75-b66165cb7861` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 17 | `qa-6c5ab498-aa68-4eff-a3d9-d5f99cdf4227` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 24 | `qa-bde47130-d964-4dc5-8540-adec8845bfb4` |
| 16 | `GET /v1/credits/balance` | 200 | 11 | `qa-ea6927a3-08c8-4988-b491-15d0891a5a23` |
| 17 | `GET /v1/credits/ledger` | 200 | 27 | `qa-ebf20d59-70d7-47fe-bad5-34f564d6183e` |
| 18 | `POST /v1/credits/purchases` | 201 | 34 | `qa-510dbcbc-24c8-441c-a34d-c738a437c0ca` |
| 19 | `GET /v1/admin/stats` | 403 | 20 | `qa-afcc37f2-ffc9-4733-a2ab-1352cfbf3d5a` |
| 20 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-40e077db-1dc3-43f2-a46a-c63540471839` |
| 21 | `POST /v1/auth/token` | 401 | 25 | `qa-ba17ef28-937b-4c44-8404-3df89eadd274` |
| 22 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-23f7f642-0841-466b-a035-ae90ef63ec5b` |
| 23 | `POST /v1/auth/token` | 401 | 20 | `qa-156d34ae-7448-4c4f-a4fe-bc5ce72c23ff` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ecae7c87-db79-461f-811f-74f7e3ac8de1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecae7c87-db79-461f-811f-74f7e3ac8de1
Content-Type: application/json

--- request body ---
{"handle":"qa-5e82f577430e","displayName":"QA 5e82f577430e","password":"****","region":"eu"}

--- response: 201 in 454 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecae7c87-db79-461f-811f-74f7e3ac8de1
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
Location: /v1/accounts/qa-5e82f577430e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_899bb05f-be6c-4ede-b166-3b3537cff90e","handle":"qa-5e82f577430e","displayName":"QA 5e82f577430e","region":"eu","role":"user","createdAt":"2026-11-21T09:57:07.941369497Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-988a9875-e066-4968-9bf6-827190274b7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-988a9875-e066-4968-9bf6-827190274b7d
Content-Type: application/json

--- request body ---
{"handle":"qa-49ddbd95bbfb","displayName":"QA 49ddbd95bbfb","password":"****","region":"us"}

--- response: 201 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-988a9875-e066-4968-9bf6-827190274b7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-49ddbd95bbfb
X-Served-Region: us
Content-Length: 181

{"id":"acc_19307002-d6bb-46be-98cc-1658619c0531","handle":"qa-49ddbd95bbfb","displayName":"QA 49ddbd95bbfb","region":"us","role":"user","createdAt":"2026-11-21T09:57:08.379675944Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-dbe0ea0a-5fc6-4bd6-b62e-052ace096323

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbe0ea0a-5fc6-4bd6-b62e-052ace096323
Content-Type: application/json

--- response: 200 in 51 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbe0ea0a-5fc6-4bd6-b62e-052ace096323
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-befe464a-4fa5-4007-adac-6c86fac28532

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-befe464a-4fa5-4007-adac-6c86fac28532
Content-Type: application/json

--- request body ---
{"handle":"qa-5e82f577430e","password":"****"}

--- response: 200 in 47 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-befe464a-4fa5-4007-adac-6c86fac28532
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_899bb05f-be6c-4ede-b166-3b3537cff90e"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-ded7eb4a-f02e-4de7-9b0d-ead89c72e83c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ded7eb4a-f02e-4de7-9b0d-ead89c72e83c
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-ded7eb4a-f02e-4de7-9b0d-ead89c72e83c
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
Content-Length: 181

{"id":"acc_899bb05f-be6c-4ede-b166-3b3537cff90e","handle":"qa-5e82f577430e","displayName":"QA 5e82f577430e","region":"eu","role":"user","createdAt":"2026-11-21T09:57:07.941369497Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-74b23a02-f6cc-4948-bbf1-0421b9467857

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74b23a02-f6cc-4948-bbf1-0421b9467857
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 35 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-74b23a02-f6cc-4948-bbf1-0421b9467857
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
Content-Length: 178

{"id":"acc_899bb05f-be6c-4ede-b166-3b3537cff90e","handle":"qa-5e82f577430e","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-21T09:57:07.941369497Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-49ddbd95bbfb
correlation: qa-eaacccbe-c0ba-4717-bf99-791fae2275e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaacccbe-c0ba-4717-bf99-791fae2275e4
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaacccbe-c0ba-4717-bf99-791fae2275e4
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
Content-Length: 74

{"handle":"qa-49ddbd95bbfb","displayName":"QA 49ddbd95bbfb","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-8191006a-fb87-489b-a045-36d7ca0094b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8191006a-fb87-489b-a045-36d7ca0094b4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-49ddbd95bbfb","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-8191006a-fb87-489b-a045-36d7ca0094b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_1337d809-797c-4091-94f5-fe104119fa73
X-Data-Region: us
Content-Length: 238

{"id":"cnv_1337d809-797c-4091-94f5-fe104119fa73","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-5e82f577430e","qa-49ddbd95bbfb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:08.702997619Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-b27b110a-aa3a-4a65-a553-cbce185a5302

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b27b110a-aa3a-4a65-a553-cbce185a5302
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-b27b110a-aa3a-4a65-a553-cbce185a5302
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 260

{"items":[{"id":"cnv_1337d809-797c-4091-94f5-fe104119fa73","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-5e82f577430e","qa-49ddbd95bbfb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:08.702997619Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7abfafe7-ad71-4027-bfdb-f97cffd8ea13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7abfafe7-ad71-4027-bfdb-f97cffd8ea13
Content-Type: application/json

--- request body ---
{"handle":"qa-49ddbd95bbfb","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-7abfafe7-ad71-4027-bfdb-f97cffd8ea13
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19307002-d6bb-46be-98cc-1658619c0531"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_1337d809-797c-4091-94f5-fe104119fa73
correlation: qa-0f753131-b621-4f85-9e11-2730c98a50c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f753131-b621-4f85-9e11-2730c98a50c4
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f753131-b621-4f85-9e11-2730c98a50c4
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
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_1337d809-797c-4091-94f5-fe104119fa73","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-5e82f577430e","qa-49ddbd95bbfb"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-21T09:57:08.702997619Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_1337d809-797c-4091-94f5-fe104119fa73/messages
correlation: qa-0f18eebb-9abd-4489-b0fd-f469b01fabc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f18eebb-9abd-4489-b0fd-f469b01fabc0
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f18eebb-9abd-4489-b0fd-f469b01fabc0
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
X-Served-Region: us
Content-Length: 215

{"items":[{"id":"msg_8f7895f3-5692-4dc2-95f9-e18cf091b3a4","conversationId":"cnv_1337d809-797c-4091-94f5-fe104119fa73","sender":"qa-5e82f577430e","body":"Hi","createdAt":"2026-11-21T09:57:08.703034158Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_1337d809-797c-4091-94f5-fe104119fa73/messages
correlation: qa-25852a89-4f1b-49d8-bf75-b66165cb7861

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25852a89-4f1b-49d8-bf75-b66165cb7861
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-25852a89-4f1b-49d8-bf75-b66165cb7861
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
X-Served-Region: us
Content-Length: 196

{"id":"msg_5649b380-52bf-4211-baf6-3478dfc3dad8","conversationId":"cnv_1337d809-797c-4091-94f5-fe104119fa73","sender":"qa-49ddbd95bbfb","body":"Reply","createdAt":"2026-11-21T09:57:08.872199491Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_1337d809-797c-4091-94f5-fe104119fa73/read
correlation: qa-6c5ab498-aa68-4eff-a3d9-d5f99cdf4227

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c5ab498-aa68-4eff-a3d9-d5f99cdf4227
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c5ab498-aa68-4eff-a3d9-d5f99cdf4227
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 77

{"conversationId":"cnv_1337d809-797c-4091-94f5-fe104119fa73","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_1337d809-797c-4091-94f5-fe104119fa73/close
correlation: qa-bde47130-d964-4dc5-8540-adec8845bfb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bde47130-d964-4dc5-8540-adec8845bfb4
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-bde47130-d964-4dc5-8540-adec8845bfb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_1337d809-797c-4091-94f5-fe104119fa73","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-5e82f577430e","qa-49ddbd95bbfb"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-21T09:57:08.702997619Z","closedAt":"2026-11-21T09:57:08.938413743Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-ea6927a3-08c8-4988-b491-15d0891a5a23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea6927a3-08c8-4988-b491-15d0891a5a23
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea6927a3-08c8-4988-b491-15d0891a5a23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_899bb05f-be6c-4ede-b166-3b3537cff90e"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-ebf20d59-70d7-47fe-bad5-34f564d6183e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebf20d59-70d7-47fe-bad5-34f564d6183e
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebf20d59-70d7-47fe-bad5-34f564d6183e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 393

{"items":[{"id":"led_138b7254-0864-4315-b2cf-177a20475b31","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-21T09:57:07.941380307Z"},{"id":"led_bbeb8636-465c-4fb8-bbe3-3094783bba70","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_1337d809-797c-4091-94f5-fe104119fa73","createdAt":"2026-11-21T09:57:08.702949349Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-510dbcbc-24c8-441c-a34d-c738a437c0ca

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ae25e423f7dd4c149efff2aa4fb911fc
X-Correlation-Id: qa-510dbcbc-24c8-441c-a34d-c738a437c0ca
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 34 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-510dbcbc-24c8-441c-a34d-c738a437c0ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_cb782de6-7da6-4cff-a2e4-42c0b6f2ce84
Content-Length: 144

{"id":"pur_cb782de6-7da6-4cff-a2e4-42c0b6f2ce84","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-21T09:57:09.059142070Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-afcc37f2-ffc9-4733-a2ab-1352cfbf3d5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afcc37f2-ffc9-4733-a2ab-1352cfbf3d5a
Content-Type: application/json

--- response: 403 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-afcc37f2-ffc9-4733-a2ab-1352cfbf3d5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-afcc37f2-ffc9-4733-a2ab-1352cfbf3d5a"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-40e077db-1dc3-43f2-a46a-c63540471839

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40e077db-1dc3-43f2-a46a-c63540471839
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-40e077db-1dc3-43f2-a46a-c63540471839
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: us
```

## 21. POST /v1/auth/token

```text
#21 POST http://localhost:7070/v1/auth/token
correlation: qa-ba17ef28-937b-4c44-8404-3df89eadd274

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba17ef28-937b-4c44-8404-3df89eadd274
Content-Type: application/json

--- request body ---
{"handle":"qa-49ddbd95bbfb","password":"****"}

--- response: 401 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba17ef28-937b-4c44-8404-3df89eadd274
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ba17ef28-937b-4c44-8404-3df89eadd274"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-23f7f642-0841-466b-a035-ae90ef63ec5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23f7f642-0841-466b-a035-ae90ef63ec5b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-23f7f642-0841-466b-a035-ae90ef63ec5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
```

## 23. POST /v1/auth/token

```text
#23 POST http://localhost:7070/v1/auth/token
correlation: qa-156d34ae-7448-4c4f-a4fe-bc5ce72c23ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-156d34ae-7448-4c4f-a4fe-bc5ce72c23ff
Content-Type: application/json

--- request body ---
{"handle":"qa-5e82f577430e","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-156d34ae-7448-4c4f-a4fe-bc5ce72c23ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-156d34ae-7448-4c4f-a4fe-bc5ce72c23ff"}
```
