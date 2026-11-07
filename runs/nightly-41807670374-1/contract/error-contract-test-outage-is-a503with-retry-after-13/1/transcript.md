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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-3526a42b-ac22-43d9-989f-6ddd520078c8` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-98bcf457-6bce-421e-b4bf-41c122f78123` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-27afded7-6025-4290-be76-7863cc33e885` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-cd0b51ed-4e4b-4c3b-8c37-cc445fe6359c` |
| 5 | `GET /v1/credits/balance` | 503 | 11 | `qa-e868791b-13b2-43e7-a077-4acc7b3aa0df` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-25fd1f73-fe60-49c8-a779-4edb2e10aacb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-1c385b02-b736-4b5c-904c-9f5e6bae992b` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-7156fa8d-5219-4236-9b72-f88b5d38aec8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-49cbe5f2-93d6-4156-9e31-9f29a7d757bd` |
| 10 | `POST /v1/auth/token` | 401 | 34 | `qa-04fe752b-6638-47f2-9ea6-c716562f9543` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3526a42b-ac22-43d9-989f-6ddd520078c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3526a42b-ac22-43d9-989f-6ddd520078c8
Content-Type: application/json

--- request body ---
{"handle":"qa-69bc879aeb28","displayName":"QA 69bc879aeb28","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3526a42b-ac22-43d9-989f-6ddd520078c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 8
Location: /v1/accounts/qa-69bc879aeb28
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b95997b2-ee94-4f2d-a264-b5e9288dcbf1","handle":"qa-69bc879aeb28","displayName":"QA 69bc879aeb28","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.220892126Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-98bcf457-6bce-421e-b4bf-41c122f78123

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98bcf457-6bce-421e-b4bf-41c122f78123
Content-Type: application/json

--- request body ---
{"handle":"qa-360210bacc1d","displayName":"QA 360210bacc1d","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-98bcf457-6bce-421e-b4bf-41c122f78123
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 8
Location: /v1/accounts/qa-360210bacc1d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_04c6696e-1321-4a77-b307-4dc810a8e055","handle":"qa-360210bacc1d","displayName":"QA 360210bacc1d","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.237274355Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-27afded7-6025-4290-be76-7863cc33e885

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27afded7-6025-4290-be76-7863cc33e885
Content-Type: application/json

--- request body ---
{"handle":"qa-69bc879aeb28","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-27afded7-6025-4290-be76-7863cc33e885
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b95997b2-ee94-4f2d-a264-b5e9288dcbf1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cd0b51ed-4e4b-4c3b-8c37-cc445fe6359c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd0b51ed-4e4b-4c3b-8c37-cc445fe6359c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-360210bacc1d","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd0b51ed-4e4b-4c3b-8c37-cc445fe6359c
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
Location: /v1/conversations/cnv_4c585ae2-6a6d-42a0-9a91-0169f1792979
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4c585ae2-6a6d-42a0-9a91-0169f1792979","subject":"Error contract","status":"open","region":"eu","participants":["qa-69bc879aeb28","qa-360210bacc1d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:03.303396076Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-e868791b-13b2-43e7-a077-4acc7b3aa0df

--- request headers ---
Accept: application/json
X-Fault-Key: a4109cef-f360-4f8c-ad51-f36a5e45a443
X-Fault: unavailable-once
X-Correlation-Id: qa-e868791b-13b2-43e7-a077-4acc7b3aa0df
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e868791b-13b2-43e7-a077-4acc7b3aa0df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-e868791b-13b2-43e7-a077-4acc7b3aa0df"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-25fd1f73-fe60-49c8-a779-4edb2e10aacb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25fd1f73-fe60-49c8-a779-4edb2e10aacb
Content-Type: application/json

--- request body ---
{"handle":"qa-360210bacc1d","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-25fd1f73-fe60-49c8-a779-4edb2e10aacb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_04c6696e-1321-4a77-b307-4dc810a8e055"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1c385b02-b736-4b5c-904c-9f5e6bae992b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c385b02-b736-4b5c-904c-9f5e6bae992b
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1c385b02-b736-4b5c-904c-9f5e6bae992b
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
correlation: qa-7156fa8d-5219-4236-9b72-f88b5d38aec8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7156fa8d-5219-4236-9b72-f88b5d38aec8
Content-Type: application/json

--- request body ---
{"handle":"qa-360210bacc1d","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7156fa8d-5219-4236-9b72-f88b5d38aec8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7156fa8d-5219-4236-9b72-f88b5d38aec8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-49cbe5f2-93d6-4156-9e31-9f29a7d757bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49cbe5f2-93d6-4156-9e31-9f29a7d757bd
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-49cbe5f2-93d6-4156-9e31-9f29a7d757bd
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
correlation: qa-04fe752b-6638-47f2-9ea6-c716562f9543

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04fe752b-6638-47f2-9ea6-c716562f9543
Content-Type: application/json

--- request body ---
{"handle":"qa-69bc879aeb28","password":"****"}

--- response: 401 in 34 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04fe752b-6638-47f2-9ea6-c716562f9543
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-04fe752b-6638-47f2-9ea6-c716562f9543"}
```
