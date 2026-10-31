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
| 1 | `POST /v1/accounts` | 201 | 365 | `qa-a8c9c446-3463-48ed-af23-72e0448c4332` |
| 2 | `POST /v1/auth/token` | 200 | 46 | `qa-f7d35a5c-d422-42e4-bbea-d0fd92eb9810` |
| 3 | `GET /v1/accounts/me` | 200 | 26 | `qa-f064ca32-5aea-47b8-89ed-5596149b0aed` |
| 4 | `GET /v1/accounts/me` | 200 | 12 | `qa-93fdac87-ad9f-4d62-bc11-5aa71aa7baab` |
| 5 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-8adcf5e3-e3bf-405e-a610-96928833a8c0` |
| 6 | `POST /v1/auth/token` | 401 | 13 | `qa-b1f53b21-4d52-4f20-b20c-0fed9bc359f1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a8c9c446-3463-48ed-af23-72e0448c4332

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8c9c446-3463-48ed-af23-72e0448c4332
Content-Type: application/json

--- request body ---
{"handle":"qa-961945803623","displayName":"QA 961945803623","password":"****","region":"eu"}

--- response: 201 in 365 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8c9c446-3463-48ed-af23-72e0448c4332
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
Location: /v1/accounts/qa-961945803623
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2cf51d74-7462-4ee5-a20c-2c62e1862db1","handle":"qa-961945803623","displayName":"QA 961945803623","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.568092770Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f7d35a5c-d422-42e4-bbea-d0fd92eb9810

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7d35a5c-d422-42e4-bbea-d0fd92eb9810
Content-Type: application/json

--- request body ---
{"handle":"qa-961945803623","password":"****"}

--- response: 200 in 46 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7d35a5c-d422-42e4-bbea-d0fd92eb9810
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2cf51d74-7462-4ee5-a20c-2c62e1862db1"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-f064ca32-5aea-47b8-89ed-5596149b0aed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f064ca32-5aea-47b8-89ed-5596149b0aed
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f064ca32-5aea-47b8-89ed-5596149b0aed
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

{"id":"acc_2cf51d74-7462-4ee5-a20c-2c62e1862db1","handle":"qa-961945803623","displayName":"QA 961945803623","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.568092770Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-93fdac87-ad9f-4d62-bc11-5aa71aa7baab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93fdac87-ad9f-4d62-bc11-5aa71aa7baab
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-93fdac87-ad9f-4d62-bc11-5aa71aa7baab
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

{"id":"acc_2cf51d74-7462-4ee5-a20c-2c62e1862db1","handle":"qa-961945803623","displayName":"QA 961945803623","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.568092770Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8adcf5e3-e3bf-405e-a610-96928833a8c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8adcf5e3-e3bf-405e-a610-96928833a8c0
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8adcf5e3-e3bf-405e-a610-96928833a8c0
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
correlation: qa-b1f53b21-4d52-4f20-b20c-0fed9bc359f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1f53b21-4d52-4f20-b20c-0fed9bc359f1
Content-Type: application/json

--- request body ---
{"handle":"qa-961945803623","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1f53b21-4d52-4f20-b20c-0fed9bc359f1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1f53b21-4d52-4f20-b20c-0fed9bc359f1"}
```
