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
| 1 | `POST /v1/accounts` | 201 | 394 | `qa-444f5ba6-c131-4a93-bc25-28eebabe5e85` |
| 2 | `POST /v1/auth/token` | 200 | 53 | `qa-2ad0dda4-c206-4bab-b985-3a67f2a811e8` |
| 3 | `PATCH /v1/accounts/me` | 200 | 28 | `qa-90af2d48-d40b-4dae-9082-4f412729f085` |
| 4 | `GET /v1/accounts/me` | 200 | 7 | `qa-f8d438df-e658-4a7d-afb5-82268c22b2ee` |
| 5 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-bb3e95c0-0170-4776-a590-c7aea99afde4` |
| 6 | `POST /v1/auth/token` | 401 | 27 | `qa-81af932e-636c-4dba-af4d-75aead14b42c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-444f5ba6-c131-4a93-bc25-28eebabe5e85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-444f5ba6-c131-4a93-bc25-28eebabe5e85
Content-Type: application/json

--- request body ---
{"handle":"qa-9749a8841d20","displayName":"QA 9749a8841d20","password":"****","region":"eu"}

--- response: 201 in 394 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-444f5ba6-c131-4a93-bc25-28eebabe5e85
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
Location: /v1/accounts/qa-9749a8841d20
X-Served-Region: eu
Content-Length: 181

{"id":"acc_95b5998d-135f-4bcb-875c-cd5ceae28fc1","handle":"qa-9749a8841d20","displayName":"QA 9749a8841d20","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.267229556Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2ad0dda4-c206-4bab-b985-3a67f2a811e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ad0dda4-c206-4bab-b985-3a67f2a811e8
Content-Type: application/json

--- request body ---
{"handle":"qa-9749a8841d20","password":"****"}

--- response: 200 in 53 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ad0dda4-c206-4bab-b985-3a67f2a811e8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_95b5998d-135f-4bcb-875c-cd5ceae28fc1"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-90af2d48-d40b-4dae-9082-4f412729f085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90af2d48-d40b-4dae-9082-4f412729f085
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-90af2d48-d40b-4dae-9082-4f412729f085
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

{"id":"acc_95b5998d-135f-4bcb-875c-cd5ceae28fc1","handle":"qa-9749a8841d20","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.267229556Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8d438df-e658-4a7d-afb5-82268c22b2ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8d438df-e658-4a7d-afb5-82268c22b2ee
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8d438df-e658-4a7d-afb5-82268c22b2ee
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

{"id":"acc_95b5998d-135f-4bcb-875c-cd5ceae28fc1","handle":"qa-9749a8841d20","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.267229556Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bb3e95c0-0170-4776-a590-c7aea99afde4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb3e95c0-0170-4776-a590-c7aea99afde4
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bb3e95c0-0170-4776-a590-c7aea99afde4
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
correlation: qa-81af932e-636c-4dba-af4d-75aead14b42c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81af932e-636c-4dba-af4d-75aead14b42c
Content-Type: application/json

--- request body ---
{"handle":"qa-9749a8841d20","password":"****"}

--- response: 401 in 27 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81af932e-636c-4dba-af4d-75aead14b42c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-81af932e-636c-4dba-af4d-75aead14b42c"}
```
