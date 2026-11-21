# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-18e026fc-1f02-450e-82fb-b668b7c12d0a` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-259327e5-ae93-4804-8719-680ee21eb463` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-d9e5b469-af29-48a2-ab40-69b2a6f2c156` |
| 4 | `POST /v1/auth/token` | 200 | 14 | `qa-84e86a09-32c8-4eeb-86e7-cd37b284fdeb` |
| 5 | `GET /v1/accounts/me` | 200 | 15 | `qa-17accc10-05e9-452c-a978-f0d352b74619` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 19 | `qa-7d26d837-249d-4445-9f49-df5086bf604c` |
| 7 | `POST /v1/auth/token` | 200 | 10 | `qa-7d7e6bdd-aa6c-4722-a079-0c781a58c0bc` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-43adcf5b-0ddf-4baf-827a-84ecfb957bfc` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-86b338df-be5a-4a44-8793-27b8645d564b` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-cddb92cc-8933-4efd-a5b0-83ae4067fcd4` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-69d6d290-1a68-442b-80f0-e6700534f8d0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-18e026fc-1f02-450e-82fb-b668b7c12d0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18e026fc-1f02-450e-82fb-b668b7c12d0a
Content-Type: application/json

--- request body ---
{"handle":"qa-779e68c765a3","displayName":"QA 779e68c765a3","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-18e026fc-1f02-450e-82fb-b668b7c12d0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-779e68c765a3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_728d38aa-044f-4b09-bc14-38b0372507b3","handle":"qa-779e68c765a3","displayName":"QA 779e68c765a3","region":"eu","role":"user","createdAt":"2026-11-21T09:57:07.476690326Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-259327e5-ae93-4804-8719-680ee21eb463

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-259327e5-ae93-4804-8719-680ee21eb463
Content-Type: application/json

--- request body ---
{"handle":"qa-ce0f93f30b23","displayName":"QA ce0f93f30b23","password":"****","region":"us"}

--- response: 201 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-259327e5-ae93-4804-8719-680ee21eb463
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Location: /v1/accounts/qa-ce0f93f30b23
X-Served-Region: us
Content-Length: 181

{"id":"acc_f5d24291-27c8-4644-9ed3-0ba0303ef072","handle":"qa-ce0f93f30b23","displayName":"QA ce0f93f30b23","region":"us","role":"user","createdAt":"2026-11-21T09:57:07.516090111Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d9e5b469-af29-48a2-ab40-69b2a6f2c156

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9e5b469-af29-48a2-ab40-69b2a6f2c156
Content-Type: application/json

--- request body ---
{"handle":"qa-779e68c765a3","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9e5b469-af29-48a2-ab40-69b2a6f2c156
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_728d38aa-044f-4b09-bc14-38b0372507b3"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-84e86a09-32c8-4eeb-86e7-cd37b284fdeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84e86a09-32c8-4eeb-86e7-cd37b284fdeb
Content-Type: application/json

--- request body ---
{"handle":"qa-779e68c765a3","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-84e86a09-32c8-4eeb-86e7-cd37b284fdeb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_728d38aa-044f-4b09-bc14-38b0372507b3"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-17accc10-05e9-452c-a978-f0d352b74619

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17accc10-05e9-452c-a978-f0d352b74619
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-17accc10-05e9-452c-a978-f0d352b74619
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
Content-Length: 181

{"id":"acc_728d38aa-044f-4b09-bc14-38b0372507b3","handle":"qa-779e68c765a3","displayName":"QA 779e68c765a3","region":"eu","role":"user","createdAt":"2026-11-21T09:57:07.476690326Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-ce0f93f30b23
correlation: qa-7d26d837-249d-4445-9f49-df5086bf604c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d26d837-249d-4445-9f49-df5086bf604c
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d26d837-249d-4445-9f49-df5086bf604c
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
Content-Length: 74

{"handle":"qa-ce0f93f30b23","displayName":"QA ce0f93f30b23","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-7d7e6bdd-aa6c-4722-a079-0c781a58c0bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d7e6bdd-aa6c-4722-a079-0c781a58c0bc
Content-Type: application/json

--- request body ---
{"handle":"qa-ce0f93f30b23","password":"****"}

--- response: 200 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d7e6bdd-aa6c-4722-a079-0c781a58c0bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f5d24291-27c8-4644-9ed3-0ba0303ef072"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43adcf5b-0ddf-4baf-827a-84ecfb957bfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43adcf5b-0ddf-4baf-827a-84ecfb957bfc
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43adcf5b-0ddf-4baf-827a-84ecfb957bfc
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
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-86b338df-be5a-4a44-8793-27b8645d564b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86b338df-be5a-4a44-8793-27b8645d564b
Content-Type: application/json

--- request body ---
{"handle":"qa-ce0f93f30b23","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-86b338df-be5a-4a44-8793-27b8645d564b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-86b338df-be5a-4a44-8793-27b8645d564b"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cddb92cc-8933-4efd-a5b0-83ae4067fcd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cddb92cc-8933-4efd-a5b0-83ae4067fcd4
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cddb92cc-8933-4efd-a5b0-83ae4067fcd4
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-69d6d290-1a68-442b-80f0-e6700534f8d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69d6d290-1a68-442b-80f0-e6700534f8d0
Content-Type: application/json

--- request body ---
{"handle":"qa-779e68c765a3","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69d6d290-1a68-442b-80f0-e6700534f8d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-69d6d290-1a68-442b-80f0-e6700534f8d0"}
```
