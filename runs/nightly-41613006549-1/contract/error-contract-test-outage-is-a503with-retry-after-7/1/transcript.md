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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-0698d60b-c440-447b-8543-79ad674e5f3f` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-dd2ef4e3-e6b2-4e12-b7d1-edab72fded15` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-b1c01b12-c3b2-4afa-9e84-9b0bf3b2cf71` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-506d6ba1-5e0d-40e6-9f48-1e737dc05c61` |
| 5 | `GET /v1/conversations` | 503 | 16 | `qa-3f706185-c0d0-424f-b522-f8304afb7c68` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-7fc7a5d9-5afd-404e-a25a-9a4e19715715` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-e419538c-f9f7-4989-a2b1-0fe54b88d168` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-a958153f-277b-42b4-b18b-064deb67d434` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-8748805b-f04d-4ec6-bd85-42a59afde530` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-0a23099a-7245-4f23-8375-17b5f60f8e17` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0698d60b-c440-447b-8543-79ad674e5f3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0698d60b-c440-447b-8543-79ad674e5f3f
Content-Type: application/json

--- request body ---
{"handle":"qa-1601a657ba1f","displayName":"QA 1601a657ba1f","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-0698d60b-c440-447b-8543-79ad674e5f3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 9
Location: /v1/accounts/qa-1601a657ba1f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_653c22ef-0e5a-475e-8920-ff1a934713a7","handle":"qa-1601a657ba1f","displayName":"QA 1601a657ba1f","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.344122682Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dd2ef4e3-e6b2-4e12-b7d1-edab72fded15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd2ef4e3-e6b2-4e12-b7d1-edab72fded15
Content-Type: application/json

--- request body ---
{"handle":"qa-efa835af1023","displayName":"QA efa835af1023","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd2ef4e3-e6b2-4e12-b7d1-edab72fded15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 9
Location: /v1/accounts/qa-efa835af1023
X-Served-Region: eu
Content-Length: 181

{"id":"acc_56772827-2781-458e-a74b-40ad6bd9481c","handle":"qa-efa835af1023","displayName":"QA efa835af1023","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.409496256Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b1c01b12-c3b2-4afa-9e84-9b0bf3b2cf71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1c01b12-c3b2-4afa-9e84-9b0bf3b2cf71
Content-Type: application/json

--- request body ---
{"handle":"qa-1601a657ba1f","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1c01b12-c3b2-4afa-9e84-9b0bf3b2cf71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_653c22ef-0e5a-475e-8920-ff1a934713a7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-506d6ba1-5e0d-40e6-9f48-1e737dc05c61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-506d6ba1-5e0d-40e6-9f48-1e737dc05c61
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-efa835af1023","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-506d6ba1-5e0d-40e6-9f48-1e737dc05c61
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
Location: /v1/conversations/cnv_a349f08a-a6f5-48e4-8c6c-02165b250185
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a349f08a-a6f5-48e4-8c6c-02165b250185","subject":"Error contract","status":"open","region":"eu","participants":["qa-1601a657ba1f","qa-efa835af1023"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.467894682Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-3f706185-c0d0-424f-b522-f8304afb7c68

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d9ce7dba-6dc8-44d8-b3f8-274abb6ff084
X-Correlation-Id: qa-3f706185-c0d0-424f-b522-f8304afb7c68
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f706185-c0d0-424f-b522-f8304afb7c68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-3f706185-c0d0-424f-b522-f8304afb7c68"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7fc7a5d9-5afd-404e-a25a-9a4e19715715

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fc7a5d9-5afd-404e-a25a-9a4e19715715
Content-Type: application/json

--- request body ---
{"handle":"qa-efa835af1023","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fc7a5d9-5afd-404e-a25a-9a4e19715715
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_56772827-2781-458e-a74b-40ad6bd9481c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e419538c-f9f7-4989-a2b1-0fe54b88d168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e419538c-f9f7-4989-a2b1-0fe54b88d168
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e419538c-f9f7-4989-a2b1-0fe54b88d168
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
correlation: qa-a958153f-277b-42b4-b18b-064deb67d434

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a958153f-277b-42b4-b18b-064deb67d434
Content-Type: application/json

--- request body ---
{"handle":"qa-efa835af1023","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a958153f-277b-42b4-b18b-064deb67d434
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a958153f-277b-42b4-b18b-064deb67d434"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8748805b-f04d-4ec6-bd85-42a59afde530

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8748805b-f04d-4ec6-bd85-42a59afde530
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8748805b-f04d-4ec6-bd85-42a59afde530
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
correlation: qa-0a23099a-7245-4f23-8375-17b5f60f8e17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a23099a-7245-4f23-8375-17b5f60f8e17
Content-Type: application/json

--- request body ---
{"handle":"qa-1601a657ba1f","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a23099a-7245-4f23-8375-17b5f60f8e17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0a23099a-7245-4f23-8375-17b5f60f8e17"}
```
