# Transcript: A purchase without an Idempotency-Key is refused with 400

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#purchaseWithoutIdempotencyKeyIsA400` |
| Features | FEAT-IDEMP-03, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-e820965b-9583-4e76-bfb9-980bc113c9b0` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-4086a4d8-638a-44ae-8fac-a53d416c66d2` |
| 3 | `POST /v1/credits/purchases` | 400 | 11 | `qa-6697cf30-1d82-43d5-b366-55bdf8327e1d` |
| 4 | `GET /v1/credits/balance` | 200 | 18 | `qa-6eb104ce-0ee2-4ec9-a395-b890b5f0e3d7` |
| 5 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-4c248f78-da88-4e5c-beb2-0199b0551325` |
| 6 | `POST /v1/auth/token` | 401 | 17 | `qa-194a1267-5f0d-4abe-8e84-c5a4aab69c00` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e820965b-9583-4e76-bfb9-980bc113c9b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e820965b-9583-4e76-bfb9-980bc113c9b0
Content-Type: application/json

--- request body ---
{"handle":"qa-034c91730c75","displayName":"QA 034c91730c75","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e820965b-9583-4e76-bfb9-980bc113c9b0
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
Location: /v1/accounts/qa-034c91730c75
X-Served-Region: eu
Content-Length: 181

{"id":"acc_18ba9201-4845-4cec-b3c2-512f98461b9a","handle":"qa-034c91730c75","displayName":"QA 034c91730c75","region":"eu","role":"user","createdAt":"2026-11-13T09:42:10.385544900Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4086a4d8-638a-44ae-8fac-a53d416c66d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4086a4d8-638a-44ae-8fac-a53d416c66d2
Content-Type: application/json

--- request body ---
{"handle":"qa-034c91730c75","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4086a4d8-638a-44ae-8fac-a53d416c66d2
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18ba9201-4845-4cec-b3c2-512f98461b9a"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6697cf30-1d82-43d5-b366-55bdf8327e1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6697cf30-1d82-43d5-b366-55bdf8327e1d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6697cf30-1d82-43d5-b366-55bdf8327e1d
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
Content-Length: 319

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-6697cf30-1d82-43d5-b366-55bdf8327e1d"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-6eb104ce-0ee2-4ec9-a395-b890b5f0e3d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eb104ce-0ee2-4ec9-a395-b890b5f0e3d7
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-6eb104ce-0ee2-4ec9-a395-b890b5f0e3d7
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
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_18ba9201-4845-4cec-b3c2-512f98461b9a"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4c248f78-da88-4e5c-beb2-0199b0551325

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c248f78-da88-4e5c-beb2-0199b0551325
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4c248f78-da88-4e5c-beb2-0199b0551325
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-194a1267-5f0d-4abe-8e84-c5a4aab69c00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-194a1267-5f0d-4abe-8e84-c5a4aab69c00
Content-Type: application/json

--- request body ---
{"handle":"qa-034c91730c75","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-194a1267-5f0d-4abe-8e84-c5a4aab69c00
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-194a1267-5f0d-4abe-8e84-c5a4aab69c00"}
```
