# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-8d01695c-ffe9-4ba3-864f-89bed789de9c` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-79b65ab0-4109-47f1-a911-39ff0476a04c` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-fcf739f6-f249-4f2f-9aeb-a2976a7993f1` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-2c6645f1-a137-4753-8fdf-d63aa43df03e` |
| 5 | `POST /v1/credits/purchases` | 400 | 14 | `qa-cadeb7d5-b370-4b30-b400-5f05b36df81b` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-767d3920-0686-43c0-b3a0-241e8750028f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-9a47c595-f546-4ba3-887e-db84825bacdb` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-acff0f0f-8f4c-4869-9277-4f831c702d2f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-56b27fb1-f7ea-4722-b7c2-84faa961c8ea` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-0ba4de6d-cbf8-4e64-bb9a-a344ef8e9690` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8d01695c-ffe9-4ba3-864f-89bed789de9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d01695c-ffe9-4ba3-864f-89bed789de9c
Content-Type: application/json

--- request body ---
{"handle":"qa-2faeb4ceea37","displayName":"QA 2faeb4ceea37","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d01695c-ffe9-4ba3-864f-89bed789de9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 7
Location: /v1/accounts/qa-2faeb4ceea37
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ab927c1b-3f8f-4369-a900-f542f720f5d0","handle":"qa-2faeb4ceea37","displayName":"QA 2faeb4ceea37","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.581164909Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-79b65ab0-4109-47f1-a911-39ff0476a04c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79b65ab0-4109-47f1-a911-39ff0476a04c
Content-Type: application/json

--- request body ---
{"handle":"qa-94e5f43fa05c","displayName":"QA 94e5f43fa05c","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-79b65ab0-4109-47f1-a911-39ff0476a04c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 7
Location: /v1/accounts/qa-94e5f43fa05c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49d64e2e-e22f-461d-a0e0-ff2fca1f398d","handle":"qa-94e5f43fa05c","displayName":"QA 94e5f43fa05c","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.618690811Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fcf739f6-f249-4f2f-9aeb-a2976a7993f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcf739f6-f249-4f2f-9aeb-a2976a7993f1
Content-Type: application/json

--- request body ---
{"handle":"qa-2faeb4ceea37","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcf739f6-f249-4f2f-9aeb-a2976a7993f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ab927c1b-3f8f-4369-a900-f542f720f5d0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2c6645f1-a137-4753-8fdf-d63aa43df03e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c6645f1-a137-4753-8fdf-d63aa43df03e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-94e5f43fa05c","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c6645f1-a137-4753-8fdf-d63aa43df03e
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
Location: /v1/conversations/cnv_0b1140bb-6e3b-48e4-8571-cc1c12686e31
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0b1140bb-6e3b-48e4-8571-cc1c12686e31","subject":"Error contract","status":"open","region":"eu","participants":["qa-2faeb4ceea37","qa-94e5f43fa05c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.671770833Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-cadeb7d5-b370-4b30-b400-5f05b36df81b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6060e18274e94280bb6108cb11d38d1f
X-Correlation-Id: qa-cadeb7d5-b370-4b30-b400-5f05b36df81b
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cadeb7d5-b370-4b30-b400-5f05b36df81b
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-cadeb7d5-b370-4b30-b400-5f05b36df81b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-767d3920-0686-43c0-b3a0-241e8750028f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-767d3920-0686-43c0-b3a0-241e8750028f
Content-Type: application/json

--- request body ---
{"handle":"qa-94e5f43fa05c","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-767d3920-0686-43c0-b3a0-241e8750028f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_49d64e2e-e22f-461d-a0e0-ff2fca1f398d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9a47c595-f546-4ba3-887e-db84825bacdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a47c595-f546-4ba3-887e-db84825bacdb
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9a47c595-f546-4ba3-887e-db84825bacdb
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
correlation: qa-acff0f0f-8f4c-4869-9277-4f831c702d2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acff0f0f-8f4c-4869-9277-4f831c702d2f
Content-Type: application/json

--- request body ---
{"handle":"qa-94e5f43fa05c","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-acff0f0f-8f4c-4869-9277-4f831c702d2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-acff0f0f-8f4c-4869-9277-4f831c702d2f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-56b27fb1-f7ea-4722-b7c2-84faa961c8ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56b27fb1-f7ea-4722-b7c2-84faa961c8ea
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-56b27fb1-f7ea-4722-b7c2-84faa961c8ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-0ba4de6d-cbf8-4e64-bb9a-a344ef8e9690

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ba4de6d-cbf8-4e64-bb9a-a344ef8e9690
Content-Type: application/json

--- request body ---
{"handle":"qa-2faeb4ceea37","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ba4de6d-cbf8-4e64-bb9a-a344ef8e9690
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0ba4de6d-cbf8-4e64-bb9a-a344ef8e9690"}
```
