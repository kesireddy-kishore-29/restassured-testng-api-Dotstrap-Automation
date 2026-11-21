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
| 1 | `POST /v1/accounts` | 201 | 284 | `qa-2c747361-09dc-4bda-a298-84cd7f678e63` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-561747e2-5576-4663-9cf6-2859dfb18ab9` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-6c337b0f-f9be-499d-91de-c394c4c466de` |
| 4 | `POST /v1/credits/purchases` | 201 | 54 | `qa-55a01d6e-f329-4d30-a135-1823b9cc91c5` |
| 5 | `POST /v1/credits/purchases` | 201 | 13 | `qa-0250d547-96a8-43f3-b6a0-e89f49cb94a5` |
| 6 | `POST /v1/conversations` | 201 | 11 | `qa-6b468cfc-e294-48fe-b67e-d64c86bca66a` |
| 7 | `GET /v1/credits/ledger` | 200 | 35 | `qa-8e9cf1f0-7099-45b9-9f00-9cf891c4a550` |
| 8 | `GET /v1/credits/balance` | 200 | 6 | `qa-9306c513-3198-469c-89bb-c6060bf5bc8f` |
| 9 | `POST /v1/auth/token` | 200 | 13 | `qa-5121d2cf-b0ac-4021-9217-fa00ee21694a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-2933fd68-2782-4870-994b-8c37d03811e4` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-1f664e0c-d3e8-4362-b74f-8c0438e9dd5b` |
| 12 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-435738af-fe64-40c9-93bd-04fd08d2528b` |
| 13 | `POST /v1/auth/token` | 401 | 6 | `qa-885ff343-03c0-4772-93bf-dad5f461bee9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2c747361-09dc-4bda-a298-84cd7f678e63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c747361-09dc-4bda-a298-84cd7f678e63
Content-Type: application/json

--- request body ---
{"handle":"qa-e8f5da3dc461","displayName":"QA e8f5da3dc461","password":"****","region":"eu"}

--- response: 201 in 284 ms ---
Date: Wed, 18 Nov 2026 10:19:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c747361-09dc-4bda-a298-84cd7f678e63
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
Location: /v1/accounts/qa-e8f5da3dc461
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9cb6049d-c4aa-4e47-bb09-28d210be24b3","handle":"qa-e8f5da3dc461","displayName":"QA e8f5da3dc461","region":"eu","role":"user","createdAt":"2026-11-18T10:19:39.762966935Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-561747e2-5576-4663-9cf6-2859dfb18ab9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-561747e2-5576-4663-9cf6-2859dfb18ab9
Content-Type: application/json

--- request body ---
{"handle":"qa-9c380215688d","displayName":"QA 9c380215688d","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-561747e2-5576-4663-9cf6-2859dfb18ab9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-9c380215688d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cae52cd5-61e1-4f98-99d1-00bedd843487","handle":"qa-9c380215688d","displayName":"QA 9c380215688d","region":"eu","role":"user","createdAt":"2026-11-18T10:19:40.026052142Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6c337b0f-f9be-499d-91de-c394c4c466de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c337b0f-f9be-499d-91de-c394c4c466de
Content-Type: application/json

--- request body ---
{"handle":"qa-e8f5da3dc461","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c337b0f-f9be-499d-91de-c394c4c466de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9cb6049d-c4aa-4e47-bb09-28d210be24b3"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-55a01d6e-f329-4d30-a135-1823b9cc91c5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6cccce4f7806491ba50811a74c07d28d
X-Correlation-Id: qa-55a01d6e-f329-4d30-a135-1823b9cc91c5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 54 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-55a01d6e-f329-4d30-a135-1823b9cc91c5
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
Location: /v1/credits/purchases/pur_d54c30c6-5ca8-49c3-9ece-f48ecf00bc26
Content-Length: 144

{"id":"pur_d54c30c6-5ca8-49c3-9ece-f48ecf00bc26","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-18T10:19:40.167216195Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0250d547-96a8-43f3-b6a0-e89f49cb94a5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1365bb3c4e6e40b6a0a63a8965d7896e
X-Correlation-Id: qa-0250d547-96a8-43f3-b6a0-e89f49cb94a5
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-0250d547-96a8-43f3-b6a0-e89f49cb94a5
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
Location: /v1/credits/purchases/pur_58634bc2-f17f-4e20-a70a-978bfd5ebee4
Content-Length: 144

{"id":"pur_58634bc2-f17f-4e20-a70a-978bfd5ebee4","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-18T10:19:40.207754277Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-6b468cfc-e294-48fe-b67e-d64c86bca66a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b468cfc-e294-48fe-b67e-d64c86bca66a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9c380215688d","subject":"Paid message","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b468cfc-e294-48fe-b67e-d64c86bca66a
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
Location: /v1/conversations/cnv_7dffefc7-c96d-4145-803a-ec09cc63866d
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_7dffefc7-c96d-4145-803a-ec09cc63866d","subject":"Paid message","status":"open","region":"eu","participants":["qa-e8f5da3dc461","qa-9c380215688d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:40.232149737Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-8e9cf1f0-7099-45b9-9f00-9cf891c4a550

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e9cf1f0-7099-45b9-9f00-9cf891c4a550
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e9cf1f0-7099-45b9-9f00-9cf891c4a550
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

{"items":[{"id":"led_3504a254-f231-4695-995a-0e84fb48a9a1","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-18T10:19:39.762985834Z"},{"id":"led_460e34d7-9087-43df-9b5c-05848e853a7e","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_d54c30c6-5ca8-49c3-9ece-f48ecf00bc26","createdAt":"2026-11-18T10:19:40.167216195Z"},{"id":"led_2cdb0968-19b9-4345-8ebd-6bf77b4adcb0","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_58634bc2-f17f-4e20-a70a-978bfd5ebee4","createdAt":"2026-11-18T10:19:40.207754277Z"},{"id":"led_248ec3eb-b2e6-4c89-b98d-0db5f1c1a9d9","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_7dffefc7-c96d-4145-803a-ec09cc63866d","createdAt":"2026-11-18T10:19:40.232127454Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-9306c513-3198-469c-89bb-c6060bf5bc8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9306c513-3198-469c-89bb-c6060bf5bc8f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-9306c513-3198-469c-89bb-c6060bf5bc8f
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

{"balance":64,"currency":"credits","accountId":"acc_9cb6049d-c4aa-4e47-bb09-28d210be24b3"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-5121d2cf-b0ac-4021-9217-fa00ee21694a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5121d2cf-b0ac-4021-9217-fa00ee21694a
Content-Type: application/json

--- request body ---
{"handle":"qa-9c380215688d","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-5121d2cf-b0ac-4021-9217-fa00ee21694a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cae52cd5-61e1-4f98-99d1-00bedd843487"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2933fd68-2782-4870-994b-8c37d03811e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2933fd68-2782-4870-994b-8c37d03811e4
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2933fd68-2782-4870-994b-8c37d03811e4
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
correlation: qa-1f664e0c-d3e8-4362-b74f-8c0438e9dd5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f664e0c-d3e8-4362-b74f-8c0438e9dd5b
Content-Type: application/json

--- request body ---
{"handle":"qa-9c380215688d","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f664e0c-d3e8-4362-b74f-8c0438e9dd5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f664e0c-d3e8-4362-b74f-8c0438e9dd5b"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-435738af-fe64-40c9-93bd-04fd08d2528b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-435738af-fe64-40c9-93bd-04fd08d2528b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-435738af-fe64-40c9-93bd-04fd08d2528b
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
correlation: qa-885ff343-03c0-4772-93bf-dad5f461bee9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-885ff343-03c0-4772-93bf-dad5f461bee9
Content-Type: application/json

--- request body ---
{"handle":"qa-e8f5da3dc461","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-885ff343-03c0-4772-93bf-dad5f461bee9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-885ff343-03c0-4772-93bf-dad5f461bee9"}
```
