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
| 1 | `POST /v1/accounts` | 201 | 443 | `qa-d89dc710-6219-41e3-9ffe-37ed2cc860e8` |
| 2 | `POST /v1/auth/token` | 200 | 53 | `qa-fc1bc917-02b5-4539-90d7-f3e6917fb802` |
| 3 | `GET /v1/accounts/me` | 200 | 64 | `qa-4837f5db-76cb-478d-889f-5489112d18ac` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-f109ed86-d51e-41d9-836f-d002bcb8e09a` |
| 5 | `POST /v1/auth/token` | 401 | 23 | `qa-a0d29eb5-39cf-413c-afac-c601964dfc7d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d89dc710-6219-41e3-9ffe-37ed2cc860e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d89dc710-6219-41e3-9ffe-37ed2cc860e8
Content-Type: application/json

--- request body ---
{"handle":"qa-ffd9de5cad6d","displayName":"QA ffd9de5cad6d","password":"****","region":"in"}

--- response: 201 in 443 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d89dc710-6219-41e3-9ffe-37ed2cc860e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-ffd9de5cad6d
X-Served-Region: in
Content-Length: 181

{"id":"acc_4617041d-d86f-4b76-925b-ef22d1c85c6c","handle":"qa-ffd9de5cad6d","displayName":"QA ffd9de5cad6d","region":"in","role":"user","createdAt":"2026-10-29T08:38:57.347275719Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fc1bc917-02b5-4539-90d7-f3e6917fb802

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc1bc917-02b5-4539-90d7-f3e6917fb802
Content-Type: application/json

--- request body ---
{"handle":"qa-ffd9de5cad6d","password":"****"}

--- response: 200 in 53 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc1bc917-02b5-4539-90d7-f3e6917fb802
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4617041d-d86f-4b76-925b-ef22d1c85c6c"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-4837f5db-76cb-478d-889f-5489112d18ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4837f5db-76cb-478d-889f-5489112d18ac
Content-Type: application/json

--- response: 200 in 64 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4837f5db-76cb-478d-889f-5489112d18ac
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

{"id":"acc_4617041d-d86f-4b76-925b-ef22d1c85c6c","handle":"qa-ffd9de5cad6d","displayName":"QA ffd9de5cad6d","region":"in","role":"user","createdAt":"2026-10-29T08:38:57.347275719Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f109ed86-d51e-41d9-836f-d002bcb8e09a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f109ed86-d51e-41d9-836f-d002bcb8e09a
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f109ed86-d51e-41d9-836f-d002bcb8e09a
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
correlation: qa-a0d29eb5-39cf-413c-afac-c601964dfc7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0d29eb5-39cf-413c-afac-c601964dfc7d
Content-Type: application/json

--- request body ---
{"handle":"qa-ffd9de5cad6d","password":"****"}

--- response: 401 in 23 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0d29eb5-39cf-413c-afac-c601964dfc7d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a0d29eb5-39cf-413c-afac-c601964dfc7d"}
```
