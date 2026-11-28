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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-82267990-057c-4a58-911a-68474040760f` |
| 2 | `POST /v1/auth/token` | 200 | 50 | `qa-7f75d5eb-10f5-4b51-9073-884983b4a080` |
| 7 | `POST /v1/auth/token` | 200 | 32 | `qa-fbd03663-ca47-4997-af49-39449799f951` |
| 4 | `POST /v1/auth/token` | 200 | 44 | `qa-7cbcf887-849f-4727-aa89-d26184916e6c` |
| 3 | `POST /v1/auth/token` | 200 | 52 | `qa-fd1dc231-0828-4019-87ec-97274fe20d83` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-03ce851c-9f3e-44dc-9908-15019043940a` |
| 8 | `POST /v1/auth/token` | 200 | 42 | `qa-6f242f8b-5102-46d7-8009-a45a45e7417d` |
| 9 | `POST /v1/auth/token` | 200 | 45 | `qa-c2b2007e-3fe2-4d8b-b0a8-b1d910a61bb7` |
| 5 | `POST /v1/auth/token` | 200 | 55 | `qa-c501eacc-87d8-4445-be3d-2a93caa9ee19` |
| 11 | `POST /v1/auth/token` | 200 | 47 | `qa-8f473f35-f197-4196-9ccf-338b5c58321b` |
| 10 | `POST /v1/auth/token` | 200 | 59 | `qa-51ff0db3-c338-4bc4-8826-eadadf539f46` |
| 16 | `POST /v1/credits/purchases` | 201 | 42 | `qa-4160a694-aa7d-4a18-9879-213f877a24f8` |
| 18 | `POST /v1/credits/purchases` | 201 | 32 | `qa-c2d17458-8ded-4c19-b0ec-2e26930ff6b6` |
| 14 | `POST /v1/credits/purchases` | 201 | 52 | `qa-efaa271b-7e17-4d75-bf7e-265613b3c18a` |
| 13 | `POST /v1/credits/purchases` | 201 | 53 | `qa-42dc94b0-4962-4fa1-b557-e54cc1c21215` |
| 17 | `POST /v1/credits/purchases` | 201 | 36 | `qa-ac8b3a7c-9a66-43d0-b108-6d1f739005d8` |
| 15 | `POST /v1/credits/purchases` | 201 | 55 | `qa-ba888a9c-7d1a-4ab8-ab1b-6679def4e3b5` |
| 12 | `POST /v1/credits/purchases` | 201 | 53 | `qa-accb13e3-00ee-42e6-a0f6-75a398e4c4bd` |
| 19 | `POST /v1/credits/purchases` | 201 | 53 | `qa-0c276c51-d121-4bba-83a8-aa420e0ee9f9` |
| 20 | `POST /v1/credits/purchases` | 201 | 58 | `qa-1d12165f-63b8-4650-a19f-47e919e7c294` |
| 21 | `POST /v1/credits/purchases` | 201 | 60 | `qa-97c3fd63-3752-4cff-a737-ad91613aab54` |
| 22 | `POST /v1/auth/token` | 200 | 27 | `qa-ae8b6910-629b-4d22-934b-62870c0f8461` |
| 23 | `GET /v1/credits/ledger` | 200 | 42 | `qa-a64f3ed6-bbed-439c-b940-95ffb866e913` |
| 24 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-2163897b-e041-48e3-9ce3-4ce7401e412d` |
| 25 | `POST /v1/auth/token` | 401 | 15 | `qa-f2d45ebc-669f-423e-8084-974eaac7d6aa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-82267990-057c-4a58-911a-68474040760f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82267990-057c-4a58-911a-68474040760f
Content-Type: application/json

--- request body ---
{"handle":"qa-0e64ed896152","displayName":"QA 0e64ed896152","password":"****","region":"us"}

--- response: 201 in 29 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-82267990-057c-4a58-911a-68474040760f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-0e64ed896152
X-Served-Region: us
Content-Length: 181

{"id":"acc_6b4d0ddf-a1ba-44b7-a177-5078d764d6a5","handle":"qa-0e64ed896152","displayName":"QA 0e64ed896152","region":"us","role":"user","createdAt":"2026-11-24T12:38:10.206673650Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7f75d5eb-10f5-4b51-9073-884983b4a080

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f75d5eb-10f5-4b51-9073-884983b4a080
Content-Type: application/json

--- request body ---
{"handle":"qa-0e64ed896152","password":"****"}

--- response: 200 in 50 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f75d5eb-10f5-4b51-9073-884983b4a080
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4d0ddf-a1ba-44b7-a177-5078d764d6a5"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-fbd03663-ca47-4997-af49-39449799f951

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbd03663-ca47-4997-af49-39449799f951
Content-Type: application/json

--- request body ---
{"handle":"qa-0e64ed896152","password":"****"}

--- response: 200 in 32 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbd03663-ca47-4997-af49-39449799f951
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4d0ddf-a1ba-44b7-a177-5078d764d6a5"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-7cbcf887-849f-4727-aa89-d26184916e6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cbcf887-849f-4727-aa89-d26184916e6c
Content-Type: application/json

--- request body ---
{"handle":"qa-0e64ed896152","password":"****"}

--- response: 200 in 44 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cbcf887-849f-4727-aa89-d26184916e6c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4d0ddf-a1ba-44b7-a177-5078d764d6a5"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fd1dc231-0828-4019-87ec-97274fe20d83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd1dc231-0828-4019-87ec-97274fe20d83
Content-Type: application/json

--- request body ---
{"handle":"qa-0e64ed896152","password":"****"}

--- response: 200 in 52 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd1dc231-0828-4019-87ec-97274fe20d83
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4d0ddf-a1ba-44b7-a177-5078d764d6a5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-03ce851c-9f3e-44dc-9908-15019043940a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03ce851c-9f3e-44dc-9908-15019043940a
Content-Type: application/json

--- request body ---
{"handle":"qa-0e64ed896152","password":"****"}

--- response: 200 in 44 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-03ce851c-9f3e-44dc-9908-15019043940a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4d0ddf-a1ba-44b7-a177-5078d764d6a5"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-6f242f8b-5102-46d7-8009-a45a45e7417d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f242f8b-5102-46d7-8009-a45a45e7417d
Content-Type: application/json

--- request body ---
{"handle":"qa-0e64ed896152","password":"****"}

--- response: 200 in 42 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f242f8b-5102-46d7-8009-a45a45e7417d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4d0ddf-a1ba-44b7-a177-5078d764d6a5"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-c2b2007e-3fe2-4d8b-b0a8-b1d910a61bb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2b2007e-3fe2-4d8b-b0a8-b1d910a61bb7
Content-Type: application/json

--- request body ---
{"handle":"qa-0e64ed896152","password":"****"}

--- response: 200 in 45 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2b2007e-3fe2-4d8b-b0a8-b1d910a61bb7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4d0ddf-a1ba-44b7-a177-5078d764d6a5"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c501eacc-87d8-4445-be3d-2a93caa9ee19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c501eacc-87d8-4445-be3d-2a93caa9ee19
Content-Type: application/json

--- request body ---
{"handle":"qa-0e64ed896152","password":"****"}

--- response: 200 in 55 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c501eacc-87d8-4445-be3d-2a93caa9ee19
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4d0ddf-a1ba-44b7-a177-5078d764d6a5"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-8f473f35-f197-4196-9ccf-338b5c58321b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f473f35-f197-4196-9ccf-338b5c58321b
Content-Type: application/json

--- request body ---
{"handle":"qa-0e64ed896152","password":"****"}

--- response: 200 in 47 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f473f35-f197-4196-9ccf-338b5c58321b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4d0ddf-a1ba-44b7-a177-5078d764d6a5"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-51ff0db3-c338-4bc4-8826-eadadf539f46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51ff0db3-c338-4bc4-8826-eadadf539f46
Content-Type: application/json

--- request body ---
{"handle":"qa-0e64ed896152","password":"****"}

--- response: 200 in 59 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-51ff0db3-c338-4bc4-8826-eadadf539f46
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4d0ddf-a1ba-44b7-a177-5078d764d6a5"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4160a694-aa7d-4a18-9879-213f877a24f8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b6fbcbe27c33416ab6f35223b4dea067
X-Correlation-Id: qa-4160a694-aa7d-4a18-9879-213f877a24f8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 42 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4160a694-aa7d-4a18-9879-213f877a24f8
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
Location: /v1/credits/purchases/pur_e25314ff-5107-4035-b512-bf0c9232a22b
Content-Length: 144

{"id":"pur_e25314ff-5107-4035-b512-bf0c9232a22b","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-24T12:38:10.345397852Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c2d17458-8ded-4c19-b0ec-2e26930ff6b6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2448106544d34c53b02d95cd8fec409b
X-Correlation-Id: qa-c2d17458-8ded-4c19-b0ec-2e26930ff6b6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 32 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2d17458-8ded-4c19-b0ec-2e26930ff6b6
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
Location: /v1/credits/purchases/pur_02b11796-7086-4168-84d2-1912292f4f02
Content-Length: 144

{"id":"pur_02b11796-7086-4168-84d2-1912292f4f02","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-24T12:38:10.348053602Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-efaa271b-7e17-4d75-bf7e-265613b3c18a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-146e7db4c3f143d6a3c54bab8719e57d
X-Correlation-Id: qa-efaa271b-7e17-4d75-bf7e-265613b3c18a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 52 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-efaa271b-7e17-4d75-bf7e-265613b3c18a
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
Location: /v1/credits/purchases/pur_2d2765e2-429e-4fb8-a3f8-344075979df8
Content-Length: 144

{"id":"pur_2d2765e2-429e-4fb8-a3f8-344075979df8","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-24T12:38:10.339240605Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-42dc94b0-4962-4fa1-b557-e54cc1c21215

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3bd02bf05269401abeeb4dd86712e78c
X-Correlation-Id: qa-42dc94b0-4962-4fa1-b557-e54cc1c21215
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 53 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-42dc94b0-4962-4fa1-b557-e54cc1c21215
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
Location: /v1/credits/purchases/pur_4b3ac988-322b-4ef5-a16a-bf8a240e1624
Content-Length: 144

{"id":"pur_4b3ac988-322b-4ef5-a16a-bf8a240e1624","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-24T12:38:10.340180277Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ac8b3a7c-9a66-43d0-b108-6d1f739005d8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-76d679c71838424bb3b4e4bbef8c6d6a
X-Correlation-Id: qa-ac8b3a7c-9a66-43d0-b108-6d1f739005d8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 36 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac8b3a7c-9a66-43d0-b108-6d1f739005d8
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
Location: /v1/credits/purchases/pur_42268c4c-334a-4596-baa9-0deefc6543e6
Content-Length: 144

{"id":"pur_42268c4c-334a-4596-baa9-0deefc6543e6","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-24T12:38:10.346795891Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ba888a9c-7d1a-4ab8-ab1b-6679def4e3b5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f8796073dca24562b5ad6cdeb76e1b03
X-Correlation-Id: qa-ba888a9c-7d1a-4ab8-ab1b-6679def4e3b5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 55 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba888a9c-7d1a-4ab8-ab1b-6679def4e3b5
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
Location: /v1/credits/purchases/pur_8d4f81d6-0bfb-425c-b7ad-c2285c450fd0
Content-Length: 144

{"id":"pur_8d4f81d6-0bfb-425c-b7ad-c2285c450fd0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-24T12:38:10.338920396Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-accb13e3-00ee-42e6-a0f6-75a398e4c4bd

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3a2f25640f6040aeb93c7555e7229a55
X-Correlation-Id: qa-accb13e3-00ee-42e6-a0f6-75a398e4c4bd
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 53 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-accb13e3-00ee-42e6-a0f6-75a398e4c4bd
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
Location: /v1/credits/purchases/pur_f0276015-fc94-4d64-a9a1-da8124764c84
Content-Length: 144

{"id":"pur_f0276015-fc94-4d64-a9a1-da8124764c84","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-24T12:38:10.342958007Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0c276c51-d121-4bba-83a8-aa420e0ee9f9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-39e6590745914526921437d6bafd2640
X-Correlation-Id: qa-0c276c51-d121-4bba-83a8-aa420e0ee9f9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 53 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c276c51-d121-4bba-83a8-aa420e0ee9f9
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
Location: /v1/credits/purchases/pur_d6f3d723-2e95-49ed-a54c-f21117c66c0a
Content-Length: 144

{"id":"pur_d6f3d723-2e95-49ed-a54c-f21117c66c0a","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-24T12:38:10.374230529Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1d12165f-63b8-4650-a19f-47e919e7c294

--- request headers ---
Accept: application/json
Idempotency-Key: qa-459df1f7cfb74e34adcc46e4ab2e8513
X-Correlation-Id: qa-1d12165f-63b8-4650-a19f-47e919e7c294
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 58 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d12165f-63b8-4650-a19f-47e919e7c294
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
Location: /v1/credits/purchases/pur_6885fc37-20fb-47a5-bf01-6e23f88d3016
Content-Length: 144

{"id":"pur_6885fc37-20fb-47a5-bf01-6e23f88d3016","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-24T12:38:10.386577021Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-97c3fd63-3752-4cff-a737-ad91613aab54

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d8b2fb92390b427f9c59bfae3cd1967c
X-Correlation-Id: qa-97c3fd63-3752-4cff-a737-ad91613aab54
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 60 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-97c3fd63-3752-4cff-a737-ad91613aab54
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
Location: /v1/credits/purchases/pur_d8cbe618-6804-474a-8949-4820f96a0b0e
Content-Length: 145

{"id":"pur_d8cbe618-6804-474a-8949-4820f96a0b0e","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-24T12:38:10.400915873Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-ae8b6910-629b-4d22-934b-62870c0f8461

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae8b6910-629b-4d22-934b-62870c0f8461
Content-Type: application/json

--- request body ---
{"handle":"qa-0e64ed896152","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae8b6910-629b-4d22-934b-62870c0f8461
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4d0ddf-a1ba-44b7-a177-5078d764d6a5"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-a64f3ed6-bbed-439c-b940-95ffb866e913

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a64f3ed6-bbed-439c-b940-95ffb866e913
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a64f3ed6-bbed-439c-b940-95ffb866e913
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
Content-Length: 758

{"items":[{"id":"led_0f1f8dac-d0ea-4447-9b0a-f4944e775cec","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-24T12:38:10.206689560Z"},{"id":"led_e57a213f-46d0-4c6e-bfbe-f0f2f9efc433","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_8d4f81d6-0bfb-425c-b7ad-c2285c450fd0","createdAt":"2026-11-24T12:38:10.338920396Z"},{"id":"led_825d31f5-d4ae-47e0-8db9-18e5a9a5e0ee","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_2d2765e2-429e-4fb8-a3f8-344075979df8","createdAt":"2026-11-24T12:38:10.339240605Z"},{"id":"led_84964972-e858-4945-8118-0e6ebe1c94f6","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_4b3ac988-322b-4ef5-a16a-bf8a240e1624","createdAt":"2026-11-24T12:38:10.340180277Z"},{"id":"led_b528cb39-b541-48ea-8778-6468b22a438c","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_f0276015-fc94-4d64-a9a1-da8124764c84","createdAt":"2026-11-24T12:38:10.342958007Z"},{"id":"led_01e930bc-4450-451d-ac8e-13cde6944b11","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_e25314ff-5107-4035-b512-bf0c9232a22b","createdAt":"2026-11-24T12:38:10.345397852Z"},{"id":"led_e8fb2d5b-3e35-4edd-b754-569ef01a50e3","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_42268c4c-334a-4596-baa9-0deefc6543e6","createdAt":"2026-11-24T12:38:10.346795891Z"},{"id":"led_e13d5ec2-bf7d-4ba8-85f9-58dfb7257aa3","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_02b11796-7086-4168-84d2-1912292f4f02","createdAt":"2026-11-24T12:38:10.348053602Z"},{"id":"led_6192898a-9e91-439d-9426-cb246bca12d2","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_d6f3d723-2e95-49ed-a54c-f21117c66c0a","createdAt":"2026-11-24T12:38:10.374230529Z"},{"id":"led_bf85dc92-ac5b-4419-82f1-dba6a3e874e5","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_6885fc37-20fb-47a5-bf01-6e23f88d3016","createdAt":"2026-11-24T12:38:10.386577021Z"},{"id":"led_8e88d6cd-1d7f-46f0-ba7a-a731de00144d","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_d8cbe618-6804-474a-8949-4820f96a0b0e","createdAt":"2026-11-24T12:38:10.400915873Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2163897b-e041-48e3-9ce3-4ce7401e412d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2163897b-e041-48e3-9ce3-4ce7401e412d
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2163897b-e041-48e3-9ce3-4ce7401e412d
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
correlation: qa-f2d45ebc-669f-423e-8084-974eaac7d6aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2d45ebc-669f-423e-8084-974eaac7d6aa
Content-Type: application/json

--- request body ---
{"handle":"qa-0e64ed896152","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2d45ebc-669f-423e-8084-974eaac7d6aa
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2d45ebc-669f-423e-8084-974eaac7d6aa"}
```
