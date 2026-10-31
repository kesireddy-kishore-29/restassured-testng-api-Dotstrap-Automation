# Transcript: Requests are served by the home region, whichever edge they arrive at [US, in]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[2]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 649 | `qa-00ed6d02-23d5-4ce7-9cd8-5a2356387baf` |
| 2 | `POST /v1/auth/token` | 200 | 80 | `qa-575c8af0-0cee-4d67-92a0-dd000924c225` |
| 3 | `GET /v1/accounts/me` | 200 | 62 | `qa-25a07c0d-1463-4e2f-a4e7-b903bad4022e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-35e445b3-fae2-40bb-ad26-8988656c2103` |
| 5 | `POST /v1/auth/token` | 401 | 39 | `qa-f6f591b2-163e-46fd-b629-f66073671635` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-00ed6d02-23d5-4ce7-9cd8-5a2356387baf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00ed6d02-23d5-4ce7-9cd8-5a2356387baf
Content-Type: application/json

--- request body ---
{"handle":"qa-ae694e66839f","displayName":"QA ae694e66839f","password":"****","region":"us"}

--- response: 201 in 649 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-00ed6d02-23d5-4ce7-9cd8-5a2356387baf
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
Location: /v1/accounts/qa-ae694e66839f
X-Served-Region: us
Content-Length: 181

{"id":"acc_7a93cd76-3b20-452e-8d80-a82eadc9bce7","handle":"qa-ae694e66839f","displayName":"QA ae694e66839f","region":"us","role":"user","createdAt":"2026-10-31T08:31:35.654183716Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-575c8af0-0cee-4d67-92a0-dd000924c225

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-575c8af0-0cee-4d67-92a0-dd000924c225
Content-Type: application/json

--- request body ---
{"handle":"qa-ae694e66839f","password":"****"}

--- response: 200 in 80 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-575c8af0-0cee-4d67-92a0-dd000924c225
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a93cd76-3b20-452e-8d80-a82eadc9bce7"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-25a07c0d-1463-4e2f-a4e7-b903bad4022e

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-25a07c0d-1463-4e2f-a4e7-b903bad4022e
Content-Type: application/json

--- response: 200 in 62 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-25a07c0d-1463-4e2f-a4e7-b903bad4022e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: in
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 181

{"id":"acc_7a93cd76-3b20-452e-8d80-a82eadc9bce7","handle":"qa-ae694e66839f","displayName":"QA ae694e66839f","region":"us","role":"user","createdAt":"2026-10-31T08:31:35.654183716Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35e445b3-fae2-40bb-ad26-8988656c2103

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35e445b3-fae2-40bb-ad26-8988656c2103
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35e445b3-fae2-40bb-ad26-8988656c2103
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
X-Served-Region: us
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f6f591b2-163e-46fd-b629-f66073671635

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6f591b2-163e-46fd-b629-f66073671635
Content-Type: application/json

--- request body ---
{"handle":"qa-ae694e66839f","password":"****"}

--- response: 401 in 39 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6f591b2-163e-46fd-b629-f66073671635
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f6f591b2-163e-46fd-b629-f66073671635"}
```
