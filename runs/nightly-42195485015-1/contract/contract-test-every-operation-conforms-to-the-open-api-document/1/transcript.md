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
| 1 | `POST /v1/accounts` | 201 | 458 | `qa-969b45ce-4739-4736-8195-610e740c735a` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-6cd5365e-5f57-48a7-882b-e2ec0a20fe8a` |
| 3 | `GET /health` | 200 | 45 | `qa-a9c5d820-a0fa-4615-9f40-3eb1b3b3565e` |
| 4 | `POST /v1/auth/token` | 200 | 33 | `qa-a4fe8945-4c99-4e45-8e10-2f61757eaea5` |
| 5 | `GET /v1/accounts/me` | 200 | 18 | `qa-546fd2a5-1e6d-479e-9ea6-c5bb96423527` |
| 6 | `PATCH /v1/accounts/me` | 200 | 24 | `qa-cb80d5dc-37f8-4970-851d-e99b0df01940` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 23 | `qa-a3d06385-eddc-4b55-a4f4-bca2075f381b` |
| 8 | `POST /v1/conversations` | 201 | 23 | `qa-71c7bbf8-662b-4fc4-abf4-33826d9e5159` |
| 9 | `GET /v1/conversations` | 200 | 18 | `qa-e1490331-5e6e-4c9f-8de4-f36953a3c1b7` |
| 10 | `POST /v1/auth/token` | 200 | 26 | `qa-67964e27-76f6-46ec-bfa2-b86a6bfec5bf` |
| 11 | `GET /v1/conversations/{id}` | 200 | 14 | `qa-1def5393-d80b-41c0-b32c-744c6a9686f2` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 16 | `qa-18eac6f0-8c16-4fef-9333-3f7631f4dc69` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-7bfaf134-0ee9-48c0-a850-34033e2c800b` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 16 | `qa-454585a4-d813-4684-9904-a75b3c2e50bb` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 17 | `qa-43cf6ba4-9d23-45fd-8934-473c0e1b41f5` |
| 16 | `GET /v1/credits/balance` | 200 | 12 | `qa-0bfec307-a78b-402c-ac8a-44d00524e2d3` |
| 17 | `GET /v1/credits/ledger` | 200 | 11 | `qa-bd789ea3-a757-45f9-8760-e5f2b1aedba9` |
| 18 | `POST /v1/credits/purchases` | 201 | 13 | `qa-07c4cab1-14b1-4a35-a39d-506cce657b6e` |
| 19 | `GET /v1/admin/stats` | 403 | 13 | `qa-11557975-a14e-4591-b7d7-9bab7c8f5e61` |
| 20 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-3fdb0128-df69-49d2-931d-da465d2f5988` |
| 21 | `POST /v1/auth/token` | 401 | 23 | `qa-a536f2de-2a52-46b2-963e-c964c7d0acfd` |
| 22 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-6269aff7-7e17-4947-a71d-d15356f875a1` |
| 23 | `POST /v1/auth/token` | 401 | 21 | `qa-dbcf0fd5-2350-44d5-b66c-8cb3405eb0e2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-969b45ce-4739-4736-8195-610e740c735a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-969b45ce-4739-4736-8195-610e740c735a
Content-Type: application/json

--- request body ---
{"handle":"qa-2f1f6fc8b80f","displayName":"QA 2f1f6fc8b80f","password":"****","region":"eu"}

--- response: 201 in 458 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-969b45ce-4739-4736-8195-610e740c735a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-2f1f6fc8b80f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_548ecf55-bd37-45ec-b209-1dba3a3d17f6","handle":"qa-2f1f6fc8b80f","displayName":"QA 2f1f6fc8b80f","region":"eu","role":"user","createdAt":"2026-11-06T09:30:30.088473811Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6cd5365e-5f57-48a7-882b-e2ec0a20fe8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cd5365e-5f57-48a7-882b-e2ec0a20fe8a
Content-Type: application/json

--- request body ---
{"handle":"qa-1fc1fb4afc92","displayName":"QA 1fc1fb4afc92","password":"****","region":"us"}

--- response: 201 in 27 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cd5365e-5f57-48a7-882b-e2ec0a20fe8a
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
Location: /v1/accounts/qa-1fc1fb4afc92
X-Served-Region: us
Content-Length: 181

{"id":"acc_6e034688-f6f4-4165-8f11-a8bcd94157c0","handle":"qa-1fc1fb4afc92","displayName":"QA 1fc1fb4afc92","region":"us","role":"user","createdAt":"2026-11-06T09:30:30.496386257Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-a9c5d820-a0fa-4615-9f40-3eb1b3b3565e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9c5d820-a0fa-4615-9f40-3eb1b3b3565e
Content-Type: application/json

--- response: 200 in 45 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9c5d820-a0fa-4615-9f40-3eb1b3b3565e
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
correlation: qa-a4fe8945-4c99-4e45-8e10-2f61757eaea5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4fe8945-4c99-4e45-8e10-2f61757eaea5
Content-Type: application/json

--- request body ---
{"handle":"qa-2f1f6fc8b80f","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4fe8945-4c99-4e45-8e10-2f61757eaea5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_548ecf55-bd37-45ec-b209-1dba3a3d17f6"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-546fd2a5-1e6d-479e-9ea6-c5bb96423527

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-546fd2a5-1e6d-479e-9ea6-c5bb96423527
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-546fd2a5-1e6d-479e-9ea6-c5bb96423527
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

{"id":"acc_548ecf55-bd37-45ec-b209-1dba3a3d17f6","handle":"qa-2f1f6fc8b80f","displayName":"QA 2f1f6fc8b80f","region":"eu","role":"user","createdAt":"2026-11-06T09:30:30.088473811Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-cb80d5dc-37f8-4970-851d-e99b0df01940

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb80d5dc-37f8-4970-851d-e99b0df01940
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb80d5dc-37f8-4970-851d-e99b0df01940
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

{"id":"acc_548ecf55-bd37-45ec-b209-1dba3a3d17f6","handle":"qa-2f1f6fc8b80f","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-06T09:30:30.088473811Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-1fc1fb4afc92
correlation: qa-a3d06385-eddc-4b55-a4f4-bca2075f381b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3d06385-eddc-4b55-a4f4-bca2075f381b
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3d06385-eddc-4b55-a4f4-bca2075f381b
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

{"handle":"qa-1fc1fb4afc92","displayName":"QA 1fc1fb4afc92","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-71c7bbf8-662b-4fc4-abf4-33826d9e5159

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71c7bbf8-662b-4fc4-abf4-33826d9e5159
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1fc1fb4afc92","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-71c7bbf8-662b-4fc4-abf4-33826d9e5159
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
Location: /v1/conversations/cnv_48d2092d-567e-4455-8aa5-e350a9a47584
X-Data-Region: us
Content-Length: 238

{"id":"cnv_48d2092d-567e-4455-8aa5-e350a9a47584","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-2f1f6fc8b80f","qa-1fc1fb4afc92"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:30.783194360Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-e1490331-5e6e-4c9f-8de4-f36953a3c1b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1490331-5e6e-4c9f-8de4-f36953a3c1b7
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1490331-5e6e-4c9f-8de4-f36953a3c1b7
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

{"items":[{"id":"cnv_48d2092d-567e-4455-8aa5-e350a9a47584","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-2f1f6fc8b80f","qa-1fc1fb4afc92"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:30.783194360Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-67964e27-76f6-46ec-bfa2-b86a6bfec5bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67964e27-76f6-46ec-bfa2-b86a6bfec5bf
Content-Type: application/json

--- request body ---
{"handle":"qa-1fc1fb4afc92","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-67964e27-76f6-46ec-bfa2-b86a6bfec5bf
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6e034688-f6f4-4165-8f11-a8bcd94157c0"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_48d2092d-567e-4455-8aa5-e350a9a47584
correlation: qa-1def5393-d80b-41c0-b32c-744c6a9686f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1def5393-d80b-41c0-b32c-744c6a9686f2
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-1def5393-d80b-41c0-b32c-744c6a9686f2
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

{"id":"cnv_48d2092d-567e-4455-8aa5-e350a9a47584","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-2f1f6fc8b80f","qa-1fc1fb4afc92"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-06T09:30:30.783194360Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_48d2092d-567e-4455-8aa5-e350a9a47584/messages
correlation: qa-18eac6f0-8c16-4fef-9333-3f7631f4dc69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18eac6f0-8c16-4fef-9333-3f7631f4dc69
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-18eac6f0-8c16-4fef-9333-3f7631f4dc69
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

{"items":[{"id":"msg_2b46a1b1-40ab-4b5b-b857-d233cb2866a4","conversationId":"cnv_48d2092d-567e-4455-8aa5-e350a9a47584","sender":"qa-2f1f6fc8b80f","body":"Hi","createdAt":"2026-11-06T09:30:30.783251616Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_48d2092d-567e-4455-8aa5-e350a9a47584/messages
correlation: qa-7bfaf134-0ee9-48c0-a850-34033e2c800b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bfaf134-0ee9-48c0-a850-34033e2c800b
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-7bfaf134-0ee9-48c0-a850-34033e2c800b
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

{"id":"msg_b58576c0-77f7-4e32-80e6-c9e65d6f06a9","conversationId":"cnv_48d2092d-567e-4455-8aa5-e350a9a47584","sender":"qa-1fc1fb4afc92","body":"Reply","createdAt":"2026-11-06T09:30:30.943900269Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_48d2092d-567e-4455-8aa5-e350a9a47584/read
correlation: qa-454585a4-d813-4684-9904-a75b3c2e50bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-454585a4-d813-4684-9904-a75b3c2e50bb
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-454585a4-d813-4684-9904-a75b3c2e50bb
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

{"conversationId":"cnv_48d2092d-567e-4455-8aa5-e350a9a47584","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_48d2092d-567e-4455-8aa5-e350a9a47584/close
correlation: qa-43cf6ba4-9d23-45fd-8934-473c0e1b41f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43cf6ba4-9d23-45fd-8934-473c0e1b41f5
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-43cf6ba4-9d23-45fd-8934-473c0e1b41f5
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

{"id":"cnv_48d2092d-567e-4455-8aa5-e350a9a47584","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-2f1f6fc8b80f","qa-1fc1fb4afc92"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-06T09:30:30.783194360Z","closedAt":"2026-11-06T09:30:30.999624804Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-0bfec307-a78b-402c-ac8a-44d00524e2d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bfec307-a78b-402c-ac8a-44d00524e2d3
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bfec307-a78b-402c-ac8a-44d00524e2d3
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

{"balance":4,"currency":"credits","accountId":"acc_548ecf55-bd37-45ec-b209-1dba3a3d17f6"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-bd789ea3-a757-45f9-8760-e5f2b1aedba9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd789ea3-a757-45f9-8760-e5f2b1aedba9
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd789ea3-a757-45f9-8760-e5f2b1aedba9
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

{"items":[{"id":"led_4683794a-b2d1-4333-ad8e-e4453d1eaca7","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-06T09:30:30.088483318Z"},{"id":"led_ad91f21b-37a4-4134-991e-199dc23de4d9","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_48d2092d-567e-4455-8aa5-e350a9a47584","createdAt":"2026-11-06T09:30:30.783152181Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-07c4cab1-14b1-4a35-a39d-506cce657b6e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ec6ac6e421434610b60a8a99353c7551
X-Correlation-Id: qa-07c4cab1-14b1-4a35-a39d-506cce657b6e
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-07c4cab1-14b1-4a35-a39d-506cce657b6e
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
Location: /v1/credits/purchases/pur_5ac72318-4da7-488c-b440-8e2040ee6843
Content-Length: 144

{"id":"pur_5ac72318-4da7-488c-b440-8e2040ee6843","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-06T09:30:31.057640080Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-11557975-a14e-4591-b7d7-9bab7c8f5e61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11557975-a14e-4591-b7d7-9bab7c8f5e61
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11557975-a14e-4591-b7d7-9bab7c8f5e61
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-11557975-a14e-4591-b7d7-9bab7c8f5e61"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3fdb0128-df69-49d2-931d-da465d2f5988

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fdb0128-df69-49d2-931d-da465d2f5988
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3fdb0128-df69-49d2-931d-da465d2f5988
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
correlation: qa-a536f2de-2a52-46b2-963e-c964c7d0acfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a536f2de-2a52-46b2-963e-c964c7d0acfd
Content-Type: application/json

--- request body ---
{"handle":"qa-1fc1fb4afc92","password":"****"}

--- response: 401 in 23 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a536f2de-2a52-46b2-963e-c964c7d0acfd
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a536f2de-2a52-46b2-963e-c964c7d0acfd"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6269aff7-7e17-4947-a71d-d15356f875a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6269aff7-7e17-4947-a71d-d15356f875a1
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6269aff7-7e17-4947-a71d-d15356f875a1
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
correlation: qa-dbcf0fd5-2350-44d5-b66c-8cb3405eb0e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbcf0fd5-2350-44d5-b66c-8cb3405eb0e2
Content-Type: application/json

--- request body ---
{"handle":"qa-2f1f6fc8b80f","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbcf0fd5-2350-44d5-b66c-8cb3405eb0e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dbcf0fd5-2350-44d5-b66c-8cb3405eb0e2"}
```
