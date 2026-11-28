# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-2c1d724a-e232-4184-b94b-0578a1828542` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-2547e053-ed7e-4015-ac1f-e318799603dc` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-701ec6ad-ea64-48cf-b905-1bed7efa1423` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-20646ebf-8f80-45ff-aef5-56eb18988a83` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 26 | `qa-06c2bb10-fa78-4ebb-8a59-81b6f275aead` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-b483c566-ce34-44d8-9ba1-7305692eab4e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-fe248ce9-4223-4c44-92cb-88a3c6644d37` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-fe606149-089c-4bc3-9ad5-c0022e85ebce` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-f0231c44-b85e-41d1-8c6a-2b1330a9bbee` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-aad762ae-1576-47f8-a0b9-af82b79025e1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2c1d724a-e232-4184-b94b-0578a1828542

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c1d724a-e232-4184-b94b-0578a1828542
Content-Type: application/json

--- request body ---
{"handle":"qa-92eb595b88c6","displayName":"QA 92eb595b88c6","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c1d724a-e232-4184-b94b-0578a1828542
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 7
Location: /v1/accounts/qa-92eb595b88c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2ebaf23b-a406-45a7-a44e-c5330bd5d1d8","handle":"qa-92eb595b88c6","displayName":"QA 92eb595b88c6","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.668794492Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2547e053-ed7e-4015-ac1f-e318799603dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2547e053-ed7e-4015-ac1f-e318799603dc
Content-Type: application/json

--- request body ---
{"handle":"qa-51b327f49a4e","displayName":"QA 51b327f49a4e","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2547e053-ed7e-4015-ac1f-e318799603dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 7
Location: /v1/accounts/qa-51b327f49a4e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_79033f1a-31c9-4130-b11b-ea82e8335a21","handle":"qa-51b327f49a4e","displayName":"QA 51b327f49a4e","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.728106853Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-701ec6ad-ea64-48cf-b905-1bed7efa1423

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-701ec6ad-ea64-48cf-b905-1bed7efa1423
Content-Type: application/json

--- request body ---
{"handle":"qa-92eb595b88c6","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-701ec6ad-ea64-48cf-b905-1bed7efa1423
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ebaf23b-a406-45a7-a44e-c5330bd5d1d8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-20646ebf-8f80-45ff-aef5-56eb18988a83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20646ebf-8f80-45ff-aef5-56eb18988a83
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-51b327f49a4e","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-20646ebf-8f80-45ff-aef5-56eb18988a83
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
Location: /v1/conversations/cnv_9beb20fc-531b-4e51-9982-cc5eb26f73b4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9beb20fc-531b-4e51-9982-cc5eb26f73b4","subject":"Error contract","status":"open","region":"eu","participants":["qa-92eb595b88c6","qa-51b327f49a4e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.803040379Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_9beb20fc-531b-4e51-9982-cc5eb26f73b4/close
correlation: qa-06c2bb10-fa78-4ebb-8a59-81b6f275aead

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 7f480782-d74d-4a05-befc-909fbc768a48
X-Correlation-Id: qa-06c2bb10-fa78-4ebb-8a59-81b6f275aead
Content-Type: application/json

--- response: 503 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06c2bb10-fa78-4ebb-8a59-81b6f275aead
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_9beb20fc-531b-4e51-9982-cc5eb26f73b4/close","correlationId":"qa-06c2bb10-fa78-4ebb-8a59-81b6f275aead"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b483c566-ce34-44d8-9ba1-7305692eab4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b483c566-ce34-44d8-9ba1-7305692eab4e
Content-Type: application/json

--- request body ---
{"handle":"qa-51b327f49a4e","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b483c566-ce34-44d8-9ba1-7305692eab4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79033f1a-31c9-4130-b11b-ea82e8335a21"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fe248ce9-4223-4c44-92cb-88a3c6644d37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe248ce9-4223-4c44-92cb-88a3c6644d37
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fe248ce9-4223-4c44-92cb-88a3c6644d37
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
correlation: qa-fe606149-089c-4bc3-9ad5-c0022e85ebce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe606149-089c-4bc3-9ad5-c0022e85ebce
Content-Type: application/json

--- request body ---
{"handle":"qa-51b327f49a4e","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe606149-089c-4bc3-9ad5-c0022e85ebce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fe606149-089c-4bc3-9ad5-c0022e85ebce"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f0231c44-b85e-41d1-8c6a-2b1330a9bbee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0231c44-b85e-41d1-8c6a-2b1330a9bbee
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f0231c44-b85e-41d1-8c6a-2b1330a9bbee
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
correlation: qa-aad762ae-1576-47f8-a0b9-af82b79025e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aad762ae-1576-47f8-a0b9-af82b79025e1
Content-Type: application/json

--- request body ---
{"handle":"qa-92eb595b88c6","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aad762ae-1576-47f8-a0b9-af82b79025e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aad762ae-1576-47f8-a0b9-af82b79025e1"}
```
