# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-170418db-e983-40bd-997c-4663c7471201` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-96a67282-d584-44cb-9aac-9c8dbaba5aaa` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-271c55df-2969-4b31-90c4-e37b44d30ddc` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-e236fd27-c587-4d38-903f-3da31743110e` |
| 5 | `POST /v1/conversations` | 415 | 15 | `qa-b2b54c1b-43a6-460a-a0d8-60a7c0a7369d` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-bdc69b28-837d-4168-bee1-b2badf1a01e7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-380e8c47-c9e2-49ba-b603-784e4b8f013b` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-2f950f99-2ae4-48c6-ab13-9db202ec0069` |
| 9 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-80e5f3f0-ec30-4782-a9dd-47c806139809` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-5b4c4377-7e42-4dc4-920f-f78dfda53fa5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-170418db-e983-40bd-997c-4663c7471201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-170418db-e983-40bd-997c-4663c7471201
Content-Type: application/json

--- request body ---
{"handle":"qa-73bc289fca8d","displayName":"QA 73bc289fca8d","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-170418db-e983-40bd-997c-4663c7471201
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Location: /v1/accounts/qa-73bc289fca8d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ab5c5be4-1cf3-4e29-b794-a35ee4b77151","handle":"qa-73bc289fca8d","displayName":"QA 73bc289fca8d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.945310808Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-96a67282-d584-44cb-9aac-9c8dbaba5aaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96a67282-d584-44cb-9aac-9c8dbaba5aaa
Content-Type: application/json

--- request body ---
{"handle":"qa-44d238c1f671","displayName":"QA 44d238c1f671","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-96a67282-d584-44cb-9aac-9c8dbaba5aaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Location: /v1/accounts/qa-44d238c1f671
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f6658def-2200-4929-a596-3a6735d9ca19","handle":"qa-44d238c1f671","displayName":"QA 44d238c1f671","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.989731617Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-271c55df-2969-4b31-90c4-e37b44d30ddc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-271c55df-2969-4b31-90c4-e37b44d30ddc
Content-Type: application/json

--- request body ---
{"handle":"qa-73bc289fca8d","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-271c55df-2969-4b31-90c4-e37b44d30ddc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ab5c5be4-1cf3-4e29-b794-a35ee4b77151"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e236fd27-c587-4d38-903f-3da31743110e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e236fd27-c587-4d38-903f-3da31743110e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-44d238c1f671","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e236fd27-c587-4d38-903f-3da31743110e
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
Location: /v1/conversations/cnv_a611bdf3-cb2b-49b6-adf3-db2f5400a353
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a611bdf3-cb2b-49b6-adf3-db2f5400a353","subject":"Error contract","status":"open","region":"eu","participants":["qa-73bc289fca8d","qa-44d238c1f671"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:03.087636044Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-b2b54c1b-43a6-460a-a0d8-60a7c0a7369d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2b54c1b-43a6-460a-a0d8-60a7c0a7369d
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2b54c1b-43a6-460a-a0d8-60a7c0a7369d
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-b2b54c1b-43a6-460a-a0d8-60a7c0a7369d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bdc69b28-837d-4168-bee1-b2badf1a01e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdc69b28-837d-4168-bee1-b2badf1a01e7
Content-Type: application/json

--- request body ---
{"handle":"qa-44d238c1f671","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdc69b28-837d-4168-bee1-b2badf1a01e7
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f6658def-2200-4929-a596-3a6735d9ca19"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-380e8c47-c9e2-49ba-b603-784e4b8f013b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-380e8c47-c9e2-49ba-b603-784e4b8f013b
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-380e8c47-c9e2-49ba-b603-784e4b8f013b
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
correlation: qa-2f950f99-2ae4-48c6-ab13-9db202ec0069

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f950f99-2ae4-48c6-ab13-9db202ec0069
Content-Type: application/json

--- request body ---
{"handle":"qa-44d238c1f671","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f950f99-2ae4-48c6-ab13-9db202ec0069
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2f950f99-2ae4-48c6-ab13-9db202ec0069"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-80e5f3f0-ec30-4782-a9dd-47c806139809

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80e5f3f0-ec30-4782-a9dd-47c806139809
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-80e5f3f0-ec30-4782-a9dd-47c806139809
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
correlation: qa-5b4c4377-7e42-4dc4-920f-f78dfda53fa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b4c4377-7e42-4dc4-920f-f78dfda53fa5
Content-Type: application/json

--- request body ---
{"handle":"qa-73bc289fca8d","password":"****"}

--- response: 401 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b4c4377-7e42-4dc4-920f-f78dfda53fa5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b4c4377-7e42-4dc4-920f-f78dfda53fa5"}
```
