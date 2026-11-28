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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-aaa493bb-b3bb-40b8-96e2-1260a96960b4` |
| 2 | `POST /v1/accounts` | 409 | 15 | `qa-b190038f-e198-4b44-9c2f-a2cffe746414` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-d3e852fc-3231-4892-bc16-9c6fb95d28c7` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-9cfc1f86-e13f-4595-b8c7-ae7c496ad339` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-d5f03cbf-7b7a-47df-ba4b-85500fff3cc1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aaa493bb-b3bb-40b8-96e2-1260a96960b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaa493bb-b3bb-40b8-96e2-1260a96960b4
Content-Type: application/json

--- request body ---
{"handle":"qa-ad0ba3c8d73f","displayName":"QA ad0ba3c8d73f","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-aaa493bb-b3bb-40b8-96e2-1260a96960b4
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
Location: /v1/accounts/qa-ad0ba3c8d73f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ae8b151-9468-4e9a-992d-77556aa279c6","handle":"qa-ad0ba3c8d73f","displayName":"QA ad0ba3c8d73f","region":"eu","role":"user","createdAt":"2026-11-28T10:37:14.806603987Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b190038f-e198-4b44-9c2f-a2cffe746414

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b190038f-e198-4b44-9c2f-a2cffe746414
Content-Type: application/json

--- request body ---
{"handle":"qa-ad0ba3c8d73f","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b190038f-e198-4b44-9c2f-a2cffe746414
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
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-ad0ba3c8d73f' is in use.","instance":"/v1/accounts","correlationId":"qa-b190038f-e198-4b44-9c2f-a2cffe746414"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d3e852fc-3231-4892-bc16-9c6fb95d28c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3e852fc-3231-4892-bc16-9c6fb95d28c7
Content-Type: application/json

--- request body ---
{"handle":"qa-ad0ba3c8d73f","password":"****"}

--- response: 200 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3e852fc-3231-4892-bc16-9c6fb95d28c7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ae8b151-9468-4e9a-992d-77556aa279c6"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9cfc1f86-e13f-4595-b8c7-ae7c496ad339

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cfc1f86-e13f-4595-b8c7-ae7c496ad339
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9cfc1f86-e13f-4595-b8c7-ae7c496ad339
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
correlation: qa-d5f03cbf-7b7a-47df-ba4b-85500fff3cc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5f03cbf-7b7a-47df-ba4b-85500fff3cc1
Content-Type: application/json

--- request body ---
{"handle":"qa-ad0ba3c8d73f","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5f03cbf-7b7a-47df-ba4b-85500fff3cc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d5f03cbf-7b7a-47df-ba4b-85500fff3cc1"}
```
