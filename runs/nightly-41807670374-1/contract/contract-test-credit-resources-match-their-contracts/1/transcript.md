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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-349f2d3c-b11e-4495-8e69-4f90af148884` |
| 2 | `POST /v1/auth/token` | 200 | 6 | `qa-8cca0fc0-0bee-4dcd-81c6-22f24887d86b` |
| 3 | `GET /v1/credits/balance` | 200 | 8 | `qa-15f155d5-aab0-407f-8e67-755ee7fdf5e9` |
| 4 | `POST /v1/credits/purchases` | 201 | 16 | `qa-6ca6db98-5282-4cac-a92a-8421dbb675b9` |
| 5 | `GET /v1/credits/ledger` | 200 | 6 | `qa-0c5ffa47-d92c-4c5a-a155-3bf3d56a17b9` |
| 6 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-43d34304-b7c9-455c-8adc-4e2b1514c034` |
| 7 | `POST /v1/auth/token` | 401 | 2 | `qa-09f2be2b-ceb0-431f-9992-cf385aa7426b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-349f2d3c-b11e-4495-8e69-4f90af148884

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-349f2d3c-b11e-4495-8e69-4f90af148884
Content-Type: application/json

--- request body ---
{"handle":"qa-083e87ca9a89","displayName":"QA 083e87ca9a89","password":"****","region":"in"}

--- response: 201 in 33 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-349f2d3c-b11e-4495-8e69-4f90af148884
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 7
Location: /v1/accounts/qa-083e87ca9a89
X-Served-Region: in
Content-Length: 181

{"id":"acc_1887ae98-eebc-45ba-9740-512b4aa2498b","handle":"qa-083e87ca9a89","displayName":"QA 083e87ca9a89","region":"in","role":"user","createdAt":"2026-11-04T09:28:04.003501271Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8cca0fc0-0bee-4dcd-81c6-22f24887d86b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cca0fc0-0bee-4dcd-81c6-22f24887d86b
Content-Type: application/json

--- request body ---
{"handle":"qa-083e87ca9a89","password":"****"}

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cca0fc0-0bee-4dcd-81c6-22f24887d86b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1887ae98-eebc-45ba-9740-512b4aa2498b"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-15f155d5-aab0-407f-8e67-755ee7fdf5e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15f155d5-aab0-407f-8e67-755ee7fdf5e9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-15f155d5-aab0-407f-8e67-755ee7fdf5e9
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

{"balance":5,"currency":"credits","accountId":"acc_1887ae98-eebc-45ba-9740-512b4aa2498b"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6ca6db98-5282-4cac-a92a-8421dbb675b9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a3628557cd1f4444ba1fcb0cbeec30fb
X-Correlation-Id: qa-6ca6db98-5282-4cac-a92a-8421dbb675b9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ca6db98-5282-4cac-a92a-8421dbb675b9
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
Location: /v1/credits/purchases/pur_447fb192-ec0c-4522-9ff2-892cd0bb5c33
Content-Length: 144

{"id":"pur_447fb192-ec0c-4522-9ff2-892cd0bb5c33","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-04T09:28:04.030681601Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-0c5ffa47-d92c-4c5a-a155-3bf3d56a17b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c5ffa47-d92c-4c5a-a155-3bf3d56a17b9
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c5ffa47-d92c-4c5a-a155-3bf3d56a17b9
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

{"items":[{"id":"led_0c0b0032-a160-4052-bf77-8baf3928ac60","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-04T09:28:04.003508201Z"},{"id":"led_df25ae52-5a36-4497-b1d7-c3b2a15edb55","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_447fb192-ec0c-4522-9ff2-892cd0bb5c33","createdAt":"2026-11-04T09:28:04.030681601Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43d34304-b7c9-455c-8adc-4e2b1514c034

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43d34304-b7c9-455c-8adc-4e2b1514c034
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43d34304-b7c9-455c-8adc-4e2b1514c034
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
correlation: qa-09f2be2b-ceb0-431f-9992-cf385aa7426b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09f2be2b-ceb0-431f-9992-cf385aa7426b
Content-Type: application/json

--- request body ---
{"handle":"qa-083e87ca9a89","password":"****"}

--- response: 401 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09f2be2b-ceb0-431f-9992-cf385aa7426b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09f2be2b-ceb0-431f-9992-cf385aa7426b"}
```
