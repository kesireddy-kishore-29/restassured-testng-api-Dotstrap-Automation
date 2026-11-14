# Transcript: Requests are served by the home region, whichever edge they arrive at [EU, us]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[1]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-a3f385b0-5833-4a3f-85df-12550f36b346` |
| 2 | `POST /v1/auth/token` | 200 | 33 | `qa-1d791fcf-dc48-4a4a-aff1-2819da9a97fb` |
| 3 | `GET /v1/accounts/me` | 200 | 6 | `qa-2784bcff-77a6-4cfb-9262-79f053bcab45` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-9442f6bb-4f8c-4a03-9415-01201a334102` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-3ece2e73-f741-4cc8-b346-0c12e5f37390` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a3f385b0-5833-4a3f-85df-12550f36b346

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3f385b0-5833-4a3f-85df-12550f36b346
Content-Type: application/json

--- request body ---
{"handle":"qa-7c92e84685b9","displayName":"QA 7c92e84685b9","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3f385b0-5833-4a3f-85df-12550f36b346
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-7c92e84685b9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2ccec0fd-b45b-459f-b4cd-2de3d1be65c0","handle":"qa-7c92e84685b9","displayName":"QA 7c92e84685b9","region":"eu","role":"user","createdAt":"2026-11-07T08:55:04.448316765Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1d791fcf-dc48-4a4a-aff1-2819da9a97fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d791fcf-dc48-4a4a-aff1-2819da9a97fb
Content-Type: application/json

--- request body ---
{"handle":"qa-7c92e84685b9","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d791fcf-dc48-4a4a-aff1-2819da9a97fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ccec0fd-b45b-459f-b4cd-2de3d1be65c0"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-2784bcff-77a6-4cfb-9262-79f053bcab45

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-2784bcff-77a6-4cfb-9262-79f053bcab45
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2784bcff-77a6-4cfb-9262-79f053bcab45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: us
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2ccec0fd-b45b-459f-b4cd-2de3d1be65c0","handle":"qa-7c92e84685b9","displayName":"QA 7c92e84685b9","region":"eu","role":"user","createdAt":"2026-11-07T08:55:04.448316765Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9442f6bb-4f8c-4a03-9415-01201a334102

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9442f6bb-4f8c-4a03-9415-01201a334102
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9442f6bb-4f8c-4a03-9415-01201a334102
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
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-3ece2e73-f741-4cc8-b346-0c12e5f37390

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ece2e73-f741-4cc8-b346-0c12e5f37390
Content-Type: application/json

--- request body ---
{"handle":"qa-7c92e84685b9","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ece2e73-f741-4cc8-b346-0c12e5f37390
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3ece2e73-f741-4cc8-b346-0c12e5f37390"}
```
