# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-df1e1ac1-7d0b-4eae-bc81-dfbaf0d0c8c6` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-3798dcc7-6453-4fd8-85e9-80ce2f6c61fa` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-646d8fc0-7a09-45d4-9540-dd13dfc9c056` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-14ca4120-5eeb-49ed-a904-bd07e1afda18` |
| 5 | `DELETE /v1/accounts/me` | 503 | 6 | `qa-c8a555c7-2b71-4676-90d5-832743a90c51` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-266f192b-d7eb-45ea-b8c5-42a2ac1ad190` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-56a74860-f41e-44e2-9798-699be7acdd0c` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-6baffdc5-a878-42ea-b3d8-efc897a6f1ea` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-733d8d72-0d68-487e-8cab-555f2d443cff` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-5b98d5a4-07b4-47e2-b474-f5b318aec9c6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-df1e1ac1-7d0b-4eae-bc81-dfbaf0d0c8c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df1e1ac1-7d0b-4eae-bc81-dfbaf0d0c8c6
Content-Type: application/json

--- request body ---
{"handle":"qa-b6c62a552dd8","displayName":"QA b6c62a552dd8","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-df1e1ac1-7d0b-4eae-bc81-dfbaf0d0c8c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 9
Location: /v1/accounts/qa-b6c62a552dd8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4409edd2-59d7-4e98-b494-404d1e31b3c5","handle":"qa-b6c62a552dd8","displayName":"QA b6c62a552dd8","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.635526429Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3798dcc7-6453-4fd8-85e9-80ce2f6c61fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3798dcc7-6453-4fd8-85e9-80ce2f6c61fa
Content-Type: application/json

--- request body ---
{"handle":"qa-ae8be2f56578","displayName":"QA ae8be2f56578","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3798dcc7-6453-4fd8-85e9-80ce2f6c61fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 9
Location: /v1/accounts/qa-ae8be2f56578
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e1c92e3a-518d-4502-b34e-98fce43337a2","handle":"qa-ae8be2f56578","displayName":"QA ae8be2f56578","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.671075929Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-646d8fc0-7a09-45d4-9540-dd13dfc9c056

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-646d8fc0-7a09-45d4-9540-dd13dfc9c056
Content-Type: application/json

--- request body ---
{"handle":"qa-b6c62a552dd8","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-646d8fc0-7a09-45d4-9540-dd13dfc9c056
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4409edd2-59d7-4e98-b494-404d1e31b3c5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-14ca4120-5eeb-49ed-a904-bd07e1afda18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14ca4120-5eeb-49ed-a904-bd07e1afda18
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ae8be2f56578","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-14ca4120-5eeb-49ed-a904-bd07e1afda18
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
Location: /v1/conversations/cnv_72ae4c2d-ab9f-4b91-9fcb-7b0da6bee68b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_72ae4c2d-ab9f-4b91-9fcb-7b0da6bee68b","subject":"Error contract","status":"open","region":"eu","participants":["qa-b6c62a552dd8","qa-ae8be2f56578"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:02.732106466Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c8a555c7-2b71-4676-90d5-832743a90c51

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 78b0ac4c-12bd-41b4-a593-005c88444a75
X-Correlation-Id: qa-c8a555c7-2b71-4676-90d5-832743a90c51
Content-Type: application/json

--- response: 503 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8a555c7-2b71-4676-90d5-832743a90c51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-c8a555c7-2b71-4676-90d5-832743a90c51"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-266f192b-d7eb-45ea-b8c5-42a2ac1ad190

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-266f192b-d7eb-45ea-b8c5-42a2ac1ad190
Content-Type: application/json

--- request body ---
{"handle":"qa-ae8be2f56578","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-266f192b-d7eb-45ea-b8c5-42a2ac1ad190
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e1c92e3a-518d-4502-b34e-98fce43337a2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-56a74860-f41e-44e2-9798-699be7acdd0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56a74860-f41e-44e2-9798-699be7acdd0c
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-56a74860-f41e-44e2-9798-699be7acdd0c
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
correlation: qa-6baffdc5-a878-42ea-b3d8-efc897a6f1ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6baffdc5-a878-42ea-b3d8-efc897a6f1ea
Content-Type: application/json

--- request body ---
{"handle":"qa-ae8be2f56578","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6baffdc5-a878-42ea-b3d8-efc897a6f1ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6baffdc5-a878-42ea-b3d8-efc897a6f1ea"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-733d8d72-0d68-487e-8cab-555f2d443cff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-733d8d72-0d68-487e-8cab-555f2d443cff
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-733d8d72-0d68-487e-8cab-555f2d443cff
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5b98d5a4-07b4-47e2-b474-f5b318aec9c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b98d5a4-07b4-47e2-b474-f5b318aec9c6
Content-Type: application/json

--- request body ---
{"handle":"qa-b6c62a552dd8","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b98d5a4-07b4-47e2-b474-f5b318aec9c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b98d5a4-07b4-47e2-b474-f5b318aec9c6"}
```
