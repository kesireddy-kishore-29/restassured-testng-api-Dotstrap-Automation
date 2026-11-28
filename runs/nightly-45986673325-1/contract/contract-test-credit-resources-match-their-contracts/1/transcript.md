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
| 1 | `POST /v1/accounts` | 201 | 457 | `qa-fc0f2d48-59df-46ce-b43d-f0a7f1fe0386` |
| 2 | `POST /v1/auth/token` | 200 | 48 | `qa-b2f0fbb5-0191-4e5c-b626-2dfde179a510` |
| 3 | `GET /v1/credits/balance` | 200 | 42 | `qa-68c24cb2-52b4-461e-bc63-c4695fad03ae` |
| 4 | `POST /v1/credits/purchases` | 201 | 53 | `qa-92af3990-b3e3-48fc-aae8-33ca3b812cfd` |
| 5 | `GET /v1/credits/ledger` | 200 | 36 | `qa-d85c06b0-a901-48ce-b1da-a66ecb350aae` |
| 6 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-39830a5e-45c5-4fca-8c08-23f2d3dd4b4b` |
| 7 | `POST /v1/auth/token` | 401 | 21 | `qa-a36f04f4-8be2-4ba5-af99-d065f0e6dba0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fc0f2d48-59df-46ce-b43d-f0a7f1fe0386

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc0f2d48-59df-46ce-b43d-f0a7f1fe0386
Content-Type: application/json

--- request body ---
{"handle":"qa-9cbac72ab707","displayName":"QA 9cbac72ab707","password":"****","region":"in"}

--- response: 201 in 457 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc0f2d48-59df-46ce-b43d-f0a7f1fe0386
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
Location: /v1/accounts/qa-9cbac72ab707
X-Served-Region: in
Content-Length: 181

{"id":"acc_58ada33a-f986-438a-a34c-e6e269790b8c","handle":"qa-9cbac72ab707","displayName":"QA 9cbac72ab707","region":"in","role":"user","createdAt":"2026-11-27T10:59:55.876397480Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b2f0fbb5-0191-4e5c-b626-2dfde179a510

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2f0fbb5-0191-4e5c-b626-2dfde179a510
Content-Type: application/json

--- request body ---
{"handle":"qa-9cbac72ab707","password":"****"}

--- response: 200 in 48 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2f0fbb5-0191-4e5c-b626-2dfde179a510
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_58ada33a-f986-438a-a34c-e6e269790b8c"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-68c24cb2-52b4-461e-bc63-c4695fad03ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68c24cb2-52b4-461e-bc63-c4695fad03ae
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-68c24cb2-52b4-461e-bc63-c4695fad03ae
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

{"balance":5,"currency":"credits","accountId":"acc_58ada33a-f986-438a-a34c-e6e269790b8c"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-92af3990-b3e3-48fc-aae8-33ca3b812cfd

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e47c8f4c38c54f2fa047df801707c6ee
X-Correlation-Id: qa-92af3990-b3e3-48fc-aae8-33ca3b812cfd
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 53 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-92af3990-b3e3-48fc-aae8-33ca3b812cfd
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
Location: /v1/credits/purchases/pur_cf2411a8-077b-4ddf-ae6f-d4f17f8ef48f
Content-Length: 144

{"id":"pur_cf2411a8-077b-4ddf-ae6f-d4f17f8ef48f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-27T10:59:56.536405818Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-d85c06b0-a901-48ce-b1da-a66ecb350aae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d85c06b0-a901-48ce-b1da-a66ecb350aae
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d85c06b0-a901-48ce-b1da-a66ecb350aae
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

{"items":[{"id":"led_f8b2ee85-d390-43d8-b485-99e13f07bc76","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-27T10:59:55.879031641Z"},{"id":"led_4d16f48e-f59c-461b-8965-694228561162","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_cf2411a8-077b-4ddf-ae6f-d4f17f8ef48f","createdAt":"2026-11-27T10:59:56.536405818Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-39830a5e-45c5-4fca-8c08-23f2d3dd4b4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39830a5e-45c5-4fca-8c08-23f2d3dd4b4b
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-39830a5e-45c5-4fca-8c08-23f2d3dd4b4b
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
correlation: qa-a36f04f4-8be2-4ba5-af99-d065f0e6dba0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a36f04f4-8be2-4ba5-af99-d065f0e6dba0
Content-Type: application/json

--- request body ---
{"handle":"qa-9cbac72ab707","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a36f04f4-8be2-4ba5-af99-d065f0e6dba0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a36f04f4-8be2-4ba5-af99-d065f0e6dba0"}
```
