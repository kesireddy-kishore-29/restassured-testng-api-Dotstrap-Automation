# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-307cf6ed-30a8-4505-96d0-79caf642c57b` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-153d7ccd-3649-44a8-af57-9801ace591f2` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-f2c03b2d-0076-400b-80f5-2a4b175d0511` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-102816f3-3ce8-4396-8d83-edb6bed38718` |
| 5 | `POST /v1/auth/token` | 400 | 35 | `qa-065eb15d-0ee4-49c8-afb5-ff5adcfd81a7` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-c83cb862-9c41-4d59-adee-757e729f2f4d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-7585f90b-49d5-40f2-beba-504d0be1e479` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-5ab48907-7e07-420e-ae6d-7bc87303542c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-c134114c-02b5-4a68-b49e-203581693144` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-7944f4f7-b1c6-4168-946a-6b42592aaf15` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-307cf6ed-30a8-4505-96d0-79caf642c57b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-307cf6ed-30a8-4505-96d0-79caf642c57b
Content-Type: application/json

--- request body ---
{"handle":"qa-3a800aabc09e","displayName":"QA 3a800aabc09e","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-307cf6ed-30a8-4505-96d0-79caf642c57b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Location: /v1/accounts/qa-3a800aabc09e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dad74465-ebbf-4ebf-919b-b33179d9e78a","handle":"qa-3a800aabc09e","displayName":"QA 3a800aabc09e","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.036054881Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-153d7ccd-3649-44a8-af57-9801ace591f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-153d7ccd-3649-44a8-af57-9801ace591f2
Content-Type: application/json

--- request body ---
{"handle":"qa-c478cd6e482c","displayName":"QA c478cd6e482c","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-153d7ccd-3649-44a8-af57-9801ace591f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-c478cd6e482c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a282ea5-2b0d-4560-8eef-2f1cbbad6f42","handle":"qa-c478cd6e482c","displayName":"QA c478cd6e482c","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.087857558Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f2c03b2d-0076-400b-80f5-2a4b175d0511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2c03b2d-0076-400b-80f5-2a4b175d0511
Content-Type: application/json

--- request body ---
{"handle":"qa-3a800aabc09e","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2c03b2d-0076-400b-80f5-2a4b175d0511
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dad74465-ebbf-4ebf-919b-b33179d9e78a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-102816f3-3ce8-4396-8d83-edb6bed38718

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-102816f3-3ce8-4396-8d83-edb6bed38718
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c478cd6e482c","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-102816f3-3ce8-4396-8d83-edb6bed38718
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
Location: /v1/conversations/cnv_4b52b025-6812-4e51-b2c8-0a8409f79fac
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4b52b025-6812-4e51-b2c8-0a8409f79fac","subject":"Error contract","status":"open","region":"eu","participants":["qa-3a800aabc09e","qa-c478cd6e482c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:24.155683144Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-065eb15d-0ee4-49c8-afb5-ff5adcfd81a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-065eb15d-0ee4-49c8-afb5-ff5adcfd81a7
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 35 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-065eb15d-0ee4-49c8-afb5-ff5adcfd81a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-065eb15d-0ee4-49c8-afb5-ff5adcfd81a7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c83cb862-9c41-4d59-adee-757e729f2f4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c83cb862-9c41-4d59-adee-757e729f2f4d
Content-Type: application/json

--- request body ---
{"handle":"qa-c478cd6e482c","password":"****"}

--- response: 200 in 46 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-c83cb862-9c41-4d59-adee-757e729f2f4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a282ea5-2b0d-4560-8eef-2f1cbbad6f42"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7585f90b-49d5-40f2-beba-504d0be1e479

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7585f90b-49d5-40f2-beba-504d0be1e479
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7585f90b-49d5-40f2-beba-504d0be1e479
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
correlation: qa-5ab48907-7e07-420e-ae6d-7bc87303542c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ab48907-7e07-420e-ae6d-7bc87303542c
Content-Type: application/json

--- request body ---
{"handle":"qa-c478cd6e482c","password":"****"}

--- response: 401 in 27 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ab48907-7e07-420e-ae6d-7bc87303542c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5ab48907-7e07-420e-ae6d-7bc87303542c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c134114c-02b5-4a68-b49e-203581693144

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c134114c-02b5-4a68-b49e-203581693144
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c134114c-02b5-4a68-b49e-203581693144
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7944f4f7-b1c6-4168-946a-6b42592aaf15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7944f4f7-b1c6-4168-946a-6b42592aaf15
Content-Type: application/json

--- request body ---
{"handle":"qa-3a800aabc09e","password":"****"}

--- response: 401 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7944f4f7-b1c6-4168-946a-6b42592aaf15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7944f4f7-b1c6-4168-946a-6b42592aaf15"}
```
