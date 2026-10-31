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
| 1 | `POST /v1/accounts` | 201 | 474 | `qa-e4613fb0-af29-42e7-9139-0746ad0aabb0` |
| 3 | `POST /v1/auth/token` | 200 | 120 | `qa-26e409cc-91cb-497d-8337-fc8684766792` |
| 5 | `POST /v1/auth/token` | 200 | 119 | `qa-7aa78a23-a288-41fb-b104-8da497a19cf7` |
| 4 | `POST /v1/auth/token` | 200 | 121 | `qa-0b365455-ee53-4d6d-970e-8782248d1a30` |
| 8 | `POST /v1/auth/token` | 200 | 122 | `qa-e55eceb0-285c-470d-b3ba-8a6b2a3296d3` |
| 6 | `POST /v1/auth/token` | 200 | 126 | `qa-ae4ce480-2762-40dd-8fa5-6f9bb9e82465` |
| 11 | `POST /v1/auth/token` | 200 | 87 | `qa-4a47f02c-278f-4c67-87db-8d1a6d76e87c` |
| 2 | `POST /v1/auth/token` | 200 | 141 | `qa-6ddad56c-1c50-4b2d-965a-982766e0a6a2` |
| 10 | `POST /v1/auth/token` | 200 | 95 | `qa-4b3f68ae-1b01-48ac-b9f0-8ddea2886954` |
| 9 | `POST /v1/auth/token` | 200 | 126 | `qa-55589d5b-a2cc-4c32-ba70-200bfa2d2879` |
| 7 | `POST /v1/auth/token` | 200 | 142 | `qa-e2715371-9154-4b9d-b21a-64f6bac68b98` |
| 18 | `POST /v1/credits/purchases` | 201 | 57 | `qa-98f2a364-1e12-4ce7-b6a2-cee8f7883a68` |
| 12 | `POST /v1/credits/purchases` | 201 | 70 | `qa-a3e6085e-a62e-4cf4-98e5-77bdbd2518b5` |
| 15 | `POST /v1/credits/purchases` | 201 | 67 | `qa-f3f68068-be70-49ae-8370-e2f92382d8bb` |
| 14 | `POST /v1/credits/purchases` | 201 | 68 | `qa-f9c48d29-eacd-4eac-b787-2e132fbc73f9` |
| 19 | `POST /v1/credits/purchases` | 201 | 55 | `qa-8171e3e5-3c35-4fe0-87e6-92afc005086f` |
| 13 | `POST /v1/credits/purchases` | 201 | 68 | `qa-324f7736-fe4b-4eba-9e51-cd2380614d0c` |
| 16 | `POST /v1/credits/purchases` | 201 | 66 | `qa-1ef492df-fd56-44a1-b78b-0a67db53feb5` |
| 17 | `POST /v1/credits/purchases` | 201 | 66 | `qa-2f945231-9fcc-4e11-aaee-38f28a75ea4c` |
| 21 | `POST /v1/credits/purchases` | 201 | 46 | `qa-87db97e3-9d6e-406b-a5e7-e9412c03e098` |
| 20 | `POST /v1/credits/purchases` | 201 | 61 | `qa-863a8b17-0933-4dee-9595-0ef3b91b07f2` |
| 22 | `POST /v1/auth/token` | 200 | 21 | `qa-22017ae3-77e3-4bde-8f0f-ccd302bb70ab` |
| 23 | `GET /v1/credits/ledger` | 200 | 135 | `qa-73f4c88d-2c27-475e-bf38-379f98764d12` |
| 24 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-fd0eec5b-7452-4d19-820d-2ff1dcc00411` |
| 25 | `POST /v1/auth/token` | 401 | 39 | `qa-3eb5a1dd-6edc-446c-84c8-8c9ece1f9342` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e4613fb0-af29-42e7-9139-0746ad0aabb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4613fb0-af29-42e7-9139-0746ad0aabb0
Content-Type: application/json

--- request body ---
{"handle":"qa-cbd7b84793fe","displayName":"QA cbd7b84793fe","password":"****","region":"us"}

--- response: 201 in 474 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4613fb0-af29-42e7-9139-0746ad0aabb0
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
Location: /v1/accounts/qa-cbd7b84793fe
X-Served-Region: us
Content-Length: 181

{"id":"acc_12293ba5-03e8-43d0-9c6a-c0fb76791e3b","handle":"qa-cbd7b84793fe","displayName":"QA cbd7b84793fe","region":"us","role":"user","createdAt":"2026-10-27T08:00:33.294745664Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-26e409cc-91cb-497d-8337-fc8684766792

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26e409cc-91cb-497d-8337-fc8684766792
Content-Type: application/json

--- request body ---
{"handle":"qa-cbd7b84793fe","password":"****"}

--- response: 200 in 120 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-26e409cc-91cb-497d-8337-fc8684766792
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12293ba5-03e8-43d0-9c6a-c0fb76791e3b"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-7aa78a23-a288-41fb-b104-8da497a19cf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7aa78a23-a288-41fb-b104-8da497a19cf7
Content-Type: application/json

--- request body ---
{"handle":"qa-cbd7b84793fe","password":"****"}

--- response: 200 in 119 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-7aa78a23-a288-41fb-b104-8da497a19cf7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12293ba5-03e8-43d0-9c6a-c0fb76791e3b"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0b365455-ee53-4d6d-970e-8782248d1a30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b365455-ee53-4d6d-970e-8782248d1a30
Content-Type: application/json

--- request body ---
{"handle":"qa-cbd7b84793fe","password":"****"}

--- response: 200 in 121 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b365455-ee53-4d6d-970e-8782248d1a30
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12293ba5-03e8-43d0-9c6a-c0fb76791e3b"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-e55eceb0-285c-470d-b3ba-8a6b2a3296d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e55eceb0-285c-470d-b3ba-8a6b2a3296d3
Content-Type: application/json

--- request body ---
{"handle":"qa-cbd7b84793fe","password":"****"}

--- response: 200 in 122 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e55eceb0-285c-470d-b3ba-8a6b2a3296d3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12293ba5-03e8-43d0-9c6a-c0fb76791e3b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ae4ce480-2762-40dd-8fa5-6f9bb9e82465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae4ce480-2762-40dd-8fa5-6f9bb9e82465
Content-Type: application/json

--- request body ---
{"handle":"qa-cbd7b84793fe","password":"****"}

--- response: 200 in 126 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae4ce480-2762-40dd-8fa5-6f9bb9e82465
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12293ba5-03e8-43d0-9c6a-c0fb76791e3b"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-4a47f02c-278f-4c67-87db-8d1a6d76e87c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a47f02c-278f-4c67-87db-8d1a6d76e87c
Content-Type: application/json

--- request body ---
{"handle":"qa-cbd7b84793fe","password":"****"}

--- response: 200 in 87 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a47f02c-278f-4c67-87db-8d1a6d76e87c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12293ba5-03e8-43d0-9c6a-c0fb76791e3b"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6ddad56c-1c50-4b2d-965a-982766e0a6a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ddad56c-1c50-4b2d-965a-982766e0a6a2
Content-Type: application/json

--- request body ---
{"handle":"qa-cbd7b84793fe","password":"****"}

--- response: 200 in 141 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ddad56c-1c50-4b2d-965a-982766e0a6a2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12293ba5-03e8-43d0-9c6a-c0fb76791e3b"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-4b3f68ae-1b01-48ac-b9f0-8ddea2886954

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b3f68ae-1b01-48ac-b9f0-8ddea2886954
Content-Type: application/json

--- request body ---
{"handle":"qa-cbd7b84793fe","password":"****"}

--- response: 200 in 95 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b3f68ae-1b01-48ac-b9f0-8ddea2886954
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12293ba5-03e8-43d0-9c6a-c0fb76791e3b"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-55589d5b-a2cc-4c32-ba70-200bfa2d2879

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55589d5b-a2cc-4c32-ba70-200bfa2d2879
Content-Type: application/json

--- request body ---
{"handle":"qa-cbd7b84793fe","password":"****"}

--- response: 200 in 126 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-55589d5b-a2cc-4c32-ba70-200bfa2d2879
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12293ba5-03e8-43d0-9c6a-c0fb76791e3b"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-e2715371-9154-4b9d-b21a-64f6bac68b98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2715371-9154-4b9d-b21a-64f6bac68b98
Content-Type: application/json

--- request body ---
{"handle":"qa-cbd7b84793fe","password":"****"}

--- response: 200 in 142 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2715371-9154-4b9d-b21a-64f6bac68b98
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12293ba5-03e8-43d0-9c6a-c0fb76791e3b"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-98f2a364-1e12-4ce7-b6a2-cee8f7883a68

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4df60f72d708489f864a06d70727474c
X-Correlation-Id: qa-98f2a364-1e12-4ce7-b6a2-cee8f7883a68
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 57 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-98f2a364-1e12-4ce7-b6a2-cee8f7883a68
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
Location: /v1/credits/purchases/pur_518f8cf0-63fd-4037-abc2-1d52f3d0511c
Content-Length: 145

{"id":"pur_518f8cf0-63fd-4037-abc2-1d52f3d0511c","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-10-27T08:00:34.030701861Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a3e6085e-a62e-4cf4-98e5-77bdbd2518b5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-349d4aceec0843cdaf78eb9e4069cbbc
X-Correlation-Id: qa-a3e6085e-a62e-4cf4-98e5-77bdbd2518b5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 70 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3e6085e-a62e-4cf4-98e5-77bdbd2518b5
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
Location: /v1/credits/purchases/pur_c4338dc4-523d-4581-a2d6-ee48a10ba387
Content-Length: 144

{"id":"pur_c4338dc4-523d-4581-a2d6-ee48a10ba387","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-10-27T08:00:34.030509239Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f3f68068-be70-49ae-8370-e2f92382d8bb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-531fed4ea6cc408f946c30ac31580d11
X-Correlation-Id: qa-f3f68068-be70-49ae-8370-e2f92382d8bb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 67 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3f68068-be70-49ae-8370-e2f92382d8bb
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
Location: /v1/credits/purchases/pur_9051581c-d620-4c2b-83c1-6fde9dee9290
Content-Length: 144

{"id":"pur_9051581c-d620-4c2b-83c1-6fde9dee9290","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-10-27T08:00:34.029827836Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f9c48d29-eacd-4eac-b787-2e132fbc73f9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9c4175b5a4ea48e0b9639cc5bfa00665
X-Correlation-Id: qa-f9c48d29-eacd-4eac-b787-2e132fbc73f9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 68 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9c48d29-eacd-4eac-b787-2e132fbc73f9
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
Location: /v1/credits/purchases/pur_2e185152-3d0e-4d8e-96a9-76939031b426
Content-Length: 144

{"id":"pur_2e185152-3d0e-4d8e-96a9-76939031b426","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-10-27T08:00:34.030034475Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8171e3e5-3c35-4fe0-87e6-92afc005086f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fdf2728b14074c67a72bc1c00664f3b7
X-Correlation-Id: qa-8171e3e5-3c35-4fe0-87e6-92afc005086f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 55 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-8171e3e5-3c35-4fe0-87e6-92afc005086f
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
Location: /v1/credits/purchases/pur_aa032fe2-97e9-495a-8853-2b96103bc1cf
Content-Length: 144

{"id":"pur_aa032fe2-97e9-495a-8853-2b96103bc1cf","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-10-27T08:00:34.027498829Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-324f7736-fe4b-4eba-9e51-cd2380614d0c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d481819258f04c24b7da6bf12268f4f0
X-Correlation-Id: qa-324f7736-fe4b-4eba-9e51-cd2380614d0c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 68 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-324f7736-fe4b-4eba-9e51-cd2380614d0c
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
Location: /v1/credits/purchases/pur_1cd74bb1-5901-454b-ac1a-38eb459addf9
Content-Length: 144

{"id":"pur_1cd74bb1-5901-454b-ac1a-38eb459addf9","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-10-27T08:00:34.029616188Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1ef492df-fd56-44a1-b78b-0a67db53feb5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8a34a6e90fd64192a2f2df561d3de635
X-Correlation-Id: qa-1ef492df-fd56-44a1-b78b-0a67db53feb5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 66 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ef492df-fd56-44a1-b78b-0a67db53feb5
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
Location: /v1/credits/purchases/pur_8f751582-87a4-44b3-86f6-b64eac222a16
Content-Length: 144

{"id":"pur_8f751582-87a4-44b3-86f6-b64eac222a16","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-27T08:00:34.027445378Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2f945231-9fcc-4e11-aaee-38f28a75ea4c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-268ffa215aa74a489e9dff705e56a241
X-Correlation-Id: qa-2f945231-9fcc-4e11-aaee-38f28a75ea4c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 66 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f945231-9fcc-4e11-aaee-38f28a75ea4c
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
Location: /v1/credits/purchases/pur_4f275921-9aef-424f-9426-2b60581362fc
Content-Length: 144

{"id":"pur_4f275921-9aef-424f-9426-2b60581362fc","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-10-27T08:00:34.029475206Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-87db97e3-9d6e-406b-a5e7-e9412c03e098

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4cce748ebae44daeab99af970d64f0e5
X-Correlation-Id: qa-87db97e3-9d6e-406b-a5e7-e9412c03e098
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 46 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-87db97e3-9d6e-406b-a5e7-e9412c03e098
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
Location: /v1/credits/purchases/pur_bcb3de0e-47ea-4bcc-a5aa-f0da2eee01d0
Content-Length: 144

{"id":"pur_bcb3de0e-47ea-4bcc-a5aa-f0da2eee01d0","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-10-27T08:00:34.027459187Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-863a8b17-0933-4dee-9595-0ef3b91b07f2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-38a6bd03a95b4a55bcdd59237cb46fb0
X-Correlation-Id: qa-863a8b17-0933-4dee-9595-0ef3b91b07f2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 61 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-863a8b17-0933-4dee-9595-0ef3b91b07f2
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
Location: /v1/credits/purchases/pur_2d26423a-3d2b-45b2-b48d-7792e9ae3106
Content-Length: 144

{"id":"pur_2d26423a-3d2b-45b2-b48d-7792e9ae3106","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-10-27T08:00:34.027864466Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-22017ae3-77e3-4bde-8f0f-ccd302bb70ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22017ae3-77e3-4bde-8f0f-ccd302bb70ab
Content-Type: application/json

--- request body ---
{"handle":"qa-cbd7b84793fe","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-22017ae3-77e3-4bde-8f0f-ccd302bb70ab
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12293ba5-03e8-43d0-9c6a-c0fb76791e3b"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-73f4c88d-2c27-475e-bf38-379f98764d12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73f4c88d-2c27-475e-bf38-379f98764d12
Content-Type: application/json

--- response: 200 in 135 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-73f4c88d-2c27-475e-bf38-379f98764d12
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

{"items":[{"id":"led_bfbdb027-3c0b-4e88-8a50-465c35968c5e","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-27T08:00:33.295054655Z"},{"id":"led_c66d62cd-a3da-443e-a32f-54a39f9574c8","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_8f751582-87a4-44b3-86f6-b64eac222a16","createdAt":"2026-10-27T08:00:34.027445378Z"},{"id":"led_9b4f2c95-1c15-4977-9db4-0719db7f5e40","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_aa032fe2-97e9-495a-8853-2b96103bc1cf","createdAt":"2026-10-27T08:00:34.027498829Z"},{"id":"led_96caa69c-8441-4c49-b823-fcb592af73db","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_2d26423a-3d2b-45b2-b48d-7792e9ae3106","createdAt":"2026-10-27T08:00:34.027864466Z"},{"id":"led_87174192-2ebe-4111-9bf8-30259c710a68","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_bcb3de0e-47ea-4bcc-a5aa-f0da2eee01d0","createdAt":"2026-10-27T08:00:34.027459187Z"},{"id":"led_241b6663-549f-457a-8c22-cabbb154d2d0","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_4f275921-9aef-424f-9426-2b60581362fc","createdAt":"2026-10-27T08:00:34.029475206Z"},{"id":"led_95a8816d-1637-4fc1-be0c-5bab54a6365a","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_1cd74bb1-5901-454b-ac1a-38eb459addf9","createdAt":"2026-10-27T08:00:34.029616188Z"},{"id":"led_105531b2-ad1c-4990-a5b4-d9d7a1b4792a","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_9051581c-d620-4c2b-83c1-6fde9dee9290","createdAt":"2026-10-27T08:00:34.029827836Z"},{"id":"led_04a47806-4fcc-4250-92d1-70f7f05293b3","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_2e185152-3d0e-4d8e-96a9-76939031b426","createdAt":"2026-10-27T08:00:34.030034475Z"},{"id":"led_4121eb14-1566-4e31-8d7a-5f8d7f55707a","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_c4338dc4-523d-4581-a2d6-ee48a10ba387","createdAt":"2026-10-27T08:00:34.030509239Z"},{"id":"led_3a9569b3-38d5-40eb-a76a-5fb1a6bff43f","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_518f8cf0-63fd-4037-abc2-1d52f3d0511c","createdAt":"2026-10-27T08:00:34.030701861Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd0eec5b-7452-4d19-820d-2ff1dcc00411

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd0eec5b-7452-4d19-820d-2ff1dcc00411
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd0eec5b-7452-4d19-820d-2ff1dcc00411
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
correlation: qa-3eb5a1dd-6edc-446c-84c8-8c9ece1f9342

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3eb5a1dd-6edc-446c-84c8-8c9ece1f9342
Content-Type: application/json

--- request body ---
{"handle":"qa-cbd7b84793fe","password":"****"}

--- response: 401 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3eb5a1dd-6edc-446c-84c8-8c9ece1f9342
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3eb5a1dd-6edc-446c-84c8-8c9ece1f9342"}
```
