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
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-c4db8061-ed2c-47ab-a2f4-ac72478ca607` |
| 2 | `POST /v1/auth/token` | 200 | 8 | `qa-9297b0a2-4910-422f-b47b-ccde0141360d` |
| 3 | `POST /v1/credits/purchases` | 201 | 4 | `qa-8dbc4f3e-66b9-4414-b1de-b5df27372888` |
| 4 | `POST /v1/credits/purchases` | 200 | 8 | `qa-c38ed4f7-482c-4b99-b193-147dc9e30948` |
| 5 | `GET /v1/credits/balance` | 200 | 6 | `qa-a6eb1b84-5cb6-463a-b50a-a75c0954cc80` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-1984dc98-45a7-4578-aee0-571f63658f63` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-a35841f1-1847-4f70-aafd-7351fa5ee855` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c4db8061-ed2c-47ab-a2f4-ac72478ca607

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4db8061-ed2c-47ab-a2f4-ac72478ca607
Content-Type: application/json

--- request body ---
{"handle":"qa-7f0ebecd4f51","displayName":"QA 7f0ebecd4f51","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4db8061-ed2c-47ab-a2f4-ac72478ca607
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
Location: /v1/accounts/qa-7f0ebecd4f51
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e12acafe-53fd-418b-af77-7b9c92a2aac2","handle":"qa-7f0ebecd4f51","displayName":"QA 7f0ebecd4f51","region":"eu","role":"user","createdAt":"2026-11-05T09:37:43.360676544Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9297b0a2-4910-422f-b47b-ccde0141360d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9297b0a2-4910-422f-b47b-ccde0141360d
Content-Type: application/json

--- request body ---
{"handle":"qa-7f0ebecd4f51","password":"****"}

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-9297b0a2-4910-422f-b47b-ccde0141360d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e12acafe-53fd-418b-af77-7b9c92a2aac2"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8dbc4f3e-66b9-4414-b1de-b5df27372888

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bc65510f8f0c447fb970dbd6969e20d2
X-Correlation-Id: qa-8dbc4f3e-66b9-4414-b1de-b5df27372888
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dbc4f3e-66b9-4414-b1de-b5df27372888
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
Location: /v1/credits/purchases/pur_0366877c-65dc-415b-ba62-0731a9726c8a
Content-Length: 144

{"id":"pur_0366877c-65dc-415b-ba62-0731a9726c8a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-05T09:37:43.384091299Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c38ed4f7-482c-4b99-b193-147dc9e30948

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bc65510f8f0c447fb970dbd6969e20d2
X-Correlation-Id: qa-c38ed4f7-482c-4b99-b193-147dc9e30948
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-c38ed4f7-482c-4b99-b193-147dc9e30948
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
Location: /v1/credits/purchases/pur_0366877c-65dc-415b-ba62-0731a9726c8a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_0366877c-65dc-415b-ba62-0731a9726c8a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-05T09:37:43.384091299Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-a6eb1b84-5cb6-463a-b50a-a75c0954cc80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6eb1b84-5cb6-463a-b50a-a75c0954cc80
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6eb1b84-5cb6-463a-b50a-a75c0954cc80
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

{"balance":15,"currency":"credits","accountId":"acc_e12acafe-53fd-418b-af77-7b9c92a2aac2"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1984dc98-45a7-4578-aee0-571f63658f63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1984dc98-45a7-4578-aee0-571f63658f63
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1984dc98-45a7-4578-aee0-571f63658f63
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
correlation: qa-a35841f1-1847-4f70-aafd-7351fa5ee855

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a35841f1-1847-4f70-aafd-7351fa5ee855
Content-Type: application/json

--- request body ---
{"handle":"qa-7f0ebecd4f51","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a35841f1-1847-4f70-aafd-7351fa5ee855
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a35841f1-1847-4f70-aafd-7351fa5ee855"}
```
