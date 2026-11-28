# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-166986cf-3e4f-48b8-b0ff-18d543030bb7` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-511753fc-4b4b-4a9d-8833-42bd969f4e9b` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-3563e199-0ef8-4761-8bc1-60a85c486aa6` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-c8da53fc-042e-4816-97b9-bfd49d94cc49` |
| 5 | `POST /v1/conversations` | 422 | 21 | `qa-cbe866af-ffa4-4014-9419-ba506b3aa773` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-f9c38974-3725-4f4c-aa31-dda3217c8ff3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-32195aa2-11d6-4405-8055-bc10f6718d33` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-87475f81-bd91-4a9b-9783-7a47ba42ac73` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-f7ba2fcd-605d-4135-9560-34f8dd9a3d54` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-857ed77d-31b2-4fa0-9f70-3b3cd623b5da` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-166986cf-3e4f-48b8-b0ff-18d543030bb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-166986cf-3e4f-48b8-b0ff-18d543030bb7
Content-Type: application/json

--- request body ---
{"handle":"qa-926a4f4e5395","displayName":"QA 926a4f4e5395","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-166986cf-3e4f-48b8-b0ff-18d543030bb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Location: /v1/accounts/qa-926a4f4e5395
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fd256dd-01ce-4caf-b492-08d9a7ddec4b","handle":"qa-926a4f4e5395","displayName":"QA 926a4f4e5395","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.959177811Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-511753fc-4b4b-4a9d-8833-42bd969f4e9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-511753fc-4b4b-4a9d-8833-42bd969f4e9b
Content-Type: application/json

--- request body ---
{"handle":"qa-c5a8c78487bb","displayName":"QA c5a8c78487bb","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-511753fc-4b4b-4a9d-8833-42bd969f4e9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 7
Location: /v1/accounts/qa-c5a8c78487bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_724e2929-27b6-4ce5-a02a-fa5d2233721c","handle":"qa-c5a8c78487bb","displayName":"QA c5a8c78487bb","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.008244301Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3563e199-0ef8-4761-8bc1-60a85c486aa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3563e199-0ef8-4761-8bc1-60a85c486aa6
Content-Type: application/json

--- request body ---
{"handle":"qa-926a4f4e5395","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3563e199-0ef8-4761-8bc1-60a85c486aa6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5fd256dd-01ce-4caf-b492-08d9a7ddec4b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c8da53fc-042e-4816-97b9-bfd49d94cc49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8da53fc-042e-4816-97b9-bfd49d94cc49
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c5a8c78487bb","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8da53fc-042e-4816-97b9-bfd49d94cc49
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
Location: /v1/conversations/cnv_5122b4c5-b87a-4be7-9bd6-10e7bc57c40e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5122b4c5-b87a-4be7-9bd6-10e7bc57c40e","subject":"Error contract","status":"open","region":"eu","participants":["qa-926a4f4e5395","qa-c5a8c78487bb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:03.108866548Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-cbe866af-ffa4-4014-9419-ba506b3aa773

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbe866af-ffa4-4014-9419-ba506b3aa773
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c5a8c78487bb","subject":" ","message":"Hi"}

--- response: 422 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cbe866af-ffa4-4014-9419-ba506b3aa773
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-cbe866af-ffa4-4014-9419-ba506b3aa773","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f9c38974-3725-4f4c-aa31-dda3217c8ff3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9c38974-3725-4f4c-aa31-dda3217c8ff3
Content-Type: application/json

--- request body ---
{"handle":"qa-c5a8c78487bb","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9c38974-3725-4f4c-aa31-dda3217c8ff3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_724e2929-27b6-4ce5-a02a-fa5d2233721c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-32195aa2-11d6-4405-8055-bc10f6718d33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32195aa2-11d6-4405-8055-bc10f6718d33
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-32195aa2-11d6-4405-8055-bc10f6718d33
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
correlation: qa-87475f81-bd91-4a9b-9783-7a47ba42ac73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87475f81-bd91-4a9b-9783-7a47ba42ac73
Content-Type: application/json

--- request body ---
{"handle":"qa-c5a8c78487bb","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-87475f81-bd91-4a9b-9783-7a47ba42ac73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-87475f81-bd91-4a9b-9783-7a47ba42ac73"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f7ba2fcd-605d-4135-9560-34f8dd9a3d54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7ba2fcd-605d-4135-9560-34f8dd9a3d54
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f7ba2fcd-605d-4135-9560-34f8dd9a3d54
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
correlation: qa-857ed77d-31b2-4fa0-9f70-3b3cd623b5da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-857ed77d-31b2-4fa0-9f70-3b3cd623b5da
Content-Type: application/json

--- request body ---
{"handle":"qa-926a4f4e5395","password":"****"}

--- response: 401 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-857ed77d-31b2-4fa0-9f70-3b3cd623b5da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-857ed77d-31b2-4fa0-9f70-3b3cd623b5da"}
```
