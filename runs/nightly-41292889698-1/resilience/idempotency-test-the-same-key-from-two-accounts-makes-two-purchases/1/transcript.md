# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-c9dc0eea-a968-48a1-91d4-1e054e4d4f69` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-b41d9886-b888-432e-936c-83fed505f1cb` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-d6ba5a1d-eccf-4176-8a1e-c666f1aa2ad8` |
| 4 | `POST /v1/credits/purchases` | 201 | 9 | `qa-1ad0642d-9025-4827-afb3-a47a3a1efa28` |
| 5 | `POST /v1/auth/token` | 200 | 28 | `qa-ababb80d-c9be-4894-8bad-e83965cce932` |
| 6 | `POST /v1/credits/purchases` | 201 | 7 | `qa-33a36411-51ef-40ab-b3ff-4e6cd19d4ce6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-6c6f152b-f716-4e97-a3f1-b13f633c9fe2` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-2f61cd29-931c-4512-890a-6c97300b9cad` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-0c75786a-937f-485e-909c-094f6f1438b3` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-b89eb0c6-f148-47af-976d-7c746f6e0b5f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c9dc0eea-a968-48a1-91d4-1e054e4d4f69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9dc0eea-a968-48a1-91d4-1e054e4d4f69
Content-Type: application/json

--- request body ---
{"handle":"qa-f39451087265","displayName":"QA f39451087265","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9dc0eea-a968-48a1-91d4-1e054e4d4f69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 8
Location: /v1/accounts/qa-f39451087265
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bc7fd542-c516-49d6-bef4-68aa47dc3c61","handle":"qa-f39451087265","displayName":"QA f39451087265","region":"eu","role":"user","createdAt":"2026-11-01T09:23:31.290690705Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b41d9886-b888-432e-936c-83fed505f1cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b41d9886-b888-432e-936c-83fed505f1cb
Content-Type: application/json

--- request body ---
{"handle":"qa-27e758f73c82","displayName":"QA 27e758f73c82","password":"****","region":"us"}

--- response: 201 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-b41d9886-b888-432e-936c-83fed505f1cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 8
Location: /v1/accounts/qa-27e758f73c82
X-Served-Region: us
Content-Length: 181

{"id":"acc_387f31bd-17a8-4c93-aede-fa7ac604d65f","handle":"qa-27e758f73c82","displayName":"QA 27e758f73c82","region":"us","role":"user","createdAt":"2026-11-01T09:23:31.318937598Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d6ba5a1d-eccf-4176-8a1e-c666f1aa2ad8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6ba5a1d-eccf-4176-8a1e-c666f1aa2ad8
Content-Type: application/json

--- request body ---
{"handle":"qa-f39451087265","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6ba5a1d-eccf-4176-8a1e-c666f1aa2ad8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bc7fd542-c516-49d6-bef4-68aa47dc3c61"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1ad0642d-9025-4827-afb3-a47a3a1efa28

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e06b029896e8432bad453d0b8a28537f
X-Correlation-Id: qa-1ad0642d-9025-4827-afb3-a47a3a1efa28
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ad0642d-9025-4827-afb3-a47a3a1efa28
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
Location: /v1/credits/purchases/pur_38ddb8ea-5ea5-4035-8783-79525fde304c
Content-Length: 144

{"id":"pur_38ddb8ea-5ea5-4035-8783-79525fde304c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-01T09:23:31.379684078Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ababb80d-c9be-4894-8bad-e83965cce932

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ababb80d-c9be-4894-8bad-e83965cce932
Content-Type: application/json

--- request body ---
{"handle":"qa-27e758f73c82","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ababb80d-c9be-4894-8bad-e83965cce932
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_387f31bd-17a8-4c93-aede-fa7ac604d65f"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-33a36411-51ef-40ab-b3ff-4e6cd19d4ce6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e06b029896e8432bad453d0b8a28537f
X-Correlation-Id: qa-33a36411-51ef-40ab-b3ff-4e6cd19d4ce6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-33a36411-51ef-40ab-b3ff-4e6cd19d4ce6
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_99006ca5-46cb-40c1-a70a-4fa44c7f7e03
Content-Length: 144

{"id":"pur_99006ca5-46cb-40c1-a70a-4fa44c7f7e03","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-01T09:23:31.442057558Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c6f152b-f716-4e97-a3f1-b13f633c9fe2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c6f152b-f716-4e97-a3f1-b13f633c9fe2
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c6f152b-f716-4e97-a3f1-b13f633c9fe2
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
X-Served-Region: us
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-2f61cd29-931c-4512-890a-6c97300b9cad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f61cd29-931c-4512-890a-6c97300b9cad
Content-Type: application/json

--- request body ---
{"handle":"qa-27e758f73c82","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f61cd29-931c-4512-890a-6c97300b9cad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2f61cd29-931c-4512-890a-6c97300b9cad"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c75786a-937f-485e-909c-094f6f1438b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c75786a-937f-485e-909c-094f6f1438b3
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c75786a-937f-485e-909c-094f6f1438b3
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b89eb0c6-f148-47af-976d-7c746f6e0b5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b89eb0c6-f148-47af-976d-7c746f6e0b5f
Content-Type: application/json

--- request body ---
{"handle":"qa-f39451087265","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b89eb0c6-f148-47af-976d-7c746f6e0b5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b89eb0c6-f148-47af-976d-7c746f6e0b5f"}
```
