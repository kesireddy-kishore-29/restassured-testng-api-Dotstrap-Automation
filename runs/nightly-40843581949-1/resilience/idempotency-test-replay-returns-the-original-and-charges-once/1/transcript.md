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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-bd95ae3d-e07b-498a-aeb5-2a658760282a` |
| 2 | `POST /v1/auth/token` | 200 | 11 | `qa-fe12d038-7b02-476c-a6ac-05f462931053` |
| 3 | `POST /v1/credits/purchases` | 201 | 9 | `qa-a8d5a1fc-54ea-4b84-a498-a67a38d65341` |
| 4 | `POST /v1/credits/purchases` | 200 | 5 | `qa-fdf5b2a1-d677-445a-931e-19316c52fca8` |
| 5 | `GET /v1/credits/balance` | 200 | 6 | `qa-4a3a25ee-a03d-4963-bbd0-79b7ffdd4a29` |
| 6 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-a864e0c6-75b2-4463-b783-88274a37c20d` |
| 7 | `POST /v1/auth/token` | 401 | 8 | `qa-c2653aec-f109-49bd-9c95-43b493eceb2d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bd95ae3d-e07b-498a-aeb5-2a658760282a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd95ae3d-e07b-498a-aeb5-2a658760282a
Content-Type: application/json

--- request body ---
{"handle":"qa-fee769821d96","displayName":"QA fee769821d96","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd95ae3d-e07b-498a-aeb5-2a658760282a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Location: /v1/accounts/qa-fee769821d96
X-Served-Region: eu
Content-Length: 181

{"id":"acc_51360cad-6ad7-42b6-897c-1268854e1cba","handle":"qa-fee769821d96","displayName":"QA fee769821d96","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.749636782Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fe12d038-7b02-476c-a6ac-05f462931053

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe12d038-7b02-476c-a6ac-05f462931053
Content-Type: application/json

--- request body ---
{"handle":"qa-fee769821d96","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe12d038-7b02-476c-a6ac-05f462931053
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_51360cad-6ad7-42b6-897c-1268854e1cba"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a8d5a1fc-54ea-4b84-a498-a67a38d65341

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0c191c65f4d34fc292a93b6c660fc221
X-Correlation-Id: qa-a8d5a1fc-54ea-4b84-a498-a67a38d65341
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8d5a1fc-54ea-4b84-a498-a67a38d65341
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
Location: /v1/credits/purchases/pur_c48ce88d-c4e5-4a6e-99a9-56a9b2fc301e
Content-Length: 144

{"id":"pur_c48ce88d-c4e5-4a6e-99a9-56a9b2fc301e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-29T08:38:57.787429589Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fdf5b2a1-d677-445a-931e-19316c52fca8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0c191c65f4d34fc292a93b6c660fc221
X-Correlation-Id: qa-fdf5b2a1-d677-445a-931e-19316c52fca8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdf5b2a1-d677-445a-931e-19316c52fca8
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
Location: /v1/credits/purchases/pur_c48ce88d-c4e5-4a6e-99a9-56a9b2fc301e
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_c48ce88d-c4e5-4a6e-99a9-56a9b2fc301e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-29T08:38:57.787429589Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-4a3a25ee-a03d-4963-bbd0-79b7ffdd4a29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a3a25ee-a03d-4963-bbd0-79b7ffdd4a29
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a3a25ee-a03d-4963-bbd0-79b7ffdd4a29
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

{"balance":15,"currency":"credits","accountId":"acc_51360cad-6ad7-42b6-897c-1268854e1cba"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a864e0c6-75b2-4463-b783-88274a37c20d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a864e0c6-75b2-4463-b783-88274a37c20d
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a864e0c6-75b2-4463-b783-88274a37c20d
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
correlation: qa-c2653aec-f109-49bd-9c95-43b493eceb2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2653aec-f109-49bd-9c95-43b493eceb2d
Content-Type: application/json

--- request body ---
{"handle":"qa-fee769821d96","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2653aec-f109-49bd-9c95-43b493eceb2d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c2653aec-f109-49bd-9c95-43b493eceb2d"}
```
