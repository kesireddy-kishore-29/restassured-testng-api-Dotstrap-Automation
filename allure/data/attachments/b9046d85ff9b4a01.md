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
| 1 | `POST /v1/accounts` | 201 | 654 | `qa-5b75795c-a836-4270-9b84-9fb7f2c57948` |
| 5 | `POST /v1/auth/token` | 200 | 84 | `qa-4d1b26e9-0519-4ffa-b429-8db3f312b4ee` |
| 11 | `POST /v1/auth/token` | 200 | 53 | `qa-d4e3d14f-3eb3-4035-b302-514632818a81` |
| 3 | `POST /v1/auth/token` | 200 | 100 | `qa-04e12a19-4b83-4863-b297-b917951dc7f9` |
| 2 | `POST /v1/auth/token` | 200 | 102 | `qa-d9bf6819-36a5-4b5f-943d-bc9aa07b7ad2` |
| 4 | `POST /v1/auth/token` | 200 | 109 | `qa-70d9e057-28d3-4f90-9b44-d32d2435e934` |
| 6 | `POST /v1/auth/token` | 200 | 99 | `qa-f1527979-a44a-4eb8-b3eb-291f0869b484` |
| 9 | `POST /v1/auth/token` | 200 | 87 | `qa-1eb24071-a8e6-4c9b-aa32-878b880c1278` |
| 8 | `POST /v1/auth/token` | 200 | 95 | `qa-1d596cb2-4d84-4894-94a2-e5707018e326` |
| 10 | `POST /v1/auth/token` | 200 | 88 | `qa-7ec9de71-9606-4e9e-87fe-067617d62e78` |
| 7 | `POST /v1/auth/token` | 200 | 105 | `qa-63f3fc8e-be99-4f45-bf5c-6c9d5c310b49` |
| 12 | `POST /v1/credits/purchases` | 201 | 84 | `qa-5ec10136-fcab-4dca-8682-cf1411ca9a37` |
| 15 | `POST /v1/credits/purchases` | 201 | 80 | `qa-f491c199-c700-4b30-9c2a-4ef02de2142f` |
| 18 | `POST /v1/credits/purchases` | 201 | 73 | `qa-02b58d1b-798e-471b-99e7-5a93318d98e2` |
| 13 | `POST /v1/credits/purchases` | 201 | 85 | `qa-1356ac90-f94e-4479-8373-66fb1548c5da` |
| 16 | `POST /v1/credits/purchases` | 201 | 79 | `qa-b0a256b0-33f3-4196-b8d1-a896d774727f` |
| 17 | `POST /v1/credits/purchases` | 201 | 79 | `qa-5efc59f0-6c6d-47da-a73e-a180d38aa96b` |
| 19 | `POST /v1/credits/purchases` | 201 | 79 | `qa-e5d8102b-60af-4d80-a78c-03a6b49625a0` |
| 21 | `POST /v1/credits/purchases` | 201 | 71 | `qa-f5b0d8de-19a1-4060-9c37-894aed6852dc` |
| 14 | `POST /v1/credits/purchases` | 201 | 96 | `qa-8a0a2d4f-6b6b-4e84-8e5a-be3c6c01fff4` |
| 20 | `POST /v1/credits/purchases` | 201 | 78 | `qa-7dd186c6-d343-4e15-9b5f-79b015a0c7ad` |
| 22 | `POST /v1/auth/token` | 200 | 20 | `qa-03a87170-2413-4f8d-8e5d-33f19f402457` |
| 23 | `GET /v1/credits/ledger` | 200 | 48 | `qa-58536a3c-c4e5-4a47-9eb9-2cf3d4406654` |
| 24 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-5e91b448-eb12-49c1-92eb-19d5cf9996de` |
| 25 | `POST /v1/auth/token` | 401 | 11 | `qa-dd540e1a-d5be-441f-aeb4-17088948ce9c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5b75795c-a836-4270-9b84-9fb7f2c57948

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b75795c-a836-4270-9b84-9fb7f2c57948
Content-Type: application/json

--- request body ---
{"handle":"qa-c268cdd14d63","displayName":"QA c268cdd14d63","password":"****","region":"us"}

--- response: 201 in 654 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b75795c-a836-4270-9b84-9fb7f2c57948
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
Location: /v1/accounts/qa-c268cdd14d63
X-Served-Region: us
Content-Length: 181

{"id":"acc_68c8b475-f0f4-4fe3-a663-2486e734e2c6","handle":"qa-c268cdd14d63","displayName":"QA c268cdd14d63","region":"us","role":"user","createdAt":"2026-10-31T08:31:35.656150425Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4d1b26e9-0519-4ffa-b429-8db3f312b4ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d1b26e9-0519-4ffa-b429-8db3f312b4ee
Content-Type: application/json

--- request body ---
{"handle":"qa-c268cdd14d63","password":"****"}

--- response: 200 in 84 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d1b26e9-0519-4ffa-b429-8db3f312b4ee
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68c8b475-f0f4-4fe3-a663-2486e734e2c6"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-d4e3d14f-3eb3-4035-b302-514632818a81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4e3d14f-3eb3-4035-b302-514632818a81
Content-Type: application/json

--- request body ---
{"handle":"qa-c268cdd14d63","password":"****"}

--- response: 200 in 53 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4e3d14f-3eb3-4035-b302-514632818a81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68c8b475-f0f4-4fe3-a663-2486e734e2c6"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-04e12a19-4b83-4863-b297-b917951dc7f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04e12a19-4b83-4863-b297-b917951dc7f9
Content-Type: application/json

--- request body ---
{"handle":"qa-c268cdd14d63","password":"****"}

--- response: 200 in 100 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-04e12a19-4b83-4863-b297-b917951dc7f9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68c8b475-f0f4-4fe3-a663-2486e734e2c6"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d9bf6819-36a5-4b5f-943d-bc9aa07b7ad2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9bf6819-36a5-4b5f-943d-bc9aa07b7ad2
Content-Type: application/json

--- request body ---
{"handle":"qa-c268cdd14d63","password":"****"}

--- response: 200 in 102 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9bf6819-36a5-4b5f-943d-bc9aa07b7ad2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68c8b475-f0f4-4fe3-a663-2486e734e2c6"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-70d9e057-28d3-4f90-9b44-d32d2435e934

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70d9e057-28d3-4f90-9b44-d32d2435e934
Content-Type: application/json

--- request body ---
{"handle":"qa-c268cdd14d63","password":"****"}

--- response: 200 in 109 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-70d9e057-28d3-4f90-9b44-d32d2435e934
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68c8b475-f0f4-4fe3-a663-2486e734e2c6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f1527979-a44a-4eb8-b3eb-291f0869b484

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1527979-a44a-4eb8-b3eb-291f0869b484
Content-Type: application/json

--- request body ---
{"handle":"qa-c268cdd14d63","password":"****"}

--- response: 200 in 99 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1527979-a44a-4eb8-b3eb-291f0869b484
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68c8b475-f0f4-4fe3-a663-2486e734e2c6"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-1eb24071-a8e6-4c9b-aa32-878b880c1278

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1eb24071-a8e6-4c9b-aa32-878b880c1278
Content-Type: application/json

--- request body ---
{"handle":"qa-c268cdd14d63","password":"****"}

--- response: 200 in 87 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1eb24071-a8e6-4c9b-aa32-878b880c1278
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68c8b475-f0f4-4fe3-a663-2486e734e2c6"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-1d596cb2-4d84-4894-94a2-e5707018e326

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d596cb2-4d84-4894-94a2-e5707018e326
Content-Type: application/json

--- request body ---
{"handle":"qa-c268cdd14d63","password":"****"}

--- response: 200 in 95 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d596cb2-4d84-4894-94a2-e5707018e326
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68c8b475-f0f4-4fe3-a663-2486e734e2c6"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7ec9de71-9606-4e9e-87fe-067617d62e78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ec9de71-9606-4e9e-87fe-067617d62e78
Content-Type: application/json

--- request body ---
{"handle":"qa-c268cdd14d63","password":"****"}

--- response: 200 in 88 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ec9de71-9606-4e9e-87fe-067617d62e78
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68c8b475-f0f4-4fe3-a663-2486e734e2c6"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-63f3fc8e-be99-4f45-bf5c-6c9d5c310b49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63f3fc8e-be99-4f45-bf5c-6c9d5c310b49
Content-Type: application/json

--- request body ---
{"handle":"qa-c268cdd14d63","password":"****"}

--- response: 200 in 105 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-63f3fc8e-be99-4f45-bf5c-6c9d5c310b49
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68c8b475-f0f4-4fe3-a663-2486e734e2c6"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5ec10136-fcab-4dca-8682-cf1411ca9a37

--- request headers ---
Accept: application/json
Idempotency-Key: qa-13651be7c4b74caeaa40a5f2a18900ef
X-Correlation-Id: qa-5ec10136-fcab-4dca-8682-cf1411ca9a37
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 84 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ec10136-fcab-4dca-8682-cf1411ca9a37
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
Location: /v1/credits/purchases/pur_0cfc6c40-1a68-4b99-b6f1-b6ad06d8f462
Content-Length: 144

{"id":"pur_0cfc6c40-1a68-4b99-b6f1-b6ad06d8f462","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-10-31T08:31:36.267806988Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f491c199-c700-4b30-9c2a-4ef02de2142f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e41a37c02ca744ceb5a956e90f2ddcec
X-Correlation-Id: qa-f491c199-c700-4b30-9c2a-4ef02de2142f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 80 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-f491c199-c700-4b30-9c2a-4ef02de2142f
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
Location: /v1/credits/purchases/pur_d9df99e9-0f07-4f4d-80a9-b37adc28144b
Content-Length: 144

{"id":"pur_d9df99e9-0f07-4f4d-80a9-b37adc28144b","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-10-31T08:31:36.271214187Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-02b58d1b-798e-471b-99e7-5a93318d98e2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-984efda7900743f49ae42f3afdfd8c1f
X-Correlation-Id: qa-02b58d1b-798e-471b-99e7-5a93318d98e2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 73 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-02b58d1b-798e-471b-99e7-5a93318d98e2
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
Location: /v1/credits/purchases/pur_114410df-2787-440b-b432-e872c772af0c
Content-Length: 144

{"id":"pur_114410df-2787-440b-b432-e872c772af0c","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-10-31T08:31:36.267696483Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1356ac90-f94e-4479-8373-66fb1548c5da

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9dfe8c2f57b84eeca8173e5b565c27ff
X-Correlation-Id: qa-1356ac90-f94e-4479-8373-66fb1548c5da
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 85 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1356ac90-f94e-4479-8373-66fb1548c5da
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
Location: /v1/credits/purchases/pur_3ec10e9e-5ddd-45f3-9b9f-05084e67f8d2
Content-Length: 144

{"id":"pur_3ec10e9e-5ddd-45f3-9b9f-05084e67f8d2","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-10-31T08:31:36.271430194Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b0a256b0-33f3-4196-b8d1-a896d774727f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4d57e32f961d482ab26f2529e2e6e0b2
X-Correlation-Id: qa-b0a256b0-33f3-4196-b8d1-a896d774727f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 79 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0a256b0-33f3-4196-b8d1-a896d774727f
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
Location: /v1/credits/purchases/pur_c6f350b9-14ba-4a0e-8c30-f0b9ed86e840
Content-Length: 144

{"id":"pur_c6f350b9-14ba-4a0e-8c30-f0b9ed86e840","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-10-31T08:31:36.269651720Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5efc59f0-6c6d-47da-a73e-a180d38aa96b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-30b5b2c175ac40bfa5c12da0538ded5f
X-Correlation-Id: qa-5efc59f0-6c6d-47da-a73e-a180d38aa96b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 79 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5efc59f0-6c6d-47da-a73e-a180d38aa96b
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
Location: /v1/credits/purchases/pur_9a9b3e0c-8172-421f-8f0e-dd1ec32bdd0a
Content-Length: 144

{"id":"pur_9a9b3e0c-8172-421f-8f0e-dd1ec32bdd0a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-31T08:31:36.267028468Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e5d8102b-60af-4d80-a78c-03a6b49625a0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c92cb76dc7f64a87b880331e3dc69855
X-Correlation-Id: qa-e5d8102b-60af-4d80-a78c-03a6b49625a0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 79 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5d8102b-60af-4d80-a78c-03a6b49625a0
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
Location: /v1/credits/purchases/pur_2a9f0e7b-b441-4437-bac2-365163666fa0
Content-Length: 144

{"id":"pur_2a9f0e7b-b441-4437-bac2-365163666fa0","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-10-31T08:31:36.268211422Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f5b0d8de-19a1-4060-9c37-894aed6852dc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5d571d6e13574de9a3dccc4771beb83b
X-Correlation-Id: qa-f5b0d8de-19a1-4060-9c37-894aed6852dc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 71 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5b0d8de-19a1-4060-9c37-894aed6852dc
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
Location: /v1/credits/purchases/pur_94dfa9fb-7840-472d-ad85-b487beec1b23
Content-Length: 144

{"id":"pur_94dfa9fb-7840-472d-ad85-b487beec1b23","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-10-31T08:31:36.277222456Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8a0a2d4f-6b6b-4e84-8e5a-be3c6c01fff4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6d67e99976864807aff6240c25bd6e80
X-Correlation-Id: qa-8a0a2d4f-6b6b-4e84-8e5a-be3c6c01fff4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 96 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a0a2d4f-6b6b-4e84-8e5a-be3c6c01fff4
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
Location: /v1/credits/purchases/pur_76ea2870-717b-40c4-bfa4-a14eec1bd319
Content-Length: 144

{"id":"pur_76ea2870-717b-40c4-bfa4-a14eec1bd319","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-10-31T08:31:36.279456398Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7dd186c6-d343-4e15-9b5f-79b015a0c7ad

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a4798e536984417b988cf84db9196691
X-Correlation-Id: qa-7dd186c6-d343-4e15-9b5f-79b015a0c7ad
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 78 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dd186c6-d343-4e15-9b5f-79b015a0c7ad
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
Location: /v1/credits/purchases/pur_e552f9d1-d891-4a67-a457-19800882d73c
Content-Length: 145

{"id":"pur_e552f9d1-d891-4a67-a457-19800882d73c","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-10-31T08:31:36.286760568Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-03a87170-2413-4f8d-8e5d-33f19f402457

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03a87170-2413-4f8d-8e5d-33f19f402457
Content-Type: application/json

--- request body ---
{"handle":"qa-c268cdd14d63","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-03a87170-2413-4f8d-8e5d-33f19f402457
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68c8b475-f0f4-4fe3-a663-2486e734e2c6"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-58536a3c-c4e5-4a47-9eb9-2cf3d4406654

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58536a3c-c4e5-4a47-9eb9-2cf3d4406654
Content-Type: application/json

--- response: 200 in 48 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-58536a3c-c4e5-4a47-9eb9-2cf3d4406654
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
Content-Length: 762

{"items":[{"id":"led_e81fd810-816d-429c-994a-9d4a5fd86097","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-31T08:31:35.656162357Z"},{"id":"led_288a58fb-edd1-4543-8114-86f0a3e42f07","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_9a9b3e0c-8172-421f-8f0e-dd1ec32bdd0a","createdAt":"2026-10-31T08:31:36.267028468Z"},{"id":"led_85594e90-54fa-4180-b8ad-8ce46ae279bb","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_114410df-2787-440b-b432-e872c772af0c","createdAt":"2026-10-31T08:31:36.267696483Z"},{"id":"led_55765358-716f-46d0-a40f-26de592120de","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_0cfc6c40-1a68-4b99-b6f1-b6ad06d8f462","createdAt":"2026-10-31T08:31:36.267806988Z"},{"id":"led_f3fb4ee3-3eee-483f-9773-0a0f44e50ea2","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_2a9f0e7b-b441-4437-bac2-365163666fa0","createdAt":"2026-10-31T08:31:36.268211422Z"},{"id":"led_32863308-faf5-4b80-bf3d-8d61f3d3e0b0","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_c6f350b9-14ba-4a0e-8c30-f0b9ed86e840","createdAt":"2026-10-31T08:31:36.269651720Z"},{"id":"led_aafdd792-59fc-4c65-b98b-2587f7206973","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_d9df99e9-0f07-4f4d-80a9-b37adc28144b","createdAt":"2026-10-31T08:31:36.271214187Z"},{"id":"led_6474b915-ee1f-4dc3-9b79-e5f7072a584c","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_3ec10e9e-5ddd-45f3-9b9f-05084e67f8d2","createdAt":"2026-10-31T08:31:36.271430194Z"},{"id":"led_110a11a3-dc97-45b8-8f94-b2d8f23e5604","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_94dfa9fb-7840-472d-ad85-b487beec1b23","createdAt":"2026-10-31T08:31:36.277222456Z"},{"id":"led_c4748f7a-9e77-405e-a2a8-9c3db318979a","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_76ea2870-717b-40c4-bfa4-a14eec1bd319","createdAt":"2026-10-31T08:31:36.279456398Z"},{"id":"led_4e1f7c50-6c51-48c1-94ef-1ef3c06576a2","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_e552f9d1-d891-4a67-a457-19800882d73c","createdAt":"2026-10-31T08:31:36.286760568Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e91b448-eb12-49c1-92eb-19d5cf9996de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e91b448-eb12-49c1-92eb-19d5cf9996de
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e91b448-eb12-49c1-92eb-19d5cf9996de
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
correlation: qa-dd540e1a-d5be-441f-aeb4-17088948ce9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd540e1a-d5be-441f-aeb4-17088948ce9c
Content-Type: application/json

--- request body ---
{"handle":"qa-c268cdd14d63","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dd540e1a-d5be-441f-aeb4-17088948ce9c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dd540e1a-d5be-441f-aeb4-17088948ce9c"}
```
