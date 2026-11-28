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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-5c4f52a0-83a8-4a2a-a08a-5b345ef164b8` |
| 2 | `POST /v1/accounts` | 409 | 14 | `qa-0bbe2b6d-5e14-4a19-9272-2849efd4e470` |
| 3 | `POST /v1/auth/token` | 200 | 9 | `qa-6ff0957a-1f67-41f3-8027-e8ad704b2514` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-bab320dc-e480-4bb4-979d-cf31b577a0fd` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-284130dd-179a-4276-b462-e602d8a0a2b3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5c4f52a0-83a8-4a2a-a08a-5b345ef164b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c4f52a0-83a8-4a2a-a08a-5b345ef164b8
Content-Type: application/json

--- request body ---
{"handle":"qa-445d4426dfb5","displayName":"QA 445d4426dfb5","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c4f52a0-83a8-4a2a-a08a-5b345ef164b8
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
Location: /v1/accounts/qa-445d4426dfb5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c07e4890-eca5-4834-9864-3bf16fd0fda1","handle":"qa-445d4426dfb5","displayName":"QA 445d4426dfb5","region":"eu","role":"user","createdAt":"2026-11-23T10:54:53.527273241Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0bbe2b6d-5e14-4a19-9272-2849efd4e470

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bbe2b6d-5e14-4a19-9272-2849efd4e470
Content-Type: application/json

--- request body ---
{"handle":"qa-445d4426dfb5","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0bbe2b6d-5e14-4a19-9272-2849efd4e470
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

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-445d4426dfb5' is in use.","instance":"/v1/accounts","correlationId":"qa-0bbe2b6d-5e14-4a19-9272-2849efd4e470"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6ff0957a-1f67-41f3-8027-e8ad704b2514

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ff0957a-1f67-41f3-8027-e8ad704b2514
Content-Type: application/json

--- request body ---
{"handle":"qa-445d4426dfb5","password":"****"}

--- response: 200 in 9 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ff0957a-1f67-41f3-8027-e8ad704b2514
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c07e4890-eca5-4834-9864-3bf16fd0fda1"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bab320dc-e480-4bb4-979d-cf31b577a0fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bab320dc-e480-4bb4-979d-cf31b577a0fd
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bab320dc-e480-4bb4-979d-cf31b577a0fd
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
correlation: qa-284130dd-179a-4276-b462-e602d8a0a2b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-284130dd-179a-4276-b462-e602d8a0a2b3
Content-Type: application/json

--- request body ---
{"handle":"qa-445d4426dfb5","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-284130dd-179a-4276-b462-e602d8a0a2b3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-284130dd-179a-4276-b462-e602d8a0a2b3"}
```
