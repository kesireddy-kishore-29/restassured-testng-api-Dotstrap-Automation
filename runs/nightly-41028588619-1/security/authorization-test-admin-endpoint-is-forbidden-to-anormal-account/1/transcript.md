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
| 1 | `POST /v1/accounts` | 201 | 405 | `qa-ea437636-b257-4817-b579-f7fad9848c31` |
| 2 | `POST /v1/auth/token` | 200 | 61 | `qa-2c374776-dad1-4107-a614-651959f7075a` |
| 3 | `GET /v1/admin/stats` | 403 | 54 | `qa-60a27198-30b1-4a5d-9dda-827eb469588a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-c751f4a0-08fc-4165-bee5-c95918d51c08` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-f517a04c-af00-45a9-b47c-ba88552f4012` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ea437636-b257-4817-b579-f7fad9848c31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea437636-b257-4817-b579-f7fad9848c31
Content-Type: application/json

--- request body ---
{"handle":"qa-b6745e3149ce","displayName":"QA b6745e3149ce","password":"****","region":"eu"}

--- response: 201 in 405 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea437636-b257-4817-b579-f7fad9848c31
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
Location: /v1/accounts/qa-b6745e3149ce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_567af03a-4663-47af-8a27-fb60b54349a8","handle":"qa-b6745e3149ce","displayName":"QA b6745e3149ce","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.676792463Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2c374776-dad1-4107-a614-651959f7075a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c374776-dad1-4107-a614-651959f7075a
Content-Type: application/json

--- request body ---
{"handle":"qa-b6745e3149ce","password":"****"}

--- response: 200 in 61 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c374776-dad1-4107-a614-651959f7075a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_567af03a-4663-47af-8a27-fb60b54349a8"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-60a27198-30b1-4a5d-9dda-827eb469588a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60a27198-30b1-4a5d-9dda-827eb469588a
Content-Type: application/json

--- response: 403 in 54 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60a27198-30b1-4a5d-9dda-827eb469588a
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-60a27198-30b1-4a5d-9dda-827eb469588a"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c751f4a0-08fc-4165-bee5-c95918d51c08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c751f4a0-08fc-4165-bee5-c95918d51c08
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c751f4a0-08fc-4165-bee5-c95918d51c08
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
correlation: qa-f517a04c-af00-45a9-b47c-ba88552f4012

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f517a04c-af00-45a9-b47c-ba88552f4012
Content-Type: application/json

--- request body ---
{"handle":"qa-b6745e3149ce","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f517a04c-af00-45a9-b47c-ba88552f4012
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f517a04c-af00-45a9-b47c-ba88552f4012"}
```
