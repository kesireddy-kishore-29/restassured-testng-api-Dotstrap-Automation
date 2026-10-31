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
| 1 | `POST /v1/accounts` | 201 | 478 | `qa-43709b0b-47a8-4599-ba21-cc964841617e` |
| 6 | `POST /v1/auth/token` | 200 | 55 | `qa-b8f5b41e-3337-4d6b-8e08-f6736e4e11de` |
| 7 | `POST /v1/auth/token` | 200 | 57 | `qa-54872584-464d-4dc1-9cba-a8320a7d36f6` |
| 4 | `POST /v1/auth/token` | 200 | 77 | `qa-688a21a4-06c1-49e1-bc68-79895c7a8e7c` |
| 2 | `POST /v1/auth/token` | 200 | 81 | `qa-82c3f261-0f65-4849-87ab-a14db029f11a` |
| 5 | `POST /v1/auth/token` | 200 | 77 | `qa-a4efa5d3-203a-41bd-b7e5-c170a2075cc0` |
| 3 | `POST /v1/auth/token` | 200 | 80 | `qa-59ba2638-05f4-4932-adec-141643e4cd44` |
| 11 | `POST /v1/credits/purchases` | 200 | 48 | `qa-6dac72cc-26cf-4f6a-8142-dbe5df6b2c17` |
| 10 | `POST /v1/credits/purchases` | 201 | 54 | `qa-94b5ccf2-0cf9-4872-8fb7-592c4ace7245` |
| 8 | `POST /v1/credits/purchases` | 200 | 71 | `qa-0cbfee4f-36d5-4d5b-8061-28cf0dc9bf54` |
| 13 | `POST /v1/credits/purchases` | 200 | 46 | `qa-2eb2c23d-7970-49c6-8d96-f1af81073f5d` |
| 12 | `POST /v1/credits/purchases` | 200 | 51 | `qa-17357075-ac73-4b3c-85f2-854f34b57490` |
| 9 | `POST /v1/credits/purchases` | 200 | 62 | `qa-00fd090b-cc3f-4687-8024-cb7fa66559ae` |
| 14 | `POST /v1/auth/token` | 200 | 15 | `qa-d3cba2a4-92d0-4398-9eb5-f093b0fcb794` |
| 15 | `GET /v1/credits/balance` | 200 | 10 | `qa-2aa8de41-43aa-4ecb-8513-91dccd7a6e6e` |
| 16 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-d7edd1db-f798-4533-958d-5b6de96d00e8` |
| 17 | `POST /v1/auth/token` | 401 | 7 | `qa-2bc3d100-57a6-406f-8232-559002dfb8f3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-43709b0b-47a8-4599-ba21-cc964841617e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43709b0b-47a8-4599-ba21-cc964841617e
Content-Type: application/json

--- request body ---
{"handle":"qa-70405a34600f","displayName":"QA 70405a34600f","password":"****","region":"eu"}

--- response: 201 in 478 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-43709b0b-47a8-4599-ba21-cc964841617e
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
Location: /v1/accounts/qa-70405a34600f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d87a2005-978c-440e-b58b-8d6a0fefa310","handle":"qa-70405a34600f","displayName":"QA 70405a34600f","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.318118870Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b8f5b41e-3337-4d6b-8e08-f6736e4e11de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8f5b41e-3337-4d6b-8e08-f6736e4e11de
Content-Type: application/json

--- request body ---
{"handle":"qa-70405a34600f","password":"****"}

--- response: 200 in 55 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8f5b41e-3337-4d6b-8e08-f6736e4e11de
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d87a2005-978c-440e-b58b-8d6a0fefa310"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-54872584-464d-4dc1-9cba-a8320a7d36f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54872584-464d-4dc1-9cba-a8320a7d36f6
Content-Type: application/json

--- request body ---
{"handle":"qa-70405a34600f","password":"****"}

--- response: 200 in 57 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-54872584-464d-4dc1-9cba-a8320a7d36f6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d87a2005-978c-440e-b58b-8d6a0fefa310"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-688a21a4-06c1-49e1-bc68-79895c7a8e7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-688a21a4-06c1-49e1-bc68-79895c7a8e7c
Content-Type: application/json

--- request body ---
{"handle":"qa-70405a34600f","password":"****"}

--- response: 200 in 77 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-688a21a4-06c1-49e1-bc68-79895c7a8e7c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d87a2005-978c-440e-b58b-8d6a0fefa310"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-82c3f261-0f65-4849-87ab-a14db029f11a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82c3f261-0f65-4849-87ab-a14db029f11a
Content-Type: application/json

--- request body ---
{"handle":"qa-70405a34600f","password":"****"}

--- response: 200 in 81 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-82c3f261-0f65-4849-87ab-a14db029f11a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d87a2005-978c-440e-b58b-8d6a0fefa310"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a4efa5d3-203a-41bd-b7e5-c170a2075cc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4efa5d3-203a-41bd-b7e5-c170a2075cc0
Content-Type: application/json

--- request body ---
{"handle":"qa-70405a34600f","password":"****"}

--- response: 200 in 77 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4efa5d3-203a-41bd-b7e5-c170a2075cc0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d87a2005-978c-440e-b58b-8d6a0fefa310"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-59ba2638-05f4-4932-adec-141643e4cd44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59ba2638-05f4-4932-adec-141643e4cd44
Content-Type: application/json

--- request body ---
{"handle":"qa-70405a34600f","password":"****"}

--- response: 200 in 80 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-59ba2638-05f4-4932-adec-141643e4cd44
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d87a2005-978c-440e-b58b-8d6a0fefa310"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6dac72cc-26cf-4f6a-8142-dbe5df6b2c17

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0840617baf604f86ad46acc8448233e9
X-Correlation-Id: qa-6dac72cc-26cf-4f6a-8142-dbe5df6b2c17
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 48 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dac72cc-26cf-4f6a-8142-dbe5df6b2c17
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
Location: /v1/credits/purchases/pur_87deb804-4913-4f53-adb2-7d3397bdeae3
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_87deb804-4913-4f53-adb2-7d3397bdeae3","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-25T07:40:27.934630370Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-94b5ccf2-0cf9-4872-8fb7-592c4ace7245

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0840617baf604f86ad46acc8448233e9
X-Correlation-Id: qa-94b5ccf2-0cf9-4872-8fb7-592c4ace7245
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 54 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-94b5ccf2-0cf9-4872-8fb7-592c4ace7245
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
Location: /v1/credits/purchases/pur_87deb804-4913-4f53-adb2-7d3397bdeae3
Content-Length: 144

{"id":"pur_87deb804-4913-4f53-adb2-7d3397bdeae3","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-25T07:40:27.934630370Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0cbfee4f-36d5-4d5b-8061-28cf0dc9bf54

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0840617baf604f86ad46acc8448233e9
X-Correlation-Id: qa-0cbfee4f-36d5-4d5b-8061-28cf0dc9bf54
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 71 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cbfee4f-36d5-4d5b-8061-28cf0dc9bf54
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
Location: /v1/credits/purchases/pur_87deb804-4913-4f53-adb2-7d3397bdeae3
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_87deb804-4913-4f53-adb2-7d3397bdeae3","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-25T07:40:27.934630370Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2eb2c23d-7970-49c6-8d96-f1af81073f5d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0840617baf604f86ad46acc8448233e9
X-Correlation-Id: qa-2eb2c23d-7970-49c6-8d96-f1af81073f5d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 46 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-2eb2c23d-7970-49c6-8d96-f1af81073f5d
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
Location: /v1/credits/purchases/pur_87deb804-4913-4f53-adb2-7d3397bdeae3
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_87deb804-4913-4f53-adb2-7d3397bdeae3","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-25T07:40:27.934630370Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-17357075-ac73-4b3c-85f2-854f34b57490

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0840617baf604f86ad46acc8448233e9
X-Correlation-Id: qa-17357075-ac73-4b3c-85f2-854f34b57490
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 51 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-17357075-ac73-4b3c-85f2-854f34b57490
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
Location: /v1/credits/purchases/pur_87deb804-4913-4f53-adb2-7d3397bdeae3
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_87deb804-4913-4f53-adb2-7d3397bdeae3","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-25T07:40:27.934630370Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-00fd090b-cc3f-4687-8024-cb7fa66559ae

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0840617baf604f86ad46acc8448233e9
X-Correlation-Id: qa-00fd090b-cc3f-4687-8024-cb7fa66559ae
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 62 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-00fd090b-cc3f-4687-8024-cb7fa66559ae
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
Location: /v1/credits/purchases/pur_87deb804-4913-4f53-adb2-7d3397bdeae3
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_87deb804-4913-4f53-adb2-7d3397bdeae3","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-25T07:40:27.934630370Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-d3cba2a4-92d0-4398-9eb5-f093b0fcb794

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3cba2a4-92d0-4398-9eb5-f093b0fcb794
Content-Type: application/json

--- request body ---
{"handle":"qa-70405a34600f","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3cba2a4-92d0-4398-9eb5-f093b0fcb794
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d87a2005-978c-440e-b58b-8d6a0fefa310"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-2aa8de41-43aa-4ecb-8513-91dccd7a6e6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2aa8de41-43aa-4ecb-8513-91dccd7a6e6e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-2aa8de41-43aa-4ecb-8513-91dccd7a6e6e
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

{"balance":15,"currency":"credits","accountId":"acc_d87a2005-978c-440e-b58b-8d6a0fefa310"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d7edd1db-f798-4533-958d-5b6de96d00e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7edd1db-f798-4533-958d-5b6de96d00e8
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d7edd1db-f798-4533-958d-5b6de96d00e8
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
correlation: qa-2bc3d100-57a6-406f-8232-559002dfb8f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bc3d100-57a6-406f-8232-559002dfb8f3
Content-Type: application/json

--- request body ---
{"handle":"qa-70405a34600f","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bc3d100-57a6-406f-8232-559002dfb8f3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2bc3d100-57a6-406f-8232-559002dfb8f3"}
```
