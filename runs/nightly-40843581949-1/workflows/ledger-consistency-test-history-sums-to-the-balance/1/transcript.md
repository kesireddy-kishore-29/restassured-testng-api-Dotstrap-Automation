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
| 1 | `POST /v1/accounts` | 201 | 492 | `qa-f611eef9-b8fe-4350-9c75-f977fcf329b3` |
| 2 | `POST /v1/accounts` | 201 | 85 | `qa-cb910db9-c9ca-45e2-8c0e-ffb0f1bfbe6b` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-16c2df5b-dd5c-4665-b5c7-598705ae0ab8` |
| 4 | `POST /v1/credits/purchases` | 201 | 43 | `qa-6ddd528e-e634-4397-a8df-ef103181d509` |
| 5 | `POST /v1/credits/purchases` | 201 | 21 | `qa-9af9243e-be33-4296-93b3-3826a9ffa85d` |
| 6 | `POST /v1/conversations` | 201 | 17 | `qa-9303a2ed-b8a3-4800-9e6a-91cd66bf1980` |
| 7 | `GET /v1/credits/ledger` | 200 | 24 | `qa-695e1d6d-3e42-4949-88a1-af6a2a99c294` |
| 8 | `GET /v1/credits/balance` | 200 | 21 | `qa-a2e18e10-1118-49fc-a5e9-c1bb9bd87a20` |
| 9 | `POST /v1/auth/token` | 200 | 18 | `qa-7be95711-5bec-4a12-9bae-720cbed79668` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-289f89bc-b767-4c7d-985e-cd44824f9f51` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-2333aaf3-6140-4462-b20c-5b283c9c4a67` |
| 12 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-806c419b-02c3-4658-b53e-5346af4a4f2b` |
| 13 | `POST /v1/auth/token` | 401 | 14 | `qa-7c0a20c7-51dc-4b9d-8ef8-f7eb2f43400a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f611eef9-b8fe-4350-9c75-f977fcf329b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f611eef9-b8fe-4350-9c75-f977fcf329b3
Content-Type: application/json

--- request body ---
{"handle":"qa-bddc82ee759f","displayName":"QA bddc82ee759f","password":"****","region":"eu"}

--- response: 201 in 492 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f611eef9-b8fe-4350-9c75-f977fcf329b3
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
Location: /v1/accounts/qa-bddc82ee759f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b3b7b33-3868-4e59-a0cd-990b24faba94","handle":"qa-bddc82ee759f","displayName":"QA bddc82ee759f","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.208078886Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cb910db9-c9ca-45e2-8c0e-ffb0f1bfbe6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb910db9-c9ca-45e2-8c0e-ffb0f1bfbe6b
Content-Type: application/json

--- request body ---
{"handle":"qa-cdcbf9eab7fa","displayName":"QA cdcbf9eab7fa","password":"****","region":"eu"}

--- response: 201 in 85 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb910db9-c9ca-45e2-8c0e-ffb0f1bfbe6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Location: /v1/accounts/qa-cdcbf9eab7fa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_afeddd3e-47f6-4f15-84ff-6b45b4c4bcaa","handle":"qa-cdcbf9eab7fa","displayName":"QA cdcbf9eab7fa","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.624943483Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-16c2df5b-dd5c-4665-b5c7-598705ae0ab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16c2df5b-dd5c-4665-b5c7-598705ae0ab8
Content-Type: application/json

--- request body ---
{"handle":"qa-bddc82ee759f","password":"****"}

--- response: 200 in 33 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-16c2df5b-dd5c-4665-b5c7-598705ae0ab8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b3b7b33-3868-4e59-a0cd-990b24faba94"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6ddd528e-e634-4397-a8df-ef103181d509

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5dffbccdea054e2091c4e88f2d507591
X-Correlation-Id: qa-6ddd528e-e634-4397-a8df-ef103181d509
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 43 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ddd528e-e634-4397-a8df-ef103181d509
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
Location: /v1/credits/purchases/pur_2e998412-8817-4a78-bdf0-33d7c81607da
Content-Length: 144

{"id":"pur_2e998412-8817-4a78-bdf0-33d7c81607da","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-29T08:38:57.860479144Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9af9243e-be33-4296-93b3-3826a9ffa85d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a996d066c5824c5f967d17d1f663f973
X-Correlation-Id: qa-9af9243e-be33-4296-93b3-3826a9ffa85d
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 21 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9af9243e-be33-4296-93b3-3826a9ffa85d
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
Location: /v1/credits/purchases/pur_ff1e2b7c-b4f9-46f6-a5cd-7c32d3d302a6
Content-Length: 144

{"id":"pur_ff1e2b7c-b4f9-46f6-a5cd-7c32d3d302a6","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-10-29T08:38:57.918591796Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-9303a2ed-b8a3-4800-9e6a-91cd66bf1980

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9303a2ed-b8a3-4800-9e6a-91cd66bf1980
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cdcbf9eab7fa","subject":"Paid message","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9303a2ed-b8a3-4800-9e6a-91cd66bf1980
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
Location: /v1/conversations/cnv_9f10b006-1dd4-474a-a6cb-571a972c5574
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_9f10b006-1dd4-474a-a6cb-571a972c5574","subject":"Paid message","status":"open","region":"eu","participants":["qa-bddc82ee759f","qa-cdcbf9eab7fa"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:57.973766849Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-695e1d6d-3e42-4949-88a1-af6a2a99c294

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-695e1d6d-3e42-4949-88a1-af6a2a99c294
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-695e1d6d-3e42-4949-88a1-af6a2a99c294
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

{"items":[{"id":"led_d8f6f7c9-cb2d-4596-bd46-589614dc67db","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-29T08:38:57.208910963Z"},{"id":"led_b9bd5a90-e771-4fca-867f-1dd7fd6aa235","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_2e998412-8817-4a78-bdf0-33d7c81607da","createdAt":"2026-10-29T08:38:57.860479144Z"},{"id":"led_1f65cf48-6b85-483b-952b-1b4d33147843","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_ff1e2b7c-b4f9-46f6-a5cd-7c32d3d302a6","createdAt":"2026-10-29T08:38:57.918591796Z"},{"id":"led_ee97bc96-d76b-4076-8239-f52fefe282d7","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_9f10b006-1dd4-474a-a6cb-571a972c5574","createdAt":"2026-10-29T08:38:57.973751180Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-a2e18e10-1118-49fc-a5e9-c1bb9bd87a20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2e18e10-1118-49fc-a5e9-c1bb9bd87a20
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2e18e10-1118-49fc-a5e9-c1bb9bd87a20
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

{"balance":64,"currency":"credits","accountId":"acc_1b3b7b33-3868-4e59-a0cd-990b24faba94"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-7be95711-5bec-4a12-9bae-720cbed79668

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7be95711-5bec-4a12-9bae-720cbed79668
Content-Type: application/json

--- request body ---
{"handle":"qa-cdcbf9eab7fa","password":"****"}

--- response: 200 in 18 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7be95711-5bec-4a12-9bae-720cbed79668
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_afeddd3e-47f6-4f15-84ff-6b45b4c4bcaa"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-289f89bc-b767-4c7d-985e-cd44824f9f51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-289f89bc-b767-4c7d-985e-cd44824f9f51
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-289f89bc-b767-4c7d-985e-cd44824f9f51
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
correlation: qa-2333aaf3-6140-4462-b20c-5b283c9c4a67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2333aaf3-6140-4462-b20c-5b283c9c4a67
Content-Type: application/json

--- request body ---
{"handle":"qa-cdcbf9eab7fa","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2333aaf3-6140-4462-b20c-5b283c9c4a67
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2333aaf3-6140-4462-b20c-5b283c9c4a67"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-806c419b-02c3-4658-b53e-5346af4a4f2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-806c419b-02c3-4658-b53e-5346af4a4f2b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-806c419b-02c3-4658-b53e-5346af4a4f2b
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
correlation: qa-7c0a20c7-51dc-4b9d-8ef8-f7eb2f43400a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c0a20c7-51dc-4b9d-8ef8-f7eb2f43400a
Content-Type: application/json

--- request body ---
{"handle":"qa-bddc82ee759f","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c0a20c7-51dc-4b9d-8ef8-f7eb2f43400a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c0a20c7-51dc-4b9d-8ef8-f7eb2f43400a"}
```
