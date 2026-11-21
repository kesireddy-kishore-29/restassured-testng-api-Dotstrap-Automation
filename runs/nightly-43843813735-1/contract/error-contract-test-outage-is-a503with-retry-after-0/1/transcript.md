# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-67010754-4727-4013-9aad-c6522a6fd4ee` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-e07de39c-9031-490f-a248-47f2f7429e89` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-28a35d21-c6c2-44ed-ab94-6e2ec02e077a` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-33c4ad56-91b8-43b3-8f26-c5dd37cd0f3c` |
| 5 | `POST /v1/auth/token` | 503 | 17 | `qa-75eb9061-d13b-4f52-b43c-b0d0f4bf0c5e` |
| 6 | `POST /v1/auth/token` | 200 | 79 | `qa-e6388202-ab54-496d-b6ca-cd465ada7e2d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-3966f7c5-3a02-4bd5-bc42-5c2e9c482c0d` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-4a9e1785-f1a3-48b7-8eb2-5f43692d26a2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-43bd1210-9e54-4dbd-b120-fa489fa97e50` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-b7070715-753e-48cb-88ab-ff491f9cc815` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-67010754-4727-4013-9aad-c6522a6fd4ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67010754-4727-4013-9aad-c6522a6fd4ee
Content-Type: application/json

--- request body ---
{"handle":"qa-e6d61c8bbae9","displayName":"QA e6d61c8bbae9","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-67010754-4727-4013-9aad-c6522a6fd4ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Location: /v1/accounts/qa-e6d61c8bbae9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e7d605e-4720-468f-862c-3ed7f4f0fd9c","handle":"qa-e6d61c8bbae9","displayName":"QA e6d61c8bbae9","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.903813346Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e07de39c-9031-490f-a248-47f2f7429e89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e07de39c-9031-490f-a248-47f2f7429e89
Content-Type: application/json

--- request body ---
{"handle":"qa-824992e3c4ad","displayName":"QA 824992e3c4ad","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-e07de39c-9031-490f-a248-47f2f7429e89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-824992e3c4ad
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d8b7825a-29a8-483b-94c2-6d0a7eea5ec5","handle":"qa-824992e3c4ad","displayName":"QA 824992e3c4ad","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.952352035Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-28a35d21-c6c2-44ed-ab94-6e2ec02e077a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28a35d21-c6c2-44ed-ab94-6e2ec02e077a
Content-Type: application/json

--- request body ---
{"handle":"qa-e6d61c8bbae9","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-28a35d21-c6c2-44ed-ab94-6e2ec02e077a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e7d605e-4720-468f-862c-3ed7f4f0fd9c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-33c4ad56-91b8-43b3-8f26-c5dd37cd0f3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33c4ad56-91b8-43b3-8f26-c5dd37cd0f3c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-824992e3c4ad","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-33c4ad56-91b8-43b3-8f26-c5dd37cd0f3c
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
Location: /v1/conversations/cnv_a87c471b-8b7a-4113-a67c-60b8760f0798
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a87c471b-8b7a-4113-a67c-60b8760f0798","subject":"Error contract","status":"open","region":"eu","participants":["qa-e6d61c8bbae9","qa-824992e3c4ad"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:52.024201571Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-75eb9061-d13b-4f52-b43c-b0d0f4bf0c5e

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 4d734d42-b4d7-477c-ab4f-41beb44355cd
X-Correlation-Id: qa-75eb9061-d13b-4f52-b43c-b0d0f4bf0c5e
Content-Type: application/json

--- request body ---
{"handle":"qa-e6d61c8bbae9","password":"****"}

--- response: 503 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75eb9061-d13b-4f52-b43c-b0d0f4bf0c5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-75eb9061-d13b-4f52-b43c-b0d0f4bf0c5e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e6388202-ab54-496d-b6ca-cd465ada7e2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6388202-ab54-496d-b6ca-cd465ada7e2d
Content-Type: application/json

--- request body ---
{"handle":"qa-824992e3c4ad","password":"****"}

--- response: 200 in 79 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6388202-ab54-496d-b6ca-cd465ada7e2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d8b7825a-29a8-483b-94c2-6d0a7eea5ec5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3966f7c5-3a02-4bd5-bc42-5c2e9c482c0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3966f7c5-3a02-4bd5-bc42-5c2e9c482c0d
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3966f7c5-3a02-4bd5-bc42-5c2e9c482c0d
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
correlation: qa-4a9e1785-f1a3-48b7-8eb2-5f43692d26a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a9e1785-f1a3-48b7-8eb2-5f43692d26a2
Content-Type: application/json

--- request body ---
{"handle":"qa-824992e3c4ad","password":"****"}

--- response: 401 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a9e1785-f1a3-48b7-8eb2-5f43692d26a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a9e1785-f1a3-48b7-8eb2-5f43692d26a2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43bd1210-9e54-4dbd-b120-fa489fa97e50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43bd1210-9e54-4dbd-b120-fa489fa97e50
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43bd1210-9e54-4dbd-b120-fa489fa97e50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b7070715-753e-48cb-88ab-ff491f9cc815

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7070715-753e-48cb-88ab-ff491f9cc815
Content-Type: application/json

--- request body ---
{"handle":"qa-e6d61c8bbae9","password":"****"}

--- response: 401 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7070715-753e-48cb-88ab-ff491f9cc815
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b7070715-753e-48cb-88ab-ff491f9cc815"}
```
