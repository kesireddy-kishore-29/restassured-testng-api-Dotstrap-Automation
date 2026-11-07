# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-f9e8b6a4-c075-4556-be0c-731030a6c64f` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-78e33288-cc5d-4241-8025-37f848eaf924` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-7ac7d629-57ef-4c8d-8b5f-48a62899b51e` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-c30bcc65-f97c-43b5-8287-dc525efbd4a0` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 18 | `qa-ac815df1-1843-402b-84e7-f9e38482171d` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-71e2a0fb-5311-4471-a0fa-90afc0154eaa` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-26a041c2-1815-4661-a2c0-cbf5711ba810` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-b9e84f03-930e-4856-9b05-b2a697d6c453` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-d281c82c-b8d4-43c5-9c08-6e4b273f4589` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-d7ba0ad1-5ede-4ec8-9ff7-ecd561b451ea` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f9e8b6a4-c075-4556-be0c-731030a6c64f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9e8b6a4-c075-4556-be0c-731030a6c64f
Content-Type: application/json

--- request body ---
{"handle":"qa-51ad419f93e4","displayName":"QA 51ad419f93e4","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9e8b6a4-c075-4556-be0c-731030a6c64f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Location: /v1/accounts/qa-51ad419f93e4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e6e0f56a-44a3-4f18-8752-3f89ca8754aa","handle":"qa-51ad419f93e4","displayName":"QA 51ad419f93e4","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.106991838Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-78e33288-cc5d-4241-8025-37f848eaf924

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78e33288-cc5d-4241-8025-37f848eaf924
Content-Type: application/json

--- request body ---
{"handle":"qa-32cde966f0bc","displayName":"QA 32cde966f0bc","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-78e33288-cc5d-4241-8025-37f848eaf924
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 8
Location: /v1/accounts/qa-32cde966f0bc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b4d1a48f-9e92-4611-b090-90ed7dc42fa4","handle":"qa-32cde966f0bc","displayName":"QA 32cde966f0bc","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.153973164Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7ac7d629-57ef-4c8d-8b5f-48a62899b51e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ac7d629-57ef-4c8d-8b5f-48a62899b51e
Content-Type: application/json

--- request body ---
{"handle":"qa-51ad419f93e4","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ac7d629-57ef-4c8d-8b5f-48a62899b51e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6e0f56a-44a3-4f18-8752-3f89ca8754aa"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c30bcc65-f97c-43b5-8287-dc525efbd4a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c30bcc65-f97c-43b5-8287-dc525efbd4a0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-32cde966f0bc","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c30bcc65-f97c-43b5-8287-dc525efbd4a0
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
Location: /v1/conversations/cnv_f8b80064-63a5-46a1-bf79-47a38684c601
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f8b80064-63a5-46a1-bf79-47a38684c601","subject":"Error contract","status":"open","region":"eu","participants":["qa-51ad419f93e4","qa-32cde966f0bc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:33.233917890Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_f8b80064-63a5-46a1-bf79-47a38684c601/messages
correlation: qa-ac815df1-1843-402b-84e7-f9e38482171d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac815df1-1843-402b-84e7-f9e38482171d
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac815df1-1843-402b-84e7-f9e38482171d
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_f8b80064-63a5-46a1-bf79-47a38684c601/messages","correlationId":"qa-ac815df1-1843-402b-84e7-f9e38482171d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-71e2a0fb-5311-4471-a0fa-90afc0154eaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71e2a0fb-5311-4471-a0fa-90afc0154eaa
Content-Type: application/json

--- request body ---
{"handle":"qa-32cde966f0bc","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-71e2a0fb-5311-4471-a0fa-90afc0154eaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b4d1a48f-9e92-4611-b090-90ed7dc42fa4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26a041c2-1815-4661-a2c0-cbf5711ba810

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26a041c2-1815-4661-a2c0-cbf5711ba810
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26a041c2-1815-4661-a2c0-cbf5711ba810
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-b9e84f03-930e-4856-9b05-b2a697d6c453

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9e84f03-930e-4856-9b05-b2a697d6c453
Content-Type: application/json

--- request body ---
{"handle":"qa-32cde966f0bc","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9e84f03-930e-4856-9b05-b2a697d6c453
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b9e84f03-930e-4856-9b05-b2a697d6c453"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d281c82c-b8d4-43c5-9c08-6e4b273f4589

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d281c82c-b8d4-43c5-9c08-6e4b273f4589
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d281c82c-b8d4-43c5-9c08-6e4b273f4589
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d7ba0ad1-5ede-4ec8-9ff7-ecd561b451ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7ba0ad1-5ede-4ec8-9ff7-ecd561b451ea
Content-Type: application/json

--- request body ---
{"handle":"qa-51ad419f93e4","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7ba0ad1-5ede-4ec8-9ff7-ecd561b451ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d7ba0ad1-5ede-4ec8-9ff7-ecd561b451ea"}
```
