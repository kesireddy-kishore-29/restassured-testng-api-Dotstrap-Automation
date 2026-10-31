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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-e4375fed-89f3-4ff8-971f-0aa97194d8d6` |
| 2 | `POST /v1/auth/token` | 200 | 30 | `qa-4ccac4d4-231c-4e5a-9867-8debd9c60045` |
| 3 | `GET /v1/accounts/me` | 200 | 16 | `qa-446fca2a-8a72-47f0-a308-ef928570fa13` |
| 4 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-780392d4-0f44-4cf2-9020-b75b9bccaa73` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-8fb83c59-5281-4fb9-9df2-c5dbdb42ac13` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e4375fed-89f3-4ff8-971f-0aa97194d8d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4375fed-89f3-4ff8-971f-0aa97194d8d6
Content-Type: application/json

--- request body ---
{"handle":"qa-e0de1f9eb653","displayName":"QA e0de1f9eb653","password":"****","region":"in"}

--- response: 201 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4375fed-89f3-4ff8-971f-0aa97194d8d6
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
Location: /v1/accounts/qa-e0de1f9eb653
X-Served-Region: in
Content-Length: 181

{"id":"acc_58b42178-9dcb-422a-bb73-c790af622d23","handle":"qa-e0de1f9eb653","displayName":"QA e0de1f9eb653","region":"in","role":"user","createdAt":"2026-10-27T08:00:30.977448409Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4ccac4d4-231c-4e5a-9867-8debd9c60045

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ccac4d4-231c-4e5a-9867-8debd9c60045
Content-Type: application/json

--- request body ---
{"handle":"qa-e0de1f9eb653","password":"****"}

--- response: 200 in 30 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ccac4d4-231c-4e5a-9867-8debd9c60045
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_58b42178-9dcb-422a-bb73-c790af622d23"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-446fca2a-8a72-47f0-a308-ef928570fa13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-446fca2a-8a72-47f0-a308-ef928570fa13
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-446fca2a-8a72-47f0-a308-ef928570fa13
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

{"id":"acc_58b42178-9dcb-422a-bb73-c790af622d23","handle":"qa-e0de1f9eb653","displayName":"QA e0de1f9eb653","region":"in","role":"user","createdAt":"2026-10-27T08:00:30.977448409Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-780392d4-0f44-4cf2-9020-b75b9bccaa73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-780392d4-0f44-4cf2-9020-b75b9bccaa73
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-780392d4-0f44-4cf2-9020-b75b9bccaa73
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
correlation: qa-8fb83c59-5281-4fb9-9df2-c5dbdb42ac13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fb83c59-5281-4fb9-9df2-c5dbdb42ac13
Content-Type: application/json

--- request body ---
{"handle":"qa-e0de1f9eb653","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8fb83c59-5281-4fb9-9df2-c5dbdb42ac13
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8fb83c59-5281-4fb9-9df2-c5dbdb42ac13"}
```
