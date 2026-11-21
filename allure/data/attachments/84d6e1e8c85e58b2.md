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
| 1 | `POST /v1/accounts` | 201 | 451 | `qa-d530f5ff-6c96-41be-bc01-0ecdfde6bd7b` |
| 2 | `POST /v1/auth/token` | 200 | 69 | `qa-c1f784ff-9ac2-4b6b-98fa-f74a7e02fcd3` |
| 3 | `GET /v1/credits/balance` | 200 | 45 | `qa-fca3fd9d-a4a7-4aef-b882-900636d4cafb` |
| 4 | `POST /v1/credits/purchases` | 201 | 36 | `qa-cabe57d3-0d15-47be-987f-e6e7574e1a4c` |
| 5 | `GET /v1/credits/ledger` | 200 | 27 | `qa-91781c3a-6162-489a-a7f4-06c74911b338` |
| 6 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-a1f34983-bb63-4baf-9998-6e1bbcd15c0e` |
| 7 | `POST /v1/auth/token` | 401 | 53 | `qa-56ef2618-a9d3-4515-83a4-bb8c72100cb1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d530f5ff-6c96-41be-bc01-0ecdfde6bd7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d530f5ff-6c96-41be-bc01-0ecdfde6bd7b
Content-Type: application/json

--- request body ---
{"handle":"qa-e307bd4d7b6f","displayName":"QA e307bd4d7b6f","password":"****","region":"in"}

--- response: 201 in 451 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-d530f5ff-6c96-41be-bc01-0ecdfde6bd7b
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
Location: /v1/accounts/qa-e307bd4d7b6f
X-Served-Region: in
Content-Length: 181

{"id":"acc_1f626056-9843-4183-b4b4-fd85252e390c","handle":"qa-e307bd4d7b6f","displayName":"QA e307bd4d7b6f","region":"in","role":"user","createdAt":"2026-11-21T09:57:07.936997426Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c1f784ff-9ac2-4b6b-98fa-f74a7e02fcd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1f784ff-9ac2-4b6b-98fa-f74a7e02fcd3
Content-Type: application/json

--- request body ---
{"handle":"qa-e307bd4d7b6f","password":"****"}

--- response: 200 in 69 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1f784ff-9ac2-4b6b-98fa-f74a7e02fcd3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1f626056-9843-4183-b4b4-fd85252e390c"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-fca3fd9d-a4a7-4aef-b882-900636d4cafb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fca3fd9d-a4a7-4aef-b882-900636d4cafb
Content-Type: application/json

--- response: 200 in 45 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-fca3fd9d-a4a7-4aef-b882-900636d4cafb
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

{"balance":5,"currency":"credits","accountId":"acc_1f626056-9843-4183-b4b4-fd85252e390c"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-cabe57d3-0d15-47be-987f-e6e7574e1a4c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f0b51f24ddcb436aaabe9768873d0a0c
X-Correlation-Id: qa-cabe57d3-0d15-47be-987f-e6e7574e1a4c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-cabe57d3-0d15-47be-987f-e6e7574e1a4c
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
Location: /v1/credits/purchases/pur_107cac2e-9905-45fe-83c5-44356c2e0121
Content-Length: 144

{"id":"pur_107cac2e-9905-45fe-83c5-44356c2e0121","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-21T09:57:08.661372797Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-91781c3a-6162-489a-a7f4-06c74911b338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91781c3a-6162-489a-a7f4-06c74911b338
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-91781c3a-6162-489a-a7f4-06c74911b338
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

{"items":[{"id":"led_fdc34d82-f45b-4e12-9d9f-fe80bbc1eed9","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-21T09:57:07.937015610Z"},{"id":"led_7c311876-54ce-4227-9666-527c8512e38f","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_107cac2e-9905-45fe-83c5-44356c2e0121","createdAt":"2026-11-21T09:57:08.661372797Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a1f34983-bb63-4baf-9998-6e1bbcd15c0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1f34983-bb63-4baf-9998-6e1bbcd15c0e
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a1f34983-bb63-4baf-9998-6e1bbcd15c0e
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
correlation: qa-56ef2618-a9d3-4515-83a4-bb8c72100cb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56ef2618-a9d3-4515-83a4-bb8c72100cb1
Content-Type: application/json

--- request body ---
{"handle":"qa-e307bd4d7b6f","password":"****"}

--- response: 401 in 53 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56ef2618-a9d3-4515-83a4-bb8c72100cb1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-56ef2618-a9d3-4515-83a4-bb8c72100cb1"}
```
