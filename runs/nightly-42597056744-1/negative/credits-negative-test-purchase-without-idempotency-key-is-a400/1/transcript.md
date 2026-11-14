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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-077d5b88-2673-4449-82f9-deed75026b2e` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-dca63391-76cc-4088-974a-a6f94f25bab2` |
| 3 | `POST /v1/credits/purchases` | 400 | 11 | `qa-241e109c-01ea-4782-ab62-ddbfcd45c555` |
| 4 | `GET /v1/credits/balance` | 200 | 11 | `qa-e50b7596-5fd4-484a-af15-fa40b50211b0` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-dc83f582-889d-4edb-8ec7-6403b3419f4a` |
| 6 | `POST /v1/auth/token` | 401 | 11 | `qa-bcb68c21-203d-4379-93df-50567111c829` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-077d5b88-2673-4449-82f9-deed75026b2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-077d5b88-2673-4449-82f9-deed75026b2e
Content-Type: application/json

--- request body ---
{"handle":"qa-2291e7f2e00c","displayName":"QA 2291e7f2e00c","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-077d5b88-2673-4449-82f9-deed75026b2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Location: /v1/accounts/qa-2291e7f2e00c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5f87bafc-bf14-4371-ba72-a29d854a4b27","handle":"qa-2291e7f2e00c","displayName":"QA 2291e7f2e00c","region":"eu","role":"user","createdAt":"2026-11-09T09:55:56.784971092Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-dca63391-76cc-4088-974a-a6f94f25bab2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dca63391-76cc-4088-974a-a6f94f25bab2
Content-Type: application/json

--- request body ---
{"handle":"qa-2291e7f2e00c","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-dca63391-76cc-4088-974a-a6f94f25bab2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5f87bafc-bf14-4371-ba72-a29d854a4b27"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-241e109c-01ea-4782-ab62-ddbfcd45c555

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-241e109c-01ea-4782-ab62-ddbfcd45c555
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 11 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-241e109c-01ea-4782-ab62-ddbfcd45c555
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-241e109c-01ea-4782-ab62-ddbfcd45c555"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-e50b7596-5fd4-484a-af15-fa40b50211b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e50b7596-5fd4-484a-af15-fa40b50211b0
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-e50b7596-5fd4-484a-af15-fa40b50211b0
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

{"balance":5,"currency":"credits","accountId":"acc_5f87bafc-bf14-4371-ba72-a29d854a4b27"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc83f582-889d-4edb-8ec7-6403b3419f4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc83f582-889d-4edb-8ec7-6403b3419f4a
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc83f582-889d-4edb-8ec7-6403b3419f4a
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
correlation: qa-bcb68c21-203d-4379-93df-50567111c829

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcb68c21-203d-4379-93df-50567111c829
Content-Type: application/json

--- request body ---
{"handle":"qa-2291e7f2e00c","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bcb68c21-203d-4379-93df-50567111c829
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bcb68c21-203d-4379-93df-50567111c829"}
```
