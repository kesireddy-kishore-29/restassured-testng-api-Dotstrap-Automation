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
| 1 | `POST /v1/accounts` | 201 | 372 | `qa-cdfca574-0444-4891-a4d6-c07ac5ba3adc` |
| 2 | `POST /v1/auth/token` | 200 | 39 | `qa-c97d89ed-f264-4e08-9c1e-e379da0eb54a` |
| 3 | `GET /v1/credits/balance` | 200 | 24 | `qa-d7522464-8437-4b7e-b0b9-08723c80c5fb` |
| 4 | `POST /v1/credits/purchases` | 201 | 15 | `qa-a77342d6-1c29-41fe-9cf5-30bbd71618f1` |
| 5 | `GET /v1/credits/ledger` | 200 | 12 | `qa-61c5fc5f-aaa1-4caf-ac55-03c8608bf83d` |
| 6 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-783251c4-7dc5-4036-b603-b248e387b8fe` |
| 7 | `POST /v1/auth/token` | 401 | 38 | `qa-afdc741c-fb6b-45dd-9682-72777a96a062` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cdfca574-0444-4891-a4d6-c07ac5ba3adc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdfca574-0444-4891-a4d6-c07ac5ba3adc
Content-Type: application/json

--- request body ---
{"handle":"qa-72221dba5679","displayName":"QA 72221dba5679","password":"****","region":"in"}

--- response: 201 in 372 ms ---
Date: Sat, 24 Oct 2026 07:25:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdfca574-0444-4891-a4d6-c07ac5ba3adc
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
Location: /v1/accounts/qa-72221dba5679
X-Served-Region: in
Content-Length: 181

{"id":"acc_72e19047-ec0c-4cf4-9cbe-6c5b2b57c03f","handle":"qa-72221dba5679","displayName":"QA 72221dba5679","region":"in","role":"user","createdAt":"2026-10-24T07:25:00.962045316Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c97d89ed-f264-4e08-9c1e-e379da0eb54a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c97d89ed-f264-4e08-9c1e-e379da0eb54a
Content-Type: application/json

--- request body ---
{"handle":"qa-72221dba5679","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c97d89ed-f264-4e08-9c1e-e379da0eb54a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72e19047-ec0c-4cf4-9cbe-6c5b2b57c03f"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-d7522464-8437-4b7e-b0b9-08723c80c5fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7522464-8437-4b7e-b0b9-08723c80c5fb
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7522464-8437-4b7e-b0b9-08723c80c5fb
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

{"balance":5,"currency":"credits","accountId":"acc_72e19047-ec0c-4cf4-9cbe-6c5b2b57c03f"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a77342d6-1c29-41fe-9cf5-30bbd71618f1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6ade2d57a86a42849211fb49fc58657d
X-Correlation-Id: qa-a77342d6-1c29-41fe-9cf5-30bbd71618f1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a77342d6-1c29-41fe-9cf5-30bbd71618f1
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
Location: /v1/credits/purchases/pur_662f3624-d604-49df-9302-d0914a832d85
Content-Length: 144

{"id":"pur_662f3624-d604-49df-9302-d0914a832d85","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-24T07:25:01.451355816Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-61c5fc5f-aaa1-4caf-ac55-03c8608bf83d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61c5fc5f-aaa1-4caf-ac55-03c8608bf83d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-61c5fc5f-aaa1-4caf-ac55-03c8608bf83d
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

{"items":[{"id":"led_d594b1c2-7eda-4d14-bcda-ed2859293ac5","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-24T07:25:00.962381584Z"},{"id":"led_84e16dce-b9ad-483b-a07f-e70386aab0eb","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_662f3624-d604-49df-9302-d0914a832d85","createdAt":"2026-10-24T07:25:01.451355816Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-783251c4-7dc5-4036-b603-b248e387b8fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-783251c4-7dc5-4036-b603-b248e387b8fe
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-783251c4-7dc5-4036-b603-b248e387b8fe
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
correlation: qa-afdc741c-fb6b-45dd-9682-72777a96a062

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afdc741c-fb6b-45dd-9682-72777a96a062
Content-Type: application/json

--- request body ---
{"handle":"qa-72221dba5679","password":"****"}

--- response: 401 in 38 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-afdc741c-fb6b-45dd-9682-72777a96a062
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-afdc741c-fb6b-45dd-9682-72777a96a062"}
```
