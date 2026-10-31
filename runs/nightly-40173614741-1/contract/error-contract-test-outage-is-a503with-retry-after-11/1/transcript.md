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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-5be5068c-164d-4535-8338-a4cb6fe83207` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-b0962514-769f-4d68-8186-9bfbb05cd36c` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-b5179b23-3379-4031-8999-452a31f693af` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-31d28bca-1f2d-464c-bf87-b6341a6ed130` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 25 | `qa-644e9184-9df2-4b78-9a75-6fcb21cacc06` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-93c32ae6-bdb7-4094-b396-72560744d121` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-7fdbbd3c-8d4d-45c5-ada9-586f198fd628` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-2ab4b2e4-5849-499c-bb1e-9f799c420ce5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-814f69de-4a1b-4202-bd48-6afda97cca99` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-239dce51-9db1-4c9f-8a2c-b3d43f041178` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5be5068c-164d-4535-8338-a4cb6fe83207

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5be5068c-164d-4535-8338-a4cb6fe83207
Content-Type: application/json

--- request body ---
{"handle":"qa-ef22ccedfc03","displayName":"QA ef22ccedfc03","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-5be5068c-164d-4535-8338-a4cb6fe83207
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 7
Location: /v1/accounts/qa-ef22ccedfc03
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f1f4b0a2-a0ce-46ca-8e68-5f5af0dbba4d","handle":"qa-ef22ccedfc03","displayName":"QA ef22ccedfc03","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.174474468Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b0962514-769f-4d68-8186-9bfbb05cd36c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0962514-769f-4d68-8186-9bfbb05cd36c
Content-Type: application/json

--- request body ---
{"handle":"qa-5ef14e9bcde6","displayName":"QA 5ef14e9bcde6","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0962514-769f-4d68-8186-9bfbb05cd36c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 7
Location: /v1/accounts/qa-5ef14e9bcde6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e758413a-efa6-4109-9da6-f1f83783fdfd","handle":"qa-5ef14e9bcde6","displayName":"QA 5ef14e9bcde6","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.228842912Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b5179b23-3379-4031-8999-452a31f693af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5179b23-3379-4031-8999-452a31f693af
Content-Type: application/json

--- request body ---
{"handle":"qa-ef22ccedfc03","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5179b23-3379-4031-8999-452a31f693af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1f4b0a2-a0ce-46ca-8e68-5f5af0dbba4d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-31d28bca-1f2d-464c-bf87-b6341a6ed130

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31d28bca-1f2d-464c-bf87-b6341a6ed130
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5ef14e9bcde6","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-31d28bca-1f2d-464c-bf87-b6341a6ed130
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
Location: /v1/conversations/cnv_214f7ba0-60ba-4df2-a207-24c51ea47fb7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_214f7ba0-60ba-4df2-a207-24c51ea47fb7","subject":"Error contract","status":"open","region":"eu","participants":["qa-ef22ccedfc03","qa-5ef14e9bcde6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.297402355Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_214f7ba0-60ba-4df2-a207-24c51ea47fb7/read
correlation: qa-644e9184-9df2-4b78-9a75-6fcb21cacc06

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 65bfcf22-5ca7-496c-9130-8836605eb432
X-Correlation-Id: qa-644e9184-9df2-4b78-9a75-6fcb21cacc06
Content-Type: application/json

--- response: 503 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-644e9184-9df2-4b78-9a75-6fcb21cacc06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_214f7ba0-60ba-4df2-a207-24c51ea47fb7/read","correlationId":"qa-644e9184-9df2-4b78-9a75-6fcb21cacc06"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-93c32ae6-bdb7-4094-b396-72560744d121

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93c32ae6-bdb7-4094-b396-72560744d121
Content-Type: application/json

--- request body ---
{"handle":"qa-5ef14e9bcde6","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-93c32ae6-bdb7-4094-b396-72560744d121
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e758413a-efa6-4109-9da6-f1f83783fdfd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7fdbbd3c-8d4d-45c5-ada9-586f198fd628

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fdbbd3c-8d4d-45c5-ada9-586f198fd628
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7fdbbd3c-8d4d-45c5-ada9-586f198fd628
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
correlation: qa-2ab4b2e4-5849-499c-bb1e-9f799c420ce5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ab4b2e4-5849-499c-bb1e-9f799c420ce5
Content-Type: application/json

--- request body ---
{"handle":"qa-5ef14e9bcde6","password":"****"}

--- response: 401 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ab4b2e4-5849-499c-bb1e-9f799c420ce5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2ab4b2e4-5849-499c-bb1e-9f799c420ce5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-814f69de-4a1b-4202-bd48-6afda97cca99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-814f69de-4a1b-4202-bd48-6afda97cca99
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-814f69de-4a1b-4202-bd48-6afda97cca99
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
correlation: qa-239dce51-9db1-4c9f-8a2c-b3d43f041178

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-239dce51-9db1-4c9f-8a2c-b3d43f041178
Content-Type: application/json

--- request body ---
{"handle":"qa-ef22ccedfc03","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-239dce51-9db1-4c9f-8a2c-b3d43f041178
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-239dce51-9db1-4c9f-8a2c-b3d43f041178"}
```
