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
| 1 | `POST /v1/accounts` | 201 | 422 | `qa-8100b846-6ff7-4cd1-8626-bc2bfc813e0b` |
| 7 | `POST /v1/auth/token` | 200 | 70 | `qa-d6e4743d-1fa8-4654-8473-ba8f9f0ccb22` |
| 6 | `POST /v1/auth/token` | 200 | 73 | `qa-8429cd1d-40ff-43c8-8d19-ee8fb599107c` |
| 2 | `POST /v1/auth/token` | 200 | 81 | `qa-25ade615-cd78-488a-abfe-a08fd3c2a7fe` |
| 3 | `POST /v1/auth/token` | 200 | 84 | `qa-956c7560-84fc-4c46-8df4-d2e4cd023da3` |
| 5 | `POST /v1/auth/token` | 200 | 83 | `qa-d7e02ae7-d3a3-4d36-8b83-c5f98e33a387` |
| 4 | `POST /v1/auth/token` | 200 | 92 | `qa-9f26b767-e0ac-48e2-ac83-b42738f85e14` |
| 9 | `POST /v1/credits/purchases` | 200 | 54 | `qa-fb70a7ea-970b-4def-9052-5fcf8525499d` |
| 10 | `POST /v1/credits/purchases` | 201 | 46 | `qa-885be1f2-11ae-4f16-a1fe-1d200e29281c` |
| 12 | `POST /v1/credits/purchases` | 200 | 38 | `qa-8218fb37-e3ab-4e53-8a5a-379d74bcc4e7` |
| 13 | `POST /v1/credits/purchases` | 200 | 30 | `qa-2db3d312-26d8-4a16-820b-156f94dd97a9` |
| 11 | `POST /v1/credits/purchases` | 200 | 47 | `qa-3b503e5a-a8b9-4a14-9ebf-e0a9e294092f` |
| 8 | `POST /v1/credits/purchases` | 200 | 68 | `qa-07c9f1c6-88fb-4208-9dc5-20f3220b246f` |
| 14 | `POST /v1/auth/token` | 200 | 55 | `qa-31bef33f-47fe-4ec3-ac70-6f87931c1241` |
| 15 | `GET /v1/credits/balance` | 200 | 24 | `qa-5d79f5b1-6946-49c7-bc85-c9e205654b0d` |
| 16 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-019ed1e7-f5a6-4411-8152-e1eac6dd6744` |
| 17 | `POST /v1/auth/token` | 401 | 8 | `qa-ad531246-0193-4a16-a7db-64f923875f51` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8100b846-6ff7-4cd1-8626-bc2bfc813e0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8100b846-6ff7-4cd1-8626-bc2bfc813e0b
Content-Type: application/json

--- request body ---
{"handle":"qa-a59bbce4773a","displayName":"QA a59bbce4773a","password":"****","region":"eu"}

--- response: 201 in 422 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-8100b846-6ff7-4cd1-8626-bc2bfc813e0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-a59bbce4773a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_23d4de32-73db-4a5e-9676-113ce9228d09","handle":"qa-a59bbce4773a","displayName":"QA a59bbce4773a","region":"eu","role":"user","createdAt":"2026-10-26T07:54:42.666502552Z"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-d6e4743d-1fa8-4654-8473-ba8f9f0ccb22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6e4743d-1fa8-4654-8473-ba8f9f0ccb22
Content-Type: application/json

--- request body ---
{"handle":"qa-a59bbce4773a","password":"****"}

--- response: 200 in 70 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6e4743d-1fa8-4654-8473-ba8f9f0ccb22
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23d4de32-73db-4a5e-9676-113ce9228d09"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8429cd1d-40ff-43c8-8d19-ee8fb599107c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8429cd1d-40ff-43c8-8d19-ee8fb599107c
Content-Type: application/json

--- request body ---
{"handle":"qa-a59bbce4773a","password":"****"}

--- response: 200 in 73 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-8429cd1d-40ff-43c8-8d19-ee8fb599107c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23d4de32-73db-4a5e-9676-113ce9228d09"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-25ade615-cd78-488a-abfe-a08fd3c2a7fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25ade615-cd78-488a-abfe-a08fd3c2a7fe
Content-Type: application/json

--- request body ---
{"handle":"qa-a59bbce4773a","password":"****"}

--- response: 200 in 81 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-25ade615-cd78-488a-abfe-a08fd3c2a7fe
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23d4de32-73db-4a5e-9676-113ce9228d09"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-956c7560-84fc-4c46-8df4-d2e4cd023da3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-956c7560-84fc-4c46-8df4-d2e4cd023da3
Content-Type: application/json

--- request body ---
{"handle":"qa-a59bbce4773a","password":"****"}

--- response: 200 in 84 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-956c7560-84fc-4c46-8df4-d2e4cd023da3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23d4de32-73db-4a5e-9676-113ce9228d09"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-d7e02ae7-d3a3-4d36-8b83-c5f98e33a387

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7e02ae7-d3a3-4d36-8b83-c5f98e33a387
Content-Type: application/json

--- request body ---
{"handle":"qa-a59bbce4773a","password":"****"}

--- response: 200 in 83 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7e02ae7-d3a3-4d36-8b83-c5f98e33a387
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23d4de32-73db-4a5e-9676-113ce9228d09"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-9f26b767-e0ac-48e2-ac83-b42738f85e14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f26b767-e0ac-48e2-ac83-b42738f85e14
Content-Type: application/json

--- request body ---
{"handle":"qa-a59bbce4773a","password":"****"}

--- response: 200 in 92 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f26b767-e0ac-48e2-ac83-b42738f85e14
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23d4de32-73db-4a5e-9676-113ce9228d09"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fb70a7ea-970b-4def-9052-5fcf8525499d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-836661bbd4f64ea6a4c86f963a07292a
X-Correlation-Id: qa-fb70a7ea-970b-4def-9052-5fcf8525499d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 54 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb70a7ea-970b-4def-9052-5fcf8525499d
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
Location: /v1/credits/purchases/pur_74b78d98-657d-45dc-8e28-913490f0c75c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_74b78d98-657d-45dc-8e28-913490f0c75c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-26T07:54:43.205034163Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-885be1f2-11ae-4f16-a1fe-1d200e29281c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-836661bbd4f64ea6a4c86f963a07292a
X-Correlation-Id: qa-885be1f2-11ae-4f16-a1fe-1d200e29281c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 46 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-885be1f2-11ae-4f16-a1fe-1d200e29281c
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
Location: /v1/credits/purchases/pur_74b78d98-657d-45dc-8e28-913490f0c75c
Content-Length: 144

{"id":"pur_74b78d98-657d-45dc-8e28-913490f0c75c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-26T07:54:43.205034163Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8218fb37-e3ab-4e53-8a5a-379d74bcc4e7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-836661bbd4f64ea6a4c86f963a07292a
X-Correlation-Id: qa-8218fb37-e3ab-4e53-8a5a-379d74bcc4e7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 38 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-8218fb37-e3ab-4e53-8a5a-379d74bcc4e7
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
Location: /v1/credits/purchases/pur_74b78d98-657d-45dc-8e28-913490f0c75c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_74b78d98-657d-45dc-8e28-913490f0c75c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-26T07:54:43.205034163Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2db3d312-26d8-4a16-820b-156f94dd97a9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-836661bbd4f64ea6a4c86f963a07292a
X-Correlation-Id: qa-2db3d312-26d8-4a16-820b-156f94dd97a9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 30 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-2db3d312-26d8-4a16-820b-156f94dd97a9
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
Location: /v1/credits/purchases/pur_74b78d98-657d-45dc-8e28-913490f0c75c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_74b78d98-657d-45dc-8e28-913490f0c75c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-26T07:54:43.205034163Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3b503e5a-a8b9-4a14-9ebf-e0a9e294092f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-836661bbd4f64ea6a4c86f963a07292a
X-Correlation-Id: qa-3b503e5a-a8b9-4a14-9ebf-e0a9e294092f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 47 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b503e5a-a8b9-4a14-9ebf-e0a9e294092f
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
Location: /v1/credits/purchases/pur_74b78d98-657d-45dc-8e28-913490f0c75c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_74b78d98-657d-45dc-8e28-913490f0c75c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-26T07:54:43.205034163Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-07c9f1c6-88fb-4208-9dc5-20f3220b246f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-836661bbd4f64ea6a4c86f963a07292a
X-Correlation-Id: qa-07c9f1c6-88fb-4208-9dc5-20f3220b246f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 68 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-07c9f1c6-88fb-4208-9dc5-20f3220b246f
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
Location: /v1/credits/purchases/pur_74b78d98-657d-45dc-8e28-913490f0c75c
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_74b78d98-657d-45dc-8e28-913490f0c75c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-26T07:54:43.205034163Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-31bef33f-47fe-4ec3-ac70-6f87931c1241

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31bef33f-47fe-4ec3-ac70-6f87931c1241
Content-Type: application/json

--- request body ---
{"handle":"qa-a59bbce4773a","password":"****"}

--- response: 200 in 55 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-31bef33f-47fe-4ec3-ac70-6f87931c1241
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23d4de32-73db-4a5e-9676-113ce9228d09"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-5d79f5b1-6946-49c7-bc85-c9e205654b0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d79f5b1-6946-49c7-bc85-c9e205654b0d
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d79f5b1-6946-49c7-bc85-c9e205654b0d
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

{"balance":15,"currency":"credits","accountId":"acc_23d4de32-73db-4a5e-9676-113ce9228d09"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-019ed1e7-f5a6-4411-8152-e1eac6dd6744

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-019ed1e7-f5a6-4411-8152-e1eac6dd6744
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-019ed1e7-f5a6-4411-8152-e1eac6dd6744
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
correlation: qa-ad531246-0193-4a16-a7db-64f923875f51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad531246-0193-4a16-a7db-64f923875f51
Content-Type: application/json

--- request body ---
{"handle":"qa-a59bbce4773a","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad531246-0193-4a16-a7db-64f923875f51
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad531246-0193-4a16-a7db-64f923875f51"}
```
