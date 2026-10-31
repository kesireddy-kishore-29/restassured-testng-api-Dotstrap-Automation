# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-f41e6704-cf4d-4fbb-8816-61d54ee1990e` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-16741c02-c65d-40bc-96ab-9a57cae56f55` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-0f10b1e0-eee2-49cc-afd3-ef06c05d0d44` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-29756d68-8357-4947-a80f-03f0d98e6dd9` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 22 | `qa-b739f753-69bd-4bb2-af87-5717ab0ed93f` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-fc50d86e-fb85-4891-a4e8-0cb63f6e93dc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b72b8c66-bb41-4bae-868b-9f90e2136971` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-1df6e14d-f502-492d-89b0-b28e23abb0a5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-3b8e10c4-3305-4321-adf0-3a5c2041d703` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-f966e44e-366c-4190-9a1a-5dd9a19f593a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f41e6704-cf4d-4fbb-8816-61d54ee1990e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f41e6704-cf4d-4fbb-8816-61d54ee1990e
Content-Type: application/json

--- request body ---
{"handle":"qa-1aba23530230","displayName":"QA 1aba23530230","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f41e6704-cf4d-4fbb-8816-61d54ee1990e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Location: /v1/accounts/qa-1aba23530230
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9457305-f402-4441-894a-504bd4936089","handle":"qa-1aba23530230","displayName":"QA 1aba23530230","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.527604273Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-16741c02-c65d-40bc-96ab-9a57cae56f55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16741c02-c65d-40bc-96ab-9a57cae56f55
Content-Type: application/json

--- request body ---
{"handle":"qa-40175c0963ab","displayName":"QA 40175c0963ab","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-16741c02-c65d-40bc-96ab-9a57cae56f55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 7
Location: /v1/accounts/qa-40175c0963ab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_68ddd94f-eb13-44bb-8bd8-b1a3bfdabdba","handle":"qa-40175c0963ab","displayName":"QA 40175c0963ab","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.577943104Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0f10b1e0-eee2-49cc-afd3-ef06c05d0d44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f10b1e0-eee2-49cc-afd3-ef06c05d0d44
Content-Type: application/json

--- request body ---
{"handle":"qa-1aba23530230","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f10b1e0-eee2-49cc-afd3-ef06c05d0d44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9457305-f402-4441-894a-504bd4936089"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-29756d68-8357-4947-a80f-03f0d98e6dd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29756d68-8357-4947-a80f-03f0d98e6dd9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-40175c0963ab","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-29756d68-8357-4947-a80f-03f0d98e6dd9
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
Location: /v1/conversations/cnv_7a37dfe8-2949-45e8-b92c-9316ceba558b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7a37dfe8-2949-45e8-b92c-9316ceba558b","subject":"Error contract","status":"open","region":"eu","participants":["qa-1aba23530230","qa-40175c0963ab"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:00.665729509Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_7a37dfe8-2949-45e8-b92c-9316ceba558b/read
correlation: qa-b739f753-69bd-4bb2-af87-5717ab0ed93f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: eb92b28e-7bf9-448b-828e-8cbb49f76406
X-Correlation-Id: qa-b739f753-69bd-4bb2-af87-5717ab0ed93f
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b739f753-69bd-4bb2-af87-5717ab0ed93f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_7a37dfe8-2949-45e8-b92c-9316ceba558b/read","correlationId":"qa-b739f753-69bd-4bb2-af87-5717ab0ed93f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fc50d86e-fb85-4891-a4e8-0cb63f6e93dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc50d86e-fb85-4891-a4e8-0cb63f6e93dc
Content-Type: application/json

--- request body ---
{"handle":"qa-40175c0963ab","password":"****"}

--- response: 200 in 38 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc50d86e-fb85-4891-a4e8-0cb63f6e93dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68ddd94f-eb13-44bb-8bd8-b1a3bfdabdba"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b72b8c66-bb41-4bae-868b-9f90e2136971

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b72b8c66-bb41-4bae-868b-9f90e2136971
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b72b8c66-bb41-4bae-868b-9f90e2136971
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
correlation: qa-1df6e14d-f502-492d-89b0-b28e23abb0a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1df6e14d-f502-492d-89b0-b28e23abb0a5
Content-Type: application/json

--- request body ---
{"handle":"qa-40175c0963ab","password":"****"}

--- response: 401 in 24 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1df6e14d-f502-492d-89b0-b28e23abb0a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1df6e14d-f502-492d-89b0-b28e23abb0a5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b8e10c4-3305-4321-adf0-3a5c2041d703

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b8e10c4-3305-4321-adf0-3a5c2041d703
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b8e10c4-3305-4321-adf0-3a5c2041d703
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
correlation: qa-f966e44e-366c-4190-9a1a-5dd9a19f593a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f966e44e-366c-4190-9a1a-5dd9a19f593a
Content-Type: application/json

--- request body ---
{"handle":"qa-1aba23530230","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f966e44e-366c-4190-9a1a-5dd9a19f593a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f966e44e-366c-4190-9a1a-5dd9a19f593a"}
```
