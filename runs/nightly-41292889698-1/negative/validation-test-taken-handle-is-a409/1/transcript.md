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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-c59b09b8-e4a0-4550-b9db-d7706c8ea45e` |
| 2 | `POST /v1/accounts` | 409 | 25 | `qa-e4081c50-eefa-4430-96cf-b8b59bcf4c48` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-52892818-b6cc-4950-b0ac-d02a5425607f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-187539e8-c101-4fb8-841b-6314b055ddc8` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-e501d277-78e3-42ac-8f41-db7cdd576fc9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c59b09b8-e4a0-4550-b9db-d7706c8ea45e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c59b09b8-e4a0-4550-b9db-d7706c8ea45e
Content-Type: application/json

--- request body ---
{"handle":"qa-6860d215057c","displayName":"QA 6860d215057c","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-c59b09b8-e4a0-4550-b9db-d7706c8ea45e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-6860d215057c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_98c4d12d-8849-4ef7-9489-ba7d57566625","handle":"qa-6860d215057c","displayName":"QA 6860d215057c","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.756109416Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e4081c50-eefa-4430-96cf-b8b59bcf4c48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4081c50-eefa-4430-96cf-b8b59bcf4c48
Content-Type: application/json

--- request body ---
{"handle":"qa-6860d215057c","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4081c50-eefa-4430-96cf-b8b59bcf4c48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-6860d215057c' is in use.","instance":"/v1/accounts","correlationId":"qa-e4081c50-eefa-4430-96cf-b8b59bcf4c48"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-52892818-b6cc-4950-b0ac-d02a5425607f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52892818-b6cc-4950-b0ac-d02a5425607f
Content-Type: application/json

--- request body ---
{"handle":"qa-6860d215057c","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-52892818-b6cc-4950-b0ac-d02a5425607f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_98c4d12d-8849-4ef7-9489-ba7d57566625"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-187539e8-c101-4fb8-841b-6314b055ddc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-187539e8-c101-4fb8-841b-6314b055ddc8
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-187539e8-c101-4fb8-841b-6314b055ddc8
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
correlation: qa-e501d277-78e3-42ac-8f41-db7cdd576fc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e501d277-78e3-42ac-8f41-db7cdd576fc9
Content-Type: application/json

--- request body ---
{"handle":"qa-6860d215057c","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e501d277-78e3-42ac-8f41-db7cdd576fc9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e501d277-78e3-42ac-8f41-db7cdd576fc9"}
```
