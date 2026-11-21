# Transcript: A new display name is stored and returned

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#displayNameChangeIsPersisted` |
| Features | FEAT-ACCT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 475 | `qa-0e1d2833-915c-4a8f-a967-9d5563ecda01` |
| 2 | `POST /v1/auth/token` | 200 | 45 | `qa-16516cc1-5dc0-43fe-b8cb-0ce08a9683c0` |
| 3 | `PATCH /v1/accounts/me` | 200 | 60 | `qa-92367d2e-b71d-4155-b663-e75c4701002c` |
| 4 | `GET /v1/accounts/me` | 200 | 18 | `qa-f042a0f6-7ca3-4f05-a428-58fbb740fc4f` |
| 5 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-7bbd0f77-22d6-4d32-a0cc-3d1af501033d` |
| 6 | `POST /v1/auth/token` | 401 | 33 | `qa-a77426a5-cdf7-453c-ad04-641988048481` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0e1d2833-915c-4a8f-a967-9d5563ecda01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e1d2833-915c-4a8f-a967-9d5563ecda01
Content-Type: application/json

--- request body ---
{"handle":"qa-d86dea411b88","displayName":"QA d86dea411b88","password":"****","region":"eu"}

--- response: 201 in 475 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e1d2833-915c-4a8f-a967-9d5563ecda01
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
Location: /v1/accounts/qa-d86dea411b88
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7a687f6d-16d8-4042-addc-591753cec1cd","handle":"qa-d86dea411b88","displayName":"QA d86dea411b88","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.886511425Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-16516cc1-5dc0-43fe-b8cb-0ce08a9683c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16516cc1-5dc0-43fe-b8cb-0ce08a9683c0
Content-Type: application/json

--- request body ---
{"handle":"qa-d86dea411b88","password":"****"}

--- response: 200 in 45 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-16516cc1-5dc0-43fe-b8cb-0ce08a9683c0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a687f6d-16d8-4042-addc-591753cec1cd"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-92367d2e-b71d-4155-b663-e75c4701002c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92367d2e-b71d-4155-b663-e75c4701002c
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 60 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-92367d2e-b71d-4155-b663-e75c4701002c
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
Content-Length: 179

{"id":"acc_7a687f6d-16d8-4042-addc-591753cec1cd","handle":"qa-d86dea411b88","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.886511425Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-f042a0f6-7ca3-4f05-a428-58fbb740fc4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f042a0f6-7ca3-4f05-a428-58fbb740fc4f
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f042a0f6-7ca3-4f05-a428-58fbb740fc4f
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
Content-Length: 179

{"id":"acc_7a687f6d-16d8-4042-addc-591753cec1cd","handle":"qa-d86dea411b88","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.886511425Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7bbd0f77-22d6-4d32-a0cc-3d1af501033d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bbd0f77-22d6-4d32-a0cc-3d1af501033d
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7bbd0f77-22d6-4d32-a0cc-3d1af501033d
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
correlation: qa-a77426a5-cdf7-453c-ad04-641988048481

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a77426a5-cdf7-453c-ad04-641988048481
Content-Type: application/json

--- request body ---
{"handle":"qa-d86dea411b88","password":"****"}

--- response: 401 in 33 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a77426a5-cdf7-453c-ad04-641988048481
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a77426a5-cdf7-453c-ad04-641988048481"}
```
