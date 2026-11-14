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
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-d3cb20c0-eff3-4a52-89c2-eb05ce69f268` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-31bf0c6f-f1b1-4f89-9b4a-493845a651f7` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-39652ee7-fe14-49a3-bb7b-9470e9a94e43` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-3815731c-5a02-426e-ba32-0e7d13d38e84` |
| 5 | `POST /v1/conversations` | 422 | 12 | `qa-51fc3aeb-f887-4fbf-b780-07adb3137e93` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-50fd507f-010a-4fa7-b8c4-0dd6fbb7ab4b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-ed2d5eed-1c1c-49a9-ad92-656e4f160a9e` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-13da3f11-16d2-4548-943c-a816d8067665` |
| 9 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-b26191dc-8341-402f-90ba-fc8ac25ad26a` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-3f2ef39d-22e3-4b8f-80c9-b04d477b327e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d3cb20c0-eff3-4a52-89c2-eb05ce69f268

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3cb20c0-eff3-4a52-89c2-eb05ce69f268
Content-Type: application/json

--- request body ---
{"handle":"qa-db24c6d8727c","displayName":"QA db24c6d8727c","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3cb20c0-eff3-4a52-89c2-eb05ce69f268
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Location: /v1/accounts/qa-db24c6d8727c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aa497277-9a73-40e6-bfe6-a8bb72d2e897","handle":"qa-db24c6d8727c","displayName":"QA db24c6d8727c","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.357765805Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-31bf0c6f-f1b1-4f89-9b4a-493845a651f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31bf0c6f-f1b1-4f89-9b4a-493845a651f7
Content-Type: application/json

--- request body ---
{"handle":"qa-767c513be0a5","displayName":"QA 767c513be0a5","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-31bf0c6f-f1b1-4f89-9b4a-493845a651f7
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
Location: /v1/accounts/qa-767c513be0a5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b8e9351f-20de-4d2c-b522-0e8adf14011b","handle":"qa-767c513be0a5","displayName":"QA 767c513be0a5","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.402231260Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-39652ee7-fe14-49a3-bb7b-9470e9a94e43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39652ee7-fe14-49a3-bb7b-9470e9a94e43
Content-Type: application/json

--- request body ---
{"handle":"qa-db24c6d8727c","password":"****"}

--- response: 200 in 40 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-39652ee7-fe14-49a3-bb7b-9470e9a94e43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aa497277-9a73-40e6-bfe6-a8bb72d2e897"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3815731c-5a02-426e-ba32-0e7d13d38e84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3815731c-5a02-426e-ba32-0e7d13d38e84
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-767c513be0a5","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-3815731c-5a02-426e-ba32-0e7d13d38e84
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
Location: /v1/conversations/cnv_92c32633-ebba-458f-8367-a74362669a03
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_92c32633-ebba-458f-8367-a74362669a03","subject":"Error contract","status":"open","region":"eu","participants":["qa-db24c6d8727c","qa-767c513be0a5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.470952277Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-51fc3aeb-f887-4fbf-b780-07adb3137e93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51fc3aeb-f887-4fbf-b780-07adb3137e93
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-767c513be0a5","subject":" ","message":"Hi"}

--- response: 422 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51fc3aeb-f887-4fbf-b780-07adb3137e93
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-51fc3aeb-f887-4fbf-b780-07adb3137e93","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-50fd507f-010a-4fa7-b8c4-0dd6fbb7ab4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50fd507f-010a-4fa7-b8c4-0dd6fbb7ab4b
Content-Type: application/json

--- request body ---
{"handle":"qa-767c513be0a5","password":"****"}

--- response: 200 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-50fd507f-010a-4fa7-b8c4-0dd6fbb7ab4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b8e9351f-20de-4d2c-b522-0e8adf14011b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ed2d5eed-1c1c-49a9-ad92-656e4f160a9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed2d5eed-1c1c-49a9-ad92-656e4f160a9e
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ed2d5eed-1c1c-49a9-ad92-656e4f160a9e
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
correlation: qa-13da3f11-16d2-4548-943c-a816d8067665

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13da3f11-16d2-4548-943c-a816d8067665
Content-Type: application/json

--- request body ---
{"handle":"qa-767c513be0a5","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13da3f11-16d2-4548-943c-a816d8067665
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-13da3f11-16d2-4548-943c-a816d8067665"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b26191dc-8341-402f-90ba-fc8ac25ad26a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b26191dc-8341-402f-90ba-fc8ac25ad26a
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b26191dc-8341-402f-90ba-fc8ac25ad26a
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
correlation: qa-3f2ef39d-22e3-4b8f-80c9-b04d477b327e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f2ef39d-22e3-4b8f-80c9-b04d477b327e
Content-Type: application/json

--- request body ---
{"handle":"qa-db24c6d8727c","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f2ef39d-22e3-4b8f-80c9-b04d477b327e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3f2ef39d-22e3-4b8f-80c9-b04d477b327e"}
```
