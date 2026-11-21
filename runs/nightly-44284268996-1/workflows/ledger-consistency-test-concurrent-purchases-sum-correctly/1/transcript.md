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
| 1 | `POST /v1/accounts` | 201 | 281 | `qa-14e51886-50a9-4853-9d51-e8bd8878c1d6` |
| 5 | `POST /v1/auth/token` | 200 | 50 | `qa-1dad399f-d298-456f-9e44-191741347f1a` |
| 2 | `POST /v1/auth/token` | 200 | 56 | `qa-8261c284-9613-41c6-bd17-f11f606504ea` |
| 3 | `POST /v1/auth/token` | 200 | 56 | `qa-8c323536-ca02-4398-981a-4e438523fb87` |
| 4 | `POST /v1/auth/token` | 200 | 52 | `qa-39c77227-dcb6-485e-aa31-8d45fe3999f6` |
| 8 | `POST /v1/auth/token` | 200 | 38 | `qa-2ce9f724-f217-44c5-b81d-655cdc508533` |
| 6 | `POST /v1/auth/token` | 200 | 58 | `qa-f0c51e17-4beb-4b79-9ed5-2b129c9b7993` |
| 10 | `POST /v1/auth/token` | 200 | 23 | `qa-09f97cb8-ce54-454d-9bf2-85b9de661bc5` |
| 7 | `POST /v1/auth/token` | 200 | 81 | `qa-3741f3ba-0339-4a11-98f0-8fbfc99ab60d` |
| 11 | `POST /v1/auth/token` | 200 | 31 | `qa-780bfd74-263e-4556-84e3-032a3e5c5378` |
| 9 | `POST /v1/auth/token` | 200 | 62 | `qa-05b232da-84ce-42b3-b2e3-674aab48ac24` |
| 18 | `POST /v1/credits/purchases` | 201 | 34 | `qa-24122b21-a863-4ebf-8e32-13255b69a56a` |
| 14 | `POST /v1/credits/purchases` | 201 | 44 | `qa-f554fed6-2e76-4fd8-87bd-22c2cb1865b1` |
| 13 | `POST /v1/credits/purchases` | 201 | 47 | `qa-13298acb-e65d-475f-9cad-9b62fab1a2fb` |
| 20 | `POST /v1/credits/purchases` | 201 | 44 | `qa-11d836f8-5da6-4973-a226-79ab61472291` |
| 17 | `POST /v1/credits/purchases` | 201 | 51 | `qa-36cac5ee-aabf-4279-8d81-55c5ce59dd78` |
| 19 | `POST /v1/credits/purchases` | 201 | 45 | `qa-4fb12498-a929-46c1-958f-16afe77d9b1e` |
| 15 | `POST /v1/credits/purchases` | 201 | 55 | `qa-c191d9e8-b6f1-44ef-8aaa-b2629673fd23` |
| 16 | `POST /v1/credits/purchases` | 201 | 45 | `qa-c1a8f815-17fd-47da-a562-8b8ed204ac1e` |
| 21 | `POST /v1/credits/purchases` | 201 | 42 | `qa-7ccfc1bd-6f40-4515-ba4d-994d08e6140e` |
| 12 | `POST /v1/credits/purchases` | 201 | 57 | `qa-9879746e-f23b-4c65-803f-4ecddb295e13` |
| 22 | `POST /v1/auth/token` | 200 | 12 | `qa-afd5e5ed-f4f1-481d-a0ef-7c4c2bce20de` |
| 23 | `GET /v1/credits/ledger` | 200 | 54 | `qa-9c1a8082-6196-4bb4-b9ed-22f9e1b8d459` |
| 24 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-25ad9f19-8899-4ae3-b3ae-94e5c1c967b2` |
| 25 | `POST /v1/auth/token` | 401 | 11 | `qa-1582ca66-1387-4c13-b3b9-97d4755125f2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-14e51886-50a9-4853-9d51-e8bd8878c1d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14e51886-50a9-4853-9d51-e8bd8878c1d6
Content-Type: application/json

--- request body ---
{"handle":"qa-e8188e01fd1f","displayName":"QA e8188e01fd1f","password":"****","region":"us"}

--- response: 201 in 281 ms ---
Date: Wed, 18 Nov 2026 10:19:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-14e51886-50a9-4853-9d51-e8bd8878c1d6
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
Location: /v1/accounts/qa-e8188e01fd1f
X-Served-Region: us
Content-Length: 181

{"id":"acc_d3277342-63ad-45e1-bdc6-84792e6dab75","handle":"qa-e8188e01fd1f","displayName":"QA e8188e01fd1f","region":"us","role":"user","createdAt":"2026-11-18T10:19:39.741374450Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-1dad399f-d298-456f-9e44-191741347f1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dad399f-d298-456f-9e44-191741347f1a
Content-Type: application/json

--- request body ---
{"handle":"qa-e8188e01fd1f","password":"****"}

--- response: 200 in 50 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dad399f-d298-456f-9e44-191741347f1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3277342-63ad-45e1-bdc6-84792e6dab75"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8261c284-9613-41c6-bd17-f11f606504ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8261c284-9613-41c6-bd17-f11f606504ea
Content-Type: application/json

--- request body ---
{"handle":"qa-e8188e01fd1f","password":"****"}

--- response: 200 in 56 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-8261c284-9613-41c6-bd17-f11f606504ea
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3277342-63ad-45e1-bdc6-84792e6dab75"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8c323536-ca02-4398-981a-4e438523fb87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c323536-ca02-4398-981a-4e438523fb87
Content-Type: application/json

--- request body ---
{"handle":"qa-e8188e01fd1f","password":"****"}

--- response: 200 in 56 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c323536-ca02-4398-981a-4e438523fb87
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3277342-63ad-45e1-bdc6-84792e6dab75"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-39c77227-dcb6-485e-aa31-8d45fe3999f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39c77227-dcb6-485e-aa31-8d45fe3999f6
Content-Type: application/json

--- request body ---
{"handle":"qa-e8188e01fd1f","password":"****"}

--- response: 200 in 52 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-39c77227-dcb6-485e-aa31-8d45fe3999f6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3277342-63ad-45e1-bdc6-84792e6dab75"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-2ce9f724-f217-44c5-b81d-655cdc508533

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ce9f724-f217-44c5-b81d-655cdc508533
Content-Type: application/json

--- request body ---
{"handle":"qa-e8188e01fd1f","password":"****"}

--- response: 200 in 38 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ce9f724-f217-44c5-b81d-655cdc508533
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3277342-63ad-45e1-bdc6-84792e6dab75"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f0c51e17-4beb-4b79-9ed5-2b129c9b7993

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0c51e17-4beb-4b79-9ed5-2b129c9b7993
Content-Type: application/json

--- request body ---
{"handle":"qa-e8188e01fd1f","password":"****"}

--- response: 200 in 58 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0c51e17-4beb-4b79-9ed5-2b129c9b7993
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3277342-63ad-45e1-bdc6-84792e6dab75"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-09f97cb8-ce54-454d-9bf2-85b9de661bc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09f97cb8-ce54-454d-9bf2-85b9de661bc5
Content-Type: application/json

--- request body ---
{"handle":"qa-e8188e01fd1f","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-09f97cb8-ce54-454d-9bf2-85b9de661bc5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3277342-63ad-45e1-bdc6-84792e6dab75"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-3741f3ba-0339-4a11-98f0-8fbfc99ab60d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3741f3ba-0339-4a11-98f0-8fbfc99ab60d
Content-Type: application/json

--- request body ---
{"handle":"qa-e8188e01fd1f","password":"****"}

--- response: 200 in 81 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-3741f3ba-0339-4a11-98f0-8fbfc99ab60d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3277342-63ad-45e1-bdc6-84792e6dab75"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-780bfd74-263e-4556-84e3-032a3e5c5378

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-780bfd74-263e-4556-84e3-032a3e5c5378
Content-Type: application/json

--- request body ---
{"handle":"qa-e8188e01fd1f","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-780bfd74-263e-4556-84e3-032a3e5c5378
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3277342-63ad-45e1-bdc6-84792e6dab75"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-05b232da-84ce-42b3-b2e3-674aab48ac24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05b232da-84ce-42b3-b2e3-674aab48ac24
Content-Type: application/json

--- request body ---
{"handle":"qa-e8188e01fd1f","password":"****"}

--- response: 200 in 62 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-05b232da-84ce-42b3-b2e3-674aab48ac24
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3277342-63ad-45e1-bdc6-84792e6dab75"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-24122b21-a863-4ebf-8e32-13255b69a56a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f00fb57d40724b858c1ce9af27c9574a
X-Correlation-Id: qa-24122b21-a863-4ebf-8e32-13255b69a56a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 34 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-24122b21-a863-4ebf-8e32-13255b69a56a
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
Location: /v1/credits/purchases/pur_b6b8d19a-34f9-4036-9888-3fabceb4aba9
Content-Length: 144

{"id":"pur_b6b8d19a-34f9-4036-9888-3fabceb4aba9","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-18T10:19:40.158257589Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f554fed6-2e76-4fd8-87bd-22c2cb1865b1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-29ca18ea56ad4026b3e11bdca38f753c
X-Correlation-Id: qa-f554fed6-2e76-4fd8-87bd-22c2cb1865b1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 44 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-f554fed6-2e76-4fd8-87bd-22c2cb1865b1
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
Location: /v1/credits/purchases/pur_1d19be18-f44f-4d7f-b9d3-43563530dc09
Content-Length: 144

{"id":"pur_1d19be18-f44f-4d7f-b9d3-43563530dc09","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-18T10:19:40.156721363Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-13298acb-e65d-475f-9cad-9b62fab1a2fb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-49f02e154d2a410db6f1d068afc6cd12
X-Correlation-Id: qa-13298acb-e65d-475f-9cad-9b62fab1a2fb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 47 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-13298acb-e65d-475f-9cad-9b62fab1a2fb
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
Location: /v1/credits/purchases/pur_2dd2b439-4f29-4140-9c2d-3e15745d359c
Content-Length: 144

{"id":"pur_2dd2b439-4f29-4140-9c2d-3e15745d359c","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-18T10:19:40.163065860Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-11d836f8-5da6-4973-a226-79ab61472291

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0c5e4d0601f44de08a277fd2d388e3b2
X-Correlation-Id: qa-11d836f8-5da6-4973-a226-79ab61472291
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 44 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-11d836f8-5da6-4973-a226-79ab61472291
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
Location: /v1/credits/purchases/pur_6eddd120-c21e-4f44-88a7-b3e4be1a6243
Content-Length: 145

{"id":"pur_6eddd120-c21e-4f44-88a7-b3e4be1a6243","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-18T10:19:40.167177285Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-36cac5ee-aabf-4279-8d81-55c5ce59dd78

--- request headers ---
Accept: application/json
Idempotency-Key: qa-439bda7dc1cf45a7aa81b47db01d15e4
X-Correlation-Id: qa-36cac5ee-aabf-4279-8d81-55c5ce59dd78
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 51 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-36cac5ee-aabf-4279-8d81-55c5ce59dd78
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
Location: /v1/credits/purchases/pur_1e98dbfc-8ab4-40f3-b45d-039265844fa0
Content-Length: 144

{"id":"pur_1e98dbfc-8ab4-40f3-b45d-039265844fa0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-18T10:19:40.156376991Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4fb12498-a929-46c1-958f-16afe77d9b1e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e853dc0f0d51406ca64dbcb5df0e61a9
X-Correlation-Id: qa-4fb12498-a929-46c1-958f-16afe77d9b1e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 45 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fb12498-a929-46c1-958f-16afe77d9b1e
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
Location: /v1/credits/purchases/pur_17e1a2e9-3703-43a4-a9c2-f3bb748ef6e9
Content-Length: 144

{"id":"pur_17e1a2e9-3703-43a4-a9c2-f3bb748ef6e9","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-18T10:19:40.157165926Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c191d9e8-b6f1-44ef-8aaa-b2629673fd23

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a509a465685b4a5791fad98af10387c3
X-Correlation-Id: qa-c191d9e8-b6f1-44ef-8aaa-b2629673fd23
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 55 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-c191d9e8-b6f1-44ef-8aaa-b2629673fd23
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
Location: /v1/credits/purchases/pur_875caaae-6e33-4661-acd5-78ae90c9be21
Content-Length: 144

{"id":"pur_875caaae-6e33-4661-acd5-78ae90c9be21","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-18T10:19:40.163589303Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c1a8f815-17fd-47da-a562-8b8ed204ac1e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-73b90d72a2354fe0b81a1ab9e8a0b196
X-Correlation-Id: qa-c1a8f815-17fd-47da-a562-8b8ed204ac1e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 45 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1a8f815-17fd-47da-a562-8b8ed204ac1e
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
Location: /v1/credits/purchases/pur_6d904ff3-2bfc-45ee-92c0-bc44e35bc1ef
Content-Length: 144

{"id":"pur_6d904ff3-2bfc-45ee-92c0-bc44e35bc1ef","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-18T10:19:40.157265216Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7ccfc1bd-6f40-4515-ba4d-994d08e6140e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-00424d1bd14a479796496503116ad6eb
X-Correlation-Id: qa-7ccfc1bd-6f40-4515-ba4d-994d08e6140e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 42 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ccfc1bd-6f40-4515-ba4d-994d08e6140e
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
Location: /v1/credits/purchases/pur_730a1e62-a585-48e3-a9bd-87819efde3f7
Content-Length: 144

{"id":"pur_730a1e62-a585-48e3-a9bd-87819efde3f7","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-18T10:19:40.157493612Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9879746e-f23b-4c65-803f-4ecddb295e13

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6a0ef7a1bf904767a8324221e35ca8d9
X-Correlation-Id: qa-9879746e-f23b-4c65-803f-4ecddb295e13
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 57 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-9879746e-f23b-4c65-803f-4ecddb295e13
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
Location: /v1/credits/purchases/pur_7dde0e88-f762-4aa7-9665-5baaa2eebf20
Content-Length: 144

{"id":"pur_7dde0e88-f762-4aa7-9665-5baaa2eebf20","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-18T10:19:40.157764593Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-afd5e5ed-f4f1-481d-a0ef-7c4c2bce20de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afd5e5ed-f4f1-481d-a0ef-7c4c2bce20de
Content-Type: application/json

--- request body ---
{"handle":"qa-e8188e01fd1f","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-afd5e5ed-f4f1-481d-a0ef-7c4c2bce20de
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3277342-63ad-45e1-bdc6-84792e6dab75"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-9c1a8082-6196-4bb4-b9ed-22f9e1b8d459

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c1a8082-6196-4bb4-b9ed-22f9e1b8d459
Content-Type: application/json

--- response: 200 in 54 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c1a8082-6196-4bb4-b9ed-22f9e1b8d459
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

{"items":[{"id":"led_d5bc8e5e-83ed-408b-b565-1eb0e1586036","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-18T10:19:39.741387730Z"},{"id":"led_60dc650d-575f-40d8-af68-bfaa934ea8c9","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_1e98dbfc-8ab4-40f3-b45d-039265844fa0","createdAt":"2026-11-18T10:19:40.156376991Z"},{"id":"led_a0c38f7f-2399-4035-b2f0-8d054a19bf9a","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_1d19be18-f44f-4d7f-b9d3-43563530dc09","createdAt":"2026-11-18T10:19:40.156721363Z"},{"id":"led_1d011ecd-8f9d-4f5e-b9fb-798226cb3be6","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_17e1a2e9-3703-43a4-a9c2-f3bb748ef6e9","createdAt":"2026-11-18T10:19:40.157165926Z"},{"id":"led_ff5b9a79-6a28-44b8-829a-9bf3f31c6dd9","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_6d904ff3-2bfc-45ee-92c0-bc44e35bc1ef","createdAt":"2026-11-18T10:19:40.157265216Z"},{"id":"led_a6a2e2e7-f5b3-42ca-b1b8-17e31fa24861","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_730a1e62-a585-48e3-a9bd-87819efde3f7","createdAt":"2026-11-18T10:19:40.157493612Z"},{"id":"led_bbf45d16-3492-4da2-9e43-2ec6839db6e2","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_7dde0e88-f762-4aa7-9665-5baaa2eebf20","createdAt":"2026-11-18T10:19:40.157764593Z"},{"id":"led_8b29a15c-f910-4b36-98a1-6086dcc5c654","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_b6b8d19a-34f9-4036-9888-3fabceb4aba9","createdAt":"2026-11-18T10:19:40.158257589Z"},{"id":"led_a77a9646-1d19-4f80-b0d7-678765301387","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_2dd2b439-4f29-4140-9c2d-3e15745d359c","createdAt":"2026-11-18T10:19:40.163065860Z"},{"id":"led_47537817-8b73-4ae2-8351-ce760ce23b34","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_875caaae-6e33-4661-acd5-78ae90c9be21","createdAt":"2026-11-18T10:19:40.163589303Z"},{"id":"led_8b7260f5-ee33-40cc-ad23-f0ae4abac05a","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_6eddd120-c21e-4f44-88a7-b3e4be1a6243","createdAt":"2026-11-18T10:19:40.167177285Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-25ad9f19-8899-4ae3-b3ae-94e5c1c967b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25ad9f19-8899-4ae3-b3ae-94e5c1c967b2
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-25ad9f19-8899-4ae3-b3ae-94e5c1c967b2
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
correlation: qa-1582ca66-1387-4c13-b3b9-97d4755125f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1582ca66-1387-4c13-b3b9-97d4755125f2
Content-Type: application/json

--- request body ---
{"handle":"qa-e8188e01fd1f","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1582ca66-1387-4c13-b3b9-97d4755125f2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1582ca66-1387-4c13-b3b9-97d4755125f2"}
```
