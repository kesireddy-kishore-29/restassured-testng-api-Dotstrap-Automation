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
| 1 | `POST /v1/accounts` | 201 | 273 | `qa-396d65a4-7408-4e16-a2f6-a235ff340055` |
| 2 | `POST /v1/auth/token` | 200 | 42 | `qa-ed30164b-6365-4f2f-a4cb-e65ffeef8a87` |
| 3 | `GET /v1/credits/balance` | 200 | 42 | `qa-28c9d86e-6f18-41ce-99eb-433d1a4c2c9b` |
| 4 | `POST /v1/credits/purchases` | 201 | 24 | `qa-159f5677-61d1-4147-8344-7d4691d6de24` |
| 5 | `GET /v1/credits/ledger` | 200 | 24 | `qa-2e6ad52a-243b-451c-958e-09d04362456b` |
| 6 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-b9b063cc-d598-4694-b260-764fc5565920` |
| 7 | `POST /v1/auth/token` | 401 | 19 | `qa-4e3a2209-c4cd-42ef-9af7-a2ebfab289d9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-396d65a4-7408-4e16-a2f6-a235ff340055

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-396d65a4-7408-4e16-a2f6-a235ff340055
Content-Type: application/json

--- request body ---
{"handle":"qa-40aa2277e59b","displayName":"QA 40aa2277e59b","password":"****","region":"in"}

--- response: 201 in 273 ms ---
Date: Sun, 22 Nov 2026 09:54:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-396d65a4-7408-4e16-a2f6-a235ff340055
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
Location: /v1/accounts/qa-40aa2277e59b
X-Served-Region: in
Content-Length: 181

{"id":"acc_024f07d6-3d07-4f71-98b3-dde69302ee8e","handle":"qa-40aa2277e59b","displayName":"QA 40aa2277e59b","region":"in","role":"user","createdAt":"2026-11-22T09:54:39.586796643Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ed30164b-6365-4f2f-a4cb-e65ffeef8a87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed30164b-6365-4f2f-a4cb-e65ffeef8a87
Content-Type: application/json

--- request body ---
{"handle":"qa-40aa2277e59b","password":"****"}

--- response: 200 in 42 ms ---
Date: Sun, 22 Nov 2026 09:54:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed30164b-6365-4f2f-a4cb-e65ffeef8a87
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_024f07d6-3d07-4f71-98b3-dde69302ee8e"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-28c9d86e-6f18-41ce-99eb-433d1a4c2c9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28c9d86e-6f18-41ce-99eb-433d1a4c2c9b
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Sun, 22 Nov 2026 09:54:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-28c9d86e-6f18-41ce-99eb-433d1a4c2c9b
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

{"balance":5,"currency":"credits","accountId":"acc_024f07d6-3d07-4f71-98b3-dde69302ee8e"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-159f5677-61d1-4147-8344-7d4691d6de24

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2885a6d3fa8a49e5bb634c3b55bf9b4e
X-Correlation-Id: qa-159f5677-61d1-4147-8344-7d4691d6de24
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-159f5677-61d1-4147-8344-7d4691d6de24
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
Location: /v1/credits/purchases/pur_4f621c02-e4b8-4b2e-be52-c6b89a8da682
Content-Length: 144

{"id":"pur_4f621c02-e4b8-4b2e-be52-c6b89a8da682","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-22T09:54:40.069638486Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-2e6ad52a-243b-451c-958e-09d04362456b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e6ad52a-243b-451c-958e-09d04362456b
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e6ad52a-243b-451c-958e-09d04362456b
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

{"items":[{"id":"led_97418c9e-7b7a-4ef0-ac10-53e6758e42ff","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-22T09:54:39.586806027Z"},{"id":"led_6fccc635-889c-427d-8307-4269906c4369","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_4f621c02-e4b8-4b2e-be52-c6b89a8da682","createdAt":"2026-11-22T09:54:40.069638486Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b9b063cc-d598-4694-b260-764fc5565920

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9b063cc-d598-4694-b260-764fc5565920
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b9b063cc-d598-4694-b260-764fc5565920
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
correlation: qa-4e3a2209-c4cd-42ef-9af7-a2ebfab289d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e3a2209-c4cd-42ef-9af7-a2ebfab289d9
Content-Type: application/json

--- request body ---
{"handle":"qa-40aa2277e59b","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e3a2209-c4cd-42ef-9af7-a2ebfab289d9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4e3a2209-c4cd-42ef-9af7-a2ebfab289d9"}
```
