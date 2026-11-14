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
| 1 | `POST /v1/accounts` | 201 | 302 | `qa-363c815f-c9d8-480e-82dc-a46f10e36979` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-76d4edad-b81b-4328-8d83-bfaa5f7651a8` |
| 3 | `GET /v1/credits/balance` | 200 | 33 | `qa-1adfe479-d630-4a9d-a6d7-d43bd61f51bf` |
| 4 | `POST /v1/credits/purchases` | 201 | 48 | `qa-81e6a6b8-96d8-4783-8aa2-8022b63e0464` |
| 5 | `GET /v1/credits/ledger` | 200 | 33 | `qa-38fc4545-128c-4004-843d-eb4f763ede71` |
| 6 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-658dd757-ef6e-47a7-ad5b-d06e77b5d422` |
| 7 | `POST /v1/auth/token` | 401 | 14 | `qa-bc691ef8-7193-4624-a695-70addec9c784` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-363c815f-c9d8-480e-82dc-a46f10e36979

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-363c815f-c9d8-480e-82dc-a46f10e36979
Content-Type: application/json

--- request body ---
{"handle":"qa-b2c2c0e1bb02","displayName":"QA b2c2c0e1bb02","password":"****","region":"in"}

--- response: 201 in 302 ms ---
Date: Sun, 08 Nov 2026 09:09:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-363c815f-c9d8-480e-82dc-a46f10e36979
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-b2c2c0e1bb02
X-Served-Region: in
Content-Length: 181

{"id":"acc_f408253a-c43a-4bae-af2d-c92d0a268c6d","handle":"qa-b2c2c0e1bb02","displayName":"QA b2c2c0e1bb02","region":"in","role":"user","createdAt":"2026-11-08T09:09:00.987537130Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-76d4edad-b81b-4328-8d83-bfaa5f7651a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76d4edad-b81b-4328-8d83-bfaa5f7651a8
Content-Type: application/json

--- request body ---
{"handle":"qa-b2c2c0e1bb02","password":"****"}

--- response: 200 in 43 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-76d4edad-b81b-4328-8d83-bfaa5f7651a8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f408253a-c43a-4bae-af2d-c92d0a268c6d"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-1adfe479-d630-4a9d-a6d7-d43bd61f51bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1adfe479-d630-4a9d-a6d7-d43bd61f51bf
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1adfe479-d630-4a9d-a6d7-d43bd61f51bf
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

{"balance":5,"currency":"credits","accountId":"acc_f408253a-c43a-4bae-af2d-c92d0a268c6d"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-81e6a6b8-96d8-4783-8aa2-8022b63e0464

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e9b871af53364b9caa3381eb2bd1f6be
X-Correlation-Id: qa-81e6a6b8-96d8-4783-8aa2-8022b63e0464
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 48 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-81e6a6b8-96d8-4783-8aa2-8022b63e0464
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
Location: /v1/credits/purchases/pur_9569046d-c8d9-4cf1-b7cf-6c589cf2638c
Content-Length: 144

{"id":"pur_9569046d-c8d9-4cf1-b7cf-6c589cf2638c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-08T09:09:01.412800244Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-38fc4545-128c-4004-843d-eb4f763ede71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38fc4545-128c-4004-843d-eb4f763ede71
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-38fc4545-128c-4004-843d-eb4f763ede71
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

{"items":[{"id":"led_8208b3f2-a0b1-445e-8d1c-faacb5ed886e","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-08T09:09:00.987548287Z"},{"id":"led_347d1959-e5aa-4558-b8e0-b2810ad218ee","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_9569046d-c8d9-4cf1-b7cf-6c589cf2638c","createdAt":"2026-11-08T09:09:01.412800244Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-658dd757-ef6e-47a7-ad5b-d06e77b5d422

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-658dd757-ef6e-47a7-ad5b-d06e77b5d422
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-658dd757-ef6e-47a7-ad5b-d06e77b5d422
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
correlation: qa-bc691ef8-7193-4624-a695-70addec9c784

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc691ef8-7193-4624-a695-70addec9c784
Content-Type: application/json

--- request body ---
{"handle":"qa-b2c2c0e1bb02","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc691ef8-7193-4624-a695-70addec9c784
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bc691ef8-7193-4624-a695-70addec9c784"}
```
