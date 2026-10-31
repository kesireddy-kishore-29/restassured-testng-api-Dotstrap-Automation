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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-9975a66e-de29-44d0-9d37-1ae2ae399f98` |
| 2 | `POST /v1/accounts` | 409 | 16 | `qa-f918a480-38bb-4fa0-8a50-f9786a5bd784` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-8b5baca1-cef1-4ac2-80f0-3d86c91a4f41` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-f2d86cfe-c04f-46cf-ae8d-3f12c7081da4` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-d9739816-0764-4463-9afb-eb73d0f60faa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9975a66e-de29-44d0-9d37-1ae2ae399f98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9975a66e-de29-44d0-9d37-1ae2ae399f98
Content-Type: application/json

--- request body ---
{"handle":"qa-4c6e7f1a75c7","displayName":"QA 4c6e7f1a75c7","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-9975a66e-de29-44d0-9d37-1ae2ae399f98
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
Location: /v1/accounts/qa-4c6e7f1a75c7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0ac184cf-8603-4220-83b5-b9bede44f9c2","handle":"qa-4c6e7f1a75c7","displayName":"QA 4c6e7f1a75c7","region":"eu","role":"user","createdAt":"2026-10-29T08:38:51.885961426Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f918a480-38bb-4fa0-8a50-f9786a5bd784

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f918a480-38bb-4fa0-8a50-f9786a5bd784
Content-Type: application/json

--- request body ---
{"handle":"qa-4c6e7f1a75c7","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 16 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f918a480-38bb-4fa0-8a50-f9786a5bd784
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

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-4c6e7f1a75c7' is in use.","instance":"/v1/accounts","correlationId":"qa-f918a480-38bb-4fa0-8a50-f9786a5bd784"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8b5baca1-cef1-4ac2-80f0-3d86c91a4f41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b5baca1-cef1-4ac2-80f0-3d86c91a4f41
Content-Type: application/json

--- request body ---
{"handle":"qa-4c6e7f1a75c7","password":"****"}

--- response: 200 in 13 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b5baca1-cef1-4ac2-80f0-3d86c91a4f41
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0ac184cf-8603-4220-83b5-b9bede44f9c2"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f2d86cfe-c04f-46cf-ae8d-3f12c7081da4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2d86cfe-c04f-46cf-ae8d-3f12c7081da4
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f2d86cfe-c04f-46cf-ae8d-3f12c7081da4
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
correlation: qa-d9739816-0764-4463-9afb-eb73d0f60faa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9739816-0764-4463-9afb-eb73d0f60faa
Content-Type: application/json

--- request body ---
{"handle":"qa-4c6e7f1a75c7","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9739816-0764-4463-9afb-eb73d0f60faa
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d9739816-0764-4463-9afb-eb73d0f60faa"}
```
