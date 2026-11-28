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
| 1 | `POST /v1/accounts` | 201 | 477 | `qa-ee426601-96ae-4bc8-8b48-290daac6744e` |
| 2 | `POST /v1/auth/token` | 200 | 60 | `qa-636322cd-3db0-42ed-aead-0b137f8cb50d` |
| 5 | `POST /v1/auth/token` | 200 | 49 | `qa-a5a85202-84af-4faf-bfc8-7f78a5ff7b18` |
| 7 | `POST /v1/auth/token` | 200 | 43 | `qa-5db5cef6-81b0-4b1e-b17d-c159cb80979b` |
| 6 | `POST /v1/auth/token` | 200 | 54 | `qa-181ccd07-8371-491e-9058-5d0d8445e8bb` |
| 4 | `POST /v1/auth/token` | 200 | 70 | `qa-1c948ce8-2947-4841-851f-a005dfd9125d` |
| 3 | `POST /v1/auth/token` | 200 | 69 | `qa-d8415630-78d0-40f9-b2c4-184ebc6c0094` |
| 8 | `POST /v1/credits/purchases` | 200 | 57 | `qa-5dded53c-b0d7-4646-8c62-c45001e637b7` |
| 11 | `POST /v1/credits/purchases` | 200 | 53 | `qa-483ed289-af7e-4ff9-affe-8ddea935e52c` |
| 9 | `POST /v1/credits/purchases` | 200 | 55 | `qa-039a16e7-9005-45fd-a470-31378bc80439` |
| 12 | `POST /v1/credits/purchases` | 201 | 52 | `qa-dbbe1086-3d89-45ea-be69-f22ae71ae13e` |
| 10 | `POST /v1/credits/purchases` | 200 | 59 | `qa-2124f277-223a-45e5-89d2-d859ce6f2b0d` |
| 13 | `POST /v1/credits/purchases` | 200 | 76 | `qa-a1f88fa1-d786-47f7-85d7-d66170877aa4` |
| 14 | `POST /v1/auth/token` | 200 | 22 | `qa-83388427-1ff5-43f0-8de8-8b8cae857535` |
| 15 | `GET /v1/credits/balance` | 200 | 15 | `qa-2dcb72a5-c8d1-422a-b68f-8fbcc7ee723b` |
| 16 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-e6e8c804-8761-4d72-9dc4-6e21f2c7b954` |
| 17 | `POST /v1/auth/token` | 401 | 8 | `qa-8068c7bd-7d46-47d1-8024-1613a0aa4f02` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ee426601-96ae-4bc8-8b48-290daac6744e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee426601-96ae-4bc8-8b48-290daac6744e
Content-Type: application/json

--- request body ---
{"handle":"qa-102f0dc17700","displayName":"QA 102f0dc17700","password":"****","region":"eu"}

--- response: 201 in 477 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee426601-96ae-4bc8-8b48-290daac6744e
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
Location: /v1/accounts/qa-102f0dc17700
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e6304844-88e8-43a0-bb61-95630aa34a4d","handle":"qa-102f0dc17700","displayName":"QA 102f0dc17700","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.689353346Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-636322cd-3db0-42ed-aead-0b137f8cb50d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-636322cd-3db0-42ed-aead-0b137f8cb50d
Content-Type: application/json

--- request body ---
{"handle":"qa-102f0dc17700","password":"****"}

--- response: 200 in 60 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-636322cd-3db0-42ed-aead-0b137f8cb50d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6304844-88e8-43a0-bb61-95630aa34a4d"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a5a85202-84af-4faf-bfc8-7f78a5ff7b18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5a85202-84af-4faf-bfc8-7f78a5ff7b18
Content-Type: application/json

--- request body ---
{"handle":"qa-102f0dc17700","password":"****"}

--- response: 200 in 49 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5a85202-84af-4faf-bfc8-7f78a5ff7b18
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6304844-88e8-43a0-bb61-95630aa34a4d"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-5db5cef6-81b0-4b1e-b17d-c159cb80979b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5db5cef6-81b0-4b1e-b17d-c159cb80979b
Content-Type: application/json

--- request body ---
{"handle":"qa-102f0dc17700","password":"****"}

--- response: 200 in 43 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-5db5cef6-81b0-4b1e-b17d-c159cb80979b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6304844-88e8-43a0-bb61-95630aa34a4d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-181ccd07-8371-491e-9058-5d0d8445e8bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-181ccd07-8371-491e-9058-5d0d8445e8bb
Content-Type: application/json

--- request body ---
{"handle":"qa-102f0dc17700","password":"****"}

--- response: 200 in 54 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-181ccd07-8371-491e-9058-5d0d8445e8bb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6304844-88e8-43a0-bb61-95630aa34a4d"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-1c948ce8-2947-4841-851f-a005dfd9125d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c948ce8-2947-4841-851f-a005dfd9125d
Content-Type: application/json

--- request body ---
{"handle":"qa-102f0dc17700","password":"****"}

--- response: 200 in 70 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c948ce8-2947-4841-851f-a005dfd9125d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6304844-88e8-43a0-bb61-95630aa34a4d"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d8415630-78d0-40f9-b2c4-184ebc6c0094

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8415630-78d0-40f9-b2c4-184ebc6c0094
Content-Type: application/json

--- request body ---
{"handle":"qa-102f0dc17700","password":"****"}

--- response: 200 in 69 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8415630-78d0-40f9-b2c4-184ebc6c0094
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6304844-88e8-43a0-bb61-95630aa34a4d"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5dded53c-b0d7-4646-8c62-c45001e637b7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0628de023bd4462d8171e0301b2a4e83
X-Correlation-Id: qa-5dded53c-b0d7-4646-8c62-c45001e637b7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 57 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dded53c-b0d7-4646-8c62-c45001e637b7
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
Location: /v1/credits/purchases/pur_017acff4-98bf-4060-8857-e4fe14617ea2
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_017acff4-98bf-4060-8857-e4fe14617ea2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-23T10:55:02.267692981Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-483ed289-af7e-4ff9-affe-8ddea935e52c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0628de023bd4462d8171e0301b2a4e83
X-Correlation-Id: qa-483ed289-af7e-4ff9-affe-8ddea935e52c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 53 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-483ed289-af7e-4ff9-affe-8ddea935e52c
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
Location: /v1/credits/purchases/pur_017acff4-98bf-4060-8857-e4fe14617ea2
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_017acff4-98bf-4060-8857-e4fe14617ea2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-23T10:55:02.267692981Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-039a16e7-9005-45fd-a470-31378bc80439

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0628de023bd4462d8171e0301b2a4e83
X-Correlation-Id: qa-039a16e7-9005-45fd-a470-31378bc80439
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 55 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-039a16e7-9005-45fd-a470-31378bc80439
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
Location: /v1/credits/purchases/pur_017acff4-98bf-4060-8857-e4fe14617ea2
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_017acff4-98bf-4060-8857-e4fe14617ea2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-23T10:55:02.267692981Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-dbbe1086-3d89-45ea-be69-f22ae71ae13e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0628de023bd4462d8171e0301b2a4e83
X-Correlation-Id: qa-dbbe1086-3d89-45ea-be69-f22ae71ae13e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 52 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbbe1086-3d89-45ea-be69-f22ae71ae13e
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
Location: /v1/credits/purchases/pur_017acff4-98bf-4060-8857-e4fe14617ea2
Content-Length: 144

{"id":"pur_017acff4-98bf-4060-8857-e4fe14617ea2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-23T10:55:02.267692981Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2124f277-223a-45e5-89d2-d859ce6f2b0d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0628de023bd4462d8171e0301b2a4e83
X-Correlation-Id: qa-2124f277-223a-45e5-89d2-d859ce6f2b0d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 59 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2124f277-223a-45e5-89d2-d859ce6f2b0d
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
Location: /v1/credits/purchases/pur_017acff4-98bf-4060-8857-e4fe14617ea2
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_017acff4-98bf-4060-8857-e4fe14617ea2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-23T10:55:02.267692981Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a1f88fa1-d786-47f7-85d7-d66170877aa4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0628de023bd4462d8171e0301b2a4e83
X-Correlation-Id: qa-a1f88fa1-d786-47f7-85d7-d66170877aa4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 76 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1f88fa1-d786-47f7-85d7-d66170877aa4
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
Location: /v1/credits/purchases/pur_017acff4-98bf-4060-8857-e4fe14617ea2
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_017acff4-98bf-4060-8857-e4fe14617ea2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-23T10:55:02.267692981Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-83388427-1ff5-43f0-8de8-8b8cae857535

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83388427-1ff5-43f0-8de8-8b8cae857535
Content-Type: application/json

--- request body ---
{"handle":"qa-102f0dc17700","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-83388427-1ff5-43f0-8de8-8b8cae857535
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6304844-88e8-43a0-bb61-95630aa34a4d"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-2dcb72a5-c8d1-422a-b68f-8fbcc7ee723b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dcb72a5-c8d1-422a-b68f-8fbcc7ee723b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dcb72a5-c8d1-422a-b68f-8fbcc7ee723b
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

{"balance":15,"currency":"credits","accountId":"acc_e6304844-88e8-43a0-bb61-95630aa34a4d"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e6e8c804-8761-4d72-9dc4-6e21f2c7b954

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6e8c804-8761-4d72-9dc4-6e21f2c7b954
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e6e8c804-8761-4d72-9dc4-6e21f2c7b954
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
correlation: qa-8068c7bd-7d46-47d1-8024-1613a0aa4f02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8068c7bd-7d46-47d1-8024-1613a0aa4f02
Content-Type: application/json

--- request body ---
{"handle":"qa-102f0dc17700","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8068c7bd-7d46-47d1-8024-1613a0aa4f02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8068c7bd-7d46-47d1-8024-1613a0aa4f02"}
```
