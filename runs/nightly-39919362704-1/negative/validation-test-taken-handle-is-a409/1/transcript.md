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
| 1 | `POST /v1/accounts` | 201 | 474 | `qa-c16ffc50-5770-46ca-b039-b3151d26664e` |
| 2 | `POST /v1/accounts` | 409 | 29 | `qa-e32d3706-5437-46ee-804c-8b4cc641abc8` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-790cb8dd-4d5e-48da-9e0d-377f4fa3a67a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-f8abc6e7-f4b2-40fd-9085-2711627a12b6` |
| 5 | `POST /v1/auth/token` | 401 | 22 | `qa-cea01bc3-1342-4783-821e-faf6c74b049f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c16ffc50-5770-46ca-b039-b3151d26664e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c16ffc50-5770-46ca-b039-b3151d26664e
Content-Type: application/json

--- request body ---
{"handle":"qa-dcf18eb59ce1","displayName":"QA dcf18eb59ce1","password":"****","region":"eu"}

--- response: 201 in 474 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-c16ffc50-5770-46ca-b039-b3151d26664e
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
Location: /v1/accounts/qa-dcf18eb59ce1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8ddc8a89-33ca-45c9-bf03-21f369d33fb8","handle":"qa-dcf18eb59ce1","displayName":"QA dcf18eb59ce1","region":"eu","role":"user","createdAt":"2026-10-23T07:41:15.798422047Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e32d3706-5437-46ee-804c-8b4cc641abc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e32d3706-5437-46ee-804c-8b4cc641abc8
Content-Type: application/json

--- request body ---
{"handle":"qa-dcf18eb59ce1","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 29 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e32d3706-5437-46ee-804c-8b4cc641abc8
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

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-dcf18eb59ce1' is in use.","instance":"/v1/accounts","correlationId":"qa-e32d3706-5437-46ee-804c-8b4cc641abc8"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-790cb8dd-4d5e-48da-9e0d-377f4fa3a67a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-790cb8dd-4d5e-48da-9e0d-377f4fa3a67a
Content-Type: application/json

--- request body ---
{"handle":"qa-dcf18eb59ce1","password":"****"}

--- response: 200 in 46 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-790cb8dd-4d5e-48da-9e0d-377f4fa3a67a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8ddc8a89-33ca-45c9-bf03-21f369d33fb8"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f8abc6e7-f4b2-40fd-9085-2711627a12b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8abc6e7-f4b2-40fd-9085-2711627a12b6
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f8abc6e7-f4b2-40fd-9085-2711627a12b6
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
correlation: qa-cea01bc3-1342-4783-821e-faf6c74b049f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cea01bc3-1342-4783-821e-faf6c74b049f
Content-Type: application/json

--- request body ---
{"handle":"qa-dcf18eb59ce1","password":"****"}

--- response: 401 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cea01bc3-1342-4783-821e-faf6c74b049f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cea01bc3-1342-4783-821e-faf6c74b049f"}
```
