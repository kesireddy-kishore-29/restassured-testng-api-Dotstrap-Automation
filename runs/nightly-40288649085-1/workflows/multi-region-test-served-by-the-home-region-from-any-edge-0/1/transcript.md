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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-eb0c8d2c-f062-4ad8-8414-69d12596271b` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-3a227d15-3bfe-4c8b-9ab0-3921b6f99045` |
| 3 | `GET /v1/accounts/me` | 200 | 13 | `qa-8395c746-7407-4379-b55e-40b4b46f9b8e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-6aa401ac-aaf5-4856-b518-157006222cdb` |
| 5 | `POST /v1/auth/token` | 401 | 20 | `qa-f773f638-f193-4382-94fa-07663c363416` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eb0c8d2c-f062-4ad8-8414-69d12596271b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb0c8d2c-f062-4ad8-8414-69d12596271b
Content-Type: application/json

--- request body ---
{"handle":"qa-d66d4eeebfc3","displayName":"QA d66d4eeebfc3","password":"****","region":"in"}

--- response: 201 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb0c8d2c-f062-4ad8-8414-69d12596271b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-d66d4eeebfc3
X-Served-Region: in
Content-Length: 181

{"id":"acc_6e8f6c42-be9f-4f76-a4ba-79d24473df8f","handle":"qa-d66d4eeebfc3","displayName":"QA d66d4eeebfc3","region":"in","role":"user","createdAt":"2026-10-26T07:54:48.617901010Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3a227d15-3bfe-4c8b-9ab0-3921b6f99045

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a227d15-3bfe-4c8b-9ab0-3921b6f99045
Content-Type: application/json

--- request body ---
{"handle":"qa-d66d4eeebfc3","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a227d15-3bfe-4c8b-9ab0-3921b6f99045
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6e8f6c42-be9f-4f76-a4ba-79d24473df8f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-8395c746-7407-4379-b55e-40b4b46f9b8e

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-8395c746-7407-4379-b55e-40b4b46f9b8e
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-8395c746-7407-4379-b55e-40b4b46f9b8e
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

{"id":"acc_6e8f6c42-be9f-4f76-a4ba-79d24473df8f","handle":"qa-d66d4eeebfc3","displayName":"QA d66d4eeebfc3","region":"in","role":"user","createdAt":"2026-10-26T07:54:48.617901010Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6aa401ac-aaf5-4856-b518-157006222cdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6aa401ac-aaf5-4856-b518-157006222cdb
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6aa401ac-aaf5-4856-b518-157006222cdb
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
correlation: qa-f773f638-f193-4382-94fa-07663c363416

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f773f638-f193-4382-94fa-07663c363416
Content-Type: application/json

--- request body ---
{"handle":"qa-d66d4eeebfc3","password":"****"}

--- response: 401 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f773f638-f193-4382-94fa-07663c363416
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f773f638-f193-4382-94fa-07663c363416"}
```
