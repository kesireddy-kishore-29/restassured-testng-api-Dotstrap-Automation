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
| 1 | `POST /v1/accounts` | 201 | 528 | `qa-492340e9-4e49-49d5-bb87-e48a8cb24701` |
| 6 | `POST /v1/auth/token` | 200 | 64 | `qa-77b1154b-ed01-4ce4-b369-4e62ef88521c` |
| 4 | `POST /v1/auth/token` | 200 | 76 | `qa-ce2277f0-742b-4dc6-940e-6610b7c8448a` |
| 3 | `POST /v1/auth/token` | 200 | 81 | `qa-9e3bdd17-e794-47b3-a5cf-7014571aff84` |
| 2 | `POST /v1/auth/token` | 200 | 90 | `qa-fd5bbe04-1a07-4643-a7e5-4ffee03dcbf6` |
| 7 | `POST /v1/auth/token` | 200 | 73 | `qa-a577b529-51a5-40e8-bd00-f45d8bea5f61` |
| 5 | `POST /v1/auth/token` | 200 | 77 | `qa-fb1ac78f-ec74-4521-9bbc-374f493abb37` |
| 10 | `POST /v1/credits/purchases` | 200 | 61 | `qa-41b87cbe-8f49-4dab-be5c-3d3dc7324612` |
| 13 | `POST /v1/credits/purchases` | 201 | 52 | `qa-d3e346f8-c331-4323-ab21-3feae1e78298` |
| 8 | `POST /v1/credits/purchases` | 200 | 74 | `qa-b3aa490f-f0e9-4069-9a8d-6d12163a9ed2` |
| 11 | `POST /v1/credits/purchases` | 200 | 58 | `qa-2df18731-167f-4301-82d8-eed2929d8db0` |
| 12 | `POST /v1/credits/purchases` | 200 | 60 | `qa-1ffcf2ef-0f1c-46bf-a45d-00f13d965068` |
| 9 | `POST /v1/credits/purchases` | 200 | 76 | `qa-414ffd43-5f40-4ad6-90e2-2dbebbc50ce9` |
| 14 | `POST /v1/auth/token` | 200 | 18 | `qa-eddab9a2-0f4d-4ed0-8901-2f278abbff84` |
| 15 | `GET /v1/credits/balance` | 200 | 15 | `qa-070cc5e0-9cb3-4fa0-8a32-8394619c31d3` |
| 16 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-6face3b1-01cf-40f5-bb9c-d52a4c171aa3` |
| 17 | `POST /v1/auth/token` | 401 | 17 | `qa-d23167e6-866c-4e57-abf8-1f27bb71692e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-492340e9-4e49-49d5-bb87-e48a8cb24701

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-492340e9-4e49-49d5-bb87-e48a8cb24701
Content-Type: application/json

--- request body ---
{"handle":"qa-3e5e541875cc","displayName":"QA 3e5e541875cc","password":"****","region":"eu"}

--- response: 201 in 528 ms ---
Date: Mon, 16 Nov 2026 09:53:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-492340e9-4e49-49d5-bb87-e48a8cb24701
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
Location: /v1/accounts/qa-3e5e541875cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3a0d9e5b-7554-402e-9b29-644e1a6c5052","handle":"qa-3e5e541875cc","displayName":"QA 3e5e541875cc","region":"eu","role":"user","createdAt":"2026-11-16T09:53:59.649259584Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-77b1154b-ed01-4ce4-b369-4e62ef88521c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77b1154b-ed01-4ce4-b369-4e62ef88521c
Content-Type: application/json

--- request body ---
{"handle":"qa-3e5e541875cc","password":"****"}

--- response: 200 in 64 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-77b1154b-ed01-4ce4-b369-4e62ef88521c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a0d9e5b-7554-402e-9b29-644e1a6c5052"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ce2277f0-742b-4dc6-940e-6610b7c8448a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce2277f0-742b-4dc6-940e-6610b7c8448a
Content-Type: application/json

--- request body ---
{"handle":"qa-3e5e541875cc","password":"****"}

--- response: 200 in 76 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce2277f0-742b-4dc6-940e-6610b7c8448a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a0d9e5b-7554-402e-9b29-644e1a6c5052"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9e3bdd17-e794-47b3-a5cf-7014571aff84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e3bdd17-e794-47b3-a5cf-7014571aff84
Content-Type: application/json

--- request body ---
{"handle":"qa-3e5e541875cc","password":"****"}

--- response: 200 in 81 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e3bdd17-e794-47b3-a5cf-7014571aff84
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a0d9e5b-7554-402e-9b29-644e1a6c5052"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fd5bbe04-1a07-4643-a7e5-4ffee03dcbf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd5bbe04-1a07-4643-a7e5-4ffee03dcbf6
Content-Type: application/json

--- request body ---
{"handle":"qa-3e5e541875cc","password":"****"}

--- response: 200 in 90 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd5bbe04-1a07-4643-a7e5-4ffee03dcbf6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a0d9e5b-7554-402e-9b29-644e1a6c5052"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-a577b529-51a5-40e8-bd00-f45d8bea5f61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a577b529-51a5-40e8-bd00-f45d8bea5f61
Content-Type: application/json

--- request body ---
{"handle":"qa-3e5e541875cc","password":"****"}

--- response: 200 in 73 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a577b529-51a5-40e8-bd00-f45d8bea5f61
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a0d9e5b-7554-402e-9b29-644e1a6c5052"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-fb1ac78f-ec74-4521-9bbc-374f493abb37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb1ac78f-ec74-4521-9bbc-374f493abb37
Content-Type: application/json

--- request body ---
{"handle":"qa-3e5e541875cc","password":"****"}

--- response: 200 in 77 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb1ac78f-ec74-4521-9bbc-374f493abb37
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a0d9e5b-7554-402e-9b29-644e1a6c5052"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-41b87cbe-8f49-4dab-be5c-3d3dc7324612

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b7d01f1c55de4ef599fedd5512b5e089
X-Correlation-Id: qa-41b87cbe-8f49-4dab-be5c-3d3dc7324612
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 61 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-41b87cbe-8f49-4dab-be5c-3d3dc7324612
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
Location: /v1/credits/purchases/pur_099fc2de-9050-4f12-8c8c-ed8bde65973d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_099fc2de-9050-4f12-8c8c-ed8bde65973d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-16T09:54:00.363702509Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d3e346f8-c331-4323-ab21-3feae1e78298

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b7d01f1c55de4ef599fedd5512b5e089
X-Correlation-Id: qa-d3e346f8-c331-4323-ab21-3feae1e78298
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 52 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3e346f8-c331-4323-ab21-3feae1e78298
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
Location: /v1/credits/purchases/pur_099fc2de-9050-4f12-8c8c-ed8bde65973d
Content-Length: 144

{"id":"pur_099fc2de-9050-4f12-8c8c-ed8bde65973d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-16T09:54:00.363702509Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b3aa490f-f0e9-4069-9a8d-6d12163a9ed2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b7d01f1c55de4ef599fedd5512b5e089
X-Correlation-Id: qa-b3aa490f-f0e9-4069-9a8d-6d12163a9ed2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 74 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3aa490f-f0e9-4069-9a8d-6d12163a9ed2
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
Location: /v1/credits/purchases/pur_099fc2de-9050-4f12-8c8c-ed8bde65973d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_099fc2de-9050-4f12-8c8c-ed8bde65973d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-16T09:54:00.363702509Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2df18731-167f-4301-82d8-eed2929d8db0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b7d01f1c55de4ef599fedd5512b5e089
X-Correlation-Id: qa-2df18731-167f-4301-82d8-eed2929d8db0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 58 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2df18731-167f-4301-82d8-eed2929d8db0
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
Location: /v1/credits/purchases/pur_099fc2de-9050-4f12-8c8c-ed8bde65973d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_099fc2de-9050-4f12-8c8c-ed8bde65973d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-16T09:54:00.363702509Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1ffcf2ef-0f1c-46bf-a45d-00f13d965068

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b7d01f1c55de4ef599fedd5512b5e089
X-Correlation-Id: qa-1ffcf2ef-0f1c-46bf-a45d-00f13d965068
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 60 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ffcf2ef-0f1c-46bf-a45d-00f13d965068
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
Location: /v1/credits/purchases/pur_099fc2de-9050-4f12-8c8c-ed8bde65973d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_099fc2de-9050-4f12-8c8c-ed8bde65973d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-16T09:54:00.363702509Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-414ffd43-5f40-4ad6-90e2-2dbebbc50ce9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b7d01f1c55de4ef599fedd5512b5e089
X-Correlation-Id: qa-414ffd43-5f40-4ad6-90e2-2dbebbc50ce9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 76 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-414ffd43-5f40-4ad6-90e2-2dbebbc50ce9
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
Location: /v1/credits/purchases/pur_099fc2de-9050-4f12-8c8c-ed8bde65973d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_099fc2de-9050-4f12-8c8c-ed8bde65973d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-16T09:54:00.363702509Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-eddab9a2-0f4d-4ed0-8901-2f278abbff84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eddab9a2-0f4d-4ed0-8901-2f278abbff84
Content-Type: application/json

--- request body ---
{"handle":"qa-3e5e541875cc","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-eddab9a2-0f4d-4ed0-8901-2f278abbff84
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a0d9e5b-7554-402e-9b29-644e1a6c5052"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-070cc5e0-9cb3-4fa0-8a32-8394619c31d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-070cc5e0-9cb3-4fa0-8a32-8394619c31d3
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-070cc5e0-9cb3-4fa0-8a32-8394619c31d3
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

{"balance":15,"currency":"credits","accountId":"acc_3a0d9e5b-7554-402e-9b29-644e1a6c5052"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6face3b1-01cf-40f5-bb9c-d52a4c171aa3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6face3b1-01cf-40f5-bb9c-d52a4c171aa3
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6face3b1-01cf-40f5-bb9c-d52a4c171aa3
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
correlation: qa-d23167e6-866c-4e57-abf8-1f27bb71692e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d23167e6-866c-4e57-abf8-1f27bb71692e
Content-Type: application/json

--- request body ---
{"handle":"qa-3e5e541875cc","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d23167e6-866c-4e57-abf8-1f27bb71692e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d23167e6-866c-4e57-abf8-1f27bb71692e"}
```
