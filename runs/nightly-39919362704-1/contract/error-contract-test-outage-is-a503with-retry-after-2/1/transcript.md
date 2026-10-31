# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-0d8a3081-ee53-4f1c-838b-6fd4f74c6b9e` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-48b87faa-dee5-4fdd-82ab-8de5988496af` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-84c12cb5-d41b-4c8a-bd64-e6ff5948e31f` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-c2fc969e-e670-484b-894e-1c023874fd66` |
| 5 | `GET /v1/accounts/me` | 503 | 14 | `qa-49615117-6931-4711-85a9-2a177d3125a5` |
| 6 | `POST /v1/auth/token` | 200 | 58 | `qa-b9fc9a42-8682-4b4a-9b59-6e7223969eb8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 57 | `qa-be2a98b0-d492-4fe0-bff1-744f4d0a65b6` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-cd1894e5-25c0-4308-86d1-046297fa8fb8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-8ec41110-949f-4f14-a34c-109d3de6e52e` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-29c9089c-af98-4149-a6a8-7d8e0ea9afce` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0d8a3081-ee53-4f1c-838b-6fd4f74c6b9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d8a3081-ee53-4f1c-838b-6fd4f74c6b9e
Content-Type: application/json

--- request body ---
{"handle":"qa-6c7a45d0ae77","displayName":"QA 6c7a45d0ae77","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d8a3081-ee53-4f1c-838b-6fd4f74c6b9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-6c7a45d0ae77
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b364bf9d-211f-4e88-9d85-d923b528fad8","handle":"qa-6c7a45d0ae77","displayName":"QA 6c7a45d0ae77","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.769125302Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-48b87faa-dee5-4fdd-82ab-8de5988496af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48b87faa-dee5-4fdd-82ab-8de5988496af
Content-Type: application/json

--- request body ---
{"handle":"qa-ae2f4be209cb","displayName":"QA ae2f4be209cb","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-48b87faa-dee5-4fdd-82ab-8de5988496af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Location: /v1/accounts/qa-ae2f4be209cb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e597e9c9-3b99-415c-9faa-1bdcc0d7c537","handle":"qa-ae2f4be209cb","displayName":"QA ae2f4be209cb","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.847540496Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-84c12cb5-d41b-4c8a-bd64-e6ff5948e31f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84c12cb5-d41b-4c8a-bd64-e6ff5948e31f
Content-Type: application/json

--- request body ---
{"handle":"qa-6c7a45d0ae77","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-84c12cb5-d41b-4c8a-bd64-e6ff5948e31f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b364bf9d-211f-4e88-9d85-d923b528fad8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c2fc969e-e670-484b-894e-1c023874fd66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2fc969e-e670-484b-894e-1c023874fd66
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ae2f4be209cb","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2fc969e-e670-484b-894e-1c023874fd66
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
Location: /v1/conversations/cnv_d039452a-7ee7-43ad-85d0-98a061eded42
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d039452a-7ee7-43ad-85d0-98a061eded42","subject":"Error contract","status":"open","region":"eu","participants":["qa-6c7a45d0ae77","qa-ae2f4be209cb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:43.954281130Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-49615117-6931-4711-85a9-2a177d3125a5

--- request headers ---
Accept: application/json
X-Fault-Key: ad8d51a9-273b-4f43-8811-882dc3a31bb4
X-Fault: unavailable-once
X-Correlation-Id: qa-49615117-6931-4711-85a9-2a177d3125a5
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49615117-6931-4711-85a9-2a177d3125a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-49615117-6931-4711-85a9-2a177d3125a5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b9fc9a42-8682-4b4a-9b59-6e7223969eb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9fc9a42-8682-4b4a-9b59-6e7223969eb8
Content-Type: application/json

--- request body ---
{"handle":"qa-ae2f4be209cb","password":"****"}

--- response: 200 in 58 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9fc9a42-8682-4b4a-9b59-6e7223969eb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e597e9c9-3b99-415c-9faa-1bdcc0d7c537"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-be2a98b0-d492-4fe0-bff1-744f4d0a65b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be2a98b0-d492-4fe0-bff1-744f4d0a65b6
Content-Type: application/json

--- response: 204 in 57 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-be2a98b0-d492-4fe0-bff1-744f4d0a65b6
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
correlation: qa-cd1894e5-25c0-4308-86d1-046297fa8fb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd1894e5-25c0-4308-86d1-046297fa8fb8
Content-Type: application/json

--- request body ---
{"handle":"qa-ae2f4be209cb","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd1894e5-25c0-4308-86d1-046297fa8fb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cd1894e5-25c0-4308-86d1-046297fa8fb8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ec41110-949f-4f14-a34c-109d3de6e52e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ec41110-949f-4f14-a34c-109d3de6e52e
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ec41110-949f-4f14-a34c-109d3de6e52e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-29c9089c-af98-4149-a6a8-7d8e0ea9afce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29c9089c-af98-4149-a6a8-7d8e0ea9afce
Content-Type: application/json

--- request body ---
{"handle":"qa-6c7a45d0ae77","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29c9089c-af98-4149-a6a8-7d8e0ea9afce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-29c9089c-af98-4149-a6a8-7d8e0ea9afce"}
```
