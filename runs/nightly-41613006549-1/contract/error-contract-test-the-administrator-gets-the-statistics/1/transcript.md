# Transcript: The administrator gets the service statistics

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#theAdministratorGetsTheStatistics` |
| Features | FEAT-AUTHZ-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-f561fc65-eb03-4bd7-9e6e-8e2513e06f76` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-18878c87-e166-42d7-b184-1ab4167eb0de` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-dc7537e7-40a1-4219-9152-1e55d02ac475` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-d77f2bab-e364-4437-982f-833c56739472` |
| 5 | `POST /v1/auth/token` | 200 | 15 | `qa-3b109324-1ef0-4fb8-a6a7-f9aff0e221cf` |
| 6 | `GET /v1/admin/stats` | 200 | 11 | `qa-97c74eaa-9fa6-4f0f-963d-7f0a6013d197` |
| 7 | `POST /v1/auth/token` | 200 | 10 | `qa-feeee3ca-816c-4757-9853-f9500ba26a40` |
| 8 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-806fb1d3-b094-4abe-90af-370ce5e2d4e4` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-536ccca3-1132-42f3-b27e-28d0205dd33a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-7ce17357-1185-456d-9384-65c30ba75a90` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-1480e1ee-543f-4927-a5bd-07809bb8908b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f561fc65-eb03-4bd7-9e6e-8e2513e06f76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f561fc65-eb03-4bd7-9e6e-8e2513e06f76
Content-Type: application/json

--- request body ---
{"handle":"qa-26c3e6f25e75","displayName":"QA 26c3e6f25e75","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f561fc65-eb03-4bd7-9e6e-8e2513e06f76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 8
Location: /v1/accounts/qa-26c3e6f25e75
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c0dc687e-0375-4654-9ba9-591cd0024971","handle":"qa-26c3e6f25e75","displayName":"QA 26c3e6f25e75","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.694080345Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-18878c87-e166-42d7-b184-1ab4167eb0de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18878c87-e166-42d7-b184-1ab4167eb0de
Content-Type: application/json

--- request body ---
{"handle":"qa-e52787d22f40","displayName":"QA e52787d22f40","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-18878c87-e166-42d7-b184-1ab4167eb0de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 8
Location: /v1/accounts/qa-e52787d22f40
X-Served-Region: eu
Content-Length: 181

{"id":"acc_794816e2-b775-4c99-ab9b-039500833f64","handle":"qa-e52787d22f40","displayName":"QA e52787d22f40","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.716769606Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dc7537e7-40a1-4219-9152-1e55d02ac475

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc7537e7-40a1-4219-9152-1e55d02ac475
Content-Type: application/json

--- request body ---
{"handle":"qa-26c3e6f25e75","password":"****"}

--- response: 200 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc7537e7-40a1-4219-9152-1e55d02ac475
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c0dc687e-0375-4654-9ba9-591cd0024971"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d77f2bab-e364-4437-982f-833c56739472

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d77f2bab-e364-4437-982f-833c56739472
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e52787d22f40","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d77f2bab-e364-4437-982f-833c56739472
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
Location: /v1/conversations/cnv_732d15fd-72f6-4425-a27f-983db3b75241
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_732d15fd-72f6-4425-a27f-983db3b75241","subject":"Error contract","status":"open","region":"eu","participants":["qa-26c3e6f25e75","qa-e52787d22f40"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:33.783440698Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-3b109324-1ef0-4fb8-a6a7-f9aff0e221cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b109324-1ef0-4fb8-a6a7-f9aff0e221cf
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b109324-1ef0-4fb8-a6a7-f9aff0e221cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ef5d3e3-1087-4d00-85a4-f0cb0d6135b0"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-97c74eaa-9fa6-4f0f-963d-7f0a6013d197

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97c74eaa-9fa6-4f0f-963d-7f0a6013d197
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-97c74eaa-9fa6-4f0f-963d-7f0a6013d197
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
Content-Length: 47

{"accounts":11,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-feeee3ca-816c-4757-9853-f9500ba26a40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feeee3ca-816c-4757-9853-f9500ba26a40
Content-Type: application/json

--- request body ---
{"handle":"qa-e52787d22f40","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-feeee3ca-816c-4757-9853-f9500ba26a40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_794816e2-b775-4c99-ab9b-039500833f64"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-806fb1d3-b094-4abe-90af-370ce5e2d4e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-806fb1d3-b094-4abe-90af-370ce5e2d4e4
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-806fb1d3-b094-4abe-90af-370ce5e2d4e4
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-536ccca3-1132-42f3-b27e-28d0205dd33a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-536ccca3-1132-42f3-b27e-28d0205dd33a
Content-Type: application/json

--- request body ---
{"handle":"qa-e52787d22f40","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-536ccca3-1132-42f3-b27e-28d0205dd33a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-536ccca3-1132-42f3-b27e-28d0205dd33a"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7ce17357-1185-456d-9384-65c30ba75a90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ce17357-1185-456d-9384-65c30ba75a90
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7ce17357-1185-456d-9384-65c30ba75a90
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-1480e1ee-543f-4927-a5bd-07809bb8908b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1480e1ee-543f-4927-a5bd-07809bb8908b
Content-Type: application/json

--- request body ---
{"handle":"qa-26c3e6f25e75","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1480e1ee-543f-4927-a5bd-07809bb8908b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1480e1ee-543f-4927-a5bd-07809bb8908b"}
```
