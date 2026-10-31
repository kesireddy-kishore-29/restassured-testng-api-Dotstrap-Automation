# Transcript: Same key + same body replays the original purchase

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#replayReturnsTheOriginalAndChargesOnce` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-4bdfd46f-0196-4491-89bc-85aaf549b9ed` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-85c9ca7f-bb42-4629-ae90-2ac24af41d5b` |
| 3 | `POST /v1/credits/purchases` | 201 | 6 | `qa-edbece87-7043-4798-aa2a-1a44bee4b3d2` |
| 4 | `POST /v1/credits/purchases` | 200 | 5 | `qa-114910f8-7c23-4a43-b760-a5497d3dabaa` |
| 5 | `GET /v1/credits/balance` | 200 | 8 | `qa-a8f499c7-ead4-4434-9b6d-591d71663ac8` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-d067933a-5fc7-4225-a0e3-8daf977bc470` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-99e1dde7-b561-4a86-933a-7297d8a2e39b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4bdfd46f-0196-4491-89bc-85aaf549b9ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bdfd46f-0196-4491-89bc-85aaf549b9ed
Content-Type: application/json

--- request body ---
{"handle":"qa-2a43774de038","displayName":"QA 2a43774de038","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bdfd46f-0196-4491-89bc-85aaf549b9ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Location: /v1/accounts/qa-2a43774de038
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fdac5393-a1f0-4228-8e13-fd7a74e78dc9","handle":"qa-2a43774de038","displayName":"QA 2a43774de038","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.986743453Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-85c9ca7f-bb42-4629-ae90-2ac24af41d5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85c9ca7f-bb42-4629-ae90-2ac24af41d5b
Content-Type: application/json

--- request body ---
{"handle":"qa-2a43774de038","password":"****"}

--- response: 200 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-85c9ca7f-bb42-4629-ae90-2ac24af41d5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdac5393-a1f0-4228-8e13-fd7a74e78dc9"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-edbece87-7043-4798-aa2a-1a44bee4b3d2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a8cd5ddcdb4d4f6bac5d432560acc3e2
X-Correlation-Id: qa-edbece87-7043-4798-aa2a-1a44bee4b3d2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-edbece87-7043-4798-aa2a-1a44bee4b3d2
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
Location: /v1/credits/purchases/pur_244380c9-f93d-4053-bf47-d3fa425327f7
Content-Length: 144

{"id":"pur_244380c9-f93d-4053-bf47-d3fa425327f7","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-28T08:42:52.014968383Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-114910f8-7c23-4a43-b760-a5497d3dabaa

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a8cd5ddcdb4d4f6bac5d432560acc3e2
X-Correlation-Id: qa-114910f8-7c23-4a43-b760-a5497d3dabaa
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-114910f8-7c23-4a43-b760-a5497d3dabaa
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
Location: /v1/credits/purchases/pur_244380c9-f93d-4053-bf47-d3fa425327f7
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_244380c9-f93d-4053-bf47-d3fa425327f7","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-28T08:42:52.014968383Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-a8f499c7-ead4-4434-9b6d-591d71663ac8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8f499c7-ead4-4434-9b6d-591d71663ac8
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8f499c7-ead4-4434-9b6d-591d71663ac8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_fdac5393-a1f0-4228-8e13-fd7a74e78dc9"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d067933a-5fc7-4225-a0e3-8daf977bc470

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d067933a-5fc7-4225-a0e3-8daf977bc470
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d067933a-5fc7-4225-a0e3-8daf977bc470
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-99e1dde7-b561-4a86-933a-7297d8a2e39b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99e1dde7-b561-4a86-933a-7297d8a2e39b
Content-Type: application/json

--- request body ---
{"handle":"qa-2a43774de038","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99e1dde7-b561-4a86-933a-7297d8a2e39b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-99e1dde7-b561-4a86-933a-7297d8a2e39b"}
```
