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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-3c2efd37-34f8-48a1-a058-8df2c5af23e0` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-55c88cb3-8498-4850-ba93-c90cda36594d` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-42efb6c7-e3a3-4af5-ad1c-a5c66fb4fb9d` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-b354f392-a174-4882-94b0-a32c3e408ce6` |
| 5 | `GET /v1/credits/balance` | 503 | 13 | `qa-24498330-cbb1-4a5c-89aa-4e3155b252e1` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-cf44df5b-b118-42ad-9a6f-09dc07f04c65` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-cf95e24c-4b27-451a-8a0e-1d841df5d922` |
| 8 | `POST /v1/auth/token` | 401 | 29 | `qa-e17a09c4-84bd-4eb3-9a76-dc41b99e2d91` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-865b1b97-cb3a-42df-a436-5eae7d6de590` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-662b9bfe-e29f-475a-a4b5-44e63a36b173` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3c2efd37-34f8-48a1-a058-8df2c5af23e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c2efd37-34f8-48a1-a058-8df2c5af23e0
Content-Type: application/json

--- request body ---
{"handle":"qa-bc7137d28bd4","displayName":"QA bc7137d28bd4","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c2efd37-34f8-48a1-a058-8df2c5af23e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 8
Location: /v1/accounts/qa-bc7137d28bd4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc034a44-2923-42c7-a916-75fc10bd82f1","handle":"qa-bc7137d28bd4","displayName":"QA bc7137d28bd4","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.153545590Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-55c88cb3-8498-4850-ba93-c90cda36594d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55c88cb3-8498-4850-ba93-c90cda36594d
Content-Type: application/json

--- request body ---
{"handle":"qa-8f2ac959e0e8","displayName":"QA 8f2ac959e0e8","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-55c88cb3-8498-4850-ba93-c90cda36594d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Location: /v1/accounts/qa-8f2ac959e0e8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_32487cfd-5fba-4364-bb03-84d74f22ed35","handle":"qa-8f2ac959e0e8","displayName":"QA 8f2ac959e0e8","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.190213288Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-42efb6c7-e3a3-4af5-ad1c-a5c66fb4fb9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42efb6c7-e3a3-4af5-ad1c-a5c66fb4fb9d
Content-Type: application/json

--- request body ---
{"handle":"qa-bc7137d28bd4","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-42efb6c7-e3a3-4af5-ad1c-a5c66fb4fb9d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc034a44-2923-42c7-a916-75fc10bd82f1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b354f392-a174-4882-94b0-a32c3e408ce6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b354f392-a174-4882-94b0-a32c3e408ce6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8f2ac959e0e8","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b354f392-a174-4882-94b0-a32c3e408ce6
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
Location: /v1/conversations/cnv_b297e797-b8ef-4092-93b2-61351ed73a62
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b297e797-b8ef-4092-93b2-61351ed73a62","subject":"Error contract","status":"open","region":"eu","participants":["qa-bc7137d28bd4","qa-8f2ac959e0e8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.245258366Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-24498330-cbb1-4a5c-89aa-4e3155b252e1

--- request headers ---
Accept: application/json
X-Fault-Key: 32866779-b33f-484b-8164-43b8f12a784d
X-Fault: unavailable-once
X-Correlation-Id: qa-24498330-cbb1-4a5c-89aa-4e3155b252e1
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-24498330-cbb1-4a5c-89aa-4e3155b252e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-24498330-cbb1-4a5c-89aa-4e3155b252e1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cf44df5b-b118-42ad-9a6f-09dc07f04c65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf44df5b-b118-42ad-9a6f-09dc07f04c65
Content-Type: application/json

--- request body ---
{"handle":"qa-8f2ac959e0e8","password":"****"}

--- response: 200 in 47 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf44df5b-b118-42ad-9a6f-09dc07f04c65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_32487cfd-5fba-4364-bb03-84d74f22ed35"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf95e24c-4b27-451a-8a0e-1d841df5d922

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf95e24c-4b27-451a-8a0e-1d841df5d922
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf95e24c-4b27-451a-8a0e-1d841df5d922
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
correlation: qa-e17a09c4-84bd-4eb3-9a76-dc41b99e2d91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e17a09c4-84bd-4eb3-9a76-dc41b99e2d91
Content-Type: application/json

--- request body ---
{"handle":"qa-8f2ac959e0e8","password":"****"}

--- response: 401 in 29 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e17a09c4-84bd-4eb3-9a76-dc41b99e2d91
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e17a09c4-84bd-4eb3-9a76-dc41b99e2d91"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-865b1b97-cb3a-42df-a436-5eae7d6de590

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-865b1b97-cb3a-42df-a436-5eae7d6de590
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-865b1b97-cb3a-42df-a436-5eae7d6de590
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
correlation: qa-662b9bfe-e29f-475a-a4b5-44e63a36b173

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-662b9bfe-e29f-475a-a4b5-44e63a36b173
Content-Type: application/json

--- request body ---
{"handle":"qa-bc7137d28bd4","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-662b9bfe-e29f-475a-a4b5-44e63a36b173
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-662b9bfe-e29f-475a-a4b5-44e63a36b173"}
```
