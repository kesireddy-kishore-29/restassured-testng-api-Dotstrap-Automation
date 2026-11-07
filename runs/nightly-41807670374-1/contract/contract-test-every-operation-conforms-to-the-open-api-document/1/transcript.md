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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-f219e6c4-64ba-411c-b8cd-3f8d5b0ac7b4` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-02c09272-3933-45cd-a8fe-fa8ea18101a5` |
| 3 | `GET /health` | 200 | 7 | `qa-c66fead7-4c52-4c04-8d19-6a33015d4715` |
| 4 | `POST /v1/auth/token` | 200 | 17 | `qa-b5da0f64-b26e-45cd-b5df-a357f8bd9bbc` |
| 5 | `GET /v1/accounts/me` | 200 | 7 | `qa-d7cca972-e47a-4964-a74f-50008ff44ed0` |
| 6 | `PATCH /v1/accounts/me` | 200 | 7 | `qa-b793facb-379f-467c-b9c6-a73f89df3899` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 2 | `qa-19b97bda-a4af-4bae-9669-0e31bcfb57e8` |
| 8 | `POST /v1/conversations` | 201 | 8 | `qa-fc26babd-5a44-4bbe-8ade-7d888a91172e` |
| 9 | `GET /v1/conversations` | 200 | 5 | `qa-d1730e00-9ac2-44c2-823f-3609ec55ac32` |
| 10 | `POST /v1/auth/token` | 200 | 6 | `qa-906867c7-f1bf-46be-80d8-a904d5005654` |
| 11 | `GET /v1/conversations/{id}` | 200 | 5 | `qa-e6a02be6-9c19-4173-9671-2c35f95fbd36` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-215e3089-3280-470d-a022-510634a615ea` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 2 | `qa-5363dbbc-634f-4b22-ba4d-a521bee4da47` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 10 | `qa-db9a1e47-fbd4-4599-9b96-08e83ec06b2f` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-75a4d22f-c843-4b23-bbf5-3332b130098a` |
| 16 | `GET /v1/credits/balance` | 200 | 2 | `qa-4e03a810-9454-4352-81cd-95a796b18073` |
| 17 | `GET /v1/credits/ledger` | 200 | 2 | `qa-bdf577ec-3a35-420e-bfd8-143b142943f5` |
| 18 | `POST /v1/credits/purchases` | 201 | 4 | `qa-2752b155-5681-499b-b7ab-b287064fc557` |
| 19 | `GET /v1/admin/stats` | 403 | 2 | `qa-78cae9f9-f428-4d4f-a5b4-a29d0444fa38` |
| 20 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-7164d0e5-d836-4b3e-84b3-99844a2a214e` |
| 21 | `POST /v1/auth/token` | 401 | 2 | `qa-4c4296b0-f9c9-4152-951c-595e93474ead` |
| 22 | `DELETE /v1/accounts/me` | 204 | 1 | `qa-3f26efad-7053-4a58-9921-e117acd86ecb` |
| 23 | `POST /v1/auth/token` | 401 | 2 | `qa-e26ac7db-3cc7-4384-bd7b-c6ef067b4ccf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f219e6c4-64ba-411c-b8cd-3f8d5b0ac7b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f219e6c4-64ba-411c-b8cd-3f8d5b0ac7b4
Content-Type: application/json

--- request body ---
{"handle":"qa-a1ab2d1c31ae","displayName":"QA a1ab2d1c31ae","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f219e6c4-64ba-411c-b8cd-3f8d5b0ac7b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 7
Location: /v1/accounts/qa-a1ab2d1c31ae
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d1754652-73ef-4253-a6ab-a7f391f3a1d4","handle":"qa-a1ab2d1c31ae","displayName":"QA a1ab2d1c31ae","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.998753017Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-02c09272-3933-45cd-a8fe-fa8ea18101a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02c09272-3933-45cd-a8fe-fa8ea18101a5
Content-Type: application/json

--- request body ---
{"handle":"qa-59b5945c3c9d","displayName":"QA 59b5945c3c9d","password":"****","region":"us"}

--- response: 201 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-02c09272-3933-45cd-a8fe-fa8ea18101a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 7
Location: /v1/accounts/qa-59b5945c3c9d
X-Served-Region: us
Content-Length: 181

{"id":"acc_8f084656-aa85-4525-b915-684fb304cbde","handle":"qa-59b5945c3c9d","displayName":"QA 59b5945c3c9d","region":"us","role":"user","createdAt":"2026-11-04T09:28:04.017182708Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-c66fead7-4c52-4c04-8d19-6a33015d4715

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c66fead7-4c52-4c04-8d19-6a33015d4715
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c66fead7-4c52-4c04-8d19-6a33015d4715
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
correlation: qa-b5da0f64-b26e-45cd-b5df-a357f8bd9bbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5da0f64-b26e-45cd-b5df-a357f8bd9bbc
Content-Type: application/json

--- request body ---
{"handle":"qa-a1ab2d1c31ae","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5da0f64-b26e-45cd-b5df-a357f8bd9bbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d1754652-73ef-4253-a6ab-a7f391f3a1d4"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-d7cca972-e47a-4964-a74f-50008ff44ed0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7cca972-e47a-4964-a74f-50008ff44ed0
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7cca972-e47a-4964-a74f-50008ff44ed0
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

{"id":"acc_d1754652-73ef-4253-a6ab-a7f391f3a1d4","handle":"qa-a1ab2d1c31ae","displayName":"QA a1ab2d1c31ae","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.998753017Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-b793facb-379f-467c-b9c6-a73f89df3899

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b793facb-379f-467c-b9c6-a73f89df3899
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b793facb-379f-467c-b9c6-a73f89df3899
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

{"id":"acc_d1754652-73ef-4253-a6ab-a7f391f3a1d4","handle":"qa-a1ab2d1c31ae","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.998753017Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-59b5945c3c9d
correlation: qa-19b97bda-a4af-4bae-9669-0e31bcfb57e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19b97bda-a4af-4bae-9669-0e31bcfb57e8
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-19b97bda-a4af-4bae-9669-0e31bcfb57e8
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

{"handle":"qa-59b5945c3c9d","displayName":"QA 59b5945c3c9d","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-fc26babd-5a44-4bbe-8ade-7d888a91172e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc26babd-5a44-4bbe-8ade-7d888a91172e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-59b5945c3c9d","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc26babd-5a44-4bbe-8ade-7d888a91172e
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
Location: /v1/conversations/cnv_54dd71d5-76a7-4376-8e17-8a3dfee64af7
X-Data-Region: us
Content-Length: 238

{"id":"cnv_54dd71d5-76a7-4376-8e17-8a3dfee64af7","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-a1ab2d1c31ae","qa-59b5945c3c9d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:04.097358755Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-d1730e00-9ac2-44c2-823f-3609ec55ac32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1730e00-9ac2-44c2-823f-3609ec55ac32
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1730e00-9ac2-44c2-823f-3609ec55ac32
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

{"items":[{"id":"cnv_54dd71d5-76a7-4376-8e17-8a3dfee64af7","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-a1ab2d1c31ae","qa-59b5945c3c9d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:04.097358755Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-906867c7-f1bf-46be-80d8-a904d5005654

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-906867c7-f1bf-46be-80d8-a904d5005654
Content-Type: application/json

--- request body ---
{"handle":"qa-59b5945c3c9d","password":"****"}

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-906867c7-f1bf-46be-80d8-a904d5005654
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8f084656-aa85-4525-b915-684fb304cbde"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_54dd71d5-76a7-4376-8e17-8a3dfee64af7
correlation: qa-e6a02be6-9c19-4173-9671-2c35f95fbd36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6a02be6-9c19-4173-9671-2c35f95fbd36
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6a02be6-9c19-4173-9671-2c35f95fbd36
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

{"id":"cnv_54dd71d5-76a7-4376-8e17-8a3dfee64af7","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-a1ab2d1c31ae","qa-59b5945c3c9d"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-04T09:28:04.097358755Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_54dd71d5-76a7-4376-8e17-8a3dfee64af7/messages
correlation: qa-215e3089-3280-470d-a022-510634a615ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-215e3089-3280-470d-a022-510634a615ea
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-215e3089-3280-470d-a022-510634a615ea
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

{"items":[{"id":"msg_7e3d1b67-e9f9-45ff-b699-b1e36815a5b1","conversationId":"cnv_54dd71d5-76a7-4376-8e17-8a3dfee64af7","sender":"qa-a1ab2d1c31ae","body":"Hi","createdAt":"2026-11-04T09:28:04.097362150Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_54dd71d5-76a7-4376-8e17-8a3dfee64af7/messages
correlation: qa-5363dbbc-634f-4b22-ba4d-a521bee4da47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5363dbbc-634f-4b22-ba4d-a521bee4da47
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5363dbbc-634f-4b22-ba4d-a521bee4da47
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

{"id":"msg_d5939556-5f7f-4361-88a7-915ec9c93b06","conversationId":"cnv_54dd71d5-76a7-4376-8e17-8a3dfee64af7","sender":"qa-59b5945c3c9d","body":"Reply","createdAt":"2026-11-04T09:28:04.137946067Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_54dd71d5-76a7-4376-8e17-8a3dfee64af7/read
correlation: qa-db9a1e47-fbd4-4599-9b96-08e83ec06b2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db9a1e47-fbd4-4599-9b96-08e83ec06b2f
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-db9a1e47-fbd4-4599-9b96-08e83ec06b2f
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

{"conversationId":"cnv_54dd71d5-76a7-4376-8e17-8a3dfee64af7","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_54dd71d5-76a7-4376-8e17-8a3dfee64af7/close
correlation: qa-75a4d22f-c843-4b23-bbf5-3332b130098a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75a4d22f-c843-4b23-bbf5-3332b130098a
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-75a4d22f-c843-4b23-bbf5-3332b130098a
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

{"id":"cnv_54dd71d5-76a7-4376-8e17-8a3dfee64af7","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-a1ab2d1c31ae","qa-59b5945c3c9d"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-04T09:28:04.097358755Z","closedAt":"2026-11-04T09:28:04.161974177Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-4e03a810-9454-4352-81cd-95a796b18073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e03a810-9454-4352-81cd-95a796b18073
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e03a810-9454-4352-81cd-95a796b18073
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

{"balance":4,"currency":"credits","accountId":"acc_d1754652-73ef-4253-a6ab-a7f391f3a1d4"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-bdf577ec-3a35-420e-bfd8-143b142943f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdf577ec-3a35-420e-bfd8-143b142943f5
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdf577ec-3a35-420e-bfd8-143b142943f5
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

{"items":[{"id":"led_326e73af-1c6d-4eda-965b-d129e746f0fd","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-04T09:28:03.998758675Z"},{"id":"led_62d86e7e-2946-4bf3-8fc3-6ddc3f0e1fed","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_54dd71d5-76a7-4376-8e17-8a3dfee64af7","createdAt":"2026-11-04T09:28:04.097354218Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2752b155-5681-499b-b7ab-b287064fc557

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2a5b55e3ba184d3ba9f0029eb2b2f09a
X-Correlation-Id: qa-2752b155-5681-499b-b7ab-b287064fc557
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2752b155-5681-499b-b7ab-b287064fc557
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
Location: /v1/credits/purchases/pur_7830ce3b-4058-40bc-8b9d-5da958d88e9c
Content-Length: 144

{"id":"pur_7830ce3b-4058-40bc-8b9d-5da958d88e9c","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-04T09:28:04.175406331Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-78cae9f9-f428-4d4f-a5b4-a29d0444fa38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78cae9f9-f428-4d4f-a5b4-a29d0444fa38
Content-Type: application/json

--- response: 403 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78cae9f9-f428-4d4f-a5b4-a29d0444fa38
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-78cae9f9-f428-4d4f-a5b4-a29d0444fa38"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7164d0e5-d836-4b3e-84b3-99844a2a214e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7164d0e5-d836-4b3e-84b3-99844a2a214e
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7164d0e5-d836-4b3e-84b3-99844a2a214e
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
correlation: qa-4c4296b0-f9c9-4152-951c-595e93474ead

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c4296b0-f9c9-4152-951c-595e93474ead
Content-Type: application/json

--- request body ---
{"handle":"qa-59b5945c3c9d","password":"****"}

--- response: 401 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c4296b0-f9c9-4152-951c-595e93474ead
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4c4296b0-f9c9-4152-951c-595e93474ead"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f26efad-7053-4a58-9921-e117acd86ecb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f26efad-7053-4a58-9921-e117acd86ecb
Content-Type: application/json

--- response: 204 in 1 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3f26efad-7053-4a58-9921-e117acd86ecb
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
correlation: qa-e26ac7db-3cc7-4384-bd7b-c6ef067b4ccf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e26ac7db-3cc7-4384-bd7b-c6ef067b4ccf
Content-Type: application/json

--- request body ---
{"handle":"qa-a1ab2d1c31ae","password":"****"}

--- response: 401 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e26ac7db-3cc7-4384-bd7b-c6ef067b4ccf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e26ac7db-3cc7-4384-bd7b-c6ef067b4ccf"}
```
