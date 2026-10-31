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
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-7d00f52f-bf28-4c07-8750-bba91561d3a3` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-0b069bad-f314-4be4-aa25-8863f0d9cf04` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-af00f14a-aa3b-4fd5-ad1c-a024c544c74b` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-3edce7ec-735f-46fb-81c8-b86ffaaebdeb` |
| 5 | `GET /v1/conversations` | 503 | 14 | `qa-a9f13e80-10be-4909-ac8f-99a8ee32bdf0` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-398cf05e-8417-44f8-9761-5e1b6c4f48de` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-aa4705aa-49cd-4233-bbd9-167f2d8d8a94` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-f10eda7b-ed3a-4efa-9691-6dcf1a94d289` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-53bb03fc-ff55-4ce8-bb4e-fbe7aad67e21` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-c0acea93-03cf-4ea4-b38b-f448a951f0d4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7d00f52f-bf28-4c07-8750-bba91561d3a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d00f52f-bf28-4c07-8750-bba91561d3a3
Content-Type: application/json

--- request body ---
{"handle":"qa-970f802dc3f2","displayName":"QA 970f802dc3f2","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d00f52f-bf28-4c07-8750-bba91561d3a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Location: /v1/accounts/qa-970f802dc3f2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ac3c0eef-45de-4949-9239-8b60988aeb98","handle":"qa-970f802dc3f2","displayName":"QA 970f802dc3f2","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.645028577Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0b069bad-f314-4be4-aa25-8863f0d9cf04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b069bad-f314-4be4-aa25-8863f0d9cf04
Content-Type: application/json

--- request body ---
{"handle":"qa-c97f918f5715","displayName":"QA c97f918f5715","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b069bad-f314-4be4-aa25-8863f0d9cf04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Location: /v1/accounts/qa-c97f918f5715
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f6480eb9-278e-400d-b553-1f42247f9ae7","handle":"qa-c97f918f5715","displayName":"QA c97f918f5715","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.669116967Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-af00f14a-aa3b-4fd5-ad1c-a024c544c74b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af00f14a-aa3b-4fd5-ad1c-a024c544c74b
Content-Type: application/json

--- request body ---
{"handle":"qa-970f802dc3f2","password":"****"}

--- response: 200 in 41 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-af00f14a-aa3b-4fd5-ad1c-a024c544c74b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ac3c0eef-45de-4949-9239-8b60988aeb98"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3edce7ec-735f-46fb-81c8-b86ffaaebdeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3edce7ec-735f-46fb-81c8-b86ffaaebdeb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c97f918f5715","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-3edce7ec-735f-46fb-81c8-b86ffaaebdeb
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
Location: /v1/conversations/cnv_0cf65b26-7f07-44fe-a36b-2b9c71114805
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0cf65b26-7f07-44fe-a36b-2b9c71114805","subject":"Error contract","status":"open","region":"eu","participants":["qa-970f802dc3f2","qa-c97f918f5715"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:25.777975130Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-a9f13e80-10be-4909-ac8f-99a8ee32bdf0

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: bd43e99c-d6a1-4487-8747-e8c985dcef7b
X-Correlation-Id: qa-a9f13e80-10be-4909-ac8f-99a8ee32bdf0
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9f13e80-10be-4909-ac8f-99a8ee32bdf0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-a9f13e80-10be-4909-ac8f-99a8ee32bdf0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-398cf05e-8417-44f8-9761-5e1b6c4f48de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-398cf05e-8417-44f8-9761-5e1b6c4f48de
Content-Type: application/json

--- request body ---
{"handle":"qa-c97f918f5715","password":"****"}

--- response: 200 in 41 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-398cf05e-8417-44f8-9761-5e1b6c4f48de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f6480eb9-278e-400d-b553-1f42247f9ae7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa4705aa-49cd-4233-bbd9-167f2d8d8a94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa4705aa-49cd-4233-bbd9-167f2d8d8a94
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa4705aa-49cd-4233-bbd9-167f2d8d8a94
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
correlation: qa-f10eda7b-ed3a-4efa-9691-6dcf1a94d289

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f10eda7b-ed3a-4efa-9691-6dcf1a94d289
Content-Type: application/json

--- request body ---
{"handle":"qa-c97f918f5715","password":"****"}

--- response: 401 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f10eda7b-ed3a-4efa-9691-6dcf1a94d289
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f10eda7b-ed3a-4efa-9691-6dcf1a94d289"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-53bb03fc-ff55-4ce8-bb4e-fbe7aad67e21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53bb03fc-ff55-4ce8-bb4e-fbe7aad67e21
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-53bb03fc-ff55-4ce8-bb4e-fbe7aad67e21
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
correlation: qa-c0acea93-03cf-4ea4-b38b-f448a951f0d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0acea93-03cf-4ea4-b38b-f448a951f0d4
Content-Type: application/json

--- request body ---
{"handle":"qa-970f802dc3f2","password":"****"}

--- response: 401 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0acea93-03cf-4ea4-b38b-f448a951f0d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c0acea93-03cf-4ea4-b38b-f448a951f0d4"}
```
