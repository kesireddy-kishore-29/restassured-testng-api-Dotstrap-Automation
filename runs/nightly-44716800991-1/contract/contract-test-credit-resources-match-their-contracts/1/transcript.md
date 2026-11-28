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
| 1 | `POST /v1/accounts` | 201 | 478 | `qa-eaa3fcfc-d1fe-422c-8bd3-5ea737ef9650` |
| 2 | `POST /v1/auth/token` | 200 | 51 | `qa-5bd93185-5480-4f0f-b766-0d1b93fdecdc` |
| 3 | `GET /v1/credits/balance` | 200 | 34 | `qa-6d9f5a69-bc6c-4762-9174-f254fc18e8b0` |
| 4 | `POST /v1/credits/purchases` | 201 | 30 | `qa-47f59251-c7f4-48a6-9ca9-1b7083ef3d4f` |
| 5 | `GET /v1/credits/ledger` | 200 | 34 | `qa-6534cf2f-0d8d-4480-916a-12b9171a49e8` |
| 6 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-d451e89e-6d38-4423-8067-1ad25bcbdf37` |
| 7 | `POST /v1/auth/token` | 401 | 34 | `qa-59686e96-08e5-4545-8113-ac72b51f6f80` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eaa3fcfc-d1fe-422c-8bd3-5ea737ef9650

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaa3fcfc-d1fe-422c-8bd3-5ea737ef9650
Content-Type: application/json

--- request body ---
{"handle":"qa-50c32da96fa3","displayName":"QA 50c32da96fa3","password":"****","region":"in"}

--- response: 201 in 478 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaa3fcfc-d1fe-422c-8bd3-5ea737ef9650
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
Location: /v1/accounts/qa-50c32da96fa3
X-Served-Region: in
Content-Length: 181

{"id":"acc_625d3b8b-296f-4e36-878b-20e1471bf6dc","handle":"qa-50c32da96fa3","displayName":"QA 50c32da96fa3","region":"in","role":"user","createdAt":"2026-11-20T10:09:59.310139070Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5bd93185-5480-4f0f-b766-0d1b93fdecdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bd93185-5480-4f0f-b766-0d1b93fdecdc
Content-Type: application/json

--- request body ---
{"handle":"qa-50c32da96fa3","password":"****"}

--- response: 200 in 51 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bd93185-5480-4f0f-b766-0d1b93fdecdc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_625d3b8b-296f-4e36-878b-20e1471bf6dc"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-6d9f5a69-bc6c-4762-9174-f254fc18e8b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d9f5a69-bc6c-4762-9174-f254fc18e8b0
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d9f5a69-bc6c-4762-9174-f254fc18e8b0
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

{"balance":5,"currency":"credits","accountId":"acc_625d3b8b-296f-4e36-878b-20e1471bf6dc"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-47f59251-c7f4-48a6-9ca9-1b7083ef3d4f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-44ef0b6fbc1e42b4a943c7812defce11
X-Correlation-Id: qa-47f59251-c7f4-48a6-9ca9-1b7083ef3d4f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 30 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-47f59251-c7f4-48a6-9ca9-1b7083ef3d4f
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
Location: /v1/credits/purchases/pur_c29d0b31-dac8-4698-861b-1833bb84a5c9
Content-Length: 144

{"id":"pur_c29d0b31-dac8-4698-861b-1833bb84a5c9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-20T10:09:59.911546576Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-6534cf2f-0d8d-4480-916a-12b9171a49e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6534cf2f-0d8d-4480-916a-12b9171a49e8
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6534cf2f-0d8d-4480-916a-12b9171a49e8
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

{"items":[{"id":"led_1b2b2377-beba-4b53-ba6f-5c1c74207057","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-20T10:09:59.317417463Z"},{"id":"led_c355bbdd-8834-42ae-b722-5e645a751d01","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_c29d0b31-dac8-4698-861b-1833bb84a5c9","createdAt":"2026-11-20T10:09:59.911546576Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d451e89e-6d38-4423-8067-1ad25bcbdf37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d451e89e-6d38-4423-8067-1ad25bcbdf37
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d451e89e-6d38-4423-8067-1ad25bcbdf37
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
correlation: qa-59686e96-08e5-4545-8113-ac72b51f6f80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59686e96-08e5-4545-8113-ac72b51f6f80
Content-Type: application/json

--- request body ---
{"handle":"qa-50c32da96fa3","password":"****"}

--- response: 401 in 34 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59686e96-08e5-4545-8113-ac72b51f6f80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-59686e96-08e5-4545-8113-ac72b51f6f80"}
```
