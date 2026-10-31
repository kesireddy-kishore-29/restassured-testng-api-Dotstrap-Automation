# Transcript: Same key + different body is a 409 and charges nothing

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#reusingAKeyForADifferentPurchaseIsRefused` |
| Features | FEAT-IDEMP-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-62b442f3-3a96-4d8d-a758-526adbf71a70` |
| 2 | `POST /v1/auth/token` | 200 | 8 | `qa-4aa93001-3798-44b8-8ce4-820b870eeb09` |
| 3 | `POST /v1/credits/purchases` | 201 | 7 | `qa-20c6e508-c1ae-498e-be24-07d5ac3186fd` |
| 4 | `POST /v1/credits/purchases` | 409 | 6 | `qa-e44350b1-041e-4f68-b795-fb4a892c49d7` |
| 5 | `GET /v1/credits/balance` | 200 | 12 | `qa-f6c3577c-fd9d-4681-a8db-5f4c337f5525` |
| 6 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-65bef7f6-b165-410d-addd-a8f0b45645fc` |
| 7 | `POST /v1/auth/token` | 401 | 10 | `qa-86eff171-ca8e-488d-bc65-bbfb6501d62a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-62b442f3-3a96-4d8d-a758-526adbf71a70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62b442f3-3a96-4d8d-a758-526adbf71a70
Content-Type: application/json

--- request body ---
{"handle":"qa-1843768f24f8","displayName":"QA 1843768f24f8","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-62b442f3-3a96-4d8d-a758-526adbf71a70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Location: /v1/accounts/qa-1843768f24f8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_296920e9-2863-40a0-86cf-ce40e052f962","handle":"qa-1843768f24f8","displayName":"QA 1843768f24f8","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.882652493Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4aa93001-3798-44b8-8ce4-820b870eeb09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aa93001-3798-44b8-8ce4-820b870eeb09
Content-Type: application/json

--- request body ---
{"handle":"qa-1843768f24f8","password":"****"}

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4aa93001-3798-44b8-8ce4-820b870eeb09
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_296920e9-2863-40a0-86cf-ce40e052f962"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-20c6e508-c1ae-498e-be24-07d5ac3186fd

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2c47ecde8d3f45979e4f8e6bafffdab0
X-Correlation-Id: qa-20c6e508-c1ae-498e-be24-07d5ac3186fd
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-20c6e508-c1ae-498e-be24-07d5ac3186fd
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
Location: /v1/credits/purchases/pur_37ed70b7-1571-47ea-9287-22585451184a
Content-Length: 144

{"id":"pur_37ed70b7-1571-47ea-9287-22585451184a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-29T08:38:57.912041737Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e44350b1-041e-4f68-b795-fb4a892c49d7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2c47ecde8d3f45979e4f8e6bafffdab0
X-Correlation-Id: qa-e44350b1-041e-4f68-b795-fb4a892c49d7
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e44350b1-041e-4f68-b795-fb4a892c49d7
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
Content-Length: 334

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-e44350b1-041e-4f68-b795-fb4a892c49d7"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-f6c3577c-fd9d-4681-a8db-5f4c337f5525

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6c3577c-fd9d-4681-a8db-5f4c337f5525
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6c3577c-fd9d-4681-a8db-5f4c337f5525
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

{"balance":15,"currency":"credits","accountId":"acc_296920e9-2863-40a0-86cf-ce40e052f962"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-65bef7f6-b165-410d-addd-a8f0b45645fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65bef7f6-b165-410d-addd-a8f0b45645fc
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-65bef7f6-b165-410d-addd-a8f0b45645fc
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
correlation: qa-86eff171-ca8e-488d-bc65-bbfb6501d62a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86eff171-ca8e-488d-bc65-bbfb6501d62a
Content-Type: application/json

--- request body ---
{"handle":"qa-1843768f24f8","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-86eff171-ca8e-488d-bc65-bbfb6501d62a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-86eff171-ca8e-488d-bc65-bbfb6501d62a"}
```
