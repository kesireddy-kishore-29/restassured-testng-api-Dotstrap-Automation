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
| 1 | `POST /v1/accounts` | 201 | 408 | `qa-24078fb0-f00f-46da-98da-84438fc8512a` |
| 9 | `POST /v1/auth/token` | 200 | 84 | `qa-6a8cb8fa-017b-40ef-96c2-a0cfdfcb7a4c` |
| 7 | `POST /v1/auth/token` | 200 | 96 | `qa-786fd1a8-0ed0-4d78-aa51-9146f3c6cbbd` |
| 6 | `POST /v1/auth/token` | 200 | 115 | `qa-c470533e-668d-4eab-a2f6-318b481b209e` |
| 8 | `POST /v1/auth/token` | 200 | 108 | `qa-212c06df-3134-447a-b905-3f76136182e2` |
| 3 | `POST /v1/auth/token` | 200 | 118 | `qa-00e34990-3554-401a-acfd-067e11b3ae0d` |
| 4 | `POST /v1/auth/token` | 200 | 123 | `qa-3da0312e-adb9-423c-b38e-9d58fc4e8f20` |
| 2 | `POST /v1/auth/token` | 200 | 132 | `qa-a01f9a27-6c00-410f-adab-240ed37cebbd` |
| 11 | `POST /v1/auth/token` | 200 | 100 | `qa-da6efb0b-158f-4324-b2aa-9b5b5e9ed813` |
| 5 | `POST /v1/auth/token` | 200 | 126 | `qa-bfeab04d-59f4-4d08-9db2-0d1d4ee9ba59` |
| 10 | `POST /v1/auth/token` | 200 | 108 | `qa-3a1fff1c-b7b6-40b9-a178-7f1e38051072` |
| 14 | `POST /v1/credits/purchases` | 201 | 72 | `qa-7badc9e4-f625-4eca-8b84-34453628218c` |
| 20 | `POST /v1/credits/purchases` | 201 | 66 | `qa-5b5c4eb6-c449-4215-9f69-670914dafe1f` |
| 13 | `POST /v1/credits/purchases` | 201 | 78 | `qa-276bb322-4e79-4a3e-aabb-7ec143cfc09c` |
| 16 | `POST /v1/credits/purchases` | 201 | 75 | `qa-c286fa97-d98c-4dd3-a746-9b7ece1fd895` |
| 12 | `POST /v1/credits/purchases` | 201 | 85 | `qa-916f8f94-4259-4b78-bdfd-29eb1afae255` |
| 15 | `POST /v1/credits/purchases` | 201 | 79 | `qa-e175290f-258d-4d9f-afdd-1bc63bf3401f` |
| 18 | `POST /v1/credits/purchases` | 201 | 80 | `qa-281b91c4-13f1-42e0-80ee-a0ad49871122` |
| 17 | `POST /v1/credits/purchases` | 201 | 83 | `qa-48abb223-dc81-4e26-8a12-082d557eb685` |
| 19 | `POST /v1/credits/purchases` | 201 | 78 | `qa-37949866-f79f-472e-9a49-c4f37bfb96d6` |
| 21 | `POST /v1/credits/purchases` | 201 | 78 | `qa-fb0d288d-7bee-4160-9d50-0e75d02a937c` |
| 22 | `POST /v1/auth/token` | 200 | 26 | `qa-0de3e323-a62b-417f-a70c-3342af917c01` |
| 23 | `GET /v1/credits/ledger` | 200 | 102 | `qa-939969f4-7a9b-4f14-84c7-a4417768bc9b` |
| 24 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-a9220638-b883-4fcf-bb5a-05f580b865d6` |
| 25 | `POST /v1/auth/token` | 401 | 19 | `qa-5f7290da-d914-4706-ad74-3af8551a0b25` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-24078fb0-f00f-46da-98da-84438fc8512a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24078fb0-f00f-46da-98da-84438fc8512a
Content-Type: application/json

--- request body ---
{"handle":"qa-38ab338c9d80","displayName":"QA 38ab338c9d80","password":"****","region":"us"}

--- response: 201 in 408 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-24078fb0-f00f-46da-98da-84438fc8512a
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
Location: /v1/accounts/qa-38ab338c9d80
X-Served-Region: us
Content-Length: 181

{"id":"acc_11627901-3e20-4b52-bd1f-d6295a84c8f8","handle":"qa-38ab338c9d80","displayName":"QA 38ab338c9d80","region":"us","role":"user","createdAt":"2026-11-12T09:56:36.678211091Z"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-6a8cb8fa-017b-40ef-96c2-a0cfdfcb7a4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a8cb8fa-017b-40ef-96c2-a0cfdfcb7a4c
Content-Type: application/json

--- request body ---
{"handle":"qa-38ab338c9d80","password":"****"}

--- response: 200 in 84 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a8cb8fa-017b-40ef-96c2-a0cfdfcb7a4c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11627901-3e20-4b52-bd1f-d6295a84c8f8"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-786fd1a8-0ed0-4d78-aa51-9146f3c6cbbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-786fd1a8-0ed0-4d78-aa51-9146f3c6cbbd
Content-Type: application/json

--- request body ---
{"handle":"qa-38ab338c9d80","password":"****"}

--- response: 200 in 96 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-786fd1a8-0ed0-4d78-aa51-9146f3c6cbbd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11627901-3e20-4b52-bd1f-d6295a84c8f8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c470533e-668d-4eab-a2f6-318b481b209e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c470533e-668d-4eab-a2f6-318b481b209e
Content-Type: application/json

--- request body ---
{"handle":"qa-38ab338c9d80","password":"****"}

--- response: 200 in 115 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c470533e-668d-4eab-a2f6-318b481b209e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11627901-3e20-4b52-bd1f-d6295a84c8f8"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-212c06df-3134-447a-b905-3f76136182e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-212c06df-3134-447a-b905-3f76136182e2
Content-Type: application/json

--- request body ---
{"handle":"qa-38ab338c9d80","password":"****"}

--- response: 200 in 108 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-212c06df-3134-447a-b905-3f76136182e2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11627901-3e20-4b52-bd1f-d6295a84c8f8"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-00e34990-3554-401a-acfd-067e11b3ae0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00e34990-3554-401a-acfd-067e11b3ae0d
Content-Type: application/json

--- request body ---
{"handle":"qa-38ab338c9d80","password":"****"}

--- response: 200 in 118 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-00e34990-3554-401a-acfd-067e11b3ae0d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11627901-3e20-4b52-bd1f-d6295a84c8f8"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-3da0312e-adb9-423c-b38e-9d58fc4e8f20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3da0312e-adb9-423c-b38e-9d58fc4e8f20
Content-Type: application/json

--- request body ---
{"handle":"qa-38ab338c9d80","password":"****"}

--- response: 200 in 123 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-3da0312e-adb9-423c-b38e-9d58fc4e8f20
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11627901-3e20-4b52-bd1f-d6295a84c8f8"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a01f9a27-6c00-410f-adab-240ed37cebbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a01f9a27-6c00-410f-adab-240ed37cebbd
Content-Type: application/json

--- request body ---
{"handle":"qa-38ab338c9d80","password":"****"}

--- response: 200 in 132 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a01f9a27-6c00-410f-adab-240ed37cebbd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11627901-3e20-4b52-bd1f-d6295a84c8f8"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-da6efb0b-158f-4324-b2aa-9b5b5e9ed813

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da6efb0b-158f-4324-b2aa-9b5b5e9ed813
Content-Type: application/json

--- request body ---
{"handle":"qa-38ab338c9d80","password":"****"}

--- response: 200 in 100 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-da6efb0b-158f-4324-b2aa-9b5b5e9ed813
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11627901-3e20-4b52-bd1f-d6295a84c8f8"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-bfeab04d-59f4-4d08-9db2-0d1d4ee9ba59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfeab04d-59f4-4d08-9db2-0d1d4ee9ba59
Content-Type: application/json

--- request body ---
{"handle":"qa-38ab338c9d80","password":"****"}

--- response: 200 in 126 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfeab04d-59f4-4d08-9db2-0d1d4ee9ba59
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11627901-3e20-4b52-bd1f-d6295a84c8f8"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3a1fff1c-b7b6-40b9-a178-7f1e38051072

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a1fff1c-b7b6-40b9-a178-7f1e38051072
Content-Type: application/json

--- request body ---
{"handle":"qa-38ab338c9d80","password":"****"}

--- response: 200 in 108 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a1fff1c-b7b6-40b9-a178-7f1e38051072
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11627901-3e20-4b52-bd1f-d6295a84c8f8"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7badc9e4-f625-4eca-8b84-34453628218c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d01a9112385b4f4e95ce7b99a1e57ab1
X-Correlation-Id: qa-7badc9e4-f625-4eca-8b84-34453628218c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 72 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7badc9e4-f625-4eca-8b84-34453628218c
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
Location: /v1/credits/purchases/pur_a6dc0a57-f2e7-4776-ad7d-4afe646c85e4
Content-Length: 144

{"id":"pur_a6dc0a57-f2e7-4776-ad7d-4afe646c85e4","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-12T09:56:37.373707538Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5b5c4eb6-c449-4215-9f69-670914dafe1f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0317c2fe771f4bc18bfa92bc331940e5
X-Correlation-Id: qa-5b5c4eb6-c449-4215-9f69-670914dafe1f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 66 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b5c4eb6-c449-4215-9f69-670914dafe1f
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
Location: /v1/credits/purchases/pur_4d5f65d1-9612-4ba9-a887-bbe54c470fa6
Content-Length: 144

{"id":"pur_4d5f65d1-9612-4ba9-a887-bbe54c470fa6","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-12T09:56:37.375132005Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-276bb322-4e79-4a3e-aabb-7ec143cfc09c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-91ab08e5734f4dc09feae176d9a14ed5
X-Correlation-Id: qa-276bb322-4e79-4a3e-aabb-7ec143cfc09c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 78 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-276bb322-4e79-4a3e-aabb-7ec143cfc09c
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
Location: /v1/credits/purchases/pur_15086898-e3a5-4833-b6ab-31c15afe1cc3
Content-Length: 144

{"id":"pur_15086898-e3a5-4833-b6ab-31c15afe1cc3","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-12T09:56:37.380476106Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c286fa97-d98c-4dd3-a746-9b7ece1fd895

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c3411cd36caa443196d49f61ceff9797
X-Correlation-Id: qa-c286fa97-d98c-4dd3-a746-9b7ece1fd895
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 75 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c286fa97-d98c-4dd3-a746-9b7ece1fd895
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
Location: /v1/credits/purchases/pur_dc0359e0-0640-4d3d-8bd8-cc555bc4b172
Content-Length: 144

{"id":"pur_dc0359e0-0640-4d3d-8bd8-cc555bc4b172","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-12T09:56:37.376080415Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-916f8f94-4259-4b78-bdfd-29eb1afae255

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a139fc175035460ab81bfbd3446723f3
X-Correlation-Id: qa-916f8f94-4259-4b78-bdfd-29eb1afae255
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 85 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-916f8f94-4259-4b78-bdfd-29eb1afae255
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
Location: /v1/credits/purchases/pur_5f31075e-7580-4020-97ec-6f9544d6857d
Content-Length: 144

{"id":"pur_5f31075e-7580-4020-97ec-6f9544d6857d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-12T09:56:37.370703583Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e175290f-258d-4d9f-afdd-1bc63bf3401f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8c90be9e988d41098eecb8e1cf6389ae
X-Correlation-Id: qa-e175290f-258d-4d9f-afdd-1bc63bf3401f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 79 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e175290f-258d-4d9f-afdd-1bc63bf3401f
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
Location: /v1/credits/purchases/pur_7be11170-6b7a-41f2-9b15-997765dc4f33
Content-Length: 144

{"id":"pur_7be11170-6b7a-41f2-9b15-997765dc4f33","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-12T09:56:37.379391843Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-281b91c4-13f1-42e0-80ee-a0ad49871122

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c155c6467b7a4901970c5664dd3f4337
X-Correlation-Id: qa-281b91c4-13f1-42e0-80ee-a0ad49871122
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 80 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-281b91c4-13f1-42e0-80ee-a0ad49871122
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
Location: /v1/credits/purchases/pur_34169529-5c14-46bd-ae18-ba8039b4346d
Content-Length: 144

{"id":"pur_34169529-5c14-46bd-ae18-ba8039b4346d","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-12T09:56:37.388476753Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-48abb223-dc81-4e26-8a12-082d557eb685

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b7f6d6260b5b4625ac865379ab0c08e7
X-Correlation-Id: qa-48abb223-dc81-4e26-8a12-082d557eb685
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 83 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-48abb223-dc81-4e26-8a12-082d557eb685
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
Location: /v1/credits/purchases/pur_569ce8e1-f6b7-4050-aee2-bcbb0e9ea0af
Content-Length: 144

{"id":"pur_569ce8e1-f6b7-4050-aee2-bcbb0e9ea0af","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-12T09:56:37.381423131Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-37949866-f79f-472e-9a49-c4f37bfb96d6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-657941247aaa4e9d815ff14975f6bb98
X-Correlation-Id: qa-37949866-f79f-472e-9a49-c4f37bfb96d6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 78 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-37949866-f79f-472e-9a49-c4f37bfb96d6
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
Location: /v1/credits/purchases/pur_eb5b9365-cd33-4a34-b362-085124025191
Content-Length: 144

{"id":"pur_eb5b9365-cd33-4a34-b362-085124025191","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-12T09:56:37.371292923Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fb0d288d-7bee-4160-9d50-0e75d02a937c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-952dcf9d011241a3b25acfe30f10048f
X-Correlation-Id: qa-fb0d288d-7bee-4160-9d50-0e75d02a937c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 78 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb0d288d-7bee-4160-9d50-0e75d02a937c
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
Location: /v1/credits/purchases/pur_1aa19908-ef69-43ed-b3dd-6542983101f3
Content-Length: 145

{"id":"pur_1aa19908-ef69-43ed-b3dd-6542983101f3","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-12T09:56:37.389579771Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-0de3e323-a62b-417f-a70c-3342af917c01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0de3e323-a62b-417f-a70c-3342af917c01
Content-Type: application/json

--- request body ---
{"handle":"qa-38ab338c9d80","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-0de3e323-a62b-417f-a70c-3342af917c01
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11627901-3e20-4b52-bd1f-d6295a84c8f8"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-939969f4-7a9b-4f14-84c7-a4417768bc9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-939969f4-7a9b-4f14-84c7-a4417768bc9b
Content-Type: application/json

--- response: 200 in 102 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-939969f4-7a9b-4f14-84c7-a4417768bc9b
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
Content-Length: 763

{"items":[{"id":"led_fcfaf563-32b0-4fdc-a698-1f72bc1e2fc4","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-12T09:56:36.678561294Z"},{"id":"led_77b1fc0b-b7dd-4574-b319-dd7c9b0f627a","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_5f31075e-7580-4020-97ec-6f9544d6857d","createdAt":"2026-11-12T09:56:37.370703583Z"},{"id":"led_9d380835-bfed-4b7d-a0cc-781e5f0e76e8","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_eb5b9365-cd33-4a34-b362-085124025191","createdAt":"2026-11-12T09:56:37.371292923Z"},{"id":"led_9cef96f6-a4bb-43ce-b828-dee71cd24d78","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_a6dc0a57-f2e7-4776-ad7d-4afe646c85e4","createdAt":"2026-11-12T09:56:37.373707538Z"},{"id":"led_3ff850fe-8098-421c-ae7f-018d7bfc3d63","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_4d5f65d1-9612-4ba9-a887-bbe54c470fa6","createdAt":"2026-11-12T09:56:37.375132005Z"},{"id":"led_f4522dd5-9848-48c1-893a-8eee86bc60c8","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_dc0359e0-0640-4d3d-8bd8-cc555bc4b172","createdAt":"2026-11-12T09:56:37.376080415Z"},{"id":"led_58fb2a49-11da-47e8-b751-2e3f242cd0d9","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_7be11170-6b7a-41f2-9b15-997765dc4f33","createdAt":"2026-11-12T09:56:37.379391843Z"},{"id":"led_8631eb19-0279-47f4-9c1d-82180ea03a2a","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_15086898-e3a5-4833-b6ab-31c15afe1cc3","createdAt":"2026-11-12T09:56:37.380476106Z"},{"id":"led_58359818-e611-4920-b7a4-6ca86e25f90f","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_569ce8e1-f6b7-4050-aee2-bcbb0e9ea0af","createdAt":"2026-11-12T09:56:37.381423131Z"},{"id":"led_beb5a214-6d4e-4294-ab51-7a02b0393f9b","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_34169529-5c14-46bd-ae18-ba8039b4346d","createdAt":"2026-11-12T09:56:37.388476753Z"},{"id":"led_1f8260e9-d214-4de3-9f21-5df7612fb731","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_1aa19908-ef69-43ed-b3dd-6542983101f3","createdAt":"2026-11-12T09:56:37.389579771Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a9220638-b883-4fcf-bb5a-05f580b865d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9220638-b883-4fcf-bb5a-05f580b865d6
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a9220638-b883-4fcf-bb5a-05f580b865d6
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
correlation: qa-5f7290da-d914-4706-ad74-3af8551a0b25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f7290da-d914-4706-ad74-3af8551a0b25
Content-Type: application/json

--- request body ---
{"handle":"qa-38ab338c9d80","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f7290da-d914-4706-ad74-3af8551a0b25
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5f7290da-d914-4706-ad74-3af8551a0b25"}
```
