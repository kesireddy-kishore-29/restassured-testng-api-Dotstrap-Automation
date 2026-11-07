# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-c81c24ba-7cc6-47b1-8d2f-0144641911a3` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-1e85e4bc-cbeb-4452-8312-0d0aa2cd934c` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-b9464f84-67a8-43b9-9de7-b30eadc55aaa` |
| 4 | `POST /v1/credits/purchases` | 201 | 7 | `qa-e256436b-2fca-4acc-8d8e-196e2575d6d1` |
| 5 | `POST /v1/auth/token` | 200 | 10 | `qa-34986664-08ae-4ae1-822a-aaa5b7517417` |
| 6 | `POST /v1/credits/purchases` | 201 | 9 | `qa-3d2c6797-2d6e-47d9-89ae-c3b072913ccf` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-f17ab513-5639-471f-b5c2-dfe364a75c38` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-fd80096b-dc39-4a9e-af3a-26cf897ccb6c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-88216c9d-b1a5-49af-92de-eccfa3254db6` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-980be4a2-7b6c-45a0-8d86-36fab492c286` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c81c24ba-7cc6-47b1-8d2f-0144641911a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c81c24ba-7cc6-47b1-8d2f-0144641911a3
Content-Type: application/json

--- request body ---
{"handle":"qa-3ebeaa6c8e86","displayName":"QA 3ebeaa6c8e86","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-c81c24ba-7cc6-47b1-8d2f-0144641911a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-3ebeaa6c8e86
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9fb7a05b-f437-4962-999a-2b26e0f8d7a4","handle":"qa-3ebeaa6c8e86","displayName":"QA 3ebeaa6c8e86","region":"eu","role":"user","createdAt":"2026-11-03T09:41:40.277920321Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1e85e4bc-cbeb-4452-8312-0d0aa2cd934c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e85e4bc-cbeb-4452-8312-0d0aa2cd934c
Content-Type: application/json

--- request body ---
{"handle":"qa-50d26a3f4cd4","displayName":"QA 50d26a3f4cd4","password":"****","region":"us"}

--- response: 201 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e85e4bc-cbeb-4452-8312-0d0aa2cd934c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-50d26a3f4cd4
X-Served-Region: us
Content-Length: 181

{"id":"acc_2811dc18-3668-4920-b96e-fd91b59990fa","handle":"qa-50d26a3f4cd4","displayName":"QA 50d26a3f4cd4","region":"us","role":"user","createdAt":"2026-11-03T09:41:40.298560713Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b9464f84-67a8-43b9-9de7-b30eadc55aaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9464f84-67a8-43b9-9de7-b30eadc55aaa
Content-Type: application/json

--- request body ---
{"handle":"qa-3ebeaa6c8e86","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9464f84-67a8-43b9-9de7-b30eadc55aaa
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9fb7a05b-f437-4962-999a-2b26e0f8d7a4"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e256436b-2fca-4acc-8d8e-196e2575d6d1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8c7f3564018644288d14b99105594e5f
X-Correlation-Id: qa-e256436b-2fca-4acc-8d8e-196e2575d6d1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-e256436b-2fca-4acc-8d8e-196e2575d6d1
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
Location: /v1/credits/purchases/pur_24925040-3e49-41b1-a9d9-cf44a0699e77
Content-Length: 144

{"id":"pur_24925040-3e49-41b1-a9d9-cf44a0699e77","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-03T09:41:40.330446087Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-34986664-08ae-4ae1-822a-aaa5b7517417

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34986664-08ae-4ae1-822a-aaa5b7517417
Content-Type: application/json

--- request body ---
{"handle":"qa-50d26a3f4cd4","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-34986664-08ae-4ae1-822a-aaa5b7517417
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2811dc18-3668-4920-b96e-fd91b59990fa"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3d2c6797-2d6e-47d9-89ae-c3b072913ccf

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8c7f3564018644288d14b99105594e5f
X-Correlation-Id: qa-3d2c6797-2d6e-47d9-89ae-c3b072913ccf
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d2c6797-2d6e-47d9-89ae-c3b072913ccf
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
Location: /v1/credits/purchases/pur_5f4b98ff-03c4-41f6-bc65-8762b6219513
Content-Length: 144

{"id":"pur_5f4b98ff-03c4-41f6-bc65-8762b6219513","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-03T09:41:40.359149580Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f17ab513-5639-471f-b5c2-dfe364a75c38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f17ab513-5639-471f-b5c2-dfe364a75c38
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f17ab513-5639-471f-b5c2-dfe364a75c38
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-fd80096b-dc39-4a9e-af3a-26cf897ccb6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd80096b-dc39-4a9e-af3a-26cf897ccb6c
Content-Type: application/json

--- request body ---
{"handle":"qa-50d26a3f4cd4","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd80096b-dc39-4a9e-af3a-26cf897ccb6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fd80096b-dc39-4a9e-af3a-26cf897ccb6c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-88216c9d-b1a5-49af-92de-eccfa3254db6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88216c9d-b1a5-49af-92de-eccfa3254db6
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-88216c9d-b1a5-49af-92de-eccfa3254db6
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-980be4a2-7b6c-45a0-8d86-36fab492c286

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-980be4a2-7b6c-45a0-8d86-36fab492c286
Content-Type: application/json

--- request body ---
{"handle":"qa-3ebeaa6c8e86","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-980be4a2-7b6c-45a0-8d86-36fab492c286
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-980be4a2-7b6c-45a0-8d86-36fab492c286"}
```
