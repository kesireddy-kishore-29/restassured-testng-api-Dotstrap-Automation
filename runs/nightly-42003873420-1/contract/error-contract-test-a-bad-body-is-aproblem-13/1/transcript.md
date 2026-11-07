# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-59bd2708-600f-498a-82cb-a494759401ed` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-e8437ba9-aa2e-4fd9-8fab-2e6c2f26d42f` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-627e8d7e-fbff-488c-93a3-fe844c13eaed` |
| 4 | `POST /v1/conversations` | 201 | 82 | `qa-f40474ab-081f-4323-a99a-7cce976508ba` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 17 | `qa-8d5db9aa-0828-4cf1-80eb-f1d7216e9c59` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-41e3b686-6420-422a-9334-6aa206a25139` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-bd01aff9-54e0-48f5-972b-f0166dbc2d36` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-173e1878-a1d8-4e1d-9f21-f41ffab90c2b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-7f85b20a-8edd-47d9-90f0-1106e0aff0fc` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-19ae2657-b4c4-4c14-bac9-e0cda4cbc518` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-59bd2708-600f-498a-82cb-a494759401ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59bd2708-600f-498a-82cb-a494759401ed
Content-Type: application/json

--- request body ---
{"handle":"qa-e849887940db","displayName":"QA e849887940db","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-59bd2708-600f-498a-82cb-a494759401ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 6
Location: /v1/accounts/qa-e849887940db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1ded6833-502e-4165-992d-d16133f07ac0","handle":"qa-e849887940db","displayName":"QA e849887940db","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.681918839Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e8437ba9-aa2e-4fd9-8fab-2e6c2f26d42f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8437ba9-aa2e-4fd9-8fab-2e6c2f26d42f
Content-Type: application/json

--- request body ---
{"handle":"qa-c75f526cceaf","displayName":"QA c75f526cceaf","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8437ba9-aa2e-4fd9-8fab-2e6c2f26d42f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 6
Location: /v1/accounts/qa-c75f526cceaf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4dafd6c-9cd9-413b-8ffa-0db1604d134c","handle":"qa-c75f526cceaf","displayName":"QA c75f526cceaf","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.724830475Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-627e8d7e-fbff-488c-93a3-fe844c13eaed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-627e8d7e-fbff-488c-93a3-fe844c13eaed
Content-Type: application/json

--- request body ---
{"handle":"qa-e849887940db","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-627e8d7e-fbff-488c-93a3-fe844c13eaed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1ded6833-502e-4165-992d-d16133f07ac0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f40474ab-081f-4323-a99a-7cce976508ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f40474ab-081f-4323-a99a-7cce976508ba
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c75f526cceaf","subject":"Error contract","message":"Hi"}

--- response: 201 in 82 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f40474ab-081f-4323-a99a-7cce976508ba
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
Location: /v1/conversations/cnv_806e6935-5a12-4de3-ae08-0ce3bc6c3ac2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_806e6935-5a12-4de3-ae08-0ce3bc6c3ac2","subject":"Error contract","status":"open","region":"eu","participants":["qa-e849887940db","qa-c75f526cceaf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.857515751Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_806e6935-5a12-4de3-ae08-0ce3bc6c3ac2/messages
correlation: qa-8d5db9aa-0828-4cf1-80eb-f1d7216e9c59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d5db9aa-0828-4cf1-80eb-f1d7216e9c59
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d5db9aa-0828-4cf1-80eb-f1d7216e9c59
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_806e6935-5a12-4de3-ae08-0ce3bc6c3ac2/messages","correlationId":"qa-8d5db9aa-0828-4cf1-80eb-f1d7216e9c59"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-41e3b686-6420-422a-9334-6aa206a25139

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41e3b686-6420-422a-9334-6aa206a25139
Content-Type: application/json

--- request body ---
{"handle":"qa-c75f526cceaf","password":"****"}

--- response: 200 in 43 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-41e3b686-6420-422a-9334-6aa206a25139
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4dafd6c-9cd9-413b-8ffa-0db1604d134c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bd01aff9-54e0-48f5-972b-f0166dbc2d36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd01aff9-54e0-48f5-972b-f0166dbc2d36
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bd01aff9-54e0-48f5-972b-f0166dbc2d36
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
correlation: qa-173e1878-a1d8-4e1d-9f21-f41ffab90c2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-173e1878-a1d8-4e1d-9f21-f41ffab90c2b
Content-Type: application/json

--- request body ---
{"handle":"qa-c75f526cceaf","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-173e1878-a1d8-4e1d-9f21-f41ffab90c2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-173e1878-a1d8-4e1d-9f21-f41ffab90c2b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7f85b20a-8edd-47d9-90f0-1106e0aff0fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f85b20a-8edd-47d9-90f0-1106e0aff0fc
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7f85b20a-8edd-47d9-90f0-1106e0aff0fc
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
correlation: qa-19ae2657-b4c4-4c14-bac9-e0cda4cbc518

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19ae2657-b4c4-4c14-bac9-e0cda4cbc518
Content-Type: application/json

--- request body ---
{"handle":"qa-e849887940db","password":"****"}

--- response: 401 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19ae2657-b4c4-4c14-bac9-e0cda4cbc518
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-19ae2657-b4c4-4c14-bac9-e0cda4cbc518"}
```
