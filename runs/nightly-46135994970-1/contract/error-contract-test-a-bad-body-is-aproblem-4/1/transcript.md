# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 62 | `qa-9c086a31-159c-42f9-94ab-329e3ed45d17` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-87980cb1-0503-458e-a51c-28fb55265e2f` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-5a1f5c1d-a8a7-4794-9709-86928c6e939a` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-021b2dbf-ad73-4201-98d4-a9859be713d2` |
| 5 | `POST /v1/accounts` | 415 | 32 | `qa-0c9b9c57-157c-41e8-84d7-b2594633cf02` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-7654337e-fde9-43af-9bcc-aabe4f12a21f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-c75c4034-5c48-42e8-aed6-2171aba837bb` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-9fe48ae3-f811-4317-a57e-d6a7ece69627` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-6946588e-99d2-41f1-95f4-1355062df1b1` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-680791c4-594a-4aab-8fd6-9698f9b0a095` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9c086a31-159c-42f9-94ab-329e3ed45d17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c086a31-159c-42f9-94ab-329e3ed45d17
Content-Type: application/json

--- request body ---
{"handle":"qa-540ff67a6657","displayName":"QA 540ff67a6657","password":"****","region":"eu"}

--- response: 201 in 62 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c086a31-159c-42f9-94ab-329e3ed45d17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Location: /v1/accounts/qa-540ff67a6657
X-Served-Region: eu
Content-Length: 181

{"id":"acc_778c7d0e-ce43-4766-ac6b-1aec4396fa29","handle":"qa-540ff67a6657","displayName":"QA 540ff67a6657","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.203719643Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-87980cb1-0503-458e-a51c-28fb55265e2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87980cb1-0503-458e-a51c-28fb55265e2f
Content-Type: application/json

--- request body ---
{"handle":"qa-3e4b3779ce78","displayName":"QA 3e4b3779ce78","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-87980cb1-0503-458e-a51c-28fb55265e2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Location: /v1/accounts/qa-3e4b3779ce78
X-Served-Region: eu
Content-Length: 181

{"id":"acc_701d4905-49a4-4d67-a3a0-0fbed40c4e39","handle":"qa-3e4b3779ce78","displayName":"QA 3e4b3779ce78","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.271813029Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5a1f5c1d-a8a7-4794-9709-86928c6e939a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a1f5c1d-a8a7-4794-9709-86928c6e939a
Content-Type: application/json

--- request body ---
{"handle":"qa-540ff67a6657","password":"****"}

--- response: 200 in 41 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a1f5c1d-a8a7-4794-9709-86928c6e939a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_778c7d0e-ce43-4766-ac6b-1aec4396fa29"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-021b2dbf-ad73-4201-98d4-a9859be713d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-021b2dbf-ad73-4201-98d4-a9859be713d2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3e4b3779ce78","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-021b2dbf-ad73-4201-98d4-a9859be713d2
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
Location: /v1/conversations/cnv_8c66f40b-910d-437d-b154-e9feaadb13b8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8c66f40b-910d-437d-b154-e9feaadb13b8","subject":"Error contract","status":"open","region":"eu","participants":["qa-540ff67a6657","qa-3e4b3779ce78"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:24.382158945Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-0c9b9c57-157c-41e8-84d7-b2594633cf02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c9b9c57-157c-41e8-84d7-b2594633cf02
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c9b9c57-157c-41e8-84d7-b2594633cf02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 7
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-0c9b9c57-157c-41e8-84d7-b2594633cf02"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7654337e-fde9-43af-9bcc-aabe4f12a21f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7654337e-fde9-43af-9bcc-aabe4f12a21f
Content-Type: application/json

--- request body ---
{"handle":"qa-3e4b3779ce78","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7654337e-fde9-43af-9bcc-aabe4f12a21f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_701d4905-49a4-4d67-a3a0-0fbed40c4e39"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c75c4034-5c48-42e8-aed6-2171aba837bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c75c4034-5c48-42e8-aed6-2171aba837bb
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c75c4034-5c48-42e8-aed6-2171aba837bb
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
correlation: qa-9fe48ae3-f811-4317-a57e-d6a7ece69627

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fe48ae3-f811-4317-a57e-d6a7ece69627
Content-Type: application/json

--- request body ---
{"handle":"qa-3e4b3779ce78","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fe48ae3-f811-4317-a57e-d6a7ece69627
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9fe48ae3-f811-4317-a57e-d6a7ece69627"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6946588e-99d2-41f1-95f4-1355062df1b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6946588e-99d2-41f1-95f4-1355062df1b1
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6946588e-99d2-41f1-95f4-1355062df1b1
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
correlation: qa-680791c4-594a-4aab-8fd6-9698f9b0a095

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-680791c4-594a-4aab-8fd6-9698f9b0a095
Content-Type: application/json

--- request body ---
{"handle":"qa-540ff67a6657","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-680791c4-594a-4aab-8fd6-9698f9b0a095
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-680791c4-594a-4aab-8fd6-9698f9b0a095"}
```
