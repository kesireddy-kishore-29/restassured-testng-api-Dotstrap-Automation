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
| 1 | `POST /v1/accounts` | 201 | 394 | `qa-679a3037-96ec-46a1-a5be-a3fefcb5cadd` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-7fc8a6f3-fa76-4a1f-8149-6fe6d2a0d30f` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-0ae4a125-56d5-4f65-9ed9-57a4c2af18bb` |
| 4 | `POST /v1/credits/purchases` | 201 | 37 | `qa-0a10dd4a-f935-4826-9662-c8dd31c6e722` |
| 5 | `POST /v1/credits/purchases` | 201 | 17 | `qa-48772c67-0bd1-410c-8fab-8cf7e7c8aa19` |
| 6 | `POST /v1/conversations` | 201 | 10 | `qa-c28dc7d2-843d-4ef4-899b-d8d78773892d` |
| 7 | `GET /v1/credits/ledger` | 200 | 42 | `qa-f8af2197-1df7-4c54-b982-f3d9f97b18a2` |
| 8 | `GET /v1/credits/balance` | 200 | 13 | `qa-b6db2f4c-e6e3-4461-a721-9a3325de439f` |
| 9 | `POST /v1/auth/token` | 200 | 17 | `qa-3d1fa975-b5da-42cb-9190-617f752b1e2d` |
| 10 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-90faa961-2146-4910-9060-62a29000f995` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-61a65d82-f599-4216-8ed0-fb817eae3663` |
| 12 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-e0ef7fc8-496e-449b-9864-a30820b67bcb` |
| 13 | `POST /v1/auth/token` | 401 | 13 | `qa-22168b4d-38fa-4e84-b007-0b467b4ff967` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-679a3037-96ec-46a1-a5be-a3fefcb5cadd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-679a3037-96ec-46a1-a5be-a3fefcb5cadd
Content-Type: application/json

--- request body ---
{"handle":"qa-0d06fb1f33c3","displayName":"QA 0d06fb1f33c3","password":"****","region":"eu"}

--- response: 201 in 394 ms ---
Date: Wed, 11 Nov 2026 09:34:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-679a3037-96ec-46a1-a5be-a3fefcb5cadd
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
Location: /v1/accounts/qa-0d06fb1f33c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5887665a-4556-4f0e-861e-f8a116aac48f","handle":"qa-0d06fb1f33c3","displayName":"QA 0d06fb1f33c3","region":"eu","role":"user","createdAt":"2026-11-11T09:34:22.942043468Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7fc8a6f3-fa76-4a1f-8149-6fe6d2a0d30f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fc8a6f3-fa76-4a1f-8149-6fe6d2a0d30f
Content-Type: application/json

--- request body ---
{"handle":"qa-2a71719ecbaf","displayName":"QA 2a71719ecbaf","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fc8a6f3-fa76-4a1f-8149-6fe6d2a0d30f
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
Location: /v1/accounts/qa-2a71719ecbaf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3498c4e3-d6f0-49f5-be73-8bddd38ac4a3","handle":"qa-2a71719ecbaf","displayName":"QA 2a71719ecbaf","region":"eu","role":"user","createdAt":"2026-11-11T09:34:23.206169709Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0ae4a125-56d5-4f65-9ed9-57a4c2af18bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ae4a125-56d5-4f65-9ed9-57a4c2af18bb
Content-Type: application/json

--- request body ---
{"handle":"qa-0d06fb1f33c3","password":"****"}

--- response: 200 in 45 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ae4a125-56d5-4f65-9ed9-57a4c2af18bb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5887665a-4556-4f0e-861e-f8a116aac48f"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0a10dd4a-f935-4826-9662-c8dd31c6e722

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a9161da9ae7244c494699dcbc5580261
X-Correlation-Id: qa-0a10dd4a-f935-4826-9662-c8dd31c6e722
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 37 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a10dd4a-f935-4826-9662-c8dd31c6e722
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
Location: /v1/credits/purchases/pur_75695456-061d-4f41-bd07-99b63ecaaddb
Content-Length: 144

{"id":"pur_75695456-061d-4f41-bd07-99b63ecaaddb","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-11T09:34:23.393401846Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-48772c67-0bd1-410c-8fab-8cf7e7c8aa19

--- request headers ---
Accept: application/json
Idempotency-Key: qa-45093658e0884020a2820a8215ddb83f
X-Correlation-Id: qa-48772c67-0bd1-410c-8fab-8cf7e7c8aa19
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-48772c67-0bd1-410c-8fab-8cf7e7c8aa19
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
Location: /v1/credits/purchases/pur_cf2e6c63-6784-484e-ad3a-5531a92fa332
Content-Length: 144

{"id":"pur_cf2e6c63-6784-484e-ad3a-5531a92fa332","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-11T09:34:23.442023456Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-c28dc7d2-843d-4ef4-899b-d8d78773892d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c28dc7d2-843d-4ef4-899b-d8d78773892d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2a71719ecbaf","subject":"Paid message","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c28dc7d2-843d-4ef4-899b-d8d78773892d
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
Location: /v1/conversations/cnv_a4fcbb2d-b043-494e-939d-256762cec8ef
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_a4fcbb2d-b043-494e-939d-256762cec8ef","subject":"Paid message","status":"open","region":"eu","participants":["qa-0d06fb1f33c3","qa-2a71719ecbaf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:23.463912917Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-f8af2197-1df7-4c54-b982-f3d9f97b18a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8af2197-1df7-4c54-b982-f3d9f97b18a2
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8af2197-1df7-4c54-b982-f3d9f97b18a2
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

{"items":[{"id":"led_4d365ee0-97b2-4cc4-8b60-3f692cfd7084","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-11T09:34:22.942062316Z"},{"id":"led_0493bb60-7e52-40a6-8b69-7cfc611357a1","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_75695456-061d-4f41-bd07-99b63ecaaddb","createdAt":"2026-11-11T09:34:23.393401846Z"},{"id":"led_449fb320-2f9b-4e58-adea-7aae846ec935","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_cf2e6c63-6784-484e-ad3a-5531a92fa332","createdAt":"2026-11-11T09:34:23.442023456Z"},{"id":"led_52038965-f3dd-4b03-9131-b78e76cef9f2","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_a4fcbb2d-b043-494e-939d-256762cec8ef","createdAt":"2026-11-11T09:34:23.463884935Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-b6db2f4c-e6e3-4461-a721-9a3325de439f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6db2f4c-e6e3-4461-a721-9a3325de439f
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6db2f4c-e6e3-4461-a721-9a3325de439f
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

{"balance":64,"currency":"credits","accountId":"acc_5887665a-4556-4f0e-861e-f8a116aac48f"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-3d1fa975-b5da-42cb-9190-617f752b1e2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d1fa975-b5da-42cb-9190-617f752b1e2d
Content-Type: application/json

--- request body ---
{"handle":"qa-2a71719ecbaf","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d1fa975-b5da-42cb-9190-617f752b1e2d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3498c4e3-d6f0-49f5-be73-8bddd38ac4a3"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-90faa961-2146-4910-9060-62a29000f995

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90faa961-2146-4910-9060-62a29000f995
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-90faa961-2146-4910-9060-62a29000f995
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
correlation: qa-61a65d82-f599-4216-8ed0-fb817eae3663

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61a65d82-f599-4216-8ed0-fb817eae3663
Content-Type: application/json

--- request body ---
{"handle":"qa-2a71719ecbaf","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61a65d82-f599-4216-8ed0-fb817eae3663
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61a65d82-f599-4216-8ed0-fb817eae3663"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e0ef7fc8-496e-449b-9864-a30820b67bcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0ef7fc8-496e-449b-9864-a30820b67bcb
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e0ef7fc8-496e-449b-9864-a30820b67bcb
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
correlation: qa-22168b4d-38fa-4e84-b007-0b467b4ff967

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22168b4d-38fa-4e84-b007-0b467b4ff967
Content-Type: application/json

--- request body ---
{"handle":"qa-0d06fb1f33c3","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22168b4d-38fa-4e84-b007-0b467b4ff967
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22168b4d-38fa-4e84-b007-0b467b4ff967"}
```
