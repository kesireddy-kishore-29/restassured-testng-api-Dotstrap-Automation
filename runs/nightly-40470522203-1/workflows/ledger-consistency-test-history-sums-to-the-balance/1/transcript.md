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
| 1 | `POST /v1/accounts` | 201 | 473 | `qa-abb37709-a977-4e20-89f9-414583da29c8` |
| 2 | `POST /v1/accounts` | 201 | 122 | `qa-fa5fd785-bd56-455e-ad9d-571ce4c3fd9e` |
| 3 | `POST /v1/auth/token` | 200 | 62 | `qa-fcaa5981-95d8-412e-99af-8f501c891a2f` |
| 4 | `POST /v1/credits/purchases` | 201 | 52 | `qa-01b409af-c377-41a1-9762-d199870830e5` |
| 5 | `POST /v1/credits/purchases` | 201 | 14 | `qa-b80109e7-0f9a-4781-8056-50e99de6ba59` |
| 6 | `POST /v1/conversations` | 201 | 16 | `qa-ae5b31a3-2e43-4a1a-ac52-0b82bdc1cd9d` |
| 7 | `GET /v1/credits/ledger` | 200 | 89 | `qa-03df8c59-119b-41e0-9144-e4e911291593` |
| 8 | `GET /v1/credits/balance` | 200 | 20 | `qa-42fa52a7-7ce3-4e5f-aa09-9015751b5939` |
| 9 | `POST /v1/auth/token` | 200 | 23 | `qa-0daa3d2a-0498-4409-9f40-ac8a7e880a38` |
| 10 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-cb80d584-5419-40b2-9121-214beab5a1ec` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-0b6fe08a-c4da-4462-ba27-7bf1498efbe9` |
| 12 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-9126ba94-20e0-4d7a-a2f8-78f77de1e2c2` |
| 13 | `POST /v1/auth/token` | 401 | 14 | `qa-ec615f72-4c1d-4e5f-8bf2-0471fbefa06a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-abb37709-a977-4e20-89f9-414583da29c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abb37709-a977-4e20-89f9-414583da29c8
Content-Type: application/json

--- request body ---
{"handle":"qa-76ef9e7df738","displayName":"QA 76ef9e7df738","password":"****","region":"eu"}

--- response: 201 in 473 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-abb37709-a977-4e20-89f9-414583da29c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-76ef9e7df738
X-Served-Region: eu
Content-Length: 181

{"id":"acc_96d6440f-e38d-408c-ba09-37bd39d9b623","handle":"qa-76ef9e7df738","displayName":"QA 76ef9e7df738","region":"eu","role":"user","createdAt":"2026-10-27T08:00:33.308662660Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fa5fd785-bd56-455e-ad9d-571ce4c3fd9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa5fd785-bd56-455e-ad9d-571ce4c3fd9e
Content-Type: application/json

--- request body ---
{"handle":"qa-59ef3cd20aff","displayName":"QA 59ef3cd20aff","password":"****","region":"eu"}

--- response: 201 in 122 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa5fd785-bd56-455e-ad9d-571ce4c3fd9e
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
Location: /v1/accounts/qa-59ef3cd20aff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cf3313ac-c1f8-4e58-80bc-10c2e08a3ac9","handle":"qa-59ef3cd20aff","displayName":"QA 59ef3cd20aff","region":"eu","role":"user","createdAt":"2026-10-27T08:00:33.836456031Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fcaa5981-95d8-412e-99af-8f501c891a2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcaa5981-95d8-412e-99af-8f501c891a2f
Content-Type: application/json

--- request body ---
{"handle":"qa-76ef9e7df738","password":"****"}

--- response: 200 in 62 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcaa5981-95d8-412e-99af-8f501c891a2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96d6440f-e38d-408c-ba09-37bd39d9b623"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-01b409af-c377-41a1-9762-d199870830e5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1e7151700a5443a2bef2d41aa9ba0f95
X-Correlation-Id: qa-01b409af-c377-41a1-9762-d199870830e5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 52 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-01b409af-c377-41a1-9762-d199870830e5
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
Location: /v1/credits/purchases/pur_49d1fcb9-7fcd-4786-b4f0-103a579a5695
Content-Length: 144

{"id":"pur_49d1fcb9-7fcd-4786-b4f0-103a579a5695","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-27T08:00:34.028189958Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b80109e7-0f9a-4781-8056-50e99de6ba59

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4b2525b8d4794ca39931939c39975bb3
X-Correlation-Id: qa-b80109e7-0f9a-4781-8056-50e99de6ba59
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b80109e7-0f9a-4781-8056-50e99de6ba59
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
Location: /v1/credits/purchases/pur_caaedd72-c70d-46ed-9cb5-f2f2e59f7ee1
Content-Length: 144

{"id":"pur_caaedd72-c70d-46ed-9cb5-f2f2e59f7ee1","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-10-27T08:00:34.098290196Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-ae5b31a3-2e43-4a1a-ac52-0b82bdc1cd9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae5b31a3-2e43-4a1a-ac52-0b82bdc1cd9d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-59ef3cd20aff","subject":"Paid message","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae5b31a3-2e43-4a1a-ac52-0b82bdc1cd9d
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
Location: /v1/conversations/cnv_9428c7a0-0e6b-45d6-b9bf-48874b7f8885
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_9428c7a0-0e6b-45d6-b9bf-48874b7f8885","subject":"Paid message","status":"open","region":"eu","participants":["qa-76ef9e7df738","qa-59ef3cd20aff"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.136987084Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-03df8c59-119b-41e0-9144-e4e911291593

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03df8c59-119b-41e0-9144-e4e911291593
Content-Type: application/json

--- response: 200 in 89 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-03df8c59-119b-41e0-9144-e4e911291593
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

{"items":[{"id":"led_4924e85f-9fbf-4b5d-ac6d-7cdaa1819b4d","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-27T08:00:33.308670675Z"},{"id":"led_d53c9b68-882e-4297-af29-333b9ba07095","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_49d1fcb9-7fcd-4786-b4f0-103a579a5695","createdAt":"2026-10-27T08:00:34.028189958Z"},{"id":"led_2b06e9fe-196c-4cea-9b7a-862c95c9659b","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_caaedd72-c70d-46ed-9cb5-f2f2e59f7ee1","createdAt":"2026-10-27T08:00:34.098290196Z"},{"id":"led_21360872-1c07-45b5-a272-c96af5a4eda9","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_9428c7a0-0e6b-45d6-b9bf-48874b7f8885","createdAt":"2026-10-27T08:00:34.136948031Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-42fa52a7-7ce3-4e5f-aa09-9015751b5939

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42fa52a7-7ce3-4e5f-aa09-9015751b5939
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-42fa52a7-7ce3-4e5f-aa09-9015751b5939
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

{"balance":64,"currency":"credits","accountId":"acc_96d6440f-e38d-408c-ba09-37bd39d9b623"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-0daa3d2a-0498-4409-9f40-ac8a7e880a38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0daa3d2a-0498-4409-9f40-ac8a7e880a38
Content-Type: application/json

--- request body ---
{"handle":"qa-59ef3cd20aff","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0daa3d2a-0498-4409-9f40-ac8a7e880a38
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cf3313ac-c1f8-4e58-80bc-10c2e08a3ac9"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cb80d584-5419-40b2-9121-214beab5a1ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb80d584-5419-40b2-9121-214beab5a1ec
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cb80d584-5419-40b2-9121-214beab5a1ec
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
correlation: qa-0b6fe08a-c4da-4462-ba27-7bf1498efbe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b6fe08a-c4da-4462-ba27-7bf1498efbe9
Content-Type: application/json

--- request body ---
{"handle":"qa-59ef3cd20aff","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b6fe08a-c4da-4462-ba27-7bf1498efbe9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0b6fe08a-c4da-4462-ba27-7bf1498efbe9"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9126ba94-20e0-4d7a-a2f8-78f77de1e2c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9126ba94-20e0-4d7a-a2f8-78f77de1e2c2
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9126ba94-20e0-4d7a-a2f8-78f77de1e2c2
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
correlation: qa-ec615f72-4c1d-4e5f-8bf2-0471fbefa06a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec615f72-4c1d-4e5f-8bf2-0471fbefa06a
Content-Type: application/json

--- request body ---
{"handle":"qa-76ef9e7df738","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec615f72-4c1d-4e5f-8bf2-0471fbefa06a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ec615f72-4c1d-4e5f-8bf2-0471fbefa06a"}
```
