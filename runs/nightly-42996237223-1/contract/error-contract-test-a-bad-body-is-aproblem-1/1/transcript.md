# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-db816752-691d-4843-8852-a16fe08f4462` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-fe421968-e697-47bc-aa86-6bae9d509538` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-d8269ceb-ee68-40bb-8a17-e03ebcd9b7d2` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-94871bc3-2c41-43b4-b4c9-9a876a5f8d05` |
| 5 | `POST /v1/auth/token` | 415 | 45 | `qa-49f0fef4-aafc-4a55-add3-9c6608886f9b` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-8ef45139-0307-4c7c-9945-75a28d86bff3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-8e749a7d-c5b8-4064-9bcd-a050c565788a` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-987ec640-0437-4136-84fb-82b9b552d791` |
| 9 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-85a0acaf-ae64-4f24-a8fb-e4c6e35bfa96` |
| 10 | `POST /v1/auth/token` | 401 | 38 | `qa-876a8e28-3ce1-417c-a426-8a05b09e4e98` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-db816752-691d-4843-8852-a16fe08f4462

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db816752-691d-4843-8852-a16fe08f4462
Content-Type: application/json

--- request body ---
{"handle":"qa-db297268ef4d","displayName":"QA db297268ef4d","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-db816752-691d-4843-8852-a16fe08f4462
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Location: /v1/accounts/qa-db297268ef4d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c28c291c-76ca-4722-89b8-456af48c088c","handle":"qa-db297268ef4d","displayName":"QA db297268ef4d","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.060433463Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fe421968-e697-47bc-aa86-6bae9d509538

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe421968-e697-47bc-aa86-6bae9d509538
Content-Type: application/json

--- request body ---
{"handle":"qa-2000dc3e0f6b","displayName":"QA 2000dc3e0f6b","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe421968-e697-47bc-aa86-6bae9d509538
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Location: /v1/accounts/qa-2000dc3e0f6b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ec0706e7-905d-435d-8552-9b66b3063f2a","handle":"qa-2000dc3e0f6b","displayName":"QA 2000dc3e0f6b","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.113437334Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d8269ceb-ee68-40bb-8a17-e03ebcd9b7d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8269ceb-ee68-40bb-8a17-e03ebcd9b7d2
Content-Type: application/json

--- request body ---
{"handle":"qa-db297268ef4d","password":"****"}

--- response: 200 in 53 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8269ceb-ee68-40bb-8a17-e03ebcd9b7d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c28c291c-76ca-4722-89b8-456af48c088c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-94871bc3-2c41-43b4-b4c9-9a876a5f8d05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94871bc3-2c41-43b4-b4c9-9a876a5f8d05
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2000dc3e0f6b","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-94871bc3-2c41-43b4-b4c9-9a876a5f8d05
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
Location: /v1/conversations/cnv_f1a7731d-0763-49a7-95de-9a1660888a64
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f1a7731d-0763-49a7-95de-9a1660888a64","subject":"Error contract","status":"open","region":"eu","participants":["qa-db297268ef4d","qa-2000dc3e0f6b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:36.229749307Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-49f0fef4-aafc-4a55-add3-9c6608886f9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49f0fef4-aafc-4a55-add3-9c6608886f9b
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 45 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49f0fef4-aafc-4a55-add3-9c6608886f9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-49f0fef4-aafc-4a55-add3-9c6608886f9b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8ef45139-0307-4c7c-9945-75a28d86bff3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ef45139-0307-4c7c-9945-75a28d86bff3
Content-Type: application/json

--- request body ---
{"handle":"qa-2000dc3e0f6b","password":"****"}

--- response: 200 in 57 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ef45139-0307-4c7c-9945-75a28d86bff3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ec0706e7-905d-435d-8552-9b66b3063f2a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e749a7d-c5b8-4064-9bcd-a050c565788a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e749a7d-c5b8-4064-9bcd-a050c565788a
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e749a7d-c5b8-4064-9bcd-a050c565788a
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
correlation: qa-987ec640-0437-4136-84fb-82b9b552d791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-987ec640-0437-4136-84fb-82b9b552d791
Content-Type: application/json

--- request body ---
{"handle":"qa-2000dc3e0f6b","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-987ec640-0437-4136-84fb-82b9b552d791
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-987ec640-0437-4136-84fb-82b9b552d791"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-85a0acaf-ae64-4f24-a8fb-e4c6e35bfa96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85a0acaf-ae64-4f24-a8fb-e4c6e35bfa96
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-85a0acaf-ae64-4f24-a8fb-e4c6e35bfa96
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
correlation: qa-876a8e28-3ce1-417c-a426-8a05b09e4e98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-876a8e28-3ce1-417c-a426-8a05b09e4e98
Content-Type: application/json

--- request body ---
{"handle":"qa-db297268ef4d","password":"****"}

--- response: 401 in 38 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-876a8e28-3ce1-417c-a426-8a05b09e4e98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-876a8e28-3ce1-417c-a426-8a05b09e4e98"}
```
