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
| 1 | `POST /v1/accounts` | 201 | 352 | `qa-ed94f697-01bf-4885-9627-813eb0aa6553` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-deb3c2da-58a4-4a7c-9ea7-a64af2689649` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-ccf6b249-a011-4ebf-b180-47894ae57419` |
| 4 | `POST /v1/conversations` | 201 | 71 | `qa-7938c889-7c02-4cc3-86ab-cb4c23f3805b` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 38 | `qa-6c430967-5d1b-401f-95c0-c51565abfe3a` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-534ed4eb-979b-439b-a998-88e13d416596` |
| 7 | `GET /v1/conversations/{id}` | 200 | 31 | `qa-6bdddc02-bd40-4052-8c1e-583bed2c422f` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 26 | `qa-877e26e6-68d8-4af3-9c99-0cb294be75e0` |
| 9 | `GET /v1/conversations/{id}` | 200 | 18 | `qa-16061cf0-07e8-46ec-be69-c0b6e250655d` |
| 10 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-e2a23269-ca91-43d8-9f01-87ea39a2f92c` |
| 11 | `POST /v1/auth/token` | 401 | 16 | `qa-5e9c92ba-6d87-4f56-8c3c-2c69028d6e28` |
| 12 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-4fd800b4-c2ef-40e2-8f5e-e1431e58bfe3` |
| 13 | `POST /v1/auth/token` | 401 | 13 | `qa-e1a6ac5f-e239-462f-94a7-9418244b8b2b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ed94f697-01bf-4885-9627-813eb0aa6553

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed94f697-01bf-4885-9627-813eb0aa6553
Content-Type: application/json

--- request body ---
{"handle":"qa-fbf6333836b1","displayName":"QA fbf6333836b1","password":"****","region":"eu"}

--- response: 201 in 352 ms ---
Date: Sun, 08 Nov 2026 09:09:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed94f697-01bf-4885-9627-813eb0aa6553
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-fbf6333836b1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_089b3444-e8e2-4a23-96b8-1b12f8a06945","handle":"qa-fbf6333836b1","displayName":"QA fbf6333836b1","region":"eu","role":"user","createdAt":"2026-11-08T09:09:14.342895551Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-deb3c2da-58a4-4a7c-9ea7-a64af2689649

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-deb3c2da-58a4-4a7c-9ea7-a64af2689649
Content-Type: application/json

--- request body ---
{"handle":"qa-6d7a6ed9362e","displayName":"QA 6d7a6ed9362e","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sun, 08 Nov 2026 09:09:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-deb3c2da-58a4-4a7c-9ea7-a64af2689649
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-6d7a6ed9362e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_84406b11-aa56-47cc-be8f-1c2881dc66c1","handle":"qa-6d7a6ed9362e","displayName":"QA 6d7a6ed9362e","region":"eu","role":"user","createdAt":"2026-11-08T09:09:14.825133943Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ccf6b249-a011-4ebf-b180-47894ae57419

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccf6b249-a011-4ebf-b180-47894ae57419
Content-Type: application/json

--- request body ---
{"handle":"qa-fbf6333836b1","password":"****"}

--- response: 200 in 36 ms ---
Date: Sun, 08 Nov 2026 09:09:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccf6b249-a011-4ebf-b180-47894ae57419
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_089b3444-e8e2-4a23-96b8-1b12f8a06945"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7938c889-7c02-4cc3-86ab-cb4c23f3805b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7938c889-7c02-4cc3-86ab-cb4c23f3805b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6d7a6ed9362e","subject":"Updates","message":"First"}

--- response: 201 in 71 ms ---
Date: Sun, 08 Nov 2026 09:09:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-7938c889-7c02-4cc3-86ab-cb4c23f3805b
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
Location: /v1/conversations/cnv_27cebdde-0d25-4425-8301-7b91bfb497d3
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_27cebdde-0d25-4425-8301-7b91bfb497d3","subject":"Updates","status":"open","region":"eu","participants":["qa-fbf6333836b1","qa-6d7a6ed9362e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:14.982360128Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_27cebdde-0d25-4425-8301-7b91bfb497d3/messages
correlation: qa-6c430967-5d1b-401f-95c0-c51565abfe3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c430967-5d1b-401f-95c0-c51565abfe3a
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 38 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c430967-5d1b-401f-95c0-c51565abfe3a
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

{"id":"msg_c192d02c-56fd-4d62-8509-43538cbfffa9","conversationId":"cnv_27cebdde-0d25-4425-8301-7b91bfb497d3","sender":"qa-fbf6333836b1","body":"Second","createdAt":"2026-11-08T09:09:15.133411246Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-534ed4eb-979b-439b-a998-88e13d416596

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-534ed4eb-979b-439b-a998-88e13d416596
Content-Type: application/json

--- request body ---
{"handle":"qa-6d7a6ed9362e","password":"****"}

--- response: 200 in 23 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-534ed4eb-979b-439b-a998-88e13d416596
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_84406b11-aa56-47cc-be8f-1c2881dc66c1"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_27cebdde-0d25-4425-8301-7b91bfb497d3
correlation: qa-6bdddc02-bd40-4052-8c1e-583bed2c422f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bdddc02-bd40-4052-8c1e-583bed2c422f
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bdddc02-bd40-4052-8c1e-583bed2c422f
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

{"id":"cnv_27cebdde-0d25-4425-8301-7b91bfb497d3","subject":"Updates","status":"open","region":"eu","participants":["qa-fbf6333836b1","qa-6d7a6ed9362e"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-08T09:09:14.982360128Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_27cebdde-0d25-4425-8301-7b91bfb497d3/read
correlation: qa-877e26e6-68d8-4af3-9c99-0cb294be75e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-877e26e6-68d8-4af3-9c99-0cb294be75e0
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-877e26e6-68d8-4af3-9c99-0cb294be75e0
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

{"conversationId":"cnv_27cebdde-0d25-4425-8301-7b91bfb497d3","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_27cebdde-0d25-4425-8301-7b91bfb497d3
correlation: qa-16061cf0-07e8-46ec-be69-c0b6e250655d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16061cf0-07e8-46ec-be69-c0b6e250655d
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-16061cf0-07e8-46ec-be69-c0b6e250655d
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

{"id":"cnv_27cebdde-0d25-4425-8301-7b91bfb497d3","subject":"Updates","status":"open","region":"eu","participants":["qa-fbf6333836b1","qa-6d7a6ed9362e"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-08T09:09:14.982360128Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2a23269-ca91-43d8-9f01-87ea39a2f92c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2a23269-ca91-43d8-9f01-87ea39a2f92c
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2a23269-ca91-43d8-9f01-87ea39a2f92c
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
correlation: qa-5e9c92ba-6d87-4f56-8c3c-2c69028d6e28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e9c92ba-6d87-4f56-8c3c-2c69028d6e28
Content-Type: application/json

--- request body ---
{"handle":"qa-6d7a6ed9362e","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e9c92ba-6d87-4f56-8c3c-2c69028d6e28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5e9c92ba-6d87-4f56-8c3c-2c69028d6e28"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4fd800b4-c2ef-40e2-8f5e-e1431e58bfe3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fd800b4-c2ef-40e2-8f5e-e1431e58bfe3
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4fd800b4-c2ef-40e2-8f5e-e1431e58bfe3
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
correlation: qa-e1a6ac5f-e239-462f-94a7-9418244b8b2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1a6ac5f-e239-462f-94a7-9418244b8b2b
Content-Type: application/json

--- request body ---
{"handle":"qa-fbf6333836b1","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1a6ac5f-e239-462f-94a7-9418244b8b2b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e1a6ac5f-e239-462f-94a7-9418244b8b2b"}
```
