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
| 1 | `POST /v1/accounts` | 201 | 377 | `qa-d9b8347e-b419-47a8-95e4-2a81c9823eda` |
| 2 | `POST /v1/auth/token` | 200 | 83 | `qa-c4ac45aa-6655-459c-baee-23ee54eb4455` |
| 3 | `PATCH /v1/accounts/me` | 200 | 58 | `qa-da5a3e46-47ca-463f-af6d-10e293e774e4` |
| 4 | `GET /v1/accounts/me` | 200 | 15 | `qa-244b3e41-5f94-4119-9c86-4c42e1b8b45b` |
| 5 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-5016ebfc-602e-434f-8b4a-e9e9017e66da` |
| 6 | `POST /v1/auth/token` | 401 | 28 | `qa-777e746d-e778-4f41-83e5-51e139331544` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d9b8347e-b419-47a8-95e4-2a81c9823eda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9b8347e-b419-47a8-95e4-2a81c9823eda
Content-Type: application/json

--- request body ---
{"handle":"qa-657e67df54ce","displayName":"QA 657e67df54ce","password":"****","region":"eu"}

--- response: 201 in 377 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9b8347e-b419-47a8-95e4-2a81c9823eda
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
Location: /v1/accounts/qa-657e67df54ce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b4e46d35-9915-4caf-bac5-6f2c93d7dfd8","handle":"qa-657e67df54ce","displayName":"QA 657e67df54ce","region":"eu","role":"user","createdAt":"2026-11-25T11:27:56.966612530Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c4ac45aa-6655-459c-baee-23ee54eb4455

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4ac45aa-6655-459c-baee-23ee54eb4455
Content-Type: application/json

--- request body ---
{"handle":"qa-657e67df54ce","password":"****"}

--- response: 200 in 83 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4ac45aa-6655-459c-baee-23ee54eb4455
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b4e46d35-9915-4caf-bac5-6f2c93d7dfd8"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-da5a3e46-47ca-463f-af6d-10e293e774e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da5a3e46-47ca-463f-af6d-10e293e774e4
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 58 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-da5a3e46-47ca-463f-af6d-10e293e774e4
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

{"id":"acc_b4e46d35-9915-4caf-bac5-6f2c93d7dfd8","handle":"qa-657e67df54ce","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-25T11:27:56.966612530Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-244b3e41-5f94-4119-9c86-4c42e1b8b45b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-244b3e41-5f94-4119-9c86-4c42e1b8b45b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-244b3e41-5f94-4119-9c86-4c42e1b8b45b
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

{"id":"acc_b4e46d35-9915-4caf-bac5-6f2c93d7dfd8","handle":"qa-657e67df54ce","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-25T11:27:56.966612530Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5016ebfc-602e-434f-8b4a-e9e9017e66da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5016ebfc-602e-434f-8b4a-e9e9017e66da
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5016ebfc-602e-434f-8b4a-e9e9017e66da
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
correlation: qa-777e746d-e778-4f41-83e5-51e139331544

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-777e746d-e778-4f41-83e5-51e139331544
Content-Type: application/json

--- request body ---
{"handle":"qa-657e67df54ce","password":"****"}

--- response: 401 in 28 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-777e746d-e778-4f41-83e5-51e139331544
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-777e746d-e778-4f41-83e5-51e139331544"}
```
