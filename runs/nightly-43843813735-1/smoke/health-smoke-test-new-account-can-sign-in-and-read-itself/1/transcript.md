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
| 1 | `POST /v1/accounts` | 201 | 348 | `qa-2eb32385-eb7d-4dd2-b323-417b856c1524` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-154ee29d-cfa2-44c1-a30e-0c2564ce4a79` |
| 3 | `GET /v1/accounts/me` | 200 | 62 | `qa-09594e4b-f8d1-4ea1-bc03-463475aebc28` |
| 4 | `GET /v1/accounts/me` | 200 | 13 | `qa-387ac911-890a-4762-a49b-e5c1af4551ba` |
| 5 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-9b19c80b-61c1-4db9-a8a3-d69ca5e09674` |
| 6 | `POST /v1/auth/token` | 401 | 12 | `qa-f534eae8-93f8-45ef-900b-15ee4c5f3b57` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2eb32385-eb7d-4dd2-b323-417b856c1524

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2eb32385-eb7d-4dd2-b323-417b856c1524
Content-Type: application/json

--- request body ---
{"handle":"qa-daa22d56a534","displayName":"QA daa22d56a534","password":"****","region":"eu"}

--- response: 201 in 348 ms ---
Date: Mon, 16 Nov 2026 09:53:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-2eb32385-eb7d-4dd2-b323-417b856c1524
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
Location: /v1/accounts/qa-daa22d56a534
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dc9db218-fccd-4bf8-bb9c-589e9388579d","handle":"qa-daa22d56a534","displayName":"QA daa22d56a534","region":"eu","role":"user","createdAt":"2026-11-16T09:53:50.527689570Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-154ee29d-cfa2-44c1-a30e-0c2564ce4a79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-154ee29d-cfa2-44c1-a30e-0c2564ce4a79
Content-Type: application/json

--- request body ---
{"handle":"qa-daa22d56a534","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 16 Nov 2026 09:53:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-154ee29d-cfa2-44c1-a30e-0c2564ce4a79
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dc9db218-fccd-4bf8-bb9c-589e9388579d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-09594e4b-f8d1-4ea1-bc03-463475aebc28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09594e4b-f8d1-4ea1-bc03-463475aebc28
Content-Type: application/json

--- response: 200 in 62 ms ---
Date: Mon, 16 Nov 2026 09:53:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-09594e4b-f8d1-4ea1-bc03-463475aebc28
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

{"id":"acc_dc9db218-fccd-4bf8-bb9c-589e9388579d","handle":"qa-daa22d56a534","displayName":"QA daa22d56a534","region":"eu","role":"user","createdAt":"2026-11-16T09:53:50.527689570Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-387ac911-890a-4762-a49b-e5c1af4551ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-387ac911-890a-4762-a49b-e5c1af4551ba
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-387ac911-890a-4762-a49b-e5c1af4551ba
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

{"id":"acc_dc9db218-fccd-4bf8-bb9c-589e9388579d","handle":"qa-daa22d56a534","displayName":"QA daa22d56a534","region":"eu","role":"user","createdAt":"2026-11-16T09:53:50.527689570Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9b19c80b-61c1-4db9-a8a3-d69ca5e09674

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b19c80b-61c1-4db9-a8a3-d69ca5e09674
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9b19c80b-61c1-4db9-a8a3-d69ca5e09674
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
correlation: qa-f534eae8-93f8-45ef-900b-15ee4c5f3b57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f534eae8-93f8-45ef-900b-15ee4c5f3b57
Content-Type: application/json

--- request body ---
{"handle":"qa-daa22d56a534","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f534eae8-93f8-45ef-900b-15ee4c5f3b57
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f534eae8-93f8-45ef-900b-15ee4c5f3b57"}
```
