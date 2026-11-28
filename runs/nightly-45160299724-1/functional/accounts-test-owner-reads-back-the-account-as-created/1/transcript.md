# Transcript: The owner reads back exactly what was created

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#ownerReadsBackTheAccountAsCreated` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-dc564382-2ceb-406e-890a-0a2815980421` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-3457415c-d73d-4938-a3ae-f7b9a9a0121d` |
| 3 | `GET /v1/accounts/me` | 200 | 14 | `qa-d3a96b70-68c6-4cc1-9c42-181c321c84eb` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-27e5f7b2-b79b-48bd-8305-96d98f43baf3` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-68fb80bb-b9d7-4e7e-ab45-4d47fc2596e5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dc564382-2ceb-406e-890a-0a2815980421

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc564382-2ceb-406e-890a-0a2815980421
Content-Type: application/json

--- request body ---
{"handle":"qa-2563a0a7aea9","displayName":"QA 2563a0a7aea9","password":"****","region":"in"}

--- response: 201 in 23 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc564382-2ceb-406e-890a-0a2815980421
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-2563a0a7aea9
X-Served-Region: in
Content-Length: 181

{"id":"acc_a0ce6f85-3213-4415-b6b6-a6cdbc606fc0","handle":"qa-2563a0a7aea9","displayName":"QA 2563a0a7aea9","region":"in","role":"user","createdAt":"2026-11-23T10:55:03.393840080Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3457415c-d73d-4938-a3ae-f7b9a9a0121d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3457415c-d73d-4938-a3ae-f7b9a9a0121d
Content-Type: application/json

--- request body ---
{"handle":"qa-2563a0a7aea9","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3457415c-d73d-4938-a3ae-f7b9a9a0121d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a0ce6f85-3213-4415-b6b6-a6cdbc606fc0"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d3a96b70-68c6-4cc1-9c42-181c321c84eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3a96b70-68c6-4cc1-9c42-181c321c84eb
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3a96b70-68c6-4cc1-9c42-181c321c84eb
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
X-Served-Region: in
Content-Length: 181

{"id":"acc_a0ce6f85-3213-4415-b6b6-a6cdbc606fc0","handle":"qa-2563a0a7aea9","displayName":"QA 2563a0a7aea9","region":"in","role":"user","createdAt":"2026-11-23T10:55:03.393840080Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27e5f7b2-b79b-48bd-8305-96d98f43baf3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27e5f7b2-b79b-48bd-8305-96d98f43baf3
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27e5f7b2-b79b-48bd-8305-96d98f43baf3
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
X-Served-Region: in
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-68fb80bb-b9d7-4e7e-ab45-4d47fc2596e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68fb80bb-b9d7-4e7e-ab45-4d47fc2596e5
Content-Type: application/json

--- request body ---
{"handle":"qa-2563a0a7aea9","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68fb80bb-b9d7-4e7e-ab45-4d47fc2596e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-68fb80bb-b9d7-4e7e-ab45-4d47fc2596e5"}
```
