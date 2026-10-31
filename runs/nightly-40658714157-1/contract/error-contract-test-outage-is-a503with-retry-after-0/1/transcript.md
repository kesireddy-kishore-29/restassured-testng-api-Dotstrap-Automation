# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-63e8d6be-771f-4d98-bfbc-03e0c3153602` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-9fc7ef7e-5611-42dd-aa41-f661bcbcdbeb` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-722c0ed4-403e-41cf-8e9f-c10d32004de5` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-39960605-474f-465a-8005-9b669972437e` |
| 5 | `POST /v1/auth/token` | 503 | 11 | `qa-4414c0fa-de40-4d80-99f8-d50d5a2e246a` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-eae63f84-ad81-4dda-9699-908f341b6b3d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-93659e18-104a-4ca7-a261-4431dd256ac2` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-e25d4b07-1541-4b04-82c9-d0c989a391ee` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-2cf4f7ef-6901-4cd0-ba24-d82a13f38e05` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-684f5714-e8fe-4ea7-b8eb-2342aeab46f7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-63e8d6be-771f-4d98-bfbc-03e0c3153602

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63e8d6be-771f-4d98-bfbc-03e0c3153602
Content-Type: application/json

--- request body ---
{"handle":"qa-086c23ee87b3","displayName":"QA 086c23ee87b3","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-63e8d6be-771f-4d98-bfbc-03e0c3153602
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-086c23ee87b3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_14031508-b3de-45aa-8d35-7737f3d39d6e","handle":"qa-086c23ee87b3","displayName":"QA 086c23ee87b3","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.356010464Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9fc7ef7e-5611-42dd-aa41-f661bcbcdbeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fc7ef7e-5611-42dd-aa41-f661bcbcdbeb
Content-Type: application/json

--- request body ---
{"handle":"qa-ed302eb74f22","displayName":"QA ed302eb74f22","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fc7ef7e-5611-42dd-aa41-f661bcbcdbeb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Location: /v1/accounts/qa-ed302eb74f22
X-Served-Region: eu
Content-Length: 181

{"id":"acc_46d58427-72f4-4bca-b961-147f50564abd","handle":"qa-ed302eb74f22","displayName":"QA ed302eb74f22","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.379772607Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-722c0ed4-403e-41cf-8e9f-c10d32004de5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-722c0ed4-403e-41cf-8e9f-c10d32004de5
Content-Type: application/json

--- request body ---
{"handle":"qa-086c23ee87b3","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-722c0ed4-403e-41cf-8e9f-c10d32004de5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_14031508-b3de-45aa-8d35-7737f3d39d6e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-39960605-474f-465a-8005-9b669972437e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39960605-474f-465a-8005-9b669972437e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ed302eb74f22","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-39960605-474f-465a-8005-9b669972437e
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
Location: /v1/conversations/cnv_f98c7177-5d48-4ad1-b923-d257f3ec6e32
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f98c7177-5d48-4ad1-b923-d257f3ec6e32","subject":"Error contract","status":"open","region":"eu","participants":["qa-086c23ee87b3","qa-ed302eb74f22"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.451031321Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4414c0fa-de40-4d80-99f8-d50d5a2e246a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9955b82c-0a5f-4e45-9d06-1602dce48eff
X-Correlation-Id: qa-4414c0fa-de40-4d80-99f8-d50d5a2e246a
Content-Type: application/json

--- request body ---
{"handle":"qa-086c23ee87b3","password":"****"}

--- response: 503 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4414c0fa-de40-4d80-99f8-d50d5a2e246a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-4414c0fa-de40-4d80-99f8-d50d5a2e246a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eae63f84-ad81-4dda-9699-908f341b6b3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eae63f84-ad81-4dda-9699-908f341b6b3d
Content-Type: application/json

--- request body ---
{"handle":"qa-ed302eb74f22","password":"****"}

--- response: 200 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-eae63f84-ad81-4dda-9699-908f341b6b3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_46d58427-72f4-4bca-b961-147f50564abd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-93659e18-104a-4ca7-a261-4431dd256ac2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93659e18-104a-4ca7-a261-4431dd256ac2
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-93659e18-104a-4ca7-a261-4431dd256ac2
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
correlation: qa-e25d4b07-1541-4b04-82c9-d0c989a391ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e25d4b07-1541-4b04-82c9-d0c989a391ee
Content-Type: application/json

--- request body ---
{"handle":"qa-ed302eb74f22","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e25d4b07-1541-4b04-82c9-d0c989a391ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e25d4b07-1541-4b04-82c9-d0c989a391ee"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2cf4f7ef-6901-4cd0-ba24-d82a13f38e05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cf4f7ef-6901-4cd0-ba24-d82a13f38e05
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2cf4f7ef-6901-4cd0-ba24-d82a13f38e05
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
correlation: qa-684f5714-e8fe-4ea7-b8eb-2342aeab46f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-684f5714-e8fe-4ea7-b8eb-2342aeab46f7
Content-Type: application/json

--- request body ---
{"handle":"qa-086c23ee87b3","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-684f5714-e8fe-4ea7-b8eb-2342aeab46f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-684f5714-e8fe-4ea7-b8eb-2342aeab46f7"}
```
