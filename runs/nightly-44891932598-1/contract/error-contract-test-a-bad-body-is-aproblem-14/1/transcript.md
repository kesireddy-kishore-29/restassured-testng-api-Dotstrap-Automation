# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-905273ae-056a-4519-96b6-e72f5c7575c0` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-06bf61e5-5f94-4760-8954-d81f4a82402e` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-b2e618f2-221a-4e80-ae04-6d6d6edf8443` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-f8d298f0-d8eb-4466-87ca-03e10a13e1d7` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 27 | `qa-80a71588-573b-4d63-8369-c1beee904be2` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-4b381135-7986-44de-a421-3778acee4dfa` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-0571a648-55d9-4681-b8f8-091559995366` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-95089ea9-94ed-4171-99ee-cdd6b67065c4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-1a1d7a86-bda8-4178-82f3-990eb0891b1e` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-cb8eb1d0-8451-437f-8a41-de636506ab75` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-905273ae-056a-4519-96b6-e72f5c7575c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-905273ae-056a-4519-96b6-e72f5c7575c0
Content-Type: application/json

--- request body ---
{"handle":"qa-b275c14aef0a","displayName":"QA b275c14aef0a","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-905273ae-056a-4519-96b6-e72f5c7575c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 6
Location: /v1/accounts/qa-b275c14aef0a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_13dd2d9b-2686-4aae-9e2c-4e11ce1ba815","handle":"qa-b275c14aef0a","displayName":"QA b275c14aef0a","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.240273206Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-06bf61e5-5f94-4760-8954-d81f4a82402e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06bf61e5-5f94-4760-8954-d81f4a82402e
Content-Type: application/json

--- request body ---
{"handle":"qa-b9f4ecdca351","displayName":"QA b9f4ecdca351","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-06bf61e5-5f94-4760-8954-d81f4a82402e
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
Location: /v1/accounts/qa-b9f4ecdca351
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff6f1b2c-7492-4beb-a4d2-8cd6bf61aa41","handle":"qa-b9f4ecdca351","displayName":"QA b9f4ecdca351","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.272028216Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b2e618f2-221a-4e80-ae04-6d6d6edf8443

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2e618f2-221a-4e80-ae04-6d6d6edf8443
Content-Type: application/json

--- request body ---
{"handle":"qa-b275c14aef0a","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2e618f2-221a-4e80-ae04-6d6d6edf8443
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_13dd2d9b-2686-4aae-9e2c-4e11ce1ba815"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f8d298f0-d8eb-4466-87ca-03e10a13e1d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8d298f0-d8eb-4466-87ca-03e10a13e1d7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b9f4ecdca351","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8d298f0-d8eb-4466-87ca-03e10a13e1d7
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
Location: /v1/conversations/cnv_e255e4aa-39d2-4d86-861f-84324ac799ce
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e255e4aa-39d2-4d86-861f-84324ac799ce","subject":"Error contract","status":"open","region":"eu","participants":["qa-b275c14aef0a","qa-b9f4ecdca351"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:12.358750502Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_e255e4aa-39d2-4d86-861f-84324ac799ce/messages
correlation: qa-80a71588-573b-4d63-8369-c1beee904be2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80a71588-573b-4d63-8369-c1beee904be2
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80a71588-573b-4d63-8369-c1beee904be2
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_e255e4aa-39d2-4d86-861f-84324ac799ce/messages","correlationId":"qa-80a71588-573b-4d63-8369-c1beee904be2","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4b381135-7986-44de-a421-3778acee4dfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b381135-7986-44de-a421-3778acee4dfa
Content-Type: application/json

--- request body ---
{"handle":"qa-b9f4ecdca351","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b381135-7986-44de-a421-3778acee4dfa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ff6f1b2c-7492-4beb-a4d2-8cd6bf61aa41"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0571a648-55d9-4681-b8f8-091559995366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0571a648-55d9-4681-b8f8-091559995366
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0571a648-55d9-4681-b8f8-091559995366
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
correlation: qa-95089ea9-94ed-4171-99ee-cdd6b67065c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95089ea9-94ed-4171-99ee-cdd6b67065c4
Content-Type: application/json

--- request body ---
{"handle":"qa-b9f4ecdca351","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95089ea9-94ed-4171-99ee-cdd6b67065c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-95089ea9-94ed-4171-99ee-cdd6b67065c4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1a1d7a86-bda8-4178-82f3-990eb0891b1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a1d7a86-bda8-4178-82f3-990eb0891b1e
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1a1d7a86-bda8-4178-82f3-990eb0891b1e
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
correlation: qa-cb8eb1d0-8451-437f-8a41-de636506ab75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb8eb1d0-8451-437f-8a41-de636506ab75
Content-Type: application/json

--- request body ---
{"handle":"qa-b275c14aef0a","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb8eb1d0-8451-437f-8a41-de636506ab75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cb8eb1d0-8451-437f-8a41-de636506ab75"}
```
