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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-ef40e68e-df26-4a41-9243-a5170c61eeca` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-8d2c9466-0ac4-425b-9b74-7766e8fa71d2` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-a059869a-a15a-44ca-ab8a-db1e6baf4974` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-5d46122b-594b-4c78-af84-9c91a7afa0ac` |
| 5 | `PATCH /v1/accounts/me` | 422 | 30 | `qa-e2709f5c-1088-466f-a537-35e4aa99faeb` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-0e98f5dd-3ba2-4779-b9ef-433d9e38e91c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 91 | `qa-3c21322c-e6c4-4321-8b4b-691a1c326b57` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-04ae8fc4-7558-41de-b1e4-bcd707e72a94` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-ff781b48-6d08-498b-9c1f-e3a3dfdc6af9` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-551f5552-514e-48b4-a486-b86eceb5165c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ef40e68e-df26-4a41-9243-a5170c61eeca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef40e68e-df26-4a41-9243-a5170c61eeca
Content-Type: application/json

--- request body ---
{"handle":"qa-2f6de220646b","displayName":"QA 2f6de220646b","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef40e68e-df26-4a41-9243-a5170c61eeca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 7
Location: /v1/accounts/qa-2f6de220646b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20016b5a-45cf-40aa-abee-d57a8edb8343","handle":"qa-2f6de220646b","displayName":"QA 2f6de220646b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.170187170Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8d2c9466-0ac4-425b-9b74-7766e8fa71d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d2c9466-0ac4-425b-9b74-7766e8fa71d2
Content-Type: application/json

--- request body ---
{"handle":"qa-01b7b7db7f6f","displayName":"QA 01b7b7db7f6f","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d2c9466-0ac4-425b-9b74-7766e8fa71d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 7
Location: /v1/accounts/qa-01b7b7db7f6f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3bf1d766-3b37-431b-bbe4-6da88fb9f9fd","handle":"qa-01b7b7db7f6f","displayName":"QA 01b7b7db7f6f","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.217011765Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a059869a-a15a-44ca-ab8a-db1e6baf4974

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a059869a-a15a-44ca-ab8a-db1e6baf4974
Content-Type: application/json

--- request body ---
{"handle":"qa-2f6de220646b","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-a059869a-a15a-44ca-ab8a-db1e6baf4974
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20016b5a-45cf-40aa-abee-d57a8edb8343"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5d46122b-594b-4c78-af84-9c91a7afa0ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d46122b-594b-4c78-af84-9c91a7afa0ac
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-01b7b7db7f6f","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d46122b-594b-4c78-af84-9c91a7afa0ac
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
Location: /v1/conversations/cnv_1c334941-7df2-4622-a150-b07eaefe4982
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1c334941-7df2-4622-a150-b07eaefe4982","subject":"Error contract","status":"open","region":"eu","participants":["qa-2f6de220646b","qa-01b7b7db7f6f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.271797321Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-e2709f5c-1088-466f-a537-35e4aa99faeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2709f5c-1088-466f-a537-35e4aa99faeb
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2709f5c-1088-466f-a537-35e4aa99faeb
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-e2709f5c-1088-466f-a537-35e4aa99faeb","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0e98f5dd-3ba2-4779-b9ef-433d9e38e91c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e98f5dd-3ba2-4779-b9ef-433d9e38e91c
Content-Type: application/json

--- request body ---
{"handle":"qa-01b7b7db7f6f","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e98f5dd-3ba2-4779-b9ef-433d9e38e91c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3bf1d766-3b37-431b-bbe4-6da88fb9f9fd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3c21322c-e6c4-4321-8b4b-691a1c326b57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c21322c-e6c4-4321-8b4b-691a1c326b57
Content-Type: application/json

--- response: 204 in 91 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3c21322c-e6c4-4321-8b4b-691a1c326b57
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
correlation: qa-04ae8fc4-7558-41de-b1e4-bcd707e72a94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04ae8fc4-7558-41de-b1e4-bcd707e72a94
Content-Type: application/json

--- request body ---
{"handle":"qa-01b7b7db7f6f","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04ae8fc4-7558-41de-b1e4-bcd707e72a94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-04ae8fc4-7558-41de-b1e4-bcd707e72a94"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff781b48-6d08-498b-9c1f-e3a3dfdc6af9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff781b48-6d08-498b-9c1f-e3a3dfdc6af9
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff781b48-6d08-498b-9c1f-e3a3dfdc6af9
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
correlation: qa-551f5552-514e-48b4-a486-b86eceb5165c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-551f5552-514e-48b4-a486-b86eceb5165c
Content-Type: application/json

--- request body ---
{"handle":"qa-2f6de220646b","password":"****"}

--- response: 401 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-551f5552-514e-48b4-a486-b86eceb5165c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-551f5552-514e-48b4-a486-b86eceb5165c"}
```
