# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-a9b7dd5a-b83e-4226-b3be-cfd89cd1f648` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-7e867020-7891-41ed-9a39-009a4301c8f6` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-7cfa8f23-01c6-45fe-bdff-a0da7e8827a2` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-dc51e932-fa66-4e25-90e0-82e495ab33ca` |
| 5 | `GET /v1/admin/stats` | 503 | 21 | `qa-ce99ddb6-0cbc-4e8c-bc90-0a0ce6a96f70` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-cbb07a62-1f83-45af-8372-94d0810e9c3d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-3b3d604e-f412-4d19-a594-394247bb3cc1` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-93bc3d3a-692e-4d7b-9d25-bded4376c6c9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-d4fb2693-1542-430a-9dbd-3581daa0338f` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-c39deb86-b3e2-47f5-9cfa-daf771aebfc6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a9b7dd5a-b83e-4226-b3be-cfd89cd1f648

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9b7dd5a-b83e-4226-b3be-cfd89cd1f648
Content-Type: application/json

--- request body ---
{"handle":"qa-9e52d9fdcccb","displayName":"QA 9e52d9fdcccb","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9b7dd5a-b83e-4226-b3be-cfd89cd1f648
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 6
Location: /v1/accounts/qa-9e52d9fdcccb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c20b0483-dc71-4711-a8da-01e0eb033f12","handle":"qa-9e52d9fdcccb","displayName":"QA 9e52d9fdcccb","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.788122829Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7e867020-7891-41ed-9a39-009a4301c8f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e867020-7891-41ed-9a39-009a4301c8f6
Content-Type: application/json

--- request body ---
{"handle":"qa-69a37eec3e9e","displayName":"QA 69a37eec3e9e","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e867020-7891-41ed-9a39-009a4301c8f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 6
Location: /v1/accounts/qa-69a37eec3e9e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8906032c-2835-49d9-855a-ef91b42f7b5f","handle":"qa-69a37eec3e9e","displayName":"QA 69a37eec3e9e","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.826337707Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7cfa8f23-01c6-45fe-bdff-a0da7e8827a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cfa8f23-01c6-45fe-bdff-a0da7e8827a2
Content-Type: application/json

--- request body ---
{"handle":"qa-9e52d9fdcccb","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cfa8f23-01c6-45fe-bdff-a0da7e8827a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c20b0483-dc71-4711-a8da-01e0eb033f12"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-dc51e932-fa66-4e25-90e0-82e495ab33ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc51e932-fa66-4e25-90e0-82e495ab33ca
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-69a37eec3e9e","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc51e932-fa66-4e25-90e0-82e495ab33ca
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
Location: /v1/conversations/cnv_4b339c6c-ec0e-40af-a3b5-4a909b1393a5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4b339c6c-ec0e-40af-a3b5-4a909b1393a5","subject":"Error contract","status":"open","region":"eu","participants":["qa-9e52d9fdcccb","qa-69a37eec3e9e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.911281481Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-ce99ddb6-0cbc-4e8c-bc90-0a0ce6a96f70

--- request headers ---
Accept: application/json
X-Fault-Key: e5091f6e-cbdf-4228-8f92-82bfcc9665ad
X-Fault: unavailable-once
X-Correlation-Id: qa-ce99ddb6-0cbc-4e8c-bc90-0a0ce6a96f70
Content-Type: application/json

--- response: 503 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce99ddb6-0cbc-4e8c-bc90-0a0ce6a96f70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-ce99ddb6-0cbc-4e8c-bc90-0a0ce6a96f70"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cbb07a62-1f83-45af-8372-94d0810e9c3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbb07a62-1f83-45af-8372-94d0810e9c3d
Content-Type: application/json

--- request body ---
{"handle":"qa-69a37eec3e9e","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbb07a62-1f83-45af-8372-94d0810e9c3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8906032c-2835-49d9-855a-ef91b42f7b5f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b3d604e-f412-4d19-a594-394247bb3cc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b3d604e-f412-4d19-a594-394247bb3cc1
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b3d604e-f412-4d19-a594-394247bb3cc1
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
correlation: qa-93bc3d3a-692e-4d7b-9d25-bded4376c6c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93bc3d3a-692e-4d7b-9d25-bded4376c6c9
Content-Type: application/json

--- request body ---
{"handle":"qa-69a37eec3e9e","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93bc3d3a-692e-4d7b-9d25-bded4376c6c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93bc3d3a-692e-4d7b-9d25-bded4376c6c9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d4fb2693-1542-430a-9dbd-3581daa0338f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4fb2693-1542-430a-9dbd-3581daa0338f
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d4fb2693-1542-430a-9dbd-3581daa0338f
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
correlation: qa-c39deb86-b3e2-47f5-9cfa-daf771aebfc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c39deb86-b3e2-47f5-9cfa-daf771aebfc6
Content-Type: application/json

--- request body ---
{"handle":"qa-9e52d9fdcccb","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c39deb86-b3e2-47f5-9cfa-daf771aebfc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c39deb86-b3e2-47f5-9cfa-daf771aebfc6"}
```
