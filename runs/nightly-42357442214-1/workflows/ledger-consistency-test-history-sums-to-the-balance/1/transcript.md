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
| 1 | `POST /v1/accounts` | 201 | 395 | `qa-f110295a-e796-4c9c-8495-d2524d9de5f1` |
| 2 | `POST /v1/accounts` | 201 | 85 | `qa-3a6b7847-d510-4dcc-97e5-2b2c93ef7211` |
| 3 | `POST /v1/auth/token` | 200 | 55 | `qa-0c3313e0-ac16-4643-b78a-df5ee7f5d13b` |
| 4 | `POST /v1/credits/purchases` | 201 | 54 | `qa-f9b197a7-bc08-438f-a156-99a8d2e19909` |
| 5 | `POST /v1/credits/purchases` | 201 | 19 | `qa-ebfa4c29-594c-4d67-846f-c24022103e18` |
| 6 | `POST /v1/conversations` | 201 | 28 | `qa-4b9e1b58-b605-41ed-89c9-2efaca960f2b` |
| 7 | `GET /v1/credits/ledger` | 200 | 65 | `qa-9887b01c-d7eb-46a4-b052-33097cc3daf7` |
| 8 | `GET /v1/credits/balance` | 200 | 13 | `qa-3ca5754f-c216-49c8-903a-9dd7f4883d17` |
| 9 | `POST /v1/auth/token` | 200 | 24 | `qa-74b6b6d7-1094-4b57-9ae2-c1dad208337b` |
| 10 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-448417da-a923-46fe-bb04-471a21a24676` |
| 11 | `POST /v1/auth/token` | 401 | 24 | `qa-b50157e5-ad95-4ae6-a605-18efd2e919a1` |
| 12 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-517afecf-bc36-4d51-beb4-e6b1b0021cfe` |
| 13 | `POST /v1/auth/token` | 401 | 10 | `qa-6b3cf933-8fdd-425f-8bd7-3e146c2c078d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f110295a-e796-4c9c-8495-d2524d9de5f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f110295a-e796-4c9c-8495-d2524d9de5f1
Content-Type: application/json

--- request body ---
{"handle":"qa-49a0b56a1169","displayName":"QA 49a0b56a1169","password":"****","region":"eu"}

--- response: 201 in 395 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f110295a-e796-4c9c-8495-d2524d9de5f1
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
Location: /v1/accounts/qa-49a0b56a1169
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d56fed09-1c39-4350-8836-4dc966fa7673","handle":"qa-49a0b56a1169","displayName":"QA 49a0b56a1169","region":"eu","role":"user","createdAt":"2026-11-07T08:55:03.096769715Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a6b7847-d510-4dcc-97e5-2b2c93ef7211

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a6b7847-d510-4dcc-97e5-2b2c93ef7211
Content-Type: application/json

--- request body ---
{"handle":"qa-d7eb40dc9ad3","displayName":"QA d7eb40dc9ad3","password":"****","region":"eu"}

--- response: 201 in 85 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a6b7847-d510-4dcc-97e5-2b2c93ef7211
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
Location: /v1/accounts/qa-d7eb40dc9ad3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50407a3d-c02f-47d4-8d7a-f60d3f349c71","handle":"qa-d7eb40dc9ad3","displayName":"QA d7eb40dc9ad3","region":"eu","role":"user","createdAt":"2026-11-07T08:55:03.553822691Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0c3313e0-ac16-4643-b78a-df5ee7f5d13b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c3313e0-ac16-4643-b78a-df5ee7f5d13b
Content-Type: application/json

--- request body ---
{"handle":"qa-49a0b56a1169","password":"****"}

--- response: 200 in 55 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c3313e0-ac16-4643-b78a-df5ee7f5d13b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d56fed09-1c39-4350-8836-4dc966fa7673"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f9b197a7-bc08-438f-a156-99a8d2e19909

--- request headers ---
Accept: application/json
Idempotency-Key: qa-29e9eb0783d84c2f9883fcc882702330
X-Correlation-Id: qa-f9b197a7-bc08-438f-a156-99a8d2e19909
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 54 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9b197a7-bc08-438f-a156-99a8d2e19909
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
Location: /v1/credits/purchases/pur_f7b4d76b-da70-4e2f-bb60-fea2a5868cf3
Content-Length: 144

{"id":"pur_f7b4d76b-da70-4e2f-bb60-fea2a5868cf3","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-07T08:55:03.785180528Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ebfa4c29-594c-4d67-846f-c24022103e18

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d62c122d01b841d0b47bf3f73cd47e90
X-Correlation-Id: qa-ebfa4c29-594c-4d67-846f-c24022103e18
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 19 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebfa4c29-594c-4d67-846f-c24022103e18
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
Location: /v1/credits/purchases/pur_bb4ca445-d5da-484b-b7ae-63e34d4d4cb7
Content-Length: 144

{"id":"pur_bb4ca445-d5da-484b-b7ae-63e34d4d4cb7","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-07T08:55:03.838921313Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-4b9e1b58-b605-41ed-89c9-2efaca960f2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b9e1b58-b605-41ed-89c9-2efaca960f2b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d7eb40dc9ad3","subject":"Paid message","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b9e1b58-b605-41ed-89c9-2efaca960f2b
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
Location: /v1/conversations/cnv_304fb448-a2ce-4d39-87d3-960c46802c5c
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_304fb448-a2ce-4d39-87d3-960c46802c5c","subject":"Paid message","status":"open","region":"eu","participants":["qa-49a0b56a1169","qa-d7eb40dc9ad3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:55:03.890825724Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-9887b01c-d7eb-46a4-b052-33097cc3daf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9887b01c-d7eb-46a4-b052-33097cc3daf7
Content-Type: application/json

--- response: 200 in 65 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9887b01c-d7eb-46a4-b052-33097cc3daf7
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

{"items":[{"id":"led_ef396f37-671c-4f7d-bebd-34a17a011547","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-07T08:55:03.096784403Z"},{"id":"led_2e7e1bdf-1292-4d69-961e-d2bdfb9b101f","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_f7b4d76b-da70-4e2f-bb60-fea2a5868cf3","createdAt":"2026-11-07T08:55:03.785180528Z"},{"id":"led_705b8d27-a338-4add-93c5-717baecfdb01","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_bb4ca445-d5da-484b-b7ae-63e34d4d4cb7","createdAt":"2026-11-07T08:55:03.838921313Z"},{"id":"led_d295fcac-0139-4830-9e9a-13af4b5688a8","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_304fb448-a2ce-4d39-87d3-960c46802c5c","createdAt":"2026-11-07T08:55:03.890787942Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-3ca5754f-c216-49c8-903a-9dd7f4883d17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ca5754f-c216-49c8-903a-9dd7f4883d17
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ca5754f-c216-49c8-903a-9dd7f4883d17
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

{"balance":64,"currency":"credits","accountId":"acc_d56fed09-1c39-4350-8836-4dc966fa7673"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-74b6b6d7-1094-4b57-9ae2-c1dad208337b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74b6b6d7-1094-4b57-9ae2-c1dad208337b
Content-Type: application/json

--- request body ---
{"handle":"qa-d7eb40dc9ad3","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-74b6b6d7-1094-4b57-9ae2-c1dad208337b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50407a3d-c02f-47d4-8d7a-f60d3f349c71"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-448417da-a923-46fe-bb04-471a21a24676

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-448417da-a923-46fe-bb04-471a21a24676
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-448417da-a923-46fe-bb04-471a21a24676
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
correlation: qa-b50157e5-ad95-4ae6-a605-18efd2e919a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b50157e5-ad95-4ae6-a605-18efd2e919a1
Content-Type: application/json

--- request body ---
{"handle":"qa-d7eb40dc9ad3","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b50157e5-ad95-4ae6-a605-18efd2e919a1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b50157e5-ad95-4ae6-a605-18efd2e919a1"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-517afecf-bc36-4d51-beb4-e6b1b0021cfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-517afecf-bc36-4d51-beb4-e6b1b0021cfe
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-517afecf-bc36-4d51-beb4-e6b1b0021cfe
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
correlation: qa-6b3cf933-8fdd-425f-8bd7-3e146c2c078d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b3cf933-8fdd-425f-8bd7-3e146c2c078d
Content-Type: application/json

--- request body ---
{"handle":"qa-49a0b56a1169","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b3cf933-8fdd-425f-8bd7-3e146c2c078d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b3cf933-8fdd-425f-8bd7-3e146c2c078d"}
```
