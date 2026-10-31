# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-d2160247-dc06-4dd4-a1f1-1acb84d58c79` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-92910950-e3e8-4bd3-af1c-57316d1da2f7` |
| 3 | `POST /v1/auth/token` | 200 | 67 | `qa-674d6ccd-1ffe-44b8-9635-16f5fd9bd432` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-750783ed-55c3-469f-b7f9-e59d3fe27c33` |
| 5 | `POST /v1/conversations` | 400 | 15 | `qa-55befab3-9290-4e37-8db6-382515009f9a` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-3682e930-6bf4-4600-9622-a0c9298f1eda` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-4735ae12-3786-4769-a8b8-be22f17490c3` |
| 8 | `POST /v1/auth/token` | 401 | 29 | `qa-de3a0a88-b1db-495a-a1a8-c3512be90483` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-36e23db4-cd32-4974-95fe-1824de089592` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-2a129274-ef53-4610-9d01-40aafd833434` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d2160247-dc06-4dd4-a1f1-1acb84d58c79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2160247-dc06-4dd4-a1f1-1acb84d58c79
Content-Type: application/json

--- request body ---
{"handle":"qa-7f021387106c","displayName":"QA 7f021387106c","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2160247-dc06-4dd4-a1f1-1acb84d58c79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 7
Location: /v1/accounts/qa-7f021387106c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c53092f8-b46d-44b4-bc32-09d9e0089b1e","handle":"qa-7f021387106c","displayName":"QA 7f021387106c","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.128489731Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-92910950-e3e8-4bd3-af1c-57316d1da2f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92910950-e3e8-4bd3-af1c-57316d1da2f7
Content-Type: application/json

--- request body ---
{"handle":"qa-13b2fb90de6c","displayName":"QA 13b2fb90de6c","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-92910950-e3e8-4bd3-af1c-57316d1da2f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 7
Location: /v1/accounts/qa-13b2fb90de6c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb935cd6-22b0-401a-a327-bd1c5537e4df","handle":"qa-13b2fb90de6c","displayName":"QA 13b2fb90de6c","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.188022577Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-674d6ccd-1ffe-44b8-9635-16f5fd9bd432

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-674d6ccd-1ffe-44b8-9635-16f5fd9bd432
Content-Type: application/json

--- request body ---
{"handle":"qa-7f021387106c","password":"****"}

--- response: 200 in 67 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-674d6ccd-1ffe-44b8-9635-16f5fd9bd432
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c53092f8-b46d-44b4-bc32-09d9e0089b1e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-750783ed-55c3-469f-b7f9-e59d3fe27c33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-750783ed-55c3-469f-b7f9-e59d3fe27c33
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-13b2fb90de6c","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-750783ed-55c3-469f-b7f9-e59d3fe27c33
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
Location: /v1/conversations/cnv_ba73ed7d-f109-4d92-affe-8fed292777b0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ba73ed7d-f109-4d92-affe-8fed292777b0","subject":"Error contract","status":"open","region":"eu","participants":["qa-7f021387106c","qa-13b2fb90de6c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.315998500Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-55befab3-9290-4e37-8db6-382515009f9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55befab3-9290-4e37-8db6-382515009f9a
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55befab3-9290-4e37-8db6-382515009f9a
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-55befab3-9290-4e37-8db6-382515009f9a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3682e930-6bf4-4600-9622-a0c9298f1eda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3682e930-6bf4-4600-9622-a0c9298f1eda
Content-Type: application/json

--- request body ---
{"handle":"qa-13b2fb90de6c","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-3682e930-6bf4-4600-9622-a0c9298f1eda
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb935cd6-22b0-401a-a327-bd1c5537e4df"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4735ae12-3786-4769-a8b8-be22f17490c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4735ae12-3786-4769-a8b8-be22f17490c3
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4735ae12-3786-4769-a8b8-be22f17490c3
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
correlation: qa-de3a0a88-b1db-495a-a1a8-c3512be90483

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de3a0a88-b1db-495a-a1a8-c3512be90483
Content-Type: application/json

--- request body ---
{"handle":"qa-13b2fb90de6c","password":"****"}

--- response: 401 in 29 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de3a0a88-b1db-495a-a1a8-c3512be90483
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-de3a0a88-b1db-495a-a1a8-c3512be90483"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-36e23db4-cd32-4974-95fe-1824de089592

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36e23db4-cd32-4974-95fe-1824de089592
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-36e23db4-cd32-4974-95fe-1824de089592
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2a129274-ef53-4610-9d01-40aafd833434

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a129274-ef53-4610-9d01-40aafd833434
Content-Type: application/json

--- request body ---
{"handle":"qa-7f021387106c","password":"****"}

--- response: 401 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a129274-ef53-4610-9d01-40aafd833434
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2a129274-ef53-4610-9d01-40aafd833434"}
```
