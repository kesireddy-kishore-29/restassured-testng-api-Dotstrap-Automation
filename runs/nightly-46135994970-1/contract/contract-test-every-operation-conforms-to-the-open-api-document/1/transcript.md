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
| 1 | `POST /v1/accounts` | 201 | 413 | `qa-f5b2ce0d-d26b-4142-a1f1-6723df02d35e` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-89eccd88-052d-477d-a3ec-80395fd85a62` |
| 3 | `GET /health` | 200 | 62 | `qa-c203e7dc-96de-4980-8ff5-fa31fee26c6c` |
| 4 | `POST /v1/auth/token` | 200 | 26 | `qa-712fbc21-1160-478b-967f-92f699548f35` |
| 5 | `GET /v1/accounts/me` | 200 | 43 | `qa-284ade2d-49ca-4835-94b5-285bb17a42d6` |
| 6 | `PATCH /v1/accounts/me` | 200 | 25 | `qa-15ab9352-4561-4099-a2d2-3aa0019d3927` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 19 | `qa-76da8f10-2a0f-4452-8032-cc114bf0cd5b` |
| 8 | `POST /v1/conversations` | 201 | 25 | `qa-f0f1a1da-85dd-4c1a-9a7c-6150a3afb105` |
| 9 | `GET /v1/conversations` | 200 | 7 | `qa-02646be5-bf31-4d69-993f-7132c324c080` |
| 10 | `POST /v1/auth/token` | 200 | 29 | `qa-ab68a4cd-9d89-4530-b43c-066875cc394b` |
| 11 | `GET /v1/conversations/{id}` | 200 | 15 | `qa-139eb354-ef07-4af6-b1a7-488b59eafdab` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 9 | `qa-50fb0065-3753-4eac-828d-f8c5c461be36` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-76383f60-a622-4f82-8a87-a62be190020c` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 8 | `qa-d7c30655-6b9f-4587-8fb1-d534d5d1ffaf` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-170833a3-b71f-4d08-8302-0df77de2b871` |
| 16 | `GET /v1/credits/balance` | 200 | 10 | `qa-55c7fe69-7fa3-43a0-9e63-459bfd311a9a` |
| 17 | `GET /v1/credits/ledger` | 200 | 17 | `qa-7a85123d-a2b5-41b7-9e1d-21ee9ee154da` |
| 18 | `POST /v1/credits/purchases` | 201 | 11 | `qa-a9b3fa19-1f43-463c-b5e0-74b1505564cf` |
| 19 | `GET /v1/admin/stats` | 403 | 8 | `qa-ec7a1984-75ab-445f-8c3e-4e22123a49de` |
| 20 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-16cdeb9a-24a0-4552-9d64-2d758f1aab71` |
| 21 | `POST /v1/auth/token` | 401 | 7 | `qa-67902447-7d4c-4a51-bc5d-483e72789abf` |
| 22 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-567b1a81-bd73-4fbe-b8b3-f6871d12075f` |
| 23 | `POST /v1/auth/token` | 401 | 6 | `qa-c2e14789-b4e9-43c2-996f-2b5c5739d0ba` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f5b2ce0d-d26b-4142-a1f1-6723df02d35e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5b2ce0d-d26b-4142-a1f1-6723df02d35e
Content-Type: application/json

--- request body ---
{"handle":"qa-bf14324985d3","displayName":"QA bf14324985d3","password":"****","region":"eu"}

--- response: 201 in 413 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5b2ce0d-d26b-4142-a1f1-6723df02d35e
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
Location: /v1/accounts/qa-bf14324985d3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_521b14fe-147d-4575-a8cc-7f226c4e4d13","handle":"qa-bf14324985d3","displayName":"QA bf14324985d3","region":"eu","role":"user","createdAt":"2026-11-28T10:37:21.417443652Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-89eccd88-052d-477d-a3ec-80395fd85a62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89eccd88-052d-477d-a3ec-80395fd85a62
Content-Type: application/json

--- request body ---
{"handle":"qa-752feb48ce0c","displayName":"QA 752feb48ce0c","password":"****","region":"us"}

--- response: 201 in 27 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-89eccd88-052d-477d-a3ec-80395fd85a62
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
Location: /v1/accounts/qa-752feb48ce0c
X-Served-Region: us
Content-Length: 181

{"id":"acc_cb8c4b88-d14a-43b4-ad6f-c2f7ff770fd8","handle":"qa-752feb48ce0c","displayName":"QA 752feb48ce0c","region":"us","role":"user","createdAt":"2026-11-28T10:37:21.799700070Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-c203e7dc-96de-4980-8ff5-fa31fee26c6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c203e7dc-96de-4980-8ff5-fa31fee26c6c
Content-Type: application/json

--- response: 200 in 62 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-c203e7dc-96de-4980-8ff5-fa31fee26c6c
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
correlation: qa-712fbc21-1160-478b-967f-92f699548f35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-712fbc21-1160-478b-967f-92f699548f35
Content-Type: application/json

--- request body ---
{"handle":"qa-bf14324985d3","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-712fbc21-1160-478b-967f-92f699548f35
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_521b14fe-147d-4575-a8cc-7f226c4e4d13"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-284ade2d-49ca-4835-94b5-285bb17a42d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-284ade2d-49ca-4835-94b5-285bb17a42d6
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-284ade2d-49ca-4835-94b5-285bb17a42d6
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

{"id":"acc_521b14fe-147d-4575-a8cc-7f226c4e4d13","handle":"qa-bf14324985d3","displayName":"QA bf14324985d3","region":"eu","role":"user","createdAt":"2026-11-28T10:37:21.417443652Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-15ab9352-4561-4099-a2d2-3aa0019d3927

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15ab9352-4561-4099-a2d2-3aa0019d3927
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-15ab9352-4561-4099-a2d2-3aa0019d3927
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

{"id":"acc_521b14fe-147d-4575-a8cc-7f226c4e4d13","handle":"qa-bf14324985d3","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-28T10:37:21.417443652Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-752feb48ce0c
correlation: qa-76da8f10-2a0f-4452-8032-cc114bf0cd5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76da8f10-2a0f-4452-8032-cc114bf0cd5b
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-76da8f10-2a0f-4452-8032-cc114bf0cd5b
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

{"handle":"qa-752feb48ce0c","displayName":"QA 752feb48ce0c","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-f0f1a1da-85dd-4c1a-9a7c-6150a3afb105

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0f1a1da-85dd-4c1a-9a7c-6150a3afb105
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-752feb48ce0c","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0f1a1da-85dd-4c1a-9a7c-6150a3afb105
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
Location: /v1/conversations/cnv_4d33ab9c-db41-4839-99a2-bdfe1121eac6
X-Data-Region: us
Content-Length: 238

{"id":"cnv_4d33ab9c-db41-4839-99a2-bdfe1121eac6","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-bf14324985d3","qa-752feb48ce0c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.148283312Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-02646be5-bf31-4d69-993f-7132c324c080

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02646be5-bf31-4d69-993f-7132c324c080
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-02646be5-bf31-4d69-993f-7132c324c080
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

{"items":[{"id":"cnv_4d33ab9c-db41-4839-99a2-bdfe1121eac6","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-bf14324985d3","qa-752feb48ce0c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.148283312Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ab68a4cd-9d89-4530-b43c-066875cc394b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab68a4cd-9d89-4530-b43c-066875cc394b
Content-Type: application/json

--- request body ---
{"handle":"qa-752feb48ce0c","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab68a4cd-9d89-4530-b43c-066875cc394b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb8c4b88-d14a-43b4-ad6f-c2f7ff770fd8"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_4d33ab9c-db41-4839-99a2-bdfe1121eac6
correlation: qa-139eb354-ef07-4af6-b1a7-488b59eafdab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-139eb354-ef07-4af6-b1a7-488b59eafdab
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-139eb354-ef07-4af6-b1a7-488b59eafdab
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

{"id":"cnv_4d33ab9c-db41-4839-99a2-bdfe1121eac6","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-bf14324985d3","qa-752feb48ce0c"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-28T10:37:22.148283312Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_4d33ab9c-db41-4839-99a2-bdfe1121eac6/messages
correlation: qa-50fb0065-3753-4eac-828d-f8c5c461be36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50fb0065-3753-4eac-828d-f8c5c461be36
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-50fb0065-3753-4eac-828d-f8c5c461be36
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

{"items":[{"id":"msg_ce882086-12db-4256-bed3-9c75dd5c3ba8","conversationId":"cnv_4d33ab9c-db41-4839-99a2-bdfe1121eac6","sender":"qa-bf14324985d3","body":"Hi","createdAt":"2026-11-28T10:37:22.148314381Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_4d33ab9c-db41-4839-99a2-bdfe1121eac6/messages
correlation: qa-76383f60-a622-4f82-8a87-a62be190020c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76383f60-a622-4f82-8a87-a62be190020c
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-76383f60-a622-4f82-8a87-a62be190020c
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

{"id":"msg_9f2387dc-5ce4-4967-8cdf-cd86a033ce40","conversationId":"cnv_4d33ab9c-db41-4839-99a2-bdfe1121eac6","sender":"qa-752feb48ce0c","body":"Reply","createdAt":"2026-11-28T10:37:22.298653817Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_4d33ab9c-db41-4839-99a2-bdfe1121eac6/read
correlation: qa-d7c30655-6b9f-4587-8fb1-d534d5d1ffaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7c30655-6b9f-4587-8fb1-d534d5d1ffaf
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7c30655-6b9f-4587-8fb1-d534d5d1ffaf
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

{"conversationId":"cnv_4d33ab9c-db41-4839-99a2-bdfe1121eac6","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_4d33ab9c-db41-4839-99a2-bdfe1121eac6/close
correlation: qa-170833a3-b71f-4d08-8302-0df77de2b871

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-170833a3-b71f-4d08-8302-0df77de2b871
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-170833a3-b71f-4d08-8302-0df77de2b871
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

{"id":"cnv_4d33ab9c-db41-4839-99a2-bdfe1121eac6","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-bf14324985d3","qa-752feb48ce0c"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.148283312Z","closedAt":"2026-11-28T10:37:22.329684516Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-55c7fe69-7fa3-43a0-9e63-459bfd311a9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55c7fe69-7fa3-43a0-9e63-459bfd311a9a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-55c7fe69-7fa3-43a0-9e63-459bfd311a9a
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

{"balance":4,"currency":"credits","accountId":"acc_521b14fe-147d-4575-a8cc-7f226c4e4d13"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-7a85123d-a2b5-41b7-9e1d-21ee9ee154da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a85123d-a2b5-41b7-9e1d-21ee9ee154da
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a85123d-a2b5-41b7-9e1d-21ee9ee154da
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

{"items":[{"id":"led_1f3fd663-0171-4829-a7a3-a1cc9e0fa250","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-28T10:37:21.417459091Z"},{"id":"led_4050ec13-aab0-4147-bc2d-a2b80dd0f8b7","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_4d33ab9c-db41-4839-99a2-bdfe1121eac6","createdAt":"2026-11-28T10:37:22.148267122Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a9b3fa19-1f43-463c-b5e0-74b1505564cf

--- request headers ---
Accept: application/json
Idempotency-Key: qa-696cbbc903ec4b0b805b3371ed902852
X-Correlation-Id: qa-a9b3fa19-1f43-463c-b5e0-74b1505564cf
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9b3fa19-1f43-463c-b5e0-74b1505564cf
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
Location: /v1/credits/purchases/pur_e68cc7dd-3aaf-496e-9944-e55e96e053a9
Content-Length: 144

{"id":"pur_e68cc7dd-3aaf-496e-9944-e55e96e053a9","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-28T10:37:22.400107107Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-ec7a1984-75ab-445f-8c3e-4e22123a49de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec7a1984-75ab-445f-8c3e-4e22123a49de
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec7a1984-75ab-445f-8c3e-4e22123a49de
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-ec7a1984-75ab-445f-8c3e-4e22123a49de"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-16cdeb9a-24a0-4552-9d64-2d758f1aab71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16cdeb9a-24a0-4552-9d64-2d758f1aab71
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-16cdeb9a-24a0-4552-9d64-2d758f1aab71
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
correlation: qa-67902447-7d4c-4a51-bc5d-483e72789abf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67902447-7d4c-4a51-bc5d-483e72789abf
Content-Type: application/json

--- request body ---
{"handle":"qa-752feb48ce0c","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67902447-7d4c-4a51-bc5d-483e72789abf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67902447-7d4c-4a51-bc5d-483e72789abf"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-567b1a81-bd73-4fbe-b8b3-f6871d12075f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-567b1a81-bd73-4fbe-b8b3-f6871d12075f
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-567b1a81-bd73-4fbe-b8b3-f6871d12075f
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
correlation: qa-c2e14789-b4e9-43c2-996f-2b5c5739d0ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2e14789-b4e9-43c2-996f-2b5c5739d0ba
Content-Type: application/json

--- request body ---
{"handle":"qa-bf14324985d3","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2e14789-b4e9-43c2-996f-2b5c5739d0ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c2e14789-b4e9-43c2-996f-2b5c5739d0ba"}
```
