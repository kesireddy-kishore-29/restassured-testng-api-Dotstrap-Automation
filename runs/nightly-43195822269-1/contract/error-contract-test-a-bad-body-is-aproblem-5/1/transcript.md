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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-d4d5bbbd-1349-4909-8ea6-6c3ae6a3a4f4` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-0136fad6-56d6-4bc0-8606-7729e577e147` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-0e96584d-9fd8-40da-8d99-5380e6db27c4` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-33ecfa29-d7f2-4bb2-bd16-765c1bc5fc14` |
| 5 | `POST /v1/accounts` | 422 | 12 | `qa-47f4efef-7f01-4a44-8741-e844732e2685` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-57806def-32e1-4a30-a5e5-62e52fceff55` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-e85776bf-c275-4a67-9b87-94ddd0af95d2` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-63863c4a-70c5-4254-9799-1551257914a3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-3a4068e1-97a9-43a3-bf3f-4c2a7bba4820` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-70608dbc-2454-4174-b5e2-98a3ca2395d9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d4d5bbbd-1349-4909-8ea6-6c3ae6a3a4f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4d5bbbd-1349-4909-8ea6-6c3ae6a3a4f4
Content-Type: application/json

--- request body ---
{"handle":"qa-d6a3ce83a71f","displayName":"QA d6a3ce83a71f","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4d5bbbd-1349-4909-8ea6-6c3ae6a3a4f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 9
Location: /v1/accounts/qa-d6a3ce83a71f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d9fb39b0-8727-409e-8a23-5c3799594077","handle":"qa-d6a3ce83a71f","displayName":"QA d6a3ce83a71f","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.134778355Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0136fad6-56d6-4bc0-8606-7729e577e147

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0136fad6-56d6-4bc0-8606-7729e577e147
Content-Type: application/json

--- request body ---
{"handle":"qa-e4ea05366bb3","displayName":"QA e4ea05366bb3","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-0136fad6-56d6-4bc0-8606-7729e577e147
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 9
Location: /v1/accounts/qa-e4ea05366bb3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30b7710d-b339-4901-afb9-2b70280c5e7d","handle":"qa-e4ea05366bb3","displayName":"QA e4ea05366bb3","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.169708701Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0e96584d-9fd8-40da-8d99-5380e6db27c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e96584d-9fd8-40da-8d99-5380e6db27c4
Content-Type: application/json

--- request body ---
{"handle":"qa-d6a3ce83a71f","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e96584d-9fd8-40da-8d99-5380e6db27c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d9fb39b0-8727-409e-8a23-5c3799594077"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-33ecfa29-d7f2-4bb2-bd16-765c1bc5fc14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33ecfa29-d7f2-4bb2-bd16-765c1bc5fc14
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e4ea05366bb3","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-33ecfa29-d7f2-4bb2-bd16-765c1bc5fc14
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
Location: /v1/conversations/cnv_405493f0-261d-4156-a448-d8ea55c24333
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_405493f0-261d-4156-a448-d8ea55c24333","subject":"Error contract","status":"open","region":"eu","participants":["qa-d6a3ce83a71f","qa-e4ea05366bb3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.253204025Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-47f4efef-7f01-4a44-8741-e844732e2685

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47f4efef-7f01-4a44-8741-e844732e2685
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47f4efef-7f01-4a44-8741-e844732e2685
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
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-47f4efef-7f01-4a44-8741-e844732e2685","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-57806def-32e1-4a30-a5e5-62e52fceff55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57806def-32e1-4a30-a5e5-62e52fceff55
Content-Type: application/json

--- request body ---
{"handle":"qa-e4ea05366bb3","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-57806def-32e1-4a30-a5e5-62e52fceff55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30b7710d-b339-4901-afb9-2b70280c5e7d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e85776bf-c275-4a67-9b87-94ddd0af95d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e85776bf-c275-4a67-9b87-94ddd0af95d2
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e85776bf-c275-4a67-9b87-94ddd0af95d2
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
correlation: qa-63863c4a-70c5-4254-9799-1551257914a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63863c4a-70c5-4254-9799-1551257914a3
Content-Type: application/json

--- request body ---
{"handle":"qa-e4ea05366bb3","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63863c4a-70c5-4254-9799-1551257914a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-63863c4a-70c5-4254-9799-1551257914a3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3a4068e1-97a9-43a3-bf3f-4c2a7bba4820

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a4068e1-97a9-43a3-bf3f-4c2a7bba4820
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3a4068e1-97a9-43a3-bf3f-4c2a7bba4820
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
correlation: qa-70608dbc-2454-4174-b5e2-98a3ca2395d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70608dbc-2454-4174-b5e2-98a3ca2395d9
Content-Type: application/json

--- request body ---
{"handle":"qa-d6a3ce83a71f","password":"****"}

--- response: 401 in 29 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70608dbc-2454-4174-b5e2-98a3ca2395d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-70608dbc-2454-4174-b5e2-98a3ca2395d9"}
```
