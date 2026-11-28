# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-5b3725c6-f5ce-4e32-9d72-8efe6437a623` |
| 2 | `POST /v1/accounts` | 201 | 59 | `qa-5a3992a1-ff92-4542-a540-32d1f1b711b8` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-9712370f-8b9d-408d-adbf-9d7ce6cc2476` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-579627bb-e0da-4064-a9a0-b22dc84779ed` |
| 5 | `POST /v1/conversations` | 422 | 16 | `qa-e0e00926-7404-474c-9595-90b936f1cdc5` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-4f3f4981-9477-4c60-8435-94ae2f9ae2e6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e4bd2d0d-90ba-46ee-bcd2-6b91805fdc68` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-3b626ece-8a35-455e-acc8-71cc9ca0ef57` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-de894ceb-50e4-44a7-9bf3-9304713d752f` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-65689085-69b4-4010-bf5d-7a2c95dc1219` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5b3725c6-f5ce-4e32-9d72-8efe6437a623

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b3725c6-f5ce-4e32-9d72-8efe6437a623
Content-Type: application/json

--- request body ---
{"handle":"qa-1dccb360b319","displayName":"QA 1dccb360b319","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b3725c6-f5ce-4e32-9d72-8efe6437a623
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 7
Location: /v1/accounts/qa-1dccb360b319
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1984e07f-4411-49b4-b341-ae146a29b5ba","handle":"qa-1dccb360b319","displayName":"QA 1dccb360b319","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.919290105Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5a3992a1-ff92-4542-a540-32d1f1b711b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a3992a1-ff92-4542-a540-32d1f1b711b8
Content-Type: application/json

--- request body ---
{"handle":"qa-86489f1c8fa9","displayName":"QA 86489f1c8fa9","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a3992a1-ff92-4542-a540-32d1f1b711b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Location: /v1/accounts/qa-86489f1c8fa9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_315ef0fa-8fee-4c53-b9e2-9428b227fc9d","handle":"qa-86489f1c8fa9","displayName":"QA 86489f1c8fa9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.999697307Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9712370f-8b9d-408d-adbf-9d7ce6cc2476

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9712370f-8b9d-408d-adbf-9d7ce6cc2476
Content-Type: application/json

--- request body ---
{"handle":"qa-1dccb360b319","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-9712370f-8b9d-408d-adbf-9d7ce6cc2476
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1984e07f-4411-49b4-b341-ae146a29b5ba"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-579627bb-e0da-4064-a9a0-b22dc84779ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-579627bb-e0da-4064-a9a0-b22dc84779ed
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-86489f1c8fa9","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-579627bb-e0da-4064-a9a0-b22dc84779ed
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
Location: /v1/conversations/cnv_fbdf1d42-add5-4a6f-86aa-819da8deb7e6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fbdf1d42-add5-4a6f-86aa-819da8deb7e6","subject":"Error contract","status":"open","region":"eu","participants":["qa-1dccb360b319","qa-86489f1c8fa9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.089093285Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-e0e00926-7404-474c-9595-90b936f1cdc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0e00926-7404-474c-9595-90b936f1cdc5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-86489f1c8fa9","subject":" ","message":"Hi"}

--- response: 422 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0e00926-7404-474c-9595-90b936f1cdc5
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-e0e00926-7404-474c-9595-90b936f1cdc5","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4f3f4981-9477-4c60-8435-94ae2f9ae2e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f3f4981-9477-4c60-8435-94ae2f9ae2e6
Content-Type: application/json

--- request body ---
{"handle":"qa-86489f1c8fa9","password":"****"}

--- response: 200 in 38 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f3f4981-9477-4c60-8435-94ae2f9ae2e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_315ef0fa-8fee-4c53-b9e2-9428b227fc9d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e4bd2d0d-90ba-46ee-bcd2-6b91805fdc68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4bd2d0d-90ba-46ee-bcd2-6b91805fdc68
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e4bd2d0d-90ba-46ee-bcd2-6b91805fdc68
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
correlation: qa-3b626ece-8a35-455e-acc8-71cc9ca0ef57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b626ece-8a35-455e-acc8-71cc9ca0ef57
Content-Type: application/json

--- request body ---
{"handle":"qa-86489f1c8fa9","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b626ece-8a35-455e-acc8-71cc9ca0ef57
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3b626ece-8a35-455e-acc8-71cc9ca0ef57"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-de894ceb-50e4-44a7-9bf3-9304713d752f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de894ceb-50e4-44a7-9bf3-9304713d752f
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-de894ceb-50e4-44a7-9bf3-9304713d752f
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
correlation: qa-65689085-69b4-4010-bf5d-7a2c95dc1219

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65689085-69b4-4010-bf5d-7a2c95dc1219
Content-Type: application/json

--- request body ---
{"handle":"qa-1dccb360b319","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65689085-69b4-4010-bf5d-7a2c95dc1219
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-65689085-69b4-4010-bf5d-7a2c95dc1219"}
```
