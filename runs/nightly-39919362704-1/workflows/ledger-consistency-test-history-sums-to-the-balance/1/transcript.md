# Transcript: Grants, purchases and spends sum to the balance

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.LedgerConsistencyTest#historySumsToTheBalance` |
| Features | FEAT-LEDGER-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 387 | `qa-a2df347e-1105-40bd-adff-491680a04540` |
| 2 | `POST /v1/accounts` | 201 | 96 | `qa-8898a34b-65c2-4412-b201-8e29b3703aa2` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-b16d413f-f409-470a-bf2a-be189ddc0585` |
| 4 | `POST /v1/credits/purchases` | 201 | 71 | `qa-7fd3c5b9-d88a-4cd2-99fb-e99ac6c1aecb` |
| 5 | `POST /v1/credits/purchases` | 201 | 23 | `qa-01dcb48c-ce95-44d0-872d-21dd9849c08b` |
| 6 | `POST /v1/conversations` | 201 | 22 | `qa-1ea32b89-fadd-45dc-8754-d09c102f6475` |
| 7 | `GET /v1/credits/ledger` | 200 | 40 | `qa-4b256dcb-df5f-407f-93ce-009d9ae2369e` |
| 8 | `GET /v1/credits/balance` | 200 | 25 | `qa-d16d90ff-8678-4822-8161-07f39f0e87ae` |
| 9 | `POST /v1/auth/token` | 200 | 19 | `qa-2af23713-a45b-47fd-bb52-995a71344dcc` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-6a73cf6e-9c61-4b51-b259-8361873b5f71` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-1e260d81-8db5-4882-8839-0683819e73ed` |
| 12 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-f834d93c-b758-4806-8c11-e9a71be2cd38` |
| 13 | `POST /v1/auth/token` | 401 | 23 | `qa-3cdb10c0-de22-4fc1-8865-905620669146` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a2df347e-1105-40bd-adff-491680a04540

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2df347e-1105-40bd-adff-491680a04540
Content-Type: application/json

--- request body ---
{"handle":"qa-f980762e323d","displayName":"QA f980762e323d","password":"****","region":"eu"}

--- response: 201 in 387 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2df347e-1105-40bd-adff-491680a04540
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
Location: /v1/accounts/qa-f980762e323d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_66c4cca8-2ec6-4cea-b62e-8e382fe240b8","handle":"qa-f980762e323d","displayName":"QA f980762e323d","region":"eu","role":"user","createdAt":"2026-10-23T07:41:44.583864180Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8898a34b-65c2-4412-b201-8e29b3703aa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8898a34b-65c2-4412-b201-8e29b3703aa2
Content-Type: application/json

--- request body ---
{"handle":"qa-80b774b9f815","displayName":"QA 80b774b9f815","password":"****","region":"eu"}

--- response: 201 in 96 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-8898a34b-65c2-4412-b201-8e29b3703aa2
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
Location: /v1/accounts/qa-80b774b9f815
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cbc0e847-70b1-41c5-a06c-4e04d5f147f7","handle":"qa-80b774b9f815","displayName":"QA 80b774b9f815","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.013436578Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b16d413f-f409-470a-bf2a-be189ddc0585

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b16d413f-f409-470a-bf2a-be189ddc0585
Content-Type: application/json

--- request body ---
{"handle":"qa-f980762e323d","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-b16d413f-f409-470a-bf2a-be189ddc0585
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_66c4cca8-2ec6-4cea-b62e-8e382fe240b8"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7fd3c5b9-d88a-4cd2-99fb-e99ac6c1aecb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4ffe11e8b2f146f083150dd41a19e05d
X-Correlation-Id: qa-7fd3c5b9-d88a-4cd2-99fb-e99ac6c1aecb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 71 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fd3c5b9-d88a-4cd2-99fb-e99ac6c1aecb
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
X-Served-Region: eu
Location: /v1/credits/purchases/pur_d00d06f1-7e13-4cb9-b2c1-239aa1316ae0
Content-Length: 144

{"id":"pur_d00d06f1-7e13-4cb9-b2c1-239aa1316ae0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-23T07:41:45.234454431Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-01dcb48c-ce95-44d0-872d-21dd9849c08b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1489738dd2784f1095858222fba609ce
X-Correlation-Id: qa-01dcb48c-ce95-44d0-872d-21dd9849c08b
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-01dcb48c-ce95-44d0-872d-21dd9849c08b
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
X-Served-Region: eu
Location: /v1/credits/purchases/pur_1a6786c7-6617-4d8d-aed9-617e71e86c8f
Content-Length: 144

{"id":"pur_1a6786c7-6617-4d8d-aed9-617e71e86c8f","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-10-23T07:41:45.314866839Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-1ea32b89-fadd-45dc-8754-d09c102f6475

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ea32b89-fadd-45dc-8754-d09c102f6475
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-80b774b9f815","subject":"Paid message","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ea32b89-fadd-45dc-8754-d09c102f6475
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
X-Served-Region: eu
Location: /v1/conversations/cnv_4de108ba-4bba-469b-837a-21855751320f
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_4de108ba-4bba-469b-837a-21855751320f","subject":"Paid message","status":"open","region":"eu","participants":["qa-f980762e323d","qa-80b774b9f815"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:45.358126322Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-4b256dcb-df5f-407f-93ce-009d9ae2369e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b256dcb-df5f-407f-93ce-009d9ae2369e
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b256dcb-df5f-407f-93ce-009d9ae2369e
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
X-Served-Region: eu
Content-Length: 791

{"items":[{"id":"led_9b1641d1-cd5d-467f-9411-151f2f32eee8","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-23T07:41:44.583872054Z"},{"id":"led_37ae71cc-e0b5-4f2a-86dd-57058b382bc0","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_d00d06f1-7e13-4cb9-b2c1-239aa1316ae0","createdAt":"2026-10-23T07:41:45.234454431Z"},{"id":"led_21b7f6b0-8d30-44d8-b2e7-24f0a21070ae","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_1a6786c7-6617-4d8d-aed9-617e71e86c8f","createdAt":"2026-10-23T07:41:45.314866839Z"},{"id":"led_d6dfea01-027c-44e3-88ba-4cddd0736b74","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_4de108ba-4bba-469b-837a-21855751320f","createdAt":"2026-10-23T07:41:45.358089934Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-d16d90ff-8678-4822-8161-07f39f0e87ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d16d90ff-8678-4822-8161-07f39f0e87ae
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d16d90ff-8678-4822-8161-07f39f0e87ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 90

{"balance":64,"currency":"credits","accountId":"acc_66c4cca8-2ec6-4cea-b62e-8e382fe240b8"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-2af23713-a45b-47fd-bb52-995a71344dcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2af23713-a45b-47fd-bb52-995a71344dcc
Content-Type: application/json

--- request body ---
{"handle":"qa-80b774b9f815","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-2af23713-a45b-47fd-bb52-995a71344dcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cbc0e847-70b1-41c5-a06c-4e04d5f147f7"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6a73cf6e-9c61-4b51-b259-8361873b5f71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a73cf6e-9c61-4b51-b259-8361873b5f71
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6a73cf6e-9c61-4b51-b259-8361873b5f71
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
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-1e260d81-8db5-4882-8839-0683819e73ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e260d81-8db5-4882-8839-0683819e73ed
Content-Type: application/json

--- request body ---
{"handle":"qa-80b774b9f815","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e260d81-8db5-4882-8839-0683819e73ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1e260d81-8db5-4882-8839-0683819e73ed"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f834d93c-b758-4806-8c11-e9a71be2cd38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f834d93c-b758-4806-8c11-e9a71be2cd38
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f834d93c-b758-4806-8c11-e9a71be2cd38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-3cdb10c0-de22-4fc1-8865-905620669146

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cdb10c0-de22-4fc1-8865-905620669146
Content-Type: application/json

--- request body ---
{"handle":"qa-f980762e323d","password":"****"}

--- response: 401 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3cdb10c0-de22-4fc1-8865-905620669146
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3cdb10c0-de22-4fc1-8865-905620669146"}
```
