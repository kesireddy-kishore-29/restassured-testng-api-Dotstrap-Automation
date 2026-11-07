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
| 1 | `POST /v1/accounts` | 201 | 343 | `qa-62ef6db1-ff2f-4f59-93c1-447b2c5f3806` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-46a74367-751e-46fa-aa56-76f918b05f78` |
| 3 | `GET /v1/accounts/me` | 200 | 39 | `qa-5368ab49-5b75-4fc8-bf66-522772e8b4f9` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-29bd0d0b-285c-4b70-87ff-d2c06c865775` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-dbad046f-5cab-44cc-8929-685b14ed9a3a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-62ef6db1-ff2f-4f59-93c1-447b2c5f3806

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62ef6db1-ff2f-4f59-93c1-447b2c5f3806
Content-Type: application/json

--- request body ---
{"handle":"qa-f508452cf742","displayName":"QA f508452cf742","password":"****","region":"in"}

--- response: 201 in 343 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-62ef6db1-ff2f-4f59-93c1-447b2c5f3806
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
Location: /v1/accounts/qa-f508452cf742
X-Served-Region: in
Content-Length: 181

{"id":"acc_1e09db35-b9b7-4fcb-8d5f-664f6533e5e1","handle":"qa-f508452cf742","displayName":"QA f508452cf742","region":"in","role":"user","createdAt":"2026-10-30T08:46:04.149290461Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-46a74367-751e-46fa-aa56-76f918b05f78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46a74367-751e-46fa-aa56-76f918b05f78
Content-Type: application/json

--- request body ---
{"handle":"qa-f508452cf742","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-46a74367-751e-46fa-aa56-76f918b05f78
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1e09db35-b9b7-4fcb-8d5f-664f6533e5e1"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-5368ab49-5b75-4fc8-bf66-522772e8b4f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5368ab49-5b75-4fc8-bf66-522772e8b4f9
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5368ab49-5b75-4fc8-bf66-522772e8b4f9
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

{"id":"acc_1e09db35-b9b7-4fcb-8d5f-664f6533e5e1","handle":"qa-f508452cf742","displayName":"QA f508452cf742","region":"in","role":"user","createdAt":"2026-10-30T08:46:04.149290461Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-29bd0d0b-285c-4b70-87ff-d2c06c865775

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29bd0d0b-285c-4b70-87ff-d2c06c865775
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-29bd0d0b-285c-4b70-87ff-d2c06c865775
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
correlation: qa-dbad046f-5cab-44cc-8929-685b14ed9a3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbad046f-5cab-44cc-8929-685b14ed9a3a
Content-Type: application/json

--- request body ---
{"handle":"qa-f508452cf742","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbad046f-5cab-44cc-8929-685b14ed9a3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dbad046f-5cab-44cc-8929-685b14ed9a3a"}
```
