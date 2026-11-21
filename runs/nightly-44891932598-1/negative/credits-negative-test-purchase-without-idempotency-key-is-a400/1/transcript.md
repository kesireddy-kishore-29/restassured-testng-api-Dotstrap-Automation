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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-2bfd8236-ce0d-4d4c-82e6-60cb07852f45` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-5bc11f66-0ad1-4105-b8e8-088406f98731` |
| 3 | `POST /v1/credits/purchases` | 400 | 7 | `qa-6f95f9f7-c5b1-4778-a85c-61170dc677eb` |
| 4 | `GET /v1/credits/balance` | 200 | 12 | `qa-09507956-6d69-4db4-9f79-3f1e0691d0ad` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-5e1564d2-e364-4895-93d0-8e95a725f4f7` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-2489ea47-439b-4de7-836c-a61afd7b6a1f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2bfd8236-ce0d-4d4c-82e6-60cb07852f45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bfd8236-ce0d-4d4c-82e6-60cb07852f45
Content-Type: application/json

--- request body ---
{"handle":"qa-79fd6e919469","displayName":"QA 79fd6e919469","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bfd8236-ce0d-4d4c-82e6-60cb07852f45
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
Location: /v1/accounts/qa-79fd6e919469
X-Served-Region: eu
Content-Length: 181

{"id":"acc_090179fe-d84f-4c73-8499-2ed42d7e2ba8","handle":"qa-79fd6e919469","displayName":"QA 79fd6e919469","region":"eu","role":"user","createdAt":"2026-11-21T09:56:59.939572870Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5bc11f66-0ad1-4105-b8e8-088406f98731

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bc11f66-0ad1-4105-b8e8-088406f98731
Content-Type: application/json

--- request body ---
{"handle":"qa-79fd6e919469","password":"****"}

--- response: 200 in 15 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bc11f66-0ad1-4105-b8e8-088406f98731
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_090179fe-d84f-4c73-8499-2ed42d7e2ba8"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6f95f9f7-c5b1-4778-a85c-61170dc677eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f95f9f7-c5b1-4778-a85c-61170dc677eb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 7 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f95f9f7-c5b1-4778-a85c-61170dc677eb
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-6f95f9f7-c5b1-4778-a85c-61170dc677eb"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-09507956-6d69-4db4-9f79-3f1e0691d0ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09507956-6d69-4db4-9f79-3f1e0691d0ad
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-09507956-6d69-4db4-9f79-3f1e0691d0ad
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

{"balance":5,"currency":"credits","accountId":"acc_090179fe-d84f-4c73-8499-2ed42d7e2ba8"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e1564d2-e364-4895-93d0-8e95a725f4f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e1564d2-e364-4895-93d0-8e95a725f4f7
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e1564d2-e364-4895-93d0-8e95a725f4f7
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
correlation: qa-2489ea47-439b-4de7-836c-a61afd7b6a1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2489ea47-439b-4de7-836c-a61afd7b6a1f
Content-Type: application/json

--- request body ---
{"handle":"qa-79fd6e919469","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2489ea47-439b-4de7-836c-a61afd7b6a1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2489ea47-439b-4de7-836c-a61afd7b6a1f"}
```
