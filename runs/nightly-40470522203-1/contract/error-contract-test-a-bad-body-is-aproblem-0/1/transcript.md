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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-84a98784-aee0-421c-8632-5f4413d439a1` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-9d446d2b-b759-460c-bd12-b7c9db76bb02` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-5bd52693-ab0c-4583-ae78-cd104d3444c5` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-9c98f271-487c-4558-9856-e288985bd0f5` |
| 5 | `POST /v1/auth/token` | 400 | 24 | `qa-f950de98-e1a0-4c2e-b54f-f08f71a7d5b7` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-1289d0ab-c32c-464b-9984-866c0641943a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 55 | `qa-cfa82704-a32e-4c50-9671-c3268b33c277` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-f2224362-5cb0-427d-9516-c9232fff4eef` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-20550f64-f82b-48a0-bbfb-4ff4553d361d` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-0d4357bb-80b4-4f46-be53-c99aa3f81cd8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-84a98784-aee0-421c-8632-5f4413d439a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84a98784-aee0-421c-8632-5f4413d439a1
Content-Type: application/json

--- request body ---
{"handle":"qa-7d6790889727","displayName":"QA 7d6790889727","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-84a98784-aee0-421c-8632-5f4413d439a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-7d6790889727
X-Served-Region: eu
Content-Length: 181

{"id":"acc_011665a2-8afb-462c-8c7a-7e3313cc7444","handle":"qa-7d6790889727","displayName":"QA 7d6790889727","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.422997630Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9d446d2b-b759-460c-bd12-b7c9db76bb02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d446d2b-b759-460c-bd12-b7c9db76bb02
Content-Type: application/json

--- request body ---
{"handle":"qa-a93921838077","displayName":"QA a93921838077","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d446d2b-b759-460c-bd12-b7c9db76bb02
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
Location: /v1/accounts/qa-a93921838077
X-Served-Region: eu
Content-Length: 181

{"id":"acc_14241ee3-7f93-43fe-8405-8ba92af99b5f","handle":"qa-a93921838077","displayName":"QA a93921838077","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.481658751Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5bd52693-ab0c-4583-ae78-cd104d3444c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bd52693-ab0c-4583-ae78-cd104d3444c5
Content-Type: application/json

--- request body ---
{"handle":"qa-7d6790889727","password":"****"}

--- response: 200 in 47 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bd52693-ab0c-4583-ae78-cd104d3444c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_011665a2-8afb-462c-8c7a-7e3313cc7444"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9c98f271-487c-4558-9856-e288985bd0f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c98f271-487c-4558-9856-e288985bd0f5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a93921838077","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c98f271-487c-4558-9856-e288985bd0f5
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
Location: /v1/conversations/cnv_c8525501-c66b-4903-889e-30c094d7464c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c8525501-c66b-4903-889e-30c094d7464c","subject":"Error contract","status":"open","region":"eu","participants":["qa-7d6790889727","qa-a93921838077"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:32.568018629Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f950de98-e1a0-4c2e-b54f-f08f71a7d5b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f950de98-e1a0-4c2e-b54f-f08f71a7d5b7
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f950de98-e1a0-4c2e-b54f-f08f71a7d5b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-f950de98-e1a0-4c2e-b54f-f08f71a7d5b7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1289d0ab-c32c-464b-9984-866c0641943a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1289d0ab-c32c-464b-9984-866c0641943a
Content-Type: application/json

--- request body ---
{"handle":"qa-a93921838077","password":"****"}

--- response: 200 in 36 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1289d0ab-c32c-464b-9984-866c0641943a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_14241ee3-7f93-43fe-8405-8ba92af99b5f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cfa82704-a32e-4c50-9671-c3268b33c277

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfa82704-a32e-4c50-9671-c3268b33c277
Content-Type: application/json

--- response: 204 in 55 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cfa82704-a32e-4c50-9671-c3268b33c277
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
correlation: qa-f2224362-5cb0-427d-9516-c9232fff4eef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2224362-5cb0-427d-9516-c9232fff4eef
Content-Type: application/json

--- request body ---
{"handle":"qa-a93921838077","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2224362-5cb0-427d-9516-c9232fff4eef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2224362-5cb0-427d-9516-c9232fff4eef"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-20550f64-f82b-48a0-bbfb-4ff4553d361d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20550f64-f82b-48a0-bbfb-4ff4553d361d
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-20550f64-f82b-48a0-bbfb-4ff4553d361d
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
correlation: qa-0d4357bb-80b4-4f46-be53-c99aa3f81cd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d4357bb-80b4-4f46-be53-c99aa3f81cd8
Content-Type: application/json

--- request body ---
{"handle":"qa-7d6790889727","password":"****"}

--- response: 401 in 30 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d4357bb-80b4-4f46-be53-c99aa3f81cd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0d4357bb-80b4-4f46-be53-c99aa3f81cd8"}
```
