# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-9fadf131-bde8-4c62-8d33-633a8868e30d` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-9d479ede-56e0-4c54-b817-a612550d8735` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-01566797-0e57-476f-9813-d6687adfed76` |
| 4 | `POST /v1/conversations` | 201 | 33 | `qa-6a202b55-d82f-47e4-b57a-c311a1a6d4d2` |
| 5 | `GET /v1/credits/balance` | 503 | 23 | `qa-2a63b719-1ac4-4f8a-93e2-cf5db47dc24d` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-f7949ab8-ea46-4d6d-ac1c-a198fcdce2b6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-964b1e68-ed72-4dbd-b00c-964b77e58a1b` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-64377e3b-e4be-4514-a45a-ea9993bfd771` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-94d76f67-48c4-4949-9f39-8fcf4d5dd3a3` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-a066cc32-a70d-4add-9224-7a854307a74b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9fadf131-bde8-4c62-8d33-633a8868e30d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fadf131-bde8-4c62-8d33-633a8868e30d
Content-Type: application/json

--- request body ---
{"handle":"qa-1a9f23e253b3","displayName":"QA 1a9f23e253b3","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fadf131-bde8-4c62-8d33-633a8868e30d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 7
Location: /v1/accounts/qa-1a9f23e253b3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b9508a2a-dbff-4d2f-8981-9cd257e2f0f8","handle":"qa-1a9f23e253b3","displayName":"QA 1a9f23e253b3","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.929879991Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9d479ede-56e0-4c54-b817-a612550d8735

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d479ede-56e0-4c54-b817-a612550d8735
Content-Type: application/json

--- request body ---
{"handle":"qa-532e92823fe5","displayName":"QA 532e92823fe5","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d479ede-56e0-4c54-b817-a612550d8735
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Location: /v1/accounts/qa-532e92823fe5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f1f13dfb-ab72-4e77-9477-fce43d0bbb06","handle":"qa-532e92823fe5","displayName":"QA 532e92823fe5","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.984014801Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-01566797-0e57-476f-9813-d6687adfed76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01566797-0e57-476f-9813-d6687adfed76
Content-Type: application/json

--- request body ---
{"handle":"qa-1a9f23e253b3","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-01566797-0e57-476f-9813-d6687adfed76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b9508a2a-dbff-4d2f-8981-9cd257e2f0f8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6a202b55-d82f-47e4-b57a-c311a1a6d4d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a202b55-d82f-47e4-b57a-c311a1a6d4d2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-532e92823fe5","subject":"Error contract","message":"Hi"}

--- response: 201 in 33 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a202b55-d82f-47e4-b57a-c311a1a6d4d2
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
Location: /v1/conversations/cnv_1c9c911f-6f08-4447-9341-cbb20e929986
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1c9c911f-6f08-4447-9341-cbb20e929986","subject":"Error contract","status":"open","region":"eu","participants":["qa-1a9f23e253b3","qa-532e92823fe5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:01.072709767Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-2a63b719-1ac4-4f8a-93e2-cf5db47dc24d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 8ef33199-8125-4365-8245-9ae88609fc52
X-Correlation-Id: qa-2a63b719-1ac4-4f8a-93e2-cf5db47dc24d
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a63b719-1ac4-4f8a-93e2-cf5db47dc24d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-2a63b719-1ac4-4f8a-93e2-cf5db47dc24d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f7949ab8-ea46-4d6d-ac1c-a198fcdce2b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7949ab8-ea46-4d6d-ac1c-a198fcdce2b6
Content-Type: application/json

--- request body ---
{"handle":"qa-532e92823fe5","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7949ab8-ea46-4d6d-ac1c-a198fcdce2b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1f13dfb-ab72-4e77-9477-fce43d0bbb06"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-964b1e68-ed72-4dbd-b00c-964b77e58a1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-964b1e68-ed72-4dbd-b00c-964b77e58a1b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-964b1e68-ed72-4dbd-b00c-964b77e58a1b
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
correlation: qa-64377e3b-e4be-4514-a45a-ea9993bfd771

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64377e3b-e4be-4514-a45a-ea9993bfd771
Content-Type: application/json

--- request body ---
{"handle":"qa-532e92823fe5","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64377e3b-e4be-4514-a45a-ea9993bfd771
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-64377e3b-e4be-4514-a45a-ea9993bfd771"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-94d76f67-48c4-4949-9f39-8fcf4d5dd3a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94d76f67-48c4-4949-9f39-8fcf4d5dd3a3
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-94d76f67-48c4-4949-9f39-8fcf4d5dd3a3
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
correlation: qa-a066cc32-a70d-4add-9224-7a854307a74b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a066cc32-a70d-4add-9224-7a854307a74b
Content-Type: application/json

--- request body ---
{"handle":"qa-1a9f23e253b3","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a066cc32-a70d-4add-9224-7a854307a74b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a066cc32-a70d-4add-9224-7a854307a74b"}
```
