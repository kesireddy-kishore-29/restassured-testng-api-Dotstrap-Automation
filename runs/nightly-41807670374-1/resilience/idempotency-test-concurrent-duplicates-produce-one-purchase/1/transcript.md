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
| 1 | `POST /v1/accounts` | 201 | 341 | `qa-95097c0d-56ca-435a-8bf0-c18702a3ff88` |
| 4 | `POST /v1/auth/token` | 200 | 51 | `qa-3a2c67b4-2be0-4820-aea5-d9dfdbcbb6a5` |
| 7 | `POST /v1/auth/token` | 200 | 63 | `qa-48c35891-8701-419d-be7a-6bed63c35de8` |
| 6 | `POST /v1/auth/token` | 200 | 65 | `qa-e7a3af51-fb62-48b4-90cb-0070bc86d832` |
| 5 | `POST /v1/auth/token` | 200 | 67 | `qa-003905b0-a45e-401a-96f6-ba7bbb5b85e4` |
| 2 | `POST /v1/auth/token` | 200 | 72 | `qa-418fba7f-2241-497c-a847-59ed6bf212ea` |
| 3 | `POST /v1/auth/token` | 200 | 76 | `qa-8f427a97-425b-4a25-bca2-ace1887a2a76` |
| 9 | `POST /v1/credits/purchases` | 200 | 53 | `qa-3ae55fe1-0182-43b1-b14b-68ab26b8138c` |
| 12 | `POST /v1/credits/purchases` | 200 | 34 | `qa-f8ca26aa-f20c-4bd6-a891-ec3c8246e11e` |
| 8 | `POST /v1/credits/purchases` | 200 | 56 | `qa-53bbfd3d-777f-40d2-a3b7-198762fc5232` |
| 10 | `POST /v1/credits/purchases` | 200 | 49 | `qa-5a64cf2a-f9b1-427d-9eb4-015cc3d8d2a5` |
| 13 | `POST /v1/credits/purchases` | 201 | 29 | `qa-e8f5afd3-c3b6-45bd-b93d-42af6cd754f2` |
| 11 | `POST /v1/credits/purchases` | 200 | 45 | `qa-1ba46137-d922-453e-bc2d-ed1926c75ddd` |
| 14 | `POST /v1/auth/token` | 200 | 21 | `qa-bf1e092c-2441-409f-848d-3671ba29e07e` |
| 15 | `GET /v1/credits/balance` | 200 | 17 | `qa-b4f794b2-291b-4ed0-b576-c8e91d41cdc8` |
| 16 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-5138bf8e-8195-42db-bcf0-a745c2f95139` |
| 17 | `POST /v1/auth/token` | 401 | 7 | `qa-136b6af4-3a74-4620-8df8-cbfd46c7c32d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-95097c0d-56ca-435a-8bf0-c18702a3ff88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95097c0d-56ca-435a-8bf0-c18702a3ff88
Content-Type: application/json

--- request body ---
{"handle":"qa-a285d672819d","displayName":"QA a285d672819d","password":"****","region":"eu"}

--- response: 201 in 341 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-95097c0d-56ca-435a-8bf0-c18702a3ff88
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
Location: /v1/accounts/qa-a285d672819d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3ce931f0-a574-4fce-b480-6b85144fee96","handle":"qa-a285d672819d","displayName":"QA a285d672819d","region":"eu","role":"user","createdAt":"2026-11-04T09:28:14.217677534Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-3a2c67b4-2be0-4820-aea5-d9dfdbcbb6a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a2c67b4-2be0-4820-aea5-d9dfdbcbb6a5
Content-Type: application/json

--- request body ---
{"handle":"qa-a285d672819d","password":"****"}

--- response: 200 in 51 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a2c67b4-2be0-4820-aea5-d9dfdbcbb6a5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ce931f0-a574-4fce-b480-6b85144fee96"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-48c35891-8701-419d-be7a-6bed63c35de8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48c35891-8701-419d-be7a-6bed63c35de8
Content-Type: application/json

--- request body ---
{"handle":"qa-a285d672819d","password":"****"}

--- response: 200 in 63 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-48c35891-8701-419d-be7a-6bed63c35de8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ce931f0-a574-4fce-b480-6b85144fee96"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e7a3af51-fb62-48b4-90cb-0070bc86d832

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7a3af51-fb62-48b4-90cb-0070bc86d832
Content-Type: application/json

--- request body ---
{"handle":"qa-a285d672819d","password":"****"}

--- response: 200 in 65 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7a3af51-fb62-48b4-90cb-0070bc86d832
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ce931f0-a574-4fce-b480-6b85144fee96"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-003905b0-a45e-401a-96f6-ba7bbb5b85e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-003905b0-a45e-401a-96f6-ba7bbb5b85e4
Content-Type: application/json

--- request body ---
{"handle":"qa-a285d672819d","password":"****"}

--- response: 200 in 67 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-003905b0-a45e-401a-96f6-ba7bbb5b85e4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ce931f0-a574-4fce-b480-6b85144fee96"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-418fba7f-2241-497c-a847-59ed6bf212ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-418fba7f-2241-497c-a847-59ed6bf212ea
Content-Type: application/json

--- request body ---
{"handle":"qa-a285d672819d","password":"****"}

--- response: 200 in 72 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-418fba7f-2241-497c-a847-59ed6bf212ea
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ce931f0-a574-4fce-b480-6b85144fee96"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8f427a97-425b-4a25-bca2-ace1887a2a76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f427a97-425b-4a25-bca2-ace1887a2a76
Content-Type: application/json

--- request body ---
{"handle":"qa-a285d672819d","password":"****"}

--- response: 200 in 76 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f427a97-425b-4a25-bca2-ace1887a2a76
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ce931f0-a574-4fce-b480-6b85144fee96"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3ae55fe1-0182-43b1-b14b-68ab26b8138c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0c9092d75f664f98a5b58c7955a4e6e6
X-Correlation-Id: qa-3ae55fe1-0182-43b1-b14b-68ab26b8138c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 53 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ae55fe1-0182-43b1-b14b-68ab26b8138c
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
Location: /v1/credits/purchases/pur_da25c38d-7fbf-4eb0-9051-7c4f272e2c9c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_da25c38d-7fbf-4eb0-9051-7c4f272e2c9c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-04T09:28:14.780446645Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f8ca26aa-f20c-4bd6-a891-ec3c8246e11e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0c9092d75f664f98a5b58c7955a4e6e6
X-Correlation-Id: qa-f8ca26aa-f20c-4bd6-a891-ec3c8246e11e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 34 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8ca26aa-f20c-4bd6-a891-ec3c8246e11e
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
Location: /v1/credits/purchases/pur_da25c38d-7fbf-4eb0-9051-7c4f272e2c9c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_da25c38d-7fbf-4eb0-9051-7c4f272e2c9c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-04T09:28:14.780446645Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-53bbfd3d-777f-40d2-a3b7-198762fc5232

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0c9092d75f664f98a5b58c7955a4e6e6
X-Correlation-Id: qa-53bbfd3d-777f-40d2-a3b7-198762fc5232
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 56 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-53bbfd3d-777f-40d2-a3b7-198762fc5232
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
Location: /v1/credits/purchases/pur_da25c38d-7fbf-4eb0-9051-7c4f272e2c9c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_da25c38d-7fbf-4eb0-9051-7c4f272e2c9c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-04T09:28:14.780446645Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5a64cf2a-f9b1-427d-9eb4-015cc3d8d2a5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0c9092d75f664f98a5b58c7955a4e6e6
X-Correlation-Id: qa-5a64cf2a-f9b1-427d-9eb4-015cc3d8d2a5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 49 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a64cf2a-f9b1-427d-9eb4-015cc3d8d2a5
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
Location: /v1/credits/purchases/pur_da25c38d-7fbf-4eb0-9051-7c4f272e2c9c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_da25c38d-7fbf-4eb0-9051-7c4f272e2c9c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-04T09:28:14.780446645Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e8f5afd3-c3b6-45bd-b93d-42af6cd754f2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0c9092d75f664f98a5b58c7955a4e6e6
X-Correlation-Id: qa-e8f5afd3-c3b6-45bd-b93d-42af6cd754f2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 29 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8f5afd3-c3b6-45bd-b93d-42af6cd754f2
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
Location: /v1/credits/purchases/pur_da25c38d-7fbf-4eb0-9051-7c4f272e2c9c
Content-Length: 144

{"id":"pur_da25c38d-7fbf-4eb0-9051-7c4f272e2c9c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-04T09:28:14.780446645Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1ba46137-d922-453e-bc2d-ed1926c75ddd

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0c9092d75f664f98a5b58c7955a4e6e6
X-Correlation-Id: qa-1ba46137-d922-453e-bc2d-ed1926c75ddd
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 45 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ba46137-d922-453e-bc2d-ed1926c75ddd
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
Location: /v1/credits/purchases/pur_da25c38d-7fbf-4eb0-9051-7c4f272e2c9c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_da25c38d-7fbf-4eb0-9051-7c4f272e2c9c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-04T09:28:14.780446645Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-bf1e092c-2441-409f-848d-3671ba29e07e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf1e092c-2441-409f-848d-3671ba29e07e
Content-Type: application/json

--- request body ---
{"handle":"qa-a285d672819d","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf1e092c-2441-409f-848d-3671ba29e07e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ce931f0-a574-4fce-b480-6b85144fee96"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-b4f794b2-291b-4ed0-b576-c8e91d41cdc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4f794b2-291b-4ed0-b576-c8e91d41cdc8
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4f794b2-291b-4ed0-b576-c8e91d41cdc8
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

{"balance":15,"currency":"credits","accountId":"acc_3ce931f0-a574-4fce-b480-6b85144fee96"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5138bf8e-8195-42db-bcf0-a745c2f95139

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5138bf8e-8195-42db-bcf0-a745c2f95139
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5138bf8e-8195-42db-bcf0-a745c2f95139
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
correlation: qa-136b6af4-3a74-4620-8df8-cbfd46c7c32d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-136b6af4-3a74-4620-8df8-cbfd46c7c32d
Content-Type: application/json

--- request body ---
{"handle":"qa-a285d672819d","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-136b6af4-3a74-4620-8df8-cbfd46c7c32d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-136b6af4-3a74-4620-8df8-cbfd46c7c32d"}
```
