# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-4205bfe2-c64f-4fb0-be02-dde0aa0e2602` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-46015d82-14d2-477f-9ff9-f54c1347e80b` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-e4d368c4-9bd0-408a-a05a-727af77d0583` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-97f2cdba-9b45-4b7a-9bbd-ddc74ca8a01a` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 9 | `qa-69eacd07-f4e3-459a-b34b-7b32ea9de32c` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-9b013640-d308-4cbe-94f4-fe65b4b1aff2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-2f2b5c3a-a49d-43e2-91c0-1183c9b191e3` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-0562ffcd-e3af-4422-a32c-b8aaf4a101ec` |
| 9 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-fc5d94de-9f78-4ae8-887f-da2a1f12e6d4` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-e51b1849-195e-438b-8235-ade056e3b27e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4205bfe2-c64f-4fb0-be02-dde0aa0e2602

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4205bfe2-c64f-4fb0-be02-dde0aa0e2602
Content-Type: application/json

--- request body ---
{"handle":"qa-a83fd4825223","displayName":"QA a83fd4825223","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4205bfe2-c64f-4fb0-be02-dde0aa0e2602
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Location: /v1/accounts/qa-a83fd4825223
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0fe11cf7-b0ec-4935-93e1-937a23e3eb2d","handle":"qa-a83fd4825223","displayName":"QA a83fd4825223","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.963026664Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-46015d82-14d2-477f-9ff9-f54c1347e80b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46015d82-14d2-477f-9ff9-f54c1347e80b
Content-Type: application/json

--- request body ---
{"handle":"qa-03505e09a9d9","displayName":"QA 03505e09a9d9","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-46015d82-14d2-477f-9ff9-f54c1347e80b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 8
Location: /v1/accounts/qa-03505e09a9d9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a23ec32c-3e0e-48ff-b8a8-5ca09534c7ec","handle":"qa-03505e09a9d9","displayName":"QA 03505e09a9d9","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.988013974Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e4d368c4-9bd0-408a-a05a-727af77d0583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4d368c4-9bd0-408a-a05a-727af77d0583
Content-Type: application/json

--- request body ---
{"handle":"qa-a83fd4825223","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4d368c4-9bd0-408a-a05a-727af77d0583
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0fe11cf7-b0ec-4935-93e1-937a23e3eb2d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-97f2cdba-9b45-4b7a-9bbd-ddc74ca8a01a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97f2cdba-9b45-4b7a-9bbd-ddc74ca8a01a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-03505e09a9d9","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-97f2cdba-9b45-4b7a-9bbd-ddc74ca8a01a
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
Location: /v1/conversations/cnv_d0c4b4cc-dbfa-438f-bc79-eaf902b4114b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d0c4b4cc-dbfa-438f-bc79-eaf902b4114b","subject":"Error contract","status":"open","region":"eu","participants":["qa-a83fd4825223","qa-03505e09a9d9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.052050260Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_d0c4b4cc-dbfa-438f-bc79-eaf902b4114b/read
correlation: qa-69eacd07-f4e3-459a-b34b-7b32ea9de32c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 0e37f3c0-4daa-478b-bfcf-ba52834420ba
X-Correlation-Id: qa-69eacd07-f4e3-459a-b34b-7b32ea9de32c
Content-Type: application/json

--- response: 503 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69eacd07-f4e3-459a-b34b-7b32ea9de32c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_d0c4b4cc-dbfa-438f-bc79-eaf902b4114b/read","correlationId":"qa-69eacd07-f4e3-459a-b34b-7b32ea9de32c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9b013640-d308-4cbe-94f4-fe65b4b1aff2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b013640-d308-4cbe-94f4-fe65b4b1aff2
Content-Type: application/json

--- request body ---
{"handle":"qa-03505e09a9d9","password":"****"}

--- response: 200 in 32 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b013640-d308-4cbe-94f4-fe65b4b1aff2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a23ec32c-3e0e-48ff-b8a8-5ca09534c7ec"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2f2b5c3a-a49d-43e2-91c0-1183c9b191e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f2b5c3a-a49d-43e2-91c0-1183c9b191e3
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2f2b5c3a-a49d-43e2-91c0-1183c9b191e3
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
correlation: qa-0562ffcd-e3af-4422-a32c-b8aaf4a101ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0562ffcd-e3af-4422-a32c-b8aaf4a101ec
Content-Type: application/json

--- request body ---
{"handle":"qa-03505e09a9d9","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0562ffcd-e3af-4422-a32c-b8aaf4a101ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0562ffcd-e3af-4422-a32c-b8aaf4a101ec"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fc5d94de-9f78-4ae8-887f-da2a1f12e6d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc5d94de-9f78-4ae8-887f-da2a1f12e6d4
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fc5d94de-9f78-4ae8-887f-da2a1f12e6d4
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
correlation: qa-e51b1849-195e-438b-8235-ade056e3b27e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e51b1849-195e-438b-8235-ade056e3b27e
Content-Type: application/json

--- request body ---
{"handle":"qa-a83fd4825223","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e51b1849-195e-438b-8235-ade056e3b27e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e51b1849-195e-438b-8235-ade056e3b27e"}
```
