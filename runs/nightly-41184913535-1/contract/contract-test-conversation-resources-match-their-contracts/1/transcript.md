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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-741cd825-1ee9-4f4a-b5cb-9a474dd78469` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-a2f6db11-8d96-4e76-8402-22250e8c2807` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-b630be75-0a9c-4a43-96eb-357ea053193f` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-cf5d544f-e08e-4c54-9df6-a463662b62c8` |
| 5 | `GET /v1/conversations` | 200 | 22 | `qa-09efd5df-90e5-4979-a76a-9ff287706c78` |
| 6 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-82f52627-05b6-4ae3-8684-87e7cdd8e6b1` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 8 | `qa-2d243c81-0563-4fc9-91d1-a8cb3c22c6b7` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 6 | `qa-01bb7a68-ce77-44f4-8d87-6a195df99099` |
| 9 | `POST /v1/auth/token` | 200 | 21 | `qa-e568b81d-8f62-4070-8ab6-b4c11831e1e6` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 7 | `qa-064d3dec-4fe3-4a3c-88b2-a93d7e6fc234` |
| 11 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-fa83a74f-320b-4d95-aee3-7561cb82ae43` |
| 12 | `POST /v1/auth/token` | 401 | 6 | `qa-7c95f6a1-a178-4ef3-9ed9-55caa2101eab` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-992593e0-7ed3-4667-b4b4-4d08537c8b05` |
| 14 | `POST /v1/auth/token` | 401 | 27 | `qa-cb4cc876-e2f7-49e8-93c7-65a7997f5d50` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-741cd825-1ee9-4f4a-b5cb-9a474dd78469

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-741cd825-1ee9-4f4a-b5cb-9a474dd78469
Content-Type: application/json

--- request body ---
{"handle":"qa-3b3c870bb6c8","displayName":"QA 3b3c870bb6c8","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-741cd825-1ee9-4f4a-b5cb-9a474dd78469
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 6
Location: /v1/accounts/qa-3b3c870bb6c8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dea5ec52-fa46-41f5-9474-1f4b629be724","handle":"qa-3b3c870bb6c8","displayName":"QA 3b3c870bb6c8","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.355777034Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a2f6db11-8d96-4e76-8402-22250e8c2807

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2f6db11-8d96-4e76-8402-22250e8c2807
Content-Type: application/json

--- request body ---
{"handle":"qa-4c9977baef50","displayName":"QA 4c9977baef50","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2f6db11-8d96-4e76-8402-22250e8c2807
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 6
Location: /v1/accounts/qa-4c9977baef50
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8cf406df-4516-40aa-be5f-d374c699ddb9","handle":"qa-4c9977baef50","displayName":"QA 4c9977baef50","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.393956650Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b630be75-0a9c-4a43-96eb-357ea053193f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b630be75-0a9c-4a43-96eb-357ea053193f
Content-Type: application/json

--- request body ---
{"handle":"qa-3b3c870bb6c8","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b630be75-0a9c-4a43-96eb-357ea053193f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dea5ec52-fa46-41f5-9474-1f4b629be724"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cf5d544f-e08e-4c54-9df6-a463662b62c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf5d544f-e08e-4c54-9df6-a463662b62c8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4c9977baef50","subject":"Contract check","message":"Hello"}

--- response: 201 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf5d544f-e08e-4c54-9df6-a463662b62c8
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
Location: /v1/conversations/cnv_cc6c3c20-d751-4b69-b724-752c5ba76b93
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cc6c3c20-d751-4b69-b724-752c5ba76b93","subject":"Contract check","status":"open","region":"eu","participants":["qa-3b3c870bb6c8","qa-4c9977baef50"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:37.437429611Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-09efd5df-90e5-4979-a76a-9ff287706c78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09efd5df-90e5-4979-a76a-9ff287706c78
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-09efd5df-90e5-4979-a76a-9ff287706c78
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

{"items":[{"id":"cnv_cc6c3c20-d751-4b69-b724-752c5ba76b93","subject":"Contract check","status":"open","region":"eu","participants":["qa-3b3c870bb6c8","qa-4c9977baef50"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:37.437429611Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_cc6c3c20-d751-4b69-b724-752c5ba76b93
correlation: qa-82f52627-05b6-4ae3-8684-87e7cdd8e6b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82f52627-05b6-4ae3-8684-87e7cdd8e6b1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-82f52627-05b6-4ae3-8684-87e7cdd8e6b1
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

{"id":"cnv_cc6c3c20-d751-4b69-b724-752c5ba76b93","subject":"Contract check","status":"open","region":"eu","participants":["qa-3b3c870bb6c8","qa-4c9977baef50"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:37.437429611Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_cc6c3c20-d751-4b69-b724-752c5ba76b93/messages
correlation: qa-2d243c81-0563-4fc9-91d1-a8cb3c22c6b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d243c81-0563-4fc9-91d1-a8cb3c22c6b7
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d243c81-0563-4fc9-91d1-a8cb3c22c6b7
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

{"id":"msg_e5cf90ec-1c84-4b35-9a33-b31adf3d3936","conversationId":"cnv_cc6c3c20-d751-4b69-b724-752c5ba76b93","sender":"qa-3b3c870bb6c8","body":"Second","createdAt":"2026-10-31T08:31:37.510494104Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_cc6c3c20-d751-4b69-b724-752c5ba76b93/messages
correlation: qa-01bb7a68-ce77-44f4-8d87-6a195df99099

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01bb7a68-ce77-44f4-8d87-6a195df99099
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-01bb7a68-ce77-44f4-8d87-6a195df99099
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

{"items":[{"id":"msg_960856c9-e8b4-4b21-bc70-995f35cea253","conversationId":"cnv_cc6c3c20-d751-4b69-b724-752c5ba76b93","sender":"qa-3b3c870bb6c8","body":"Hello","createdAt":"2026-10-31T08:31:37.437437636Z"},{"id":"msg_e5cf90ec-1c84-4b35-9a33-b31adf3d3936","conversationId":"cnv_cc6c3c20-d751-4b69-b724-752c5ba76b93","sender":"qa-3b3c870bb6c8","body":"Second","createdAt":"2026-10-31T08:31:37.510494104Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-e568b81d-8f62-4070-8ab6-b4c11831e1e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e568b81d-8f62-4070-8ab6-b4c11831e1e6
Content-Type: application/json

--- request body ---
{"handle":"qa-4c9977baef50","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e568b81d-8f62-4070-8ab6-b4c11831e1e6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8cf406df-4516-40aa-be5f-d374c699ddb9"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_cc6c3c20-d751-4b69-b724-752c5ba76b93/read
correlation: qa-064d3dec-4fe3-4a3c-88b2-a93d7e6fc234

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-064d3dec-4fe3-4a3c-88b2-a93d7e6fc234
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-064d3dec-4fe3-4a3c-88b2-a93d7e6fc234
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

{"conversationId":"cnv_cc6c3c20-d751-4b69-b724-752c5ba76b93","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa83a74f-320b-4d95-aee3-7561cb82ae43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa83a74f-320b-4d95-aee3-7561cb82ae43
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa83a74f-320b-4d95-aee3-7561cb82ae43
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
correlation: qa-7c95f6a1-a178-4ef3-9ed9-55caa2101eab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c95f6a1-a178-4ef3-9ed9-55caa2101eab
Content-Type: application/json

--- request body ---
{"handle":"qa-4c9977baef50","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c95f6a1-a178-4ef3-9ed9-55caa2101eab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c95f6a1-a178-4ef3-9ed9-55caa2101eab"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-992593e0-7ed3-4667-b4b4-4d08537c8b05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-992593e0-7ed3-4667-b4b4-4d08537c8b05
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-992593e0-7ed3-4667-b4b4-4d08537c8b05
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
correlation: qa-cb4cc876-e2f7-49e8-93c7-65a7997f5d50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb4cc876-e2f7-49e8-93c7-65a7997f5d50
Content-Type: application/json

--- request body ---
{"handle":"qa-3b3c870bb6c8","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb4cc876-e2f7-49e8-93c7-65a7997f5d50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cb4cc876-e2f7-49e8-93c7-65a7997f5d50"}
```
