# Transcript: A new account can sign in and read itself back

| | |
|---|---|
| Test | `com.qaautomation.tests.smoke.HealthSmokeTest#newAccountCanSignInAndReadItself` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 442 | `qa-d54dfbf0-5460-430a-aa86-9f41cc0b706c` |
| 2 | `POST /v1/auth/token` | 200 | 122 | `qa-df27cf1b-d092-4663-b5a8-293f8a79532b` |
| 3 | `GET /v1/accounts/me` | 200 | 44 | `qa-a90dc41d-cd92-4d69-8a23-43e81a7881ef` |
| 4 | `GET /v1/accounts/me` | 200 | 19 | `qa-e164a58f-820d-417b-a1f3-cc2a49108361` |
| 5 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-322d2b13-8bda-4865-a5e0-6e08354df328` |
| 6 | `POST /v1/auth/token` | 401 | 22 | `qa-ca64cec8-f52b-4186-a6f6-c4731e5b1fff` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d54dfbf0-5460-430a-aa86-9f41cc0b706c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d54dfbf0-5460-430a-aa86-9f41cc0b706c
Content-Type: application/json

--- request body ---
{"handle":"qa-e0cdab2b5851","displayName":"QA e0cdab2b5851","password":"****","region":"eu"}

--- response: 201 in 442 ms ---
Date: Fri, 23 Oct 2026 07:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d54dfbf0-5460-430a-aa86-9f41cc0b706c
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
Location: /v1/accounts/qa-e0cdab2b5851
X-Served-Region: eu
Content-Length: 181

{"id":"acc_770faed8-a720-4b90-83e7-78d1b93a84b9","handle":"qa-e0cdab2b5851","displayName":"QA e0cdab2b5851","region":"eu","role":"user","createdAt":"2026-10-23T07:42:05.939916902Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-df27cf1b-d092-4663-b5a8-293f8a79532b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df27cf1b-d092-4663-b5a8-293f8a79532b
Content-Type: application/json

--- request body ---
{"handle":"qa-e0cdab2b5851","password":"****"}

--- response: 200 in 122 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-df27cf1b-d092-4663-b5a8-293f8a79532b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_770faed8-a720-4b90-83e7-78d1b93a84b9"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-a90dc41d-cd92-4d69-8a23-43e81a7881ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a90dc41d-cd92-4d69-8a23-43e81a7881ef
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a90dc41d-cd92-4d69-8a23-43e81a7881ef
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

{"id":"acc_770faed8-a720-4b90-83e7-78d1b93a84b9","handle":"qa-e0cdab2b5851","displayName":"QA e0cdab2b5851","region":"eu","role":"user","createdAt":"2026-10-23T07:42:05.939916902Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-e164a58f-820d-417b-a1f3-cc2a49108361

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e164a58f-820d-417b-a1f3-cc2a49108361
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-e164a58f-820d-417b-a1f3-cc2a49108361
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

{"id":"acc_770faed8-a720-4b90-83e7-78d1b93a84b9","handle":"qa-e0cdab2b5851","displayName":"QA e0cdab2b5851","region":"eu","role":"user","createdAt":"2026-10-23T07:42:05.939916902Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-322d2b13-8bda-4865-a5e0-6e08354df328

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-322d2b13-8bda-4865-a5e0-6e08354df328
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-322d2b13-8bda-4865-a5e0-6e08354df328
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ca64cec8-f52b-4186-a6f6-c4731e5b1fff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca64cec8-f52b-4186-a6f6-c4731e5b1fff
Content-Type: application/json

--- request body ---
{"handle":"qa-e0cdab2b5851","password":"****"}

--- response: 401 in 22 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ca64cec8-f52b-4186-a6f6-c4731e5b1fff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ca64cec8-f52b-4186-a6f6-c4731e5b1fff"}
```
