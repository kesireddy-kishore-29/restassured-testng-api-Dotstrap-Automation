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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-54d8d5d6-198f-4ca8-8f8a-17e085a550ad` |
| 2 | `POST /v1/auth/token` | 200 | 13 | `qa-f6fc8472-40d3-42fb-96c7-e0ae36491de6` |
| 3 | `POST /v1/credits/purchases` | 400 | 16 | `qa-349ef4cf-9000-49dc-b067-8e6d0ffeeab7` |
| 4 | `GET /v1/credits/balance` | 200 | 13 | `qa-68bd53a4-d110-4fa0-8868-7e2bf149710b` |
| 5 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-446f6bbf-08a0-4eb2-8ae4-7eea45f363b3` |
| 6 | `POST /v1/auth/token` | 401 | 4 | `qa-2a0f5e1b-a235-4125-bd94-9aeedd85adcf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-54d8d5d6-198f-4ca8-8f8a-17e085a550ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54d8d5d6-198f-4ca8-8f8a-17e085a550ad
Content-Type: application/json

--- request body ---
{"handle":"qa-34a4cc2cef30","displayName":"QA 34a4cc2cef30","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-54d8d5d6-198f-4ca8-8f8a-17e085a550ad
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
Location: /v1/accounts/qa-34a4cc2cef30
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aac28e53-e1a5-40b0-ba03-4fcc2d2f2b9f","handle":"qa-34a4cc2cef30","displayName":"QA 34a4cc2cef30","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.310135872Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f6fc8472-40d3-42fb-96c7-e0ae36491de6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6fc8472-40d3-42fb-96c7-e0ae36491de6
Content-Type: application/json

--- request body ---
{"handle":"qa-34a4cc2cef30","password":"****"}

--- response: 200 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6fc8472-40d3-42fb-96c7-e0ae36491de6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aac28e53-e1a5-40b0-ba03-4fcc2d2f2b9f"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-349ef4cf-9000-49dc-b067-8e6d0ffeeab7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-349ef4cf-9000-49dc-b067-8e6d0ffeeab7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-349ef4cf-9000-49dc-b067-8e6d0ffeeab7
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-349ef4cf-9000-49dc-b067-8e6d0ffeeab7"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-68bd53a4-d110-4fa0-8868-7e2bf149710b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68bd53a4-d110-4fa0-8868-7e2bf149710b
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-68bd53a4-d110-4fa0-8868-7e2bf149710b
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

{"balance":5,"currency":"credits","accountId":"acc_aac28e53-e1a5-40b0-ba03-4fcc2d2f2b9f"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-446f6bbf-08a0-4eb2-8ae4-7eea45f363b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-446f6bbf-08a0-4eb2-8ae4-7eea45f363b3
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-446f6bbf-08a0-4eb2-8ae4-7eea45f363b3
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
correlation: qa-2a0f5e1b-a235-4125-bd94-9aeedd85adcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a0f5e1b-a235-4125-bd94-9aeedd85adcf
Content-Type: application/json

--- request body ---
{"handle":"qa-34a4cc2cef30","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a0f5e1b-a235-4125-bd94-9aeedd85adcf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2a0f5e1b-a235-4125-bd94-9aeedd85adcf"}
```
