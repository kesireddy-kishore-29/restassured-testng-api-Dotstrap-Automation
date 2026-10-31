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
| 1 | `POST /v1/accounts` | 201 | 390 | `qa-97e4ad6e-25c7-426e-b155-2dbed20e911e` |
| 11 | `POST /v1/auth/token` | 200 | 91 | `qa-7f1cd7bc-f763-4005-916b-400089d15fbc` |
| 8 | `POST /v1/auth/token` | 200 | 101 | `qa-3402c04d-029c-46f9-920c-7efe68fe718e` |
| 6 | `POST /v1/auth/token` | 200 | 126 | `qa-dc3d990d-33da-4885-8876-8a40cedf1322` |
| 2 | `POST /v1/auth/token` | 200 | 130 | `qa-5352171c-0a29-41a3-a22e-4fb5ec22d08e` |
| 9 | `POST /v1/auth/token` | 200 | 106 | `qa-6a9df646-66fb-4313-afd0-40c0c9586b31` |
| 7 | `POST /v1/auth/token` | 200 | 111 | `qa-6718935e-b9ec-41ae-b8c6-19429d2f6bc6` |
| 3 | `POST /v1/auth/token` | 200 | 138 | `qa-9486ab3b-f53f-4e54-85a8-88f7549d720c` |
| 5 | `POST /v1/auth/token` | 200 | 137 | `qa-84391adb-861e-4126-acb4-f0bfd97f4030` |
| 10 | `POST /v1/auth/token` | 200 | 109 | `qa-df97f2c3-a440-4842-80cf-71bb1c8c4e69` |
| 4 | `POST /v1/auth/token` | 200 | 141 | `qa-9f5ea63b-945c-4284-8e04-df178d0a3c4c` |
| 16 | `POST /v1/credits/purchases` | 201 | 69 | `qa-17bbfbb2-0b01-426e-b1ba-2da0afc047fe` |
| 21 | `POST /v1/credits/purchases` | 201 | 35 | `qa-9a4e69af-cb24-47b6-b89e-0c083eda8b9f` |
| 12 | `POST /v1/credits/purchases` | 201 | 79 | `qa-dc331ab4-d4cb-4aec-b7b1-1b4372a5c0b0` |
| 18 | `POST /v1/credits/purchases` | 201 | 56 | `qa-8c4eca14-5746-4b9a-82d2-c5c7a1046d11` |
| 17 | `POST /v1/credits/purchases` | 201 | 59 | `qa-84e6a750-bee0-441c-ae7b-f9290d52abce` |
| 20 | `POST /v1/credits/purchases` | 201 | 48 | `qa-10a085f3-fe91-40f4-9e35-24250a42ece1` |
| 14 | `POST /v1/credits/purchases` | 201 | 83 | `qa-1207b1e8-de08-48ac-a9b1-a0f73863bc14` |
| 15 | `POST /v1/credits/purchases` | 201 | 82 | `qa-4b258529-f147-4512-86d9-6b2b116ea8d8` |
| 19 | `POST /v1/credits/purchases` | 201 | 52 | `qa-1e728852-203c-4d11-96cd-c33a2024b80d` |
| 13 | `POST /v1/credits/purchases` | 201 | 87 | `qa-aa577f60-8b2f-4a56-bcce-8b031f33f4b5` |
| 22 | `POST /v1/auth/token` | 200 | 27 | `qa-ee62ff89-80e4-42c9-b7e6-309315c1ee14` |
| 23 | `GET /v1/credits/ledger` | 200 | 79 | `qa-74595d1c-7be1-46bf-aea4-f404adc94452` |
| 24 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-ad15b3f5-c1fd-474e-a023-fa8d0c1bbd27` |
| 25 | `POST /v1/auth/token` | 401 | 49 | `qa-5e2d49ef-0a27-4305-bb6e-92f17158ea20` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-97e4ad6e-25c7-426e-b155-2dbed20e911e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97e4ad6e-25c7-426e-b155-2dbed20e911e
Content-Type: application/json

--- request body ---
{"handle":"qa-0765aeacda6c","displayName":"QA 0765aeacda6c","password":"****","region":"us"}

--- response: 201 in 390 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-97e4ad6e-25c7-426e-b155-2dbed20e911e
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
Location: /v1/accounts/qa-0765aeacda6c
X-Served-Region: us
Content-Length: 181

{"id":"acc_64f388c8-c4b0-458d-98ab-52b11b771cb9","handle":"qa-0765aeacda6c","displayName":"QA 0765aeacda6c","region":"us","role":"user","createdAt":"2026-10-23T07:41:44.580369088Z"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-7f1cd7bc-f763-4005-916b-400089d15fbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f1cd7bc-f763-4005-916b-400089d15fbc
Content-Type: application/json

--- request body ---
{"handle":"qa-0765aeacda6c","password":"****"}

--- response: 200 in 91 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f1cd7bc-f763-4005-916b-400089d15fbc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64f388c8-c4b0-458d-98ab-52b11b771cb9"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-3402c04d-029c-46f9-920c-7efe68fe718e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3402c04d-029c-46f9-920c-7efe68fe718e
Content-Type: application/json

--- request body ---
{"handle":"qa-0765aeacda6c","password":"****"}

--- response: 200 in 101 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-3402c04d-029c-46f9-920c-7efe68fe718e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64f388c8-c4b0-458d-98ab-52b11b771cb9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dc3d990d-33da-4885-8876-8a40cedf1322

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc3d990d-33da-4885-8876-8a40cedf1322
Content-Type: application/json

--- request body ---
{"handle":"qa-0765aeacda6c","password":"****"}

--- response: 200 in 126 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc3d990d-33da-4885-8876-8a40cedf1322
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64f388c8-c4b0-458d-98ab-52b11b771cb9"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5352171c-0a29-41a3-a22e-4fb5ec22d08e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5352171c-0a29-41a3-a22e-4fb5ec22d08e
Content-Type: application/json

--- request body ---
{"handle":"qa-0765aeacda6c","password":"****"}

--- response: 200 in 130 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-5352171c-0a29-41a3-a22e-4fb5ec22d08e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64f388c8-c4b0-458d-98ab-52b11b771cb9"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-6a9df646-66fb-4313-afd0-40c0c9586b31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a9df646-66fb-4313-afd0-40c0c9586b31
Content-Type: application/json

--- request body ---
{"handle":"qa-0765aeacda6c","password":"****"}

--- response: 200 in 106 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a9df646-66fb-4313-afd0-40c0c9586b31
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64f388c8-c4b0-458d-98ab-52b11b771cb9"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-6718935e-b9ec-41ae-b8c6-19429d2f6bc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6718935e-b9ec-41ae-b8c6-19429d2f6bc6
Content-Type: application/json

--- request body ---
{"handle":"qa-0765aeacda6c","password":"****"}

--- response: 200 in 111 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-6718935e-b9ec-41ae-b8c6-19429d2f6bc6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64f388c8-c4b0-458d-98ab-52b11b771cb9"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9486ab3b-f53f-4e54-85a8-88f7549d720c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9486ab3b-f53f-4e54-85a8-88f7549d720c
Content-Type: application/json

--- request body ---
{"handle":"qa-0765aeacda6c","password":"****"}

--- response: 200 in 138 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-9486ab3b-f53f-4e54-85a8-88f7549d720c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64f388c8-c4b0-458d-98ab-52b11b771cb9"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-84391adb-861e-4126-acb4-f0bfd97f4030

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84391adb-861e-4126-acb4-f0bfd97f4030
Content-Type: application/json

--- request body ---
{"handle":"qa-0765aeacda6c","password":"****"}

--- response: 200 in 137 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-84391adb-861e-4126-acb4-f0bfd97f4030
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64f388c8-c4b0-458d-98ab-52b11b771cb9"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-df97f2c3-a440-4842-80cf-71bb1c8c4e69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df97f2c3-a440-4842-80cf-71bb1c8c4e69
Content-Type: application/json

--- request body ---
{"handle":"qa-0765aeacda6c","password":"****"}

--- response: 200 in 109 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-df97f2c3-a440-4842-80cf-71bb1c8c4e69
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64f388c8-c4b0-458d-98ab-52b11b771cb9"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-9f5ea63b-945c-4284-8e04-df178d0a3c4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f5ea63b-945c-4284-8e04-df178d0a3c4c
Content-Type: application/json

--- request body ---
{"handle":"qa-0765aeacda6c","password":"****"}

--- response: 200 in 141 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f5ea63b-945c-4284-8e04-df178d0a3c4c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64f388c8-c4b0-458d-98ab-52b11b771cb9"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-17bbfbb2-0b01-426e-b1ba-2da0afc047fe

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2cb4e9ecdd8843b39ba8413efe1b0429
X-Correlation-Id: qa-17bbfbb2-0b01-426e-b1ba-2da0afc047fe
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 69 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-17bbfbb2-0b01-426e-b1ba-2da0afc047fe
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
Location: /v1/credits/purchases/pur_01880e82-e622-4574-8137-4e46c63eb2ca
Content-Length: 144

{"id":"pur_01880e82-e622-4574-8137-4e46c63eb2ca","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-23T07:41:45.232686310Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9a4e69af-cb24-47b6-b89e-0c083eda8b9f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-976a283d15eb4ba2b5b9619394367b4c
X-Correlation-Id: qa-9a4e69af-cb24-47b6-b89e-0c083eda8b9f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a4e69af-cb24-47b6-b89e-0c083eda8b9f
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
Location: /v1/credits/purchases/pur_6104f3ca-429f-431b-85e5-53fc4e87ce03
Content-Length: 145

{"id":"pur_6104f3ca-429f-431b-85e5-53fc4e87ce03","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-10-23T07:41:45.239106565Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-dc331ab4-d4cb-4aec-b7b1-1b4372a5c0b0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-892d2c96b4234042af6ab72eacff8704
X-Correlation-Id: qa-dc331ab4-d4cb-4aec-b7b1-1b4372a5c0b0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 79 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc331ab4-d4cb-4aec-b7b1-1b4372a5c0b0
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
Location: /v1/credits/purchases/pur_f13af751-9320-4d8b-bade-0ee70a0e0e79
Content-Length: 144

{"id":"pur_f13af751-9320-4d8b-bade-0ee70a0e0e79","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-10-23T07:41:45.238174832Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8c4eca14-5746-4b9a-82d2-c5c7a1046d11

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c1d0dc5ee2f54f6a845446578a83ada0
X-Correlation-Id: qa-8c4eca14-5746-4b9a-82d2-c5c7a1046d11
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 56 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c4eca14-5746-4b9a-82d2-c5c7a1046d11
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
Location: /v1/credits/purchases/pur_5f0c5e6f-0029-445d-b95d-12ded321c16c
Content-Length: 144

{"id":"pur_5f0c5e6f-0029-445d-b95d-12ded321c16c","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-10-23T07:41:45.235359567Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-84e6a750-bee0-441c-ae7b-f9290d52abce

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d00434c24b5a4ac39dd839ce2e67f70a
X-Correlation-Id: qa-84e6a750-bee0-441c-ae7b-f9290d52abce
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 59 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-84e6a750-bee0-441c-ae7b-f9290d52abce
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
Location: /v1/credits/purchases/pur_f74b0107-ac0b-4320-9849-ad4597e56e52
Content-Length: 144

{"id":"pur_f74b0107-ac0b-4320-9849-ad4597e56e52","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-10-23T07:41:45.238109150Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-10a085f3-fe91-40f4-9e35-24250a42ece1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-21053405cc244f0eb2a177adedbd5aae
X-Correlation-Id: qa-10a085f3-fe91-40f4-9e35-24250a42ece1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 48 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-10a085f3-fe91-40f4-9e35-24250a42ece1
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
Location: /v1/credits/purchases/pur_8eae1800-2fe6-4704-9219-79836252552e
Content-Length: 144

{"id":"pur_8eae1800-2fe6-4704-9219-79836252552e","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-10-23T07:41:45.235191063Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1207b1e8-de08-48ac-a9b1-a0f73863bc14

--- request headers ---
Accept: application/json
Idempotency-Key: qa-febcafa04d934b37889c3a6c4a1a3ff5
X-Correlation-Id: qa-1207b1e8-de08-48ac-a9b1-a0f73863bc14
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 83 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-1207b1e8-de08-48ac-a9b1-a0f73863bc14
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
Location: /v1/credits/purchases/pur_c8fb68f7-5e6d-439e-8b8c-f8667fcb2de1
Content-Length: 144

{"id":"pur_c8fb68f7-5e6d-439e-8b8c-f8667fcb2de1","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-10-23T07:41:45.233205248Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4b258529-f147-4512-86d9-6b2b116ea8d8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bd7bd45820a24aad8c7c743f44dddacd
X-Correlation-Id: qa-4b258529-f147-4512-86d9-6b2b116ea8d8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 82 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b258529-f147-4512-86d9-6b2b116ea8d8
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
Location: /v1/credits/purchases/pur_d78f6b7d-f1a6-460a-a038-7a5721057d59
Content-Length: 144

{"id":"pur_d78f6b7d-f1a6-460a-a038-7a5721057d59","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-10-23T07:41:45.235117726Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1e728852-203c-4d11-96cd-c33a2024b80d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cd6c918369524b20baba221f83ee87a2
X-Correlation-Id: qa-1e728852-203c-4d11-96cd-c33a2024b80d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 52 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e728852-203c-4d11-96cd-c33a2024b80d
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
Location: /v1/credits/purchases/pur_2309cb6f-e0fc-4b4f-9b84-4a72046aecb6
Content-Length: 144

{"id":"pur_2309cb6f-e0fc-4b4f-9b84-4a72046aecb6","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-10-23T07:41:45.234624569Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-aa577f60-8b2f-4a56-bcce-8b031f33f4b5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-87caefc940df4fbe9124d710b61ed46d
X-Correlation-Id: qa-aa577f60-8b2f-4a56-bcce-8b031f33f4b5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 87 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa577f60-8b2f-4a56-bcce-8b031f33f4b5
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
Location: /v1/credits/purchases/pur_c1c138e2-1127-43ad-a4b1-00ec78461181
Content-Length: 144

{"id":"pur_c1c138e2-1127-43ad-a4b1-00ec78461181","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-10-23T07:41:45.234247285Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-ee62ff89-80e4-42c9-b7e6-309315c1ee14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee62ff89-80e4-42c9-b7e6-309315c1ee14
Content-Type: application/json

--- request body ---
{"handle":"qa-0765aeacda6c","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee62ff89-80e4-42c9-b7e6-309315c1ee14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64f388c8-c4b0-458d-98ab-52b11b771cb9"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-74595d1c-7be1-46bf-aea4-f404adc94452

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74595d1c-7be1-46bf-aea4-f404adc94452
Content-Type: application/json

--- response: 200 in 79 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-74595d1c-7be1-46bf-aea4-f404adc94452
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

{"items":[{"id":"led_69602bd3-e253-4a55-8fda-a5eaa94f1601","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-23T07:41:44.580700546Z"},{"id":"led_37f6787c-7ad8-4532-b147-da13dca56fb2","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_01880e82-e622-4574-8137-4e46c63eb2ca","createdAt":"2026-10-23T07:41:45.232686310Z"},{"id":"led_aa062917-c7a6-4cf0-8258-04f33c5753fa","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_c8fb68f7-5e6d-439e-8b8c-f8667fcb2de1","createdAt":"2026-10-23T07:41:45.233205248Z"},{"id":"led_569e46e3-5e4c-404f-93e8-fc985e72322a","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_c1c138e2-1127-43ad-a4b1-00ec78461181","createdAt":"2026-10-23T07:41:45.234247285Z"},{"id":"led_dcc00197-e039-4086-a48f-84bed1e04c89","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_2309cb6f-e0fc-4b4f-9b84-4a72046aecb6","createdAt":"2026-10-23T07:41:45.234624569Z"},{"id":"led_bd9c8fea-3290-4b45-8c60-a544f4854db7","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_d78f6b7d-f1a6-460a-a038-7a5721057d59","createdAt":"2026-10-23T07:41:45.235117726Z"},{"id":"led_ba18cd1b-8e9d-4d4e-ab25-061503f80eb3","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_8eae1800-2fe6-4704-9219-79836252552e","createdAt":"2026-10-23T07:41:45.235191063Z"},{"id":"led_252c58bf-bd11-4eec-a1ec-5bcd9c2dcbf3","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_5f0c5e6f-0029-445d-b95d-12ded321c16c","createdAt":"2026-10-23T07:41:45.235359567Z"},{"id":"led_3fece667-8ff2-4362-a37b-84ccc4f2bc48","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_f74b0107-ac0b-4320-9849-ad4597e56e52","createdAt":"2026-10-23T07:41:45.238109150Z"},{"id":"led_1245f77b-761c-4eab-a7a4-3b20980479ed","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_f13af751-9320-4d8b-bade-0ee70a0e0e79","createdAt":"2026-10-23T07:41:45.238174832Z"},{"id":"led_98268da5-a644-4489-91ad-9e58eef70050","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_6104f3ca-429f-431b-85e5-53fc4e87ce03","createdAt":"2026-10-23T07:41:45.239106565Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ad15b3f5-c1fd-474e-a023-fa8d0c1bbd27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad15b3f5-c1fd-474e-a023-fa8d0c1bbd27
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ad15b3f5-c1fd-474e-a023-fa8d0c1bbd27
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
correlation: qa-5e2d49ef-0a27-4305-bb6e-92f17158ea20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e2d49ef-0a27-4305-bb6e-92f17158ea20
Content-Type: application/json

--- request body ---
{"handle":"qa-0765aeacda6c","password":"****"}

--- response: 401 in 49 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e2d49ef-0a27-4305-bb6e-92f17158ea20
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5e2d49ef-0a27-4305-bb6e-92f17158ea20"}
```
