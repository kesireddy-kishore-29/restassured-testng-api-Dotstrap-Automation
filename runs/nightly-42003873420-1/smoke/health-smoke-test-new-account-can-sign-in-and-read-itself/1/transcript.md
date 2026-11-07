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
| 1 | `POST /v1/accounts` | 201 | 509 | `qa-4f2156a0-5806-4260-88ff-44eee152ff1c` |
| 2 | `POST /v1/auth/token` | 200 | 47 | `qa-50453890-1949-49c0-9436-876d1db7d06d` |
| 3 | `GET /v1/accounts/me` | 200 | 46 | `qa-fd17e6ca-38ac-4ff6-8b2b-18b99da73428` |
| 4 | `GET /v1/accounts/me` | 200 | 17 | `qa-46446f1b-3d67-4c7c-a8a1-e103b4226a21` |
| 5 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-108ea521-73f4-4fae-a459-7cfa578b8c70` |
| 6 | `POST /v1/auth/token` | 401 | 28 | `qa-62ceb31f-804c-420b-ba87-30fbdfc39f6b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4f2156a0-5806-4260-88ff-44eee152ff1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f2156a0-5806-4260-88ff-44eee152ff1c
Content-Type: application/json

--- request body ---
{"handle":"qa-d49b4d3502d3","displayName":"QA d49b4d3502d3","password":"****","region":"eu"}

--- response: 201 in 509 ms ---
Date: Thu, 05 Nov 2026 09:37:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f2156a0-5806-4260-88ff-44eee152ff1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-d49b4d3502d3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_01339254-2c1a-4432-9d3d-76806b457963","handle":"qa-d49b4d3502d3","displayName":"QA d49b4d3502d3","region":"eu","role":"user","createdAt":"2026-11-05T09:37:49.742803809Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-50453890-1949-49c0-9436-876d1db7d06d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50453890-1949-49c0-9436-876d1db7d06d
Content-Type: application/json

--- request body ---
{"handle":"qa-d49b4d3502d3","password":"****"}

--- response: 200 in 47 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-50453890-1949-49c0-9436-876d1db7d06d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_01339254-2c1a-4432-9d3d-76806b457963"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd17e6ca-38ac-4ff6-8b2b-18b99da73428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd17e6ca-38ac-4ff6-8b2b-18b99da73428
Content-Type: application/json

--- response: 200 in 46 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd17e6ca-38ac-4ff6-8b2b-18b99da73428
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

{"id":"acc_01339254-2c1a-4432-9d3d-76806b457963","handle":"qa-d49b4d3502d3","displayName":"QA d49b4d3502d3","region":"eu","role":"user","createdAt":"2026-11-05T09:37:49.742803809Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-46446f1b-3d67-4c7c-a8a1-e103b4226a21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46446f1b-3d67-4c7c-a8a1-e103b4226a21
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-46446f1b-3d67-4c7c-a8a1-e103b4226a21
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

{"id":"acc_01339254-2c1a-4432-9d3d-76806b457963","handle":"qa-d49b4d3502d3","displayName":"QA d49b4d3502d3","region":"eu","role":"user","createdAt":"2026-11-05T09:37:49.742803809Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-108ea521-73f4-4fae-a459-7cfa578b8c70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-108ea521-73f4-4fae-a459-7cfa578b8c70
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-108ea521-73f4-4fae-a459-7cfa578b8c70
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
correlation: qa-62ceb31f-804c-420b-ba87-30fbdfc39f6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62ceb31f-804c-420b-ba87-30fbdfc39f6b
Content-Type: application/json

--- request body ---
{"handle":"qa-d49b4d3502d3","password":"****"}

--- response: 401 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62ceb31f-804c-420b-ba87-30fbdfc39f6b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-62ceb31f-804c-420b-ba87-30fbdfc39f6b"}
```
