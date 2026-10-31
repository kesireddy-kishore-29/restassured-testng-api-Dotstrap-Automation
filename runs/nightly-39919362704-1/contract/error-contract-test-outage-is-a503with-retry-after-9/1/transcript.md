# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-f2972494-50d8-4f4a-8ebd-b60ad91a1cab` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-5549471b-5345-48fd-a497-9dd5020f6d19` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-dbf6bbe9-809e-4361-95c0-ac21f66cf531` |
| 4 | `POST /v1/conversations` | 201 | 34 | `qa-932203d2-3c69-4499-bf3f-5816244951a5` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 19 | `qa-8b6c4a63-2a2f-431a-9250-3a1659dff3db` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-185cbaec-14a6-449e-830b-3e6cc6aeea09` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-c8b729d5-f988-4b10-bf3b-f5c76fa426e5` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-ed27f106-20ec-4057-a5e0-d0d4c93b4595` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-779a84a0-a3c4-426c-9372-b188d299f0e9` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-8613e08a-b30c-459c-a678-f298712c7a0e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f2972494-50d8-4f4a-8ebd-b60ad91a1cab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2972494-50d8-4f4a-8ebd-b60ad91a1cab
Content-Type: application/json

--- request body ---
{"handle":"qa-c84466965bf2","displayName":"QA c84466965bf2","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2972494-50d8-4f4a-8ebd-b60ad91a1cab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 7
Location: /v1/accounts/qa-c84466965bf2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bd11f625-4355-4808-83a7-27c35928d5a9","handle":"qa-c84466965bf2","displayName":"QA c84466965bf2","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.148423282Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5549471b-5345-48fd-a497-9dd5020f6d19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5549471b-5345-48fd-a497-9dd5020f6d19
Content-Type: application/json

--- request body ---
{"handle":"qa-48d0da5264d8","displayName":"QA 48d0da5264d8","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5549471b-5345-48fd-a497-9dd5020f6d19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Location: /v1/accounts/qa-48d0da5264d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4cb60f3-9970-4d15-8f03-23c8bf17ca32","handle":"qa-48d0da5264d8","displayName":"QA 48d0da5264d8","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.198712247Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dbf6bbe9-809e-4361-95c0-ac21f66cf531

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbf6bbe9-809e-4361-95c0-ac21f66cf531
Content-Type: application/json

--- request body ---
{"handle":"qa-c84466965bf2","password":"****"}

--- response: 200 in 53 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbf6bbe9-809e-4361-95c0-ac21f66cf531
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bd11f625-4355-4808-83a7-27c35928d5a9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-932203d2-3c69-4499-bf3f-5816244951a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-932203d2-3c69-4499-bf3f-5816244951a5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-48d0da5264d8","subject":"Error contract","message":"Hi"}

--- response: 201 in 34 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-932203d2-3c69-4499-bf3f-5816244951a5
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
Location: /v1/conversations/cnv_18eeab85-3c17-46bc-8fd8-9f6ef293efc6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_18eeab85-3c17-46bc-8fd8-9f6ef293efc6","subject":"Error contract","status":"open","region":"eu","participants":["qa-c84466965bf2","qa-48d0da5264d8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.322325359Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_18eeab85-3c17-46bc-8fd8-9f6ef293efc6/messages
correlation: qa-8b6c4a63-2a2f-431a-9250-3a1659dff3db

--- request headers ---
Accept: application/json
X-Fault-Key: 2f6f2120-9679-4206-b7d3-370a302e65ba
X-Fault: unavailable-once
X-Correlation-Id: qa-8b6c4a63-2a2f-431a-9250-3a1659dff3db
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b6c4a63-2a2f-431a-9250-3a1659dff3db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_18eeab85-3c17-46bc-8fd8-9f6ef293efc6/messages","correlationId":"qa-8b6c4a63-2a2f-431a-9250-3a1659dff3db"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-185cbaec-14a6-449e-830b-3e6cc6aeea09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-185cbaec-14a6-449e-830b-3e6cc6aeea09
Content-Type: application/json

--- request body ---
{"handle":"qa-48d0da5264d8","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-185cbaec-14a6-449e-830b-3e6cc6aeea09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4cb60f3-9970-4d15-8f03-23c8bf17ca32"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c8b729d5-f988-4b10-bf3b-f5c76fa426e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8b729d5-f988-4b10-bf3b-f5c76fa426e5
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c8b729d5-f988-4b10-bf3b-f5c76fa426e5
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
correlation: qa-ed27f106-20ec-4057-a5e0-d0d4c93b4595

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed27f106-20ec-4057-a5e0-d0d4c93b4595
Content-Type: application/json

--- request body ---
{"handle":"qa-48d0da5264d8","password":"****"}

--- response: 401 in 30 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed27f106-20ec-4057-a5e0-d0d4c93b4595
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ed27f106-20ec-4057-a5e0-d0d4c93b4595"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-779a84a0-a3c4-426c-9372-b188d299f0e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-779a84a0-a3c4-426c-9372-b188d299f0e9
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-779a84a0-a3c4-426c-9372-b188d299f0e9
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
correlation: qa-8613e08a-b30c-459c-a678-f298712c7a0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8613e08a-b30c-459c-a678-f298712c7a0e
Content-Type: application/json

--- request body ---
{"handle":"qa-c84466965bf2","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8613e08a-b30c-459c-a678-f298712c7a0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8613e08a-b30c-459c-a678-f298712c7a0e"}
```
