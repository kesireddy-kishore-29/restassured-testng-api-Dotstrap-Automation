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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-455d74da-5f0d-4878-86f9-3c16b5e8c8cf` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-b53b62f8-4108-40bc-892f-71d8558bee0d` |
| 3 | `GET /health` | 200 | 6 | `qa-5258d66a-2ce5-478d-8f5b-f77db60716e3` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-0f094b8c-0db7-4d76-961a-96c6dbab3ebe` |
| 5 | `GET /v1/accounts/me` | 200 | 9 | `qa-7887e3f3-c30a-4874-ac2a-180503b1f587` |
| 6 | `PATCH /v1/accounts/me` | 200 | 14 | `qa-3111e572-fe87-4b74-82c2-cf3edaefdbc4` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 9 | `qa-bdbb57bb-f1fc-469f-9ac0-eeefc2d674fe` |
| 8 | `POST /v1/conversations` | 201 | 3 | `qa-51bdcba5-404b-40a0-b5a6-0c4eeee1909d` |
| 9 | `GET /v1/conversations` | 200 | 7 | `qa-dc0f38a9-b2cc-4ab2-aa35-356617252334` |
| 10 | `POST /v1/auth/token` | 200 | 11 | `qa-13afcf75-4850-43cb-8d17-1e7180b89ee1` |
| 11 | `GET /v1/conversations/{id}` | 200 | 5 | `qa-c31c946b-3213-4248-a5d0-a8619f7b17aa` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 6 | `qa-c35870ac-137a-4e8c-b9ca-48c2137a091d` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 4 | `qa-e27162fa-3407-4597-98be-6c26a09b6f3a` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 7 | `qa-1a0c1bfe-c86b-440d-8db3-f636f61a19c8` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-cf1506a5-74da-4582-96fd-50b7396d6855` |
| 16 | `GET /v1/credits/balance` | 200 | 7 | `qa-c18cbded-766b-4def-82ce-a52487142e45` |
| 17 | `GET /v1/credits/ledger` | 200 | 4 | `qa-1de3743e-b4f6-4857-981f-5c59612cedbf` |
| 18 | `POST /v1/credits/purchases` | 201 | 4 | `qa-c20bf767-97e3-48e4-a23e-52325d4576fb` |
| 19 | `GET /v1/admin/stats` | 403 | 5 | `qa-fd97efeb-1ce6-40ce-a3bd-63411203722c` |
| 20 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-18175f9e-4801-490f-ae0d-db14940da5d0` |
| 21 | `POST /v1/auth/token` | 401 | 4 | `qa-85483748-9163-45d0-a4d8-881d2a18e80a` |
| 22 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-887abd78-bfcf-4f80-8687-8df163643818` |
| 23 | `POST /v1/auth/token` | 401 | 5 | `qa-40e4b11c-5f6f-4561-bfda-81343b4d5124` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-455d74da-5f0d-4878-86f9-3c16b5e8c8cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-455d74da-5f0d-4878-86f9-3c16b5e8c8cf
Content-Type: application/json

--- request body ---
{"handle":"qa-11b17e57ea47","displayName":"QA 11b17e57ea47","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-455d74da-5f0d-4878-86f9-3c16b5e8c8cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 6
Location: /v1/accounts/qa-11b17e57ea47
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0a731e30-7cdd-4ca4-b7ed-7eb5f87c958c","handle":"qa-11b17e57ea47","displayName":"QA 11b17e57ea47","region":"eu","role":"user","createdAt":"2026-10-29T08:39:02.227825569Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b53b62f8-4108-40bc-892f-71d8558bee0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b53b62f8-4108-40bc-892f-71d8558bee0d
Content-Type: application/json

--- request body ---
{"handle":"qa-5c97d73b5ebf","displayName":"QA 5c97d73b5ebf","password":"****","region":"us"}

--- response: 201 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b53b62f8-4108-40bc-892f-71d8558bee0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 6
Location: /v1/accounts/qa-5c97d73b5ebf
X-Served-Region: us
Content-Length: 181

{"id":"acc_1eccec62-1aef-49e5-80b6-fba3b0293249","handle":"qa-5c97d73b5ebf","displayName":"QA 5c97d73b5ebf","region":"us","role":"user","createdAt":"2026-10-29T08:39:02.260278985Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-5258d66a-2ce5-478d-8f5b-f77db60716e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5258d66a-2ce5-478d-8f5b-f77db60716e3
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-5258d66a-2ce5-478d-8f5b-f77db60716e3
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
correlation: qa-0f094b8c-0db7-4d76-961a-96c6dbab3ebe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f094b8c-0db7-4d76-961a-96c6dbab3ebe
Content-Type: application/json

--- request body ---
{"handle":"qa-11b17e57ea47","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f094b8c-0db7-4d76-961a-96c6dbab3ebe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0a731e30-7cdd-4ca4-b7ed-7eb5f87c958c"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-7887e3f3-c30a-4874-ac2a-180503b1f587

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7887e3f3-c30a-4874-ac2a-180503b1f587
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7887e3f3-c30a-4874-ac2a-180503b1f587
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

{"id":"acc_0a731e30-7cdd-4ca4-b7ed-7eb5f87c958c","handle":"qa-11b17e57ea47","displayName":"QA 11b17e57ea47","region":"eu","role":"user","createdAt":"2026-10-29T08:39:02.227825569Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-3111e572-fe87-4b74-82c2-cf3edaefdbc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3111e572-fe87-4b74-82c2-cf3edaefdbc4
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3111e572-fe87-4b74-82c2-cf3edaefdbc4
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

{"id":"acc_0a731e30-7cdd-4ca4-b7ed-7eb5f87c958c","handle":"qa-11b17e57ea47","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-10-29T08:39:02.227825569Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-5c97d73b5ebf
correlation: qa-bdbb57bb-f1fc-469f-9ac0-eeefc2d674fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdbb57bb-f1fc-469f-9ac0-eeefc2d674fe
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdbb57bb-f1fc-469f-9ac0-eeefc2d674fe
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

{"handle":"qa-5c97d73b5ebf","displayName":"QA 5c97d73b5ebf","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-51bdcba5-404b-40a0-b5a6-0c4eeee1909d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51bdcba5-404b-40a0-b5a6-0c4eeee1909d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5c97d73b5ebf","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-51bdcba5-404b-40a0-b5a6-0c4eeee1909d
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
Location: /v1/conversations/cnv_961f6c1b-8b41-4633-b730-09934aa543ca
X-Data-Region: us
Content-Length: 238

{"id":"cnv_961f6c1b-8b41-4633-b730-09934aa543ca","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-11b17e57ea47","qa-5c97d73b5ebf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:02.371540181Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-dc0f38a9-b2cc-4ab2-aa35-356617252334

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc0f38a9-b2cc-4ab2-aa35-356617252334
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc0f38a9-b2cc-4ab2-aa35-356617252334
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

{"items":[{"id":"cnv_961f6c1b-8b41-4633-b730-09934aa543ca","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-11b17e57ea47","qa-5c97d73b5ebf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:02.371540181Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-13afcf75-4850-43cb-8d17-1e7180b89ee1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13afcf75-4850-43cb-8d17-1e7180b89ee1
Content-Type: application/json

--- request body ---
{"handle":"qa-5c97d73b5ebf","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-13afcf75-4850-43cb-8d17-1e7180b89ee1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1eccec62-1aef-49e5-80b6-fba3b0293249"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_961f6c1b-8b41-4633-b730-09934aa543ca
correlation: qa-c31c946b-3213-4248-a5d0-a8619f7b17aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c31c946b-3213-4248-a5d0-a8619f7b17aa
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c31c946b-3213-4248-a5d0-a8619f7b17aa
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

{"id":"cnv_961f6c1b-8b41-4633-b730-09934aa543ca","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-11b17e57ea47","qa-5c97d73b5ebf"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-29T08:39:02.371540181Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_961f6c1b-8b41-4633-b730-09934aa543ca/messages
correlation: qa-c35870ac-137a-4e8c-b9ca-48c2137a091d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c35870ac-137a-4e8c-b9ca-48c2137a091d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c35870ac-137a-4e8c-b9ca-48c2137a091d
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

{"items":[{"id":"msg_648600dc-67ff-48fe-a74a-ea1eb3cd5543","conversationId":"cnv_961f6c1b-8b41-4633-b730-09934aa543ca","sender":"qa-11b17e57ea47","body":"Hi","createdAt":"2026-10-29T08:39:02.371544720Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_961f6c1b-8b41-4633-b730-09934aa543ca/messages
correlation: qa-e27162fa-3407-4597-98be-6c26a09b6f3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e27162fa-3407-4597-98be-6c26a09b6f3a
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e27162fa-3407-4597-98be-6c26a09b6f3a
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

{"id":"msg_9661046a-3fb5-4cd0-a7f9-ced8c576407c","conversationId":"cnv_961f6c1b-8b41-4633-b730-09934aa543ca","sender":"qa-5c97d73b5ebf","body":"Reply","createdAt":"2026-10-29T08:39:02.443298972Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_961f6c1b-8b41-4633-b730-09934aa543ca/read
correlation: qa-1a0c1bfe-c86b-440d-8db3-f636f61a19c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a0c1bfe-c86b-440d-8db3-f636f61a19c8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a0c1bfe-c86b-440d-8db3-f636f61a19c8
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

{"conversationId":"cnv_961f6c1b-8b41-4633-b730-09934aa543ca","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_961f6c1b-8b41-4633-b730-09934aa543ca/close
correlation: qa-cf1506a5-74da-4582-96fd-50b7396d6855

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf1506a5-74da-4582-96fd-50b7396d6855
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf1506a5-74da-4582-96fd-50b7396d6855
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

{"id":"cnv_961f6c1b-8b41-4633-b730-09934aa543ca","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-11b17e57ea47","qa-5c97d73b5ebf"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-29T08:39:02.371540181Z","closedAt":"2026-10-29T08:39:02.471575908Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-c18cbded-766b-4def-82ce-a52487142e45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c18cbded-766b-4def-82ce-a52487142e45
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c18cbded-766b-4def-82ce-a52487142e45
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

{"balance":4,"currency":"credits","accountId":"acc_0a731e30-7cdd-4ca4-b7ed-7eb5f87c958c"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-1de3743e-b4f6-4857-981f-5c59612cedbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1de3743e-b4f6-4857-981f-5c59612cedbf
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1de3743e-b4f6-4857-981f-5c59612cedbf
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

{"items":[{"id":"led_d214e284-c7ac-4960-ac3a-50aeb45c0676","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-29T08:39:02.227833014Z"},{"id":"led_1a93f260-e016-4bb4-ab0a-9dc4aa799d61","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_961f6c1b-8b41-4633-b730-09934aa543ca","createdAt":"2026-10-29T08:39:02.371533969Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c20bf767-97e3-48e4-a23e-52325d4576fb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-45e0e8f7280a4e08bd98efb19cb1f716
X-Correlation-Id: qa-c20bf767-97e3-48e4-a23e-52325d4576fb
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c20bf767-97e3-48e4-a23e-52325d4576fb
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
Location: /v1/credits/purchases/pur_1d4d9650-838d-4356-ad40-00e703686857
Content-Length: 144

{"id":"pur_1d4d9650-838d-4356-ad40-00e703686857","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-10-29T08:39:02.504917506Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-fd97efeb-1ce6-40ce-a3bd-63411203722c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd97efeb-1ce6-40ce-a3bd-63411203722c
Content-Type: application/json

--- response: 403 in 5 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd97efeb-1ce6-40ce-a3bd-63411203722c
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-fd97efeb-1ce6-40ce-a3bd-63411203722c"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-18175f9e-4801-490f-ae0d-db14940da5d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18175f9e-4801-490f-ae0d-db14940da5d0
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-18175f9e-4801-490f-ae0d-db14940da5d0
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
correlation: qa-85483748-9163-45d0-a4d8-881d2a18e80a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85483748-9163-45d0-a4d8-881d2a18e80a
Content-Type: application/json

--- request body ---
{"handle":"qa-5c97d73b5ebf","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85483748-9163-45d0-a4d8-881d2a18e80a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-85483748-9163-45d0-a4d8-881d2a18e80a"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-887abd78-bfcf-4f80-8687-8df163643818

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-887abd78-bfcf-4f80-8687-8df163643818
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-887abd78-bfcf-4f80-8687-8df163643818
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
correlation: qa-40e4b11c-5f6f-4561-bfda-81343b4d5124

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40e4b11c-5f6f-4561-bfda-81343b4d5124
Content-Type: application/json

--- request body ---
{"handle":"qa-11b17e57ea47","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40e4b11c-5f6f-4561-bfda-81343b4d5124
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-40e4b11c-5f6f-4561-bfda-81343b4d5124"}
```
