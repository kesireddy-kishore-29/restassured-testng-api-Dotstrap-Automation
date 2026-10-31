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
| 1 | `POST /v1/accounts` | 201 | 245 | `qa-97634601-f381-40f9-9a1b-9f17e78c8209` |
| 2 | `POST /v1/auth/token` | 200 | 46 | `qa-52ddeb0c-0840-4e32-aa99-0af47eaf5671` |
| 3 | `GET /v1/credits/balance` | 200 | 29 | `qa-c887d4f3-0632-4c1f-951e-9ddcd90df269` |
| 4 | `POST /v1/credits/purchases` | 201 | 20 | `qa-c753d435-0af6-4f62-b17b-1faae334df4b` |
| 5 | `GET /v1/credits/ledger` | 200 | 29 | `qa-4e953ba5-2d80-428b-b05f-aa0bc6393936` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-b3b0d4a9-baec-4cc9-87d1-6b9027058358` |
| 7 | `POST /v1/auth/token` | 401 | 31 | `qa-ce5b6297-9cd8-4b74-a681-ef94863e7a8c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-97634601-f381-40f9-9a1b-9f17e78c8209

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97634601-f381-40f9-9a1b-9f17e78c8209
Content-Type: application/json

--- request body ---
{"handle":"qa-4e896279a137","displayName":"QA 4e896279a137","password":"****","region":"in"}

--- response: 201 in 245 ms ---
Date: Wed, 28 Oct 2026 08:42:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-97634601-f381-40f9-9a1b-9f17e78c8209
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-4e896279a137
X-Served-Region: in
Content-Length: 181

{"id":"acc_c37b000e-9585-4121-89f6-4014080c3c85","handle":"qa-4e896279a137","displayName":"QA 4e896279a137","region":"in","role":"user","createdAt":"2026-10-28T08:42:50.649930653Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-52ddeb0c-0840-4e32-aa99-0af47eaf5671

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52ddeb0c-0840-4e32-aa99-0af47eaf5671
Content-Type: application/json

--- request body ---
{"handle":"qa-4e896279a137","password":"****"}

--- response: 200 in 46 ms ---
Date: Wed, 28 Oct 2026 08:42:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-52ddeb0c-0840-4e32-aa99-0af47eaf5671
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c37b000e-9585-4121-89f6-4014080c3c85"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-c887d4f3-0632-4c1f-951e-9ddcd90df269

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c887d4f3-0632-4c1f-951e-9ddcd90df269
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c887d4f3-0632-4c1f-951e-9ddcd90df269
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

{"balance":5,"currency":"credits","accountId":"acc_c37b000e-9585-4121-89f6-4014080c3c85"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c753d435-0af6-4f62-b17b-1faae334df4b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f3dd47bb9ce746a1b43a76d8c324e0de
X-Correlation-Id: qa-c753d435-0af6-4f62-b17b-1faae334df4b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c753d435-0af6-4f62-b17b-1faae334df4b
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
Location: /v1/credits/purchases/pur_7836e77c-c7e8-430f-85a2-ea1f45bad855
Content-Length: 144

{"id":"pur_7836e77c-c7e8-430f-85a2-ea1f45bad855","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-28T08:42:51.055360546Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-4e953ba5-2d80-428b-b05f-aa0bc6393936

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e953ba5-2d80-428b-b05f-aa0bc6393936
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e953ba5-2d80-428b-b05f-aa0bc6393936
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

{"items":[{"id":"led_d7a8b0e6-fd89-44a8-aa25-20cea9ce3bbf","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-28T08:42:50.649941500Z"},{"id":"led_c29aa754-f17d-4624-bdf0-d0df2974cf75","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_7836e77c-c7e8-430f-85a2-ea1f45bad855","createdAt":"2026-10-28T08:42:51.055360546Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b3b0d4a9-baec-4cc9-87d1-6b9027058358

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3b0d4a9-baec-4cc9-87d1-6b9027058358
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b3b0d4a9-baec-4cc9-87d1-6b9027058358
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
correlation: qa-ce5b6297-9cd8-4b74-a681-ef94863e7a8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce5b6297-9cd8-4b74-a681-ef94863e7a8c
Content-Type: application/json

--- request body ---
{"handle":"qa-4e896279a137","password":"****"}

--- response: 401 in 31 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce5b6297-9cd8-4b74-a681-ef94863e7a8c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce5b6297-9cd8-4b74-a681-ef94863e7a8c"}
```
