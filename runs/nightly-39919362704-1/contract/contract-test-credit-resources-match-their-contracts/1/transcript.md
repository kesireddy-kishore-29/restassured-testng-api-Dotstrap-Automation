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
| 1 | `POST /v1/accounts` | 201 | 454 | `qa-7fa5305c-3b54-4190-848d-2e358aae8702` |
| 2 | `POST /v1/auth/token` | 200 | 50 | `qa-e0a8dc25-b0aa-46cb-9e07-8e9d4cfc8928` |
| 3 | `GET /v1/credits/balance` | 200 | 66 | `qa-c31530f7-88e6-4ba0-82e3-6f40a23ba2f0` |
| 4 | `POST /v1/credits/purchases` | 201 | 45 | `qa-37337c5c-4f7d-4c75-bcbc-a1a3173e486f` |
| 5 | `GET /v1/credits/ledger` | 200 | 37 | `qa-68cbad7d-03e6-4eba-b800-247b3beca260` |
| 6 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-37f165c8-4d3a-4fda-864e-c179981d1d60` |
| 7 | `POST /v1/auth/token` | 401 | 21 | `qa-4642d22d-2224-4fc4-a46e-b8435052e7f9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7fa5305c-3b54-4190-848d-2e358aae8702

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fa5305c-3b54-4190-848d-2e358aae8702
Content-Type: application/json

--- request body ---
{"handle":"qa-b695323a6140","displayName":"QA b695323a6140","password":"****","region":"in"}

--- response: 201 in 454 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fa5305c-3b54-4190-848d-2e358aae8702
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Location: /v1/accounts/qa-b695323a6140
X-Served-Region: in
Content-Length: 181

{"id":"acc_676e022e-fa48-4f85-8fd4-887db2960b1b","handle":"qa-b695323a6140","displayName":"QA b695323a6140","region":"in","role":"user","createdAt":"2026-10-23T07:41:42.510053911Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e0a8dc25-b0aa-46cb-9e07-8e9d4cfc8928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0a8dc25-b0aa-46cb-9e07-8e9d4cfc8928
Content-Type: application/json

--- request body ---
{"handle":"qa-b695323a6140","password":"****"}

--- response: 200 in 50 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0a8dc25-b0aa-46cb-9e07-8e9d4cfc8928
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_676e022e-fa48-4f85-8fd4-887db2960b1b"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-c31530f7-88e6-4ba0-82e3-6f40a23ba2f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c31530f7-88e6-4ba0-82e3-6f40a23ba2f0
Content-Type: application/json

--- response: 200 in 66 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-c31530f7-88e6-4ba0-82e3-6f40a23ba2f0
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

{"balance":5,"currency":"credits","accountId":"acc_676e022e-fa48-4f85-8fd4-887db2960b1b"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-37337c5c-4f7d-4c75-bcbc-a1a3173e486f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8cd37045f34c46b59366435f3501307d
X-Correlation-Id: qa-37337c5c-4f7d-4c75-bcbc-a1a3173e486f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 45 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-37337c5c-4f7d-4c75-bcbc-a1a3173e486f
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
Location: /v1/credits/purchases/pur_1a527e0d-c937-4cca-af9c-ab87501c06e5
Content-Length: 144

{"id":"pur_1a527e0d-c937-4cca-af9c-ab87501c06e5","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-23T07:41:43.229445965Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-68cbad7d-03e6-4eba-b800-247b3beca260

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68cbad7d-03e6-4eba-b800-247b3beca260
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-68cbad7d-03e6-4eba-b800-247b3beca260
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

{"items":[{"id":"led_58cb1c1f-cb2e-4fa1-a466-f044acf93f14","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-23T07:41:42.510068929Z"},{"id":"led_0befae5e-71f9-4905-abe2-8aeee4ef9f2a","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_1a527e0d-c937-4cca-af9c-ab87501c06e5","createdAt":"2026-10-23T07:41:43.229445965Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-37f165c8-4d3a-4fda-864e-c179981d1d60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37f165c8-4d3a-4fda-864e-c179981d1d60
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-37f165c8-4d3a-4fda-864e-c179981d1d60
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
correlation: qa-4642d22d-2224-4fc4-a46e-b8435052e7f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4642d22d-2224-4fc4-a46e-b8435052e7f9
Content-Type: application/json

--- request body ---
{"handle":"qa-b695323a6140","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4642d22d-2224-4fc4-a46e-b8435052e7f9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4642d22d-2224-4fc4-a46e-b8435052e7f9"}
```
