# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-3ad2924a-6f13-4d2e-bb67-ed5dbbe8f560` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-8921932c-554e-4cfe-9a05-480e92e3fff2` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-01f113a2-9d8d-4765-9b2c-fc83dd71e4b4` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-5ebfeec0-f3e0-4664-877e-324715b4bd62` |
| 5 | `GET /v1/admin/stats` | 503 | 13 | `qa-058bcb71-8d4b-4d50-9046-722c61c865eb` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-012e4103-354e-441f-a33e-22ac327d2119` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-ffec82a7-5781-49cf-8e4a-053672a3094e` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-d70c9bbd-952c-4459-b54c-b7a7d492f0f1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-710eb6ce-52d9-4c11-8026-55334c5f51ec` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-c16c843d-3148-49ef-aa60-361ce4ba8f4e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3ad2924a-6f13-4d2e-bb67-ed5dbbe8f560

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ad2924a-6f13-4d2e-bb67-ed5dbbe8f560
Content-Type: application/json

--- request body ---
{"handle":"qa-a16c2b74263d","displayName":"QA a16c2b74263d","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ad2924a-6f13-4d2e-bb67-ed5dbbe8f560
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 6
Location: /v1/accounts/qa-a16c2b74263d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7ca17b00-0797-4301-b226-04ad37c2793a","handle":"qa-a16c2b74263d","displayName":"QA a16c2b74263d","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.573270004Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8921932c-554e-4cfe-9a05-480e92e3fff2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8921932c-554e-4cfe-9a05-480e92e3fff2
Content-Type: application/json

--- request body ---
{"handle":"qa-94c8eae3ac1b","displayName":"QA 94c8eae3ac1b","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-8921932c-554e-4cfe-9a05-480e92e3fff2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 6
Location: /v1/accounts/qa-94c8eae3ac1b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a183345b-2fd2-403f-ba7e-7f19b2c1aa8d","handle":"qa-94c8eae3ac1b","displayName":"QA 94c8eae3ac1b","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.648120911Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-01f113a2-9d8d-4765-9b2c-fc83dd71e4b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01f113a2-9d8d-4765-9b2c-fc83dd71e4b4
Content-Type: application/json

--- request body ---
{"handle":"qa-a16c2b74263d","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-01f113a2-9d8d-4765-9b2c-fc83dd71e4b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7ca17b00-0797-4301-b226-04ad37c2793a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5ebfeec0-f3e0-4664-877e-324715b4bd62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ebfeec0-f3e0-4664-877e-324715b4bd62
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-94c8eae3ac1b","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ebfeec0-f3e0-4664-877e-324715b4bd62
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
Location: /v1/conversations/cnv_5879dadd-2a2d-4714-858f-dbe48343126a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5879dadd-2a2d-4714-858f-dbe48343126a","subject":"Error contract","status":"open","region":"eu","participants":["qa-a16c2b74263d","qa-94c8eae3ac1b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:05.725723807Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-058bcb71-8d4b-4d50-9046-722c61c865eb

--- request headers ---
Accept: application/json
X-Fault-Key: 25111e2d-7920-48da-8be3-636a30ded588
X-Fault: unavailable-once
X-Correlation-Id: qa-058bcb71-8d4b-4d50-9046-722c61c865eb
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-058bcb71-8d4b-4d50-9046-722c61c865eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-058bcb71-8d4b-4d50-9046-722c61c865eb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-012e4103-354e-441f-a33e-22ac327d2119

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-012e4103-354e-441f-a33e-22ac327d2119
Content-Type: application/json

--- request body ---
{"handle":"qa-94c8eae3ac1b","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-012e4103-354e-441f-a33e-22ac327d2119
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a183345b-2fd2-403f-ba7e-7f19b2c1aa8d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ffec82a7-5781-49cf-8e4a-053672a3094e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffec82a7-5781-49cf-8e4a-053672a3094e
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ffec82a7-5781-49cf-8e4a-053672a3094e
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
correlation: qa-d70c9bbd-952c-4459-b54c-b7a7d492f0f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d70c9bbd-952c-4459-b54c-b7a7d492f0f1
Content-Type: application/json

--- request body ---
{"handle":"qa-94c8eae3ac1b","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d70c9bbd-952c-4459-b54c-b7a7d492f0f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d70c9bbd-952c-4459-b54c-b7a7d492f0f1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-710eb6ce-52d9-4c11-8026-55334c5f51ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-710eb6ce-52d9-4c11-8026-55334c5f51ec
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-710eb6ce-52d9-4c11-8026-55334c5f51ec
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
correlation: qa-c16c843d-3148-49ef-aa60-361ce4ba8f4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c16c843d-3148-49ef-aa60-361ce4ba8f4e
Content-Type: application/json

--- request body ---
{"handle":"qa-a16c2b74263d","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c16c843d-3148-49ef-aa60-361ce4ba8f4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c16c843d-3148-49ef-aa60-361ce4ba8f4e"}
```
