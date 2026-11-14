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
| 1 | `POST /v1/accounts` | 201 | 301 | `qa-b66dedc1-e673-484c-b2ce-36acec0e58de` |
| 4 | `POST /v1/auth/token` | 200 | 38 | `qa-68774802-09fd-46b1-890d-bd37b7788780` |
| 7 | `POST /v1/auth/token` | 200 | 47 | `qa-6985a07c-3f22-47dd-915c-4349a6a42de1` |
| 5 | `POST /v1/auth/token` | 200 | 47 | `qa-f8190357-7ba3-41b3-867e-63e95acf33c4` |
| 3 | `POST /v1/auth/token` | 200 | 51 | `qa-c11df453-5bb5-4cd2-933d-185f92324fae` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-1bddcd95-db6c-4bd8-904a-eb7be1a7b486` |
| 2 | `POST /v1/auth/token` | 200 | 57 | `qa-653a363a-7ab6-4574-b7aa-ed7791515512` |
| 13 | `POST /v1/credits/purchases` | 200 | 16 | `qa-f4c6e9b6-b2fc-4af7-9b36-3d913bb77a57` |
| 9 | `POST /v1/credits/purchases` | 201 | 35 | `qa-b30fb4c6-51e8-4097-9485-455e318c9199` |
| 10 | `POST /v1/credits/purchases` | 200 | 39 | `qa-493e55b3-1943-43f9-bba4-da7bebcaacac` |
| 12 | `POST /v1/credits/purchases` | 200 | 33 | `qa-4803a51f-4b5d-44ef-958b-42dbeb211b51` |
| 11 | `POST /v1/credits/purchases` | 200 | 35 | `qa-60f25186-55cc-4cd6-a723-3b44fe316934` |
| 8 | `POST /v1/credits/purchases` | 200 | 49 | `qa-87476465-7999-4ffa-9573-ca3f683870bc` |
| 14 | `POST /v1/auth/token` | 200 | 20 | `qa-90ec748b-eeec-4a4a-952e-5c4a98b50fc1` |
| 15 | `GET /v1/credits/balance` | 200 | 14 | `qa-dc3c2854-f465-4d23-8c82-1571fc3c5f46` |
| 16 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-66ba0013-c70a-4927-92af-df28d017159f` |
| 17 | `POST /v1/auth/token` | 401 | 9 | `qa-845171fa-d27b-4839-b21f-3520a39b6f88` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b66dedc1-e673-484c-b2ce-36acec0e58de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b66dedc1-e673-484c-b2ce-36acec0e58de
Content-Type: application/json

--- request body ---
{"handle":"qa-55dcc1e63aa0","displayName":"QA 55dcc1e63aa0","password":"****","region":"eu"}

--- response: 201 in 301 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b66dedc1-e673-484c-b2ce-36acec0e58de
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
Location: /v1/accounts/qa-55dcc1e63aa0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2f5bb816-a529-4973-8a8b-7c2472624465","handle":"qa-55dcc1e63aa0","displayName":"QA 55dcc1e63aa0","region":"eu","role":"user","createdAt":"2026-11-11T09:34:30.475363005Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-68774802-09fd-46b1-890d-bd37b7788780

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68774802-09fd-46b1-890d-bd37b7788780
Content-Type: application/json

--- request body ---
{"handle":"qa-55dcc1e63aa0","password":"****"}

--- response: 200 in 38 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-68774802-09fd-46b1-890d-bd37b7788780
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2f5bb816-a529-4973-8a8b-7c2472624465"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-6985a07c-3f22-47dd-915c-4349a6a42de1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6985a07c-3f22-47dd-915c-4349a6a42de1
Content-Type: application/json

--- request body ---
{"handle":"qa-55dcc1e63aa0","password":"****"}

--- response: 200 in 47 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-6985a07c-3f22-47dd-915c-4349a6a42de1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2f5bb816-a529-4973-8a8b-7c2472624465"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f8190357-7ba3-41b3-867e-63e95acf33c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8190357-7ba3-41b3-867e-63e95acf33c4
Content-Type: application/json

--- request body ---
{"handle":"qa-55dcc1e63aa0","password":"****"}

--- response: 200 in 47 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8190357-7ba3-41b3-867e-63e95acf33c4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2f5bb816-a529-4973-8a8b-7c2472624465"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c11df453-5bb5-4cd2-933d-185f92324fae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c11df453-5bb5-4cd2-933d-185f92324fae
Content-Type: application/json

--- request body ---
{"handle":"qa-55dcc1e63aa0","password":"****"}

--- response: 200 in 51 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-c11df453-5bb5-4cd2-933d-185f92324fae
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2f5bb816-a529-4973-8a8b-7c2472624465"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1bddcd95-db6c-4bd8-904a-eb7be1a7b486

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bddcd95-db6c-4bd8-904a-eb7be1a7b486
Content-Type: application/json

--- request body ---
{"handle":"qa-55dcc1e63aa0","password":"****"}

--- response: 200 in 51 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bddcd95-db6c-4bd8-904a-eb7be1a7b486
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2f5bb816-a529-4973-8a8b-7c2472624465"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-653a363a-7ab6-4574-b7aa-ed7791515512

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-653a363a-7ab6-4574-b7aa-ed7791515512
Content-Type: application/json

--- request body ---
{"handle":"qa-55dcc1e63aa0","password":"****"}

--- response: 200 in 57 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-653a363a-7ab6-4574-b7aa-ed7791515512
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2f5bb816-a529-4973-8a8b-7c2472624465"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f4c6e9b6-b2fc-4af7-9b36-3d913bb77a57

--- request headers ---
Accept: application/json
Idempotency-Key: qa-83377deb74ca4d5aa4eef6f3824d8117
X-Correlation-Id: qa-f4c6e9b6-b2fc-4af7-9b36-3d913bb77a57
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4c6e9b6-b2fc-4af7-9b36-3d913bb77a57
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
Location: /v1/credits/purchases/pur_e8d9629f-4dd5-4b6b-a212-824c03cdf294
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e8d9629f-4dd5-4b6b-a212-824c03cdf294","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-11T09:34:30.871255982Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b30fb4c6-51e8-4097-9485-455e318c9199

--- request headers ---
Accept: application/json
Idempotency-Key: qa-83377deb74ca4d5aa4eef6f3824d8117
X-Correlation-Id: qa-b30fb4c6-51e8-4097-9485-455e318c9199
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b30fb4c6-51e8-4097-9485-455e318c9199
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
Location: /v1/credits/purchases/pur_e8d9629f-4dd5-4b6b-a212-824c03cdf294
Content-Length: 144

{"id":"pur_e8d9629f-4dd5-4b6b-a212-824c03cdf294","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-11T09:34:30.871255982Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-493e55b3-1943-43f9-bba4-da7bebcaacac

--- request headers ---
Accept: application/json
Idempotency-Key: qa-83377deb74ca4d5aa4eef6f3824d8117
X-Correlation-Id: qa-493e55b3-1943-43f9-bba4-da7bebcaacac
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 39 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-493e55b3-1943-43f9-bba4-da7bebcaacac
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
Location: /v1/credits/purchases/pur_e8d9629f-4dd5-4b6b-a212-824c03cdf294
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e8d9629f-4dd5-4b6b-a212-824c03cdf294","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-11T09:34:30.871255982Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4803a51f-4b5d-44ef-958b-42dbeb211b51

--- request headers ---
Accept: application/json
Idempotency-Key: qa-83377deb74ca4d5aa4eef6f3824d8117
X-Correlation-Id: qa-4803a51f-4b5d-44ef-958b-42dbeb211b51
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 33 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-4803a51f-4b5d-44ef-958b-42dbeb211b51
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
Location: /v1/credits/purchases/pur_e8d9629f-4dd5-4b6b-a212-824c03cdf294
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e8d9629f-4dd5-4b6b-a212-824c03cdf294","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-11T09:34:30.871255982Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-60f25186-55cc-4cd6-a723-3b44fe316934

--- request headers ---
Accept: application/json
Idempotency-Key: qa-83377deb74ca4d5aa4eef6f3824d8117
X-Correlation-Id: qa-60f25186-55cc-4cd6-a723-3b44fe316934
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-60f25186-55cc-4cd6-a723-3b44fe316934
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
Location: /v1/credits/purchases/pur_e8d9629f-4dd5-4b6b-a212-824c03cdf294
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e8d9629f-4dd5-4b6b-a212-824c03cdf294","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-11T09:34:30.871255982Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-87476465-7999-4ffa-9573-ca3f683870bc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-83377deb74ca4d5aa4eef6f3824d8117
X-Correlation-Id: qa-87476465-7999-4ffa-9573-ca3f683870bc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 49 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-87476465-7999-4ffa-9573-ca3f683870bc
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
Location: /v1/credits/purchases/pur_e8d9629f-4dd5-4b6b-a212-824c03cdf294
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e8d9629f-4dd5-4b6b-a212-824c03cdf294","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-11T09:34:30.871255982Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-90ec748b-eeec-4a4a-952e-5c4a98b50fc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90ec748b-eeec-4a4a-952e-5c4a98b50fc1
Content-Type: application/json

--- request body ---
{"handle":"qa-55dcc1e63aa0","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-90ec748b-eeec-4a4a-952e-5c4a98b50fc1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2f5bb816-a529-4973-8a8b-7c2472624465"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-dc3c2854-f465-4d23-8c82-1571fc3c5f46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc3c2854-f465-4d23-8c82-1571fc3c5f46
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc3c2854-f465-4d23-8c82-1571fc3c5f46
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

{"balance":15,"currency":"credits","accountId":"acc_2f5bb816-a529-4973-8a8b-7c2472624465"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-66ba0013-c70a-4927-92af-df28d017159f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66ba0013-c70a-4927-92af-df28d017159f
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-66ba0013-c70a-4927-92af-df28d017159f
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
correlation: qa-845171fa-d27b-4839-b21f-3520a39b6f88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-845171fa-d27b-4839-b21f-3520a39b6f88
Content-Type: application/json

--- request body ---
{"handle":"qa-55dcc1e63aa0","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-845171fa-d27b-4839-b21f-3520a39b6f88
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-845171fa-d27b-4839-b21f-3520a39b6f88"}
```
