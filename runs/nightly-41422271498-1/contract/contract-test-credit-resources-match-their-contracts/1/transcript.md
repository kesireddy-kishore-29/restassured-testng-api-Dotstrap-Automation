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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-b4bbeca3-d2a4-4ab8-8c7f-2a5c2752bf26` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-baa3949f-7ee4-402a-96ca-0a8807ff9f79` |
| 3 | `GET /v1/credits/balance` | 200 | 2 | `qa-0c4a0442-5597-4840-b415-4fe9027316c9` |
| 4 | `POST /v1/credits/purchases` | 201 | 15 | `qa-0e47a124-8d34-40f6-808e-45a157e4fda7` |
| 5 | `GET /v1/credits/ledger` | 200 | 8 | `qa-41c3bf9a-ebe0-48af-8ed9-4e6f63eb8114` |
| 6 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-e8e1a3f8-4467-4ee4-a4e9-41489e521b39` |
| 7 | `POST /v1/auth/token` | 401 | 10 | `qa-1fbb697e-09cd-4416-9ecd-c3878c9c68ee` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b4bbeca3-d2a4-4ab8-8c7f-2a5c2752bf26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4bbeca3-d2a4-4ab8-8c7f-2a5c2752bf26
Content-Type: application/json

--- request body ---
{"handle":"qa-86f9abc90ea9","displayName":"QA 86f9abc90ea9","password":"****","region":"in"}

--- response: 201 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4bbeca3-d2a4-4ab8-8c7f-2a5c2752bf26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 7
Location: /v1/accounts/qa-86f9abc90ea9
X-Served-Region: in
Content-Length: 181

{"id":"acc_a62b0655-570f-4022-b442-8673d32e8f0c","handle":"qa-86f9abc90ea9","displayName":"QA 86f9abc90ea9","region":"in","role":"user","createdAt":"2026-11-02T09:38:38.204444498Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-baa3949f-7ee4-402a-96ca-0a8807ff9f79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baa3949f-7ee4-402a-96ca-0a8807ff9f79
Content-Type: application/json

--- request body ---
{"handle":"qa-86f9abc90ea9","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-baa3949f-7ee4-402a-96ca-0a8807ff9f79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a62b0655-570f-4022-b442-8673d32e8f0c"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-0c4a0442-5597-4840-b415-4fe9027316c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c4a0442-5597-4840-b415-4fe9027316c9
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c4a0442-5597-4840-b415-4fe9027316c9
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

{"balance":5,"currency":"credits","accountId":"acc_a62b0655-570f-4022-b442-8673d32e8f0c"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0e47a124-8d34-40f6-808e-45a157e4fda7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4d1a0bfeccba4b1381651ee8f3f4de9c
X-Correlation-Id: qa-0e47a124-8d34-40f6-808e-45a157e4fda7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e47a124-8d34-40f6-808e-45a157e4fda7
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
Location: /v1/credits/purchases/pur_dada6502-f28f-4910-8701-f6e695976494
Content-Length: 144

{"id":"pur_dada6502-f28f-4910-8701-f6e695976494","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-02T09:38:38.246317393Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-41c3bf9a-ebe0-48af-8ed9-4e6f63eb8114

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41c3bf9a-ebe0-48af-8ed9-4e6f63eb8114
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-41c3bf9a-ebe0-48af-8ed9-4e6f63eb8114
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

{"items":[{"id":"led_7e5993cd-8f18-46df-b910-792621fd9c59","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-02T09:38:38.204453001Z"},{"id":"led_081f3bcf-f708-440f-8cca-a1dbf0c97946","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_dada6502-f28f-4910-8701-f6e695976494","createdAt":"2026-11-02T09:38:38.246317393Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e8e1a3f8-4467-4ee4-a4e9-41489e521b39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8e1a3f8-4467-4ee4-a4e9-41489e521b39
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e8e1a3f8-4467-4ee4-a4e9-41489e521b39
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
correlation: qa-1fbb697e-09cd-4416-9ecd-c3878c9c68ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fbb697e-09cd-4416-9ecd-c3878c9c68ee
Content-Type: application/json

--- request body ---
{"handle":"qa-86f9abc90ea9","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1fbb697e-09cd-4416-9ecd-c3878c9c68ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1fbb697e-09cd-4416-9ecd-c3878c9c68ee"}
```
