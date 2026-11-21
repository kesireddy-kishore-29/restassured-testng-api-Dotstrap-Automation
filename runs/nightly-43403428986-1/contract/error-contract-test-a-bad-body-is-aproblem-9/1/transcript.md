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
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-44ba6146-a0fc-4bc0-8ed4-909aaf7dd57b` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-b56c16af-6e47-4756-b091-cdef0973e4f4` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-b5b5721b-54e0-460f-8e6c-d9ca3be94e92` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-db909992-ec5b-4fbd-a300-22f89615471f` |
| 5 | `POST /v1/conversations` | 400 | 18 | `qa-545778b0-6a10-4088-9235-5d3111f68ab8` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-79b4ed3f-9d5f-4e9c-b814-ea6655901d6a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-604a0f62-6b2c-4b3c-9d58-902c9a98c556` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-aa0a7a15-d034-4e7f-8555-d9aeb9817cc2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-d7957e5a-e340-4962-8cac-b206e591e7f1` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-58ade5a2-ecc1-461f-a369-d965f94d8988` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-44ba6146-a0fc-4bc0-8ed4-909aaf7dd57b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44ba6146-a0fc-4bc0-8ed4-909aaf7dd57b
Content-Type: application/json

--- request body ---
{"handle":"qa-05fc7198fd2c","displayName":"QA 05fc7198fd2c","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-44ba6146-a0fc-4bc0-8ed4-909aaf7dd57b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Location: /v1/accounts/qa-05fc7198fd2c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20d91e3d-d92e-496b-b22c-121a13a3ca7b","handle":"qa-05fc7198fd2c","displayName":"QA 05fc7198fd2c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.614713399Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b56c16af-6e47-4756-b091-cdef0973e4f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b56c16af-6e47-4756-b091-cdef0973e4f4
Content-Type: application/json

--- request body ---
{"handle":"qa-bc46f5c97da7","displayName":"QA bc46f5c97da7","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b56c16af-6e47-4756-b091-cdef0973e4f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 8
Location: /v1/accounts/qa-bc46f5c97da7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ac5a0b3f-1412-4cea-b904-740c91175b0a","handle":"qa-bc46f5c97da7","displayName":"QA bc46f5c97da7","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.669119526Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b5b5721b-54e0-460f-8e6c-d9ca3be94e92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5b5721b-54e0-460f-8e6c-d9ca3be94e92
Content-Type: application/json

--- request body ---
{"handle":"qa-05fc7198fd2c","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5b5721b-54e0-460f-8e6c-d9ca3be94e92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20d91e3d-d92e-496b-b22c-121a13a3ca7b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-db909992-ec5b-4fbd-a300-22f89615471f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db909992-ec5b-4fbd-a300-22f89615471f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bc46f5c97da7","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-db909992-ec5b-4fbd-a300-22f89615471f
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
Location: /v1/conversations/cnv_d5503575-92ff-4eec-bc2e-3f72d235167b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d5503575-92ff-4eec-bc2e-3f72d235167b","subject":"Error contract","status":"open","region":"eu","participants":["qa-05fc7198fd2c","qa-bc46f5c97da7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.726902179Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-545778b0-6a10-4088-9235-5d3111f68ab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-545778b0-6a10-4088-9235-5d3111f68ab8
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-545778b0-6a10-4088-9235-5d3111f68ab8
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-545778b0-6a10-4088-9235-5d3111f68ab8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-79b4ed3f-9d5f-4e9c-b814-ea6655901d6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79b4ed3f-9d5f-4e9c-b814-ea6655901d6a
Content-Type: application/json

--- request body ---
{"handle":"qa-bc46f5c97da7","password":"****"}

--- response: 200 in 46 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-79b4ed3f-9d5f-4e9c-b814-ea6655901d6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ac5a0b3f-1412-4cea-b904-740c91175b0a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-604a0f62-6b2c-4b3c-9d58-902c9a98c556

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-604a0f62-6b2c-4b3c-9d58-902c9a98c556
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-604a0f62-6b2c-4b3c-9d58-902c9a98c556
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
correlation: qa-aa0a7a15-d034-4e7f-8555-d9aeb9817cc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa0a7a15-d034-4e7f-8555-d9aeb9817cc2
Content-Type: application/json

--- request body ---
{"handle":"qa-bc46f5c97da7","password":"****"}

--- response: 401 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa0a7a15-d034-4e7f-8555-d9aeb9817cc2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa0a7a15-d034-4e7f-8555-d9aeb9817cc2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d7957e5a-e340-4962-8cac-b206e591e7f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7957e5a-e340-4962-8cac-b206e591e7f1
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d7957e5a-e340-4962-8cac-b206e591e7f1
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
correlation: qa-58ade5a2-ecc1-461f-a369-d965f94d8988

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58ade5a2-ecc1-461f-a369-d965f94d8988
Content-Type: application/json

--- request body ---
{"handle":"qa-05fc7198fd2c","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58ade5a2-ecc1-461f-a369-d965f94d8988
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-58ade5a2-ecc1-461f-a369-d965f94d8988"}
```
