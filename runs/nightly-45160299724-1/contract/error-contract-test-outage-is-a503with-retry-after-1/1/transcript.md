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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-6421f29b-1819-4988-a536-b0f8b81452de` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-f9885f89-93de-4346-b917-f5f24fac3051` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-34f8d143-a55a-44b2-bf59-db5d40db5ebc` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-e736c542-4399-4b4a-95ff-dc9e008968a5` |
| 5 | `POST /v1/accounts` | 503 | 16 | `qa-25fd9183-5346-4188-badf-7bd13292c1f4` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-dac32452-1a79-472e-8bf5-41f42fd9506d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 42 | `qa-8e7ac284-33d9-4d7d-b90f-4464c4b39693` |
| 8 | `POST /v1/auth/token` | 401 | 35 | `qa-8621f0cd-8c0d-4147-9c9f-d49c51ce96d6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-61bcb245-6e62-4808-9a04-6d35fe64a2dc` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-f0e7c1e4-3b16-460a-8371-67ff7bc97e2f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6421f29b-1819-4988-a536-b0f8b81452de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6421f29b-1819-4988-a536-b0f8b81452de
Content-Type: application/json

--- request body ---
{"handle":"qa-d3fc479f0c79","displayName":"QA d3fc479f0c79","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6421f29b-1819-4988-a536-b0f8b81452de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-d3fc479f0c79
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b35cbbbe-da2c-49a4-bf61-a41ec86f7989","handle":"qa-d3fc479f0c79","displayName":"QA d3fc479f0c79","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.627751376Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f9885f89-93de-4346-b917-f5f24fac3051

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9885f89-93de-4346-b917-f5f24fac3051
Content-Type: application/json

--- request body ---
{"handle":"qa-762fa5447298","displayName":"QA 762fa5447298","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9885f89-93de-4346-b917-f5f24fac3051
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Location: /v1/accounts/qa-762fa5447298
X-Served-Region: eu
Content-Length: 181

{"id":"acc_834aafa0-7ea1-4f22-9bbb-729b52d20de5","handle":"qa-762fa5447298","displayName":"QA 762fa5447298","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.678123574Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-34f8d143-a55a-44b2-bf59-db5d40db5ebc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34f8d143-a55a-44b2-bf59-db5d40db5ebc
Content-Type: application/json

--- request body ---
{"handle":"qa-d3fc479f0c79","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-34f8d143-a55a-44b2-bf59-db5d40db5ebc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b35cbbbe-da2c-49a4-bf61-a41ec86f7989"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e736c542-4399-4b4a-95ff-dc9e008968a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e736c542-4399-4b4a-95ff-dc9e008968a5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-762fa5447298","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e736c542-4399-4b4a-95ff-dc9e008968a5
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
Location: /v1/conversations/cnv_7c0eca45-07ce-4f09-ade7-be99547e9c9a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7c0eca45-07ce-4f09-ade7-be99547e9c9a","subject":"Error contract","status":"open","region":"eu","participants":["qa-d3fc479f0c79","qa-762fa5447298"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.773103875Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-25fd9183-5346-4188-badf-7bd13292c1f4

--- request headers ---
Accept: application/json
X-Fault-Key: 656f7f30-cfdf-4748-9dd9-8538e9ae432d
X-Fault: unavailable-once
X-Correlation-Id: qa-25fd9183-5346-4188-badf-7bd13292c1f4
Content-Type: application/json

--- request body ---
{"handle":"qa-5ff05d9a8f1f","displayName":"QA 5ff05d9a8f1f","password":"****","region":"eu"}

--- response: 503 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25fd9183-5346-4188-badf-7bd13292c1f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-25fd9183-5346-4188-badf-7bd13292c1f4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dac32452-1a79-472e-8bf5-41f42fd9506d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dac32452-1a79-472e-8bf5-41f42fd9506d
Content-Type: application/json

--- request body ---
{"handle":"qa-762fa5447298","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-dac32452-1a79-472e-8bf5-41f42fd9506d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_834aafa0-7ea1-4f22-9bbb-729b52d20de5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e7ac284-33d9-4d7d-b90f-4464c4b39693

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e7ac284-33d9-4d7d-b90f-4464c4b39693
Content-Type: application/json

--- response: 204 in 42 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e7ac284-33d9-4d7d-b90f-4464c4b39693
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
correlation: qa-8621f0cd-8c0d-4147-9c9f-d49c51ce96d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8621f0cd-8c0d-4147-9c9f-d49c51ce96d6
Content-Type: application/json

--- request body ---
{"handle":"qa-762fa5447298","password":"****"}

--- response: 401 in 35 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8621f0cd-8c0d-4147-9c9f-d49c51ce96d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8621f0cd-8c0d-4147-9c9f-d49c51ce96d6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-61bcb245-6e62-4808-9a04-6d35fe64a2dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61bcb245-6e62-4808-9a04-6d35fe64a2dc
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-61bcb245-6e62-4808-9a04-6d35fe64a2dc
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
correlation: qa-f0e7c1e4-3b16-460a-8371-67ff7bc97e2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0e7c1e4-3b16-460a-8371-67ff7bc97e2f
Content-Type: application/json

--- request body ---
{"handle":"qa-d3fc479f0c79","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0e7c1e4-3b16-460a-8371-67ff7bc97e2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f0e7c1e4-3b16-460a-8371-67ff7bc97e2f"}
```
