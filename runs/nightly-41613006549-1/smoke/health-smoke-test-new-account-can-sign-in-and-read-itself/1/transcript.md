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
| 1 | `POST /v1/accounts` | 201 | 439 | `qa-5a64da12-c254-4949-b68d-a3754442e9be` |
| 2 | `POST /v1/auth/token` | 200 | 54 | `qa-5cae87d3-8f74-435b-ab53-7ee9e575f508` |
| 3 | `GET /v1/accounts/me` | 200 | 41 | `qa-017f1f76-f9b4-4982-a312-3ffaa043da66` |
| 4 | `GET /v1/accounts/me` | 200 | 32 | `qa-01f256ed-4861-4159-9eca-e1622212f5cc` |
| 5 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-043083e1-09a7-4351-bb30-aab72cbe8b14` |
| 6 | `POST /v1/auth/token` | 401 | 18 | `qa-3ba08377-1c7d-4052-a9a9-1e4a354ff67a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5a64da12-c254-4949-b68d-a3754442e9be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a64da12-c254-4949-b68d-a3754442e9be
Content-Type: application/json

--- request body ---
{"handle":"qa-b977116f2181","displayName":"QA b977116f2181","password":"****","region":"eu"}

--- response: 201 in 439 ms ---
Date: Tue, 03 Nov 2026 09:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a64da12-c254-4949-b68d-a3754442e9be
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
Location: /v1/accounts/qa-b977116f2181
X-Served-Region: eu
Content-Length: 181

{"id":"acc_03fb072b-bdac-4450-8d35-3e2e44f22f10","handle":"qa-b977116f2181","displayName":"QA b977116f2181","region":"eu","role":"user","createdAt":"2026-11-03T09:41:44.526107602Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5cae87d3-8f74-435b-ab53-7ee9e575f508

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cae87d3-8f74-435b-ab53-7ee9e575f508
Content-Type: application/json

--- request body ---
{"handle":"qa-b977116f2181","password":"****"}

--- response: 200 in 54 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cae87d3-8f74-435b-ab53-7ee9e575f508
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_03fb072b-bdac-4450-8d35-3e2e44f22f10"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-017f1f76-f9b4-4982-a312-3ffaa043da66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-017f1f76-f9b4-4982-a312-3ffaa043da66
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-017f1f76-f9b4-4982-a312-3ffaa043da66
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

{"id":"acc_03fb072b-bdac-4450-8d35-3e2e44f22f10","handle":"qa-b977116f2181","displayName":"QA b977116f2181","region":"eu","role":"user","createdAt":"2026-11-03T09:41:44.526107602Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-01f256ed-4861-4159-9eca-e1622212f5cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01f256ed-4861-4159-9eca-e1622212f5cc
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-01f256ed-4861-4159-9eca-e1622212f5cc
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

{"id":"acc_03fb072b-bdac-4450-8d35-3e2e44f22f10","handle":"qa-b977116f2181","displayName":"QA b977116f2181","region":"eu","role":"user","createdAt":"2026-11-03T09:41:44.526107602Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-043083e1-09a7-4351-bb30-aab72cbe8b14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-043083e1-09a7-4351-bb30-aab72cbe8b14
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-043083e1-09a7-4351-bb30-aab72cbe8b14
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
correlation: qa-3ba08377-1c7d-4052-a9a9-1e4a354ff67a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ba08377-1c7d-4052-a9a9-1e4a354ff67a
Content-Type: application/json

--- request body ---
{"handle":"qa-b977116f2181","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ba08377-1c7d-4052-a9a9-1e4a354ff67a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3ba08377-1c7d-4052-a9a9-1e4a354ff67a"}
```
