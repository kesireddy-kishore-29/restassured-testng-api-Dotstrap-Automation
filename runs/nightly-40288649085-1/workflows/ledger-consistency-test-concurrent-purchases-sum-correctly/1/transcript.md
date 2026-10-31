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
| 1 | `POST /v1/accounts` | 201 | 463 | `qa-c8d6e136-77e7-4d29-9469-729ea05ed88e` |
| 4 | `POST /v1/auth/token` | 200 | 89 | `qa-563fd5b4-46e4-4b67-b311-949f6b3f55fa` |
| 10 | `POST /v1/auth/token` | 200 | 77 | `qa-95424052-efb8-4662-a74a-3f3c7a5a5d74` |
| 3 | `POST /v1/auth/token` | 200 | 94 | `qa-dc22a54c-82e0-45a0-876a-8f06f3200e25` |
| 9 | `POST /v1/auth/token` | 200 | 83 | `qa-810e1177-c5ab-4181-82c3-873ae739b910` |
| 11 | `POST /v1/auth/token` | 200 | 81 | `qa-bce69d73-ef27-45f0-a27f-cebf4e5d1479` |
| 6 | `POST /v1/auth/token` | 200 | 96 | `qa-0c7019e1-2a21-4578-b738-d3efeaf92525` |
| 5 | `POST /v1/auth/token` | 200 | 100 | `qa-efef1926-0b49-4baa-ba1f-11f0ecccb609` |
| 7 | `POST /v1/auth/token` | 200 | 100 | `qa-2bd73df0-f0e1-4b2c-a489-f5542acdabe3` |
| 8 | `POST /v1/auth/token` | 200 | 99 | `qa-3b8a83f6-1ed2-4242-8d55-c929c0297966` |
| 2 | `POST /v1/auth/token` | 200 | 111 | `qa-9e3a352f-12c9-432e-a7cc-92ca1ef7c931` |
| 14 | `POST /v1/credits/purchases` | 201 | 72 | `qa-50c42131-80db-4df5-b279-54538afaa4a2` |
| 19 | `POST /v1/credits/purchases` | 201 | 67 | `qa-85621ac5-2d6b-4ce3-9433-10f17d6eebe6` |
| 12 | `POST /v1/credits/purchases` | 201 | 82 | `qa-71b70005-92b3-42b1-b27c-24980047f228` |
| 17 | `POST /v1/credits/purchases` | 201 | 77 | `qa-9874aa29-95c5-49f4-bcf3-919b4fa6bc1e` |
| 16 | `POST /v1/credits/purchases` | 201 | 74 | `qa-22f989cb-598a-43f7-aead-7f0519ada9b2` |
| 15 | `POST /v1/credits/purchases` | 201 | 80 | `qa-cf214ac2-e28b-4eef-bf51-1779ccb9024f` |
| 13 | `POST /v1/credits/purchases` | 201 | 86 | `qa-9b2a333e-904f-4a12-9f28-051423811218` |
| 18 | `POST /v1/credits/purchases` | 201 | 81 | `qa-b9799bae-efd7-4bd6-8450-84c6583189d8` |
| 21 | `POST /v1/credits/purchases` | 201 | 83 | `qa-51789a1e-9881-4a5d-82f9-e7d7fc622413` |
| 20 | `POST /v1/credits/purchases` | 201 | 87 | `qa-2edf6d2c-0380-4e70-99ca-a9911e2a124e` |
| 22 | `POST /v1/auth/token` | 200 | 26 | `qa-8b693641-2eb0-45ae-a964-d56df6985770` |
| 23 | `GET /v1/credits/ledger` | 200 | 73 | `qa-dd7e874d-2719-4a32-9a92-04ff7c8e918d` |
| 24 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-2c6f8493-e9ab-465e-9337-aa2875b2d46f` |
| 25 | `POST /v1/auth/token` | 401 | 23 | `qa-d022f813-0532-4e8c-ba16-a7c3d287a74f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c8d6e136-77e7-4d29-9469-729ea05ed88e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8d6e136-77e7-4d29-9469-729ea05ed88e
Content-Type: application/json

--- request body ---
{"handle":"qa-da46c4f69db7","displayName":"QA da46c4f69db7","password":"****","region":"us"}

--- response: 201 in 463 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8d6e136-77e7-4d29-9469-729ea05ed88e
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
Location: /v1/accounts/qa-da46c4f69db7
X-Served-Region: us
Content-Length: 181

{"id":"acc_b82a2947-010e-44c8-955e-0d633134d397","handle":"qa-da46c4f69db7","displayName":"QA da46c4f69db7","region":"us","role":"user","createdAt":"2026-10-26T07:54:47.458987386Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-563fd5b4-46e4-4b67-b311-949f6b3f55fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-563fd5b4-46e4-4b67-b311-949f6b3f55fa
Content-Type: application/json

--- request body ---
{"handle":"qa-da46c4f69db7","password":"****"}

--- response: 200 in 89 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-563fd5b4-46e4-4b67-b311-949f6b3f55fa
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b82a2947-010e-44c8-955e-0d633134d397"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-95424052-efb8-4662-a74a-3f3c7a5a5d74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95424052-efb8-4662-a74a-3f3c7a5a5d74
Content-Type: application/json

--- request body ---
{"handle":"qa-da46c4f69db7","password":"****"}

--- response: 200 in 77 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-95424052-efb8-4662-a74a-3f3c7a5a5d74
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b82a2947-010e-44c8-955e-0d633134d397"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dc22a54c-82e0-45a0-876a-8f06f3200e25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc22a54c-82e0-45a0-876a-8f06f3200e25
Content-Type: application/json

--- request body ---
{"handle":"qa-da46c4f69db7","password":"****"}

--- response: 200 in 94 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc22a54c-82e0-45a0-876a-8f06f3200e25
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b82a2947-010e-44c8-955e-0d633134d397"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-810e1177-c5ab-4181-82c3-873ae739b910

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-810e1177-c5ab-4181-82c3-873ae739b910
Content-Type: application/json

--- request body ---
{"handle":"qa-da46c4f69db7","password":"****"}

--- response: 200 in 83 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-810e1177-c5ab-4181-82c3-873ae739b910
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b82a2947-010e-44c8-955e-0d633134d397"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-bce69d73-ef27-45f0-a27f-cebf4e5d1479

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bce69d73-ef27-45f0-a27f-cebf4e5d1479
Content-Type: application/json

--- request body ---
{"handle":"qa-da46c4f69db7","password":"****"}

--- response: 200 in 81 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-bce69d73-ef27-45f0-a27f-cebf4e5d1479
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b82a2947-010e-44c8-955e-0d633134d397"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0c7019e1-2a21-4578-b738-d3efeaf92525

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c7019e1-2a21-4578-b738-d3efeaf92525
Content-Type: application/json

--- request body ---
{"handle":"qa-da46c4f69db7","password":"****"}

--- response: 200 in 96 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c7019e1-2a21-4578-b738-d3efeaf92525
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b82a2947-010e-44c8-955e-0d633134d397"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-efef1926-0b49-4baa-ba1f-11f0ecccb609

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efef1926-0b49-4baa-ba1f-11f0ecccb609
Content-Type: application/json

--- request body ---
{"handle":"qa-da46c4f69db7","password":"****"}

--- response: 200 in 100 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-efef1926-0b49-4baa-ba1f-11f0ecccb609
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b82a2947-010e-44c8-955e-0d633134d397"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-2bd73df0-f0e1-4b2c-a489-f5542acdabe3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bd73df0-f0e1-4b2c-a489-f5542acdabe3
Content-Type: application/json

--- request body ---
{"handle":"qa-da46c4f69db7","password":"****"}

--- response: 200 in 100 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bd73df0-f0e1-4b2c-a489-f5542acdabe3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b82a2947-010e-44c8-955e-0d633134d397"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-3b8a83f6-1ed2-4242-8d55-c929c0297966

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b8a83f6-1ed2-4242-8d55-c929c0297966
Content-Type: application/json

--- request body ---
{"handle":"qa-da46c4f69db7","password":"****"}

--- response: 200 in 99 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b8a83f6-1ed2-4242-8d55-c929c0297966
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b82a2947-010e-44c8-955e-0d633134d397"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9e3a352f-12c9-432e-a7cc-92ca1ef7c931

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e3a352f-12c9-432e-a7cc-92ca1ef7c931
Content-Type: application/json

--- request body ---
{"handle":"qa-da46c4f69db7","password":"****"}

--- response: 200 in 111 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e3a352f-12c9-432e-a7cc-92ca1ef7c931
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b82a2947-010e-44c8-955e-0d633134d397"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-50c42131-80db-4df5-b279-54538afaa4a2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b0df632cc5c548b0a06cfb068162f117
X-Correlation-Id: qa-50c42131-80db-4df5-b279-54538afaa4a2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 72 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-50c42131-80db-4df5-b279-54538afaa4a2
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
Location: /v1/credits/purchases/pur_86eb17bc-28ec-40bc-9c6a-870858c4a21a
Content-Length: 144

{"id":"pur_86eb17bc-28ec-40bc-9c6a-870858c4a21a","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-10-26T07:54:48.092978509Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-85621ac5-2d6b-4ce3-9433-10f17d6eebe6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-af63b2d2e3274bc7a8e57f170c4fea82
X-Correlation-Id: qa-85621ac5-2d6b-4ce3-9433-10f17d6eebe6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 67 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-85621ac5-2d6b-4ce3-9433-10f17d6eebe6
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
Location: /v1/credits/purchases/pur_e24d844a-c9b3-4c4b-b088-6dd90bbf1176
Content-Length: 144

{"id":"pur_e24d844a-c9b3-4c4b-b088-6dd90bbf1176","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-26T07:54:48.092229837Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-71b70005-92b3-42b1-b27c-24980047f228

--- request headers ---
Accept: application/json
Idempotency-Key: qa-083b6ed278844c4d9fd2cf7e1e48cf11
X-Correlation-Id: qa-71b70005-92b3-42b1-b27c-24980047f228
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 82 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-71b70005-92b3-42b1-b27c-24980047f228
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
Location: /v1/credits/purchases/pur_3f885aef-ebf7-4bd8-8054-44cefa75a83a
Content-Length: 144

{"id":"pur_3f885aef-ebf7-4bd8-8054-44cefa75a83a","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-10-26T07:54:48.092302376Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9874aa29-95c5-49f4-bcf3-919b4fa6bc1e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3f598d8f8b1047cca55727e26eef5fc9
X-Correlation-Id: qa-9874aa29-95c5-49f4-bcf3-919b4fa6bc1e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 77 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-9874aa29-95c5-49f4-bcf3-919b4fa6bc1e
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
Location: /v1/credits/purchases/pur_0240aee8-f587-45aa-9968-4d2919399032
Content-Length: 144

{"id":"pur_0240aee8-f587-45aa-9968-4d2919399032","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-10-26T07:54:48.092232094Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-22f989cb-598a-43f7-aead-7f0519ada9b2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0df1d1f5b1ec4da6b6f2898d4d844c60
X-Correlation-Id: qa-22f989cb-598a-43f7-aead-7f0519ada9b2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 74 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-22f989cb-598a-43f7-aead-7f0519ada9b2
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
Location: /v1/credits/purchases/pur_141bf6c0-797d-4210-b50d-8ab1d50e26b5
Content-Length: 145

{"id":"pur_141bf6c0-797d-4210-b50d-8ab1d50e26b5","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-10-26T07:54:48.093061945Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-cf214ac2-e28b-4eef-bf51-1779ccb9024f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-94122a8a9bdb4a76a9b11aafa154fc27
X-Correlation-Id: qa-cf214ac2-e28b-4eef-bf51-1779ccb9024f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 80 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf214ac2-e28b-4eef-bf51-1779ccb9024f
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
Location: /v1/credits/purchases/pur_193a0bf8-e4be-420d-b6a6-28c32660a6a1
Content-Length: 144

{"id":"pur_193a0bf8-e4be-420d-b6a6-28c32660a6a1","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-10-26T07:54:48.092427159Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9b2a333e-904f-4a12-9f28-051423811218

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3f05b8cd459145ec92bab2aaba071d61
X-Correlation-Id: qa-9b2a333e-904f-4a12-9f28-051423811218
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 86 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b2a333e-904f-4a12-9f28-051423811218
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
Location: /v1/credits/purchases/pur_3663e952-f70a-4ceb-bbe6-36e239204557
Content-Length: 144

{"id":"pur_3663e952-f70a-4ceb-bbe6-36e239204557","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-10-26T07:54:48.092903649Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b9799bae-efd7-4bd6-8450-84c6583189d8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a96bcbe311864951b77713b4bee7825b
X-Correlation-Id: qa-b9799bae-efd7-4bd6-8450-84c6583189d8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 81 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9799bae-efd7-4bd6-8450-84c6583189d8
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
Location: /v1/credits/purchases/pur_8449f1fc-b4eb-47f1-83c7-b52e9ac2ee0f
Content-Length: 144

{"id":"pur_8449f1fc-b4eb-47f1-83c7-b52e9ac2ee0f","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-10-26T07:54:48.092735724Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-51789a1e-9881-4a5d-82f9-e7d7fc622413

--- request headers ---
Accept: application/json
Idempotency-Key: qa-194cef3dce2b4f7c9810fbd5585854cd
X-Correlation-Id: qa-51789a1e-9881-4a5d-82f9-e7d7fc622413
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 83 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-51789a1e-9881-4a5d-82f9-e7d7fc622413
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
Location: /v1/credits/purchases/pur_597a5e5f-a790-48ee-aac2-ea4e7c919702
Content-Length: 144

{"id":"pur_597a5e5f-a790-48ee-aac2-ea4e7c919702","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-10-26T07:54:48.092622275Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2edf6d2c-0380-4e70-99ca-a9911e2a124e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bfe6a98e11b046d7839596e9989a11b5
X-Correlation-Id: qa-2edf6d2c-0380-4e70-99ca-a9911e2a124e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 87 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-2edf6d2c-0380-4e70-99ca-a9911e2a124e
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
Location: /v1/credits/purchases/pur_b1e517a5-75a5-49d5-ba83-b6cf50dc8439
Content-Length: 144

{"id":"pur_b1e517a5-75a5-49d5-ba83-b6cf50dc8439","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-10-26T07:54:48.092649152Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-8b693641-2eb0-45ae-a964-d56df6985770

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b693641-2eb0-45ae-a964-d56df6985770
Content-Type: application/json

--- request body ---
{"handle":"qa-da46c4f69db7","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b693641-2eb0-45ae-a964-d56df6985770
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b82a2947-010e-44c8-955e-0d633134d397"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-dd7e874d-2719-4a32-9a92-04ff7c8e918d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd7e874d-2719-4a32-9a92-04ff7c8e918d
Content-Type: application/json

--- response: 200 in 73 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd7e874d-2719-4a32-9a92-04ff7c8e918d
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
Content-Length: 757

{"items":[{"id":"led_40ead6d5-9d89-4bca-a831-0ac487c80236","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-26T07:54:47.458996413Z"},{"id":"led_857f4cdb-1144-43d7-98b4-ab00e40d149d","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_e24d844a-c9b3-4c4b-b088-6dd90bbf1176","createdAt":"2026-10-26T07:54:48.092229837Z"},{"id":"led_c871be50-e7b5-47f5-98c5-099d0b52d806","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_3f885aef-ebf7-4bd8-8054-44cefa75a83a","createdAt":"2026-10-26T07:54:48.092302376Z"},{"id":"led_0c5dcdb8-67b8-4bd3-a49d-1ff46c29d145","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_0240aee8-f587-45aa-9968-4d2919399032","createdAt":"2026-10-26T07:54:48.092232094Z"},{"id":"led_709b3394-211b-4258-8ce6-d793ab3b1178","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_193a0bf8-e4be-420d-b6a6-28c32660a6a1","createdAt":"2026-10-26T07:54:48.092427159Z"},{"id":"led_a1a34453-d329-4dbc-9329-4fcb72f12e6b","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_597a5e5f-a790-48ee-aac2-ea4e7c919702","createdAt":"2026-10-26T07:54:48.092622275Z"},{"id":"led_fdd9f168-078f-424f-8dc8-a0cbefab9af3","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_b1e517a5-75a5-49d5-ba83-b6cf50dc8439","createdAt":"2026-10-26T07:54:48.092649152Z"},{"id":"led_2c30f490-4dc8-4e9c-bfb1-0ec355c92352","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_8449f1fc-b4eb-47f1-83c7-b52e9ac2ee0f","createdAt":"2026-10-26T07:54:48.092735724Z"},{"id":"led_7516ab4c-cb4b-4897-badb-fbdda0d5321a","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_3663e952-f70a-4ceb-bbe6-36e239204557","createdAt":"2026-10-26T07:54:48.092903649Z"},{"id":"led_157abd03-3959-46ad-a6af-ead784e5cc1a","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_86eb17bc-28ec-40bc-9c6a-870858c4a21a","createdAt":"2026-10-26T07:54:48.092978509Z"},{"id":"led_32349569-5d46-4189-bc0c-1e75015f0059","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_141bf6c0-797d-4210-b50d-8ab1d50e26b5","createdAt":"2026-10-26T07:54:48.093061945Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2c6f8493-e9ab-465e-9337-aa2875b2d46f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c6f8493-e9ab-465e-9337-aa2875b2d46f
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2c6f8493-e9ab-465e-9337-aa2875b2d46f
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
correlation: qa-d022f813-0532-4e8c-ba16-a7c3d287a74f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d022f813-0532-4e8c-ba16-a7c3d287a74f
Content-Type: application/json

--- request body ---
{"handle":"qa-da46c4f69db7","password":"****"}

--- response: 401 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d022f813-0532-4e8c-ba16-a7c3d287a74f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d022f813-0532-4e8c-ba16-a7c3d287a74f"}
```
