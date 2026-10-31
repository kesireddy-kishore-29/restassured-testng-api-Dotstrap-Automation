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
| 1 | `POST /v1/accounts` | 201 | 298 | `qa-8f040b8a-14e7-4e5b-844c-117385c503cd` |
| 2 | `POST /v1/auth/token` | 200 | 64 | `qa-4ca28c73-a14f-451a-a8c4-bc2962180565` |
| 6 | `POST /v1/auth/token` | 200 | 64 | `qa-d423506d-4b51-4869-b179-85148eae31e0` |
| 7 | `POST /v1/auth/token` | 200 | 60 | `qa-8de5e323-713a-466c-ac66-509e7848d42b` |
| 4 | `POST /v1/auth/token` | 200 | 68 | `qa-e8cef8c2-fa4a-4b7b-8ebc-124ea2e77c21` |
| 5 | `POST /v1/auth/token` | 200 | 70 | `qa-236d3ba0-d1e1-4c1a-83c0-c2f8e996a9c3` |
| 3 | `POST /v1/auth/token` | 200 | 75 | `qa-ff37cb08-c603-4ec5-bdf9-369395283be3` |
| 10 | `POST /v1/credits/purchases` | 200 | 46 | `qa-0209a966-d238-4c68-a130-37ff4e7abb31` |
| 13 | `POST /v1/credits/purchases` | 200 | 40 | `qa-6583216b-658d-4eff-bd1f-5b2eb55b38a4` |
| 12 | `POST /v1/credits/purchases` | 200 | 41 | `qa-078e3cad-ac57-45e1-9685-ccd67b798815` |
| 8 | `POST /v1/credits/purchases` | 200 | 65 | `qa-f43299dd-0da8-4ab8-a311-c8bcb96155a8` |
| 9 | `POST /v1/credits/purchases` | 201 | 54 | `qa-0a337e54-41af-4390-a7c0-9e57a033f338` |
| 11 | `POST /v1/credits/purchases` | 200 | 46 | `qa-22f90cd0-1337-4672-97d3-68c6002155c1` |
| 14 | `POST /v1/auth/token` | 200 | 7 | `qa-66f702e4-a9a6-4d23-b4c9-12c9c0ec7501` |
| 15 | `GET /v1/credits/balance` | 200 | 6 | `qa-865e20f2-0ac1-4fa2-82f6-9f5f234f17a1` |
| 16 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-dc4b6c02-4e98-4500-a936-02ffc6a9b8d5` |
| 17 | `POST /v1/auth/token` | 401 | 5 | `qa-c70e3903-1e72-4a9b-ae76-ad82210d48c9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8f040b8a-14e7-4e5b-844c-117385c503cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f040b8a-14e7-4e5b-844c-117385c503cd
Content-Type: application/json

--- request body ---
{"handle":"qa-b6909974392a","displayName":"QA b6909974392a","password":"****","region":"eu"}

--- response: 201 in 298 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f040b8a-14e7-4e5b-844c-117385c503cd
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
Location: /v1/accounts/qa-b6909974392a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1828ae0f-5402-4768-87fc-9fb7498d7d6f","handle":"qa-b6909974392a","displayName":"QA b6909974392a","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.264733258Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4ca28c73-a14f-451a-a8c4-bc2962180565

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ca28c73-a14f-451a-a8c4-bc2962180565
Content-Type: application/json

--- request body ---
{"handle":"qa-b6909974392a","password":"****"}

--- response: 200 in 64 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ca28c73-a14f-451a-a8c4-bc2962180565
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1828ae0f-5402-4768-87fc-9fb7498d7d6f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d423506d-4b51-4869-b179-85148eae31e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d423506d-4b51-4869-b179-85148eae31e0
Content-Type: application/json

--- request body ---
{"handle":"qa-b6909974392a","password":"****"}

--- response: 200 in 64 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d423506d-4b51-4869-b179-85148eae31e0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1828ae0f-5402-4768-87fc-9fb7498d7d6f"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-8de5e323-713a-466c-ac66-509e7848d42b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8de5e323-713a-466c-ac66-509e7848d42b
Content-Type: application/json

--- request body ---
{"handle":"qa-b6909974392a","password":"****"}

--- response: 200 in 60 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-8de5e323-713a-466c-ac66-509e7848d42b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1828ae0f-5402-4768-87fc-9fb7498d7d6f"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e8cef8c2-fa4a-4b7b-8ebc-124ea2e77c21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8cef8c2-fa4a-4b7b-8ebc-124ea2e77c21
Content-Type: application/json

--- request body ---
{"handle":"qa-b6909974392a","password":"****"}

--- response: 200 in 68 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8cef8c2-fa4a-4b7b-8ebc-124ea2e77c21
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1828ae0f-5402-4768-87fc-9fb7498d7d6f"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-236d3ba0-d1e1-4c1a-83c0-c2f8e996a9c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-236d3ba0-d1e1-4c1a-83c0-c2f8e996a9c3
Content-Type: application/json

--- request body ---
{"handle":"qa-b6909974392a","password":"****"}

--- response: 200 in 70 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-236d3ba0-d1e1-4c1a-83c0-c2f8e996a9c3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1828ae0f-5402-4768-87fc-9fb7498d7d6f"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ff37cb08-c603-4ec5-bdf9-369395283be3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff37cb08-c603-4ec5-bdf9-369395283be3
Content-Type: application/json

--- request body ---
{"handle":"qa-b6909974392a","password":"****"}

--- response: 200 in 75 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff37cb08-c603-4ec5-bdf9-369395283be3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1828ae0f-5402-4768-87fc-9fb7498d7d6f"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0209a966-d238-4c68-a130-37ff4e7abb31

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ba8f939c02ae4e9d89d57f8fa13848aa
X-Correlation-Id: qa-0209a966-d238-4c68-a130-37ff4e7abb31
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 46 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-0209a966-d238-4c68-a130-37ff4e7abb31
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
Location: /v1/credits/purchases/pur_3ffc24b2-62ca-4a44-a477-25748b03fe93
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3ffc24b2-62ca-4a44-a477-25748b03fe93","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-28T08:42:51.761583611Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6583216b-658d-4eff-bd1f-5b2eb55b38a4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ba8f939c02ae4e9d89d57f8fa13848aa
X-Correlation-Id: qa-6583216b-658d-4eff-bd1f-5b2eb55b38a4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 40 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-6583216b-658d-4eff-bd1f-5b2eb55b38a4
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
Location: /v1/credits/purchases/pur_3ffc24b2-62ca-4a44-a477-25748b03fe93
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3ffc24b2-62ca-4a44-a477-25748b03fe93","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-28T08:42:51.761583611Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-078e3cad-ac57-45e1-9685-ccd67b798815

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ba8f939c02ae4e9d89d57f8fa13848aa
X-Correlation-Id: qa-078e3cad-ac57-45e1-9685-ccd67b798815
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 41 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-078e3cad-ac57-45e1-9685-ccd67b798815
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
Location: /v1/credits/purchases/pur_3ffc24b2-62ca-4a44-a477-25748b03fe93
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3ffc24b2-62ca-4a44-a477-25748b03fe93","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-28T08:42:51.761583611Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f43299dd-0da8-4ab8-a311-c8bcb96155a8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ba8f939c02ae4e9d89d57f8fa13848aa
X-Correlation-Id: qa-f43299dd-0da8-4ab8-a311-c8bcb96155a8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 65 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-f43299dd-0da8-4ab8-a311-c8bcb96155a8
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
Location: /v1/credits/purchases/pur_3ffc24b2-62ca-4a44-a477-25748b03fe93
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3ffc24b2-62ca-4a44-a477-25748b03fe93","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-28T08:42:51.761583611Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0a337e54-41af-4390-a7c0-9e57a033f338

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ba8f939c02ae4e9d89d57f8fa13848aa
X-Correlation-Id: qa-0a337e54-41af-4390-a7c0-9e57a033f338
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 54 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a337e54-41af-4390-a7c0-9e57a033f338
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
Location: /v1/credits/purchases/pur_3ffc24b2-62ca-4a44-a477-25748b03fe93
Content-Length: 144

{"id":"pur_3ffc24b2-62ca-4a44-a477-25748b03fe93","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-28T08:42:51.761583611Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-22f90cd0-1337-4672-97d3-68c6002155c1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ba8f939c02ae4e9d89d57f8fa13848aa
X-Correlation-Id: qa-22f90cd0-1337-4672-97d3-68c6002155c1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 46 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-22f90cd0-1337-4672-97d3-68c6002155c1
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
Location: /v1/credits/purchases/pur_3ffc24b2-62ca-4a44-a477-25748b03fe93
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3ffc24b2-62ca-4a44-a477-25748b03fe93","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-28T08:42:51.761583611Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-66f702e4-a9a6-4d23-b4c9-12c9c0ec7501

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66f702e4-a9a6-4d23-b4c9-12c9c0ec7501
Content-Type: application/json

--- request body ---
{"handle":"qa-b6909974392a","password":"****"}

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-66f702e4-a9a6-4d23-b4c9-12c9c0ec7501
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1828ae0f-5402-4768-87fc-9fb7498d7d6f"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-865e20f2-0ac1-4fa2-82f6-9f5f234f17a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-865e20f2-0ac1-4fa2-82f6-9f5f234f17a1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-865e20f2-0ac1-4fa2-82f6-9f5f234f17a1
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

{"balance":15,"currency":"credits","accountId":"acc_1828ae0f-5402-4768-87fc-9fb7498d7d6f"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc4b6c02-4e98-4500-a936-02ffc6a9b8d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc4b6c02-4e98-4500-a936-02ffc6a9b8d5
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc4b6c02-4e98-4500-a936-02ffc6a9b8d5
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
correlation: qa-c70e3903-1e72-4a9b-ae76-ad82210d48c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c70e3903-1e72-4a9b-ae76-ad82210d48c9
Content-Type: application/json

--- request body ---
{"handle":"qa-b6909974392a","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c70e3903-1e72-4a9b-ae76-ad82210d48c9
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c70e3903-1e72-4a9b-ae76-ad82210d48c9"}
```
