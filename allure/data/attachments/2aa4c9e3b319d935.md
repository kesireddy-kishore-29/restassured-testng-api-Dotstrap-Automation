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
| 1 | `POST /v1/accounts` | 201 | 394 | `qa-3941b159-a48e-45ce-93b2-af96f6b79f05` |
| 5 | `POST /v1/auth/token` | 200 | 90 | `qa-b6e90fb1-d77c-45d5-908c-a20a590b66a4` |
| 3 | `POST /v1/auth/token` | 200 | 96 | `qa-aae8b500-b41d-41ba-b5bb-a466ef174913` |
| 8 | `POST /v1/auth/token` | 200 | 89 | `qa-88b928f7-38f1-4db6-9a45-8cb11af1c5f4` |
| 6 | `POST /v1/auth/token` | 200 | 102 | `qa-dde5d60d-ef1e-44a2-a54f-c0706de7ed58` |
| 2 | `POST /v1/auth/token` | 200 | 111 | `qa-7262674e-6c89-414d-a8e6-63836e9ae4c3` |
| 7 | `POST /v1/auth/token` | 200 | 105 | `qa-31138fbd-943e-43ea-9806-55f2d711f9a2` |
| 4 | `POST /v1/auth/token` | 200 | 114 | `qa-aef092fd-ccf0-49a2-95eb-35b7d8c3e4ee` |
| 9 | `POST /v1/auth/token` | 200 | 112 | `qa-848600e6-7162-4add-be3e-e6436f6baeee` |
| 10 | `POST /v1/auth/token` | 200 | 106 | `qa-068738a0-8eae-4c09-87b2-af79cef3666d` |
| 11 | `POST /v1/auth/token` | 200 | 107 | `qa-d9188c15-1042-48cb-995a-352550a3fa25` |
| 14 | `POST /v1/credits/purchases` | 201 | 68 | `qa-4e571b75-2f4a-484b-9de9-4f2d03d89001` |
| 15 | `POST /v1/credits/purchases` | 201 | 67 | `qa-e3166124-79b7-44b8-8121-339151a8a24b` |
| 13 | `POST /v1/credits/purchases` | 201 | 73 | `qa-de2596bc-d6d7-4129-96b5-86a7aff1d0d4` |
| 17 | `POST /v1/credits/purchases` | 201 | 64 | `qa-a7ba039c-981b-408a-8256-c015448d7aaa` |
| 18 | `POST /v1/credits/purchases` | 201 | 63 | `qa-31fe171d-91d0-4c34-b735-46beffa46cc4` |
| 16 | `POST /v1/credits/purchases` | 201 | 61 | `qa-723f07a7-c4f4-433f-8a26-8eaa3f095574` |
| 12 | `POST /v1/credits/purchases` | 201 | 80 | `qa-617c5b3c-0bec-4da8-b862-ed5696643d0c` |
| 20 | `POST /v1/credits/purchases` | 201 | 43 | `qa-9e9f835d-61bf-4c4a-b98c-6fe24b48bae9` |
| 21 | `POST /v1/credits/purchases` | 201 | 34 | `qa-b85ea3d4-6e04-4b51-b099-f3ae347802c2` |
| 19 | `POST /v1/credits/purchases` | 201 | 72 | `qa-69ba23be-0654-4de3-99fb-8fc1200c7b5f` |
| 22 | `POST /v1/auth/token` | 200 | 32 | `qa-734afebd-7766-475f-b67d-0b9a20889f7c` |
| 23 | `GET /v1/credits/ledger` | 200 | 129 | `qa-b297aa8d-44fa-4cf0-9b19-c7a5412180ad` |
| 24 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-9edf6ad9-0845-4b02-94a3-dbc295a4b14d` |
| 25 | `POST /v1/auth/token` | 401 | 29 | `qa-03e719e0-d117-4248-8537-bb1495df338a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3941b159-a48e-45ce-93b2-af96f6b79f05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3941b159-a48e-45ce-93b2-af96f6b79f05
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8473e7a474","displayName":"QA ad8473e7a474","password":"****","region":"us"}

--- response: 201 in 394 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3941b159-a48e-45ce-93b2-af96f6b79f05
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
Location: /v1/accounts/qa-ad8473e7a474
X-Served-Region: us
Content-Length: 181

{"id":"acc_0bea5c42-89c6-4eed-b277-d1c750eb6b64","handle":"qa-ad8473e7a474","displayName":"QA ad8473e7a474","region":"us","role":"user","createdAt":"2026-11-07T08:55:03.098596902Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b6e90fb1-d77c-45d5-908c-a20a590b66a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6e90fb1-d77c-45d5-908c-a20a590b66a4
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8473e7a474","password":"****"}

--- response: 200 in 90 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6e90fb1-d77c-45d5-908c-a20a590b66a4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bea5c42-89c6-4eed-b277-d1c750eb6b64"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-aae8b500-b41d-41ba-b5bb-a466ef174913

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aae8b500-b41d-41ba-b5bb-a466ef174913
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8473e7a474","password":"****"}

--- response: 200 in 96 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-aae8b500-b41d-41ba-b5bb-a466ef174913
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bea5c42-89c6-4eed-b277-d1c750eb6b64"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-88b928f7-38f1-4db6-9a45-8cb11af1c5f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88b928f7-38f1-4db6-9a45-8cb11af1c5f4
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8473e7a474","password":"****"}

--- response: 200 in 89 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-88b928f7-38f1-4db6-9a45-8cb11af1c5f4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bea5c42-89c6-4eed-b277-d1c750eb6b64"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dde5d60d-ef1e-44a2-a54f-c0706de7ed58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dde5d60d-ef1e-44a2-a54f-c0706de7ed58
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8473e7a474","password":"****"}

--- response: 200 in 102 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-dde5d60d-ef1e-44a2-a54f-c0706de7ed58
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bea5c42-89c6-4eed-b277-d1c750eb6b64"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7262674e-6c89-414d-a8e6-63836e9ae4c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7262674e-6c89-414d-a8e6-63836e9ae4c3
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8473e7a474","password":"****"}

--- response: 200 in 111 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7262674e-6c89-414d-a8e6-63836e9ae4c3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bea5c42-89c6-4eed-b277-d1c750eb6b64"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-31138fbd-943e-43ea-9806-55f2d711f9a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31138fbd-943e-43ea-9806-55f2d711f9a2
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8473e7a474","password":"****"}

--- response: 200 in 105 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-31138fbd-943e-43ea-9806-55f2d711f9a2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bea5c42-89c6-4eed-b277-d1c750eb6b64"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-aef092fd-ccf0-49a2-95eb-35b7d8c3e4ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aef092fd-ccf0-49a2-95eb-35b7d8c3e4ee
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8473e7a474","password":"****"}

--- response: 200 in 114 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-aef092fd-ccf0-49a2-95eb-35b7d8c3e4ee
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bea5c42-89c6-4eed-b277-d1c750eb6b64"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-848600e6-7162-4add-be3e-e6436f6baeee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-848600e6-7162-4add-be3e-e6436f6baeee
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8473e7a474","password":"****"}

--- response: 200 in 112 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-848600e6-7162-4add-be3e-e6436f6baeee
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bea5c42-89c6-4eed-b277-d1c750eb6b64"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-068738a0-8eae-4c09-87b2-af79cef3666d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-068738a0-8eae-4c09-87b2-af79cef3666d
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8473e7a474","password":"****"}

--- response: 200 in 106 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-068738a0-8eae-4c09-87b2-af79cef3666d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bea5c42-89c6-4eed-b277-d1c750eb6b64"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-d9188c15-1042-48cb-995a-352550a3fa25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9188c15-1042-48cb-995a-352550a3fa25
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8473e7a474","password":"****"}

--- response: 200 in 107 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9188c15-1042-48cb-995a-352550a3fa25
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bea5c42-89c6-4eed-b277-d1c750eb6b64"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4e571b75-2f4a-484b-9de9-4f2d03d89001

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f8903fa4079a4b578172df90c1f7b62c
X-Correlation-Id: qa-4e571b75-2f4a-484b-9de9-4f2d03d89001
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 68 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e571b75-2f4a-484b-9de9-4f2d03d89001
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
Location: /v1/credits/purchases/pur_ee827c75-7491-408f-8256-f0cb49c1a676
Content-Length: 144

{"id":"pur_ee827c75-7491-408f-8256-f0cb49c1a676","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-07T08:55:03.778876035Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e3166124-79b7-44b8-8121-339151a8a24b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8593d7e3676640c785850aea45f0b085
X-Correlation-Id: qa-e3166124-79b7-44b8-8121-339151a8a24b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 67 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3166124-79b7-44b8-8121-339151a8a24b
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
Location: /v1/credits/purchases/pur_8753f957-d256-4a28-aa21-cff9a6eba98f
Content-Length: 144

{"id":"pur_8753f957-d256-4a28-aa21-cff9a6eba98f","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-07T08:55:03.775429585Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-de2596bc-d6d7-4129-96b5-86a7aff1d0d4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-56ae8235907840daae3c369cfadacc4c
X-Correlation-Id: qa-de2596bc-d6d7-4129-96b5-86a7aff1d0d4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 73 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-de2596bc-d6d7-4129-96b5-86a7aff1d0d4
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
Location: /v1/credits/purchases/pur_8e4f60fc-3ad1-4165-a43f-f90a32562568
Content-Length: 144

{"id":"pur_8e4f60fc-3ad1-4165-a43f-f90a32562568","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-07T08:55:03.782525479Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a7ba039c-981b-408a-8256-c015448d7aaa

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5f8cacdbec0a43249ba8c64da48222aa
X-Correlation-Id: qa-a7ba039c-981b-408a-8256-c015448d7aaa
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 64 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7ba039c-981b-408a-8256-c015448d7aaa
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
Location: /v1/credits/purchases/pur_b688c057-da08-4aa0-b20e-49c93b53b4fc
Content-Length: 144

{"id":"pur_b688c057-da08-4aa0-b20e-49c93b53b4fc","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-07T08:55:03.775762992Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-31fe171d-91d0-4c34-b735-46beffa46cc4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7682723d029a41078470aae32e1f6490
X-Correlation-Id: qa-31fe171d-91d0-4c34-b735-46beffa46cc4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 63 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-31fe171d-91d0-4c34-b735-46beffa46cc4
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
Location: /v1/credits/purchases/pur_b4f89743-cd70-44f2-9d6e-e9c64019948a
Content-Length: 144

{"id":"pur_b4f89743-cd70-44f2-9d6e-e9c64019948a","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-07T08:55:03.775518963Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-723f07a7-c4f4-433f-8a26-8eaa3f095574

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cfb61601fcd54515a581adf6108396c9
X-Correlation-Id: qa-723f07a7-c4f4-433f-8a26-8eaa3f095574
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 61 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-723f07a7-c4f4-433f-8a26-8eaa3f095574
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
Location: /v1/credits/purchases/pur_98a2b4c7-c570-43ca-b693-49f680a4944f
Content-Length: 144

{"id":"pur_98a2b4c7-c570-43ca-b693-49f680a4944f","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-07T08:55:03.775577253Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-617c5b3c-0bec-4da8-b862-ed5696643d0c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-015409287fed4685bb82048af7922449
X-Correlation-Id: qa-617c5b3c-0bec-4da8-b862-ed5696643d0c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 80 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-617c5b3c-0bec-4da8-b862-ed5696643d0c
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
Location: /v1/credits/purchases/pur_caf69948-c58f-41d3-bd3a-ec10c447a8e7
Content-Length: 144

{"id":"pur_caf69948-c58f-41d3-bd3a-ec10c447a8e7","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-07T08:55:03.776129503Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9e9f835d-61bf-4c4a-b98c-6fe24b48bae9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6e6ed627482742eda40ffc2f3de422b6
X-Correlation-Id: qa-9e9f835d-61bf-4c4a-b98c-6fe24b48bae9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 43 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e9f835d-61bf-4c4a-b98c-6fe24b48bae9
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
Location: /v1/credits/purchases/pur_237a76e0-420a-465e-b12f-e4d9dae66b4c
Content-Length: 144

{"id":"pur_237a76e0-420a-465e-b12f-e4d9dae66b4c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-07T08:55:03.775352784Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b85ea3d4-6e04-4b51-b099-f3ae347802c2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-65ee3642d3074a67ac3f198db6d19d2b
X-Correlation-Id: qa-b85ea3d4-6e04-4b51-b099-f3ae347802c2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 34 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b85ea3d4-6e04-4b51-b099-f3ae347802c2
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
Location: /v1/credits/purchases/pur_4fa532e1-a699-4b1b-a9c5-56adee77fefa
Content-Length: 145

{"id":"pur_4fa532e1-a699-4b1b-a9c5-56adee77fefa","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-07T08:55:03.792779014Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-69ba23be-0654-4de3-99fb-8fc1200c7b5f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d1ff563dfaa74022b70e82124480e1f2
X-Correlation-Id: qa-69ba23be-0654-4de3-99fb-8fc1200c7b5f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 72 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-69ba23be-0654-4de3-99fb-8fc1200c7b5f
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
Location: /v1/credits/purchases/pur_a89d2213-115a-4f84-a1a2-bd061886d755
Content-Length: 144

{"id":"pur_a89d2213-115a-4f84-a1a2-bd061886d755","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-07T08:55:03.783181321Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-734afebd-7766-475f-b67d-0b9a20889f7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-734afebd-7766-475f-b67d-0b9a20889f7c
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8473e7a474","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-734afebd-7766-475f-b67d-0b9a20889f7c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bea5c42-89c6-4eed-b277-d1c750eb6b64"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b297aa8d-44fa-4cf0-9b19-c7a5412180ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b297aa8d-44fa-4cf0-9b19-c7a5412180ad
Content-Type: application/json

--- response: 200 in 129 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b297aa8d-44fa-4cf0-9b19-c7a5412180ad
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
Content-Length: 755

{"items":[{"id":"led_1076bec4-5ed0-4934-9e67-44c599a2471c","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-07T08:55:03.098605708Z"},{"id":"led_f663ede6-78ad-4f3d-865e-65bad03646fa","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_237a76e0-420a-465e-b12f-e4d9dae66b4c","createdAt":"2026-11-07T08:55:03.775352784Z"},{"id":"led_6b7f6236-0dde-429d-8528-5e7fad6615b4","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_8753f957-d256-4a28-aa21-cff9a6eba98f","createdAt":"2026-11-07T08:55:03.775429585Z"},{"id":"led_24aa399d-50e8-4e36-a4be-d85307184bde","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_b4f89743-cd70-44f2-9d6e-e9c64019948a","createdAt":"2026-11-07T08:55:03.775518963Z"},{"id":"led_46e36bf3-5e61-4afb-b9c0-7cfd03fe7e69","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_98a2b4c7-c570-43ca-b693-49f680a4944f","createdAt":"2026-11-07T08:55:03.775577253Z"},{"id":"led_f3043b01-d6ea-414c-873b-3530dd1b1f65","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_b688c057-da08-4aa0-b20e-49c93b53b4fc","createdAt":"2026-11-07T08:55:03.775762992Z"},{"id":"led_919eea52-1d0d-461d-bee5-6c983f1ee733","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_caf69948-c58f-41d3-bd3a-ec10c447a8e7","createdAt":"2026-11-07T08:55:03.776129503Z"},{"id":"led_751db588-f852-4dad-83ee-42a0bce79655","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_ee827c75-7491-408f-8256-f0cb49c1a676","createdAt":"2026-11-07T08:55:03.778876035Z"},{"id":"led_1112da0d-4f32-42c9-8f6c-c63cf799daa2","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_8e4f60fc-3ad1-4165-a43f-f90a32562568","createdAt":"2026-11-07T08:55:03.782525479Z"},{"id":"led_1aa286c4-91f7-448b-b8bf-16d750e8b52c","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_a89d2213-115a-4f84-a1a2-bd061886d755","createdAt":"2026-11-07T08:55:03.783181321Z"},{"id":"led_24356a69-733b-4529-9695-254914ca3857","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_4fa532e1-a699-4b1b-a9c5-56adee77fefa","createdAt":"2026-11-07T08:55:03.792779014Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9edf6ad9-0845-4b02-94a3-dbc295a4b14d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9edf6ad9-0845-4b02-94a3-dbc295a4b14d
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9edf6ad9-0845-4b02-94a3-dbc295a4b14d
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
correlation: qa-03e719e0-d117-4248-8537-bb1495df338a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03e719e0-d117-4248-8537-bb1495df338a
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8473e7a474","password":"****"}

--- response: 401 in 29 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03e719e0-d117-4248-8537-bb1495df338a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03e719e0-d117-4248-8537-bb1495df338a"}
```
