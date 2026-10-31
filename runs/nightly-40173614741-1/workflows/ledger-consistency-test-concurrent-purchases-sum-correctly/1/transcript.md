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
| 1 | `POST /v1/accounts` | 201 | 495 | `qa-56420719-f1a8-418f-b294-7084b5ea6bb8` |
| 4 | `POST /v1/auth/token` | 200 | 110 | `qa-591c7afa-ca5b-4061-815b-8f67e32d7caf` |
| 9 | `POST /v1/auth/token` | 200 | 96 | `qa-e91c3373-0bfe-48d7-9818-970448537d99` |
| 5 | `POST /v1/auth/token` | 200 | 110 | `qa-81c34e3f-b5a8-458d-87ab-befca4dcadcf` |
| 10 | `POST /v1/auth/token` | 200 | 90 | `qa-23f1ff67-579c-42ce-a153-81ff9f17dc27` |
| 8 | `POST /v1/auth/token` | 200 | 97 | `qa-6599dcec-4299-4b06-a1e7-e9d1fd88de0c` |
| 2 | `POST /v1/auth/token` | 200 | 117 | `qa-569bf7ab-8e6f-4fd6-855c-c5dc3f3de4f9` |
| 7 | `POST /v1/auth/token` | 200 | 105 | `qa-635c0fc2-97e0-4110-82ec-c7a387a8e385` |
| 3 | `POST /v1/auth/token` | 200 | 112 | `qa-7681079b-ef88-4c29-958d-85f959e63c07` |
| 6 | `POST /v1/auth/token` | 200 | 111 | `qa-94836a9f-2c95-4997-ab9b-9c55cc381f4d` |
| 11 | `POST /v1/auth/token` | 200 | 101 | `qa-36f75499-5191-4b0c-a4e2-2be2df918805` |
| 20 | `POST /v1/credits/purchases` | 201 | 44 | `qa-b17be3b2-a45d-45f0-934a-e37beff597b0` |
| 12 | `POST /v1/credits/purchases` | 201 | 64 | `qa-4d3c1864-f233-4076-a8a5-a78d1c016223` |
| 19 | `POST /v1/credits/purchases` | 201 | 45 | `qa-8a6d4248-01de-40c7-8760-2a98a7541c08` |
| 13 | `POST /v1/credits/purchases` | 201 | 61 | `qa-b09a72e5-888b-4963-9dec-f69c6a5739bc` |
| 16 | `POST /v1/credits/purchases` | 201 | 62 | `qa-6a0f99c4-a732-4785-8b9e-0f085f107963` |
| 15 | `POST /v1/credits/purchases` | 201 | 65 | `qa-b73d5682-f14a-466c-ae9d-d71f6d2c7b69` |
| 21 | `POST /v1/credits/purchases` | 201 | 47 | `qa-f8b40f4c-e8c6-4a4b-bf22-cf0ca39a6478` |
| 17 | `POST /v1/credits/purchases` | 201 | 77 | `qa-151ce4e5-5513-4c3a-837a-136db8af7366` |
| 14 | `POST /v1/credits/purchases` | 201 | 83 | `qa-91d412f5-fcdb-4c19-b855-c67bb863f3ce` |
| 18 | `POST /v1/credits/purchases` | 201 | 72 | `qa-d4ca5bd1-6755-403b-b788-2b5fe71103f2` |
| 22 | `POST /v1/auth/token` | 200 | 24 | `qa-7fde74d1-133e-44de-ac4c-a39360ba460b` |
| 23 | `GET /v1/credits/ledger` | 200 | 72 | `qa-1692c05f-e01a-4896-b7a4-a12b98e0ec14` |
| 24 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-8f5b7c8c-abf9-4c34-ad24-de556d007bd3` |
| 25 | `POST /v1/auth/token` | 401 | 22 | `qa-951c21d8-3d7c-4f2c-9433-b568b0cbe6d0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-56420719-f1a8-418f-b294-7084b5ea6bb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56420719-f1a8-418f-b294-7084b5ea6bb8
Content-Type: application/json

--- request body ---
{"handle":"qa-dc77b372efea","displayName":"QA dc77b372efea","password":"****","region":"us"}

--- response: 201 in 495 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-56420719-f1a8-418f-b294-7084b5ea6bb8
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
Location: /v1/accounts/qa-dc77b372efea
X-Served-Region: us
Content-Length: 181

{"id":"acc_b08035eb-ea8d-44ce-8cba-36eba51b8b8d","handle":"qa-dc77b372efea","displayName":"QA dc77b372efea","region":"us","role":"user","createdAt":"2026-10-25T07:40:25.353255551Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-591c7afa-ca5b-4061-815b-8f67e32d7caf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-591c7afa-ca5b-4061-815b-8f67e32d7caf
Content-Type: application/json

--- request body ---
{"handle":"qa-dc77b372efea","password":"****"}

--- response: 200 in 110 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-591c7afa-ca5b-4061-815b-8f67e32d7caf
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b08035eb-ea8d-44ce-8cba-36eba51b8b8d"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-e91c3373-0bfe-48d7-9818-970448537d99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e91c3373-0bfe-48d7-9818-970448537d99
Content-Type: application/json

--- request body ---
{"handle":"qa-dc77b372efea","password":"****"}

--- response: 200 in 96 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-e91c3373-0bfe-48d7-9818-970448537d99
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b08035eb-ea8d-44ce-8cba-36eba51b8b8d"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-81c34e3f-b5a8-458d-87ab-befca4dcadcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81c34e3f-b5a8-458d-87ab-befca4dcadcf
Content-Type: application/json

--- request body ---
{"handle":"qa-dc77b372efea","password":"****"}

--- response: 200 in 110 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-81c34e3f-b5a8-458d-87ab-befca4dcadcf
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b08035eb-ea8d-44ce-8cba-36eba51b8b8d"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-23f1ff67-579c-42ce-a153-81ff9f17dc27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23f1ff67-579c-42ce-a153-81ff9f17dc27
Content-Type: application/json

--- request body ---
{"handle":"qa-dc77b372efea","password":"****"}

--- response: 200 in 90 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-23f1ff67-579c-42ce-a153-81ff9f17dc27
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b08035eb-ea8d-44ce-8cba-36eba51b8b8d"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-6599dcec-4299-4b06-a1e7-e9d1fd88de0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6599dcec-4299-4b06-a1e7-e9d1fd88de0c
Content-Type: application/json

--- request body ---
{"handle":"qa-dc77b372efea","password":"****"}

--- response: 200 in 97 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-6599dcec-4299-4b06-a1e7-e9d1fd88de0c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b08035eb-ea8d-44ce-8cba-36eba51b8b8d"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-569bf7ab-8e6f-4fd6-855c-c5dc3f3de4f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-569bf7ab-8e6f-4fd6-855c-c5dc3f3de4f9
Content-Type: application/json

--- request body ---
{"handle":"qa-dc77b372efea","password":"****"}

--- response: 200 in 117 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-569bf7ab-8e6f-4fd6-855c-c5dc3f3de4f9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b08035eb-ea8d-44ce-8cba-36eba51b8b8d"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-635c0fc2-97e0-4110-82ec-c7a387a8e385

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-635c0fc2-97e0-4110-82ec-c7a387a8e385
Content-Type: application/json

--- request body ---
{"handle":"qa-dc77b372efea","password":"****"}

--- response: 200 in 105 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-635c0fc2-97e0-4110-82ec-c7a387a8e385
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b08035eb-ea8d-44ce-8cba-36eba51b8b8d"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7681079b-ef88-4c29-958d-85f959e63c07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7681079b-ef88-4c29-958d-85f959e63c07
Content-Type: application/json

--- request body ---
{"handle":"qa-dc77b372efea","password":"****"}

--- response: 200 in 112 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-7681079b-ef88-4c29-958d-85f959e63c07
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b08035eb-ea8d-44ce-8cba-36eba51b8b8d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-94836a9f-2c95-4997-ab9b-9c55cc381f4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94836a9f-2c95-4997-ab9b-9c55cc381f4d
Content-Type: application/json

--- request body ---
{"handle":"qa-dc77b372efea","password":"****"}

--- response: 200 in 111 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-94836a9f-2c95-4997-ab9b-9c55cc381f4d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b08035eb-ea8d-44ce-8cba-36eba51b8b8d"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-36f75499-5191-4b0c-a4e2-2be2df918805

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36f75499-5191-4b0c-a4e2-2be2df918805
Content-Type: application/json

--- request body ---
{"handle":"qa-dc77b372efea","password":"****"}

--- response: 200 in 101 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-36f75499-5191-4b0c-a4e2-2be2df918805
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b08035eb-ea8d-44ce-8cba-36eba51b8b8d"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b17be3b2-a45d-45f0-934a-e37beff597b0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-86e14a4e720949f28994b46dde24d2cd
X-Correlation-Id: qa-b17be3b2-a45d-45f0-934a-e37beff597b0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 44 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-b17be3b2-a45d-45f0-934a-e37beff597b0
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
Location: /v1/credits/purchases/pur_37440100-4229-43c3-ab31-863ebf2549a9
Content-Length: 144

{"id":"pur_37440100-4229-43c3-ab31-863ebf2549a9","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-10-25T07:40:26.209723528Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4d3c1864-f233-4076-a8a5-a78d1c016223

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b5ba6f653920493bbe536902282e1573
X-Correlation-Id: qa-4d3c1864-f233-4076-a8a5-a78d1c016223
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 64 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d3c1864-f233-4076-a8a5-a78d1c016223
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
Location: /v1/credits/purchases/pur_0c3b7faa-5f82-470a-b4e8-8df0f4102f2e
Content-Length: 144

{"id":"pur_0c3b7faa-5f82-470a-b4e8-8df0f4102f2e","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-10-25T07:40:26.204347257Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8a6d4248-01de-40c7-8760-2a98a7541c08

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b380fdddd1cf4265a07554955d10da90
X-Correlation-Id: qa-8a6d4248-01de-40c7-8760-2a98a7541c08
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 45 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a6d4248-01de-40c7-8760-2a98a7541c08
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
Location: /v1/credits/purchases/pur_648bc60e-06fc-4921-8cff-5f9239469912
Content-Length: 144

{"id":"pur_648bc60e-06fc-4921-8cff-5f9239469912","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-10-25T07:40:26.205716140Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b09a72e5-888b-4963-9dec-f69c6a5739bc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-93aa3151adcb4643a0f1c95098395ba8
X-Correlation-Id: qa-b09a72e5-888b-4963-9dec-f69c6a5739bc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 61 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-b09a72e5-888b-4963-9dec-f69c6a5739bc
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
Location: /v1/credits/purchases/pur_5444815f-b35a-434d-951c-5a90d16ba732
Content-Length: 144

{"id":"pur_5444815f-b35a-434d-951c-5a90d16ba732","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-10-25T07:40:26.208085298Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6a0f99c4-a732-4785-8b9e-0f085f107963

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c44b464d32d943169a9d367e80e76226
X-Correlation-Id: qa-6a0f99c4-a732-4785-8b9e-0f085f107963
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 62 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a0f99c4-a732-4785-8b9e-0f085f107963
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
Location: /v1/credits/purchases/pur_71b456ef-141d-475c-90e4-a450a64942f3
Content-Length: 144

{"id":"pur_71b456ef-141d-475c-90e4-a450a64942f3","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-10-25T07:40:26.209668972Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b73d5682-f14a-466c-ae9d-d71f6d2c7b69

--- request headers ---
Accept: application/json
Idempotency-Key: qa-277977b9a3b7487a96ef6aceb7a2606b
X-Correlation-Id: qa-b73d5682-f14a-466c-ae9d-d71f6d2c7b69
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 65 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-b73d5682-f14a-466c-ae9d-d71f6d2c7b69
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
Location: /v1/credits/purchases/pur_92b4cb59-c404-4bf7-8cd0-7fe6c5d00a73
Content-Length: 144

{"id":"pur_92b4cb59-c404-4bf7-8cd0-7fe6c5d00a73","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-10-25T07:40:26.208923142Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f8b40f4c-e8c6-4a4b-bf22-cf0ca39a6478

--- request headers ---
Accept: application/json
Idempotency-Key: qa-201ef89c29ff4ced8d20627abbdefa42
X-Correlation-Id: qa-f8b40f4c-e8c6-4a4b-bf22-cf0ca39a6478
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 47 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8b40f4c-e8c6-4a4b-bf22-cf0ca39a6478
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
Location: /v1/credits/purchases/pur_c54d976c-3507-4924-af89-9a6c9c1befb6
Content-Length: 144

{"id":"pur_c54d976c-3507-4924-af89-9a6c9c1befb6","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-10-25T07:40:26.217779876Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-151ce4e5-5513-4c3a-837a-136db8af7366

--- request headers ---
Accept: application/json
Idempotency-Key: qa-dad8decc84f942bea35d5537b44bca30
X-Correlation-Id: qa-151ce4e5-5513-4c3a-837a-136db8af7366
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 77 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-151ce4e5-5513-4c3a-837a-136db8af7366
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
Location: /v1/credits/purchases/pur_6db28eae-ca31-4b40-a2bf-5413f2169da4
Content-Length: 144

{"id":"pur_6db28eae-ca31-4b40-a2bf-5413f2169da4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-25T07:40:26.204335411Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-91d412f5-fcdb-4c19-b855-c67bb863f3ce

--- request headers ---
Accept: application/json
Idempotency-Key: qa-db6747ac18bf46b88b32dfea26a4efed
X-Correlation-Id: qa-91d412f5-fcdb-4c19-b855-c67bb863f3ce
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 83 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-91d412f5-fcdb-4c19-b855-c67bb863f3ce
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
Location: /v1/credits/purchases/pur_1ebf4f42-cc92-4c32-a60e-c185c4aeec2d
Content-Length: 145

{"id":"pur_1ebf4f42-cc92-4c32-a60e-c185c4aeec2d","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-10-25T07:40:26.224594523Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d4ca5bd1-6755-403b-b788-2b5fe71103f2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-431b38dc59984470912c6db4c41a1062
X-Correlation-Id: qa-d4ca5bd1-6755-403b-b788-2b5fe71103f2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 72 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4ca5bd1-6755-403b-b788-2b5fe71103f2
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
Location: /v1/credits/purchases/pur_3a43fb15-dbc8-4395-b493-9a8c0c130fba
Content-Length: 144

{"id":"pur_3a43fb15-dbc8-4395-b493-9a8c0c130fba","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-10-25T07:40:26.221528347Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-7fde74d1-133e-44de-ac4c-a39360ba460b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fde74d1-133e-44de-ac4c-a39360ba460b
Content-Type: application/json

--- request body ---
{"handle":"qa-dc77b372efea","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fde74d1-133e-44de-ac4c-a39360ba460b
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b08035eb-ea8d-44ce-8cba-36eba51b8b8d"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-1692c05f-e01a-4896-b7a4-a12b98e0ec14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1692c05f-e01a-4896-b7a4-a12b98e0ec14
Content-Type: application/json

--- response: 200 in 72 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-1692c05f-e01a-4896-b7a4-a12b98e0ec14
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

{"items":[{"id":"led_8ec7fd38-32f3-4546-9970-a5f8d04c8ec5","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-25T07:40:25.353690062Z"},{"id":"led_628cd17f-3cfa-45fb-b7c1-9903e6feab56","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_6db28eae-ca31-4b40-a2bf-5413f2169da4","createdAt":"2026-10-25T07:40:26.204335411Z"},{"id":"led_ff597992-3b4f-486a-9056-15f46d1194d8","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_0c3b7faa-5f82-470a-b4e8-8df0f4102f2e","createdAt":"2026-10-25T07:40:26.204347257Z"},{"id":"led_6a0ca789-130d-4358-9fa1-e3cb3e71c2c2","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_648bc60e-06fc-4921-8cff-5f9239469912","createdAt":"2026-10-25T07:40:26.205716140Z"},{"id":"led_163490c2-6041-4ee2-84f6-35b15ab46ec7","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_5444815f-b35a-434d-951c-5a90d16ba732","createdAt":"2026-10-25T07:40:26.208085298Z"},{"id":"led_242907ac-3552-4590-872a-2cd67a989e21","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_92b4cb59-c404-4bf7-8cd0-7fe6c5d00a73","createdAt":"2026-10-25T07:40:26.208923142Z"},{"id":"led_ab2a7376-48c7-45d5-a941-e2f4de4d910a","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_71b456ef-141d-475c-90e4-a450a64942f3","createdAt":"2026-10-25T07:40:26.209668972Z"},{"id":"led_f8c4727f-8baf-4235-ae84-6a0b1e608b92","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_37440100-4229-43c3-ab31-863ebf2549a9","createdAt":"2026-10-25T07:40:26.209723528Z"},{"id":"led_4cf10b4e-f993-43ab-afd4-e8972c1995a3","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_c54d976c-3507-4924-af89-9a6c9c1befb6","createdAt":"2026-10-25T07:40:26.217779876Z"},{"id":"led_dafa375e-e061-4cd6-8387-be0a26031df6","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_3a43fb15-dbc8-4395-b493-9a8c0c130fba","createdAt":"2026-10-25T07:40:26.221528347Z"},{"id":"led_58024ca8-d4ed-4797-a124-14bc723fbefa","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_1ebf4f42-cc92-4c32-a60e-c185c4aeec2d","createdAt":"2026-10-25T07:40:26.224594523Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8f5b7c8c-abf9-4c34-ad24-de556d007bd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f5b7c8c-abf9-4c34-ad24-de556d007bd3
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8f5b7c8c-abf9-4c34-ad24-de556d007bd3
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
correlation: qa-951c21d8-3d7c-4f2c-9433-b568b0cbe6d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-951c21d8-3d7c-4f2c-9433-b568b0cbe6d0
Content-Type: application/json

--- request body ---
{"handle":"qa-dc77b372efea","password":"****"}

--- response: 401 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-951c21d8-3d7c-4f2c-9433-b568b0cbe6d0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-951c21d8-3d7c-4f2c-9433-b568b0cbe6d0"}
```
