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
| 1 | `POST /v1/accounts` | 201 | 482 | `qa-5adbe609-ca76-4352-823f-2caf45a1b220` |
| 2 | `POST /v1/auth/token` | 200 | 71 | `qa-6287545e-7213-421d-af47-fde1c8efa6ac` |
| 3 | `POST /v1/credits/purchases` | 201 | 48 | `qa-c3a45e07-b54f-4674-8308-99790cd760d3` |
| 4 | `POST /v1/credits/purchases` | 200 | 15 | `qa-15616ebe-ba4d-4278-b4f4-35ce54651c5a` |
| 5 | `GET /v1/credits/balance` | 200 | 43 | `qa-591bbb42-b39e-4006-b4c3-430bf8e2ef79` |
| 6 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-7a013f74-9ec1-489c-b0e8-025bc602e85b` |
| 7 | `POST /v1/auth/token` | 401 | 29 | `qa-7abc8354-4354-44d6-8057-3a5db2785274` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5adbe609-ca76-4352-823f-2caf45a1b220

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5adbe609-ca76-4352-823f-2caf45a1b220
Content-Type: application/json

--- request body ---
{"handle":"qa-a3541bfa0bc1","displayName":"QA a3541bfa0bc1","password":"****","region":"eu"}

--- response: 201 in 482 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-5adbe609-ca76-4352-823f-2caf45a1b220
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-a3541bfa0bc1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6737b14-d77f-421d-9306-a8463e412295","handle":"qa-a3541bfa0bc1","displayName":"QA a3541bfa0bc1","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.240224588Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6287545e-7213-421d-af47-fde1c8efa6ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6287545e-7213-421d-af47-fde1c8efa6ac
Content-Type: application/json

--- request body ---
{"handle":"qa-a3541bfa0bc1","password":"****"}

--- response: 200 in 71 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-6287545e-7213-421d-af47-fde1c8efa6ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6737b14-d77f-421d-9306-a8463e412295"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c3a45e07-b54f-4674-8308-99790cd760d3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-164acd819bc24e7ab56052d3e37c471f
X-Correlation-Id: qa-c3a45e07-b54f-4674-8308-99790cd760d3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 48 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3a45e07-b54f-4674-8308-99790cd760d3
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
Location: /v1/credits/purchases/pur_2eb00beb-a69b-416a-a40e-336a9362eb41
Content-Length: 144

{"id":"pur_2eb00beb-a69b-416a-a40e-336a9362eb41","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-21T09:57:10.971663357Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-15616ebe-ba4d-4278-b4f4-35ce54651c5a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-164acd819bc24e7ab56052d3e37c471f
X-Correlation-Id: qa-15616ebe-ba4d-4278-b4f4-35ce54651c5a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-15616ebe-ba4d-4278-b4f4-35ce54651c5a
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
Location: /v1/credits/purchases/pur_2eb00beb-a69b-416a-a40e-336a9362eb41
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_2eb00beb-a69b-416a-a40e-336a9362eb41","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-21T09:57:10.971663357Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-591bbb42-b39e-4006-b4c3-430bf8e2ef79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-591bbb42-b39e-4006-b4c3-430bf8e2ef79
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-591bbb42-b39e-4006-b4c3-430bf8e2ef79
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

{"balance":15,"currency":"credits","accountId":"acc_b6737b14-d77f-421d-9306-a8463e412295"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a013f74-9ec1-489c-b0e8-025bc602e85b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a013f74-9ec1-489c-b0e8-025bc602e85b
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a013f74-9ec1-489c-b0e8-025bc602e85b
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
correlation: qa-7abc8354-4354-44d6-8057-3a5db2785274

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7abc8354-4354-44d6-8057-3a5db2785274
Content-Type: application/json

--- request body ---
{"handle":"qa-a3541bfa0bc1","password":"****"}

--- response: 401 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7abc8354-4354-44d6-8057-3a5db2785274
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7abc8354-4354-44d6-8057-3a5db2785274"}
```
