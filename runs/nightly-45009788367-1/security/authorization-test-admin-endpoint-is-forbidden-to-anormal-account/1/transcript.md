# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 359 | `qa-602185e4-1940-469a-b4f5-a80ddd275ebe` |
| 2 | `POST /v1/auth/token` | 200 | 41 | `qa-6a23ee83-2be1-4201-b52f-89f1b496199c` |
| 3 | `GET /v1/admin/stats` | 403 | 39 | `qa-73011562-9ac3-4836-b62d-c3a3525e0d46` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-fb9a5091-f860-4dd7-91f0-c0dfe0505e57` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-edcbd6e0-4b42-4c6a-b8e3-56fb708a65fd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-602185e4-1940-469a-b4f5-a80ddd275ebe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-602185e4-1940-469a-b4f5-a80ddd275ebe
Content-Type: application/json

--- request body ---
{"handle":"qa-1ce572ad4e0e","displayName":"QA 1ce572ad4e0e","password":"****","region":"eu"}

--- response: 201 in 359 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-602185e4-1940-469a-b4f5-a80ddd275ebe
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
Location: /v1/accounts/qa-1ce572ad4e0e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8606abb1-4ad2-416e-a4b9-e5e4f1acea83","handle":"qa-1ce572ad4e0e","displayName":"QA 1ce572ad4e0e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.222722380Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6a23ee83-2be1-4201-b52f-89f1b496199c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a23ee83-2be1-4201-b52f-89f1b496199c
Content-Type: application/json

--- request body ---
{"handle":"qa-1ce572ad4e0e","password":"****"}

--- response: 200 in 41 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a23ee83-2be1-4201-b52f-89f1b496199c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8606abb1-4ad2-416e-a4b9-e5e4f1acea83"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-73011562-9ac3-4836-b62d-c3a3525e0d46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73011562-9ac3-4836-b62d-c3a3525e0d46
Content-Type: application/json

--- response: 403 in 39 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73011562-9ac3-4836-b62d-c3a3525e0d46
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
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-73011562-9ac3-4836-b62d-c3a3525e0d46"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fb9a5091-f860-4dd7-91f0-c0dfe0505e57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb9a5091-f860-4dd7-91f0-c0dfe0505e57
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fb9a5091-f860-4dd7-91f0-c0dfe0505e57
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
correlation: qa-edcbd6e0-4b42-4c6a-b8e3-56fb708a65fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edcbd6e0-4b42-4c6a-b8e3-56fb708a65fd
Content-Type: application/json

--- request body ---
{"handle":"qa-1ce572ad4e0e","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-edcbd6e0-4b42-4c6a-b8e3-56fb708a65fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-edcbd6e0-4b42-4c6a-b8e3-56fb708a65fd"}
```
