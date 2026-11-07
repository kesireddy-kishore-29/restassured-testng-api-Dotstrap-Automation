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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-b5c04212-d47c-4f9d-8a0f-6efd259c98c1` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-77724dd8-d837-4eea-93dd-0edc0e8e1644` |
| 3 | `POST /v1/credits/purchases` | 201 | 6 | `qa-09360cec-959b-4cb1-b917-4cc1869551a7` |
| 4 | `POST /v1/credits/purchases` | 409 | 9 | `qa-8e7dbe51-4bf2-42eb-bfc9-99635c6f8220` |
| 5 | `GET /v1/credits/balance` | 200 | 13 | `qa-2eebf8ad-e61d-4060-95d5-784ab4fd7a88` |
| 6 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-28714184-b92e-4e28-9f07-26a78dc2b5e0` |
| 7 | `POST /v1/auth/token` | 401 | 9 | `qa-411629b7-34eb-46b5-8e6a-d43924d99cb5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b5c04212-d47c-4f9d-8a0f-6efd259c98c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5c04212-d47c-4f9d-8a0f-6efd259c98c1
Content-Type: application/json

--- request body ---
{"handle":"qa-a4c340cb9b35","displayName":"QA a4c340cb9b35","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5c04212-d47c-4f9d-8a0f-6efd259c98c1
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
Location: /v1/accounts/qa-a4c340cb9b35
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a321a941-2ca1-4d6f-b073-08ebbf4baa09","handle":"qa-a4c340cb9b35","displayName":"QA a4c340cb9b35","region":"eu","role":"user","createdAt":"2026-11-01T09:23:30.591435536Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-77724dd8-d837-4eea-93dd-0edc0e8e1644

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77724dd8-d837-4eea-93dd-0edc0e8e1644
Content-Type: application/json

--- request body ---
{"handle":"qa-a4c340cb9b35","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-77724dd8-d837-4eea-93dd-0edc0e8e1644
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a321a941-2ca1-4d6f-b073-08ebbf4baa09"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-09360cec-959b-4cb1-b917-4cc1869551a7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4848639300824f9683f7d9fc4dad41bf
X-Correlation-Id: qa-09360cec-959b-4cb1-b917-4cc1869551a7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-09360cec-959b-4cb1-b917-4cc1869551a7
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
Location: /v1/credits/purchases/pur_1aeeed83-5b3f-4aec-8ef7-662f5862da81
Content-Length: 144

{"id":"pur_1aeeed83-5b3f-4aec-8ef7-662f5862da81","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-01T09:23:30.622015197Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8e7dbe51-4bf2-42eb-bfc9-99635c6f8220

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4848639300824f9683f7d9fc4dad41bf
X-Correlation-Id: qa-8e7dbe51-4bf2-42eb-bfc9-99635c6f8220
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e7dbe51-4bf2-42eb-bfc9-99635c6f8220
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-8e7dbe51-4bf2-42eb-bfc9-99635c6f8220"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-2eebf8ad-e61d-4060-95d5-784ab4fd7a88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2eebf8ad-e61d-4060-95d5-784ab4fd7a88
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2eebf8ad-e61d-4060-95d5-784ab4fd7a88
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

{"balance":15,"currency":"credits","accountId":"acc_a321a941-2ca1-4d6f-b073-08ebbf4baa09"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-28714184-b92e-4e28-9f07-26a78dc2b5e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28714184-b92e-4e28-9f07-26a78dc2b5e0
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-28714184-b92e-4e28-9f07-26a78dc2b5e0
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
correlation: qa-411629b7-34eb-46b5-8e6a-d43924d99cb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-411629b7-34eb-46b5-8e6a-d43924d99cb5
Content-Type: application/json

--- request body ---
{"handle":"qa-a4c340cb9b35","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-411629b7-34eb-46b5-8e6a-d43924d99cb5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-411629b7-34eb-46b5-8e6a-d43924d99cb5"}
```
