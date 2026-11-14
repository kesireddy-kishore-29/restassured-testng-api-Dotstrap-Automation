# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-e77df976-8b80-4731-a8aa-8615a169ae61` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-04c7011a-4682-412b-9a0d-36795a8d2212` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-9f338f0f-fa7b-4fdc-b0f5-fa9443eb53fc` |
| 4 | `POST /v1/conversations` | 201 | 39 | `qa-2cedfb53-f25b-4c58-9024-37fde4d3cd6f` |
| 5 | `POST /v1/accounts` | 415 | 24 | `qa-6c9fd92a-3825-484b-bee6-6fe7e196fe45` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-d7493753-dff8-4208-bec5-399517f30b3c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-dc2f7041-3c52-4d24-9226-d84ee40a84ac` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-0e5434e5-7a68-4893-a676-9d4d84404d48` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-17a4aa3f-78a7-4930-95e6-64f764ea3053` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-fca67237-7e45-463a-b631-b6f441476379` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e77df976-8b80-4731-a8aa-8615a169ae61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e77df976-8b80-4731-a8aa-8615a169ae61
Content-Type: application/json

--- request body ---
{"handle":"qa-8252a67b1068","displayName":"QA 8252a67b1068","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e77df976-8b80-4731-a8aa-8615a169ae61
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
Location: /v1/accounts/qa-8252a67b1068
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f1ba8a3e-be2f-4d70-8d41-00696bcd1ff3","handle":"qa-8252a67b1068","displayName":"QA 8252a67b1068","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.574529911Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-04c7011a-4682-412b-9a0d-36795a8d2212

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04c7011a-4682-412b-9a0d-36795a8d2212
Content-Type: application/json

--- request body ---
{"handle":"qa-36bb374a8c9b","displayName":"QA 36bb374a8c9b","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-04c7011a-4682-412b-9a0d-36795a8d2212
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Location: /v1/accounts/qa-36bb374a8c9b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8aca191-4fe9-447f-a98e-21c4e4a1a824","handle":"qa-36bb374a8c9b","displayName":"QA 36bb374a8c9b","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.670134842Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9f338f0f-fa7b-4fdc-b0f5-fa9443eb53fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f338f0f-fa7b-4fdc-b0f5-fa9443eb53fc
Content-Type: application/json

--- request body ---
{"handle":"qa-8252a67b1068","password":"****"}

--- response: 200 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f338f0f-fa7b-4fdc-b0f5-fa9443eb53fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1ba8a3e-be2f-4d70-8d41-00696bcd1ff3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2cedfb53-f25b-4c58-9024-37fde4d3cd6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cedfb53-f25b-4c58-9024-37fde4d3cd6f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-36bb374a8c9b","subject":"Error contract","message":"Hi"}

--- response: 201 in 39 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cedfb53-f25b-4c58-9024-37fde4d3cd6f
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
Location: /v1/conversations/cnv_8a5ae73e-8351-4ac4-89d6-3e4c02528634
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8a5ae73e-8351-4ac4-89d6-3e4c02528634","subject":"Error contract","status":"open","region":"eu","participants":["qa-8252a67b1068","qa-36bb374a8c9b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:37.815702330Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-6c9fd92a-3825-484b-bee6-6fe7e196fe45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c9fd92a-3825-484b-bee6-6fe7e196fe45
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c9fd92a-3825-484b-bee6-6fe7e196fe45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-6c9fd92a-3825-484b-bee6-6fe7e196fe45"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d7493753-dff8-4208-bec5-399517f30b3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7493753-dff8-4208-bec5-399517f30b3c
Content-Type: application/json

--- request body ---
{"handle":"qa-36bb374a8c9b","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7493753-dff8-4208-bec5-399517f30b3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a8aca191-4fe9-447f-a98e-21c4e4a1a824"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc2f7041-3c52-4d24-9226-d84ee40a84ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc2f7041-3c52-4d24-9226-d84ee40a84ac
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc2f7041-3c52-4d24-9226-d84ee40a84ac
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
correlation: qa-0e5434e5-7a68-4893-a676-9d4d84404d48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e5434e5-7a68-4893-a676-9d4d84404d48
Content-Type: application/json

--- request body ---
{"handle":"qa-36bb374a8c9b","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e5434e5-7a68-4893-a676-9d4d84404d48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e5434e5-7a68-4893-a676-9d4d84404d48"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-17a4aa3f-78a7-4930-95e6-64f764ea3053

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17a4aa3f-78a7-4930-95e6-64f764ea3053
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-17a4aa3f-78a7-4930-95e6-64f764ea3053
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
correlation: qa-fca67237-7e45-463a-b631-b6f441476379

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fca67237-7e45-463a-b631-b6f441476379
Content-Type: application/json

--- request body ---
{"handle":"qa-8252a67b1068","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fca67237-7e45-463a-b631-b6f441476379
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fca67237-7e45-463a-b631-b6f441476379"}
```
