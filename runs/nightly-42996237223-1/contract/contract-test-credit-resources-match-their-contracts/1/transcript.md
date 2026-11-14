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
| 1 | `POST /v1/accounts` | 201 | 432 | `qa-e5285a21-1da0-424a-a074-5e734a3559e8` |
| 2 | `POST /v1/auth/token` | 200 | 51 | `qa-a377b57a-7f1f-41e1-a6ec-1b4439b6a2b1` |
| 3 | `GET /v1/credits/balance` | 200 | 66 | `qa-9d8d49a0-b9b4-4792-93aa-8d67252ddd28` |
| 4 | `POST /v1/credits/purchases` | 201 | 38 | `qa-41178289-492f-4a92-b272-cdaac2eba4e7` |
| 5 | `GET /v1/credits/ledger` | 200 | 25 | `qa-b9a8bea9-5ca1-40c9-967e-b03904a3e535` |
| 6 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-dd98ff2d-00ef-41dd-b586-60d73585cbfd` |
| 7 | `POST /v1/auth/token` | 401 | 52 | `qa-3cbef3fe-ab72-4bf7-886e-9bfde6e785fc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e5285a21-1da0-424a-a074-5e734a3559e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5285a21-1da0-424a-a074-5e734a3559e8
Content-Type: application/json

--- request body ---
{"handle":"qa-21fe1610def0","displayName":"QA 21fe1610def0","password":"****","region":"in"}

--- response: 201 in 432 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5285a21-1da0-424a-a074-5e734a3559e8
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
Location: /v1/accounts/qa-21fe1610def0
X-Served-Region: in
Content-Length: 181

{"id":"acc_e8458e6d-3789-4dc3-b667-e7f205665cde","handle":"qa-21fe1610def0","displayName":"QA 21fe1610def0","region":"in","role":"user","createdAt":"2026-11-11T09:34:34.941451556Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a377b57a-7f1f-41e1-a6ec-1b4439b6a2b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a377b57a-7f1f-41e1-a6ec-1b4439b6a2b1
Content-Type: application/json

--- request body ---
{"handle":"qa-21fe1610def0","password":"****"}

--- response: 200 in 51 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a377b57a-7f1f-41e1-a6ec-1b4439b6a2b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e8458e6d-3789-4dc3-b667-e7f205665cde"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-9d8d49a0-b9b4-4792-93aa-8d67252ddd28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d8d49a0-b9b4-4792-93aa-8d67252ddd28
Content-Type: application/json

--- response: 200 in 66 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d8d49a0-b9b4-4792-93aa-8d67252ddd28
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

{"balance":5,"currency":"credits","accountId":"acc_e8458e6d-3789-4dc3-b667-e7f205665cde"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-41178289-492f-4a92-b272-cdaac2eba4e7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ca79918021bf43559082a5cdee4d4bfa
X-Correlation-Id: qa-41178289-492f-4a92-b272-cdaac2eba4e7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 38 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-41178289-492f-4a92-b272-cdaac2eba4e7
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
Location: /v1/credits/purchases/pur_d7b087f4-c703-4a7a-accf-4a76f8e69997
Content-Length: 144

{"id":"pur_d7b087f4-c703-4a7a-accf-4a76f8e69997","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-11T09:34:35.588441818Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b9a8bea9-5ca1-40c9-967e-b03904a3e535

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9a8bea9-5ca1-40c9-967e-b03904a3e535
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9a8bea9-5ca1-40c9-967e-b03904a3e535
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

{"items":[{"id":"led_93f4d413-1f71-4030-a3fe-de370e1d2d5e","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-11T09:34:34.941463048Z"},{"id":"led_c0a94c50-63d3-40a5-930d-dc884187bc4b","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_d7b087f4-c703-4a7a-accf-4a76f8e69997","createdAt":"2026-11-11T09:34:35.588441818Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dd98ff2d-00ef-41dd-b586-60d73585cbfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd98ff2d-00ef-41dd-b586-60d73585cbfd
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dd98ff2d-00ef-41dd-b586-60d73585cbfd
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
correlation: qa-3cbef3fe-ab72-4bf7-886e-9bfde6e785fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cbef3fe-ab72-4bf7-886e-9bfde6e785fc
Content-Type: application/json

--- request body ---
{"handle":"qa-21fe1610def0","password":"****"}

--- response: 401 in 52 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3cbef3fe-ab72-4bf7-886e-9bfde6e785fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3cbef3fe-ab72-4bf7-886e-9bfde6e785fc"}
```
