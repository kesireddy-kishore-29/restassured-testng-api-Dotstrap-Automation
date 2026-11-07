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
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-c87161d0-8168-4add-a2c5-2c8efca77b8e` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-2f331cd4-db14-41ae-a915-ca181ad011e0` |
| 3 | `POST /v1/auth/token` | 200 | 72 | `qa-b5bae94b-cd68-43b1-8aaf-8608e299bcb0` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-ef9c5d53-2079-4937-9ab0-20c6347e0cc5` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 38 | `qa-c103dcda-3a4f-42a3-9f02-4496ef896ec3` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-f4d17172-9e30-4eda-916a-8ed94a92d588` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-08a18b47-4235-4848-987c-21847dbfc8a0` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-61e5166e-9772-4601-8d2d-f9600b5907ad` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-0d7ef6a2-1dee-4227-9674-81cc61292323` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-dcfa712b-7fdd-4c47-84b8-1045aa7b8c64` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c87161d0-8168-4add-a2c5-2c8efca77b8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c87161d0-8168-4add-a2c5-2c8efca77b8e
Content-Type: application/json

--- request body ---
{"handle":"qa-6be945a153b0","displayName":"QA 6be945a153b0","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c87161d0-8168-4add-a2c5-2c8efca77b8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Location: /v1/accounts/qa-6be945a153b0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ca7786ff-708d-4f27-93e2-320c1036837b","handle":"qa-6be945a153b0","displayName":"QA 6be945a153b0","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.983656229Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2f331cd4-db14-41ae-a915-ca181ad011e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f331cd4-db14-41ae-a915-ca181ad011e0
Content-Type: application/json

--- request body ---
{"handle":"qa-e6a32c1a82a8","displayName":"QA e6a32c1a82a8","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f331cd4-db14-41ae-a915-ca181ad011e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Location: /v1/accounts/qa-e6a32c1a82a8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1050c716-8e1e-443f-91c0-e60d4c34694c","handle":"qa-e6a32c1a82a8","displayName":"QA e6a32c1a82a8","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.038197909Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b5bae94b-cd68-43b1-8aaf-8608e299bcb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5bae94b-cd68-43b1-8aaf-8608e299bcb0
Content-Type: application/json

--- request body ---
{"handle":"qa-6be945a153b0","password":"****"}

--- response: 200 in 72 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5bae94b-cd68-43b1-8aaf-8608e299bcb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ca7786ff-708d-4f27-93e2-320c1036837b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ef9c5d53-2079-4937-9ab0-20c6347e0cc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef9c5d53-2079-4937-9ab0-20c6347e0cc5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e6a32c1a82a8","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef9c5d53-2079-4937-9ab0-20c6347e0cc5
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
Location: /v1/conversations/cnv_cdb5527c-aa94-4c45-aa86-4b8b26f7a7d6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cdb5527c-aa94-4c45-aa86-4b8b26f7a7d6","subject":"Error contract","status":"open","region":"eu","participants":["qa-6be945a153b0","qa-e6a32c1a82a8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:05.186086784Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_cdb5527c-aa94-4c45-aa86-4b8b26f7a7d6/close
correlation: qa-c103dcda-3a4f-42a3-9f02-4496ef896ec3

--- request headers ---
Accept: application/json
X-Fault-Key: 4be93e39-97a6-4b71-bca0-350b2abc4a48
X-Fault: unavailable-once
X-Correlation-Id: qa-c103dcda-3a4f-42a3-9f02-4496ef896ec3
Content-Type: application/json

--- response: 503 in 38 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c103dcda-3a4f-42a3-9f02-4496ef896ec3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_cdb5527c-aa94-4c45-aa86-4b8b26f7a7d6/close","correlationId":"qa-c103dcda-3a4f-42a3-9f02-4496ef896ec3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f4d17172-9e30-4eda-916a-8ed94a92d588

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4d17172-9e30-4eda-916a-8ed94a92d588
Content-Type: application/json

--- request body ---
{"handle":"qa-e6a32c1a82a8","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4d17172-9e30-4eda-916a-8ed94a92d588
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1050c716-8e1e-443f-91c0-e60d4c34694c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-08a18b47-4235-4848-987c-21847dbfc8a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08a18b47-4235-4848-987c-21847dbfc8a0
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-08a18b47-4235-4848-987c-21847dbfc8a0
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
correlation: qa-61e5166e-9772-4601-8d2d-f9600b5907ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61e5166e-9772-4601-8d2d-f9600b5907ad
Content-Type: application/json

--- request body ---
{"handle":"qa-e6a32c1a82a8","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61e5166e-9772-4601-8d2d-f9600b5907ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61e5166e-9772-4601-8d2d-f9600b5907ad"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0d7ef6a2-1dee-4227-9674-81cc61292323

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d7ef6a2-1dee-4227-9674-81cc61292323
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0d7ef6a2-1dee-4227-9674-81cc61292323
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
correlation: qa-dcfa712b-7fdd-4c47-84b8-1045aa7b8c64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcfa712b-7fdd-4c47-84b8-1045aa7b8c64
Content-Type: application/json

--- request body ---
{"handle":"qa-6be945a153b0","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dcfa712b-7fdd-4c47-84b8-1045aa7b8c64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dcfa712b-7fdd-4c47-84b8-1045aa7b8c64"}
```
