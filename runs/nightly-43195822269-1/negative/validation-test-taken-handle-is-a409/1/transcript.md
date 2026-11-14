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
| 1 | `POST /v1/accounts` | 201 | 502 | `qa-61673c2f-3bf5-4590-b9bd-8e37639f73c0` |
| 2 | `POST /v1/accounts` | 409 | 28 | `qa-1145b187-0e73-4391-bd1f-8cd4feb0da16` |
| 3 | `POST /v1/auth/token` | 200 | 48 | `qa-60da2911-b902-454b-8172-fc1371d214ae` |
| 4 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-2ab080a8-6f78-4f93-855c-903748c79915` |
| 5 | `POST /v1/auth/token` | 401 | 26 | `qa-9885b949-e0bd-493f-a155-3eb9a6ddb442` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-61673c2f-3bf5-4590-b9bd-8e37639f73c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61673c2f-3bf5-4590-b9bd-8e37639f73c0
Content-Type: application/json

--- request body ---
{"handle":"qa-ae361d8adbdd","displayName":"QA ae361d8adbdd","password":"****","region":"eu"}

--- response: 201 in 502 ms ---
Date: Thu, 12 Nov 2026 09:56:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-61673c2f-3bf5-4590-b9bd-8e37639f73c0
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
Location: /v1/accounts/qa-ae361d8adbdd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c1efd0c4-1b20-452e-bd5b-cd7ee257bf96","handle":"qa-ae361d8adbdd","displayName":"QA ae361d8adbdd","region":"eu","role":"user","createdAt":"2026-11-12T09:56:40.660560028Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1145b187-0e73-4391-bd1f-8cd4feb0da16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1145b187-0e73-4391-bd1f-8cd4feb0da16
Content-Type: application/json

--- request body ---
{"handle":"qa-ae361d8adbdd","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 28 ms ---
Date: Thu, 12 Nov 2026 09:56:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1145b187-0e73-4391-bd1f-8cd4feb0da16
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
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-ae361d8adbdd' is in use.","instance":"/v1/accounts","correlationId":"qa-1145b187-0e73-4391-bd1f-8cd4feb0da16"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-60da2911-b902-454b-8172-fc1371d214ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60da2911-b902-454b-8172-fc1371d214ae
Content-Type: application/json

--- request body ---
{"handle":"qa-ae361d8adbdd","password":"****"}

--- response: 200 in 48 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-60da2911-b902-454b-8172-fc1371d214ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c1efd0c4-1b20-452e-bd5b-cd7ee257bf96"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2ab080a8-6f78-4f93-855c-903748c79915

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ab080a8-6f78-4f93-855c-903748c79915
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2ab080a8-6f78-4f93-855c-903748c79915
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
correlation: qa-9885b949-e0bd-493f-a155-3eb9a6ddb442

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9885b949-e0bd-493f-a155-3eb9a6ddb442
Content-Type: application/json

--- request body ---
{"handle":"qa-ae361d8adbdd","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9885b949-e0bd-493f-a155-3eb9a6ddb442
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9885b949-e0bd-493f-a155-3eb9a6ddb442"}
```
