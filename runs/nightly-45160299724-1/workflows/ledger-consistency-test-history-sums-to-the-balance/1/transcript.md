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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-a3039d12-7055-4835-bccf-f041e5b27b5b` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-9e5f4ee5-1c98-4a03-85d7-26bbb64b4a01` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-f0df290f-ed6d-4b60-a915-cb2c3bd84edf` |
| 4 | `POST /v1/credits/purchases` | 201 | 21 | `qa-9c0746ca-ae65-4107-85d3-6f7e19ca9675` |
| 5 | `POST /v1/credits/purchases` | 201 | 17 | `qa-f2fa1e0a-c198-456c-a778-74141cf115ca` |
| 6 | `POST /v1/conversations` | 201 | 20 | `qa-761558cd-0210-4187-bad0-0ffdbcf785bd` |
| 7 | `GET /v1/credits/ledger` | 200 | 16 | `qa-36e91cd9-dc42-4016-8e30-593629b5dbc7` |
| 8 | `GET /v1/credits/balance` | 200 | 21 | `qa-34c56b1f-25db-485d-93e7-611e7115ea0e` |
| 9 | `POST /v1/auth/token` | 200 | 23 | `qa-35a4099a-6932-42d1-a6e0-1d8702684da9` |
| 10 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-86a1cbe7-9eff-4e05-8886-a88fcc0c4b6e` |
| 11 | `POST /v1/auth/token` | 401 | 16 | `qa-6b94c84d-ffa3-412d-b182-9070aff50667` |
| 12 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-c3d9d665-cf37-46d5-94c2-c82d7c5b3089` |
| 13 | `POST /v1/auth/token` | 401 | 10 | `qa-03aca11e-9918-447e-845c-fd1f167722f8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a3039d12-7055-4835-bccf-f041e5b27b5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3039d12-7055-4835-bccf-f041e5b27b5b
Content-Type: application/json

--- request body ---
{"handle":"qa-6a0986b061a1","displayName":"QA 6a0986b061a1","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3039d12-7055-4835-bccf-f041e5b27b5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-6a0986b061a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d4986a2a-9637-42ef-9a52-af7da2788c67","handle":"qa-6a0986b061a1","displayName":"QA 6a0986b061a1","region":"eu","role":"user","createdAt":"2026-11-23T10:55:05.226000455Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9e5f4ee5-1c98-4a03-85d7-26bbb64b4a01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e5f4ee5-1c98-4a03-85d7-26bbb64b4a01
Content-Type: application/json

--- request body ---
{"handle":"qa-4ea212d12672","displayName":"QA 4ea212d12672","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e5f4ee5-1c98-4a03-85d7-26bbb64b4a01
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
Location: /v1/accounts/qa-4ea212d12672
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c43f3390-e060-4f00-a7a0-98863b8a874c","handle":"qa-4ea212d12672","displayName":"QA 4ea212d12672","region":"eu","role":"user","createdAt":"2026-11-23T10:55:05.288701451Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f0df290f-ed6d-4b60-a915-cb2c3bd84edf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0df290f-ed6d-4b60-a915-cb2c3bd84edf
Content-Type: application/json

--- request body ---
{"handle":"qa-6a0986b061a1","password":"****"}

--- response: 200 in 35 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0df290f-ed6d-4b60-a915-cb2c3bd84edf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d4986a2a-9637-42ef-9a52-af7da2788c67"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9c0746ca-ae65-4107-85d3-6f7e19ca9675

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c0f87b96a8374b9e9b66fcd4bd2a08c5
X-Correlation-Id: qa-9c0746ca-ae65-4107-85d3-6f7e19ca9675
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 21 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c0746ca-ae65-4107-85d3-6f7e19ca9675
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
Location: /v1/credits/purchases/pur_a7124f72-b885-4033-8e5b-9502605628d2
Content-Length: 144

{"id":"pur_a7124f72-b885-4033-8e5b-9502605628d2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-23T10:55:05.376599726Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f2fa1e0a-c198-456c-a778-74141cf115ca

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3f58ddc4f355420d818e4c3b0ba5fec3
X-Correlation-Id: qa-f2fa1e0a-c198-456c-a778-74141cf115ca
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 17 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2fa1e0a-c198-456c-a778-74141cf115ca
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
Location: /v1/credits/purchases/pur_af841550-b421-44ec-89be-0da94062a982
Content-Length: 144

{"id":"pur_af841550-b421-44ec-89be-0da94062a982","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-23T10:55:05.404985397Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-761558cd-0210-4187-bad0-0ffdbcf785bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-761558cd-0210-4187-bad0-0ffdbcf785bd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4ea212d12672","subject":"Paid message","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-761558cd-0210-4187-bad0-0ffdbcf785bd
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
Location: /v1/conversations/cnv_adf44595-5cf5-4ae9-9819-e030e1f623e3
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_adf44595-5cf5-4ae9-9819-e030e1f623e3","subject":"Paid message","status":"open","region":"eu","participants":["qa-6a0986b061a1","qa-4ea212d12672"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:55:05.445149707Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-36e91cd9-dc42-4016-8e30-593629b5dbc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36e91cd9-dc42-4016-8e30-593629b5dbc7
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-36e91cd9-dc42-4016-8e30-593629b5dbc7
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

{"items":[{"id":"led_6c1d9fd8-2ef7-4ef0-a142-38e04fe2e9ca","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-23T10:55:05.226014691Z"},{"id":"led_f1231369-336a-45b5-87f9-a2ae1f38b250","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_a7124f72-b885-4033-8e5b-9502605628d2","createdAt":"2026-11-23T10:55:05.376599726Z"},{"id":"led_379f6d9d-2157-430c-b0f2-c1ea90d52141","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_af841550-b421-44ec-89be-0da94062a982","createdAt":"2026-11-23T10:55:05.404985397Z"},{"id":"led_3f9db151-9b62-4d2b-9fab-d548679f0f7b","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_adf44595-5cf5-4ae9-9819-e030e1f623e3","createdAt":"2026-11-23T10:55:05.445121751Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-34c56b1f-25db-485d-93e7-611e7115ea0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34c56b1f-25db-485d-93e7-611e7115ea0e
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-34c56b1f-25db-485d-93e7-611e7115ea0e
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

{"balance":64,"currency":"credits","accountId":"acc_d4986a2a-9637-42ef-9a52-af7da2788c67"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-35a4099a-6932-42d1-a6e0-1d8702684da9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35a4099a-6932-42d1-a6e0-1d8702684da9
Content-Type: application/json

--- request body ---
{"handle":"qa-4ea212d12672","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-35a4099a-6932-42d1-a6e0-1d8702684da9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c43f3390-e060-4f00-a7a0-98863b8a874c"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-86a1cbe7-9eff-4e05-8886-a88fcc0c4b6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86a1cbe7-9eff-4e05-8886-a88fcc0c4b6e
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-86a1cbe7-9eff-4e05-8886-a88fcc0c4b6e
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
correlation: qa-6b94c84d-ffa3-412d-b182-9070aff50667

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b94c84d-ffa3-412d-b182-9070aff50667
Content-Type: application/json

--- request body ---
{"handle":"qa-4ea212d12672","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b94c84d-ffa3-412d-b182-9070aff50667
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b94c84d-ffa3-412d-b182-9070aff50667"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c3d9d665-cf37-46d5-94c2-c82d7c5b3089

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3d9d665-cf37-46d5-94c2-c82d7c5b3089
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c3d9d665-cf37-46d5-94c2-c82d7c5b3089
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
correlation: qa-03aca11e-9918-447e-845c-fd1f167722f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03aca11e-9918-447e-845c-fd1f167722f8
Content-Type: application/json

--- request body ---
{"handle":"qa-6a0986b061a1","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03aca11e-9918-447e-845c-fd1f167722f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03aca11e-9918-447e-845c-fd1f167722f8"}
```
