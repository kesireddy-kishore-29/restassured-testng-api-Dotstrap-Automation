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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-772f6f9a-5e36-4e0f-ae63-825773ff6268` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-4d7d2098-25c1-47a0-bb5f-b11aead9fed8` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-741894d3-8bf1-45a5-917f-0d79c6556174` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-1b2e121c-1cba-4074-92c5-b8deeaa856fe` |
| 5 | `POST /v1/auth/token` | 422 | 70 | `qa-a709fd83-31c2-48ce-96e6-d35a241d55b7` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-15818919-3957-4355-b682-002f38ad778f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-9704195a-6fb8-4910-91df-c338d8874791` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-71ab6d72-327b-4991-8431-8a11a802557f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-13ad1035-c7c5-4030-a063-2dd31e5fa60a` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-9b760595-5dc9-47a7-91df-19f86110e041` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-772f6f9a-5e36-4e0f-ae63-825773ff6268

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-772f6f9a-5e36-4e0f-ae63-825773ff6268
Content-Type: application/json

--- request body ---
{"handle":"qa-d2def5db42ee","displayName":"QA d2def5db42ee","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-772f6f9a-5e36-4e0f-ae63-825773ff6268
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Location: /v1/accounts/qa-d2def5db42ee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea601916-73fc-456d-960d-f390ebd454a4","handle":"qa-d2def5db42ee","displayName":"QA d2def5db42ee","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.399148360Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4d7d2098-25c1-47a0-bb5f-b11aead9fed8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d7d2098-25c1-47a0-bb5f-b11aead9fed8
Content-Type: application/json

--- request body ---
{"handle":"qa-c60db9974c85","displayName":"QA c60db9974c85","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d7d2098-25c1-47a0-bb5f-b11aead9fed8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Location: /v1/accounts/qa-c60db9974c85
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7ea47834-07ce-46f8-a455-292501713d5b","handle":"qa-c60db9974c85","displayName":"QA c60db9974c85","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.432581523Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-741894d3-8bf1-45a5-917f-0d79c6556174

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-741894d3-8bf1-45a5-917f-0d79c6556174
Content-Type: application/json

--- request body ---
{"handle":"qa-d2def5db42ee","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-741894d3-8bf1-45a5-917f-0d79c6556174
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea601916-73fc-456d-960d-f390ebd454a4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1b2e121c-1cba-4074-92c5-b8deeaa856fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b2e121c-1cba-4074-92c5-b8deeaa856fe
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c60db9974c85","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b2e121c-1cba-4074-92c5-b8deeaa856fe
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
Location: /v1/conversations/cnv_0fbad6f4-ed51-4e63-b5dc-3415fcde95b2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0fbad6f4-ed51-4e63-b5dc-3415fcde95b2","subject":"Error contract","status":"open","region":"eu","participants":["qa-d2def5db42ee","qa-c60db9974c85"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.489120308Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a709fd83-31c2-48ce-96e6-d35a241d55b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a709fd83-31c2-48ce-96e6-d35a241d55b7
Content-Type: application/json

--- request body ---
{"handle":"qa-d2def5db42ee","password":"****","ttlSeconds":0}

--- response: 422 in 70 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a709fd83-31c2-48ce-96e6-d35a241d55b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 10
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-a709fd83-31c2-48ce-96e6-d35a241d55b7","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-15818919-3957-4355-b682-002f38ad778f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15818919-3957-4355-b682-002f38ad778f
Content-Type: application/json

--- request body ---
{"handle":"qa-c60db9974c85","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-15818919-3957-4355-b682-002f38ad778f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7ea47834-07ce-46f8-a455-292501713d5b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9704195a-6fb8-4910-91df-c338d8874791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9704195a-6fb8-4910-91df-c338d8874791
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9704195a-6fb8-4910-91df-c338d8874791
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
correlation: qa-71ab6d72-327b-4991-8431-8a11a802557f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71ab6d72-327b-4991-8431-8a11a802557f
Content-Type: application/json

--- request body ---
{"handle":"qa-c60db9974c85","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71ab6d72-327b-4991-8431-8a11a802557f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71ab6d72-327b-4991-8431-8a11a802557f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-13ad1035-c7c5-4030-a063-2dd31e5fa60a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13ad1035-c7c5-4030-a063-2dd31e5fa60a
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-13ad1035-c7c5-4030-a063-2dd31e5fa60a
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
correlation: qa-9b760595-5dc9-47a7-91df-19f86110e041

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b760595-5dc9-47a7-91df-19f86110e041
Content-Type: application/json

--- request body ---
{"handle":"qa-d2def5db42ee","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b760595-5dc9-47a7-91df-19f86110e041
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9b760595-5dc9-47a7-91df-19f86110e041"}
```
