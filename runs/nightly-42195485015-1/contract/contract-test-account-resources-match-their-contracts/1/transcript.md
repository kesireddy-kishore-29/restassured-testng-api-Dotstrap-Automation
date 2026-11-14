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
| 1 | `POST /v1/accounts` | 201 | 397 | `qa-b5545ea9-4fdd-4ed2-a7fd-007893edde94` |
| 2 | `POST /v1/accounts` | 201 | 86 | `qa-6d83c4b8-7cdb-4199-aa59-9faccf4534cd` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-269c32f7-57db-4ed9-b176-be8212dcc451` |
| 4 | `POST /v1/auth/token` | 200 | 35 | `qa-73755bb6-2721-443e-ad8a-be3254457c52` |
| 5 | `GET /v1/accounts/me` | 200 | 51 | `qa-dd6de232-d4e4-4fc3-a3c9-3cf3beea64e3` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 44 | `qa-87743c6b-101e-416e-be2f-0da8f49c3285` |
| 7 | `POST /v1/auth/token` | 200 | 16 | `qa-da1300c0-b40b-4133-9224-8acad03e853e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-d8b489c8-8d40-409c-a87a-ea93159510e3` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-432dae1e-a8be-4814-9a9a-7eb7843527ce` |
| 10 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-d259b1dd-a343-4004-8150-02a2c566d3f3` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-860d4e24-12d6-4ac6-bad6-b9a36377ab0e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b5545ea9-4fdd-4ed2-a7fd-007893edde94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5545ea9-4fdd-4ed2-a7fd-007893edde94
Content-Type: application/json

--- request body ---
{"handle":"qa-7ff8dd100489","displayName":"QA 7ff8dd100489","password":"****","region":"eu"}

--- response: 201 in 397 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5545ea9-4fdd-4ed2-a7fd-007893edde94
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
Location: /v1/accounts/qa-7ff8dd100489
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8f21098c-17b4-4c09-8a0f-0044cde039f5","handle":"qa-7ff8dd100489","displayName":"QA 7ff8dd100489","region":"eu","role":"user","createdAt":"2026-11-06T09:30:38.781635773Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6d83c4b8-7cdb-4199-aa59-9faccf4534cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d83c4b8-7cdb-4199-aa59-9faccf4534cd
Content-Type: application/json

--- request body ---
{"handle":"qa-7c26afdfdde9","displayName":"QA 7c26afdfdde9","password":"****","region":"us"}

--- response: 201 in 86 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d83c4b8-7cdb-4199-aa59-9faccf4534cd
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
Location: /v1/accounts/qa-7c26afdfdde9
X-Served-Region: us
Content-Length: 181

{"id":"acc_eb636d48-f93d-4d7e-af76-3f36e5adaf04","handle":"qa-7c26afdfdde9","displayName":"QA 7c26afdfdde9","region":"us","role":"user","createdAt":"2026-11-06T09:30:39.263302816Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-269c32f7-57db-4ed9-b176-be8212dcc451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-269c32f7-57db-4ed9-b176-be8212dcc451
Content-Type: application/json

--- request body ---
{"handle":"qa-7ff8dd100489","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-269c32f7-57db-4ed9-b176-be8212dcc451
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8f21098c-17b4-4c09-8a0f-0044cde039f5"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-73755bb6-2721-443e-ad8a-be3254457c52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73755bb6-2721-443e-ad8a-be3254457c52
Content-Type: application/json

--- request body ---
{"handle":"qa-7ff8dd100489","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-73755bb6-2721-443e-ad8a-be3254457c52
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8f21098c-17b4-4c09-8a0f-0044cde039f5"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-dd6de232-d4e4-4fc3-a3c9-3cf3beea64e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd6de232-d4e4-4fc3-a3c9-3cf3beea64e3
Content-Type: application/json

--- response: 200 in 51 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd6de232-d4e4-4fc3-a3c9-3cf3beea64e3
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

{"id":"acc_8f21098c-17b4-4c09-8a0f-0044cde039f5","handle":"qa-7ff8dd100489","displayName":"QA 7ff8dd100489","region":"eu","role":"user","createdAt":"2026-11-06T09:30:38.781635773Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-7c26afdfdde9
correlation: qa-87743c6b-101e-416e-be2f-0da8f49c3285

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87743c6b-101e-416e-be2f-0da8f49c3285
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-87743c6b-101e-416e-be2f-0da8f49c3285
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

{"handle":"qa-7c26afdfdde9","displayName":"QA 7c26afdfdde9","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-da1300c0-b40b-4133-9224-8acad03e853e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da1300c0-b40b-4133-9224-8acad03e853e
Content-Type: application/json

--- request body ---
{"handle":"qa-7c26afdfdde9","password":"****"}

--- response: 200 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-da1300c0-b40b-4133-9224-8acad03e853e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb636d48-f93d-4d7e-af76-3f36e5adaf04"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d8b489c8-8d40-409c-a87a-ea93159510e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8b489c8-8d40-409c-a87a-ea93159510e3
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d8b489c8-8d40-409c-a87a-ea93159510e3
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
correlation: qa-432dae1e-a8be-4814-9a9a-7eb7843527ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-432dae1e-a8be-4814-9a9a-7eb7843527ce
Content-Type: application/json

--- request body ---
{"handle":"qa-7c26afdfdde9","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-432dae1e-a8be-4814-9a9a-7eb7843527ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-432dae1e-a8be-4814-9a9a-7eb7843527ce"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d259b1dd-a343-4004-8150-02a2c566d3f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d259b1dd-a343-4004-8150-02a2c566d3f3
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d259b1dd-a343-4004-8150-02a2c566d3f3
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
correlation: qa-860d4e24-12d6-4ac6-bad6-b9a36377ab0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-860d4e24-12d6-4ac6-bad6-b9a36377ab0e
Content-Type: application/json

--- request body ---
{"handle":"qa-7ff8dd100489","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-860d4e24-12d6-4ac6-bad6-b9a36377ab0e
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-860d4e24-12d6-4ac6-bad6-b9a36377ab0e"}
```
