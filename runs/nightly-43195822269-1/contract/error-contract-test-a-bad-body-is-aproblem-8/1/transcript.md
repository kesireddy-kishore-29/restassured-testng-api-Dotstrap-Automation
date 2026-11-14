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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-94819c2c-dff2-41ef-8b74-03acfad62a7a` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-9761615e-d153-41b1-a571-90470a1f7783` |
| 3 | `POST /v1/auth/token` | 200 | 10 | `qa-3ce4824a-bccd-4048-8339-ae11c096e716` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-1690e5db-a197-4ed8-beba-d5c140c6b5c2` |
| 5 | `PATCH /v1/accounts/me` | 422 | 5 | `qa-549b1975-a3c8-418e-b807-c9b1458af217` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-64449bb3-cada-4e2b-b573-62b95b1fc2d1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-f4404310-366f-4f36-8c5f-3d7abbe337ff` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-f899787c-f083-4d63-8f9e-22ecd4fe0fec` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-dd09679a-dd2e-43c2-af0a-597ec87eb108` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-01fbbab0-1531-429a-96f2-b67c0d54b5ac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-94819c2c-dff2-41ef-8b74-03acfad62a7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94819c2c-dff2-41ef-8b74-03acfad62a7a
Content-Type: application/json

--- request body ---
{"handle":"qa-634204af214c","displayName":"QA 634204af214c","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-94819c2c-dff2-41ef-8b74-03acfad62a7a
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
Location: /v1/accounts/qa-634204af214c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c99f749e-766a-401d-a4f4-da3de2e11a56","handle":"qa-634204af214c","displayName":"QA 634204af214c","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.507366014Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9761615e-d153-41b1-a571-90470a1f7783

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9761615e-d153-41b1-a571-90470a1f7783
Content-Type: application/json

--- request body ---
{"handle":"qa-2d593755490f","displayName":"QA 2d593755490f","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-9761615e-d153-41b1-a571-90470a1f7783
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Location: /v1/accounts/qa-2d593755490f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_83c4e5cf-0e32-4efc-b75e-aeacdeb0c546","handle":"qa-2d593755490f","displayName":"QA 2d593755490f","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.531796905Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3ce4824a-bccd-4048-8339-ae11c096e716

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ce4824a-bccd-4048-8339-ae11c096e716
Content-Type: application/json

--- request body ---
{"handle":"qa-634204af214c","password":"****"}

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ce4824a-bccd-4048-8339-ae11c096e716
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c99f749e-766a-401d-a4f4-da3de2e11a56"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1690e5db-a197-4ed8-beba-d5c140c6b5c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1690e5db-a197-4ed8-beba-d5c140c6b5c2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2d593755490f","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-1690e5db-a197-4ed8-beba-d5c140c6b5c2
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
Location: /v1/conversations/cnv_54aebfee-4e5f-46f6-b2c9-84e02c6dce24
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_54aebfee-4e5f-46f6-b2c9-84e02c6dce24","subject":"Error contract","status":"open","region":"eu","participants":["qa-634204af214c","qa-2d593755490f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.589498389Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-549b1975-a3c8-418e-b807-c9b1458af217

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-549b1975-a3c8-418e-b807-c9b1458af217
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-549b1975-a3c8-418e-b807-c9b1458af217
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-549b1975-a3c8-418e-b807-c9b1458af217","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-64449bb3-cada-4e2b-b573-62b95b1fc2d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64449bb3-cada-4e2b-b573-62b95b1fc2d1
Content-Type: application/json

--- request body ---
{"handle":"qa-2d593755490f","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-64449bb3-cada-4e2b-b573-62b95b1fc2d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_83c4e5cf-0e32-4efc-b75e-aeacdeb0c546"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f4404310-366f-4f36-8c5f-3d7abbe337ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4404310-366f-4f36-8c5f-3d7abbe337ff
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f4404310-366f-4f36-8c5f-3d7abbe337ff
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
correlation: qa-f899787c-f083-4d63-8f9e-22ecd4fe0fec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f899787c-f083-4d63-8f9e-22ecd4fe0fec
Content-Type: application/json

--- request body ---
{"handle":"qa-2d593755490f","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f899787c-f083-4d63-8f9e-22ecd4fe0fec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f899787c-f083-4d63-8f9e-22ecd4fe0fec"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dd09679a-dd2e-43c2-af0a-597ec87eb108

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd09679a-dd2e-43c2-af0a-597ec87eb108
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dd09679a-dd2e-43c2-af0a-597ec87eb108
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
correlation: qa-01fbbab0-1531-429a-96f2-b67c0d54b5ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01fbbab0-1531-429a-96f2-b67c0d54b5ac
Content-Type: application/json

--- request body ---
{"handle":"qa-634204af214c","password":"****"}

--- response: 401 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01fbbab0-1531-429a-96f2-b67c0d54b5ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-01fbbab0-1531-429a-96f2-b67c0d54b5ac"}
```
