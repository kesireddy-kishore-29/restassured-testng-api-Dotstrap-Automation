# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-8c05ffdc-313f-4d93-b026-aac46af6dc11` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-503c8886-a604-418b-aaf0-86bb56d5138b` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-d3dae2b9-d841-4bf4-b1fb-93cf17dd405e` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-fbcd477c-2edd-440b-8b14-53cd680e6010` |
| 5 | `POST /v1/credits/purchases` | 503 | 20 | `qa-6d8ef383-5b6a-4e2c-8b08-500513b8cdd8` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-3147284a-ecd3-4f7c-b475-c411ff4988e5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-f11ce232-4a02-4d2c-a6f0-2cca2a9214cd` |
| 8 | `POST /v1/auth/token` | 401 | 50 | `qa-4dc7ce32-13c2-4a71-8057-30817b5ae06c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-8ddcad13-2363-437d-a14d-7738c01d2169` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-f551a2fd-4bbb-4575-8d07-365fa125f428` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8c05ffdc-313f-4d93-b026-aac46af6dc11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c05ffdc-313f-4d93-b026-aac46af6dc11
Content-Type: application/json

--- request body ---
{"handle":"qa-8e509313522f","displayName":"QA 8e509313522f","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c05ffdc-313f-4d93-b026-aac46af6dc11
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
Location: /v1/accounts/qa-8e509313522f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f33b134c-a0b3-4264-af8e-bfaed8c20de0","handle":"qa-8e509313522f","displayName":"QA 8e509313522f","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.325123888Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-503c8886-a604-418b-aaf0-86bb56d5138b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-503c8886-a604-418b-aaf0-86bb56d5138b
Content-Type: application/json

--- request body ---
{"handle":"qa-7f2f7b87cedd","displayName":"QA 7f2f7b87cedd","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-503c8886-a604-418b-aaf0-86bb56d5138b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 7
Location: /v1/accounts/qa-7f2f7b87cedd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d46d6720-39ce-4e87-a941-8621e2c804ae","handle":"qa-7f2f7b87cedd","displayName":"QA 7f2f7b87cedd","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.375779746Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d3dae2b9-d841-4bf4-b1fb-93cf17dd405e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3dae2b9-d841-4bf4-b1fb-93cf17dd405e
Content-Type: application/json

--- request body ---
{"handle":"qa-8e509313522f","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3dae2b9-d841-4bf4-b1fb-93cf17dd405e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f33b134c-a0b3-4264-af8e-bfaed8c20de0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fbcd477c-2edd-440b-8b14-53cd680e6010

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbcd477c-2edd-440b-8b14-53cd680e6010
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7f2f7b87cedd","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbcd477c-2edd-440b-8b14-53cd680e6010
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
Location: /v1/conversations/cnv_182f3910-918d-4f5e-b770-c345190deb6e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_182f3910-918d-4f5e-b770-c345190deb6e","subject":"Error contract","status":"open","region":"eu","participants":["qa-8e509313522f","qa-7f2f7b87cedd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.460084048Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6d8ef383-5b6a-4e2c-8b08-500513b8cdd8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-396d2d0337864cb7b07de0977a756544
X-Fault-Key: a6677023-9943-4f44-b42c-acebff91bf1c
X-Fault: unavailable-once
X-Correlation-Id: qa-6d8ef383-5b6a-4e2c-8b08-500513b8cdd8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d8ef383-5b6a-4e2c-8b08-500513b8cdd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-6d8ef383-5b6a-4e2c-8b08-500513b8cdd8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3147284a-ecd3-4f7c-b475-c411ff4988e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3147284a-ecd3-4f7c-b475-c411ff4988e5
Content-Type: application/json

--- request body ---
{"handle":"qa-7f2f7b87cedd","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3147284a-ecd3-4f7c-b475-c411ff4988e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d46d6720-39ce-4e87-a941-8621e2c804ae"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f11ce232-4a02-4d2c-a6f0-2cca2a9214cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f11ce232-4a02-4d2c-a6f0-2cca2a9214cd
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f11ce232-4a02-4d2c-a6f0-2cca2a9214cd
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
correlation: qa-4dc7ce32-13c2-4a71-8057-30817b5ae06c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dc7ce32-13c2-4a71-8057-30817b5ae06c
Content-Type: application/json

--- request body ---
{"handle":"qa-7f2f7b87cedd","password":"****"}

--- response: 401 in 50 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4dc7ce32-13c2-4a71-8057-30817b5ae06c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4dc7ce32-13c2-4a71-8057-30817b5ae06c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ddcad13-2363-437d-a14d-7738c01d2169

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ddcad13-2363-437d-a14d-7738c01d2169
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ddcad13-2363-437d-a14d-7738c01d2169
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
correlation: qa-f551a2fd-4bbb-4575-8d07-365fa125f428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f551a2fd-4bbb-4575-8d07-365fa125f428
Content-Type: application/json

--- request body ---
{"handle":"qa-8e509313522f","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f551a2fd-4bbb-4575-8d07-365fa125f428
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f551a2fd-4bbb-4575-8d07-365fa125f428"}
```
