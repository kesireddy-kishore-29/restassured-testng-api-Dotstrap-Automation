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
| 1 | `POST /v1/accounts` | 201 | 240 | `qa-73045730-9147-4eae-a972-cc605da3496e` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-c26cda83-068b-4e5f-970b-93e17c460a0f` |
| 3 | `GET /health` | 200 | 41 | `qa-682013ad-0287-41f8-9131-4ae8583ace56` |
| 4 | `POST /v1/auth/token` | 200 | 15 | `qa-1f8150fc-9baa-475c-bfc7-adf790b3460c` |
| 5 | `GET /v1/accounts/me` | 200 | 11 | `qa-a76bd5b9-5f4f-4327-804c-63520574e1a7` |
| 6 | `PATCH /v1/accounts/me` | 200 | 13 | `qa-275a3468-0fc5-4af4-8454-718f58cc57e3` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 7 | `qa-86f06691-3e7e-450c-9d73-c0ea9989a85d` |
| 8 | `POST /v1/conversations` | 201 | 4 | `qa-cb085b4a-0f7c-447d-9431-30fdfff9ef47` |
| 9 | `GET /v1/conversations` | 200 | 15 | `qa-a6089d2e-3178-48b8-8126-5cd77f765fb0` |
| 10 | `POST /v1/auth/token` | 200 | 22 | `qa-42fd90b2-2394-406c-81c4-5c5c0ff3bcfd` |
| 11 | `GET /v1/conversations/{id}` | 200 | 9 | `qa-56563f5c-ae42-4095-8510-58c4362dd3d3` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 15 | `qa-112365ec-9cf5-4db2-8856-a2d7d13334a8` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-79674314-6088-41b7-9490-cb017e403e80` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 3 | `qa-a0614244-0d36-46a7-854f-beb2f57ddd9e` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 11 | `qa-88838476-fef0-4f62-a825-da4535407138` |
| 16 | `GET /v1/credits/balance` | 200 | 7 | `qa-b49c3144-28cc-4ef7-b3e6-9089bb70bcd5` |
| 17 | `GET /v1/credits/ledger` | 200 | 7 | `qa-1ef34ca2-22e7-43dc-8c31-6fd09e4544d9` |
| 18 | `POST /v1/credits/purchases` | 201 | 9 | `qa-c8e27d69-496a-4455-bcb9-9c68b4fd1e19` |
| 19 | `GET /v1/admin/stats` | 403 | 14 | `qa-795d804f-f425-4428-9b2f-6e9148251c93` |
| 20 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-e812c11f-ecdf-4dcf-a90b-fb9680a437df` |
| 21 | `POST /v1/auth/token` | 401 | 28 | `qa-4e6af2cc-6163-4d4e-9221-11472762f000` |
| 22 | `DELETE /v1/accounts/me` | 204 | 50 | `qa-40c2a763-fcc4-42ec-9ce7-6b43e5ae58d0` |
| 23 | `POST /v1/auth/token` | 401 | 18 | `qa-0b336767-90bf-40a6-ac38-9c25252732b0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-73045730-9147-4eae-a972-cc605da3496e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73045730-9147-4eae-a972-cc605da3496e
Content-Type: application/json

--- request body ---
{"handle":"qa-70100d2dbaa7","displayName":"QA 70100d2dbaa7","password":"****","region":"eu"}

--- response: 201 in 240 ms ---
Date: Wed, 28 Oct 2026 08:42:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-73045730-9147-4eae-a972-cc605da3496e
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
Location: /v1/accounts/qa-70100d2dbaa7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f73ac2f1-add8-47f2-8718-0c103f4bdafd","handle":"qa-70100d2dbaa7","displayName":"QA 70100d2dbaa7","region":"eu","role":"user","createdAt":"2026-10-28T08:42:50.647231459Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c26cda83-068b-4e5f-970b-93e17c460a0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c26cda83-068b-4e5f-970b-93e17c460a0f
Content-Type: application/json

--- request body ---
{"handle":"qa-fdcf8efd4062","displayName":"QA fdcf8efd4062","password":"****","region":"us"}

--- response: 201 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-c26cda83-068b-4e5f-970b-93e17c460a0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-fdcf8efd4062
X-Served-Region: us
Content-Length: 181

{"id":"acc_3b334e3f-c464-4224-a6f9-5678af70ed07","handle":"qa-fdcf8efd4062","displayName":"QA fdcf8efd4062","region":"us","role":"user","createdAt":"2026-10-28T08:42:50.931810986Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-682013ad-0287-41f8-9131-4ae8583ace56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-682013ad-0287-41f8-9131-4ae8583ace56
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Wed, 28 Oct 2026 08:42:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-682013ad-0287-41f8-9131-4ae8583ace56
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
correlation: qa-1f8150fc-9baa-475c-bfc7-adf790b3460c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f8150fc-9baa-475c-bfc7-adf790b3460c
Content-Type: application/json

--- request body ---
{"handle":"qa-70100d2dbaa7","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f8150fc-9baa-475c-bfc7-adf790b3460c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f73ac2f1-add8-47f2-8718-0c103f4bdafd"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-a76bd5b9-5f4f-4327-804c-63520574e1a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a76bd5b9-5f4f-4327-804c-63520574e1a7
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a76bd5b9-5f4f-4327-804c-63520574e1a7
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

{"id":"acc_f73ac2f1-add8-47f2-8718-0c103f4bdafd","handle":"qa-70100d2dbaa7","displayName":"QA 70100d2dbaa7","region":"eu","role":"user","createdAt":"2026-10-28T08:42:50.647231459Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-275a3468-0fc5-4af4-8454-718f58cc57e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-275a3468-0fc5-4af4-8454-718f58cc57e3
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-275a3468-0fc5-4af4-8454-718f58cc57e3
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

{"id":"acc_f73ac2f1-add8-47f2-8718-0c103f4bdafd","handle":"qa-70100d2dbaa7","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-10-28T08:42:50.647231459Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-fdcf8efd4062
correlation: qa-86f06691-3e7e-450c-9d73-c0ea9989a85d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86f06691-3e7e-450c-9d73-c0ea9989a85d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-86f06691-3e7e-450c-9d73-c0ea9989a85d
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

{"handle":"qa-fdcf8efd4062","displayName":"QA fdcf8efd4062","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-cb085b4a-0f7c-447d-9431-30fdfff9ef47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb085b4a-0f7c-447d-9431-30fdfff9ef47
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fdcf8efd4062","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb085b4a-0f7c-447d-9431-30fdfff9ef47
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
Location: /v1/conversations/cnv_56c1d81e-9c3c-4e84-9657-782fb603bb07
X-Data-Region: us
Content-Length: 238

{"id":"cnv_56c1d81e-9c3c-4e84-9657-782fb603bb07","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-70100d2dbaa7","qa-fdcf8efd4062"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.108728488Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-a6089d2e-3178-48b8-8126-5cd77f765fb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6089d2e-3178-48b8-8126-5cd77f765fb0
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6089d2e-3178-48b8-8126-5cd77f765fb0
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

{"items":[{"id":"cnv_56c1d81e-9c3c-4e84-9657-782fb603bb07","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-70100d2dbaa7","qa-fdcf8efd4062"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.108728488Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-42fd90b2-2394-406c-81c4-5c5c0ff3bcfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42fd90b2-2394-406c-81c4-5c5c0ff3bcfd
Content-Type: application/json

--- request body ---
{"handle":"qa-fdcf8efd4062","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-42fd90b2-2394-406c-81c4-5c5c0ff3bcfd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b334e3f-c464-4224-a6f9-5678af70ed07"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_56c1d81e-9c3c-4e84-9657-782fb603bb07
correlation: qa-56563f5c-ae42-4095-8510-58c4362dd3d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56563f5c-ae42-4095-8510-58c4362dd3d3
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-56563f5c-ae42-4095-8510-58c4362dd3d3
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

{"id":"cnv_56c1d81e-9c3c-4e84-9657-782fb603bb07","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-70100d2dbaa7","qa-fdcf8efd4062"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-28T08:42:51.108728488Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_56c1d81e-9c3c-4e84-9657-782fb603bb07/messages
correlation: qa-112365ec-9cf5-4db2-8856-a2d7d13334a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-112365ec-9cf5-4db2-8856-a2d7d13334a8
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-112365ec-9cf5-4db2-8856-a2d7d13334a8
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

{"items":[{"id":"msg_1c883fbf-58ce-4c69-8702-ed9a00dd510d","conversationId":"cnv_56c1d81e-9c3c-4e84-9657-782fb603bb07","sender":"qa-70100d2dbaa7","body":"Hi","createdAt":"2026-10-28T08:42:51.108746936Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_56c1d81e-9c3c-4e84-9657-782fb603bb07/messages
correlation: qa-79674314-6088-41b7-9490-cb017e403e80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79674314-6088-41b7-9490-cb017e403e80
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-79674314-6088-41b7-9490-cb017e403e80
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

{"id":"msg_09df3fa6-1567-4dea-9c8b-90389650b011","conversationId":"cnv_56c1d81e-9c3c-4e84-9657-782fb603bb07","sender":"qa-fdcf8efd4062","body":"Reply","createdAt":"2026-10-28T08:42:51.225001513Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_56c1d81e-9c3c-4e84-9657-782fb603bb07/read
correlation: qa-a0614244-0d36-46a7-854f-beb2f57ddd9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0614244-0d36-46a7-854f-beb2f57ddd9e
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0614244-0d36-46a7-854f-beb2f57ddd9e
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

{"conversationId":"cnv_56c1d81e-9c3c-4e84-9657-782fb603bb07","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_56c1d81e-9c3c-4e84-9657-782fb603bb07/close
correlation: qa-88838476-fef0-4f62-a825-da4535407138

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88838476-fef0-4f62-a825-da4535407138
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-88838476-fef0-4f62-a825-da4535407138
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

{"id":"cnv_56c1d81e-9c3c-4e84-9657-782fb603bb07","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-70100d2dbaa7","qa-fdcf8efd4062"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.108728488Z","closedAt":"2026-10-28T08:42:51.251413489Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-b49c3144-28cc-4ef7-b3e6-9089bb70bcd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b49c3144-28cc-4ef7-b3e6-9089bb70bcd5
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b49c3144-28cc-4ef7-b3e6-9089bb70bcd5
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

{"balance":4,"currency":"credits","accountId":"acc_f73ac2f1-add8-47f2-8718-0c103f4bdafd"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-1ef34ca2-22e7-43dc-8c31-6fd09e4544d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ef34ca2-22e7-43dc-8c31-6fd09e4544d9
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ef34ca2-22e7-43dc-8c31-6fd09e4544d9
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

{"items":[{"id":"led_283b7cd6-80c2-4b87-a326-fc6bb13c031b","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-28T08:42:50.647240042Z"},{"id":"led_aff1b3bb-a91f-49e5-9c73-2418815dbba4","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_56c1d81e-9c3c-4e84-9657-782fb603bb07","createdAt":"2026-10-28T08:42:51.108703671Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c8e27d69-496a-4455-bcb9-9c68b4fd1e19

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bc59e85366a94590af1a18b3b8ef9729
X-Correlation-Id: qa-c8e27d69-496a-4455-bcb9-9c68b4fd1e19
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8e27d69-496a-4455-bcb9-9c68b4fd1e19
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
Location: /v1/credits/purchases/pur_73e02c77-1f3c-4c08-9b17-17a0c3fd4303
Content-Length: 144

{"id":"pur_73e02c77-1f3c-4c08-9b17-17a0c3fd4303","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-10-28T08:42:51.299987754Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-795d804f-f425-4428-9b2f-6e9148251c93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-795d804f-f425-4428-9b2f-6e9148251c93
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-795d804f-f425-4428-9b2f-6e9148251c93
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-795d804f-f425-4428-9b2f-6e9148251c93"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e812c11f-ecdf-4dcf-a90b-fb9680a437df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e812c11f-ecdf-4dcf-a90b-fb9680a437df
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e812c11f-ecdf-4dcf-a90b-fb9680a437df
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
correlation: qa-4e6af2cc-6163-4d4e-9221-11472762f000

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e6af2cc-6163-4d4e-9221-11472762f000
Content-Type: application/json

--- request body ---
{"handle":"qa-fdcf8efd4062","password":"****"}

--- response: 401 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e6af2cc-6163-4d4e-9221-11472762f000
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4e6af2cc-6163-4d4e-9221-11472762f000"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-40c2a763-fcc4-42ec-9ce7-6b43e5ae58d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40c2a763-fcc4-42ec-9ce7-6b43e5ae58d0
Content-Type: application/json

--- response: 204 in 50 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-40c2a763-fcc4-42ec-9ce7-6b43e5ae58d0
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
correlation: qa-0b336767-90bf-40a6-ac38-9c25252732b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b336767-90bf-40a6-ac38-9c25252732b0
Content-Type: application/json

--- request body ---
{"handle":"qa-70100d2dbaa7","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b336767-90bf-40a6-ac38-9c25252732b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0b336767-90bf-40a6-ac38-9c25252732b0"}
```
