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
| 1 | `POST /v1/accounts` | 201 | 420 | `qa-3ef8f670-8944-4088-9687-b45462794e90` |
| 2 | `POST /v1/auth/token` | 200 | 102 | `qa-c9df0af2-943f-44bc-bcf1-f88ab47c3e44` |
| 3 | `GET /v1/accounts/me` | 200 | 61 | `qa-24324c15-53f9-468b-95c8-0a84a6488039` |
| 4 | `GET /v1/accounts/me` | 200 | 38 | `qa-fa464eaa-eb28-4585-8088-d1e42760e9f7` |
| 5 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-4d8c21e9-7e96-47c8-a532-cb67d4a55c1b` |
| 6 | `POST /v1/auth/token` | 401 | 13 | `qa-12ebd964-a8c4-43a6-af20-a515784ea465` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3ef8f670-8944-4088-9687-b45462794e90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ef8f670-8944-4088-9687-b45462794e90
Content-Type: application/json

--- request body ---
{"handle":"qa-50b49ae13354","displayName":"QA 50b49ae13354","password":"****","region":"eu"}

--- response: 201 in 420 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ef8f670-8944-4088-9687-b45462794e90
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
Location: /v1/accounts/qa-50b49ae13354
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f5f84ba0-dcdc-4a6e-87b2-aba4c1d4807f","handle":"qa-50b49ae13354","displayName":"QA 50b49ae13354","region":"eu","role":"user","createdAt":"2026-10-26T07:54:45.000502735Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c9df0af2-943f-44bc-bcf1-f88ab47c3e44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9df0af2-943f-44bc-bcf1-f88ab47c3e44
Content-Type: application/json

--- request body ---
{"handle":"qa-50b49ae13354","password":"****"}

--- response: 200 in 102 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9df0af2-943f-44bc-bcf1-f88ab47c3e44
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f5f84ba0-dcdc-4a6e-87b2-aba4c1d4807f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-24324c15-53f9-468b-95c8-0a84a6488039

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24324c15-53f9-468b-95c8-0a84a6488039
Content-Type: application/json

--- response: 200 in 61 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-24324c15-53f9-468b-95c8-0a84a6488039
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

{"id":"acc_f5f84ba0-dcdc-4a6e-87b2-aba4c1d4807f","handle":"qa-50b49ae13354","displayName":"QA 50b49ae13354","region":"eu","role":"user","createdAt":"2026-10-26T07:54:45.000502735Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-fa464eaa-eb28-4585-8088-d1e42760e9f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa464eaa-eb28-4585-8088-d1e42760e9f7
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa464eaa-eb28-4585-8088-d1e42760e9f7
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

{"id":"acc_f5f84ba0-dcdc-4a6e-87b2-aba4c1d4807f","handle":"qa-50b49ae13354","displayName":"QA 50b49ae13354","region":"eu","role":"user","createdAt":"2026-10-26T07:54:45.000502735Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4d8c21e9-7e96-47c8-a532-cb67d4a55c1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d8c21e9-7e96-47c8-a532-cb67d4a55c1b
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4d8c21e9-7e96-47c8-a532-cb67d4a55c1b
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
correlation: qa-12ebd964-a8c4-43a6-af20-a515784ea465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12ebd964-a8c4-43a6-af20-a515784ea465
Content-Type: application/json

--- request body ---
{"handle":"qa-50b49ae13354","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12ebd964-a8c4-43a6-af20-a515784ea465
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12ebd964-a8c4-43a6-af20-a515784ea465"}
```
