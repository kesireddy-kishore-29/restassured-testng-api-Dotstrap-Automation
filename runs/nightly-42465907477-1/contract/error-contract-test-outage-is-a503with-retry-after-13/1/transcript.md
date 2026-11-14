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
| 1 | `POST /v1/accounts` | 201 | 57 | `qa-0cb00241-26a4-4509-9681-78ca6a1ebbbe` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-fa6c574a-aca3-4851-9a5a-54f9f099a149` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-b4053794-ec78-4d26-8811-a4c872aaa721` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-7f69e97e-d7a5-427e-babc-05ab4ba3dfe1` |
| 5 | `GET /v1/credits/balance` | 503 | 9 | `qa-4ed82941-fdf0-4cbd-8d47-48097e3e9474` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-8b7b89d5-6b05-41d8-a7ae-9748b354cc72` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-0983a590-bc4c-4e2e-9bb1-1afc2b96e7d5` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-68125267-d5a6-48da-9f8c-27272aa8160e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-c1909f6d-de55-4e6d-9de4-edcc7c0e6e06` |
| 10 | `POST /v1/auth/token` | 401 | 3 | `qa-4a696d81-b1f6-46b8-a36f-928680587c63` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0cb00241-26a4-4509-9681-78ca6a1ebbbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cb00241-26a4-4509-9681-78ca6a1ebbbe
Content-Type: application/json

--- request body ---
{"handle":"qa-e69c90ad2fb9","displayName":"QA e69c90ad2fb9","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cb00241-26a4-4509-9681-78ca6a1ebbbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Location: /v1/accounts/qa-e69c90ad2fb9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3996eaee-4888-421e-8d92-4d492ea0b740","handle":"qa-e69c90ad2fb9","displayName":"QA e69c90ad2fb9","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.288106349Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fa6c574a-aca3-4851-9a5a-54f9f099a149

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa6c574a-aca3-4851-9a5a-54f9f099a149
Content-Type: application/json

--- request body ---
{"handle":"qa-f04fff83f19e","displayName":"QA f04fff83f19e","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa6c574a-aca3-4851-9a5a-54f9f099a149
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 8
Location: /v1/accounts/qa-f04fff83f19e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aa134158-e029-402d-af3f-4141768b6154","handle":"qa-f04fff83f19e","displayName":"QA f04fff83f19e","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.320463599Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b4053794-ec78-4d26-8811-a4c872aaa721

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4053794-ec78-4d26-8811-a4c872aaa721
Content-Type: application/json

--- request body ---
{"handle":"qa-e69c90ad2fb9","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4053794-ec78-4d26-8811-a4c872aaa721
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3996eaee-4888-421e-8d92-4d492ea0b740"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7f69e97e-d7a5-427e-babc-05ab4ba3dfe1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f69e97e-d7a5-427e-babc-05ab4ba3dfe1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f04fff83f19e","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f69e97e-d7a5-427e-babc-05ab4ba3dfe1
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
Location: /v1/conversations/cnv_e98cd4e0-d964-4b7a-8152-39d2264e6c7e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e98cd4e0-d964-4b7a-8152-39d2264e6c7e","subject":"Error contract","status":"open","region":"eu","participants":["qa-e69c90ad2fb9","qa-f04fff83f19e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.363119385Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-4ed82941-fdf0-4cbd-8d47-48097e3e9474

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f794f27f-d0e4-4bf2-807c-10fe11351b32
X-Correlation-Id: qa-4ed82941-fdf0-4cbd-8d47-48097e3e9474
Content-Type: application/json

--- response: 503 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ed82941-fdf0-4cbd-8d47-48097e3e9474
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-4ed82941-fdf0-4cbd-8d47-48097e3e9474"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8b7b89d5-6b05-41d8-a7ae-9748b354cc72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b7b89d5-6b05-41d8-a7ae-9748b354cc72
Content-Type: application/json

--- request body ---
{"handle":"qa-f04fff83f19e","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b7b89d5-6b05-41d8-a7ae-9748b354cc72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aa134158-e029-402d-af3f-4141768b6154"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0983a590-bc4c-4e2e-9bb1-1afc2b96e7d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0983a590-bc4c-4e2e-9bb1-1afc2b96e7d5
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0983a590-bc4c-4e2e-9bb1-1afc2b96e7d5
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
correlation: qa-68125267-d5a6-48da-9f8c-27272aa8160e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68125267-d5a6-48da-9f8c-27272aa8160e
Content-Type: application/json

--- request body ---
{"handle":"qa-f04fff83f19e","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68125267-d5a6-48da-9f8c-27272aa8160e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-68125267-d5a6-48da-9f8c-27272aa8160e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c1909f6d-de55-4e6d-9de4-edcc7c0e6e06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1909f6d-de55-4e6d-9de4-edcc7c0e6e06
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c1909f6d-de55-4e6d-9de4-edcc7c0e6e06
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
correlation: qa-4a696d81-b1f6-46b8-a36f-928680587c63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a696d81-b1f6-46b8-a36f-928680587c63
Content-Type: application/json

--- request body ---
{"handle":"qa-e69c90ad2fb9","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a696d81-b1f6-46b8-a36f-928680587c63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a696d81-b1f6-46b8-a36f-928680587c63"}
```
