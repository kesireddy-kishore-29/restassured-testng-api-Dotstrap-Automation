# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-2fb7ad5c-2b25-4adb-942c-92b7a12cf8a6` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-5eba9ceb-728b-48b6-8c2f-a811e6487228` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-b3e40afb-7853-4c60-a67c-b627002b4d7d` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-9b72aa1e-d4c0-4233-ae83-f4f2836da3e5` |
| 5 | `PATCH /v1/accounts/me` | 503 | 39 | `qa-f8c47cce-1107-4646-911a-f8119099d235` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-6a08c3e4-6acf-46e6-9304-6ff2de5ef905` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-b98607b0-0a5b-43db-8d22-3d09c55599a8` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-61c6ca32-d9d8-4e4e-87db-315e15120a34` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-71562c0f-de19-4435-b1fd-f28a0a46cc3f` |
| 10 | `POST /v1/auth/token` | 401 | 32 | `qa-3919921b-c1cb-40f5-8cb8-fbfb6e3611d1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2fb7ad5c-2b25-4adb-942c-92b7a12cf8a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fb7ad5c-2b25-4adb-942c-92b7a12cf8a6
Content-Type: application/json

--- request body ---
{"handle":"qa-c4fc0f3f1c88","displayName":"QA c4fc0f3f1c88","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fb7ad5c-2b25-4adb-942c-92b7a12cf8a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Location: /v1/accounts/qa-c4fc0f3f1c88
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7b856611-dfe7-4f12-a411-9508870d6f4d","handle":"qa-c4fc0f3f1c88","displayName":"QA c4fc0f3f1c88","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.601749659Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5eba9ceb-728b-48b6-8c2f-a811e6487228

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5eba9ceb-728b-48b6-8c2f-a811e6487228
Content-Type: application/json

--- request body ---
{"handle":"qa-c62b60f6b141","displayName":"QA c62b60f6b141","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-5eba9ceb-728b-48b6-8c2f-a811e6487228
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
Location: /v1/accounts/qa-c62b60f6b141
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4f3b9927-bd7e-4b0f-88ea-6ee142a6d9bb","handle":"qa-c62b60f6b141","displayName":"QA c62b60f6b141","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.656854656Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b3e40afb-7853-4c60-a67c-b627002b4d7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3e40afb-7853-4c60-a67c-b627002b4d7d
Content-Type: application/json

--- request body ---
{"handle":"qa-c4fc0f3f1c88","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3e40afb-7853-4c60-a67c-b627002b4d7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7b856611-dfe7-4f12-a411-9508870d6f4d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9b72aa1e-d4c0-4233-ae83-f4f2836da3e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b72aa1e-d4c0-4233-ae83-f4f2836da3e5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c62b60f6b141","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b72aa1e-d4c0-4233-ae83-f4f2836da3e5
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
Location: /v1/conversations/cnv_65d1b1dd-07a5-4c51-9d28-0e7147433323
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_65d1b1dd-07a5-4c51-9d28-0e7147433323","subject":"Error contract","status":"open","region":"eu","participants":["qa-c4fc0f3f1c88","qa-c62b60f6b141"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.732248669Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-f8c47cce-1107-4646-911a-f8119099d235

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9e834ce2-3126-4572-9ec0-3a3e1fee596f
X-Correlation-Id: qa-f8c47cce-1107-4646-911a-f8119099d235
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 39 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8c47cce-1107-4646-911a-f8119099d235
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-f8c47cce-1107-4646-911a-f8119099d235"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6a08c3e4-6acf-46e6-9304-6ff2de5ef905

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a08c3e4-6acf-46e6-9304-6ff2de5ef905
Content-Type: application/json

--- request body ---
{"handle":"qa-c62b60f6b141","password":"****"}

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a08c3e4-6acf-46e6-9304-6ff2de5ef905
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4f3b9927-bd7e-4b0f-88ea-6ee142a6d9bb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b98607b0-0a5b-43db-8d22-3d09c55599a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b98607b0-0a5b-43db-8d22-3d09c55599a8
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b98607b0-0a5b-43db-8d22-3d09c55599a8
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
correlation: qa-61c6ca32-d9d8-4e4e-87db-315e15120a34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61c6ca32-d9d8-4e4e-87db-315e15120a34
Content-Type: application/json

--- request body ---
{"handle":"qa-c62b60f6b141","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61c6ca32-d9d8-4e4e-87db-315e15120a34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61c6ca32-d9d8-4e4e-87db-315e15120a34"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-71562c0f-de19-4435-b1fd-f28a0a46cc3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71562c0f-de19-4435-b1fd-f28a0a46cc3f
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-71562c0f-de19-4435-b1fd-f28a0a46cc3f
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
correlation: qa-3919921b-c1cb-40f5-8cb8-fbfb6e3611d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3919921b-c1cb-40f5-8cb8-fbfb6e3611d1
Content-Type: application/json

--- request body ---
{"handle":"qa-c4fc0f3f1c88","password":"****"}

--- response: 401 in 32 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3919921b-c1cb-40f5-8cb8-fbfb6e3611d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3919921b-c1cb-40f5-8cb8-fbfb6e3611d1"}
```
