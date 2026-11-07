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
| 1 | `POST /v1/accounts` | 201 | 396 | `qa-d5a7261e-163d-4abd-bf07-e9442a2d5924` |
| 2 | `POST /v1/auth/token` | 200 | 70 | `qa-a8df2b9f-8ef8-411f-9028-e0f5729e7699` |
| 3 | `GET /v1/accounts/me` | 200 | 50 | `qa-8c2535d4-4e9d-49a8-946b-b4d6bc27bf7d` |
| 4 | `GET /v1/accounts/me` | 200 | 23 | `qa-bd86164f-c152-4c0e-b80f-f889f6975d61` |
| 5 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-bcd249b4-1cb5-4710-8afc-c5a56743dc9d` |
| 6 | `POST /v1/auth/token` | 401 | 13 | `qa-65d6f87d-dcc3-4159-b687-2fbf8dd84674` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d5a7261e-163d-4abd-bf07-e9442a2d5924

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5a7261e-163d-4abd-bf07-e9442a2d5924
Content-Type: application/json

--- request body ---
{"handle":"qa-67c65afdb4f9","displayName":"QA 67c65afdb4f9","password":"****","region":"eu"}

--- response: 201 in 396 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5a7261e-163d-4abd-bf07-e9442a2d5924
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
Location: /v1/accounts/qa-67c65afdb4f9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b46cd32-983b-4994-8113-2adcc41b4bc0","handle":"qa-67c65afdb4f9","displayName":"QA 67c65afdb4f9","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.273798606Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a8df2b9f-8ef8-411f-9028-e0f5729e7699

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8df2b9f-8ef8-411f-9028-e0f5729e7699
Content-Type: application/json

--- request body ---
{"handle":"qa-67c65afdb4f9","password":"****"}

--- response: 200 in 70 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8df2b9f-8ef8-411f-9028-e0f5729e7699
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b46cd32-983b-4994-8113-2adcc41b4bc0"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c2535d4-4e9d-49a8-946b-b4d6bc27bf7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c2535d4-4e9d-49a8-946b-b4d6bc27bf7d
Content-Type: application/json

--- response: 200 in 50 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c2535d4-4e9d-49a8-946b-b4d6bc27bf7d
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

{"id":"acc_3b46cd32-983b-4994-8113-2adcc41b4bc0","handle":"qa-67c65afdb4f9","displayName":"QA 67c65afdb4f9","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.273798606Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd86164f-c152-4c0e-b80f-f889f6975d61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd86164f-c152-4c0e-b80f-f889f6975d61
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd86164f-c152-4c0e-b80f-f889f6975d61
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

{"id":"acc_3b46cd32-983b-4994-8113-2adcc41b4bc0","handle":"qa-67c65afdb4f9","displayName":"QA 67c65afdb4f9","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.273798606Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bcd249b4-1cb5-4710-8afc-c5a56743dc9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcd249b4-1cb5-4710-8afc-c5a56743dc9d
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bcd249b4-1cb5-4710-8afc-c5a56743dc9d
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
correlation: qa-65d6f87d-dcc3-4159-b687-2fbf8dd84674

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65d6f87d-dcc3-4159-b687-2fbf8dd84674
Content-Type: application/json

--- request body ---
{"handle":"qa-67c65afdb4f9","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65d6f87d-dcc3-4159-b687-2fbf8dd84674
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-65d6f87d-dcc3-4159-b687-2fbf8dd84674"}
```
