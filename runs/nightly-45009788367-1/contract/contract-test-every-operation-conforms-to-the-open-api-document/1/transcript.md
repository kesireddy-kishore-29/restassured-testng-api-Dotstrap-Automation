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
| 1 | `POST /v1/accounts` | 201 | 272 | `qa-6ce9226c-a9de-49ce-ae30-454736dd500a` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-8e5190c7-bb4c-4519-8920-fb6a0b12305f` |
| 3 | `GET /health` | 200 | 38 | `qa-d0709421-5ed7-49b6-8c29-17e71537d994` |
| 4 | `POST /v1/auth/token` | 200 | 24 | `qa-94572dcb-ffa3-4fea-a7ee-a5d1ee68ff48` |
| 5 | `GET /v1/accounts/me` | 200 | 17 | `qa-de63d1b1-85a2-400b-9e59-4a05a30965bf` |
| 6 | `PATCH /v1/accounts/me` | 200 | 29 | `qa-50fd2a79-7184-48ee-8443-d462a1e1d388` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 15 | `qa-dd0f2664-7d55-4fb4-95e4-db43c984bd8f` |
| 8 | `POST /v1/conversations` | 201 | 12 | `qa-3013a35c-9449-4198-a24d-380a91466238` |
| 9 | `GET /v1/conversations` | 200 | 11 | `qa-413e3826-c061-4e34-9b5d-e47361bd6b3d` |
| 10 | `POST /v1/auth/token` | 200 | 19 | `qa-1f0a20b8-0e85-4ed0-9eb0-5bb577f4beba` |
| 11 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-4564c635-6205-4ccd-a086-e566df034dab` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 10 | `qa-7ba2aa1c-a49d-4f56-9451-bc88e563a7f1` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-fb19daf2-a1db-4e7d-a2a9-d25f7020c044` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 10 | `qa-049851f3-ed9c-4b66-a5d6-a0d96f4350cb` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 13 | `qa-b1891a81-7adf-425f-b9f8-d029b5ef7c86` |
| 16 | `GET /v1/credits/balance` | 200 | 13 | `qa-5433dff6-d5c8-499e-98d3-abd6437cb0c8` |
| 17 | `GET /v1/credits/ledger` | 200 | 9 | `qa-a951fb1c-54d7-4bf5-b294-67c09fcb8d0f` |
| 18 | `POST /v1/credits/purchases` | 201 | 8 | `qa-637c8d98-42b4-4e29-a23a-d37c7e4feb71` |
| 19 | `GET /v1/admin/stats` | 403 | 7 | `qa-89461601-f5b6-46d2-a735-271eedacbb74` |
| 20 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-2c01ed73-dc85-42df-9a87-a58351775e7c` |
| 21 | `POST /v1/auth/token` | 401 | 14 | `qa-771ba3f4-a92c-4cc7-88ed-87c190127d06` |
| 22 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-0ff6879f-567f-4793-9b9c-615ee6ed3170` |
| 23 | `POST /v1/auth/token` | 401 | 19 | `qa-1c81d768-50da-4a71-9f02-c4066bb1f0bf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6ce9226c-a9de-49ce-ae30-454736dd500a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ce9226c-a9de-49ce-ae30-454736dd500a
Content-Type: application/json

--- request body ---
{"handle":"qa-62108344eda0","displayName":"QA 62108344eda0","password":"****","region":"eu"}

--- response: 201 in 272 ms ---
Date: Sun, 22 Nov 2026 09:54:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ce9226c-a9de-49ce-ae30-454736dd500a
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
Location: /v1/accounts/qa-62108344eda0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1ecb61c5-cf2a-44f1-8ed2-3237af9c22a2","handle":"qa-62108344eda0","displayName":"QA 62108344eda0","region":"eu","role":"user","createdAt":"2026-11-22T09:54:39.585196345Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8e5190c7-bb4c-4519-8920-fb6a0b12305f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e5190c7-bb4c-4519-8920-fb6a0b12305f
Content-Type: application/json

--- request body ---
{"handle":"qa-73bab7b0a1ff","displayName":"QA 73bab7b0a1ff","password":"****","region":"us"}

--- response: 201 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e5190c7-bb4c-4519-8920-fb6a0b12305f
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
Location: /v1/accounts/qa-73bab7b0a1ff
X-Served-Region: us
Content-Length: 181

{"id":"acc_9c0aa3f3-fa82-47a3-a3b6-d0e91c96baca","handle":"qa-73bab7b0a1ff","displayName":"QA 73bab7b0a1ff","region":"us","role":"user","createdAt":"2026-11-22T09:54:39.879292197Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-d0709421-5ed7-49b6-8c29-17e71537d994

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0709421-5ed7-49b6-8c29-17e71537d994
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Sun, 22 Nov 2026 09:54:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0709421-5ed7-49b6-8c29-17e71537d994
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
correlation: qa-94572dcb-ffa3-4fea-a7ee-a5d1ee68ff48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94572dcb-ffa3-4fea-a7ee-a5d1ee68ff48
Content-Type: application/json

--- request body ---
{"handle":"qa-62108344eda0","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-94572dcb-ffa3-4fea-a7ee-a5d1ee68ff48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1ecb61c5-cf2a-44f1-8ed2-3237af9c22a2"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-de63d1b1-85a2-400b-9e59-4a05a30965bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de63d1b1-85a2-400b-9e59-4a05a30965bf
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-de63d1b1-85a2-400b-9e59-4a05a30965bf
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

{"id":"acc_1ecb61c5-cf2a-44f1-8ed2-3237af9c22a2","handle":"qa-62108344eda0","displayName":"QA 62108344eda0","region":"eu","role":"user","createdAt":"2026-11-22T09:54:39.585196345Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-50fd2a79-7184-48ee-8443-d462a1e1d388

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50fd2a79-7184-48ee-8443-d462a1e1d388
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 29 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-50fd2a79-7184-48ee-8443-d462a1e1d388
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

{"id":"acc_1ecb61c5-cf2a-44f1-8ed2-3237af9c22a2","handle":"qa-62108344eda0","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-22T09:54:39.585196345Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-73bab7b0a1ff
correlation: qa-dd0f2664-7d55-4fb4-95e4-db43c984bd8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd0f2664-7d55-4fb4-95e4-db43c984bd8f
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd0f2664-7d55-4fb4-95e4-db43c984bd8f
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

{"handle":"qa-73bab7b0a1ff","displayName":"QA 73bab7b0a1ff","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-3013a35c-9449-4198-a24d-380a91466238

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3013a35c-9449-4198-a24d-380a91466238
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-73bab7b0a1ff","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-3013a35c-9449-4198-a24d-380a91466238
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
Location: /v1/conversations/cnv_9b399d5d-9983-46d0-9a02-2de72b0d29c9
X-Data-Region: us
Content-Length: 238

{"id":"cnv_9b399d5d-9983-46d0-9a02-2de72b0d29c9","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-62108344eda0","qa-73bab7b0a1ff"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.108991750Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-413e3826-c061-4e34-9b5d-e47361bd6b3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-413e3826-c061-4e34-9b5d-e47361bd6b3d
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-413e3826-c061-4e34-9b5d-e47361bd6b3d
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

{"items":[{"id":"cnv_9b399d5d-9983-46d0-9a02-2de72b0d29c9","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-62108344eda0","qa-73bab7b0a1ff"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.108991750Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-1f0a20b8-0e85-4ed0-9eb0-5bb577f4beba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f0a20b8-0e85-4ed0-9eb0-5bb577f4beba
Content-Type: application/json

--- request body ---
{"handle":"qa-73bab7b0a1ff","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f0a20b8-0e85-4ed0-9eb0-5bb577f4beba
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9c0aa3f3-fa82-47a3-a3b6-d0e91c96baca"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_9b399d5d-9983-46d0-9a02-2de72b0d29c9
correlation: qa-4564c635-6205-4ccd-a086-e566df034dab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4564c635-6205-4ccd-a086-e566df034dab
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-4564c635-6205-4ccd-a086-e566df034dab
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

{"id":"cnv_9b399d5d-9983-46d0-9a02-2de72b0d29c9","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-62108344eda0","qa-73bab7b0a1ff"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-22T09:54:40.108991750Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_9b399d5d-9983-46d0-9a02-2de72b0d29c9/messages
correlation: qa-7ba2aa1c-a49d-4f56-9451-bc88e563a7f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ba2aa1c-a49d-4f56-9451-bc88e563a7f1
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ba2aa1c-a49d-4f56-9451-bc88e563a7f1
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

{"items":[{"id":"msg_cf4f585d-be24-4311-ba10-8eba841808d9","conversationId":"cnv_9b399d5d-9983-46d0-9a02-2de72b0d29c9","sender":"qa-62108344eda0","body":"Hi","createdAt":"2026-11-22T09:54:40.109010829Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_9b399d5d-9983-46d0-9a02-2de72b0d29c9/messages
correlation: qa-fb19daf2-a1db-4e7d-a2a9-d25f7020c044

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb19daf2-a1db-4e7d-a2a9-d25f7020c044
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb19daf2-a1db-4e7d-a2a9-d25f7020c044
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

{"id":"msg_8c6f6e2e-394b-47f3-bf12-032ca8ac789a","conversationId":"cnv_9b399d5d-9983-46d0-9a02-2de72b0d29c9","sender":"qa-73bab7b0a1ff","body":"Reply","createdAt":"2026-11-22T09:54:40.216576945Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_9b399d5d-9983-46d0-9a02-2de72b0d29c9/read
correlation: qa-049851f3-ed9c-4b66-a5d6-a0d96f4350cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-049851f3-ed9c-4b66-a5d6-a0d96f4350cb
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-049851f3-ed9c-4b66-a5d6-a0d96f4350cb
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

{"conversationId":"cnv_9b399d5d-9983-46d0-9a02-2de72b0d29c9","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_9b399d5d-9983-46d0-9a02-2de72b0d29c9/close
correlation: qa-b1891a81-7adf-425f-b9f8-d029b5ef7c86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1891a81-7adf-425f-b9f8-d029b5ef7c86
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1891a81-7adf-425f-b9f8-d029b5ef7c86
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

{"id":"cnv_9b399d5d-9983-46d0-9a02-2de72b0d29c9","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-62108344eda0","qa-73bab7b0a1ff"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.108991750Z","closedAt":"2026-11-22T09:54:40.248040753Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-5433dff6-d5c8-499e-98d3-abd6437cb0c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5433dff6-d5c8-499e-98d3-abd6437cb0c8
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-5433dff6-d5c8-499e-98d3-abd6437cb0c8
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

{"balance":4,"currency":"credits","accountId":"acc_1ecb61c5-cf2a-44f1-8ed2-3237af9c22a2"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-a951fb1c-54d7-4bf5-b294-67c09fcb8d0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a951fb1c-54d7-4bf5-b294-67c09fcb8d0f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-a951fb1c-54d7-4bf5-b294-67c09fcb8d0f
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

{"items":[{"id":"led_eb0da43f-4932-4442-8b4c-7dddd8dc1694","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-22T09:54:39.593344443Z"},{"id":"led_5f15c52e-c0fe-41db-b449-1351d338cfdc","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_9b399d5d-9983-46d0-9a02-2de72b0d29c9","createdAt":"2026-11-22T09:54:40.108966903Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-637c8d98-42b4-4e29-a23a-d37c7e4feb71

--- request headers ---
Accept: application/json
Idempotency-Key: qa-88fa9f0d47034a24bebd306db1e4c181
X-Correlation-Id: qa-637c8d98-42b4-4e29-a23a-d37c7e4feb71
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-637c8d98-42b4-4e29-a23a-d37c7e4feb71
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
Location: /v1/credits/purchases/pur_75ec32e7-0c48-44d0-ab7f-a6f0dbfdc19f
Content-Length: 144

{"id":"pur_75ec32e7-0c48-44d0-ab7f-a6f0dbfdc19f","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-22T09:54:40.312682549Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-89461601-f5b6-46d2-a735-271eedacbb74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89461601-f5b6-46d2-a735-271eedacbb74
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89461601-f5b6-46d2-a735-271eedacbb74
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-89461601-f5b6-46d2-a735-271eedacbb74"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2c01ed73-dc85-42df-9a87-a58351775e7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c01ed73-dc85-42df-9a87-a58351775e7c
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2c01ed73-dc85-42df-9a87-a58351775e7c
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
correlation: qa-771ba3f4-a92c-4cc7-88ed-87c190127d06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-771ba3f4-a92c-4cc7-88ed-87c190127d06
Content-Type: application/json

--- request body ---
{"handle":"qa-73bab7b0a1ff","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-771ba3f4-a92c-4cc7-88ed-87c190127d06
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-771ba3f4-a92c-4cc7-88ed-87c190127d06"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0ff6879f-567f-4793-9b9c-615ee6ed3170

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ff6879f-567f-4793-9b9c-615ee6ed3170
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0ff6879f-567f-4793-9b9c-615ee6ed3170
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
correlation: qa-1c81d768-50da-4a71-9f02-c4066bb1f0bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c81d768-50da-4a71-9f02-c4066bb1f0bf
Content-Type: application/json

--- request body ---
{"handle":"qa-62108344eda0","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c81d768-50da-4a71-9f02-c4066bb1f0bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1c81d768-50da-4a71-9f02-c4066bb1f0bf"}
```
