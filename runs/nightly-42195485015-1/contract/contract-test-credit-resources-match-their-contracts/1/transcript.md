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
| 1 | `POST /v1/accounts` | 201 | 461 | `qa-f4ca9b84-a82a-45b7-9d4b-44f70596ea89` |
| 2 | `POST /v1/auth/token` | 200 | 49 | `qa-18360f5a-9341-4bac-9245-1242cb785d5d` |
| 3 | `GET /v1/credits/balance` | 200 | 51 | `qa-086db53b-714c-411d-a31f-2d77bc644a25` |
| 4 | `POST /v1/credits/purchases` | 201 | 48 | `qa-b209225a-a3e0-4ed0-994d-9e1320677aab` |
| 5 | `GET /v1/credits/ledger` | 200 | 66 | `qa-1dfb536d-0c72-42e4-8d28-7755ee849df4` |
| 6 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-c5d926de-e5e6-4e57-8ef7-f19a14c36421` |
| 7 | `POST /v1/auth/token` | 401 | 35 | `qa-2f2c6f87-d559-405e-9712-6b265acc5e2d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f4ca9b84-a82a-45b7-9d4b-44f70596ea89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4ca9b84-a82a-45b7-9d4b-44f70596ea89
Content-Type: application/json

--- request body ---
{"handle":"qa-e1c813f06e9b","displayName":"QA e1c813f06e9b","password":"****","region":"in"}

--- response: 201 in 461 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4ca9b84-a82a-45b7-9d4b-44f70596ea89
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
Location: /v1/accounts/qa-e1c813f06e9b
X-Served-Region: in
Content-Length: 181

{"id":"acc_8819f924-a3f5-4a94-a325-eabafbe08a07","handle":"qa-e1c813f06e9b","displayName":"QA e1c813f06e9b","region":"in","role":"user","createdAt":"2026-11-06T09:30:30.108093594Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-18360f5a-9341-4bac-9245-1242cb785d5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18360f5a-9341-4bac-9245-1242cb785d5d
Content-Type: application/json

--- request body ---
{"handle":"qa-e1c813f06e9b","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-18360f5a-9341-4bac-9245-1242cb785d5d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8819f924-a3f5-4a94-a325-eabafbe08a07"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-086db53b-714c-411d-a31f-2d77bc644a25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-086db53b-714c-411d-a31f-2d77bc644a25
Content-Type: application/json

--- response: 200 in 51 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-086db53b-714c-411d-a31f-2d77bc644a25
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

{"balance":5,"currency":"credits","accountId":"acc_8819f924-a3f5-4a94-a325-eabafbe08a07"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b209225a-a3e0-4ed0-994d-9e1320677aab

--- request headers ---
Accept: application/json
Idempotency-Key: qa-39d7289f7dab4ceeaad0ce6fa0abbc62
X-Correlation-Id: qa-b209225a-a3e0-4ed0-994d-9e1320677aab
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 48 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b209225a-a3e0-4ed0-994d-9e1320677aab
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
Location: /v1/credits/purchases/pur_275883c7-c761-42ad-91c4-af2dfc71f9d4
Content-Length: 144

{"id":"pur_275883c7-c761-42ad-91c4-af2dfc71f9d4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-06T09:30:30.727955117Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-1dfb536d-0c72-42e4-8d28-7755ee849df4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dfb536d-0c72-42e4-8d28-7755ee849df4
Content-Type: application/json

--- response: 200 in 66 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dfb536d-0c72-42e4-8d28-7755ee849df4
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

{"items":[{"id":"led_e5494c14-8931-45c7-8527-25c2435e48dd","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-06T09:30:30.108125112Z"},{"id":"led_f33a5f86-c45b-4e71-9d2b-a3d070c80a8f","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_275883c7-c761-42ad-91c4-af2dfc71f9d4","createdAt":"2026-11-06T09:30:30.727955117Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c5d926de-e5e6-4e57-8ef7-f19a14c36421

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5d926de-e5e6-4e57-8ef7-f19a14c36421
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c5d926de-e5e6-4e57-8ef7-f19a14c36421
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
correlation: qa-2f2c6f87-d559-405e-9712-6b265acc5e2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f2c6f87-d559-405e-9712-6b265acc5e2d
Content-Type: application/json

--- request body ---
{"handle":"qa-e1c813f06e9b","password":"****"}

--- response: 401 in 35 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f2c6f87-d559-405e-9712-6b265acc5e2d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2f2c6f87-d559-405e-9712-6b265acc5e2d"}
```
