# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-3c85ff23-1ad8-4fb1-b26c-48df013c6252` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-15d8cad2-3aa0-4867-a352-48cffee6eb60` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-4dcd3e13-f3ea-4a37-a0e8-e60666bb1e39` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-8acc46d0-473d-4fd3-8d37-baaee4be4cab` |
| 5 | `POST /v1/accounts` | 422 | 32 | `qa-4331e6fc-242f-4a1f-9418-6defb991b43a` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-5568df7c-2e58-4a8e-89a1-8199ef95b023` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-fedc3054-83d3-4f21-a52c-e053a2856477` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-105504e4-68bf-45b7-b938-c924e8dff21e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-1375a8e3-8163-4902-bb79-b7775180939e` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-d7c430ca-34bf-4e5b-b3dc-41ab2e4d52f7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3c85ff23-1ad8-4fb1-b26c-48df013c6252

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c85ff23-1ad8-4fb1-b26c-48df013c6252
Content-Type: application/json

--- request body ---
{"handle":"qa-7b80060dee0d","displayName":"QA 7b80060dee0d","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c85ff23-1ad8-4fb1-b26c-48df013c6252
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Location: /v1/accounts/qa-7b80060dee0d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b7316127-9d01-4738-9e10-fecd473d5410","handle":"qa-7b80060dee0d","displayName":"QA 7b80060dee0d","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.747035007Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-15d8cad2-3aa0-4867-a352-48cffee6eb60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15d8cad2-3aa0-4867-a352-48cffee6eb60
Content-Type: application/json

--- request body ---
{"handle":"qa-02ccf481c39d","displayName":"QA 02ccf481c39d","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-15d8cad2-3aa0-4867-a352-48cffee6eb60
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
Location: /v1/accounts/qa-02ccf481c39d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_81c58cc6-07b9-40b3-9ccd-3dedb0221d66","handle":"qa-02ccf481c39d","displayName":"QA 02ccf481c39d","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.825941615Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4dcd3e13-f3ea-4a37-a0e8-e60666bb1e39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dcd3e13-f3ea-4a37-a0e8-e60666bb1e39
Content-Type: application/json

--- request body ---
{"handle":"qa-7b80060dee0d","password":"****"}

--- response: 200 in 45 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4dcd3e13-f3ea-4a37-a0e8-e60666bb1e39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b7316127-9d01-4738-9e10-fecd473d5410"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8acc46d0-473d-4fd3-8d37-baaee4be4cab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8acc46d0-473d-4fd3-8d37-baaee4be4cab
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-02ccf481c39d","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8acc46d0-473d-4fd3-8d37-baaee4be4cab
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
Location: /v1/conversations/cnv_1569d3b9-ea67-4f1d-bf3c-0af0a618ef3a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1569d3b9-ea67-4f1d-bf3c-0af0a618ef3a","subject":"Error contract","status":"open","region":"eu","participants":["qa-7b80060dee0d","qa-02ccf481c39d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:59.939748485Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-4331e6fc-242f-4a1f-9418-6defb991b43a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4331e6fc-242f-4a1f-9418-6defb991b43a
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 32 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4331e6fc-242f-4a1f-9418-6defb991b43a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-4331e6fc-242f-4a1f-9418-6defb991b43a","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5568df7c-2e58-4a8e-89a1-8199ef95b023

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5568df7c-2e58-4a8e-89a1-8199ef95b023
Content-Type: application/json

--- request body ---
{"handle":"qa-02ccf481c39d","password":"****"}

--- response: 200 in 46 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5568df7c-2e58-4a8e-89a1-8199ef95b023
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_81c58cc6-07b9-40b3-9ccd-3dedb0221d66"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fedc3054-83d3-4f21-a52c-e053a2856477

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fedc3054-83d3-4f21-a52c-e053a2856477
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fedc3054-83d3-4f21-a52c-e053a2856477
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
correlation: qa-105504e4-68bf-45b7-b938-c924e8dff21e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-105504e4-68bf-45b7-b938-c924e8dff21e
Content-Type: application/json

--- request body ---
{"handle":"qa-02ccf481c39d","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-105504e4-68bf-45b7-b938-c924e8dff21e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-105504e4-68bf-45b7-b938-c924e8dff21e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1375a8e3-8163-4902-bb79-b7775180939e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1375a8e3-8163-4902-bb79-b7775180939e
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1375a8e3-8163-4902-bb79-b7775180939e
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
correlation: qa-d7c430ca-34bf-4e5b-b3dc-41ab2e4d52f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7c430ca-34bf-4e5b-b3dc-41ab2e4d52f7
Content-Type: application/json

--- request body ---
{"handle":"qa-7b80060dee0d","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7c430ca-34bf-4e5b-b3dc-41ab2e4d52f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d7c430ca-34bf-4e5b-b3dc-41ab2e4d52f7"}
```
