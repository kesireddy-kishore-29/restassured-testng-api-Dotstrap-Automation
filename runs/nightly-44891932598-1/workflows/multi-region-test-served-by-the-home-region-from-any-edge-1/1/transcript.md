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
| 1 | `POST /v1/accounts` | 201 | 352 | `qa-79e39c67-ca3f-476c-87aa-6fa16bdce2f8` |
| 2 | `POST /v1/auth/token` | 200 | 49 | `qa-9fd06c79-f4eb-49c0-a34c-c2fe36cfb42e` |
| 3 | `GET /v1/accounts/me` | 200 | 46 | `qa-3e7cb0a7-e6c7-412b-b343-352ef0cad412` |
| 4 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-25957b8a-b917-44f3-922a-78b79aecfeca` |
| 5 | `POST /v1/auth/token` | 401 | 17 | `qa-f2c83b9d-0cba-4133-b474-6209165e40b8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-79e39c67-ca3f-476c-87aa-6fa16bdce2f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79e39c67-ca3f-476c-87aa-6fa16bdce2f8
Content-Type: application/json

--- request body ---
{"handle":"qa-8b9feb52d842","displayName":"QA 8b9feb52d842","password":"****","region":"eu"}

--- response: 201 in 352 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-79e39c67-ca3f-476c-87aa-6fa16bdce2f8
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
Location: /v1/accounts/qa-8b9feb52d842
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bee29ccc-113d-4586-aab0-cf10cccd3328","handle":"qa-8b9feb52d842","displayName":"QA 8b9feb52d842","region":"eu","role":"user","createdAt":"2026-11-21T09:57:05.801011301Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9fd06c79-f4eb-49c0-a34c-c2fe36cfb42e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fd06c79-f4eb-49c0-a34c-c2fe36cfb42e
Content-Type: application/json

--- request body ---
{"handle":"qa-8b9feb52d842","password":"****"}

--- response: 200 in 49 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fd06c79-f4eb-49c0-a34c-c2fe36cfb42e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bee29ccc-113d-4586-aab0-cf10cccd3328"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e7cb0a7-e6c7-412b-b343-352ef0cad412

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-3e7cb0a7-e6c7-412b-b343-352ef0cad412
Content-Type: application/json

--- response: 200 in 46 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e7cb0a7-e6c7-412b-b343-352ef0cad412
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

{"id":"acc_bee29ccc-113d-4586-aab0-cf10cccd3328","handle":"qa-8b9feb52d842","displayName":"QA 8b9feb52d842","region":"eu","role":"user","createdAt":"2026-11-21T09:57:05.801011301Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-25957b8a-b917-44f3-922a-78b79aecfeca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25957b8a-b917-44f3-922a-78b79aecfeca
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-25957b8a-b917-44f3-922a-78b79aecfeca
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
correlation: qa-f2c83b9d-0cba-4133-b474-6209165e40b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2c83b9d-0cba-4133-b474-6209165e40b8
Content-Type: application/json

--- request body ---
{"handle":"qa-8b9feb52d842","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2c83b9d-0cba-4133-b474-6209165e40b8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2c83b9d-0cba-4133-b474-6209165e40b8"}
```
