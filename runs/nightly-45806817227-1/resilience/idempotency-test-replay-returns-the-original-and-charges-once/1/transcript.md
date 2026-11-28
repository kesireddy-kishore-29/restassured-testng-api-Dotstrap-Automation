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
| 1 | `POST /v1/accounts` | 201 | 293 | `qa-d3321cab-aaa6-4387-a5eb-68b886a0cb93` |
| 2 | `POST /v1/auth/token` | 200 | 35 | `qa-fbdbd6cf-9638-4d0f-b942-2beced233397` |
| 3 | `POST /v1/credits/purchases` | 201 | 37 | `qa-6cca4311-1aea-4184-8635-8ef693a815e9` |
| 4 | `POST /v1/credits/purchases` | 200 | 9 | `qa-5ae6e0a4-e7e1-4b11-b0f4-a5b867da0a11` |
| 5 | `GET /v1/credits/balance` | 200 | 27 | `qa-b017cf5c-9403-47e3-baf4-ea6d8693fde5` |
| 6 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-fffa8c92-dadb-4cb6-a1d8-b97f797a107e` |
| 7 | `POST /v1/auth/token` | 401 | 9 | `qa-d74aadd0-aaa8-4c8e-8cf3-f8b06fe4eff5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d3321cab-aaa6-4387-a5eb-68b886a0cb93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3321cab-aaa6-4387-a5eb-68b886a0cb93
Content-Type: application/json

--- request body ---
{"handle":"qa-f08ac35c25c0","displayName":"QA f08ac35c25c0","password":"****","region":"eu"}

--- response: 201 in 293 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3321cab-aaa6-4387-a5eb-68b886a0cb93
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
Location: /v1/accounts/qa-f08ac35c25c0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9228e87-0a89-4a7c-88a7-38f1ae1fe2ee","handle":"qa-f08ac35c25c0","displayName":"QA f08ac35c25c0","region":"eu","role":"user","createdAt":"2026-11-26T11:02:29.566721016Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fbdbd6cf-9638-4d0f-b942-2beced233397

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbdbd6cf-9638-4d0f-b942-2beced233397
Content-Type: application/json

--- request body ---
{"handle":"qa-f08ac35c25c0","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbdbd6cf-9638-4d0f-b942-2beced233397
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9228e87-0a89-4a7c-88a7-38f1ae1fe2ee"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6cca4311-1aea-4184-8635-8ef693a815e9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1be4fa485d76449dbc0b486713b810cd
X-Correlation-Id: qa-6cca4311-1aea-4184-8635-8ef693a815e9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 37 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cca4311-1aea-4184-8635-8ef693a815e9
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
Location: /v1/credits/purchases/pur_87e7007f-74d9-42fa-973e-ef905079f24f
Content-Length: 144

{"id":"pur_87e7007f-74d9-42fa-973e-ef905079f24f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-26T11:02:29.943142935Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5ae6e0a4-e7e1-4b11-b0f4-a5b867da0a11

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1be4fa485d76449dbc0b486713b810cd
X-Correlation-Id: qa-5ae6e0a4-e7e1-4b11-b0f4-a5b867da0a11
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ae6e0a4-e7e1-4b11-b0f4-a5b867da0a11
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
Location: /v1/credits/purchases/pur_87e7007f-74d9-42fa-973e-ef905079f24f
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_87e7007f-74d9-42fa-973e-ef905079f24f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-26T11:02:29.943142935Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-b017cf5c-9403-47e3-baf4-ea6d8693fde5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b017cf5c-9403-47e3-baf4-ea6d8693fde5
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b017cf5c-9403-47e3-baf4-ea6d8693fde5
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

{"balance":15,"currency":"credits","accountId":"acc_e9228e87-0a89-4a7c-88a7-38f1ae1fe2ee"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fffa8c92-dadb-4cb6-a1d8-b97f797a107e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fffa8c92-dadb-4cb6-a1d8-b97f797a107e
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fffa8c92-dadb-4cb6-a1d8-b97f797a107e
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
correlation: qa-d74aadd0-aaa8-4c8e-8cf3-f8b06fe4eff5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d74aadd0-aaa8-4c8e-8cf3-f8b06fe4eff5
Content-Type: application/json

--- request body ---
{"handle":"qa-f08ac35c25c0","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d74aadd0-aaa8-4c8e-8cf3-f8b06fe4eff5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d74aadd0-aaa8-4c8e-8cf3-f8b06fe4eff5"}
```
