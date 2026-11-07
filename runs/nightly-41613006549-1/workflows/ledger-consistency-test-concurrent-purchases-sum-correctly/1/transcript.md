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
| 1 | `POST /v1/accounts` | 201 | 298 | `qa-6b552268-def6-452d-8100-46fec139645c` |
| 6 | `POST /v1/auth/token` | 200 | 53 | `qa-584d4d23-f70a-4b8c-99d7-89f9eeec8f6c` |
| 4 | `POST /v1/auth/token` | 200 | 52 | `qa-f1251010-5382-4616-9edd-973d14e02918` |
| 5 | `POST /v1/auth/token` | 200 | 61 | `qa-258d542e-f474-4769-b4c0-7ef5dddeaee4` |
| 8 | `POST /v1/auth/token` | 200 | 64 | `qa-cb75cc6d-4c56-47f4-b968-3dd9e2f430af` |
| 9 | `POST /v1/auth/token` | 200 | 64 | `qa-19f48f0b-78ef-4b5f-85af-aca47247a6fb` |
| 2 | `POST /v1/auth/token` | 200 | 78 | `qa-060e0850-ea01-45fa-af83-8acf3f4830e1` |
| 7 | `POST /v1/auth/token` | 200 | 67 | `qa-31ea01be-a446-4e03-b262-09f5a8b46f51` |
| 3 | `POST /v1/auth/token` | 200 | 84 | `qa-5e5c952a-3823-41d4-a0e6-fa32ee0c4991` |
| 10 | `POST /v1/auth/token` | 200 | 85 | `qa-37a20826-f7f3-4bf8-bc4e-cb8033c29a7e` |
| 11 | `POST /v1/auth/token` | 200 | 69 | `qa-6189e437-9e37-4a89-92ef-39862f5ff9af` |
| 15 | `POST /v1/credits/purchases` | 201 | 52 | `qa-c0bf6861-85ad-44b3-962f-64137d2f46e6` |
| 20 | `POST /v1/credits/purchases` | 201 | 50 | `qa-d567fc91-5b24-4216-8b54-1ac1e35830d6` |
| 13 | `POST /v1/credits/purchases` | 201 | 62 | `qa-a7acc856-91ad-43aa-9b89-83ced9e158ee` |
| 12 | `POST /v1/credits/purchases` | 201 | 67 | `qa-10c71e2a-9ab0-459a-854b-b7f1b5edbc74` |
| 17 | `POST /v1/credits/purchases` | 201 | 58 | `qa-fb5d16e4-16da-464f-bdc8-e32b4bc44088` |
| 19 | `POST /v1/credits/purchases` | 201 | 55 | `qa-defe792b-2cc9-46de-a013-7ec630dcaade` |
| 18 | `POST /v1/credits/purchases` | 201 | 57 | `qa-a2008634-7515-4999-a44e-9ec0f8b6fdfe` |
| 21 | `POST /v1/credits/purchases` | 201 | 51 | `qa-682aa10e-0a73-4856-a339-1a0fd09df511` |
| 14 | `POST /v1/credits/purchases` | 201 | 68 | `qa-04bfb8c1-dbe4-4b1d-bb92-e623bd849c74` |
| 16 | `POST /v1/credits/purchases` | 201 | 65 | `qa-90580998-e916-4e4d-b0fa-813f6854ee16` |
| 22 | `POST /v1/auth/token` | 200 | 26 | `qa-ac6de49f-1f02-4969-9036-a50cfde38fb0` |
| 23 | `GET /v1/credits/ledger` | 200 | 25 | `qa-bb4bfad6-09e3-4fdb-829d-4f62b3824b75` |
| 24 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-a829d06b-7d9e-4297-ade3-48828098674a` |
| 25 | `POST /v1/auth/token` | 401 | 12 | `qa-d5650eca-3b5d-4857-99fd-20e0b71db7a5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6b552268-def6-452d-8100-46fec139645c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b552268-def6-452d-8100-46fec139645c
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfa2eaac9f1","displayName":"QA bdfa2eaac9f1","password":"****","region":"us"}

--- response: 201 in 298 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b552268-def6-452d-8100-46fec139645c
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
Location: /v1/accounts/qa-bdfa2eaac9f1
X-Served-Region: us
Content-Length: 181

{"id":"acc_260d0ebe-2967-4af4-b94d-3875dd551a3d","handle":"qa-bdfa2eaac9f1","displayName":"QA bdfa2eaac9f1","region":"us","role":"user","createdAt":"2026-11-03T09:41:33.445896286Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-584d4d23-f70a-4b8c-99d7-89f9eeec8f6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-584d4d23-f70a-4b8c-99d7-89f9eeec8f6c
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfa2eaac9f1","password":"****"}

--- response: 200 in 53 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-584d4d23-f70a-4b8c-99d7-89f9eeec8f6c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_260d0ebe-2967-4af4-b94d-3875dd551a3d"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-f1251010-5382-4616-9edd-973d14e02918

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1251010-5382-4616-9edd-973d14e02918
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfa2eaac9f1","password":"****"}

--- response: 200 in 52 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1251010-5382-4616-9edd-973d14e02918
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_260d0ebe-2967-4af4-b94d-3875dd551a3d"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-258d542e-f474-4769-b4c0-7ef5dddeaee4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-258d542e-f474-4769-b4c0-7ef5dddeaee4
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfa2eaac9f1","password":"****"}

--- response: 200 in 61 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-258d542e-f474-4769-b4c0-7ef5dddeaee4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_260d0ebe-2967-4af4-b94d-3875dd551a3d"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-cb75cc6d-4c56-47f4-b968-3dd9e2f430af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb75cc6d-4c56-47f4-b968-3dd9e2f430af
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfa2eaac9f1","password":"****"}

--- response: 200 in 64 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb75cc6d-4c56-47f4-b968-3dd9e2f430af
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_260d0ebe-2967-4af4-b94d-3875dd551a3d"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-19f48f0b-78ef-4b5f-85af-aca47247a6fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19f48f0b-78ef-4b5f-85af-aca47247a6fb
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfa2eaac9f1","password":"****"}

--- response: 200 in 64 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-19f48f0b-78ef-4b5f-85af-aca47247a6fb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_260d0ebe-2967-4af4-b94d-3875dd551a3d"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-060e0850-ea01-45fa-af83-8acf3f4830e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-060e0850-ea01-45fa-af83-8acf3f4830e1
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfa2eaac9f1","password":"****"}

--- response: 200 in 78 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-060e0850-ea01-45fa-af83-8acf3f4830e1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_260d0ebe-2967-4af4-b94d-3875dd551a3d"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-31ea01be-a446-4e03-b262-09f5a8b46f51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31ea01be-a446-4e03-b262-09f5a8b46f51
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfa2eaac9f1","password":"****"}

--- response: 200 in 67 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-31ea01be-a446-4e03-b262-09f5a8b46f51
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_260d0ebe-2967-4af4-b94d-3875dd551a3d"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5e5c952a-3823-41d4-a0e6-fa32ee0c4991

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e5c952a-3823-41d4-a0e6-fa32ee0c4991
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfa2eaac9f1","password":"****"}

--- response: 200 in 84 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e5c952a-3823-41d4-a0e6-fa32ee0c4991
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_260d0ebe-2967-4af4-b94d-3875dd551a3d"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-37a20826-f7f3-4bf8-bc4e-cb8033c29a7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37a20826-f7f3-4bf8-bc4e-cb8033c29a7e
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfa2eaac9f1","password":"****"}

--- response: 200 in 85 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-37a20826-f7f3-4bf8-bc4e-cb8033c29a7e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_260d0ebe-2967-4af4-b94d-3875dd551a3d"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-6189e437-9e37-4a89-92ef-39862f5ff9af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6189e437-9e37-4a89-92ef-39862f5ff9af
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfa2eaac9f1","password":"****"}

--- response: 200 in 69 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6189e437-9e37-4a89-92ef-39862f5ff9af
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_260d0ebe-2967-4af4-b94d-3875dd551a3d"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c0bf6861-85ad-44b3-962f-64137d2f46e6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6cea2b01fdf04ee59f144492e3678e71
X-Correlation-Id: qa-c0bf6861-85ad-44b3-962f-64137d2f46e6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 52 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0bf6861-85ad-44b3-962f-64137d2f46e6
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
Location: /v1/credits/purchases/pur_85f255c8-fec5-46a6-ba16-77ea845dc3fb
Content-Length: 144

{"id":"pur_85f255c8-fec5-46a6-ba16-77ea845dc3fb","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-03T09:41:33.904606802Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d567fc91-5b24-4216-8b54-1ac1e35830d6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-75cd3c0c3cf34af08f07c2fa20fe0dfa
X-Correlation-Id: qa-d567fc91-5b24-4216-8b54-1ac1e35830d6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 50 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d567fc91-5b24-4216-8b54-1ac1e35830d6
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
Location: /v1/credits/purchases/pur_5261e99b-2beb-4548-b262-210682390517
Content-Length: 144

{"id":"pur_5261e99b-2beb-4548-b262-210682390517","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-03T09:41:33.908927894Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a7acc856-91ad-43aa-9b89-83ced9e158ee

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8e41dd6572124aed9a8f9eac30428c92
X-Correlation-Id: qa-a7acc856-91ad-43aa-9b89-83ced9e158ee
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 62 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7acc856-91ad-43aa-9b89-83ced9e158ee
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
Location: /v1/credits/purchases/pur_ce526373-ecfc-4d20-805d-623896cfef5f
Content-Length: 144

{"id":"pur_ce526373-ecfc-4d20-805d-623896cfef5f","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-03T09:41:33.909939052Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-10c71e2a-9ab0-459a-854b-b7f1b5edbc74

--- request headers ---
Accept: application/json
Idempotency-Key: qa-09fd3379ac3d4c36862934187ca937b1
X-Correlation-Id: qa-10c71e2a-9ab0-459a-854b-b7f1b5edbc74
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 67 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-10c71e2a-9ab0-459a-854b-b7f1b5edbc74
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
Location: /v1/credits/purchases/pur_3f4ffdcf-e602-4c04-aedd-443710d0411e
Content-Length: 144

{"id":"pur_3f4ffdcf-e602-4c04-aedd-443710d0411e","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-03T09:41:33.909419787Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fb5d16e4-16da-464f-bdc8-e32b4bc44088

--- request headers ---
Accept: application/json
Idempotency-Key: qa-313a4e81e24e49e7ba87fe25d5686252
X-Correlation-Id: qa-fb5d16e4-16da-464f-bdc8-e32b4bc44088
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 58 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb5d16e4-16da-464f-bdc8-e32b4bc44088
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
Location: /v1/credits/purchases/pur_6881f9c7-f67a-47ee-9ed7-0fb0ece6cbab
Content-Length: 144

{"id":"pur_6881f9c7-f67a-47ee-9ed7-0fb0ece6cbab","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-03T09:41:33.911551876Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-defe792b-2cc9-46de-a013-7ec630dcaade

--- request headers ---
Accept: application/json
Idempotency-Key: qa-62193cd66cd942c293b6585daec193ec
X-Correlation-Id: qa-defe792b-2cc9-46de-a013-7ec630dcaade
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 55 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-defe792b-2cc9-46de-a013-7ec630dcaade
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
Location: /v1/credits/purchases/pur_bb679497-e6ad-46e8-817a-32248089752c
Content-Length: 144

{"id":"pur_bb679497-e6ad-46e8-817a-32248089752c","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-03T09:41:33.912928498Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a2008634-7515-4999-a44e-9ec0f8b6fdfe

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0c73586372a84e24ad7c35c78a67d90e
X-Correlation-Id: qa-a2008634-7515-4999-a44e-9ec0f8b6fdfe
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 57 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2008634-7515-4999-a44e-9ec0f8b6fdfe
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
Location: /v1/credits/purchases/pur_fbc281f0-83b2-40f2-8937-ea795938f73d
Content-Length: 144

{"id":"pur_fbc281f0-83b2-40f2-8937-ea795938f73d","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-03T09:41:33.908445315Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-682aa10e-0a73-4856-a339-1a0fd09df511

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1b7a65b4a0d3452aa042c9658a0e3644
X-Correlation-Id: qa-682aa10e-0a73-4856-a339-1a0fd09df511
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 51 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-682aa10e-0a73-4856-a339-1a0fd09df511
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
Location: /v1/credits/purchases/pur_a407ae7b-f1cb-493d-ae5d-852275d3d540
Content-Length: 144

{"id":"pur_a407ae7b-f1cb-493d-ae5d-852275d3d540","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-03T09:41:33.915063741Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-04bfb8c1-dbe4-4b1d-bb92-e623bd849c74

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ee000c359375442f9aa8c7f84bd00bd4
X-Correlation-Id: qa-04bfb8c1-dbe4-4b1d-bb92-e623bd849c74
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 68 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-04bfb8c1-dbe4-4b1d-bb92-e623bd849c74
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
Location: /v1/credits/purchases/pur_a90796d1-6a22-4267-a647-252f11d67955
Content-Length: 144

{"id":"pur_a90796d1-6a22-4267-a647-252f11d67955","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-03T09:41:33.912405518Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-90580998-e916-4e4d-b0fa-813f6854ee16

--- request headers ---
Accept: application/json
Idempotency-Key: qa-032a1f62740845b88a7b70df47e53fbb
X-Correlation-Id: qa-90580998-e916-4e4d-b0fa-813f6854ee16
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 65 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-90580998-e916-4e4d-b0fa-813f6854ee16
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
Location: /v1/credits/purchases/pur_b779db60-700d-4ed6-89d8-13a1b80bd7fe
Content-Length: 145

{"id":"pur_b779db60-700d-4ed6-89d8-13a1b80bd7fe","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-03T09:41:33.917504860Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-ac6de49f-1f02-4969-9036-a50cfde38fb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac6de49f-1f02-4969-9036-a50cfde38fb0
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfa2eaac9f1","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac6de49f-1f02-4969-9036-a50cfde38fb0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_260d0ebe-2967-4af4-b94d-3875dd551a3d"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-bb4bfad6-09e3-4fdb-829d-4f62b3824b75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb4bfad6-09e3-4fdb-829d-4f62b3824b75
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb4bfad6-09e3-4fdb-829d-4f62b3824b75
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
Content-Length: 761

{"items":[{"id":"led_89db661a-540a-4bcb-b073-36073cd2768e","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-03T09:41:33.446076404Z"},{"id":"led_64480bd5-1a48-4949-83f2-1066b90a3caf","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_85f255c8-fec5-46a6-ba16-77ea845dc3fb","createdAt":"2026-11-03T09:41:33.904606802Z"},{"id":"led_33a24ad0-9c3e-499e-9dca-f6bcb0b96886","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_fbc281f0-83b2-40f2-8937-ea795938f73d","createdAt":"2026-11-03T09:41:33.908445315Z"},{"id":"led_9610790f-dd04-4cb7-be64-8abaede821a5","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_5261e99b-2beb-4548-b262-210682390517","createdAt":"2026-11-03T09:41:33.908927894Z"},{"id":"led_127cc6f3-2088-4724-8c98-809087969eb3","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_3f4ffdcf-e602-4c04-aedd-443710d0411e","createdAt":"2026-11-03T09:41:33.909419787Z"},{"id":"led_4e76a587-f1c7-4395-94b1-ac517a64457e","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_ce526373-ecfc-4d20-805d-623896cfef5f","createdAt":"2026-11-03T09:41:33.909939052Z"},{"id":"led_96581998-ca80-4a0e-9e77-34a702edc138","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_6881f9c7-f67a-47ee-9ed7-0fb0ece6cbab","createdAt":"2026-11-03T09:41:33.911551876Z"},{"id":"led_c5bf6899-626e-4073-ae81-eb5803bd376a","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_a90796d1-6a22-4267-a647-252f11d67955","createdAt":"2026-11-03T09:41:33.912405518Z"},{"id":"led_bc3f9d76-41de-43d7-8426-843ffb8990a8","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_bb679497-e6ad-46e8-817a-32248089752c","createdAt":"2026-11-03T09:41:33.912928498Z"},{"id":"led_6de0c68b-7af4-4c0e-a227-2585bcd4d489","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_a407ae7b-f1cb-493d-ae5d-852275d3d540","createdAt":"2026-11-03T09:41:33.915063741Z"},{"id":"led_12736497-bb84-47e2-acd1-e829fa6e28c8","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_b779db60-700d-4ed6-89d8-13a1b80bd7fe","createdAt":"2026-11-03T09:41:33.917504860Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a829d06b-7d9e-4297-ade3-48828098674a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a829d06b-7d9e-4297-ade3-48828098674a
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a829d06b-7d9e-4297-ade3-48828098674a
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
correlation: qa-d5650eca-3b5d-4857-99fd-20e0b71db7a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5650eca-3b5d-4857-99fd-20e0b71db7a5
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfa2eaac9f1","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5650eca-3b5d-4857-99fd-20e0b71db7a5
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d5650eca-3b5d-4857-99fd-20e0b71db7a5"}
```
