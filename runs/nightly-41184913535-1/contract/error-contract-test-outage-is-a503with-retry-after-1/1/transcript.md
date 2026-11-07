# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 690 | `qa-23667e79-2eb6-40a7-9a38-e5ad991ea6de` |
| 2 | `POST /v1/accounts` | 201 | 111 | `qa-dde6ca0f-3841-4d59-a734-142ab37cef9e` |
| 3 | `POST /v1/auth/token` | 200 | 48 | `qa-d1a17961-1f7d-4a4b-8c7e-3bb2f30e529f` |
| 4 | `POST /v1/conversations` | 201 | 126 | `qa-25aaba9f-929c-41da-8fdf-8863be3a502f` |
| 5 | `POST /v1/accounts` | 503 | 43 | `qa-be0bc49c-ec38-4e9f-9285-ed42e4e61cea` |
| 6 | `POST /v1/auth/token` | 200 | 52 | `qa-86ebd6ae-ae74-425b-b84f-6785c39c49f2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-b9b3b581-cdcd-4f10-9417-fa4bb9c57afb` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-c76da677-17c6-40af-b91e-66e6fe6e25a0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-57241530-7329-447f-9015-efdf8f45b121` |
| 10 | `POST /v1/auth/token` | 401 | 39 | `qa-6955ed71-affa-408e-9c1c-07466f57a176` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-23667e79-2eb6-40a7-9a38-e5ad991ea6de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23667e79-2eb6-40a7-9a38-e5ad991ea6de
Content-Type: application/json

--- request body ---
{"handle":"qa-2719bfc5cb2f","displayName":"QA 2719bfc5cb2f","password":"****","region":"eu"}

--- response: 201 in 690 ms ---
Date: Sat, 31 Oct 2026 08:31:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-23667e79-2eb6-40a7-9a38-e5ad991ea6de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Location: /v1/accounts/qa-2719bfc5cb2f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f2d134e-245e-452a-8e69-2965d0adb76c","handle":"qa-2719bfc5cb2f","displayName":"QA 2719bfc5cb2f","region":"eu","role":"user","createdAt":"2026-10-31T08:31:32.887655499Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dde6ca0f-3841-4d59-a734-142ab37cef9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dde6ca0f-3841-4d59-a734-142ab37cef9e
Content-Type: application/json

--- request body ---
{"handle":"qa-45b1a3d6aa2a","displayName":"QA 45b1a3d6aa2a","password":"****","region":"eu"}

--- response: 201 in 111 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-dde6ca0f-3841-4d59-a734-142ab37cef9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-45b1a3d6aa2a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ce7aa4d2-fe88-40d3-b977-0538031fd96e","handle":"qa-45b1a3d6aa2a","displayName":"QA 45b1a3d6aa2a","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.346161994Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d1a17961-1f7d-4a4b-8c7e-3bb2f30e529f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1a17961-1f7d-4a4b-8c7e-3bb2f30e529f
Content-Type: application/json

--- request body ---
{"handle":"qa-2719bfc5cb2f","password":"****"}

--- response: 200 in 48 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1a17961-1f7d-4a4b-8c7e-3bb2f30e529f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3f2d134e-245e-452a-8e69-2965d0adb76c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-25aaba9f-929c-41da-8fdf-8863be3a502f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25aaba9f-929c-41da-8fdf-8863be3a502f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-45b1a3d6aa2a","subject":"Error contract","message":"Hi"}

--- response: 201 in 126 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-25aaba9f-929c-41da-8fdf-8863be3a502f
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
Location: /v1/conversations/cnv_87d84e08-1cea-4cc3-87dc-2c5e7a255b51
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_87d84e08-1cea-4cc3-87dc-2c5e7a255b51","subject":"Error contract","status":"open","region":"eu","participants":["qa-2719bfc5cb2f","qa-45b1a3d6aa2a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:33.572056684Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-be0bc49c-ec38-4e9f-9285-ed42e4e61cea

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 8dc24191-39cb-4812-a325-8e15365ac415
X-Correlation-Id: qa-be0bc49c-ec38-4e9f-9285-ed42e4e61cea
Content-Type: application/json

--- request body ---
{"handle":"qa-7346990fb5f6","displayName":"QA 7346990fb5f6","password":"****","region":"eu"}

--- response: 503 in 43 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be0bc49c-ec38-4e9f-9285-ed42e4e61cea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-be0bc49c-ec38-4e9f-9285-ed42e4e61cea"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-86ebd6ae-ae74-425b-b84f-6785c39c49f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86ebd6ae-ae74-425b-b84f-6785c39c49f2
Content-Type: application/json

--- request body ---
{"handle":"qa-45b1a3d6aa2a","password":"****"}

--- response: 200 in 52 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-86ebd6ae-ae74-425b-b84f-6785c39c49f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce7aa4d2-fe88-40d3-b977-0538031fd96e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b9b3b581-cdcd-4f10-9417-fa4bb9c57afb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9b3b581-cdcd-4f10-9417-fa4bb9c57afb
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b9b3b581-cdcd-4f10-9417-fa4bb9c57afb
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
correlation: qa-c76da677-17c6-40af-b91e-66e6fe6e25a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c76da677-17c6-40af-b91e-66e6fe6e25a0
Content-Type: application/json

--- request body ---
{"handle":"qa-45b1a3d6aa2a","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c76da677-17c6-40af-b91e-66e6fe6e25a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c76da677-17c6-40af-b91e-66e6fe6e25a0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-57241530-7329-447f-9015-efdf8f45b121

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57241530-7329-447f-9015-efdf8f45b121
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-57241530-7329-447f-9015-efdf8f45b121
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
correlation: qa-6955ed71-affa-408e-9c1c-07466f57a176

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6955ed71-affa-408e-9c1c-07466f57a176
Content-Type: application/json

--- request body ---
{"handle":"qa-2719bfc5cb2f","password":"****"}

--- response: 401 in 39 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6955ed71-affa-408e-9c1c-07466f57a176
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6955ed71-affa-408e-9c1c-07466f57a176"}
```
