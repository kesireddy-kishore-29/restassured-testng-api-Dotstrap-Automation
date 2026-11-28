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
| 1 | `POST /v1/accounts` | 201 | 387 | `qa-04ba5191-7bce-4f3e-956e-066965972b6a` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-4ddc0126-abf3-41a5-bae0-fd570d96df84` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-e44f7487-fb38-49a8-b93f-87bd6c9125ec` |
| 4 | `POST /v1/conversations` | 201 | 45 | `qa-6a8babab-5f60-47dc-9877-f560b3dd92d0` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 35 | `qa-4d2738fe-8bb9-4879-bc38-0d3b829778d0` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-6194e34f-32b4-45cc-aa3b-b1ea870a96c4` |
| 7 | `GET /v1/conversations/{id}` | 200 | 20 | `qa-6bbdb9fc-629a-4149-b13d-f3751481571a` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 17 | `qa-dd2fa560-9113-46c8-8b01-46a89cd5fa40` |
| 9 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-8330d67e-ae46-4509-bf67-936a27496a3a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-7fd0f772-014f-4e6f-8644-5e38a8276f8d` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-f017bffe-a7f4-45fc-8f89-a7535c7e0f5b` |
| 12 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-014e1b89-b02d-4566-9602-7a7fba81444b` |
| 13 | `POST /v1/auth/token` | 401 | 21 | `qa-eb7100ea-d239-4e83-9a72-a0f48bb6dd39` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-04ba5191-7bce-4f3e-956e-066965972b6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04ba5191-7bce-4f3e-956e-066965972b6a
Content-Type: application/json

--- request body ---
{"handle":"qa-026925ba3a70","displayName":"QA 026925ba3a70","password":"****","region":"eu"}

--- response: 201 in 387 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-04ba5191-7bce-4f3e-956e-066965972b6a
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
Location: /v1/accounts/qa-026925ba3a70
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4e8167a-3ea0-4295-a458-38d4ff200d41","handle":"qa-026925ba3a70","displayName":"QA 026925ba3a70","region":"eu","role":"user","createdAt":"2026-11-26T11:02:33.479577466Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4ddc0126-abf3-41a5-bae0-fd570d96df84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ddc0126-abf3-41a5-bae0-fd570d96df84
Content-Type: application/json

--- request body ---
{"handle":"qa-ed744fca7c88","displayName":"QA ed744fca7c88","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ddc0126-abf3-41a5-bae0-fd570d96df84
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
Location: /v1/accounts/qa-ed744fca7c88
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b234d6c-54ec-449f-b0e8-6666c40a513b","handle":"qa-ed744fca7c88","displayName":"QA ed744fca7c88","region":"eu","role":"user","createdAt":"2026-11-26T11:02:33.782249406Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e44f7487-fb38-49a8-b93f-87bd6c9125ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e44f7487-fb38-49a8-b93f-87bd6c9125ec
Content-Type: application/json

--- request body ---
{"handle":"qa-026925ba3a70","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e44f7487-fb38-49a8-b93f-87bd6c9125ec
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e4e8167a-3ea0-4295-a458-38d4ff200d41"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6a8babab-5f60-47dc-9877-f560b3dd92d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a8babab-5f60-47dc-9877-f560b3dd92d0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ed744fca7c88","subject":"Updates","message":"First"}

--- response: 201 in 45 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a8babab-5f60-47dc-9877-f560b3dd92d0
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
Location: /v1/conversations/cnv_43161d97-a6c2-4fa4-9010-0a9e24c3f67c
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_43161d97-a6c2-4fa4-9010-0a9e24c3f67c","subject":"Updates","status":"open","region":"eu","participants":["qa-026925ba3a70","qa-ed744fca7c88"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:33.888152834Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_43161d97-a6c2-4fa4-9010-0a9e24c3f67c/messages
correlation: qa-4d2738fe-8bb9-4879-bc38-0d3b829778d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d2738fe-8bb9-4879-bc38-0d3b829778d0
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 35 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d2738fe-8bb9-4879-bc38-0d3b829778d0
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

{"id":"msg_f869e653-7a4a-45ff-b3d4-9134b223d6f7","conversationId":"cnv_43161d97-a6c2-4fa4-9010-0a9e24c3f67c","sender":"qa-026925ba3a70","body":"Second","createdAt":"2026-11-26T11:02:33.978857919Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6194e34f-32b4-45cc-aa3b-b1ea870a96c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6194e34f-32b4-45cc-aa3b-b1ea870a96c4
Content-Type: application/json

--- request body ---
{"handle":"qa-ed744fca7c88","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-6194e34f-32b4-45cc-aa3b-b1ea870a96c4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b234d6c-54ec-449f-b0e8-6666c40a513b"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_43161d97-a6c2-4fa4-9010-0a9e24c3f67c
correlation: qa-6bbdb9fc-629a-4149-b13d-f3751481571a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bbdb9fc-629a-4149-b13d-f3751481571a
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bbdb9fc-629a-4149-b13d-f3751481571a
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

{"id":"cnv_43161d97-a6c2-4fa4-9010-0a9e24c3f67c","subject":"Updates","status":"open","region":"eu","participants":["qa-026925ba3a70","qa-ed744fca7c88"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-26T11:02:33.888152834Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_43161d97-a6c2-4fa4-9010-0a9e24c3f67c/read
correlation: qa-dd2fa560-9113-46c8-8b01-46a89cd5fa40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd2fa560-9113-46c8-8b01-46a89cd5fa40
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd2fa560-9113-46c8-8b01-46a89cd5fa40
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

{"conversationId":"cnv_43161d97-a6c2-4fa4-9010-0a9e24c3f67c","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_43161d97-a6c2-4fa4-9010-0a9e24c3f67c
correlation: qa-8330d67e-ae46-4509-bf67-936a27496a3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8330d67e-ae46-4509-bf67-936a27496a3a
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-8330d67e-ae46-4509-bf67-936a27496a3a
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

{"id":"cnv_43161d97-a6c2-4fa4-9010-0a9e24c3f67c","subject":"Updates","status":"open","region":"eu","participants":["qa-026925ba3a70","qa-ed744fca7c88"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-26T11:02:33.888152834Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7fd0f772-014f-4e6f-8644-5e38a8276f8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fd0f772-014f-4e6f-8644-5e38a8276f8d
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7fd0f772-014f-4e6f-8644-5e38a8276f8d
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
correlation: qa-f017bffe-a7f4-45fc-8f89-a7535c7e0f5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f017bffe-a7f4-45fc-8f89-a7535c7e0f5b
Content-Type: application/json

--- request body ---
{"handle":"qa-ed744fca7c88","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f017bffe-a7f4-45fc-8f89-a7535c7e0f5b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f017bffe-a7f4-45fc-8f89-a7535c7e0f5b"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-014e1b89-b02d-4566-9602-7a7fba81444b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-014e1b89-b02d-4566-9602-7a7fba81444b
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-014e1b89-b02d-4566-9602-7a7fba81444b
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
correlation: qa-eb7100ea-d239-4e83-9a72-a0f48bb6dd39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb7100ea-d239-4e83-9a72-a0f48bb6dd39
Content-Type: application/json

--- request body ---
{"handle":"qa-026925ba3a70","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb7100ea-d239-4e83-9a72-a0f48bb6dd39
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eb7100ea-d239-4e83-9a72-a0f48bb6dd39"}
```
