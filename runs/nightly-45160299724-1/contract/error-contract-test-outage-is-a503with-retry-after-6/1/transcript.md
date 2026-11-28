# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 60 | `qa-cc68d949-e459-4adc-a097-c728a4ad2664` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-a0044029-56b2-4eec-8ea6-f41b0dc46d0e` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-289f05ec-8bab-4598-98e5-114e2811e7cb` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-65578441-c361-48af-95e0-9cd581e538d0` |
| 5 | `POST /v1/conversations` | 503 | 27 | `qa-6a4d835c-185c-4d94-84c2-97414232e497` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-cb13ed1a-dc61-4543-8636-7b134f81e7a8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-7b9ab311-e38b-4c42-8165-426da2aa4359` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-bd4e435a-7724-45a3-a12f-2f097a3f9fd2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-789ec48e-561f-4a3d-80ec-0283c2387624` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-4f5558bf-96e2-40c1-b815-ce6c8c84a891` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cc68d949-e459-4adc-a097-c728a4ad2664

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc68d949-e459-4adc-a097-c728a4ad2664
Content-Type: application/json

--- request body ---
{"handle":"qa-1c670f6c68a7","displayName":"QA 1c670f6c68a7","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc68d949-e459-4adc-a097-c728a4ad2664
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Location: /v1/accounts/qa-1c670f6c68a7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_638e1e30-38be-4fff-9fbd-825e5bfd274e","handle":"qa-1c670f6c68a7","displayName":"QA 1c670f6c68a7","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.898560067Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a0044029-56b2-4eec-8ea6-f41b0dc46d0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0044029-56b2-4eec-8ea6-f41b0dc46d0e
Content-Type: application/json

--- request body ---
{"handle":"qa-2921666d8ee6","displayName":"QA 2921666d8ee6","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0044029-56b2-4eec-8ea6-f41b0dc46d0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Location: /v1/accounts/qa-2921666d8ee6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6cfff520-b73c-4b50-96de-7a1eea6c7c1e","handle":"qa-2921666d8ee6","displayName":"QA 2921666d8ee6","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.928599475Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-289f05ec-8bab-4598-98e5-114e2811e7cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-289f05ec-8bab-4598-98e5-114e2811e7cb
Content-Type: application/json

--- request body ---
{"handle":"qa-1c670f6c68a7","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-289f05ec-8bab-4598-98e5-114e2811e7cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_638e1e30-38be-4fff-9fbd-825e5bfd274e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-65578441-c361-48af-95e0-9cd581e538d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65578441-c361-48af-95e0-9cd581e538d0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2921666d8ee6","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-65578441-c361-48af-95e0-9cd581e538d0
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
Location: /v1/conversations/cnv_006ce1d1-807d-4c5a-a957-c9e76fb44f68
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_006ce1d1-807d-4c5a-a957-c9e76fb44f68","subject":"Error contract","status":"open","region":"eu","participants":["qa-1c670f6c68a7","qa-2921666d8ee6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.004502300Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-6a4d835c-185c-4d94-84c2-97414232e497

--- request headers ---
Accept: application/json
X-Fault-Key: 56f9868f-0d54-464e-970b-9663f6fc7ce7
X-Fault: unavailable-once
X-Correlation-Id: qa-6a4d835c-185c-4d94-84c2-97414232e497
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1c670f6c68a7","subject":"Probe","message":"Hi"}

--- response: 503 in 27 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a4d835c-185c-4d94-84c2-97414232e497
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-6a4d835c-185c-4d94-84c2-97414232e497"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cb13ed1a-dc61-4543-8636-7b134f81e7a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb13ed1a-dc61-4543-8636-7b134f81e7a8
Content-Type: application/json

--- request body ---
{"handle":"qa-2921666d8ee6","password":"****"}

--- response: 200 in 31 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb13ed1a-dc61-4543-8636-7b134f81e7a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6cfff520-b73c-4b50-96de-7a1eea6c7c1e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7b9ab311-e38b-4c42-8165-426da2aa4359

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b9ab311-e38b-4c42-8165-426da2aa4359
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7b9ab311-e38b-4c42-8165-426da2aa4359
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
correlation: qa-bd4e435a-7724-45a3-a12f-2f097a3f9fd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd4e435a-7724-45a3-a12f-2f097a3f9fd2
Content-Type: application/json

--- request body ---
{"handle":"qa-2921666d8ee6","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd4e435a-7724-45a3-a12f-2f097a3f9fd2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bd4e435a-7724-45a3-a12f-2f097a3f9fd2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-789ec48e-561f-4a3d-80ec-0283c2387624

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-789ec48e-561f-4a3d-80ec-0283c2387624
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-789ec48e-561f-4a3d-80ec-0283c2387624
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
correlation: qa-4f5558bf-96e2-40c1-b815-ce6c8c84a891

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f5558bf-96e2-40c1-b815-ce6c8c84a891
Content-Type: application/json

--- request body ---
{"handle":"qa-1c670f6c68a7","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f5558bf-96e2-40c1-b815-ce6c8c84a891
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f5558bf-96e2-40c1-b815-ce6c8c84a891"}
```
