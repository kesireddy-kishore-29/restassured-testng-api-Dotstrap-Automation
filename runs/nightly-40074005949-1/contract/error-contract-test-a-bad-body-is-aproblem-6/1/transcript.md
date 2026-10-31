# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-81707791-2237-46a6-b9f4-ce6f50949a13` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-ebfa878b-5c58-4233-8ec2-93b4b9a7bca4` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-6a49848e-141b-420a-905d-6794b91b5569` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-1a389278-93da-4842-bc09-f539b92e203e` |
| 5 | `PATCH /v1/accounts/me` | 400 | 27 | `qa-95880924-204f-47ca-8bc8-01ced31650f0` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-554eac1e-2756-4599-92e6-d83e60f24720` |
| 7 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-0e7f4140-7d26-43f7-b3af-3bce9cc6dbce` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-b5356caa-417a-4f4b-bdb4-393991588bab` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-065d0f02-b4de-4b31-bef3-7628d724a1a4` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-bbd80197-672b-4033-bac0-81e08ddfe701` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-81707791-2237-46a6-b9f4-ce6f50949a13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81707791-2237-46a6-b9f4-ce6f50949a13
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ce34d03b38","displayName":"QA b7ce34d03b38","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-81707791-2237-46a6-b9f4-ce6f50949a13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Location: /v1/accounts/qa-b7ce34d03b38
X-Served-Region: eu
Content-Length: 181

{"id":"acc_19d14093-9798-454b-98c7-5b468103ee37","handle":"qa-b7ce34d03b38","displayName":"QA b7ce34d03b38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.979226333Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ebfa878b-5c58-4233-8ec2-93b4b9a7bca4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebfa878b-5c58-4233-8ec2-93b4b9a7bca4
Content-Type: application/json

--- request body ---
{"handle":"qa-8dd7e58c2594","displayName":"QA 8dd7e58c2594","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebfa878b-5c58-4233-8ec2-93b4b9a7bca4
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
Location: /v1/accounts/qa-8dd7e58c2594
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7ab0e023-f4f6-404d-96df-062e68420d62","handle":"qa-8dd7e58c2594","displayName":"QA 8dd7e58c2594","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.030684425Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6a49848e-141b-420a-905d-6794b91b5569

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a49848e-141b-420a-905d-6794b91b5569
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ce34d03b38","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a49848e-141b-420a-905d-6794b91b5569
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19d14093-9798-454b-98c7-5b468103ee37"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1a389278-93da-4842-bc09-f539b92e203e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a389278-93da-4842-bc09-f539b92e203e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8dd7e58c2594","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a389278-93da-4842-bc09-f539b92e203e
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
Location: /v1/conversations/cnv_bfbaaadf-47df-4ae7-9ca5-d4c46c74db23
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bfbaaadf-47df-4ae7-9ca5-d4c46c74db23","subject":"Error contract","status":"open","region":"eu","participants":["qa-b7ce34d03b38","qa-8dd7e58c2594"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.104531313Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-95880924-204f-47ca-8bc8-01ced31650f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95880924-204f-47ca-8bc8-01ced31650f0
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 27 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95880924-204f-47ca-8bc8-01ced31650f0
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-95880924-204f-47ca-8bc8-01ced31650f0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-554eac1e-2756-4599-92e6-d83e60f24720

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-554eac1e-2756-4599-92e6-d83e60f24720
Content-Type: application/json

--- request body ---
{"handle":"qa-8dd7e58c2594","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-554eac1e-2756-4599-92e6-d83e60f24720
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7ab0e023-f4f6-404d-96df-062e68420d62"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0e7f4140-7d26-43f7-b3af-3bce9cc6dbce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e7f4140-7d26-43f7-b3af-3bce9cc6dbce
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0e7f4140-7d26-43f7-b3af-3bce9cc6dbce
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
correlation: qa-b5356caa-417a-4f4b-bdb4-393991588bab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5356caa-417a-4f4b-bdb4-393991588bab
Content-Type: application/json

--- request body ---
{"handle":"qa-8dd7e58c2594","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5356caa-417a-4f4b-bdb4-393991588bab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b5356caa-417a-4f4b-bdb4-393991588bab"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-065d0f02-b4de-4b31-bef3-7628d724a1a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-065d0f02-b4de-4b31-bef3-7628d724a1a4
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-065d0f02-b4de-4b31-bef3-7628d724a1a4
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
correlation: qa-bbd80197-672b-4033-bac0-81e08ddfe701

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbd80197-672b-4033-bac0-81e08ddfe701
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ce34d03b38","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bbd80197-672b-4033-bac0-81e08ddfe701
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bbd80197-672b-4033-bac0-81e08ddfe701"}
```
