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
| 1 | `POST /v1/accounts` | 201 | 343 | `qa-9cdb096f-6618-44cf-8361-8b164e4e3ff3` |
| 2 | `POST /v1/auth/token` | 200 | 36 | `qa-bd0e39af-1f6d-4611-abf8-5ec2e0409bef` |
| 3 | `PATCH /v1/accounts/me` | 200 | 32 | `qa-e1e6fd8d-3d06-4668-9ce6-de22e3896f02` |
| 4 | `GET /v1/accounts/me` | 200 | 13 | `qa-835d5191-eb4c-4785-aee4-bdea09d4d2e8` |
| 5 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-f22e2eed-e003-40b0-9384-fea1c107187c` |
| 6 | `POST /v1/auth/token` | 401 | 24 | `qa-4bbe91bd-0760-4bb2-baa5-cec5f2722d9e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9cdb096f-6618-44cf-8361-8b164e4e3ff3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cdb096f-6618-44cf-8361-8b164e4e3ff3
Content-Type: application/json

--- request body ---
{"handle":"qa-a68bbf209c8b","displayName":"QA a68bbf209c8b","password":"****","region":"eu"}

--- response: 201 in 343 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cdb096f-6618-44cf-8361-8b164e4e3ff3
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
Location: /v1/accounts/qa-a68bbf209c8b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7ae917-235c-4126-af9c-5953c0a8d036","handle":"qa-a68bbf209c8b","displayName":"QA a68bbf209c8b","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.334117796Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bd0e39af-1f6d-4611-abf8-5ec2e0409bef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd0e39af-1f6d-4611-abf8-5ec2e0409bef
Content-Type: application/json

--- request body ---
{"handle":"qa-a68bbf209c8b","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd0e39af-1f6d-4611-abf8-5ec2e0409bef
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b7ae917-235c-4126-af9c-5953c0a8d036"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-e1e6fd8d-3d06-4668-9ce6-de22e3896f02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1e6fd8d-3d06-4668-9ce6-de22e3896f02
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 32 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1e6fd8d-3d06-4668-9ce6-de22e3896f02
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

{"id":"acc_6b7ae917-235c-4126-af9c-5953c0a8d036","handle":"qa-a68bbf209c8b","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.334117796Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-835d5191-eb4c-4785-aee4-bdea09d4d2e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-835d5191-eb4c-4785-aee4-bdea09d4d2e8
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-835d5191-eb4c-4785-aee4-bdea09d4d2e8
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

{"id":"acc_6b7ae917-235c-4126-af9c-5953c0a8d036","handle":"qa-a68bbf209c8b","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.334117796Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f22e2eed-e003-40b0-9384-fea1c107187c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f22e2eed-e003-40b0-9384-fea1c107187c
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f22e2eed-e003-40b0-9384-fea1c107187c
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
correlation: qa-4bbe91bd-0760-4bb2-baa5-cec5f2722d9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bbe91bd-0760-4bb2-baa5-cec5f2722d9e
Content-Type: application/json

--- request body ---
{"handle":"qa-a68bbf209c8b","password":"****"}

--- response: 401 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4bbe91bd-0760-4bb2-baa5-cec5f2722d9e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4bbe91bd-0760-4bb2-baa5-cec5f2722d9e"}
```
