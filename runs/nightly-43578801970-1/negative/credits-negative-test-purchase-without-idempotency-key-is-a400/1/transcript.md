# Transcript: A purchase without an Idempotency-Key is refused with 400

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#purchaseWithoutIdempotencyKeyIsA400` |
| Features | FEAT-IDEMP-03, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-3a7284b0-7bd3-4a55-9dee-8bbaf7ec1fab` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-face6112-b2de-4984-bad5-3899b8ec6466` |
| 3 | `POST /v1/credits/purchases` | 400 | 11 | `qa-4deae089-a510-41b5-a1db-eb37770d17c7` |
| 4 | `GET /v1/credits/balance` | 200 | 17 | `qa-2a3d6000-410f-4b36-a170-087112843f9a` |
| 5 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-dee7c21d-2ebe-4ebf-ab30-3e565ce8c0ad` |
| 6 | `POST /v1/auth/token` | 401 | 9 | `qa-8045f5c8-1998-49c7-a6cc-084f539fb082` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3a7284b0-7bd3-4a55-9dee-8bbaf7ec1fab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a7284b0-7bd3-4a55-9dee-8bbaf7ec1fab
Content-Type: application/json

--- request body ---
{"handle":"qa-b046a7cf5a1e","displayName":"QA b046a7cf5a1e","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a7284b0-7bd3-4a55-9dee-8bbaf7ec1fab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Location: /v1/accounts/qa-b046a7cf5a1e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2122d5a4-969b-405d-a85e-cb98de6caf7b","handle":"qa-b046a7cf5a1e","displayName":"QA b046a7cf5a1e","region":"eu","role":"user","createdAt":"2026-11-14T09:05:21.923109933Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-face6112-b2de-4984-bad5-3899b8ec6466

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-face6112-b2de-4984-bad5-3899b8ec6466
Content-Type: application/json

--- request body ---
{"handle":"qa-b046a7cf5a1e","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-face6112-b2de-4984-bad5-3899b8ec6466
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2122d5a4-969b-405d-a85e-cb98de6caf7b"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4deae089-a510-41b5-a1db-eb37770d17c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4deae089-a510-41b5-a1db-eb37770d17c7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4deae089-a510-41b5-a1db-eb37770d17c7
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
Content-Length: 319

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-4deae089-a510-41b5-a1db-eb37770d17c7"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-2a3d6000-410f-4b36-a170-087112843f9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a3d6000-410f-4b36-a170-087112843f9a
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a3d6000-410f-4b36-a170-087112843f9a
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
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_2122d5a4-969b-405d-a85e-cb98de6caf7b"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dee7c21d-2ebe-4ebf-ab30-3e565ce8c0ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dee7c21d-2ebe-4ebf-ab30-3e565ce8c0ad
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dee7c21d-2ebe-4ebf-ab30-3e565ce8c0ad
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8045f5c8-1998-49c7-a6cc-084f539fb082

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8045f5c8-1998-49c7-a6cc-084f539fb082
Content-Type: application/json

--- request body ---
{"handle":"qa-b046a7cf5a1e","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8045f5c8-1998-49c7-a6cc-084f539fb082
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8045f5c8-1998-49c7-a6cc-084f539fb082"}
```
