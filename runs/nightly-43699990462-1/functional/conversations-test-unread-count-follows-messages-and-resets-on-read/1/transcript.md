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
| 1 | `POST /v1/accounts` | 201 | 388 | `qa-5570ff46-afb4-4d92-a628-ae3dd4548338` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-1284bebb-e54d-4a92-82a0-77a5b4d39723` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-4107ba2c-12cb-4a9b-8cf3-700d4f607d7b` |
| 4 | `POST /v1/conversations` | 201 | 44 | `qa-7124cc4a-3c32-419f-accf-46c52c257108` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 27 | `qa-d5757dfd-e201-4796-a94d-ac150ae2bd95` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-c816a957-688a-460f-b2b1-35a2bf0e9045` |
| 7 | `GET /v1/conversations/{id}` | 200 | 20 | `qa-2af95b59-abf1-4983-b87d-80b53de18c1d` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 15 | `qa-6c997425-bc51-4de6-9ec2-7251d8773f1a` |
| 9 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-5e374859-9530-42ad-9e16-6bd87dcca189` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-5fe4d885-4e5f-48a6-aee3-e57e69c09c23` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-9ed476be-915c-470e-98dc-fe0e6fbe56d3` |
| 12 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-cfc6e5ff-5c4d-41a4-b9b9-3190148e6289` |
| 13 | `POST /v1/auth/token` | 401 | 6 | `qa-fb3c8998-c7be-4fe5-8faa-a53e28b26728` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5570ff46-afb4-4d92-a628-ae3dd4548338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5570ff46-afb4-4d92-a628-ae3dd4548338
Content-Type: application/json

--- request body ---
{"handle":"qa-e12afc3cbdf5","displayName":"QA e12afc3cbdf5","password":"****","region":"eu"}

--- response: 201 in 388 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-5570ff46-afb4-4d92-a628-ae3dd4548338
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
Location: /v1/accounts/qa-e12afc3cbdf5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4c7976b5-04c3-4799-ad9b-ff7b7441d8c7","handle":"qa-e12afc3cbdf5","displayName":"QA e12afc3cbdf5","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.433564618Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1284bebb-e54d-4a92-82a0-77a5b4d39723

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1284bebb-e54d-4a92-82a0-77a5b4d39723
Content-Type: application/json

--- request body ---
{"handle":"qa-058e49604d22","displayName":"QA 058e49604d22","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-1284bebb-e54d-4a92-82a0-77a5b4d39723
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
Location: /v1/accounts/qa-058e49604d22
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cabd5847-495e-40a8-9203-be4fe32d25c6","handle":"qa-058e49604d22","displayName":"QA 058e49604d22","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.822206366Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4107ba2c-12cb-4a9b-8cf3-700d4f607d7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4107ba2c-12cb-4a9b-8cf3-700d4f607d7b
Content-Type: application/json

--- request body ---
{"handle":"qa-e12afc3cbdf5","password":"****"}

--- response: 200 in 46 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-4107ba2c-12cb-4a9b-8cf3-700d4f607d7b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4c7976b5-04c3-4799-ad9b-ff7b7441d8c7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7124cc4a-3c32-419f-accf-46c52c257108

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7124cc4a-3c32-419f-accf-46c52c257108
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-058e49604d22","subject":"Updates","message":"First"}

--- response: 201 in 44 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7124cc4a-3c32-419f-accf-46c52c257108
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
Location: /v1/conversations/cnv_558910a5-c612-4faf-bf00-2749e2c67b62
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_558910a5-c612-4faf-bf00-2749e2c67b62","subject":"Updates","status":"open","region":"eu","participants":["qa-e12afc3cbdf5","qa-058e49604d22"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.964750636Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_558910a5-c612-4faf-bf00-2749e2c67b62/messages
correlation: qa-d5757dfd-e201-4796-a94d-ac150ae2bd95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5757dfd-e201-4796-a94d-ac150ae2bd95
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5757dfd-e201-4796-a94d-ac150ae2bd95
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

{"id":"msg_5cd58b99-9792-412c-b8d0-51d9c66313b3","conversationId":"cnv_558910a5-c612-4faf-bf00-2749e2c67b62","sender":"qa-e12afc3cbdf5","body":"Second","createdAt":"2026-11-15T09:36:10.069993908Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c816a957-688a-460f-b2b1-35a2bf0e9045

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c816a957-688a-460f-b2b1-35a2bf0e9045
Content-Type: application/json

--- request body ---
{"handle":"qa-058e49604d22","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c816a957-688a-460f-b2b1-35a2bf0e9045
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cabd5847-495e-40a8-9203-be4fe32d25c6"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_558910a5-c612-4faf-bf00-2749e2c67b62
correlation: qa-2af95b59-abf1-4983-b87d-80b53de18c1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2af95b59-abf1-4983-b87d-80b53de18c1d
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-2af95b59-abf1-4983-b87d-80b53de18c1d
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

{"id":"cnv_558910a5-c612-4faf-bf00-2749e2c67b62","subject":"Updates","status":"open","region":"eu","participants":["qa-e12afc3cbdf5","qa-058e49604d22"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-15T09:36:09.964750636Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_558910a5-c612-4faf-bf00-2749e2c67b62/read
correlation: qa-6c997425-bc51-4de6-9ec2-7251d8773f1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c997425-bc51-4de6-9ec2-7251d8773f1a
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c997425-bc51-4de6-9ec2-7251d8773f1a
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

{"conversationId":"cnv_558910a5-c612-4faf-bf00-2749e2c67b62","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_558910a5-c612-4faf-bf00-2749e2c67b62
correlation: qa-5e374859-9530-42ad-9e16-6bd87dcca189

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e374859-9530-42ad-9e16-6bd87dcca189
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e374859-9530-42ad-9e16-6bd87dcca189
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

{"id":"cnv_558910a5-c612-4faf-bf00-2749e2c67b62","subject":"Updates","status":"open","region":"eu","participants":["qa-e12afc3cbdf5","qa-058e49604d22"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.964750636Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5fe4d885-4e5f-48a6-aee3-e57e69c09c23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fe4d885-4e5f-48a6-aee3-e57e69c09c23
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5fe4d885-4e5f-48a6-aee3-e57e69c09c23
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
correlation: qa-9ed476be-915c-470e-98dc-fe0e6fbe56d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ed476be-915c-470e-98dc-fe0e6fbe56d3
Content-Type: application/json

--- request body ---
{"handle":"qa-058e49604d22","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ed476be-915c-470e-98dc-fe0e6fbe56d3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9ed476be-915c-470e-98dc-fe0e6fbe56d3"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cfc6e5ff-5c4d-41a4-b9b9-3190148e6289

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfc6e5ff-5c4d-41a4-b9b9-3190148e6289
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cfc6e5ff-5c4d-41a4-b9b9-3190148e6289
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
correlation: qa-fb3c8998-c7be-4fe5-8faa-a53e28b26728

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb3c8998-c7be-4fe5-8faa-a53e28b26728
Content-Type: application/json

--- request body ---
{"handle":"qa-e12afc3cbdf5","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb3c8998-c7be-4fe5-8faa-a53e28b26728
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fb3c8998-c7be-4fe5-8faa-a53e28b26728"}
```
