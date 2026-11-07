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
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-c57aad37-0d56-407f-9de5-912c280f1974` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-04d37379-3e9d-4b1a-b00d-8b27e86091f5` |
| 3 | `POST /v1/auth/token` | 200 | 64 | `qa-f90abe58-5a93-4c76-bd3f-c597faefc8c1` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-d448a68d-5fdd-470f-855a-4ae40c509ba8` |
| 5 | `DELETE /v1/accounts/me` | 503 | 33 | `qa-de0083b4-6d5b-4f16-8d22-28e8fb455921` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-1e97b4f1-4c7c-4684-a25d-763f9a0c9e89` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-ae9c215a-6312-42ca-9d3a-91f34c075790` |
| 8 | `POST /v1/auth/token` | 401 | 33 | `qa-efac1d76-d1a7-49e6-b4a4-40f6e0c4f092` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-1e5f872d-56f8-486e-93c9-10ef42f9596e` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-4c2ea51e-4a07-4904-891c-f0d9d1c87a5c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c57aad37-0d56-407f-9de5-912c280f1974

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c57aad37-0d56-407f-9de5-912c280f1974
Content-Type: application/json

--- request body ---
{"handle":"qa-a55b11c347b1","displayName":"QA a55b11c347b1","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-c57aad37-0d56-407f-9de5-912c280f1974
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Location: /v1/accounts/qa-a55b11c347b1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fef626d8-9df6-4529-938a-ea96fbcc7040","handle":"qa-a55b11c347b1","displayName":"QA a55b11c347b1","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.988511091Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-04d37379-3e9d-4b1a-b00d-8b27e86091f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04d37379-3e9d-4b1a-b00d-8b27e86091f5
Content-Type: application/json

--- request body ---
{"handle":"qa-ce7bfa57e28b","displayName":"QA ce7bfa57e28b","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-04d37379-3e9d-4b1a-b00d-8b27e86091f5
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
Location: /v1/accounts/qa-ce7bfa57e28b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5ac2ffa2-796b-4e10-ab52-3ce997afe07b","handle":"qa-ce7bfa57e28b","displayName":"QA ce7bfa57e28b","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.022492522Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f90abe58-5a93-4c76-bd3f-c597faefc8c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f90abe58-5a93-4c76-bd3f-c597faefc8c1
Content-Type: application/json

--- request body ---
{"handle":"qa-a55b11c347b1","password":"****"}

--- response: 200 in 64 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f90abe58-5a93-4c76-bd3f-c597faefc8c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fef626d8-9df6-4529-938a-ea96fbcc7040"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d448a68d-5fdd-470f-855a-4ae40c509ba8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d448a68d-5fdd-470f-855a-4ae40c509ba8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ce7bfa57e28b","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d448a68d-5fdd-470f-855a-4ae40c509ba8
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
Location: /v1/conversations/cnv_76f901ea-2fce-4fae-95e9-05d02f1bfa32
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_76f901ea-2fce-4fae-95e9-05d02f1bfa32","subject":"Error contract","status":"open","region":"eu","participants":["qa-a55b11c347b1","qa-ce7bfa57e28b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.185293550Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-de0083b4-6d5b-4f16-8d22-28e8fb455921

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b007ea89-782f-48d7-8131-b8535cf976b5
X-Correlation-Id: qa-de0083b4-6d5b-4f16-8d22-28e8fb455921
Content-Type: application/json

--- response: 503 in 33 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de0083b4-6d5b-4f16-8d22-28e8fb455921
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-de0083b4-6d5b-4f16-8d22-28e8fb455921"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1e97b4f1-4c7c-4684-a25d-763f9a0c9e89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e97b4f1-4c7c-4684-a25d-763f9a0c9e89
Content-Type: application/json

--- request body ---
{"handle":"qa-ce7bfa57e28b","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e97b4f1-4c7c-4684-a25d-763f9a0c9e89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ac2ffa2-796b-4e10-ab52-3ce997afe07b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae9c215a-6312-42ca-9d3a-91f34c075790

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae9c215a-6312-42ca-9d3a-91f34c075790
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae9c215a-6312-42ca-9d3a-91f34c075790
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
correlation: qa-efac1d76-d1a7-49e6-b4a4-40f6e0c4f092

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efac1d76-d1a7-49e6-b4a4-40f6e0c4f092
Content-Type: application/json

--- request body ---
{"handle":"qa-ce7bfa57e28b","password":"****"}

--- response: 401 in 33 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-efac1d76-d1a7-49e6-b4a4-40f6e0c4f092
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-efac1d76-d1a7-49e6-b4a4-40f6e0c4f092"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1e5f872d-56f8-486e-93c9-10ef42f9596e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e5f872d-56f8-486e-93c9-10ef42f9596e
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1e5f872d-56f8-486e-93c9-10ef42f9596e
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
correlation: qa-4c2ea51e-4a07-4904-891c-f0d9d1c87a5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c2ea51e-4a07-4904-891c-f0d9d1c87a5c
Content-Type: application/json

--- request body ---
{"handle":"qa-a55b11c347b1","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c2ea51e-4a07-4904-891c-f0d9d1c87a5c
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4c2ea51e-4a07-4904-891c-f0d9d1c87a5c"}
```
