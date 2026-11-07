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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-16c58808-708b-4f99-9f29-dbeba802df71` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-a754bfb3-d43b-4914-ab2e-d19ff0ffe2d2` |
| 3 | `GET /v1/credits/balance` | 200 | 3 | `qa-c30ba814-6b35-4b50-af6b-71f8727c8ff4` |
| 4 | `POST /v1/credits/purchases` | 201 | 13 | `qa-f4b197b9-5b06-4d41-b7d3-1ac84fe4d98e` |
| 5 | `GET /v1/credits/ledger` | 200 | 5 | `qa-b8aec767-f735-40de-a351-be82b9c614b8` |
| 6 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-c7bd8dbe-0f65-462f-ab6f-028419c64cd6` |
| 7 | `POST /v1/auth/token` | 401 | 12 | `qa-b7308b41-afaf-425e-adb6-1b9f6d55aa92` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-16c58808-708b-4f99-9f29-dbeba802df71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16c58808-708b-4f99-9f29-dbeba802df71
Content-Type: application/json

--- request body ---
{"handle":"qa-23dd244eab6f","displayName":"QA 23dd244eab6f","password":"****","region":"in"}

--- response: 201 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-16c58808-708b-4f99-9f29-dbeba802df71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 7
Location: /v1/accounts/qa-23dd244eab6f
X-Served-Region: in
Content-Length: 181

{"id":"acc_c047fca8-3ba0-4d80-aea7-e375e42a40d9","handle":"qa-23dd244eab6f","displayName":"QA 23dd244eab6f","region":"in","role":"user","createdAt":"2026-11-03T09:41:34.019250461Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a754bfb3-d43b-4914-ab2e-d19ff0ffe2d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a754bfb3-d43b-4914-ab2e-d19ff0ffe2d2
Content-Type: application/json

--- request body ---
{"handle":"qa-23dd244eab6f","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-a754bfb3-d43b-4914-ab2e-d19ff0ffe2d2
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c047fca8-3ba0-4d80-aea7-e375e42a40d9"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-c30ba814-6b35-4b50-af6b-71f8727c8ff4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c30ba814-6b35-4b50-af6b-71f8727c8ff4
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c30ba814-6b35-4b50-af6b-71f8727c8ff4
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

{"balance":5,"currency":"credits","accountId":"acc_c047fca8-3ba0-4d80-aea7-e375e42a40d9"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f4b197b9-5b06-4d41-b7d3-1ac84fe4d98e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b76d1afed18e43858db9eb6e7f734ecd
X-Correlation-Id: qa-f4b197b9-5b06-4d41-b7d3-1ac84fe4d98e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4b197b9-5b06-4d41-b7d3-1ac84fe4d98e
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
Location: /v1/credits/purchases/pur_650e3c0a-e32f-4110-ba44-4c468897df46
Content-Length: 144

{"id":"pur_650e3c0a-e32f-4110-ba44-4c468897df46","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-03T09:41:34.055342579Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b8aec767-f735-40de-a351-be82b9c614b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8aec767-f735-40de-a351-be82b9c614b8
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8aec767-f735-40de-a351-be82b9c614b8
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

{"items":[{"id":"led_68ff08f1-8074-4c5b-89e2-e8001dbf8161","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-03T09:41:34.019256650Z"},{"id":"led_f1ebf37a-670e-4350-838a-baf4861f082e","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_650e3c0a-e32f-4110-ba44-4c468897df46","createdAt":"2026-11-03T09:41:34.055342579Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c7bd8dbe-0f65-462f-ab6f-028419c64cd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7bd8dbe-0f65-462f-ab6f-028419c64cd6
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c7bd8dbe-0f65-462f-ab6f-028419c64cd6
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
correlation: qa-b7308b41-afaf-425e-adb6-1b9f6d55aa92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7308b41-afaf-425e-adb6-1b9f6d55aa92
Content-Type: application/json

--- request body ---
{"handle":"qa-23dd244eab6f","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7308b41-afaf-425e-adb6-1b9f6d55aa92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b7308b41-afaf-425e-adb6-1b9f6d55aa92"}
```
