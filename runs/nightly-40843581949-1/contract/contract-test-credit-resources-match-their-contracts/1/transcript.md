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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-55ded6f6-2cdf-417f-8bd9-545386b81d8f` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-c9e671ce-1bc2-4036-a4ac-68ac99bbadf0` |
| 3 | `GET /v1/credits/balance` | 200 | 9 | `qa-a821f473-61d0-4c44-a0bb-10e71b06240f` |
| 4 | `POST /v1/credits/purchases` | 201 | 28 | `qa-8d32810a-40a7-477c-bf7f-49872c7b55a2` |
| 5 | `GET /v1/credits/ledger` | 200 | 13 | `qa-04284c35-393c-46ef-b47e-23c0149096b9` |
| 6 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-b476a67a-f957-481d-85d2-1856ce2780ab` |
| 7 | `POST /v1/auth/token` | 401 | 8 | `qa-ed56be3a-5aa3-48d4-8852-d22e192b0f80` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-55ded6f6-2cdf-417f-8bd9-545386b81d8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55ded6f6-2cdf-417f-8bd9-545386b81d8f
Content-Type: application/json

--- request body ---
{"handle":"qa-490be6d4dd80","displayName":"QA 490be6d4dd80","password":"****","region":"in"}

--- response: 201 in 23 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-55ded6f6-2cdf-417f-8bd9-545386b81d8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 6
Location: /v1/accounts/qa-490be6d4dd80
X-Served-Region: in
Content-Length: 181

{"id":"acc_8929666f-d936-46ec-931b-d27a0cc84e0d","handle":"qa-490be6d4dd80","displayName":"QA 490be6d4dd80","region":"in","role":"user","createdAt":"2026-10-29T08:39:02.204675822Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c9e671ce-1bc2-4036-a4ac-68ac99bbadf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9e671ce-1bc2-4036-a4ac-68ac99bbadf0
Content-Type: application/json

--- request body ---
{"handle":"qa-490be6d4dd80","password":"****"}

--- response: 200 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9e671ce-1bc2-4036-a4ac-68ac99bbadf0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8929666f-d936-46ec-931b-d27a0cc84e0d"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-a821f473-61d0-4c44-a0bb-10e71b06240f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a821f473-61d0-4c44-a0bb-10e71b06240f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a821f473-61d0-4c44-a0bb-10e71b06240f
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

{"balance":5,"currency":"credits","accountId":"acc_8929666f-d936-46ec-931b-d27a0cc84e0d"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8d32810a-40a7-477c-bf7f-49872c7b55a2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5da7424f99d742308e90d2f7aeb2cec8
X-Correlation-Id: qa-8d32810a-40a7-477c-bf7f-49872c7b55a2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 28 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d32810a-40a7-477c-bf7f-49872c7b55a2
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
Location: /v1/credits/purchases/pur_79ec9d9f-2c43-476a-8c45-774edb023af2
Content-Length: 144

{"id":"pur_79ec9d9f-2c43-476a-8c45-774edb023af2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-29T08:39:02.265950468Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-04284c35-393c-46ef-b47e-23c0149096b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04284c35-393c-46ef-b47e-23c0149096b9
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-04284c35-393c-46ef-b47e-23c0149096b9
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

{"items":[{"id":"led_187aa4db-ab82-4a4e-89e3-c638ce8b725c","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-29T08:39:02.204686823Z"},{"id":"led_34fa521d-6edc-4dfe-9c3d-14e43e393478","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_79ec9d9f-2c43-476a-8c45-774edb023af2","createdAt":"2026-10-29T08:39:02.265950468Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b476a67a-f957-481d-85d2-1856ce2780ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b476a67a-f957-481d-85d2-1856ce2780ab
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b476a67a-f957-481d-85d2-1856ce2780ab
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
correlation: qa-ed56be3a-5aa3-48d4-8852-d22e192b0f80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed56be3a-5aa3-48d4-8852-d22e192b0f80
Content-Type: application/json

--- request body ---
{"handle":"qa-490be6d4dd80","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed56be3a-5aa3-48d4-8852-d22e192b0f80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ed56be3a-5aa3-48d4-8852-d22e192b0f80"}
```
