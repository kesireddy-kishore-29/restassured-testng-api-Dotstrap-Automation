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
| 1 | `POST /v1/accounts` | 201 | 258 | `qa-6a233ffa-7fbe-4aa1-a84c-67d0051668a6` |
| 4 | `POST /v1/auth/token` | 200 | 51 | `qa-a8ce489c-67fe-4d1e-99e6-3d0db3b064b3` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-063cc03b-79d5-43dd-83ea-b442e408571d` |
| 5 | `POST /v1/auth/token` | 200 | 49 | `qa-2ff89d87-46ac-4905-b56b-58eb1147874e` |
| 2 | `POST /v1/auth/token` | 200 | 55 | `qa-693ef9d7-99f1-455b-948f-9a4d6b136b02` |
| 3 | `POST /v1/auth/token` | 200 | 56 | `qa-65a4f920-baa7-4a72-9621-54b5601d4658` |
| 7 | `POST /v1/auth/token` | 200 | 44 | `qa-db47c856-97cc-4f55-a3d1-ef867c3f13c3` |
| 8 | `POST /v1/credits/purchases` | 200 | 49 | `qa-ccdbe142-91f3-42a7-ad2d-b0433a96191d` |
| 9 | `POST /v1/credits/purchases` | 200 | 47 | `qa-0e9c7758-b7d7-4464-befc-6bc15ec3d18f` |
| 11 | `POST /v1/credits/purchases` | 200 | 38 | `qa-2dda8632-51d9-4e82-9dd7-fb11b7fb97d1` |
| 12 | `POST /v1/credits/purchases` | 200 | 48 | `qa-f4441a54-2ba6-48f7-a735-605a787f2f73` |
| 10 | `POST /v1/credits/purchases` | 201 | 53 | `qa-a24150c8-7d04-491f-9a21-b629de1c56e3` |
| 13 | `POST /v1/credits/purchases` | 200 | 48 | `qa-785b60ff-6d96-4107-8a62-f580a6be1101` |
| 14 | `POST /v1/auth/token` | 200 | 9 | `qa-4e14fee1-0775-4689-9498-135d94bb945e` |
| 15 | `GET /v1/credits/balance` | 200 | 7 | `qa-69ce436c-595a-4fbe-84bf-c43eb8a9e9bd` |
| 16 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-923acf9f-2dc6-4a61-a418-d84a7bc1e895` |
| 17 | `POST /v1/auth/token` | 401 | 5 | `qa-9e79ddf3-3e8b-4670-983c-2b08451a2b94` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6a233ffa-7fbe-4aa1-a84c-67d0051668a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a233ffa-7fbe-4aa1-a84c-67d0051668a6
Content-Type: application/json

--- request body ---
{"handle":"qa-e600a44c7c15","displayName":"QA e600a44c7c15","password":"****","region":"eu"}

--- response: 201 in 258 ms ---
Date: Tue, 27 Oct 2026 08:00:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a233ffa-7fbe-4aa1-a84c-67d0051668a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-e600a44c7c15
X-Served-Region: eu
Content-Length: 181

{"id":"acc_253083e3-ff78-4685-8055-5810298f6b74","handle":"qa-e600a44c7c15","displayName":"QA e600a44c7c15","region":"eu","role":"user","createdAt":"2026-10-27T08:00:18.916950684Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-a8ce489c-67fe-4d1e-99e6-3d0db3b064b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8ce489c-67fe-4d1e-99e6-3d0db3b064b3
Content-Type: application/json

--- request body ---
{"handle":"qa-e600a44c7c15","password":"****"}

--- response: 200 in 51 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8ce489c-67fe-4d1e-99e6-3d0db3b064b3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_253083e3-ff78-4685-8055-5810298f6b74"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-063cc03b-79d5-43dd-83ea-b442e408571d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-063cc03b-79d5-43dd-83ea-b442e408571d
Content-Type: application/json

--- request body ---
{"handle":"qa-e600a44c7c15","password":"****"}

--- response: 200 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-063cc03b-79d5-43dd-83ea-b442e408571d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_253083e3-ff78-4685-8055-5810298f6b74"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2ff89d87-46ac-4905-b56b-58eb1147874e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ff89d87-46ac-4905-b56b-58eb1147874e
Content-Type: application/json

--- request body ---
{"handle":"qa-e600a44c7c15","password":"****"}

--- response: 200 in 49 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ff89d87-46ac-4905-b56b-58eb1147874e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_253083e3-ff78-4685-8055-5810298f6b74"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-693ef9d7-99f1-455b-948f-9a4d6b136b02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-693ef9d7-99f1-455b-948f-9a4d6b136b02
Content-Type: application/json

--- request body ---
{"handle":"qa-e600a44c7c15","password":"****"}

--- response: 200 in 55 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-693ef9d7-99f1-455b-948f-9a4d6b136b02
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_253083e3-ff78-4685-8055-5810298f6b74"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-65a4f920-baa7-4a72-9621-54b5601d4658

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65a4f920-baa7-4a72-9621-54b5601d4658
Content-Type: application/json

--- request body ---
{"handle":"qa-e600a44c7c15","password":"****"}

--- response: 200 in 56 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-65a4f920-baa7-4a72-9621-54b5601d4658
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_253083e3-ff78-4685-8055-5810298f6b74"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-db47c856-97cc-4f55-a3d1-ef867c3f13c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db47c856-97cc-4f55-a3d1-ef867c3f13c3
Content-Type: application/json

--- request body ---
{"handle":"qa-e600a44c7c15","password":"****"}

--- response: 200 in 44 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-db47c856-97cc-4f55-a3d1-ef867c3f13c3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_253083e3-ff78-4685-8055-5810298f6b74"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ccdbe142-91f3-42a7-ad2d-b0433a96191d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-814ed71a89e448c1a7b22298386bc9e7
X-Correlation-Id: qa-ccdbe142-91f3-42a7-ad2d-b0433a96191d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 49 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccdbe142-91f3-42a7-ad2d-b0433a96191d
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
Location: /v1/credits/purchases/pur_5c0a47a1-3f21-445f-8093-b69e5fd2ce3c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_5c0a47a1-3f21-445f-8093-b69e5fd2ce3c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-27T08:00:19.314758177Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0e9c7758-b7d7-4464-befc-6bc15ec3d18f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-814ed71a89e448c1a7b22298386bc9e7
X-Correlation-Id: qa-0e9c7758-b7d7-4464-befc-6bc15ec3d18f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 47 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e9c7758-b7d7-4464-befc-6bc15ec3d18f
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
Location: /v1/credits/purchases/pur_5c0a47a1-3f21-445f-8093-b69e5fd2ce3c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_5c0a47a1-3f21-445f-8093-b69e5fd2ce3c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-27T08:00:19.314758177Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2dda8632-51d9-4e82-9dd7-fb11b7fb97d1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-814ed71a89e448c1a7b22298386bc9e7
X-Correlation-Id: qa-2dda8632-51d9-4e82-9dd7-fb11b7fb97d1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 38 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dda8632-51d9-4e82-9dd7-fb11b7fb97d1
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
Location: /v1/credits/purchases/pur_5c0a47a1-3f21-445f-8093-b69e5fd2ce3c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_5c0a47a1-3f21-445f-8093-b69e5fd2ce3c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-27T08:00:19.314758177Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f4441a54-2ba6-48f7-a735-605a787f2f73

--- request headers ---
Accept: application/json
Idempotency-Key: qa-814ed71a89e448c1a7b22298386bc9e7
X-Correlation-Id: qa-f4441a54-2ba6-48f7-a735-605a787f2f73
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 48 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4441a54-2ba6-48f7-a735-605a787f2f73
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
Location: /v1/credits/purchases/pur_5c0a47a1-3f21-445f-8093-b69e5fd2ce3c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_5c0a47a1-3f21-445f-8093-b69e5fd2ce3c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-27T08:00:19.314758177Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a24150c8-7d04-491f-9a21-b629de1c56e3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-814ed71a89e448c1a7b22298386bc9e7
X-Correlation-Id: qa-a24150c8-7d04-491f-9a21-b629de1c56e3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 53 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-a24150c8-7d04-491f-9a21-b629de1c56e3
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
Location: /v1/credits/purchases/pur_5c0a47a1-3f21-445f-8093-b69e5fd2ce3c
Content-Length: 144

{"id":"pur_5c0a47a1-3f21-445f-8093-b69e5fd2ce3c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-27T08:00:19.314758177Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-785b60ff-6d96-4107-8a62-f580a6be1101

--- request headers ---
Accept: application/json
Idempotency-Key: qa-814ed71a89e448c1a7b22298386bc9e7
X-Correlation-Id: qa-785b60ff-6d96-4107-8a62-f580a6be1101
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 48 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-785b60ff-6d96-4107-8a62-f580a6be1101
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
Location: /v1/credits/purchases/pur_5c0a47a1-3f21-445f-8093-b69e5fd2ce3c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_5c0a47a1-3f21-445f-8093-b69e5fd2ce3c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-27T08:00:19.314758177Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-4e14fee1-0775-4689-9498-135d94bb945e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e14fee1-0775-4689-9498-135d94bb945e
Content-Type: application/json

--- request body ---
{"handle":"qa-e600a44c7c15","password":"****"}

--- response: 200 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e14fee1-0775-4689-9498-135d94bb945e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_253083e3-ff78-4685-8055-5810298f6b74"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-69ce436c-595a-4fbe-84bf-c43eb8a9e9bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69ce436c-595a-4fbe-84bf-c43eb8a9e9bd
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-69ce436c-595a-4fbe-84bf-c43eb8a9e9bd
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

{"balance":15,"currency":"credits","accountId":"acc_253083e3-ff78-4685-8055-5810298f6b74"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-923acf9f-2dc6-4a61-a418-d84a7bc1e895

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-923acf9f-2dc6-4a61-a418-d84a7bc1e895
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-923acf9f-2dc6-4a61-a418-d84a7bc1e895
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
correlation: qa-9e79ddf3-3e8b-4670-983c-2b08451a2b94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e79ddf3-3e8b-4670-983c-2b08451a2b94
Content-Type: application/json

--- request body ---
{"handle":"qa-e600a44c7c15","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e79ddf3-3e8b-4670-983c-2b08451a2b94
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9e79ddf3-3e8b-4670-983c-2b08451a2b94"}
```
