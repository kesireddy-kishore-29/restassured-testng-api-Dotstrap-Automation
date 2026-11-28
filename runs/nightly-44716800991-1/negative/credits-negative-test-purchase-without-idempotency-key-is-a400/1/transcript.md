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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-7cf95b97-a513-4a96-b9ba-17ce9453f790` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-16f5eb2b-84b1-4a09-9c05-cab063db9ca4` |
| 3 | `POST /v1/credits/purchases` | 400 | 10 | `qa-03f566d5-bc99-40a4-824c-494f9ef19982` |
| 4 | `GET /v1/credits/balance` | 200 | 9 | `qa-f2b37e13-b1cc-4cea-b2d3-e84073bd5eaf` |
| 5 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-d7f68c4e-4376-4e7f-8509-e8fbd398d2ce` |
| 6 | `POST /v1/auth/token` | 401 | 10 | `qa-8792010b-fb82-4cd1-aeba-91b72ad85fbb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7cf95b97-a513-4a96-b9ba-17ce9453f790

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cf95b97-a513-4a96-b9ba-17ce9453f790
Content-Type: application/json

--- request body ---
{"handle":"qa-64084b3c2dd7","displayName":"QA 64084b3c2dd7","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cf95b97-a513-4a96-b9ba-17ce9453f790
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
Location: /v1/accounts/qa-64084b3c2dd7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_91de5291-4e4c-484f-9bef-f8a41d5c3a86","handle":"qa-64084b3c2dd7","displayName":"QA 64084b3c2dd7","region":"eu","role":"user","createdAt":"2026-11-20T10:09:52.834074269Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-16f5eb2b-84b1-4a09-9c05-cab063db9ca4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16f5eb2b-84b1-4a09-9c05-cab063db9ca4
Content-Type: application/json

--- request body ---
{"handle":"qa-64084b3c2dd7","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-16f5eb2b-84b1-4a09-9c05-cab063db9ca4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_91de5291-4e4c-484f-9bef-f8a41d5c3a86"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-03f566d5-bc99-40a4-824c-494f9ef19982

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03f566d5-bc99-40a4-824c-494f9ef19982
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 10 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03f566d5-bc99-40a4-824c-494f9ef19982
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-03f566d5-bc99-40a4-824c-494f9ef19982"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-f2b37e13-b1cc-4cea-b2d3-e84073bd5eaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2b37e13-b1cc-4cea-b2d3-e84073bd5eaf
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2b37e13-b1cc-4cea-b2d3-e84073bd5eaf
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

{"balance":5,"currency":"credits","accountId":"acc_91de5291-4e4c-484f-9bef-f8a41d5c3a86"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d7f68c4e-4376-4e7f-8509-e8fbd398d2ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7f68c4e-4376-4e7f-8509-e8fbd398d2ce
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d7f68c4e-4376-4e7f-8509-e8fbd398d2ce
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
correlation: qa-8792010b-fb82-4cd1-aeba-91b72ad85fbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8792010b-fb82-4cd1-aeba-91b72ad85fbb
Content-Type: application/json

--- request body ---
{"handle":"qa-64084b3c2dd7","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8792010b-fb82-4cd1-aeba-91b72ad85fbb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8792010b-fb82-4cd1-aeba-91b72ad85fbb"}
```
