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
| 1 | `POST /v1/accounts` | 201 | 59 | `qa-f9e389cb-cfcb-4d1f-bf26-8a68a9b9ea50` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-5e6f5abc-aa1c-4ec3-97a1-c5c69c0abaa3` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-39c4a9e6-d6cb-494e-af14-0eae469c3f02` |
| 4 | `POST /v1/conversations` | 201 | 44 | `qa-04379704-9824-4212-8512-840234f8f078` |
| 5 | `DELETE /v1/accounts/me` | 503 | 36 | `qa-574cdb44-2b26-4340-977e-1c8952f43020` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-d92cfb4e-5aad-49f8-9d14-a4e20f84c773` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-24a9f04f-5293-4e06-a16e-753272feb873` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-113b0365-3566-4888-8d37-ba263d436e7c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-6845b052-2d97-430f-9987-abdabd9888eb` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-97bee3bc-0649-4ed4-80d8-b1553f944913` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f9e389cb-cfcb-4d1f-bf26-8a68a9b9ea50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9e389cb-cfcb-4d1f-bf26-8a68a9b9ea50
Content-Type: application/json

--- request body ---
{"handle":"qa-4c98dc5105cd","displayName":"QA 4c98dc5105cd","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9e389cb-cfcb-4d1f-bf26-8a68a9b9ea50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Location: /v1/accounts/qa-4c98dc5105cd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2c16e2f3-7e78-43b2-a8ac-ca1f111b3063","handle":"qa-4c98dc5105cd","displayName":"QA 4c98dc5105cd","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.213856627Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5e6f5abc-aa1c-4ec3-97a1-c5c69c0abaa3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e6f5abc-aa1c-4ec3-97a1-c5c69c0abaa3
Content-Type: application/json

--- request body ---
{"handle":"qa-55c3cc72fd9e","displayName":"QA 55c3cc72fd9e","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e6f5abc-aa1c-4ec3-97a1-c5c69c0abaa3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Location: /v1/accounts/qa-55c3cc72fd9e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c96d92b4-c802-401c-accf-27d2240f46a3","handle":"qa-55c3cc72fd9e","displayName":"QA 55c3cc72fd9e","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.290724051Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-39c4a9e6-d6cb-494e-af14-0eae469c3f02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39c4a9e6-d6cb-494e-af14-0eae469c3f02
Content-Type: application/json

--- request body ---
{"handle":"qa-4c98dc5105cd","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-39c4a9e6-d6cb-494e-af14-0eae469c3f02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2c16e2f3-7e78-43b2-a8ac-ca1f111b3063"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-04379704-9824-4212-8512-840234f8f078

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04379704-9824-4212-8512-840234f8f078
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-55c3cc72fd9e","subject":"Error contract","message":"Hi"}

--- response: 201 in 44 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-04379704-9824-4212-8512-840234f8f078
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
Location: /v1/conversations/cnv_eca70743-8369-4b1e-8e62-4f30c7244197
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_eca70743-8369-4b1e-8e62-4f30c7244197","subject":"Error contract","status":"open","region":"eu","participants":["qa-4c98dc5105cd","qa-55c3cc72fd9e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:24.422519112Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-574cdb44-2b26-4340-977e-1c8952f43020

--- request headers ---
Accept: application/json
X-Fault-Key: 0384cfc5-04e0-4fdc-b1d0-eb396699e82e
X-Fault: unavailable-once
X-Correlation-Id: qa-574cdb44-2b26-4340-977e-1c8952f43020
Content-Type: application/json

--- response: 503 in 36 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-574cdb44-2b26-4340-977e-1c8952f43020
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-574cdb44-2b26-4340-977e-1c8952f43020"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d92cfb4e-5aad-49f8-9d14-a4e20f84c773

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d92cfb4e-5aad-49f8-9d14-a4e20f84c773
Content-Type: application/json

--- request body ---
{"handle":"qa-55c3cc72fd9e","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d92cfb4e-5aad-49f8-9d14-a4e20f84c773
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c96d92b4-c802-401c-accf-27d2240f46a3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-24a9f04f-5293-4e06-a16e-753272feb873

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24a9f04f-5293-4e06-a16e-753272feb873
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-24a9f04f-5293-4e06-a16e-753272feb873
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
correlation: qa-113b0365-3566-4888-8d37-ba263d436e7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-113b0365-3566-4888-8d37-ba263d436e7c
Content-Type: application/json

--- request body ---
{"handle":"qa-55c3cc72fd9e","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-113b0365-3566-4888-8d37-ba263d436e7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-113b0365-3566-4888-8d37-ba263d436e7c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6845b052-2d97-430f-9987-abdabd9888eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6845b052-2d97-430f-9987-abdabd9888eb
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6845b052-2d97-430f-9987-abdabd9888eb
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
correlation: qa-97bee3bc-0649-4ed4-80d8-b1553f944913

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97bee3bc-0649-4ed4-80d8-b1553f944913
Content-Type: application/json

--- request body ---
{"handle":"qa-4c98dc5105cd","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-97bee3bc-0649-4ed4-80d8-b1553f944913
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-97bee3bc-0649-4ed4-80d8-b1553f944913"}
```
