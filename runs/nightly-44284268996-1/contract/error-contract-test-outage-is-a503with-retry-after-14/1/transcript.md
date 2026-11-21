# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-fa6fcfe1-6351-4145-ab23-c399b3ec6667` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-6ca97785-2643-4a10-8cbb-6de73dd73d62` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-90591b79-0da4-48cf-b9db-6482e5649a74` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-92d27b7a-9ddf-45a0-bf21-a0835cfc6acd` |
| 5 | `GET /v1/credits/ledger` | 503 | 35 | `qa-27e784cb-ae0c-46ba-86bd-445001a6d229` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-9df6dc17-0331-48e3-aefa-74c8ac8d192b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-a0932a4b-7c00-4a0b-8dbb-591f78aa1534` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-98582122-6534-4ba1-93be-5cf207115591` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-92a525d0-44ff-4fac-8500-526436b25fed` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-937b04f7-ff74-4142-b978-52c4b20d12c5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fa6fcfe1-6351-4145-ab23-c399b3ec6667

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa6fcfe1-6351-4145-ab23-c399b3ec6667
Content-Type: application/json

--- request body ---
{"handle":"qa-dc2790ad84da","displayName":"QA dc2790ad84da","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa6fcfe1-6351-4145-ab23-c399b3ec6667
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 8
Location: /v1/accounts/qa-dc2790ad84da
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20c7b057-5258-4f80-9c20-6d18f16839a3","handle":"qa-dc2790ad84da","displayName":"QA dc2790ad84da","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.584838875Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6ca97785-2643-4a10-8cbb-6de73dd73d62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ca97785-2643-4a10-8cbb-6de73dd73d62
Content-Type: application/json

--- request body ---
{"handle":"qa-0fd33165abbd","displayName":"QA 0fd33165abbd","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ca97785-2643-4a10-8cbb-6de73dd73d62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 7
Location: /v1/accounts/qa-0fd33165abbd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_640e4f61-68d1-4d10-98fc-f7e2c906e6a1","handle":"qa-0fd33165abbd","displayName":"QA 0fd33165abbd","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.647477101Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-90591b79-0da4-48cf-b9db-6482e5649a74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90591b79-0da4-48cf-b9db-6482e5649a74
Content-Type: application/json

--- request body ---
{"handle":"qa-dc2790ad84da","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-90591b79-0da4-48cf-b9db-6482e5649a74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20c7b057-5258-4f80-9c20-6d18f16839a3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-92d27b7a-9ddf-45a0-bf21-a0835cfc6acd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92d27b7a-9ddf-45a0-bf21-a0835cfc6acd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0fd33165abbd","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-92d27b7a-9ddf-45a0-bf21-a0835cfc6acd
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
Location: /v1/conversations/cnv_3722d6e7-192d-447f-bdc4-8a137b8dc8ef
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3722d6e7-192d-447f-bdc4-8a137b8dc8ef","subject":"Error contract","status":"open","region":"eu","participants":["qa-dc2790ad84da","qa-0fd33165abbd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.702180101Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-27e784cb-ae0c-46ba-86bd-445001a6d229

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 6bf7ef39-1d57-4155-90e4-c061d5b0925b
X-Correlation-Id: qa-27e784cb-ae0c-46ba-86bd-445001a6d229
Content-Type: application/json

--- response: 503 in 35 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27e784cb-ae0c-46ba-86bd-445001a6d229
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-27e784cb-ae0c-46ba-86bd-445001a6d229"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9df6dc17-0331-48e3-aefa-74c8ac8d192b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9df6dc17-0331-48e3-aefa-74c8ac8d192b
Content-Type: application/json

--- request body ---
{"handle":"qa-0fd33165abbd","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9df6dc17-0331-48e3-aefa-74c8ac8d192b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_640e4f61-68d1-4d10-98fc-f7e2c906e6a1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a0932a4b-7c00-4a0b-8dbb-591f78aa1534

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0932a4b-7c00-4a0b-8dbb-591f78aa1534
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a0932a4b-7c00-4a0b-8dbb-591f78aa1534
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
correlation: qa-98582122-6534-4ba1-93be-5cf207115591

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98582122-6534-4ba1-93be-5cf207115591
Content-Type: application/json

--- request body ---
{"handle":"qa-0fd33165abbd","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98582122-6534-4ba1-93be-5cf207115591
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-98582122-6534-4ba1-93be-5cf207115591"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-92a525d0-44ff-4fac-8500-526436b25fed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92a525d0-44ff-4fac-8500-526436b25fed
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-92a525d0-44ff-4fac-8500-526436b25fed
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
correlation: qa-937b04f7-ff74-4142-b978-52c4b20d12c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-937b04f7-ff74-4142-b978-52c4b20d12c5
Content-Type: application/json

--- request body ---
{"handle":"qa-dc2790ad84da","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-937b04f7-ff74-4142-b978-52c4b20d12c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-937b04f7-ff74-4142-b978-52c4b20d12c5"}
```
