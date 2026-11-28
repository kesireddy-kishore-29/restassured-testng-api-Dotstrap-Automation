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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-2d73b42e-07a5-490a-9e56-619873168c5b` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-020abebe-0894-448a-914b-46f24fe466ee` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-44103ec1-8881-4010-8957-2a0dc410f5ed` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-44e637b8-34e5-4f80-8914-7e660af9f482` |
| 5 | `POST /v1/credits/purchases` | 422 | 6 | `qa-e28f325a-46f8-43d9-85d9-f47f60cbc33c` |
| 6 | `POST /v1/auth/token` | 200 | 7 | `qa-06c70c0b-c62c-416d-aa78-402f4be789c7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-e7602489-898e-4828-b033-93b52e6b5b68` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-439733bd-42fc-4ca0-b4e4-254c9c42e1fa` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-4478a945-3d74-4b02-b62b-890af43f453c` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-316de21e-4a88-44ea-9557-959d8d62b5cc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2d73b42e-07a5-490a-9e56-619873168c5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d73b42e-07a5-490a-9e56-619873168c5b
Content-Type: application/json

--- request body ---
{"handle":"qa-8bfb180c68eb","displayName":"QA 8bfb180c68eb","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d73b42e-07a5-490a-9e56-619873168c5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 8
Location: /v1/accounts/qa-8bfb180c68eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_540aae32-4bfc-476a-b61a-c30b67336704","handle":"qa-8bfb180c68eb","displayName":"QA 8bfb180c68eb","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.360783081Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-020abebe-0894-448a-914b-46f24fe466ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-020abebe-0894-448a-914b-46f24fe466ee
Content-Type: application/json

--- request body ---
{"handle":"qa-72e8a4daf1d2","displayName":"QA 72e8a4daf1d2","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-020abebe-0894-448a-914b-46f24fe466ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 8
Location: /v1/accounts/qa-72e8a4daf1d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_96552bc7-f495-417e-9f84-611fec6be0a9","handle":"qa-72e8a4daf1d2","displayName":"QA 72e8a4daf1d2","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.377030664Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-44103ec1-8881-4010-8957-2a0dc410f5ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44103ec1-8881-4010-8957-2a0dc410f5ed
Content-Type: application/json

--- request body ---
{"handle":"qa-8bfb180c68eb","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-44103ec1-8881-4010-8957-2a0dc410f5ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_540aae32-4bfc-476a-b61a-c30b67336704"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-44e637b8-34e5-4f80-8914-7e660af9f482

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44e637b8-34e5-4f80-8914-7e660af9f482
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-72e8a4daf1d2","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-44e637b8-34e5-4f80-8914-7e660af9f482
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
Location: /v1/conversations/cnv_e0371786-e4e5-49fc-95a6-481c2cd68fb9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e0371786-e4e5-49fc-95a6-481c2cd68fb9","subject":"Error contract","status":"open","region":"eu","participants":["qa-8bfb180c68eb","qa-72e8a4daf1d2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:42.421214346Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e28f325a-46f8-43d9-85d9-f47f60cbc33c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-70e6fe75097e485ebada557f84594c32
X-Correlation-Id: qa-e28f325a-46f8-43d9-85d9-f47f60cbc33c
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e28f325a-46f8-43d9-85d9-f47f60cbc33c
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-e28f325a-46f8-43d9-85d9-f47f60cbc33c","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-06c70c0b-c62c-416d-aa78-402f4be789c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06c70c0b-c62c-416d-aa78-402f4be789c7
Content-Type: application/json

--- request body ---
{"handle":"qa-72e8a4daf1d2","password":"****"}

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-06c70c0b-c62c-416d-aa78-402f4be789c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96552bc7-f495-417e-9f84-611fec6be0a9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e7602489-898e-4828-b033-93b52e6b5b68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7602489-898e-4828-b033-93b52e6b5b68
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e7602489-898e-4828-b033-93b52e6b5b68
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
correlation: qa-439733bd-42fc-4ca0-b4e4-254c9c42e1fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-439733bd-42fc-4ca0-b4e4-254c9c42e1fa
Content-Type: application/json

--- request body ---
{"handle":"qa-72e8a4daf1d2","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-439733bd-42fc-4ca0-b4e4-254c9c42e1fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-439733bd-42fc-4ca0-b4e4-254c9c42e1fa"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4478a945-3d74-4b02-b62b-890af43f453c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4478a945-3d74-4b02-b62b-890af43f453c
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4478a945-3d74-4b02-b62b-890af43f453c
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
correlation: qa-316de21e-4a88-44ea-9557-959d8d62b5cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-316de21e-4a88-44ea-9557-959d8d62b5cc
Content-Type: application/json

--- request body ---
{"handle":"qa-8bfb180c68eb","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-316de21e-4a88-44ea-9557-959d8d62b5cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-316de21e-4a88-44ea-9557-959d8d62b5cc"}
```
