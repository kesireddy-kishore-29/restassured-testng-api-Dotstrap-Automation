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
| 1 | `POST /v1/accounts` | 201 | 341 | `qa-4fad9f6e-48bb-441c-a63e-7605c2f46e22` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-80dd5d9a-c7d5-4ab6-9efb-d243f6c65b93` |
| 3 | `GET /v1/credits/balance` | 200 | 47 | `qa-dce20787-5217-4878-b11c-c95a0867a7b3` |
| 4 | `POST /v1/credits/purchases` | 201 | 44 | `qa-32914b67-a0f3-4093-baa8-aa653657d703` |
| 5 | `GET /v1/credits/ledger` | 200 | 29 | `qa-080fc927-d1e8-4784-8e32-115f355007cd` |
| 6 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-066eb2b0-a0d5-48c4-93e6-a570bed528f2` |
| 7 | `POST /v1/auth/token` | 401 | 14 | `qa-4aba0684-a153-4b4e-adf7-e8ff273a4e3d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4fad9f6e-48bb-441c-a63e-7605c2f46e22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fad9f6e-48bb-441c-a63e-7605c2f46e22
Content-Type: application/json

--- request body ---
{"handle":"qa-728ca99e9144","displayName":"QA 728ca99e9144","password":"****","region":"in"}

--- response: 201 in 341 ms ---
Date: Mon, 23 Nov 2026 10:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fad9f6e-48bb-441c-a63e-7605c2f46e22
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
Location: /v1/accounts/qa-728ca99e9144
X-Served-Region: in
Content-Length: 181

{"id":"acc_c7dad060-8fa2-4cba-8adf-e3f464e3bbb5","handle":"qa-728ca99e9144","displayName":"QA 728ca99e9144","region":"in","role":"user","createdAt":"2026-11-23T10:54:56.902417519Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-80dd5d9a-c7d5-4ab6-9efb-d243f6c65b93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80dd5d9a-c7d5-4ab6-9efb-d243f6c65b93
Content-Type: application/json

--- request body ---
{"handle":"qa-728ca99e9144","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-80dd5d9a-c7d5-4ab6-9efb-d243f6c65b93
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c7dad060-8fa2-4cba-8adf-e3f464e3bbb5"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-dce20787-5217-4878-b11c-c95a0867a7b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dce20787-5217-4878-b11c-c95a0867a7b3
Content-Type: application/json

--- response: 200 in 47 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-dce20787-5217-4878-b11c-c95a0867a7b3
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

{"balance":5,"currency":"credits","accountId":"acc_c7dad060-8fa2-4cba-8adf-e3f464e3bbb5"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-32914b67-a0f3-4093-baa8-aa653657d703

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2dbf916a485e4057aff30d192695ce91
X-Correlation-Id: qa-32914b67-a0f3-4093-baa8-aa653657d703
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 44 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-32914b67-a0f3-4093-baa8-aa653657d703
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
Location: /v1/credits/purchases/pur_0948ff92-561f-444c-a501-068e5b4417b6
Content-Length: 144

{"id":"pur_0948ff92-561f-444c-a501-068e5b4417b6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-23T10:54:57.330621478Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-080fc927-d1e8-4784-8e32-115f355007cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-080fc927-d1e8-4784-8e32-115f355007cd
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-080fc927-d1e8-4784-8e32-115f355007cd
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

{"items":[{"id":"led_ff208789-b40d-46e6-954e-631e36b4f3f6","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-23T10:54:56.902452712Z"},{"id":"led_0fc683de-9010-4191-a308-765e4d167319","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_0948ff92-561f-444c-a501-068e5b4417b6","createdAt":"2026-11-23T10:54:57.330621478Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-066eb2b0-a0d5-48c4-93e6-a570bed528f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-066eb2b0-a0d5-48c4-93e6-a570bed528f2
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-066eb2b0-a0d5-48c4-93e6-a570bed528f2
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
correlation: qa-4aba0684-a153-4b4e-adf7-e8ff273a4e3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aba0684-a153-4b4e-adf7-e8ff273a4e3d
Content-Type: application/json

--- request body ---
{"handle":"qa-728ca99e9144","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4aba0684-a153-4b4e-adf7-e8ff273a4e3d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4aba0684-a153-4b4e-adf7-e8ff273a4e3d"}
```
