# Transcript: Ten concurrent purchases are all counted, exactly once

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.LedgerConsistencyTest#concurrentPurchasesSumCorrectly` |
| Features | FEAT-LEDGER-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 25 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 326 | `qa-dcff5c43-3e4b-421e-ad05-16fcf0a7c564` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-6490c7ca-ffed-4d42-aaac-7b76c14dd8f3` |
| 9 | `POST /v1/auth/token` | 200 | 46 | `qa-75226ae3-3423-4725-9325-46f267f4e193` |
| 3 | `POST /v1/auth/token` | 200 | 60 | `qa-24e67dba-0e13-4dad-a9a5-31a66d6f0892` |
| 8 | `POST /v1/auth/token` | 200 | 54 | `qa-520bff61-156c-495b-b748-3e98cd670b96` |
| 4 | `POST /v1/auth/token` | 200 | 67 | `qa-561272df-12df-42fa-a647-2c1603731992` |
| 2 | `POST /v1/auth/token` | 200 | 77 | `qa-36a23189-8410-48d7-bfeb-9dcc82e296f9` |
| 7 | `POST /v1/auth/token` | 200 | 72 | `qa-abfb6c3f-a116-4737-8622-fdbace4febe6` |
| 5 | `POST /v1/auth/token` | 200 | 78 | `qa-cabe45d0-571d-454a-85f2-8c18258f8314` |
| 11 | `POST /v1/auth/token` | 200 | 47 | `qa-ad059619-d9c0-447b-98dd-b03917e0bc15` |
| 10 | `POST /v1/auth/token` | 200 | 68 | `qa-207e1ae4-e512-4783-9d23-e3744635b85d` |
| 17 | `POST /v1/credits/purchases` | 201 | 40 | `qa-238639e7-9e94-439f-9775-1a2aeb3af47d` |
| 19 | `POST /v1/credits/purchases` | 201 | 38 | `qa-d272af85-25d8-4fd0-8d2d-92e498a2cc0c` |
| 16 | `POST /v1/credits/purchases` | 201 | 44 | `qa-3c1716bc-254a-43e0-b475-a0dc0e8086bb` |
| 21 | `POST /v1/credits/purchases` | 201 | 34 | `qa-7d3a732f-b45b-44b0-ada7-df0036af94c9` |
| 14 | `POST /v1/credits/purchases` | 201 | 50 | `qa-9f120c04-7ddc-4c67-a32d-f9b4b3d0862d` |
| 13 | `POST /v1/credits/purchases` | 201 | 54 | `qa-10e8f162-8e55-4824-a7b7-2291203a35e9` |
| 15 | `POST /v1/credits/purchases` | 201 | 51 | `qa-640b0f81-d6b1-4843-b9ae-a509bb7bbe12` |
| 20 | `POST /v1/credits/purchases` | 201 | 44 | `qa-e05a1c5f-ebd0-4c53-80a6-13134c298173` |
| 12 | `POST /v1/credits/purchases` | 201 | 58 | `qa-da589664-bf9c-4e82-8f89-af07ee6d9c8d` |
| 18 | `POST /v1/credits/purchases` | 201 | 50 | `qa-93aba549-c278-47ed-a717-92879ebed283` |
| 22 | `POST /v1/auth/token` | 200 | 11 | `qa-58b36c8d-3158-4df7-9981-da651653dbcf` |
| 23 | `GET /v1/credits/ledger` | 200 | 57 | `qa-fa89af4c-7246-4e50-a98a-91be01ffb9d8` |
| 24 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-9668001b-c4fa-4371-8b87-2a3a8681f254` |
| 25 | `POST /v1/auth/token` | 401 | 11 | `qa-a55907d8-e2eb-4bae-afbb-db7bbbf32c8b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dcff5c43-3e4b-421e-ad05-16fcf0a7c564

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcff5c43-3e4b-421e-ad05-16fcf0a7c564
Content-Type: application/json

--- request body ---
{"handle":"qa-307b376ed7d9","displayName":"QA 307b376ed7d9","password":"****","region":"us"}

--- response: 201 in 326 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcff5c43-3e4b-421e-ad05-16fcf0a7c564
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-307b376ed7d9
X-Served-Region: us
Content-Length: 181

{"id":"acc_f3f1abe5-5695-4916-ab60-770348f28556","handle":"qa-307b376ed7d9","displayName":"QA 307b376ed7d9","region":"us","role":"user","createdAt":"2026-11-10T09:59:33.409463050Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6490c7ca-ffed-4d42-aaac-7b76c14dd8f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6490c7ca-ffed-4d42-aaac-7b76c14dd8f3
Content-Type: application/json

--- request body ---
{"handle":"qa-307b376ed7d9","password":"****"}

--- response: 200 in 47 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6490c7ca-ffed-4d42-aaac-7b76c14dd8f3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3f1abe5-5695-4916-ab60-770348f28556"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-75226ae3-3423-4725-9325-46f267f4e193

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75226ae3-3423-4725-9325-46f267f4e193
Content-Type: application/json

--- request body ---
{"handle":"qa-307b376ed7d9","password":"****"}

--- response: 200 in 46 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-75226ae3-3423-4725-9325-46f267f4e193
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3f1abe5-5695-4916-ab60-770348f28556"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-24e67dba-0e13-4dad-a9a5-31a66d6f0892

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24e67dba-0e13-4dad-a9a5-31a66d6f0892
Content-Type: application/json

--- request body ---
{"handle":"qa-307b376ed7d9","password":"****"}

--- response: 200 in 60 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-24e67dba-0e13-4dad-a9a5-31a66d6f0892
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3f1abe5-5695-4916-ab60-770348f28556"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-520bff61-156c-495b-b748-3e98cd670b96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-520bff61-156c-495b-b748-3e98cd670b96
Content-Type: application/json

--- request body ---
{"handle":"qa-307b376ed7d9","password":"****"}

--- response: 200 in 54 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-520bff61-156c-495b-b748-3e98cd670b96
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3f1abe5-5695-4916-ab60-770348f28556"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-561272df-12df-42fa-a647-2c1603731992

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-561272df-12df-42fa-a647-2c1603731992
Content-Type: application/json

--- request body ---
{"handle":"qa-307b376ed7d9","password":"****"}

--- response: 200 in 67 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-561272df-12df-42fa-a647-2c1603731992
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3f1abe5-5695-4916-ab60-770348f28556"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-36a23189-8410-48d7-bfeb-9dcc82e296f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36a23189-8410-48d7-bfeb-9dcc82e296f9
Content-Type: application/json

--- request body ---
{"handle":"qa-307b376ed7d9","password":"****"}

--- response: 200 in 77 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-36a23189-8410-48d7-bfeb-9dcc82e296f9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3f1abe5-5695-4916-ab60-770348f28556"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-abfb6c3f-a116-4737-8622-fdbace4febe6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abfb6c3f-a116-4737-8622-fdbace4febe6
Content-Type: application/json

--- request body ---
{"handle":"qa-307b376ed7d9","password":"****"}

--- response: 200 in 72 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-abfb6c3f-a116-4737-8622-fdbace4febe6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3f1abe5-5695-4916-ab60-770348f28556"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-cabe45d0-571d-454a-85f2-8c18258f8314

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cabe45d0-571d-454a-85f2-8c18258f8314
Content-Type: application/json

--- request body ---
{"handle":"qa-307b376ed7d9","password":"****"}

--- response: 200 in 78 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-cabe45d0-571d-454a-85f2-8c18258f8314
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3f1abe5-5695-4916-ab60-770348f28556"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-ad059619-d9c0-447b-98dd-b03917e0bc15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad059619-d9c0-447b-98dd-b03917e0bc15
Content-Type: application/json

--- request body ---
{"handle":"qa-307b376ed7d9","password":"****"}

--- response: 200 in 47 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad059619-d9c0-447b-98dd-b03917e0bc15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3f1abe5-5695-4916-ab60-770348f28556"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-207e1ae4-e512-4783-9d23-e3744635b85d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-207e1ae4-e512-4783-9d23-e3744635b85d
Content-Type: application/json

--- request body ---
{"handle":"qa-307b376ed7d9","password":"****"}

--- response: 200 in 68 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-207e1ae4-e512-4783-9d23-e3744635b85d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3f1abe5-5695-4916-ab60-770348f28556"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-238639e7-9e94-439f-9775-1a2aeb3af47d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5300dd6f5312486b9bf6366aad845fda
X-Correlation-Id: qa-238639e7-9e94-439f-9775-1a2aeb3af47d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 40 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-238639e7-9e94-439f-9775-1a2aeb3af47d
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_f7198afd-b3d6-42ed-ac37-d7e2a121d53f
Content-Length: 144

{"id":"pur_f7198afd-b3d6-42ed-ac37-d7e2a121d53f","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-10T09:59:33.828725182Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d272af85-25d8-4fd0-8d2d-92e498a2cc0c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-83af8f89ddaf45bba864d02abbe97078
X-Correlation-Id: qa-d272af85-25d8-4fd0-8d2d-92e498a2cc0c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 38 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d272af85-25d8-4fd0-8d2d-92e498a2cc0c
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_d8ffff80-ce8d-4cad-bc14-5f5d2310ee06
Content-Length: 144

{"id":"pur_d8ffff80-ce8d-4cad-bc14-5f5d2310ee06","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-10T09:59:33.828869507Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3c1716bc-254a-43e0-b475-a0dc0e8086bb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8cbbb2ed1ce4405cb1cc885e2d9a0cb4
X-Correlation-Id: qa-3c1716bc-254a-43e0-b475-a0dc0e8086bb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 44 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c1716bc-254a-43e0-b475-a0dc0e8086bb
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_b31349d0-662f-44db-9520-da49a55bc570
Content-Length: 144

{"id":"pur_b31349d0-662f-44db-9520-da49a55bc570","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-10T09:59:33.827367224Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7d3a732f-b45b-44b0-ada7-df0036af94c9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7c9cd27812e4468a9e96e2200858bf8a
X-Correlation-Id: qa-7d3a732f-b45b-44b0-ada7-df0036af94c9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d3a732f-b45b-44b0-ada7-df0036af94c9
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_0e5fc56a-f5ea-4d9d-8728-e740005f179a
Content-Length: 144

{"id":"pur_0e5fc56a-f5ea-4d9d-8728-e740005f179a","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-10T09:59:33.835439429Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9f120c04-7ddc-4c67-a32d-f9b4b3d0862d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-45642883d0744ab29ea5586767ce2fe5
X-Correlation-Id: qa-9f120c04-7ddc-4c67-a32d-f9b4b3d0862d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 50 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f120c04-7ddc-4c67-a32d-f9b4b3d0862d
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_24f9351f-2971-4cd7-a2a4-ed705cf07c5d
Content-Length: 144

{"id":"pur_24f9351f-2971-4cd7-a2a4-ed705cf07c5d","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-10T09:59:33.834470271Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-10e8f162-8e55-4824-a7b7-2291203a35e9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9a6a086667454265b27f8d9b5e2ce0e7
X-Correlation-Id: qa-10e8f162-8e55-4824-a7b7-2291203a35e9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 54 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-10e8f162-8e55-4824-a7b7-2291203a35e9
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_1852f1b7-bd28-43fc-8b8a-c59abaad55d4
Content-Length: 144

{"id":"pur_1852f1b7-bd28-43fc-8b8a-c59abaad55d4","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-10T09:59:33.828096583Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-640b0f81-d6b1-4843-b9ae-a509bb7bbe12

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fd8576fc8335402bb74d08068ab1e3a5
X-Correlation-Id: qa-640b0f81-d6b1-4843-b9ae-a509bb7bbe12
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 51 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-640b0f81-d6b1-4843-b9ae-a509bb7bbe12
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_6fac3410-2122-4ca5-9e1f-128895e62c45
Content-Length: 144

{"id":"pur_6fac3410-2122-4ca5-9e1f-128895e62c45","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-10T09:59:33.836337981Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e05a1c5f-ebd0-4c53-80a6-13134c298173

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b1f7c9d869404b5486bd50544bb0ccf7
X-Correlation-Id: qa-e05a1c5f-ebd0-4c53-80a6-13134c298173
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 44 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e05a1c5f-ebd0-4c53-80a6-13134c298173
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_a80a991b-2d23-437d-bc30-b27f8f0cf548
Content-Length: 144

{"id":"pur_a80a991b-2d23-437d-bc30-b27f8f0cf548","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-10T09:59:33.836851898Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-da589664-bf9c-4e82-8f89-af07ee6d9c8d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a6aef84cca8b445d8bd561a2797580e0
X-Correlation-Id: qa-da589664-bf9c-4e82-8f89-af07ee6d9c8d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 58 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-da589664-bf9c-4e82-8f89-af07ee6d9c8d
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_0438adfa-1fc2-49f3-a6ae-c5bc60b67e2e
Content-Length: 144

{"id":"pur_0438adfa-1fc2-49f3-a6ae-c5bc60b67e2e","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-10T09:59:33.835937543Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-93aba549-c278-47ed-a717-92879ebed283

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bf5c45b828694adfa29cc370f64d139f
X-Correlation-Id: qa-93aba549-c278-47ed-a717-92879ebed283
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 50 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-93aba549-c278-47ed-a717-92879ebed283
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_1244cfd9-85c3-4155-be21-49d153ff081a
Content-Length: 145

{"id":"pur_1244cfd9-85c3-4155-be21-49d153ff081a","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-10T09:59:33.837367458Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-58b36c8d-3158-4df7-9981-da651653dbcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58b36c8d-3158-4df7-9981-da651653dbcf
Content-Type: application/json

--- request body ---
{"handle":"qa-307b376ed7d9","password":"****"}

--- response: 200 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-58b36c8d-3158-4df7-9981-da651653dbcf
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3f1abe5-5695-4916-ab60-770348f28556"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-fa89af4c-7246-4e50-a98a-91be01ffb9d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa89af4c-7246-4e50-a98a-91be01ffb9d8
Content-Type: application/json

--- response: 200 in 57 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa89af4c-7246-4e50-a98a-91be01ffb9d8
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
X-Served-Region: us
Content-Encoding: gzip
Content-Length: 760

{"items":[{"id":"led_feb198a1-366d-4a60-9e73-39cce1bd9c3e","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-10T09:59:33.409477742Z"},{"id":"led_d1a37802-8971-4aee-b4c6-fc4d7c699cac","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_b31349d0-662f-44db-9520-da49a55bc570","createdAt":"2026-11-10T09:59:33.827367224Z"},{"id":"led_199d5f6a-2947-4008-9634-0664435c0f11","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_1852f1b7-bd28-43fc-8b8a-c59abaad55d4","createdAt":"2026-11-10T09:59:33.828096583Z"},{"id":"led_5b7dc388-0572-43df-84c0-52dae15a0976","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_f7198afd-b3d6-42ed-ac37-d7e2a121d53f","createdAt":"2026-11-10T09:59:33.828725182Z"},{"id":"led_48df8955-8c1e-404a-999b-fd1650e57089","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_d8ffff80-ce8d-4cad-bc14-5f5d2310ee06","createdAt":"2026-11-10T09:59:33.828869507Z"},{"id":"led_290fe835-8a8c-4a06-bc1e-5a09dbd4c1a2","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_24f9351f-2971-4cd7-a2a4-ed705cf07c5d","createdAt":"2026-11-10T09:59:33.834470271Z"},{"id":"led_386f6f57-108e-4749-802c-f30569d0b122","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_0e5fc56a-f5ea-4d9d-8728-e740005f179a","createdAt":"2026-11-10T09:59:33.835439429Z"},{"id":"led_ab512af9-e2b3-4e1d-9d81-379991ba362b","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_0438adfa-1fc2-49f3-a6ae-c5bc60b67e2e","createdAt":"2026-11-10T09:59:33.835937543Z"},{"id":"led_d1fbddfa-3bb1-423d-8967-d240ee057da3","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_6fac3410-2122-4ca5-9e1f-128895e62c45","createdAt":"2026-11-10T09:59:33.836337981Z"},{"id":"led_bd5dcd63-3052-4fea-91b0-007bab6bd9d5","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_a80a991b-2d23-437d-bc30-b27f8f0cf548","createdAt":"2026-11-10T09:59:33.836851898Z"},{"id":"led_cb64f6e3-b51b-4622-87f2-14ba139bf95c","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_1244cfd9-85c3-4155-be21-49d153ff081a","createdAt":"2026-11-10T09:59:33.837367458Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9668001b-c4fa-4371-8b87-2a3a8681f254

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9668001b-c4fa-4371-8b87-2a3a8681f254
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9668001b-c4fa-4371-8b87-2a3a8681f254
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
X-Served-Region: us
```

## 25. POST /v1/auth/token

```text
#25 POST http://localhost:7070/v1/auth/token
correlation: qa-a55907d8-e2eb-4bae-afbb-db7bbbf32c8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a55907d8-e2eb-4bae-afbb-db7bbbf32c8b
Content-Type: application/json

--- request body ---
{"handle":"qa-307b376ed7d9","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a55907d8-e2eb-4bae-afbb-db7bbbf32c8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a55907d8-e2eb-4bae-afbb-db7bbbf32c8b"}
```
