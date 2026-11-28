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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-7ec1fcc5-c9cb-40ac-920f-746a0a480f8a` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-8e762f21-752b-423a-b297-b32ef1dcab05` |
| 2 | `POST /v1/auth/token` | 200 | 33 | `qa-aa08ee14-2e3b-4319-b6ff-4edd225a0577` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-947a66d7-940a-4bbe-8853-91de0564e647` |
| 8 | `POST /v1/auth/token` | 200 | 35 | `qa-177ffba8-bd53-46e8-bfdc-fafd2eb5bab6` |
| 5 | `POST /v1/auth/token` | 200 | 48 | `qa-684ea089-d1c2-4323-8b37-4b0df42bebd1` |
| 11 | `POST /v1/auth/token` | 200 | 41 | `qa-5ebc860e-f7c3-45b7-8582-bb267286c23a` |
| 7 | `POST /v1/auth/token` | 200 | 49 | `qa-f5af4669-d5fd-4686-a5c1-3dd72b08aced` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-f5963a54-efab-4b71-ac47-075f79c694fe` |
| 9 | `POST /v1/auth/token` | 200 | 55 | `qa-06c893cf-ff02-4a91-9b4f-00bb18f18c01` |
| 10 | `POST /v1/auth/token` | 200 | 55 | `qa-80605b02-333e-4c40-92ed-27b0d51c5bc8` |
| 15 | `POST /v1/credits/purchases` | 201 | 24 | `qa-4711b4cf-1980-42dd-84fb-078f93764756` |
| 16 | `POST /v1/credits/purchases` | 201 | 26 | `qa-1a5d0c0a-60a1-4d84-815a-dcc4f4f6823d` |
| 13 | `POST /v1/credits/purchases` | 201 | 29 | `qa-7f7afddd-a7c7-4e58-93ee-6cc8494235c9` |
| 14 | `POST /v1/credits/purchases` | 201 | 34 | `qa-2160e7e1-454e-4146-881e-7385a8e20908` |
| 12 | `POST /v1/credits/purchases` | 201 | 39 | `qa-98ba6b27-8182-4097-91f0-35e098385f0f` |
| 18 | `POST /v1/credits/purchases` | 201 | 22 | `qa-8444275e-e712-4ca1-9ba4-86cbe3bd65c2` |
| 19 | `POST /v1/credits/purchases` | 201 | 16 | `qa-81fcad18-056a-4cf3-857b-a4c8a0e2b1b8` |
| 17 | `POST /v1/credits/purchases` | 201 | 24 | `qa-bf05ed00-4cc8-4695-9184-d20b16d9504f` |
| 20 | `POST /v1/credits/purchases` | 201 | 17 | `qa-19a3b2ff-6905-4bdc-9337-90b0c38d14a5` |
| 21 | `POST /v1/credits/purchases` | 201 | 21 | `qa-9808c525-8fe3-464f-8e70-f877811bf377` |
| 22 | `POST /v1/auth/token` | 200 | 15 | `qa-70f22ade-2aab-459d-8fe2-06e4eabf4a22` |
| 23 | `GET /v1/credits/ledger` | 200 | 54 | `qa-b713374d-2d4f-46d7-8d97-bc4ec84e4280` |
| 24 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-0568e0ac-5b08-4000-8021-53f65d06a73d` |
| 25 | `POST /v1/auth/token` | 401 | 9 | `qa-a2b5f776-4470-4016-aed5-7ab5cb8581dd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7ec1fcc5-c9cb-40ac-920f-746a0a480f8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ec1fcc5-c9cb-40ac-920f-746a0a480f8a
Content-Type: application/json

--- request body ---
{"handle":"qa-eb6a87ed5f50","displayName":"QA eb6a87ed5f50","password":"****","region":"us"}

--- response: 201 in 10 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ec1fcc5-c9cb-40ac-920f-746a0a480f8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-eb6a87ed5f50
X-Served-Region: us
Content-Length: 181

{"id":"acc_5070be71-1936-4105-8b67-d1d005437201","handle":"qa-eb6a87ed5f50","displayName":"QA eb6a87ed5f50","region":"us","role":"user","createdAt":"2026-11-27T10:59:52.870229891Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8e762f21-752b-423a-b297-b32ef1dcab05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e762f21-752b-423a-b297-b32ef1dcab05
Content-Type: application/json

--- request body ---
{"handle":"qa-eb6a87ed5f50","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e762f21-752b-423a-b297-b32ef1dcab05
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5070be71-1936-4105-8b67-d1d005437201"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-aa08ee14-2e3b-4319-b6ff-4edd225a0577

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa08ee14-2e3b-4319-b6ff-4edd225a0577
Content-Type: application/json

--- request body ---
{"handle":"qa-eb6a87ed5f50","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa08ee14-2e3b-4319-b6ff-4edd225a0577
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5070be71-1936-4105-8b67-d1d005437201"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-947a66d7-940a-4bbe-8853-91de0564e647

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-947a66d7-940a-4bbe-8853-91de0564e647
Content-Type: application/json

--- request body ---
{"handle":"qa-eb6a87ed5f50","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-947a66d7-940a-4bbe-8853-91de0564e647
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5070be71-1936-4105-8b67-d1d005437201"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-177ffba8-bd53-46e8-bfdc-fafd2eb5bab6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-177ffba8-bd53-46e8-bfdc-fafd2eb5bab6
Content-Type: application/json

--- request body ---
{"handle":"qa-eb6a87ed5f50","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-177ffba8-bd53-46e8-bfdc-fafd2eb5bab6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5070be71-1936-4105-8b67-d1d005437201"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-684ea089-d1c2-4323-8b37-4b0df42bebd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-684ea089-d1c2-4323-8b37-4b0df42bebd1
Content-Type: application/json

--- request body ---
{"handle":"qa-eb6a87ed5f50","password":"****"}

--- response: 200 in 48 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-684ea089-d1c2-4323-8b37-4b0df42bebd1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5070be71-1936-4105-8b67-d1d005437201"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-5ebc860e-f7c3-45b7-8582-bb267286c23a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ebc860e-f7c3-45b7-8582-bb267286c23a
Content-Type: application/json

--- request body ---
{"handle":"qa-eb6a87ed5f50","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ebc860e-f7c3-45b7-8582-bb267286c23a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5070be71-1936-4105-8b67-d1d005437201"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-f5af4669-d5fd-4686-a5c1-3dd72b08aced

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5af4669-d5fd-4686-a5c1-3dd72b08aced
Content-Type: application/json

--- request body ---
{"handle":"qa-eb6a87ed5f50","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5af4669-d5fd-4686-a5c1-3dd72b08aced
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5070be71-1936-4105-8b67-d1d005437201"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f5963a54-efab-4b71-ac47-075f79c694fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5963a54-efab-4b71-ac47-075f79c694fe
Content-Type: application/json

--- request body ---
{"handle":"qa-eb6a87ed5f50","password":"****"}

--- response: 200 in 51 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5963a54-efab-4b71-ac47-075f79c694fe
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5070be71-1936-4105-8b67-d1d005437201"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-06c893cf-ff02-4a91-9b4f-00bb18f18c01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06c893cf-ff02-4a91-9b4f-00bb18f18c01
Content-Type: application/json

--- request body ---
{"handle":"qa-eb6a87ed5f50","password":"****"}

--- response: 200 in 55 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-06c893cf-ff02-4a91-9b4f-00bb18f18c01
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5070be71-1936-4105-8b67-d1d005437201"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-80605b02-333e-4c40-92ed-27b0d51c5bc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80605b02-333e-4c40-92ed-27b0d51c5bc8
Content-Type: application/json

--- request body ---
{"handle":"qa-eb6a87ed5f50","password":"****"}

--- response: 200 in 55 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-80605b02-333e-4c40-92ed-27b0d51c5bc8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5070be71-1936-4105-8b67-d1d005437201"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4711b4cf-1980-42dd-84fb-078f93764756

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8476b22e7f3e43e5abdb1bf583dd4538
X-Correlation-Id: qa-4711b4cf-1980-42dd-84fb-078f93764756
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4711b4cf-1980-42dd-84fb-078f93764756
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
Location: /v1/credits/purchases/pur_a5f544d7-a3ff-43a4-93c8-b1799064d782
Content-Length: 144

{"id":"pur_a5f544d7-a3ff-43a4-93c8-b1799064d782","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-27T10:59:52.992138953Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1a5d0c0a-60a1-4d84-815a-dcc4f4f6823d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ec8d0b48e1ae478e9d7c996bb4902920
X-Correlation-Id: qa-1a5d0c0a-60a1-4d84-815a-dcc4f4f6823d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a5d0c0a-60a1-4d84-815a-dcc4f4f6823d
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
Location: /v1/credits/purchases/pur_6e7e5d8c-56fa-417f-b538-cefc82d486c2
Content-Length: 144

{"id":"pur_6e7e5d8c-56fa-417f-b538-cefc82d486c2","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-27T10:59:52.992999232Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7f7afddd-a7c7-4e58-93ee-6cc8494235c9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5b6b88863a1c425ba5f9dfc489c19436
X-Correlation-Id: qa-7f7afddd-a7c7-4e58-93ee-6cc8494235c9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 29 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f7afddd-a7c7-4e58-93ee-6cc8494235c9
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
Location: /v1/credits/purchases/pur_4d49b826-ac0a-4e3a-ba37-feb71b8b6c3a
Content-Length: 144

{"id":"pur_4d49b826-ac0a-4e3a-ba37-feb71b8b6c3a","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-27T10:59:52.992193354Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2160e7e1-454e-4146-881e-7385a8e20908

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2f7d573fde03434f99cd6f075ee9e409
X-Correlation-Id: qa-2160e7e1-454e-4146-881e-7385a8e20908
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 34 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2160e7e1-454e-4146-881e-7385a8e20908
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
Location: /v1/credits/purchases/pur_7abc8bf2-2a6d-44b7-81e9-93673ae820fc
Content-Length: 144

{"id":"pur_7abc8bf2-2a6d-44b7-81e9-93673ae820fc","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-27T10:59:52.994177755Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-98ba6b27-8182-4097-91f0-35e098385f0f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c302047e96a04fc88763cb6f4aa1e5e8
X-Correlation-Id: qa-98ba6b27-8182-4097-91f0-35e098385f0f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 39 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-98ba6b27-8182-4097-91f0-35e098385f0f
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
Location: /v1/credits/purchases/pur_d9e85397-1a15-4de0-8dd9-6358d0eee185
Content-Length: 144

{"id":"pur_d9e85397-1a15-4de0-8dd9-6358d0eee185","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-27T10:59:52.989949136Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8444275e-e712-4ca1-9ba4-86cbe3bd65c2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ce624881333c47b39cab75d024dda49b
X-Correlation-Id: qa-8444275e-e712-4ca1-9ba4-86cbe3bd65c2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 22 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8444275e-e712-4ca1-9ba4-86cbe3bd65c2
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
Location: /v1/credits/purchases/pur_12a1c535-fd68-4a20-ac2f-839295097cea
Content-Length: 144

{"id":"pur_12a1c535-fd68-4a20-ac2f-839295097cea","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-27T10:59:52.996481641Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-81fcad18-056a-4cf3-857b-a4c8a0e2b1b8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-81be29d9a4d84e919df2178e2d54abcd
X-Correlation-Id: qa-81fcad18-056a-4cf3-857b-a4c8a0e2b1b8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-81fcad18-056a-4cf3-857b-a4c8a0e2b1b8
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
Location: /v1/credits/purchases/pur_07e53212-c698-4494-a2a5-684390f73ae9
Content-Length: 144

{"id":"pur_07e53212-c698-4494-a2a5-684390f73ae9","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-27T10:59:53.003664364Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bf05ed00-4cc8-4695-9184-d20b16d9504f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-40b5d0e1f88b4bd8af5dd89846d78bdd
X-Correlation-Id: qa-bf05ed00-4cc8-4695-9184-d20b16d9504f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf05ed00-4cc8-4695-9184-d20b16d9504f
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
Location: /v1/credits/purchases/pur_f0c75a02-0a45-48fb-b3b0-f1e2aaa42892
Content-Length: 144

{"id":"pur_f0c75a02-0a45-48fb-b3b0-f1e2aaa42892","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-27T10:59:52.995290290Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-19a3b2ff-6905-4bdc-9337-90b0c38d14a5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-73746658af4b4e93b246fedaa242c584
X-Correlation-Id: qa-19a3b2ff-6905-4bdc-9337-90b0c38d14a5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-19a3b2ff-6905-4bdc-9337-90b0c38d14a5
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
Location: /v1/credits/purchases/pur_313a8b14-8645-4a1d-ae20-70281cb5ddf4
Content-Length: 144

{"id":"pur_313a8b14-8645-4a1d-ae20-70281cb5ddf4","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-27T10:59:53.006882540Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9808c525-8fe3-464f-8e70-f877811bf377

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f0ebf74454944072b7143133bd2674c4
X-Correlation-Id: qa-9808c525-8fe3-464f-8e70-f877811bf377
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-9808c525-8fe3-464f-8e70-f877811bf377
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
Location: /v1/credits/purchases/pur_2a65814f-3346-48fe-b68f-33da98575bd9
Content-Length: 145

{"id":"pur_2a65814f-3346-48fe-b68f-33da98575bd9","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-27T10:59:53.016718667Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-70f22ade-2aab-459d-8fe2-06e4eabf4a22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70f22ade-2aab-459d-8fe2-06e4eabf4a22
Content-Type: application/json

--- request body ---
{"handle":"qa-eb6a87ed5f50","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-70f22ade-2aab-459d-8fe2-06e4eabf4a22
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5070be71-1936-4105-8b67-d1d005437201"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b713374d-2d4f-46d7-8d97-bc4ec84e4280

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b713374d-2d4f-46d7-8d97-bc4ec84e4280
Content-Type: application/json

--- response: 200 in 54 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b713374d-2d4f-46d7-8d97-bc4ec84e4280
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
Content-Length: 767

{"items":[{"id":"led_57c4dc70-dd3b-417c-8af2-d5b7db0e58cd","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-27T10:59:52.870248228Z"},{"id":"led_904b72a4-c527-4216-bd47-b4b02a2b2044","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_d9e85397-1a15-4de0-8dd9-6358d0eee185","createdAt":"2026-11-27T10:59:52.989949136Z"},{"id":"led_14798ab8-5522-42da-bd99-60f69084802a","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_a5f544d7-a3ff-43a4-93c8-b1799064d782","createdAt":"2026-11-27T10:59:52.992138953Z"},{"id":"led_8f7e6bfb-9246-4d16-9278-c6041367198a","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_4d49b826-ac0a-4e3a-ba37-feb71b8b6c3a","createdAt":"2026-11-27T10:59:52.992193354Z"},{"id":"led_ea4f181b-da8b-4a9b-8913-208a6a60d265","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_6e7e5d8c-56fa-417f-b538-cefc82d486c2","createdAt":"2026-11-27T10:59:52.992999232Z"},{"id":"led_a19c3ae1-0df4-4359-9504-f3cb2075b0c2","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_7abc8bf2-2a6d-44b7-81e9-93673ae820fc","createdAt":"2026-11-27T10:59:52.994177755Z"},{"id":"led_97d5d263-6a9e-41a5-807b-83581c0bda5b","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_f0c75a02-0a45-48fb-b3b0-f1e2aaa42892","createdAt":"2026-11-27T10:59:52.995290290Z"},{"id":"led_03e026b7-f039-4dbb-83be-78b8e823b8fc","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_12a1c535-fd68-4a20-ac2f-839295097cea","createdAt":"2026-11-27T10:59:52.996481641Z"},{"id":"led_7bbde35c-fc46-4f82-b469-f5aa9da5d2af","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_07e53212-c698-4494-a2a5-684390f73ae9","createdAt":"2026-11-27T10:59:53.003664364Z"},{"id":"led_64e3dd6c-95a0-4ce9-9674-660050e712d7","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_313a8b14-8645-4a1d-ae20-70281cb5ddf4","createdAt":"2026-11-27T10:59:53.006882540Z"},{"id":"led_d7a3a31f-08ed-4eb9-bce4-620f2254877d","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_2a65814f-3346-48fe-b68f-33da98575bd9","createdAt":"2026-11-27T10:59:53.016718667Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0568e0ac-5b08-4000-8021-53f65d06a73d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0568e0ac-5b08-4000-8021-53f65d06a73d
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0568e0ac-5b08-4000-8021-53f65d06a73d
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
correlation: qa-a2b5f776-4470-4016-aed5-7ab5cb8581dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2b5f776-4470-4016-aed5-7ab5cb8581dd
Content-Type: application/json

--- request body ---
{"handle":"qa-eb6a87ed5f50","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2b5f776-4470-4016-aed5-7ab5cb8581dd
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a2b5f776-4470-4016-aed5-7ab5cb8581dd"}
```
