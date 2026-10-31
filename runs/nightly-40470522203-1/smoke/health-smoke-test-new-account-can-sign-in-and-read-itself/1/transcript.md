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
| 1 | `POST /v1/accounts` | 201 | 433 | `qa-286c88db-34a6-4676-8f55-c4f72bc00f9a` |
| 2 | `POST /v1/auth/token` | 200 | 75 | `qa-390f923c-853f-4816-8289-1be0006ecb36` |
| 3 | `GET /v1/accounts/me` | 200 | 60 | `qa-4aff9b5d-d9f9-4550-9691-d98c49fbacc8` |
| 4 | `GET /v1/accounts/me` | 200 | 22 | `qa-75f36f3a-c411-4ca1-8b09-a88505e77431` |
| 5 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-dd646486-c8f6-4dd7-b665-42321478f868` |
| 6 | `POST /v1/auth/token` | 401 | 20 | `qa-57f452c5-7899-44b4-85b6-9fa900194c61` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-286c88db-34a6-4676-8f55-c4f72bc00f9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-286c88db-34a6-4676-8f55-c4f72bc00f9a
Content-Type: application/json

--- request body ---
{"handle":"qa-7af8bfcbaf45","displayName":"QA 7af8bfcbaf45","password":"****","region":"eu"}

--- response: 201 in 433 ms ---
Date: Tue, 27 Oct 2026 08:00:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-286c88db-34a6-4676-8f55-c4f72bc00f9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Location: /v1/accounts/qa-7af8bfcbaf45
X-Served-Region: eu
Content-Length: 181

{"id":"acc_26646795-0c28-430d-9d1c-41362de5c3e8","handle":"qa-7af8bfcbaf45","displayName":"QA 7af8bfcbaf45","region":"eu","role":"user","createdAt":"2026-10-27T08:00:25.929116328Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-390f923c-853f-4816-8289-1be0006ecb36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-390f923c-853f-4816-8289-1be0006ecb36
Content-Type: application/json

--- request body ---
{"handle":"qa-7af8bfcbaf45","password":"****"}

--- response: 200 in 75 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-390f923c-853f-4816-8289-1be0006ecb36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_26646795-0c28-430d-9d1c-41362de5c3e8"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-4aff9b5d-d9f9-4550-9691-d98c49fbacc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aff9b5d-d9f9-4550-9691-d98c49fbacc8
Content-Type: application/json

--- response: 200 in 60 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4aff9b5d-d9f9-4550-9691-d98c49fbacc8
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

{"id":"acc_26646795-0c28-430d-9d1c-41362de5c3e8","handle":"qa-7af8bfcbaf45","displayName":"QA 7af8bfcbaf45","region":"eu","role":"user","createdAt":"2026-10-27T08:00:25.929116328Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-75f36f3a-c411-4ca1-8b09-a88505e77431

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75f36f3a-c411-4ca1-8b09-a88505e77431
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-75f36f3a-c411-4ca1-8b09-a88505e77431
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

{"id":"acc_26646795-0c28-430d-9d1c-41362de5c3e8","handle":"qa-7af8bfcbaf45","displayName":"QA 7af8bfcbaf45","region":"eu","role":"user","createdAt":"2026-10-27T08:00:25.929116328Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dd646486-c8f6-4dd7-b665-42321478f868

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd646486-c8f6-4dd7-b665-42321478f868
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dd646486-c8f6-4dd7-b665-42321478f868
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
correlation: qa-57f452c5-7899-44b4-85b6-9fa900194c61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57f452c5-7899-44b4-85b6-9fa900194c61
Content-Type: application/json

--- request body ---
{"handle":"qa-7af8bfcbaf45","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57f452c5-7899-44b4-85b6-9fa900194c61
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-57f452c5-7899-44b4-85b6-9fa900194c61"}
```
