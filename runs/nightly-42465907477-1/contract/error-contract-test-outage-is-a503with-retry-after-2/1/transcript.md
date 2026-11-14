# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-49108120-f06a-4925-8785-20ba24bcf7d2` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-3033947a-8fc7-4c8e-9fb4-69ced194b7fd` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-e32f77e1-e680-4ba2-9f81-98bfb96f6de8` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-d29a53fd-ba0a-4106-a04f-8de228af13ed` |
| 5 | `GET /v1/accounts/me` | 503 | 14 | `qa-631eddd8-04a8-427f-b4e0-9a9a5a1ad9a6` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-9070e823-38d9-43b5-bad2-b1c2005a8e23` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-1a1c90d7-f15d-42d9-bd85-a72e2d8f1ec1` |
| 8 | `POST /v1/auth/token` | 401 | 39 | `qa-6458a67c-c21d-42bd-99d0-3b9656836772` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-d1eb9bd4-1c9a-430a-a30d-5cd8759bfea0` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-1202a39b-2e9c-42fc-8b2a-091d1d2ef021` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-49108120-f06a-4925-8785-20ba24bcf7d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49108120-f06a-4925-8785-20ba24bcf7d2
Content-Type: application/json

--- request body ---
{"handle":"qa-a7e646c845bd","displayName":"QA a7e646c845bd","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-49108120-f06a-4925-8785-20ba24bcf7d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-a7e646c845bd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6a6ce150-dd97-421d-8df3-c32ebe93ece0","handle":"qa-a7e646c845bd","displayName":"QA a7e646c845bd","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.701565814Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3033947a-8fc7-4c8e-9fb4-69ced194b7fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3033947a-8fc7-4c8e-9fb4-69ced194b7fd
Content-Type: application/json

--- request body ---
{"handle":"qa-4ea23fb9705c","displayName":"QA 4ea23fb9705c","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-3033947a-8fc7-4c8e-9fb4-69ced194b7fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Location: /v1/accounts/qa-4ea23fb9705c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f4f07c9a-29d7-4f47-acf1-f78def229b4a","handle":"qa-4ea23fb9705c","displayName":"QA 4ea23fb9705c","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.746547116Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e32f77e1-e680-4ba2-9f81-98bfb96f6de8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e32f77e1-e680-4ba2-9f81-98bfb96f6de8
Content-Type: application/json

--- request body ---
{"handle":"qa-a7e646c845bd","password":"****"}

--- response: 200 in 36 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e32f77e1-e680-4ba2-9f81-98bfb96f6de8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6a6ce150-dd97-421d-8df3-c32ebe93ece0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d29a53fd-ba0a-4106-a04f-8de228af13ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d29a53fd-ba0a-4106-a04f-8de228af13ed
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4ea23fb9705c","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d29a53fd-ba0a-4106-a04f-8de228af13ed
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
Location: /v1/conversations/cnv_62466556-7e6c-49d3-bf2e-59027e2b9dc4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_62466556-7e6c-49d3-bf2e-59027e2b9dc4","subject":"Error contract","status":"open","region":"eu","participants":["qa-a7e646c845bd","qa-4ea23fb9705c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.841519181Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-631eddd8-04a8-427f-b4e0-9a9a5a1ad9a6

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e77edb03-ce0b-4855-87a8-f7137586080f
X-Correlation-Id: qa-631eddd8-04a8-427f-b4e0-9a9a5a1ad9a6
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-631eddd8-04a8-427f-b4e0-9a9a5a1ad9a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-631eddd8-04a8-427f-b4e0-9a9a5a1ad9a6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9070e823-38d9-43b5-bad2-b1c2005a8e23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9070e823-38d9-43b5-bad2-b1c2005a8e23
Content-Type: application/json

--- request body ---
{"handle":"qa-4ea23fb9705c","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-9070e823-38d9-43b5-bad2-b1c2005a8e23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f4f07c9a-29d7-4f47-acf1-f78def229b4a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1a1c90d7-f15d-42d9-bd85-a72e2d8f1ec1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a1c90d7-f15d-42d9-bd85-a72e2d8f1ec1
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1a1c90d7-f15d-42d9-bd85-a72e2d8f1ec1
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-6458a67c-c21d-42bd-99d0-3b9656836772

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6458a67c-c21d-42bd-99d0-3b9656836772
Content-Type: application/json

--- request body ---
{"handle":"qa-4ea23fb9705c","password":"****"}

--- response: 401 in 39 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6458a67c-c21d-42bd-99d0-3b9656836772
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6458a67c-c21d-42bd-99d0-3b9656836772"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d1eb9bd4-1c9a-430a-a30d-5cd8759bfea0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1eb9bd4-1c9a-430a-a30d-5cd8759bfea0
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d1eb9bd4-1c9a-430a-a30d-5cd8759bfea0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-1202a39b-2e9c-42fc-8b2a-091d1d2ef021

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1202a39b-2e9c-42fc-8b2a-091d1d2ef021
Content-Type: application/json

--- request body ---
{"handle":"qa-a7e646c845bd","password":"****"}

--- response: 401 in 27 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1202a39b-2e9c-42fc-8b2a-091d1d2ef021
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1202a39b-2e9c-42fc-8b2a-091d1d2ef021"}
```
