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
| 1 | `POST /v1/accounts` | 201 | 350 | `qa-dfbe0691-eca4-4ca5-adcd-15b6eab02c3a` |
| 2 | `POST /v1/auth/token` | 200 | 34 | `qa-09e3b2e5-0044-4cba-87b1-02e2ab623abd` |
| 3 | `PATCH /v1/accounts/me` | 200 | 27 | `qa-0f0ce267-a59b-4541-bc3d-9fc3198484d9` |
| 4 | `GET /v1/accounts/me` | 200 | 5 | `qa-1d9c4e4c-396e-409f-b2c4-71a225763334` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-5e699eaa-c6dc-458b-a1b1-dd53115de3c3` |
| 6 | `POST /v1/auth/token` | 401 | 34 | `qa-0d16bdbb-29cb-4db9-80ab-112818b09822` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dfbe0691-eca4-4ca5-adcd-15b6eab02c3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfbe0691-eca4-4ca5-adcd-15b6eab02c3a
Content-Type: application/json

--- request body ---
{"handle":"qa-2faf148f52ed","displayName":"QA 2faf148f52ed","password":"****","region":"eu"}

--- response: 201 in 350 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfbe0691-eca4-4ca5-adcd-15b6eab02c3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-2faf148f52ed
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5c5c276a-1180-4404-8932-cc90b7c85d7e","handle":"qa-2faf148f52ed","displayName":"QA 2faf148f52ed","region":"eu","role":"user","createdAt":"2026-11-14T09:05:13.731400932Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-09e3b2e5-0044-4cba-87b1-02e2ab623abd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09e3b2e5-0044-4cba-87b1-02e2ab623abd
Content-Type: application/json

--- request body ---
{"handle":"qa-2faf148f52ed","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-09e3b2e5-0044-4cba-87b1-02e2ab623abd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5c5c276a-1180-4404-8932-cc90b7c85d7e"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-0f0ce267-a59b-4541-bc3d-9fc3198484d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f0ce267-a59b-4541-bc3d-9fc3198484d9
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f0ce267-a59b-4541-bc3d-9fc3198484d9
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

{"id":"acc_5c5c276a-1180-4404-8932-cc90b7c85d7e","handle":"qa-2faf148f52ed","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-14T09:05:13.731400932Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-1d9c4e4c-396e-409f-b2c4-71a225763334

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d9c4e4c-396e-409f-b2c4-71a225763334
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d9c4e4c-396e-409f-b2c4-71a225763334
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

{"id":"acc_5c5c276a-1180-4404-8932-cc90b7c85d7e","handle":"qa-2faf148f52ed","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-14T09:05:13.731400932Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e699eaa-c6dc-458b-a1b1-dd53115de3c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e699eaa-c6dc-458b-a1b1-dd53115de3c3
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e699eaa-c6dc-458b-a1b1-dd53115de3c3
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
correlation: qa-0d16bdbb-29cb-4db9-80ab-112818b09822

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d16bdbb-29cb-4db9-80ab-112818b09822
Content-Type: application/json

--- request body ---
{"handle":"qa-2faf148f52ed","password":"****"}

--- response: 401 in 34 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d16bdbb-29cb-4db9-80ab-112818b09822
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0d16bdbb-29cb-4db9-80ab-112818b09822"}
```
