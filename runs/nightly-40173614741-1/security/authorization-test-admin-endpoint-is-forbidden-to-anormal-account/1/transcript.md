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
| 1 | `POST /v1/accounts` | 201 | 474 | `qa-62531354-6a22-4d1a-955a-6c78ae1eda9d` |
| 2 | `POST /v1/auth/token` | 200 | 75 | `qa-fa3441c1-2207-42c8-852a-271d18bd4340` |
| 3 | `GET /v1/admin/stats` | 403 | 52 | `qa-7f616ba0-6be9-4fdc-b420-16c307760ed8` |
| 4 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-e817126e-c99c-4247-a161-75359c005fbc` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-105a0e54-d2fe-4e71-abe2-f133de63190e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-62531354-6a22-4d1a-955a-6c78ae1eda9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62531354-6a22-4d1a-955a-6c78ae1eda9d
Content-Type: application/json

--- request body ---
{"handle":"qa-6dbc61f4a1d6","displayName":"QA 6dbc61f4a1d6","password":"****","region":"eu"}

--- response: 201 in 474 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-62531354-6a22-4d1a-955a-6c78ae1eda9d
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
Location: /v1/accounts/qa-6dbc61f4a1d6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9d5ac3aa-27e4-4d6e-88d9-5349d8a7740d","handle":"qa-6dbc61f4a1d6","displayName":"QA 6dbc61f4a1d6","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.981228191Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fa3441c1-2207-42c8-852a-271d18bd4340

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa3441c1-2207-42c8-852a-271d18bd4340
Content-Type: application/json

--- request body ---
{"handle":"qa-6dbc61f4a1d6","password":"****"}

--- response: 200 in 75 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa3441c1-2207-42c8-852a-271d18bd4340
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9d5ac3aa-27e4-4d6e-88d9-5349d8a7740d"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-7f616ba0-6be9-4fdc-b420-16c307760ed8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f616ba0-6be9-4fdc-b420-16c307760ed8
Content-Type: application/json

--- response: 403 in 52 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f616ba0-6be9-4fdc-b420-16c307760ed8
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-7f616ba0-6be9-4fdc-b420-16c307760ed8"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e817126e-c99c-4247-a161-75359c005fbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e817126e-c99c-4247-a161-75359c005fbc
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e817126e-c99c-4247-a161-75359c005fbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-105a0e54-d2fe-4e71-abe2-f133de63190e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-105a0e54-d2fe-4e71-abe2-f133de63190e
Content-Type: application/json

--- request body ---
{"handle":"qa-6dbc61f4a1d6","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-105a0e54-d2fe-4e71-abe2-f133de63190e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-105a0e54-d2fe-4e71-abe2-f133de63190e"}
```
