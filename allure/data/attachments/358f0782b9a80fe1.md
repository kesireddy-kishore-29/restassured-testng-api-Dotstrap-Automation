# Transcript: Same key + different body is a 409 and charges nothing

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#reusingAKeyForADifferentPurchaseIsRefused` |
| Features | FEAT-IDEMP-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 7 | `qa-18781b54-540f-4395-a82e-eadb57d7fecb` |
| 2 | `POST /v1/auth/token` | 200 | 7 | `qa-846e1df9-e55a-45b1-ab60-1474852207da` |
| 3 | `POST /v1/credits/purchases` | 201 | 4 | `qa-d5b4328c-aa46-4834-a43c-768d936c1dc7` |
| 4 | `POST /v1/credits/purchases` | 409 | 3 | `qa-40680ea0-a689-4200-965b-33daf49cee6f` |
| 5 | `GET /v1/credits/balance` | 200 | 5 | `qa-dac404d3-c4e8-4ff0-acda-9eb63496de11` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-57673238-9e1d-4d68-8720-7e3783c199fd` |
| 7 | `POST /v1/auth/token` | 401 | 4 | `qa-6cd49836-b869-45e8-bbd8-325e2251ee09` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-18781b54-540f-4395-a82e-eadb57d7fecb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18781b54-540f-4395-a82e-eadb57d7fecb
Content-Type: application/json

--- request body ---
{"handle":"qa-b07afb6d36b2","displayName":"QA b07afb6d36b2","password":"****","region":"eu"}

--- response: 201 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-18781b54-540f-4395-a82e-eadb57d7fecb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Location: /v1/accounts/qa-b07afb6d36b2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f51f1a6-75ed-40e2-841a-b5d7889d9493","handle":"qa-b07afb6d36b2","displayName":"QA b07afb6d36b2","region":"eu","role":"user","createdAt":"2026-10-31T08:31:30.238958252Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-846e1df9-e55a-45b1-ab60-1474852207da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-846e1df9-e55a-45b1-ab60-1474852207da
Content-Type: application/json

--- request body ---
{"handle":"qa-b07afb6d36b2","password":"****"}

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-846e1df9-e55a-45b1-ab60-1474852207da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f51f1a6-75ed-40e2-841a-b5d7889d9493"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d5b4328c-aa46-4834-a43c-768d936c1dc7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-16b8d2bd188c49efaf12f7ca98bdd805
X-Correlation-Id: qa-d5b4328c-aa46-4834-a43c-768d936c1dc7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5b4328c-aa46-4834-a43c-768d936c1dc7
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
Location: /v1/credits/purchases/pur_4bf4cfc3-0141-4feb-8126-32c14162c5dc
Content-Length: 144

{"id":"pur_4bf4cfc3-0141-4feb-8126-32c14162c5dc","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-31T08:31:30.259015659Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-40680ea0-a689-4200-965b-33daf49cee6f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-16b8d2bd188c49efaf12f7ca98bdd805
X-Correlation-Id: qa-40680ea0-a689-4200-965b-33daf49cee6f
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40680ea0-a689-4200-965b-33daf49cee6f
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
Content-Length: 334

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-40680ea0-a689-4200-965b-33daf49cee6f"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-dac404d3-c4e8-4ff0-acda-9eb63496de11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dac404d3-c4e8-4ff0-acda-9eb63496de11
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-dac404d3-c4e8-4ff0-acda-9eb63496de11
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

{"balance":15,"currency":"credits","accountId":"acc_0f51f1a6-75ed-40e2-841a-b5d7889d9493"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-57673238-9e1d-4d68-8720-7e3783c199fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57673238-9e1d-4d68-8720-7e3783c199fd
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-57673238-9e1d-4d68-8720-7e3783c199fd
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
correlation: qa-6cd49836-b869-45e8-bbd8-325e2251ee09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cd49836-b869-45e8-bbd8-325e2251ee09
Content-Type: application/json

--- request body ---
{"handle":"qa-b07afb6d36b2","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6cd49836-b869-45e8-bbd8-325e2251ee09
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6cd49836-b869-45e8-bbd8-325e2251ee09"}
```
