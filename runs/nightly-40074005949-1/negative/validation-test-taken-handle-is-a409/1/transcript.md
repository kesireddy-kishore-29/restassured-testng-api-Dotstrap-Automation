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
| 1 | `POST /v1/accounts` | 201 | 395 | `qa-8f762fd4-5a8d-41a8-8faa-1ef6d8f921ef` |
| 2 | `POST /v1/accounts` | 409 | 13 | `qa-8b4b2050-a9f7-4f84-870f-ae6ec22c839e` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-1fd55949-5b38-4445-83bd-1bb7397db471` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-3848adfd-294f-4f57-8565-cf7a26e15cd8` |
| 5 | `POST /v1/auth/token` | 401 | 14 | `qa-5ac93ceb-0658-44cb-9262-07707c459441` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8f762fd4-5a8d-41a8-8faa-1ef6d8f921ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f762fd4-5a8d-41a8-8faa-1ef6d8f921ef
Content-Type: application/json

--- request body ---
{"handle":"qa-be7a0703d9b4","displayName":"QA be7a0703d9b4","password":"****","region":"eu"}

--- response: 201 in 395 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f762fd4-5a8d-41a8-8faa-1ef6d8f921ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-be7a0703d9b4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_59248a39-9914-4faa-9ef4-85f93da3e63d","handle":"qa-be7a0703d9b4","displayName":"QA be7a0703d9b4","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.403688926Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8b4b2050-a9f7-4f84-870f-ae6ec22c839e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b4b2050-a9f7-4f84-870f-ae6ec22c839e
Content-Type: application/json

--- request body ---
{"handle":"qa-be7a0703d9b4","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b4b2050-a9f7-4f84-870f-ae6ec22c839e
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

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-be7a0703d9b4' is in use.","instance":"/v1/accounts","correlationId":"qa-8b4b2050-a9f7-4f84-870f-ae6ec22c839e"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1fd55949-5b38-4445-83bd-1bb7397db471

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fd55949-5b38-4445-83bd-1bb7397db471
Content-Type: application/json

--- request body ---
{"handle":"qa-be7a0703d9b4","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fd55949-5b38-4445-83bd-1bb7397db471
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_59248a39-9914-4faa-9ef4-85f93da3e63d"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3848adfd-294f-4f57-8565-cf7a26e15cd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3848adfd-294f-4f57-8565-cf7a26e15cd8
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3848adfd-294f-4f57-8565-cf7a26e15cd8
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
correlation: qa-5ac93ceb-0658-44cb-9262-07707c459441

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ac93ceb-0658-44cb-9262-07707c459441
Content-Type: application/json

--- request body ---
{"handle":"qa-be7a0703d9b4","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ac93ceb-0658-44cb-9262-07707c459441
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5ac93ceb-0658-44cb-9262-07707c459441"}
```
