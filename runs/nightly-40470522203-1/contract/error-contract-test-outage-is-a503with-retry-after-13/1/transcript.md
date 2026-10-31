# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-117460c9-cea3-46f7-8be2-0fe8b680ae81` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-4643cff0-faf3-4036-abdf-38e467da22ac` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-2ba6803d-7ed4-4bbc-a43c-1f4cc03dd02a` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-133fbeac-c238-4611-9cd0-79e93b98409c` |
| 5 | `GET /v1/credits/balance` | 503 | 17 | `qa-ba7a411a-f97b-4a5c-abb2-30d6761f9c92` |
| 6 | `POST /v1/auth/token` | 200 | 100 | `qa-2800ccc8-3841-47b1-8561-0eb5f4eb790b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-29dae6d8-64f3-4868-a7f3-44cf6b91f61a` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-5c65c2bd-b0f2-436d-bce9-f85d16e59967` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-c3846a47-a757-4112-abaa-7cb46639c7a8` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-70e86bda-c4cd-4f62-bf07-c4af5cbdd069` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-117460c9-cea3-46f7-8be2-0fe8b680ae81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-117460c9-cea3-46f7-8be2-0fe8b680ae81
Content-Type: application/json

--- request body ---
{"handle":"qa-3e5dc546ae8c","displayName":"QA 3e5dc546ae8c","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-117460c9-cea3-46f7-8be2-0fe8b680ae81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 7
Location: /v1/accounts/qa-3e5dc546ae8c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f89bcb4d-706c-49b5-af7e-6d5697206037","handle":"qa-3e5dc546ae8c","displayName":"QA 3e5dc546ae8c","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.218505360Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4643cff0-faf3-4036-abdf-38e467da22ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4643cff0-faf3-4036-abdf-38e467da22ac
Content-Type: application/json

--- request body ---
{"handle":"qa-32f56962016d","displayName":"QA 32f56962016d","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4643cff0-faf3-4036-abdf-38e467da22ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 6
Location: /v1/accounts/qa-32f56962016d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f027b78-5d72-40f1-84ff-4bff7a51ddfa","handle":"qa-32f56962016d","displayName":"QA 32f56962016d","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.260445888Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2ba6803d-7ed4-4bbc-a43c-1f4cc03dd02a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ba6803d-7ed4-4bbc-a43c-1f4cc03dd02a
Content-Type: application/json

--- request body ---
{"handle":"qa-3e5dc546ae8c","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ba6803d-7ed4-4bbc-a43c-1f4cc03dd02a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f89bcb4d-706c-49b5-af7e-6d5697206037"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-133fbeac-c238-4611-9cd0-79e93b98409c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-133fbeac-c238-4611-9cd0-79e93b98409c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-32f56962016d","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-133fbeac-c238-4611-9cd0-79e93b98409c
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
Location: /v1/conversations/cnv_f3a6710a-8214-468b-b1e4-5649ba81892e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f3a6710a-8214-468b-b1e4-5649ba81892e","subject":"Error contract","status":"open","region":"eu","participants":["qa-3e5dc546ae8c","qa-32f56962016d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:35.335228032Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-ba7a411a-f97b-4a5c-abb2-30d6761f9c92

--- request headers ---
Accept: application/json
X-Fault-Key: 87472a30-ae4f-4467-b7f2-799ad3812256
X-Fault: unavailable-once
X-Correlation-Id: qa-ba7a411a-f97b-4a5c-abb2-30d6761f9c92
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba7a411a-f97b-4a5c-abb2-30d6761f9c92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-ba7a411a-f97b-4a5c-abb2-30d6761f9c92"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2800ccc8-3841-47b1-8561-0eb5f4eb790b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2800ccc8-3841-47b1-8561-0eb5f4eb790b
Content-Type: application/json

--- request body ---
{"handle":"qa-32f56962016d","password":"****"}

--- response: 200 in 100 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2800ccc8-3841-47b1-8561-0eb5f4eb790b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f027b78-5d72-40f1-84ff-4bff7a51ddfa"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-29dae6d8-64f3-4868-a7f3-44cf6b91f61a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29dae6d8-64f3-4868-a7f3-44cf6b91f61a
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-29dae6d8-64f3-4868-a7f3-44cf6b91f61a
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
correlation: qa-5c65c2bd-b0f2-436d-bce9-f85d16e59967

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c65c2bd-b0f2-436d-bce9-f85d16e59967
Content-Type: application/json

--- request body ---
{"handle":"qa-32f56962016d","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c65c2bd-b0f2-436d-bce9-f85d16e59967
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5c65c2bd-b0f2-436d-bce9-f85d16e59967"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c3846a47-a757-4112-abaa-7cb46639c7a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3846a47-a757-4112-abaa-7cb46639c7a8
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c3846a47-a757-4112-abaa-7cb46639c7a8
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
correlation: qa-70e86bda-c4cd-4f62-bf07-c4af5cbdd069

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70e86bda-c4cd-4f62-bf07-c4af5cbdd069
Content-Type: application/json

--- request body ---
{"handle":"qa-3e5dc546ae8c","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70e86bda-c4cd-4f62-bf07-c4af5cbdd069
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-70e86bda-c4cd-4f62-bf07-c4af5cbdd069"}
```
