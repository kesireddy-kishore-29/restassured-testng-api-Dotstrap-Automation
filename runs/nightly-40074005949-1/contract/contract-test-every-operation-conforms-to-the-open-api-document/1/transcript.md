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
| 1 | `POST /v1/accounts` | 201 | 372 | `qa-f2392b91-3d4a-4839-897a-1d6e1bca284e` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-ebaf6e68-eaa6-40c8-81df-567d3379b765` |
| 3 | `GET /health` | 200 | 24 | `qa-ee647f8b-9606-4678-b1ba-d477b970bb24` |
| 4 | `POST /v1/auth/token` | 200 | 18 | `qa-706fe118-aeeb-4fac-8903-e06bde92f748` |
| 5 | `GET /v1/accounts/me` | 200 | 6 | `qa-06cbb7dd-ea6d-495c-bd3f-9f58eb6ba084` |
| 6 | `PATCH /v1/accounts/me` | 200 | 8 | `qa-4aef683e-ab75-42bf-805b-3c74f9d74bf2` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 9 | `qa-5e4419ae-0d59-4bb0-8c64-2be764dadc5b` |
| 8 | `POST /v1/conversations` | 201 | 15 | `qa-f18daaa1-9ff8-44e4-9cc0-c968db741735` |
| 9 | `GET /v1/conversations` | 200 | 17 | `qa-43e2c42d-15ed-4847-a9a4-40078f5752d7` |
| 10 | `POST /v1/auth/token` | 200 | 17 | `qa-83dc1d13-cad3-4e72-bb0c-332fd68a877d` |
| 11 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-fab5a461-5057-4e9d-af0b-a58b144bcd3c` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-febbb836-0046-4da8-b312-54932a5e89cf` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-0eaa1149-e938-405e-b3e4-b9976d54c353` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 42 | `qa-c5812851-f866-48f8-8217-2a795910a0bd` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 5 | `qa-3b5af8fa-c56a-437a-8ba7-7327266b3bbb` |
| 16 | `GET /v1/credits/balance` | 200 | 7 | `qa-c5172e59-7da5-4b06-aa00-eb8b32c95399` |
| 17 | `GET /v1/credits/ledger` | 200 | 13 | `qa-56d0c5d5-374b-4433-9466-8066336b2623` |
| 18 | `POST /v1/credits/purchases` | 201 | 3 | `qa-633c930a-343c-4d21-8cd5-165b94646a4f` |
| 19 | `GET /v1/admin/stats` | 403 | 7 | `qa-00433ff9-d9a0-4297-8772-3f490b6b9b87` |
| 20 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-1e2a4d02-8a2a-4919-80b9-33c3514499fb` |
| 21 | `POST /v1/auth/token` | 401 | 6 | `qa-b04c6754-7113-44ab-80d6-87e640a7e98e` |
| 22 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-53ec9fcd-8d34-4614-ba02-5602d05f716f` |
| 23 | `POST /v1/auth/token` | 401 | 6 | `qa-a7446e0a-2e7e-4b0a-82fb-30f38d21af2a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f2392b91-3d4a-4839-897a-1d6e1bca284e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2392b91-3d4a-4839-897a-1d6e1bca284e
Content-Type: application/json

--- request body ---
{"handle":"qa-8dc5fd2aa2d9","displayName":"QA 8dc5fd2aa2d9","password":"****","region":"eu"}

--- response: 201 in 372 ms ---
Date: Sat, 24 Oct 2026 07:25:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2392b91-3d4a-4839-897a-1d6e1bca284e
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
Location: /v1/accounts/qa-8dc5fd2aa2d9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_54947660-1fa4-43f3-bea0-9a34032f6d10","handle":"qa-8dc5fd2aa2d9","displayName":"QA 8dc5fd2aa2d9","region":"eu","role":"user","createdAt":"2026-10-24T07:25:00.975497326Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ebaf6e68-eaa6-40c8-81df-567d3379b765

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebaf6e68-eaa6-40c8-81df-567d3379b765
Content-Type: application/json

--- request body ---
{"handle":"qa-7da42c2f3361","displayName":"QA 7da42c2f3361","password":"****","region":"us"}

--- response: 201 in 31 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebaf6e68-eaa6-40c8-81df-567d3379b765
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-7da42c2f3361
X-Served-Region: us
Content-Length: 181

{"id":"acc_99b90607-f2d6-47af-ab59-ee0863ace595","handle":"qa-7da42c2f3361","displayName":"QA 7da42c2f3361","region":"us","role":"user","createdAt":"2026-10-24T07:25:01.267295766Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-ee647f8b-9606-4678-b1ba-d477b970bb24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee647f8b-9606-4678-b1ba-d477b970bb24
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee647f8b-9606-4678-b1ba-d477b970bb24
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
correlation: qa-706fe118-aeeb-4fac-8903-e06bde92f748

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-706fe118-aeeb-4fac-8903-e06bde92f748
Content-Type: application/json

--- request body ---
{"handle":"qa-8dc5fd2aa2d9","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-706fe118-aeeb-4fac-8903-e06bde92f748
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54947660-1fa4-43f3-bea0-9a34032f6d10"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-06cbb7dd-ea6d-495c-bd3f-9f58eb6ba084

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06cbb7dd-ea6d-495c-bd3f-9f58eb6ba084
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-06cbb7dd-ea6d-495c-bd3f-9f58eb6ba084
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

{"id":"acc_54947660-1fa4-43f3-bea0-9a34032f6d10","handle":"qa-8dc5fd2aa2d9","displayName":"QA 8dc5fd2aa2d9","region":"eu","role":"user","createdAt":"2026-10-24T07:25:00.975497326Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-4aef683e-ab75-42bf-805b-3c74f9d74bf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aef683e-ab75-42bf-805b-3c74f9d74bf2
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-4aef683e-ab75-42bf-805b-3c74f9d74bf2
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

{"id":"acc_54947660-1fa4-43f3-bea0-9a34032f6d10","handle":"qa-8dc5fd2aa2d9","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-10-24T07:25:00.975497326Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-7da42c2f3361
correlation: qa-5e4419ae-0d59-4bb0-8c64-2be764dadc5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e4419ae-0d59-4bb0-8c64-2be764dadc5b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e4419ae-0d59-4bb0-8c64-2be764dadc5b
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

{"handle":"qa-7da42c2f3361","displayName":"QA 7da42c2f3361","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-f18daaa1-9ff8-44e4-9cc0-c968db741735

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f18daaa1-9ff8-44e4-9cc0-c968db741735
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7da42c2f3361","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f18daaa1-9ff8-44e4-9cc0-c968db741735
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
Location: /v1/conversations/cnv_887f044f-f81a-4864-964e-c31bc7b7d396
X-Data-Region: us
Content-Length: 238

{"id":"cnv_887f044f-f81a-4864-964e-c31bc7b7d396","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-8dc5fd2aa2d9","qa-7da42c2f3361"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:01.487241945Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-43e2c42d-15ed-4847-a9a4-40078f5752d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43e2c42d-15ed-4847-a9a4-40078f5752d7
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-43e2c42d-15ed-4847-a9a4-40078f5752d7
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

{"items":[{"id":"cnv_887f044f-f81a-4864-964e-c31bc7b7d396","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-8dc5fd2aa2d9","qa-7da42c2f3361"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:01.487241945Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-83dc1d13-cad3-4e72-bb0c-332fd68a877d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83dc1d13-cad3-4e72-bb0c-332fd68a877d
Content-Type: application/json

--- request body ---
{"handle":"qa-7da42c2f3361","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-83dc1d13-cad3-4e72-bb0c-332fd68a877d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_99b90607-f2d6-47af-ab59-ee0863ace595"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_887f044f-f81a-4864-964e-c31bc7b7d396
correlation: qa-fab5a461-5057-4e9d-af0b-a58b144bcd3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fab5a461-5057-4e9d-af0b-a58b144bcd3c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-fab5a461-5057-4e9d-af0b-a58b144bcd3c
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

{"id":"cnv_887f044f-f81a-4864-964e-c31bc7b7d396","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-8dc5fd2aa2d9","qa-7da42c2f3361"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-24T07:25:01.487241945Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_887f044f-f81a-4864-964e-c31bc7b7d396/messages
correlation: qa-febbb836-0046-4da8-b312-54932a5e89cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-febbb836-0046-4da8-b312-54932a5e89cf
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-febbb836-0046-4da8-b312-54932a5e89cf
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

{"items":[{"id":"msg_d3d744fe-c583-43f0-b92a-9fd143b9e2f3","conversationId":"cnv_887f044f-f81a-4864-964e-c31bc7b7d396","sender":"qa-8dc5fd2aa2d9","body":"Hi","createdAt":"2026-10-24T07:25:01.487262835Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_887f044f-f81a-4864-964e-c31bc7b7d396/messages
correlation: qa-0eaa1149-e938-405e-b3e4-b9976d54c353

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0eaa1149-e938-405e-b3e4-b9976d54c353
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0eaa1149-e938-405e-b3e4-b9976d54c353
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

{"id":"msg_07e05d27-9a4d-4086-aa91-96018715285c","conversationId":"cnv_887f044f-f81a-4864-964e-c31bc7b7d396","sender":"qa-7da42c2f3361","body":"Reply","createdAt":"2026-10-24T07:25:01.580456963Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_887f044f-f81a-4864-964e-c31bc7b7d396/read
correlation: qa-c5812851-f866-48f8-8217-2a795910a0bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5812851-f866-48f8-8217-2a795910a0bd
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5812851-f866-48f8-8217-2a795910a0bd
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

{"conversationId":"cnv_887f044f-f81a-4864-964e-c31bc7b7d396","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_887f044f-f81a-4864-964e-c31bc7b7d396/close
correlation: qa-3b5af8fa-c56a-437a-8ba7-7327266b3bbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b5af8fa-c56a-437a-8ba7-7327266b3bbb
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b5af8fa-c56a-437a-8ba7-7327266b3bbb
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

{"id":"cnv_887f044f-f81a-4864-964e-c31bc7b7d396","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-8dc5fd2aa2d9","qa-7da42c2f3361"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-24T07:25:01.487241945Z","closedAt":"2026-10-24T07:25:01.645182695Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-c5172e59-7da5-4b06-aa00-eb8b32c95399

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5172e59-7da5-4b06-aa00-eb8b32c95399
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5172e59-7da5-4b06-aa00-eb8b32c95399
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

{"balance":4,"currency":"credits","accountId":"acc_54947660-1fa4-43f3-bea0-9a34032f6d10"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-56d0c5d5-374b-4433-9466-8066336b2623

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56d0c5d5-374b-4433-9466-8066336b2623
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-56d0c5d5-374b-4433-9466-8066336b2623
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

{"items":[{"id":"led_31383443-4631-41d1-a510-35a2a982a008","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-24T07:25:00.975513178Z"},{"id":"led_544f683d-02f5-4065-b1b2-0ef67c2231b1","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_887f044f-f81a-4864-964e-c31bc7b7d396","createdAt":"2026-10-24T07:25:01.487211723Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-633c930a-343c-4d21-8cd5-165b94646a4f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-50012a0d947243fda7413edf1d7c8fb3
X-Correlation-Id: qa-633c930a-343c-4d21-8cd5-165b94646a4f
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-633c930a-343c-4d21-8cd5-165b94646a4f
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
Location: /v1/credits/purchases/pur_fec09b83-1a99-4711-a171-84a87c763110
Content-Length: 144

{"id":"pur_fec09b83-1a99-4711-a171-84a87c763110","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-10-24T07:25:01.700498501Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-00433ff9-d9a0-4297-8772-3f490b6b9b87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00433ff9-d9a0-4297-8772-3f490b6b9b87
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00433ff9-d9a0-4297-8772-3f490b6b9b87
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-00433ff9-d9a0-4297-8772-3f490b6b9b87"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1e2a4d02-8a2a-4919-80b9-33c3514499fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e2a4d02-8a2a-4919-80b9-33c3514499fb
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1e2a4d02-8a2a-4919-80b9-33c3514499fb
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
correlation: qa-b04c6754-7113-44ab-80d6-87e640a7e98e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b04c6754-7113-44ab-80d6-87e640a7e98e
Content-Type: application/json

--- request body ---
{"handle":"qa-7da42c2f3361","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b04c6754-7113-44ab-80d6-87e640a7e98e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b04c6754-7113-44ab-80d6-87e640a7e98e"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-53ec9fcd-8d34-4614-ba02-5602d05f716f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53ec9fcd-8d34-4614-ba02-5602d05f716f
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-53ec9fcd-8d34-4614-ba02-5602d05f716f
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
correlation: qa-a7446e0a-2e7e-4b0a-82fb-30f38d21af2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7446e0a-2e7e-4b0a-82fb-30f38d21af2a
Content-Type: application/json

--- request body ---
{"handle":"qa-8dc5fd2aa2d9","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7446e0a-2e7e-4b0a-82fb-30f38d21af2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a7446e0a-2e7e-4b0a-82fb-30f38d21af2a"}
```
