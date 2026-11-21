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
| 1 | `POST /v1/accounts` | 201 | 446 | `qa-0e1347f7-6c48-4b95-a651-32779e8bac8d` |
| 7 | `POST /v1/auth/token` | 200 | 64 | `qa-b0b8c13e-f77b-4b65-8a28-510e26b310c1` |
| 2 | `POST /v1/auth/token` | 200 | 84 | `qa-d350ff67-4c75-40fb-892c-7950fc865d26` |
| 6 | `POST /v1/auth/token` | 200 | 73 | `qa-658863a1-e2e1-4e8c-b986-60704f1eabd0` |
| 3 | `POST /v1/auth/token` | 200 | 84 | `qa-c6afacc5-1729-4345-82e5-6eef2d57e79e` |
| 5 | `POST /v1/auth/token` | 200 | 83 | `qa-ac8e393f-15c4-4736-b827-86231c72363b` |
| 4 | `POST /v1/auth/token` | 200 | 90 | `qa-5d348955-3ef2-407c-a923-de95926674e0` |
| 12 | `POST /v1/credits/purchases` | 200 | 42 | `qa-d8d9492e-e2b6-4c72-a87a-3b60b1281b74` |
| 9 | `POST /v1/credits/purchases` | 201 | 58 | `qa-4c5d4bc6-6f7b-4ebb-84e4-8b7c1c0edeef` |
| 10 | `POST /v1/credits/purchases` | 200 | 52 | `qa-5b2e2bbd-a8bf-4aa5-8cce-70f57691d5b8` |
| 8 | `POST /v1/credits/purchases` | 200 | 67 | `qa-77f0a552-37e4-46d3-bca1-8c24fe8a8e17` |
| 11 | `POST /v1/credits/purchases` | 200 | 52 | `qa-be343468-3084-4107-a288-2cbe07cae594` |
| 13 | `POST /v1/credits/purchases` | 200 | 46 | `qa-510a3c96-72b2-43e0-bbf9-c43d14fe76b7` |
| 14 | `POST /v1/auth/token` | 200 | 19 | `qa-15ad67b7-7352-48d8-8384-7b77b392a52b` |
| 15 | `GET /v1/credits/balance` | 200 | 17 | `qa-c198d97d-6b8c-4b49-a253-aa9c35a576c4` |
| 16 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-5c68fa3e-8c62-4a2f-930b-287d665242c7` |
| 17 | `POST /v1/auth/token` | 401 | 19 | `qa-b1575a4e-6ee5-4167-8380-acc2f8873d49` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0e1347f7-6c48-4b95-a651-32779e8bac8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e1347f7-6c48-4b95-a651-32779e8bac8d
Content-Type: application/json

--- request body ---
{"handle":"qa-b054df7f4830","displayName":"QA b054df7f4830","password":"****","region":"eu"}

--- response: 201 in 446 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e1347f7-6c48-4b95-a651-32779e8bac8d
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
Location: /v1/accounts/qa-b054df7f4830
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e0182a99-8b78-4d02-a938-c7be799fc406","handle":"qa-b054df7f4830","displayName":"QA b054df7f4830","region":"eu","role":"user","createdAt":"2026-11-20T10:10:01.431511719Z"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-b0b8c13e-f77b-4b65-8a28-510e26b310c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0b8c13e-f77b-4b65-8a28-510e26b310c1
Content-Type: application/json

--- request body ---
{"handle":"qa-b054df7f4830","password":"****"}

--- response: 200 in 64 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0b8c13e-f77b-4b65-8a28-510e26b310c1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0182a99-8b78-4d02-a938-c7be799fc406"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d350ff67-4c75-40fb-892c-7950fc865d26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d350ff67-4c75-40fb-892c-7950fc865d26
Content-Type: application/json

--- request body ---
{"handle":"qa-b054df7f4830","password":"****"}

--- response: 200 in 84 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d350ff67-4c75-40fb-892c-7950fc865d26
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0182a99-8b78-4d02-a938-c7be799fc406"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-658863a1-e2e1-4e8c-b986-60704f1eabd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-658863a1-e2e1-4e8c-b986-60704f1eabd0
Content-Type: application/json

--- request body ---
{"handle":"qa-b054df7f4830","password":"****"}

--- response: 200 in 73 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-658863a1-e2e1-4e8c-b986-60704f1eabd0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0182a99-8b78-4d02-a938-c7be799fc406"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c6afacc5-1729-4345-82e5-6eef2d57e79e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6afacc5-1729-4345-82e5-6eef2d57e79e
Content-Type: application/json

--- request body ---
{"handle":"qa-b054df7f4830","password":"****"}

--- response: 200 in 84 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6afacc5-1729-4345-82e5-6eef2d57e79e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0182a99-8b78-4d02-a938-c7be799fc406"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ac8e393f-15c4-4736-b827-86231c72363b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac8e393f-15c4-4736-b827-86231c72363b
Content-Type: application/json

--- request body ---
{"handle":"qa-b054df7f4830","password":"****"}

--- response: 200 in 83 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac8e393f-15c4-4736-b827-86231c72363b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0182a99-8b78-4d02-a938-c7be799fc406"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-5d348955-3ef2-407c-a923-de95926674e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d348955-3ef2-407c-a923-de95926674e0
Content-Type: application/json

--- request body ---
{"handle":"qa-b054df7f4830","password":"****"}

--- response: 200 in 90 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d348955-3ef2-407c-a923-de95926674e0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0182a99-8b78-4d02-a938-c7be799fc406"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d8d9492e-e2b6-4c72-a87a-3b60b1281b74

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3906fd79a1d340e3b057c102e38f8042
X-Correlation-Id: qa-d8d9492e-e2b6-4c72-a87a-3b60b1281b74
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 42 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8d9492e-e2b6-4c72-a87a-3b60b1281b74
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
Location: /v1/credits/purchases/pur_aa0f8500-403b-41e5-8971-90211581e469
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_aa0f8500-403b-41e5-8971-90211581e469","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-20T10:10:02.027657765Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4c5d4bc6-6f7b-4ebb-84e4-8b7c1c0edeef

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3906fd79a1d340e3b057c102e38f8042
X-Correlation-Id: qa-4c5d4bc6-6f7b-4ebb-84e4-8b7c1c0edeef
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 58 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c5d4bc6-6f7b-4ebb-84e4-8b7c1c0edeef
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
Location: /v1/credits/purchases/pur_aa0f8500-403b-41e5-8971-90211581e469
Content-Length: 144

{"id":"pur_aa0f8500-403b-41e5-8971-90211581e469","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-20T10:10:02.027657765Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5b2e2bbd-a8bf-4aa5-8cce-70f57691d5b8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3906fd79a1d340e3b057c102e38f8042
X-Correlation-Id: qa-5b2e2bbd-a8bf-4aa5-8cce-70f57691d5b8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 52 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b2e2bbd-a8bf-4aa5-8cce-70f57691d5b8
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
Location: /v1/credits/purchases/pur_aa0f8500-403b-41e5-8971-90211581e469
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_aa0f8500-403b-41e5-8971-90211581e469","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-20T10:10:02.027657765Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-77f0a552-37e4-46d3-bca1-8c24fe8a8e17

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3906fd79a1d340e3b057c102e38f8042
X-Correlation-Id: qa-77f0a552-37e4-46d3-bca1-8c24fe8a8e17
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 67 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-77f0a552-37e4-46d3-bca1-8c24fe8a8e17
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
Location: /v1/credits/purchases/pur_aa0f8500-403b-41e5-8971-90211581e469
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_aa0f8500-403b-41e5-8971-90211581e469","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-20T10:10:02.027657765Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-be343468-3084-4107-a288-2cbe07cae594

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3906fd79a1d340e3b057c102e38f8042
X-Correlation-Id: qa-be343468-3084-4107-a288-2cbe07cae594
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 52 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-be343468-3084-4107-a288-2cbe07cae594
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
Location: /v1/credits/purchases/pur_aa0f8500-403b-41e5-8971-90211581e469
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_aa0f8500-403b-41e5-8971-90211581e469","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-20T10:10:02.027657765Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-510a3c96-72b2-43e0-bbf9-c43d14fe76b7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3906fd79a1d340e3b057c102e38f8042
X-Correlation-Id: qa-510a3c96-72b2-43e0-bbf9-c43d14fe76b7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 46 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-510a3c96-72b2-43e0-bbf9-c43d14fe76b7
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
Location: /v1/credits/purchases/pur_aa0f8500-403b-41e5-8971-90211581e469
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_aa0f8500-403b-41e5-8971-90211581e469","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-20T10:10:02.027657765Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-15ad67b7-7352-48d8-8384-7b77b392a52b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15ad67b7-7352-48d8-8384-7b77b392a52b
Content-Type: application/json

--- request body ---
{"handle":"qa-b054df7f4830","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-15ad67b7-7352-48d8-8384-7b77b392a52b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0182a99-8b78-4d02-a938-c7be799fc406"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-c198d97d-6b8c-4b49-a253-aa9c35a576c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c198d97d-6b8c-4b49-a253-aa9c35a576c4
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c198d97d-6b8c-4b49-a253-aa9c35a576c4
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

{"balance":15,"currency":"credits","accountId":"acc_e0182a99-8b78-4d02-a938-c7be799fc406"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5c68fa3e-8c62-4a2f-930b-287d665242c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c68fa3e-8c62-4a2f-930b-287d665242c7
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5c68fa3e-8c62-4a2f-930b-287d665242c7
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
correlation: qa-b1575a4e-6ee5-4167-8380-acc2f8873d49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1575a4e-6ee5-4167-8380-acc2f8873d49
Content-Type: application/json

--- request body ---
{"handle":"qa-b054df7f4830","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1575a4e-6ee5-4167-8380-acc2f8873d49
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1575a4e-6ee5-4167-8380-acc2f8873d49"}
```
