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
| 1 | `POST /v1/accounts` | 201 | 6 | `qa-6cf73f49-3964-4d06-b3ce-44d210f16b80` |
| 2 | `POST /v1/auth/token` | 200 | 8 | `qa-3f242c8c-8656-4cc6-9329-192c4b96b247` |
| 3 | `POST /v1/credits/purchases` | 201 | 5 | `qa-eaaf23f3-b694-48ef-8a4e-16095510f442` |
| 4 | `POST /v1/credits/purchases` | 409 | 4 | `qa-65b0d9fc-e0a7-48ae-ad86-76d63cf2633f` |
| 5 | `GET /v1/credits/balance` | 200 | 6 | `qa-f57663f2-4afc-4e76-8258-e8dde575ad11` |
| 6 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-bc9d47a1-9f59-432a-b8c5-0929870bfa98` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-f26b47ce-4eaf-4902-a9be-b9767eda9283` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6cf73f49-3964-4d06-b3ce-44d210f16b80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cf73f49-3964-4d06-b3ce-44d210f16b80
Content-Type: application/json

--- request body ---
{"handle":"qa-a0f9c1c47f82","displayName":"QA a0f9c1c47f82","password":"****","region":"eu"}

--- response: 201 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cf73f49-3964-4d06-b3ce-44d210f16b80
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
Location: /v1/accounts/qa-a0f9c1c47f82
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28222705-e5f4-46aa-a007-13646ce8ea28","handle":"qa-a0f9c1c47f82","displayName":"QA a0f9c1c47f82","region":"eu","role":"user","createdAt":"2026-10-27T08:00:19.584730486Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3f242c8c-8656-4cc6-9329-192c4b96b247

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f242c8c-8656-4cc6-9329-192c4b96b247
Content-Type: application/json

--- request body ---
{"handle":"qa-a0f9c1c47f82","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f242c8c-8656-4cc6-9329-192c4b96b247
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28222705-e5f4-46aa-a007-13646ce8ea28"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-eaaf23f3-b694-48ef-8a4e-16095510f442

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8d3d63ed71984e88b511648a8b11d600
X-Correlation-Id: qa-eaaf23f3-b694-48ef-8a4e-16095510f442
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaaf23f3-b694-48ef-8a4e-16095510f442
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
Location: /v1/credits/purchases/pur_ae7bd656-696b-40a4-a36d-282e6810d9e1
Content-Length: 144

{"id":"pur_ae7bd656-696b-40a4-a36d-282e6810d9e1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-27T08:00:19.607312089Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-65b0d9fc-e0a7-48ae-ad86-76d63cf2633f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8d3d63ed71984e88b511648a8b11d600
X-Correlation-Id: qa-65b0d9fc-e0a7-48ae-ad86-76d63cf2633f
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65b0d9fc-e0a7-48ae-ad86-76d63cf2633f
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-65b0d9fc-e0a7-48ae-ad86-76d63cf2633f"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-f57663f2-4afc-4e76-8258-e8dde575ad11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f57663f2-4afc-4e76-8258-e8dde575ad11
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-f57663f2-4afc-4e76-8258-e8dde575ad11
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

{"balance":15,"currency":"credits","accountId":"acc_28222705-e5f4-46aa-a007-13646ce8ea28"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bc9d47a1-9f59-432a-b8c5-0929870bfa98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc9d47a1-9f59-432a-b8c5-0929870bfa98
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bc9d47a1-9f59-432a-b8c5-0929870bfa98
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
correlation: qa-f26b47ce-4eaf-4902-a9be-b9767eda9283

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f26b47ce-4eaf-4902-a9be-b9767eda9283
Content-Type: application/json

--- request body ---
{"handle":"qa-a0f9c1c47f82","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f26b47ce-4eaf-4902-a9be-b9767eda9283
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f26b47ce-4eaf-4902-a9be-b9767eda9283"}
```
