# Transcript: A token stops working when it expires

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#expiredTokenIsRefused` |
| Features | FEAT-SEC-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 55 | `qa-86bcb83e-cb3d-4089-8040-826e2d9b29af` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-353a0c7d-2495-4b27-9f00-198ed4723ad8` |
| 3 | `GET /v1/accounts/me` | 200 | 10 | `qa-01c37801-644d-43dc-80af-6469b5071ccb` |
| 4 | `GET /v1/accounts/me` | 200 | 21 | `qa-62bbf301-1874-427d-9644-043c1248957e` |
| 5 | `GET /v1/accounts/me` | 200 | 6 | `qa-1dae7b87-3cbc-46b2-a8a0-f0783800d4f1` |
| 6 | `GET /v1/accounts/me` | 401 | 8 | `qa-1dace4e4-0ba1-46b1-826c-dd9f6d9cad66` |
| 7 | `GET /v1/accounts/me` | 401 | 6 | `qa-f5a568bb-0d93-4843-b816-ea044b3d311d` |
| 8 | `POST /v1/auth/token` | 200 | 9 | `qa-8dee5be4-7b8e-4451-b27e-91337d162196` |
| 9 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-f7636555-d26f-495b-b6b7-d566c3d8a4b6` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-7e95f17d-18c9-447e-9308-7cace41046dc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-86bcb83e-cb3d-4089-8040-826e2d9b29af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86bcb83e-cb3d-4089-8040-826e2d9b29af
Content-Type: application/json

--- request body ---
{"handle":"qa-ae9296e074d1","displayName":"QA ae9296e074d1","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-86bcb83e-cb3d-4089-8040-826e2d9b29af
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
Location: /v1/accounts/qa-ae9296e074d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aa2e3a2d-1e24-43e3-8ac3-a659e2987853","handle":"qa-ae9296e074d1","displayName":"QA ae9296e074d1","region":"eu","role":"user","createdAt":"2026-11-28T10:37:17.201786940Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-353a0c7d-2495-4b27-9f00-198ed4723ad8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-353a0c7d-2495-4b27-9f00-198ed4723ad8
Content-Type: application/json

--- request body ---
{"handle":"qa-ae9296e074d1","password":"****","ttlSeconds":1}

--- response: 200 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-353a0c7d-2495-4b27-9f00-198ed4723ad8
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
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_aa2e3a2d-1e24-43e3-8ac3-a659e2987853"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-01c37801-644d-43dc-80af-6469b5071ccb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01c37801-644d-43dc-80af-6469b5071ccb
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-01c37801-644d-43dc-80af-6469b5071ccb
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
Content-Length: 181

{"id":"acc_aa2e3a2d-1e24-43e3-8ac3-a659e2987853","handle":"qa-ae9296e074d1","displayName":"QA ae9296e074d1","region":"eu","role":"user","createdAt":"2026-11-28T10:37:17.201786940Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-62bbf301-1874-427d-9644-043c1248957e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62bbf301-1874-427d-9644-043c1248957e
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-62bbf301-1874-427d-9644-043c1248957e
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
Content-Length: 181

{"id":"acc_aa2e3a2d-1e24-43e3-8ac3-a659e2987853","handle":"qa-ae9296e074d1","displayName":"QA ae9296e074d1","region":"eu","role":"user","createdAt":"2026-11-28T10:37:17.201786940Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-1dae7b87-3cbc-46b2-a8a0-f0783800d4f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dae7b87-3cbc-46b2-a8a0-f0783800d4f1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dae7b87-3cbc-46b2-a8a0-f0783800d4f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aa2e3a2d-1e24-43e3-8ac3-a659e2987853","handle":"qa-ae9296e074d1","displayName":"QA ae9296e074d1","region":"eu","role":"user","createdAt":"2026-11-28T10:37:17.201786940Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-1dace4e4-0ba1-46b1-826c-dd9f6d9cad66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dace4e4-0ba1-46b1-826c-dd9f6d9cad66
Content-Type: application/json

--- response: 401 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1dace4e4-0ba1-46b1-826c-dd9f6d9cad66
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-1dace4e4-0ba1-46b1-826c-dd9f6d9cad66"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-f5a568bb-0d93-4843-b816-ea044b3d311d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5a568bb-0d93-4843-b816-ea044b3d311d
Content-Type: application/json

--- response: 401 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5a568bb-0d93-4843-b816-ea044b3d311d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-f5a568bb-0d93-4843-b816-ea044b3d311d"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-8dee5be4-7b8e-4451-b27e-91337d162196

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dee5be4-7b8e-4451-b27e-91337d162196
Content-Type: application/json

--- request body ---
{"handle":"qa-ae9296e074d1","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dee5be4-7b8e-4451-b27e-91337d162196
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aa2e3a2d-1e24-43e3-8ac3-a659e2987853"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f7636555-d26f-495b-b6b7-d566c3d8a4b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7636555-d26f-495b-b6b7-d566c3d8a4b6
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f7636555-d26f-495b-b6b7-d566c3d8a4b6
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7e95f17d-18c9-447e-9308-7cace41046dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e95f17d-18c9-447e-9308-7cace41046dc
Content-Type: application/json

--- request body ---
{"handle":"qa-ae9296e074d1","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e95f17d-18c9-447e-9308-7cace41046dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e95f17d-18c9-447e-9308-7cace41046dc"}
```
