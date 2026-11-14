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
| 1 | `POST /v1/accounts` | 201 | 284 | `qa-680dc9e7-3c07-4585-9e7b-05a033626ed0` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-ff8d0e71-9d81-4a58-9f55-bf60fd2e8727` |
| 3 | `GET /v1/accounts/me` | 200 | 17 | `qa-23f76e86-a090-4850-be74-81d5101cf212` |
| 4 | `GET /v1/accounts/me` | 200 | 6 | `qa-a602346c-a018-42ce-8da6-632f3014127b` |
| 5 | `GET /v1/accounts/me` | 200 | 7 | `qa-917eadf5-25aa-4403-b280-27e43e42ea4b` |
| 6 | `GET /v1/accounts/me` | 401 | 4 | `qa-928ce8e8-60bd-46cf-bdf8-7f0f3cd2cb8c` |
| 7 | `GET /v1/accounts/me` | 401 | 3 | `qa-c900486e-b985-4ce4-84de-71c571c740e2` |
| 8 | `POST /v1/auth/token` | 200 | 6 | `qa-7d901ae1-5a5d-4cdb-a99d-5e7acd66aa01` |
| 9 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-f8a8621a-0d5d-4d42-b19b-6f4b2d4f2f5b` |
| 10 | `POST /v1/auth/token` | 401 | 3 | `qa-5549cb48-bf8d-458b-84c0-c3e9357bdfdc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-680dc9e7-3c07-4585-9e7b-05a033626ed0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-680dc9e7-3c07-4585-9e7b-05a033626ed0
Content-Type: application/json

--- request body ---
{"handle":"qa-460b154cf09c","displayName":"QA 460b154cf09c","password":"****","region":"eu"}

--- response: 201 in 284 ms ---
Date: Mon, 09 Nov 2026 09:55:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-680dc9e7-3c07-4585-9e7b-05a033626ed0
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
Location: /v1/accounts/qa-460b154cf09c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ee737a1c-21a2-494f-b14e-3a9619de225f","handle":"qa-460b154cf09c","displayName":"QA 460b154cf09c","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.605098686Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ff8d0e71-9d81-4a58-9f55-bf60fd2e8727

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff8d0e71-9d81-4a58-9f55-bf60fd2e8727
Content-Type: application/json

--- request body ---
{"handle":"qa-460b154cf09c","password":"****","ttlSeconds":1}

--- response: 200 in 26 ms ---
Date: Mon, 09 Nov 2026 09:55:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff8d0e71-9d81-4a58-9f55-bf60fd2e8727
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_ee737a1c-21a2-494f-b14e-3a9619de225f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-23f76e86-a090-4850-be74-81d5101cf212

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23f76e86-a090-4850-be74-81d5101cf212
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-23f76e86-a090-4850-be74-81d5101cf212
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

{"id":"acc_ee737a1c-21a2-494f-b14e-3a9619de225f","handle":"qa-460b154cf09c","displayName":"QA 460b154cf09c","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.605098686Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-a602346c-a018-42ce-8da6-632f3014127b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a602346c-a018-42ce-8da6-632f3014127b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a602346c-a018-42ce-8da6-632f3014127b
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

{"id":"acc_ee737a1c-21a2-494f-b14e-3a9619de225f","handle":"qa-460b154cf09c","displayName":"QA 460b154cf09c","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.605098686Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-917eadf5-25aa-4403-b280-27e43e42ea4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-917eadf5-25aa-4403-b280-27e43e42ea4b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-917eadf5-25aa-4403-b280-27e43e42ea4b
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

{"id":"acc_ee737a1c-21a2-494f-b14e-3a9619de225f","handle":"qa-460b154cf09c","displayName":"QA 460b154cf09c","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.605098686Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-928ce8e8-60bd-46cf-bdf8-7f0f3cd2cb8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-928ce8e8-60bd-46cf-bdf8-7f0f3cd2cb8c
Content-Type: application/json

--- response: 401 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-928ce8e8-60bd-46cf-bdf8-7f0f3cd2cb8c
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-928ce8e8-60bd-46cf-bdf8-7f0f3cd2cb8c"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-c900486e-b985-4ce4-84de-71c571c740e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c900486e-b985-4ce4-84de-71c571c740e2
Content-Type: application/json

--- response: 401 in 3 ms ---
Date: Mon, 09 Nov 2026 09:55:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c900486e-b985-4ce4-84de-71c571c740e2
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-c900486e-b985-4ce4-84de-71c571c740e2"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-7d901ae1-5a5d-4cdb-a99d-5e7acd66aa01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d901ae1-5a5d-4cdb-a99d-5e7acd66aa01
Content-Type: application/json

--- request body ---
{"handle":"qa-460b154cf09c","password":"****"}

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:55:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d901ae1-5a5d-4cdb-a99d-5e7acd66aa01
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ee737a1c-21a2-494f-b14e-3a9619de225f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f8a8621a-0d5d-4d42-b19b-6f4b2d4f2f5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8a8621a-0d5d-4d42-b19b-6f4b2d4f2f5b
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Mon, 09 Nov 2026 09:55:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f8a8621a-0d5d-4d42-b19b-6f4b2d4f2f5b
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
correlation: qa-5549cb48-bf8d-458b-84c0-c3e9357bdfdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5549cb48-bf8d-458b-84c0-c3e9357bdfdc
Content-Type: application/json

--- request body ---
{"handle":"qa-460b154cf09c","password":"****"}

--- response: 401 in 3 ms ---
Date: Mon, 09 Nov 2026 09:55:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5549cb48-bf8d-458b-84c0-c3e9357bdfdc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5549cb48-bf8d-458b-84c0-c3e9357bdfdc"}
```
