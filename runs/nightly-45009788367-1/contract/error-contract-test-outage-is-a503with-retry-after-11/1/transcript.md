# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-391b7a58-7db2-44c2-9abb-9d75cd2ca263` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-a4f3467f-45ee-46b7-b3e5-f580719d29e3` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-275435bc-07ef-4f57-b6c1-8c8d61ee3ab2` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-a52ff3d2-247d-4fb9-9ece-a93567b6b32c` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 12 | `qa-64cfea5a-baf5-48e9-b63e-e940674cd1f9` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-d43732aa-18fc-4de4-892e-497b0e9fd90a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-6157e4f3-112b-4358-b39b-54fd9f638f2b` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-fa1de18c-a45f-4102-8033-3e85f117f9a2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-d8dcf3ad-fe39-4c34-87dd-64536e043022` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-12948787-6fa9-4b38-83a0-8fed324d95cd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-391b7a58-7db2-44c2-9abb-9d75cd2ca263

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-391b7a58-7db2-44c2-9abb-9d75cd2ca263
Content-Type: application/json

--- request body ---
{"handle":"qa-6f362c79b9e9","displayName":"QA 6f362c79b9e9","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-391b7a58-7db2-44c2-9abb-9d75cd2ca263
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Location: /v1/accounts/qa-6f362c79b9e9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d4df2406-13e6-47d9-9367-d7bcefa4d1fb","handle":"qa-6f362c79b9e9","displayName":"QA 6f362c79b9e9","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.759156938Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a4f3467f-45ee-46b7-b3e5-f580719d29e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4f3467f-45ee-46b7-b3e5-f580719d29e3
Content-Type: application/json

--- request body ---
{"handle":"qa-c072ca815a29","displayName":"QA c072ca815a29","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4f3467f-45ee-46b7-b3e5-f580719d29e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Location: /v1/accounts/qa-c072ca815a29
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8230fa9b-7171-4ff5-9efc-65a59b5aeef2","handle":"qa-c072ca815a29","displayName":"QA c072ca815a29","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.800261780Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-275435bc-07ef-4f57-b6c1-8c8d61ee3ab2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-275435bc-07ef-4f57-b6c1-8c8d61ee3ab2
Content-Type: application/json

--- request body ---
{"handle":"qa-6f362c79b9e9","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-275435bc-07ef-4f57-b6c1-8c8d61ee3ab2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d4df2406-13e6-47d9-9367-d7bcefa4d1fb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a52ff3d2-247d-4fb9-9ece-a93567b6b32c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a52ff3d2-247d-4fb9-9ece-a93567b6b32c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c072ca815a29","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-a52ff3d2-247d-4fb9-9ece-a93567b6b32c
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
Location: /v1/conversations/cnv_63f230d3-a2de-45b9-bc6f-826fd246a262
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_63f230d3-a2de-45b9-bc6f-826fd246a262","subject":"Error contract","status":"open","region":"eu","participants":["qa-6f362c79b9e9","qa-c072ca815a29"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.843701669Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_63f230d3-a2de-45b9-bc6f-826fd246a262/read
correlation: qa-64cfea5a-baf5-48e9-b63e-e940674cd1f9

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 3e6e0574-2422-4239-932d-b56b47d67eba
X-Correlation-Id: qa-64cfea5a-baf5-48e9-b63e-e940674cd1f9
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64cfea5a-baf5-48e9-b63e-e940674cd1f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_63f230d3-a2de-45b9-bc6f-826fd246a262/read","correlationId":"qa-64cfea5a-baf5-48e9-b63e-e940674cd1f9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d43732aa-18fc-4de4-892e-497b0e9fd90a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d43732aa-18fc-4de4-892e-497b0e9fd90a
Content-Type: application/json

--- request body ---
{"handle":"qa-c072ca815a29","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-d43732aa-18fc-4de4-892e-497b0e9fd90a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8230fa9b-7171-4ff5-9efc-65a59b5aeef2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6157e4f3-112b-4358-b39b-54fd9f638f2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6157e4f3-112b-4358-b39b-54fd9f638f2b
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6157e4f3-112b-4358-b39b-54fd9f638f2b
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
correlation: qa-fa1de18c-a45f-4102-8033-3e85f117f9a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa1de18c-a45f-4102-8033-3e85f117f9a2
Content-Type: application/json

--- request body ---
{"handle":"qa-c072ca815a29","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa1de18c-a45f-4102-8033-3e85f117f9a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fa1de18c-a45f-4102-8033-3e85f117f9a2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d8dcf3ad-fe39-4c34-87dd-64536e043022

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8dcf3ad-fe39-4c34-87dd-64536e043022
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d8dcf3ad-fe39-4c34-87dd-64536e043022
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
correlation: qa-12948787-6fa9-4b38-83a0-8fed324d95cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12948787-6fa9-4b38-83a0-8fed324d95cd
Content-Type: application/json

--- request body ---
{"handle":"qa-6f362c79b9e9","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12948787-6fa9-4b38-83a0-8fed324d95cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12948787-6fa9-4b38-83a0-8fed324d95cd"}
```
