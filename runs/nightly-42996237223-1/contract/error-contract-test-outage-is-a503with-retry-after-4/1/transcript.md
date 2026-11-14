# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-22a16244-e847-4d11-b3de-ab3219662bcc` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-18308ee3-8e37-4f65-b3b0-0887cbd35d5a` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-025e5ef5-cda2-492f-bf99-af7936d4fcc3` |
| 4 | `POST /v1/conversations` | 201 | 32 | `qa-412a2c13-1ae5-4d35-8aa8-1135697fae98` |
| 5 | `DELETE /v1/accounts/me` | 503 | 20 | `qa-4c1e5145-3fd6-42ed-9414-cfd6eb36fda3` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-b8f0d64b-b301-40d6-808a-232798ec2c03` |
| 7 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-87a343bd-196a-4e72-a4d1-03103d78aa1b` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-80547476-7d7d-452a-99bc-1cf73d92135c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-63e48f2d-2b3d-4516-8061-0184f8f0a013` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-daf6f569-7445-4fb4-b158-7d9630d2810e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-22a16244-e847-4d11-b3de-ab3219662bcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22a16244-e847-4d11-b3de-ab3219662bcc
Content-Type: application/json

--- request body ---
{"handle":"qa-83e9f561f19f","displayName":"QA 83e9f561f19f","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-22a16244-e847-4d11-b3de-ab3219662bcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Location: /v1/accounts/qa-83e9f561f19f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_be8538a1-6caa-4801-935a-6b625bf5045c","handle":"qa-83e9f561f19f","displayName":"QA 83e9f561f19f","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.586378080Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-18308ee3-8e37-4f65-b3b0-0887cbd35d5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18308ee3-8e37-4f65-b3b0-0887cbd35d5a
Content-Type: application/json

--- request body ---
{"handle":"qa-f2bc946f0636","displayName":"QA f2bc946f0636","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-18308ee3-8e37-4f65-b3b0-0887cbd35d5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Location: /v1/accounts/qa-f2bc946f0636
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2579b0d5-aece-43c1-a115-f8e37878ef57","handle":"qa-f2bc946f0636","displayName":"QA f2bc946f0636","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.675715248Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-025e5ef5-cda2-492f-bf99-af7936d4fcc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-025e5ef5-cda2-492f-bf99-af7936d4fcc3
Content-Type: application/json

--- request body ---
{"handle":"qa-83e9f561f19f","password":"****"}

--- response: 200 in 47 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-025e5ef5-cda2-492f-bf99-af7936d4fcc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_be8538a1-6caa-4801-935a-6b625bf5045c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-412a2c13-1ae5-4d35-8aa8-1135697fae98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-412a2c13-1ae5-4d35-8aa8-1135697fae98
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f2bc946f0636","subject":"Error contract","message":"Hi"}

--- response: 201 in 32 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-412a2c13-1ae5-4d35-8aa8-1135697fae98
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
Location: /v1/conversations/cnv_1cd7cdef-2d0e-403f-be6f-28d79110a870
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1cd7cdef-2d0e-403f-be6f-28d79110a870","subject":"Error contract","status":"open","region":"eu","participants":["qa-83e9f561f19f","qa-f2bc946f0636"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:37.791901627Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4c1e5145-3fd6-42ed-9414-cfd6eb36fda3

--- request headers ---
Accept: application/json
X-Fault-Key: e943f282-68b2-4d2a-947c-17037dbe2ee3
X-Fault: unavailable-once
X-Correlation-Id: qa-4c1e5145-3fd6-42ed-9414-cfd6eb36fda3
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c1e5145-3fd6-42ed-9414-cfd6eb36fda3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-4c1e5145-3fd6-42ed-9414-cfd6eb36fda3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b8f0d64b-b301-40d6-808a-232798ec2c03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8f0d64b-b301-40d6-808a-232798ec2c03
Content-Type: application/json

--- request body ---
{"handle":"qa-f2bc946f0636","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8f0d64b-b301-40d6-808a-232798ec2c03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2579b0d5-aece-43c1-a115-f8e37878ef57"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-87a343bd-196a-4e72-a4d1-03103d78aa1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87a343bd-196a-4e72-a4d1-03103d78aa1b
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-87a343bd-196a-4e72-a4d1-03103d78aa1b
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
correlation: qa-80547476-7d7d-452a-99bc-1cf73d92135c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80547476-7d7d-452a-99bc-1cf73d92135c
Content-Type: application/json

--- request body ---
{"handle":"qa-f2bc946f0636","password":"****"}

--- response: 401 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80547476-7d7d-452a-99bc-1cf73d92135c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-80547476-7d7d-452a-99bc-1cf73d92135c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-63e48f2d-2b3d-4516-8061-0184f8f0a013

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63e48f2d-2b3d-4516-8061-0184f8f0a013
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-63e48f2d-2b3d-4516-8061-0184f8f0a013
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
correlation: qa-daf6f569-7445-4fb4-b158-7d9630d2810e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daf6f569-7445-4fb4-b158-7d9630d2810e
Content-Type: application/json

--- request body ---
{"handle":"qa-83e9f561f19f","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-daf6f569-7445-4fb4-b158-7d9630d2810e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-daf6f569-7445-4fb4-b158-7d9630d2810e"}
```
