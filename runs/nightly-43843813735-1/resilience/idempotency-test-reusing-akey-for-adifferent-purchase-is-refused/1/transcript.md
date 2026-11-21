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
| 1 | `POST /v1/accounts` | 201 | 541 | `qa-f44a8b67-d6c1-4742-8ca9-e72c61f9745b` |
| 2 | `POST /v1/auth/token` | 200 | 80 | `qa-8e11b66d-3881-4cef-90bf-0c000eed00fa` |
| 3 | `POST /v1/credits/purchases` | 201 | 84 | `qa-5026891f-a49b-4997-8af4-2671e4be0ef4` |
| 4 | `POST /v1/credits/purchases` | 409 | 45 | `qa-25389a3d-1f8e-434c-9c46-9beee5827c5f` |
| 5 | `GET /v1/credits/balance` | 200 | 9 | `qa-c67fe005-c6c1-454b-bf29-0c245b9894b4` |
| 6 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-cd7c52dc-c83b-42c9-9d03-adeaeed9eb50` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-e8ef4fef-6517-42b8-81e8-f8571d3d91dd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f44a8b67-d6c1-4742-8ca9-e72c61f9745b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f44a8b67-d6c1-4742-8ca9-e72c61f9745b
Content-Type: application/json

--- request body ---
{"handle":"qa-6ad3a10cc33b","displayName":"QA 6ad3a10cc33b","password":"****","region":"eu"}

--- response: 201 in 541 ms ---
Date: Mon, 16 Nov 2026 09:53:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f44a8b67-d6c1-4742-8ca9-e72c61f9745b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 11
Location: /v1/accounts/qa-6ad3a10cc33b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e77ea60-f7c7-439a-9a1b-2335577c584f","handle":"qa-6ad3a10cc33b","displayName":"QA 6ad3a10cc33b","region":"eu","role":"user","createdAt":"2026-11-16T09:53:59.734299993Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8e11b66d-3881-4cef-90bf-0c000eed00fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e11b66d-3881-4cef-90bf-0c000eed00fa
Content-Type: application/json

--- request body ---
{"handle":"qa-6ad3a10cc33b","password":"****"}

--- response: 200 in 80 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e11b66d-3881-4cef-90bf-0c000eed00fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e77ea60-f7c7-439a-9a1b-2335577c584f"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5026891f-a49b-4997-8af4-2671e4be0ef4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-35810b37b33241dab3068847ab438180
X-Correlation-Id: qa-5026891f-a49b-4997-8af4-2671e4be0ef4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 84 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5026891f-a49b-4997-8af4-2671e4be0ef4
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
Location: /v1/credits/purchases/pur_1f906bbc-9546-4ef8-b56d-cdb74e70954c
Content-Length: 144

{"id":"pur_1f906bbc-9546-4ef8-b56d-cdb74e70954c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-16T09:54:00.362076973Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-25389a3d-1f8e-434c-9c46-9beee5827c5f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-35810b37b33241dab3068847ab438180
X-Correlation-Id: qa-25389a3d-1f8e-434c-9c46-9beee5827c5f
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 45 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25389a3d-1f8e-434c-9c46-9beee5827c5f
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-25389a3d-1f8e-434c-9c46-9beee5827c5f"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-c67fe005-c6c1-454b-bf29-0c245b9894b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c67fe005-c6c1-454b-bf29-0c245b9894b4
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:54:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c67fe005-c6c1-454b-bf29-0c245b9894b4
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
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_9e77ea60-f7c7-439a-9a1b-2335577c584f"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd7c52dc-c83b-42c9-9d03-adeaeed9eb50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd7c52dc-c83b-42c9-9d03-adeaeed9eb50
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 16 Nov 2026 09:54:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd7c52dc-c83b-42c9-9d03-adeaeed9eb50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 9
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-e8ef4fef-6517-42b8-81e8-f8571d3d91dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8ef4fef-6517-42b8-81e8-f8571d3d91dd
Content-Type: application/json

--- request body ---
{"handle":"qa-6ad3a10cc33b","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 16 Nov 2026 09:54:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8ef4fef-6517-42b8-81e8-f8571d3d91dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e8ef4fef-6517-42b8-81e8-f8571d3d91dd"}
```
