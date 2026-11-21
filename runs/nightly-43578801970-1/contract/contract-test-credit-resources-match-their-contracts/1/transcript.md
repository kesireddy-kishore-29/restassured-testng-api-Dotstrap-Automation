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
| 1 | `POST /v1/accounts` | 201 | 409 | `qa-72f31b4e-98c2-4568-aeef-ee5e93e8f504` |
| 2 | `POST /v1/auth/token` | 200 | 55 | `qa-e47a9749-c9d7-4208-83e4-010db47f4686` |
| 3 | `GET /v1/credits/balance` | 200 | 32 | `qa-2c1affb5-e0aa-4a7c-8306-c6d7d16a826f` |
| 4 | `POST /v1/credits/purchases` | 201 | 40 | `qa-172d1885-aa91-4ddd-8594-d5dc289a3b42` |
| 5 | `GET /v1/credits/ledger` | 200 | 49 | `qa-cfed32e6-4763-4ba1-96cc-c8bfaab71280` |
| 6 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-71f13df2-3de9-4178-81b1-dbc75dbd1355` |
| 7 | `POST /v1/auth/token` | 401 | 25 | `qa-ca3b0857-218d-4ea6-b18b-b51adc613ea8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-72f31b4e-98c2-4568-aeef-ee5e93e8f504

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72f31b4e-98c2-4568-aeef-ee5e93e8f504
Content-Type: application/json

--- request body ---
{"handle":"qa-6b011cbe7302","displayName":"QA 6b011cbe7302","password":"****","region":"in"}

--- response: 201 in 409 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-72f31b4e-98c2-4568-aeef-ee5e93e8f504
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
Location: /v1/accounts/qa-6b011cbe7302
X-Served-Region: in
Content-Length: 181

{"id":"acc_8aa5e8ca-f8a1-42dc-b640-c3f428f991d7","handle":"qa-6b011cbe7302","displayName":"QA 6b011cbe7302","region":"in","role":"user","createdAt":"2026-11-14T09:05:09.115153577Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e47a9749-c9d7-4208-83e4-010db47f4686

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e47a9749-c9d7-4208-83e4-010db47f4686
Content-Type: application/json

--- request body ---
{"handle":"qa-6b011cbe7302","password":"****"}

--- response: 200 in 55 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-e47a9749-c9d7-4208-83e4-010db47f4686
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8aa5e8ca-f8a1-42dc-b640-c3f428f991d7"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-2c1affb5-e0aa-4a7c-8306-c6d7d16a826f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c1affb5-e0aa-4a7c-8306-c6d7d16a826f
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c1affb5-e0aa-4a7c-8306-c6d7d16a826f
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

{"balance":5,"currency":"credits","accountId":"acc_8aa5e8ca-f8a1-42dc-b640-c3f428f991d7"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-172d1885-aa91-4ddd-8594-d5dc289a3b42

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a280a17194fe49cdb5e137c0bc5258dd
X-Correlation-Id: qa-172d1885-aa91-4ddd-8594-d5dc289a3b42
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 40 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-172d1885-aa91-4ddd-8594-d5dc289a3b42
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
Location: /v1/credits/purchases/pur_52f95231-2834-4c4e-a5b8-33632a0c966e
Content-Length: 144

{"id":"pur_52f95231-2834-4c4e-a5b8-33632a0c966e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-14T09:05:09.614258916Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-cfed32e6-4763-4ba1-96cc-c8bfaab71280

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfed32e6-4763-4ba1-96cc-c8bfaab71280
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfed32e6-4763-4ba1-96cc-c8bfaab71280
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

{"items":[{"id":"led_717bede2-e718-4e0b-96ae-6a7611f2bd9c","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-14T09:05:09.115186587Z"},{"id":"led_1e587f3a-9bf6-435e-b3ae-8b82bc7164a0","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_52f95231-2834-4c4e-a5b8-33632a0c966e","createdAt":"2026-11-14T09:05:09.614258916Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-71f13df2-3de9-4178-81b1-dbc75dbd1355

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71f13df2-3de9-4178-81b1-dbc75dbd1355
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-71f13df2-3de9-4178-81b1-dbc75dbd1355
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
correlation: qa-ca3b0857-218d-4ea6-b18b-b51adc613ea8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca3b0857-218d-4ea6-b18b-b51adc613ea8
Content-Type: application/json

--- request body ---
{"handle":"qa-6b011cbe7302","password":"****"}

--- response: 401 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ca3b0857-218d-4ea6-b18b-b51adc613ea8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ca3b0857-218d-4ea6-b18b-b51adc613ea8"}
```
