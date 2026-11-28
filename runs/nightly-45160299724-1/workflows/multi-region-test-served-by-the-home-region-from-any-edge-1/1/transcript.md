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
| 1 | `POST /v1/accounts` | 201 | 434 | `qa-259e73eb-9f89-41c2-9f08-d7dc9a3cdd05` |
| 2 | `POST /v1/auth/token` | 200 | 48 | `qa-332e635d-43ac-419b-b00c-d83dc9b44bfd` |
| 3 | `GET /v1/accounts/me` | 200 | 49 | `qa-307fe730-99ed-4bda-bbdf-fd23ef19b405` |
| 4 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-ccc5d104-4137-45d0-9847-1e7f64a68995` |
| 5 | `POST /v1/auth/token` | 401 | 25 | `qa-d62f45f7-edd5-4a1a-b823-00a2d8e152c0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-259e73eb-9f89-41c2-9f08-d7dc9a3cdd05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-259e73eb-9f89-41c2-9f08-d7dc9a3cdd05
Content-Type: application/json

--- request body ---
{"handle":"qa-87b31dab563c","displayName":"QA 87b31dab563c","password":"****","region":"eu"}

--- response: 201 in 434 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-259e73eb-9f89-41c2-9f08-d7dc9a3cdd05
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
Location: /v1/accounts/qa-87b31dab563c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2924e7f3-e5d9-49f5-ada4-c1c1d5c4c813","handle":"qa-87b31dab563c","displayName":"QA 87b31dab563c","region":"eu","role":"user","createdAt":"2026-11-23T10:55:04.238242923Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-332e635d-43ac-419b-b00c-d83dc9b44bfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-332e635d-43ac-419b-b00c-d83dc9b44bfd
Content-Type: application/json

--- request body ---
{"handle":"qa-87b31dab563c","password":"****"}

--- response: 200 in 48 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-332e635d-43ac-419b-b00c-d83dc9b44bfd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2924e7f3-e5d9-49f5-ada4-c1c1d5c4c813"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-307fe730-99ed-4bda-bbdf-fd23ef19b405

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-307fe730-99ed-4bda-bbdf-fd23ef19b405
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-307fe730-99ed-4bda-bbdf-fd23ef19b405
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

{"id":"acc_2924e7f3-e5d9-49f5-ada4-c1c1d5c4c813","handle":"qa-87b31dab563c","displayName":"QA 87b31dab563c","region":"eu","role":"user","createdAt":"2026-11-23T10:55:04.238242923Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ccc5d104-4137-45d0-9847-1e7f64a68995

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccc5d104-4137-45d0-9847-1e7f64a68995
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ccc5d104-4137-45d0-9847-1e7f64a68995
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
correlation: qa-d62f45f7-edd5-4a1a-b823-00a2d8e152c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d62f45f7-edd5-4a1a-b823-00a2d8e152c0
Content-Type: application/json

--- request body ---
{"handle":"qa-87b31dab563c","password":"****"}

--- response: 401 in 25 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d62f45f7-edd5-4a1a-b823-00a2d8e152c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d62f45f7-edd5-4a1a-b823-00a2d8e152c0"}
```
