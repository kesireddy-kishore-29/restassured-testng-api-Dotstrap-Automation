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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-105dc374-3460-4109-be16-5bf78266eb2a` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-29f99d61-6e71-464e-b5ba-dc3dbde48330` |
| 3 | `POST /v1/credits/purchases` | 400 | 19 | `qa-f3007a69-9b9a-4a79-a6e8-4ac0f78af8b4` |
| 4 | `GET /v1/credits/balance` | 200 | 16 | `qa-16019d7a-0586-404b-aff6-4878f4f8c03b` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-6981a5a9-3d76-4438-b641-7b938f3aba61` |
| 6 | `POST /v1/auth/token` | 401 | 7 | `qa-426dd324-2247-4a3f-a5e1-fdb63dace4ab` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-105dc374-3460-4109-be16-5bf78266eb2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-105dc374-3460-4109-be16-5bf78266eb2a
Content-Type: application/json

--- request body ---
{"handle":"qa-06d21ac88acf","displayName":"QA 06d21ac88acf","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-105dc374-3460-4109-be16-5bf78266eb2a
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
Location: /v1/accounts/qa-06d21ac88acf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f47e435-1280-4260-8286-d412470ec993","handle":"qa-06d21ac88acf","displayName":"QA 06d21ac88acf","region":"eu","role":"user","createdAt":"2026-11-25T11:28:07.202325506Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-29f99d61-6e71-464e-b5ba-dc3dbde48330

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29f99d61-6e71-464e-b5ba-dc3dbde48330
Content-Type: application/json

--- request body ---
{"handle":"qa-06d21ac88acf","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-29f99d61-6e71-464e-b5ba-dc3dbde48330
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f47e435-1280-4260-8286-d412470ec993"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f3007a69-9b9a-4a79-a6e8-4ac0f78af8b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3007a69-9b9a-4a79-a6e8-4ac0f78af8b4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 19 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3007a69-9b9a-4a79-a6e8-4ac0f78af8b4
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-f3007a69-9b9a-4a79-a6e8-4ac0f78af8b4"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-16019d7a-0586-404b-aff6-4878f4f8c03b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16019d7a-0586-404b-aff6-4878f4f8c03b
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-16019d7a-0586-404b-aff6-4878f4f8c03b
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

{"balance":5,"currency":"credits","accountId":"acc_9f47e435-1280-4260-8286-d412470ec993"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6981a5a9-3d76-4438-b641-7b938f3aba61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6981a5a9-3d76-4438-b641-7b938f3aba61
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6981a5a9-3d76-4438-b641-7b938f3aba61
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
correlation: qa-426dd324-2247-4a3f-a5e1-fdb63dace4ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-426dd324-2247-4a3f-a5e1-fdb63dace4ab
Content-Type: application/json

--- request body ---
{"handle":"qa-06d21ac88acf","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-426dd324-2247-4a3f-a5e1-fdb63dace4ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-426dd324-2247-4a3f-a5e1-fdb63dace4ab"}
```
