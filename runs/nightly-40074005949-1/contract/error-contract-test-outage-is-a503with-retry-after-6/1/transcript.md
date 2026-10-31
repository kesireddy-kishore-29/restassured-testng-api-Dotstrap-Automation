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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-e727c11c-6a6f-405c-aa61-82965c5e7a30` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-d3ee820d-813a-48f4-8370-a675b2ccabe6` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-3a0205fe-840b-41c1-b42a-01b1bc3b5d42` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-f64fdd72-fc2b-485e-8b66-1a70772efbd6` |
| 5 | `POST /v1/conversations` | 503 | 11 | `qa-a46bd4f2-232a-40b8-a144-ff25e3807c6a` |
| 6 | `POST /v1/auth/token` | 200 | 6 | `qa-f422c7b6-c46b-45ca-8624-88fdec72b66f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-feec6add-6a63-40a8-808d-893d2c28e32a` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-44fa6315-de68-4a29-881f-245e732c5f73` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-f8b709b3-ff2f-4b8d-992d-7030bb2ea2df` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-409bff4b-ec44-456f-8291-fa6075adaaf3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e727c11c-6a6f-405c-aa61-82965c5e7a30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e727c11c-6a6f-405c-aa61-82965c5e7a30
Content-Type: application/json

--- request body ---
{"handle":"qa-9b9762aa95a7","displayName":"QA 9b9762aa95a7","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e727c11c-6a6f-405c-aa61-82965c5e7a30
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
Location: /v1/accounts/qa-9b9762aa95a7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f56d9c01-c81d-43b9-beba-67d7908e6a79","handle":"qa-9b9762aa95a7","displayName":"QA 9b9762aa95a7","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.942038362Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d3ee820d-813a-48f4-8370-a675b2ccabe6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3ee820d-813a-48f4-8370-a675b2ccabe6
Content-Type: application/json

--- request body ---
{"handle":"qa-6bb5b3b91b13","displayName":"QA 6bb5b3b91b13","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3ee820d-813a-48f4-8370-a675b2ccabe6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-6bb5b3b91b13
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1829ae44-dabb-48e3-8681-106792145bc3","handle":"qa-6bb5b3b91b13","displayName":"QA 6bb5b3b91b13","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.989784818Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3a0205fe-840b-41c1-b42a-01b1bc3b5d42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a0205fe-840b-41c1-b42a-01b1bc3b5d42
Content-Type: application/json

--- request body ---
{"handle":"qa-9b9762aa95a7","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a0205fe-840b-41c1-b42a-01b1bc3b5d42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f56d9c01-c81d-43b9-beba-67d7908e6a79"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f64fdd72-fc2b-485e-8b66-1a70772efbd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f64fdd72-fc2b-485e-8b66-1a70772efbd6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6bb5b3b91b13","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f64fdd72-fc2b-485e-8b66-1a70772efbd6
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
Location: /v1/conversations/cnv_b89aef6c-550f-46c6-9726-e22b5fbcb589
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b89aef6c-550f-46c6-9726-e22b5fbcb589","subject":"Error contract","status":"open","region":"eu","participants":["qa-9b9762aa95a7","qa-6bb5b3b91b13"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.048290097Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a46bd4f2-232a-40b8-a144-ff25e3807c6a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9fa19698-22c5-4d92-a31f-c3ea02df48ff
X-Correlation-Id: qa-a46bd4f2-232a-40b8-a144-ff25e3807c6a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9b9762aa95a7","subject":"Probe","message":"Hi"}

--- response: 503 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a46bd4f2-232a-40b8-a144-ff25e3807c6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-a46bd4f2-232a-40b8-a144-ff25e3807c6a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f422c7b6-c46b-45ca-8624-88fdec72b66f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f422c7b6-c46b-45ca-8624-88fdec72b66f
Content-Type: application/json

--- request body ---
{"handle":"qa-6bb5b3b91b13","password":"****"}

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f422c7b6-c46b-45ca-8624-88fdec72b66f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1829ae44-dabb-48e3-8681-106792145bc3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-feec6add-6a63-40a8-808d-893d2c28e32a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feec6add-6a63-40a8-808d-893d2c28e32a
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-feec6add-6a63-40a8-808d-893d2c28e32a
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
correlation: qa-44fa6315-de68-4a29-881f-245e732c5f73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44fa6315-de68-4a29-881f-245e732c5f73
Content-Type: application/json

--- request body ---
{"handle":"qa-6bb5b3b91b13","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44fa6315-de68-4a29-881f-245e732c5f73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-44fa6315-de68-4a29-881f-245e732c5f73"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f8b709b3-ff2f-4b8d-992d-7030bb2ea2df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8b709b3-ff2f-4b8d-992d-7030bb2ea2df
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f8b709b3-ff2f-4b8d-992d-7030bb2ea2df
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
correlation: qa-409bff4b-ec44-456f-8291-fa6075adaaf3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-409bff4b-ec44-456f-8291-fa6075adaaf3
Content-Type: application/json

--- request body ---
{"handle":"qa-9b9762aa95a7","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-409bff4b-ec44-456f-8291-fa6075adaaf3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-409bff4b-ec44-456f-8291-fa6075adaaf3"}
```
