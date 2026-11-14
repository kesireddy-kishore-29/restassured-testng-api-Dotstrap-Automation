# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-6f5baa2f-7d31-43b4-b116-83d8782bd014` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-f0f8f9a6-5856-44f1-b2c5-1109a583b29f` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-396d2e4e-dda9-4bb5-96bb-42e83841522c` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-105920b9-84b7-402d-938c-297b6cdbed29` |
| 5 | `POST /v1/auth/token` | 422 | 42 | `qa-1f582db1-4ae4-46dd-b4b0-0aecec1f866f` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-70a647e0-f431-4769-8ae4-1bc2c9c017be` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-1a778b1b-45a4-4117-af5c-1b61f9a733db` |
| 8 | `POST /v1/auth/token` | 401 | 48 | `qa-def18b7f-d73a-4939-9af3-7cf9ead6443b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-a0e63e75-966f-4b79-b325-f19a33b7fb2e` |
| 10 | `POST /v1/auth/token` | 401 | 71 | `qa-59caec8a-36af-43a8-93e1-d0da33aa92d8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6f5baa2f-7d31-43b4-b116-83d8782bd014

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f5baa2f-7d31-43b4-b116-83d8782bd014
Content-Type: application/json

--- request body ---
{"handle":"qa-33067b04ce4b","displayName":"QA 33067b04ce4b","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f5baa2f-7d31-43b4-b116-83d8782bd014
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-33067b04ce4b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b9b215bd-3a32-4a1f-9e9b-d14a35f76f78","handle":"qa-33067b04ce4b","displayName":"QA 33067b04ce4b","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.182953035Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f0f8f9a6-5856-44f1-b2c5-1109a583b29f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0f8f9a6-5856-44f1-b2c5-1109a583b29f
Content-Type: application/json

--- request body ---
{"handle":"qa-3636a224f0d8","displayName":"QA 3636a224f0d8","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0f8f9a6-5856-44f1-b2c5-1109a583b29f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Location: /v1/accounts/qa-3636a224f0d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_686c30b1-a845-4d40-b941-8016909edfd9","handle":"qa-3636a224f0d8","displayName":"QA 3636a224f0d8","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.243638262Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-396d2e4e-dda9-4bb5-96bb-42e83841522c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-396d2e4e-dda9-4bb5-96bb-42e83841522c
Content-Type: application/json

--- request body ---
{"handle":"qa-33067b04ce4b","password":"****"}

--- response: 200 in 46 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-396d2e4e-dda9-4bb5-96bb-42e83841522c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b9b215bd-3a32-4a1f-9e9b-d14a35f76f78"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-105920b9-84b7-402d-938c-297b6cdbed29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-105920b9-84b7-402d-938c-297b6cdbed29
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3636a224f0d8","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-105920b9-84b7-402d-938c-297b6cdbed29
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
Location: /v1/conversations/cnv_88b80559-d0d8-4fb7-8d92-3d470db518ec
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_88b80559-d0d8-4fb7-8d92-3d470db518ec","subject":"Error contract","status":"open","region":"eu","participants":["qa-33067b04ce4b","qa-3636a224f0d8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.337139307Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-1f582db1-4ae4-46dd-b4b0-0aecec1f866f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f582db1-4ae4-46dd-b4b0-0aecec1f866f
Content-Type: application/json

--- request body ---
{"handle":"qa-33067b04ce4b","password":"****","ttlSeconds":0}

--- response: 422 in 42 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f582db1-4ae4-46dd-b4b0-0aecec1f866f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-1f582db1-4ae4-46dd-b4b0-0aecec1f866f","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-70a647e0-f431-4769-8ae4-1bc2c9c017be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70a647e0-f431-4769-8ae4-1bc2c9c017be
Content-Type: application/json

--- request body ---
{"handle":"qa-3636a224f0d8","password":"****"}

--- response: 200 in 47 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-70a647e0-f431-4769-8ae4-1bc2c9c017be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_686c30b1-a845-4d40-b941-8016909edfd9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1a778b1b-45a4-4117-af5c-1b61f9a733db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a778b1b-45a4-4117-af5c-1b61f9a733db
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1a778b1b-45a4-4117-af5c-1b61f9a733db
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
correlation: qa-def18b7f-d73a-4939-9af3-7cf9ead6443b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-def18b7f-d73a-4939-9af3-7cf9ead6443b
Content-Type: application/json

--- request body ---
{"handle":"qa-3636a224f0d8","password":"****"}

--- response: 401 in 48 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-def18b7f-d73a-4939-9af3-7cf9ead6443b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-def18b7f-d73a-4939-9af3-7cf9ead6443b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a0e63e75-966f-4b79-b325-f19a33b7fb2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0e63e75-966f-4b79-b325-f19a33b7fb2e
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a0e63e75-966f-4b79-b325-f19a33b7fb2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-59caec8a-36af-43a8-93e1-d0da33aa92d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59caec8a-36af-43a8-93e1-d0da33aa92d8
Content-Type: application/json

--- request body ---
{"handle":"qa-33067b04ce4b","password":"****"}

--- response: 401 in 71 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59caec8a-36af-43a8-93e1-d0da33aa92d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-59caec8a-36af-43a8-93e1-d0da33aa92d8"}
```
