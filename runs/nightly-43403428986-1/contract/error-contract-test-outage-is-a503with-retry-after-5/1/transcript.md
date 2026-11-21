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
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-0a12a99e-b6b5-476a-848a-38ed2a34f85d` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-663c6c54-ece2-47e6-8411-caef66fe6030` |
| 3 | `POST /v1/auth/token` | 200 | 60 | `qa-c463fa6a-e017-4323-92d9-aed07438104e` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-ce9bf069-b65b-436b-993b-6a47f2c8db9c` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 15 | `qa-0e64c4a1-6b6c-40e0-b937-7378ef7eee28` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-e0b37b25-474f-4e5d-bbf9-2c908652abd9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-e9673867-ddad-4173-babc-1e12621cce91` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-19a52228-32ef-4d86-8146-01c44986145c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-8805b5c6-3817-4078-9b62-cf957bfe310b` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-2a27c3cc-d55e-48f2-a080-275e59ed521a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0a12a99e-b6b5-476a-848a-38ed2a34f85d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a12a99e-b6b5-476a-848a-38ed2a34f85d
Content-Type: application/json

--- request body ---
{"handle":"qa-b48a2adf1a46","displayName":"QA b48a2adf1a46","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a12a99e-b6b5-476a-848a-38ed2a34f85d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-b48a2adf1a46
X-Served-Region: eu
Content-Length: 181

{"id":"acc_71d6cec0-8873-4be0-ab11-b1ab61e67aa8","handle":"qa-b48a2adf1a46","displayName":"QA b48a2adf1a46","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.022442369Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-663c6c54-ece2-47e6-8411-caef66fe6030

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-663c6c54-ece2-47e6-8411-caef66fe6030
Content-Type: application/json

--- request body ---
{"handle":"qa-b4cd6627d2da","displayName":"QA b4cd6627d2da","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-663c6c54-ece2-47e6-8411-caef66fe6030
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Location: /v1/accounts/qa-b4cd6627d2da
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7601cd7d-f2af-446a-9ee5-fc2dbf90886e","handle":"qa-b4cd6627d2da","displayName":"QA b4cd6627d2da","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.062682835Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c463fa6a-e017-4323-92d9-aed07438104e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c463fa6a-e017-4323-92d9-aed07438104e
Content-Type: application/json

--- request body ---
{"handle":"qa-b48a2adf1a46","password":"****"}

--- response: 200 in 60 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c463fa6a-e017-4323-92d9-aed07438104e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_71d6cec0-8873-4be0-ab11-b1ab61e67aa8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ce9bf069-b65b-436b-993b-6a47f2c8db9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce9bf069-b65b-436b-993b-6a47f2c8db9c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b4cd6627d2da","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce9bf069-b65b-436b-993b-6a47f2c8db9c
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
Location: /v1/conversations/cnv_f6949696-cb12-47fa-8806-32fd7bd55e78
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f6949696-cb12-47fa-8806-32fd7bd55e78","subject":"Error contract","status":"open","region":"eu","participants":["qa-b48a2adf1a46","qa-b4cd6627d2da"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.186884133Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-b48a2adf1a46
correlation: qa-0e64c4a1-6b6c-40e0-b937-7378ef7eee28

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 01675bf5-4f3a-45b4-8726-9c7f4c519fc6
X-Correlation-Id: qa-0e64c4a1-6b6c-40e0-b937-7378ef7eee28
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e64c4a1-6b6c-40e0-b937-7378ef7eee28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-b48a2adf1a46","correlationId":"qa-0e64c4a1-6b6c-40e0-b937-7378ef7eee28"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e0b37b25-474f-4e5d-bbf9-2c908652abd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0b37b25-474f-4e5d-bbf9-2c908652abd9
Content-Type: application/json

--- request body ---
{"handle":"qa-b4cd6627d2da","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0b37b25-474f-4e5d-bbf9-2c908652abd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7601cd7d-f2af-446a-9ee5-fc2dbf90886e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e9673867-ddad-4173-babc-1e12621cce91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9673867-ddad-4173-babc-1e12621cce91
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e9673867-ddad-4173-babc-1e12621cce91
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
correlation: qa-19a52228-32ef-4d86-8146-01c44986145c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19a52228-32ef-4d86-8146-01c44986145c
Content-Type: application/json

--- request body ---
{"handle":"qa-b4cd6627d2da","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19a52228-32ef-4d86-8146-01c44986145c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-19a52228-32ef-4d86-8146-01c44986145c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8805b5c6-3817-4078-9b62-cf957bfe310b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8805b5c6-3817-4078-9b62-cf957bfe310b
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8805b5c6-3817-4078-9b62-cf957bfe310b
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
correlation: qa-2a27c3cc-d55e-48f2-a080-275e59ed521a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a27c3cc-d55e-48f2-a080-275e59ed521a
Content-Type: application/json

--- request body ---
{"handle":"qa-b48a2adf1a46","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a27c3cc-d55e-48f2-a080-275e59ed521a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2a27c3cc-d55e-48f2-a080-275e59ed521a"}
```
