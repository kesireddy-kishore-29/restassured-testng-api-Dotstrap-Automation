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
| 1 | `POST /v1/accounts` | 201 | 345 | `qa-3b337940-2b74-4918-8d28-7c84d651771e` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-2ca978b5-6465-4967-89b3-b058b50906c0` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-dd8bebb7-3f2a-4b11-bd91-e5ecb7060f60` |
| 4 | `POST /v1/credits/purchases` | 201 | 48 | `qa-28123f1b-c9c7-483a-b039-6a5beebb2dbb` |
| 5 | `POST /v1/credits/purchases` | 201 | 7 | `qa-f861711d-c92d-4971-8577-be1c4f619472` |
| 6 | `POST /v1/conversations` | 201 | 4 | `qa-6c1e8fd7-ab72-494d-82e1-46f48615fad8` |
| 7 | `GET /v1/credits/ledger` | 200 | 30 | `qa-d3c1e839-f792-46bf-9c23-05915e58e384` |
| 8 | `GET /v1/credits/balance` | 200 | 11 | `qa-4747ebce-277d-4278-8163-3cec9a9bec5b` |
| 9 | `POST /v1/auth/token` | 200 | 20 | `qa-76bcb7c2-0c88-4b59-9166-93db05fc8a2a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-96c26cc6-da4c-49e6-82cb-87f1574908d9` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-6ce543e7-65e2-48e5-bf6d-475cc10dfe51` |
| 12 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-4fd22fd1-016c-472a-ba15-371f718a12d9` |
| 13 | `POST /v1/auth/token` | 401 | 8 | `qa-08c3ad24-d7aa-49b5-a997-3849aca9e8dd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3b337940-2b74-4918-8d28-7c84d651771e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b337940-2b74-4918-8d28-7c84d651771e
Content-Type: application/json

--- request body ---
{"handle":"qa-bca0a42bfd64","displayName":"QA bca0a42bfd64","password":"****","region":"eu"}

--- response: 201 in 345 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b337940-2b74-4918-8d28-7c84d651771e
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
Location: /v1/accounts/qa-bca0a42bfd64
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7882ecaf-1219-428e-a3d0-506571b3a60a","handle":"qa-bca0a42bfd64","displayName":"QA bca0a42bfd64","region":"eu","role":"user","createdAt":"2026-11-17T10:50:08.168418971Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2ca978b5-6465-4967-89b3-b058b50906c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ca978b5-6465-4967-89b3-b058b50906c0
Content-Type: application/json

--- request body ---
{"handle":"qa-31d7ecc197a1","displayName":"QA 31d7ecc197a1","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ca978b5-6465-4967-89b3-b058b50906c0
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
Location: /v1/accounts/qa-31d7ecc197a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ab5abe5a-1772-4707-9d3a-b7c4ec4ef4d4","handle":"qa-31d7ecc197a1","displayName":"QA 31d7ecc197a1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:08.433791901Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dd8bebb7-3f2a-4b11-bd91-e5ecb7060f60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd8bebb7-3f2a-4b11-bd91-e5ecb7060f60
Content-Type: application/json

--- request body ---
{"handle":"qa-bca0a42bfd64","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd8bebb7-3f2a-4b11-bd91-e5ecb7060f60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7882ecaf-1219-428e-a3d0-506571b3a60a"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-28123f1b-c9c7-483a-b039-6a5beebb2dbb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1cc978cee5ae4b43b337e302800d7cd5
X-Correlation-Id: qa-28123f1b-c9c7-483a-b039-6a5beebb2dbb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 48 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-28123f1b-c9c7-483a-b039-6a5beebb2dbb
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
Location: /v1/credits/purchases/pur_5fe9c9ce-d8fc-41a9-b96e-fcd65f1c0964
Content-Length: 144

{"id":"pur_5fe9c9ce-d8fc-41a9-b96e-fcd65f1c0964","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-17T10:50:08.587130411Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f861711d-c92d-4971-8577-be1c4f619472

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3c28ffc1767c4a2fb1c9440baeb78d9f
X-Correlation-Id: qa-f861711d-c92d-4971-8577-be1c4f619472
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-f861711d-c92d-4971-8577-be1c4f619472
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
Location: /v1/credits/purchases/pur_49b4b141-09d0-48b1-af21-bd1cd558f4c3
Content-Length: 144

{"id":"pur_49b4b141-09d0-48b1-af21-bd1cd558f4c3","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-17T10:50:08.620541390Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-6c1e8fd7-ab72-494d-82e1-46f48615fad8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c1e8fd7-ab72-494d-82e1-46f48615fad8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-31d7ecc197a1","subject":"Paid message","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c1e8fd7-ab72-494d-82e1-46f48615fad8
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
Location: /v1/conversations/cnv_f2c61af8-aaab-4e18-9da0-57e9bf0f84f7
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_f2c61af8-aaab-4e18-9da0-57e9bf0f84f7","subject":"Paid message","status":"open","region":"eu","participants":["qa-bca0a42bfd64","qa-31d7ecc197a1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:08.630572097Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-d3c1e839-f792-46bf-9c23-05915e58e384

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3c1e839-f792-46bf-9c23-05915e58e384
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3c1e839-f792-46bf-9c23-05915e58e384
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

{"items":[{"id":"led_a45ad6b5-cd8d-49cd-b6e5-b3456775a548","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-17T10:50:08.168435195Z"},{"id":"led_581df391-7c59-4a34-8cf1-1c26c265bc5f","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_5fe9c9ce-d8fc-41a9-b96e-fcd65f1c0964","createdAt":"2026-11-17T10:50:08.587130411Z"},{"id":"led_4edfea95-c097-4b45-a5c3-105eebe586e6","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_49b4b141-09d0-48b1-af21-bd1cd558f4c3","createdAt":"2026-11-17T10:50:08.620541390Z"},{"id":"led_e13bdd48-ec64-4c83-a878-0ca7a6230521","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_f2c61af8-aaab-4e18-9da0-57e9bf0f84f7","createdAt":"2026-11-17T10:50:08.630543535Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-4747ebce-277d-4278-8163-3cec9a9bec5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4747ebce-277d-4278-8163-3cec9a9bec5b
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-4747ebce-277d-4278-8163-3cec9a9bec5b
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

{"balance":64,"currency":"credits","accountId":"acc_7882ecaf-1219-428e-a3d0-506571b3a60a"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-76bcb7c2-0c88-4b59-9166-93db05fc8a2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76bcb7c2-0c88-4b59-9166-93db05fc8a2a
Content-Type: application/json

--- request body ---
{"handle":"qa-31d7ecc197a1","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-76bcb7c2-0c88-4b59-9166-93db05fc8a2a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ab5abe5a-1772-4707-9d3a-b7c4ec4ef4d4"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-96c26cc6-da4c-49e6-82cb-87f1574908d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96c26cc6-da4c-49e6-82cb-87f1574908d9
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-96c26cc6-da4c-49e6-82cb-87f1574908d9
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
correlation: qa-6ce543e7-65e2-48e5-bf6d-475cc10dfe51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ce543e7-65e2-48e5-bf6d-475cc10dfe51
Content-Type: application/json

--- request body ---
{"handle":"qa-31d7ecc197a1","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ce543e7-65e2-48e5-bf6d-475cc10dfe51
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ce543e7-65e2-48e5-bf6d-475cc10dfe51"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4fd22fd1-016c-472a-ba15-371f718a12d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fd22fd1-016c-472a-ba15-371f718a12d9
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4fd22fd1-016c-472a-ba15-371f718a12d9
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
correlation: qa-08c3ad24-d7aa-49b5-a997-3849aca9e8dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08c3ad24-d7aa-49b5-a997-3849aca9e8dd
Content-Type: application/json

--- request body ---
{"handle":"qa-bca0a42bfd64","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08c3ad24-d7aa-49b5-a997-3849aca9e8dd
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-08c3ad24-d7aa-49b5-a997-3849aca9e8dd"}
```
