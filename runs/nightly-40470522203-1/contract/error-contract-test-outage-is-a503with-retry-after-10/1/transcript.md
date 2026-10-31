# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-13ffdceb-db58-46ba-9186-5ed15810cc8b` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-cdbde643-6551-49f5-ab84-29d088ef05e7` |
| 3 | `POST /v1/auth/token` | 200 | 65 | `qa-b3fb948d-c7b0-4f33-a2ea-0c7c61349bfb` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-a6f7203d-a41c-4b2c-8761-465f33a7e680` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 19 | `qa-8a5a0a2f-3980-4205-a7c1-63c5c5cf8eb0` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-e94bbe87-8c9a-463b-8a37-4321ca9cdafd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-0b16069e-ff5b-4aa3-80a6-2b0ae577710a` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-f012f903-150e-4833-a407-b4afe5c2bfb6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-39466f1d-62fc-4b38-9b79-2b865d534957` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-fb213334-615e-4059-80c7-98f413b232a8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-13ffdceb-db58-46ba-9186-5ed15810cc8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13ffdceb-db58-46ba-9186-5ed15810cc8b
Content-Type: application/json

--- request body ---
{"handle":"qa-ef15da44d6ff","displayName":"QA ef15da44d6ff","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-13ffdceb-db58-46ba-9186-5ed15810cc8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 7
Location: /v1/accounts/qa-ef15da44d6ff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_006442d0-3400-41f3-b578-3f5279b1b9df","handle":"qa-ef15da44d6ff","displayName":"QA ef15da44d6ff","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.812543868Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cdbde643-6551-49f5-ab84-29d088ef05e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdbde643-6551-49f5-ab84-29d088ef05e7
Content-Type: application/json

--- request body ---
{"handle":"qa-89b990a6e0a9","displayName":"QA 89b990a6e0a9","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdbde643-6551-49f5-ab84-29d088ef05e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 7
Location: /v1/accounts/qa-89b990a6e0a9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72dd84e6-ff72-4c80-b6fb-0846b84c9716","handle":"qa-89b990a6e0a9","displayName":"QA 89b990a6e0a9","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.873228068Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b3fb948d-c7b0-4f33-a2ea-0c7c61349bfb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3fb948d-c7b0-4f33-a2ea-0c7c61349bfb
Content-Type: application/json

--- request body ---
{"handle":"qa-ef15da44d6ff","password":"****"}

--- response: 200 in 65 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3fb948d-c7b0-4f33-a2ea-0c7c61349bfb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_006442d0-3400-41f3-b578-3f5279b1b9df"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a6f7203d-a41c-4b2c-8761-465f33a7e680

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6f7203d-a41c-4b2c-8761-465f33a7e680
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-89b990a6e0a9","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6f7203d-a41c-4b2c-8761-465f33a7e680
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
Location: /v1/conversations/cnv_3018466d-1c6a-4ada-9f1b-15d9316013a1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3018466d-1c6a-4ada-9f1b-15d9316013a1","subject":"Error contract","status":"open","region":"eu","participants":["qa-ef15da44d6ff","qa-89b990a6e0a9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:35.013097201Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_3018466d-1c6a-4ada-9f1b-15d9316013a1/messages
correlation: qa-8a5a0a2f-3980-4205-a7c1-63c5c5cf8eb0

--- request headers ---
Accept: application/json
X-Fault-Key: bc336c1c-0e03-4974-a024-b9095a8f6de7
X-Fault: unavailable-once
X-Correlation-Id: qa-8a5a0a2f-3980-4205-a7c1-63c5c5cf8eb0
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a5a0a2f-3980-4205-a7c1-63c5c5cf8eb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_3018466d-1c6a-4ada-9f1b-15d9316013a1/messages","correlationId":"qa-8a5a0a2f-3980-4205-a7c1-63c5c5cf8eb0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e94bbe87-8c9a-463b-8a37-4321ca9cdafd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e94bbe87-8c9a-463b-8a37-4321ca9cdafd
Content-Type: application/json

--- request body ---
{"handle":"qa-89b990a6e0a9","password":"****"}

--- response: 200 in 30 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-e94bbe87-8c9a-463b-8a37-4321ca9cdafd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72dd84e6-ff72-4c80-b6fb-0846b84c9716"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b16069e-ff5b-4aa3-80a6-2b0ae577710a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b16069e-ff5b-4aa3-80a6-2b0ae577710a
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b16069e-ff5b-4aa3-80a6-2b0ae577710a
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
correlation: qa-f012f903-150e-4833-a407-b4afe5c2bfb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f012f903-150e-4833-a407-b4afe5c2bfb6
Content-Type: application/json

--- request body ---
{"handle":"qa-89b990a6e0a9","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f012f903-150e-4833-a407-b4afe5c2bfb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f012f903-150e-4833-a407-b4afe5c2bfb6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-39466f1d-62fc-4b38-9b79-2b865d534957

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39466f1d-62fc-4b38-9b79-2b865d534957
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-39466f1d-62fc-4b38-9b79-2b865d534957
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
correlation: qa-fb213334-615e-4059-80c7-98f413b232a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb213334-615e-4059-80c7-98f413b232a8
Content-Type: application/json

--- request body ---
{"handle":"qa-ef15da44d6ff","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb213334-615e-4059-80c7-98f413b232a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fb213334-615e-4059-80c7-98f413b232a8"}
```
