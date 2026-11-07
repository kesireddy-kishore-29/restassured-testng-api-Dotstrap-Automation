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
| 1 | `POST /v1/accounts` | 201 | 523 | `qa-69a35901-ccf6-43af-bdc2-2cc6d40ef041` |
| 3 | `POST /v1/auth/token` | 200 | 84 | `qa-17a0aa44-a74b-4fa6-b319-2d4d2934d9e0` |
| 2 | `POST /v1/auth/token` | 200 | 92 | `qa-dfe12718-1d14-406f-9917-90ae9bf831ee` |
| 7 | `POST /v1/auth/token` | 200 | 73 | `qa-a77c084c-c76e-42d0-88a8-270aa61bef26` |
| 8 | `POST /v1/auth/token` | 200 | 72 | `qa-773b9c32-86a6-4086-ae56-cf1e2b2ce77f` |
| 11 | `POST /v1/auth/token` | 200 | 69 | `qa-ecdb7c57-da3b-48e6-af36-d6f6745ef534` |
| 4 | `POST /v1/auth/token` | 200 | 97 | `qa-3d8f7d16-36db-4bfd-a01c-be2c6e0130fe` |
| 6 | `POST /v1/auth/token` | 200 | 97 | `qa-5775a183-c66a-419c-983c-eadebe9a5be6` |
| 9 | `POST /v1/auth/token` | 200 | 86 | `qa-621ebdc6-2c32-4b3c-aa5f-b6854bfd1d9b` |
| 5 | `POST /v1/auth/token` | 200 | 91 | `qa-7cdbc544-0587-440b-8354-caffcf4af8a6` |
| 10 | `POST /v1/auth/token` | 200 | 92 | `qa-64805bb6-d4d5-4da0-a5e8-68892c38ed86` |
| 12 | `POST /v1/credits/purchases` | 201 | 80 | `qa-2deddd67-b834-426a-bf85-447bc8cecb2c` |
| 14 | `POST /v1/credits/purchases` | 201 | 77 | `qa-f1671424-c2f7-45f0-bbac-f256cea078c5` |
| 19 | `POST /v1/credits/purchases` | 201 | 61 | `qa-610c3882-92c6-4f12-9978-48bf220ca676` |
| 18 | `POST /v1/credits/purchases` | 201 | 65 | `qa-fba2a440-8199-4012-9ad1-3db4d0505757` |
| 21 | `POST /v1/credits/purchases` | 201 | 48 | `qa-c8375594-4148-4376-a73f-48fc9e9095d4` |
| 16 | `POST /v1/credits/purchases` | 201 | 72 | `qa-70194e32-c6c1-44db-8a6f-c70b98a32d6a` |
| 20 | `POST /v1/credits/purchases` | 201 | 61 | `qa-21f81573-3c92-4200-b97c-89bf7d71c9ed` |
| 13 | `POST /v1/credits/purchases` | 201 | 88 | `qa-e03329af-689e-4d50-9d83-fc449a74525d` |
| 15 | `POST /v1/credits/purchases` | 201 | 84 | `qa-129c811e-098b-4b3a-ab6d-3ee362ef934e` |
| 17 | `POST /v1/credits/purchases` | 201 | 78 | `qa-cffa02fd-2fa0-4e1c-abaa-f1c2a7a2bc38` |
| 22 | `POST /v1/auth/token` | 200 | 52 | `qa-eee20867-c162-4874-bb16-e31c6d5dabc2` |
| 23 | `GET /v1/credits/ledger` | 200 | 50 | `qa-809f270f-3b68-4df1-9970-a7b6387f2d23` |
| 24 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-8f222345-dd1d-4a7d-8f02-005ac6e1d4d8` |
| 25 | `POST /v1/auth/token` | 401 | 7 | `qa-3b7c2934-292d-4a8c-a342-e88f0a7d65e5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-69a35901-ccf6-43af-bdc2-2cc6d40ef041

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69a35901-ccf6-43af-bdc2-2cc6d40ef041
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee48deaac42","displayName":"QA 6ee48deaac42","password":"****","region":"us"}

--- response: 201 in 523 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-69a35901-ccf6-43af-bdc2-2cc6d40ef041
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
Location: /v1/accounts/qa-6ee48deaac42
X-Served-Region: us
Content-Length: 181

{"id":"acc_9b2c709b-f761-4a93-889b-1535ca5ab322","handle":"qa-6ee48deaac42","displayName":"QA 6ee48deaac42","region":"us","role":"user","createdAt":"2026-10-30T08:46:02.552183253Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-17a0aa44-a74b-4fa6-b319-2d4d2934d9e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17a0aa44-a74b-4fa6-b319-2d4d2934d9e0
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee48deaac42","password":"****"}

--- response: 200 in 84 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-17a0aa44-a74b-4fa6-b319-2d4d2934d9e0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b2c709b-f761-4a93-889b-1535ca5ab322"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-dfe12718-1d14-406f-9917-90ae9bf831ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfe12718-1d14-406f-9917-90ae9bf831ee
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee48deaac42","password":"****"}

--- response: 200 in 92 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfe12718-1d14-406f-9917-90ae9bf831ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b2c709b-f761-4a93-889b-1535ca5ab322"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-a77c084c-c76e-42d0-88a8-270aa61bef26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a77c084c-c76e-42d0-88a8-270aa61bef26
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee48deaac42","password":"****"}

--- response: 200 in 73 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a77c084c-c76e-42d0-88a8-270aa61bef26
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b2c709b-f761-4a93-889b-1535ca5ab322"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-773b9c32-86a6-4086-ae56-cf1e2b2ce77f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-773b9c32-86a6-4086-ae56-cf1e2b2ce77f
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee48deaac42","password":"****"}

--- response: 200 in 72 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-773b9c32-86a6-4086-ae56-cf1e2b2ce77f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b2c709b-f761-4a93-889b-1535ca5ab322"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-ecdb7c57-da3b-48e6-af36-d6f6745ef534

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecdb7c57-da3b-48e6-af36-d6f6745ef534
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee48deaac42","password":"****"}

--- response: 200 in 69 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecdb7c57-da3b-48e6-af36-d6f6745ef534
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b2c709b-f761-4a93-889b-1535ca5ab322"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-3d8f7d16-36db-4bfd-a01c-be2c6e0130fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d8f7d16-36db-4bfd-a01c-be2c6e0130fe
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee48deaac42","password":"****"}

--- response: 200 in 97 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d8f7d16-36db-4bfd-a01c-be2c6e0130fe
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b2c709b-f761-4a93-889b-1535ca5ab322"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5775a183-c66a-419c-983c-eadebe9a5be6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5775a183-c66a-419c-983c-eadebe9a5be6
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee48deaac42","password":"****"}

--- response: 200 in 97 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5775a183-c66a-419c-983c-eadebe9a5be6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b2c709b-f761-4a93-889b-1535ca5ab322"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-621ebdc6-2c32-4b3c-aa5f-b6854bfd1d9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-621ebdc6-2c32-4b3c-aa5f-b6854bfd1d9b
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee48deaac42","password":"****"}

--- response: 200 in 86 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-621ebdc6-2c32-4b3c-aa5f-b6854bfd1d9b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b2c709b-f761-4a93-889b-1535ca5ab322"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-7cdbc544-0587-440b-8354-caffcf4af8a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cdbc544-0587-440b-8354-caffcf4af8a6
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee48deaac42","password":"****"}

--- response: 200 in 91 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cdbc544-0587-440b-8354-caffcf4af8a6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b2c709b-f761-4a93-889b-1535ca5ab322"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-64805bb6-d4d5-4da0-a5e8-68892c38ed86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64805bb6-d4d5-4da0-a5e8-68892c38ed86
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee48deaac42","password":"****"}

--- response: 200 in 92 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-64805bb6-d4d5-4da0-a5e8-68892c38ed86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b2c709b-f761-4a93-889b-1535ca5ab322"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2deddd67-b834-426a-bf85-447bc8cecb2c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6f07196db9eb437b91cba3193b9ce8fc
X-Correlation-Id: qa-2deddd67-b834-426a-bf85-447bc8cecb2c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 80 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2deddd67-b834-426a-bf85-447bc8cecb2c
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
Location: /v1/credits/purchases/pur_27de9cdc-2095-4e38-abde-e4b3a17877b3
Content-Length: 144

{"id":"pur_27de9cdc-2095-4e38-abde-e4b3a17877b3","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-10-30T08:46:03.346604585Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f1671424-c2f7-45f0-bbac-f256cea078c5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9c976365a487413d8ce156928c8fca1e
X-Correlation-Id: qa-f1671424-c2f7-45f0-bbac-f256cea078c5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 77 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1671424-c2f7-45f0-bbac-f256cea078c5
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
Location: /v1/credits/purchases/pur_3a0d6f1c-b034-4c42-83cc-57ed95b9f33b
Content-Length: 144

{"id":"pur_3a0d6f1c-b034-4c42-83cc-57ed95b9f33b","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-10-30T08:46:03.348821438Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-610c3882-92c6-4f12-9978-48bf220ca676

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fcf7d719586f458bb0513c21428bf1d4
X-Correlation-Id: qa-610c3882-92c6-4f12-9978-48bf220ca676
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 61 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-610c3882-92c6-4f12-9978-48bf220ca676
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
Location: /v1/credits/purchases/pur_ea593bb5-a04b-475f-b7da-7d28d02d169a
Content-Length: 144

{"id":"pur_ea593bb5-a04b-475f-b7da-7d28d02d169a","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-10-30T08:46:03.346714691Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fba2a440-8199-4012-9ad1-3db4d0505757

--- request headers ---
Accept: application/json
Idempotency-Key: qa-90514caa4e734a669b13cf675b59e188
X-Correlation-Id: qa-fba2a440-8199-4012-9ad1-3db4d0505757
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 65 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fba2a440-8199-4012-9ad1-3db4d0505757
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
Location: /v1/credits/purchases/pur_592a8718-41e9-4f13-9502-c7ca07c672c5
Content-Length: 144

{"id":"pur_592a8718-41e9-4f13-9502-c7ca07c672c5","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-10-30T08:46:03.348233828Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c8375594-4148-4376-a73f-48fc9e9095d4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cb001d9cac66472abf9756434d36b30d
X-Correlation-Id: qa-c8375594-4148-4376-a73f-48fc9e9095d4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 48 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8375594-4148-4376-a73f-48fc9e9095d4
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
Location: /v1/credits/purchases/pur_1ca70090-9763-4877-84fa-5dc1f42f7b67
Content-Length: 144

{"id":"pur_1ca70090-9763-4877-84fa-5dc1f42f7b67","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-10-30T08:46:03.350856841Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-70194e32-c6c1-44db-8a6f-c70b98a32d6a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ce8131d36c9145d7bbeb288d7e56e79d
X-Correlation-Id: qa-70194e32-c6c1-44db-8a6f-c70b98a32d6a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 72 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-70194e32-c6c1-44db-8a6f-c70b98a32d6a
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
Location: /v1/credits/purchases/pur_b1eff24c-f014-437d-8c87-bdb40b42fbc5
Content-Length: 144

{"id":"pur_b1eff24c-f014-437d-8c87-bdb40b42fbc5","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-10-30T08:46:03.351506674Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-21f81573-3c92-4200-b97c-89bf7d71c9ed

--- request headers ---
Accept: application/json
Idempotency-Key: qa-00e93d7df40e48dfba04fd1826a2e4bb
X-Correlation-Id: qa-21f81573-3c92-4200-b97c-89bf7d71c9ed
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 61 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-21f81573-3c92-4200-b97c-89bf7d71c9ed
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
Location: /v1/credits/purchases/pur_5e767ef4-fb07-4799-b3ac-534aa02c1849
Content-Length: 144

{"id":"pur_5e767ef4-fb07-4799-b3ac-534aa02c1849","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-10-30T08:46:03.350339133Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e03329af-689e-4d50-9d83-fc449a74525d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f8dd4c72a2494cfc8c03d40ea3e9ebf4
X-Correlation-Id: qa-e03329af-689e-4d50-9d83-fc449a74525d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 88 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e03329af-689e-4d50-9d83-fc449a74525d
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
Location: /v1/credits/purchases/pur_88bbb6ce-4658-4828-b4b6-70d5bf157d2a
Content-Length: 144

{"id":"pur_88bbb6ce-4658-4828-b4b6-70d5bf157d2a","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-10-30T08:46:03.348631911Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-129c811e-098b-4b3a-ab6d-3ee362ef934e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b07990ac394f448292c9d2a377a40093
X-Correlation-Id: qa-129c811e-098b-4b3a-ab6d-3ee362ef934e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 84 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-129c811e-098b-4b3a-ab6d-3ee362ef934e
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
Location: /v1/credits/purchases/pur_6f62398a-bc95-43d1-9a13-80c2ca0e6c8f
Content-Length: 145

{"id":"pur_6f62398a-bc95-43d1-9a13-80c2ca0e6c8f","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-10-30T08:46:03.361158380Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-cffa02fd-2fa0-4e1c-abaa-f1c2a7a2bc38

--- request headers ---
Accept: application/json
Idempotency-Key: qa-855c3bf3b0c144acbbe2945f86c8b7a5
X-Correlation-Id: qa-cffa02fd-2fa0-4e1c-abaa-f1c2a7a2bc38
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 78 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cffa02fd-2fa0-4e1c-abaa-f1c2a7a2bc38
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
Location: /v1/credits/purchases/pur_e1b8bed8-732d-412c-8706-8496695a62d3
Content-Length: 144

{"id":"pur_e1b8bed8-732d-412c-8706-8496695a62d3","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-30T08:46:03.346321535Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-eee20867-c162-4874-bb16-e31c6d5dabc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eee20867-c162-4874-bb16-e31c6d5dabc2
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee48deaac42","password":"****"}

--- response: 200 in 52 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-eee20867-c162-4874-bb16-e31c6d5dabc2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b2c709b-f761-4a93-889b-1535ca5ab322"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-809f270f-3b68-4df1-9970-a7b6387f2d23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-809f270f-3b68-4df1-9970-a7b6387f2d23
Content-Type: application/json

--- response: 200 in 50 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-809f270f-3b68-4df1-9970-a7b6387f2d23
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
Content-Length: 763

{"items":[{"id":"led_4a529926-e180-4fe3-acae-ff07a9f3b988","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-30T08:46:02.552515524Z"},{"id":"led_7ec09536-8bd2-4057-8cb3-9358128b5969","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_e1b8bed8-732d-412c-8706-8496695a62d3","createdAt":"2026-10-30T08:46:03.346321535Z"},{"id":"led_85759b4a-aee7-46ea-b323-d16755956407","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_27de9cdc-2095-4e38-abde-e4b3a17877b3","createdAt":"2026-10-30T08:46:03.346604585Z"},{"id":"led_07c2e2c1-c650-464a-a989-6ffa0179bcfc","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_ea593bb5-a04b-475f-b7da-7d28d02d169a","createdAt":"2026-10-30T08:46:03.346714691Z"},{"id":"led_a85dbe77-2b35-47ee-8da6-40b741b8c827","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_592a8718-41e9-4f13-9502-c7ca07c672c5","createdAt":"2026-10-30T08:46:03.348233828Z"},{"id":"led_b81aeb09-0623-40a2-ba08-452a6717588e","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_88bbb6ce-4658-4828-b4b6-70d5bf157d2a","createdAt":"2026-10-30T08:46:03.348631911Z"},{"id":"led_7cb92548-1cb7-4991-9431-f2853e6661a9","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_3a0d6f1c-b034-4c42-83cc-57ed95b9f33b","createdAt":"2026-10-30T08:46:03.348821438Z"},{"id":"led_61144bac-b88f-4a4f-85ed-4ae6ceff7a0e","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_5e767ef4-fb07-4799-b3ac-534aa02c1849","createdAt":"2026-10-30T08:46:03.350339133Z"},{"id":"led_877b3f9f-999b-4097-8690-d6d630474fff","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_1ca70090-9763-4877-84fa-5dc1f42f7b67","createdAt":"2026-10-30T08:46:03.350856841Z"},{"id":"led_e93a65b4-865d-4c0f-9f29-feb67274a27e","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_b1eff24c-f014-437d-8c87-bdb40b42fbc5","createdAt":"2026-10-30T08:46:03.351506674Z"},{"id":"led_4b20a943-3968-4cba-86be-7d9ccd8adc30","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_6f62398a-bc95-43d1-9a13-80c2ca0e6c8f","createdAt":"2026-10-30T08:46:03.361158380Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8f222345-dd1d-4a7d-8f02-005ac6e1d4d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f222345-dd1d-4a7d-8f02-005ac6e1d4d8
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8f222345-dd1d-4a7d-8f02-005ac6e1d4d8
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
correlation: qa-3b7c2934-292d-4a8c-a342-e88f0a7d65e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b7c2934-292d-4a8c-a342-e88f0a7d65e5
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee48deaac42","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b7c2934-292d-4a8c-a342-e88f0a7d65e5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3b7c2934-292d-4a8c-a342-e88f0a7d65e5"}
```
