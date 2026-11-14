# Transcript: A new account can sign in and read itself back

| | |
|---|---|
| Test | `com.qaautomation.tests.smoke.HealthSmokeTest#newAccountCanSignInAndReadItself` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 465 | `qa-f87d6167-edb6-477f-afb1-7782909be9a8` |
| 2 | `POST /v1/auth/token` | 200 | 71 | `qa-31cd2a41-ce71-40e4-89f4-104fe04583f8` |
| 3 | `GET /v1/accounts/me` | 200 | 72 | `qa-29cca3c7-a958-4ef8-8c0f-9fe2b09bc8e3` |
| 4 | `GET /v1/accounts/me` | 200 | 12 | `qa-58b652cf-35dc-4a67-866f-1e919dab4ff0` |
| 5 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-3d908b7d-e056-4f7b-b72d-26c19b43b083` |
| 6 | `POST /v1/auth/token` | 401 | 15 | `qa-93b2006a-e867-46af-9852-9f8a1bd31b63` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f87d6167-edb6-477f-afb1-7782909be9a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f87d6167-edb6-477f-afb1-7782909be9a8
Content-Type: application/json

--- request body ---
{"handle":"qa-57aeab8bfa56","displayName":"QA 57aeab8bfa56","password":"****","region":"eu"}

--- response: 201 in 465 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f87d6167-edb6-477f-afb1-7782909be9a8
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
Location: /v1/accounts/qa-57aeab8bfa56
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20d3407f-9a74-452a-8699-16705589bcf8","handle":"qa-57aeab8bfa56","displayName":"QA 57aeab8bfa56","region":"eu","role":"user","createdAt":"2026-11-10T09:59:38.190601160Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-31cd2a41-ce71-40e4-89f4-104fe04583f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31cd2a41-ce71-40e4-89f4-104fe04583f8
Content-Type: application/json

--- request body ---
{"handle":"qa-57aeab8bfa56","password":"****"}

--- response: 200 in 71 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-31cd2a41-ce71-40e4-89f4-104fe04583f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20d3407f-9a74-452a-8699-16705589bcf8"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-29cca3c7-a958-4ef8-8c0f-9fe2b09bc8e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29cca3c7-a958-4ef8-8c0f-9fe2b09bc8e3
Content-Type: application/json

--- response: 200 in 72 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-29cca3c7-a958-4ef8-8c0f-9fe2b09bc8e3
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

{"id":"acc_20d3407f-9a74-452a-8699-16705589bcf8","handle":"qa-57aeab8bfa56","displayName":"QA 57aeab8bfa56","region":"eu","role":"user","createdAt":"2026-11-10T09:59:38.190601160Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-58b652cf-35dc-4a67-866f-1e919dab4ff0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58b652cf-35dc-4a67-866f-1e919dab4ff0
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-58b652cf-35dc-4a67-866f-1e919dab4ff0
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
Content-Length: 181

{"id":"acc_20d3407f-9a74-452a-8699-16705589bcf8","handle":"qa-57aeab8bfa56","displayName":"QA 57aeab8bfa56","region":"eu","role":"user","createdAt":"2026-11-10T09:59:38.190601160Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3d908b7d-e056-4f7b-b72d-26c19b43b083

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d908b7d-e056-4f7b-b72d-26c19b43b083
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3d908b7d-e056-4f7b-b72d-26c19b43b083
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
correlation: qa-93b2006a-e867-46af-9852-9f8a1bd31b63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93b2006a-e867-46af-9852-9f8a1bd31b63
Content-Type: application/json

--- request body ---
{"handle":"qa-57aeab8bfa56","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93b2006a-e867-46af-9852-9f8a1bd31b63
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93b2006a-e867-46af-9852-9f8a1bd31b63"}
```
