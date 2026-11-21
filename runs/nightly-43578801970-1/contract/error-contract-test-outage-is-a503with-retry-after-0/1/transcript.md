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
| 1 | `POST /v1/accounts` | 201 | 48 | `qa-624cbf69-f19e-4ded-ba4e-3b35e2511ba2` |
| 2 | `POST /v1/accounts` | 201 | 54 | `qa-84ead6e3-543c-4e07-9b46-55d234973284` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-0f75a0ca-4689-4599-b215-3333c02b92e8` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-76618e71-ce2d-4f67-a2e0-d8f291a01407` |
| 5 | `POST /v1/auth/token` | 503 | 29 | `qa-62ea8d6a-2067-4327-8fc1-6a23b8d242a1` |
| 6 | `POST /v1/auth/token` | 200 | 64 | `qa-15a9eeb9-f265-448b-881f-bddc80678936` |
| 7 | `DELETE /v1/accounts/me` | 204 | 46 | `qa-54205c93-bfe0-4cef-8b5f-f557dbd92ac6` |
| 8 | `POST /v1/auth/token` | 401 | 42 | `qa-42056ff4-1562-4793-9be3-3083acc152b4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-3f0ed4f8-8a2c-4ca6-82e8-6c50e335326a` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-42fe062a-978c-4a7c-a726-8f14cf0a82d1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-624cbf69-f19e-4ded-ba4e-3b35e2511ba2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-624cbf69-f19e-4ded-ba4e-3b35e2511ba2
Content-Type: application/json

--- request body ---
{"handle":"qa-9bfb63899d9b","displayName":"QA 9bfb63899d9b","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-624cbf69-f19e-4ded-ba4e-3b35e2511ba2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Location: /v1/accounts/qa-9bfb63899d9b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_318f57c2-2f0e-4d9f-9d21-f06cfa642522","handle":"qa-9bfb63899d9b","displayName":"QA 9bfb63899d9b","region":"eu","role":"user","createdAt":"2026-11-14T09:05:09.991772806Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-84ead6e3-543c-4e07-9b46-55d234973284

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84ead6e3-543c-4e07-9b46-55d234973284
Content-Type: application/json

--- request body ---
{"handle":"qa-c03f374e24bf","displayName":"QA c03f374e24bf","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-84ead6e3-543c-4e07-9b46-55d234973284
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Location: /v1/accounts/qa-c03f374e24bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_add912b7-c99a-4f1a-a9bc-f1c1551a98a5","handle":"qa-c03f374e24bf","displayName":"QA c03f374e24bf","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.065306782Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0f75a0ca-4689-4599-b215-3333c02b92e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f75a0ca-4689-4599-b215-3333c02b92e8
Content-Type: application/json

--- request body ---
{"handle":"qa-9bfb63899d9b","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f75a0ca-4689-4599-b215-3333c02b92e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_318f57c2-2f0e-4d9f-9d21-f06cfa642522"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-76618e71-ce2d-4f67-a2e0-d8f291a01407

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76618e71-ce2d-4f67-a2e0-d8f291a01407
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c03f374e24bf","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-76618e71-ce2d-4f67-a2e0-d8f291a01407
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
Location: /v1/conversations/cnv_a95d63d5-cb6b-4f02-8aa5-46db75b2d1b6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a95d63d5-cb6b-4f02-8aa5-46db75b2d1b6","subject":"Error contract","status":"open","region":"eu","participants":["qa-9bfb63899d9b","qa-c03f374e24bf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:10.160978545Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-62ea8d6a-2067-4327-8fc1-6a23b8d242a1

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 201c4d95-2b12-445d-b876-aab1c8966405
X-Correlation-Id: qa-62ea8d6a-2067-4327-8fc1-6a23b8d242a1
Content-Type: application/json

--- request body ---
{"handle":"qa-9bfb63899d9b","password":"****"}

--- response: 503 in 29 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62ea8d6a-2067-4327-8fc1-6a23b8d242a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-62ea8d6a-2067-4327-8fc1-6a23b8d242a1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-15a9eeb9-f265-448b-881f-bddc80678936

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15a9eeb9-f265-448b-881f-bddc80678936
Content-Type: application/json

--- request body ---
{"handle":"qa-c03f374e24bf","password":"****"}

--- response: 200 in 64 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-15a9eeb9-f265-448b-881f-bddc80678936
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_add912b7-c99a-4f1a-a9bc-f1c1551a98a5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-54205c93-bfe0-4cef-8b5f-f557dbd92ac6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54205c93-bfe0-4cef-8b5f-f557dbd92ac6
Content-Type: application/json

--- response: 204 in 46 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-54205c93-bfe0-4cef-8b5f-f557dbd92ac6
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
correlation: qa-42056ff4-1562-4793-9be3-3083acc152b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42056ff4-1562-4793-9be3-3083acc152b4
Content-Type: application/json

--- request body ---
{"handle":"qa-c03f374e24bf","password":"****"}

--- response: 401 in 42 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42056ff4-1562-4793-9be3-3083acc152b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-42056ff4-1562-4793-9be3-3083acc152b4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f0ed4f8-8a2c-4ca6-82e8-6c50e335326a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f0ed4f8-8a2c-4ca6-82e8-6c50e335326a
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3f0ed4f8-8a2c-4ca6-82e8-6c50e335326a
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
correlation: qa-42fe062a-978c-4a7c-a726-8f14cf0a82d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42fe062a-978c-4a7c-a726-8f14cf0a82d1
Content-Type: application/json

--- request body ---
{"handle":"qa-9bfb63899d9b","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42fe062a-978c-4a7c-a726-8f14cf0a82d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-42fe062a-978c-4a7c-a726-8f14cf0a82d1"}
```
