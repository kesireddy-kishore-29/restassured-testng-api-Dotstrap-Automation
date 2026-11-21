# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-a223ae11-1510-407a-8a61-d99ab13ea597` |
| 2 | `POST /v1/accounts` | 201 | 63 | `qa-4df3207c-8a25-49ba-b244-fb5b0954c60a` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-29ec7214-3f15-4f43-8c19-2514b7b5a19e` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-94086e72-d7d4-41f7-9a78-7b3a1a0f0fa4` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 21 | `qa-85203f73-62f1-4146-838c-5f8adca7b5d9` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-ac8bd0e0-038e-43b2-89dd-d13065651e8a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-65b430f4-fa63-444a-9dda-3cc0fd8cf0e1` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-61de8378-d61b-403d-9196-fa41cdb96f4a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-11afde6a-e613-4b14-ba03-97bf1e87b294` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-faf544fe-d417-4313-804b-5812459443fd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a223ae11-1510-407a-8a61-d99ab13ea597

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a223ae11-1510-407a-8a61-d99ab13ea597
Content-Type: application/json

--- request body ---
{"handle":"qa-f4fb6c4edf77","displayName":"QA f4fb6c4edf77","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-a223ae11-1510-407a-8a61-d99ab13ea597
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Location: /v1/accounts/qa-f4fb6c4edf77
X-Served-Region: eu
Content-Length: 181

{"id":"acc_94781c31-886d-4e78-9ca5-3e84d24d9293","handle":"qa-f4fb6c4edf77","displayName":"QA f4fb6c4edf77","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.918063896Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4df3207c-8a25-49ba-b244-fb5b0954c60a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4df3207c-8a25-49ba-b244-fb5b0954c60a
Content-Type: application/json

--- request body ---
{"handle":"qa-0fb2b15a0b02","displayName":"QA 0fb2b15a0b02","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-4df3207c-8a25-49ba-b244-fb5b0954c60a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Location: /v1/accounts/qa-0fb2b15a0b02
X-Served-Region: eu
Content-Length: 181

{"id":"acc_02eb8036-4104-4fcc-8cd3-78a77e1b560f","handle":"qa-0fb2b15a0b02","displayName":"QA 0fb2b15a0b02","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.982816136Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-29ec7214-3f15-4f43-8c19-2514b7b5a19e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29ec7214-3f15-4f43-8c19-2514b7b5a19e
Content-Type: application/json

--- request body ---
{"handle":"qa-f4fb6c4edf77","password":"****"}

--- response: 200 in 29 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-29ec7214-3f15-4f43-8c19-2514b7b5a19e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_94781c31-886d-4e78-9ca5-3e84d24d9293"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-94086e72-d7d4-41f7-9a78-7b3a1a0f0fa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94086e72-d7d4-41f7-9a78-7b3a1a0f0fa4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0fb2b15a0b02","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-94086e72-d7d4-41f7-9a78-7b3a1a0f0fa4
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
Location: /v1/conversations/cnv_bdb0f335-a775-408c-8ea3-a6964b3c9645
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bdb0f335-a775-408c-8ea3-a6964b3c9645","subject":"Error contract","status":"open","region":"eu","participants":["qa-f4fb6c4edf77","qa-0fb2b15a0b02"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.060646940Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-f4fb6c4edf77
correlation: qa-85203f73-62f1-4146-838c-5f8adca7b5d9

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 4b508db8-4a9f-4167-bc2e-4fff23fe4d79
X-Correlation-Id: qa-85203f73-62f1-4146-838c-5f8adca7b5d9
Content-Type: application/json

--- response: 503 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85203f73-62f1-4146-838c-5f8adca7b5d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-f4fb6c4edf77","correlationId":"qa-85203f73-62f1-4146-838c-5f8adca7b5d9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ac8bd0e0-038e-43b2-89dd-d13065651e8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac8bd0e0-038e-43b2-89dd-d13065651e8a
Content-Type: application/json

--- request body ---
{"handle":"qa-0fb2b15a0b02","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac8bd0e0-038e-43b2-89dd-d13065651e8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_02eb8036-4104-4fcc-8cd3-78a77e1b560f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-65b430f4-fa63-444a-9dda-3cc0fd8cf0e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65b430f4-fa63-444a-9dda-3cc0fd8cf0e1
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-65b430f4-fa63-444a-9dda-3cc0fd8cf0e1
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
correlation: qa-61de8378-d61b-403d-9196-fa41cdb96f4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61de8378-d61b-403d-9196-fa41cdb96f4a
Content-Type: application/json

--- request body ---
{"handle":"qa-0fb2b15a0b02","password":"****"}

--- response: 401 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61de8378-d61b-403d-9196-fa41cdb96f4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61de8378-d61b-403d-9196-fa41cdb96f4a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-11afde6a-e613-4b14-ba03-97bf1e87b294

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11afde6a-e613-4b14-ba03-97bf1e87b294
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-11afde6a-e613-4b14-ba03-97bf1e87b294
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
correlation: qa-faf544fe-d417-4313-804b-5812459443fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faf544fe-d417-4313-804b-5812459443fd
Content-Type: application/json

--- request body ---
{"handle":"qa-f4fb6c4edf77","password":"****"}

--- response: 401 in 28 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-faf544fe-d417-4313-804b-5812459443fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-faf544fe-d417-4313-804b-5812459443fd"}
```
