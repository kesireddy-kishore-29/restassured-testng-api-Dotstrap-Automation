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
| 1 | `POST /v1/accounts` | 201 | 415 | `qa-f0266141-8fd0-4910-aff3-0a8846f72022` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-d1ffb096-483a-4816-857e-e20e0311e79e` |
| 3 | `POST /v1/auth/token` | 200 | 102 | `qa-199f629a-630e-4121-9edb-3912cf7e9f4f` |
| 4 | `POST /v1/credits/purchases` | 201 | 80 | `qa-70a34fab-d482-477d-b343-5fc318caaddf` |
| 5 | `POST /v1/credits/purchases` | 201 | 17 | `qa-cab9ba00-ba73-4cbd-8c01-1bb253e70cbc` |
| 6 | `POST /v1/conversations` | 201 | 14 | `qa-a16ed578-aee6-4751-986a-7144454f2ebc` |
| 7 | `GET /v1/credits/ledger` | 200 | 68 | `qa-d26c7013-02dc-40a7-b3a6-ab4b4b9c5451` |
| 8 | `GET /v1/credits/balance` | 200 | 23 | `qa-5e961855-d34e-4e16-8433-e67d70be0e79` |
| 9 | `POST /v1/auth/token` | 200 | 29 | `qa-8c348695-2b8b-42dd-a595-d189874121c6` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-439c6066-394f-427e-814b-9256669d5031` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-b4a957e1-fb5f-4feb-90b9-6697875415fd` |
| 12 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-8729cb83-3430-48a9-a1ad-1c484e158bf6` |
| 13 | `POST /v1/auth/token` | 401 | 25 | `qa-ab4b3c04-3dbf-4835-8826-a01439c695df` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f0266141-8fd0-4910-aff3-0a8846f72022

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0266141-8fd0-4910-aff3-0a8846f72022
Content-Type: application/json

--- request body ---
{"handle":"qa-0f0f0c22df14","displayName":"QA 0f0f0c22df14","password":"****","region":"eu"}

--- response: 201 in 415 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0266141-8fd0-4910-aff3-0a8846f72022
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
Location: /v1/accounts/qa-0f0f0c22df14
X-Served-Region: eu
Content-Length: 181

{"id":"acc_677e7c2f-fa32-4312-b5f9-967315ecc012","handle":"qa-0f0f0c22df14","displayName":"QA 0f0f0c22df14","region":"eu","role":"user","createdAt":"2026-11-12T09:56:36.735784327Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d1ffb096-483a-4816-857e-e20e0311e79e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1ffb096-483a-4816-857e-e20e0311e79e
Content-Type: application/json

--- request body ---
{"handle":"qa-836a26f245c3","displayName":"QA 836a26f245c3","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1ffb096-483a-4816-857e-e20e0311e79e
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
Location: /v1/accounts/qa-836a26f245c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b9944cbb-49b5-479b-baa0-8b04114d47e0","handle":"qa-836a26f245c3","displayName":"QA 836a26f245c3","region":"eu","role":"user","createdAt":"2026-11-12T09:56:37.119349668Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-199f629a-630e-4121-9edb-3912cf7e9f4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-199f629a-630e-4121-9edb-3912cf7e9f4f
Content-Type: application/json

--- request body ---
{"handle":"qa-0f0f0c22df14","password":"****"}

--- response: 200 in 102 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-199f629a-630e-4121-9edb-3912cf7e9f4f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_677e7c2f-fa32-4312-b5f9-967315ecc012"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-70a34fab-d482-477d-b343-5fc318caaddf

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2bbb36418dbb431f964a05d6b90ba190
X-Correlation-Id: qa-70a34fab-d482-477d-b343-5fc318caaddf
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 80 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-70a34fab-d482-477d-b343-5fc318caaddf
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
Location: /v1/credits/purchases/pur_d0a617f9-5279-4b94-9c44-e7af917f001a
Content-Length: 144

{"id":"pur_d0a617f9-5279-4b94-9c44-e7af917f001a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-12T09:56:37.378015165Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-cab9ba00-ba73-4cbd-8c01-1bb253e70cbc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-30c0f257ed984b65b1170b851777d880
X-Correlation-Id: qa-cab9ba00-ba73-4cbd-8c01-1bb253e70cbc
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-cab9ba00-ba73-4cbd-8c01-1bb253e70cbc
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
Location: /v1/credits/purchases/pur_d7900ad9-f536-47e9-8139-189c6ee9acd9
Content-Length: 144

{"id":"pur_d7900ad9-f536-47e9-8139-189c6ee9acd9","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-12T09:56:37.453287741Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-a16ed578-aee6-4751-986a-7144454f2ebc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a16ed578-aee6-4751-986a-7144454f2ebc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-836a26f245c3","subject":"Paid message","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a16ed578-aee6-4751-986a-7144454f2ebc
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
Location: /v1/conversations/cnv_ab0c63ed-21ea-4385-8add-79c903c88aad
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_ab0c63ed-21ea-4385-8add-79c903c88aad","subject":"Paid message","status":"open","region":"eu","participants":["qa-0f0f0c22df14","qa-836a26f245c3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:37.489650076Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-d26c7013-02dc-40a7-b3a6-ab4b4b9c5451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d26c7013-02dc-40a7-b3a6-ab4b4b9c5451
Content-Type: application/json

--- response: 200 in 68 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d26c7013-02dc-40a7-b3a6-ab4b4b9c5451
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

{"items":[{"id":"led_702b9836-5de0-4589-bd49-827b139fc8a8","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-12T09:56:36.735818860Z"},{"id":"led_638e2b2f-e8ed-408e-a011-e51fc874484f","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_d0a617f9-5279-4b94-9c44-e7af917f001a","createdAt":"2026-11-12T09:56:37.378015165Z"},{"id":"led_d8f8e067-d500-4286-9fc2-5956a2b800fc","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_d7900ad9-f536-47e9-8139-189c6ee9acd9","createdAt":"2026-11-12T09:56:37.453287741Z"},{"id":"led_c3c87fc8-b67c-48bd-ae16-41a286408b1f","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_ab0c63ed-21ea-4385-8add-79c903c88aad","createdAt":"2026-11-12T09:56:37.489605302Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-5e961855-d34e-4e16-8433-e67d70be0e79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e961855-d34e-4e16-8433-e67d70be0e79
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e961855-d34e-4e16-8433-e67d70be0e79
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

{"balance":64,"currency":"credits","accountId":"acc_677e7c2f-fa32-4312-b5f9-967315ecc012"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-8c348695-2b8b-42dd-a595-d189874121c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c348695-2b8b-42dd-a595-d189874121c6
Content-Type: application/json

--- request body ---
{"handle":"qa-836a26f245c3","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c348695-2b8b-42dd-a595-d189874121c6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b9944cbb-49b5-479b-baa0-8b04114d47e0"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-439c6066-394f-427e-814b-9256669d5031

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-439c6066-394f-427e-814b-9256669d5031
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-439c6066-394f-427e-814b-9256669d5031
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
correlation: qa-b4a957e1-fb5f-4feb-90b9-6697875415fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4a957e1-fb5f-4feb-90b9-6697875415fd
Content-Type: application/json

--- request body ---
{"handle":"qa-836a26f245c3","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4a957e1-fb5f-4feb-90b9-6697875415fd
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b4a957e1-fb5f-4feb-90b9-6697875415fd"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8729cb83-3430-48a9-a1ad-1c484e158bf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8729cb83-3430-48a9-a1ad-1c484e158bf6
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8729cb83-3430-48a9-a1ad-1c484e158bf6
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
correlation: qa-ab4b3c04-3dbf-4835-8826-a01439c695df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab4b3c04-3dbf-4835-8826-a01439c695df
Content-Type: application/json

--- request body ---
{"handle":"qa-0f0f0c22df14","password":"****"}

--- response: 401 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab4b3c04-3dbf-4835-8826-a01439c695df
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ab4b3c04-3dbf-4835-8826-a01439c695df"}
```
