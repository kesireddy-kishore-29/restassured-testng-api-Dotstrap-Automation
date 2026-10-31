# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 59 | `qa-52d574ac-af23-4401-8d1b-b1e921ee8bdb` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-c290ccd2-1d44-495e-b3f6-7855465dfba5` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-7ec3c5ee-e1d8-4539-ada2-ffd3c6d09df9` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-f8b5168e-e4fc-4249-875a-f88a529c0c81` |
| 5 | `PATCH /v1/accounts/me` | 400 | 16 | `qa-f20b095f-6266-4702-aeb7-da66be4460f9` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-d8475358-96d6-433f-be94-d0611a31411a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-1a39422a-04db-4055-ba27-3a77ac1955f4` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-35a167af-ff5f-4279-8741-24516a64d2a0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-7ea8d379-1f3f-422d-9375-5a031b97279c` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-bf9c0c3e-6a99-48d2-af54-24dd55b76f2f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-52d574ac-af23-4401-8d1b-b1e921ee8bdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52d574ac-af23-4401-8d1b-b1e921ee8bdb
Content-Type: application/json

--- request body ---
{"handle":"qa-91670cd69f19","displayName":"QA 91670cd69f19","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-52d574ac-af23-4401-8d1b-b1e921ee8bdb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 7
Location: /v1/accounts/qa-91670cd69f19
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f5a900dd-ecfb-4e0b-ae81-2c5f75073eaf","handle":"qa-91670cd69f19","displayName":"QA 91670cd69f19","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.523258140Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c290ccd2-1d44-495e-b3f6-7855465dfba5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c290ccd2-1d44-495e-b3f6-7855465dfba5
Content-Type: application/json

--- request body ---
{"handle":"qa-8690d6f77edb","displayName":"QA 8690d6f77edb","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-c290ccd2-1d44-495e-b3f6-7855465dfba5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 7
Location: /v1/accounts/qa-8690d6f77edb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_80adbd4b-5e7a-4d21-9e92-adefb08e012d","handle":"qa-8690d6f77edb","displayName":"QA 8690d6f77edb","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.577959944Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7ec3c5ee-e1d8-4539-ada2-ffd3c6d09df9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ec3c5ee-e1d8-4539-ada2-ffd3c6d09df9
Content-Type: application/json

--- request body ---
{"handle":"qa-91670cd69f19","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ec3c5ee-e1d8-4539-ada2-ffd3c6d09df9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f5a900dd-ecfb-4e0b-ae81-2c5f75073eaf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f8b5168e-e4fc-4249-875a-f88a529c0c81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8b5168e-e4fc-4249-875a-f88a529c0c81
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8690d6f77edb","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8b5168e-e4fc-4249-875a-f88a529c0c81
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
Location: /v1/conversations/cnv_511e0c85-1ad5-43bf-8afb-deb376b69431
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_511e0c85-1ad5-43bf-8afb-deb376b69431","subject":"Error contract","status":"open","region":"eu","participants":["qa-91670cd69f19","qa-8690d6f77edb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:45.667597349Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-f20b095f-6266-4702-aeb7-da66be4460f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f20b095f-6266-4702-aeb7-da66be4460f9
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f20b095f-6266-4702-aeb7-da66be4460f9
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-f20b095f-6266-4702-aeb7-da66be4460f9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d8475358-96d6-433f-be94-d0611a31411a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8475358-96d6-433f-be94-d0611a31411a
Content-Type: application/json

--- request body ---
{"handle":"qa-8690d6f77edb","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8475358-96d6-433f-be94-d0611a31411a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_80adbd4b-5e7a-4d21-9e92-adefb08e012d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1a39422a-04db-4055-ba27-3a77ac1955f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a39422a-04db-4055-ba27-3a77ac1955f4
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1a39422a-04db-4055-ba27-3a77ac1955f4
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
correlation: qa-35a167af-ff5f-4279-8741-24516a64d2a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35a167af-ff5f-4279-8741-24516a64d2a0
Content-Type: application/json

--- request body ---
{"handle":"qa-8690d6f77edb","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35a167af-ff5f-4279-8741-24516a64d2a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35a167af-ff5f-4279-8741-24516a64d2a0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7ea8d379-1f3f-422d-9375-5a031b97279c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ea8d379-1f3f-422d-9375-5a031b97279c
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7ea8d379-1f3f-422d-9375-5a031b97279c
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
correlation: qa-bf9c0c3e-6a99-48d2-af54-24dd55b76f2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf9c0c3e-6a99-48d2-af54-24dd55b76f2f
Content-Type: application/json

--- request body ---
{"handle":"qa-91670cd69f19","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf9c0c3e-6a99-48d2-af54-24dd55b76f2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf9c0c3e-6a99-48d2-af54-24dd55b76f2f"}
```
