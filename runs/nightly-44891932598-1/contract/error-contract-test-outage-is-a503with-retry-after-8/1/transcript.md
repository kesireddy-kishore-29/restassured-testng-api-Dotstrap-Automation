# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-dff25237-d11c-4947-9839-c0bd246cccd7` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-bbfb0dba-ee79-4552-9058-456b049e67ea` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-7cfcec82-e7bd-42bf-8b00-535f5793e037` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-85fa8458-8080-4ec6-853e-727fdda2e6d6` |
| 5 | `GET /v1/conversations/{id}` | 503 | 29 | `qa-6000757c-6d53-49ac-864d-c345885d17f6` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-cfc2ccd7-40c2-46f9-bac6-ce081abca9bf` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-99fa966c-b42d-4066-a370-84f0ac9e1f69` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-9fc444e7-1545-4807-9b97-cc46d845105c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-0c0f9949-96f9-4eae-ba46-3b888dde613d` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-af5ddd3d-1edd-49bb-925f-1dafdecc2143` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dff25237-d11c-4947-9839-c0bd246cccd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dff25237-d11c-4947-9839-c0bd246cccd7
Content-Type: application/json

--- request body ---
{"handle":"qa-ed399bc70e7b","displayName":"QA ed399bc70e7b","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-dff25237-d11c-4947-9839-c0bd246cccd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 7
Location: /v1/accounts/qa-ed399bc70e7b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_89893481-0de5-4ad3-84cf-167c4b19cacf","handle":"qa-ed399bc70e7b","displayName":"QA ed399bc70e7b","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.402493605Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bbfb0dba-ee79-4552-9058-456b049e67ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbfb0dba-ee79-4552-9058-456b049e67ea
Content-Type: application/json

--- request body ---
{"handle":"qa-72cbf63dcb16","displayName":"QA 72cbf63dcb16","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbfb0dba-ee79-4552-9058-456b049e67ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 7
Location: /v1/accounts/qa-72cbf63dcb16
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3e6cbe88-e81a-4543-b152-49fb9b8b929e","handle":"qa-72cbf63dcb16","displayName":"QA 72cbf63dcb16","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.482907526Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7cfcec82-e7bd-42bf-8b00-535f5793e037

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cfcec82-e7bd-42bf-8b00-535f5793e037
Content-Type: application/json

--- request body ---
{"handle":"qa-ed399bc70e7b","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cfcec82-e7bd-42bf-8b00-535f5793e037
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_89893481-0de5-4ad3-84cf-167c4b19cacf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-85fa8458-8080-4ec6-853e-727fdda2e6d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85fa8458-8080-4ec6-853e-727fdda2e6d6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-72cbf63dcb16","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-85fa8458-8080-4ec6-853e-727fdda2e6d6
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
Location: /v1/conversations/cnv_0625f046-4578-4c31-86e9-55cb73383dfe
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0625f046-4578-4c31-86e9-55cb73383dfe","subject":"Error contract","status":"open","region":"eu","participants":["qa-ed399bc70e7b","qa-72cbf63dcb16"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.578188145Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_0625f046-4578-4c31-86e9-55cb73383dfe
correlation: qa-6000757c-6d53-49ac-864d-c345885d17f6

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9eebcd70-6fe5-4947-a5b0-81e08ad09f2e
X-Correlation-Id: qa-6000757c-6d53-49ac-864d-c345885d17f6
Content-Type: application/json

--- response: 503 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6000757c-6d53-49ac-864d-c345885d17f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_0625f046-4578-4c31-86e9-55cb73383dfe","correlationId":"qa-6000757c-6d53-49ac-864d-c345885d17f6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cfc2ccd7-40c2-46f9-bac6-ce081abca9bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfc2ccd7-40c2-46f9-bac6-ce081abca9bf
Content-Type: application/json

--- request body ---
{"handle":"qa-72cbf63dcb16","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfc2ccd7-40c2-46f9-bac6-ce081abca9bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3e6cbe88-e81a-4543-b152-49fb9b8b929e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-99fa966c-b42d-4066-a370-84f0ac9e1f69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99fa966c-b42d-4066-a370-84f0ac9e1f69
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-99fa966c-b42d-4066-a370-84f0ac9e1f69
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
correlation: qa-9fc444e7-1545-4807-9b97-cc46d845105c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fc444e7-1545-4807-9b97-cc46d845105c
Content-Type: application/json

--- request body ---
{"handle":"qa-72cbf63dcb16","password":"****"}

--- response: 401 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fc444e7-1545-4807-9b97-cc46d845105c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9fc444e7-1545-4807-9b97-cc46d845105c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c0f9949-96f9-4eae-ba46-3b888dde613d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c0f9949-96f9-4eae-ba46-3b888dde613d
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c0f9949-96f9-4eae-ba46-3b888dde613d
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
correlation: qa-af5ddd3d-1edd-49bb-925f-1dafdecc2143

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af5ddd3d-1edd-49bb-925f-1dafdecc2143
Content-Type: application/json

--- request body ---
{"handle":"qa-ed399bc70e7b","password":"****"}

--- response: 401 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af5ddd3d-1edd-49bb-925f-1dafdecc2143
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-af5ddd3d-1edd-49bb-925f-1dafdecc2143"}
```
