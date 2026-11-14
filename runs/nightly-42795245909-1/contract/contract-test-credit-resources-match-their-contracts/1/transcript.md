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
| 1 | `POST /v1/accounts` | 201 | 383 | `qa-d261a171-af65-46af-a209-bee9ec764841` |
| 2 | `POST /v1/auth/token` | 200 | 45 | `qa-f2669edb-ff74-4cf5-b93c-2c6025a44fee` |
| 3 | `GET /v1/credits/balance` | 200 | 37 | `qa-86b9497a-f31f-4ca5-888d-c9db313dfe5c` |
| 4 | `POST /v1/credits/purchases` | 201 | 26 | `qa-8c99ace5-b425-43e3-a246-bbc198823e2e` |
| 5 | `GET /v1/credits/ledger` | 200 | 21 | `qa-3e2e0a21-2cf9-45cb-bf99-735b3ff845eb` |
| 6 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-b9984acb-0ecd-44cf-b9ac-34164f20a7b0` |
| 7 | `POST /v1/auth/token` | 401 | 16 | `qa-2c58edfb-1b51-4a58-a278-ba2089956e8b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d261a171-af65-46af-a209-bee9ec764841

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d261a171-af65-46af-a209-bee9ec764841
Content-Type: application/json

--- request body ---
{"handle":"qa-5b2d827679e7","displayName":"QA 5b2d827679e7","password":"****","region":"in"}

--- response: 201 in 383 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-d261a171-af65-46af-a209-bee9ec764841
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
Location: /v1/accounts/qa-5b2d827679e7
X-Served-Region: in
Content-Length: 181

{"id":"acc_04886660-155b-4ffd-baa5-90e696b8b0d8","handle":"qa-5b2d827679e7","displayName":"QA 5b2d827679e7","region":"in","role":"user","createdAt":"2026-11-10T09:59:34.246404922Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f2669edb-ff74-4cf5-b93c-2c6025a44fee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2669edb-ff74-4cf5-b93c-2c6025a44fee
Content-Type: application/json

--- request body ---
{"handle":"qa-5b2d827679e7","password":"****"}

--- response: 200 in 45 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2669edb-ff74-4cf5-b93c-2c6025a44fee
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_04886660-155b-4ffd-baa5-90e696b8b0d8"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-86b9497a-f31f-4ca5-888d-c9db313dfe5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86b9497a-f31f-4ca5-888d-c9db313dfe5c
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-86b9497a-f31f-4ca5-888d-c9db313dfe5c
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

{"balance":5,"currency":"credits","accountId":"acc_04886660-155b-4ffd-baa5-90e696b8b0d8"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8c99ace5-b425-43e3-a246-bbc198823e2e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fb2513e097e9458f8b581852354fa1a3
X-Correlation-Id: qa-8c99ace5-b425-43e3-a246-bbc198823e2e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c99ace5-b425-43e3-a246-bbc198823e2e
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
Location: /v1/credits/purchases/pur_52eeabac-083a-4d6a-935e-a2062260b8c4
Content-Length: 144

{"id":"pur_52eeabac-083a-4d6a-935e-a2062260b8c4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-10T09:59:34.781018314Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-3e2e0a21-2cf9-45cb-bf99-735b3ff845eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e2e0a21-2cf9-45cb-bf99-735b3ff845eb
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e2e0a21-2cf9-45cb-bf99-735b3ff845eb
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

{"items":[{"id":"led_25275104-1a1b-4e36-9b46-a2730463d87a","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-10T09:59:34.246416950Z"},{"id":"led_6c4d484e-f81b-4796-a229-5d16fbcc22e1","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_52eeabac-083a-4d6a-935e-a2062260b8c4","createdAt":"2026-11-10T09:59:34.781018314Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b9984acb-0ecd-44cf-b9ac-34164f20a7b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9984acb-0ecd-44cf-b9ac-34164f20a7b0
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b9984acb-0ecd-44cf-b9ac-34164f20a7b0
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
correlation: qa-2c58edfb-1b51-4a58-a278-ba2089956e8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c58edfb-1b51-4a58-a278-ba2089956e8b
Content-Type: application/json

--- request body ---
{"handle":"qa-5b2d827679e7","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c58edfb-1b51-4a58-a278-ba2089956e8b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2c58edfb-1b51-4a58-a278-ba2089956e8b"}
```
