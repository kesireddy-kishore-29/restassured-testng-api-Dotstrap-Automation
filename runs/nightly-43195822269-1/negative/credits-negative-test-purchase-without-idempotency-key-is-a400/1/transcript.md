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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-943f7fbf-70c8-4627-b0f6-0ce77f620884` |
| 2 | `POST /v1/auth/token` | 200 | 30 | `qa-6a433d2e-f495-4570-94a1-abf807ef1ff9` |
| 3 | `POST /v1/credits/purchases` | 400 | 11 | `qa-00922a9b-e64e-432f-aa82-cd29242042f3` |
| 4 | `GET /v1/credits/balance` | 200 | 17 | `qa-ff10c834-c85a-430f-a20c-c2006f333045` |
| 5 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-18b86284-ceb3-4173-932b-b724aa0ebec3` |
| 6 | `POST /v1/auth/token` | 401 | 16 | `qa-67110571-1e9f-4381-b2a0-eb78e55ec9f0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-943f7fbf-70c8-4627-b0f6-0ce77f620884

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-943f7fbf-70c8-4627-b0f6-0ce77f620884
Content-Type: application/json

--- request body ---
{"handle":"qa-d52e084bf5a4","displayName":"QA d52e084bf5a4","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-943f7fbf-70c8-4627-b0f6-0ce77f620884
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
Location: /v1/accounts/qa-d52e084bf5a4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5237583b-8f17-4c91-9062-3c5df119e16d","handle":"qa-d52e084bf5a4","displayName":"QA d52e084bf5a4","region":"eu","role":"user","createdAt":"2026-11-12T09:56:42.400868469Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6a433d2e-f495-4570-94a1-abf807ef1ff9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a433d2e-f495-4570-94a1-abf807ef1ff9
Content-Type: application/json

--- request body ---
{"handle":"qa-d52e084bf5a4","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a433d2e-f495-4570-94a1-abf807ef1ff9
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5237583b-8f17-4c91-9062-3c5df119e16d"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-00922a9b-e64e-432f-aa82-cd29242042f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00922a9b-e64e-432f-aa82-cd29242042f3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00922a9b-e64e-432f-aa82-cd29242042f3
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-00922a9b-e64e-432f-aa82-cd29242042f3"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-ff10c834-c85a-430f-a20c-c2006f333045

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff10c834-c85a-430f-a20c-c2006f333045
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff10c834-c85a-430f-a20c-c2006f333045
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

{"balance":5,"currency":"credits","accountId":"acc_5237583b-8f17-4c91-9062-3c5df119e16d"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-18b86284-ceb3-4173-932b-b724aa0ebec3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18b86284-ceb3-4173-932b-b724aa0ebec3
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-18b86284-ceb3-4173-932b-b724aa0ebec3
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
correlation: qa-67110571-1e9f-4381-b2a0-eb78e55ec9f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67110571-1e9f-4381-b2a0-eb78e55ec9f0
Content-Type: application/json

--- request body ---
{"handle":"qa-d52e084bf5a4","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67110571-1e9f-4381-b2a0-eb78e55ec9f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67110571-1e9f-4381-b2a0-eb78e55ec9f0"}
```
