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
| 1 | `POST /v1/accounts` | 201 | 294 | `qa-6b8de90f-eb44-45e6-ac1b-c8560b3954bb` |
| 5 | `POST /v1/auth/token` | 200 | 33 | `qa-de3a7cff-833d-4127-9b78-f57eba445fb5` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-688ae639-5fed-44f5-a392-e35be0a29341` |
| 4 | `POST /v1/auth/token` | 200 | 48 | `qa-185db259-b981-469b-beb8-af7044f1006b` |
| 2 | `POST /v1/auth/token` | 200 | 52 | `qa-48ae3a7e-ffa9-4ca4-941a-ce3e469079f7` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-9184f024-e2d5-4bd7-a170-a96b2483cfbe` |
| 7 | `POST /v1/auth/token` | 200 | 44 | `qa-68b0aa16-7629-45f7-a99d-b9cb9b5c409f` |
| 11 | `POST /v1/credits/purchases` | 200 | 27 | `qa-ed9d7365-d72f-4f03-82ed-166cbb39cc96` |
| 12 | `POST /v1/credits/purchases` | 200 | 26 | `qa-4d8eae26-c74d-42cd-b947-4cd2978b0556` |
| 13 | `POST /v1/credits/purchases` | 200 | 24 | `qa-cfb06350-76e7-4385-af5e-c7fa20537c90` |
| 8 | `POST /v1/credits/purchases` | 201 | 34 | `qa-5c0ab5d5-4315-4670-b06a-ea8423a605e0` |
| 9 | `POST /v1/credits/purchases` | 200 | 35 | `qa-57d44193-3df0-4373-801d-7a3c89f723ea` |
| 10 | `POST /v1/credits/purchases` | 200 | 35 | `qa-b66d12c1-e6e6-42e6-bbb1-e741147dc314` |
| 14 | `POST /v1/auth/token` | 200 | 15 | `qa-f8c2992a-f919-4b74-87a4-f51be7cd9cbb` |
| 15 | `GET /v1/credits/balance` | 200 | 7 | `qa-cad94368-10a8-42d3-be06-c4fb3d88bea8` |
| 16 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-a43179f3-68e6-45fc-acba-8d2fab32b789` |
| 17 | `POST /v1/auth/token` | 401 | 13 | `qa-a0f3254d-cd72-4fce-90c4-f0fa39d37765` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6b8de90f-eb44-45e6-ac1b-c8560b3954bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b8de90f-eb44-45e6-ac1b-c8560b3954bb
Content-Type: application/json

--- request body ---
{"handle":"qa-3c5fed9dfeef","displayName":"QA 3c5fed9dfeef","password":"****","region":"eu"}

--- response: 201 in 294 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b8de90f-eb44-45e6-ac1b-c8560b3954bb
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
Location: /v1/accounts/qa-3c5fed9dfeef
X-Served-Region: eu
Content-Length: 181

{"id":"acc_46d7fa34-b5a1-4a31-a7c2-08cf719def03","handle":"qa-3c5fed9dfeef","displayName":"QA 3c5fed9dfeef","region":"eu","role":"user","createdAt":"2026-11-26T11:02:29.589094569Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-de3a7cff-833d-4127-9b78-f57eba445fb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de3a7cff-833d-4127-9b78-f57eba445fb5
Content-Type: application/json

--- request body ---
{"handle":"qa-3c5fed9dfeef","password":"****"}

--- response: 200 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-de3a7cff-833d-4127-9b78-f57eba445fb5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_46d7fa34-b5a1-4a31-a7c2-08cf719def03"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-688ae639-5fed-44f5-a392-e35be0a29341

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-688ae639-5fed-44f5-a392-e35be0a29341
Content-Type: application/json

--- request body ---
{"handle":"qa-3c5fed9dfeef","password":"****"}

--- response: 200 in 47 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-688ae639-5fed-44f5-a392-e35be0a29341
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_46d7fa34-b5a1-4a31-a7c2-08cf719def03"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-185db259-b981-469b-beb8-af7044f1006b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-185db259-b981-469b-beb8-af7044f1006b
Content-Type: application/json

--- request body ---
{"handle":"qa-3c5fed9dfeef","password":"****"}

--- response: 200 in 48 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-185db259-b981-469b-beb8-af7044f1006b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_46d7fa34-b5a1-4a31-a7c2-08cf719def03"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-48ae3a7e-ffa9-4ca4-941a-ce3e469079f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48ae3a7e-ffa9-4ca4-941a-ce3e469079f7
Content-Type: application/json

--- request body ---
{"handle":"qa-3c5fed9dfeef","password":"****"}

--- response: 200 in 52 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-48ae3a7e-ffa9-4ca4-941a-ce3e469079f7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_46d7fa34-b5a1-4a31-a7c2-08cf719def03"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9184f024-e2d5-4bd7-a170-a96b2483cfbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9184f024-e2d5-4bd7-a170-a96b2483cfbe
Content-Type: application/json

--- request body ---
{"handle":"qa-3c5fed9dfeef","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-9184f024-e2d5-4bd7-a170-a96b2483cfbe
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_46d7fa34-b5a1-4a31-a7c2-08cf719def03"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-68b0aa16-7629-45f7-a99d-b9cb9b5c409f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68b0aa16-7629-45f7-a99d-b9cb9b5c409f
Content-Type: application/json

--- request body ---
{"handle":"qa-3c5fed9dfeef","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-68b0aa16-7629-45f7-a99d-b9cb9b5c409f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_46d7fa34-b5a1-4a31-a7c2-08cf719def03"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ed9d7365-d72f-4f03-82ed-166cbb39cc96

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a2bb9a15cf4e441488d0311de55efe6e
X-Correlation-Id: qa-ed9d7365-d72f-4f03-82ed-166cbb39cc96
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 27 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed9d7365-d72f-4f03-82ed-166cbb39cc96
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
Location: /v1/credits/purchases/pur_4b092703-168c-469e-904e-a9433e4405a6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_4b092703-168c-469e-904e-a9433e4405a6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-26T11:02:29.943096164Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4d8eae26-c74d-42cd-b947-4cd2978b0556

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a2bb9a15cf4e441488d0311de55efe6e
X-Correlation-Id: qa-4d8eae26-c74d-42cd-b947-4cd2978b0556
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d8eae26-c74d-42cd-b947-4cd2978b0556
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
Location: /v1/credits/purchases/pur_4b092703-168c-469e-904e-a9433e4405a6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_4b092703-168c-469e-904e-a9433e4405a6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-26T11:02:29.943096164Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-cfb06350-76e7-4385-af5e-c7fa20537c90

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a2bb9a15cf4e441488d0311de55efe6e
X-Correlation-Id: qa-cfb06350-76e7-4385-af5e-c7fa20537c90
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfb06350-76e7-4385-af5e-c7fa20537c90
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
Location: /v1/credits/purchases/pur_4b092703-168c-469e-904e-a9433e4405a6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_4b092703-168c-469e-904e-a9433e4405a6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-26T11:02:29.943096164Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5c0ab5d5-4315-4670-b06a-ea8423a605e0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a2bb9a15cf4e441488d0311de55efe6e
X-Correlation-Id: qa-5c0ab5d5-4315-4670-b06a-ea8423a605e0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 34 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c0ab5d5-4315-4670-b06a-ea8423a605e0
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
Location: /v1/credits/purchases/pur_4b092703-168c-469e-904e-a9433e4405a6
Content-Length: 144

{"id":"pur_4b092703-168c-469e-904e-a9433e4405a6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-26T11:02:29.943096164Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-57d44193-3df0-4373-801d-7a3c89f723ea

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a2bb9a15cf4e441488d0311de55efe6e
X-Correlation-Id: qa-57d44193-3df0-4373-801d-7a3c89f723ea
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 35 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-57d44193-3df0-4373-801d-7a3c89f723ea
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
Location: /v1/credits/purchases/pur_4b092703-168c-469e-904e-a9433e4405a6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_4b092703-168c-469e-904e-a9433e4405a6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-26T11:02:29.943096164Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b66d12c1-e6e6-42e6-bbb1-e741147dc314

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a2bb9a15cf4e441488d0311de55efe6e
X-Correlation-Id: qa-b66d12c1-e6e6-42e6-bbb1-e741147dc314
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 35 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-b66d12c1-e6e6-42e6-bbb1-e741147dc314
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
Location: /v1/credits/purchases/pur_4b092703-168c-469e-904e-a9433e4405a6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_4b092703-168c-469e-904e-a9433e4405a6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-26T11:02:29.943096164Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-f8c2992a-f919-4b74-87a4-f51be7cd9cbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8c2992a-f919-4b74-87a4-f51be7cd9cbb
Content-Type: application/json

--- request body ---
{"handle":"qa-3c5fed9dfeef","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8c2992a-f919-4b74-87a4-f51be7cd9cbb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_46d7fa34-b5a1-4a31-a7c2-08cf719def03"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-cad94368-10a8-42d3-be06-c4fb3d88bea8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cad94368-10a8-42d3-be06-c4fb3d88bea8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-cad94368-10a8-42d3-be06-c4fb3d88bea8
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

{"balance":15,"currency":"credits","accountId":"acc_46d7fa34-b5a1-4a31-a7c2-08cf719def03"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a43179f3-68e6-45fc-acba-8d2fab32b789

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a43179f3-68e6-45fc-acba-8d2fab32b789
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a43179f3-68e6-45fc-acba-8d2fab32b789
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
correlation: qa-a0f3254d-cd72-4fce-90c4-f0fa39d37765

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0f3254d-cd72-4fce-90c4-f0fa39d37765
Content-Type: application/json

--- request body ---
{"handle":"qa-3c5fed9dfeef","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0f3254d-cd72-4fce-90c4-f0fa39d37765
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a0f3254d-cd72-4fce-90c4-f0fa39d37765"}
```
