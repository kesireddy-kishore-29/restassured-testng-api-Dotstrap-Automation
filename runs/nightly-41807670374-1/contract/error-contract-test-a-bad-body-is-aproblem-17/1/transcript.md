# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-e3c3ab58-a458-4cd9-8649-082f361e2d6a` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-136c2a5e-c057-4669-bbb1-d04bcadca86a` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-90b0eabd-ecba-4043-a78b-aaee3c1de8ec` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-b80832d9-4f39-46bc-b050-a72c95f22212` |
| 5 | `POST /v1/credits/purchases` | 422 | 10 | `qa-0198e7ed-6ef7-4ad9-a9b4-8c8cf005ff1a` |
| 6 | `POST /v1/auth/token` | 200 | 7 | `qa-b9396005-4469-4a2c-8a80-c36ae3f9c446` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-8737dc86-a026-4083-8f2e-fa42fcbbfd10` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-6150ca83-993a-48da-8acf-62e6d30d03c4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-291134e6-f864-4480-abb6-09c77b9605da` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-f7016e17-4218-4307-bc1b-6f5fe70ad722` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e3c3ab58-a458-4cd9-8649-082f361e2d6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3c3ab58-a458-4cd9-8649-082f361e2d6a
Content-Type: application/json

--- request body ---
{"handle":"qa-41a829c28a7d","displayName":"QA 41a829c28a7d","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3c3ab58-a458-4cd9-8649-082f361e2d6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 8
Location: /v1/accounts/qa-41a829c28a7d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff805078-625f-494d-ae7b-dd757117a537","handle":"qa-41a829c28a7d","displayName":"QA 41a829c28a7d","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.421343885Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-136c2a5e-c057-4669-bbb1-d04bcadca86a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-136c2a5e-c057-4669-bbb1-d04bcadca86a
Content-Type: application/json

--- request body ---
{"handle":"qa-15aba41d1316","displayName":"QA 15aba41d1316","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-136c2a5e-c057-4669-bbb1-d04bcadca86a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 8
Location: /v1/accounts/qa-15aba41d1316
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0d91f4d5-9f12-4327-9d7d-c2ef8202f7e2","handle":"qa-15aba41d1316","displayName":"QA 15aba41d1316","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.451262589Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-90b0eabd-ecba-4043-a78b-aaee3c1de8ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90b0eabd-ecba-4043-a78b-aaee3c1de8ec
Content-Type: application/json

--- request body ---
{"handle":"qa-41a829c28a7d","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-90b0eabd-ecba-4043-a78b-aaee3c1de8ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ff805078-625f-494d-ae7b-dd757117a537"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b80832d9-4f39-46bc-b050-a72c95f22212

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b80832d9-4f39-46bc-b050-a72c95f22212
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-15aba41d1316","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b80832d9-4f39-46bc-b050-a72c95f22212
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
Location: /v1/conversations/cnv_73a56ee0-71bd-4853-99fc-87cc8c113e6b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_73a56ee0-71bd-4853-99fc-87cc8c113e6b","subject":"Error contract","status":"open","region":"eu","participants":["qa-41a829c28a7d","qa-15aba41d1316"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:03.510583727Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0198e7ed-6ef7-4ad9-a9b4-8c8cf005ff1a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f67264d76cf6428d872963e1bd6d3c41
X-Correlation-Id: qa-0198e7ed-6ef7-4ad9-a9b4-8c8cf005ff1a
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0198e7ed-6ef7-4ad9-a9b4-8c8cf005ff1a
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-0198e7ed-6ef7-4ad9-a9b4-8c8cf005ff1a","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b9396005-4469-4a2c-8a80-c36ae3f9c446

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9396005-4469-4a2c-8a80-c36ae3f9c446
Content-Type: application/json

--- request body ---
{"handle":"qa-15aba41d1316","password":"****"}

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9396005-4469-4a2c-8a80-c36ae3f9c446
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0d91f4d5-9f12-4327-9d7d-c2ef8202f7e2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8737dc86-a026-4083-8f2e-fa42fcbbfd10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8737dc86-a026-4083-8f2e-fa42fcbbfd10
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8737dc86-a026-4083-8f2e-fa42fcbbfd10
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
correlation: qa-6150ca83-993a-48da-8acf-62e6d30d03c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6150ca83-993a-48da-8acf-62e6d30d03c4
Content-Type: application/json

--- request body ---
{"handle":"qa-15aba41d1316","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6150ca83-993a-48da-8acf-62e6d30d03c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6150ca83-993a-48da-8acf-62e6d30d03c4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-291134e6-f864-4480-abb6-09c77b9605da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-291134e6-f864-4480-abb6-09c77b9605da
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-291134e6-f864-4480-abb6-09c77b9605da
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
correlation: qa-f7016e17-4218-4307-bc1b-6f5fe70ad722

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7016e17-4218-4307-bc1b-6f5fe70ad722
Content-Type: application/json

--- request body ---
{"handle":"qa-41a829c28a7d","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7016e17-4218-4307-bc1b-6f5fe70ad722
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f7016e17-4218-4307-bc1b-6f5fe70ad722"}
```
