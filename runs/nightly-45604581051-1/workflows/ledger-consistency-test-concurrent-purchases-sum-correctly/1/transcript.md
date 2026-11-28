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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-9b6bcb86-de39-452e-b9c6-d84bf1ce695c` |
| 2 | `POST /v1/auth/token` | 200 | 33 | `qa-a8497dbd-1dc6-4f59-b3d6-389324c3157b` |
| 7 | `POST /v1/auth/token` | 200 | 31 | `qa-049b865d-4bec-42ab-b0eb-e2e9cbff8b49` |
| 4 | `POST /v1/auth/token` | 200 | 39 | `qa-656d21a4-1c90-4999-a26c-a1589e558a5f` |
| 8 | `POST /v1/auth/token` | 200 | 42 | `qa-d7c322af-8678-44c9-a131-21ea3d3a2f0d` |
| 9 | `POST /v1/auth/token` | 200 | 43 | `qa-341b832b-4a35-4b16-b856-a44a483f7f25` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-de0c5d29-b4a0-4bc7-8840-3c7040d06f6d` |
| 10 | `POST /v1/auth/token` | 200 | 48 | `qa-73dcee0b-0176-437b-906a-b1fe789dab31` |
| 5 | `POST /v1/auth/token` | 200 | 59 | `qa-7b8a28c5-aa66-494c-a67f-c960a4678624` |
| 3 | `POST /v1/auth/token` | 200 | 71 | `qa-61cd344e-f216-4d7d-a536-bf44696421ef` |
| 11 | `POST /v1/auth/token` | 200 | 62 | `qa-41af9935-2619-4feb-8a1b-00cc59600079` |
| 16 | `POST /v1/credits/purchases` | 201 | 26 | `qa-453a01d2-1307-4b7d-8f49-27003bf7020d` |
| 14 | `POST /v1/credits/purchases` | 201 | 34 | `qa-1d7a5a6f-0ce1-4f72-b6cf-83a5609e0c29` |
| 15 | `POST /v1/credits/purchases` | 201 | 34 | `qa-19e2d014-c389-486c-94ed-cafb84efb1b6` |
| 13 | `POST /v1/credits/purchases` | 201 | 51 | `qa-975431ae-252b-4eb0-9ea8-9bc47e37cbea` |
| 19 | `POST /v1/credits/purchases` | 201 | 33 | `qa-8b2ecbde-cf3a-4553-bc14-06f8f502edde` |
| 12 | `POST /v1/credits/purchases` | 201 | 57 | `qa-f294e5cd-c40e-4246-885d-5f1f2893c77c` |
| 18 | `POST /v1/credits/purchases` | 201 | 39 | `qa-dbadd952-e67a-40ce-8e65-1c9db510e52a` |
| 17 | `POST /v1/credits/purchases` | 201 | 47 | `qa-7e56cca6-a6af-4281-81fd-ad42baa39868` |
| 21 | `POST /v1/credits/purchases` | 201 | 23 | `qa-855b89f7-318f-47d1-a864-6f8b7a03f7b4` |
| 20 | `POST /v1/credits/purchases` | 201 | 30 | `qa-03e607db-ce3a-416f-a5b8-dfc5c3e452f7` |
| 22 | `POST /v1/auth/token` | 200 | 26 | `qa-92477cd8-e934-4dc1-bd15-b3b287f50e18` |
| 23 | `GET /v1/credits/ledger` | 200 | 45 | `qa-08bce5aa-4820-46ce-a10b-dc1c4ffdd528` |
| 24 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-aaefd44a-f638-496d-998a-2d89af317728` |
| 25 | `POST /v1/auth/token` | 401 | 15 | `qa-013377a9-5c0b-4d63-b438-a5a785df0e89` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9b6bcb86-de39-452e-b9c6-d84bf1ce695c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b6bcb86-de39-452e-b9c6-d84bf1ce695c
Content-Type: application/json

--- request body ---
{"handle":"qa-30c21aa26f11","displayName":"QA 30c21aa26f11","password":"****","region":"us"}

--- response: 201 in 28 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b6bcb86-de39-452e-b9c6-d84bf1ce695c
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
Location: /v1/accounts/qa-30c21aa26f11
X-Served-Region: us
Content-Length: 181

{"id":"acc_582590d3-41ad-4b5e-87df-8e14faf54467","handle":"qa-30c21aa26f11","displayName":"QA 30c21aa26f11","region":"us","role":"user","createdAt":"2026-11-25T11:27:54.515060169Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a8497dbd-1dc6-4f59-b3d6-389324c3157b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8497dbd-1dc6-4f59-b3d6-389324c3157b
Content-Type: application/json

--- request body ---
{"handle":"qa-30c21aa26f11","password":"****"}

--- response: 200 in 33 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8497dbd-1dc6-4f59-b3d6-389324c3157b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_582590d3-41ad-4b5e-87df-8e14faf54467"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-049b865d-4bec-42ab-b0eb-e2e9cbff8b49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-049b865d-4bec-42ab-b0eb-e2e9cbff8b49
Content-Type: application/json

--- request body ---
{"handle":"qa-30c21aa26f11","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-049b865d-4bec-42ab-b0eb-e2e9cbff8b49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_582590d3-41ad-4b5e-87df-8e14faf54467"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-656d21a4-1c90-4999-a26c-a1589e558a5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-656d21a4-1c90-4999-a26c-a1589e558a5f
Content-Type: application/json

--- request body ---
{"handle":"qa-30c21aa26f11","password":"****"}

--- response: 200 in 39 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-656d21a4-1c90-4999-a26c-a1589e558a5f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_582590d3-41ad-4b5e-87df-8e14faf54467"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-d7c322af-8678-44c9-a131-21ea3d3a2f0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7c322af-8678-44c9-a131-21ea3d3a2f0d
Content-Type: application/json

--- request body ---
{"handle":"qa-30c21aa26f11","password":"****"}

--- response: 200 in 42 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7c322af-8678-44c9-a131-21ea3d3a2f0d
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_582590d3-41ad-4b5e-87df-8e14faf54467"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-341b832b-4a35-4b16-b856-a44a483f7f25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-341b832b-4a35-4b16-b856-a44a483f7f25
Content-Type: application/json

--- request body ---
{"handle":"qa-30c21aa26f11","password":"****"}

--- response: 200 in 43 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-341b832b-4a35-4b16-b856-a44a483f7f25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_582590d3-41ad-4b5e-87df-8e14faf54467"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-de0c5d29-b4a0-4bc7-8840-3c7040d06f6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de0c5d29-b4a0-4bc7-8840-3c7040d06f6d
Content-Type: application/json

--- request body ---
{"handle":"qa-30c21aa26f11","password":"****"}

--- response: 200 in 46 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-de0c5d29-b4a0-4bc7-8840-3c7040d06f6d
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_582590d3-41ad-4b5e-87df-8e14faf54467"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-73dcee0b-0176-437b-906a-b1fe789dab31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73dcee0b-0176-437b-906a-b1fe789dab31
Content-Type: application/json

--- request body ---
{"handle":"qa-30c21aa26f11","password":"****"}

--- response: 200 in 48 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-73dcee0b-0176-437b-906a-b1fe789dab31
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_582590d3-41ad-4b5e-87df-8e14faf54467"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-7b8a28c5-aa66-494c-a67f-c960a4678624

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b8a28c5-aa66-494c-a67f-c960a4678624
Content-Type: application/json

--- request body ---
{"handle":"qa-30c21aa26f11","password":"****"}

--- response: 200 in 59 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b8a28c5-aa66-494c-a67f-c960a4678624
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_582590d3-41ad-4b5e-87df-8e14faf54467"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-61cd344e-f216-4d7d-a536-bf44696421ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61cd344e-f216-4d7d-a536-bf44696421ef
Content-Type: application/json

--- request body ---
{"handle":"qa-30c21aa26f11","password":"****"}

--- response: 200 in 71 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-61cd344e-f216-4d7d-a536-bf44696421ef
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_582590d3-41ad-4b5e-87df-8e14faf54467"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-41af9935-2619-4feb-8a1b-00cc59600079

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41af9935-2619-4feb-8a1b-00cc59600079
Content-Type: application/json

--- request body ---
{"handle":"qa-30c21aa26f11","password":"****"}

--- response: 200 in 62 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-41af9935-2619-4feb-8a1b-00cc59600079
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_582590d3-41ad-4b5e-87df-8e14faf54467"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-453a01d2-1307-4b7d-8f49-27003bf7020d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c65cb0a4f8c44c97a0d4b21d513bfcef
X-Correlation-Id: qa-453a01d2-1307-4b7d-8f49-27003bf7020d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 26 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-453a01d2-1307-4b7d-8f49-27003bf7020d
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
Location: /v1/credits/purchases/pur_0f532c76-7a22-4e20-93a8-b5cb4c267196
Content-Length: 144

{"id":"pur_0f532c76-7a22-4e20-93a8-b5cb4c267196","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-25T11:27:54.640488789Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1d7a5a6f-0ce1-4f72-b6cf-83a5609e0c29

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ef09c0ba154148c2ab3503017fadee85
X-Correlation-Id: qa-1d7a5a6f-0ce1-4f72-b6cf-83a5609e0c29
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 34 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d7a5a6f-0ce1-4f72-b6cf-83a5609e0c29
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
Location: /v1/credits/purchases/pur_8c56a2c4-c81d-4884-aa4e-3ad2064f89b0
Content-Length: 144

{"id":"pur_8c56a2c4-c81d-4884-aa4e-3ad2064f89b0","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-25T11:27:54.641279843Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-19e2d014-c389-486c-94ed-cafb84efb1b6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c38c9bc7d78e4f8cb624326831ef963e
X-Correlation-Id: qa-19e2d014-c389-486c-94ed-cafb84efb1b6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 34 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-19e2d014-c389-486c-94ed-cafb84efb1b6
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
Location: /v1/credits/purchases/pur_802f452f-2774-4873-8252-b161d96bf5cb
Content-Length: 144

{"id":"pur_802f452f-2774-4873-8252-b161d96bf5cb","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-25T11:27:54.640349570Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-975431ae-252b-4eb0-9ea8-9bc47e37cbea

--- request headers ---
Accept: application/json
Idempotency-Key: qa-160b3bb1936e41f6aa2ff45c4fa356d9
X-Correlation-Id: qa-975431ae-252b-4eb0-9ea8-9bc47e37cbea
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 51 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-975431ae-252b-4eb0-9ea8-9bc47e37cbea
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
Location: /v1/credits/purchases/pur_d817c55d-794c-494c-addf-7d97111754c5
Content-Length: 144

{"id":"pur_d817c55d-794c-494c-addf-7d97111754c5","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-25T11:27:54.656378264Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8b2ecbde-cf3a-4553-bc14-06f8f502edde

--- request headers ---
Accept: application/json
Idempotency-Key: qa-40213901f6da4a2682870e9657490b7b
X-Correlation-Id: qa-8b2ecbde-cf3a-4553-bc14-06f8f502edde
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 33 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b2ecbde-cf3a-4553-bc14-06f8f502edde
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
Location: /v1/credits/purchases/pur_114c1f94-c15a-48bb-811c-83649e27eb84
Content-Length: 144

{"id":"pur_114c1f94-c15a-48bb-811c-83649e27eb84","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-25T11:27:54.658307697Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f294e5cd-c40e-4246-885d-5f1f2893c77c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2c8d217078694b6d904ed29ea1fbd15e
X-Correlation-Id: qa-f294e5cd-c40e-4246-885d-5f1f2893c77c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 57 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f294e5cd-c40e-4246-885d-5f1f2893c77c
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
Location: /v1/credits/purchases/pur_a6d77a59-c0df-4cc7-9b94-f7806a28b0c1
Content-Length: 144

{"id":"pur_a6d77a59-c0df-4cc7-9b94-f7806a28b0c1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-25T11:27:54.639885135Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-dbadd952-e67a-40ce-8e65-1c9db510e52a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-18c38c8e9f0042e9af35d4012224a70b
X-Correlation-Id: qa-dbadd952-e67a-40ce-8e65-1c9db510e52a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 39 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbadd952-e67a-40ce-8e65-1c9db510e52a
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
Location: /v1/credits/purchases/pur_3aae50bf-dc04-4330-9398-e6f8c2d3625f
Content-Length: 144

{"id":"pur_3aae50bf-dc04-4330-9398-e6f8c2d3625f","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-25T11:27:54.660332275Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7e56cca6-a6af-4281-81fd-ad42baa39868

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d738be4971a649459b78b58a0c9beb93
X-Correlation-Id: qa-7e56cca6-a6af-4281-81fd-ad42baa39868
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 47 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e56cca6-a6af-4281-81fd-ad42baa39868
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
Location: /v1/credits/purchases/pur_06f47633-e6c9-4e5d-8eb7-343f143f6f08
Content-Length: 144

{"id":"pur_06f47633-e6c9-4e5d-8eb7-343f143f6f08","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-25T11:27:54.661471622Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-855b89f7-318f-47d1-a864-6f8b7a03f7b4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-03454b73bff0429989b3976aec2b2f5d
X-Correlation-Id: qa-855b89f7-318f-47d1-a864-6f8b7a03f7b4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-855b89f7-318f-47d1-a864-6f8b7a03f7b4
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
Location: /v1/credits/purchases/pur_2704af96-f41e-4be9-8d6f-1d4fd7571143
Content-Length: 144

{"id":"pur_2704af96-f41e-4be9-8d6f-1d4fd7571143","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-25T11:27:54.677023366Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-03e607db-ce3a-416f-a5b8-dfc5c3e452f7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9db98f6653144584a9ad44a75151001b
X-Correlation-Id: qa-03e607db-ce3a-416f-a5b8-dfc5c3e452f7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 30 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-03e607db-ce3a-416f-a5b8-dfc5c3e452f7
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
Location: /v1/credits/purchases/pur_e4ad34af-84f9-480e-b89c-4226a221a05b
Content-Length: 145

{"id":"pur_e4ad34af-84f9-480e-b89c-4226a221a05b","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-25T11:27:54.677244863Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-92477cd8-e934-4dc1-bd15-b3b287f50e18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92477cd8-e934-4dc1-bd15-b3b287f50e18
Content-Type: application/json

--- request body ---
{"handle":"qa-30c21aa26f11","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-92477cd8-e934-4dc1-bd15-b3b287f50e18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_582590d3-41ad-4b5e-87df-8e14faf54467"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-08bce5aa-4820-46ce-a10b-dc1c4ffdd528

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08bce5aa-4820-46ce-a10b-dc1c4ffdd528
Content-Type: application/json

--- response: 200 in 45 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-08bce5aa-4820-46ce-a10b-dc1c4ffdd528
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
Content-Length: 758

{"items":[{"id":"led_da4f8ef5-9f07-4333-99ab-dd1561e6fb1c","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-25T11:27:54.515076078Z"},{"id":"led_d586979e-3c35-4b25-a7fc-1e796d0eea5c","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_a6d77a59-c0df-4cc7-9b94-f7806a28b0c1","createdAt":"2026-11-25T11:27:54.639885135Z"},{"id":"led_084b45dc-7eac-499a-9e63-9a325998b4f0","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_802f452f-2774-4873-8252-b161d96bf5cb","createdAt":"2026-11-25T11:27:54.640349570Z"},{"id":"led_f5ce9697-5d61-4232-8884-b71422530c97","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_0f532c76-7a22-4e20-93a8-b5cb4c267196","createdAt":"2026-11-25T11:27:54.640488789Z"},{"id":"led_f1708dfd-4444-41df-bd7d-2e0d38981297","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_8c56a2c4-c81d-4884-aa4e-3ad2064f89b0","createdAt":"2026-11-25T11:27:54.641279843Z"},{"id":"led_3756858f-d5df-4749-a439-5244d5a96284","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_d817c55d-794c-494c-addf-7d97111754c5","createdAt":"2026-11-25T11:27:54.656378264Z"},{"id":"led_0c41738c-4056-49b5-ab02-4788a4114577","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_114c1f94-c15a-48bb-811c-83649e27eb84","createdAt":"2026-11-25T11:27:54.658307697Z"},{"id":"led_73461792-82ae-450e-913b-77b51e9c47f3","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_3aae50bf-dc04-4330-9398-e6f8c2d3625f","createdAt":"2026-11-25T11:27:54.660332275Z"},{"id":"led_452b1889-076f-4351-81d7-f6938c4efee6","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_06f47633-e6c9-4e5d-8eb7-343f143f6f08","createdAt":"2026-11-25T11:27:54.661471622Z"},{"id":"led_475ecdaf-541d-4985-bc33-eb4ed13059c1","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_2704af96-f41e-4be9-8d6f-1d4fd7571143","createdAt":"2026-11-25T11:27:54.677023366Z"},{"id":"led_f0a42bf0-b306-4f3d-b535-4ea6f9730418","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_e4ad34af-84f9-480e-b89c-4226a221a05b","createdAt":"2026-11-25T11:27:54.677244863Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aaefd44a-f638-496d-998a-2d89af317728

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaefd44a-f638-496d-998a-2d89af317728
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aaefd44a-f638-496d-998a-2d89af317728
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
correlation: qa-013377a9-5c0b-4d63-b438-a5a785df0e89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-013377a9-5c0b-4d63-b438-a5a785df0e89
Content-Type: application/json

--- request body ---
{"handle":"qa-30c21aa26f11","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-013377a9-5c0b-4d63-b438-a5a785df0e89
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-013377a9-5c0b-4d63-b438-a5a785df0e89"}
```
