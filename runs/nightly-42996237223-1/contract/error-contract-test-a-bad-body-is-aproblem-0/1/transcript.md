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
| 1 | `POST /v1/accounts` | 201 | 72 | `qa-4885cd11-8d9c-4dbc-9a4b-d0de12b433c1` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-113efdfa-9718-42d2-b3fe-5ab330da1d09` |
| 3 | `POST /v1/auth/token` | 200 | 59 | `qa-28c71cc9-b6dd-4bed-acad-37da8b282743` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-90afae93-dda3-4162-8147-0dca5a337294` |
| 5 | `POST /v1/auth/token` | 400 | 29 | `qa-5c55ac1e-4dfa-4f1e-89d9-8324584ad6bb` |
| 6 | `POST /v1/auth/token` | 200 | 56 | `qa-3c33e9c5-20e5-453d-adbd-dd019334e149` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-470b0125-1283-4fa6-92e3-d1a5a2517245` |
| 8 | `POST /v1/auth/token` | 401 | 35 | `qa-76618751-6eb2-402b-bdab-2e851a7a5fc4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-a3fa4d1d-d521-4d04-9f34-3be5db8f73ba` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-8f38e43b-da8a-4203-8755-df0a540ecf40` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4885cd11-8d9c-4dbc-9a4b-d0de12b433c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4885cd11-8d9c-4dbc-9a4b-d0de12b433c1
Content-Type: application/json

--- request body ---
{"handle":"qa-740a1aa0c81c","displayName":"QA 740a1aa0c81c","password":"****","region":"eu"}

--- response: 201 in 72 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4885cd11-8d9c-4dbc-9a4b-d0de12b433c1
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
Location: /v1/accounts/qa-740a1aa0c81c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_874a6b13-eac7-47e5-8a35-e19a48d8be8b","handle":"qa-740a1aa0c81c","displayName":"QA 740a1aa0c81c","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.074247281Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-113efdfa-9718-42d2-b3fe-5ab330da1d09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-113efdfa-9718-42d2-b3fe-5ab330da1d09
Content-Type: application/json

--- request body ---
{"handle":"qa-866069cd88c7","displayName":"QA 866069cd88c7","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-113efdfa-9718-42d2-b3fe-5ab330da1d09
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
Location: /v1/accounts/qa-866069cd88c7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4fd9117e-962f-4369-97f9-fe5d784171b3","handle":"qa-866069cd88c7","displayName":"QA 866069cd88c7","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.136914492Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-28c71cc9-b6dd-4bed-acad-37da8b282743

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28c71cc9-b6dd-4bed-acad-37da8b282743
Content-Type: application/json

--- request body ---
{"handle":"qa-740a1aa0c81c","password":"****"}

--- response: 200 in 59 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-28c71cc9-b6dd-4bed-acad-37da8b282743
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_874a6b13-eac7-47e5-8a35-e19a48d8be8b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-90afae93-dda3-4162-8147-0dca5a337294

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90afae93-dda3-4162-8147-0dca5a337294
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-866069cd88c7","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-90afae93-dda3-4162-8147-0dca5a337294
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
Location: /v1/conversations/cnv_b44bf4d5-de72-4227-b7e9-011f46e2fc56
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b44bf4d5-de72-4227-b7e9-011f46e2fc56","subject":"Error contract","status":"open","region":"eu","participants":["qa-740a1aa0c81c","qa-866069cd88c7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:36.268397062Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-5c55ac1e-4dfa-4f1e-89d9-8324584ad6bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c55ac1e-4dfa-4f1e-89d9-8324584ad6bb
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 29 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c55ac1e-4dfa-4f1e-89d9-8324584ad6bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-5c55ac1e-4dfa-4f1e-89d9-8324584ad6bb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3c33e9c5-20e5-453d-adbd-dd019334e149

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c33e9c5-20e5-453d-adbd-dd019334e149
Content-Type: application/json

--- request body ---
{"handle":"qa-866069cd88c7","password":"****"}

--- response: 200 in 56 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c33e9c5-20e5-453d-adbd-dd019334e149
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4fd9117e-962f-4369-97f9-fe5d784171b3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-470b0125-1283-4fa6-92e3-d1a5a2517245

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-470b0125-1283-4fa6-92e3-d1a5a2517245
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-470b0125-1283-4fa6-92e3-d1a5a2517245
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
correlation: qa-76618751-6eb2-402b-bdab-2e851a7a5fc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76618751-6eb2-402b-bdab-2e851a7a5fc4
Content-Type: application/json

--- request body ---
{"handle":"qa-866069cd88c7","password":"****"}

--- response: 401 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76618751-6eb2-402b-bdab-2e851a7a5fc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-76618751-6eb2-402b-bdab-2e851a7a5fc4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a3fa4d1d-d521-4d04-9f34-3be5db8f73ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3fa4d1d-d521-4d04-9f34-3be5db8f73ba
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a3fa4d1d-d521-4d04-9f34-3be5db8f73ba
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
correlation: qa-8f38e43b-da8a-4203-8755-df0a540ecf40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f38e43b-da8a-4203-8755-df0a540ecf40
Content-Type: application/json

--- request body ---
{"handle":"qa-740a1aa0c81c","password":"****"}

--- response: 401 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f38e43b-da8a-4203-8755-df0a540ecf40
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f38e43b-da8a-4203-8755-df0a540ecf40"}
```
