# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-befd99af-a650-4a0e-acaa-68f2d30664b0` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-023a8788-f332-4b83-b509-e00cbc010dcb` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-307473c1-8249-4076-bfe5-392b479b2b2a` |
| 4 | `POST /v1/conversations` | 201 | 50 | `qa-78f293db-c4f9-4962-8b8b-b8b69f9ced92` |
| 5 | `POST /v1/conversations` | 503 | 18 | `qa-cb0a7d37-93b3-49c7-8987-aa001fb1720d` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-a0d06bf5-6e9e-43c2-87ae-d9348abf51f6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-f5ee0972-e037-4e1d-838a-add59bbc0825` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-0d77b33f-4ef9-4936-b41b-d7ba87c1dab7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-61f5597b-9bc8-4102-a706-8623e3930d6f` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-e87c0c62-29bb-4bd7-88b5-93cd5f1c83b4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-befd99af-a650-4a0e-acaa-68f2d30664b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-befd99af-a650-4a0e-acaa-68f2d30664b0
Content-Type: application/json

--- request body ---
{"handle":"qa-5bb85311dfd2","displayName":"QA 5bb85311dfd2","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-befd99af-a650-4a0e-acaa-68f2d30664b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Location: /v1/accounts/qa-5bb85311dfd2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_48a3f7ce-b270-43d0-9585-f6190f953a0c","handle":"qa-5bb85311dfd2","displayName":"QA 5bb85311dfd2","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.837637875Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-023a8788-f332-4b83-b509-e00cbc010dcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-023a8788-f332-4b83-b509-e00cbc010dcb
Content-Type: application/json

--- request body ---
{"handle":"qa-bfb7cc805c44","displayName":"QA bfb7cc805c44","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-023a8788-f332-4b83-b509-e00cbc010dcb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-bfb7cc805c44
X-Served-Region: eu
Content-Length: 181

{"id":"acc_02b8d13f-9189-4a81-ba2e-02bfcee13bef","handle":"qa-bfb7cc805c44","displayName":"QA bfb7cc805c44","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.910281392Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-307473c1-8249-4076-bfe5-392b479b2b2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-307473c1-8249-4076-bfe5-392b479b2b2a
Content-Type: application/json

--- request body ---
{"handle":"qa-5bb85311dfd2","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-307473c1-8249-4076-bfe5-392b479b2b2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_48a3f7ce-b270-43d0-9585-f6190f953a0c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-78f293db-c4f9-4962-8b8b-b8b69f9ced92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78f293db-c4f9-4962-8b8b-b8b69f9ced92
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bfb7cc805c44","subject":"Error contract","message":"Hi"}

--- response: 201 in 50 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-78f293db-c4f9-4962-8b8b-b8b69f9ced92
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
Location: /v1/conversations/cnv_6f969ff4-5fef-4801-b3b3-a46c20efcaee
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6f969ff4-5fef-4801-b3b3-a46c20efcaee","subject":"Error contract","status":"open","region":"eu","participants":["qa-5bb85311dfd2","qa-bfb7cc805c44"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.027011012Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-cb0a7d37-93b3-49c7-8987-aa001fb1720d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 6b32070a-174c-4cbd-9d8a-c998f1dad38d
X-Correlation-Id: qa-cb0a7d37-93b3-49c7-8987-aa001fb1720d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5bb85311dfd2","subject":"Probe","message":"Hi"}

--- response: 503 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb0a7d37-93b3-49c7-8987-aa001fb1720d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-cb0a7d37-93b3-49c7-8987-aa001fb1720d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a0d06bf5-6e9e-43c2-87ae-d9348abf51f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0d06bf5-6e9e-43c2-87ae-d9348abf51f6
Content-Type: application/json

--- request body ---
{"handle":"qa-bfb7cc805c44","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0d06bf5-6e9e-43c2-87ae-d9348abf51f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_02b8d13f-9189-4a81-ba2e-02bfcee13bef"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f5ee0972-e037-4e1d-838a-add59bbc0825

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5ee0972-e037-4e1d-838a-add59bbc0825
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f5ee0972-e037-4e1d-838a-add59bbc0825
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
correlation: qa-0d77b33f-4ef9-4936-b41b-d7ba87c1dab7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d77b33f-4ef9-4936-b41b-d7ba87c1dab7
Content-Type: application/json

--- request body ---
{"handle":"qa-bfb7cc805c44","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d77b33f-4ef9-4936-b41b-d7ba87c1dab7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0d77b33f-4ef9-4936-b41b-d7ba87c1dab7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-61f5597b-9bc8-4102-a706-8623e3930d6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61f5597b-9bc8-4102-a706-8623e3930d6f
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-61f5597b-9bc8-4102-a706-8623e3930d6f
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
correlation: qa-e87c0c62-29bb-4bd7-88b5-93cd5f1c83b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e87c0c62-29bb-4bd7-88b5-93cd5f1c83b4
Content-Type: application/json

--- request body ---
{"handle":"qa-5bb85311dfd2","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e87c0c62-29bb-4bd7-88b5-93cd5f1c83b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e87c0c62-29bb-4bd7-88b5-93cd5f1c83b4"}
```
