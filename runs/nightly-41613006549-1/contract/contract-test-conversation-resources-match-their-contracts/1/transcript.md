# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-14a80ca9-e005-42f8-bbe0-07474951d46e` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-b65ca1a9-54a4-4020-a64a-014844cc9279` |
| 3 | `POST /v1/auth/token` | 200 | 10 | `qa-f4ea2564-f4d1-4043-bedb-1e7fc338884c` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-251a3819-29bb-4a30-b43e-bf353e44ca2e` |
| 5 | `GET /v1/conversations` | 200 | 15 | `qa-ab899edd-44df-485b-a9bc-34431a448025` |
| 6 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-c562f251-065e-4893-9f90-7052dc39ade1` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-e7bb3e05-6591-48f9-9ceb-6c6456e18549` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-68e1ac66-0e16-4877-866a-ead3ddd7d508` |
| 9 | `POST /v1/auth/token` | 200 | 8 | `qa-2e204a6f-f0a7-4356-b8b9-40b0f586ac55` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 6 | `qa-c34f2c26-e32c-4c97-8151-5ce0f75c7524` |
| 11 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-4f789457-d24c-410c-a0a1-7214425e4b1b` |
| 12 | `POST /v1/auth/token` | 401 | 8 | `qa-69b8d311-6b2d-4c8a-88f6-cbae6f006727` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-0c54b588-074d-480b-8536-f1533edb974e` |
| 14 | `POST /v1/auth/token` | 401 | 3 | `qa-e4221a2b-9851-41e6-b9ce-afd08d9b2798` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-14a80ca9-e005-42f8-bbe0-07474951d46e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14a80ca9-e005-42f8-bbe0-07474951d46e
Content-Type: application/json

--- request body ---
{"handle":"qa-53860b9fe8ca","displayName":"QA 53860b9fe8ca","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-14a80ca9-e005-42f8-bbe0-07474951d46e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Location: /v1/accounts/qa-53860b9fe8ca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ed8770fc-9c80-43d4-a600-1d2e46c70b7d","handle":"qa-53860b9fe8ca","displayName":"QA 53860b9fe8ca","region":"eu","role":"user","createdAt":"2026-11-03T09:41:34.018840469Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b65ca1a9-54a4-4020-a64a-014844cc9279

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b65ca1a9-54a4-4020-a64a-014844cc9279
Content-Type: application/json

--- request body ---
{"handle":"qa-0f5eb5eb68fc","displayName":"QA 0f5eb5eb68fc","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b65ca1a9-54a4-4020-a64a-014844cc9279
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 7
Location: /v1/accounts/qa-0f5eb5eb68fc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6cc5e48-a533-4861-9f4d-c8ac244ba215","handle":"qa-0f5eb5eb68fc","displayName":"QA 0f5eb5eb68fc","region":"eu","role":"user","createdAt":"2026-11-03T09:41:34.037611617Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f4ea2564-f4d1-4043-bedb-1e7fc338884c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4ea2564-f4d1-4043-bedb-1e7fc338884c
Content-Type: application/json

--- request body ---
{"handle":"qa-53860b9fe8ca","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4ea2564-f4d1-4043-bedb-1e7fc338884c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ed8770fc-9c80-43d4-a600-1d2e46c70b7d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-251a3819-29bb-4a30-b43e-bf353e44ca2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-251a3819-29bb-4a30-b43e-bf353e44ca2e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0f5eb5eb68fc","subject":"Contract check","message":"Hello"}

--- response: 201 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-251a3819-29bb-4a30-b43e-bf353e44ca2e
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
Location: /v1/conversations/cnv_59de3f7c-44e7-42e0-ba60-c623bcf05465
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_59de3f7c-44e7-42e0-ba60-c623bcf05465","subject":"Contract check","status":"open","region":"eu","participants":["qa-53860b9fe8ca","qa-0f5eb5eb68fc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:34.076472721Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-ab899edd-44df-485b-a9bc-34431a448025

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab899edd-44df-485b-a9bc-34431a448025
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab899edd-44df-485b-a9bc-34431a448025
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
Content-Length: 259

{"items":[{"id":"cnv_59de3f7c-44e7-42e0-ba60-c623bcf05465","subject":"Contract check","status":"open","region":"eu","participants":["qa-53860b9fe8ca","qa-0f5eb5eb68fc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:34.076472721Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_59de3f7c-44e7-42e0-ba60-c623bcf05465
correlation: qa-c562f251-065e-4893-9f90-7052dc39ade1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c562f251-065e-4893-9f90-7052dc39ade1
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c562f251-065e-4893-9f90-7052dc39ade1
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_59de3f7c-44e7-42e0-ba60-c623bcf05465","subject":"Contract check","status":"open","region":"eu","participants":["qa-53860b9fe8ca","qa-0f5eb5eb68fc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:34.076472721Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_59de3f7c-44e7-42e0-ba60-c623bcf05465/messages
correlation: qa-e7bb3e05-6591-48f9-9ceb-6c6456e18549

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7bb3e05-6591-48f9-9ceb-6c6456e18549
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7bb3e05-6591-48f9-9ceb-6c6456e18549
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
Content-Length: 197

{"id":"msg_190c560a-0b2a-4485-b256-c1e1ccf3dc61","conversationId":"cnv_59de3f7c-44e7-42e0-ba60-c623bcf05465","sender":"qa-53860b9fe8ca","body":"Second","createdAt":"2026-11-03T09:41:34.136554983Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_59de3f7c-44e7-42e0-ba60-c623bcf05465/messages
correlation: qa-68e1ac66-0e16-4877-866a-ead3ddd7d508

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68e1ac66-0e16-4877-866a-ead3ddd7d508
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-68e1ac66-0e16-4877-866a-ead3ddd7d508
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
Content-Length: 416

{"items":[{"id":"msg_2c7aff8e-1824-4fb3-9847-497bcfd8d708","conversationId":"cnv_59de3f7c-44e7-42e0-ba60-c623bcf05465","sender":"qa-53860b9fe8ca","body":"Hello","createdAt":"2026-11-03T09:41:34.076477368Z"},{"id":"msg_190c560a-0b2a-4485-b256-c1e1ccf3dc61","conversationId":"cnv_59de3f7c-44e7-42e0-ba60-c623bcf05465","sender":"qa-53860b9fe8ca","body":"Second","createdAt":"2026-11-03T09:41:34.136554983Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-2e204a6f-f0a7-4356-b8b9-40b0f586ac55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e204a6f-f0a7-4356-b8b9-40b0f586ac55
Content-Type: application/json

--- request body ---
{"handle":"qa-0f5eb5eb68fc","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e204a6f-f0a7-4356-b8b9-40b0f586ac55
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6cc5e48-a533-4861-9f4d-c8ac244ba215"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_59de3f7c-44e7-42e0-ba60-c623bcf05465/read
correlation: qa-c34f2c26-e32c-4c97-8151-5ce0f75c7524

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c34f2c26-e32c-4c97-8151-5ce0f75c7524
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c34f2c26-e32c-4c97-8151-5ce0f75c7524
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
Content-Length: 77

{"conversationId":"cnv_59de3f7c-44e7-42e0-ba60-c623bcf05465","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f789457-d24c-410c-a0a1-7214425e4b1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f789457-d24c-410c-a0a1-7214425e4b1b
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f789457-d24c-410c-a0a1-7214425e4b1b
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
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-69b8d311-6b2d-4c8a-88f6-cbae6f006727

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69b8d311-6b2d-4c8a-88f6-cbae6f006727
Content-Type: application/json

--- request body ---
{"handle":"qa-0f5eb5eb68fc","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69b8d311-6b2d-4c8a-88f6-cbae6f006727
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-69b8d311-6b2d-4c8a-88f6-cbae6f006727"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c54b588-074d-480b-8536-f1533edb974e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c54b588-074d-480b-8536-f1533edb974e
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c54b588-074d-480b-8536-f1533edb974e
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-e4221a2b-9851-41e6-b9ce-afd08d9b2798

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4221a2b-9851-41e6-b9ce-afd08d9b2798
Content-Type: application/json

--- request body ---
{"handle":"qa-53860b9fe8ca","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4221a2b-9851-41e6-b9ce-afd08d9b2798
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e4221a2b-9851-41e6-b9ce-afd08d9b2798"}
```
