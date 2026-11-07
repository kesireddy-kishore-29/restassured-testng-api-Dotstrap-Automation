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
| 1 | `POST /v1/accounts` | 201 | 479 | `qa-6718c7e9-d910-44f6-bda0-2275cf1a854b` |
| 2 | `POST /v1/auth/token` | 200 | 49 | `qa-87997a83-2350-4ba5-8934-eb111d69da84` |
| 3 | `GET /v1/accounts/me` | 200 | 22 | `qa-f60fc401-c015-44e3-bee2-d0d57a3ee29e` |
| 4 | `GET /v1/accounts/me` | 200 | 8 | `qa-ecd99e35-f8c7-47ed-96d8-d8ed7e6bb7b0` |
| 5 | `GET /v1/accounts/me` | 200 | 7 | `qa-9fcb0ff3-cc41-4c99-b24d-7d9943fcd9b8` |
| 6 | `GET /v1/accounts/me` | 401 | 18 | `qa-c088b2c5-144d-4485-83e4-2941a585736f` |
| 7 | `GET /v1/accounts/me` | 401 | 11 | `qa-60b16832-9cfd-4d5e-a95b-5d54f8eac1f0` |
| 8 | `POST /v1/auth/token` | 200 | 7 | `qa-a8e71afd-5bca-4035-9a86-2cc59c747de5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-9063721c-b9de-4ca9-80db-c6bfdf302565` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-c9802ae2-f05e-42bf-92b0-7a733be493ab` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6718c7e9-d910-44f6-bda0-2275cf1a854b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6718c7e9-d910-44f6-bda0-2275cf1a854b
Content-Type: application/json

--- request body ---
{"handle":"qa-37bd5c802ab0","displayName":"QA 37bd5c802ab0","password":"****","region":"eu"}

--- response: 201 in 479 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-6718c7e9-d910-44f6-bda0-2275cf1a854b
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
Location: /v1/accounts/qa-37bd5c802ab0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7c53cddb-8f58-4946-8481-e44eee9e1f6d","handle":"qa-37bd5c802ab0","displayName":"QA 37bd5c802ab0","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.510452587Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-87997a83-2350-4ba5-8934-eb111d69da84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87997a83-2350-4ba5-8934-eb111d69da84
Content-Type: application/json

--- request body ---
{"handle":"qa-37bd5c802ab0","password":"****","ttlSeconds":1}

--- response: 200 in 49 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-87997a83-2350-4ba5-8934-eb111d69da84
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
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_7c53cddb-8f58-4946-8481-e44eee9e1f6d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-f60fc401-c015-44e3-bee2-d0d57a3ee29e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f60fc401-c015-44e3-bee2-d0d57a3ee29e
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f60fc401-c015-44e3-bee2-d0d57a3ee29e
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

{"id":"acc_7c53cddb-8f58-4946-8481-e44eee9e1f6d","handle":"qa-37bd5c802ab0","displayName":"QA 37bd5c802ab0","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.510452587Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-ecd99e35-f8c7-47ed-96d8-d8ed7e6bb7b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecd99e35-f8c7-47ed-96d8-d8ed7e6bb7b0
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecd99e35-f8c7-47ed-96d8-d8ed7e6bb7b0
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

{"id":"acc_7c53cddb-8f58-4946-8481-e44eee9e1f6d","handle":"qa-37bd5c802ab0","displayName":"QA 37bd5c802ab0","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.510452587Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-9fcb0ff3-cc41-4c99-b24d-7d9943fcd9b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fcb0ff3-cc41-4c99-b24d-7d9943fcd9b8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fcb0ff3-cc41-4c99-b24d-7d9943fcd9b8
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

{"id":"acc_7c53cddb-8f58-4946-8481-e44eee9e1f6d","handle":"qa-37bd5c802ab0","displayName":"QA 37bd5c802ab0","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.510452587Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-c088b2c5-144d-4485-83e4-2941a585736f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c088b2c5-144d-4485-83e4-2941a585736f
Content-Type: application/json

--- response: 401 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c088b2c5-144d-4485-83e4-2941a585736f
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-c088b2c5-144d-4485-83e4-2941a585736f"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-60b16832-9cfd-4d5e-a95b-5d54f8eac1f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60b16832-9cfd-4d5e-a95b-5d54f8eac1f0
Content-Type: application/json

--- response: 401 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60b16832-9cfd-4d5e-a95b-5d54f8eac1f0
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-60b16832-9cfd-4d5e-a95b-5d54f8eac1f0"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-a8e71afd-5bca-4035-9a86-2cc59c747de5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8e71afd-5bca-4035-9a86-2cc59c747de5
Content-Type: application/json

--- request body ---
{"handle":"qa-37bd5c802ab0","password":"****"}

--- response: 200 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8e71afd-5bca-4035-9a86-2cc59c747de5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7c53cddb-8f58-4946-8481-e44eee9e1f6d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9063721c-b9de-4ca9-80db-c6bfdf302565

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9063721c-b9de-4ca9-80db-c6bfdf302565
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9063721c-b9de-4ca9-80db-c6bfdf302565
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
correlation: qa-c9802ae2-f05e-42bf-92b0-7a733be493ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9802ae2-f05e-42bf-92b0-7a733be493ab
Content-Type: application/json

--- request body ---
{"handle":"qa-37bd5c802ab0","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9802ae2-f05e-42bf-92b0-7a733be493ab
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c9802ae2-f05e-42bf-92b0-7a733be493ab"}
```
