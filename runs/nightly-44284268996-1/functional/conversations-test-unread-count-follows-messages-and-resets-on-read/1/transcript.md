# Transcript: Unread counts follow messages and reset when read

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#unreadCountFollowsMessagesAndResetsOnRead` |
| Features | FEAT-CONV-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 476 | `qa-4cd2483a-9698-47f3-8419-3104d331ce10` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-22a0c627-2cca-430e-8064-f6f8cb5b67e5` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-cde02259-dec3-4862-8887-acdfb10255eb` |
| 4 | `POST /v1/conversations` | 201 | 68 | `qa-008ed46f-4a45-499c-a588-5cc2cdabdea5` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 49 | `qa-2b8dae6b-43b2-49a4-b936-fc3133e49cd7` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-362ed63e-b491-4088-86c9-8081e2369fe7` |
| 7 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-6958fe99-3d24-4167-8962-b019829af451` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 13 | `qa-4ca876f4-f8a9-4042-b392-4e5637056f36` |
| 9 | `GET /v1/conversations/{id}` | 200 | 16 | `qa-49f1394b-d779-4a55-bbbe-4dd2a1c4711a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-77e5b004-0ec6-42b5-84ba-83a3fabc2dff` |
| 11 | `POST /v1/auth/token` | 401 | 35 | `qa-2b7de4ee-b892-4f57-957e-edd4005bf2dc` |
| 12 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-c0ee793e-f952-46c0-8837-68f3fc14d86b` |
| 13 | `POST /v1/auth/token` | 401 | 19 | `qa-19984d86-bdaa-4faf-bebc-11f7d3517d76` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4cd2483a-9698-47f3-8419-3104d331ce10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cd2483a-9698-47f3-8419-3104d331ce10
Content-Type: application/json

--- request body ---
{"handle":"qa-edbfa91cd4cd","displayName":"QA edbfa91cd4cd","password":"****","region":"eu"}

--- response: 201 in 476 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cd2483a-9698-47f3-8419-3104d331ce10
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
Location: /v1/accounts/qa-edbfa91cd4cd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b2692653-126c-4f0d-aab4-dfb81420c5c8","handle":"qa-edbfa91cd4cd","displayName":"QA edbfa91cd4cd","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.886040670Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-22a0c627-2cca-430e-8064-f6f8cb5b67e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22a0c627-2cca-430e-8064-f6f8cb5b67e5
Content-Type: application/json

--- request body ---
{"handle":"qa-5336269cfcb8","displayName":"QA 5336269cfcb8","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-22a0c627-2cca-430e-8064-f6f8cb5b67e5
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
Location: /v1/accounts/qa-5336269cfcb8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_decc7408-5c50-4887-b013-0cd9bdff9c8e","handle":"qa-5336269cfcb8","displayName":"QA 5336269cfcb8","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.322791785Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cde02259-dec3-4862-8887-acdfb10255eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cde02259-dec3-4862-8887-acdfb10255eb
Content-Type: application/json

--- request body ---
{"handle":"qa-edbfa91cd4cd","password":"****"}

--- response: 200 in 38 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-cde02259-dec3-4862-8887-acdfb10255eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b2692653-126c-4f0d-aab4-dfb81420c5c8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-008ed46f-4a45-499c-a588-5cc2cdabdea5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-008ed46f-4a45-499c-a588-5cc2cdabdea5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5336269cfcb8","subject":"Updates","message":"First"}

--- response: 201 in 68 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-008ed46f-4a45-499c-a588-5cc2cdabdea5
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
Location: /v1/conversations/cnv_51d27956-8bba-4624-b704-2fd03b462bc4
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_51d27956-8bba-4624-b704-2fd03b462bc4","subject":"Updates","status":"open","region":"eu","participants":["qa-edbfa91cd4cd","qa-5336269cfcb8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.499178209Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_51d27956-8bba-4624-b704-2fd03b462bc4/messages
correlation: qa-2b8dae6b-43b2-49a4-b936-fc3133e49cd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b8dae6b-43b2-49a4-b936-fc3133e49cd7
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 49 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b8dae6b-43b2-49a4-b936-fc3133e49cd7
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
Content-Length: 197

{"id":"msg_5a4ce24a-246f-4d79-acfe-ee99a5adc4a1","conversationId":"cnv_51d27956-8bba-4624-b704-2fd03b462bc4","sender":"qa-edbfa91cd4cd","body":"Second","createdAt":"2026-11-18T10:19:52.597852076Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-362ed63e-b491-4088-86c9-8081e2369fe7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-362ed63e-b491-4088-86c9-8081e2369fe7
Content-Type: application/json

--- request body ---
{"handle":"qa-5336269cfcb8","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-362ed63e-b491-4088-86c9-8081e2369fe7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_decc7408-5c50-4887-b013-0cd9bdff9c8e"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_51d27956-8bba-4624-b704-2fd03b462bc4
correlation: qa-6958fe99-3d24-4167-8962-b019829af451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6958fe99-3d24-4167-8962-b019829af451
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-6958fe99-3d24-4167-8962-b019829af451
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_51d27956-8bba-4624-b704-2fd03b462bc4","subject":"Updates","status":"open","region":"eu","participants":["qa-edbfa91cd4cd","qa-5336269cfcb8"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-18T10:19:52.499178209Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_51d27956-8bba-4624-b704-2fd03b462bc4/read
correlation: qa-4ca876f4-f8a9-4042-b392-4e5637056f36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ca876f4-f8a9-4042-b392-4e5637056f36
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ca876f4-f8a9-4042-b392-4e5637056f36
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
Content-Length: 77

{"conversationId":"cnv_51d27956-8bba-4624-b704-2fd03b462bc4","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_51d27956-8bba-4624-b704-2fd03b462bc4
correlation: qa-49f1394b-d779-4a55-bbbe-4dd2a1c4711a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49f1394b-d779-4a55-bbbe-4dd2a1c4711a
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-49f1394b-d779-4a55-bbbe-4dd2a1c4711a
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
Content-Length: 230

{"id":"cnv_51d27956-8bba-4624-b704-2fd03b462bc4","subject":"Updates","status":"open","region":"eu","participants":["qa-edbfa91cd4cd","qa-5336269cfcb8"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.499178209Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-77e5b004-0ec6-42b5-84ba-83a3fabc2dff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77e5b004-0ec6-42b5-84ba-83a3fabc2dff
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-77e5b004-0ec6-42b5-84ba-83a3fabc2dff
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-2b7de4ee-b892-4f57-957e-edd4005bf2dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b7de4ee-b892-4f57-957e-edd4005bf2dc
Content-Type: application/json

--- request body ---
{"handle":"qa-5336269cfcb8","password":"****"}

--- response: 401 in 35 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b7de4ee-b892-4f57-957e-edd4005bf2dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b7de4ee-b892-4f57-957e-edd4005bf2dc"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c0ee793e-f952-46c0-8837-68f3fc14d86b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0ee793e-f952-46c0-8837-68f3fc14d86b
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c0ee793e-f952-46c0-8837-68f3fc14d86b
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
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-19984d86-bdaa-4faf-bebc-11f7d3517d76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19984d86-bdaa-4faf-bebc-11f7d3517d76
Content-Type: application/json

--- request body ---
{"handle":"qa-edbfa91cd4cd","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19984d86-bdaa-4faf-bebc-11f7d3517d76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-19984d86-bdaa-4faf-bebc-11f7d3517d76"}
```
