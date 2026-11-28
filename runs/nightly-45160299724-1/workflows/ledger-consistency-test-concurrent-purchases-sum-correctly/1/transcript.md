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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-47df7c18-4a10-41d5-aca1-c8be00924528` |
| 2 | `POST /v1/auth/token` | 200 | 38 | `qa-e751d9de-2b18-4552-b9ca-3d309d870e2b` |
| 5 | `POST /v1/auth/token` | 200 | 34 | `qa-a8a03bbc-3c39-4cf8-ae16-bb466c78ed21` |
| 4 | `POST /v1/auth/token` | 200 | 42 | `qa-d3be85a7-0345-4e7b-863a-694a5f0b5d3c` |
| 7 | `POST /v1/auth/token` | 200 | 34 | `qa-80b59ac4-520d-4d51-ad6c-0cb60be42708` |
| 10 | `POST /v1/auth/token` | 200 | 36 | `qa-2a604cad-65b7-48ae-86a4-1f8d33e37869` |
| 11 | `POST /v1/auth/token` | 200 | 37 | `qa-ae586e89-07e9-411c-b8dd-b5a5fec7f3c5` |
| 8 | `POST /v1/auth/token` | 200 | 46 | `qa-bd5e3fe3-855a-4bee-8b2d-edc9f46ffb3d` |
| 6 | `POST /v1/auth/token` | 200 | 52 | `qa-153d4db4-35b5-404b-8d3c-d15896f08858` |
| 9 | `POST /v1/auth/token` | 200 | 48 | `qa-bc44e2db-be32-4c45-b1ce-92b61216d48f` |
| 3 | `POST /v1/auth/token` | 200 | 61 | `qa-4d0f44e5-af1e-4b89-b528-dd1149d14bfe` |
| 19 | `POST /v1/credits/purchases` | 201 | 33 | `qa-12d934c1-8c75-4447-9746-de2035ac1f51` |
| 18 | `POST /v1/credits/purchases` | 201 | 37 | `qa-8da8a814-f6ad-44d3-8fde-2ddba20d7771` |
| 21 | `POST /v1/credits/purchases` | 201 | 23 | `qa-f7219aeb-0430-4c6c-837d-8be98db2439a` |
| 20 | `POST /v1/credits/purchases` | 201 | 35 | `qa-56c2ea03-6556-4d35-a85e-831d9e714498` |
| 16 | `POST /v1/credits/purchases` | 201 | 43 | `qa-6168d0f1-45ce-4c3f-bcfa-0550980f2ebd` |
| 12 | `POST /v1/credits/purchases` | 201 | 52 | `qa-878f73e4-3916-42e6-98c5-b487ec968f71` |
| 13 | `POST /v1/credits/purchases` | 201 | 51 | `qa-c968e24c-224c-412a-aa43-6e44c90c048d` |
| 14 | `POST /v1/credits/purchases` | 201 | 51 | `qa-021716df-7c34-4bd7-9c7e-75b3a7c8c715` |
| 15 | `POST /v1/credits/purchases` | 201 | 56 | `qa-2bb4558a-28cd-4814-8706-4c8348da1e9e` |
| 17 | `POST /v1/credits/purchases` | 201 | 53 | `qa-f49fe134-78ae-4d61-a8dc-5e59135e5b24` |
| 22 | `POST /v1/auth/token` | 200 | 21 | `qa-837a7c19-936d-4730-96f7-a017ec17780b` |
| 23 | `GET /v1/credits/ledger` | 200 | 58 | `qa-a11aa5ca-d095-4350-9a90-26acba2eee7d` |
| 24 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-95882c6b-f23e-472c-b537-46e46caac298` |
| 25 | `POST /v1/auth/token` | 401 | 16 | `qa-8f2d34fd-20ea-457a-b85e-cf589d5d2482` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-47df7c18-4a10-41d5-aca1-c8be00924528

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47df7c18-4a10-41d5-aca1-c8be00924528
Content-Type: application/json

--- request body ---
{"handle":"qa-09650f759f05","displayName":"QA 09650f759f05","password":"****","region":"us"}

--- response: 201 in 24 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-47df7c18-4a10-41d5-aca1-c8be00924528
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-09650f759f05
X-Served-Region: us
Content-Length: 181

{"id":"acc_f903a54b-03a6-4e85-9b0a-867536e6ed27","handle":"qa-09650f759f05","displayName":"QA 09650f759f05","region":"us","role":"user","createdAt":"2026-11-23T10:55:05.211747860Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e751d9de-2b18-4552-b9ca-3d309d870e2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e751d9de-2b18-4552-b9ca-3d309d870e2b
Content-Type: application/json

--- request body ---
{"handle":"qa-09650f759f05","password":"****"}

--- response: 200 in 38 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e751d9de-2b18-4552-b9ca-3d309d870e2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f903a54b-03a6-4e85-9b0a-867536e6ed27"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a8a03bbc-3c39-4cf8-ae16-bb466c78ed21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8a03bbc-3c39-4cf8-ae16-bb466c78ed21
Content-Type: application/json

--- request body ---
{"handle":"qa-09650f759f05","password":"****"}

--- response: 200 in 34 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8a03bbc-3c39-4cf8-ae16-bb466c78ed21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f903a54b-03a6-4e85-9b0a-867536e6ed27"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d3be85a7-0345-4e7b-863a-694a5f0b5d3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3be85a7-0345-4e7b-863a-694a5f0b5d3c
Content-Type: application/json

--- request body ---
{"handle":"qa-09650f759f05","password":"****"}

--- response: 200 in 42 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3be85a7-0345-4e7b-863a-694a5f0b5d3c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f903a54b-03a6-4e85-9b0a-867536e6ed27"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-80b59ac4-520d-4d51-ad6c-0cb60be42708

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80b59ac4-520d-4d51-ad6c-0cb60be42708
Content-Type: application/json

--- request body ---
{"handle":"qa-09650f759f05","password":"****"}

--- response: 200 in 34 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-80b59ac4-520d-4d51-ad6c-0cb60be42708
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f903a54b-03a6-4e85-9b0a-867536e6ed27"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2a604cad-65b7-48ae-86a4-1f8d33e37869

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a604cad-65b7-48ae-86a4-1f8d33e37869
Content-Type: application/json

--- request body ---
{"handle":"qa-09650f759f05","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a604cad-65b7-48ae-86a4-1f8d33e37869
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f903a54b-03a6-4e85-9b0a-867536e6ed27"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-ae586e89-07e9-411c-b8dd-b5a5fec7f3c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae586e89-07e9-411c-b8dd-b5a5fec7f3c5
Content-Type: application/json

--- request body ---
{"handle":"qa-09650f759f05","password":"****"}

--- response: 200 in 37 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae586e89-07e9-411c-b8dd-b5a5fec7f3c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f903a54b-03a6-4e85-9b0a-867536e6ed27"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-bd5e3fe3-855a-4bee-8b2d-edc9f46ffb3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd5e3fe3-855a-4bee-8b2d-edc9f46ffb3d
Content-Type: application/json

--- request body ---
{"handle":"qa-09650f759f05","password":"****"}

--- response: 200 in 46 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd5e3fe3-855a-4bee-8b2d-edc9f46ffb3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f903a54b-03a6-4e85-9b0a-867536e6ed27"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-153d4db4-35b5-404b-8d3c-d15896f08858

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-153d4db4-35b5-404b-8d3c-d15896f08858
Content-Type: application/json

--- request body ---
{"handle":"qa-09650f759f05","password":"****"}

--- response: 200 in 52 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-153d4db4-35b5-404b-8d3c-d15896f08858
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f903a54b-03a6-4e85-9b0a-867536e6ed27"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-bc44e2db-be32-4c45-b1ce-92b61216d48f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc44e2db-be32-4c45-b1ce-92b61216d48f
Content-Type: application/json

--- request body ---
{"handle":"qa-09650f759f05","password":"****"}

--- response: 200 in 48 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc44e2db-be32-4c45-b1ce-92b61216d48f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f903a54b-03a6-4e85-9b0a-867536e6ed27"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4d0f44e5-af1e-4b89-b528-dd1149d14bfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d0f44e5-af1e-4b89-b528-dd1149d14bfe
Content-Type: application/json

--- request body ---
{"handle":"qa-09650f759f05","password":"****"}

--- response: 200 in 61 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d0f44e5-af1e-4b89-b528-dd1149d14bfe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f903a54b-03a6-4e85-9b0a-867536e6ed27"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-12d934c1-8c75-4447-9746-de2035ac1f51

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2252754aab0d44399dad2b0da8aad96e
X-Correlation-Id: qa-12d934c1-8c75-4447-9746-de2035ac1f51
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 33 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-12d934c1-8c75-4447-9746-de2035ac1f51
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
Location: /v1/credits/purchases/pur_79588388-0cf1-41a9-828c-ffd2bdd6c486
Content-Length: 144

{"id":"pur_79588388-0cf1-41a9-828c-ffd2bdd6c486","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-23T10:55:05.353597509Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8da8a814-f6ad-44d3-8fde-2ddba20d7771

--- request headers ---
Accept: application/json
Idempotency-Key: qa-30a3b70a679147e5b3e6192e2df3d042
X-Correlation-Id: qa-8da8a814-f6ad-44d3-8fde-2ddba20d7771
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 37 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-8da8a814-f6ad-44d3-8fde-2ddba20d7771
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
Location: /v1/credits/purchases/pur_231486f8-ddfc-4250-805e-5b996560cbaf
Content-Length: 144

{"id":"pur_231486f8-ddfc-4250-805e-5b996560cbaf","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-23T10:55:05.353587989Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f7219aeb-0430-4c6c-837d-8be98db2439a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e04e101b1cc64de792c7765282ea8fde
X-Correlation-Id: qa-f7219aeb-0430-4c6c-837d-8be98db2439a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 23 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7219aeb-0430-4c6c-837d-8be98db2439a
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
Location: /v1/credits/purchases/pur_3d7baebd-bd2c-4f68-863b-4c6e39c9425b
Content-Length: 144

{"id":"pur_3d7baebd-bd2c-4f68-863b-4c6e39c9425b","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-23T10:55:05.353648203Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-56c2ea03-6556-4d35-a85e-831d9e714498

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1aa69b2d943549449796f796882be47e
X-Correlation-Id: qa-56c2ea03-6556-4d35-a85e-831d9e714498
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 35 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-56c2ea03-6556-4d35-a85e-831d9e714498
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
Location: /v1/credits/purchases/pur_4a479460-d803-4f7c-aabb-39cb701a501e
Content-Length: 144

{"id":"pur_4a479460-d803-4f7c-aabb-39cb701a501e","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-23T10:55:05.351153107Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6168d0f1-45ce-4c3f-bcfa-0550980f2ebd

--- request headers ---
Accept: application/json
Idempotency-Key: qa-dc2f6bf01ddb46cfbf98f3e1613ed00a
X-Correlation-Id: qa-6168d0f1-45ce-4c3f-bcfa-0550980f2ebd
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 43 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-6168d0f1-45ce-4c3f-bcfa-0550980f2ebd
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
Location: /v1/credits/purchases/pur_7653eee9-2325-419e-8c7b-8fb9f85828b1
Content-Length: 144

{"id":"pur_7653eee9-2325-419e-8c7b-8fb9f85828b1","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-23T10:55:05.355288477Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-878f73e4-3916-42e6-98c5-b487ec968f71

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0cf8d6e36fca4bdab1a1b383ecb9beff
X-Correlation-Id: qa-878f73e4-3916-42e6-98c5-b487ec968f71
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 52 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-878f73e4-3916-42e6-98c5-b487ec968f71
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
Location: /v1/credits/purchases/pur_e2d00cee-fd5a-4e2e-90d4-9845f8da4989
Content-Length: 144

{"id":"pur_e2d00cee-fd5a-4e2e-90d4-9845f8da4989","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-23T10:55:05.354635916Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c968e24c-224c-412a-aa43-6e44c90c048d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7ff7c4f54c324b96b64da896ce07b468
X-Correlation-Id: qa-c968e24c-224c-412a-aa43-6e44c90c048d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 51 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c968e24c-224c-412a-aa43-6e44c90c048d
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
Location: /v1/credits/purchases/pur_d4c3494d-8485-4b98-afad-4c3b67c91eea
Content-Length: 144

{"id":"pur_d4c3494d-8485-4b98-afad-4c3b67c91eea","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-23T10:55:05.357681672Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-021716df-7c34-4bd7-9c7e-75b3a7c8c715

--- request headers ---
Accept: application/json
Idempotency-Key: qa-06199ca7e4a34e0493e60575fd680cf6
X-Correlation-Id: qa-021716df-7c34-4bd7-9c7e-75b3a7c8c715
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 51 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-021716df-7c34-4bd7-9c7e-75b3a7c8c715
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
Location: /v1/credits/purchases/pur_f87ba09b-1cd3-4fed-84ab-1e1f4993a5fd
Content-Length: 144

{"id":"pur_f87ba09b-1cd3-4fed-84ab-1e1f4993a5fd","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-23T10:55:05.348138872Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2bb4558a-28cd-4814-8706-4c8348da1e9e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9d7ca7cff18942a49cbdb7d9b32a20e6
X-Correlation-Id: qa-2bb4558a-28cd-4814-8706-4c8348da1e9e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 56 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bb4558a-28cd-4814-8706-4c8348da1e9e
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
Location: /v1/credits/purchases/pur_7789d7e0-a8ee-4586-bf8c-1f64a56a19c5
Content-Length: 144

{"id":"pur_7789d7e0-a8ee-4586-bf8c-1f64a56a19c5","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-23T10:55:05.361977352Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f49fe134-78ae-4d61-a8dc-5e59135e5b24

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7a4e223c41654b818d7f1fb313450ad0
X-Correlation-Id: qa-f49fe134-78ae-4d61-a8dc-5e59135e5b24
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 53 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f49fe134-78ae-4d61-a8dc-5e59135e5b24
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
Location: /v1/credits/purchases/pur_06a4b935-c296-4f1d-ba74-d502d27e4513
Content-Length: 145

{"id":"pur_06a4b935-c296-4f1d-ba74-d502d27e4513","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-23T10:55:05.362638747Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-837a7c19-936d-4730-96f7-a017ec17780b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-837a7c19-936d-4730-96f7-a017ec17780b
Content-Type: application/json

--- request body ---
{"handle":"qa-09650f759f05","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-837a7c19-936d-4730-96f7-a017ec17780b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f903a54b-03a6-4e85-9b0a-867536e6ed27"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-a11aa5ca-d095-4350-9a90-26acba2eee7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a11aa5ca-d095-4350-9a90-26acba2eee7d
Content-Type: application/json

--- response: 200 in 58 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a11aa5ca-d095-4350-9a90-26acba2eee7d
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
Content-Length: 760

{"items":[{"id":"led_e7e157dd-ab45-41c3-8086-75953d86cc05","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-23T10:55:05.211764476Z"},{"id":"led_8d37ea7a-ff5a-470d-9b3d-900d68fb1059","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_f87ba09b-1cd3-4fed-84ab-1e1f4993a5fd","createdAt":"2026-11-23T10:55:05.348138872Z"},{"id":"led_13ce1b4c-c099-49ae-99bc-bc5251a6190b","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_4a479460-d803-4f7c-aabb-39cb701a501e","createdAt":"2026-11-23T10:55:05.351153107Z"},{"id":"led_2b44c6b1-7949-424e-bfa9-9dce55058d6e","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_231486f8-ddfc-4250-805e-5b996560cbaf","createdAt":"2026-11-23T10:55:05.353587989Z"},{"id":"led_fd12299c-b87e-4174-aa1c-2ac546af11db","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_3d7baebd-bd2c-4f68-863b-4c6e39c9425b","createdAt":"2026-11-23T10:55:05.353648203Z"},{"id":"led_c0de975d-14d8-4690-84ee-911b1a47087e","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_79588388-0cf1-41a9-828c-ffd2bdd6c486","createdAt":"2026-11-23T10:55:05.353597509Z"},{"id":"led_96de6d34-27de-4a1e-9007-9eddb18be60c","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_e2d00cee-fd5a-4e2e-90d4-9845f8da4989","createdAt":"2026-11-23T10:55:05.354635916Z"},{"id":"led_0a514132-7f6b-4a93-999a-da135db20fde","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_7653eee9-2325-419e-8c7b-8fb9f85828b1","createdAt":"2026-11-23T10:55:05.355288477Z"},{"id":"led_355f0d2d-cc6e-464c-9c84-49cfd7c5ea4e","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_d4c3494d-8485-4b98-afad-4c3b67c91eea","createdAt":"2026-11-23T10:55:05.357681672Z"},{"id":"led_b27ea08b-0c2a-4916-b3a4-81605df4152b","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_7789d7e0-a8ee-4586-bf8c-1f64a56a19c5","createdAt":"2026-11-23T10:55:05.361977352Z"},{"id":"led_101c57f1-013f-416f-9589-0ad5242dbf94","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_06a4b935-c296-4f1d-ba74-d502d27e4513","createdAt":"2026-11-23T10:55:05.362638747Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-95882c6b-f23e-472c-b537-46e46caac298

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95882c6b-f23e-472c-b537-46e46caac298
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-95882c6b-f23e-472c-b537-46e46caac298
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
correlation: qa-8f2d34fd-20ea-457a-b85e-cf589d5d2482

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f2d34fd-20ea-457a-b85e-cf589d5d2482
Content-Type: application/json

--- request body ---
{"handle":"qa-09650f759f05","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f2d34fd-20ea-457a-b85e-cf589d5d2482
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f2d34fd-20ea-457a-b85e-cf589d5d2482"}
```
