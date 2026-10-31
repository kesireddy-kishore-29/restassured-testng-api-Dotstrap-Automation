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
| 1 | `POST /v1/accounts` | 201 | 486 | `qa-a36c8d59-3978-4741-81fa-c02a65ee2b10` |
| 5 | `POST /v1/auth/token` | 200 | 83 | `qa-5b6c248b-171b-4212-871f-1cc9fec81089` |
| 9 | `POST /v1/auth/token` | 200 | 70 | `qa-41d54a5b-47d7-4899-b948-a2bb5d233781` |
| 3 | `POST /v1/auth/token` | 200 | 93 | `qa-8f32d3a7-f3a6-42e0-b397-b02cdb1f5770` |
| 2 | `POST /v1/auth/token` | 200 | 102 | `qa-4d8af8e6-46d0-4b8a-9a91-8344f00a8516` |
| 10 | `POST /v1/auth/token` | 200 | 70 | `qa-f988e2cf-19c9-4631-9c3e-df10a599b363` |
| 4 | `POST /v1/auth/token` | 200 | 94 | `qa-2e2167b5-2775-4f77-aff7-cd69ae02c731` |
| 11 | `POST /v1/auth/token` | 200 | 69 | `qa-a049b009-b6c7-4c8a-a69a-a8e64c3edd11` |
| 6 | `POST /v1/auth/token` | 200 | 96 | `qa-f1571a50-cc25-4284-b484-a49e93629e2c` |
| 8 | `POST /v1/auth/token` | 200 | 91 | `qa-641d1776-f035-4f44-936c-d72b1de39b9f` |
| 7 | `POST /v1/auth/token` | 200 | 95 | `qa-e5343145-df7d-4b2a-ac36-c969012a6021` |
| 18 | `POST /v1/credits/purchases` | 201 | 39 | `qa-77d47659-0ca6-4656-ba8c-03216e6a0acc` |
| 15 | `POST /v1/credits/purchases` | 201 | 49 | `qa-3370b5e8-9a8b-4126-ad02-cc3b4403df42` |
| 19 | `POST /v1/credits/purchases` | 201 | 32 | `qa-7e308670-e07b-4503-bf46-c449c1f18652` |
| 13 | `POST /v1/credits/purchases` | 201 | 67 | `qa-3e276013-03b6-46fc-9c4a-eaf35ffd1a97` |
| 20 | `POST /v1/credits/purchases` | 201 | 30 | `qa-0c51998e-87e9-445d-8c8e-c5b76b0c6029` |
| 12 | `POST /v1/credits/purchases` | 201 | 78 | `qa-1854be92-2f8c-4a9a-8315-161c94f67102` |
| 17 | `POST /v1/credits/purchases` | 201 | 58 | `qa-557f7e34-288a-48e3-a809-108f32f010ca` |
| 16 | `POST /v1/credits/purchases` | 201 | 59 | `qa-7027ff9c-6554-4960-bdb9-665535be2d52` |
| 14 | `POST /v1/credits/purchases` | 201 | 71 | `qa-3d9fe448-feb3-4ece-b386-d3e757fa4322` |
| 21 | `POST /v1/credits/purchases` | 201 | 44 | `qa-45547241-ef2a-413c-ac5f-ab6c7c12e12c` |
| 22 | `POST /v1/auth/token` | 200 | 51 | `qa-c98918fc-003b-4497-9103-088093ac06ee` |
| 23 | `GET /v1/credits/ledger` | 200 | 42 | `qa-8c178520-d4ce-4145-9075-dfa209a5e3c0` |
| 24 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-0d9873e0-70bd-4217-8846-efd95e714fbc` |
| 25 | `POST /v1/auth/token` | 401 | 14 | `qa-6588e218-9170-4e0b-bb0c-00217689147b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a36c8d59-3978-4741-81fa-c02a65ee2b10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a36c8d59-3978-4741-81fa-c02a65ee2b10
Content-Type: application/json

--- request body ---
{"handle":"qa-b49bc7934654","displayName":"QA b49bc7934654","password":"****","region":"us"}

--- response: 201 in 486 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a36c8d59-3978-4741-81fa-c02a65ee2b10
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
Location: /v1/accounts/qa-b49bc7934654
X-Served-Region: us
Content-Length: 181

{"id":"acc_2ec7922d-7535-417f-9d12-63f473bbfe61","handle":"qa-b49bc7934654","displayName":"QA b49bc7934654","region":"us","role":"user","createdAt":"2026-10-29T08:38:57.139091342Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-5b6c248b-171b-4212-871f-1cc9fec81089

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b6c248b-171b-4212-871f-1cc9fec81089
Content-Type: application/json

--- request body ---
{"handle":"qa-b49bc7934654","password":"****"}

--- response: 200 in 83 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b6c248b-171b-4212-871f-1cc9fec81089
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ec7922d-7535-417f-9d12-63f473bbfe61"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-41d54a5b-47d7-4899-b948-a2bb5d233781

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41d54a5b-47d7-4899-b948-a2bb5d233781
Content-Type: application/json

--- request body ---
{"handle":"qa-b49bc7934654","password":"****"}

--- response: 200 in 70 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-41d54a5b-47d7-4899-b948-a2bb5d233781
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ec7922d-7535-417f-9d12-63f473bbfe61"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8f32d3a7-f3a6-42e0-b397-b02cdb1f5770

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f32d3a7-f3a6-42e0-b397-b02cdb1f5770
Content-Type: application/json

--- request body ---
{"handle":"qa-b49bc7934654","password":"****"}

--- response: 200 in 93 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f32d3a7-f3a6-42e0-b397-b02cdb1f5770
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ec7922d-7535-417f-9d12-63f473bbfe61"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4d8af8e6-46d0-4b8a-9a91-8344f00a8516

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d8af8e6-46d0-4b8a-9a91-8344f00a8516
Content-Type: application/json

--- request body ---
{"handle":"qa-b49bc7934654","password":"****"}

--- response: 200 in 102 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d8af8e6-46d0-4b8a-9a91-8344f00a8516
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ec7922d-7535-417f-9d12-63f473bbfe61"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-f988e2cf-19c9-4631-9c3e-df10a599b363

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f988e2cf-19c9-4631-9c3e-df10a599b363
Content-Type: application/json

--- request body ---
{"handle":"qa-b49bc7934654","password":"****"}

--- response: 200 in 70 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f988e2cf-19c9-4631-9c3e-df10a599b363
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ec7922d-7535-417f-9d12-63f473bbfe61"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-2e2167b5-2775-4f77-aff7-cd69ae02c731

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e2167b5-2775-4f77-aff7-cd69ae02c731
Content-Type: application/json

--- request body ---
{"handle":"qa-b49bc7934654","password":"****"}

--- response: 200 in 94 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e2167b5-2775-4f77-aff7-cd69ae02c731
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ec7922d-7535-417f-9d12-63f473bbfe61"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-a049b009-b6c7-4c8a-a69a-a8e64c3edd11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a049b009-b6c7-4c8a-a69a-a8e64c3edd11
Content-Type: application/json

--- request body ---
{"handle":"qa-b49bc7934654","password":"****"}

--- response: 200 in 69 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a049b009-b6c7-4c8a-a69a-a8e64c3edd11
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ec7922d-7535-417f-9d12-63f473bbfe61"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f1571a50-cc25-4284-b484-a49e93629e2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1571a50-cc25-4284-b484-a49e93629e2c
Content-Type: application/json

--- request body ---
{"handle":"qa-b49bc7934654","password":"****"}

--- response: 200 in 96 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1571a50-cc25-4284-b484-a49e93629e2c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ec7922d-7535-417f-9d12-63f473bbfe61"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-641d1776-f035-4f44-936c-d72b1de39b9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-641d1776-f035-4f44-936c-d72b1de39b9f
Content-Type: application/json

--- request body ---
{"handle":"qa-b49bc7934654","password":"****"}

--- response: 200 in 91 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-641d1776-f035-4f44-936c-d72b1de39b9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ec7922d-7535-417f-9d12-63f473bbfe61"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-e5343145-df7d-4b2a-ac36-c969012a6021

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5343145-df7d-4b2a-ac36-c969012a6021
Content-Type: application/json

--- request body ---
{"handle":"qa-b49bc7934654","password":"****"}

--- response: 200 in 95 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5343145-df7d-4b2a-ac36-c969012a6021
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ec7922d-7535-417f-9d12-63f473bbfe61"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-77d47659-0ca6-4656-ba8c-03216e6a0acc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8a856802454446a389b7e897968687c4
X-Correlation-Id: qa-77d47659-0ca6-4656-ba8c-03216e6a0acc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 39 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-77d47659-0ca6-4656-ba8c-03216e6a0acc
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
Location: /v1/credits/purchases/pur_ae4ef37f-ef9d-4def-8007-6ab1b18b8633
Content-Length: 144

{"id":"pur_ae4ef37f-ef9d-4def-8007-6ab1b18b8633","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-10-29T08:38:57.859372605Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3370b5e8-9a8b-4126-ad02-cc3b4403df42

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0304b3e86a2a4126bfb8f4734f31ffd6
X-Correlation-Id: qa-3370b5e8-9a8b-4126-ad02-cc3b4403df42
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 49 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3370b5e8-9a8b-4126-ad02-cc3b4403df42
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
Location: /v1/credits/purchases/pur_724a6314-30f7-4f51-a1ae-e58d8377b738
Content-Length: 144

{"id":"pur_724a6314-30f7-4f51-a1ae-e58d8377b738","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-10-29T08:38:57.860206379Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7e308670-e07b-4503-bf46-c449c1f18652

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cc4c044f954a4537a27ffb88091437df
X-Correlation-Id: qa-7e308670-e07b-4503-bf46-c449c1f18652
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 32 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e308670-e07b-4503-bf46-c449c1f18652
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
Location: /v1/credits/purchases/pur_4c170dfb-8035-4c69-9991-9ef36ee5bf1a
Content-Length: 144

{"id":"pur_4c170dfb-8035-4c69-9991-9ef36ee5bf1a","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-10-29T08:38:57.861746512Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3e276013-03b6-46fc-9c4a-eaf35ffd1a97

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e6e22e46681841e78be42d81ba5d4142
X-Correlation-Id: qa-3e276013-03b6-46fc-9c4a-eaf35ffd1a97
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 67 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e276013-03b6-46fc-9c4a-eaf35ffd1a97
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
Location: /v1/credits/purchases/pur_964b5704-fc23-4b85-974a-d72885d2eb45
Content-Length: 144

{"id":"pur_964b5704-fc23-4b85-974a-d72885d2eb45","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-10-29T08:38:57.863447610Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0c51998e-87e9-445d-8c8e-c5b76b0c6029

--- request headers ---
Accept: application/json
Idempotency-Key: qa-572c788947004297bf61a45019163bcb
X-Correlation-Id: qa-0c51998e-87e9-445d-8c8e-c5b76b0c6029
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 30 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c51998e-87e9-445d-8c8e-c5b76b0c6029
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
Location: /v1/credits/purchases/pur_241bc1ad-603b-4913-8428-41408914f85d
Content-Length: 144

{"id":"pur_241bc1ad-603b-4913-8428-41408914f85d","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-10-29T08:38:57.863324435Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1854be92-2f8c-4a9a-8315-161c94f67102

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5ab8bbf2f026418b86d18c2915235ba9
X-Correlation-Id: qa-1854be92-2f8c-4a9a-8315-161c94f67102
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 78 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-1854be92-2f8c-4a9a-8315-161c94f67102
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
Location: /v1/credits/purchases/pur_85fa038c-684f-4588-a4ab-8f82faad42d7
Content-Length: 144

{"id":"pur_85fa038c-684f-4588-a4ab-8f82faad42d7","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-10-29T08:38:57.864077900Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-557f7e34-288a-48e3-a809-108f32f010ca

--- request headers ---
Accept: application/json
Idempotency-Key: qa-af88bfbacebf4a5e8593d706a4c9c8d7
X-Correlation-Id: qa-557f7e34-288a-48e3-a809-108f32f010ca
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 58 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-557f7e34-288a-48e3-a809-108f32f010ca
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
Location: /v1/credits/purchases/pur_175fe077-6de4-4496-92e0-e9b29cb0fded
Content-Length: 144

{"id":"pur_175fe077-6de4-4496-92e0-e9b29cb0fded","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-10-29T08:38:57.872497329Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7027ff9c-6554-4960-bdb9-665535be2d52

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d8f75b8906ef4b648149c3d200bbcf4f
X-Correlation-Id: qa-7027ff9c-6554-4960-bdb9-665535be2d52
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 59 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7027ff9c-6554-4960-bdb9-665535be2d52
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
Location: /v1/credits/purchases/pur_8d390f39-a786-4f0a-8b6a-8aef2cf253db
Content-Length: 144

{"id":"pur_8d390f39-a786-4f0a-8b6a-8aef2cf253db","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-10-29T08:38:57.873554870Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3d9fe448-feb3-4ece-b386-d3e757fa4322

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e05671a222fc4b81891aa8ab92a2499b
X-Correlation-Id: qa-3d9fe448-feb3-4ece-b386-d3e757fa4322
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 71 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d9fe448-feb3-4ece-b386-d3e757fa4322
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
Location: /v1/credits/purchases/pur_9f8fe0f7-e319-4b3c-8fe2-54bfa8410495
Content-Length: 144

{"id":"pur_9f8fe0f7-e319-4b3c-8fe2-54bfa8410495","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-29T08:38:57.857976630Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-45547241-ef2a-413c-ac5f-ab6c7c12e12c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-601bbf1aa7b74a1f86c2a7c67479b7fa
X-Correlation-Id: qa-45547241-ef2a-413c-ac5f-ab6c7c12e12c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 44 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-45547241-ef2a-413c-ac5f-ab6c7c12e12c
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
Location: /v1/credits/purchases/pur_28a65ddb-2240-4e85-aa5c-bb8e76169d5a
Content-Length: 145

{"id":"pur_28a65ddb-2240-4e85-aa5c-bb8e76169d5a","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-10-29T08:38:57.884280533Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-c98918fc-003b-4497-9103-088093ac06ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c98918fc-003b-4497-9103-088093ac06ee
Content-Type: application/json

--- request body ---
{"handle":"qa-b49bc7934654","password":"****"}

--- response: 200 in 51 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c98918fc-003b-4497-9103-088093ac06ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ec7922d-7535-417f-9d12-63f473bbfe61"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-8c178520-d4ce-4145-9075-dfa209a5e3c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c178520-d4ce-4145-9075-dfa209a5e3c0
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c178520-d4ce-4145-9075-dfa209a5e3c0
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
Content-Length: 759

{"items":[{"id":"led_32abe25d-d9c3-4529-aa61-245bc65348a7","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-29T08:38:57.139330580Z"},{"id":"led_cacd9e1d-9595-4ae2-bad6-5346403b7969","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_9f8fe0f7-e319-4b3c-8fe2-54bfa8410495","createdAt":"2026-10-29T08:38:57.857976630Z"},{"id":"led_bc40e52e-0297-40e2-8a1a-d43adc234d8a","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_ae4ef37f-ef9d-4def-8007-6ab1b18b8633","createdAt":"2026-10-29T08:38:57.859372605Z"},{"id":"led_85fee360-1c48-4079-baf4-4d0193699474","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_724a6314-30f7-4f51-a1ae-e58d8377b738","createdAt":"2026-10-29T08:38:57.860206379Z"},{"id":"led_4a64b192-507e-430b-85d7-cb49a98c3f16","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_4c170dfb-8035-4c69-9991-9ef36ee5bf1a","createdAt":"2026-10-29T08:38:57.861746512Z"},{"id":"led_b5656618-e6cf-413f-91ce-ce64ac230d09","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_241bc1ad-603b-4913-8428-41408914f85d","createdAt":"2026-10-29T08:38:57.863324435Z"},{"id":"led_b42da34f-5b7e-461e-b717-7b4ce81832cf","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_964b5704-fc23-4b85-974a-d72885d2eb45","createdAt":"2026-10-29T08:38:57.863447610Z"},{"id":"led_bb179670-09aa-42f1-979e-cde438387503","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_85fa038c-684f-4588-a4ab-8f82faad42d7","createdAt":"2026-10-29T08:38:57.864077900Z"},{"id":"led_15b974a8-e08d-4feb-acfa-8eeedfcfcd66","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_175fe077-6de4-4496-92e0-e9b29cb0fded","createdAt":"2026-10-29T08:38:57.872497329Z"},{"id":"led_0843b741-93ce-4bc8-99e8-fa1b0f7d61ee","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_8d390f39-a786-4f0a-8b6a-8aef2cf253db","createdAt":"2026-10-29T08:38:57.873554870Z"},{"id":"led_1d213b7a-5d4d-43c5-81c5-1f0502946ce3","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_28a65ddb-2240-4e85-aa5c-bb8e76169d5a","createdAt":"2026-10-29T08:38:57.884280533Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0d9873e0-70bd-4217-8846-efd95e714fbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d9873e0-70bd-4217-8846-efd95e714fbc
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0d9873e0-70bd-4217-8846-efd95e714fbc
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
correlation: qa-6588e218-9170-4e0b-bb0c-00217689147b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6588e218-9170-4e0b-bb0c-00217689147b
Content-Type: application/json

--- request body ---
{"handle":"qa-b49bc7934654","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6588e218-9170-4e0b-bb0c-00217689147b
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6588e218-9170-4e0b-bb0c-00217689147b"}
```
