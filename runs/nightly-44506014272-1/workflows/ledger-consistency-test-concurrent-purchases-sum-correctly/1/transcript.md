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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-e0905aaf-53c7-4927-990d-0f6616891a40` |
| 2 | `POST /v1/auth/token` | 200 | 31 | `qa-3cc3f717-a028-4b7b-b250-9561b03ef6fa` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-cb5ab9fd-6863-402f-a111-896430eb50cc` |
| 5 | `POST /v1/auth/token` | 200 | 30 | `qa-0798dd65-10cd-449f-8b02-756377a4ba45` |
| 4 | `POST /v1/auth/token` | 200 | 33 | `qa-328b1511-bac4-4776-a17d-b98676b047d3` |
| 10 | `POST /v1/auth/token` | 200 | 50 | `qa-9ed05b53-546b-4702-a61d-d1c0a4979c7e` |
| 8 | `POST /v1/auth/token` | 200 | 54 | `qa-c6c02d4d-1209-4c6b-90d7-deab7b82923a` |
| 7 | `POST /v1/auth/token` | 200 | 60 | `qa-ef59480b-dbd5-471d-b8c8-1ebee6be1c7e` |
| 6 | `POST /v1/auth/token` | 200 | 62 | `qa-d246fb3b-6f68-43c2-a9d9-bbb32767eb9c` |
| 11 | `POST /v1/auth/token` | 200 | 45 | `qa-e84142bf-8bf2-4bec-8660-b768b4b57cf6` |
| 9 | `POST /v1/auth/token` | 200 | 69 | `qa-3c996a20-0889-4cfc-b05a-3a3318f0eb58` |
| 13 | `POST /v1/credits/purchases` | 201 | 36 | `qa-adc167f0-5c71-44dd-a8f3-020ade2863e4` |
| 16 | `POST /v1/credits/purchases` | 201 | 31 | `qa-2eb5a795-193b-4849-846b-204534e36ae1` |
| 15 | `POST /v1/credits/purchases` | 201 | 41 | `qa-a3db90ed-bcf5-486c-a553-c5b36ac0a990` |
| 17 | `POST /v1/credits/purchases` | 201 | 31 | `qa-9468b317-ce95-40fb-9cfe-eabd111dc8b7` |
| 18 | `POST /v1/credits/purchases` | 201 | 30 | `qa-de3f90f4-709b-4a30-8a55-928207aac595` |
| 12 | `POST /v1/credits/purchases` | 201 | 53 | `qa-65f8989b-2793-4ba7-aaba-ba478ab1a3f5` |
| 19 | `POST /v1/credits/purchases` | 201 | 28 | `qa-e6388b24-e145-4887-b23d-acb36163d1c3` |
| 14 | `POST /v1/credits/purchases` | 201 | 50 | `qa-03b8e2ce-4b05-45d7-b1d6-7634d830e566` |
| 21 | `POST /v1/credits/purchases` | 201 | 25 | `qa-add24500-54b7-4896-b832-82c9f50ec697` |
| 20 | `POST /v1/credits/purchases` | 201 | 35 | `qa-eab3ff19-3c54-4692-afcc-c97ae0de4ee7` |
| 22 | `POST /v1/auth/token` | 200 | 20 | `qa-be031667-773a-457f-8f98-08b6a8b343d1` |
| 23 | `GET /v1/credits/ledger` | 200 | 49 | `qa-3284552d-e6a2-4d82-bd7b-0b219eabdd0c` |
| 24 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-19bb1fad-4e8b-4a05-9ddf-7122731ab494` |
| 25 | `POST /v1/auth/token` | 401 | 18 | `qa-b1038ebe-ec7a-48ab-a4ee-6c8f53957415` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e0905aaf-53c7-4927-990d-0f6616891a40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0905aaf-53c7-4927-990d-0f6616891a40
Content-Type: application/json

--- request body ---
{"handle":"qa-f248e1265a0e","displayName":"QA f248e1265a0e","password":"****","region":"us"}

--- response: 201 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0905aaf-53c7-4927-990d-0f6616891a40
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
Location: /v1/accounts/qa-f248e1265a0e
X-Served-Region: us
Content-Length: 181

{"id":"acc_6fae5217-e6c8-416d-bb39-10274bf6942f","handle":"qa-f248e1265a0e","displayName":"QA f248e1265a0e","region":"us","role":"user","createdAt":"2026-11-19T10:29:45.587846844Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3cc3f717-a028-4b7b-b250-9561b03ef6fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cc3f717-a028-4b7b-b250-9561b03ef6fa
Content-Type: application/json

--- request body ---
{"handle":"qa-f248e1265a0e","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cc3f717-a028-4b7b-b250-9561b03ef6fa
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6fae5217-e6c8-416d-bb39-10274bf6942f"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cb5ab9fd-6863-402f-a111-896430eb50cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb5ab9fd-6863-402f-a111-896430eb50cc
Content-Type: application/json

--- request body ---
{"handle":"qa-f248e1265a0e","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb5ab9fd-6863-402f-a111-896430eb50cc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6fae5217-e6c8-416d-bb39-10274bf6942f"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-0798dd65-10cd-449f-8b02-756377a4ba45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0798dd65-10cd-449f-8b02-756377a4ba45
Content-Type: application/json

--- request body ---
{"handle":"qa-f248e1265a0e","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-0798dd65-10cd-449f-8b02-756377a4ba45
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6fae5217-e6c8-416d-bb39-10274bf6942f"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-328b1511-bac4-4776-a17d-b98676b047d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-328b1511-bac4-4776-a17d-b98676b047d3
Content-Type: application/json

--- request body ---
{"handle":"qa-f248e1265a0e","password":"****"}

--- response: 200 in 33 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-328b1511-bac4-4776-a17d-b98676b047d3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6fae5217-e6c8-416d-bb39-10274bf6942f"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9ed05b53-546b-4702-a61d-d1c0a4979c7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ed05b53-546b-4702-a61d-d1c0a4979c7e
Content-Type: application/json

--- request body ---
{"handle":"qa-f248e1265a0e","password":"****"}

--- response: 200 in 50 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ed05b53-546b-4702-a61d-d1c0a4979c7e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6fae5217-e6c8-416d-bb39-10274bf6942f"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-c6c02d4d-1209-4c6b-90d7-deab7b82923a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6c02d4d-1209-4c6b-90d7-deab7b82923a
Content-Type: application/json

--- request body ---
{"handle":"qa-f248e1265a0e","password":"****"}

--- response: 200 in 54 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6c02d4d-1209-4c6b-90d7-deab7b82923a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6fae5217-e6c8-416d-bb39-10274bf6942f"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-ef59480b-dbd5-471d-b8c8-1ebee6be1c7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef59480b-dbd5-471d-b8c8-1ebee6be1c7e
Content-Type: application/json

--- request body ---
{"handle":"qa-f248e1265a0e","password":"****"}

--- response: 200 in 60 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef59480b-dbd5-471d-b8c8-1ebee6be1c7e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6fae5217-e6c8-416d-bb39-10274bf6942f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d246fb3b-6f68-43c2-a9d9-bbb32767eb9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d246fb3b-6f68-43c2-a9d9-bbb32767eb9c
Content-Type: application/json

--- request body ---
{"handle":"qa-f248e1265a0e","password":"****"}

--- response: 200 in 62 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d246fb3b-6f68-43c2-a9d9-bbb32767eb9c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6fae5217-e6c8-416d-bb39-10274bf6942f"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-e84142bf-8bf2-4bec-8660-b768b4b57cf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e84142bf-8bf2-4bec-8660-b768b4b57cf6
Content-Type: application/json

--- request body ---
{"handle":"qa-f248e1265a0e","password":"****"}

--- response: 200 in 45 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e84142bf-8bf2-4bec-8660-b768b4b57cf6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6fae5217-e6c8-416d-bb39-10274bf6942f"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-3c996a20-0889-4cfc-b05a-3a3318f0eb58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c996a20-0889-4cfc-b05a-3a3318f0eb58
Content-Type: application/json

--- request body ---
{"handle":"qa-f248e1265a0e","password":"****"}

--- response: 200 in 69 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c996a20-0889-4cfc-b05a-3a3318f0eb58
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6fae5217-e6c8-416d-bb39-10274bf6942f"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-adc167f0-5c71-44dd-a8f3-020ade2863e4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7e5e566d029848759028fb1f6e37ed50
X-Correlation-Id: qa-adc167f0-5c71-44dd-a8f3-020ade2863e4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-adc167f0-5c71-44dd-a8f3-020ade2863e4
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
Location: /v1/credits/purchases/pur_c367aa4b-3521-4a16-8e0b-3c427f6cb055
Content-Length: 144

{"id":"pur_c367aa4b-3521-4a16-8e0b-3c427f6cb055","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-19T10:29:45.710251460Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2eb5a795-193b-4849-846b-204534e36ae1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ca1e78f4e14c4bc9be61de09c7ac3a52
X-Correlation-Id: qa-2eb5a795-193b-4849-846b-204534e36ae1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 31 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-2eb5a795-193b-4849-846b-204534e36ae1
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
Location: /v1/credits/purchases/pur_f23486a7-8d0f-451d-bbf9-12b91906eb51
Content-Length: 144

{"id":"pur_f23486a7-8d0f-451d-bbf9-12b91906eb51","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-19T10:29:45.714122959Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a3db90ed-bcf5-486c-a553-c5b36ac0a990

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b6d777a934bb4ca79f01c964ac98c56c
X-Correlation-Id: qa-a3db90ed-bcf5-486c-a553-c5b36ac0a990
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 41 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3db90ed-bcf5-486c-a553-c5b36ac0a990
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
Location: /v1/credits/purchases/pur_6b3c67f6-c074-4a3a-a8d9-b60b07ccaef1
Content-Length: 144

{"id":"pur_6b3c67f6-c074-4a3a-a8d9-b60b07ccaef1","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-19T10:29:45.710819839Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9468b317-ce95-40fb-9cfe-eabd111dc8b7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-824aff12882845ae884712f8e68d9fe1
X-Correlation-Id: qa-9468b317-ce95-40fb-9cfe-eabd111dc8b7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 31 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9468b317-ce95-40fb-9cfe-eabd111dc8b7
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
Location: /v1/credits/purchases/pur_647a9a0e-1c17-4236-9d35-4157c4a4602c
Content-Length: 144

{"id":"pur_647a9a0e-1c17-4236-9d35-4157c4a4602c","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-19T10:29:45.725609977Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-de3f90f4-709b-4a30-8a55-928207aac595

--- request headers ---
Accept: application/json
Idempotency-Key: qa-74fad10448e34ac38f6c20407bbacbff
X-Correlation-Id: qa-de3f90f4-709b-4a30-8a55-928207aac595
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 30 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-de3f90f4-709b-4a30-8a55-928207aac595
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
Location: /v1/credits/purchases/pur_4ce5a35a-51d8-4d3c-98ef-e8a979d68d56
Content-Length: 144

{"id":"pur_4ce5a35a-51d8-4d3c-98ef-e8a979d68d56","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-19T10:29:45.727913438Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-65f8989b-2793-4ba7-aaba-ba478ab1a3f5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6a0d14a4d825487e90fb66e7f421fd3a
X-Correlation-Id: qa-65f8989b-2793-4ba7-aaba-ba478ab1a3f5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 53 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-65f8989b-2793-4ba7-aaba-ba478ab1a3f5
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
Location: /v1/credits/purchases/pur_bf394575-6275-4685-8d1c-ec0877b2b6e0
Content-Length: 144

{"id":"pur_bf394575-6275-4685-8d1c-ec0877b2b6e0","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-19T10:29:45.732589259Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e6388b24-e145-4887-b23d-acb36163d1c3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-dcb452a0a1a24b95aa56bdcad4439c74
X-Correlation-Id: qa-e6388b24-e145-4887-b23d-acb36163d1c3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6388b24-e145-4887-b23d-acb36163d1c3
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
Location: /v1/credits/purchases/pur_1b81b950-5a57-4150-a677-721209bb080b
Content-Length: 144

{"id":"pur_1b81b950-5a57-4150-a677-721209bb080b","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-19T10:29:45.734339169Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-03b8e2ce-4b05-45d7-b1d6-7634d830e566

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cc57617ec0bf40948bab57c98394536a
X-Correlation-Id: qa-03b8e2ce-4b05-45d7-b1d6-7634d830e566
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 50 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-03b8e2ce-4b05-45d7-b1d6-7634d830e566
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
Location: /v1/credits/purchases/pur_3b6c63fc-81d8-4866-b51e-7d2c988a69eb
Content-Length: 144

{"id":"pur_3b6c63fc-81d8-4866-b51e-7d2c988a69eb","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-19T10:29:45.735917727Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-add24500-54b7-4896-b832-82c9f50ec697

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7c51cd1ef9754cd093067f557dae60ce
X-Correlation-Id: qa-add24500-54b7-4896-b832-82c9f50ec697
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-add24500-54b7-4896-b832-82c9f50ec697
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
Location: /v1/credits/purchases/pur_bffc6696-2325-4e9a-8972-d63361d03f0a
Content-Length: 145

{"id":"pur_bffc6696-2325-4e9a-8972-d63361d03f0a","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-19T10:29:45.746480245Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-eab3ff19-3c54-4692-afcc-c97ae0de4ee7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ccf91c360bd7448e975cbe27f7f77cab
X-Correlation-Id: qa-eab3ff19-3c54-4692-afcc-c97ae0de4ee7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 35 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-eab3ff19-3c54-4692-afcc-c97ae0de4ee7
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
Location: /v1/credits/purchases/pur_c984685d-ed00-47db-bc30-31fe6ed62b16
Content-Length: 144

{"id":"pur_c984685d-ed00-47db-bc30-31fe6ed62b16","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-19T10:29:45.744633715Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-be031667-773a-457f-8f98-08b6a8b343d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be031667-773a-457f-8f98-08b6a8b343d1
Content-Type: application/json

--- request body ---
{"handle":"qa-f248e1265a0e","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-be031667-773a-457f-8f98-08b6a8b343d1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6fae5217-e6c8-416d-bb39-10274bf6942f"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-3284552d-e6a2-4d82-bd7b-0b219eabdd0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3284552d-e6a2-4d82-bd7b-0b219eabdd0c
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-3284552d-e6a2-4d82-bd7b-0b219eabdd0c
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

{"items":[{"id":"led_7d6ddf8d-e19b-4ae1-acd9-efc21060a5d8","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-19T10:29:45.587863836Z"},{"id":"led_cf6275d4-191a-40ba-a87a-f5051d3b5695","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_c367aa4b-3521-4a16-8e0b-3c427f6cb055","createdAt":"2026-11-19T10:29:45.710251460Z"},{"id":"led_fa89d6d4-b985-49a0-9b8b-b37748021ed6","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_6b3c67f6-c074-4a3a-a8d9-b60b07ccaef1","createdAt":"2026-11-19T10:29:45.710819839Z"},{"id":"led_5b1e9272-5c8d-49f1-9dea-c17605f602dd","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_f23486a7-8d0f-451d-bbf9-12b91906eb51","createdAt":"2026-11-19T10:29:45.714122959Z"},{"id":"led_527cc423-a5e5-41f3-b1dc-816b64d1fbf3","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_647a9a0e-1c17-4236-9d35-4157c4a4602c","createdAt":"2026-11-19T10:29:45.725609977Z"},{"id":"led_2a5ede1c-5012-424f-a5eb-cde3f171fa08","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_4ce5a35a-51d8-4d3c-98ef-e8a979d68d56","createdAt":"2026-11-19T10:29:45.727913438Z"},{"id":"led_d641c6d5-edb5-4343-82df-ceb875aab2ca","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_bf394575-6275-4685-8d1c-ec0877b2b6e0","createdAt":"2026-11-19T10:29:45.732589259Z"},{"id":"led_e8e77376-bfbb-47b3-a74f-1206de81f42f","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_1b81b950-5a57-4150-a677-721209bb080b","createdAt":"2026-11-19T10:29:45.734339169Z"},{"id":"led_9a77f3f1-bac1-421f-8d6c-fed99881b8c0","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_3b6c63fc-81d8-4866-b51e-7d2c988a69eb","createdAt":"2026-11-19T10:29:45.735917727Z"},{"id":"led_56408b80-852f-4673-b33c-f2eabf85e8fc","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_c984685d-ed00-47db-bc30-31fe6ed62b16","createdAt":"2026-11-19T10:29:45.744633715Z"},{"id":"led_642a186f-e306-4011-acb9-63c571b932bf","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_bffc6696-2325-4e9a-8972-d63361d03f0a","createdAt":"2026-11-19T10:29:45.746480245Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19bb1fad-4e8b-4a05-9ddf-7122731ab494

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19bb1fad-4e8b-4a05-9ddf-7122731ab494
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19bb1fad-4e8b-4a05-9ddf-7122731ab494
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
correlation: qa-b1038ebe-ec7a-48ab-a4ee-6c8f53957415

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1038ebe-ec7a-48ab-a4ee-6c8f53957415
Content-Type: application/json

--- request body ---
{"handle":"qa-f248e1265a0e","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1038ebe-ec7a-48ab-a4ee-6c8f53957415
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1038ebe-ec7a-48ab-a4ee-6c8f53957415"}
```
