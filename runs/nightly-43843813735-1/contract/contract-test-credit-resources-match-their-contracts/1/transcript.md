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
| 1 | `POST /v1/accounts` | 201 | 302 | `qa-57b0933b-7896-44a9-9939-1c6375ec31ed` |
| 2 | `POST /v1/auth/token` | 200 | 56 | `qa-b27c2aef-83ea-440a-b5b8-235d116e0772` |
| 3 | `GET /v1/credits/balance` | 200 | 39 | `qa-27dc64ba-bd2a-4554-99dc-d08aa0252f4e` |
| 4 | `POST /v1/credits/purchases` | 201 | 36 | `qa-04d30c04-35d6-49c2-939f-7896d57fe19f` |
| 5 | `GET /v1/credits/ledger` | 200 | 38 | `qa-08b3e20b-1c1d-41ba-853a-917589cd4c19` |
| 6 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-605979e4-c93d-4c4a-b7ad-a7b997788b4e` |
| 7 | `POST /v1/auth/token` | 401 | 8 | `qa-64192817-0eac-405e-9a2d-6a079aed87a2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-57b0933b-7896-44a9-9939-1c6375ec31ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57b0933b-7896-44a9-9939-1c6375ec31ed
Content-Type: application/json

--- request body ---
{"handle":"qa-ed5db744f59f","displayName":"QA ed5db744f59f","password":"****","region":"in"}

--- response: 201 in 302 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-57b0933b-7896-44a9-9939-1c6375ec31ed
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
Location: /v1/accounts/qa-ed5db744f59f
X-Served-Region: in
Content-Length: 181

{"id":"acc_7b1b9360-7ea6-4328-8143-91062de034ce","handle":"qa-ed5db744f59f","displayName":"QA ed5db744f59f","region":"in","role":"user","createdAt":"2026-11-16T09:53:51.041341868Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b27c2aef-83ea-440a-b5b8-235d116e0772

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b27c2aef-83ea-440a-b5b8-235d116e0772
Content-Type: application/json

--- request body ---
{"handle":"qa-ed5db744f59f","password":"****"}

--- response: 200 in 56 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b27c2aef-83ea-440a-b5b8-235d116e0772
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7b1b9360-7ea6-4328-8143-91062de034ce"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-27dc64ba-bd2a-4554-99dc-d08aa0252f4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27dc64ba-bd2a-4554-99dc-d08aa0252f4e
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-27dc64ba-bd2a-4554-99dc-d08aa0252f4e
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

{"balance":5,"currency":"credits","accountId":"acc_7b1b9360-7ea6-4328-8143-91062de034ce"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-04d30c04-35d6-49c2-939f-7896d57fe19f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-209ae21ccab843f68ae4e2d36038aa3f
X-Correlation-Id: qa-04d30c04-35d6-49c2-939f-7896d57fe19f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 36 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-04d30c04-35d6-49c2-939f-7896d57fe19f
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
Location: /v1/credits/purchases/pur_0c392cdb-c205-4e18-bba7-1af5dfe65118
Content-Length: 144

{"id":"pur_0c392cdb-c205-4e18-bba7-1af5dfe65118","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-16T09:53:51.576507600Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-08b3e20b-1c1d-41ba-853a-917589cd4c19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08b3e20b-1c1d-41ba-853a-917589cd4c19
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-08b3e20b-1c1d-41ba-853a-917589cd4c19
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

{"items":[{"id":"led_2e120a81-25a6-487c-84f5-811c13e052cf","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-16T09:53:51.041645242Z"},{"id":"led_e6a0b673-1bfa-480f-9166-f91bcc0430f3","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_0c392cdb-c205-4e18-bba7-1af5dfe65118","createdAt":"2026-11-16T09:53:51.576507600Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-605979e4-c93d-4c4a-b7ad-a7b997788b4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-605979e4-c93d-4c4a-b7ad-a7b997788b4e
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-605979e4-c93d-4c4a-b7ad-a7b997788b4e
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
correlation: qa-64192817-0eac-405e-9a2d-6a079aed87a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64192817-0eac-405e-9a2d-6a079aed87a2
Content-Type: application/json

--- request body ---
{"handle":"qa-ed5db744f59f","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64192817-0eac-405e-9a2d-6a079aed87a2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-64192817-0eac-405e-9a2d-6a079aed87a2"}
```
