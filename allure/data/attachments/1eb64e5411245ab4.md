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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-62403966-e133-433c-9ebe-7236ab54ec6a` |
| 2 | `POST /v1/auth/token` | 200 | 39 | `qa-699ed9ed-f392-4206-8678-86c979f477ce` |
| 3 | `GET /v1/admin/stats` | 403 | 17 | `qa-032705f2-f3fd-4f6f-8ef9-3b5cd7ee8549` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-74c14788-2cca-4474-9b47-1a539d88565a` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-fce93721-b825-4968-a85f-1b8d0fc46b81` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-62403966-e133-433c-9ebe-7236ab54ec6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62403966-e133-433c-9ebe-7236ab54ec6a
Content-Type: application/json

--- request body ---
{"handle":"qa-6de18ee5dfaa","displayName":"QA 6de18ee5dfaa","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-62403966-e133-433c-9ebe-7236ab54ec6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-6de18ee5dfaa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7625153f-4cca-4b81-9038-d3836c5fc482","handle":"qa-6de18ee5dfaa","displayName":"QA 6de18ee5dfaa","region":"eu","role":"user","createdAt":"2026-11-28T10:37:17.114117949Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-699ed9ed-f392-4206-8678-86c979f477ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-699ed9ed-f392-4206-8678-86c979f477ce
Content-Type: application/json

--- request body ---
{"handle":"qa-6de18ee5dfaa","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-699ed9ed-f392-4206-8678-86c979f477ce
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7625153f-4cca-4b81-9038-d3836c5fc482"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-032705f2-f3fd-4f6f-8ef9-3b5cd7ee8549

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-032705f2-f3fd-4f6f-8ef9-3b5cd7ee8549
Content-Type: application/json

--- response: 403 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-032705f2-f3fd-4f6f-8ef9-3b5cd7ee8549
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-032705f2-f3fd-4f6f-8ef9-3b5cd7ee8549"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-74c14788-2cca-4474-9b47-1a539d88565a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74c14788-2cca-4474-9b47-1a539d88565a
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-74c14788-2cca-4474-9b47-1a539d88565a
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
correlation: qa-fce93721-b825-4968-a85f-1b8d0fc46b81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fce93721-b825-4968-a85f-1b8d0fc46b81
Content-Type: application/json

--- request body ---
{"handle":"qa-6de18ee5dfaa","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fce93721-b825-4968-a85f-1b8d0fc46b81
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fce93721-b825-4968-a85f-1b8d0fc46b81"}
```
