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
| 1 | `POST /v1/accounts` | 201 | 504 | `qa-7eca69aa-050c-4f3c-8e42-61cca89cc6d8` |
| 2 | `POST /v1/accounts` | 201 | 91 | `qa-3b8df914-364f-4105-b63e-6062e21a4a7b` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-f62e2297-7bef-4584-b655-c5a145f4d403` |
| 4 | `POST /v1/credits/purchases` | 201 | 44 | `qa-9b267e51-8798-42f1-b113-b02f29e9af4b` |
| 5 | `POST /v1/credits/purchases` | 201 | 18 | `qa-12c7fc75-ddca-4950-8a1c-2b29452922d0` |
| 6 | `POST /v1/conversations` | 201 | 13 | `qa-21335b8e-b40c-49d5-b24c-5a9cb143fc7d` |
| 7 | `GET /v1/credits/ledger` | 200 | 30 | `qa-cf4f0a88-9e0c-4e22-a91c-526e1b396d14` |
| 8 | `GET /v1/credits/balance` | 200 | 20 | `qa-bfb55b89-9a70-4cbc-9e58-bdeee177a862` |
| 9 | `POST /v1/auth/token` | 200 | 21 | `qa-a499a62d-88bc-4b65-9044-b8b055112f9d` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-00f2e4d0-5a39-4d74-9df2-332f02d33e4f` |
| 11 | `POST /v1/auth/token` | 401 | 27 | `qa-26202b92-590b-4d84-b46f-7f7cbc4d09b4` |
| 12 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-bfb42ec2-53c5-420b-b5d0-2f1d33893fed` |
| 13 | `POST /v1/auth/token` | 401 | 14 | `qa-97b95304-4890-421d-9d67-371f2cc9852d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7eca69aa-050c-4f3c-8e42-61cca89cc6d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7eca69aa-050c-4f3c-8e42-61cca89cc6d8
Content-Type: application/json

--- request body ---
{"handle":"qa-b9ead7a80d4e","displayName":"QA b9ead7a80d4e","password":"****","region":"eu"}

--- response: 201 in 504 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-7eca69aa-050c-4f3c-8e42-61cca89cc6d8
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
Location: /v1/accounts/qa-b9ead7a80d4e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9024b072-d09f-47b5-a064-b469f9c5f44b","handle":"qa-b9ead7a80d4e","displayName":"QA b9ead7a80d4e","region":"eu","role":"user","createdAt":"2026-11-04T09:28:13.963449996Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3b8df914-364f-4105-b63e-6062e21a4a7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b8df914-364f-4105-b63e-6062e21a4a7b
Content-Type: application/json

--- request body ---
{"handle":"qa-967f1e776b34","displayName":"QA 967f1e776b34","password":"****","region":"eu"}

--- response: 201 in 91 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b8df914-364f-4105-b63e-6062e21a4a7b
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
Location: /v1/accounts/qa-967f1e776b34
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dcf89bcb-1ce6-4f9a-b3e3-754e5be14197","handle":"qa-967f1e776b34","displayName":"QA 967f1e776b34","region":"eu","role":"user","createdAt":"2026-11-04T09:28:14.484865617Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f62e2297-7bef-4584-b655-c5a145f4d403

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f62e2297-7bef-4584-b655-c5a145f4d403
Content-Type: application/json

--- request body ---
{"handle":"qa-b9ead7a80d4e","password":"****"}

--- response: 200 in 38 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f62e2297-7bef-4584-b655-c5a145f4d403
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9024b072-d09f-47b5-a064-b469f9c5f44b"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9b267e51-8798-42f1-b113-b02f29e9af4b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c7b01446e0cf4efea4415ddf64d5d447
X-Correlation-Id: qa-9b267e51-8798-42f1-b113-b02f29e9af4b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 44 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b267e51-8798-42f1-b113-b02f29e9af4b
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
Location: /v1/credits/purchases/pur_b7a55c8a-ad54-44a4-9307-4124794ae2a9
Content-Length: 144

{"id":"pur_b7a55c8a-ad54-44a4-9307-4124794ae2a9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-04T09:28:14.725222017Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-12c7fc75-ddca-4950-8a1c-2b29452922d0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d3a626b354ec49c885257b3aa8bf93e8
X-Correlation-Id: qa-12c7fc75-ddca-4950-8a1c-2b29452922d0
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-12c7fc75-ddca-4950-8a1c-2b29452922d0
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
Location: /v1/credits/purchases/pur_53c119a4-3b05-40a1-81da-7ed7e4fe5e0a
Content-Length: 144

{"id":"pur_53c119a4-3b05-40a1-81da-7ed7e4fe5e0a","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-04T09:28:14.786575627Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-21335b8e-b40c-49d5-b24c-5a9cb143fc7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21335b8e-b40c-49d5-b24c-5a9cb143fc7d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-967f1e776b34","subject":"Paid message","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-21335b8e-b40c-49d5-b24c-5a9cb143fc7d
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
Location: /v1/conversations/cnv_a94bdc96-2298-44f9-bb20-d8328b620320
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_a94bdc96-2298-44f9-bb20-d8328b620320","subject":"Paid message","status":"open","region":"eu","participants":["qa-b9ead7a80d4e","qa-967f1e776b34"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:14.812381890Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-cf4f0a88-9e0c-4e22-a91c-526e1b396d14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf4f0a88-9e0c-4e22-a91c-526e1b396d14
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf4f0a88-9e0c-4e22-a91c-526e1b396d14
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

{"items":[{"id":"led_e7cc54c9-339e-4513-a3f9-3d21e5897950","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-04T09:28:13.963823527Z"},{"id":"led_14d84419-1926-4ae8-aaf2-9b313e5a49ff","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_b7a55c8a-ad54-44a4-9307-4124794ae2a9","createdAt":"2026-11-04T09:28:14.725222017Z"},{"id":"led_2d3ffa79-41e7-40f9-a137-c4e87ff50058","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_53c119a4-3b05-40a1-81da-7ed7e4fe5e0a","createdAt":"2026-11-04T09:28:14.786575627Z"},{"id":"led_0121dbd0-7710-4522-af86-4757f26a9a2a","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_a94bdc96-2298-44f9-bb20-d8328b620320","createdAt":"2026-11-04T09:28:14.812341935Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-bfb55b89-9a70-4cbc-9e58-bdeee177a862

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfb55b89-9a70-4cbc-9e58-bdeee177a862
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfb55b89-9a70-4cbc-9e58-bdeee177a862
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

{"balance":64,"currency":"credits","accountId":"acc_9024b072-d09f-47b5-a064-b469f9c5f44b"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-a499a62d-88bc-4b65-9044-b8b055112f9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a499a62d-88bc-4b65-9044-b8b055112f9d
Content-Type: application/json

--- request body ---
{"handle":"qa-967f1e776b34","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-a499a62d-88bc-4b65-9044-b8b055112f9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dcf89bcb-1ce6-4f9a-b3e3-754e5be14197"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-00f2e4d0-5a39-4d74-9df2-332f02d33e4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00f2e4d0-5a39-4d74-9df2-332f02d33e4f
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-00f2e4d0-5a39-4d74-9df2-332f02d33e4f
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
correlation: qa-26202b92-590b-4d84-b46f-7f7cbc4d09b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26202b92-590b-4d84-b46f-7f7cbc4d09b4
Content-Type: application/json

--- request body ---
{"handle":"qa-967f1e776b34","password":"****"}

--- response: 401 in 27 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26202b92-590b-4d84-b46f-7f7cbc4d09b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-26202b92-590b-4d84-b46f-7f7cbc4d09b4"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bfb42ec2-53c5-420b-b5d0-2f1d33893fed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfb42ec2-53c5-420b-b5d0-2f1d33893fed
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bfb42ec2-53c5-420b-b5d0-2f1d33893fed
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
correlation: qa-97b95304-4890-421d-9d67-371f2cc9852d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97b95304-4890-421d-9d67-371f2cc9852d
Content-Type: application/json

--- request body ---
{"handle":"qa-b9ead7a80d4e","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-97b95304-4890-421d-9d67-371f2cc9852d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-97b95304-4890-421d-9d67-371f2cc9852d"}
```
