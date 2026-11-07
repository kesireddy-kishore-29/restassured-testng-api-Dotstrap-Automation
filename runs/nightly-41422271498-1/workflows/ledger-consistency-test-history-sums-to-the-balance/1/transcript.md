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
| 1 | `POST /v1/accounts` | 201 | 386 | `qa-97ffae40-cff6-4a7a-be3a-a1a96d906f63` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-84765068-a63a-44f6-9971-8736ee661f91` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-35e93582-46f6-4ef0-90d2-dbe01b6db806` |
| 4 | `POST /v1/credits/purchases` | 201 | 28 | `qa-9ed55706-2b60-4984-aa51-4ee04eb444b0` |
| 5 | `POST /v1/credits/purchases` | 201 | 16 | `qa-3da50c20-5c98-42f6-8612-bd781b45a144` |
| 6 | `POST /v1/conversations` | 201 | 10 | `qa-84a0d892-8cb6-43b5-a7bf-acfca80a721f` |
| 7 | `GET /v1/credits/ledger` | 200 | 24 | `qa-8e9bac2a-0a51-48e4-b7ac-9f966fa464f9` |
| 8 | `GET /v1/credits/balance` | 200 | 8 | `qa-d29512d1-bde9-4a60-bbc7-6f153c5d7e7d` |
| 9 | `POST /v1/auth/token` | 200 | 16 | `qa-4e632de2-8a84-4f1c-9558-105bdfa7d237` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-82b01caf-6e08-4e55-a666-3fc2644e74a3` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-0aa33b70-fdaf-4d32-8ec4-8ad77ee24656` |
| 12 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-f9f1c327-b604-436e-9ec5-a609172de124` |
| 13 | `POST /v1/auth/token` | 401 | 4 | `qa-b9d753af-82dc-450e-b3a3-34ef3078a784` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-97ffae40-cff6-4a7a-be3a-a1a96d906f63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97ffae40-cff6-4a7a-be3a-a1a96d906f63
Content-Type: application/json

--- request body ---
{"handle":"qa-3187e9d965aa","displayName":"QA 3187e9d965aa","password":"****","region":"eu"}

--- response: 201 in 386 ms ---
Date: Mon, 02 Nov 2026 09:38:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-97ffae40-cff6-4a7a-be3a-a1a96d906f63
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
Location: /v1/accounts/qa-3187e9d965aa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cc2006b-ce9b-4501-9559-b8db71b05800","handle":"qa-3187e9d965aa","displayName":"QA 3187e9d965aa","region":"eu","role":"user","createdAt":"2026-11-02T09:38:48.619181829Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-84765068-a63a-44f6-9971-8736ee661f91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84765068-a63a-44f6-9971-8736ee661f91
Content-Type: application/json

--- request body ---
{"handle":"qa-d4fd083b5e58","displayName":"QA d4fd083b5e58","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Mon, 02 Nov 2026 09:38:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-84765068-a63a-44f6-9971-8736ee661f91
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
Location: /v1/accounts/qa-d4fd083b5e58
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0a98564d-99ff-4490-837d-8718edddf89b","handle":"qa-d4fd083b5e58","displayName":"QA d4fd083b5e58","region":"eu","role":"user","createdAt":"2026-11-02T09:38:48.997274583Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-35e93582-46f6-4ef0-90d2-dbe01b6db806

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35e93582-46f6-4ef0-90d2-dbe01b6db806
Content-Type: application/json

--- request body ---
{"handle":"qa-3187e9d965aa","password":"****"}

--- response: 200 in 31 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-35e93582-46f6-4ef0-90d2-dbe01b6db806
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4cc2006b-ce9b-4501-9559-b8db71b05800"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9ed55706-2b60-4984-aa51-4ee04eb444b0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b5f8bd4859ac47e58c963a71dfbcceb7
X-Correlation-Id: qa-9ed55706-2b60-4984-aa51-4ee04eb444b0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 28 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ed55706-2b60-4984-aa51-4ee04eb444b0
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
Location: /v1/credits/purchases/pur_ff2d16e4-bb23-4e84-8334-4d568c35cd67
Content-Length: 144

{"id":"pur_ff2d16e4-bb23-4e84-8334-4d568c35cd67","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-02T09:38:49.167562760Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3da50c20-5c98-42f6-8612-bd781b45a144

--- request headers ---
Accept: application/json
Idempotency-Key: qa-51e264c5f50241ec86696969f9108a89
X-Correlation-Id: qa-3da50c20-5c98-42f6-8612-bd781b45a144
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-3da50c20-5c98-42f6-8612-bd781b45a144
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
Location: /v1/credits/purchases/pur_f3feea7e-6494-4254-b0a8-02b746abf203
Content-Length: 144

{"id":"pur_f3feea7e-6494-4254-b0a8-02b746abf203","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-02T09:38:49.191037874Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-84a0d892-8cb6-43b5-a7bf-acfca80a721f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84a0d892-8cb6-43b5-a7bf-acfca80a721f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d4fd083b5e58","subject":"Paid message","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-84a0d892-8cb6-43b5-a7bf-acfca80a721f
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
Location: /v1/conversations/cnv_4d9a423b-b842-468a-8b28-88e743758652
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_4d9a423b-b842-468a-8b28-88e743758652","subject":"Paid message","status":"open","region":"eu","participants":["qa-3187e9d965aa","qa-d4fd083b5e58"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:49.206103713Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-8e9bac2a-0a51-48e4-b7ac-9f966fa464f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e9bac2a-0a51-48e4-b7ac-9f966fa464f9
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e9bac2a-0a51-48e4-b7ac-9f966fa464f9
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

{"items":[{"id":"led_2372ffb8-835a-426a-84c7-057941b4db86","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-02T09:38:48.619198749Z"},{"id":"led_f68e19bc-ebfb-46fa-a295-37f043467726","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_ff2d16e4-bb23-4e84-8334-4d568c35cd67","createdAt":"2026-11-02T09:38:49.167562760Z"},{"id":"led_2f18f2a8-848b-47f8-9932-8923a66300c9","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_f3feea7e-6494-4254-b0a8-02b746abf203","createdAt":"2026-11-02T09:38:49.191037874Z"},{"id":"led_00bd388f-8d78-4da4-93a1-c697c9af45e9","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_4d9a423b-b842-468a-8b28-88e743758652","createdAt":"2026-11-02T09:38:49.206093477Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-d29512d1-bde9-4a60-bbc7-6f153c5d7e7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d29512d1-bde9-4a60-bbc7-6f153c5d7e7d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-d29512d1-bde9-4a60-bbc7-6f153c5d7e7d
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

{"balance":64,"currency":"credits","accountId":"acc_4cc2006b-ce9b-4501-9559-b8db71b05800"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-4e632de2-8a84-4f1c-9558-105bdfa7d237

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e632de2-8a84-4f1c-9558-105bdfa7d237
Content-Type: application/json

--- request body ---
{"handle":"qa-d4fd083b5e58","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e632de2-8a84-4f1c-9558-105bdfa7d237
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0a98564d-99ff-4490-837d-8718edddf89b"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-82b01caf-6e08-4e55-a666-3fc2644e74a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82b01caf-6e08-4e55-a666-3fc2644e74a3
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-82b01caf-6e08-4e55-a666-3fc2644e74a3
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
correlation: qa-0aa33b70-fdaf-4d32-8ec4-8ad77ee24656

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0aa33b70-fdaf-4d32-8ec4-8ad77ee24656
Content-Type: application/json

--- request body ---
{"handle":"qa-d4fd083b5e58","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0aa33b70-fdaf-4d32-8ec4-8ad77ee24656
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0aa33b70-fdaf-4d32-8ec4-8ad77ee24656"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f9f1c327-b604-436e-9ec5-a609172de124

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9f1c327-b604-436e-9ec5-a609172de124
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f9f1c327-b604-436e-9ec5-a609172de124
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
correlation: qa-b9d753af-82dc-450e-b3a3-34ef3078a784

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9d753af-82dc-450e-b3a3-34ef3078a784
Content-Type: application/json

--- request body ---
{"handle":"qa-3187e9d965aa","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9d753af-82dc-450e-b3a3-34ef3078a784
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b9d753af-82dc-450e-b3a3-34ef3078a784"}
```
