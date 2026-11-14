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
| 1 | `POST /v1/accounts` | 201 | 443 | `qa-afd3e001-e292-4c5c-a25f-c2e251f8d530` |
| 2 | `POST /v1/auth/token` | 200 | 79 | `qa-885d86af-443c-4d6f-9e41-dd00fa79d592` |
| 3 | `PATCH /v1/accounts/me` | 200 | 54 | `qa-d984d2ae-9182-414b-8bf0-6999f69b3f06` |
| 4 | `GET /v1/accounts/me` | 200 | 14 | `qa-e90b7158-0b1a-49f6-bb9e-5acce21ef017` |
| 5 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-4da03868-a27b-44e7-9fba-da6ee9e7550c` |
| 6 | `POST /v1/auth/token` | 401 | 19 | `qa-1f835652-3aec-4eaa-8d25-204007e7c0a0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-afd3e001-e292-4c5c-a25f-c2e251f8d530

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afd3e001-e292-4c5c-a25f-c2e251f8d530
Content-Type: application/json

--- request body ---
{"handle":"qa-0ee897847260","displayName":"QA 0ee897847260","password":"****","region":"eu"}

--- response: 201 in 443 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-afd3e001-e292-4c5c-a25f-c2e251f8d530
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
Location: /v1/accounts/qa-0ee897847260
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fca8f94f-3604-4dda-a5f9-78dfb72a797a","handle":"qa-0ee897847260","displayName":"QA 0ee897847260","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.046182010Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-885d86af-443c-4d6f-9e41-dd00fa79d592

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-885d86af-443c-4d6f-9e41-dd00fa79d592
Content-Type: application/json

--- request body ---
{"handle":"qa-0ee897847260","password":"****"}

--- response: 200 in 79 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-885d86af-443c-4d6f-9e41-dd00fa79d592
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fca8f94f-3604-4dda-a5f9-78dfb72a797a"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d984d2ae-9182-414b-8bf0-6999f69b3f06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d984d2ae-9182-414b-8bf0-6999f69b3f06
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 54 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d984d2ae-9182-414b-8bf0-6999f69b3f06
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

{"id":"acc_fca8f94f-3604-4dda-a5f9-78dfb72a797a","handle":"qa-0ee897847260","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.046182010Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-e90b7158-0b1a-49f6-bb9e-5acce21ef017

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e90b7158-0b1a-49f6-bb9e-5acce21ef017
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e90b7158-0b1a-49f6-bb9e-5acce21ef017
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

{"id":"acc_fca8f94f-3604-4dda-a5f9-78dfb72a797a","handle":"qa-0ee897847260","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.046182010Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4da03868-a27b-44e7-9fba-da6ee9e7550c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4da03868-a27b-44e7-9fba-da6ee9e7550c
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4da03868-a27b-44e7-9fba-da6ee9e7550c
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
correlation: qa-1f835652-3aec-4eaa-8d25-204007e7c0a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f835652-3aec-4eaa-8d25-204007e7c0a0
Content-Type: application/json

--- request body ---
{"handle":"qa-0ee897847260","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f835652-3aec-4eaa-8d25-204007e7c0a0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f835652-3aec-4eaa-8d25-204007e7c0a0"}
```
