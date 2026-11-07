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
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-5af2e772-74e4-4a7c-a2cb-2bebcefca572` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-3955ac80-7461-4b9d-a18f-4303bf777db3` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-760760b4-a474-453d-b15d-9e2f57b4409d` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-a0e41c8b-1ba6-4116-b656-f45a05c097fa` |
| 5 | `POST /v1/credits/purchases` | 400 | 57 | `qa-94c94cfd-d65b-47ca-b9d8-21f6e5fcb2b1` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-a36426b6-81c9-4d10-810b-cc8808c0fb5e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-62a5b661-d4d3-4161-bd37-702915d6f7e6` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-2880839b-31f1-4009-8ca2-be59679b47fa` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-db727db5-96b9-4062-8f18-f5a00b27a513` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-5adea0e1-687c-4f05-8597-3001612b570e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5af2e772-74e4-4a7c-a2cb-2bebcefca572

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5af2e772-74e4-4a7c-a2cb-2bebcefca572
Content-Type: application/json

--- request body ---
{"handle":"qa-ff98077376d8","displayName":"QA ff98077376d8","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5af2e772-74e4-4a7c-a2cb-2bebcefca572
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
Location: /v1/accounts/qa-ff98077376d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c9e268d6-4652-45b4-a672-d6f0b8988e53","handle":"qa-ff98077376d8","displayName":"QA ff98077376d8","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.376895413Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3955ac80-7461-4b9d-a18f-4303bf777db3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3955ac80-7461-4b9d-a18f-4303bf777db3
Content-Type: application/json

--- request body ---
{"handle":"qa-1be18ccb9371","displayName":"QA 1be18ccb9371","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3955ac80-7461-4b9d-a18f-4303bf777db3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 7
Location: /v1/accounts/qa-1be18ccb9371
X-Served-Region: eu
Content-Length: 181

{"id":"acc_962a7edb-559b-4dec-8eb1-af2a2d953e3c","handle":"qa-1be18ccb9371","displayName":"QA 1be18ccb9371","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.418172792Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-760760b4-a474-453d-b15d-9e2f57b4409d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-760760b4-a474-453d-b15d-9e2f57b4409d
Content-Type: application/json

--- request body ---
{"handle":"qa-ff98077376d8","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-760760b4-a474-453d-b15d-9e2f57b4409d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c9e268d6-4652-45b4-a672-d6f0b8988e53"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a0e41c8b-1ba6-4116-b656-f45a05c097fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0e41c8b-1ba6-4116-b656-f45a05c097fa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1be18ccb9371","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0e41c8b-1ba6-4116-b656-f45a05c097fa
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
Location: /v1/conversations/cnv_f41590d3-e434-4ba5-8df0-d66027375f49
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f41590d3-e434-4ba5-8df0-d66027375f49","subject":"Error contract","status":"open","region":"eu","participants":["qa-ff98077376d8","qa-1be18ccb9371"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.480656631Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-94c94cfd-d65b-47ca-b9d8-21f6e5fcb2b1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0566ccd330584a9ba6075d1812376dce
X-Correlation-Id: qa-94c94cfd-d65b-47ca-b9d8-21f6e5fcb2b1
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 57 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94c94cfd-d65b-47ca-b9d8-21f6e5fcb2b1
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-94c94cfd-d65b-47ca-b9d8-21f6e5fcb2b1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a36426b6-81c9-4d10-810b-cc8808c0fb5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a36426b6-81c9-4d10-810b-cc8808c0fb5e
Content-Type: application/json

--- request body ---
{"handle":"qa-1be18ccb9371","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a36426b6-81c9-4d10-810b-cc8808c0fb5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_962a7edb-559b-4dec-8eb1-af2a2d953e3c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-62a5b661-d4d3-4161-bd37-702915d6f7e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62a5b661-d4d3-4161-bd37-702915d6f7e6
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-62a5b661-d4d3-4161-bd37-702915d6f7e6
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
correlation: qa-2880839b-31f1-4009-8ca2-be59679b47fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2880839b-31f1-4009-8ca2-be59679b47fa
Content-Type: application/json

--- request body ---
{"handle":"qa-1be18ccb9371","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2880839b-31f1-4009-8ca2-be59679b47fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2880839b-31f1-4009-8ca2-be59679b47fa"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-db727db5-96b9-4062-8f18-f5a00b27a513

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db727db5-96b9-4062-8f18-f5a00b27a513
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-db727db5-96b9-4062-8f18-f5a00b27a513
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
correlation: qa-5adea0e1-687c-4f05-8597-3001612b570e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5adea0e1-687c-4f05-8597-3001612b570e
Content-Type: application/json

--- request body ---
{"handle":"qa-ff98077376d8","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5adea0e1-687c-4f05-8597-3001612b570e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5adea0e1-687c-4f05-8597-3001612b570e"}
```
