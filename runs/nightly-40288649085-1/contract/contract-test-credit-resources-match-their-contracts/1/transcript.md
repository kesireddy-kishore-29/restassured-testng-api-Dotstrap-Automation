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
| 1 | `POST /v1/accounts` | 201 | 321 | `qa-0d8caa0f-ffe4-40b8-8a48-d080fb49f83f` |
| 2 | `POST /v1/auth/token` | 200 | 37 | `qa-59ca5651-c520-4e6e-bd52-b84f8d61f84a` |
| 3 | `GET /v1/credits/balance` | 200 | 44 | `qa-b72f7516-fd30-4987-a47f-aaba406d7530` |
| 4 | `POST /v1/credits/purchases` | 201 | 30 | `qa-508aa9c4-88d2-4853-9e6f-db94012d1faa` |
| 5 | `GET /v1/credits/ledger` | 200 | 17 | `qa-9b0f3e8c-7221-4e35-bce1-9f7a8f9969cf` |
| 6 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-edcb80e0-8dc2-4e03-b63e-3c80208f3d6d` |
| 7 | `POST /v1/auth/token` | 401 | 30 | `qa-b5d6d366-f10e-426d-9ff7-bb961fb0aabf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0d8caa0f-ffe4-40b8-8a48-d080fb49f83f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d8caa0f-ffe4-40b8-8a48-d080fb49f83f
Content-Type: application/json

--- request body ---
{"handle":"qa-ee2dc711de9c","displayName":"QA ee2dc711de9c","password":"****","region":"in"}

--- response: 201 in 321 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d8caa0f-ffe4-40b8-8a48-d080fb49f83f
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
Location: /v1/accounts/qa-ee2dc711de9c
X-Served-Region: in
Content-Length: 181

{"id":"acc_7e152da0-6128-4809-a6e2-366125a59b76","handle":"qa-ee2dc711de9c","displayName":"QA ee2dc711de9c","region":"in","role":"user","createdAt":"2026-10-26T07:54:45.417949484Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-59ca5651-c520-4e6e-bd52-b84f8d61f84a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59ca5651-c520-4e6e-bd52-b84f8d61f84a
Content-Type: application/json

--- request body ---
{"handle":"qa-ee2dc711de9c","password":"****"}

--- response: 200 in 37 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-59ca5651-c520-4e6e-bd52-b84f8d61f84a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e152da0-6128-4809-a6e2-366125a59b76"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-b72f7516-fd30-4987-a47f-aaba406d7530

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b72f7516-fd30-4987-a47f-aaba406d7530
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-b72f7516-fd30-4987-a47f-aaba406d7530
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

{"balance":5,"currency":"credits","accountId":"acc_7e152da0-6128-4809-a6e2-366125a59b76"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-508aa9c4-88d2-4853-9e6f-db94012d1faa

--- request headers ---
Accept: application/json
Idempotency-Key: qa-dde26de595ad4aa8a7be14a3ac543c28
X-Correlation-Id: qa-508aa9c4-88d2-4853-9e6f-db94012d1faa
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 30 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-508aa9c4-88d2-4853-9e6f-db94012d1faa
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
Location: /v1/credits/purchases/pur_a7370457-9d9d-487e-a8c3-4828a433a53d
Content-Length: 144

{"id":"pur_a7370457-9d9d-487e-a8c3-4828a433a53d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-26T07:54:45.885913317Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-9b0f3e8c-7221-4e35-bce1-9f7a8f9969cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b0f3e8c-7221-4e35-bce1-9f7a8f9969cf
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b0f3e8c-7221-4e35-bce1-9f7a8f9969cf
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

{"items":[{"id":"led_2ce9e176-125a-4529-8b32-32914a9ae6aa","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-26T07:54:45.418152093Z"},{"id":"led_00c4f786-1d40-47fe-855f-a66ab3173666","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_a7370457-9d9d-487e-a8c3-4828a433a53d","createdAt":"2026-10-26T07:54:45.885913317Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-edcb80e0-8dc2-4e03-b63e-3c80208f3d6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edcb80e0-8dc2-4e03-b63e-3c80208f3d6d
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-edcb80e0-8dc2-4e03-b63e-3c80208f3d6d
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
correlation: qa-b5d6d366-f10e-426d-9ff7-bb961fb0aabf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5d6d366-f10e-426d-9ff7-bb961fb0aabf
Content-Type: application/json

--- request body ---
{"handle":"qa-ee2dc711de9c","password":"****"}

--- response: 401 in 30 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5d6d366-f10e-426d-9ff7-bb961fb0aabf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b5d6d366-f10e-426d-9ff7-bb961fb0aabf"}
```
