# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-e733725a-4d1b-4b9b-9570-0ec44c79d190` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-f80286e5-714b-40ca-bb13-fd4bcbafc856` |
| 3 | `POST /v1/auth/token` | 200 | 52 | `qa-d7f81cf5-223d-440e-829e-aa40bcb5aae8` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-3965e89d-c8b1-4c20-b5ec-31ca372f3ed4` |
| 5 | `GET /v1/conversations` | 503 | 22 | `qa-bce710bc-1705-4b6d-b349-e4c9e588cd03` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-8b371fd0-79c7-40bb-9f85-2d49fa344f93` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-c57c1667-cb18-4c28-b82b-b7410ad5cbbb` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-f8408af8-6418-4c18-b675-ad94f781d572` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-ea1f4dde-ca7a-4349-b457-b4026ee8c481` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-3ed3c82b-3c48-4924-9229-615889ea97c4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e733725a-4d1b-4b9b-9570-0ec44c79d190

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e733725a-4d1b-4b9b-9570-0ec44c79d190
Content-Type: application/json

--- request body ---
{"handle":"qa-0f85c6dd481d","displayName":"QA 0f85c6dd481d","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e733725a-4d1b-4b9b-9570-0ec44c79d190
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-0f85c6dd481d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b56d4258-f2fc-4811-80c6-d5d1b600ceb3","handle":"qa-0f85c6dd481d","displayName":"QA 0f85c6dd481d","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.018194469Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f80286e5-714b-40ca-bb13-fd4bcbafc856

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f80286e5-714b-40ca-bb13-fd4bcbafc856
Content-Type: application/json

--- request body ---
{"handle":"qa-42ba28254ec2","displayName":"QA 42ba28254ec2","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f80286e5-714b-40ca-bb13-fd4bcbafc856
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 7
Location: /v1/accounts/qa-42ba28254ec2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_63a77122-444b-4399-86e0-1211978ec111","handle":"qa-42ba28254ec2","displayName":"QA 42ba28254ec2","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.102366379Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d7f81cf5-223d-440e-829e-aa40bcb5aae8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7f81cf5-223d-440e-829e-aa40bcb5aae8
Content-Type: application/json

--- request body ---
{"handle":"qa-0f85c6dd481d","password":"****"}

--- response: 200 in 52 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7f81cf5-223d-440e-829e-aa40bcb5aae8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b56d4258-f2fc-4811-80c6-d5d1b600ceb3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3965e89d-c8b1-4c20-b5ec-31ca372f3ed4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3965e89d-c8b1-4c20-b5ec-31ca372f3ed4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-42ba28254ec2","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-3965e89d-c8b1-4c20-b5ec-31ca372f3ed4
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
Location: /v1/conversations/cnv_6802dd2d-8fb7-46af-bb9b-fe782b2f8713
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6802dd2d-8fb7-46af-bb9b-fe782b2f8713","subject":"Error contract","status":"open","region":"eu","participants":["qa-0f85c6dd481d","qa-42ba28254ec2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.254071107Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-bce710bc-1705-4b6d-b349-e4c9e588cd03

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f70f6050-982f-44c6-b947-40028839f542
X-Correlation-Id: qa-bce710bc-1705-4b6d-b349-e4c9e588cd03
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bce710bc-1705-4b6d-b349-e4c9e588cd03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-bce710bc-1705-4b6d-b349-e4c9e588cd03"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8b371fd0-79c7-40bb-9f85-2d49fa344f93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b371fd0-79c7-40bb-9f85-2d49fa344f93
Content-Type: application/json

--- request body ---
{"handle":"qa-42ba28254ec2","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b371fd0-79c7-40bb-9f85-2d49fa344f93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_63a77122-444b-4399-86e0-1211978ec111"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c57c1667-cb18-4c28-b82b-b7410ad5cbbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c57c1667-cb18-4c28-b82b-b7410ad5cbbb
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c57c1667-cb18-4c28-b82b-b7410ad5cbbb
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
correlation: qa-f8408af8-6418-4c18-b675-ad94f781d572

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8408af8-6418-4c18-b675-ad94f781d572
Content-Type: application/json

--- request body ---
{"handle":"qa-42ba28254ec2","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8408af8-6418-4c18-b675-ad94f781d572
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f8408af8-6418-4c18-b675-ad94f781d572"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea1f4dde-ca7a-4349-b457-b4026ee8c481

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea1f4dde-ca7a-4349-b457-b4026ee8c481
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea1f4dde-ca7a-4349-b457-b4026ee8c481
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
correlation: qa-3ed3c82b-3c48-4924-9229-615889ea97c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ed3c82b-3c48-4924-9229-615889ea97c4
Content-Type: application/json

--- request body ---
{"handle":"qa-0f85c6dd481d","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ed3c82b-3c48-4924-9229-615889ea97c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3ed3c82b-3c48-4924-9229-615889ea97c4"}
```
