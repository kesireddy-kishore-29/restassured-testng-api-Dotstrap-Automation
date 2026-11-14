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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-016007da-2ba2-421d-a8cb-0f744173cf52` |
| 2 | `POST /v1/auth/token` | 200 | 30 | `qa-6cb149a3-0061-4e3b-9044-d85bb99ff583` |
| 3 | `POST /v1/credits/purchases` | 400 | 27 | `qa-8d86b771-f168-4dfd-a527-55b83b150db1` |
| 4 | `GET /v1/credits/balance` | 200 | 19 | `qa-f0a0dd85-e50a-4e33-9982-f292c30a1140` |
| 5 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-1c0caee3-a8a2-4c05-9835-c9bebc02675c` |
| 6 | `POST /v1/auth/token` | 401 | 10 | `qa-8710de89-3c6c-4d0a-a829-308af053a705` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-016007da-2ba2-421d-a8cb-0f744173cf52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-016007da-2ba2-421d-a8cb-0f744173cf52
Content-Type: application/json

--- request body ---
{"handle":"qa-7f77370fe7e1","displayName":"QA 7f77370fe7e1","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-016007da-2ba2-421d-a8cb-0f744173cf52
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
Location: /v1/accounts/qa-7f77370fe7e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_53cf6bc9-89ec-45e8-881e-8ac875278ac9","handle":"qa-7f77370fe7e1","displayName":"QA 7f77370fe7e1","region":"eu","role":"user","createdAt":"2026-11-10T09:59:47.754364951Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6cb149a3-0061-4e3b-9044-d85bb99ff583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cb149a3-0061-4e3b-9044-d85bb99ff583
Content-Type: application/json

--- request body ---
{"handle":"qa-7f77370fe7e1","password":"****"}

--- response: 200 in 30 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cb149a3-0061-4e3b-9044-d85bb99ff583
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_53cf6bc9-89ec-45e8-881e-8ac875278ac9"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8d86b771-f168-4dfd-a527-55b83b150db1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d86b771-f168-4dfd-a527-55b83b150db1
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 27 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d86b771-f168-4dfd-a527-55b83b150db1
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

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-8d86b771-f168-4dfd-a527-55b83b150db1"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-f0a0dd85-e50a-4e33-9982-f292c30a1140

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0a0dd85-e50a-4e33-9982-f292c30a1140
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0a0dd85-e50a-4e33-9982-f292c30a1140
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

{"balance":5,"currency":"credits","accountId":"acc_53cf6bc9-89ec-45e8-881e-8ac875278ac9"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1c0caee3-a8a2-4c05-9835-c9bebc02675c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c0caee3-a8a2-4c05-9835-c9bebc02675c
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1c0caee3-a8a2-4c05-9835-c9bebc02675c
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
correlation: qa-8710de89-3c6c-4d0a-a829-308af053a705

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8710de89-3c6c-4d0a-a829-308af053a705
Content-Type: application/json

--- request body ---
{"handle":"qa-7f77370fe7e1","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8710de89-3c6c-4d0a-a829-308af053a705
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8710de89-3c6c-4d0a-a829-308af053a705"}
```
