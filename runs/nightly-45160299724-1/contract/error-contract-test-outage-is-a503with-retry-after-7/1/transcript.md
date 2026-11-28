# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 80 | `qa-bd0eed59-1b31-4d5b-aa08-011e60c8402f` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-60767f88-b9e4-4b24-87e3-ec3798a30a2c` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-a603cc3f-a8c5-4d9f-8c43-832b97a937c0` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-a6ec183f-ac3a-4988-b0df-f54602e2ccc0` |
| 5 | `GET /v1/conversations` | 503 | 16 | `qa-61690857-2030-4027-b6ed-794bfc0ad281` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-117cbcc0-cf13-4d2d-b6ae-d18cd2607ad2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-cfd7445e-bf76-498b-8ef2-a20aa4891ca1` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-1c90105f-6be1-4a71-8a0d-10b6b861f88a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-fae4200a-f2a3-4d01-9096-d37db7a72579` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-081d20d8-ad08-48fd-8578-b375f2864170` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bd0eed59-1b31-4d5b-aa08-011e60c8402f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd0eed59-1b31-4d5b-aa08-011e60c8402f
Content-Type: application/json

--- request body ---
{"handle":"qa-7d6d16dd32c4","displayName":"QA 7d6d16dd32c4","password":"****","region":"eu"}

--- response: 201 in 80 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd0eed59-1b31-4d5b-aa08-011e60c8402f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-7d6d16dd32c4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_846160c8-266f-468f-ac58-800b2fb55214","handle":"qa-7d6d16dd32c4","displayName":"QA 7d6d16dd32c4","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.891456637Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-60767f88-b9e4-4b24-87e3-ec3798a30a2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60767f88-b9e4-4b24-87e3-ec3798a30a2c
Content-Type: application/json

--- request body ---
{"handle":"qa-e76b999c1bb5","displayName":"QA e76b999c1bb5","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-60767f88-b9e4-4b24-87e3-ec3798a30a2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Location: /v1/accounts/qa-e76b999c1bb5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_33d95620-7f70-4d40-8a0e-7ad2d2c544a6","handle":"qa-e76b999c1bb5","displayName":"QA e76b999c1bb5","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.946833611Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a603cc3f-a8c5-4d9f-8c43-832b97a937c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a603cc3f-a8c5-4d9f-8c43-832b97a937c0
Content-Type: application/json

--- request body ---
{"handle":"qa-7d6d16dd32c4","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a603cc3f-a8c5-4d9f-8c43-832b97a937c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_846160c8-266f-468f-ac58-800b2fb55214"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a6ec183f-ac3a-4988-b0df-f54602e2ccc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6ec183f-ac3a-4988-b0df-f54602e2ccc0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e76b999c1bb5","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6ec183f-ac3a-4988-b0df-f54602e2ccc0
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
Location: /v1/conversations/cnv_519e7ff1-058b-4b11-b4d5-db9c8bcdb127
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_519e7ff1-058b-4b11-b4d5-db9c8bcdb127","subject":"Error contract","status":"open","region":"eu","participants":["qa-7d6d16dd32c4","qa-e76b999c1bb5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.031120229Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-61690857-2030-4027-b6ed-794bfc0ad281

--- request headers ---
Accept: application/json
X-Fault-Key: 6ebfa219-f430-4f77-910e-bd8c663ebf3b
X-Fault: unavailable-once
X-Correlation-Id: qa-61690857-2030-4027-b6ed-794bfc0ad281
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61690857-2030-4027-b6ed-794bfc0ad281
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-61690857-2030-4027-b6ed-794bfc0ad281"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-117cbcc0-cf13-4d2d-b6ae-d18cd2607ad2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-117cbcc0-cf13-4d2d-b6ae-d18cd2607ad2
Content-Type: application/json

--- request body ---
{"handle":"qa-e76b999c1bb5","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-117cbcc0-cf13-4d2d-b6ae-d18cd2607ad2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_33d95620-7f70-4d40-8a0e-7ad2d2c544a6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cfd7445e-bf76-498b-8ef2-a20aa4891ca1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfd7445e-bf76-498b-8ef2-a20aa4891ca1
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cfd7445e-bf76-498b-8ef2-a20aa4891ca1
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
correlation: qa-1c90105f-6be1-4a71-8a0d-10b6b861f88a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c90105f-6be1-4a71-8a0d-10b6b861f88a
Content-Type: application/json

--- request body ---
{"handle":"qa-e76b999c1bb5","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c90105f-6be1-4a71-8a0d-10b6b861f88a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1c90105f-6be1-4a71-8a0d-10b6b861f88a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fae4200a-f2a3-4d01-9096-d37db7a72579

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fae4200a-f2a3-4d01-9096-d37db7a72579
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fae4200a-f2a3-4d01-9096-d37db7a72579
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
correlation: qa-081d20d8-ad08-48fd-8578-b375f2864170

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-081d20d8-ad08-48fd-8578-b375f2864170
Content-Type: application/json

--- request body ---
{"handle":"qa-7d6d16dd32c4","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-081d20d8-ad08-48fd-8578-b375f2864170
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-081d20d8-ad08-48fd-8578-b375f2864170"}
```
