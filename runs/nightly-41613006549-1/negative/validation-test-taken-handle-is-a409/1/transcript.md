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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-374dc64b-f375-4b3f-8f3a-41c3a7f8a3f5` |
| 2 | `POST /v1/accounts` | 409 | 9 | `qa-f0cf88ad-ae68-40e1-baef-6ba799e0731e` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-c6ac4c5e-8fbc-48ea-b764-238b563ddf24` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-773e1f60-a1f5-4f05-9142-48468a56225c` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-17289984-9064-40bb-b2bc-70b8b1855751` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-374dc64b-f375-4b3f-8f3a-41c3a7f8a3f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-374dc64b-f375-4b3f-8f3a-41c3a7f8a3f5
Content-Type: application/json

--- request body ---
{"handle":"qa-f2767fdf5868","displayName":"QA f2767fdf5868","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-374dc64b-f375-4b3f-8f3a-41c3a7f8a3f5
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
Location: /v1/accounts/qa-f2767fdf5868
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3bc83b9b-8fdc-4bd4-bd93-20d1864aecbe","handle":"qa-f2767fdf5868","displayName":"QA f2767fdf5868","region":"eu","role":"user","createdAt":"2026-11-03T09:41:37.834198709Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f0cf88ad-ae68-40e1-baef-6ba799e0731e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0cf88ad-ae68-40e1-baef-6ba799e0731e
Content-Type: application/json

--- request body ---
{"handle":"qa-f2767fdf5868","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0cf88ad-ae68-40e1-baef-6ba799e0731e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-f2767fdf5868' is in use.","instance":"/v1/accounts","correlationId":"qa-f0cf88ad-ae68-40e1-baef-6ba799e0731e"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c6ac4c5e-8fbc-48ea-b764-238b563ddf24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6ac4c5e-8fbc-48ea-b764-238b563ddf24
Content-Type: application/json

--- request body ---
{"handle":"qa-f2767fdf5868","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6ac4c5e-8fbc-48ea-b764-238b563ddf24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3bc83b9b-8fdc-4bd4-bd93-20d1864aecbe"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-773e1f60-a1f5-4f05-9142-48468a56225c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-773e1f60-a1f5-4f05-9142-48468a56225c
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-773e1f60-a1f5-4f05-9142-48468a56225c
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
correlation: qa-17289984-9064-40bb-b2bc-70b8b1855751

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17289984-9064-40bb-b2bc-70b8b1855751
Content-Type: application/json

--- request body ---
{"handle":"qa-f2767fdf5868","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17289984-9064-40bb-b2bc-70b8b1855751
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-17289984-9064-40bb-b2bc-70b8b1855751"}
```
