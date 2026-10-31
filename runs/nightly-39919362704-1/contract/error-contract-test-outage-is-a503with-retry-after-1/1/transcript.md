# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-6dd2edfd-0110-4824-ba19-9b2625939e35` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-976acce3-6f3e-4eee-a77c-a5f3f9a224be` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-9cc8bb44-1bb6-407d-a3d3-91ca1995801c` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-54f20809-0acd-43e1-a075-d0308ad5bd87` |
| 5 | `POST /v1/accounts` | 503 | 33 | `qa-76a71428-296e-499f-ac33-2805a95bfef6` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-8ee9ddf4-313c-4698-a00e-308ce28b0c10` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-5f361520-4de0-48f3-98d2-93b402607276` |
| 8 | `POST /v1/auth/token` | 401 | 37 | `qa-ae9d4a5d-18dc-4beb-8de7-9bf1ebafab20` |
| 9 | `DELETE /v1/accounts/me` | 204 | 77 | `qa-1a6bd110-827d-420c-82ad-9849faabb231` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-db43bab3-6ab1-449c-9cb3-6bb4fb234fc8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6dd2edfd-0110-4824-ba19-9b2625939e35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dd2edfd-0110-4824-ba19-9b2625939e35
Content-Type: application/json

--- request body ---
{"handle":"qa-89d1353b3bc8","displayName":"QA 89d1353b3bc8","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dd2edfd-0110-4824-ba19-9b2625939e35
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
Location: /v1/accounts/qa-89d1353b3bc8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e2e1b49-f589-456b-bd1a-6363fb4303f5","handle":"qa-89d1353b3bc8","displayName":"QA 89d1353b3bc8","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.756415494Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-976acce3-6f3e-4eee-a77c-a5f3f9a224be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-976acce3-6f3e-4eee-a77c-a5f3f9a224be
Content-Type: application/json

--- request body ---
{"handle":"qa-3f02d69c0d88","displayName":"QA 3f02d69c0d88","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-976acce3-6f3e-4eee-a77c-a5f3f9a224be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Location: /v1/accounts/qa-3f02d69c0d88
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1e747179-e61f-454a-bd41-791bd76cedf8","handle":"qa-3f02d69c0d88","displayName":"QA 3f02d69c0d88","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.810952110Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9cc8bb44-1bb6-407d-a3d3-91ca1995801c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cc8bb44-1bb6-407d-a3d3-91ca1995801c
Content-Type: application/json

--- request body ---
{"handle":"qa-89d1353b3bc8","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cc8bb44-1bb6-407d-a3d3-91ca1995801c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e2e1b49-f589-456b-bd1a-6363fb4303f5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-54f20809-0acd-43e1-a075-d0308ad5bd87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54f20809-0acd-43e1-a075-d0308ad5bd87
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3f02d69c0d88","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-54f20809-0acd-43e1-a075-d0308ad5bd87
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
Location: /v1/conversations/cnv_ae18d2d2-ce7e-46fc-bf55-13451f86aa28
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ae18d2d2-ce7e-46fc-bf55-13451f86aa28","subject":"Error contract","status":"open","region":"eu","participants":["qa-89d1353b3bc8","qa-3f02d69c0d88"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:43.904614114Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-76a71428-296e-499f-ac33-2805a95bfef6

--- request headers ---
Accept: application/json
X-Fault-Key: c9f3f1bc-b455-4575-bfdf-3c19bdf844e4
X-Fault: unavailable-once
X-Correlation-Id: qa-76a71428-296e-499f-ac33-2805a95bfef6
Content-Type: application/json

--- request body ---
{"handle":"qa-533c09b34b70","displayName":"QA 533c09b34b70","password":"****","region":"eu"}

--- response: 503 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76a71428-296e-499f-ac33-2805a95bfef6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-76a71428-296e-499f-ac33-2805a95bfef6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8ee9ddf4-313c-4698-a00e-308ce28b0c10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ee9ddf4-313c-4698-a00e-308ce28b0c10
Content-Type: application/json

--- request body ---
{"handle":"qa-3f02d69c0d88","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ee9ddf4-313c-4698-a00e-308ce28b0c10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1e747179-e61f-454a-bd41-791bd76cedf8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f361520-4de0-48f3-98d2-93b402607276

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f361520-4de0-48f3-98d2-93b402607276
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f361520-4de0-48f3-98d2-93b402607276
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
correlation: qa-ae9d4a5d-18dc-4beb-8de7-9bf1ebafab20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae9d4a5d-18dc-4beb-8de7-9bf1ebafab20
Content-Type: application/json

--- request body ---
{"handle":"qa-3f02d69c0d88","password":"****"}

--- response: 401 in 37 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae9d4a5d-18dc-4beb-8de7-9bf1ebafab20
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ae9d4a5d-18dc-4beb-8de7-9bf1ebafab20"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1a6bd110-827d-420c-82ad-9849faabb231

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a6bd110-827d-420c-82ad-9849faabb231
Content-Type: application/json

--- response: 204 in 77 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1a6bd110-827d-420c-82ad-9849faabb231
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
correlation: qa-db43bab3-6ab1-449c-9cb3-6bb4fb234fc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db43bab3-6ab1-449c-9cb3-6bb4fb234fc8
Content-Type: application/json

--- request body ---
{"handle":"qa-89d1353b3bc8","password":"****"}

--- response: 401 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db43bab3-6ab1-449c-9cb3-6bb4fb234fc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db43bab3-6ab1-449c-9cb3-6bb4fb234fc8"}
```
