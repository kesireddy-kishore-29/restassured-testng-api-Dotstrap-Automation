# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-85c8c8b3-f178-4552-80f8-5ac1b93ba199` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-b6613c4b-5a3b-4ec5-9022-7ad9ef531809` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-d9b84eef-8c7f-4f6f-aa71-2080b6c2933a` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-45a11243-84a2-409e-9b01-e225953d1d45` |
| 5 | `PATCH /v1/accounts/me` | 422 | 17 | `qa-7e22bf7d-e5ac-4f56-aad8-aee045e16c7f` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-db4f0855-31e4-4439-ba2c-fef1c0efd96a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-302e1bcd-c973-4d5d-8d4d-a2ea097f7aba` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-7655b74b-87fa-4bd9-b473-dc64aeb7cbe7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-a44c5cf3-5298-4572-9713-d637e3feb36d` |
| 10 | `POST /v1/auth/token` | 401 | 46 | `qa-a8e31759-123e-4051-ba1e-aed9a3283c11` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-85c8c8b3-f178-4552-80f8-5ac1b93ba199

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85c8c8b3-f178-4552-80f8-5ac1b93ba199
Content-Type: application/json

--- request body ---
{"handle":"qa-34c51d6a2731","displayName":"QA 34c51d6a2731","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-85c8c8b3-f178-4552-80f8-5ac1b93ba199
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Location: /v1/accounts/qa-34c51d6a2731
X-Served-Region: eu
Content-Length: 181

{"id":"acc_81d9ec64-5481-484b-a0b8-eafa87f4a3fb","handle":"qa-34c51d6a2731","displayName":"QA 34c51d6a2731","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.516060661Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b6613c4b-5a3b-4ec5-9022-7ad9ef531809

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6613c4b-5a3b-4ec5-9022-7ad9ef531809
Content-Type: application/json

--- request body ---
{"handle":"qa-c879b8800084","displayName":"QA c879b8800084","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6613c4b-5a3b-4ec5-9022-7ad9ef531809
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Location: /v1/accounts/qa-c879b8800084
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f454f11-5df8-49b2-9a07-65fc92d23f9a","handle":"qa-c879b8800084","displayName":"QA c879b8800084","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.559212402Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d9b84eef-8c7f-4f6f-aa71-2080b6c2933a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9b84eef-8c7f-4f6f-aa71-2080b6c2933a
Content-Type: application/json

--- request body ---
{"handle":"qa-34c51d6a2731","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9b84eef-8c7f-4f6f-aa71-2080b6c2933a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_81d9ec64-5481-484b-a0b8-eafa87f4a3fb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-45a11243-84a2-409e-9b01-e225953d1d45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45a11243-84a2-409e-9b01-e225953d1d45
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c879b8800084","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-45a11243-84a2-409e-9b01-e225953d1d45
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
Location: /v1/conversations/cnv_5de237d3-95b7-40ac-b046-790286955562
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5de237d3-95b7-40ac-b046-790286955562","subject":"Error contract","status":"open","region":"eu","participants":["qa-34c51d6a2731","qa-c879b8800084"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.631431205Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-7e22bf7d-e5ac-4f56-aad8-aee045e16c7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e22bf7d-e5ac-4f56-aad8-aee045e16c7f
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e22bf7d-e5ac-4f56-aad8-aee045e16c7f
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-7e22bf7d-e5ac-4f56-aad8-aee045e16c7f","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-db4f0855-31e4-4439-ba2c-fef1c0efd96a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db4f0855-31e4-4439-ba2c-fef1c0efd96a
Content-Type: application/json

--- request body ---
{"handle":"qa-c879b8800084","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-db4f0855-31e4-4439-ba2c-fef1c0efd96a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7f454f11-5df8-49b2-9a07-65fc92d23f9a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-302e1bcd-c973-4d5d-8d4d-a2ea097f7aba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-302e1bcd-c973-4d5d-8d4d-a2ea097f7aba
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-302e1bcd-c973-4d5d-8d4d-a2ea097f7aba
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
correlation: qa-7655b74b-87fa-4bd9-b473-dc64aeb7cbe7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7655b74b-87fa-4bd9-b473-dc64aeb7cbe7
Content-Type: application/json

--- request body ---
{"handle":"qa-c879b8800084","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7655b74b-87fa-4bd9-b473-dc64aeb7cbe7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7655b74b-87fa-4bd9-b473-dc64aeb7cbe7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a44c5cf3-5298-4572-9713-d637e3feb36d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a44c5cf3-5298-4572-9713-d637e3feb36d
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a44c5cf3-5298-4572-9713-d637e3feb36d
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
correlation: qa-a8e31759-123e-4051-ba1e-aed9a3283c11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8e31759-123e-4051-ba1e-aed9a3283c11
Content-Type: application/json

--- request body ---
{"handle":"qa-34c51d6a2731","password":"****"}

--- response: 401 in 46 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8e31759-123e-4051-ba1e-aed9a3283c11
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a8e31759-123e-4051-ba1e-aed9a3283c11"}
```
