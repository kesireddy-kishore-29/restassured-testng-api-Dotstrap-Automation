# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-9b37a87c-a620-4dd9-9f8c-36f5257ba07f` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-cf67b493-b59a-4df3-8970-a767977024d1` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-1c6cb3a1-8fad-4f8e-a642-9d9e1a718631` |
| 4 | `POST /v1/conversations` | 201 | 5 | `qa-e64f99cd-709d-4ff7-a9f6-eb7ab4530dbc` |
| 5 | `POST /v1/credits/purchases` | 422 | 5 | `qa-4981c3c5-1162-4eb2-828d-ae5b9c18b95d` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-d8a1690f-3612-4837-a4fa-d2adb4c5b97c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-e537358f-cd48-43d2-9653-942946d6ee98` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-4d58469e-030d-41c9-b565-16de8e85fdec` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-41cf65cb-9ccc-4bf9-b385-571ea99dc2d5` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-07d0cf6a-a22b-48a9-a9b1-bae3584eb1cb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9b37a87c-a620-4dd9-9f8c-36f5257ba07f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b37a87c-a620-4dd9-9f8c-36f5257ba07f
Content-Type: application/json

--- request body ---
{"handle":"qa-34b016383fd2","displayName":"QA 34b016383fd2","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b37a87c-a620-4dd9-9f8c-36f5257ba07f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 6
Location: /v1/accounts/qa-34b016383fd2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2bf498-e282-4194-922b-2253f8492f27","handle":"qa-34b016383fd2","displayName":"QA 34b016383fd2","region":"eu","role":"user","createdAt":"2026-10-23T07:41:47.357079119Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cf67b493-b59a-4df3-8970-a767977024d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf67b493-b59a-4df3-8970-a767977024d1
Content-Type: application/json

--- request body ---
{"handle":"qa-ed4c64d234e4","displayName":"QA ed4c64d234e4","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf67b493-b59a-4df3-8970-a767977024d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 6
Location: /v1/accounts/qa-ed4c64d234e4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dfdc1877-9e28-48ef-8485-4d492776c870","handle":"qa-ed4c64d234e4","displayName":"QA ed4c64d234e4","region":"eu","role":"user","createdAt":"2026-10-23T07:41:47.403845813Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1c6cb3a1-8fad-4f8e-a642-9d9e1a718631

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c6cb3a1-8fad-4f8e-a642-9d9e1a718631
Content-Type: application/json

--- request body ---
{"handle":"qa-34b016383fd2","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c6cb3a1-8fad-4f8e-a642-9d9e1a718631
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7f2bf498-e282-4194-922b-2253f8492f27"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e64f99cd-709d-4ff7-a9f6-eb7ab4530dbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e64f99cd-709d-4ff7-a9f6-eb7ab4530dbc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ed4c64d234e4","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-e64f99cd-709d-4ff7-a9f6-eb7ab4530dbc
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
Location: /v1/conversations/cnv_3c6f3657-3441-4129-8049-0f28f0ba728a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3c6f3657-3441-4129-8049-0f28f0ba728a","subject":"Error contract","status":"open","region":"eu","participants":["qa-34b016383fd2","qa-ed4c64d234e4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:47.444517683Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4981c3c5-1162-4eb2-828d-ae5b9c18b95d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8793187a60964841a02bbed65a6deb05
X-Correlation-Id: qa-4981c3c5-1162-4eb2-828d-ae5b9c18b95d
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4981c3c5-1162-4eb2-828d-ae5b9c18b95d
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-4981c3c5-1162-4eb2-828d-ae5b9c18b95d","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d8a1690f-3612-4837-a4fa-d2adb4c5b97c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8a1690f-3612-4837-a4fa-d2adb4c5b97c
Content-Type: application/json

--- request body ---
{"handle":"qa-ed4c64d234e4","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8a1690f-3612-4837-a4fa-d2adb4c5b97c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dfdc1877-9e28-48ef-8485-4d492776c870"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e537358f-cd48-43d2-9653-942946d6ee98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e537358f-cd48-43d2-9653-942946d6ee98
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e537358f-cd48-43d2-9653-942946d6ee98
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
correlation: qa-4d58469e-030d-41c9-b565-16de8e85fdec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d58469e-030d-41c9-b565-16de8e85fdec
Content-Type: application/json

--- request body ---
{"handle":"qa-ed4c64d234e4","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d58469e-030d-41c9-b565-16de8e85fdec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4d58469e-030d-41c9-b565-16de8e85fdec"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-41cf65cb-9ccc-4bf9-b385-571ea99dc2d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41cf65cb-9ccc-4bf9-b385-571ea99dc2d5
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-41cf65cb-9ccc-4bf9-b385-571ea99dc2d5
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
correlation: qa-07d0cf6a-a22b-48a9-a9b1-bae3584eb1cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07d0cf6a-a22b-48a9-a9b1-bae3584eb1cb
Content-Type: application/json

--- request body ---
{"handle":"qa-34b016383fd2","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07d0cf6a-a22b-48a9-a9b1-bae3584eb1cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-07d0cf6a-a22b-48a9-a9b1-bae3584eb1cb"}
```
