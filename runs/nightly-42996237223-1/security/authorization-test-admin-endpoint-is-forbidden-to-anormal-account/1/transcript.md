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
| 1 | `POST /v1/accounts` | 201 | 448 | `qa-602b8503-166e-4310-a6a3-9ecbcacf37b9` |
| 2 | `POST /v1/auth/token` | 200 | 63 | `qa-8369e818-ae19-4585-ac24-c68caca4edbe` |
| 3 | `GET /v1/admin/stats` | 403 | 62 | `qa-08d9e772-0498-4057-aded-943d66d5d9d4` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-89b25d67-9047-4d24-8604-d4d991579580` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-14a0c83a-b802-491f-aa2e-75a93bd6e81e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-602b8503-166e-4310-a6a3-9ecbcacf37b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-602b8503-166e-4310-a6a3-9ecbcacf37b9
Content-Type: application/json

--- request body ---
{"handle":"qa-302aa1b1fa40","displayName":"QA 302aa1b1fa40","password":"****","region":"eu"}

--- response: 201 in 448 ms ---
Date: Wed, 11 Nov 2026 09:34:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-602b8503-166e-4310-a6a3-9ecbcacf37b9
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
Location: /v1/accounts/qa-302aa1b1fa40
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bd023ef3-e5fd-469e-8a4e-fbd67b65e721","handle":"qa-302aa1b1fa40","displayName":"QA 302aa1b1fa40","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.557678980Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8369e818-ae19-4585-ac24-c68caca4edbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8369e818-ae19-4585-ac24-c68caca4edbe
Content-Type: application/json

--- request body ---
{"handle":"qa-302aa1b1fa40","password":"****"}

--- response: 200 in 63 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-8369e818-ae19-4585-ac24-c68caca4edbe
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bd023ef3-e5fd-469e-8a4e-fbd67b65e721"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-08d9e772-0498-4057-aded-943d66d5d9d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08d9e772-0498-4057-aded-943d66d5d9d4
Content-Type: application/json

--- response: 403 in 62 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08d9e772-0498-4057-aded-943d66d5d9d4
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-08d9e772-0498-4057-aded-943d66d5d9d4"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-89b25d67-9047-4d24-8604-d4d991579580

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89b25d67-9047-4d24-8604-d4d991579580
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-89b25d67-9047-4d24-8604-d4d991579580
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
correlation: qa-14a0c83a-b802-491f-aa2e-75a93bd6e81e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14a0c83a-b802-491f-aa2e-75a93bd6e81e
Content-Type: application/json

--- request body ---
{"handle":"qa-302aa1b1fa40","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14a0c83a-b802-491f-aa2e-75a93bd6e81e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-14a0c83a-b802-491f-aa2e-75a93bd6e81e"}
```
