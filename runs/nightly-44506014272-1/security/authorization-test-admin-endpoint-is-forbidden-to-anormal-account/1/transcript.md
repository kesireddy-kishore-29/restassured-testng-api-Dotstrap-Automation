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
| 1 | `POST /v1/accounts` | 201 | 425 | `qa-2decdd9c-899b-4821-9a43-2ab671e2271f` |
| 2 | `POST /v1/auth/token` | 200 | 61 | `qa-2892c61e-3c01-4175-973d-5f8389a9f13b` |
| 3 | `GET /v1/admin/stats` | 403 | 53 | `qa-0855ead2-c4c1-466e-b3be-b1576c9b0f39` |
| 4 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-6415318b-c4e3-4cd1-9a99-5488740e087b` |
| 5 | `POST /v1/auth/token` | 401 | 16 | `qa-5108c59b-0053-42ae-944b-5020c1bf1a47` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2decdd9c-899b-4821-9a43-2ab671e2271f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2decdd9c-899b-4821-9a43-2ab671e2271f
Content-Type: application/json

--- request body ---
{"handle":"qa-36833a271261","displayName":"QA 36833a271261","password":"****","region":"eu"}

--- response: 201 in 425 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-2decdd9c-899b-4821-9a43-2ab671e2271f
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
Location: /v1/accounts/qa-36833a271261
X-Served-Region: eu
Content-Length: 181

{"id":"acc_83d03ee8-dfb3-4c75-b8d1-320f9210dc89","handle":"qa-36833a271261","displayName":"QA 36833a271261","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.322527265Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2892c61e-3c01-4175-973d-5f8389a9f13b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2892c61e-3c01-4175-973d-5f8389a9f13b
Content-Type: application/json

--- request body ---
{"handle":"qa-36833a271261","password":"****"}

--- response: 200 in 61 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-2892c61e-3c01-4175-973d-5f8389a9f13b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_83d03ee8-dfb3-4c75-b8d1-320f9210dc89"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-0855ead2-c4c1-466e-b3be-b1576c9b0f39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0855ead2-c4c1-466e-b3be-b1576c9b0f39
Content-Type: application/json

--- response: 403 in 53 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0855ead2-c4c1-466e-b3be-b1576c9b0f39
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-0855ead2-c4c1-466e-b3be-b1576c9b0f39"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6415318b-c4e3-4cd1-9a99-5488740e087b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6415318b-c4e3-4cd1-9a99-5488740e087b
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6415318b-c4e3-4cd1-9a99-5488740e087b
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
correlation: qa-5108c59b-0053-42ae-944b-5020c1bf1a47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5108c59b-0053-42ae-944b-5020c1bf1a47
Content-Type: application/json

--- request body ---
{"handle":"qa-36833a271261","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5108c59b-0053-42ae-944b-5020c1bf1a47
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5108c59b-0053-42ae-944b-5020c1bf1a47"}
```
