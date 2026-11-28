# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-b5beb340-f242-4ffd-9dbe-407ea761099b` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-4cb6c156-5c46-49af-808f-6ed1dc132eb8` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-c8c37e19-f2d3-457d-9348-73822b1760f0` |
| 4 | `POST /v1/conversations` | 201 | 39 | `qa-da34193e-5347-4215-b96c-0adf322ce783` |
| 5 | `POST /v1/auth/token` | 503 | 13 | `qa-28a517f5-2276-4659-9ec1-f711b22aa817` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-b2d55e3d-f033-480b-9e1a-4f1b553b5cfe` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-b2d8c2d7-9456-4b5a-a5e4-05bbf2613bb2` |
| 8 | `POST /v1/auth/token` | 401 | 40 | `qa-931f939d-f671-4a57-aa83-5208deb0a210` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-7d9ecc2a-3b5e-442a-953a-b588e83610c9` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-b444e8b4-999b-4e50-a314-14f5f85dcf8e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b5beb340-f242-4ffd-9dbe-407ea761099b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5beb340-f242-4ffd-9dbe-407ea761099b
Content-Type: application/json

--- request body ---
{"handle":"qa-ca409cbc31f8","displayName":"QA ca409cbc31f8","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5beb340-f242-4ffd-9dbe-407ea761099b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Location: /v1/accounts/qa-ca409cbc31f8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_67f51ddf-ee7b-495d-a2ac-12d35a1aa7ef","handle":"qa-ca409cbc31f8","displayName":"QA ca409cbc31f8","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.526941359Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4cb6c156-5c46-49af-808f-6ed1dc132eb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cb6c156-5c46-49af-808f-6ed1dc132eb8
Content-Type: application/json

--- request body ---
{"handle":"qa-bc169ff0cef4","displayName":"QA bc169ff0cef4","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cb6c156-5c46-49af-808f-6ed1dc132eb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Location: /v1/accounts/qa-bc169ff0cef4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_04358e75-e0bc-43c5-a1d7-b848bce60802","handle":"qa-bc169ff0cef4","displayName":"QA bc169ff0cef4","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.578657029Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c8c37e19-f2d3-457d-9348-73822b1760f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8c37e19-f2d3-457d-9348-73822b1760f0
Content-Type: application/json

--- request body ---
{"handle":"qa-ca409cbc31f8","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8c37e19-f2d3-457d-9348-73822b1760f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_67f51ddf-ee7b-495d-a2ac-12d35a1aa7ef"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-da34193e-5347-4215-b96c-0adf322ce783

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da34193e-5347-4215-b96c-0adf322ce783
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bc169ff0cef4","subject":"Error contract","message":"Hi"}

--- response: 201 in 39 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-da34193e-5347-4215-b96c-0adf322ce783
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
Location: /v1/conversations/cnv_ff9171cf-f9ba-467f-bb68-4cef8d0c9cbc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ff9171cf-f9ba-467f-bb68-4cef8d0c9cbc","subject":"Error contract","status":"open","region":"eu","participants":["qa-ca409cbc31f8","qa-bc169ff0cef4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.674205015Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-28a517f5-2276-4659-9ec1-f711b22aa817

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 7fcae2cf-b008-4595-8b8c-917772419dd8
X-Correlation-Id: qa-28a517f5-2276-4659-9ec1-f711b22aa817
Content-Type: application/json

--- request body ---
{"handle":"qa-ca409cbc31f8","password":"****"}

--- response: 503 in 13 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-28a517f5-2276-4659-9ec1-f711b22aa817
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-28a517f5-2276-4659-9ec1-f711b22aa817"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b2d55e3d-f033-480b-9e1a-4f1b553b5cfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2d55e3d-f033-480b-9e1a-4f1b553b5cfe
Content-Type: application/json

--- request body ---
{"handle":"qa-bc169ff0cef4","password":"****"}

--- response: 200 in 57 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2d55e3d-f033-480b-9e1a-4f1b553b5cfe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_04358e75-e0bc-43c5-a1d7-b848bce60802"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b2d8c2d7-9456-4b5a-a5e4-05bbf2613bb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2d8c2d7-9456-4b5a-a5e4-05bbf2613bb2
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b2d8c2d7-9456-4b5a-a5e4-05bbf2613bb2
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
correlation: qa-931f939d-f671-4a57-aa83-5208deb0a210

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-931f939d-f671-4a57-aa83-5208deb0a210
Content-Type: application/json

--- request body ---
{"handle":"qa-bc169ff0cef4","password":"****"}

--- response: 401 in 40 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-931f939d-f671-4a57-aa83-5208deb0a210
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-931f939d-f671-4a57-aa83-5208deb0a210"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7d9ecc2a-3b5e-442a-953a-b588e83610c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d9ecc2a-3b5e-442a-953a-b588e83610c9
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7d9ecc2a-3b5e-442a-953a-b588e83610c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b444e8b4-999b-4e50-a314-14f5f85dcf8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b444e8b4-999b-4e50-a314-14f5f85dcf8e
Content-Type: application/json

--- request body ---
{"handle":"qa-ca409cbc31f8","password":"****"}

--- response: 401 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b444e8b4-999b-4e50-a314-14f5f85dcf8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b444e8b4-999b-4e50-a314-14f5f85dcf8e"}
```
