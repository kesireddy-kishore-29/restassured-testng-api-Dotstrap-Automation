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
| 1 | `POST /v1/accounts` | 201 | 280 | `qa-f2497812-07cb-4687-9b01-79de86d04268` |
| 4 | `POST /v1/auth/token` | 200 | 34 | `qa-6acb570b-175f-4aa2-85a4-786200897d55` |
| 2 | `POST /v1/auth/token` | 200 | 49 | `qa-4a67a825-87fa-4dcb-9394-209f419c237b` |
| 5 | `POST /v1/auth/token` | 200 | 40 | `qa-a7162cbe-5ffb-45c0-8573-c63d48c6f4ef` |
| 7 | `POST /v1/auth/token` | 200 | 33 | `qa-e5a7b6e1-7452-46ca-8178-498fc43176e8` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-ee931bf7-4814-49f4-9df8-935f6bf9ce0e` |
| 3 | `POST /v1/auth/token` | 200 | 48 | `qa-1983dd3b-9fcd-4ac2-8e43-9a9f8b557d9f` |
| 13 | `POST /v1/credits/purchases` | 200 | 30 | `qa-a899aa92-b46d-4689-9b32-bafdbb7f23a4` |
| 11 | `POST /v1/credits/purchases` | 201 | 36 | `qa-04c94ad4-214f-470e-a477-1e1345e319df` |
| 9 | `POST /v1/credits/purchases` | 200 | 43 | `qa-b190aecd-66e9-46fb-80b4-8d7d72a9edb1` |
| 8 | `POST /v1/credits/purchases` | 200 | 44 | `qa-c093f28f-85d1-4c60-b970-755a92f549dd` |
| 12 | `POST /v1/credits/purchases` | 200 | 39 | `qa-e3c60899-4126-4ba7-9732-c7cc31a130a0` |
| 10 | `POST /v1/credits/purchases` | 200 | 41 | `qa-928a601f-0a01-4dc3-ba98-980320f3e837` |
| 14 | `POST /v1/auth/token` | 200 | 22 | `qa-f91028ab-ed11-4dfd-95f4-f2ab78c59fc0` |
| 15 | `GET /v1/credits/balance` | 200 | 12 | `qa-f3f85a47-b20c-4b61-9325-475d1d6f0c01` |
| 16 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-b508215d-63a3-46da-bde6-f9a5504b3eb2` |
| 17 | `POST /v1/auth/token` | 401 | 11 | `qa-37c6112b-25f6-4248-b7fa-460907e1c989` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f2497812-07cb-4687-9b01-79de86d04268

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2497812-07cb-4687-9b01-79de86d04268
Content-Type: application/json

--- request body ---
{"handle":"qa-eec3feea666f","displayName":"QA eec3feea666f","password":"****","region":"eu"}

--- response: 201 in 280 ms ---
Date: Tue, 10 Nov 2026 09:59:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2497812-07cb-4687-9b01-79de86d04268
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
Location: /v1/accounts/qa-eec3feea666f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_470b56de-c39f-4f56-9a1b-3249a81ebb7a","handle":"qa-eec3feea666f","displayName":"QA eec3feea666f","region":"eu","role":"user","createdAt":"2026-11-10T09:59:27.976261693Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-6acb570b-175f-4aa2-85a4-786200897d55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6acb570b-175f-4aa2-85a4-786200897d55
Content-Type: application/json

--- request body ---
{"handle":"qa-eec3feea666f","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-6acb570b-175f-4aa2-85a4-786200897d55
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_470b56de-c39f-4f56-9a1b-3249a81ebb7a"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4a67a825-87fa-4dcb-9394-209f419c237b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a67a825-87fa-4dcb-9394-209f419c237b
Content-Type: application/json

--- request body ---
{"handle":"qa-eec3feea666f","password":"****"}

--- response: 200 in 49 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a67a825-87fa-4dcb-9394-209f419c237b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_470b56de-c39f-4f56-9a1b-3249a81ebb7a"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a7162cbe-5ffb-45c0-8573-c63d48c6f4ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7162cbe-5ffb-45c0-8573-c63d48c6f4ef
Content-Type: application/json

--- request body ---
{"handle":"qa-eec3feea666f","password":"****"}

--- response: 200 in 40 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7162cbe-5ffb-45c0-8573-c63d48c6f4ef
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_470b56de-c39f-4f56-9a1b-3249a81ebb7a"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-e5a7b6e1-7452-46ca-8178-498fc43176e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5a7b6e1-7452-46ca-8178-498fc43176e8
Content-Type: application/json

--- request body ---
{"handle":"qa-eec3feea666f","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5a7b6e1-7452-46ca-8178-498fc43176e8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_470b56de-c39f-4f56-9a1b-3249a81ebb7a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ee931bf7-4814-49f4-9df8-935f6bf9ce0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee931bf7-4814-49f4-9df8-935f6bf9ce0e
Content-Type: application/json

--- request body ---
{"handle":"qa-eec3feea666f","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee931bf7-4814-49f4-9df8-935f6bf9ce0e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_470b56de-c39f-4f56-9a1b-3249a81ebb7a"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1983dd3b-9fcd-4ac2-8e43-9a9f8b557d9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1983dd3b-9fcd-4ac2-8e43-9a9f8b557d9f
Content-Type: application/json

--- request body ---
{"handle":"qa-eec3feea666f","password":"****"}

--- response: 200 in 48 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-1983dd3b-9fcd-4ac2-8e43-9a9f8b557d9f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_470b56de-c39f-4f56-9a1b-3249a81ebb7a"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a899aa92-b46d-4689-9b32-bafdbb7f23a4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0fa54b54bbf84411bd73e526d12777fa
X-Correlation-Id: qa-a899aa92-b46d-4689-9b32-bafdbb7f23a4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 30 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-a899aa92-b46d-4689-9b32-bafdbb7f23a4
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
Location: /v1/credits/purchases/pur_2d5bb4bb-9754-4642-863a-72101fb0ca99
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_2d5bb4bb-9754-4642-863a-72101fb0ca99","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-10T09:59:28.360412609Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-04c94ad4-214f-470e-a477-1e1345e319df

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0fa54b54bbf84411bd73e526d12777fa
X-Correlation-Id: qa-04c94ad4-214f-470e-a477-1e1345e319df
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 36 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-04c94ad4-214f-470e-a477-1e1345e319df
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
Location: /v1/credits/purchases/pur_2d5bb4bb-9754-4642-863a-72101fb0ca99
Content-Length: 144

{"id":"pur_2d5bb4bb-9754-4642-863a-72101fb0ca99","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-10T09:59:28.360412609Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b190aecd-66e9-46fb-80b4-8d7d72a9edb1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0fa54b54bbf84411bd73e526d12777fa
X-Correlation-Id: qa-b190aecd-66e9-46fb-80b4-8d7d72a9edb1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 43 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-b190aecd-66e9-46fb-80b4-8d7d72a9edb1
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
Location: /v1/credits/purchases/pur_2d5bb4bb-9754-4642-863a-72101fb0ca99
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_2d5bb4bb-9754-4642-863a-72101fb0ca99","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-10T09:59:28.360412609Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c093f28f-85d1-4c60-b970-755a92f549dd

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0fa54b54bbf84411bd73e526d12777fa
X-Correlation-Id: qa-c093f28f-85d1-4c60-b970-755a92f549dd
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 44 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-c093f28f-85d1-4c60-b970-755a92f549dd
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
Location: /v1/credits/purchases/pur_2d5bb4bb-9754-4642-863a-72101fb0ca99
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_2d5bb4bb-9754-4642-863a-72101fb0ca99","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-10T09:59:28.360412609Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e3c60899-4126-4ba7-9732-c7cc31a130a0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0fa54b54bbf84411bd73e526d12777fa
X-Correlation-Id: qa-e3c60899-4126-4ba7-9732-c7cc31a130a0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 39 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3c60899-4126-4ba7-9732-c7cc31a130a0
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
Location: /v1/credits/purchases/pur_2d5bb4bb-9754-4642-863a-72101fb0ca99
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_2d5bb4bb-9754-4642-863a-72101fb0ca99","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-10T09:59:28.360412609Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-928a601f-0a01-4dc3-ba98-980320f3e837

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0fa54b54bbf84411bd73e526d12777fa
X-Correlation-Id: qa-928a601f-0a01-4dc3-ba98-980320f3e837
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 41 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-928a601f-0a01-4dc3-ba98-980320f3e837
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
Location: /v1/credits/purchases/pur_2d5bb4bb-9754-4642-863a-72101fb0ca99
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_2d5bb4bb-9754-4642-863a-72101fb0ca99","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-10T09:59:28.360412609Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-f91028ab-ed11-4dfd-95f4-f2ab78c59fc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f91028ab-ed11-4dfd-95f4-f2ab78c59fc0
Content-Type: application/json

--- request body ---
{"handle":"qa-eec3feea666f","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-f91028ab-ed11-4dfd-95f4-f2ab78c59fc0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_470b56de-c39f-4f56-9a1b-3249a81ebb7a"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-f3f85a47-b20c-4b61-9325-475d1d6f0c01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3f85a47-b20c-4b61-9325-475d1d6f0c01
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3f85a47-b20c-4b61-9325-475d1d6f0c01
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

{"balance":15,"currency":"credits","accountId":"acc_470b56de-c39f-4f56-9a1b-3249a81ebb7a"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b508215d-63a3-46da-bde6-f9a5504b3eb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b508215d-63a3-46da-bde6-f9a5504b3eb2
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b508215d-63a3-46da-bde6-f9a5504b3eb2
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
correlation: qa-37c6112b-25f6-4248-b7fa-460907e1c989

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37c6112b-25f6-4248-b7fa-460907e1c989
Content-Type: application/json

--- request body ---
{"handle":"qa-eec3feea666f","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37c6112b-25f6-4248-b7fa-460907e1c989
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-37c6112b-25f6-4248-b7fa-460907e1c989"}
```
