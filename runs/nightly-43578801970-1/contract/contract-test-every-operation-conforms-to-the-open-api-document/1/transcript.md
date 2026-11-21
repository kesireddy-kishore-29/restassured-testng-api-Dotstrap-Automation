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
| 1 | `POST /v1/accounts` | 201 | 415 | `qa-1064c1cb-960a-445d-9b4b-59aa491f2181` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-38855abf-e4bd-440b-b948-663fe94a2baa` |
| 3 | `GET /health` | 200 | 39 | `qa-483250d5-0fd7-4c81-821b-ed468fd7cb2c` |
| 4 | `POST /v1/auth/token` | 200 | 12 | `qa-977de468-3bbb-48a6-9490-09f966664ec6` |
| 5 | `GET /v1/accounts/me` | 200 | 15 | `qa-96562822-4661-4269-953c-7121375a9189` |
| 6 | `PATCH /v1/accounts/me` | 200 | 38 | `qa-fd645fd7-e0d2-4b5a-871d-bf0eed0c1ea7` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 10 | `qa-f101fe58-6cd4-45ac-bfe0-ba9c288bbda8` |
| 8 | `POST /v1/conversations` | 201 | 18 | `qa-2b827c78-1754-4815-812a-c3174f16dcc2` |
| 9 | `GET /v1/conversations` | 200 | 21 | `qa-c19a3303-32db-43da-a2c1-9497dc413182` |
| 10 | `POST /v1/auth/token` | 200 | 20 | `qa-76489668-7a19-405c-936a-9bcd0010c563` |
| 11 | `GET /v1/conversations/{id}` | 200 | 5 | `qa-8ff28074-45b2-4726-96c7-1a2e7f68b2a9` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 8 | `qa-21e8808a-cbd1-4736-94db-321d803f9075` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-39b71d1b-bb61-46d9-bb10-266c33c9fc43` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 9 | `qa-bd648e3d-8bde-4936-b9b0-673165f811a8` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-2b3300d6-57d5-4d54-87e5-4c0e5ab9fb57` |
| 16 | `GET /v1/credits/balance` | 200 | 12 | `qa-28bf9060-dafb-4f46-be6c-115186a98999` |
| 17 | `GET /v1/credits/ledger` | 200 | 12 | `qa-dbc1871a-d60b-440d-a120-64f6f6fed8ff` |
| 18 | `POST /v1/credits/purchases` | 201 | 13 | `qa-2655ac3b-7877-446a-ad84-1232ac87b4f7` |
| 19 | `GET /v1/admin/stats` | 403 | 14 | `qa-a74b893f-5414-47ae-821d-247f3ab2bf67` |
| 20 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-daceb271-f6cd-4bde-84f0-83b03cee77e5` |
| 21 | `POST /v1/auth/token` | 401 | 21 | `qa-430388ac-3b44-4527-b3db-60de8ec1d947` |
| 22 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-d499ac33-25a4-428a-a263-3d291f6e2b1e` |
| 23 | `POST /v1/auth/token` | 401 | 15 | `qa-30845377-75b5-47eb-a262-712afe14d242` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1064c1cb-960a-445d-9b4b-59aa491f2181

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1064c1cb-960a-445d-9b4b-59aa491f2181
Content-Type: application/json

--- request body ---
{"handle":"qa-fc5029d7a71e","displayName":"QA fc5029d7a71e","password":"****","region":"eu"}

--- response: 201 in 415 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-1064c1cb-960a-445d-9b4b-59aa491f2181
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
Location: /v1/accounts/qa-fc5029d7a71e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_77bd12dc-5685-4444-a5cf-dd5adcbfd71a","handle":"qa-fc5029d7a71e","displayName":"QA fc5029d7a71e","region":"eu","role":"user","createdAt":"2026-11-14T09:05:09.125520528Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-38855abf-e4bd-440b-b948-663fe94a2baa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38855abf-e4bd-440b-b948-663fe94a2baa
Content-Type: application/json

--- request body ---
{"handle":"qa-66d29279b730","displayName":"QA 66d29279b730","password":"****","region":"us"}

--- response: 201 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-38855abf-e4bd-440b-b948-663fe94a2baa
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
Location: /v1/accounts/qa-66d29279b730
X-Served-Region: us
Content-Length: 181

{"id":"acc_eb1d0ea2-34ea-4a24-9670-cfa3b8b0d2ae","handle":"qa-66d29279b730","displayName":"QA 66d29279b730","region":"us","role":"user","createdAt":"2026-11-14T09:05:09.445927133Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-483250d5-0fd7-4c81-821b-ed468fd7cb2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-483250d5-0fd7-4c81-821b-ed468fd7cb2c
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-483250d5-0fd7-4c81-821b-ed468fd7cb2c
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
correlation: qa-977de468-3bbb-48a6-9490-09f966664ec6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-977de468-3bbb-48a6-9490-09f966664ec6
Content-Type: application/json

--- request body ---
{"handle":"qa-fc5029d7a71e","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-977de468-3bbb-48a6-9490-09f966664ec6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_77bd12dc-5685-4444-a5cf-dd5adcbfd71a"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-96562822-4661-4269-953c-7121375a9189

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96562822-4661-4269-953c-7121375a9189
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-96562822-4661-4269-953c-7121375a9189
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

{"id":"acc_77bd12dc-5685-4444-a5cf-dd5adcbfd71a","handle":"qa-fc5029d7a71e","displayName":"QA fc5029d7a71e","region":"eu","role":"user","createdAt":"2026-11-14T09:05:09.125520528Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-fd645fd7-e0d2-4b5a-871d-bf0eed0c1ea7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd645fd7-e0d2-4b5a-871d-bf0eed0c1ea7
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 38 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd645fd7-e0d2-4b5a-871d-bf0eed0c1ea7
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

{"id":"acc_77bd12dc-5685-4444-a5cf-dd5adcbfd71a","handle":"qa-fc5029d7a71e","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-14T09:05:09.125520528Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-66d29279b730
correlation: qa-f101fe58-6cd4-45ac-bfe0-ba9c288bbda8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f101fe58-6cd4-45ac-bfe0-ba9c288bbda8
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-f101fe58-6cd4-45ac-bfe0-ba9c288bbda8
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

{"handle":"qa-66d29279b730","displayName":"QA 66d29279b730","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-2b827c78-1754-4815-812a-c3174f16dcc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b827c78-1754-4815-812a-c3174f16dcc2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-66d29279b730","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b827c78-1754-4815-812a-c3174f16dcc2
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
Location: /v1/conversations/cnv_48b446ed-fded-48a7-bf37-1b8dfddc51f7
X-Data-Region: us
Content-Length: 238

{"id":"cnv_48b446ed-fded-48a7-bf37-1b8dfddc51f7","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-fc5029d7a71e","qa-66d29279b730"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:09.677138690Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-c19a3303-32db-43da-a2c1-9497dc413182

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c19a3303-32db-43da-a2c1-9497dc413182
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-c19a3303-32db-43da-a2c1-9497dc413182
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

{"items":[{"id":"cnv_48b446ed-fded-48a7-bf37-1b8dfddc51f7","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-fc5029d7a71e","qa-66d29279b730"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:09.677138690Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-76489668-7a19-405c-936a-9bcd0010c563

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76489668-7a19-405c-936a-9bcd0010c563
Content-Type: application/json

--- request body ---
{"handle":"qa-66d29279b730","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-76489668-7a19-405c-936a-9bcd0010c563
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb1d0ea2-34ea-4a24-9670-cfa3b8b0d2ae"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_48b446ed-fded-48a7-bf37-1b8dfddc51f7
correlation: qa-8ff28074-45b2-4726-96c7-1a2e7f68b2a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ff28074-45b2-4726-96c7-1a2e7f68b2a9
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ff28074-45b2-4726-96c7-1a2e7f68b2a9
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

{"id":"cnv_48b446ed-fded-48a7-bf37-1b8dfddc51f7","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-fc5029d7a71e","qa-66d29279b730"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-14T09:05:09.677138690Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_48b446ed-fded-48a7-bf37-1b8dfddc51f7/messages
correlation: qa-21e8808a-cbd1-4736-94db-321d803f9075

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21e8808a-cbd1-4736-94db-321d803f9075
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-21e8808a-cbd1-4736-94db-321d803f9075
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

{"items":[{"id":"msg_cf99d972-2d57-4ca1-ab92-5cbc33c3269a","conversationId":"cnv_48b446ed-fded-48a7-bf37-1b8dfddc51f7","sender":"qa-fc5029d7a71e","body":"Hi","createdAt":"2026-11-14T09:05:09.677164278Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_48b446ed-fded-48a7-bf37-1b8dfddc51f7/messages
correlation: qa-39b71d1b-bb61-46d9-bb10-266c33c9fc43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39b71d1b-bb61-46d9-bb10-266c33c9fc43
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-39b71d1b-bb61-46d9-bb10-266c33c9fc43
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

{"id":"msg_f7175574-3660-44ef-9e1a-d0322a208f12","conversationId":"cnv_48b446ed-fded-48a7-bf37-1b8dfddc51f7","sender":"qa-66d29279b730","body":"Reply","createdAt":"2026-11-14T09:05:09.817392303Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_48b446ed-fded-48a7-bf37-1b8dfddc51f7/read
correlation: qa-bd648e3d-8bde-4936-b9b0-673165f811a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd648e3d-8bde-4936-b9b0-673165f811a8
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd648e3d-8bde-4936-b9b0-673165f811a8
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

{"conversationId":"cnv_48b446ed-fded-48a7-bf37-1b8dfddc51f7","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_48b446ed-fded-48a7-bf37-1b8dfddc51f7/close
correlation: qa-2b3300d6-57d5-4d54-87e5-4c0e5ab9fb57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b3300d6-57d5-4d54-87e5-4c0e5ab9fb57
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b3300d6-57d5-4d54-87e5-4c0e5ab9fb57
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

{"id":"cnv_48b446ed-fded-48a7-bf37-1b8dfddc51f7","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-fc5029d7a71e","qa-66d29279b730"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-14T09:05:09.677138690Z","closedAt":"2026-11-14T09:05:09.860303246Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-28bf9060-dafb-4f46-be6c-115186a98999

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28bf9060-dafb-4f46-be6c-115186a98999
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-28bf9060-dafb-4f46-be6c-115186a98999
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

{"balance":4,"currency":"credits","accountId":"acc_77bd12dc-5685-4444-a5cf-dd5adcbfd71a"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-dbc1871a-d60b-440d-a120-64f6f6fed8ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbc1871a-d60b-440d-a120-64f6f6fed8ff
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbc1871a-d60b-440d-a120-64f6f6fed8ff
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

{"items":[{"id":"led_538868e5-5dd3-46b7-9ec0-33d97d0a4377","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-14T09:05:09.125547509Z"},{"id":"led_55b451d7-20a7-41d8-8a20-0cd649ae55ce","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_48b446ed-fded-48a7-bf37-1b8dfddc51f7","createdAt":"2026-11-14T09:05:09.677105871Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2655ac3b-7877-446a-ad84-1232ac87b4f7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-04d18e425df344969e8e6a56d1a40b76
X-Correlation-Id: qa-2655ac3b-7877-446a-ad84-1232ac87b4f7
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2655ac3b-7877-446a-ad84-1232ac87b4f7
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
Location: /v1/credits/purchases/pur_c15f0ea2-eddb-4fe9-889b-13050a925f30
Content-Length: 144

{"id":"pur_c15f0ea2-eddb-4fe9-889b-13050a925f30","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-14T09:05:09.932296236Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-a74b893f-5414-47ae-821d-247f3ab2bf67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a74b893f-5414-47ae-821d-247f3ab2bf67
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a74b893f-5414-47ae-821d-247f3ab2bf67
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-a74b893f-5414-47ae-821d-247f3ab2bf67"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-daceb271-f6cd-4bde-84f0-83b03cee77e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daceb271-f6cd-4bde-84f0-83b03cee77e5
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-daceb271-f6cd-4bde-84f0-83b03cee77e5
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
correlation: qa-430388ac-3b44-4527-b3db-60de8ec1d947

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-430388ac-3b44-4527-b3db-60de8ec1d947
Content-Type: application/json

--- request body ---
{"handle":"qa-66d29279b730","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-430388ac-3b44-4527-b3db-60de8ec1d947
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-430388ac-3b44-4527-b3db-60de8ec1d947"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d499ac33-25a4-428a-a263-3d291f6e2b1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d499ac33-25a4-428a-a263-3d291f6e2b1e
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d499ac33-25a4-428a-a263-3d291f6e2b1e
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
correlation: qa-30845377-75b5-47eb-a262-712afe14d242

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30845377-75b5-47eb-a262-712afe14d242
Content-Type: application/json

--- request body ---
{"handle":"qa-fc5029d7a71e","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30845377-75b5-47eb-a262-712afe14d242
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-30845377-75b5-47eb-a262-712afe14d242"}
```
