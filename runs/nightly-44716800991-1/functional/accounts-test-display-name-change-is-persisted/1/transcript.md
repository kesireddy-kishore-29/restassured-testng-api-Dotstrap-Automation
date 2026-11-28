# Transcript: A new display name is stored and returned

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#displayNameChangeIsPersisted` |
| Features | FEAT-ACCT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 434 | `qa-3771d48d-957f-492f-a9db-d2b36fda4769` |
| 2 | `POST /v1/auth/token` | 200 | 85 | `qa-cffa4201-2e3a-4501-ba69-2204227c7df4` |
| 3 | `PATCH /v1/accounts/me` | 200 | 78 | `qa-16533975-57a3-401a-bd25-15489d372f55` |
| 4 | `GET /v1/accounts/me` | 200 | 13 | `qa-7da57fc4-ef7f-4dd0-b414-76c1f45b6771` |
| 5 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-35886019-6fc8-4214-aa2c-d38544733059` |
| 6 | `POST /v1/auth/token` | 401 | 31 | `qa-dc85376c-b599-4d2f-9110-d34d6f02dcee` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3771d48d-957f-492f-a9db-d2b36fda4769

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3771d48d-957f-492f-a9db-d2b36fda4769
Content-Type: application/json

--- request body ---
{"handle":"qa-4db6043252c0","displayName":"QA 4db6043252c0","password":"****","region":"eu"}

--- response: 201 in 434 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3771d48d-957f-492f-a9db-d2b36fda4769
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
Location: /v1/accounts/qa-4db6043252c0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b49916d9-c0e4-456c-a670-4848bef788e4","handle":"qa-4db6043252c0","displayName":"QA 4db6043252c0","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.254194093Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cffa4201-2e3a-4501-ba69-2204227c7df4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cffa4201-2e3a-4501-ba69-2204227c7df4
Content-Type: application/json

--- request body ---
{"handle":"qa-4db6043252c0","password":"****"}

--- response: 200 in 85 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-cffa4201-2e3a-4501-ba69-2204227c7df4
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b49916d9-c0e4-456c-a670-4848bef788e4"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-16533975-57a3-401a-bd25-15489d372f55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16533975-57a3-401a-bd25-15489d372f55
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 78 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-16533975-57a3-401a-bd25-15489d372f55
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
Content-Length: 179

{"id":"acc_b49916d9-c0e4-456c-a670-4848bef788e4","handle":"qa-4db6043252c0","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.254194093Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-7da57fc4-ef7f-4dd0-b414-76c1f45b6771

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7da57fc4-ef7f-4dd0-b414-76c1f45b6771
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-7da57fc4-ef7f-4dd0-b414-76c1f45b6771
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
Content-Length: 179

{"id":"acc_b49916d9-c0e4-456c-a670-4848bef788e4","handle":"qa-4db6043252c0","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.254194093Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35886019-6fc8-4214-aa2c-d38544733059

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35886019-6fc8-4214-aa2c-d38544733059
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35886019-6fc8-4214-aa2c-d38544733059
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
correlation: qa-dc85376c-b599-4d2f-9110-d34d6f02dcee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc85376c-b599-4d2f-9110-d34d6f02dcee
Content-Type: application/json

--- request body ---
{"handle":"qa-4db6043252c0","password":"****"}

--- response: 401 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc85376c-b599-4d2f-9110-d34d6f02dcee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dc85376c-b599-4d2f-9110-d34d6f02dcee"}
```
