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
| 1 | `POST /v1/accounts` | 201 | 561 | `qa-4e1231e1-6475-457a-803a-08d91132c73d` |
| 2 | `POST /v1/auth/token` | 200 | 57 | `qa-d31fc1a4-38c2-4f64-ab97-bde8768a1f6e` |
| 3 | `POST /v1/auth/token` | 200 | 55 | `qa-936f612e-908d-4360-9d8b-0f7adc2b69cd` |
| 7 | `POST /v1/auth/token` | 200 | 49 | `qa-70dcb59a-367b-4f09-a94d-193766f0a333` |
| 6 | `POST /v1/auth/token` | 200 | 60 | `qa-0e32f21a-3da9-45aa-b687-7af9a0ba4bac` |
| 5 | `POST /v1/auth/token` | 200 | 64 | `qa-ee007899-6a1e-4977-be74-7315f2a00db4` |
| 4 | `POST /v1/auth/token` | 200 | 73 | `qa-e2446448-0e0e-4ebe-96d7-a752aee451cb` |
| 9 | `POST /v1/credits/purchases` | 201 | 88 | `qa-64b7ceb7-d764-4ca8-ad02-7063f74f8397` |
| 11 | `POST /v1/credits/purchases` | 200 | 85 | `qa-d717685e-fce8-4af1-aa99-c57bc698a336` |
| 13 | `POST /v1/credits/purchases` | 200 | 46 | `qa-63394574-7f22-44d6-8499-68428150d4c8` |
| 8 | `POST /v1/credits/purchases` | 200 | 94 | `qa-7a4ab852-8812-44c3-9026-c3d0cf05700d` |
| 10 | `POST /v1/credits/purchases` | 200 | 91 | `qa-2e9cab94-85c6-4487-aff6-a85d74181b23` |
| 12 | `POST /v1/credits/purchases` | 200 | 95 | `qa-d6bd84f1-fed3-4597-a025-e07a18cfc193` |
| 14 | `POST /v1/auth/token` | 200 | 40 | `qa-f63e537a-d282-4af7-abca-ab09d8b4c563` |
| 15 | `GET /v1/credits/balance` | 200 | 15 | `qa-7e5ad73b-1de1-4baf-abd7-ea885f9383ff` |
| 16 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-a89ec462-e7fd-40a8-8fb3-155d55754d43` |
| 17 | `POST /v1/auth/token` | 401 | 7 | `qa-e6727f38-df6b-45db-aeca-8f0e5f8bd9cf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4e1231e1-6475-457a-803a-08d91132c73d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e1231e1-6475-457a-803a-08d91132c73d
Content-Type: application/json

--- request body ---
{"handle":"qa-673150f0876d","displayName":"QA 673150f0876d","password":"****","region":"eu"}

--- response: 201 in 561 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e1231e1-6475-457a-803a-08d91132c73d
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
Location: /v1/accounts/qa-673150f0876d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_652bf97d-2adb-4013-9be1-19607f540bd7","handle":"qa-673150f0876d","displayName":"QA 673150f0876d","region":"eu","role":"user","createdAt":"2026-11-09T09:55:58.405112195Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d31fc1a4-38c2-4f64-ab97-bde8768a1f6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d31fc1a4-38c2-4f64-ab97-bde8768a1f6e
Content-Type: application/json

--- request body ---
{"handle":"qa-673150f0876d","password":"****"}

--- response: 200 in 57 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d31fc1a4-38c2-4f64-ab97-bde8768a1f6e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_652bf97d-2adb-4013-9be1-19607f540bd7"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-936f612e-908d-4360-9d8b-0f7adc2b69cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-936f612e-908d-4360-9d8b-0f7adc2b69cd
Content-Type: application/json

--- request body ---
{"handle":"qa-673150f0876d","password":"****"}

--- response: 200 in 55 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-936f612e-908d-4360-9d8b-0f7adc2b69cd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_652bf97d-2adb-4013-9be1-19607f540bd7"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-70dcb59a-367b-4f09-a94d-193766f0a333

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70dcb59a-367b-4f09-a94d-193766f0a333
Content-Type: application/json

--- request body ---
{"handle":"qa-673150f0876d","password":"****"}

--- response: 200 in 49 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-70dcb59a-367b-4f09-a94d-193766f0a333
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_652bf97d-2adb-4013-9be1-19607f540bd7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0e32f21a-3da9-45aa-b687-7af9a0ba4bac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e32f21a-3da9-45aa-b687-7af9a0ba4bac
Content-Type: application/json

--- request body ---
{"handle":"qa-673150f0876d","password":"****"}

--- response: 200 in 60 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e32f21a-3da9-45aa-b687-7af9a0ba4bac
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_652bf97d-2adb-4013-9be1-19607f540bd7"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ee007899-6a1e-4977-be74-7315f2a00db4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee007899-6a1e-4977-be74-7315f2a00db4
Content-Type: application/json

--- request body ---
{"handle":"qa-673150f0876d","password":"****"}

--- response: 200 in 64 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee007899-6a1e-4977-be74-7315f2a00db4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_652bf97d-2adb-4013-9be1-19607f540bd7"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e2446448-0e0e-4ebe-96d7-a752aee451cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2446448-0e0e-4ebe-96d7-a752aee451cb
Content-Type: application/json

--- request body ---
{"handle":"qa-673150f0876d","password":"****"}

--- response: 200 in 73 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2446448-0e0e-4ebe-96d7-a752aee451cb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_652bf97d-2adb-4013-9be1-19607f540bd7"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-64b7ceb7-d764-4ca8-ad02-7063f74f8397

--- request headers ---
Accept: application/json
Idempotency-Key: qa-26ca88de88cb45c6add12995a479b38e
X-Correlation-Id: qa-64b7ceb7-d764-4ca8-ad02-7063f74f8397
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 88 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-64b7ceb7-d764-4ca8-ad02-7063f74f8397
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
Location: /v1/credits/purchases/pur_02ed6320-319b-45dd-91c8-c503f78f8409
Content-Length: 144

{"id":"pur_02ed6320-319b-45dd-91c8-c503f78f8409","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-09T09:55:59.078967139Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d717685e-fce8-4af1-aa99-c57bc698a336

--- request headers ---
Accept: application/json
Idempotency-Key: qa-26ca88de88cb45c6add12995a479b38e
X-Correlation-Id: qa-d717685e-fce8-4af1-aa99-c57bc698a336
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 85 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d717685e-fce8-4af1-aa99-c57bc698a336
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
Location: /v1/credits/purchases/pur_02ed6320-319b-45dd-91c8-c503f78f8409
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_02ed6320-319b-45dd-91c8-c503f78f8409","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-09T09:55:59.078967139Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-63394574-7f22-44d6-8499-68428150d4c8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-26ca88de88cb45c6add12995a479b38e
X-Correlation-Id: qa-63394574-7f22-44d6-8499-68428150d4c8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 46 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-63394574-7f22-44d6-8499-68428150d4c8
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
Location: /v1/credits/purchases/pur_02ed6320-319b-45dd-91c8-c503f78f8409
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_02ed6320-319b-45dd-91c8-c503f78f8409","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-09T09:55:59.078967139Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7a4ab852-8812-44c3-9026-c3d0cf05700d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-26ca88de88cb45c6add12995a479b38e
X-Correlation-Id: qa-7a4ab852-8812-44c3-9026-c3d0cf05700d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 94 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a4ab852-8812-44c3-9026-c3d0cf05700d
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
Location: /v1/credits/purchases/pur_02ed6320-319b-45dd-91c8-c503f78f8409
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_02ed6320-319b-45dd-91c8-c503f78f8409","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-09T09:55:59.078967139Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2e9cab94-85c6-4487-aff6-a85d74181b23

--- request headers ---
Accept: application/json
Idempotency-Key: qa-26ca88de88cb45c6add12995a479b38e
X-Correlation-Id: qa-2e9cab94-85c6-4487-aff6-a85d74181b23
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 91 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e9cab94-85c6-4487-aff6-a85d74181b23
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
Location: /v1/credits/purchases/pur_02ed6320-319b-45dd-91c8-c503f78f8409
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_02ed6320-319b-45dd-91c8-c503f78f8409","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-09T09:55:59.078967139Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d6bd84f1-fed3-4597-a025-e07a18cfc193

--- request headers ---
Accept: application/json
Idempotency-Key: qa-26ca88de88cb45c6add12995a479b38e
X-Correlation-Id: qa-d6bd84f1-fed3-4597-a025-e07a18cfc193
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 95 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6bd84f1-fed3-4597-a025-e07a18cfc193
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
Location: /v1/credits/purchases/pur_02ed6320-319b-45dd-91c8-c503f78f8409
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_02ed6320-319b-45dd-91c8-c503f78f8409","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-09T09:55:59.078967139Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-f63e537a-d282-4af7-abca-ab09d8b4c563

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f63e537a-d282-4af7-abca-ab09d8b4c563
Content-Type: application/json

--- request body ---
{"handle":"qa-673150f0876d","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f63e537a-d282-4af7-abca-ab09d8b4c563
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_652bf97d-2adb-4013-9be1-19607f540bd7"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-7e5ad73b-1de1-4baf-abd7-ea885f9383ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e5ad73b-1de1-4baf-abd7-ea885f9383ff
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e5ad73b-1de1-4baf-abd7-ea885f9383ff
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

{"balance":15,"currency":"credits","accountId":"acc_652bf97d-2adb-4013-9be1-19607f540bd7"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a89ec462-e7fd-40a8-8fb3-155d55754d43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a89ec462-e7fd-40a8-8fb3-155d55754d43
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a89ec462-e7fd-40a8-8fb3-155d55754d43
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
correlation: qa-e6727f38-df6b-45db-aeca-8f0e5f8bd9cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6727f38-df6b-45db-aeca-8f0e5f8bd9cf
Content-Type: application/json

--- request body ---
{"handle":"qa-673150f0876d","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e6727f38-df6b-45db-aeca-8f0e5f8bd9cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e6727f38-df6b-45db-aeca-8f0e5f8bd9cf"}
```
