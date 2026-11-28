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
| 1 | `POST /v1/accounts` | 201 | 330 | `qa-743f1f04-ea04-4f2e-90c3-8ccb8dc70f01` |
| 2 | `POST /v1/auth/token` | 200 | 49 | `qa-ac011b22-a24c-4662-a8e9-c5880b6a60d1` |
| 3 | `POST /v1/credits/purchases` | 201 | 56 | `qa-411239f9-97d5-4c62-80af-1125fe7ed046` |
| 4 | `POST /v1/credits/purchases` | 200 | 20 | `qa-3cd579da-dc28-4a16-86d0-93d6e3e3fb83` |
| 5 | `GET /v1/credits/balance` | 200 | 25 | `qa-3c49b3fe-ac1e-4630-8fcf-e24270f9d094` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-e44c7171-cd44-4541-b532-23875647a34b` |
| 7 | `POST /v1/auth/token` | 401 | 15 | `qa-3425afd3-5309-4e18-8372-e86a2984ae8e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-743f1f04-ea04-4f2e-90c3-8ccb8dc70f01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-743f1f04-ea04-4f2e-90c3-8ccb8dc70f01
Content-Type: application/json

--- request body ---
{"handle":"qa-41d1b98aa82d","displayName":"QA 41d1b98aa82d","password":"****","region":"eu"}

--- response: 201 in 330 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-743f1f04-ea04-4f2e-90c3-8ccb8dc70f01
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
Location: /v1/accounts/qa-41d1b98aa82d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a12b9882-c5af-4ce0-a34e-d7c73d57abc3","handle":"qa-41d1b98aa82d","displayName":"QA 41d1b98aa82d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:48.126957944Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ac011b22-a24c-4662-a8e9-c5880b6a60d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac011b22-a24c-4662-a8e9-c5880b6a60d1
Content-Type: application/json

--- request body ---
{"handle":"qa-41d1b98aa82d","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac011b22-a24c-4662-a8e9-c5880b6a60d1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a12b9882-c5af-4ce0-a34e-d7c73d57abc3"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-411239f9-97d5-4c62-80af-1125fe7ed046

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6619b8aa4f364d18bc3ec1dcdabac171
X-Correlation-Id: qa-411239f9-97d5-4c62-80af-1125fe7ed046
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 56 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-411239f9-97d5-4c62-80af-1125fe7ed046
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
Location: /v1/credits/purchases/pur_63e61595-0772-4d81-b81e-64843d2cee82
Content-Length: 144

{"id":"pur_63e61595-0772-4d81-b81e-64843d2cee82","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-27T10:59:48.590240007Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3cd579da-dc28-4a16-86d0-93d6e3e3fb83

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6619b8aa4f364d18bc3ec1dcdabac171
X-Correlation-Id: qa-3cd579da-dc28-4a16-86d0-93d6e3e3fb83
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cd579da-dc28-4a16-86d0-93d6e3e3fb83
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
Location: /v1/credits/purchases/pur_63e61595-0772-4d81-b81e-64843d2cee82
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_63e61595-0772-4d81-b81e-64843d2cee82","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-27T10:59:48.590240007Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-3c49b3fe-ac1e-4630-8fcf-e24270f9d094

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c49b3fe-ac1e-4630-8fcf-e24270f9d094
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c49b3fe-ac1e-4630-8fcf-e24270f9d094
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

{"balance":15,"currency":"credits","accountId":"acc_a12b9882-c5af-4ce0-a34e-d7c73d57abc3"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e44c7171-cd44-4541-b532-23875647a34b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e44c7171-cd44-4541-b532-23875647a34b
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e44c7171-cd44-4541-b532-23875647a34b
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
correlation: qa-3425afd3-5309-4e18-8372-e86a2984ae8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3425afd3-5309-4e18-8372-e86a2984ae8e
Content-Type: application/json

--- request body ---
{"handle":"qa-41d1b98aa82d","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3425afd3-5309-4e18-8372-e86a2984ae8e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3425afd3-5309-4e18-8372-e86a2984ae8e"}
```
