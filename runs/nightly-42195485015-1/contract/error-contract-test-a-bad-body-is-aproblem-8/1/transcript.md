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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-1ea1d527-c66e-4967-97f1-7f6e489893ca` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-0f55b251-5119-42ec-89d6-ed9d41728018` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-6bc17a4b-1036-4c3f-9e9d-3a28a65da25e` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-aaa0cc49-b4a7-4fad-962c-01d2067db015` |
| 5 | `PATCH /v1/accounts/me` | 422 | 21 | `qa-0eb8db45-6a8a-440c-9840-54334a68d8ce` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-ca991f30-8955-422c-8121-c5720a376611` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-721021a7-e56b-41f8-afdb-58f9f92a4f88` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-8acbdd96-37b8-4dec-a1bf-0e5bc0fa9c1c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-6c6c3848-0d83-478e-9be1-dfb0a98d2725` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-6a0f2227-b23a-4d6b-8b87-d4e7e7f04d2d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1ea1d527-c66e-4967-97f1-7f6e489893ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ea1d527-c66e-4967-97f1-7f6e489893ca
Content-Type: application/json

--- request body ---
{"handle":"qa-2423f72c76d1","displayName":"QA 2423f72c76d1","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ea1d527-c66e-4967-97f1-7f6e489893ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 7
Location: /v1/accounts/qa-2423f72c76d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6f88c3e0-7ae3-4584-8cef-0de75669f9ee","handle":"qa-2423f72c76d1","displayName":"QA 2423f72c76d1","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.544916711Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0f55b251-5119-42ec-89d6-ed9d41728018

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f55b251-5119-42ec-89d6-ed9d41728018
Content-Type: application/json

--- request body ---
{"handle":"qa-db566f4a5f65","displayName":"QA db566f4a5f65","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f55b251-5119-42ec-89d6-ed9d41728018
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 7
Location: /v1/accounts/qa-db566f4a5f65
X-Served-Region: eu
Content-Length: 181

{"id":"acc_10aea68b-fac9-45ea-9495-53dc25abc7a7","handle":"qa-db566f4a5f65","displayName":"QA db566f4a5f65","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.597347804Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6bc17a4b-1036-4c3f-9e9d-3a28a65da25e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bc17a4b-1036-4c3f-9e9d-3a28a65da25e
Content-Type: application/json

--- request body ---
{"handle":"qa-2423f72c76d1","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bc17a4b-1036-4c3f-9e9d-3a28a65da25e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6f88c3e0-7ae3-4584-8cef-0de75669f9ee"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-aaa0cc49-b4a7-4fad-962c-01d2067db015

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaa0cc49-b4a7-4fad-962c-01d2067db015
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-db566f4a5f65","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-aaa0cc49-b4a7-4fad-962c-01d2067db015
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
Location: /v1/conversations/cnv_9efbdf3e-870e-4841-a9ed-6c55adcd42d8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9efbdf3e-870e-4841-a9ed-6c55adcd42d8","subject":"Error contract","status":"open","region":"eu","participants":["qa-2423f72c76d1","qa-db566f4a5f65"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.670363769Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-0eb8db45-6a8a-440c-9840-54334a68d8ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0eb8db45-6a8a-440c-9840-54334a68d8ce
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0eb8db45-6a8a-440c-9840-54334a68d8ce
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-0eb8db45-6a8a-440c-9840-54334a68d8ce","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ca991f30-8955-422c-8121-c5720a376611

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca991f30-8955-422c-8121-c5720a376611
Content-Type: application/json

--- request body ---
{"handle":"qa-db566f4a5f65","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca991f30-8955-422c-8121-c5720a376611
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_10aea68b-fac9-45ea-9495-53dc25abc7a7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-721021a7-e56b-41f8-afdb-58f9f92a4f88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-721021a7-e56b-41f8-afdb-58f9f92a4f88
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-721021a7-e56b-41f8-afdb-58f9f92a4f88
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
correlation: qa-8acbdd96-37b8-4dec-a1bf-0e5bc0fa9c1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8acbdd96-37b8-4dec-a1bf-0e5bc0fa9c1c
Content-Type: application/json

--- request body ---
{"handle":"qa-db566f4a5f65","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8acbdd96-37b8-4dec-a1bf-0e5bc0fa9c1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8acbdd96-37b8-4dec-a1bf-0e5bc0fa9c1c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c6c3848-0d83-478e-9be1-dfb0a98d2725

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c6c3848-0d83-478e-9be1-dfb0a98d2725
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c6c3848-0d83-478e-9be1-dfb0a98d2725
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
correlation: qa-6a0f2227-b23a-4d6b-8b87-d4e7e7f04d2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a0f2227-b23a-4d6b-8b87-d4e7e7f04d2d
Content-Type: application/json

--- request body ---
{"handle":"qa-2423f72c76d1","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a0f2227-b23a-4d6b-8b87-d4e7e7f04d2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6a0f2227-b23a-4d6b-8b87-d4e7e7f04d2d"}
```
