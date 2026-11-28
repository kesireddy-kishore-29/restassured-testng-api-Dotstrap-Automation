# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-f71cb4c5-ec46-4d19-8bfa-62c8fdbe5802` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-51cad1a7-e285-4511-8a8f-74a1a2a8e64b` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-970a5c31-21a7-4af2-bcbf-461bfc7f3341` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-1d9b6559-39f2-4ed6-8bed-abcf9c6682e1` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 14 | `qa-32aa5125-f8a2-44ba-831f-a4ebcd0f3118` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-5bcf0461-aeba-4391-a283-ed04dac25bc5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-2d6fcbf7-eb41-4603-87fe-716d1e897ebd` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-1a79a39d-a927-4311-bd08-b96ac9ba98ac` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-d839442d-0353-4223-a7bc-a624b6b00876` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-28b75732-f22d-4a13-a4a7-a6258a8d54a6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f71cb4c5-ec46-4d19-8bfa-62c8fdbe5802

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f71cb4c5-ec46-4d19-8bfa-62c8fdbe5802
Content-Type: application/json

--- request body ---
{"handle":"qa-07e45517c73d","displayName":"QA 07e45517c73d","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-f71cb4c5-ec46-4d19-8bfa-62c8fdbe5802
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 7
Location: /v1/accounts/qa-07e45517c73d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_99b94d63-bedd-4214-9cad-612803b15e51","handle":"qa-07e45517c73d","displayName":"QA 07e45517c73d","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.826063537Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-51cad1a7-e285-4511-8a8f-74a1a2a8e64b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51cad1a7-e285-4511-8a8f-74a1a2a8e64b
Content-Type: application/json

--- request body ---
{"handle":"qa-649d3311a1b5","displayName":"QA 649d3311a1b5","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-51cad1a7-e285-4511-8a8f-74a1a2a8e64b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 7
Location: /v1/accounts/qa-649d3311a1b5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eb4a4ced-2acd-431b-8992-ad32ee6293b6","handle":"qa-649d3311a1b5","displayName":"QA 649d3311a1b5","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.877817683Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-970a5c31-21a7-4af2-bcbf-461bfc7f3341

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-970a5c31-21a7-4af2-bcbf-461bfc7f3341
Content-Type: application/json

--- request body ---
{"handle":"qa-07e45517c73d","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-970a5c31-21a7-4af2-bcbf-461bfc7f3341
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_99b94d63-bedd-4214-9cad-612803b15e51"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1d9b6559-39f2-4ed6-8bed-abcf9c6682e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d9b6559-39f2-4ed6-8bed-abcf9c6682e1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-649d3311a1b5","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d9b6559-39f2-4ed6-8bed-abcf9c6682e1
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
Location: /v1/conversations/cnv_f036a2fc-5736-4460-ac30-3f8e2e9b3db6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f036a2fc-5736-4460-ac30-3f8e2e9b3db6","subject":"Error contract","status":"open","region":"eu","participants":["qa-07e45517c73d","qa-649d3311a1b5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:45.974590850Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_f036a2fc-5736-4460-ac30-3f8e2e9b3db6/messages
correlation: qa-32aa5125-f8a2-44ba-831f-a4ebcd0f3118

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 6bf0528d-abad-4fa9-8956-857846669c2b
X-Correlation-Id: qa-32aa5125-f8a2-44ba-831f-a4ebcd0f3118
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32aa5125-f8a2-44ba-831f-a4ebcd0f3118
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_f036a2fc-5736-4460-ac30-3f8e2e9b3db6/messages","correlationId":"qa-32aa5125-f8a2-44ba-831f-a4ebcd0f3118"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5bcf0461-aeba-4391-a283-ed04dac25bc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bcf0461-aeba-4391-a283-ed04dac25bc5
Content-Type: application/json

--- request body ---
{"handle":"qa-649d3311a1b5","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bcf0461-aeba-4391-a283-ed04dac25bc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb4a4ced-2acd-431b-8992-ad32ee6293b6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d6fcbf7-eb41-4603-87fe-716d1e897ebd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d6fcbf7-eb41-4603-87fe-716d1e897ebd
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d6fcbf7-eb41-4603-87fe-716d1e897ebd
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
correlation: qa-1a79a39d-a927-4311-bd08-b96ac9ba98ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a79a39d-a927-4311-bd08-b96ac9ba98ac
Content-Type: application/json

--- request body ---
{"handle":"qa-649d3311a1b5","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a79a39d-a927-4311-bd08-b96ac9ba98ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1a79a39d-a927-4311-bd08-b96ac9ba98ac"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d839442d-0353-4223-a7bc-a624b6b00876

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d839442d-0353-4223-a7bc-a624b6b00876
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d839442d-0353-4223-a7bc-a624b6b00876
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
correlation: qa-28b75732-f22d-4a13-a4a7-a6258a8d54a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28b75732-f22d-4a13-a4a7-a6258a8d54a6
Content-Type: application/json

--- request body ---
{"handle":"qa-07e45517c73d","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-28b75732-f22d-4a13-a4a7-a6258a8d54a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-28b75732-f22d-4a13-a4a7-a6258a8d54a6"}
```
