# Transcript: Six concurrent duplicates: one purchase, five replays, one charge

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#concurrentDuplicatesProduceOnePurchase` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 17 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 293 | `qa-a7303bfa-34a9-42db-a0df-d3212cbd234d` |
| 2 | `POST /v1/auth/token` | 200 | 36 | `qa-5900610e-bc72-480d-a63f-c788751a1532` |
| 5 | `POST /v1/auth/token` | 200 | 30 | `qa-86f5bbec-5750-4530-9bc4-6ff0b5eef033` |
| 4 | `POST /v1/auth/token` | 200 | 41 | `qa-0877af66-8a5c-4fdc-801d-f2957cc29e6a` |
| 7 | `POST /v1/auth/token` | 200 | 35 | `qa-0f0a8092-ef64-413f-a7bf-5cf909ff9958` |
| 6 | `POST /v1/auth/token` | 200 | 54 | `qa-934c3c4d-65d0-4d1c-8bfc-ce3eef343558` |
| 3 | `POST /v1/auth/token` | 200 | 61 | `qa-baf95a4b-9b20-4787-8e49-94dbc19bfc6a` |
| 10 | `POST /v1/credits/purchases` | 200 | 56 | `qa-b8e2769d-3f4e-43f7-95c6-3b1dc0c56bc4` |
| 8 | `POST /v1/credits/purchases` | 200 | 59 | `qa-2ef9a4d1-a018-4fe4-864d-62e033d5bde5` |
| 12 | `POST /v1/credits/purchases` | 200 | 56 | `qa-9c6ce2c4-55d6-45f3-910f-a2c777dccdad` |
| 13 | `POST /v1/credits/purchases` | 201 | 54 | `qa-9327eb0f-d033-45dd-a1b6-b4097ad27326` |
| 9 | `POST /v1/credits/purchases` | 200 | 64 | `qa-7e07211b-5c55-43fc-91d3-1e7885af2ecf` |
| 11 | `POST /v1/credits/purchases` | 200 | 62 | `qa-06860e00-d5c8-4baf-9c0a-2a7ef001c8ed` |
| 14 | `POST /v1/auth/token` | 200 | 10 | `qa-64984bb5-44aa-42ce-bde1-a2ed7b95ace7` |
| 15 | `GET /v1/credits/balance` | 200 | 7 | `qa-c00858a7-8766-49c0-94c8-b5aed43112a5` |
| 16 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-f3ea2d67-2035-4c32-a871-a812a36e79fc` |
| 17 | `POST /v1/auth/token` | 401 | 7 | `qa-d40d883e-494e-422f-b69f-841f3a2fd070` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a7303bfa-34a9-42db-a0df-d3212cbd234d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7303bfa-34a9-42db-a0df-d3212cbd234d
Content-Type: application/json

--- request body ---
{"handle":"qa-24bd9434325f","displayName":"QA 24bd9434325f","password":"****","region":"eu"}

--- response: 201 in 293 ms ---
Date: Thu, 05 Nov 2026 09:37:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7303bfa-34a9-42db-a0df-d3212cbd234d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Location: /v1/accounts/qa-24bd9434325f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eb9b6c97-f636-48a3-bd83-24f45a4fcb20","handle":"qa-24bd9434325f","displayName":"QA 24bd9434325f","region":"eu","role":"user","createdAt":"2026-11-05T09:37:42.690590650Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5900610e-bc72-480d-a63f-c788751a1532

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5900610e-bc72-480d-a63f-c788751a1532
Content-Type: application/json

--- request body ---
{"handle":"qa-24bd9434325f","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-5900610e-bc72-480d-a63f-c788751a1532
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb9b6c97-f636-48a3-bd83-24f45a4fcb20"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-86f5bbec-5750-4530-9bc4-6ff0b5eef033

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86f5bbec-5750-4530-9bc4-6ff0b5eef033
Content-Type: application/json

--- request body ---
{"handle":"qa-24bd9434325f","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-86f5bbec-5750-4530-9bc4-6ff0b5eef033
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb9b6c97-f636-48a3-bd83-24f45a4fcb20"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0877af66-8a5c-4fdc-801d-f2957cc29e6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0877af66-8a5c-4fdc-801d-f2957cc29e6a
Content-Type: application/json

--- request body ---
{"handle":"qa-24bd9434325f","password":"****"}

--- response: 200 in 41 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-0877af66-8a5c-4fdc-801d-f2957cc29e6a
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb9b6c97-f636-48a3-bd83-24f45a4fcb20"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-0f0a8092-ef64-413f-a7bf-5cf909ff9958

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f0a8092-ef64-413f-a7bf-5cf909ff9958
Content-Type: application/json

--- request body ---
{"handle":"qa-24bd9434325f","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f0a8092-ef64-413f-a7bf-5cf909ff9958
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb9b6c97-f636-48a3-bd83-24f45a4fcb20"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-934c3c4d-65d0-4d1c-8bfc-ce3eef343558

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-934c3c4d-65d0-4d1c-8bfc-ce3eef343558
Content-Type: application/json

--- request body ---
{"handle":"qa-24bd9434325f","password":"****"}

--- response: 200 in 54 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-934c3c4d-65d0-4d1c-8bfc-ce3eef343558
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb9b6c97-f636-48a3-bd83-24f45a4fcb20"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-baf95a4b-9b20-4787-8e49-94dbc19bfc6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baf95a4b-9b20-4787-8e49-94dbc19bfc6a
Content-Type: application/json

--- request body ---
{"handle":"qa-24bd9434325f","password":"****"}

--- response: 200 in 61 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-baf95a4b-9b20-4787-8e49-94dbc19bfc6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb9b6c97-f636-48a3-bd83-24f45a4fcb20"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b8e2769d-3f4e-43f7-95c6-3b1dc0c56bc4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c9b9ca748ca949b59783c713cd2c4f82
X-Correlation-Id: qa-b8e2769d-3f4e-43f7-95c6-3b1dc0c56bc4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 56 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8e2769d-3f4e-43f7-95c6-3b1dc0c56bc4
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
Location: /v1/credits/purchases/pur_ab228a9c-478f-4e08-b3de-8490723d578d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_ab228a9c-478f-4e08-b3de-8490723d578d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-05T09:37:43.130853191Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2ef9a4d1-a018-4fe4-864d-62e033d5bde5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c9b9ca748ca949b59783c713cd2c4f82
X-Correlation-Id: qa-2ef9a4d1-a018-4fe4-864d-62e033d5bde5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 59 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ef9a4d1-a018-4fe4-864d-62e033d5bde5
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
Location: /v1/credits/purchases/pur_ab228a9c-478f-4e08-b3de-8490723d578d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_ab228a9c-478f-4e08-b3de-8490723d578d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-05T09:37:43.130853191Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9c6ce2c4-55d6-45f3-910f-a2c777dccdad

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c9b9ca748ca949b59783c713cd2c4f82
X-Correlation-Id: qa-9c6ce2c4-55d6-45f3-910f-a2c777dccdad
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 56 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c6ce2c4-55d6-45f3-910f-a2c777dccdad
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
Location: /v1/credits/purchases/pur_ab228a9c-478f-4e08-b3de-8490723d578d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_ab228a9c-478f-4e08-b3de-8490723d578d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-05T09:37:43.130853191Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9327eb0f-d033-45dd-a1b6-b4097ad27326

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c9b9ca748ca949b59783c713cd2c4f82
X-Correlation-Id: qa-9327eb0f-d033-45dd-a1b6-b4097ad27326
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 54 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-9327eb0f-d033-45dd-a1b6-b4097ad27326
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
Location: /v1/credits/purchases/pur_ab228a9c-478f-4e08-b3de-8490723d578d
Content-Length: 144

{"id":"pur_ab228a9c-478f-4e08-b3de-8490723d578d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-05T09:37:43.130853191Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7e07211b-5c55-43fc-91d3-1e7885af2ecf

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c9b9ca748ca949b59783c713cd2c4f82
X-Correlation-Id: qa-7e07211b-5c55-43fc-91d3-1e7885af2ecf
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 64 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e07211b-5c55-43fc-91d3-1e7885af2ecf
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
Location: /v1/credits/purchases/pur_ab228a9c-478f-4e08-b3de-8490723d578d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_ab228a9c-478f-4e08-b3de-8490723d578d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-05T09:37:43.130853191Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-06860e00-d5c8-4baf-9c0a-2a7ef001c8ed

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c9b9ca748ca949b59783c713cd2c4f82
X-Correlation-Id: qa-06860e00-d5c8-4baf-9c0a-2a7ef001c8ed
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 62 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-06860e00-d5c8-4baf-9c0a-2a7ef001c8ed
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
Location: /v1/credits/purchases/pur_ab228a9c-478f-4e08-b3de-8490723d578d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_ab228a9c-478f-4e08-b3de-8490723d578d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-05T09:37:43.130853191Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-64984bb5-44aa-42ce-bde1-a2ed7b95ace7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64984bb5-44aa-42ce-bde1-a2ed7b95ace7
Content-Type: application/json

--- request body ---
{"handle":"qa-24bd9434325f","password":"****"}

--- response: 200 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-64984bb5-44aa-42ce-bde1-a2ed7b95ace7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb9b6c97-f636-48a3-bd83-24f45a4fcb20"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-c00858a7-8766-49c0-94c8-b5aed43112a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c00858a7-8766-49c0-94c8-b5aed43112a5
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-c00858a7-8766-49c0-94c8-b5aed43112a5
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
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_eb9b6c97-f636-48a3-bd83-24f45a4fcb20"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f3ea2d67-2035-4c32-a871-a812a36e79fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3ea2d67-2035-4c32-a871-a812a36e79fc
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f3ea2d67-2035-4c32-a871-a812a36e79fc
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
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-d40d883e-494e-422f-b69f-841f3a2fd070

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d40d883e-494e-422f-b69f-841f3a2fd070
Content-Type: application/json

--- request body ---
{"handle":"qa-24bd9434325f","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d40d883e-494e-422f-b69f-841f3a2fd070
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d40d883e-494e-422f-b69f-841f3a2fd070"}
```
