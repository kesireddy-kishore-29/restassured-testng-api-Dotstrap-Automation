# Transcript: Six concurrent duplicates: one purchase, five replays, one charge

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#concurrentDuplicatesProduceOnePurchase` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 17 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 376 | `qa-44cc4efb-e945-447d-9d8d-cdb2e282112c` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-1a5a6455-8b4f-4fca-a4d5-3a9354d65b84` |
| 4 | `POST /v1/auth/token` | 200 | 54 | `qa-811b9c83-ffd6-4062-a140-67cbfb9e5694` |
| 6 | `POST /v1/auth/token` | 200 | 58 | `qa-6238f272-dc5e-4f39-b31f-bb99936a2e4c` |
| 5 | `POST /v1/auth/token` | 200 | 55 | `qa-138e7991-9a11-42d9-87a1-5b8da2d188ca` |
| 2 | `POST /v1/auth/token` | 200 | 68 | `qa-1f80968a-84a2-4981-98cd-9b791277c2ae` |
| 7 | `POST /v1/auth/token` | 200 | 51 | `qa-caa1db6d-0f2b-44a3-bcb1-fe6cf246a349` |
| 10 | `POST /v1/credits/purchases` | 200 | 60 | `qa-b18b6954-68b8-4288-a969-2f59792df1d2` |
| 11 | `POST /v1/credits/purchases` | 200 | 56 | `qa-02afd430-db79-4a7d-b667-3f4be07be7ba` |
| 12 | `POST /v1/credits/purchases` | 200 | 51 | `qa-153a74c3-1f90-49d1-a83f-e062d6237704` |
| 13 | `POST /v1/credits/purchases` | 200 | 47 | `qa-b9f748e1-18ee-4de5-aa64-3e6cce8e1546` |
| 8 | `POST /v1/credits/purchases` | 200 | 77 | `qa-17df13fa-614c-4858-be29-caa700f71fcc` |
| 9 | `POST /v1/credits/purchases` | 201 | 78 | `qa-bf3b75ad-6c2e-4421-b055-4e79eabae7d1` |
| 14 | `POST /v1/auth/token` | 200 | 22 | `qa-fb43aa39-e5dc-4a9f-96aa-0a20f112b9c7` |
| 15 | `GET /v1/credits/balance` | 200 | 17 | `qa-5af10aad-9c62-4235-a243-3cda8ad43c20` |
| 16 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-6d150279-223c-4f65-9bf4-a9a538e211d2` |
| 17 | `POST /v1/auth/token` | 401 | 11 | `qa-6acdde02-9e21-46c7-a1dc-00e570927d56` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-44cc4efb-e945-447d-9d8d-cdb2e282112c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44cc4efb-e945-447d-9d8d-cdb2e282112c
Content-Type: application/json

--- request body ---
{"handle":"qa-4ede6db52122","displayName":"QA 4ede6db52122","password":"****","region":"eu"}

--- response: 201 in 376 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-44cc4efb-e945-447d-9d8d-cdb2e282112c
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
Location: /v1/accounts/qa-4ede6db52122
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cab3876b-8839-4f4c-9c09-f54c62eb0120","handle":"qa-4ede6db52122","displayName":"QA 4ede6db52122","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.459863089Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1a5a6455-8b4f-4fca-a4d5-3a9354d65b84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a5a6455-8b4f-4fca-a4d5-3a9354d65b84
Content-Type: application/json

--- request body ---
{"handle":"qa-4ede6db52122","password":"****"}

--- response: 200 in 50 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a5a6455-8b4f-4fca-a4d5-3a9354d65b84
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cab3876b-8839-4f4c-9c09-f54c62eb0120"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-811b9c83-ffd6-4062-a140-67cbfb9e5694

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-811b9c83-ffd6-4062-a140-67cbfb9e5694
Content-Type: application/json

--- request body ---
{"handle":"qa-4ede6db52122","password":"****"}

--- response: 200 in 54 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-811b9c83-ffd6-4062-a140-67cbfb9e5694
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cab3876b-8839-4f4c-9c09-f54c62eb0120"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6238f272-dc5e-4f39-b31f-bb99936a2e4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6238f272-dc5e-4f39-b31f-bb99936a2e4c
Content-Type: application/json

--- request body ---
{"handle":"qa-4ede6db52122","password":"****"}

--- response: 200 in 58 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-6238f272-dc5e-4f39-b31f-bb99936a2e4c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cab3876b-8839-4f4c-9c09-f54c62eb0120"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-138e7991-9a11-42d9-87a1-5b8da2d188ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-138e7991-9a11-42d9-87a1-5b8da2d188ca
Content-Type: application/json

--- request body ---
{"handle":"qa-4ede6db52122","password":"****"}

--- response: 200 in 55 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-138e7991-9a11-42d9-87a1-5b8da2d188ca
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cab3876b-8839-4f4c-9c09-f54c62eb0120"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1f80968a-84a2-4981-98cd-9b791277c2ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f80968a-84a2-4981-98cd-9b791277c2ae
Content-Type: application/json

--- request body ---
{"handle":"qa-4ede6db52122","password":"****"}

--- response: 200 in 68 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f80968a-84a2-4981-98cd-9b791277c2ae
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cab3876b-8839-4f4c-9c09-f54c62eb0120"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-caa1db6d-0f2b-44a3-bcb1-fe6cf246a349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caa1db6d-0f2b-44a3-bcb1-fe6cf246a349
Content-Type: application/json

--- request body ---
{"handle":"qa-4ede6db52122","password":"****"}

--- response: 200 in 51 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-caa1db6d-0f2b-44a3-bcb1-fe6cf246a349
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cab3876b-8839-4f4c-9c09-f54c62eb0120"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b18b6954-68b8-4288-a969-2f59792df1d2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8718d79e75e0422496b92d9fd59f3f68
X-Correlation-Id: qa-b18b6954-68b8-4288-a969-2f59792df1d2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 60 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-b18b6954-68b8-4288-a969-2f59792df1d2
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
X-Served-Region: eu
Location: /v1/credits/purchases/pur_89e38068-0aa3-4c3d-a467-3403a3e0908a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_89e38068-0aa3-4c3d-a467-3403a3e0908a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-13T09:42:09.007558229Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-02afd430-db79-4a7d-b667-3f4be07be7ba

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8718d79e75e0422496b92d9fd59f3f68
X-Correlation-Id: qa-02afd430-db79-4a7d-b667-3f4be07be7ba
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 56 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-02afd430-db79-4a7d-b667-3f4be07be7ba
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
X-Served-Region: eu
Location: /v1/credits/purchases/pur_89e38068-0aa3-4c3d-a467-3403a3e0908a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_89e38068-0aa3-4c3d-a467-3403a3e0908a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-13T09:42:09.007558229Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-153a74c3-1f90-49d1-a83f-e062d6237704

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8718d79e75e0422496b92d9fd59f3f68
X-Correlation-Id: qa-153a74c3-1f90-49d1-a83f-e062d6237704
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 51 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-153a74c3-1f90-49d1-a83f-e062d6237704
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
X-Served-Region: eu
Location: /v1/credits/purchases/pur_89e38068-0aa3-4c3d-a467-3403a3e0908a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_89e38068-0aa3-4c3d-a467-3403a3e0908a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-13T09:42:09.007558229Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b9f748e1-18ee-4de5-aa64-3e6cce8e1546

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8718d79e75e0422496b92d9fd59f3f68
X-Correlation-Id: qa-b9f748e1-18ee-4de5-aa64-3e6cce8e1546
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 47 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9f748e1-18ee-4de5-aa64-3e6cce8e1546
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
X-Served-Region: eu
Location: /v1/credits/purchases/pur_89e38068-0aa3-4c3d-a467-3403a3e0908a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_89e38068-0aa3-4c3d-a467-3403a3e0908a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-13T09:42:09.007558229Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-17df13fa-614c-4858-be29-caa700f71fcc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8718d79e75e0422496b92d9fd59f3f68
X-Correlation-Id: qa-17df13fa-614c-4858-be29-caa700f71fcc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 77 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-17df13fa-614c-4858-be29-caa700f71fcc
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
X-Served-Region: eu
Location: /v1/credits/purchases/pur_89e38068-0aa3-4c3d-a467-3403a3e0908a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_89e38068-0aa3-4c3d-a467-3403a3e0908a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-13T09:42:09.007558229Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bf3b75ad-6c2e-4421-b055-4e79eabae7d1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8718d79e75e0422496b92d9fd59f3f68
X-Correlation-Id: qa-bf3b75ad-6c2e-4421-b055-4e79eabae7d1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 78 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf3b75ad-6c2e-4421-b055-4e79eabae7d1
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
X-Served-Region: eu
Location: /v1/credits/purchases/pur_89e38068-0aa3-4c3d-a467-3403a3e0908a
Content-Length: 144

{"id":"pur_89e38068-0aa3-4c3d-a467-3403a3e0908a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-13T09:42:09.007558229Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-fb43aa39-e5dc-4a9f-96aa-0a20f112b9c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb43aa39-e5dc-4a9f-96aa-0a20f112b9c7
Content-Type: application/json

--- request body ---
{"handle":"qa-4ede6db52122","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb43aa39-e5dc-4a9f-96aa-0a20f112b9c7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cab3876b-8839-4f4c-9c09-f54c62eb0120"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-5af10aad-9c62-4235-a243-3cda8ad43c20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5af10aad-9c62-4235-a243-3cda8ad43c20
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-5af10aad-9c62-4235-a243-3cda8ad43c20
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
X-Served-Region: eu
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_cab3876b-8839-4f4c-9c09-f54c62eb0120"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d150279-223c-4f65-9bf4-a9a538e211d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d150279-223c-4f65-9bf4-a9a538e211d2
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d150279-223c-4f65-9bf4-a9a538e211d2
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
X-Served-Region: eu
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-6acdde02-9e21-46c7-a1dc-00e570927d56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6acdde02-9e21-46c7-a1dc-00e570927d56
Content-Type: application/json

--- request body ---
{"handle":"qa-4ede6db52122","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6acdde02-9e21-46c7-a1dc-00e570927d56
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6acdde02-9e21-46c7-a1dc-00e570927d56"}
```
