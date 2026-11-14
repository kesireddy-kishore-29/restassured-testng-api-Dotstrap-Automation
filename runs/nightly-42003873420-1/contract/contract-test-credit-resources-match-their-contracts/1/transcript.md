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
| 1 | `POST /v1/accounts` | 201 | 391 | `qa-7eece91e-2c53-45d8-8af0-44eb472256f5` |
| 2 | `POST /v1/auth/token` | 200 | 62 | `qa-6555e02d-e66e-41ec-b227-129bfdef0a3a` |
| 3 | `GET /v1/credits/balance` | 200 | 44 | `qa-f5aea6d8-b59a-4830-9ebb-6c38ffa483d2` |
| 4 | `POST /v1/credits/purchases` | 201 | 38 | `qa-36451d28-9e6d-4afb-8d18-3d68af6858ee` |
| 5 | `GET /v1/credits/ledger` | 200 | 39 | `qa-309b5e1f-7906-46ec-9cd3-7e6fbf717b5b` |
| 6 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-93059ff0-6e4d-43be-b365-d864211218ed` |
| 7 | `POST /v1/auth/token` | 401 | 27 | `qa-725c4116-edbe-40c5-9328-9fc52f3c068f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7eece91e-2c53-45d8-8af0-44eb472256f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7eece91e-2c53-45d8-8af0-44eb472256f5
Content-Type: application/json

--- request body ---
{"handle":"qa-37897b08ec32","displayName":"QA 37897b08ec32","password":"****","region":"in"}

--- response: 201 in 391 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7eece91e-2c53-45d8-8af0-44eb472256f5
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
Location: /v1/accounts/qa-37897b08ec32
X-Served-Region: in
Content-Length: 181

{"id":"acc_e2a32667-8b0d-4805-910d-e23b730f1fbe","handle":"qa-37897b08ec32","displayName":"QA 37897b08ec32","region":"in","role":"user","createdAt":"2026-11-05T09:37:52.610317973Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6555e02d-e66e-41ec-b227-129bfdef0a3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6555e02d-e66e-41ec-b227-129bfdef0a3a
Content-Type: application/json

--- request body ---
{"handle":"qa-37897b08ec32","password":"****"}

--- response: 200 in 62 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-6555e02d-e66e-41ec-b227-129bfdef0a3a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e2a32667-8b0d-4805-910d-e23b730f1fbe"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-f5aea6d8-b59a-4830-9ebb-6c38ffa483d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5aea6d8-b59a-4830-9ebb-6c38ffa483d2
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5aea6d8-b59a-4830-9ebb-6c38ffa483d2
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

{"balance":5,"currency":"credits","accountId":"acc_e2a32667-8b0d-4805-910d-e23b730f1fbe"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-36451d28-9e6d-4afb-8d18-3d68af6858ee

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2bdfd3d7ecf941b5bfafab57be8aa457
X-Correlation-Id: qa-36451d28-9e6d-4afb-8d18-3d68af6858ee
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 38 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-36451d28-9e6d-4afb-8d18-3d68af6858ee
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
Location: /v1/credits/purchases/pur_8b68e020-cb6c-4ae2-b997-2e460503d442
Content-Length: 144

{"id":"pur_8b68e020-cb6c-4ae2-b997-2e460503d442","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-05T09:37:53.334008419Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-309b5e1f-7906-46ec-9cd3-7e6fbf717b5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-309b5e1f-7906-46ec-9cd3-7e6fbf717b5b
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-309b5e1f-7906-46ec-9cd3-7e6fbf717b5b
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

{"items":[{"id":"led_ded390da-d3a9-4177-a1dc-ba11bd9578c1","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-05T09:37:52.610336639Z"},{"id":"led_9e31b435-f7d2-4f8a-9811-a7d3d4c9f501","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_8b68e020-cb6c-4ae2-b997-2e460503d442","createdAt":"2026-11-05T09:37:53.334008419Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-93059ff0-6e4d-43be-b365-d864211218ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93059ff0-6e4d-43be-b365-d864211218ed
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-93059ff0-6e4d-43be-b365-d864211218ed
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
correlation: qa-725c4116-edbe-40c5-9328-9fc52f3c068f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-725c4116-edbe-40c5-9328-9fc52f3c068f
Content-Type: application/json

--- request body ---
{"handle":"qa-37897b08ec32","password":"****"}

--- response: 401 in 27 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-725c4116-edbe-40c5-9328-9fc52f3c068f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-725c4116-edbe-40c5-9328-9fc52f3c068f"}
```
