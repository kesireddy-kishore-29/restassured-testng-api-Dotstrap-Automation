# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-6fb70562-5fc6-449c-b9d4-89b792ce852f` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-002f5077-c93f-4db7-9fa2-de2327f50d82` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-45416062-98fc-4bf3-8982-8eead66fc932` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-18eada29-e778-4513-8f25-12c79d9df709` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 13 | `qa-c7b28bbd-3702-4b5e-99d0-e18ca8a25ef7` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-e3e1e233-ea5f-42a1-88f2-79fe0795a4e6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-380254f4-60e0-45ad-8e94-bfa2dde22c28` |
| 8 | `POST /v1/auth/token` | 401 | 2 | `qa-f41a7d78-7096-45eb-9c05-7fa8a2e84774` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-5e6db362-2589-492c-98b5-9f93b7b563af` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-bda737c0-1d89-42fb-acef-441ccad1de82` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6fb70562-5fc6-449c-b9d4-89b792ce852f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fb70562-5fc6-449c-b9d4-89b792ce852f
Content-Type: application/json

--- request body ---
{"handle":"qa-c59260991449","displayName":"QA c59260991449","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fb70562-5fc6-449c-b9d4-89b792ce852f
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
Location: /v1/accounts/qa-c59260991449
X-Served-Region: eu
Content-Length: 181

{"id":"acc_24232d64-835c-4f69-ba42-6cf317a2db7a","handle":"qa-c59260991449","displayName":"QA c59260991449","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.649212055Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-002f5077-c93f-4db7-9fa2-de2327f50d82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-002f5077-c93f-4db7-9fa2-de2327f50d82
Content-Type: application/json

--- request body ---
{"handle":"qa-d82e0b20d24f","displayName":"QA d82e0b20d24f","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-002f5077-c93f-4db7-9fa2-de2327f50d82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 9
Location: /v1/accounts/qa-d82e0b20d24f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cba0b98e-54cb-4464-810d-623af8830ac9","handle":"qa-d82e0b20d24f","displayName":"QA d82e0b20d24f","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.683783448Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-45416062-98fc-4bf3-8982-8eead66fc932

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45416062-98fc-4bf3-8982-8eead66fc932
Content-Type: application/json

--- request body ---
{"handle":"qa-c59260991449","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-45416062-98fc-4bf3-8982-8eead66fc932
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24232d64-835c-4f69-ba42-6cf317a2db7a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-18eada29-e778-4513-8f25-12c79d9df709

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18eada29-e778-4513-8f25-12c79d9df709
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d82e0b20d24f","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-18eada29-e778-4513-8f25-12c79d9df709
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
Location: /v1/conversations/cnv_5e612681-c874-40be-8364-87ef013983c3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5e612681-c874-40be-8364-87ef013983c3","subject":"Error contract","status":"open","region":"eu","participants":["qa-c59260991449","qa-d82e0b20d24f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:02.723467311Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-c59260991449
correlation: qa-c7b28bbd-3702-4b5e-99d0-e18ca8a25ef7

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 8cb6ec49-6afc-43fa-bd64-5214c3a7c7ab
X-Correlation-Id: qa-c7b28bbd-3702-4b5e-99d0-e18ca8a25ef7
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7b28bbd-3702-4b5e-99d0-e18ca8a25ef7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-c59260991449","correlationId":"qa-c7b28bbd-3702-4b5e-99d0-e18ca8a25ef7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e3e1e233-ea5f-42a1-88f2-79fe0795a4e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3e1e233-ea5f-42a1-88f2-79fe0795a4e6
Content-Type: application/json

--- request body ---
{"handle":"qa-d82e0b20d24f","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3e1e233-ea5f-42a1-88f2-79fe0795a4e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cba0b98e-54cb-4464-810d-623af8830ac9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-380254f4-60e0-45ad-8e94-bfa2dde22c28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-380254f4-60e0-45ad-8e94-bfa2dde22c28
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-380254f4-60e0-45ad-8e94-bfa2dde22c28
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
correlation: qa-f41a7d78-7096-45eb-9c05-7fa8a2e84774

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f41a7d78-7096-45eb-9c05-7fa8a2e84774
Content-Type: application/json

--- request body ---
{"handle":"qa-d82e0b20d24f","password":"****"}

--- response: 401 in 2 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f41a7d78-7096-45eb-9c05-7fa8a2e84774
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f41a7d78-7096-45eb-9c05-7fa8a2e84774"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e6db362-2589-492c-98b5-9f93b7b563af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e6db362-2589-492c-98b5-9f93b7b563af
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e6db362-2589-492c-98b5-9f93b7b563af
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
correlation: qa-bda737c0-1d89-42fb-acef-441ccad1de82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bda737c0-1d89-42fb-acef-441ccad1de82
Content-Type: application/json

--- request body ---
{"handle":"qa-c59260991449","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bda737c0-1d89-42fb-acef-441ccad1de82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bda737c0-1d89-42fb-acef-441ccad1de82"}
```
