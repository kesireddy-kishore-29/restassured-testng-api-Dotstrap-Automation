# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-0246870e-6578-4793-b243-90cd0cab12e1` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-33c6e4eb-6902-4328-965a-766500cabea4` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-3260d694-85fb-4776-86d9-150a7b271eb9` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-48445528-8073-450e-aecc-c51944873602` |
| 5 | `GET /v1/accounts/me` | 503 | 8 | `qa-ea8db24d-370c-4040-a164-e580bff21ea8` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-f7e9d0bd-e8bb-4b22-9698-1665fd3f6690` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-06a8981d-44e1-4c22-be6c-b26fa52bb3ca` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-3d8db2d4-d5d5-4602-9e41-1634559971dc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-491ef9d8-d1d4-4ec4-ba44-4e2d478d8044` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-f7891daa-ffd5-4671-8a23-59e5522bddd5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0246870e-6578-4793-b243-90cd0cab12e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0246870e-6578-4793-b243-90cd0cab12e1
Content-Type: application/json

--- request body ---
{"handle":"qa-279bb52dd784","displayName":"QA 279bb52dd784","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-0246870e-6578-4793-b243-90cd0cab12e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-279bb52dd784
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e3556289-bd95-46e6-b780-5e7635cf7f30","handle":"qa-279bb52dd784","displayName":"QA 279bb52dd784","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.543228656Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-33c6e4eb-6902-4328-965a-766500cabea4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33c6e4eb-6902-4328-965a-766500cabea4
Content-Type: application/json

--- request body ---
{"handle":"qa-9407a182c141","displayName":"QA 9407a182c141","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-33c6e4eb-6902-4328-965a-766500cabea4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Location: /v1/accounts/qa-9407a182c141
X-Served-Region: eu
Content-Length: 181

{"id":"acc_00de9b67-eb73-4011-8ce4-642f0eac386a","handle":"qa-9407a182c141","displayName":"QA 9407a182c141","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.599621862Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3260d694-85fb-4776-86d9-150a7b271eb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3260d694-85fb-4776-86d9-150a7b271eb9
Content-Type: application/json

--- request body ---
{"handle":"qa-279bb52dd784","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-3260d694-85fb-4776-86d9-150a7b271eb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e3556289-bd95-46e6-b780-5e7635cf7f30"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-48445528-8073-450e-aecc-c51944873602

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48445528-8073-450e-aecc-c51944873602
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9407a182c141","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-48445528-8073-450e-aecc-c51944873602
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
Location: /v1/conversations/cnv_30470adf-7452-4c85-8df3-ad2ff9274b87
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_30470adf-7452-4c85-8df3-ad2ff9274b87","subject":"Error contract","status":"open","region":"eu","participants":["qa-279bb52dd784","qa-9407a182c141"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.658111400Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea8db24d-370c-4040-a164-e580bff21ea8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: ba3ca3f2-52f3-425a-9ff4-4c23cee64185
X-Correlation-Id: qa-ea8db24d-370c-4040-a164-e580bff21ea8
Content-Type: application/json

--- response: 503 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea8db24d-370c-4040-a164-e580bff21ea8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-ea8db24d-370c-4040-a164-e580bff21ea8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f7e9d0bd-e8bb-4b22-9698-1665fd3f6690

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7e9d0bd-e8bb-4b22-9698-1665fd3f6690
Content-Type: application/json

--- request body ---
{"handle":"qa-9407a182c141","password":"****"}

--- response: 200 in 43 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7e9d0bd-e8bb-4b22-9698-1665fd3f6690
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_00de9b67-eb73-4011-8ce4-642f0eac386a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-06a8981d-44e1-4c22-be6c-b26fa52bb3ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06a8981d-44e1-4c22-be6c-b26fa52bb3ca
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-06a8981d-44e1-4c22-be6c-b26fa52bb3ca
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
correlation: qa-3d8db2d4-d5d5-4602-9e41-1634559971dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d8db2d4-d5d5-4602-9e41-1634559971dc
Content-Type: application/json

--- request body ---
{"handle":"qa-9407a182c141","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d8db2d4-d5d5-4602-9e41-1634559971dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d8db2d4-d5d5-4602-9e41-1634559971dc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-491ef9d8-d1d4-4ec4-ba44-4e2d478d8044

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-491ef9d8-d1d4-4ec4-ba44-4e2d478d8044
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-491ef9d8-d1d4-4ec4-ba44-4e2d478d8044
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
correlation: qa-f7891daa-ffd5-4671-8a23-59e5522bddd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7891daa-ffd5-4671-8a23-59e5522bddd5
Content-Type: application/json

--- request body ---
{"handle":"qa-279bb52dd784","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7891daa-ffd5-4671-8a23-59e5522bddd5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f7891daa-ffd5-4671-8a23-59e5522bddd5"}
```
