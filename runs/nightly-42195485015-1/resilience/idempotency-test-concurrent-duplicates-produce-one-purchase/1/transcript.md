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
| 1 | `POST /v1/accounts` | 201 | 459 | `qa-9139d25e-883d-4ca8-93bf-7ffe916effd9` |
| 7 | `POST /v1/auth/token` | 200 | 32 | `qa-e210f86b-aff1-4371-972d-9b95e8a6a579` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-cef76814-fe85-46f0-9b8b-9324fcb37419` |
| 2 | `POST /v1/auth/token` | 200 | 76 | `qa-887a7400-2699-4fef-bb71-4041b3fac7d5` |
| 4 | `POST /v1/auth/token` | 200 | 70 | `qa-0d4a8381-6374-48b0-a9f3-76c19ef079d6` |
| 5 | `POST /v1/auth/token` | 200 | 69 | `qa-bada79e7-4177-41f2-9f99-36d01c8ff3f6` |
| 3 | `POST /v1/auth/token` | 200 | 90 | `qa-bacc6fb0-579b-4f8d-8bb3-8dc0396677c2` |
| 12 | `POST /v1/credits/purchases` | 200 | 51 | `qa-93618531-943c-42cf-9590-b7bf7492c734` |
| 9 | `POST /v1/credits/purchases` | 200 | 61 | `qa-1b221055-724d-4fd7-a007-2e64b3b7d925` |
| 8 | `POST /v1/credits/purchases` | 200 | 65 | `qa-ef9181f9-455e-4590-bcfb-0c452db75f76` |
| 13 | `POST /v1/credits/purchases` | 200 | 54 | `qa-0e5a88b5-090a-46a2-a1b4-da583432e070` |
| 11 | `POST /v1/credits/purchases` | 200 | 59 | `qa-eeb9682c-4850-480b-ad65-860f97826991` |
| 10 | `POST /v1/credits/purchases` | 201 | 67 | `qa-d5e779e0-3596-4c8d-a05a-724c3cc2f768` |
| 14 | `POST /v1/auth/token` | 200 | 34 | `qa-f3466424-0e3c-4afe-8617-146d6bbef22f` |
| 15 | `GET /v1/credits/balance` | 200 | 16 | `qa-b64f5464-1390-4dcf-9312-315c06b082e4` |
| 16 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-387d3dcf-8337-4f3f-937a-fb1b9199e5a6` |
| 17 | `POST /v1/auth/token` | 401 | 16 | `qa-552a4a92-f283-4a7e-bcbf-349b3da4cdc7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9139d25e-883d-4ca8-93bf-7ffe916effd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9139d25e-883d-4ca8-93bf-7ffe916effd9
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ddf5d40e68","displayName":"QA b7ddf5d40e68","password":"****","region":"eu"}

--- response: 201 in 459 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-9139d25e-883d-4ca8-93bf-7ffe916effd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-b7ddf5d40e68
X-Served-Region: eu
Content-Length: 181

{"id":"acc_93b189ed-3879-4407-9a13-31938e3ab7e8","handle":"qa-b7ddf5d40e68","displayName":"QA b7ddf5d40e68","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.023489949Z"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-e210f86b-aff1-4371-972d-9b95e8a6a579

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e210f86b-aff1-4371-972d-9b95e8a6a579
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ddf5d40e68","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e210f86b-aff1-4371-972d-9b95e8a6a579
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_93b189ed-3879-4407-9a13-31938e3ab7e8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cef76814-fe85-46f0-9b8b-9324fcb37419

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cef76814-fe85-46f0-9b8b-9324fcb37419
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ddf5d40e68","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-cef76814-fe85-46f0-9b8b-9324fcb37419
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_93b189ed-3879-4407-9a13-31938e3ab7e8"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-887a7400-2699-4fef-bb71-4041b3fac7d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-887a7400-2699-4fef-bb71-4041b3fac7d5
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ddf5d40e68","password":"****"}

--- response: 200 in 76 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-887a7400-2699-4fef-bb71-4041b3fac7d5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_93b189ed-3879-4407-9a13-31938e3ab7e8"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0d4a8381-6374-48b0-a9f3-76c19ef079d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d4a8381-6374-48b0-a9f3-76c19ef079d6
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ddf5d40e68","password":"****"}

--- response: 200 in 70 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d4a8381-6374-48b0-a9f3-76c19ef079d6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_93b189ed-3879-4407-9a13-31938e3ab7e8"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-bada79e7-4177-41f2-9f99-36d01c8ff3f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bada79e7-4177-41f2-9f99-36d01c8ff3f6
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ddf5d40e68","password":"****"}

--- response: 200 in 69 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-bada79e7-4177-41f2-9f99-36d01c8ff3f6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_93b189ed-3879-4407-9a13-31938e3ab7e8"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bacc6fb0-579b-4f8d-8bb3-8dc0396677c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bacc6fb0-579b-4f8d-8bb3-8dc0396677c2
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ddf5d40e68","password":"****"}

--- response: 200 in 90 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-bacc6fb0-579b-4f8d-8bb3-8dc0396677c2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_93b189ed-3879-4407-9a13-31938e3ab7e8"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-93618531-943c-42cf-9590-b7bf7492c734

--- request headers ---
Accept: application/json
Idempotency-Key: qa-19f9bd6900b54523b87c5c904f244851
X-Correlation-Id: qa-93618531-943c-42cf-9590-b7bf7492c734
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 51 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-93618531-943c-42cf-9590-b7bf7492c734
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
Location: /v1/credits/purchases/pur_011ed1a3-d381-4fcc-8baa-e266b0db89f6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_011ed1a3-d381-4fcc-8baa-e266b0db89f6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-06T09:30:31.651178007Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1b221055-724d-4fd7-a007-2e64b3b7d925

--- request headers ---
Accept: application/json
Idempotency-Key: qa-19f9bd6900b54523b87c5c904f244851
X-Correlation-Id: qa-1b221055-724d-4fd7-a007-2e64b3b7d925
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 61 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b221055-724d-4fd7-a007-2e64b3b7d925
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
Location: /v1/credits/purchases/pur_011ed1a3-d381-4fcc-8baa-e266b0db89f6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_011ed1a3-d381-4fcc-8baa-e266b0db89f6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-06T09:30:31.651178007Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ef9181f9-455e-4590-bcfb-0c452db75f76

--- request headers ---
Accept: application/json
Idempotency-Key: qa-19f9bd6900b54523b87c5c904f244851
X-Correlation-Id: qa-ef9181f9-455e-4590-bcfb-0c452db75f76
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 65 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef9181f9-455e-4590-bcfb-0c452db75f76
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
Location: /v1/credits/purchases/pur_011ed1a3-d381-4fcc-8baa-e266b0db89f6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_011ed1a3-d381-4fcc-8baa-e266b0db89f6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-06T09:30:31.651178007Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0e5a88b5-090a-46a2-a1b4-da583432e070

--- request headers ---
Accept: application/json
Idempotency-Key: qa-19f9bd6900b54523b87c5c904f244851
X-Correlation-Id: qa-0e5a88b5-090a-46a2-a1b4-da583432e070
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 54 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e5a88b5-090a-46a2-a1b4-da583432e070
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
Location: /v1/credits/purchases/pur_011ed1a3-d381-4fcc-8baa-e266b0db89f6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_011ed1a3-d381-4fcc-8baa-e266b0db89f6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-06T09:30:31.651178007Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-eeb9682c-4850-480b-ad65-860f97826991

--- request headers ---
Accept: application/json
Idempotency-Key: qa-19f9bd6900b54523b87c5c904f244851
X-Correlation-Id: qa-eeb9682c-4850-480b-ad65-860f97826991
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 59 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-eeb9682c-4850-480b-ad65-860f97826991
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
Location: /v1/credits/purchases/pur_011ed1a3-d381-4fcc-8baa-e266b0db89f6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_011ed1a3-d381-4fcc-8baa-e266b0db89f6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-06T09:30:31.651178007Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d5e779e0-3596-4c8d-a05a-724c3cc2f768

--- request headers ---
Accept: application/json
Idempotency-Key: qa-19f9bd6900b54523b87c5c904f244851
X-Correlation-Id: qa-d5e779e0-3596-4c8d-a05a-724c3cc2f768
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 67 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5e779e0-3596-4c8d-a05a-724c3cc2f768
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
Location: /v1/credits/purchases/pur_011ed1a3-d381-4fcc-8baa-e266b0db89f6
Content-Length: 144

{"id":"pur_011ed1a3-d381-4fcc-8baa-e266b0db89f6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-06T09:30:31.651178007Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-f3466424-0e3c-4afe-8617-146d6bbef22f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3466424-0e3c-4afe-8617-146d6bbef22f
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ddf5d40e68","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3466424-0e3c-4afe-8617-146d6bbef22f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_93b189ed-3879-4407-9a13-31938e3ab7e8"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-b64f5464-1390-4dcf-9312-315c06b082e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b64f5464-1390-4dcf-9312-315c06b082e4
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-b64f5464-1390-4dcf-9312-315c06b082e4
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

{"balance":15,"currency":"credits","accountId":"acc_93b189ed-3879-4407-9a13-31938e3ab7e8"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-387d3dcf-8337-4f3f-937a-fb1b9199e5a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-387d3dcf-8337-4f3f-937a-fb1b9199e5a6
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-387d3dcf-8337-4f3f-937a-fb1b9199e5a6
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
correlation: qa-552a4a92-f283-4a7e-bcbf-349b3da4cdc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-552a4a92-f283-4a7e-bcbf-349b3da4cdc7
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ddf5d40e68","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-552a4a92-f283-4a7e-bcbf-349b3da4cdc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-552a4a92-f283-4a7e-bcbf-349b3da4cdc7"}
```
