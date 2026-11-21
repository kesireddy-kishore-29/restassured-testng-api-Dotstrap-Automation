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
| 1 | `POST /v1/accounts` | 201 | 338 | `qa-47ff9797-f5f5-46b0-9129-db5da350ec54` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-a77286d7-e08b-4f98-9155-d9b21d4ef43c` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-5a449a50-691f-4cf3-b835-f84c4952e63a` |
| 4 | `POST /v1/conversations` | 201 | 53 | `qa-15266562-77d9-447a-81e7-2fa6800635a6` |
| 5 | `GET /v1/conversations` | 200 | 23 | `qa-427f1707-1220-4b86-8e09-40712e93e33a` |
| 6 | `GET /v1/conversations/{id}` | 200 | 13 | `qa-6cf8182f-23a7-49a4-babe-37aa6803f42b` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-f6142bb0-b4e0-4403-87f8-931225125187` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-3ff0f49f-dce1-432e-83bc-db1ce05e5111` |
| 9 | `POST /v1/auth/token` | 200 | 23 | `qa-12530141-0c0b-4292-af8b-9767559fb9e5` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 19 | `qa-d9fbe0ae-f944-4aba-9f29-a42209f2ade8` |
| 11 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-a9b3f5c8-111a-4cdb-955c-b9dc984095f9` |
| 12 | `POST /v1/auth/token` | 401 | 6 | `qa-11dc1399-08f0-4925-ae87-a82800b75321` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-e0e4a63e-dc68-4e41-87d7-ec1a2b69cdb8` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-a73d052b-9249-49b6-a05f-112c3683dbd9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-47ff9797-f5f5-46b0-9129-db5da350ec54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47ff9797-f5f5-46b0-9129-db5da350ec54
Content-Type: application/json

--- request body ---
{"handle":"qa-8c9175d12b14","displayName":"QA 8c9175d12b14","password":"****","region":"eu"}

--- response: 201 in 338 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-47ff9797-f5f5-46b0-9129-db5da350ec54
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
Location: /v1/accounts/qa-8c9175d12b14
X-Served-Region: eu
Content-Length: 181

{"id":"acc_846366c8-e09c-4498-912b-c4d4fd1154d2","handle":"qa-8c9175d12b14","displayName":"QA 8c9175d12b14","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.119890567Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a77286d7-e08b-4f98-9155-d9b21d4ef43c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a77286d7-e08b-4f98-9155-d9b21d4ef43c
Content-Type: application/json

--- request body ---
{"handle":"qa-2af13a9b9bbe","displayName":"QA 2af13a9b9bbe","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a77286d7-e08b-4f98-9155-d9b21d4ef43c
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
Location: /v1/accounts/qa-2af13a9b9bbe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1114c14d-0dd4-43a4-857e-0c31a8631f74","handle":"qa-2af13a9b9bbe","displayName":"QA 2af13a9b9bbe","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.383714902Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5a449a50-691f-4cf3-b835-f84c4952e63a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a449a50-691f-4cf3-b835-f84c4952e63a
Content-Type: application/json

--- request body ---
{"handle":"qa-8c9175d12b14","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a449a50-691f-4cf3-b835-f84c4952e63a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_846366c8-e09c-4498-912b-c4d4fd1154d2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-15266562-77d9-447a-81e7-2fa6800635a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15266562-77d9-447a-81e7-2fa6800635a6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2af13a9b9bbe","subject":"Contract check","message":"Hello"}

--- response: 201 in 53 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-15266562-77d9-447a-81e7-2fa6800635a6
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
Location: /v1/conversations/cnv_76d6e032-38f2-4ebf-8d6b-386b02fd641b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_76d6e032-38f2-4ebf-8d6b-386b02fd641b","subject":"Contract check","status":"open","region":"eu","participants":["qa-8c9175d12b14","qa-2af13a9b9bbe"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:51.510379718Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-427f1707-1220-4b86-8e09-40712e93e33a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-427f1707-1220-4b86-8e09-40712e93e33a
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-427f1707-1220-4b86-8e09-40712e93e33a
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

{"items":[{"id":"cnv_76d6e032-38f2-4ebf-8d6b-386b02fd641b","subject":"Contract check","status":"open","region":"eu","participants":["qa-8c9175d12b14","qa-2af13a9b9bbe"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:51.510379718Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_76d6e032-38f2-4ebf-8d6b-386b02fd641b
correlation: qa-6cf8182f-23a7-49a4-babe-37aa6803f42b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cf8182f-23a7-49a4-babe-37aa6803f42b
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cf8182f-23a7-49a4-babe-37aa6803f42b
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

{"id":"cnv_76d6e032-38f2-4ebf-8d6b-386b02fd641b","subject":"Contract check","status":"open","region":"eu","participants":["qa-8c9175d12b14","qa-2af13a9b9bbe"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:51.510379718Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_76d6e032-38f2-4ebf-8d6b-386b02fd641b/messages
correlation: qa-f6142bb0-b4e0-4403-87f8-931225125187

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6142bb0-b4e0-4403-87f8-931225125187
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6142bb0-b4e0-4403-87f8-931225125187
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

{"id":"msg_a53d40f8-4bb6-4afb-b083-bd3277931ef6","conversationId":"cnv_76d6e032-38f2-4ebf-8d6b-386b02fd641b","sender":"qa-8c9175d12b14","body":"Second","createdAt":"2026-11-16T09:53:51.633087019Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_76d6e032-38f2-4ebf-8d6b-386b02fd641b/messages
correlation: qa-3ff0f49f-dce1-432e-83bc-db1ce05e5111

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ff0f49f-dce1-432e-83bc-db1ce05e5111
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ff0f49f-dce1-432e-83bc-db1ce05e5111
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

{"items":[{"id":"msg_1b67c7dc-700a-4205-a1c6-02ef97128fd9","conversationId":"cnv_76d6e032-38f2-4ebf-8d6b-386b02fd641b","sender":"qa-8c9175d12b14","body":"Hello","createdAt":"2026-11-16T09:53:51.510565325Z"},{"id":"msg_a53d40f8-4bb6-4afb-b083-bd3277931ef6","conversationId":"cnv_76d6e032-38f2-4ebf-8d6b-386b02fd641b","sender":"qa-8c9175d12b14","body":"Second","createdAt":"2026-11-16T09:53:51.633087019Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-12530141-0c0b-4292-af8b-9767559fb9e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12530141-0c0b-4292-af8b-9767559fb9e5
Content-Type: application/json

--- request body ---
{"handle":"qa-2af13a9b9bbe","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-12530141-0c0b-4292-af8b-9767559fb9e5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1114c14d-0dd4-43a4-857e-0c31a8631f74"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_76d6e032-38f2-4ebf-8d6b-386b02fd641b/read
correlation: qa-d9fbe0ae-f944-4aba-9f29-a42209f2ade8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9fbe0ae-f944-4aba-9f29-a42209f2ade8
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9fbe0ae-f944-4aba-9f29-a42209f2ade8
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

{"conversationId":"cnv_76d6e032-38f2-4ebf-8d6b-386b02fd641b","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a9b3f5c8-111a-4cdb-955c-b9dc984095f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9b3f5c8-111a-4cdb-955c-b9dc984095f9
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a9b3f5c8-111a-4cdb-955c-b9dc984095f9
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
correlation: qa-11dc1399-08f0-4925-ae87-a82800b75321

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11dc1399-08f0-4925-ae87-a82800b75321
Content-Type: application/json

--- request body ---
{"handle":"qa-2af13a9b9bbe","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11dc1399-08f0-4925-ae87-a82800b75321
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-11dc1399-08f0-4925-ae87-a82800b75321"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e0e4a63e-dc68-4e41-87d7-ec1a2b69cdb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0e4a63e-dc68-4e41-87d7-ec1a2b69cdb8
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e0e4a63e-dc68-4e41-87d7-ec1a2b69cdb8
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
correlation: qa-a73d052b-9249-49b6-a05f-112c3683dbd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a73d052b-9249-49b6-a05f-112c3683dbd9
Content-Type: application/json

--- request body ---
{"handle":"qa-8c9175d12b14","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a73d052b-9249-49b6-a05f-112c3683dbd9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a73d052b-9249-49b6-a05f-112c3683dbd9"}
```
