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
| 1 | `POST /v1/accounts` | 201 | 280 | `qa-e7a3af2c-741c-46d3-aa06-71037e8852e4` |
| 2 | `POST /v1/auth/token` | 200 | 50 | `qa-1d29ecc6-cf98-4adb-9d76-4eb1380b5bbf` |
| 3 | `GET /v1/credits/balance` | 200 | 49 | `qa-316e38eb-5441-4463-b121-c58e1fddb13d` |
| 4 | `POST /v1/credits/purchases` | 201 | 26 | `qa-498bce6f-fdd0-409f-a9b4-bf98c5f27eba` |
| 5 | `GET /v1/credits/ledger` | 200 | 24 | `qa-a0c4cfac-f96e-461e-8b69-72da909e1d1a` |
| 6 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-4364cdbe-ce43-47a1-ab62-641c57b95715` |
| 7 | `POST /v1/auth/token` | 401 | 26 | `qa-275628b4-94d5-4dd5-a62a-15cfc5f53579` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e7a3af2c-741c-46d3-aa06-71037e8852e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7a3af2c-741c-46d3-aa06-71037e8852e4
Content-Type: application/json

--- request body ---
{"handle":"qa-f98116771a5e","displayName":"QA f98116771a5e","password":"****","region":"in"}

--- response: 201 in 280 ms ---
Date: Wed, 18 Nov 2026 10:19:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7a3af2c-741c-46d3-aa06-71037e8852e4
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
Location: /v1/accounts/qa-f98116771a5e
X-Served-Region: in
Content-Length: 181

{"id":"acc_9ba1a3fd-d078-421d-bccf-531655a5630a","handle":"qa-f98116771a5e","displayName":"QA f98116771a5e","region":"in","role":"user","createdAt":"2026-11-18T10:19:49.631963785Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1d29ecc6-cf98-4adb-9d76-4eb1380b5bbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d29ecc6-cf98-4adb-9d76-4eb1380b5bbf
Content-Type: application/json

--- request body ---
{"handle":"qa-f98116771a5e","password":"****"}

--- response: 200 in 50 ms ---
Date: Wed, 18 Nov 2026 10:19:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d29ecc6-cf98-4adb-9d76-4eb1380b5bbf
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9ba1a3fd-d078-421d-bccf-531655a5630a"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-316e38eb-5441-4463-b121-c58e1fddb13d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-316e38eb-5441-4463-b121-c58e1fddb13d
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-316e38eb-5441-4463-b121-c58e1fddb13d
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

{"balance":5,"currency":"credits","accountId":"acc_9ba1a3fd-d078-421d-bccf-531655a5630a"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-498bce6f-fdd0-409f-a9b4-bf98c5f27eba

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ccb20b047dae420799bb2082c1915794
X-Correlation-Id: qa-498bce6f-fdd0-409f-a9b4-bf98c5f27eba
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-498bce6f-fdd0-409f-a9b4-bf98c5f27eba
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
Location: /v1/credits/purchases/pur_02b4df67-343b-4546-be72-28069ef13108
Content-Length: 144

{"id":"pur_02b4df67-343b-4546-be72-28069ef13108","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-18T10:19:50.158787003Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-a0c4cfac-f96e-461e-8b69-72da909e1d1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0c4cfac-f96e-461e-8b69-72da909e1d1a
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0c4cfac-f96e-461e-8b69-72da909e1d1a
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

{"items":[{"id":"led_332da803-6478-419c-99be-db2ff310a229","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-18T10:19:49.631972809Z"},{"id":"led_74080d5c-2ded-4ac0-b352-a1161f17fa29","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_02b4df67-343b-4546-be72-28069ef13108","createdAt":"2026-11-18T10:19:50.158787003Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4364cdbe-ce43-47a1-ab62-641c57b95715

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4364cdbe-ce43-47a1-ab62-641c57b95715
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4364cdbe-ce43-47a1-ab62-641c57b95715
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
correlation: qa-275628b4-94d5-4dd5-a62a-15cfc5f53579

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-275628b4-94d5-4dd5-a62a-15cfc5f53579
Content-Type: application/json

--- request body ---
{"handle":"qa-f98116771a5e","password":"****"}

--- response: 401 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-275628b4-94d5-4dd5-a62a-15cfc5f53579
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-275628b4-94d5-4dd5-a62a-15cfc5f53579"}
```
