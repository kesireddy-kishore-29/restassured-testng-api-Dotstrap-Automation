# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-43ae07f6-cf43-43e2-9113-3e2db4f38c03` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-757ee314-e5ff-41d5-8e7e-3ec3e6380fd9` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-df2a52e4-8bfa-4f15-9867-1b04b34e1aea` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-0f116cfe-90ad-418b-8024-70a18a391d8b` |
| 5 | `POST /v1/accounts` | 503 | 13 | `qa-9aaeba08-67e1-48a8-93a1-3e6761ccc5ed` |
| 6 | `POST /v1/auth/token` | 200 | 62 | `qa-129f5af0-acd5-4b30-801e-965157c7b155` |
| 7 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-d3f9f648-0348-41c3-8f0e-a09e1fd8beb5` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-2e9d0378-670e-4536-a272-ba2b8d391b6e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-744caf73-8531-4997-81a3-21eb000f6465` |
| 10 | `POST /v1/auth/token` | 401 | 3 | `qa-4b865ddf-bd9c-4c33-8ee4-cadf2a8eef60` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-43ae07f6-cf43-43e2-9113-3e2db4f38c03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43ae07f6-cf43-43e2-9113-3e2db4f38c03
Content-Type: application/json

--- request body ---
{"handle":"qa-c28d642911ff","displayName":"QA c28d642911ff","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-43ae07f6-cf43-43e2-9113-3e2db4f38c03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-c28d642911ff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0df46e10-0823-4400-b95c-4b82ef50ec70","handle":"qa-c28d642911ff","displayName":"QA c28d642911ff","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.548385093Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-757ee314-e5ff-41d5-8e7e-3ec3e6380fd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-757ee314-e5ff-41d5-8e7e-3ec3e6380fd9
Content-Type: application/json

--- request body ---
{"handle":"qa-d99b65bd19af","displayName":"QA d99b65bd19af","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-757ee314-e5ff-41d5-8e7e-3ec3e6380fd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-d99b65bd19af
X-Served-Region: eu
Content-Length: 181

{"id":"acc_80ae094c-f6dd-4469-b81c-fdaf6b8eef32","handle":"qa-d99b65bd19af","displayName":"QA d99b65bd19af","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.576260983Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-df2a52e4-8bfa-4f15-9867-1b04b34e1aea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df2a52e4-8bfa-4f15-9867-1b04b34e1aea
Content-Type: application/json

--- request body ---
{"handle":"qa-c28d642911ff","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-df2a52e4-8bfa-4f15-9867-1b04b34e1aea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0df46e10-0823-4400-b95c-4b82ef50ec70"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0f116cfe-90ad-418b-8024-70a18a391d8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f116cfe-90ad-418b-8024-70a18a391d8b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d99b65bd19af","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f116cfe-90ad-418b-8024-70a18a391d8b
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
Location: /v1/conversations/cnv_9021e4a9-9997-4094-880c-707f9935da8c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9021e4a9-9997-4094-880c-707f9935da8c","subject":"Error contract","status":"open","region":"eu","participants":["qa-c28d642911ff","qa-d99b65bd19af"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.643393364Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-9aaeba08-67e1-48a8-93a1-3e6761ccc5ed

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 69f49877-33a6-4b64-a54f-5ed357798304
X-Correlation-Id: qa-9aaeba08-67e1-48a8-93a1-3e6761ccc5ed
Content-Type: application/json

--- request body ---
{"handle":"qa-aea3072b50a6","displayName":"QA aea3072b50a6","password":"****","region":"eu"}

--- response: 503 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9aaeba08-67e1-48a8-93a1-3e6761ccc5ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-9aaeba08-67e1-48a8-93a1-3e6761ccc5ed"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-129f5af0-acd5-4b30-801e-965157c7b155

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-129f5af0-acd5-4b30-801e-965157c7b155
Content-Type: application/json

--- request body ---
{"handle":"qa-d99b65bd19af","password":"****"}

--- response: 200 in 62 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-129f5af0-acd5-4b30-801e-965157c7b155
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_80ae094c-f6dd-4469-b81c-fdaf6b8eef32"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d3f9f648-0348-41c3-8f0e-a09e1fd8beb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3f9f648-0348-41c3-8f0e-a09e1fd8beb5
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d3f9f648-0348-41c3-8f0e-a09e1fd8beb5
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
correlation: qa-2e9d0378-670e-4536-a272-ba2b8d391b6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e9d0378-670e-4536-a272-ba2b8d391b6e
Content-Type: application/json

--- request body ---
{"handle":"qa-d99b65bd19af","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e9d0378-670e-4536-a272-ba2b8d391b6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2e9d0378-670e-4536-a272-ba2b8d391b6e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-744caf73-8531-4997-81a3-21eb000f6465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-744caf73-8531-4997-81a3-21eb000f6465
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-744caf73-8531-4997-81a3-21eb000f6465
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
correlation: qa-4b865ddf-bd9c-4c33-8ee4-cadf2a8eef60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b865ddf-bd9c-4c33-8ee4-cadf2a8eef60
Content-Type: application/json

--- request body ---
{"handle":"qa-c28d642911ff","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b865ddf-bd9c-4c33-8ee4-cadf2a8eef60
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4b865ddf-bd9c-4c33-8ee4-cadf2a8eef60"}
```
