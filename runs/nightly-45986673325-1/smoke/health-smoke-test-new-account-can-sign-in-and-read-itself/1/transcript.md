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
| 1 | `POST /v1/accounts` | 201 | 394 | `qa-4acb2241-9202-4e52-8f25-fb8717d12623` |
| 2 | `POST /v1/auth/token` | 200 | 44 | `qa-9d5f6d62-88df-42f4-8b11-8008d2cfcbfa` |
| 3 | `GET /v1/accounts/me` | 200 | 56 | `qa-f7e879cd-2ab5-41a4-b84b-88b0636d5d1e` |
| 4 | `GET /v1/accounts/me` | 200 | 26 | `qa-812ebdff-1264-4438-bb82-4b903a2afb26` |
| 5 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-8357ea5a-2949-4f0b-9b95-c084be39a7d0` |
| 6 | `POST /v1/auth/token` | 401 | 18 | `qa-c3673821-a776-4701-83cd-2648574654d4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4acb2241-9202-4e52-8f25-fb8717d12623

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4acb2241-9202-4e52-8f25-fb8717d12623
Content-Type: application/json

--- request body ---
{"handle":"qa-dd92fb3161cc","displayName":"QA dd92fb3161cc","password":"****","region":"eu"}

--- response: 201 in 394 ms ---
Date: Fri, 27 Nov 2026 10:59:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-4acb2241-9202-4e52-8f25-fb8717d12623
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
Location: /v1/accounts/qa-dd92fb3161cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f7202c9-a52f-4313-ada1-11e5bdcc6bd6","handle":"qa-dd92fb3161cc","displayName":"QA dd92fb3161cc","region":"eu","role":"user","createdAt":"2026-11-27T10:59:54.329924681Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9d5f6d62-88df-42f4-8b11-8008d2cfcbfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d5f6d62-88df-42f4-8b11-8008d2cfcbfa
Content-Type: application/json

--- request body ---
{"handle":"qa-dd92fb3161cc","password":"****"}

--- response: 200 in 44 ms ---
Date: Fri, 27 Nov 2026 10:59:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d5f6d62-88df-42f4-8b11-8008d2cfcbfa
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7f7202c9-a52f-4313-ada1-11e5bdcc6bd6"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-f7e879cd-2ab5-41a4-b84b-88b0636d5d1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7e879cd-2ab5-41a4-b84b-88b0636d5d1e
Content-Type: application/json

--- response: 200 in 56 ms ---
Date: Fri, 27 Nov 2026 10:59:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7e879cd-2ab5-41a4-b84b-88b0636d5d1e
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

{"id":"acc_7f7202c9-a52f-4313-ada1-11e5bdcc6bd6","handle":"qa-dd92fb3161cc","displayName":"QA dd92fb3161cc","region":"eu","role":"user","createdAt":"2026-11-27T10:59:54.329924681Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-812ebdff-1264-4438-bb82-4b903a2afb26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-812ebdff-1264-4438-bb82-4b903a2afb26
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-812ebdff-1264-4438-bb82-4b903a2afb26
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

{"id":"acc_7f7202c9-a52f-4313-ada1-11e5bdcc6bd6","handle":"qa-dd92fb3161cc","displayName":"QA dd92fb3161cc","region":"eu","role":"user","createdAt":"2026-11-27T10:59:54.329924681Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8357ea5a-2949-4f0b-9b95-c084be39a7d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8357ea5a-2949-4f0b-9b95-c084be39a7d0
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8357ea5a-2949-4f0b-9b95-c084be39a7d0
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
correlation: qa-c3673821-a776-4701-83cd-2648574654d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3673821-a776-4701-83cd-2648574654d4
Content-Type: application/json

--- request body ---
{"handle":"qa-dd92fb3161cc","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3673821-a776-4701-83cd-2648574654d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c3673821-a776-4701-83cd-2648574654d4"}
```
