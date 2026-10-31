# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-72581a51-4cd1-458a-8b91-21a6c1dfb0e0` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-e986f479-85f0-4f2f-9f30-df022c4c0802` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-7ad9c6b2-571d-4260-bb86-82eb9add7d67` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-07168bff-bea8-4728-9681-1070600fb904` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 33 | `qa-80b1c78e-4a98-4f30-9d9e-6276e06f7a43` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-ccfb9274-4875-4859-947f-44ff2be9fa3b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-9f137076-d8b0-4d54-a0e6-1dbcc47b5fc8` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-1ec00a24-2ef9-46d7-843a-08fa01b33026` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-92a43068-2298-4c6d-9b4b-9b1beb5bc93b` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-da105d7f-d20f-4e59-a287-f02f871487e5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-72581a51-4cd1-458a-8b91-21a6c1dfb0e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72581a51-4cd1-458a-8b91-21a6c1dfb0e0
Content-Type: application/json

--- request body ---
{"handle":"qa-17a0e7dfd5a0","displayName":"QA 17a0e7dfd5a0","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-72581a51-4cd1-458a-8b91-21a6c1dfb0e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Location: /v1/accounts/qa-17a0e7dfd5a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e3419c76-2ba1-4399-ad04-7adddd51321a","handle":"qa-17a0e7dfd5a0","displayName":"QA 17a0e7dfd5a0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.936996953Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e986f479-85f0-4f2f-9f30-df022c4c0802

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e986f479-85f0-4f2f-9f30-df022c4c0802
Content-Type: application/json

--- request body ---
{"handle":"qa-9c97e9d4fb92","displayName":"QA 9c97e9d4fb92","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-e986f479-85f0-4f2f-9f30-df022c4c0802
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 7
Location: /v1/accounts/qa-9c97e9d4fb92
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff63b638-1530-4032-99bd-11950bd2b023","handle":"qa-9c97e9d4fb92","displayName":"QA 9c97e9d4fb92","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.987363108Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7ad9c6b2-571d-4260-bb86-82eb9add7d67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ad9c6b2-571d-4260-bb86-82eb9add7d67
Content-Type: application/json

--- request body ---
{"handle":"qa-17a0e7dfd5a0","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ad9c6b2-571d-4260-bb86-82eb9add7d67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e3419c76-2ba1-4399-ad04-7adddd51321a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-07168bff-bea8-4728-9681-1070600fb904

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07168bff-bea8-4728-9681-1070600fb904
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9c97e9d4fb92","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-07168bff-bea8-4728-9681-1070600fb904
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
Location: /v1/conversations/cnv_88dfbf83-49d4-40d2-9a8a-f598bb455905
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_88dfbf83-49d4-40d2-9a8a-f598bb455905","subject":"Error contract","status":"open","region":"eu","participants":["qa-17a0e7dfd5a0","qa-9c97e9d4fb92"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:01.064014561Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_88dfbf83-49d4-40d2-9a8a-f598bb455905/messages
correlation: qa-80b1c78e-4a98-4f30-9d9e-6276e06f7a43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80b1c78e-4a98-4f30-9d9e-6276e06f7a43
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 33 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80b1c78e-4a98-4f30-9d9e-6276e06f7a43
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_88dfbf83-49d4-40d2-9a8a-f598bb455905/messages","correlationId":"qa-80b1c78e-4a98-4f30-9d9e-6276e06f7a43"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ccfb9274-4875-4859-947f-44ff2be9fa3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccfb9274-4875-4859-947f-44ff2be9fa3b
Content-Type: application/json

--- request body ---
{"handle":"qa-9c97e9d4fb92","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccfb9274-4875-4859-947f-44ff2be9fa3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ff63b638-1530-4032-99bd-11950bd2b023"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9f137076-d8b0-4d54-a0e6-1dbcc47b5fc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f137076-d8b0-4d54-a0e6-1dbcc47b5fc8
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9f137076-d8b0-4d54-a0e6-1dbcc47b5fc8
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
correlation: qa-1ec00a24-2ef9-46d7-843a-08fa01b33026

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ec00a24-2ef9-46d7-843a-08fa01b33026
Content-Type: application/json

--- request body ---
{"handle":"qa-9c97e9d4fb92","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ec00a24-2ef9-46d7-843a-08fa01b33026
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ec00a24-2ef9-46d7-843a-08fa01b33026"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-92a43068-2298-4c6d-9b4b-9b1beb5bc93b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92a43068-2298-4c6d-9b4b-9b1beb5bc93b
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-92a43068-2298-4c6d-9b4b-9b1beb5bc93b
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
correlation: qa-da105d7f-d20f-4e59-a287-f02f871487e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da105d7f-d20f-4e59-a287-f02f871487e5
Content-Type: application/json

--- request body ---
{"handle":"qa-17a0e7dfd5a0","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da105d7f-d20f-4e59-a287-f02f871487e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-da105d7f-d20f-4e59-a287-f02f871487e5"}
```
