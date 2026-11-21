# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-73377f29-68e1-4f94-b91c-4c6b2c365ef0` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-60848eaa-b1e0-4112-b6e3-10a63598c60a` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-5d6a934f-30bb-4bd6-af01-68b8f8ebd7e5` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-1a6b56ac-5234-43c9-bec3-dd96dccf4be8` |
| 5 | `POST /v1/conversations` | 503 | 14 | `qa-31d7e00a-4546-46d6-a8c4-1f5f844c5bf6` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-1e3a462f-f75b-4cee-b6f1-79e939a8b3a9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-6a9a6bef-7ca8-4ebe-b81c-b0a79d9a7dd4` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-b8fb589d-c654-4fa5-a2d1-e891f70bce66` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-cbf8c94a-2c85-42fb-b6e6-2e18fb8a5b17` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-9554a500-bb1e-4616-a2c4-3e52ca0bcf50` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-73377f29-68e1-4f94-b91c-4c6b2c365ef0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73377f29-68e1-4f94-b91c-4c6b2c365ef0
Content-Type: application/json

--- request body ---
{"handle":"qa-58c461af1f61","displayName":"QA 58c461af1f61","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-73377f29-68e1-4f94-b91c-4c6b2c365ef0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Location: /v1/accounts/qa-58c461af1f61
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c41b1f60-65d4-4bf0-8da4-ceb4cba9ef44","handle":"qa-58c461af1f61","displayName":"QA 58c461af1f61","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.478631306Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-60848eaa-b1e0-4112-b6e3-10a63598c60a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60848eaa-b1e0-4112-b6e3-10a63598c60a
Content-Type: application/json

--- request body ---
{"handle":"qa-62cbb458ebc9","displayName":"QA 62cbb458ebc9","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-60848eaa-b1e0-4112-b6e3-10a63598c60a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Location: /v1/accounts/qa-62cbb458ebc9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0d5f627b-ed36-47ba-b2f7-607ae9c0705e","handle":"qa-62cbb458ebc9","displayName":"QA 62cbb458ebc9","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.533355015Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5d6a934f-30bb-4bd6-af01-68b8f8ebd7e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d6a934f-30bb-4bd6-af01-68b8f8ebd7e5
Content-Type: application/json

--- request body ---
{"handle":"qa-58c461af1f61","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d6a934f-30bb-4bd6-af01-68b8f8ebd7e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c41b1f60-65d4-4bf0-8da4-ceb4cba9ef44"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1a6b56ac-5234-43c9-bec3-dd96dccf4be8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a6b56ac-5234-43c9-bec3-dd96dccf4be8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-62cbb458ebc9","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a6b56ac-5234-43c9-bec3-dd96dccf4be8
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
Location: /v1/conversations/cnv_32f1946a-bbd8-4b19-a47f-a2f708a360dc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_32f1946a-bbd8-4b19-a47f-a2f708a360dc","subject":"Error contract","status":"open","region":"eu","participants":["qa-58c461af1f61","qa-62cbb458ebc9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.584199501Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-31d7e00a-4546-46d6-a8c4-1f5f844c5bf6

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 66af2569-2dcf-48fc-97e7-af4d15e84064
X-Correlation-Id: qa-31d7e00a-4546-46d6-a8c4-1f5f844c5bf6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-58c461af1f61","subject":"Probe","message":"Hi"}

--- response: 503 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31d7e00a-4546-46d6-a8c4-1f5f844c5bf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-31d7e00a-4546-46d6-a8c4-1f5f844c5bf6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1e3a462f-f75b-4cee-b6f1-79e939a8b3a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e3a462f-f75b-4cee-b6f1-79e939a8b3a9
Content-Type: application/json

--- request body ---
{"handle":"qa-62cbb458ebc9","password":"****"}

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e3a462f-f75b-4cee-b6f1-79e939a8b3a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0d5f627b-ed36-47ba-b2f7-607ae9c0705e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6a9a6bef-7ca8-4ebe-b81c-b0a79d9a7dd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a9a6bef-7ca8-4ebe-b81c-b0a79d9a7dd4
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6a9a6bef-7ca8-4ebe-b81c-b0a79d9a7dd4
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
correlation: qa-b8fb589d-c654-4fa5-a2d1-e891f70bce66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8fb589d-c654-4fa5-a2d1-e891f70bce66
Content-Type: application/json

--- request body ---
{"handle":"qa-62cbb458ebc9","password":"****"}

--- response: 401 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8fb589d-c654-4fa5-a2d1-e891f70bce66
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b8fb589d-c654-4fa5-a2d1-e891f70bce66"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cbf8c94a-2c85-42fb-b6e6-2e18fb8a5b17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbf8c94a-2c85-42fb-b6e6-2e18fb8a5b17
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cbf8c94a-2c85-42fb-b6e6-2e18fb8a5b17
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
correlation: qa-9554a500-bb1e-4616-a2c4-3e52ca0bcf50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9554a500-bb1e-4616-a2c4-3e52ca0bcf50
Content-Type: application/json

--- request body ---
{"handle":"qa-58c461af1f61","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9554a500-bb1e-4616-a2c4-3e52ca0bcf50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9554a500-bb1e-4616-a2c4-3e52ca0bcf50"}
```
