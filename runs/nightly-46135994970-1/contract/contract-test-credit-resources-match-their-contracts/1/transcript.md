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
| 1 | `POST /v1/accounts` | 201 | 414 | `qa-f26ea6b1-fca9-4ccc-87cd-05106bb056c1` |
| 2 | `POST /v1/auth/token` | 200 | 73 | `qa-157eed0d-79a1-4dd6-a0f5-a1d357cb660a` |
| 3 | `GET /v1/credits/balance` | 200 | 62 | `qa-a8cecbf8-ff30-4038-a29b-205f930052ef` |
| 4 | `POST /v1/credits/purchases` | 201 | 44 | `qa-1d5061a2-3344-44c5-be3c-0177e95da740` |
| 5 | `GET /v1/credits/ledger` | 200 | 38 | `qa-118b0305-b7fc-408c-aa81-31a964b458dd` |
| 6 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-4fb38e31-9f35-4618-b871-7e31f418f6ca` |
| 7 | `POST /v1/auth/token` | 401 | 27 | `qa-fea86323-df4e-40a1-af06-e6423f6b8b65` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f26ea6b1-fca9-4ccc-87cd-05106bb056c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f26ea6b1-fca9-4ccc-87cd-05106bb056c1
Content-Type: application/json

--- request body ---
{"handle":"qa-b8830c44226c","displayName":"QA b8830c44226c","password":"****","region":"in"}

--- response: 201 in 414 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-f26ea6b1-fca9-4ccc-87cd-05106bb056c1
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
Location: /v1/accounts/qa-b8830c44226c
X-Served-Region: in
Content-Length: 181

{"id":"acc_6a567650-1a60-47df-b29a-cf3e521df2fe","handle":"qa-b8830c44226c","displayName":"QA b8830c44226c","region":"in","role":"user","createdAt":"2026-11-28T10:37:21.419827037Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-157eed0d-79a1-4dd6-a0f5-a1d357cb660a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-157eed0d-79a1-4dd6-a0f5-a1d357cb660a
Content-Type: application/json

--- request body ---
{"handle":"qa-b8830c44226c","password":"****"}

--- response: 200 in 73 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-157eed0d-79a1-4dd6-a0f5-a1d357cb660a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6a567650-1a60-47df-b29a-cf3e521df2fe"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-a8cecbf8-ff30-4038-a29b-205f930052ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8cecbf8-ff30-4038-a29b-205f930052ef
Content-Type: application/json

--- response: 200 in 62 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8cecbf8-ff30-4038-a29b-205f930052ef
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

{"balance":5,"currency":"credits","accountId":"acc_6a567650-1a60-47df-b29a-cf3e521df2fe"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1d5061a2-3344-44c5-be3c-0177e95da740

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cd6b5d6454244eeb83ea544ee7d27083
X-Correlation-Id: qa-1d5061a2-3344-44c5-be3c-0177e95da740
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 44 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d5061a2-3344-44c5-be3c-0177e95da740
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
Location: /v1/credits/purchases/pur_aa8660be-fda2-4b60-a93e-78a4e00e7fe1
Content-Length: 144

{"id":"pur_aa8660be-fda2-4b60-a93e-78a4e00e7fe1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-28T10:37:22.088571617Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-118b0305-b7fc-408c-aa81-31a964b458dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-118b0305-b7fc-408c-aa81-31a964b458dd
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-118b0305-b7fc-408c-aa81-31a964b458dd
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

{"items":[{"id":"led_34b59f3c-5a9b-483b-843c-c49543fa7db7","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-28T10:37:21.419840733Z"},{"id":"led_4a871959-763d-4b6d-9b2a-d341322ad11b","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_aa8660be-fda2-4b60-a93e-78a4e00e7fe1","createdAt":"2026-11-28T10:37:22.088571617Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4fb38e31-9f35-4618-b871-7e31f418f6ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fb38e31-9f35-4618-b871-7e31f418f6ca
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4fb38e31-9f35-4618-b871-7e31f418f6ca
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
correlation: qa-fea86323-df4e-40a1-af06-e6423f6b8b65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fea86323-df4e-40a1-af06-e6423f6b8b65
Content-Type: application/json

--- request body ---
{"handle":"qa-b8830c44226c","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fea86323-df4e-40a1-af06-e6423f6b8b65
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fea86323-df4e-40a1-af06-e6423f6b8b65"}
```
