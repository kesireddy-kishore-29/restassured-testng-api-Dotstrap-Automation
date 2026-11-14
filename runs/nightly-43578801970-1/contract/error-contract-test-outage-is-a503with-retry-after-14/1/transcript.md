# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-57f418f9-0654-42a2-95ca-db752f90c6c8` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-0fb62983-bad2-4c6c-bd9c-5df5de1b848d` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-bf188819-a516-45c8-8343-1f573c0161cb` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-94be3575-0839-42db-a72e-35a6dabb4825` |
| 5 | `GET /v1/credits/ledger` | 503 | 6 | `qa-07800e8b-74f9-4722-857e-93e8c55a8a15` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-c2ee083e-a8fd-41fc-b477-b163565dd3c3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-c661d603-f235-4f17-bd83-1ea5463e85b2` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-5c610a72-ed69-4770-82a9-0a10c5b51444` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-329bd575-d8a0-4a29-a33e-43c6fabea910` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-b509c26a-c9d5-4a6b-aaeb-9238ab3d69c8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-57f418f9-0654-42a2-95ca-db752f90c6c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57f418f9-0654-42a2-95ca-db752f90c6c8
Content-Type: application/json

--- request body ---
{"handle":"qa-a3bce5e76669","displayName":"QA a3bce5e76669","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-57f418f9-0654-42a2-95ca-db752f90c6c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 7
Location: /v1/accounts/qa-a3bce5e76669
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7fce15a-bf67-4b6d-b559-1a7b0a5fd3d2","handle":"qa-a3bce5e76669","displayName":"QA a3bce5e76669","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.382916400Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0fb62983-bad2-4c6c-bd9c-5df5de1b848d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fb62983-bad2-4c6c-bd9c-5df5de1b848d
Content-Type: application/json

--- request body ---
{"handle":"qa-792f88a07a31","displayName":"QA 792f88a07a31","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fb62983-bad2-4c6c-bd9c-5df5de1b848d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Location: /v1/accounts/qa-792f88a07a31
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e18f099b-b961-4758-a8ee-f2069960bb5a","handle":"qa-792f88a07a31","displayName":"QA 792f88a07a31","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.433311261Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bf188819-a516-45c8-8343-1f573c0161cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf188819-a516-45c8-8343-1f573c0161cb
Content-Type: application/json

--- request body ---
{"handle":"qa-a3bce5e76669","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf188819-a516-45c8-8343-1f573c0161cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7fce15a-bf67-4b6d-b559-1a7b0a5fd3d2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-94be3575-0839-42db-a72e-35a6dabb4825

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94be3575-0839-42db-a72e-35a6dabb4825
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-792f88a07a31","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-94be3575-0839-42db-a72e-35a6dabb4825
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
Location: /v1/conversations/cnv_531d2abd-4855-4a3d-ba00-c01928d2f053
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_531d2abd-4855-4a3d-ba00-c01928d2f053","subject":"Error contract","status":"open","region":"eu","participants":["qa-a3bce5e76669","qa-792f88a07a31"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.513709510Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-07800e8b-74f9-4722-857e-93e8c55a8a15

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 346e6923-7700-47fa-9084-177f4cd0b39a
X-Correlation-Id: qa-07800e8b-74f9-4722-857e-93e8c55a8a15
Content-Type: application/json

--- response: 503 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07800e8b-74f9-4722-857e-93e8c55a8a15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-07800e8b-74f9-4722-857e-93e8c55a8a15"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c2ee083e-a8fd-41fc-b477-b163565dd3c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2ee083e-a8fd-41fc-b477-b163565dd3c3
Content-Type: application/json

--- request body ---
{"handle":"qa-792f88a07a31","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2ee083e-a8fd-41fc-b477-b163565dd3c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e18f099b-b961-4758-a8ee-f2069960bb5a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c661d603-f235-4f17-bd83-1ea5463e85b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c661d603-f235-4f17-bd83-1ea5463e85b2
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c661d603-f235-4f17-bd83-1ea5463e85b2
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
correlation: qa-5c610a72-ed69-4770-82a9-0a10c5b51444

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c610a72-ed69-4770-82a9-0a10c5b51444
Content-Type: application/json

--- request body ---
{"handle":"qa-792f88a07a31","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c610a72-ed69-4770-82a9-0a10c5b51444
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5c610a72-ed69-4770-82a9-0a10c5b51444"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-329bd575-d8a0-4a29-a33e-43c6fabea910

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-329bd575-d8a0-4a29-a33e-43c6fabea910
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-329bd575-d8a0-4a29-a33e-43c6fabea910
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
correlation: qa-b509c26a-c9d5-4a6b-aaeb-9238ab3d69c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b509c26a-c9d5-4a6b-aaeb-9238ab3d69c8
Content-Type: application/json

--- request body ---
{"handle":"qa-a3bce5e76669","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b509c26a-c9d5-4a6b-aaeb-9238ab3d69c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b509c26a-c9d5-4a6b-aaeb-9238ab3d69c8"}
```
