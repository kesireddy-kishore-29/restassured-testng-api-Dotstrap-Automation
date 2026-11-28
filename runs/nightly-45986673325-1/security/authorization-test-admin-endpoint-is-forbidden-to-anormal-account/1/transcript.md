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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-dea4b8e6-f525-4b2d-ae99-9e2bb3ba660d` |
| 2 | `POST /v1/auth/token` | 200 | 34 | `qa-338e7604-e79d-4dfc-be76-3378619ee21b` |
| 3 | `GET /v1/admin/stats` | 403 | 44 | `qa-b1b4c5d8-fb87-4f9e-9921-fd265c371db4` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-679dd0af-efbc-4964-a965-84f8dbcfd02d` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-712f2de2-6fbf-4a79-8234-ab2f84d0712b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dea4b8e6-f525-4b2d-ae99-9e2bb3ba660d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dea4b8e6-f525-4b2d-ae99-9e2bb3ba660d
Content-Type: application/json

--- request body ---
{"handle":"qa-3e794c0e5604","displayName":"QA 3e794c0e5604","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-dea4b8e6-f525-4b2d-ae99-9e2bb3ba660d
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
Location: /v1/accounts/qa-3e794c0e5604
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cdc17360-6878-4fac-b302-b2fc8a63442c","handle":"qa-3e794c0e5604","displayName":"QA 3e794c0e5604","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.199979021Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-338e7604-e79d-4dfc-be76-3378619ee21b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-338e7604-e79d-4dfc-be76-3378619ee21b
Content-Type: application/json

--- request body ---
{"handle":"qa-3e794c0e5604","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-338e7604-e79d-4dfc-be76-3378619ee21b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cdc17360-6878-4fac-b302-b2fc8a63442c"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-b1b4c5d8-fb87-4f9e-9921-fd265c371db4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1b4c5d8-fb87-4f9e-9921-fd265c371db4
Content-Type: application/json

--- response: 403 in 44 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1b4c5d8-fb87-4f9e-9921-fd265c371db4
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-b1b4c5d8-fb87-4f9e-9921-fd265c371db4"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-679dd0af-efbc-4964-a965-84f8dbcfd02d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-679dd0af-efbc-4964-a965-84f8dbcfd02d
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-679dd0af-efbc-4964-a965-84f8dbcfd02d
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
correlation: qa-712f2de2-6fbf-4a79-8234-ab2f84d0712b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-712f2de2-6fbf-4a79-8234-ab2f84d0712b
Content-Type: application/json

--- request body ---
{"handle":"qa-3e794c0e5604","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-712f2de2-6fbf-4a79-8234-ab2f84d0712b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-712f2de2-6fbf-4a79-8234-ab2f84d0712b"}
```
