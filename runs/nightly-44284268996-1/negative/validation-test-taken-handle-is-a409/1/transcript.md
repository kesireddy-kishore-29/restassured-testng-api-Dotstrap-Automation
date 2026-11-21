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
| 1 | `POST /v1/accounts` | 201 | 413 | `qa-54607380-2681-45a5-a8d5-9b4ec0facdaf` |
| 2 | `POST /v1/accounts` | 409 | 21 | `qa-6ad9480b-f736-4ec0-acfa-c6f83f24b9d4` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-66a8a8a4-6503-467f-bdfb-c8d89df4f162` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-e9de4295-99a9-4549-ad13-5067ec631e75` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-da51189a-1ec7-4f9f-b553-d2e881413bc4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-54607380-2681-45a5-a8d5-9b4ec0facdaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54607380-2681-45a5-a8d5-9b4ec0facdaf
Content-Type: application/json

--- request body ---
{"handle":"qa-462fb259b011","displayName":"QA 462fb259b011","password":"****","region":"eu"}

--- response: 201 in 413 ms ---
Date: Wed, 18 Nov 2026 10:19:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-54607380-2681-45a5-a8d5-9b4ec0facdaf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-462fb259b011
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d798853c-e65d-47c3-800b-5407d3609962","handle":"qa-462fb259b011","displayName":"QA 462fb259b011","region":"eu","role":"user","createdAt":"2026-11-18T10:19:58.745412844Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6ad9480b-f736-4ec0-acfa-c6f83f24b9d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ad9480b-f736-4ec0-acfa-c6f83f24b9d4
Content-Type: application/json

--- request body ---
{"handle":"qa-462fb259b011","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ad9480b-f736-4ec0-acfa-c6f83f24b9d4
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

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-462fb259b011' is in use.","instance":"/v1/accounts","correlationId":"qa-6ad9480b-f736-4ec0-acfa-c6f83f24b9d4"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-66a8a8a4-6503-467f-bdfb-c8d89df4f162

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66a8a8a4-6503-467f-bdfb-c8d89df4f162
Content-Type: application/json

--- request body ---
{"handle":"qa-462fb259b011","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-66a8a8a4-6503-467f-bdfb-c8d89df4f162
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d798853c-e65d-47c3-800b-5407d3609962"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e9de4295-99a9-4549-ad13-5067ec631e75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9de4295-99a9-4549-ad13-5067ec631e75
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e9de4295-99a9-4549-ad13-5067ec631e75
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
correlation: qa-da51189a-1ec7-4f9f-b553-d2e881413bc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da51189a-1ec7-4f9f-b553-d2e881413bc4
Content-Type: application/json

--- request body ---
{"handle":"qa-462fb259b011","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da51189a-1ec7-4f9f-b553-d2e881413bc4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-da51189a-1ec7-4f9f-b553-d2e881413bc4"}
```
