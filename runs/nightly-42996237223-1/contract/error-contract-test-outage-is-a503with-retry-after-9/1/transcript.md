# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-c4d7d688-d58d-4d95-a8a6-ac3310d70110` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-30f52395-c69d-4c07-8b23-260ca4d23c33` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-57d2564d-86d5-45ee-a850-16d305a43051` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-c7fcb473-4fdd-4aeb-8e68-33d3e2a743fa` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 20 | `qa-7765a456-9d79-499e-98be-54429d3b73d5` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-f695b174-8cc5-451f-8aca-badb03d51879` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-95703568-2d6d-40b5-9be9-f5f566309b0e` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-c7d05ff2-cb60-4fde-a1ae-c935cb23fb11` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-556a1bcb-d00c-4ef0-a51f-a252b55bd360` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-7164f71f-c84c-424f-ba15-6918dcea6a37` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c4d7d688-d58d-4d95-a8a6-ac3310d70110

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4d7d688-d58d-4d95-a8a6-ac3310d70110
Content-Type: application/json

--- request body ---
{"handle":"qa-b869ea43ef2d","displayName":"QA b869ea43ef2d","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4d7d688-d58d-4d95-a8a6-ac3310d70110
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
Location: /v1/accounts/qa-b869ea43ef2d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_530979fd-0540-4859-8ece-15c6349ae731","handle":"qa-b869ea43ef2d","displayName":"QA b869ea43ef2d","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.223607969Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-30f52395-c69d-4c07-8b23-260ca4d23c33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30f52395-c69d-4c07-8b23-260ca4d23c33
Content-Type: application/json

--- request body ---
{"handle":"qa-89105b2b6393","displayName":"QA 89105b2b6393","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-30f52395-c69d-4c07-8b23-260ca4d23c33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 7
Location: /v1/accounts/qa-89105b2b6393
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5711ad40-079f-49dd-8001-5e6730dd2bb8","handle":"qa-89105b2b6393","displayName":"QA 89105b2b6393","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.303139774Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-57d2564d-86d5-45ee-a850-16d305a43051

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57d2564d-86d5-45ee-a850-16d305a43051
Content-Type: application/json

--- request body ---
{"handle":"qa-b869ea43ef2d","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-57d2564d-86d5-45ee-a850-16d305a43051
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_530979fd-0540-4859-8ece-15c6349ae731"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c7fcb473-4fdd-4aeb-8e68-33d3e2a743fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7fcb473-4fdd-4aeb-8e68-33d3e2a743fa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-89105b2b6393","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7fcb473-4fdd-4aeb-8e68-33d3e2a743fa
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
Location: /v1/conversations/cnv_a6c86a49-1fff-4def-b8fb-01516c9cbb01
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a6c86a49-1fff-4def-b8fb-01516c9cbb01","subject":"Error contract","status":"open","region":"eu","participants":["qa-b869ea43ef2d","qa-89105b2b6393"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.392424473Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_a6c86a49-1fff-4def-b8fb-01516c9cbb01/messages
correlation: qa-7765a456-9d79-499e-98be-54429d3b73d5

--- request headers ---
Accept: application/json
X-Fault-Key: 01adabc1-d7cf-4bd0-a14f-5e2b5b1a5403
X-Fault: unavailable-once
X-Correlation-Id: qa-7765a456-9d79-499e-98be-54429d3b73d5
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7765a456-9d79-499e-98be-54429d3b73d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_a6c86a49-1fff-4def-b8fb-01516c9cbb01/messages","correlationId":"qa-7765a456-9d79-499e-98be-54429d3b73d5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f695b174-8cc5-451f-8aca-badb03d51879

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f695b174-8cc5-451f-8aca-badb03d51879
Content-Type: application/json

--- request body ---
{"handle":"qa-89105b2b6393","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f695b174-8cc5-451f-8aca-badb03d51879
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5711ad40-079f-49dd-8001-5e6730dd2bb8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-95703568-2d6d-40b5-9be9-f5f566309b0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95703568-2d6d-40b5-9be9-f5f566309b0e
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-95703568-2d6d-40b5-9be9-f5f566309b0e
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
correlation: qa-c7d05ff2-cb60-4fde-a1ae-c935cb23fb11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7d05ff2-cb60-4fde-a1ae-c935cb23fb11
Content-Type: application/json

--- request body ---
{"handle":"qa-89105b2b6393","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7d05ff2-cb60-4fde-a1ae-c935cb23fb11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c7d05ff2-cb60-4fde-a1ae-c935cb23fb11"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-556a1bcb-d00c-4ef0-a51f-a252b55bd360

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-556a1bcb-d00c-4ef0-a51f-a252b55bd360
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-556a1bcb-d00c-4ef0-a51f-a252b55bd360
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
correlation: qa-7164f71f-c84c-424f-ba15-6918dcea6a37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7164f71f-c84c-424f-ba15-6918dcea6a37
Content-Type: application/json

--- request body ---
{"handle":"qa-b869ea43ef2d","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7164f71f-c84c-424f-ba15-6918dcea6a37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7164f71f-c84c-424f-ba15-6918dcea6a37"}
```
