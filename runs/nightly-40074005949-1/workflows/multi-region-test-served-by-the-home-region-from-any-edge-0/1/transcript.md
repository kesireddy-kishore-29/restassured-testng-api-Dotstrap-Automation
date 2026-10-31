# Transcript: Requests are served by the home region, whichever edge they arrive at [IN, eu]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[0]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-6ff161de-71a1-45fb-bbd2-43b8152c250e` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-f1565fae-b221-408c-884f-bc10ac73d342` |
| 3 | `GET /v1/accounts/me` | 200 | 16 | `qa-37729526-d724-47b2-9e5e-8706e85cf3b8` |
| 4 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-66002c85-9fdf-4bc4-ac8a-3dcf385ff13a` |
| 5 | `POST /v1/auth/token` | 401 | 14 | `qa-92e0415c-602d-4213-9501-674e3304a15b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6ff161de-71a1-45fb-bbd2-43b8152c250e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ff161de-71a1-45fb-bbd2-43b8152c250e
Content-Type: application/json

--- request body ---
{"handle":"qa-8c04c74e6f0e","displayName":"QA 8c04c74e6f0e","password":"****","region":"in"}

--- response: 201 in 29 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ff161de-71a1-45fb-bbd2-43b8152c250e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-8c04c74e6f0e
X-Served-Region: in
Content-Length: 181

{"id":"acc_4e3adb74-0817-49a8-808e-0bd87a3392ee","handle":"qa-8c04c74e6f0e","displayName":"QA 8c04c74e6f0e","region":"in","role":"user","createdAt":"2026-10-24T07:25:36.242605702Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f1565fae-b221-408c-884f-bc10ac73d342

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1565fae-b221-408c-884f-bc10ac73d342
Content-Type: application/json

--- request body ---
{"handle":"qa-8c04c74e6f0e","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1565fae-b221-408c-884f-bc10ac73d342
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4e3adb74-0817-49a8-808e-0bd87a3392ee"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-37729526-d724-47b2-9e5e-8706e85cf3b8

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-37729526-d724-47b2-9e5e-8706e85cf3b8
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-37729526-d724-47b2-9e5e-8706e85cf3b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: eu
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 181

{"id":"acc_4e3adb74-0817-49a8-808e-0bd87a3392ee","handle":"qa-8c04c74e6f0e","displayName":"QA 8c04c74e6f0e","region":"in","role":"user","createdAt":"2026-10-24T07:25:36.242605702Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-66002c85-9fdf-4bc4-ac8a-3dcf385ff13a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66002c85-9fdf-4bc4-ac8a-3dcf385ff13a
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-66002c85-9fdf-4bc4-ac8a-3dcf385ff13a
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
X-Served-Region: in
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-92e0415c-602d-4213-9501-674e3304a15b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92e0415c-602d-4213-9501-674e3304a15b
Content-Type: application/json

--- request body ---
{"handle":"qa-8c04c74e6f0e","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92e0415c-602d-4213-9501-674e3304a15b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-92e0415c-602d-4213-9501-674e3304a15b"}
```
