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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-a4a936ae-6994-408a-abd8-e388ad6135e3` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-1d3a252b-8ef7-4092-ae05-e1feadf67491` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-9b7ad72a-1796-48a3-826a-47ca11945f67` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-df7b8387-513a-4476-ac8a-4e89c52da917` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 22 | `qa-621e358f-6519-4872-90f5-2f85fc97556a` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-eed38cbc-ac5b-4841-899b-027c64e31234` |
| 7 | `GET /v1/conversations/{id}` | 200 | 23 | `qa-c25d60aa-e69b-4345-a795-65b4dd9e138b` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 11 | `qa-4ff35252-da0f-438e-b546-807b1c9e8dc0` |
| 9 | `GET /v1/conversations/{id}` | 200 | 33 | `qa-165680e9-be37-407c-8442-cd0a37f0ad30` |
| 10 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-cf7b07f8-b1d9-4740-8f43-8b029ce72fc5` |
| 11 | `POST /v1/auth/token` | 401 | 17 | `qa-a93aa289-bde3-4cf5-90e0-57e108b61a6d` |
| 12 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-183e1f59-57d7-4106-afb0-cee99fc308c7` |
| 13 | `POST /v1/auth/token` | 401 | 11 | `qa-595ea174-5fb7-4e90-9473-1c74413adbd0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a4a936ae-6994-408a-abd8-e388ad6135e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4a936ae-6994-408a-abd8-e388ad6135e3
Content-Type: application/json

--- request body ---
{"handle":"qa-b3fcb8a0369a","displayName":"QA b3fcb8a0369a","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4a936ae-6994-408a-abd8-e388ad6135e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Location: /v1/accounts/qa-b3fcb8a0369a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2d2bade1-26c8-4098-9d5d-b11ac0c44309","handle":"qa-b3fcb8a0369a","displayName":"QA b3fcb8a0369a","region":"eu","role":"user","createdAt":"2026-11-01T09:23:25.416561303Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1d3a252b-8ef7-4092-ae05-e1feadf67491

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d3a252b-8ef7-4092-ae05-e1feadf67491
Content-Type: application/json

--- request body ---
{"handle":"qa-410243b0a7ad","displayName":"QA 410243b0a7ad","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d3a252b-8ef7-4092-ae05-e1feadf67491
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
Location: /v1/accounts/qa-410243b0a7ad
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d9b0c2c0-9665-4936-9887-fb269aa856e6","handle":"qa-410243b0a7ad","displayName":"QA 410243b0a7ad","region":"eu","role":"user","createdAt":"2026-11-01T09:23:25.445612715Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9b7ad72a-1796-48a3-826a-47ca11945f67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b7ad72a-1796-48a3-826a-47ca11945f67
Content-Type: application/json

--- request body ---
{"handle":"qa-b3fcb8a0369a","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b7ad72a-1796-48a3-826a-47ca11945f67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2d2bade1-26c8-4098-9d5d-b11ac0c44309"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-df7b8387-513a-4476-ac8a-4e89c52da917

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df7b8387-513a-4476-ac8a-4e89c52da917
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-410243b0a7ad","subject":"Updates","message":"First"}

--- response: 201 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-df7b8387-513a-4476-ac8a-4e89c52da917
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
Location: /v1/conversations/cnv_48719a8b-799a-4043-a4fc-bf805db06df9
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_48719a8b-799a-4043-a4fc-bf805db06df9","subject":"Updates","status":"open","region":"eu","participants":["qa-b3fcb8a0369a","qa-410243b0a7ad"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:25.489858944Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_48719a8b-799a-4043-a4fc-bf805db06df9/messages
correlation: qa-621e358f-6519-4872-90f5-2f85fc97556a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-621e358f-6519-4872-90f5-2f85fc97556a
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-621e358f-6519-4872-90f5-2f85fc97556a
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

{"id":"msg_1427f4f4-f9fa-4639-a4ce-0cc2c4778fed","conversationId":"cnv_48719a8b-799a-4043-a4fc-bf805db06df9","sender":"qa-b3fcb8a0369a","body":"Second","createdAt":"2026-11-01T09:23:25.515285704Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eed38cbc-ac5b-4841-899b-027c64e31234

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eed38cbc-ac5b-4841-899b-027c64e31234
Content-Type: application/json

--- request body ---
{"handle":"qa-410243b0a7ad","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-eed38cbc-ac5b-4841-899b-027c64e31234
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d9b0c2c0-9665-4936-9887-fb269aa856e6"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_48719a8b-799a-4043-a4fc-bf805db06df9
correlation: qa-c25d60aa-e69b-4345-a795-65b4dd9e138b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c25d60aa-e69b-4345-a795-65b4dd9e138b
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-c25d60aa-e69b-4345-a795-65b4dd9e138b
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

{"id":"cnv_48719a8b-799a-4043-a4fc-bf805db06df9","subject":"Updates","status":"open","region":"eu","participants":["qa-b3fcb8a0369a","qa-410243b0a7ad"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-01T09:23:25.489858944Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_48719a8b-799a-4043-a4fc-bf805db06df9/read
correlation: qa-4ff35252-da0f-438e-b546-807b1c9e8dc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ff35252-da0f-438e-b546-807b1c9e8dc0
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ff35252-da0f-438e-b546-807b1c9e8dc0
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

{"conversationId":"cnv_48719a8b-799a-4043-a4fc-bf805db06df9","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_48719a8b-799a-4043-a4fc-bf805db06df9
correlation: qa-165680e9-be37-407c-8442-cd0a37f0ad30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-165680e9-be37-407c-8442-cd0a37f0ad30
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-165680e9-be37-407c-8442-cd0a37f0ad30
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

{"id":"cnv_48719a8b-799a-4043-a4fc-bf805db06df9","subject":"Updates","status":"open","region":"eu","participants":["qa-b3fcb8a0369a","qa-410243b0a7ad"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-01T09:23:25.489858944Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf7b07f8-b1d9-4740-8f43-8b029ce72fc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf7b07f8-b1d9-4740-8f43-8b029ce72fc5
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf7b07f8-b1d9-4740-8f43-8b029ce72fc5
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
correlation: qa-a93aa289-bde3-4cf5-90e0-57e108b61a6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a93aa289-bde3-4cf5-90e0-57e108b61a6d
Content-Type: application/json

--- request body ---
{"handle":"qa-410243b0a7ad","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a93aa289-bde3-4cf5-90e0-57e108b61a6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a93aa289-bde3-4cf5-90e0-57e108b61a6d"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-183e1f59-57d7-4106-afb0-cee99fc308c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-183e1f59-57d7-4106-afb0-cee99fc308c7
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-183e1f59-57d7-4106-afb0-cee99fc308c7
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
correlation: qa-595ea174-5fb7-4e90-9473-1c74413adbd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-595ea174-5fb7-4e90-9473-1c74413adbd0
Content-Type: application/json

--- request body ---
{"handle":"qa-b3fcb8a0369a","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-595ea174-5fb7-4e90-9473-1c74413adbd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-595ea174-5fb7-4e90-9473-1c74413adbd0"}
```
