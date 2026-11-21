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
| 1 | `POST /v1/accounts` | 201 | 398 | `qa-1616e781-fca1-40ea-adca-914ef7dc38a3` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-eb5d8fde-67dc-4f8b-8b94-c6fe735ed429` |
| 3 | `GET /health` | 200 | 31 | `qa-940e849d-1448-4841-9cbc-2eebcf6ddc08` |
| 4 | `POST /v1/auth/token` | 200 | 14 | `qa-e0a31c8d-ad82-49c9-a3d2-73ae37f0b3e5` |
| 5 | `GET /v1/accounts/me` | 200 | 28 | `qa-73192ba7-fede-4812-98fc-2cf325d98378` |
| 6 | `PATCH /v1/accounts/me` | 200 | 25 | `qa-7844c419-7eee-4af2-a7b9-50c02d832814` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 13 | `qa-5a118b47-6d04-4209-ae7e-51f9c1ca9579` |
| 8 | `POST /v1/conversations` | 201 | 17 | `qa-17ef9241-44ec-451f-9d88-b3083cde94f0` |
| 9 | `GET /v1/conversations` | 200 | 16 | `qa-4ee5753d-8156-4e31-8b14-c314be9ac28e` |
| 10 | `POST /v1/auth/token` | 200 | 20 | `qa-dc511a85-e00c-4b84-956f-39242c8e234d` |
| 11 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-374d2621-c40f-4603-8cd7-ca4c761cc7e6` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 21 | `qa-66177610-7317-4741-8a7d-3494a4f875de` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-90a7975e-f017-42ef-89a9-c056972a2b5f` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 14 | `qa-c076a214-0a81-430c-9d6f-77abe32b154d` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 10 | `qa-e07cf0a6-24d7-4612-aaa1-ba8249c9c083` |
| 16 | `GET /v1/credits/balance` | 200 | 8 | `qa-3b65206d-1ac1-4c3a-b907-d15d2dc8ebd9` |
| 17 | `GET /v1/credits/ledger` | 200 | 10 | `qa-508bd0a5-bed4-470e-921b-5073c8486baa` |
| 18 | `POST /v1/credits/purchases` | 201 | 16 | `qa-e5989180-290b-4736-bff5-9bdc123b0b23` |
| 19 | `GET /v1/admin/stats` | 403 | 19 | `qa-649e96b1-dd07-40f7-9c85-a3d6686d03c0` |
| 20 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-c0a4839c-1143-4cc1-a914-f50d6f196986` |
| 21 | `POST /v1/auth/token` | 401 | 10 | `qa-8d068cb3-aa90-44fd-9d1e-7b8ac17c8530` |
| 22 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-f665b5f9-0229-4e8a-8b22-08cf10efbb04` |
| 23 | `POST /v1/auth/token` | 401 | 25 | `qa-a7df2fe1-09e1-4ef9-8e06-f8b5f21bd7e7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1616e781-fca1-40ea-adca-914ef7dc38a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1616e781-fca1-40ea-adca-914ef7dc38a3
Content-Type: application/json

--- request body ---
{"handle":"qa-05f8f7939bae","displayName":"QA 05f8f7939bae","password":"****","region":"eu"}

--- response: 201 in 398 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-1616e781-fca1-40ea-adca-914ef7dc38a3
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
Location: /v1/accounts/qa-05f8f7939bae
X-Served-Region: eu
Content-Length: 181

{"id":"acc_62033dc1-b7da-4b60-b8eb-c5c0d5a4d141","handle":"qa-05f8f7939bae","displayName":"QA 05f8f7939bae","region":"eu","role":"user","createdAt":"2026-11-15T09:36:07.245339546Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eb5d8fde-67dc-4f8b-8b94-c6fe735ed429

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb5d8fde-67dc-4f8b-8b94-c6fe735ed429
Content-Type: application/json

--- request body ---
{"handle":"qa-4d675a7a288e","displayName":"QA 4d675a7a288e","password":"****","region":"us"}

--- response: 201 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb5d8fde-67dc-4f8b-8b94-c6fe735ed429
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
Location: /v1/accounts/qa-4d675a7a288e
X-Served-Region: us
Content-Length: 181

{"id":"acc_c52dc132-deb4-40be-b320-a2e023cff0c1","handle":"qa-4d675a7a288e","displayName":"QA 4d675a7a288e","region":"us","role":"user","createdAt":"2026-11-15T09:36:07.558006092Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-940e849d-1448-4841-9cbc-2eebcf6ddc08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-940e849d-1448-4841-9cbc-2eebcf6ddc08
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-940e849d-1448-4841-9cbc-2eebcf6ddc08
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
correlation: qa-e0a31c8d-ad82-49c9-a3d2-73ae37f0b3e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0a31c8d-ad82-49c9-a3d2-73ae37f0b3e5
Content-Type: application/json

--- request body ---
{"handle":"qa-05f8f7939bae","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0a31c8d-ad82-49c9-a3d2-73ae37f0b3e5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_62033dc1-b7da-4b60-b8eb-c5c0d5a4d141"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-73192ba7-fede-4812-98fc-2cf325d98378

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73192ba7-fede-4812-98fc-2cf325d98378
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-73192ba7-fede-4812-98fc-2cf325d98378
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

{"id":"acc_62033dc1-b7da-4b60-b8eb-c5c0d5a4d141","handle":"qa-05f8f7939bae","displayName":"QA 05f8f7939bae","region":"eu","role":"user","createdAt":"2026-11-15T09:36:07.245339546Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-7844c419-7eee-4af2-a7b9-50c02d832814

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7844c419-7eee-4af2-a7b9-50c02d832814
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-7844c419-7eee-4af2-a7b9-50c02d832814
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

{"id":"acc_62033dc1-b7da-4b60-b8eb-c5c0d5a4d141","handle":"qa-05f8f7939bae","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-15T09:36:07.245339546Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-4d675a7a288e
correlation: qa-5a118b47-6d04-4209-ae7e-51f9c1ca9579

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a118b47-6d04-4209-ae7e-51f9c1ca9579
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a118b47-6d04-4209-ae7e-51f9c1ca9579
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

{"handle":"qa-4d675a7a288e","displayName":"QA 4d675a7a288e","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-17ef9241-44ec-451f-9d88-b3083cde94f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17ef9241-44ec-451f-9d88-b3083cde94f0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4d675a7a288e","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-17ef9241-44ec-451f-9d88-b3083cde94f0
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
Location: /v1/conversations/cnv_1b75fcda-4db5-4a68-9438-765dbf2ed7a8
X-Data-Region: us
Content-Length: 238

{"id":"cnv_1b75fcda-4db5-4a68-9438-765dbf2ed7a8","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-05f8f7939bae","qa-4d675a7a288e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:07.789054805Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-4ee5753d-8156-4e31-8b14-c314be9ac28e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ee5753d-8156-4e31-8b14-c314be9ac28e
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ee5753d-8156-4e31-8b14-c314be9ac28e
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

{"items":[{"id":"cnv_1b75fcda-4db5-4a68-9438-765dbf2ed7a8","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-05f8f7939bae","qa-4d675a7a288e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:07.789054805Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-dc511a85-e00c-4b84-956f-39242c8e234d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc511a85-e00c-4b84-956f-39242c8e234d
Content-Type: application/json

--- request body ---
{"handle":"qa-4d675a7a288e","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc511a85-e00c-4b84-956f-39242c8e234d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c52dc132-deb4-40be-b320-a2e023cff0c1"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_1b75fcda-4db5-4a68-9438-765dbf2ed7a8
correlation: qa-374d2621-c40f-4603-8cd7-ca4c761cc7e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-374d2621-c40f-4603-8cd7-ca4c761cc7e6
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-374d2621-c40f-4603-8cd7-ca4c761cc7e6
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

{"id":"cnv_1b75fcda-4db5-4a68-9438-765dbf2ed7a8","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-05f8f7939bae","qa-4d675a7a288e"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-15T09:36:07.789054805Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_1b75fcda-4db5-4a68-9438-765dbf2ed7a8/messages
correlation: qa-66177610-7317-4741-8a7d-3494a4f875de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66177610-7317-4741-8a7d-3494a4f875de
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-66177610-7317-4741-8a7d-3494a4f875de
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

{"items":[{"id":"msg_0b06b5ed-be27-4eed-92df-bd288b79e586","conversationId":"cnv_1b75fcda-4db5-4a68-9438-765dbf2ed7a8","sender":"qa-05f8f7939bae","body":"Hi","createdAt":"2026-11-15T09:36:07.789071886Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_1b75fcda-4db5-4a68-9438-765dbf2ed7a8/messages
correlation: qa-90a7975e-f017-42ef-89a9-c056972a2b5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90a7975e-f017-42ef-89a9-c056972a2b5f
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-90a7975e-f017-42ef-89a9-c056972a2b5f
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

{"id":"msg_9f7978a2-3d26-4c90-8ef8-af268920df34","conversationId":"cnv_1b75fcda-4db5-4a68-9438-765dbf2ed7a8","sender":"qa-4d675a7a288e","body":"Reply","createdAt":"2026-11-15T09:36:07.944163104Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_1b75fcda-4db5-4a68-9438-765dbf2ed7a8/read
correlation: qa-c076a214-0a81-430c-9d6f-77abe32b154d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c076a214-0a81-430c-9d6f-77abe32b154d
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c076a214-0a81-430c-9d6f-77abe32b154d
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

{"conversationId":"cnv_1b75fcda-4db5-4a68-9438-765dbf2ed7a8","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_1b75fcda-4db5-4a68-9438-765dbf2ed7a8/close
correlation: qa-e07cf0a6-24d7-4612-aaa1-ba8249c9c083

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e07cf0a6-24d7-4612-aaa1-ba8249c9c083
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e07cf0a6-24d7-4612-aaa1-ba8249c9c083
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

{"id":"cnv_1b75fcda-4db5-4a68-9438-765dbf2ed7a8","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-05f8f7939bae","qa-4d675a7a288e"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-15T09:36:07.789054805Z","closedAt":"2026-11-15T09:36:07.994129263Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-3b65206d-1ac1-4c3a-b907-d15d2dc8ebd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b65206d-1ac1-4c3a-b907-d15d2dc8ebd9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b65206d-1ac1-4c3a-b907-d15d2dc8ebd9
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

{"balance":4,"currency":"credits","accountId":"acc_62033dc1-b7da-4b60-b8eb-c5c0d5a4d141"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-508bd0a5-bed4-470e-921b-5073c8486baa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-508bd0a5-bed4-470e-921b-5073c8486baa
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-508bd0a5-bed4-470e-921b-5073c8486baa
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

{"items":[{"id":"led_1e540b6c-171e-4393-980e-03644c19aa11","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-15T09:36:07.245359920Z"},{"id":"led_2cf9632a-5bd5-427e-bec9-9b771ca9edff","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_1b75fcda-4db5-4a68-9438-765dbf2ed7a8","createdAt":"2026-11-15T09:36:07.789025796Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e5989180-290b-4736-bff5-9bdc123b0b23

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1019939d16a947e9b87bd355e55b9870
X-Correlation-Id: qa-e5989180-290b-4736-bff5-9bdc123b0b23
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5989180-290b-4736-bff5-9bdc123b0b23
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
Location: /v1/credits/purchases/pur_4c549692-6509-46f2-9ecc-bb78a189be41
Content-Length: 144

{"id":"pur_4c549692-6509-46f2-9ecc-bb78a189be41","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-15T09:36:08.042851975Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-649e96b1-dd07-40f7-9c85-a3d6686d03c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-649e96b1-dd07-40f7-9c85-a3d6686d03c0
Content-Type: application/json

--- response: 403 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-649e96b1-dd07-40f7-9c85-a3d6686d03c0
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-649e96b1-dd07-40f7-9c85-a3d6686d03c0"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c0a4839c-1143-4cc1-a914-f50d6f196986

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0a4839c-1143-4cc1-a914-f50d6f196986
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c0a4839c-1143-4cc1-a914-f50d6f196986
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
correlation: qa-8d068cb3-aa90-44fd-9d1e-7b8ac17c8530

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d068cb3-aa90-44fd-9d1e-7b8ac17c8530
Content-Type: application/json

--- request body ---
{"handle":"qa-4d675a7a288e","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d068cb3-aa90-44fd-9d1e-7b8ac17c8530
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8d068cb3-aa90-44fd-9d1e-7b8ac17c8530"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f665b5f9-0229-4e8a-8b22-08cf10efbb04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f665b5f9-0229-4e8a-8b22-08cf10efbb04
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f665b5f9-0229-4e8a-8b22-08cf10efbb04
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
correlation: qa-a7df2fe1-09e1-4ef9-8e06-f8b5f21bd7e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7df2fe1-09e1-4ef9-8e06-f8b5f21bd7e7
Content-Type: application/json

--- request body ---
{"handle":"qa-05f8f7939bae","password":"****"}

--- response: 401 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7df2fe1-09e1-4ef9-8e06-f8b5f21bd7e7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a7df2fe1-09e1-4ef9-8e06-f8b5f21bd7e7"}
```
