# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 469 | `qa-fcdfcf1e-e992-49e3-8d3e-d4db01c51c13` |
| 2 | `POST /v1/accounts` | 201 | 92 | `qa-a1860407-d056-472e-9635-8601650d6db6` |
| 3 | `POST /v1/auth/token` | 200 | 72 | `qa-d2cc02d8-23fc-4ef6-9c5c-e83c3c400555` |
| 4 | `POST /v1/conversations` | 201 | 104 | `qa-78492fe4-94ac-44ec-9e32-de93d9f85088` |
| 5 | `PATCH /v1/accounts/me` | 503 | 34 | `qa-a2baa5b6-034f-4efb-b0e5-0568d797f235` |
| 6 | `POST /v1/auth/token` | 200 | 74 | `qa-a136c47f-0e3f-40fc-af68-aa3a65af9bb7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 45 | `qa-3c7327fd-8193-40ee-ba62-5fd98c80a190` |
| 8 | `POST /v1/auth/token` | 401 | 43 | `qa-7b597f6d-6dc5-4654-bdbb-9fa7b1197ac7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-23d94428-6a37-4e3a-ba09-2584bef7d506` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-b1cff607-a69d-49f5-80bf-2fc4569aecc1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fcdfcf1e-e992-49e3-8d3e-d4db01c51c13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcdfcf1e-e992-49e3-8d3e-d4db01c51c13
Content-Type: application/json

--- request body ---
{"handle":"qa-ea6281eb67e6","displayName":"QA ea6281eb67e6","password":"****","region":"eu"}

--- response: 201 in 469 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcdfcf1e-e992-49e3-8d3e-d4db01c51c13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Location: /v1/accounts/qa-ea6281eb67e6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d4e8925-977e-42b2-bacc-3b218e742c6c","handle":"qa-ea6281eb67e6","displayName":"QA ea6281eb67e6","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.390375773Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a1860407-d056-472e-9635-8601650d6db6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1860407-d056-472e-9635-8601650d6db6
Content-Type: application/json

--- request body ---
{"handle":"qa-b8f3fc06ee3c","displayName":"QA b8f3fc06ee3c","password":"****","region":"eu"}

--- response: 201 in 92 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1860407-d056-472e-9635-8601650d6db6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-b8f3fc06ee3c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4751aee2-023c-412a-881c-4eaac76ea79c","handle":"qa-b8f3fc06ee3c","displayName":"QA b8f3fc06ee3c","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.884484930Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d2cc02d8-23fc-4ef6-9c5c-e83c3c400555

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2cc02d8-23fc-4ef6-9c5c-e83c3c400555
Content-Type: application/json

--- request body ---
{"handle":"qa-ea6281eb67e6","password":"****"}

--- response: 200 in 72 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2cc02d8-23fc-4ef6-9c5c-e83c3c400555
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d4e8925-977e-42b2-bacc-3b218e742c6c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-78492fe4-94ac-44ec-9e32-de93d9f85088

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78492fe4-94ac-44ec-9e32-de93d9f85088
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b8f3fc06ee3c","subject":"Error contract","message":"Hi"}

--- response: 201 in 104 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-78492fe4-94ac-44ec-9e32-de93d9f85088
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
Location: /v1/conversations/cnv_d022fee7-31a6-426e-b4c6-7775b8b78684
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d022fee7-31a6-426e-b4c6-7775b8b78684","subject":"Error contract","status":"open","region":"eu","participants":["qa-ea6281eb67e6","qa-b8f3fc06ee3c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:02.198526724Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-a2baa5b6-034f-4efb-b0e5-0568d797f235

--- request headers ---
Accept: application/json
X-Fault-Key: 21daec66-50ac-47be-aa2c-a8b02e480825
X-Fault: unavailable-once
X-Correlation-Id: qa-a2baa5b6-034f-4efb-b0e5-0568d797f235
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 34 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2baa5b6-034f-4efb-b0e5-0568d797f235
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-a2baa5b6-034f-4efb-b0e5-0568d797f235"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a136c47f-0e3f-40fc-af68-aa3a65af9bb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a136c47f-0e3f-40fc-af68-aa3a65af9bb7
Content-Type: application/json

--- request body ---
{"handle":"qa-b8f3fc06ee3c","password":"****"}

--- response: 200 in 74 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a136c47f-0e3f-40fc-af68-aa3a65af9bb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4751aee2-023c-412a-881c-4eaac76ea79c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3c7327fd-8193-40ee-ba62-5fd98c80a190

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c7327fd-8193-40ee-ba62-5fd98c80a190
Content-Type: application/json

--- response: 204 in 45 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3c7327fd-8193-40ee-ba62-5fd98c80a190
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
correlation: qa-7b597f6d-6dc5-4654-bdbb-9fa7b1197ac7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b597f6d-6dc5-4654-bdbb-9fa7b1197ac7
Content-Type: application/json

--- request body ---
{"handle":"qa-b8f3fc06ee3c","password":"****"}

--- response: 401 in 43 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b597f6d-6dc5-4654-bdbb-9fa7b1197ac7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7b597f6d-6dc5-4654-bdbb-9fa7b1197ac7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-23d94428-6a37-4e3a-ba09-2584bef7d506

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23d94428-6a37-4e3a-ba09-2584bef7d506
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-23d94428-6a37-4e3a-ba09-2584bef7d506
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
correlation: qa-b1cff607-a69d-49f5-80bf-2fc4569aecc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1cff607-a69d-49f5-80bf-2fc4569aecc1
Content-Type: application/json

--- request body ---
{"handle":"qa-ea6281eb67e6","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1cff607-a69d-49f5-80bf-2fc4569aecc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1cff607-a69d-49f5-80bf-2fc4569aecc1"}
```
