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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-623b71e3-ccbb-4f10-9973-64634a71ee19` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-79ed4547-da28-43cd-901b-9164a615a56e` |
| 3 | `GET /v1/accounts/me` | 200 | 12 | `qa-f0288f97-173e-4583-a71e-99cf07286f8a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-af5588d2-86ca-4b44-9a08-caa807aca676` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-91d489ec-5e91-4ccf-8399-d2763a7a01fe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-623b71e3-ccbb-4f10-9973-64634a71ee19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-623b71e3-ccbb-4f10-9973-64634a71ee19
Content-Type: application/json

--- request body ---
{"handle":"qa-91ed556af894","displayName":"QA 91ed556af894","password":"****","region":"in"}

--- response: 201 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-623b71e3-ccbb-4f10-9973-64634a71ee19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-91ed556af894
X-Served-Region: in
Content-Length: 181

{"id":"acc_a82c5134-d6f8-440f-9f45-5a3f8c74b31c","handle":"qa-91ed556af894","displayName":"QA 91ed556af894","region":"in","role":"user","createdAt":"2026-10-25T07:40:27.269670878Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-79ed4547-da28-43cd-901b-9164a615a56e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79ed4547-da28-43cd-901b-9164a615a56e
Content-Type: application/json

--- request body ---
{"handle":"qa-91ed556af894","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-79ed4547-da28-43cd-901b-9164a615a56e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a82c5134-d6f8-440f-9f45-5a3f8c74b31c"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-f0288f97-173e-4583-a71e-99cf07286f8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0288f97-173e-4583-a71e-99cf07286f8a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0288f97-173e-4583-a71e-99cf07286f8a
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

{"id":"acc_a82c5134-d6f8-440f-9f45-5a3f8c74b31c","handle":"qa-91ed556af894","displayName":"QA 91ed556af894","region":"in","role":"user","createdAt":"2026-10-25T07:40:27.269670878Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-af5588d2-86ca-4b44-9a08-caa807aca676

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af5588d2-86ca-4b44-9a08-caa807aca676
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-af5588d2-86ca-4b44-9a08-caa807aca676
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
correlation: qa-91d489ec-5e91-4ccf-8399-d2763a7a01fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91d489ec-5e91-4ccf-8399-d2763a7a01fe
Content-Type: application/json

--- request body ---
{"handle":"qa-91ed556af894","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91d489ec-5e91-4ccf-8399-d2763a7a01fe
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-91d489ec-5e91-4ccf-8399-d2763a7a01fe"}
```
