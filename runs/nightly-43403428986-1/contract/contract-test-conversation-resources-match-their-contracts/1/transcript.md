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
| 1 | `POST /v1/accounts` | 201 | 391 | `qa-e240cfab-9d4e-4ff0-8eea-8d6674443f0e` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-98e42121-6081-4ca6-bc51-ec1c7cb5f497` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-94e8aeb8-3e55-475c-8e26-de0f22f37228` |
| 4 | `POST /v1/conversations` | 201 | 42 | `qa-abc19555-798f-4746-ac59-e84807991211` |
| 5 | `GET /v1/conversations` | 200 | 26 | `qa-c0640a0a-1d1c-4d23-a4a7-06356edb6399` |
| 6 | `GET /v1/conversations/{id}` | 200 | 19 | `qa-352f3f6c-dc28-430b-97e3-020f72add651` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 22 | `qa-8687eb7a-5de0-4bd1-a415-5283aa9a2651` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 17 | `qa-b337892f-4262-4031-86d5-f2367b7f4bc4` |
| 9 | `POST /v1/auth/token` | 200 | 22 | `qa-1d8627f6-98c3-4cb4-9a1a-22fd61687226` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 18 | `qa-3f7e0515-2429-47b0-9fa2-113b11daab82` |
| 11 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-73d634e9-8516-430f-8bf8-1978d0026ca3` |
| 12 | `POST /v1/auth/token` | 401 | 6 | `qa-e60ca4e2-b074-4e14-8579-313a1412180d` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-10984a69-5439-4032-bbdf-2c7663e728ce` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-68368a88-6aba-402e-b78f-4a5691e9f375` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e240cfab-9d4e-4ff0-8eea-8d6674443f0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e240cfab-9d4e-4ff0-8eea-8d6674443f0e
Content-Type: application/json

--- request body ---
{"handle":"qa-ab2bce160b2f","displayName":"QA ab2bce160b2f","password":"****","region":"eu"}

--- response: 201 in 391 ms ---
Date: Fri, 13 Nov 2026 09:42:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e240cfab-9d4e-4ff0-8eea-8d6674443f0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 11
Location: /v1/accounts/qa-ab2bce160b2f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c8109073-5d91-473c-ab5c-091d3b48960e","handle":"qa-ab2bce160b2f","displayName":"QA ab2bce160b2f","region":"eu","role":"user","createdAt":"2026-11-13T09:42:04.692429042Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-98e42121-6081-4ca6-bc51-ec1c7cb5f497

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98e42121-6081-4ca6-bc51-ec1c7cb5f497
Content-Type: application/json

--- request body ---
{"handle":"qa-684de34c3581","displayName":"QA 684de34c3581","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-98e42121-6081-4ca6-bc51-ec1c7cb5f497
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
Location: /v1/accounts/qa-684de34c3581
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d5806c4-7bd2-4f04-8589-e45b4b5309a2","handle":"qa-684de34c3581","displayName":"QA 684de34c3581","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.050793399Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-94e8aeb8-3e55-475c-8e26-de0f22f37228

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94e8aeb8-3e55-475c-8e26-de0f22f37228
Content-Type: application/json

--- request body ---
{"handle":"qa-ab2bce160b2f","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-94e8aeb8-3e55-475c-8e26-de0f22f37228
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c8109073-5d91-473c-ab5c-091d3b48960e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-abc19555-798f-4746-ac59-e84807991211

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abc19555-798f-4746-ac59-e84807991211
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-684de34c3581","subject":"Contract check","message":"Hello"}

--- response: 201 in 42 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-abc19555-798f-4746-ac59-e84807991211
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
Location: /v1/conversations/cnv_df2cac62-07e3-4b9b-8499-42038983178d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_df2cac62-07e3-4b9b-8499-42038983178d","subject":"Contract check","status":"open","region":"eu","participants":["qa-ab2bce160b2f","qa-684de34c3581"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.160432032Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-c0640a0a-1d1c-4d23-a4a7-06356edb6399

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0640a0a-1d1c-4d23-a4a7-06356edb6399
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0640a0a-1d1c-4d23-a4a7-06356edb6399
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

{"items":[{"id":"cnv_df2cac62-07e3-4b9b-8499-42038983178d","subject":"Contract check","status":"open","region":"eu","participants":["qa-ab2bce160b2f","qa-684de34c3581"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.160432032Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_df2cac62-07e3-4b9b-8499-42038983178d
correlation: qa-352f3f6c-dc28-430b-97e3-020f72add651

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-352f3f6c-dc28-430b-97e3-020f72add651
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-352f3f6c-dc28-430b-97e3-020f72add651
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

{"id":"cnv_df2cac62-07e3-4b9b-8499-42038983178d","subject":"Contract check","status":"open","region":"eu","participants":["qa-ab2bce160b2f","qa-684de34c3581"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.160432032Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_df2cac62-07e3-4b9b-8499-42038983178d/messages
correlation: qa-8687eb7a-5de0-4bd1-a415-5283aa9a2651

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8687eb7a-5de0-4bd1-a415-5283aa9a2651
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-8687eb7a-5de0-4bd1-a415-5283aa9a2651
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

{"id":"msg_a31ec46d-c792-4823-9acb-6964159aa8df","conversationId":"cnv_df2cac62-07e3-4b9b-8499-42038983178d","sender":"qa-ab2bce160b2f","body":"Second","createdAt":"2026-11-13T09:42:05.321086423Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_df2cac62-07e3-4b9b-8499-42038983178d/messages
correlation: qa-b337892f-4262-4031-86d5-f2367b7f4bc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b337892f-4262-4031-86d5-f2367b7f4bc4
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b337892f-4262-4031-86d5-f2367b7f4bc4
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

{"items":[{"id":"msg_1fe1f95d-d482-412e-aab7-c3aa67d044d5","conversationId":"cnv_df2cac62-07e3-4b9b-8499-42038983178d","sender":"qa-ab2bce160b2f","body":"Hello","createdAt":"2026-11-13T09:42:05.160782389Z"},{"id":"msg_a31ec46d-c792-4823-9acb-6964159aa8df","conversationId":"cnv_df2cac62-07e3-4b9b-8499-42038983178d","sender":"qa-ab2bce160b2f","body":"Second","createdAt":"2026-11-13T09:42:05.321086423Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-1d8627f6-98c3-4cb4-9a1a-22fd61687226

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d8627f6-98c3-4cb4-9a1a-22fd61687226
Content-Type: application/json

--- request body ---
{"handle":"qa-684de34c3581","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d8627f6-98c3-4cb4-9a1a-22fd61687226
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d5806c4-7bd2-4f04-8589-e45b4b5309a2"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_df2cac62-07e3-4b9b-8499-42038983178d/read
correlation: qa-3f7e0515-2429-47b0-9fa2-113b11daab82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f7e0515-2429-47b0-9fa2-113b11daab82
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f7e0515-2429-47b0-9fa2-113b11daab82
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

{"conversationId":"cnv_df2cac62-07e3-4b9b-8499-42038983178d","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-73d634e9-8516-430f-8bf8-1978d0026ca3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73d634e9-8516-430f-8bf8-1978d0026ca3
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-73d634e9-8516-430f-8bf8-1978d0026ca3
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
correlation: qa-e60ca4e2-b074-4e14-8579-313a1412180d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e60ca4e2-b074-4e14-8579-313a1412180d
Content-Type: application/json

--- request body ---
{"handle":"qa-684de34c3581","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e60ca4e2-b074-4e14-8579-313a1412180d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e60ca4e2-b074-4e14-8579-313a1412180d"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-10984a69-5439-4032-bbdf-2c7663e728ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10984a69-5439-4032-bbdf-2c7663e728ce
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-10984a69-5439-4032-bbdf-2c7663e728ce
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
correlation: qa-68368a88-6aba-402e-b78f-4a5691e9f375

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68368a88-6aba-402e-b78f-4a5691e9f375
Content-Type: application/json

--- request body ---
{"handle":"qa-ab2bce160b2f","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68368a88-6aba-402e-b78f-4a5691e9f375
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-68368a88-6aba-402e-b78f-4a5691e9f375"}
```
