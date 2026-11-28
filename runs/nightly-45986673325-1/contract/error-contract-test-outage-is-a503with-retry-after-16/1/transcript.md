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
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-0942336e-d259-49ba-9a72-d269adf043e0` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-708504d1-1212-446c-8a8f-9441cc8620cd` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-ba5beded-5268-46dd-abb0-7ab62e4b5343` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-f1b1ec05-494f-4159-9e9a-f9f7038e1e85` |
| 5 | `GET /v1/admin/stats` | 503 | 5 | `qa-c9f721e9-e21b-44fc-ae88-ade2d5bfc378` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-6f1c862e-4c7b-42ff-bb67-ff4a7eb2733e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-9bca8fee-fb6e-45cd-91e2-611ea6e85d73` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-6b57377c-0a08-41e4-9c79-921900f0b253` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-f60594ba-6998-43e5-a9f6-d44a51bb3795` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-84c29eb6-ca8a-432e-8282-dc0b3c8cfcb9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0942336e-d259-49ba-9a72-d269adf043e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0942336e-d259-49ba-9a72-d269adf043e0
Content-Type: application/json

--- request body ---
{"handle":"qa-0e48314f2a2a","displayName":"QA 0e48314f2a2a","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0942336e-d259-49ba-9a72-d269adf043e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 6
Location: /v1/accounts/qa-0e48314f2a2a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0c25ab84-6b92-4afa-803d-65c1e5b1a630","handle":"qa-0e48314f2a2a","displayName":"QA 0e48314f2a2a","region":"eu","role":"user","createdAt":"2026-11-27T11:00:00.199134797Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-708504d1-1212-446c-8a8f-9441cc8620cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-708504d1-1212-446c-8a8f-9441cc8620cd
Content-Type: application/json

--- request body ---
{"handle":"qa-63d68f71cdd8","displayName":"QA 63d68f71cdd8","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-708504d1-1212-446c-8a8f-9441cc8620cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 6
Location: /v1/accounts/qa-63d68f71cdd8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_99e3dcc8-21ab-491b-abee-b0c83cebe738","handle":"qa-63d68f71cdd8","displayName":"QA 63d68f71cdd8","region":"eu","role":"user","createdAt":"2026-11-27T11:00:00.256583875Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ba5beded-5268-46dd-abb0-7ab62e4b5343

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba5beded-5268-46dd-abb0-7ab62e4b5343
Content-Type: application/json

--- request body ---
{"handle":"qa-0e48314f2a2a","password":"****"}

--- response: 200 in 23 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba5beded-5268-46dd-abb0-7ab62e4b5343
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0c25ab84-6b92-4afa-803d-65c1e5b1a630"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f1b1ec05-494f-4159-9e9a-f9f7038e1e85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1b1ec05-494f-4159-9e9a-f9f7038e1e85
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-63d68f71cdd8","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1b1ec05-494f-4159-9e9a-f9f7038e1e85
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
Location: /v1/conversations/cnv_054676c4-bcce-46f4-be34-5851d3323070
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_054676c4-bcce-46f4-be34-5851d3323070","subject":"Error contract","status":"open","region":"eu","participants":["qa-0e48314f2a2a","qa-63d68f71cdd8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T11:00:00.314085821Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-c9f721e9-e21b-44fc-ae88-ade2d5bfc378

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c16b48d7-7304-4079-a762-bc23bd654e6f
X-Correlation-Id: qa-c9f721e9-e21b-44fc-ae88-ade2d5bfc378
Content-Type: application/json

--- response: 503 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9f721e9-e21b-44fc-ae88-ade2d5bfc378
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-c9f721e9-e21b-44fc-ae88-ade2d5bfc378"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6f1c862e-4c7b-42ff-bb67-ff4a7eb2733e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f1c862e-4c7b-42ff-bb67-ff4a7eb2733e
Content-Type: application/json

--- request body ---
{"handle":"qa-63d68f71cdd8","password":"****"}

--- response: 200 in 16 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f1c862e-4c7b-42ff-bb67-ff4a7eb2733e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_99e3dcc8-21ab-491b-abee-b0c83cebe738"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9bca8fee-fb6e-45cd-91e2-611ea6e85d73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bca8fee-fb6e-45cd-91e2-611ea6e85d73
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9bca8fee-fb6e-45cd-91e2-611ea6e85d73
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
correlation: qa-6b57377c-0a08-41e4-9c79-921900f0b253

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b57377c-0a08-41e4-9c79-921900f0b253
Content-Type: application/json

--- request body ---
{"handle":"qa-63d68f71cdd8","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b57377c-0a08-41e4-9c79-921900f0b253
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b57377c-0a08-41e4-9c79-921900f0b253"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f60594ba-6998-43e5-a9f6-d44a51bb3795

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f60594ba-6998-43e5-a9f6-d44a51bb3795
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f60594ba-6998-43e5-a9f6-d44a51bb3795
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
correlation: qa-84c29eb6-ca8a-432e-8282-dc0b3c8cfcb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84c29eb6-ca8a-432e-8282-dc0b3c8cfcb9
Content-Type: application/json

--- request body ---
{"handle":"qa-0e48314f2a2a","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84c29eb6-ca8a-432e-8282-dc0b3c8cfcb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-84c29eb6-ca8a-432e-8282-dc0b3c8cfcb9"}
```
