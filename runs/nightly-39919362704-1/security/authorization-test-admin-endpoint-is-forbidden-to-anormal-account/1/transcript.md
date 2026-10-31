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
| 1 | `POST /v1/accounts` | 201 | 394 | `qa-d25d95d6-1c78-484f-8336-59ca43273465` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-8c1e5d5c-9b50-4f60-9625-401f5d538e50` |
| 3 | `GET /v1/admin/stats` | 403 | 22 | `qa-a719555a-9947-42be-90d1-acfb3c368246` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-147008aa-4be1-4b17-8ac5-5660f89cabb3` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-8d469e40-13ff-439f-9486-ec3e80effaeb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d25d95d6-1c78-484f-8336-59ca43273465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d25d95d6-1c78-484f-8336-59ca43273465
Content-Type: application/json

--- request body ---
{"handle":"qa-e8011f6f3e0d","displayName":"QA e8011f6f3e0d","password":"****","region":"eu"}

--- response: 201 in 394 ms ---
Date: Fri, 23 Oct 2026 07:41:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-d25d95d6-1c78-484f-8336-59ca43273465
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-e8011f6f3e0d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_feb57044-87c1-4377-890e-8c4e060f3c47","handle":"qa-e8011f6f3e0d","displayName":"QA e8011f6f3e0d","region":"eu","role":"user","createdAt":"2026-10-23T07:41:41.034369529Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8c1e5d5c-9b50-4f60-9625-401f5d538e50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c1e5d5c-9b50-4f60-9625-401f5d538e50
Content-Type: application/json

--- request body ---
{"handle":"qa-e8011f6f3e0d","password":"****"}

--- response: 200 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c1e5d5c-9b50-4f60-9625-401f5d538e50
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_feb57044-87c1-4377-890e-8c4e060f3c47"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-a719555a-9947-42be-90d1-acfb3c368246

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a719555a-9947-42be-90d1-acfb3c368246
Content-Type: application/json

--- response: 403 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a719555a-9947-42be-90d1-acfb3c368246
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-a719555a-9947-42be-90d1-acfb3c368246"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-147008aa-4be1-4b17-8ac5-5660f89cabb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-147008aa-4be1-4b17-8ac5-5660f89cabb3
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-147008aa-4be1-4b17-8ac5-5660f89cabb3
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
correlation: qa-8d469e40-13ff-439f-9486-ec3e80effaeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d469e40-13ff-439f-9486-ec3e80effaeb
Content-Type: application/json

--- request body ---
{"handle":"qa-e8011f6f3e0d","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d469e40-13ff-439f-9486-ec3e80effaeb
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8d469e40-13ff-439f-9486-ec3e80effaeb"}
```
