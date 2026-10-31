# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-6740f67b-7a01-46e8-bf76-d9cf84607af4` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-c491de35-a5b2-4bdd-9716-6883ca39b0c4` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-c6eb844d-945b-465d-bb8a-cd7ed347fb98` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-e24626bc-e7a1-4c5e-8638-568626f26d96` |
| 5 | `GET /v1/credits/ledger` | 503 | 23 | `qa-1bcde681-1e7c-4799-8066-8750b71a783b` |
| 6 | `POST /v1/auth/token` | 200 | 70 | `qa-aff294c4-6278-4bd8-a42a-3fae5b1700f7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-f6547f42-1bdd-49a4-b5b1-1b080f71169c` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-aa47c323-e37d-41a2-b51a-b6e7cd5a210c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-b7f6748d-04de-4603-9b52-b4ce8ad0665a` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-ce51d37b-7c42-4166-be5d-94644849fba0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6740f67b-7a01-46e8-bf76-d9cf84607af4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6740f67b-7a01-46e8-bf76-d9cf84607af4
Content-Type: application/json

--- request body ---
{"handle":"qa-384c7cb84c5b","displayName":"QA 384c7cb84c5b","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-6740f67b-7a01-46e8-bf76-d9cf84607af4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Location: /v1/accounts/qa-384c7cb84c5b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bcc63e5a-7e48-40be-88bd-a42b8383fbe5","handle":"qa-384c7cb84c5b","displayName":"QA 384c7cb84c5b","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.999664964Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c491de35-a5b2-4bdd-9716-6883ca39b0c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c491de35-a5b2-4bdd-9716-6883ca39b0c4
Content-Type: application/json

--- request body ---
{"handle":"qa-93893ddaba39","displayName":"QA 93893ddaba39","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c491de35-a5b2-4bdd-9716-6883ca39b0c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 7
Location: /v1/accounts/qa-93893ddaba39
X-Served-Region: eu
Content-Length: 181

{"id":"acc_941591ed-f2df-4057-9806-aa9839337395","handle":"qa-93893ddaba39","displayName":"QA 93893ddaba39","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.055645016Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c6eb844d-945b-465d-bb8a-cd7ed347fb98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6eb844d-945b-465d-bb8a-cd7ed347fb98
Content-Type: application/json

--- request body ---
{"handle":"qa-384c7cb84c5b","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6eb844d-945b-465d-bb8a-cd7ed347fb98
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bcc63e5a-7e48-40be-88bd-a42b8383fbe5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e24626bc-e7a1-4c5e-8638-568626f26d96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e24626bc-e7a1-4c5e-8638-568626f26d96
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-93893ddaba39","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e24626bc-e7a1-4c5e-8638-568626f26d96
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
Location: /v1/conversations/cnv_21fb4820-4079-4ede-8c8b-820a70545a12
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_21fb4820-4079-4ede-8c8b-820a70545a12","subject":"Error contract","status":"open","region":"eu","participants":["qa-384c7cb84c5b","qa-93893ddaba39"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:05.187362884Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-1bcde681-1e7c-4799-8066-8750b71a783b

--- request headers ---
Accept: application/json
X-Fault-Key: a02c0efd-b0c5-4121-958d-33f601df6ff7
X-Fault: unavailable-once
X-Correlation-Id: qa-1bcde681-1e7c-4799-8066-8750b71a783b
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1bcde681-1e7c-4799-8066-8750b71a783b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-1bcde681-1e7c-4799-8066-8750b71a783b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-aff294c4-6278-4bd8-a42a-3fae5b1700f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aff294c4-6278-4bd8-a42a-3fae5b1700f7
Content-Type: application/json

--- request body ---
{"handle":"qa-93893ddaba39","password":"****"}

--- response: 200 in 70 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-aff294c4-6278-4bd8-a42a-3fae5b1700f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_941591ed-f2df-4057-9806-aa9839337395"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f6547f42-1bdd-49a4-b5b1-1b080f71169c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6547f42-1bdd-49a4-b5b1-1b080f71169c
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f6547f42-1bdd-49a4-b5b1-1b080f71169c
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
correlation: qa-aa47c323-e37d-41a2-b51a-b6e7cd5a210c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa47c323-e37d-41a2-b51a-b6e7cd5a210c
Content-Type: application/json

--- request body ---
{"handle":"qa-93893ddaba39","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa47c323-e37d-41a2-b51a-b6e7cd5a210c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa47c323-e37d-41a2-b51a-b6e7cd5a210c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b7f6748d-04de-4603-9b52-b4ce8ad0665a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7f6748d-04de-4603-9b52-b4ce8ad0665a
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b7f6748d-04de-4603-9b52-b4ce8ad0665a
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
correlation: qa-ce51d37b-7c42-4166-be5d-94644849fba0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce51d37b-7c42-4166-be5d-94644849fba0
Content-Type: application/json

--- request body ---
{"handle":"qa-384c7cb84c5b","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce51d37b-7c42-4166-be5d-94644849fba0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce51d37b-7c42-4166-be5d-94644849fba0"}
```
