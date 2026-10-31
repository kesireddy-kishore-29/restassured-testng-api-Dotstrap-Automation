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
| 1 | `POST /v1/accounts` | 201 | 377 | `qa-a9223799-0ace-44b8-89f6-4ae44ad7837c` |
| 5 | `POST /v1/auth/token` | 200 | 62 | `qa-f0400ddc-f128-417c-a992-a64200b5107a` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-65ec11af-9ad9-413e-a2eb-fb9ed9a8270d` |
| 3 | `POST /v1/auth/token` | 200 | 72 | `qa-fcaebc6a-0323-4abd-8b6b-642a38f5adb8` |
| 7 | `POST /v1/auth/token` | 200 | 65 | `qa-7d60a4d3-99da-4312-bc6c-bf5a0630dbb8` |
| 4 | `POST /v1/auth/token` | 200 | 75 | `qa-8d7ca85d-c3e1-4672-9099-18f20fbf1728` |
| 2 | `POST /v1/auth/token` | 200 | 82 | `qa-bffd4b33-f155-44ff-94db-35b499e0f784` |
| 8 | `POST /v1/credits/purchases` | 200 | 93 | `qa-d7060f18-867a-4f93-a890-7726b8002427` |
| 12 | `POST /v1/credits/purchases` | 200 | 88 | `qa-48ed00a4-0a55-4a03-ad85-b54cfdfa355b` |
| 13 | `POST /v1/credits/purchases` | 200 | 87 | `qa-43fbecf1-5211-4e51-8d1c-5a9fccb784f4` |
| 11 | `POST /v1/credits/purchases` | 200 | 93 | `qa-140f6507-ea40-4839-98a1-ce10edcda72f` |
| 10 | `POST /v1/credits/purchases` | 200 | 97 | `qa-6e68beaf-3432-4721-8524-c335056687f1` |
| 9 | `POST /v1/credits/purchases` | 201 | 110 | `qa-2dbcf3e4-02be-417f-802e-3f0ddcd3a050` |
| 14 | `POST /v1/auth/token` | 200 | 16 | `qa-9fb64e97-0d42-4943-a054-cb4afa0cf1da` |
| 15 | `GET /v1/credits/balance` | 200 | 11 | `qa-d55d9409-0ff0-4448-b8ba-9225716d9ef6` |
| 16 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-4a7ee482-c973-4522-9ecf-ea462e2b7b0d` |
| 17 | `POST /v1/auth/token` | 401 | 12 | `qa-aac44563-43c9-4df9-9932-1cb8f2b3013a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a9223799-0ace-44b8-89f6-4ae44ad7837c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9223799-0ace-44b8-89f6-4ae44ad7837c
Content-Type: application/json

--- request body ---
{"handle":"qa-11861e784ba0","displayName":"QA 11861e784ba0","password":"****","region":"eu"}

--- response: 201 in 377 ms ---
Date: Fri, 23 Oct 2026 07:41:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9223799-0ace-44b8-89f6-4ae44ad7837c
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
Location: /v1/accounts/qa-11861e784ba0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d90632b1-2e25-4432-9fcc-74650bbd6d65","handle":"qa-11861e784ba0","displayName":"QA 11861e784ba0","region":"eu","role":"user","createdAt":"2026-10-23T07:41:14.909470767Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f0400ddc-f128-417c-a992-a64200b5107a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0400ddc-f128-417c-a992-a64200b5107a
Content-Type: application/json

--- request body ---
{"handle":"qa-11861e784ba0","password":"****"}

--- response: 200 in 62 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0400ddc-f128-417c-a992-a64200b5107a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d90632b1-2e25-4432-9fcc-74650bbd6d65"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-65ec11af-9ad9-413e-a2eb-fb9ed9a8270d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65ec11af-9ad9-413e-a2eb-fb9ed9a8270d
Content-Type: application/json

--- request body ---
{"handle":"qa-11861e784ba0","password":"****"}

--- response: 200 in 57 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-65ec11af-9ad9-413e-a2eb-fb9ed9a8270d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d90632b1-2e25-4432-9fcc-74650bbd6d65"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fcaebc6a-0323-4abd-8b6b-642a38f5adb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcaebc6a-0323-4abd-8b6b-642a38f5adb8
Content-Type: application/json

--- request body ---
{"handle":"qa-11861e784ba0","password":"****"}

--- response: 200 in 72 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcaebc6a-0323-4abd-8b6b-642a38f5adb8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d90632b1-2e25-4432-9fcc-74650bbd6d65"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-7d60a4d3-99da-4312-bc6c-bf5a0630dbb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d60a4d3-99da-4312-bc6c-bf5a0630dbb8
Content-Type: application/json

--- request body ---
{"handle":"qa-11861e784ba0","password":"****"}

--- response: 200 in 65 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d60a4d3-99da-4312-bc6c-bf5a0630dbb8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d90632b1-2e25-4432-9fcc-74650bbd6d65"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8d7ca85d-c3e1-4672-9099-18f20fbf1728

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d7ca85d-c3e1-4672-9099-18f20fbf1728
Content-Type: application/json

--- request body ---
{"handle":"qa-11861e784ba0","password":"****"}

--- response: 200 in 75 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d7ca85d-c3e1-4672-9099-18f20fbf1728
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d90632b1-2e25-4432-9fcc-74650bbd6d65"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bffd4b33-f155-44ff-94db-35b499e0f784

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bffd4b33-f155-44ff-94db-35b499e0f784
Content-Type: application/json

--- request body ---
{"handle":"qa-11861e784ba0","password":"****"}

--- response: 200 in 82 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-bffd4b33-f155-44ff-94db-35b499e0f784
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d90632b1-2e25-4432-9fcc-74650bbd6d65"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d7060f18-867a-4f93-a890-7726b8002427

--- request headers ---
Accept: application/json
Idempotency-Key: qa-54bd132728f74e21a18488ed1d44a150
X-Correlation-Id: qa-d7060f18-867a-4f93-a890-7726b8002427
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 93 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7060f18-867a-4f93-a890-7726b8002427
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
Location: /v1/credits/purchases/pur_13a8e491-858d-4e55-88bf-54ba9b231368
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_13a8e491-858d-4e55-88bf-54ba9b231368","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-23T07:41:15.633340683Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-48ed00a4-0a55-4a03-ad85-b54cfdfa355b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-54bd132728f74e21a18488ed1d44a150
X-Correlation-Id: qa-48ed00a4-0a55-4a03-ad85-b54cfdfa355b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 88 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-48ed00a4-0a55-4a03-ad85-b54cfdfa355b
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
Location: /v1/credits/purchases/pur_13a8e491-858d-4e55-88bf-54ba9b231368
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_13a8e491-858d-4e55-88bf-54ba9b231368","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-23T07:41:15.633340683Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-43fbecf1-5211-4e51-8d1c-5a9fccb784f4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-54bd132728f74e21a18488ed1d44a150
X-Correlation-Id: qa-43fbecf1-5211-4e51-8d1c-5a9fccb784f4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 87 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-43fbecf1-5211-4e51-8d1c-5a9fccb784f4
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
Location: /v1/credits/purchases/pur_13a8e491-858d-4e55-88bf-54ba9b231368
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_13a8e491-858d-4e55-88bf-54ba9b231368","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-23T07:41:15.633340683Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-140f6507-ea40-4839-98a1-ce10edcda72f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-54bd132728f74e21a18488ed1d44a150
X-Correlation-Id: qa-140f6507-ea40-4839-98a1-ce10edcda72f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 93 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-140f6507-ea40-4839-98a1-ce10edcda72f
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
Location: /v1/credits/purchases/pur_13a8e491-858d-4e55-88bf-54ba9b231368
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_13a8e491-858d-4e55-88bf-54ba9b231368","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-23T07:41:15.633340683Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6e68beaf-3432-4721-8524-c335056687f1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-54bd132728f74e21a18488ed1d44a150
X-Correlation-Id: qa-6e68beaf-3432-4721-8524-c335056687f1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 97 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e68beaf-3432-4721-8524-c335056687f1
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
Location: /v1/credits/purchases/pur_13a8e491-858d-4e55-88bf-54ba9b231368
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_13a8e491-858d-4e55-88bf-54ba9b231368","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-23T07:41:15.633340683Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2dbcf3e4-02be-417f-802e-3f0ddcd3a050

--- request headers ---
Accept: application/json
Idempotency-Key: qa-54bd132728f74e21a18488ed1d44a150
X-Correlation-Id: qa-2dbcf3e4-02be-417f-802e-3f0ddcd3a050
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 110 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dbcf3e4-02be-417f-802e-3f0ddcd3a050
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
Location: /v1/credits/purchases/pur_13a8e491-858d-4e55-88bf-54ba9b231368
Content-Length: 144

{"id":"pur_13a8e491-858d-4e55-88bf-54ba9b231368","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-23T07:41:15.633340683Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-9fb64e97-0d42-4943-a054-cb4afa0cf1da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fb64e97-0d42-4943-a054-cb4afa0cf1da
Content-Type: application/json

--- request body ---
{"handle":"qa-11861e784ba0","password":"****"}

--- response: 200 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fb64e97-0d42-4943-a054-cb4afa0cf1da
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d90632b1-2e25-4432-9fcc-74650bbd6d65"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-d55d9409-0ff0-4448-b8ba-9225716d9ef6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d55d9409-0ff0-4448-b8ba-9225716d9ef6
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d55d9409-0ff0-4448-b8ba-9225716d9ef6
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

{"balance":15,"currency":"credits","accountId":"acc_d90632b1-2e25-4432-9fcc-74650bbd6d65"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4a7ee482-c973-4522-9ecf-ea462e2b7b0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a7ee482-c973-4522-9ecf-ea462e2b7b0d
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4a7ee482-c973-4522-9ecf-ea462e2b7b0d
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
correlation: qa-aac44563-43c9-4df9-9932-1cb8f2b3013a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aac44563-43c9-4df9-9932-1cb8f2b3013a
Content-Type: application/json

--- request body ---
{"handle":"qa-11861e784ba0","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aac44563-43c9-4df9-9932-1cb8f2b3013a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aac44563-43c9-4df9-9932-1cb8f2b3013a"}
```
