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
| 1 | `POST /v1/accounts` | 201 | 494 | `qa-98fd502c-41cb-4422-a61d-57d6e7a56056` |
| 2 | `POST /v1/auth/token` | 200 | 100 | `qa-233977a6-be8e-40bb-943b-481e82720fad` |
| 3 | `POST /v1/credits/purchases` | 400 | 40 | `qa-b02eb96e-5f39-4669-a1be-3bf9f8393d17` |
| 4 | `GET /v1/credits/balance` | 200 | 34 | `qa-1c060dfc-7f88-49bd-93a3-f899180872c4` |
| 5 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-0e558086-cfd6-4967-8407-24ed8a7cd008` |
| 6 | `POST /v1/auth/token` | 401 | 16 | `qa-a48b55ac-1b0c-47e2-8b1d-ec97f1d6addf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-98fd502c-41cb-4422-a61d-57d6e7a56056

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98fd502c-41cb-4422-a61d-57d6e7a56056
Content-Type: application/json

--- request body ---
{"handle":"qa-8dc20fbb6902","displayName":"QA 8dc20fbb6902","password":"****","region":"eu"}

--- response: 201 in 494 ms ---
Date: Mon, 02 Nov 2026 09:38:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-98fd502c-41cb-4422-a61d-57d6e7a56056
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-8dc20fbb6902
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3746ccb0-5608-4b8d-8da3-f0ec9f4eeb23","handle":"qa-8dc20fbb6902","displayName":"QA 8dc20fbb6902","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.210371618Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-233977a6-be8e-40bb-943b-481e82720fad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-233977a6-be8e-40bb-943b-481e82720fad
Content-Type: application/json

--- request body ---
{"handle":"qa-8dc20fbb6902","password":"****"}

--- response: 200 in 100 ms ---
Date: Mon, 02 Nov 2026 09:38:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-233977a6-be8e-40bb-943b-481e82720fad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3746ccb0-5608-4b8d-8da3-f0ec9f4eeb23"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b02eb96e-5f39-4669-a1be-3bf9f8393d17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b02eb96e-5f39-4669-a1be-3bf9f8393d17
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 40 ms ---
Date: Mon, 02 Nov 2026 09:38:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b02eb96e-5f39-4669-a1be-3bf9f8393d17
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-b02eb96e-5f39-4669-a1be-3bf9f8393d17"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-1c060dfc-7f88-49bd-93a3-f899180872c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c060dfc-7f88-49bd-93a3-f899180872c4
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c060dfc-7f88-49bd-93a3-f899180872c4
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

{"balance":5,"currency":"credits","accountId":"acc_3746ccb0-5608-4b8d-8da3-f0ec9f4eeb23"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0e558086-cfd6-4967-8407-24ed8a7cd008

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e558086-cfd6-4967-8407-24ed8a7cd008
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0e558086-cfd6-4967-8407-24ed8a7cd008
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a48b55ac-1b0c-47e2-8b1d-ec97f1d6addf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a48b55ac-1b0c-47e2-8b1d-ec97f1d6addf
Content-Type: application/json

--- request body ---
{"handle":"qa-8dc20fbb6902","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a48b55ac-1b0c-47e2-8b1d-ec97f1d6addf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a48b55ac-1b0c-47e2-8b1d-ec97f1d6addf"}
```
