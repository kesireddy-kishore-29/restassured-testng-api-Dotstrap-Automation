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
| 1 | `POST /v1/accounts` | 201 | 421 | `qa-2361d53d-7468-4038-9d4c-e5ead2830e69` |
| 2 | `POST /v1/auth/token` | 200 | 81 | `qa-1cefde46-2c0a-4ffe-9329-e7b653e8427e` |
| 3 | `GET /v1/credits/balance` | 200 | 60 | `qa-5fcbb00a-eeb6-4d9a-8dea-a9bc2931f8ed` |
| 4 | `POST /v1/credits/purchases` | 201 | 42 | `qa-8fc8325f-42dd-4b36-a327-280bbc005b3a` |
| 5 | `GET /v1/credits/ledger` | 200 | 44 | `qa-24cf9461-3056-4dfa-a488-62de75f99f91` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-e80a0cbe-3372-424c-8b0c-9f20e1ec624d` |
| 7 | `POST /v1/auth/token` | 401 | 29 | `qa-79063dcd-8615-4add-b4ee-e9752eeb08f2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2361d53d-7468-4038-9d4c-e5ead2830e69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2361d53d-7468-4038-9d4c-e5ead2830e69
Content-Type: application/json

--- request body ---
{"handle":"qa-dcc07b99c817","displayName":"QA dcc07b99c817","password":"****","region":"in"}

--- response: 201 in 421 ms ---
Date: Sun, 25 Oct 2026 07:40:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-2361d53d-7468-4038-9d4c-e5ead2830e69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-dcc07b99c817
X-Served-Region: in
Content-Length: 181

{"id":"acc_b507d79b-67a9-4715-9b1a-f68897aa0937","handle":"qa-dcc07b99c817","displayName":"QA dcc07b99c817","region":"in","role":"user","createdAt":"2026-10-25T07:40:22.955409500Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1cefde46-2c0a-4ffe-9329-e7b653e8427e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cefde46-2c0a-4ffe-9329-e7b653e8427e
Content-Type: application/json

--- request body ---
{"handle":"qa-dcc07b99c817","password":"****"}

--- response: 200 in 81 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cefde46-2c0a-4ffe-9329-e7b653e8427e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b507d79b-67a9-4715-9b1a-f68897aa0937"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-5fcbb00a-eeb6-4d9a-8dea-a9bc2931f8ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fcbb00a-eeb6-4d9a-8dea-a9bc2931f8ed
Content-Type: application/json

--- response: 200 in 60 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fcbb00a-eeb6-4d9a-8dea-a9bc2931f8ed
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

{"balance":5,"currency":"credits","accountId":"acc_b507d79b-67a9-4715-9b1a-f68897aa0937"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8fc8325f-42dd-4b36-a327-280bbc005b3a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e2e20c9705ad4509866533e5cde89b5b
X-Correlation-Id: qa-8fc8325f-42dd-4b36-a327-280bbc005b3a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 42 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fc8325f-42dd-4b36-a327-280bbc005b3a
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
Location: /v1/credits/purchases/pur_d14799ec-0d4a-472d-b50b-c83a49318a8b
Content-Length: 144

{"id":"pur_d14799ec-0d4a-472d-b50b-c83a49318a8b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-25T07:40:23.638522915Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-24cf9461-3056-4dfa-a488-62de75f99f91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24cf9461-3056-4dfa-a488-62de75f99f91
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-24cf9461-3056-4dfa-a488-62de75f99f91
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

{"items":[{"id":"led_648fa875-956d-419b-8b5d-1039f4646cee","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-25T07:40:22.955718814Z"},{"id":"led_c6b42f99-ae3e-47b9-833d-c6eb0e4c2472","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_d14799ec-0d4a-472d-b50b-c83a49318a8b","createdAt":"2026-10-25T07:40:23.638522915Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e80a0cbe-3372-424c-8b0c-9f20e1ec624d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e80a0cbe-3372-424c-8b0c-9f20e1ec624d
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e80a0cbe-3372-424c-8b0c-9f20e1ec624d
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
correlation: qa-79063dcd-8615-4add-b4ee-e9752eeb08f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79063dcd-8615-4add-b4ee-e9752eeb08f2
Content-Type: application/json

--- request body ---
{"handle":"qa-dcc07b99c817","password":"****"}

--- response: 401 in 29 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-79063dcd-8615-4add-b4ee-e9752eeb08f2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-79063dcd-8615-4add-b4ee-e9752eeb08f2"}
```
