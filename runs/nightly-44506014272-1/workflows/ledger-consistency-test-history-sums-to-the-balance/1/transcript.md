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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-d4da7de7-89b9-4671-bbe9-42e3714d7c9c` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-a21b29bf-8f14-41a7-951f-cca5d3fb9993` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-a7cb3dfc-f364-46ca-9587-6d7eec76d763` |
| 4 | `POST /v1/credits/purchases` | 201 | 15 | `qa-98ece14e-a320-4ea5-b130-711ae9c726f6` |
| 5 | `POST /v1/credits/purchases` | 201 | 21 | `qa-e9ee045d-ea86-4697-ac98-32a295fc583a` |
| 6 | `POST /v1/conversations` | 201 | 15 | `qa-317a2f75-b7ca-4c05-bd88-193760b33ce6` |
| 7 | `GET /v1/credits/ledger` | 200 | 10 | `qa-94cf0fe4-2289-4771-ad52-0a99fc061c7c` |
| 8 | `GET /v1/credits/balance` | 200 | 18 | `qa-187f67e7-ae95-41a0-a2fd-8325e99cb8b0` |
| 9 | `POST /v1/auth/token` | 200 | 21 | `qa-776bd98f-b441-4f30-8c59-f7e00d8f74ed` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-37f84a67-eb82-424f-ba64-3f5c46335019` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-4ca89d39-77f6-44c5-bdc6-8d5acfa0bf7e` |
| 12 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-ae4f00b1-a387-4c0c-99ef-8bdd85baa5b6` |
| 13 | `POST /v1/auth/token` | 401 | 15 | `qa-4cb68ebd-cb5f-4c41-a618-4ce57d1f9de0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d4da7de7-89b9-4671-bbe9-42e3714d7c9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4da7de7-89b9-4671-bbe9-42e3714d7c9c
Content-Type: application/json

--- request body ---
{"handle":"qa-1b04a08a824f","displayName":"QA 1b04a08a824f","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4da7de7-89b9-4671-bbe9-42e3714d7c9c
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
Location: /v1/accounts/qa-1b04a08a824f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_661ce14d-11de-4587-9959-1b4c0311c072","handle":"qa-1b04a08a824f","displayName":"QA 1b04a08a824f","region":"eu","role":"user","createdAt":"2026-11-19T10:29:45.622472939Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a21b29bf-8f14-41a7-951f-cca5d3fb9993

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a21b29bf-8f14-41a7-951f-cca5d3fb9993
Content-Type: application/json

--- request body ---
{"handle":"qa-d1ecab9edef6","displayName":"QA d1ecab9edef6","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-a21b29bf-8f14-41a7-951f-cca5d3fb9993
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
Location: /v1/accounts/qa-d1ecab9edef6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c9bb39b0-b528-48a1-9d30-46806c123d6f","handle":"qa-d1ecab9edef6","displayName":"QA d1ecab9edef6","region":"eu","role":"user","createdAt":"2026-11-19T10:29:45.732704844Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a7cb3dfc-f364-46ca-9587-6d7eec76d763

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7cb3dfc-f364-46ca-9587-6d7eec76d763
Content-Type: application/json

--- request body ---
{"handle":"qa-1b04a08a824f","password":"****"}

--- response: 200 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7cb3dfc-f364-46ca-9587-6d7eec76d763
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_661ce14d-11de-4587-9959-1b4c0311c072"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-98ece14e-a320-4ea5-b130-711ae9c726f6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-70e3b251b979454d877a967f0268d4bf
X-Correlation-Id: qa-98ece14e-a320-4ea5-b130-711ae9c726f6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-98ece14e-a320-4ea5-b130-711ae9c726f6
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
Location: /v1/credits/purchases/pur_ec11ae7b-253c-4e1e-b5a7-546455a2da74
Content-Length: 144

{"id":"pur_ec11ae7b-253c-4e1e-b5a7-546455a2da74","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-19T10:29:45.829714203Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e9ee045d-ea86-4697-ac98-32a295fc583a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8a11a183a47c443495262792559e48c8
X-Correlation-Id: qa-e9ee045d-ea86-4697-ac98-32a295fc583a
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9ee045d-ea86-4697-ac98-32a295fc583a
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
Location: /v1/credits/purchases/pur_ec5647f9-f69c-47cf-b86c-1ec906118e5d
Content-Length: 144

{"id":"pur_ec5647f9-f69c-47cf-b86c-1ec906118e5d","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-19T10:29:45.859519101Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-317a2f75-b7ca-4c05-bd88-193760b33ce6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-317a2f75-b7ca-4c05-bd88-193760b33ce6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d1ecab9edef6","subject":"Paid message","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-317a2f75-b7ca-4c05-bd88-193760b33ce6
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
Location: /v1/conversations/cnv_6802f9a0-5d11-4aa9-b134-9b25e0fc954e
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_6802f9a0-5d11-4aa9-b134-9b25e0fc954e","subject":"Paid message","status":"open","region":"eu","participants":["qa-1b04a08a824f","qa-d1ecab9edef6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:45.896394342Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-94cf0fe4-2289-4771-ad52-0a99fc061c7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94cf0fe4-2289-4771-ad52-0a99fc061c7c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-94cf0fe4-2289-4771-ad52-0a99fc061c7c
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

{"items":[{"id":"led_ad761daa-084b-4f7f-b1c1-984f37ef0f43","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-19T10:29:45.622491584Z"},{"id":"led_27c0123f-98bb-4be1-ab88-f535011819f7","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_ec11ae7b-253c-4e1e-b5a7-546455a2da74","createdAt":"2026-11-19T10:29:45.829714203Z"},{"id":"led_c814cc49-c603-420a-a330-69285941183a","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_ec5647f9-f69c-47cf-b86c-1ec906118e5d","createdAt":"2026-11-19T10:29:45.859519101Z"},{"id":"led_8ae6d7b4-7b25-4b78-b76e-efdb53005452","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_6802f9a0-5d11-4aa9-b134-9b25e0fc954e","createdAt":"2026-11-19T10:29:45.896375276Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-187f67e7-ae95-41a0-a2fd-8325e99cb8b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-187f67e7-ae95-41a0-a2fd-8325e99cb8b0
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-187f67e7-ae95-41a0-a2fd-8325e99cb8b0
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

{"balance":64,"currency":"credits","accountId":"acc_661ce14d-11de-4587-9959-1b4c0311c072"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-776bd98f-b441-4f30-8c59-f7e00d8f74ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-776bd98f-b441-4f30-8c59-f7e00d8f74ed
Content-Type: application/json

--- request body ---
{"handle":"qa-d1ecab9edef6","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-776bd98f-b441-4f30-8c59-f7e00d8f74ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c9bb39b0-b528-48a1-9d30-46806c123d6f"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-37f84a67-eb82-424f-ba64-3f5c46335019

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37f84a67-eb82-424f-ba64-3f5c46335019
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-37f84a67-eb82-424f-ba64-3f5c46335019
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
correlation: qa-4ca89d39-77f6-44c5-bdc6-8d5acfa0bf7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ca89d39-77f6-44c5-bdc6-8d5acfa0bf7e
Content-Type: application/json

--- request body ---
{"handle":"qa-d1ecab9edef6","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ca89d39-77f6-44c5-bdc6-8d5acfa0bf7e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4ca89d39-77f6-44c5-bdc6-8d5acfa0bf7e"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae4f00b1-a387-4c0c-99ef-8bdd85baa5b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae4f00b1-a387-4c0c-99ef-8bdd85baa5b6
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae4f00b1-a387-4c0c-99ef-8bdd85baa5b6
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
correlation: qa-4cb68ebd-cb5f-4c41-a618-4ce57d1f9de0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cb68ebd-cb5f-4c41-a618-4ce57d1f9de0
Content-Type: application/json

--- request body ---
{"handle":"qa-1b04a08a824f","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4cb68ebd-cb5f-4c41-a618-4ce57d1f9de0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4cb68ebd-cb5f-4c41-a618-4ce57d1f9de0"}
```
