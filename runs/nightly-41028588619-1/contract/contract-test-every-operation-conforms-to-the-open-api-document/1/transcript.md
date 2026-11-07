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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-a8f2312f-9c9c-4c93-8dfa-2d77f884f084` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-6ea54526-0215-4276-9bb6-54ecec9eef7a` |
| 3 | `GET /health` | 200 | 8 | `qa-845a5ef0-0431-494f-a803-9aab716bdc9a` |
| 4 | `POST /v1/auth/token` | 200 | 12 | `qa-eebaf19d-54d5-40b6-9c43-fbd32ec81557` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-fcb515f0-e2b4-46ea-a12c-777baad6e429` |
| 6 | `PATCH /v1/accounts/me` | 200 | 8 | `qa-e552de4a-54c2-4398-a459-92292a766fbe` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 5 | `qa-3a43861d-0130-4af1-9153-b4ca7f977973` |
| 8 | `POST /v1/conversations` | 201 | 8 | `qa-a929d167-88a6-4e53-988a-8c9dbe6a9486` |
| 9 | `GET /v1/conversations` | 200 | 7 | `qa-3065eecd-c7c7-4297-9f7d-665aee5e441f` |
| 10 | `POST /v1/auth/token` | 200 | 11 | `qa-df7e0074-7362-4622-9c6a-93e9308599ec` |
| 11 | `GET /v1/conversations/{id}` | 200 | 9 | `qa-74e1b248-a80e-45b5-b39e-0e7cb03b7cc4` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 16 | `qa-e882cf77-3915-46b2-b23b-d6ed97ff4bba` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-4a28deab-0bab-4dc9-ba33-5e8d5e46d0e7` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 8 | `qa-164029ff-c22b-4932-8d60-6ffa68f3d1da` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-6f9515f9-3a95-4efa-ab1e-bb8ca19b8f98` |
| 16 | `GET /v1/credits/balance` | 200 | 4 | `qa-628d2cd1-c2ce-47a6-9091-5215dd6b06d8` |
| 17 | `GET /v1/credits/ledger` | 200 | 4 | `qa-a7a61acf-91a3-4a4b-97b8-b495320ffc3b` |
| 18 | `POST /v1/credits/purchases` | 201 | 4 | `qa-f321617e-c9e8-4ea2-b299-ce9a6516dd79` |
| 19 | `GET /v1/admin/stats` | 403 | 4 | `qa-fd2b20db-ae4e-4d3a-b588-9a8ed2b9d90a` |
| 20 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-716be77a-024d-40d0-988b-760cf73ef4c0` |
| 21 | `POST /v1/auth/token` | 401 | 3 | `qa-99b52ee9-a5ba-4ff8-839d-9d88f7476cf6` |
| 22 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-0e9ea0be-9edc-478b-a183-05f365c9cc47` |
| 23 | `POST /v1/auth/token` | 401 | 4 | `qa-37a51774-68d0-433f-a4f0-8a8d45a50063` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a8f2312f-9c9c-4c93-8dfa-2d77f884f084

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8f2312f-9c9c-4c93-8dfa-2d77f884f084
Content-Type: application/json

--- request body ---
{"handle":"qa-179fcd2ab6e0","displayName":"QA 179fcd2ab6e0","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8f2312f-9c9c-4c93-8dfa-2d77f884f084
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 5
Location: /v1/accounts/qa-179fcd2ab6e0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f94ab830-edb0-4937-9e3a-3bfcc3d18adb","handle":"qa-179fcd2ab6e0","displayName":"QA 179fcd2ab6e0","region":"eu","role":"user","createdAt":"2026-10-30T08:46:06.538100370Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6ea54526-0215-4276-9bb6-54ecec9eef7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ea54526-0215-4276-9bb6-54ecec9eef7a
Content-Type: application/json

--- request body ---
{"handle":"qa-deaf6b0e4b7b","displayName":"QA deaf6b0e4b7b","password":"****","region":"us"}

--- response: 201 in 31 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ea54526-0215-4276-9bb6-54ecec9eef7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 5
Location: /v1/accounts/qa-deaf6b0e4b7b
X-Served-Region: us
Content-Length: 181

{"id":"acc_229b14d8-f32c-406a-95d4-44a19037606d","handle":"qa-deaf6b0e4b7b","displayName":"QA deaf6b0e4b7b","region":"us","role":"user","createdAt":"2026-10-30T08:46:06.575079939Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-845a5ef0-0431-494f-a803-9aab716bdc9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-845a5ef0-0431-494f-a803-9aab716bdc9a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-845a5ef0-0431-494f-a803-9aab716bdc9a
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
correlation: qa-eebaf19d-54d5-40b6-9c43-fbd32ec81557

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eebaf19d-54d5-40b6-9c43-fbd32ec81557
Content-Type: application/json

--- request body ---
{"handle":"qa-179fcd2ab6e0","password":"****"}

--- response: 200 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-eebaf19d-54d5-40b6-9c43-fbd32ec81557
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f94ab830-edb0-4937-9e3a-3bfcc3d18adb"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-fcb515f0-e2b4-46ea-a12c-777baad6e429

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcb515f0-e2b4-46ea-a12c-777baad6e429
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcb515f0-e2b4-46ea-a12c-777baad6e429
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

{"id":"acc_f94ab830-edb0-4937-9e3a-3bfcc3d18adb","handle":"qa-179fcd2ab6e0","displayName":"QA 179fcd2ab6e0","region":"eu","role":"user","createdAt":"2026-10-30T08:46:06.538100370Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-e552de4a-54c2-4398-a459-92292a766fbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e552de4a-54c2-4398-a459-92292a766fbe
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-e552de4a-54c2-4398-a459-92292a766fbe
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

{"id":"acc_f94ab830-edb0-4937-9e3a-3bfcc3d18adb","handle":"qa-179fcd2ab6e0","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-10-30T08:46:06.538100370Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-deaf6b0e4b7b
correlation: qa-3a43861d-0130-4af1-9153-b4ca7f977973

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a43861d-0130-4af1-9153-b4ca7f977973
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a43861d-0130-4af1-9153-b4ca7f977973
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

{"handle":"qa-deaf6b0e4b7b","displayName":"QA deaf6b0e4b7b","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-a929d167-88a6-4e53-988a-8c9dbe6a9486

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a929d167-88a6-4e53-988a-8c9dbe6a9486
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-deaf6b0e4b7b","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a929d167-88a6-4e53-988a-8c9dbe6a9486
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
Location: /v1/conversations/cnv_6b03d9ee-c40e-4a2d-90d4-66cbbab178e0
X-Data-Region: us
Content-Length: 238

{"id":"cnv_6b03d9ee-c40e-4a2d-90d4-66cbbab178e0","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-179fcd2ab6e0","qa-deaf6b0e4b7b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:06.681292471Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-3065eecd-c7c7-4297-9f7d-665aee5e441f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3065eecd-c7c7-4297-9f7d-665aee5e441f
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3065eecd-c7c7-4297-9f7d-665aee5e441f
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

{"items":[{"id":"cnv_6b03d9ee-c40e-4a2d-90d4-66cbbab178e0","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-179fcd2ab6e0","qa-deaf6b0e4b7b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:06.681292471Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-df7e0074-7362-4622-9c6a-93e9308599ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df7e0074-7362-4622-9c6a-93e9308599ec
Content-Type: application/json

--- request body ---
{"handle":"qa-deaf6b0e4b7b","password":"****"}

--- response: 200 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-df7e0074-7362-4622-9c6a-93e9308599ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_229b14d8-f32c-406a-95d4-44a19037606d"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_6b03d9ee-c40e-4a2d-90d4-66cbbab178e0
correlation: qa-74e1b248-a80e-45b5-b39e-0e7cb03b7cc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74e1b248-a80e-45b5-b39e-0e7cb03b7cc4
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-74e1b248-a80e-45b5-b39e-0e7cb03b7cc4
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

{"id":"cnv_6b03d9ee-c40e-4a2d-90d4-66cbbab178e0","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-179fcd2ab6e0","qa-deaf6b0e4b7b"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-30T08:46:06.681292471Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_6b03d9ee-c40e-4a2d-90d4-66cbbab178e0/messages
correlation: qa-e882cf77-3915-46b2-b23b-d6ed97ff4bba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e882cf77-3915-46b2-b23b-d6ed97ff4bba
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-e882cf77-3915-46b2-b23b-d6ed97ff4bba
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

{"items":[{"id":"msg_7ddf461e-3050-4251-9f0a-baa01b8a67d1","conversationId":"cnv_6b03d9ee-c40e-4a2d-90d4-66cbbab178e0","sender":"qa-179fcd2ab6e0","body":"Hi","createdAt":"2026-10-30T08:46:06.681297236Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_6b03d9ee-c40e-4a2d-90d4-66cbbab178e0/messages
correlation: qa-4a28deab-0bab-4dc9-ba33-5e8d5e46d0e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a28deab-0bab-4dc9-ba33-5e8d5e46d0e7
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a28deab-0bab-4dc9-ba33-5e8d5e46d0e7
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

{"id":"msg_26be695e-a7ca-49c8-acde-ee9169941620","conversationId":"cnv_6b03d9ee-c40e-4a2d-90d4-66cbbab178e0","sender":"qa-deaf6b0e4b7b","body":"Reply","createdAt":"2026-10-30T08:46:06.780883020Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_6b03d9ee-c40e-4a2d-90d4-66cbbab178e0/read
correlation: qa-164029ff-c22b-4932-8d60-6ffa68f3d1da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-164029ff-c22b-4932-8d60-6ffa68f3d1da
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-164029ff-c22b-4932-8d60-6ffa68f3d1da
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

{"conversationId":"cnv_6b03d9ee-c40e-4a2d-90d4-66cbbab178e0","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_6b03d9ee-c40e-4a2d-90d4-66cbbab178e0/close
correlation: qa-6f9515f9-3a95-4efa-ab1e-bb8ca19b8f98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f9515f9-3a95-4efa-ab1e-bb8ca19b8f98
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f9515f9-3a95-4efa-ab1e-bb8ca19b8f98
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

{"id":"cnv_6b03d9ee-c40e-4a2d-90d4-66cbbab178e0","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-179fcd2ab6e0","qa-deaf6b0e4b7b"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-30T08:46:06.681292471Z","closedAt":"2026-10-30T08:46:06.809569491Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-628d2cd1-c2ce-47a6-9091-5215dd6b06d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-628d2cd1-c2ce-47a6-9091-5215dd6b06d8
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-628d2cd1-c2ce-47a6-9091-5215dd6b06d8
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

{"balance":4,"currency":"credits","accountId":"acc_f94ab830-edb0-4937-9e3a-3bfcc3d18adb"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-a7a61acf-91a3-4a4b-97b8-b495320ffc3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7a61acf-91a3-4a4b-97b8-b495320ffc3b
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7a61acf-91a3-4a4b-97b8-b495320ffc3b
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

{"items":[{"id":"led_602a72fa-7c5f-4b56-b5c0-138ac065f238","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-30T08:46:06.538114291Z"},{"id":"led_6ce777ea-fd4c-495a-82c0-87c3f4b8bd95","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_6b03d9ee-c40e-4a2d-90d4-66cbbab178e0","createdAt":"2026-10-30T08:46:06.681283927Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f321617e-c9e8-4ea2-b299-ce9a6516dd79

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f8fb8ecdc14740a68bcc216d739a8bc7
X-Correlation-Id: qa-f321617e-c9e8-4ea2-b299-ce9a6516dd79
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-f321617e-c9e8-4ea2-b299-ce9a6516dd79
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
Location: /v1/credits/purchases/pur_3fedd4d6-c0d0-4f47-b371-a09907eb57df
Content-Length: 144

{"id":"pur_3fedd4d6-c0d0-4f47-b371-a09907eb57df","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-10-30T08:46:06.835898769Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-fd2b20db-ae4e-4d3a-b588-9a8ed2b9d90a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd2b20db-ae4e-4d3a-b588-9a8ed2b9d90a
Content-Type: application/json

--- response: 403 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd2b20db-ae4e-4d3a-b588-9a8ed2b9d90a
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-fd2b20db-ae4e-4d3a-b588-9a8ed2b9d90a"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-716be77a-024d-40d0-988b-760cf73ef4c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-716be77a-024d-40d0-988b-760cf73ef4c0
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-716be77a-024d-40d0-988b-760cf73ef4c0
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
correlation: qa-99b52ee9-a5ba-4ff8-839d-9d88f7476cf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99b52ee9-a5ba-4ff8-839d-9d88f7476cf6
Content-Type: application/json

--- request body ---
{"handle":"qa-deaf6b0e4b7b","password":"****"}

--- response: 401 in 3 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99b52ee9-a5ba-4ff8-839d-9d88f7476cf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-99b52ee9-a5ba-4ff8-839d-9d88f7476cf6"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0e9ea0be-9edc-478b-a183-05f365c9cc47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e9ea0be-9edc-478b-a183-05f365c9cc47
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0e9ea0be-9edc-478b-a183-05f365c9cc47
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
correlation: qa-37a51774-68d0-433f-a4f0-8a8d45a50063

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37a51774-68d0-433f-a4f0-8a8d45a50063
Content-Type: application/json

--- request body ---
{"handle":"qa-179fcd2ab6e0","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37a51774-68d0-433f-a4f0-8a8d45a50063
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-37a51774-68d0-433f-a4f0-8a8d45a50063"}
```
