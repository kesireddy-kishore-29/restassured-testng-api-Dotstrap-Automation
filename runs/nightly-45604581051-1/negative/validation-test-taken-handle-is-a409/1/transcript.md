# Transcript: A handle that is already taken is a 409

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#takenHandleIsA409` |
| Features | FEAT-ACCT-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-1c46e6fd-57f9-45d7-955c-2f279f1e2fbf` |
| 2 | `POST /v1/accounts` | 409 | 15 | `qa-bf123081-58b2-4c85-82f5-e6f16bbb8715` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-31051cde-cbdc-472f-9e6e-d05d187fec9d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-ea5c3661-8ef5-4a90-bf02-de9b616af796` |
| 5 | `POST /v1/auth/token` | 401 | 17 | `qa-b4b63a7c-f7a3-4b9e-b4b9-509f041a4fc0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1c46e6fd-57f9-45d7-955c-2f279f1e2fbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c46e6fd-57f9-45d7-955c-2f279f1e2fbf
Content-Type: application/json

--- request body ---
{"handle":"qa-1cfa5d61cfaf","displayName":"QA 1cfa5d61cfaf","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c46e6fd-57f9-45d7-955c-2f279f1e2fbf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Location: /v1/accounts/qa-1cfa5d61cfaf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc9c8aa7-8ecc-4707-b1f6-86c6e99ad23f","handle":"qa-1cfa5d61cfaf","displayName":"QA 1cfa5d61cfaf","region":"eu","role":"user","createdAt":"2026-11-25T11:28:07.018863112Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bf123081-58b2-4c85-82f5-e6f16bbb8715

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf123081-58b2-4c85-82f5-e6f16bbb8715
Content-Type: application/json

--- request body ---
{"handle":"qa-1cfa5d61cfaf","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 15 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf123081-58b2-4c85-82f5-e6f16bbb8715
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-1cfa5d61cfaf' is in use.","instance":"/v1/accounts","correlationId":"qa-bf123081-58b2-4c85-82f5-e6f16bbb8715"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-31051cde-cbdc-472f-9e6e-d05d187fec9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31051cde-cbdc-472f-9e6e-d05d187fec9d
Content-Type: application/json

--- request body ---
{"handle":"qa-1cfa5d61cfaf","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-31051cde-cbdc-472f-9e6e-d05d187fec9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc9c8aa7-8ecc-4707-b1f6-86c6e99ad23f"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea5c3661-8ef5-4a90-bf02-de9b616af796

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea5c3661-8ef5-4a90-bf02-de9b616af796
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea5c3661-8ef5-4a90-bf02-de9b616af796
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
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b4b63a7c-f7a3-4b9e-b4b9-509f041a4fc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4b63a7c-f7a3-4b9e-b4b9-509f041a4fc0
Content-Type: application/json

--- request body ---
{"handle":"qa-1cfa5d61cfaf","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4b63a7c-f7a3-4b9e-b4b9-509f041a4fc0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b4b63a7c-f7a3-4b9e-b4b9-509f041a4fc0"}
```
