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
| 1 | `POST /v1/accounts` | 201 | 380 | `qa-4cc1b60a-52d9-4d5e-8c77-083865e094c9` |
| 10 | `POST /v1/auth/token` | 200 | 52 | `qa-7496950f-bb6d-4cb8-877e-8f0132926d1d` |
| 2 | `POST /v1/auth/token` | 200 | 71 | `qa-2e31268d-4447-40d7-9828-48ae52cb16e7` |
| 9 | `POST /v1/auth/token` | 200 | 59 | `qa-43ff40b5-ab22-4f5d-b47c-336f1f9b6b5e` |
| 11 | `POST /v1/auth/token` | 200 | 50 | `qa-aff504cd-1447-4f24-bb35-fcb561a9c665` |
| 7 | `POST /v1/auth/token` | 200 | 64 | `qa-7a1cf4e5-de79-41ce-bacb-57d26d9660cf` |
| 8 | `POST /v1/auth/token` | 200 | 63 | `qa-3d5cd7ef-0b2b-4121-abda-54a3765652ca` |
| 3 | `POST /v1/auth/token` | 200 | 77 | `qa-c1c20927-bed9-4aa1-9801-40bfd475786d` |
| 5 | `POST /v1/auth/token` | 200 | 71 | `qa-d1e822f5-26ed-4dc9-a01a-9d06dfd78b0c` |
| 6 | `POST /v1/auth/token` | 200 | 72 | `qa-fe4f86f6-a1ad-48f5-85f7-fd7a7d375d09` |
| 4 | `POST /v1/auth/token` | 200 | 85 | `qa-afb212b2-cd1e-4c9e-9c82-e1370a7ccbf8` |
| 19 | `POST /v1/credits/purchases` | 201 | 25 | `qa-b16e6743-913b-481b-8b79-a47584aeb212` |
| 21 | `POST /v1/credits/purchases` | 201 | 22 | `qa-6b736353-551d-489b-98a0-a72e021fe117` |
| 18 | `POST /v1/credits/purchases` | 201 | 28 | `qa-f6b46212-8d34-48f4-b3d2-dc722bf0213f` |
| 13 | `POST /v1/credits/purchases` | 201 | 50 | `qa-af5775b1-158a-46f7-98d6-d5c496abf86a` |
| 20 | `POST /v1/credits/purchases` | 201 | 32 | `qa-c6f4e730-42f7-4897-8027-82fc462a3d1b` |
| 16 | `POST /v1/credits/purchases` | 201 | 49 | `qa-6a3769c9-0ca1-4e8b-9cb0-ce7ef287b9ee` |
| 15 | `POST /v1/credits/purchases` | 201 | 56 | `qa-086f3313-dc6a-425f-973e-cb90c288f950` |
| 12 | `POST /v1/credits/purchases` | 201 | 66 | `qa-d35c03fb-9ace-4bd5-84ce-9e6aa6ea10c2` |
| 14 | `POST /v1/credits/purchases` | 201 | 63 | `qa-70283da2-7d0b-4d28-8298-a79d1cf72548` |
| 17 | `POST /v1/credits/purchases` | 201 | 46 | `qa-393f5d04-df12-43c5-809e-c204b950153a` |
| 22 | `POST /v1/auth/token` | 200 | 13 | `qa-7c032bbe-4775-4f01-b575-8dd355222bce` |
| 23 | `GET /v1/credits/ledger` | 200 | 80 | `qa-1e45f223-95ea-4e03-8687-131a68742f74` |
| 24 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-08552bcb-6aa4-4602-9a82-ab8b7215c4ef` |
| 25 | `POST /v1/auth/token` | 401 | 26 | `qa-ee401e4d-5398-4f2f-8ecd-f908ca690bed` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4cc1b60a-52d9-4d5e-8c77-083865e094c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cc1b60a-52d9-4d5e-8c77-083865e094c9
Content-Type: application/json

--- request body ---
{"handle":"qa-825f7e63a0fd","displayName":"QA 825f7e63a0fd","password":"****","region":"us"}

--- response: 201 in 380 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cc1b60a-52d9-4d5e-8c77-083865e094c9
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
Location: /v1/accounts/qa-825f7e63a0fd
X-Served-Region: us
Content-Length: 181

{"id":"acc_18832b06-61e9-482f-9669-86f8ffe44d83","handle":"qa-825f7e63a0fd","displayName":"QA 825f7e63a0fd","region":"us","role":"user","createdAt":"2026-11-08T09:09:09.540811016Z"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7496950f-bb6d-4cb8-877e-8f0132926d1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7496950f-bb6d-4cb8-877e-8f0132926d1d
Content-Type: application/json

--- request body ---
{"handle":"qa-825f7e63a0fd","password":"****"}

--- response: 200 in 52 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7496950f-bb6d-4cb8-877e-8f0132926d1d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18832b06-61e9-482f-9669-86f8ffe44d83"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2e31268d-4447-40d7-9828-48ae52cb16e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e31268d-4447-40d7-9828-48ae52cb16e7
Content-Type: application/json

--- request body ---
{"handle":"qa-825f7e63a0fd","password":"****"}

--- response: 200 in 71 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e31268d-4447-40d7-9828-48ae52cb16e7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18832b06-61e9-482f-9669-86f8ffe44d83"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-43ff40b5-ab22-4f5d-b47c-336f1f9b6b5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43ff40b5-ab22-4f5d-b47c-336f1f9b6b5e
Content-Type: application/json

--- request body ---
{"handle":"qa-825f7e63a0fd","password":"****"}

--- response: 200 in 59 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-43ff40b5-ab22-4f5d-b47c-336f1f9b6b5e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18832b06-61e9-482f-9669-86f8ffe44d83"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-aff504cd-1447-4f24-bb35-fcb561a9c665

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aff504cd-1447-4f24-bb35-fcb561a9c665
Content-Type: application/json

--- request body ---
{"handle":"qa-825f7e63a0fd","password":"****"}

--- response: 200 in 50 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-aff504cd-1447-4f24-bb35-fcb561a9c665
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18832b06-61e9-482f-9669-86f8ffe44d83"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-7a1cf4e5-de79-41ce-bacb-57d26d9660cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a1cf4e5-de79-41ce-bacb-57d26d9660cf
Content-Type: application/json

--- request body ---
{"handle":"qa-825f7e63a0fd","password":"****"}

--- response: 200 in 64 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a1cf4e5-de79-41ce-bacb-57d26d9660cf
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18832b06-61e9-482f-9669-86f8ffe44d83"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-3d5cd7ef-0b2b-4121-abda-54a3765652ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d5cd7ef-0b2b-4121-abda-54a3765652ca
Content-Type: application/json

--- request body ---
{"handle":"qa-825f7e63a0fd","password":"****"}

--- response: 200 in 63 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d5cd7ef-0b2b-4121-abda-54a3765652ca
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18832b06-61e9-482f-9669-86f8ffe44d83"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c1c20927-bed9-4aa1-9801-40bfd475786d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1c20927-bed9-4aa1-9801-40bfd475786d
Content-Type: application/json

--- request body ---
{"handle":"qa-825f7e63a0fd","password":"****"}

--- response: 200 in 77 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1c20927-bed9-4aa1-9801-40bfd475786d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18832b06-61e9-482f-9669-86f8ffe44d83"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-d1e822f5-26ed-4dc9-a01a-9d06dfd78b0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1e822f5-26ed-4dc9-a01a-9d06dfd78b0c
Content-Type: application/json

--- request body ---
{"handle":"qa-825f7e63a0fd","password":"****"}

--- response: 200 in 71 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1e822f5-26ed-4dc9-a01a-9d06dfd78b0c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18832b06-61e9-482f-9669-86f8ffe44d83"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fe4f86f6-a1ad-48f5-85f7-fd7a7d375d09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe4f86f6-a1ad-48f5-85f7-fd7a7d375d09
Content-Type: application/json

--- request body ---
{"handle":"qa-825f7e63a0fd","password":"****"}

--- response: 200 in 72 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe4f86f6-a1ad-48f5-85f7-fd7a7d375d09
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18832b06-61e9-482f-9669-86f8ffe44d83"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-afb212b2-cd1e-4c9e-9c82-e1370a7ccbf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afb212b2-cd1e-4c9e-9c82-e1370a7ccbf8
Content-Type: application/json

--- request body ---
{"handle":"qa-825f7e63a0fd","password":"****"}

--- response: 200 in 85 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-afb212b2-cd1e-4c9e-9c82-e1370a7ccbf8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18832b06-61e9-482f-9669-86f8ffe44d83"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b16e6743-913b-481b-8b79-a47584aeb212

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e50be175c98a45e2b49b504b744819ee
X-Correlation-Id: qa-b16e6743-913b-481b-8b79-a47584aeb212
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-b16e6743-913b-481b-8b79-a47584aeb212
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
Location: /v1/credits/purchases/pur_0ab5a98a-ed2a-4a69-a936-01568a11f8dd
Content-Length: 144

{"id":"pur_0ab5a98a-ed2a-4a69-a936-01568a11f8dd","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-08T09:09:09.988093153Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6b736353-551d-489b-98a0-a72e021fe117

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c6a732348331475eb05d8d8debf7b6e4
X-Correlation-Id: qa-6b736353-551d-489b-98a0-a72e021fe117
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b736353-551d-489b-98a0-a72e021fe117
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
Location: /v1/credits/purchases/pur_0fd7054f-1e43-4345-931e-6d220d2f093a
Content-Length: 145

{"id":"pur_0fd7054f-1e43-4345-931e-6d220d2f093a","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-08T09:09:09.990210934Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f6b46212-8d34-48f4-b3d2-dc722bf0213f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2a1113f49d1940408c3f6537add63a98
X-Correlation-Id: qa-f6b46212-8d34-48f4-b3d2-dc722bf0213f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 28 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6b46212-8d34-48f4-b3d2-dc722bf0213f
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
Location: /v1/credits/purchases/pur_ab01584c-2190-42fc-b2a4-fb7a615727eb
Content-Length: 144

{"id":"pur_ab01584c-2190-42fc-b2a4-fb7a615727eb","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-08T09:09:09.984010125Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-af5775b1-158a-46f7-98d6-d5c496abf86a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8787f061fda84c50b16f9c3b6d536fb0
X-Correlation-Id: qa-af5775b1-158a-46f7-98d6-d5c496abf86a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 50 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-af5775b1-158a-46f7-98d6-d5c496abf86a
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
Location: /v1/credits/purchases/pur_116ca028-15e0-4901-bb18-1581c14cd855
Content-Length: 144

{"id":"pur_116ca028-15e0-4901-bb18-1581c14cd855","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-08T09:09:09.974068250Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c6f4e730-42f7-4897-8027-82fc462a3d1b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a4f6a821937d40d49f9760b3a882cfd0
X-Correlation-Id: qa-c6f4e730-42f7-4897-8027-82fc462a3d1b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 32 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6f4e730-42f7-4897-8027-82fc462a3d1b
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
Location: /v1/credits/purchases/pur_9ca2af5f-61fe-4e62-b27b-48976cb50a47
Content-Length: 144

{"id":"pur_9ca2af5f-61fe-4e62-b27b-48976cb50a47","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-08T09:09:09.983571894Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6a3769c9-0ca1-4e8b-9cb0-ce7ef287b9ee

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1336f42e67704c5a88f55acfbc050a2a
X-Correlation-Id: qa-6a3769c9-0ca1-4e8b-9cb0-ce7ef287b9ee
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 49 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a3769c9-0ca1-4e8b-9cb0-ce7ef287b9ee
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
Location: /v1/credits/purchases/pur_cf59da17-c469-4615-9d64-c45adcdf8ffa
Content-Length: 144

{"id":"pur_cf59da17-c469-4615-9d64-c45adcdf8ffa","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-08T09:09:09.983271981Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-086f3313-dc6a-425f-973e-cb90c288f950

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2d0419242eee4eca8cdf2d33b37f119e
X-Correlation-Id: qa-086f3313-dc6a-425f-973e-cb90c288f950
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 56 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-086f3313-dc6a-425f-973e-cb90c288f950
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
Location: /v1/credits/purchases/pur_84e71c0e-7790-4047-a59b-12403cdb0966
Content-Length: 144

{"id":"pur_84e71c0e-7790-4047-a59b-12403cdb0966","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-08T09:09:09.982554669Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d35c03fb-9ace-4bd5-84ce-9e6aa6ea10c2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-01f7d709c03d4af699059bb9969d07df
X-Correlation-Id: qa-d35c03fb-9ace-4bd5-84ce-9e6aa6ea10c2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 66 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-d35c03fb-9ace-4bd5-84ce-9e6aa6ea10c2
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
Location: /v1/credits/purchases/pur_3419c1b4-9eb7-4c26-8e73-026ec3bddac2
Content-Length: 144

{"id":"pur_3419c1b4-9eb7-4c26-8e73-026ec3bddac2","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-08T09:09:09.976679486Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-70283da2-7d0b-4d28-8298-a79d1cf72548

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e6abf1daabe547629beee3db8397a01a
X-Correlation-Id: qa-70283da2-7d0b-4d28-8298-a79d1cf72548
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 63 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-70283da2-7d0b-4d28-8298-a79d1cf72548
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
Location: /v1/credits/purchases/pur_58442bc7-81ec-4628-a2a3-4b4f53f09c76
Content-Length: 144

{"id":"pur_58442bc7-81ec-4628-a2a3-4b4f53f09c76","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-08T09:09:09.972834448Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-393f5d04-df12-43c5-809e-c204b950153a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a2edec06b34540f3a7665f3eac7a19fa
X-Correlation-Id: qa-393f5d04-df12-43c5-809e-c204b950153a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 46 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-393f5d04-df12-43c5-809e-c204b950153a
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
Location: /v1/credits/purchases/pur_a9e7eb2d-6188-4ea0-9dcf-b70eacc06821
Content-Length: 144

{"id":"pur_a9e7eb2d-6188-4ea0-9dcf-b70eacc06821","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-08T09:09:09.985421235Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-7c032bbe-4775-4f01-b575-8dd355222bce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c032bbe-4775-4f01-b575-8dd355222bce
Content-Type: application/json

--- request body ---
{"handle":"qa-825f7e63a0fd","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c032bbe-4775-4f01-b575-8dd355222bce
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18832b06-61e9-482f-9669-86f8ffe44d83"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-1e45f223-95ea-4e03-8687-131a68742f74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e45f223-95ea-4e03-8687-131a68742f74
Content-Type: application/json

--- response: 200 in 80 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e45f223-95ea-4e03-8687-131a68742f74
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

{"items":[{"id":"led_21a15dc7-20a9-4518-9202-c2e853450e30","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-08T09:09:09.540829574Z"},{"id":"led_969ca2f3-dee8-4533-b179-f153d7c0812a","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_58442bc7-81ec-4628-a2a3-4b4f53f09c76","createdAt":"2026-11-08T09:09:09.972834448Z"},{"id":"led_3c8eba6c-8fb7-4487-8e0d-aa67a83e4e21","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_116ca028-15e0-4901-bb18-1581c14cd855","createdAt":"2026-11-08T09:09:09.974068250Z"},{"id":"led_8fb93f0f-be8f-48e8-ad08-c0f9572a64bf","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_3419c1b4-9eb7-4c26-8e73-026ec3bddac2","createdAt":"2026-11-08T09:09:09.976679486Z"},{"id":"led_23c58178-6716-4bd3-abaa-a7d87d975a42","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_84e71c0e-7790-4047-a59b-12403cdb0966","createdAt":"2026-11-08T09:09:09.982554669Z"},{"id":"led_f9588b37-be41-4555-9f48-7fae9831ba8d","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_cf59da17-c469-4615-9d64-c45adcdf8ffa","createdAt":"2026-11-08T09:09:09.983271981Z"},{"id":"led_04935a4a-24bd-4ebe-908e-bef85c547dc8","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_9ca2af5f-61fe-4e62-b27b-48976cb50a47","createdAt":"2026-11-08T09:09:09.983571894Z"},{"id":"led_850530b8-c223-4646-b6d3-957893b518d8","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_ab01584c-2190-42fc-b2a4-fb7a615727eb","createdAt":"2026-11-08T09:09:09.984010125Z"},{"id":"led_41e5c8c2-8043-48d4-a50d-bc8c5e67005b","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_a9e7eb2d-6188-4ea0-9dcf-b70eacc06821","createdAt":"2026-11-08T09:09:09.985421235Z"},{"id":"led_4cb5bdcf-8fd0-4f62-8228-0d3aba00de82","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_0ab5a98a-ed2a-4a69-a936-01568a11f8dd","createdAt":"2026-11-08T09:09:09.988093153Z"},{"id":"led_1ad414b1-e337-459d-aff2-bc526bfdf111","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_0fd7054f-1e43-4345-931e-6d220d2f093a","createdAt":"2026-11-08T09:09:09.990210934Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-08552bcb-6aa4-4602-9a82-ab8b7215c4ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08552bcb-6aa4-4602-9a82-ab8b7215c4ef
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-08552bcb-6aa4-4602-9a82-ab8b7215c4ef
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
correlation: qa-ee401e4d-5398-4f2f-8ecd-f908ca690bed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee401e4d-5398-4f2f-8ecd-f908ca690bed
Content-Type: application/json

--- request body ---
{"handle":"qa-825f7e63a0fd","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee401e4d-5398-4f2f-8ecd-f908ca690bed
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee401e4d-5398-4f2f-8ecd-f908ca690bed"}
```
