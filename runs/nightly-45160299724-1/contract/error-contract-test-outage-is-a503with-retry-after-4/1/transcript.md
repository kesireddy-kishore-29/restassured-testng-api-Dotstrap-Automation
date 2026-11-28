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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-04ce93af-2ea9-47c4-8caa-4ebd8c302341` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-8ccd9326-bad6-4d01-932c-0cc80568acae` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-28768a2a-2a75-4124-9028-b0e5a69988af` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-4eac1c99-0f0f-4e59-a039-028c87fce576` |
| 5 | `DELETE /v1/accounts/me` | 503 | 43 | `qa-b2f6bfb5-eac1-43e3-b7c9-b1bc543b5b5d` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-a10052eb-90b7-4d29-8dc8-0e4314597c3e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-29024107-4c82-453c-9433-4e83156c9647` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-1a467123-77c6-4c3e-86cc-c45a4ab998c6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-ec872a99-cf82-4622-9eb3-0a73169d745c` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-2048231f-cf06-4267-8b8f-7d4b483d1ddf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-04ce93af-2ea9-47c4-8caa-4ebd8c302341

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04ce93af-2ea9-47c4-8caa-4ebd8c302341
Content-Type: application/json

--- request body ---
{"handle":"qa-88fcb6ed19a1","displayName":"QA 88fcb6ed19a1","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-04ce93af-2ea9-47c4-8caa-4ebd8c302341
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 9
Location: /v1/accounts/qa-88fcb6ed19a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6f6b24c0-1799-4ace-acee-4125e1d601e2","handle":"qa-88fcb6ed19a1","displayName":"QA 88fcb6ed19a1","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.803351091Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8ccd9326-bad6-4d01-932c-0cc80568acae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ccd9326-bad6-4d01-932c-0cc80568acae
Content-Type: application/json

--- request body ---
{"handle":"qa-3c975f6ce81f","displayName":"QA 3c975f6ce81f","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ccd9326-bad6-4d01-932c-0cc80568acae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Location: /v1/accounts/qa-3c975f6ce81f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20b4c1d2-f3ba-468e-bb5d-6c4ca0c5f2cc","handle":"qa-3c975f6ce81f","displayName":"QA 3c975f6ce81f","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.872467839Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-28768a2a-2a75-4124-9028-b0e5a69988af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28768a2a-2a75-4124-9028-b0e5a69988af
Content-Type: application/json

--- request body ---
{"handle":"qa-88fcb6ed19a1","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-28768a2a-2a75-4124-9028-b0e5a69988af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6f6b24c0-1799-4ace-acee-4125e1d601e2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4eac1c99-0f0f-4e59-a039-028c87fce576

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4eac1c99-0f0f-4e59-a039-028c87fce576
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3c975f6ce81f","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4eac1c99-0f0f-4e59-a039-028c87fce576
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
Location: /v1/conversations/cnv_825c9a1a-b7c2-42e6-b610-e4f4b1e7c741
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_825c9a1a-b7c2-42e6-b610-e4f4b1e7c741","subject":"Error contract","status":"open","region":"eu","participants":["qa-88fcb6ed19a1","qa-3c975f6ce81f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:58.933908737Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b2f6bfb5-eac1-43e3-b7c9-b1bc543b5b5d

--- request headers ---
Accept: application/json
X-Fault-Key: 02d1b6c3-3a90-4db5-a0b4-bbcbe2844ec6
X-Fault: unavailable-once
X-Correlation-Id: qa-b2f6bfb5-eac1-43e3-b7c9-b1bc543b5b5d
Content-Type: application/json

--- response: 503 in 43 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2f6bfb5-eac1-43e3-b7c9-b1bc543b5b5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-b2f6bfb5-eac1-43e3-b7c9-b1bc543b5b5d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a10052eb-90b7-4d29-8dc8-0e4314597c3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a10052eb-90b7-4d29-8dc8-0e4314597c3e
Content-Type: application/json

--- request body ---
{"handle":"qa-3c975f6ce81f","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a10052eb-90b7-4d29-8dc8-0e4314597c3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20b4c1d2-f3ba-468e-bb5d-6c4ca0c5f2cc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-29024107-4c82-453c-9433-4e83156c9647

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29024107-4c82-453c-9433-4e83156c9647
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-29024107-4c82-453c-9433-4e83156c9647
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
correlation: qa-1a467123-77c6-4c3e-86cc-c45a4ab998c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a467123-77c6-4c3e-86cc-c45a4ab998c6
Content-Type: application/json

--- request body ---
{"handle":"qa-3c975f6ce81f","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a467123-77c6-4c3e-86cc-c45a4ab998c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1a467123-77c6-4c3e-86cc-c45a4ab998c6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec872a99-cf82-4622-9eb3-0a73169d745c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec872a99-cf82-4622-9eb3-0a73169d745c
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ec872a99-cf82-4622-9eb3-0a73169d745c
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
correlation: qa-2048231f-cf06-4267-8b8f-7d4b483d1ddf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2048231f-cf06-4267-8b8f-7d4b483d1ddf
Content-Type: application/json

--- request body ---
{"handle":"qa-88fcb6ed19a1","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2048231f-cf06-4267-8b8f-7d4b483d1ddf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2048231f-cf06-4267-8b8f-7d4b483d1ddf"}
```
