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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-9f571203-8b99-4b8c-b297-402e8d0bca88` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-3f26fe11-3c27-48f4-bcd3-74953241f100` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-bc3cb513-18e0-480b-92a9-690b86b9bc22` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-6df5552e-99d9-4a31-b6fb-0ef49b7de7be` |
| 5 | `PATCH /v1/accounts/me` | 422 | 29 | `qa-3a2550bf-699e-4b53-a88f-ad9bc1aa7a6e` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-414af97a-51f6-4ac4-be04-ef95c21414a6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-47f05bd7-2d4d-4ddb-ad17-cec75c02c5f9` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-e5e02583-8c70-4d20-8201-325e469f0ec6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-a36ea540-94c9-4587-969b-2f3cd974c7ac` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-151c3013-11df-4c40-9b7f-03bef20719fa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9f571203-8b99-4b8c-b297-402e8d0bca88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f571203-8b99-4b8c-b297-402e8d0bca88
Content-Type: application/json

--- request body ---
{"handle":"qa-cafe17a870e9","displayName":"QA cafe17a870e9","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f571203-8b99-4b8c-b297-402e8d0bca88
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
Location: /v1/accounts/qa-cafe17a870e9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20e0222c-cc6f-4648-aca1-a0b35e4986e0","handle":"qa-cafe17a870e9","displayName":"QA cafe17a870e9","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.683343972Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3f26fe11-3c27-48f4-bcd3-74953241f100

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f26fe11-3c27-48f4-bcd3-74953241f100
Content-Type: application/json

--- request body ---
{"handle":"qa-f710be5d6aaa","displayName":"QA f710be5d6aaa","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f26fe11-3c27-48f4-bcd3-74953241f100
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
Location: /v1/accounts/qa-f710be5d6aaa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72b05a7b-1e19-4f75-99f8-e9253980a409","handle":"qa-f710be5d6aaa","displayName":"QA f710be5d6aaa","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.710595677Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bc3cb513-18e0-480b-92a9-690b86b9bc22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc3cb513-18e0-480b-92a9-690b86b9bc22
Content-Type: application/json

--- request body ---
{"handle":"qa-cafe17a870e9","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc3cb513-18e0-480b-92a9-690b86b9bc22
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20e0222c-cc6f-4648-aca1-a0b35e4986e0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6df5552e-99d9-4a31-b6fb-0ef49b7de7be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6df5552e-99d9-4a31-b6fb-0ef49b7de7be
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f710be5d6aaa","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-6df5552e-99d9-4a31-b6fb-0ef49b7de7be
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
Location: /v1/conversations/cnv_53aa5607-109e-4214-a853-12352b59a377
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_53aa5607-109e-4214-a853-12352b59a377","subject":"Error contract","status":"open","region":"eu","participants":["qa-cafe17a870e9","qa-f710be5d6aaa"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.767748762Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-3a2550bf-699e-4b53-a88f-ad9bc1aa7a6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a2550bf-699e-4b53-a88f-ad9bc1aa7a6e
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a2550bf-699e-4b53-a88f-ad9bc1aa7a6e
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-3a2550bf-699e-4b53-a88f-ad9bc1aa7a6e","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-414af97a-51f6-4ac4-be04-ef95c21414a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-414af97a-51f6-4ac4-be04-ef95c21414a6
Content-Type: application/json

--- request body ---
{"handle":"qa-f710be5d6aaa","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-414af97a-51f6-4ac4-be04-ef95c21414a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72b05a7b-1e19-4f75-99f8-e9253980a409"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-47f05bd7-2d4d-4ddb-ad17-cec75c02c5f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47f05bd7-2d4d-4ddb-ad17-cec75c02c5f9
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-47f05bd7-2d4d-4ddb-ad17-cec75c02c5f9
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
correlation: qa-e5e02583-8c70-4d20-8201-325e469f0ec6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5e02583-8c70-4d20-8201-325e469f0ec6
Content-Type: application/json

--- request body ---
{"handle":"qa-f710be5d6aaa","password":"****"}

--- response: 401 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5e02583-8c70-4d20-8201-325e469f0ec6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e5e02583-8c70-4d20-8201-325e469f0ec6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a36ea540-94c9-4587-969b-2f3cd974c7ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a36ea540-94c9-4587-969b-2f3cd974c7ac
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a36ea540-94c9-4587-969b-2f3cd974c7ac
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
correlation: qa-151c3013-11df-4c40-9b7f-03bef20719fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-151c3013-11df-4c40-9b7f-03bef20719fa
Content-Type: application/json

--- request body ---
{"handle":"qa-cafe17a870e9","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-151c3013-11df-4c40-9b7f-03bef20719fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-151c3013-11df-4c40-9b7f-03bef20719fa"}
```
