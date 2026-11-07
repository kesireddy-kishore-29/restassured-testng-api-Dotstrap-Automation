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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-e95f9bac-ec3d-4b53-9ef7-d7092318faa4` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-5824cdf1-4424-49c9-933d-57cb54b7520e` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-310ad64c-fd62-4222-8bfa-e19536dc11c7` |
| 4 | `POST /v1/conversations` | 201 | 38 | `qa-7d5ad01b-06e5-4381-8f21-eef1ef451e18` |
| 5 | `GET /v1/conversations` | 503 | 20 | `qa-2590aac7-e40f-4d6f-8131-1a0918e49f13` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-e95cbd32-e506-4d48-9291-67974db87b8e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-36ebe6a8-e435-4e83-bc0c-b9f8e22187fa` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-229b6c16-e1a7-4009-8f79-e62df8c3c5e5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-30acac01-ed3a-420b-9c2a-2608ce7c3326` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-fbc833a3-a947-47b0-8a40-c0e9371a5da0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e95f9bac-ec3d-4b53-9ef7-d7092318faa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e95f9bac-ec3d-4b53-9ef7-d7092318faa4
Content-Type: application/json

--- request body ---
{"handle":"qa-ef38020f4e37","displayName":"QA ef38020f4e37","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-e95f9bac-ec3d-4b53-9ef7-d7092318faa4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Location: /v1/accounts/qa-ef38020f4e37
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6f5bd9e9-2c24-4281-a567-05339e7d0586","handle":"qa-ef38020f4e37","displayName":"QA ef38020f4e37","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.349126752Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5824cdf1-4424-49c9-933d-57cb54b7520e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5824cdf1-4424-49c9-933d-57cb54b7520e
Content-Type: application/json

--- request body ---
{"handle":"qa-d73dd7ed0703","displayName":"QA d73dd7ed0703","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-5824cdf1-4424-49c9-933d-57cb54b7520e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Location: /v1/accounts/qa-d73dd7ed0703
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3170cfa0-0949-4ad1-8932-197dd65c66cf","handle":"qa-d73dd7ed0703","displayName":"QA d73dd7ed0703","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.412388665Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-310ad64c-fd62-4222-8bfa-e19536dc11c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-310ad64c-fd62-4222-8bfa-e19536dc11c7
Content-Type: application/json

--- request body ---
{"handle":"qa-ef38020f4e37","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-310ad64c-fd62-4222-8bfa-e19536dc11c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6f5bd9e9-2c24-4281-a567-05339e7d0586"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7d5ad01b-06e5-4381-8f21-eef1ef451e18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d5ad01b-06e5-4381-8f21-eef1ef451e18
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d73dd7ed0703","subject":"Error contract","message":"Hi"}

--- response: 201 in 38 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d5ad01b-06e5-4381-8f21-eef1ef451e18
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
Location: /v1/conversations/cnv_e8ffb6cd-e04c-413d-9731-837d9f6bce92
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e8ffb6cd-e04c-413d-9731-837d9f6bce92","subject":"Error contract","status":"open","region":"eu","participants":["qa-ef38020f4e37","qa-d73dd7ed0703"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:22.587897975Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-2590aac7-e40f-4d6f-8131-1a0918e49f13

--- request headers ---
Accept: application/json
X-Fault-Key: 0982e988-552f-4afd-acae-c30459366b52
X-Fault: unavailable-once
X-Correlation-Id: qa-2590aac7-e40f-4d6f-8131-1a0918e49f13
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2590aac7-e40f-4d6f-8131-1a0918e49f13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-2590aac7-e40f-4d6f-8131-1a0918e49f13"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e95cbd32-e506-4d48-9291-67974db87b8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e95cbd32-e506-4d48-9291-67974db87b8e
Content-Type: application/json

--- request body ---
{"handle":"qa-d73dd7ed0703","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-e95cbd32-e506-4d48-9291-67974db87b8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3170cfa0-0949-4ad1-8932-197dd65c66cf"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-36ebe6a8-e435-4e83-bc0c-b9f8e22187fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36ebe6a8-e435-4e83-bc0c-b9f8e22187fa
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-36ebe6a8-e435-4e83-bc0c-b9f8e22187fa
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
correlation: qa-229b6c16-e1a7-4009-8f79-e62df8c3c5e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-229b6c16-e1a7-4009-8f79-e62df8c3c5e5
Content-Type: application/json

--- request body ---
{"handle":"qa-d73dd7ed0703","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-229b6c16-e1a7-4009-8f79-e62df8c3c5e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-229b6c16-e1a7-4009-8f79-e62df8c3c5e5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-30acac01-ed3a-420b-9c2a-2608ce7c3326

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30acac01-ed3a-420b-9c2a-2608ce7c3326
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-30acac01-ed3a-420b-9c2a-2608ce7c3326
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
correlation: qa-fbc833a3-a947-47b0-8a40-c0e9371a5da0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbc833a3-a947-47b0-8a40-c0e9371a5da0
Content-Type: application/json

--- request body ---
{"handle":"qa-ef38020f4e37","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fbc833a3-a947-47b0-8a40-c0e9371a5da0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fbc833a3-a947-47b0-8a40-c0e9371a5da0"}
```
