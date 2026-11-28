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
| 1 | `POST /v1/accounts` | 201 | 376 | `qa-c327760f-451f-42a6-8045-efbce48031f5` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-45e467aa-a24a-4e79-be35-568df20e1a9f` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-958a3132-ef9d-465d-9bab-14df07aa896a` |
| 4 | `POST /v1/conversations` | 201 | 53 | `qa-59b98adc-c57e-4e70-8f96-ab6c1f701d2a` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 44 | `qa-114373d8-0265-4b7a-b06e-0f2b34552be1` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-d9311af5-c44c-4b08-8017-dfed6a9c3da6` |
| 7 | `GET /v1/conversations/{id}` | 200 | 14 | `qa-7cb9d08e-c3da-4868-b9db-48f71c44299d` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 23 | `qa-05911452-71d6-4108-abf0-aa9f1cd83da4` |
| 9 | `GET /v1/conversations/{id}` | 200 | 16 | `qa-e2e0efb6-2026-4c70-aa59-198a148c3fe5` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-0e320652-b14c-4c30-a473-fea61f97e523` |
| 11 | `POST /v1/auth/token` | 401 | 24 | `qa-b0d13b7b-8904-499c-bccb-fce047f5709d` |
| 12 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-ef8a83a6-76da-4645-a5b8-da04fa7df193` |
| 13 | `POST /v1/auth/token` | 401 | 12 | `qa-4274d6cc-2ff9-423e-b0d3-4b133901b2bc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c327760f-451f-42a6-8045-efbce48031f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c327760f-451f-42a6-8045-efbce48031f5
Content-Type: application/json

--- request body ---
{"handle":"qa-31bb06e6092b","displayName":"QA 31bb06e6092b","password":"****","region":"eu"}

--- response: 201 in 376 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c327760f-451f-42a6-8045-efbce48031f5
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
Location: /v1/accounts/qa-31bb06e6092b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f36683e0-7d72-4c9a-bd19-3f7b418fd94a","handle":"qa-31bb06e6092b","displayName":"QA 31bb06e6092b","region":"eu","role":"user","createdAt":"2026-11-22T09:54:53.883427228Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-45e467aa-a24a-4e79-be35-568df20e1a9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45e467aa-a24a-4e79-be35-568df20e1a9f
Content-Type: application/json

--- request body ---
{"handle":"qa-214858d640c5","displayName":"QA 214858d640c5","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-45e467aa-a24a-4e79-be35-568df20e1a9f
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
Location: /v1/accounts/qa-214858d640c5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4c23e1e-85e4-4a56-b386-6535a53f2a17","handle":"qa-214858d640c5","displayName":"QA 214858d640c5","region":"eu","role":"user","createdAt":"2026-11-22T09:54:54.322513038Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-958a3132-ef9d-465d-9bab-14df07aa896a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-958a3132-ef9d-465d-9bab-14df07aa896a
Content-Type: application/json

--- request body ---
{"handle":"qa-31bb06e6092b","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-958a3132-ef9d-465d-9bab-14df07aa896a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f36683e0-7d72-4c9a-bd19-3f7b418fd94a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-59b98adc-c57e-4e70-8f96-ab6c1f701d2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59b98adc-c57e-4e70-8f96-ab6c1f701d2a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-214858d640c5","subject":"Updates","message":"First"}

--- response: 201 in 53 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-59b98adc-c57e-4e70-8f96-ab6c1f701d2a
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
Location: /v1/conversations/cnv_5fe6b076-250e-4a1c-a87e-ec695175fa25
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_5fe6b076-250e-4a1c-a87e-ec695175fa25","subject":"Updates","status":"open","region":"eu","participants":["qa-31bb06e6092b","qa-214858d640c5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:54.480968127Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5fe6b076-250e-4a1c-a87e-ec695175fa25/messages
correlation: qa-114373d8-0265-4b7a-b06e-0f2b34552be1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-114373d8-0265-4b7a-b06e-0f2b34552be1
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 44 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-114373d8-0265-4b7a-b06e-0f2b34552be1
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

{"id":"msg_9fbec68f-55d5-49a9-b6ab-1f938a6d9b47","conversationId":"cnv_5fe6b076-250e-4a1c-a87e-ec695175fa25","sender":"qa-31bb06e6092b","body":"Second","createdAt":"2026-11-22T09:54:54.615944334Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d9311af5-c44c-4b08-8017-dfed6a9c3da6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9311af5-c44c-4b08-8017-dfed6a9c3da6
Content-Type: application/json

--- request body ---
{"handle":"qa-214858d640c5","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9311af5-c44c-4b08-8017-dfed6a9c3da6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4c23e1e-85e4-4a56-b386-6535a53f2a17"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_5fe6b076-250e-4a1c-a87e-ec695175fa25
correlation: qa-7cb9d08e-c3da-4868-b9db-48f71c44299d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cb9d08e-c3da-4868-b9db-48f71c44299d
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cb9d08e-c3da-4868-b9db-48f71c44299d
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

{"id":"cnv_5fe6b076-250e-4a1c-a87e-ec695175fa25","subject":"Updates","status":"open","region":"eu","participants":["qa-31bb06e6092b","qa-214858d640c5"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-22T09:54:54.480968127Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_5fe6b076-250e-4a1c-a87e-ec695175fa25/read
correlation: qa-05911452-71d6-4108-abf0-aa9f1cd83da4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05911452-71d6-4108-abf0-aa9f1cd83da4
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-05911452-71d6-4108-abf0-aa9f1cd83da4
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

{"conversationId":"cnv_5fe6b076-250e-4a1c-a87e-ec695175fa25","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_5fe6b076-250e-4a1c-a87e-ec695175fa25
correlation: qa-e2e0efb6-2026-4c70-aa59-198a148c3fe5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2e0efb6-2026-4c70-aa59-198a148c3fe5
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2e0efb6-2026-4c70-aa59-198a148c3fe5
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

{"id":"cnv_5fe6b076-250e-4a1c-a87e-ec695175fa25","subject":"Updates","status":"open","region":"eu","participants":["qa-31bb06e6092b","qa-214858d640c5"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-22T09:54:54.480968127Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0e320652-b14c-4c30-a473-fea61f97e523

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e320652-b14c-4c30-a473-fea61f97e523
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0e320652-b14c-4c30-a473-fea61f97e523
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
correlation: qa-b0d13b7b-8904-499c-bccb-fce047f5709d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0d13b7b-8904-499c-bccb-fce047f5709d
Content-Type: application/json

--- request body ---
{"handle":"qa-214858d640c5","password":"****"}

--- response: 401 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0d13b7b-8904-499c-bccb-fce047f5709d
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b0d13b7b-8904-499c-bccb-fce047f5709d"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef8a83a6-76da-4645-a5b8-da04fa7df193

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef8a83a6-76da-4645-a5b8-da04fa7df193
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef8a83a6-76da-4645-a5b8-da04fa7df193
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
correlation: qa-4274d6cc-2ff9-423e-b0d3-4b133901b2bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4274d6cc-2ff9-423e-b0d3-4b133901b2bc
Content-Type: application/json

--- request body ---
{"handle":"qa-31bb06e6092b","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4274d6cc-2ff9-423e-b0d3-4b133901b2bc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4274d6cc-2ff9-423e-b0d3-4b133901b2bc"}
```
