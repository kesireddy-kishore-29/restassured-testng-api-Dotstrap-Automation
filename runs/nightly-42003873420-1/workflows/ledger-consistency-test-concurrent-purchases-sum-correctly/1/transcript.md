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
| 1 | `POST /v1/accounts` | 201 | 522 | `qa-25ab501d-70b8-437e-be79-8db5d7f504dd` |
| 10 | `POST /v1/auth/token` | 200 | 68 | `qa-8825f623-810c-42d7-a9a0-743361383462` |
| 9 | `POST /v1/auth/token` | 200 | 74 | `qa-9639c793-7386-40d0-a412-257e4fd7e44b` |
| 3 | `POST /v1/auth/token` | 200 | 95 | `qa-6eb58302-06ce-4a71-90a7-00984c6c93c0` |
| 5 | `POST /v1/auth/token` | 200 | 88 | `qa-94c98ac7-4447-4f46-8a7c-008c9a11d50a` |
| 7 | `POST /v1/auth/token` | 200 | 88 | `qa-4684398e-162f-4eca-92c5-2d9e332ff231` |
| 4 | `POST /v1/auth/token` | 200 | 95 | `qa-b502cdde-3be2-4a12-9a33-fd258b929e21` |
| 8 | `POST /v1/auth/token` | 200 | 85 | `qa-a7f6b79f-fe9b-487e-9965-baed96efc979` |
| 6 | `POST /v1/auth/token` | 200 | 91 | `qa-f4f26cd7-b959-4c8f-9476-aaafc7f9d63c` |
| 2 | `POST /v1/auth/token` | 200 | 98 | `qa-6d7f2265-42ba-48de-9646-e9d969c19fbf` |
| 11 | `POST /v1/auth/token` | 200 | 68 | `qa-1dc84965-9cc8-44a9-86a4-7956e0f4f3b0` |
| 14 | `POST /v1/credits/purchases` | 201 | 51 | `qa-b8385f67-31b7-46f0-b14a-4266dc6c38a5` |
| 16 | `POST /v1/credits/purchases` | 201 | 54 | `qa-4e0b0741-8fd9-4715-9265-49aba58a58bc` |
| 12 | `POST /v1/credits/purchases` | 201 | 63 | `qa-dbbaacc2-19e5-4179-b105-294f96ccf5df` |
| 18 | `POST /v1/credits/purchases` | 201 | 54 | `qa-2ccbbf86-b435-47aa-b3d7-bdb76fa77101` |
| 13 | `POST /v1/credits/purchases` | 201 | 67 | `qa-b5eef14a-4ae5-456b-8778-d33413a8db7e` |
| 19 | `POST /v1/credits/purchases` | 201 | 68 | `qa-f7f1e54a-fce4-4f1f-9024-a196619207c2` |
| 17 | `POST /v1/credits/purchases` | 201 | 77 | `qa-ec0629a1-a025-4fbe-9b13-24ceac66ed11` |
| 15 | `POST /v1/credits/purchases` | 201 | 78 | `qa-c3a467e3-2f2a-4efc-9294-8bbd13c0c055` |
| 20 | `POST /v1/credits/purchases` | 201 | 82 | `qa-252bc132-4994-48f8-be43-f2cd3fa7c035` |
| 21 | `POST /v1/credits/purchases` | 201 | 94 | `qa-8bc15155-69d7-4b8c-81ef-82e77ef4a376` |
| 22 | `POST /v1/auth/token` | 200 | 49 | `qa-edced36e-98de-4348-a66c-ddc19f9521aa` |
| 23 | `GET /v1/credits/ledger` | 200 | 62 | `qa-755adebd-51f2-4375-ba41-be091324ef79` |
| 24 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-9ee060bc-80c2-4626-af31-33c43e71037a` |
| 25 | `POST /v1/auth/token` | 401 | 13 | `qa-e15f5f6e-1d93-40a7-9468-eb89bcc274fc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-25ab501d-70b8-437e-be79-8db5d7f504dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25ab501d-70b8-437e-be79-8db5d7f504dd
Content-Type: application/json

--- request body ---
{"handle":"qa-160cc5b0f0b6","displayName":"QA 160cc5b0f0b6","password":"****","region":"us"}

--- response: 201 in 522 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-25ab501d-70b8-437e-be79-8db5d7f504dd
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
Location: /v1/accounts/qa-160cc5b0f0b6
X-Served-Region: us
Content-Length: 181

{"id":"acc_8145ad01-e0c3-496f-8a14-90fb1c937a21","handle":"qa-160cc5b0f0b6","displayName":"QA 160cc5b0f0b6","region":"us","role":"user","createdAt":"2026-11-05T09:37:56.208397096Z"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8825f623-810c-42d7-a9a0-743361383462

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8825f623-810c-42d7-a9a0-743361383462
Content-Type: application/json

--- request body ---
{"handle":"qa-160cc5b0f0b6","password":"****"}

--- response: 200 in 68 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-8825f623-810c-42d7-a9a0-743361383462
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8145ad01-e0c3-496f-8a14-90fb1c937a21"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-9639c793-7386-40d0-a412-257e4fd7e44b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9639c793-7386-40d0-a412-257e4fd7e44b
Content-Type: application/json

--- request body ---
{"handle":"qa-160cc5b0f0b6","password":"****"}

--- response: 200 in 74 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-9639c793-7386-40d0-a412-257e4fd7e44b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8145ad01-e0c3-496f-8a14-90fb1c937a21"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6eb58302-06ce-4a71-90a7-00984c6c93c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eb58302-06ce-4a71-90a7-00984c6c93c0
Content-Type: application/json

--- request body ---
{"handle":"qa-160cc5b0f0b6","password":"****"}

--- response: 200 in 95 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6eb58302-06ce-4a71-90a7-00984c6c93c0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8145ad01-e0c3-496f-8a14-90fb1c937a21"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-94c98ac7-4447-4f46-8a7c-008c9a11d50a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94c98ac7-4447-4f46-8a7c-008c9a11d50a
Content-Type: application/json

--- request body ---
{"handle":"qa-160cc5b0f0b6","password":"****"}

--- response: 200 in 88 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-94c98ac7-4447-4f46-8a7c-008c9a11d50a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8145ad01-e0c3-496f-8a14-90fb1c937a21"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-4684398e-162f-4eca-92c5-2d9e332ff231

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4684398e-162f-4eca-92c5-2d9e332ff231
Content-Type: application/json

--- request body ---
{"handle":"qa-160cc5b0f0b6","password":"****"}

--- response: 200 in 88 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-4684398e-162f-4eca-92c5-2d9e332ff231
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8145ad01-e0c3-496f-8a14-90fb1c937a21"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b502cdde-3be2-4a12-9a33-fd258b929e21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b502cdde-3be2-4a12-9a33-fd258b929e21
Content-Type: application/json

--- request body ---
{"handle":"qa-160cc5b0f0b6","password":"****"}

--- response: 200 in 95 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b502cdde-3be2-4a12-9a33-fd258b929e21
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8145ad01-e0c3-496f-8a14-90fb1c937a21"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-a7f6b79f-fe9b-487e-9965-baed96efc979

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7f6b79f-fe9b-487e-9965-baed96efc979
Content-Type: application/json

--- request body ---
{"handle":"qa-160cc5b0f0b6","password":"****"}

--- response: 200 in 85 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7f6b79f-fe9b-487e-9965-baed96efc979
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8145ad01-e0c3-496f-8a14-90fb1c937a21"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f4f26cd7-b959-4c8f-9476-aaafc7f9d63c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4f26cd7-b959-4c8f-9476-aaafc7f9d63c
Content-Type: application/json

--- request body ---
{"handle":"qa-160cc5b0f0b6","password":"****"}

--- response: 200 in 91 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4f26cd7-b959-4c8f-9476-aaafc7f9d63c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8145ad01-e0c3-496f-8a14-90fb1c937a21"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6d7f2265-42ba-48de-9646-e9d969c19fbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d7f2265-42ba-48de-9646-e9d969c19fbf
Content-Type: application/json

--- request body ---
{"handle":"qa-160cc5b0f0b6","password":"****"}

--- response: 200 in 98 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d7f2265-42ba-48de-9646-e9d969c19fbf
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8145ad01-e0c3-496f-8a14-90fb1c937a21"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-1dc84965-9cc8-44a9-86a4-7956e0f4f3b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dc84965-9cc8-44a9-86a4-7956e0f4f3b0
Content-Type: application/json

--- request body ---
{"handle":"qa-160cc5b0f0b6","password":"****"}

--- response: 200 in 68 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dc84965-9cc8-44a9-86a4-7956e0f4f3b0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8145ad01-e0c3-496f-8a14-90fb1c937a21"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b8385f67-31b7-46f0-b14a-4266dc6c38a5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4f0efee15893470b9ab878ec10098bc5
X-Correlation-Id: qa-b8385f67-31b7-46f0-b14a-4266dc6c38a5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 51 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8385f67-31b7-46f0-b14a-4266dc6c38a5
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
Location: /v1/credits/purchases/pur_437d21cd-14d4-4514-92c6-3a7ea860dc96
Content-Length: 144

{"id":"pur_437d21cd-14d4-4514-92c6-3a7ea860dc96","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-05T09:37:56.980201062Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4e0b0741-8fd9-4715-9265-49aba58a58bc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7a7f865311f54a5380ffa37e1d712600
X-Correlation-Id: qa-4e0b0741-8fd9-4715-9265-49aba58a58bc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 54 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e0b0741-8fd9-4715-9265-49aba58a58bc
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
Location: /v1/credits/purchases/pur_7ddc8350-068b-43ee-a705-48e1a76a86c5
Content-Length: 144

{"id":"pur_7ddc8350-068b-43ee-a705-48e1a76a86c5","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-05T09:37:56.980006138Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-dbbaacc2-19e5-4179-b105-294f96ccf5df

--- request headers ---
Accept: application/json
Idempotency-Key: qa-70b073eaf2b1447985a103b779234d8d
X-Correlation-Id: qa-dbbaacc2-19e5-4179-b105-294f96ccf5df
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 63 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbbaacc2-19e5-4179-b105-294f96ccf5df
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
Location: /v1/credits/purchases/pur_f5720d9c-86ba-46d4-95ec-287a75b182f0
Content-Length: 144

{"id":"pur_f5720d9c-86ba-46d4-95ec-287a75b182f0","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-05T09:37:56.980143624Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2ccbbf86-b435-47aa-b3d7-bdb76fa77101

--- request headers ---
Accept: application/json
Idempotency-Key: qa-53aca150e4bf4b208cde2626a845ed85
X-Correlation-Id: qa-2ccbbf86-b435-47aa-b3d7-bdb76fa77101
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 54 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ccbbf86-b435-47aa-b3d7-bdb76fa77101
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
Location: /v1/credits/purchases/pur_ba6709e2-4c97-4410-83e2-1deee7b2fc1f
Content-Length: 144

{"id":"pur_ba6709e2-4c97-4410-83e2-1deee7b2fc1f","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-05T09:37:56.991525847Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b5eef14a-4ae5-456b-8778-d33413a8db7e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c1fe889cb167498987c5c1df33d84bab
X-Correlation-Id: qa-b5eef14a-4ae5-456b-8778-d33413a8db7e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 67 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5eef14a-4ae5-456b-8778-d33413a8db7e
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
Location: /v1/credits/purchases/pur_9f9425e0-1633-4af9-9718-8bd6a4bf33cd
Content-Length: 144

{"id":"pur_9f9425e0-1633-4af9-9718-8bd6a4bf33cd","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-05T09:37:56.999358805Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f7f1e54a-fce4-4f1f-9024-a196619207c2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-35f79ed1204844d1afc2dc77e045de11
X-Correlation-Id: qa-f7f1e54a-fce4-4f1f-9024-a196619207c2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 68 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7f1e54a-fce4-4f1f-9024-a196619207c2
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
Location: /v1/credits/purchases/pur_4c46e6ca-9c85-4c77-828b-2649eb1dbfe6
Content-Length: 144

{"id":"pur_4c46e6ca-9c85-4c77-828b-2649eb1dbfe6","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-05T09:37:57.004391054Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ec0629a1-a025-4fbe-9b13-24ceac66ed11

--- request headers ---
Accept: application/json
Idempotency-Key: qa-45f4eff5dc3a4136b0cb2e59d2e70fd6
X-Correlation-Id: qa-ec0629a1-a025-4fbe-9b13-24ceac66ed11
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 77 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec0629a1-a025-4fbe-9b13-24ceac66ed11
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
Location: /v1/credits/purchases/pur_69109842-2eff-4985-bf55-7a2793328a3f
Content-Length: 144

{"id":"pur_69109842-2eff-4985-bf55-7a2793328a3f","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-05T09:37:57.013180282Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c3a467e3-2f2a-4efc-9294-8bbd13c0c055

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c98710c0599e4114906afbe8935faf35
X-Correlation-Id: qa-c3a467e3-2f2a-4efc-9294-8bbd13c0c055
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 78 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3a467e3-2f2a-4efc-9294-8bbd13c0c055
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
Location: /v1/credits/purchases/pur_faaebfa0-7613-4ce2-acd0-a330d1d23b72
Content-Length: 144

{"id":"pur_faaebfa0-7613-4ce2-acd0-a330d1d23b72","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-05T09:37:57.012485992Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-252bc132-4994-48f8-be43-f2cd3fa7c035

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2dcbb3686cbc490fae02882424e16999
X-Correlation-Id: qa-252bc132-4994-48f8-be43-f2cd3fa7c035
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 82 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-252bc132-4994-48f8-be43-f2cd3fa7c035
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
Location: /v1/credits/purchases/pur_bfaaa4f3-1490-49cf-a779-d7628028c9f4
Content-Length: 144

{"id":"pur_bfaaa4f3-1490-49cf-a779-d7628028c9f4","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-05T09:37:57.020532637Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8bc15155-69d7-4b8c-81ef-82e77ef4a376

--- request headers ---
Accept: application/json
Idempotency-Key: qa-aea5a1445450458191fbadd23a05b4d9
X-Correlation-Id: qa-8bc15155-69d7-4b8c-81ef-82e77ef4a376
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 94 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bc15155-69d7-4b8c-81ef-82e77ef4a376
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
Location: /v1/credits/purchases/pur_7115c163-4088-45b3-b5a7-7c487e301ad6
Content-Length: 145

{"id":"pur_7115c163-4088-45b3-b5a7-7c487e301ad6","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-05T09:37:57.032315758Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-edced36e-98de-4348-a66c-ddc19f9521aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edced36e-98de-4348-a66c-ddc19f9521aa
Content-Type: application/json

--- request body ---
{"handle":"qa-160cc5b0f0b6","password":"****"}

--- response: 200 in 49 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-edced36e-98de-4348-a66c-ddc19f9521aa
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8145ad01-e0c3-496f-8a14-90fb1c937a21"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-755adebd-51f2-4375-ba41-be091324ef79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-755adebd-51f2-4375-ba41-be091324ef79
Content-Type: application/json

--- response: 200 in 62 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-755adebd-51f2-4375-ba41-be091324ef79
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
Content-Length: 764

{"items":[{"id":"led_894c79ab-3619-402d-98e7-ae53fa4c31d9","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-05T09:37:56.208410511Z"},{"id":"led_e414aa46-f2d2-4c2b-a4fd-ebd176ff44a7","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_7ddc8350-068b-43ee-a705-48e1a76a86c5","createdAt":"2026-11-05T09:37:56.980006138Z"},{"id":"led_e3797f11-fe1a-44a0-8b97-9e477f9d4242","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_f5720d9c-86ba-46d4-95ec-287a75b182f0","createdAt":"2026-11-05T09:37:56.980143624Z"},{"id":"led_9f9058f7-19b0-4af9-a3f7-93a3f532aa26","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_437d21cd-14d4-4514-92c6-3a7ea860dc96","createdAt":"2026-11-05T09:37:56.980201062Z"},{"id":"led_695beece-4afb-4ba8-bd3f-406c5e55dcdf","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_ba6709e2-4c97-4410-83e2-1deee7b2fc1f","createdAt":"2026-11-05T09:37:56.991525847Z"},{"id":"led_2b14ea5b-ff1e-40b4-b35c-5ec6b669a207","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_9f9425e0-1633-4af9-9718-8bd6a4bf33cd","createdAt":"2026-11-05T09:37:56.999358805Z"},{"id":"led_ecbaba7d-1dee-4a85-97e6-177904948707","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_4c46e6ca-9c85-4c77-828b-2649eb1dbfe6","createdAt":"2026-11-05T09:37:57.004391054Z"},{"id":"led_377d4cdf-6a48-4b69-b353-b66be58ec8e6","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_faaebfa0-7613-4ce2-acd0-a330d1d23b72","createdAt":"2026-11-05T09:37:57.012485992Z"},{"id":"led_48dfd071-822c-4830-92d1-d03ff2b2cc19","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_69109842-2eff-4985-bf55-7a2793328a3f","createdAt":"2026-11-05T09:37:57.013180282Z"},{"id":"led_1db08a9b-7648-407a-ac7c-b5b9fca5adb9","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_bfaaa4f3-1490-49cf-a779-d7628028c9f4","createdAt":"2026-11-05T09:37:57.020532637Z"},{"id":"led_231a3c2e-e1b6-4f03-9539-39f556edd139","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_7115c163-4088-45b3-b5a7-7c487e301ad6","createdAt":"2026-11-05T09:37:57.032315758Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9ee060bc-80c2-4626-af31-33c43e71037a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ee060bc-80c2-4626-af31-33c43e71037a
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9ee060bc-80c2-4626-af31-33c43e71037a
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
correlation: qa-e15f5f6e-1d93-40a7-9468-eb89bcc274fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e15f5f6e-1d93-40a7-9468-eb89bcc274fc
Content-Type: application/json

--- request body ---
{"handle":"qa-160cc5b0f0b6","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e15f5f6e-1d93-40a7-9468-eb89bcc274fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e15f5f6e-1d93-40a7-9468-eb89bcc274fc"}
```
