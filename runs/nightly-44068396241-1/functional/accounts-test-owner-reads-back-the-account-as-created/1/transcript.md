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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-d9c4036e-ec5f-413d-879d-409edb29c701` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-2152dfe4-e675-43d5-9c42-a7659e95b5fe` |
| 3 | `GET /v1/accounts/me` | 200 | 15 | `qa-b4157db1-9897-434c-9e8f-c62b4400490e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-47d54bf6-b506-474b-97d5-f808a0382ab7` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-ae9207da-bfdf-41b7-a33c-449fbae00e3a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d9c4036e-ec5f-413d-879d-409edb29c701

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9c4036e-ec5f-413d-879d-409edb29c701
Content-Type: application/json

--- request body ---
{"handle":"qa-9ac6dcfe41db","displayName":"QA 9ac6dcfe41db","password":"****","region":"in"}

--- response: 201 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9c4036e-ec5f-413d-879d-409edb29c701
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
Location: /v1/accounts/qa-9ac6dcfe41db
X-Served-Region: in
Content-Length: 181

{"id":"acc_0891d14a-a754-42d3-8f66-6b2937a0610d","handle":"qa-9ac6dcfe41db","displayName":"QA 9ac6dcfe41db","region":"in","role":"user","createdAt":"2026-11-17T10:50:11.108307292Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2152dfe4-e675-43d5-9c42-a7659e95b5fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2152dfe4-e675-43d5-9c42-a7659e95b5fe
Content-Type: application/json

--- request body ---
{"handle":"qa-9ac6dcfe41db","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2152dfe4-e675-43d5-9c42-a7659e95b5fe
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0891d14a-a754-42d3-8f66-6b2937a0610d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-b4157db1-9897-434c-9e8f-c62b4400490e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4157db1-9897-434c-9e8f-c62b4400490e
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4157db1-9897-434c-9e8f-c62b4400490e
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

{"id":"acc_0891d14a-a754-42d3-8f66-6b2937a0610d","handle":"qa-9ac6dcfe41db","displayName":"QA 9ac6dcfe41db","region":"in","role":"user","createdAt":"2026-11-17T10:50:11.108307292Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-47d54bf6-b506-474b-97d5-f808a0382ab7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47d54bf6-b506-474b-97d5-f808a0382ab7
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-47d54bf6-b506-474b-97d5-f808a0382ab7
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
correlation: qa-ae9207da-bfdf-41b7-a33c-449fbae00e3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae9207da-bfdf-41b7-a33c-449fbae00e3a
Content-Type: application/json

--- request body ---
{"handle":"qa-9ac6dcfe41db","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae9207da-bfdf-41b7-a33c-449fbae00e3a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ae9207da-bfdf-41b7-a33c-449fbae00e3a"}
```
