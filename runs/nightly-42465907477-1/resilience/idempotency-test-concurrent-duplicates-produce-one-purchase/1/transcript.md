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
| 1 | `POST /v1/accounts` | 201 | 419 | `qa-dde9ca3e-3e64-4797-989b-2b42f5ce233a` |
| 4 | `POST /v1/auth/token` | 200 | 87 | `qa-6522f33c-54ad-496c-a2c5-816586031a5c` |
| 5 | `POST /v1/auth/token` | 200 | 91 | `qa-b90e994d-d84a-48fd-b36d-7ee355870252` |
| 3 | `POST /v1/auth/token` | 200 | 98 | `qa-4443bb78-3a7a-473f-b159-73147ac21b63` |
| 7 | `POST /v1/auth/token` | 200 | 64 | `qa-e5892813-31de-4961-9f38-8cab0d9d64ba` |
| 2 | `POST /v1/auth/token` | 200 | 101 | `qa-3aed323e-5df1-4dfb-ba7a-01f97104271a` |
| 6 | `POST /v1/auth/token` | 200 | 87 | `qa-c4cd0616-812c-4d3a-a350-b8c739a5bc9a` |
| 13 | `POST /v1/credits/purchases` | 200 | 69 | `qa-01b24c6b-37d9-4421-90e0-b9332224cecc` |
| 11 | `POST /v1/credits/purchases` | 200 | 80 | `qa-ec0b61ca-52d9-4429-a1f6-81c88a115179` |
| 12 | `POST /v1/credits/purchases` | 201 | 67 | `qa-9fa79f2e-e8b3-41cc-8aee-0a1ec13da493` |
| 8 | `POST /v1/credits/purchases` | 200 | 76 | `qa-a6564b2b-5417-4fd3-af63-3a7c5c1d2a09` |
| 9 | `POST /v1/credits/purchases` | 200 | 88 | `qa-23729cc5-92e3-47b6-83be-9bbb7e404f3e` |
| 10 | `POST /v1/credits/purchases` | 200 | 89 | `qa-459adefc-e2d0-4244-bc84-c097ccfcf49b` |
| 14 | `POST /v1/auth/token` | 200 | 30 | `qa-82460748-8723-4ec3-a79a-ec4448542f59` |
| 15 | `GET /v1/credits/balance` | 200 | 15 | `qa-e2685af4-ad80-4937-a0d8-d30073a3128b` |
| 16 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-38ce6a45-bcc9-4dc8-acef-cc6977bf64ea` |
| 17 | `POST /v1/auth/token` | 401 | 13 | `qa-2b41050f-ace1-45d3-8bd9-20666f0422c3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dde9ca3e-3e64-4797-989b-2b42f5ce233a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dde9ca3e-3e64-4797-989b-2b42f5ce233a
Content-Type: application/json

--- request body ---
{"handle":"qa-e1ed0607aecf","displayName":"QA e1ed0607aecf","password":"****","region":"eu"}

--- response: 201 in 419 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-dde9ca3e-3e64-4797-989b-2b42f5ce233a
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
Location: /v1/accounts/qa-e1ed0607aecf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f311cc4d-b7c6-45f9-b825-20697b272cf4","handle":"qa-e1ed0607aecf","displayName":"QA e1ed0607aecf","region":"eu","role":"user","createdAt":"2026-11-08T09:09:11.442958418Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-6522f33c-54ad-496c-a2c5-816586031a5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6522f33c-54ad-496c-a2c5-816586031a5c
Content-Type: application/json

--- request body ---
{"handle":"qa-e1ed0607aecf","password":"****"}

--- response: 200 in 87 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-6522f33c-54ad-496c-a2c5-816586031a5c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f311cc4d-b7c6-45f9-b825-20697b272cf4"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b90e994d-d84a-48fd-b36d-7ee355870252

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b90e994d-d84a-48fd-b36d-7ee355870252
Content-Type: application/json

--- request body ---
{"handle":"qa-e1ed0607aecf","password":"****"}

--- response: 200 in 91 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-b90e994d-d84a-48fd-b36d-7ee355870252
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f311cc4d-b7c6-45f9-b825-20697b272cf4"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4443bb78-3a7a-473f-b159-73147ac21b63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4443bb78-3a7a-473f-b159-73147ac21b63
Content-Type: application/json

--- request body ---
{"handle":"qa-e1ed0607aecf","password":"****"}

--- response: 200 in 98 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-4443bb78-3a7a-473f-b159-73147ac21b63
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f311cc4d-b7c6-45f9-b825-20697b272cf4"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-e5892813-31de-4961-9f38-8cab0d9d64ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5892813-31de-4961-9f38-8cab0d9d64ba
Content-Type: application/json

--- request body ---
{"handle":"qa-e1ed0607aecf","password":"****"}

--- response: 200 in 64 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5892813-31de-4961-9f38-8cab0d9d64ba
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f311cc4d-b7c6-45f9-b825-20697b272cf4"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3aed323e-5df1-4dfb-ba7a-01f97104271a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3aed323e-5df1-4dfb-ba7a-01f97104271a
Content-Type: application/json

--- request body ---
{"handle":"qa-e1ed0607aecf","password":"****"}

--- response: 200 in 101 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-3aed323e-5df1-4dfb-ba7a-01f97104271a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f311cc4d-b7c6-45f9-b825-20697b272cf4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c4cd0616-812c-4d3a-a350-b8c739a5bc9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4cd0616-812c-4d3a-a350-b8c739a5bc9a
Content-Type: application/json

--- request body ---
{"handle":"qa-e1ed0607aecf","password":"****"}

--- response: 200 in 87 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4cd0616-812c-4d3a-a350-b8c739a5bc9a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f311cc4d-b7c6-45f9-b825-20697b272cf4"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-01b24c6b-37d9-4421-90e0-b9332224cecc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-93a935adf0914b25949a97d783ba6823
X-Correlation-Id: qa-01b24c6b-37d9-4421-90e0-b9332224cecc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 69 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-01b24c6b-37d9-4421-90e0-b9332224cecc
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
Location: /v1/credits/purchases/pur_05bc91b4-bedb-4ee5-914b-6e9175132b4b
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_05bc91b4-bedb-4ee5-914b-6e9175132b4b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-08T09:09:12.161267164Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ec0b61ca-52d9-4429-a1f6-81c88a115179

--- request headers ---
Accept: application/json
Idempotency-Key: qa-93a935adf0914b25949a97d783ba6823
X-Correlation-Id: qa-ec0b61ca-52d9-4429-a1f6-81c88a115179
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 80 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec0b61ca-52d9-4429-a1f6-81c88a115179
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
Location: /v1/credits/purchases/pur_05bc91b4-bedb-4ee5-914b-6e9175132b4b
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_05bc91b4-bedb-4ee5-914b-6e9175132b4b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-08T09:09:12.161267164Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9fa79f2e-e8b3-41cc-8aee-0a1ec13da493

--- request headers ---
Accept: application/json
Idempotency-Key: qa-93a935adf0914b25949a97d783ba6823
X-Correlation-Id: qa-9fa79f2e-e8b3-41cc-8aee-0a1ec13da493
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 67 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fa79f2e-e8b3-41cc-8aee-0a1ec13da493
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
Location: /v1/credits/purchases/pur_05bc91b4-bedb-4ee5-914b-6e9175132b4b
Content-Length: 144

{"id":"pur_05bc91b4-bedb-4ee5-914b-6e9175132b4b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-08T09:09:12.161267164Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a6564b2b-5417-4fd3-af63-3a7c5c1d2a09

--- request headers ---
Accept: application/json
Idempotency-Key: qa-93a935adf0914b25949a97d783ba6823
X-Correlation-Id: qa-a6564b2b-5417-4fd3-af63-3a7c5c1d2a09
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 76 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6564b2b-5417-4fd3-af63-3a7c5c1d2a09
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
Location: /v1/credits/purchases/pur_05bc91b4-bedb-4ee5-914b-6e9175132b4b
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_05bc91b4-bedb-4ee5-914b-6e9175132b4b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-08T09:09:12.161267164Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-23729cc5-92e3-47b6-83be-9bbb7e404f3e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-93a935adf0914b25949a97d783ba6823
X-Correlation-Id: qa-23729cc5-92e3-47b6-83be-9bbb7e404f3e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 88 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-23729cc5-92e3-47b6-83be-9bbb7e404f3e
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
Location: /v1/credits/purchases/pur_05bc91b4-bedb-4ee5-914b-6e9175132b4b
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_05bc91b4-bedb-4ee5-914b-6e9175132b4b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-08T09:09:12.161267164Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-459adefc-e2d0-4244-bc84-c097ccfcf49b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-93a935adf0914b25949a97d783ba6823
X-Correlation-Id: qa-459adefc-e2d0-4244-bc84-c097ccfcf49b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 89 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-459adefc-e2d0-4244-bc84-c097ccfcf49b
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
Location: /v1/credits/purchases/pur_05bc91b4-bedb-4ee5-914b-6e9175132b4b
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_05bc91b4-bedb-4ee5-914b-6e9175132b4b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-08T09:09:12.161267164Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-82460748-8723-4ec3-a79a-ec4448542f59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82460748-8723-4ec3-a79a-ec4448542f59
Content-Type: application/json

--- request body ---
{"handle":"qa-e1ed0607aecf","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-82460748-8723-4ec3-a79a-ec4448542f59
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f311cc4d-b7c6-45f9-b825-20697b272cf4"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-e2685af4-ad80-4937-a0d8-d30073a3128b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2685af4-ad80-4937-a0d8-d30073a3128b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2685af4-ad80-4937-a0d8-d30073a3128b
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

{"balance":15,"currency":"credits","accountId":"acc_f311cc4d-b7c6-45f9-b825-20697b272cf4"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-38ce6a45-bcc9-4dc8-acef-cc6977bf64ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38ce6a45-bcc9-4dc8-acef-cc6977bf64ea
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-38ce6a45-bcc9-4dc8-acef-cc6977bf64ea
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
correlation: qa-2b41050f-ace1-45d3-8bd9-20666f0422c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b41050f-ace1-45d3-8bd9-20666f0422c3
Content-Type: application/json

--- request body ---
{"handle":"qa-e1ed0607aecf","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b41050f-ace1-45d3-8bd9-20666f0422c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b41050f-ace1-45d3-8bd9-20666f0422c3"}
```
