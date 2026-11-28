# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-c495d1d8-ca3b-44c1-9fc7-31d773377ee1` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-2c7b4418-3b4a-4759-8880-48f497a325c8` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-de0e53f7-d821-4285-b97c-c3c1b6e9a54e` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-77de1931-f910-4f07-9b38-fe5ae5213c21` |
| 5 | `POST /v1/conversations` | 400 | 11 | `qa-2bf197c3-42ce-4e7a-b408-e8123f9474ec` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-e24b5e74-0536-4386-bf5b-b19e62e6ea5d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-0c9d47b9-191c-4eed-b73e-2cd2fa731381` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-8ab0006c-c4e0-410f-8d5e-5d56b0fbbec6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-ab574fca-7b6e-480e-a463-091e34420a8f` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-784d23eb-445d-4e2c-8856-f80ac67d636c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c495d1d8-ca3b-44c1-9fc7-31d773377ee1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c495d1d8-ca3b-44c1-9fc7-31d773377ee1
Content-Type: application/json

--- request body ---
{"handle":"qa-c00a83a1a1d0","displayName":"QA c00a83a1a1d0","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c495d1d8-ca3b-44c1-9fc7-31d773377ee1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 7
Location: /v1/accounts/qa-c00a83a1a1d0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2eb43a85-4efd-4224-be80-34fd99a2c56c","handle":"qa-c00a83a1a1d0","displayName":"QA c00a83a1a1d0","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.906496035Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2c7b4418-3b4a-4759-8880-48f497a325c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c7b4418-3b4a-4759-8880-48f497a325c8
Content-Type: application/json

--- request body ---
{"handle":"qa-f3e5cd47c836","displayName":"QA f3e5cd47c836","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c7b4418-3b4a-4759-8880-48f497a325c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 7
Location: /v1/accounts/qa-f3e5cd47c836
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f7bf77c5-f428-4671-a71f-8fd3f92e87b6","handle":"qa-f3e5cd47c836","displayName":"QA f3e5cd47c836","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.935325335Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-de0e53f7-d821-4285-b97c-c3c1b6e9a54e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de0e53f7-d821-4285-b97c-c3c1b6e9a54e
Content-Type: application/json

--- request body ---
{"handle":"qa-c00a83a1a1d0","password":"****"}

--- response: 200 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-de0e53f7-d821-4285-b97c-c3c1b6e9a54e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2eb43a85-4efd-4224-be80-34fd99a2c56c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-77de1931-f910-4f07-9b38-fe5ae5213c21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77de1931-f910-4f07-9b38-fe5ae5213c21
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f3e5cd47c836","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-77de1931-f910-4f07-9b38-fe5ae5213c21
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
Location: /v1/conversations/cnv_ea9633dd-d31f-4f98-ba3f-f52525a9e356
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ea9633dd-d31f-4f98-ba3f-f52525a9e356","subject":"Error contract","status":"open","region":"eu","participants":["qa-c00a83a1a1d0","qa-f3e5cd47c836"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:03.011110802Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-2bf197c3-42ce-4e7a-b408-e8123f9474ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bf197c3-42ce-4e7a-b408-e8123f9474ec
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bf197c3-42ce-4e7a-b408-e8123f9474ec
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-2bf197c3-42ce-4e7a-b408-e8123f9474ec"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e24b5e74-0536-4386-bf5b-b19e62e6ea5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e24b5e74-0536-4386-bf5b-b19e62e6ea5d
Content-Type: application/json

--- request body ---
{"handle":"qa-f3e5cd47c836","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e24b5e74-0536-4386-bf5b-b19e62e6ea5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f7bf77c5-f428-4671-a71f-8fd3f92e87b6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c9d47b9-191c-4eed-b73e-2cd2fa731381

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c9d47b9-191c-4eed-b73e-2cd2fa731381
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c9d47b9-191c-4eed-b73e-2cd2fa731381
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
correlation: qa-8ab0006c-c4e0-410f-8d5e-5d56b0fbbec6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ab0006c-c4e0-410f-8d5e-5d56b0fbbec6
Content-Type: application/json

--- request body ---
{"handle":"qa-f3e5cd47c836","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ab0006c-c4e0-410f-8d5e-5d56b0fbbec6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ab0006c-c4e0-410f-8d5e-5d56b0fbbec6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ab574fca-7b6e-480e-a463-091e34420a8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab574fca-7b6e-480e-a463-091e34420a8f
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ab574fca-7b6e-480e-a463-091e34420a8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-784d23eb-445d-4e2c-8856-f80ac67d636c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-784d23eb-445d-4e2c-8856-f80ac67d636c
Content-Type: application/json

--- request body ---
{"handle":"qa-c00a83a1a1d0","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-784d23eb-445d-4e2c-8856-f80ac67d636c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-784d23eb-445d-4e2c-8856-f80ac67d636c"}
```
