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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-f3fb811f-6ad8-42d5-9852-5268a14d5c52` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-ea1f3c8a-2e3f-4621-9cf9-8fbdb51139c1` |
| 3 | `POST /v1/credits/purchases` | 400 | 15 | `qa-93e3fe92-ff38-4d36-92e4-8713a98c8e55` |
| 4 | `GET /v1/credits/balance` | 200 | 14 | `qa-34dcf8a7-68cc-4aff-845c-99ff82c27aa6` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-1802f1e7-9340-4fac-ad2b-1aa3df6d3a99` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-07f008e0-0bc6-490c-898f-348c40d2803d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f3fb811f-6ad8-42d5-9852-5268a14d5c52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3fb811f-6ad8-42d5-9852-5268a14d5c52
Content-Type: application/json

--- request body ---
{"handle":"qa-22a26b02f293","displayName":"QA 22a26b02f293","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3fb811f-6ad8-42d5-9852-5268a14d5c52
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
Location: /v1/accounts/qa-22a26b02f293
X-Served-Region: eu
Content-Length: 181

{"id":"acc_75ee2227-b86d-435f-b13a-6e2c119a157c","handle":"qa-22a26b02f293","displayName":"QA 22a26b02f293","region":"eu","role":"user","createdAt":"2026-11-19T10:29:20.734850978Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ea1f3c8a-2e3f-4621-9cf9-8fbdb51139c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea1f3c8a-2e3f-4621-9cf9-8fbdb51139c1
Content-Type: application/json

--- request body ---
{"handle":"qa-22a26b02f293","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea1f3c8a-2e3f-4621-9cf9-8fbdb51139c1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_75ee2227-b86d-435f-b13a-6e2c119a157c"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-93e3fe92-ff38-4d36-92e4-8713a98c8e55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93e3fe92-ff38-4d36-92e4-8713a98c8e55
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93e3fe92-ff38-4d36-92e4-8713a98c8e55
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-93e3fe92-ff38-4d36-92e4-8713a98c8e55"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-34dcf8a7-68cc-4aff-845c-99ff82c27aa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34dcf8a7-68cc-4aff-845c-99ff82c27aa6
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-34dcf8a7-68cc-4aff-845c-99ff82c27aa6
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

{"balance":5,"currency":"credits","accountId":"acc_75ee2227-b86d-435f-b13a-6e2c119a157c"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1802f1e7-9340-4fac-ad2b-1aa3df6d3a99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1802f1e7-9340-4fac-ad2b-1aa3df6d3a99
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1802f1e7-9340-4fac-ad2b-1aa3df6d3a99
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
correlation: qa-07f008e0-0bc6-490c-898f-348c40d2803d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07f008e0-0bc6-490c-898f-348c40d2803d
Content-Type: application/json

--- request body ---
{"handle":"qa-22a26b02f293","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07f008e0-0bc6-490c-898f-348c40d2803d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-07f008e0-0bc6-490c-898f-348c40d2803d"}
```
