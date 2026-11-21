# Transcript: Balance, ledger and purchase match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#creditResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 495 | `qa-fa37dae3-4ebe-4412-92ec-933add481194` |
| 2 | `POST /v1/auth/token` | 200 | 62 | `qa-77397198-0cd4-4674-9794-85e912557023` |
| 3 | `GET /v1/credits/balance` | 200 | 43 | `qa-e9d85a01-c9e2-4aea-95fd-352c27e743d3` |
| 4 | `POST /v1/credits/purchases` | 201 | 38 | `qa-7e7a7192-1547-4f05-9413-ce0dca616e81` |
| 5 | `GET /v1/credits/ledger` | 200 | 34 | `qa-760703e9-e1ff-4948-82d3-2cecf7a897ad` |
| 6 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-01988660-b365-42b5-9715-43728bcf665c` |
| 7 | `POST /v1/auth/token` | 401 | 37 | `qa-d0dbb8b9-940c-4b82-83a6-271f69c91333` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fa37dae3-4ebe-4412-92ec-933add481194

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa37dae3-4ebe-4412-92ec-933add481194
Content-Type: application/json

--- request body ---
{"handle":"qa-418191196eeb","displayName":"QA 418191196eeb","password":"****","region":"in"}

--- response: 201 in 495 ms ---
Date: Thu, 19 Nov 2026 10:29:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa37dae3-4ebe-4412-92ec-933add481194
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
Location: /v1/accounts/qa-418191196eeb
X-Served-Region: in
Content-Length: 181

{"id":"acc_e921fbd9-28a3-4add-a4cb-07b9a7f500c0","handle":"qa-418191196eeb","displayName":"QA 418191196eeb","region":"in","role":"user","createdAt":"2026-11-19T10:29:22.312176538Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-77397198-0cd4-4674-9794-85e912557023

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77397198-0cd4-4674-9794-85e912557023
Content-Type: application/json

--- request body ---
{"handle":"qa-418191196eeb","password":"****"}

--- response: 200 in 62 ms ---
Date: Thu, 19 Nov 2026 10:29:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-77397198-0cd4-4674-9794-85e912557023
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e921fbd9-28a3-4add-a4cb-07b9a7f500c0"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-e9d85a01-c9e2-4aea-95fd-352c27e743d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9d85a01-c9e2-4aea-95fd-352c27e743d3
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Thu, 19 Nov 2026 10:29:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9d85a01-c9e2-4aea-95fd-352c27e743d3
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
X-Served-Region: in
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_e921fbd9-28a3-4add-a4cb-07b9a7f500c0"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7e7a7192-1547-4f05-9413-ce0dca616e81

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b2ff5398cd384677993c8b68be51612c
X-Correlation-Id: qa-7e7a7192-1547-4f05-9413-ce0dca616e81
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 38 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e7a7192-1547-4f05-9413-ce0dca616e81
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
X-Served-Region: in
Location: /v1/credits/purchases/pur_2260f54a-a92b-4762-aead-2873ab1bdb42
Content-Length: 144

{"id":"pur_2260f54a-a92b-4762-aead-2873ab1bdb42","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-19T10:29:23.062127666Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-760703e9-e1ff-4948-82d3-2cecf7a897ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-760703e9-e1ff-4948-82d3-2cecf7a897ad
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-760703e9-e1ff-4948-82d3-2cecf7a897ad
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
X-Served-Region: in
Content-Length: 398

{"items":[{"id":"led_b4be3a09-a70a-433c-ab89-43b66ba82a91","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-19T10:29:22.312535562Z"},{"id":"led_f550bb83-ed4c-498f-a328-d5d5a019e938","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_2260f54a-a92b-4762-aead-2873ab1bdb42","createdAt":"2026-11-19T10:29:23.062127666Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-01988660-b365-42b5-9715-43728bcf665c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01988660-b365-42b5-9715-43728bcf665c
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-01988660-b365-42b5-9715-43728bcf665c
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
X-Served-Region: in
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-d0dbb8b9-940c-4b82-83a6-271f69c91333

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0dbb8b9-940c-4b82-83a6-271f69c91333
Content-Type: application/json

--- request body ---
{"handle":"qa-418191196eeb","password":"****"}

--- response: 401 in 37 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0dbb8b9-940c-4b82-83a6-271f69c91333
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d0dbb8b9-940c-4b82-83a6-271f69c91333"}
```
