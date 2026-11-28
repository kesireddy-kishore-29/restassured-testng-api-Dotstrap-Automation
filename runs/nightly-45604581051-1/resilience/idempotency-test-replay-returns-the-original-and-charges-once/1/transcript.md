# Transcript: Same key + same body replays the original purchase

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#replayReturnsTheOriginalAndChargesOnce` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 426 | `qa-c2baf18e-5565-4632-a84b-b59baa577c3a` |
| 2 | `POST /v1/auth/token` | 200 | 72 | `qa-c0892fe4-3297-4f29-b684-92308d13a938` |
| 3 | `POST /v1/credits/purchases` | 201 | 49 | `qa-7c891d14-cf71-4e73-b48c-5be8b9b1739c` |
| 4 | `POST /v1/credits/purchases` | 200 | 24 | `qa-4abd39e8-3ed4-4e31-b7f5-037725fbfb64` |
| 5 | `GET /v1/credits/balance` | 200 | 47 | `qa-b93b983e-37c2-4a44-a991-a8ed45b91b00` |
| 6 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-64deb84d-dd68-46c3-8a02-9a62652db403` |
| 7 | `POST /v1/auth/token` | 401 | 13 | `qa-23eae31b-59d5-4583-8be6-39b17ebd28b2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c2baf18e-5565-4632-a84b-b59baa577c3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2baf18e-5565-4632-a84b-b59baa577c3a
Content-Type: application/json

--- request body ---
{"handle":"qa-d2c0877aa89e","displayName":"QA d2c0877aa89e","password":"****","region":"eu"}

--- response: 201 in 426 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2baf18e-5565-4632-a84b-b59baa577c3a
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
Location: /v1/accounts/qa-d2c0877aa89e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_12b13d53-0c5f-4593-9323-d499a30dd81a","handle":"qa-d2c0877aa89e","displayName":"QA d2c0877aa89e","region":"eu","role":"user","createdAt":"2026-11-25T11:27:49.228765301Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c0892fe4-3297-4f29-b684-92308d13a938

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0892fe4-3297-4f29-b684-92308d13a938
Content-Type: application/json

--- request body ---
{"handle":"qa-d2c0877aa89e","password":"****"}

--- response: 200 in 72 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0892fe4-3297-4f29-b684-92308d13a938
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12b13d53-0c5f-4593-9323-d499a30dd81a"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7c891d14-cf71-4e73-b48c-5be8b9b1739c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-10bf7179511441739a305f8fa9c3674e
X-Correlation-Id: qa-7c891d14-cf71-4e73-b48c-5be8b9b1739c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 49 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c891d14-cf71-4e73-b48c-5be8b9b1739c
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
Location: /v1/credits/purchases/pur_ff9c044a-95da-404a-a705-627fe41ea574
Content-Length: 144

{"id":"pur_ff9c044a-95da-404a-a705-627fe41ea574","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-25T11:27:49.832168338Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4abd39e8-3ed4-4e31-b7f5-037725fbfb64

--- request headers ---
Accept: application/json
Idempotency-Key: qa-10bf7179511441739a305f8fa9c3674e
X-Correlation-Id: qa-4abd39e8-3ed4-4e31-b7f5-037725fbfb64
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-4abd39e8-3ed4-4e31-b7f5-037725fbfb64
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
Location: /v1/credits/purchases/pur_ff9c044a-95da-404a-a705-627fe41ea574
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_ff9c044a-95da-404a-a705-627fe41ea574","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-25T11:27:49.832168338Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-b93b983e-37c2-4a44-a991-a8ed45b91b00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b93b983e-37c2-4a44-a991-a8ed45b91b00
Content-Type: application/json

--- response: 200 in 47 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-b93b983e-37c2-4a44-a991-a8ed45b91b00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_12b13d53-0c5f-4593-9323-d499a30dd81a"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-64deb84d-dd68-46c3-8a02-9a62652db403

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64deb84d-dd68-46c3-8a02-9a62652db403
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-64deb84d-dd68-46c3-8a02-9a62652db403
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-23eae31b-59d5-4583-8be6-39b17ebd28b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23eae31b-59d5-4583-8be6-39b17ebd28b2
Content-Type: application/json

--- request body ---
{"handle":"qa-d2c0877aa89e","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23eae31b-59d5-4583-8be6-39b17ebd28b2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-23eae31b-59d5-4583-8be6-39b17ebd28b2"}
```
