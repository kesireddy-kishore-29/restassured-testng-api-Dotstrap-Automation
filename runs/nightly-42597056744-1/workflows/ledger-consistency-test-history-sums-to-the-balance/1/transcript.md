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
| 1 | `POST /v1/accounts` | 201 | 395 | `qa-4facc73b-6dad-4f8d-a068-16279f22c896` |
| 2 | `POST /v1/accounts` | 201 | 61 | `qa-95dc8101-17ab-41af-ab38-07df5a3b40e4` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-5e734a42-c4a7-4899-af7d-14a7193c23dd` |
| 4 | `POST /v1/credits/purchases` | 201 | 56 | `qa-96ab051d-3ee6-4e7e-8a70-96121bba853b` |
| 5 | `POST /v1/credits/purchases` | 201 | 11 | `qa-0ddadad1-8401-4506-8de4-d8c8b29451b3` |
| 6 | `POST /v1/conversations` | 201 | 8 | `qa-e98b8b90-5075-4e8a-bcf4-4d29d232c0d7` |
| 7 | `GET /v1/credits/ledger` | 200 | 52 | `qa-3d272abf-53f1-4712-a197-68c98da4e66c` |
| 8 | `GET /v1/credits/balance` | 200 | 27 | `qa-edb02e58-9696-4254-9097-cf802b027a14` |
| 9 | `POST /v1/auth/token` | 200 | 21 | `qa-8cc5c015-6a1a-4415-a4b4-21e08e5bc3a7` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-850c85d9-0866-4928-8f9e-ef228b1d3921` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-6321a177-8bc2-4e3d-b6b9-9ee980cccadb` |
| 12 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-43eb4ebb-5af7-4c18-9cef-79389198301f` |
| 13 | `POST /v1/auth/token` | 401 | 17 | `qa-69c87291-75ee-4fe4-a70a-155a208a1c2c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4facc73b-6dad-4f8d-a068-16279f22c896

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4facc73b-6dad-4f8d-a068-16279f22c896
Content-Type: application/json

--- request body ---
{"handle":"qa-cbf71f38479b","displayName":"QA cbf71f38479b","password":"****","region":"eu"}

--- response: 201 in 395 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4facc73b-6dad-4f8d-a068-16279f22c896
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
Location: /v1/accounts/qa-cbf71f38479b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8831f900-9cd2-4498-aabb-b286a72b8956","handle":"qa-cbf71f38479b","displayName":"QA cbf71f38479b","region":"eu","role":"user","createdAt":"2026-11-09T09:55:59.446869114Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-95dc8101-17ab-41af-ab38-07df5a3b40e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95dc8101-17ab-41af-ab38-07df5a3b40e4
Content-Type: application/json

--- request body ---
{"handle":"qa-cb34fdf18669","displayName":"QA cb34fdf18669","password":"****","region":"eu"}

--- response: 201 in 61 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-95dc8101-17ab-41af-ab38-07df5a3b40e4
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
Location: /v1/accounts/qa-cb34fdf18669
X-Served-Region: eu
Content-Length: 181

{"id":"acc_27fc552c-79b9-41e8-954a-65dfc5a74742","handle":"qa-cb34fdf18669","displayName":"QA cb34fdf18669","region":"eu","role":"user","createdAt":"2026-11-09T09:55:59.845428446Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5e734a42-c4a7-4899-af7d-14a7193c23dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e734a42-c4a7-4899-af7d-14a7193c23dd
Content-Type: application/json

--- request body ---
{"handle":"qa-cbf71f38479b","password":"****"}

--- response: 200 in 38 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e734a42-c4a7-4899-af7d-14a7193c23dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8831f900-9cd2-4498-aabb-b286a72b8956"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-96ab051d-3ee6-4e7e-8a70-96121bba853b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1dc1ec879d7f429ebe1dc342be52cb20
X-Correlation-Id: qa-96ab051d-3ee6-4e7e-8a70-96121bba853b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 56 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-96ab051d-3ee6-4e7e-8a70-96121bba853b
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
Location: /v1/credits/purchases/pur_7b430e9e-adc3-47cb-aece-835facf09c0a
Content-Length: 144

{"id":"pur_7b430e9e-adc3-47cb-aece-835facf09c0a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-09T09:56:00.040199974Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0ddadad1-8401-4506-8de4-d8c8b29451b3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e5cc237b7c15456f8ccf4e456363cf23
X-Correlation-Id: qa-0ddadad1-8401-4506-8de4-d8c8b29451b3
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ddadad1-8401-4506-8de4-d8c8b29451b3
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
Location: /v1/credits/purchases/pur_85309064-aa9d-4529-8bc6-774d96de8d99
Content-Length: 144

{"id":"pur_85309064-aa9d-4529-8bc6-774d96de8d99","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-09T09:56:00.098048126Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-e98b8b90-5075-4e8a-bcf4-4d29d232c0d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e98b8b90-5075-4e8a-bcf4-4d29d232c0d7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cb34fdf18669","subject":"Paid message","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-e98b8b90-5075-4e8a-bcf4-4d29d232c0d7
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
Location: /v1/conversations/cnv_bc2bdb0c-55fd-461e-92b8-177fbb2fa37c
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_bc2bdb0c-55fd-461e-92b8-177fbb2fa37c","subject":"Paid message","status":"open","region":"eu","participants":["qa-cbf71f38479b","qa-cb34fdf18669"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:00.129598895Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-3d272abf-53f1-4712-a197-68c98da4e66c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d272abf-53f1-4712-a197-68c98da4e66c
Content-Type: application/json

--- response: 200 in 52 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d272abf-53f1-4712-a197-68c98da4e66c
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

{"items":[{"id":"led_0eeb625e-f9bc-4640-9b59-a1ce4a7770cb","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-09T09:55:59.447131053Z"},{"id":"led_85b186e4-8859-4298-8a25-ade68cc2dcc9","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_7b430e9e-adc3-47cb-aece-835facf09c0a","createdAt":"2026-11-09T09:56:00.040199974Z"},{"id":"led_2a926c9e-3f8e-45c3-ac01-75efb3d8193e","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_85309064-aa9d-4529-8bc6-774d96de8d99","createdAt":"2026-11-09T09:56:00.098048126Z"},{"id":"led_c1ca1e51-966f-41a9-bb9d-40fc6d167dbb","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_bc2bdb0c-55fd-461e-92b8-177fbb2fa37c","createdAt":"2026-11-09T09:56:00.129559086Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-edb02e58-9696-4254-9097-cf802b027a14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edb02e58-9696-4254-9097-cf802b027a14
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-edb02e58-9696-4254-9097-cf802b027a14
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

{"balance":64,"currency":"credits","accountId":"acc_8831f900-9cd2-4498-aabb-b286a72b8956"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-8cc5c015-6a1a-4415-a4b4-21e08e5bc3a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cc5c015-6a1a-4415-a4b4-21e08e5bc3a7
Content-Type: application/json

--- request body ---
{"handle":"qa-cb34fdf18669","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cc5c015-6a1a-4415-a4b4-21e08e5bc3a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_27fc552c-79b9-41e8-954a-65dfc5a74742"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-850c85d9-0866-4928-8f9e-ef228b1d3921

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-850c85d9-0866-4928-8f9e-ef228b1d3921
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-850c85d9-0866-4928-8f9e-ef228b1d3921
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
correlation: qa-6321a177-8bc2-4e3d-b6b9-9ee980cccadb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6321a177-8bc2-4e3d-b6b9-9ee980cccadb
Content-Type: application/json

--- request body ---
{"handle":"qa-cb34fdf18669","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6321a177-8bc2-4e3d-b6b9-9ee980cccadb
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6321a177-8bc2-4e3d-b6b9-9ee980cccadb"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43eb4ebb-5af7-4c18-9cef-79389198301f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43eb4ebb-5af7-4c18-9cef-79389198301f
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43eb4ebb-5af7-4c18-9cef-79389198301f
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
correlation: qa-69c87291-75ee-4fe4-a70a-155a208a1c2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69c87291-75ee-4fe4-a70a-155a208a1c2c
Content-Type: application/json

--- request body ---
{"handle":"qa-cbf71f38479b","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69c87291-75ee-4fe4-a70a-155a208a1c2c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-69c87291-75ee-4fe4-a70a-155a208a1c2c"}
```
