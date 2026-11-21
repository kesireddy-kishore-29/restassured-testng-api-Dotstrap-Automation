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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-5752b401-27b7-443d-aa6d-c50a87a38917` |
| 2 | `POST /v1/accounts` | 409 | 9 | `qa-df36d6e8-fe2b-42a4-8281-9e3434618158` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-3f46b656-e4cb-4c4c-b98e-cc9738e6bcbb` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-6ccab87e-11d4-4715-8fb7-b3275f1126d7` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-fda1a84a-23c8-4246-8e94-55279c81f2f4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5752b401-27b7-443d-aa6d-c50a87a38917

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5752b401-27b7-443d-aa6d-c50a87a38917
Content-Type: application/json

--- request body ---
{"handle":"qa-829b82bca48e","displayName":"QA 829b82bca48e","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5752b401-27b7-443d-aa6d-c50a87a38917
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Location: /v1/accounts/qa-829b82bca48e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5f580d12-96e5-4f1c-b8c6-1f7cf62eae59","handle":"qa-829b82bca48e","displayName":"QA 829b82bca48e","region":"eu","role":"user","createdAt":"2026-11-21T09:56:59.787290904Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-df36d6e8-fe2b-42a4-8281-9e3434618158

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df36d6e8-fe2b-42a4-8281-9e3434618158
Content-Type: application/json

--- request body ---
{"handle":"qa-829b82bca48e","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 9 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df36d6e8-fe2b-42a4-8281-9e3434618158
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-829b82bca48e' is in use.","instance":"/v1/accounts","correlationId":"qa-df36d6e8-fe2b-42a4-8281-9e3434618158"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3f46b656-e4cb-4c4c-b98e-cc9738e6bcbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f46b656-e4cb-4c4c-b98e-cc9738e6bcbb
Content-Type: application/json

--- request body ---
{"handle":"qa-829b82bca48e","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f46b656-e4cb-4c4c-b98e-cc9738e6bcbb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5f580d12-96e5-4f1c-b8c6-1f7cf62eae59"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6ccab87e-11d4-4715-8fb7-b3275f1126d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ccab87e-11d4-4715-8fb7-b3275f1126d7
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6ccab87e-11d4-4715-8fb7-b3275f1126d7
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
correlation: qa-fda1a84a-23c8-4246-8e94-55279c81f2f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fda1a84a-23c8-4246-8e94-55279c81f2f4
Content-Type: application/json

--- request body ---
{"handle":"qa-829b82bca48e","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fda1a84a-23c8-4246-8e94-55279c81f2f4
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fda1a84a-23c8-4246-8e94-55279c81f2f4"}
```
