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
| 1 | `POST /v1/accounts` | 201 | 315 | `qa-cfe26b02-1030-40d1-9d1f-a78d6289b081` |
| 2 | `POST /v1/auth/token` | 200 | 39 | `qa-34be8f24-1fc4-42b5-be40-611f30ef8717` |
| 3 | `GET /v1/accounts/me` | 200 | 35 | `qa-516b928d-95a0-4013-a54d-f04f7e07a963` |
| 4 | `GET /v1/accounts/me` | 200 | 10 | `qa-bb1e8b2b-25cf-48b2-ae4c-9d176060a59b` |
| 5 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-57d8cfc4-07b6-4ebe-a55d-cb1392429a62` |
| 6 | `POST /v1/auth/token` | 401 | 13 | `qa-9367a5a9-6abc-478b-a655-e2bad8305f62` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cfe26b02-1030-40d1-9d1f-a78d6289b081

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfe26b02-1030-40d1-9d1f-a78d6289b081
Content-Type: application/json

--- request body ---
{"handle":"qa-6b23a5bf54bb","displayName":"QA 6b23a5bf54bb","password":"****","region":"eu"}

--- response: 201 in 315 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfe26b02-1030-40d1-9d1f-a78d6289b081
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Location: /v1/accounts/qa-6b23a5bf54bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c2f21c2c-2597-4ae7-9661-4441bbbff8aa","handle":"qa-6b23a5bf54bb","displayName":"QA 6b23a5bf54bb","region":"eu","role":"user","createdAt":"2026-11-24T12:38:04.430553398Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-34be8f24-1fc4-42b5-be40-611f30ef8717

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34be8f24-1fc4-42b5-be40-611f30ef8717
Content-Type: application/json

--- request body ---
{"handle":"qa-6b23a5bf54bb","password":"****"}

--- response: 200 in 39 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-34be8f24-1fc4-42b5-be40-611f30ef8717
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c2f21c2c-2597-4ae7-9661-4441bbbff8aa"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-516b928d-95a0-4013-a54d-f04f7e07a963

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-516b928d-95a0-4013-a54d-f04f7e07a963
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-516b928d-95a0-4013-a54d-f04f7e07a963
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

{"id":"acc_c2f21c2c-2597-4ae7-9661-4441bbbff8aa","handle":"qa-6b23a5bf54bb","displayName":"QA 6b23a5bf54bb","region":"eu","role":"user","createdAt":"2026-11-24T12:38:04.430553398Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb1e8b2b-25cf-48b2-ae4c-9d176060a59b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb1e8b2b-25cf-48b2-ae4c-9d176060a59b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb1e8b2b-25cf-48b2-ae4c-9d176060a59b
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

{"id":"acc_c2f21c2c-2597-4ae7-9661-4441bbbff8aa","handle":"qa-6b23a5bf54bb","displayName":"QA 6b23a5bf54bb","region":"eu","role":"user","createdAt":"2026-11-24T12:38:04.430553398Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-57d8cfc4-07b6-4ebe-a55d-cb1392429a62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57d8cfc4-07b6-4ebe-a55d-cb1392429a62
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-57d8cfc4-07b6-4ebe-a55d-cb1392429a62
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
correlation: qa-9367a5a9-6abc-478b-a655-e2bad8305f62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9367a5a9-6abc-478b-a655-e2bad8305f62
Content-Type: application/json

--- request body ---
{"handle":"qa-6b23a5bf54bb","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9367a5a9-6abc-478b-a655-e2bad8305f62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9367a5a9-6abc-478b-a655-e2bad8305f62"}
```
