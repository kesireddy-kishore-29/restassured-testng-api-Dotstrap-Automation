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
| 1 | `POST /v1/accounts` | 201 | 449 | `qa-aa2d720c-8252-40ec-b09e-9de536331e07` |
| 2 | `POST /v1/auth/token` | 200 | 101 | `qa-c9d2b3cc-0283-4a9a-9808-76c7f40554fa` |
| 3 | `POST /v1/credits/purchases` | 400 | 33 | `qa-85d0da83-08e3-4ea4-a03b-f014161fc7e1` |
| 4 | `GET /v1/credits/balance` | 200 | 29 | `qa-e130f167-bbaf-4c18-9450-82e3a000dc84` |
| 5 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b3dfe5fc-c234-449a-ba1a-8ab9499285c1` |
| 6 | `POST /v1/auth/token` | 401 | 11 | `qa-ef633c64-b86e-45a5-8cec-e023cfe1a5dc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aa2d720c-8252-40ec-b09e-9de536331e07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa2d720c-8252-40ec-b09e-9de536331e07
Content-Type: application/json

--- request body ---
{"handle":"qa-8ac4d5ca1ed5","displayName":"QA 8ac4d5ca1ed5","password":"****","region":"eu"}

--- response: 201 in 449 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa2d720c-8252-40ec-b09e-9de536331e07
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
Location: /v1/accounts/qa-8ac4d5ca1ed5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a5854849-3e80-40be-b859-123b9f5ea49e","handle":"qa-8ac4d5ca1ed5","displayName":"QA 8ac4d5ca1ed5","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.904148350Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c9d2b3cc-0283-4a9a-9808-76c7f40554fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9d2b3cc-0283-4a9a-9808-76c7f40554fa
Content-Type: application/json

--- request body ---
{"handle":"qa-8ac4d5ca1ed5","password":"****"}

--- response: 200 in 101 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9d2b3cc-0283-4a9a-9808-76c7f40554fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a5854849-3e80-40be-b859-123b9f5ea49e"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-85d0da83-08e3-4ea4-a03b-f014161fc7e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85d0da83-08e3-4ea4-a03b-f014161fc7e1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 33 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85d0da83-08e3-4ea4-a03b-f014161fc7e1
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-85d0da83-08e3-4ea4-a03b-f014161fc7e1"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-e130f167-bbaf-4c18-9450-82e3a000dc84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e130f167-bbaf-4c18-9450-82e3a000dc84
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e130f167-bbaf-4c18-9450-82e3a000dc84
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

{"balance":5,"currency":"credits","accountId":"acc_a5854849-3e80-40be-b859-123b9f5ea49e"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b3dfe5fc-c234-449a-ba1a-8ab9499285c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3dfe5fc-c234-449a-ba1a-8ab9499285c1
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b3dfe5fc-c234-449a-ba1a-8ab9499285c1
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
correlation: qa-ef633c64-b86e-45a5-8cec-e023cfe1a5dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef633c64-b86e-45a5-8cec-e023cfe1a5dc
Content-Type: application/json

--- request body ---
{"handle":"qa-8ac4d5ca1ed5","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef633c64-b86e-45a5-8cec-e023cfe1a5dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ef633c64-b86e-45a5-8cec-e023cfe1a5dc"}
```
