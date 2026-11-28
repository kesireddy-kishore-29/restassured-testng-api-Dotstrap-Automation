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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-adef4d94-9202-4cd1-9f72-4d56631cc8e0` |
| 4 | `POST /v1/auth/token` | 200 | 27 | `qa-b1f757b5-08e6-4cf8-8bda-665ac812c9df` |
| 10 | `POST /v1/auth/token` | 200 | 28 | `qa-02ab94c7-ce3d-4a40-bdc4-ed66386de380` |
| 5 | `POST /v1/auth/token` | 200 | 44 | `qa-dfc95ae5-493b-4179-abf7-305d5fee9f46` |
| 7 | `POST /v1/auth/token` | 200 | 39 | `qa-aadeb3cb-3846-4ccd-af41-e58044b1fd2d` |
| 11 | `POST /v1/auth/token` | 200 | 31 | `qa-402ce0aa-bc59-45bf-bb28-a0df5956e12a` |
| 2 | `POST /v1/auth/token` | 200 | 57 | `qa-f3af3a06-eacb-4061-978f-e7fa1123f8bf` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-3efb78a2-6597-485d-8908-e9a025789da3` |
| 9 | `POST /v1/auth/token` | 200 | 38 | `qa-f4d8f97c-bc15-4698-91b8-9870f52142e2` |
| 8 | `POST /v1/auth/token` | 200 | 41 | `qa-f9619471-5993-408d-b92d-39c9ba8a2952` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-d440433b-5589-45ec-b5f1-8c5ad873ecb1` |
| 12 | `POST /v1/credits/purchases` | 201 | 20 | `qa-06a99430-1d23-4bb9-8448-dd409267ef15` |
| 16 | `POST /v1/credits/purchases` | 201 | 17 | `qa-6b866d9a-6008-47fc-9dc3-d6c1094bf40a` |
| 17 | `POST /v1/credits/purchases` | 201 | 15 | `qa-dc90614b-d617-4e25-a2c9-81a67fe33d43` |
| 15 | `POST /v1/credits/purchases` | 201 | 21 | `qa-1570a20e-7e42-4bbc-b41d-1474923650c9` |
| 20 | `POST /v1/credits/purchases` | 201 | 14 | `qa-b2ab0136-4ece-4644-9894-e3c03a096c47` |
| 14 | `POST /v1/credits/purchases` | 201 | 20 | `qa-61259dc5-d9a9-4696-9181-8cc4119d942b` |
| 19 | `POST /v1/credits/purchases` | 201 | 21 | `qa-dd89415c-3fc5-4326-aaa1-6c8679d13f36` |
| 21 | `POST /v1/credits/purchases` | 201 | 24 | `qa-2ea858a3-4500-4b7f-ba2b-64371c1a916a` |
| 18 | `POST /v1/credits/purchases` | 201 | 32 | `qa-ba052a9d-fd18-4080-91c0-0ef8924a3ab7` |
| 13 | `POST /v1/credits/purchases` | 201 | 43 | `qa-53c63579-a2ea-4ee4-b7e2-a6bb37443284` |
| 22 | `POST /v1/auth/token` | 200 | 9 | `qa-d445fd37-09e6-46a0-bb4c-94da01426083` |
| 23 | `GET /v1/credits/ledger` | 200 | 12 | `qa-5bb6c15c-2db6-42c2-90fd-a2e7d7b6947a` |
| 24 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-759f6d04-dda4-4aad-afaf-94255adaa000` |
| 25 | `POST /v1/auth/token` | 401 | 13 | `qa-6d3baa8b-d222-4385-b0da-87cc50f87851` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-adef4d94-9202-4cd1-9f72-4d56631cc8e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adef4d94-9202-4cd1-9f72-4d56631cc8e0
Content-Type: application/json

--- request body ---
{"handle":"qa-568250ebd0d5","displayName":"QA 568250ebd0d5","password":"****","region":"us"}

--- response: 201 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-adef4d94-9202-4cd1-9f72-4d56631cc8e0
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
Location: /v1/accounts/qa-568250ebd0d5
X-Served-Region: us
Content-Length: 181

{"id":"acc_984dbbee-52f1-4003-968d-59c71cce304b","handle":"qa-568250ebd0d5","displayName":"QA 568250ebd0d5","region":"us","role":"user","createdAt":"2026-11-26T11:02:32.349900320Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b1f757b5-08e6-4cf8-8bda-665ac812c9df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1f757b5-08e6-4cf8-8bda-665ac812c9df
Content-Type: application/json

--- request body ---
{"handle":"qa-568250ebd0d5","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1f757b5-08e6-4cf8-8bda-665ac812c9df
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_984dbbee-52f1-4003-968d-59c71cce304b"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-02ab94c7-ce3d-4a40-bdc4-ed66386de380

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02ab94c7-ce3d-4a40-bdc4-ed66386de380
Content-Type: application/json

--- request body ---
{"handle":"qa-568250ebd0d5","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-02ab94c7-ce3d-4a40-bdc4-ed66386de380
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_984dbbee-52f1-4003-968d-59c71cce304b"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-dfc95ae5-493b-4179-abf7-305d5fee9f46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfc95ae5-493b-4179-abf7-305d5fee9f46
Content-Type: application/json

--- request body ---
{"handle":"qa-568250ebd0d5","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfc95ae5-493b-4179-abf7-305d5fee9f46
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_984dbbee-52f1-4003-968d-59c71cce304b"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-aadeb3cb-3846-4ccd-af41-e58044b1fd2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aadeb3cb-3846-4ccd-af41-e58044b1fd2d
Content-Type: application/json

--- request body ---
{"handle":"qa-568250ebd0d5","password":"****"}

--- response: 200 in 39 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-aadeb3cb-3846-4ccd-af41-e58044b1fd2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_984dbbee-52f1-4003-968d-59c71cce304b"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-402ce0aa-bc59-45bf-bb28-a0df5956e12a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-402ce0aa-bc59-45bf-bb28-a0df5956e12a
Content-Type: application/json

--- request body ---
{"handle":"qa-568250ebd0d5","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-402ce0aa-bc59-45bf-bb28-a0df5956e12a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_984dbbee-52f1-4003-968d-59c71cce304b"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f3af3a06-eacb-4061-978f-e7fa1123f8bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3af3a06-eacb-4061-978f-e7fa1123f8bf
Content-Type: application/json

--- request body ---
{"handle":"qa-568250ebd0d5","password":"****"}

--- response: 200 in 57 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3af3a06-eacb-4061-978f-e7fa1123f8bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_984dbbee-52f1-4003-968d-59c71cce304b"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3efb78a2-6597-485d-8908-e9a025789da3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3efb78a2-6597-485d-8908-e9a025789da3
Content-Type: application/json

--- request body ---
{"handle":"qa-568250ebd0d5","password":"****"}

--- response: 200 in 53 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-3efb78a2-6597-485d-8908-e9a025789da3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_984dbbee-52f1-4003-968d-59c71cce304b"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-f4d8f97c-bc15-4698-91b8-9870f52142e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4d8f97c-bc15-4698-91b8-9870f52142e2
Content-Type: application/json

--- request body ---
{"handle":"qa-568250ebd0d5","password":"****"}

--- response: 200 in 38 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4d8f97c-bc15-4698-91b8-9870f52142e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_984dbbee-52f1-4003-968d-59c71cce304b"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-f9619471-5993-408d-b92d-39c9ba8a2952

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9619471-5993-408d-b92d-39c9ba8a2952
Content-Type: application/json

--- request body ---
{"handle":"qa-568250ebd0d5","password":"****"}

--- response: 200 in 41 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9619471-5993-408d-b92d-39c9ba8a2952
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_984dbbee-52f1-4003-968d-59c71cce304b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d440433b-5589-45ec-b5f1-8c5ad873ecb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d440433b-5589-45ec-b5f1-8c5ad873ecb1
Content-Type: application/json

--- request body ---
{"handle":"qa-568250ebd0d5","password":"****"}

--- response: 200 in 47 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d440433b-5589-45ec-b5f1-8c5ad873ecb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_984dbbee-52f1-4003-968d-59c71cce304b"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-06a99430-1d23-4bb9-8448-dd409267ef15

--- request headers ---
Accept: application/json
Idempotency-Key: qa-27facda1b78441e7814eda5abb4b5277
X-Correlation-Id: qa-06a99430-1d23-4bb9-8448-dd409267ef15
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-06a99430-1d23-4bb9-8448-dd409267ef15
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
Location: /v1/credits/purchases/pur_d50fbfdc-ea2a-4113-842e-c11a109b20e8
Content-Length: 144

{"id":"pur_d50fbfdc-ea2a-4113-842e-c11a109b20e8","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-26T11:02:32.446105865Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6b866d9a-6008-47fc-9dc3-d6c1094bf40a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-02999bd6dab043b48707988143f357ac
X-Correlation-Id: qa-6b866d9a-6008-47fc-9dc3-d6c1094bf40a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b866d9a-6008-47fc-9dc3-d6c1094bf40a
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
Location: /v1/credits/purchases/pur_5b3c67e3-af44-432f-ad36-57ec43ae1e4b
Content-Length: 144

{"id":"pur_5b3c67e3-af44-432f-ad36-57ec43ae1e4b","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-26T11:02:32.449502744Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-dc90614b-d617-4e25-a2c9-81a67fe33d43

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d089152609d6444c81892a9fd1a54929
X-Correlation-Id: qa-dc90614b-d617-4e25-a2c9-81a67fe33d43
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc90614b-d617-4e25-a2c9-81a67fe33d43
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
Location: /v1/credits/purchases/pur_9d326bf1-4433-4504-b3fa-62404ef1aa47
Content-Length: 144

{"id":"pur_9d326bf1-4433-4504-b3fa-62404ef1aa47","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-26T11:02:32.450792959Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1570a20e-7e42-4bbc-b41d-1474923650c9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-71ba171c8a85400c82756404c3901b4f
X-Correlation-Id: qa-1570a20e-7e42-4bbc-b41d-1474923650c9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-1570a20e-7e42-4bbc-b41d-1474923650c9
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
Location: /v1/credits/purchases/pur_ae12376e-63a5-40ef-b8a5-07ddbce785da
Content-Length: 144

{"id":"pur_ae12376e-63a5-40ef-b8a5-07ddbce785da","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-26T11:02:32.451678291Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b2ab0136-4ece-4644-9894-e3c03a096c47

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e1a7cbd142934c9f9399758982a966e2
X-Correlation-Id: qa-b2ab0136-4ece-4644-9894-e3c03a096c47
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2ab0136-4ece-4644-9894-e3c03a096c47
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
Location: /v1/credits/purchases/pur_288cb007-5a54-4b29-8b91-3b1cf81b2225
Content-Length: 144

{"id":"pur_288cb007-5a54-4b29-8b91-3b1cf81b2225","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-26T11:02:32.453490467Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-61259dc5-d9a9-4696-9181-8cc4119d942b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-07e92a914f5b40c6ac289a8db9c29369
X-Correlation-Id: qa-61259dc5-d9a9-4696-9181-8cc4119d942b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-61259dc5-d9a9-4696-9181-8cc4119d942b
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
Location: /v1/credits/purchases/pur_feed65c9-15cb-4160-9928-402f3cdd9169
Content-Length: 144

{"id":"pur_feed65c9-15cb-4160-9928-402f3cdd9169","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-26T11:02:32.448623271Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-dd89415c-3fc5-4326-aaa1-6c8679d13f36

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a24991c960f54f20abd9808d6c6d1362
X-Correlation-Id: qa-dd89415c-3fc5-4326-aaa1-6c8679d13f36
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd89415c-3fc5-4326-aaa1-6c8679d13f36
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
Location: /v1/credits/purchases/pur_c7c09379-a3e7-4141-a989-3ae4ef14d9b0
Content-Length: 144

{"id":"pur_c7c09379-a3e7-4141-a989-3ae4ef14d9b0","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-26T11:02:32.455846929Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2ea858a3-4500-4b7f-ba2b-64371c1a916a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-eb79b39d64634e2f942e1369d31789bd
X-Correlation-Id: qa-2ea858a3-4500-4b7f-ba2b-64371c1a916a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ea858a3-4500-4b7f-ba2b-64371c1a916a
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
Location: /v1/credits/purchases/pur_a33d6411-f2aa-43da-8c90-80c0ed6e5954
Content-Length: 144

{"id":"pur_a33d6411-f2aa-43da-8c90-80c0ed6e5954","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-26T11:02:32.462595286Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ba052a9d-fd18-4080-91c0-0ef8924a3ab7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7ca0592140f4489bacc9a5969ca03ece
X-Correlation-Id: qa-ba052a9d-fd18-4080-91c0-0ef8924a3ab7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba052a9d-fd18-4080-91c0-0ef8924a3ab7
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
Location: /v1/credits/purchases/pur_73b30c59-4fc0-4ad2-b47f-afff32cf0513
Content-Length: 145

{"id":"pur_73b30c59-4fc0-4ad2-b47f-afff32cf0513","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-26T11:02:32.463626499Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-53c63579-a2ea-4ee4-b7e2-a6bb37443284

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2076b07362e342e0af3a0dc2a79082a3
X-Correlation-Id: qa-53c63579-a2ea-4ee4-b7e2-a6bb37443284
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 43 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-53c63579-a2ea-4ee4-b7e2-a6bb37443284
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
Location: /v1/credits/purchases/pur_9e746bd6-2009-405c-8b84-8b6045acc6c8
Content-Length: 144

{"id":"pur_9e746bd6-2009-405c-8b84-8b6045acc6c8","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-26T11:02:32.444798254Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-d445fd37-09e6-46a0-bb4c-94da01426083

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d445fd37-09e6-46a0-bb4c-94da01426083
Content-Type: application/json

--- request body ---
{"handle":"qa-568250ebd0d5","password":"****"}

--- response: 200 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d445fd37-09e6-46a0-bb4c-94da01426083
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_984dbbee-52f1-4003-968d-59c71cce304b"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-5bb6c15c-2db6-42c2-90fd-a2e7d7b6947a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bb6c15c-2db6-42c2-90fd-a2e7d7b6947a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bb6c15c-2db6-42c2-90fd-a2e7d7b6947a
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

{"items":[{"id":"led_102beb2c-27e7-473d-97a3-665af33f6872","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-26T11:02:32.349917226Z"},{"id":"led_d895298d-139a-40e3-a64f-b346dada85a6","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_9e746bd6-2009-405c-8b84-8b6045acc6c8","createdAt":"2026-11-26T11:02:32.444798254Z"},{"id":"led_a70e25bc-7f87-4e5b-b0fa-6cc10401a37e","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_d50fbfdc-ea2a-4113-842e-c11a109b20e8","createdAt":"2026-11-26T11:02:32.446105865Z"},{"id":"led_019e5a7d-6a1d-4454-bd85-ad9bb8b60789","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_feed65c9-15cb-4160-9928-402f3cdd9169","createdAt":"2026-11-26T11:02:32.448623271Z"},{"id":"led_a3e3da83-1355-4f1c-a35e-115793012c54","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_5b3c67e3-af44-432f-ad36-57ec43ae1e4b","createdAt":"2026-11-26T11:02:32.449502744Z"},{"id":"led_59d3615f-2e51-432b-9846-ec473389755a","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_9d326bf1-4433-4504-b3fa-62404ef1aa47","createdAt":"2026-11-26T11:02:32.450792959Z"},{"id":"led_e856eaa5-6efa-4381-b7a5-a2f754da0c70","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_ae12376e-63a5-40ef-b8a5-07ddbce785da","createdAt":"2026-11-26T11:02:32.451678291Z"},{"id":"led_b7cb9b6f-b8ad-4658-9b44-1bdc360a5697","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_288cb007-5a54-4b29-8b91-3b1cf81b2225","createdAt":"2026-11-26T11:02:32.453490467Z"},{"id":"led_a6757289-d792-444a-896d-0154363de66b","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_c7c09379-a3e7-4141-a989-3ae4ef14d9b0","createdAt":"2026-11-26T11:02:32.455846929Z"},{"id":"led_aba96fcd-79c2-4300-b74f-2a878cb99239","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_a33d6411-f2aa-43da-8c90-80c0ed6e5954","createdAt":"2026-11-26T11:02:32.462595286Z"},{"id":"led_84d69748-6174-4a24-9f8c-a584c41f2f31","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_73b30c59-4fc0-4ad2-b47f-afff32cf0513","createdAt":"2026-11-26T11:02:32.463626499Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-759f6d04-dda4-4aad-afaf-94255adaa000

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-759f6d04-dda4-4aad-afaf-94255adaa000
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-759f6d04-dda4-4aad-afaf-94255adaa000
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
correlation: qa-6d3baa8b-d222-4385-b0da-87cc50f87851

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d3baa8b-d222-4385-b0da-87cc50f87851
Content-Type: application/json

--- request body ---
{"handle":"qa-568250ebd0d5","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d3baa8b-d222-4385-b0da-87cc50f87851
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6d3baa8b-d222-4385-b0da-87cc50f87851"}
```
