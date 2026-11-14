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
| 1 | `POST /v1/accounts` | 201 | 297 | `qa-aa1027fb-c38c-44df-9c6a-2dbda5ac15f1` |
| 2 | `POST /v1/auth/token` | 200 | 42 | `qa-5aa16791-8333-4865-bb6b-6682b187baa1` |
| 3 | `GET /v1/credits/balance` | 200 | 32 | `qa-a8d7ed71-5acd-4b28-9c79-113cb6cf0106` |
| 4 | `POST /v1/credits/purchases` | 201 | 29 | `qa-e5026ee4-20c6-4202-99c2-38d33f6cd244` |
| 5 | `GET /v1/credits/ledger` | 200 | 14 | `qa-8cc65fe0-ec26-4318-a029-00b74bae0578` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-059609b6-be43-4d0e-b232-83a82b7a0047` |
| 7 | `POST /v1/auth/token` | 401 | 19 | `qa-d76e6c8b-ae1f-4731-89d6-4062019c6d70` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aa1027fb-c38c-44df-9c6a-2dbda5ac15f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa1027fb-c38c-44df-9c6a-2dbda5ac15f1
Content-Type: application/json

--- request body ---
{"handle":"qa-841a1e9a402f","displayName":"QA 841a1e9a402f","password":"****","region":"in"}

--- response: 201 in 297 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa1027fb-c38c-44df-9c6a-2dbda5ac15f1
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
Location: /v1/accounts/qa-841a1e9a402f
X-Served-Region: in
Content-Length: 181

{"id":"acc_fccda9e9-df7b-47df-8da4-f3361f6eae75","handle":"qa-841a1e9a402f","displayName":"QA 841a1e9a402f","region":"in","role":"user","createdAt":"2026-11-12T09:56:29.272566055Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5aa16791-8333-4865-bb6b-6682b187baa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5aa16791-8333-4865-bb6b-6682b187baa1
Content-Type: application/json

--- request body ---
{"handle":"qa-841a1e9a402f","password":"****"}

--- response: 200 in 42 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-5aa16791-8333-4865-bb6b-6682b187baa1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fccda9e9-df7b-47df-8da4-f3361f6eae75"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-a8d7ed71-5acd-4b28-9c79-113cb6cf0106

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8d7ed71-5acd-4b28-9c79-113cb6cf0106
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8d7ed71-5acd-4b28-9c79-113cb6cf0106
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

{"balance":5,"currency":"credits","accountId":"acc_fccda9e9-df7b-47df-8da4-f3361f6eae75"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e5026ee4-20c6-4202-99c2-38d33f6cd244

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5b3c7d7459a547aeb6ded1d03c41a0f2
X-Correlation-Id: qa-e5026ee4-20c6-4202-99c2-38d33f6cd244
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 29 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5026ee4-20c6-4202-99c2-38d33f6cd244
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
Location: /v1/credits/purchases/pur_fd07a065-fb7e-4670-a863-74c9c683ce15
Content-Length: 144

{"id":"pur_fd07a065-fb7e-4670-a863-74c9c683ce15","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-12T09:56:29.709304439Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-8cc65fe0-ec26-4318-a029-00b74bae0578

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cc65fe0-ec26-4318-a029-00b74bae0578
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cc65fe0-ec26-4318-a029-00b74bae0578
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

{"items":[{"id":"led_a1006db1-6f23-41ed-b2d0-ab6c5897a873","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-12T09:56:29.272579185Z"},{"id":"led_082f7ea9-df32-4c30-9122-b58fef16e66c","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_fd07a065-fb7e-4670-a863-74c9c683ce15","createdAt":"2026-11-12T09:56:29.709304439Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-059609b6-be43-4d0e-b232-83a82b7a0047

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-059609b6-be43-4d0e-b232-83a82b7a0047
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-059609b6-be43-4d0e-b232-83a82b7a0047
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
correlation: qa-d76e6c8b-ae1f-4731-89d6-4062019c6d70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d76e6c8b-ae1f-4731-89d6-4062019c6d70
Content-Type: application/json

--- request body ---
{"handle":"qa-841a1e9a402f","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d76e6c8b-ae1f-4731-89d6-4062019c6d70
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d76e6c8b-ae1f-4731-89d6-4062019c6d70"}
```
