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
| 1 | `POST /v1/accounts` | 201 | 273 | `qa-a42f00d5-92ca-44c7-9c57-3fd772f384a5` |
| 2 | `POST /v1/auth/token` | 200 | 51 | `qa-a8ce2a25-7914-45f0-8094-9f8f39d571d6` |
| 3 | `GET /v1/accounts/me` | 200 | 34 | `qa-02d80b25-2ca6-4a2e-bee3-e127e3c99435` |
| 4 | `GET /v1/accounts/me` | 200 | 9 | `qa-3c16a363-4124-454c-b70f-6c120267711e` |
| 5 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-9271b465-ac40-4565-b929-5c4abc01eea3` |
| 6 | `POST /v1/auth/token` | 401 | 11 | `qa-ad2fe521-5527-4ace-b055-5a75ff7a9cb7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a42f00d5-92ca-44c7-9c57-3fd772f384a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a42f00d5-92ca-44c7-9c57-3fd772f384a5
Content-Type: application/json

--- request body ---
{"handle":"qa-c03b4f47bede","displayName":"QA c03b4f47bede","password":"****","region":"eu"}

--- response: 201 in 273 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-a42f00d5-92ca-44c7-9c57-3fd772f384a5
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
Location: /v1/accounts/qa-c03b4f47bede
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0b907939-6967-4201-b887-a2aec3ef82d8","handle":"qa-c03b4f47bede","displayName":"QA c03b4f47bede","region":"eu","role":"user","createdAt":"2026-11-22T09:54:46.085791684Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a8ce2a25-7914-45f0-8094-9f8f39d571d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8ce2a25-7914-45f0-8094-9f8f39d571d6
Content-Type: application/json

--- request body ---
{"handle":"qa-c03b4f47bede","password":"****"}

--- response: 200 in 51 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8ce2a25-7914-45f0-8094-9f8f39d571d6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0b907939-6967-4201-b887-a2aec3ef82d8"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-02d80b25-2ca6-4a2e-bee3-e127e3c99435

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02d80b25-2ca6-4a2e-bee3-e127e3c99435
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-02d80b25-2ca6-4a2e-bee3-e127e3c99435
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

{"id":"acc_0b907939-6967-4201-b887-a2aec3ef82d8","handle":"qa-c03b4f47bede","displayName":"QA c03b4f47bede","region":"eu","role":"user","createdAt":"2026-11-22T09:54:46.085791684Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-3c16a363-4124-454c-b70f-6c120267711e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c16a363-4124-454c-b70f-6c120267711e
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c16a363-4124-454c-b70f-6c120267711e
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

{"id":"acc_0b907939-6967-4201-b887-a2aec3ef82d8","handle":"qa-c03b4f47bede","displayName":"QA c03b4f47bede","region":"eu","role":"user","createdAt":"2026-11-22T09:54:46.085791684Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9271b465-ac40-4565-b929-5c4abc01eea3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9271b465-ac40-4565-b929-5c4abc01eea3
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9271b465-ac40-4565-b929-5c4abc01eea3
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
correlation: qa-ad2fe521-5527-4ace-b055-5a75ff7a9cb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad2fe521-5527-4ace-b055-5a75ff7a9cb7
Content-Type: application/json

--- request body ---
{"handle":"qa-c03b4f47bede","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad2fe521-5527-4ace-b055-5a75ff7a9cb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad2fe521-5527-4ace-b055-5a75ff7a9cb7"}
```
