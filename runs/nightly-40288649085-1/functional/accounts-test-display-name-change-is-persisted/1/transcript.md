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
| 1 | `POST /v1/accounts` | 201 | 489 | `qa-c23a6f43-a6a8-4e5e-9e0e-8d59ea3b3a3e` |
| 2 | `POST /v1/auth/token` | 200 | 48 | `qa-d38d1e14-a385-4cb5-bb6e-fb32d80e9995` |
| 3 | `PATCH /v1/accounts/me` | 200 | 38 | `qa-2d52efa9-2500-4557-abbb-c93ce476d511` |
| 4 | `GET /v1/accounts/me` | 200 | 18 | `qa-3b1f4d9e-b21d-48ad-9850-39f8ac2b689c` |
| 5 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-ce5ad0cd-232e-498d-a261-97542180ae5d` |
| 6 | `POST /v1/auth/token` | 401 | 47 | `qa-64f7deb2-9918-41cf-a459-4c5714304315` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c23a6f43-a6a8-4e5e-9e0e-8d59ea3b3a3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c23a6f43-a6a8-4e5e-9e0e-8d59ea3b3a3e
Content-Type: application/json

--- request body ---
{"handle":"qa-a968ab56f432","displayName":"QA a968ab56f432","password":"****","region":"eu"}

--- response: 201 in 489 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-c23a6f43-a6a8-4e5e-9e0e-8d59ea3b3a3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-a968ab56f432
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d26ec37-954b-4bfc-89c8-de1b443eb8b8","handle":"qa-a968ab56f432","displayName":"QA a968ab56f432","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.748860559Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d38d1e14-a385-4cb5-bb6e-fb32d80e9995

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d38d1e14-a385-4cb5-bb6e-fb32d80e9995
Content-Type: application/json

--- request body ---
{"handle":"qa-a968ab56f432","password":"****"}

--- response: 200 in 48 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d38d1e14-a385-4cb5-bb6e-fb32d80e9995
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d26ec37-954b-4bfc-89c8-de1b443eb8b8"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-2d52efa9-2500-4557-abbb-c93ce476d511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d52efa9-2500-4557-abbb-c93ce476d511
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 38 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d52efa9-2500-4557-abbb-c93ce476d511
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

{"id":"acc_7d26ec37-954b-4bfc-89c8-de1b443eb8b8","handle":"qa-a968ab56f432","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.748860559Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-3b1f4d9e-b21d-48ad-9850-39f8ac2b689c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b1f4d9e-b21d-48ad-9850-39f8ac2b689c
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b1f4d9e-b21d-48ad-9850-39f8ac2b689c
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

{"id":"acc_7d26ec37-954b-4bfc-89c8-de1b443eb8b8","handle":"qa-a968ab56f432","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.748860559Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce5ad0cd-232e-498d-a261-97542180ae5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce5ad0cd-232e-498d-a261-97542180ae5d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce5ad0cd-232e-498d-a261-97542180ae5d
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
correlation: qa-64f7deb2-9918-41cf-a459-4c5714304315

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64f7deb2-9918-41cf-a459-4c5714304315
Content-Type: application/json

--- request body ---
{"handle":"qa-a968ab56f432","password":"****"}

--- response: 401 in 47 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64f7deb2-9918-41cf-a459-4c5714304315
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-64f7deb2-9918-41cf-a459-4c5714304315"}
```
