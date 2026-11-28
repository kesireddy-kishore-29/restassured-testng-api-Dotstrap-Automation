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
| 1 | `POST /v1/accounts` | 201 | 330 | `qa-be0cc350-57f0-4a0a-9f50-68991732f4f7` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-040164fe-14e2-45a1-b517-d541320c132c` |
| 3 | `GET /health` | 200 | 20 | `qa-103d6b82-98ae-464b-815b-b5712286e16f` |
| 4 | `POST /v1/auth/token` | 200 | 9 | `qa-a0b18f01-9e37-405b-8c3d-60e05957d160` |
| 5 | `GET /v1/accounts/me` | 200 | 38 | `qa-f56c4b97-136f-4f8b-947a-0d53fffcf45b` |
| 6 | `PATCH /v1/accounts/me` | 200 | 23 | `qa-32990678-d93c-4f5e-ba00-13a4907e7e85` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 10 | `qa-2f169337-439f-45eb-b58e-6afa9ea62c44` |
| 8 | `POST /v1/conversations` | 201 | 23 | `qa-08fad79c-fcd6-415a-b7ac-c5dc04a450d4` |
| 9 | `GET /v1/conversations` | 200 | 8 | `qa-9a5e3fdb-2aff-448a-8a4b-4cce484d5ee5` |
| 10 | `POST /v1/auth/token` | 200 | 17 | `qa-ca2a77d4-541d-40af-bce3-98bd80d97ed4` |
| 11 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-12c43458-9561-4a34-94e6-43fc9e824b04` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 14 | `qa-28c0a88b-1a35-4207-879d-e74745fd7b30` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-aa6b4685-bb3f-4d71-8437-336a4472d2d4` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 12 | `qa-8e2b0c84-213c-47b0-82de-ec6ebc1580ac` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-000e3e54-96a3-40a5-9ba9-14fb6f56125e` |
| 16 | `GET /v1/credits/balance` | 200 | 9 | `qa-3373a493-14af-4e46-938e-bbb66b35f033` |
| 17 | `GET /v1/credits/ledger` | 200 | 6 | `qa-75fc26ed-d6b5-4204-9ca8-28b68d1c63f1` |
| 18 | `POST /v1/credits/purchases` | 201 | 8 | `qa-5097db5b-8a17-44f5-80d9-bc26b5cfa156` |
| 19 | `GET /v1/admin/stats` | 403 | 11 | `qa-d5fb2fea-0c19-4afc-a7bb-2509bc4e3b05` |
| 20 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-e8dca2b9-6deb-4cbb-9d2a-b2dc1781931d` |
| 21 | `POST /v1/auth/token` | 401 | 13 | `qa-5ce2d43d-922f-4935-a953-1b05f3a2edb2` |
| 22 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-49398c54-0dc2-468a-a459-4036e2441d62` |
| 23 | `POST /v1/auth/token` | 401 | 7 | `qa-d8bf2d13-14db-4c92-ace4-b181bdfdfc97` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-be0cc350-57f0-4a0a-9f50-68991732f4f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be0cc350-57f0-4a0a-9f50-68991732f4f7
Content-Type: application/json

--- request body ---
{"handle":"qa-d853c168b7e8","displayName":"QA d853c168b7e8","password":"****","region":"eu"}

--- response: 201 in 330 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-be0cc350-57f0-4a0a-9f50-68991732f4f7
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
Location: /v1/accounts/qa-d853c168b7e8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c2a31aa8-51ad-4fbc-95db-76ae6af0a1e9","handle":"qa-d853c168b7e8","displayName":"QA d853c168b7e8","region":"eu","role":"user","createdAt":"2026-11-25T11:27:56.397205021Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-040164fe-14e2-45a1-b517-d541320c132c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-040164fe-14e2-45a1-b517-d541320c132c
Content-Type: application/json

--- request body ---
{"handle":"qa-390700214873","displayName":"QA 390700214873","password":"****","region":"us"}

--- response: 201 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-040164fe-14e2-45a1-b517-d541320c132c
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
Location: /v1/accounts/qa-390700214873
X-Served-Region: us
Content-Length: 181

{"id":"acc_94b3af70-22cc-4fbb-bf91-c701a5d521a1","handle":"qa-390700214873","displayName":"QA 390700214873","region":"us","role":"user","createdAt":"2026-11-25T11:27:56.703472343Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-103d6b82-98ae-464b-815b-b5712286e16f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-103d6b82-98ae-464b-815b-b5712286e16f
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-103d6b82-98ae-464b-815b-b5712286e16f
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
correlation: qa-a0b18f01-9e37-405b-8c3d-60e05957d160

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0b18f01-9e37-405b-8c3d-60e05957d160
Content-Type: application/json

--- request body ---
{"handle":"qa-d853c168b7e8","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0b18f01-9e37-405b-8c3d-60e05957d160
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c2a31aa8-51ad-4fbc-95db-76ae6af0a1e9"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-f56c4b97-136f-4f8b-947a-0d53fffcf45b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f56c4b97-136f-4f8b-947a-0d53fffcf45b
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f56c4b97-136f-4f8b-947a-0d53fffcf45b
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

{"id":"acc_c2a31aa8-51ad-4fbc-95db-76ae6af0a1e9","handle":"qa-d853c168b7e8","displayName":"QA d853c168b7e8","region":"eu","role":"user","createdAt":"2026-11-25T11:27:56.397205021Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-32990678-d93c-4f5e-ba00-13a4907e7e85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32990678-d93c-4f5e-ba00-13a4907e7e85
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-32990678-d93c-4f5e-ba00-13a4907e7e85
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

{"id":"acc_c2a31aa8-51ad-4fbc-95db-76ae6af0a1e9","handle":"qa-d853c168b7e8","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-25T11:27:56.397205021Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-390700214873
correlation: qa-2f169337-439f-45eb-b58e-6afa9ea62c44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f169337-439f-45eb-b58e-6afa9ea62c44
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f169337-439f-45eb-b58e-6afa9ea62c44
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

{"handle":"qa-390700214873","displayName":"QA 390700214873","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-08fad79c-fcd6-415a-b7ac-c5dc04a450d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08fad79c-fcd6-415a-b7ac-c5dc04a450d4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-390700214873","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-08fad79c-fcd6-415a-b7ac-c5dc04a450d4
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
Location: /v1/conversations/cnv_410033d9-c814-4f2d-85e0-c239232e0935
X-Data-Region: us
Content-Length: 238

{"id":"cnv_410033d9-c814-4f2d-85e0-c239232e0935","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-d853c168b7e8","qa-390700214873"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:56.929362903Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-9a5e3fdb-2aff-448a-8a4b-4cce484d5ee5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a5e3fdb-2aff-448a-8a4b-4cce484d5ee5
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a5e3fdb-2aff-448a-8a4b-4cce484d5ee5
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

{"items":[{"id":"cnv_410033d9-c814-4f2d-85e0-c239232e0935","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-d853c168b7e8","qa-390700214873"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:56.929362903Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ca2a77d4-541d-40af-bce3-98bd80d97ed4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca2a77d4-541d-40af-bce3-98bd80d97ed4
Content-Type: application/json

--- request body ---
{"handle":"qa-390700214873","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca2a77d4-541d-40af-bce3-98bd80d97ed4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_94b3af70-22cc-4fbb-bf91-c701a5d521a1"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_410033d9-c814-4f2d-85e0-c239232e0935
correlation: qa-12c43458-9561-4a34-94e6-43fc9e824b04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12c43458-9561-4a34-94e6-43fc9e824b04
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-12c43458-9561-4a34-94e6-43fc9e824b04
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

{"id":"cnv_410033d9-c814-4f2d-85e0-c239232e0935","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-d853c168b7e8","qa-390700214873"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-25T11:27:56.929362903Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_410033d9-c814-4f2d-85e0-c239232e0935/messages
correlation: qa-28c0a88b-1a35-4207-879d-e74745fd7b30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28c0a88b-1a35-4207-879d-e74745fd7b30
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-28c0a88b-1a35-4207-879d-e74745fd7b30
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

{"items":[{"id":"msg_090e67d0-d21e-4cd3-9e1b-f62321bee2d3","conversationId":"cnv_410033d9-c814-4f2d-85e0-c239232e0935","sender":"qa-d853c168b7e8","body":"Hi","createdAt":"2026-11-25T11:27:56.929378180Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_410033d9-c814-4f2d-85e0-c239232e0935/messages
correlation: qa-aa6b4685-bb3f-4d71-8437-336a4472d2d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa6b4685-bb3f-4d71-8437-336a4472d2d4
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa6b4685-bb3f-4d71-8437-336a4472d2d4
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

{"id":"msg_64553a20-d3b6-4c08-acd9-47342ebec163","conversationId":"cnv_410033d9-c814-4f2d-85e0-c239232e0935","sender":"qa-390700214873","body":"Reply","createdAt":"2026-11-25T11:27:57.043500547Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_410033d9-c814-4f2d-85e0-c239232e0935/read
correlation: qa-8e2b0c84-213c-47b0-82de-ec6ebc1580ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e2b0c84-213c-47b0-82de-ec6ebc1580ac
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e2b0c84-213c-47b0-82de-ec6ebc1580ac
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

{"conversationId":"cnv_410033d9-c814-4f2d-85e0-c239232e0935","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_410033d9-c814-4f2d-85e0-c239232e0935/close
correlation: qa-000e3e54-96a3-40a5-9ba9-14fb6f56125e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-000e3e54-96a3-40a5-9ba9-14fb6f56125e
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-000e3e54-96a3-40a5-9ba9-14fb6f56125e
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

{"id":"cnv_410033d9-c814-4f2d-85e0-c239232e0935","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-d853c168b7e8","qa-390700214873"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-25T11:27:56.929362903Z","closedAt":"2026-11-25T11:27:57.079649820Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-3373a493-14af-4e46-938e-bbb66b35f033

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3373a493-14af-4e46-938e-bbb66b35f033
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3373a493-14af-4e46-938e-bbb66b35f033
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

{"balance":4,"currency":"credits","accountId":"acc_c2a31aa8-51ad-4fbc-95db-76ae6af0a1e9"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-75fc26ed-d6b5-4204-9ca8-28b68d1c63f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75fc26ed-d6b5-4204-9ca8-28b68d1c63f1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-75fc26ed-d6b5-4204-9ca8-28b68d1c63f1
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

{"items":[{"id":"led_fecaf424-a31b-4005-a95b-0b27f0946cdd","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-25T11:27:56.397402069Z"},{"id":"led_b5e33637-1f17-4637-9dd7-73709b4b91da","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_410033d9-c814-4f2d-85e0-c239232e0935","createdAt":"2026-11-25T11:27:56.929341083Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5097db5b-8a17-44f5-80d9-bc26b5cfa156

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cccb1684a3da44c6987b8d34315fbcb6
X-Correlation-Id: qa-5097db5b-8a17-44f5-80d9-bc26b5cfa156
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5097db5b-8a17-44f5-80d9-bc26b5cfa156
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
Location: /v1/credits/purchases/pur_6858162b-acd3-473c-b76b-4d607bf8fa30
Content-Length: 144

{"id":"pur_6858162b-acd3-473c-b76b-4d607bf8fa30","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-25T11:27:57.124281500Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-d5fb2fea-0c19-4afc-a7bb-2509bc4e3b05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5fb2fea-0c19-4afc-a7bb-2509bc4e3b05
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5fb2fea-0c19-4afc-a7bb-2509bc4e3b05
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-d5fb2fea-0c19-4afc-a7bb-2509bc4e3b05"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e8dca2b9-6deb-4cbb-9d2a-b2dc1781931d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8dca2b9-6deb-4cbb-9d2a-b2dc1781931d
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e8dca2b9-6deb-4cbb-9d2a-b2dc1781931d
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
correlation: qa-5ce2d43d-922f-4935-a953-1b05f3a2edb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ce2d43d-922f-4935-a953-1b05f3a2edb2
Content-Type: application/json

--- request body ---
{"handle":"qa-390700214873","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ce2d43d-922f-4935-a953-1b05f3a2edb2
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5ce2d43d-922f-4935-a953-1b05f3a2edb2"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-49398c54-0dc2-468a-a459-4036e2441d62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49398c54-0dc2-468a-a459-4036e2441d62
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-49398c54-0dc2-468a-a459-4036e2441d62
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
correlation: qa-d8bf2d13-14db-4c92-ace4-b181bdfdfc97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8bf2d13-14db-4c92-ace4-b181bdfdfc97
Content-Type: application/json

--- request body ---
{"handle":"qa-d853c168b7e8","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d8bf2d13-14db-4c92-ace4-b181bdfdfc97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d8bf2d13-14db-4c92-ace4-b181bdfdfc97"}
```
