# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-2caf6648-26d9-4068-baa3-eaf14c7222d3` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-7231a655-19ee-4164-9244-03385c1dff94` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-b991e34d-bf8f-4264-a507-d2a4d149f687` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-fcde6a45-9410-4620-9f25-b9846753a6a4` |
| 5 | `PATCH /v1/accounts/me` | 503 | 42 | `qa-d7e37c28-f48c-462d-9fb4-cd65dc0ad395` |
| 6 | `POST /v1/auth/token` | 200 | 56 | `qa-863a24e8-7517-4f97-856b-5f97283ca184` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-38142cb4-2d96-4b25-9d47-8c0d2fa7f609` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-2eff654d-7c74-4120-9e96-848fecc55e03` |
| 9 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-a08e8a87-7638-42c3-828b-2a4c33a6194a` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-10c6a908-bc48-432e-8c81-fd7dd435def0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2caf6648-26d9-4068-baa3-eaf14c7222d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2caf6648-26d9-4068-baa3-eaf14c7222d3
Content-Type: application/json

--- request body ---
{"handle":"qa-31b3de747fbc","displayName":"QA 31b3de747fbc","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2caf6648-26d9-4068-baa3-eaf14c7222d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Location: /v1/accounts/qa-31b3de747fbc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3779d711-039f-4e34-84b0-3911196b6461","handle":"qa-31b3de747fbc","displayName":"QA 31b3de747fbc","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.154612463Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7231a655-19ee-4164-9244-03385c1dff94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7231a655-19ee-4164-9244-03385c1dff94
Content-Type: application/json

--- request body ---
{"handle":"qa-ccb427ae79d2","displayName":"QA ccb427ae79d2","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7231a655-19ee-4164-9244-03385c1dff94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Location: /v1/accounts/qa-ccb427ae79d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_edd8a922-58f9-43f2-8166-7a4ff15d7f54","handle":"qa-ccb427ae79d2","displayName":"QA ccb427ae79d2","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.216421846Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b991e34d-bf8f-4264-a507-d2a4d149f687

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b991e34d-bf8f-4264-a507-d2a4d149f687
Content-Type: application/json

--- request body ---
{"handle":"qa-31b3de747fbc","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-b991e34d-bf8f-4264-a507-d2a4d149f687
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3779d711-039f-4e34-84b0-3911196b6461"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fcde6a45-9410-4620-9f25-b9846753a6a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcde6a45-9410-4620-9f25-b9846753a6a4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ccb427ae79d2","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcde6a45-9410-4620-9f25-b9846753a6a4
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
Location: /v1/conversations/cnv_b920f07e-8b0d-46d3-8f4e-e218565110c7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b920f07e-8b0d-46d3-8f4e-e218565110c7","subject":"Error contract","status":"open","region":"eu","participants":["qa-31b3de747fbc","qa-ccb427ae79d2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.313766946Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d7e37c28-f48c-462d-9fb4-cd65dc0ad395

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 49d0a47f-b3f9-4eae-b222-4c5b6f947a2e
X-Correlation-Id: qa-d7e37c28-f48c-462d-9fb4-cd65dc0ad395
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 42 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7e37c28-f48c-462d-9fb4-cd65dc0ad395
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-d7e37c28-f48c-462d-9fb4-cd65dc0ad395"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-863a24e8-7517-4f97-856b-5f97283ca184

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-863a24e8-7517-4f97-856b-5f97283ca184
Content-Type: application/json

--- request body ---
{"handle":"qa-ccb427ae79d2","password":"****"}

--- response: 200 in 56 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-863a24e8-7517-4f97-856b-5f97283ca184
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_edd8a922-58f9-43f2-8166-7a4ff15d7f54"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-38142cb4-2d96-4b25-9d47-8c0d2fa7f609

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38142cb4-2d96-4b25-9d47-8c0d2fa7f609
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-38142cb4-2d96-4b25-9d47-8c0d2fa7f609
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
correlation: qa-2eff654d-7c74-4120-9e96-848fecc55e03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2eff654d-7c74-4120-9e96-848fecc55e03
Content-Type: application/json

--- request body ---
{"handle":"qa-ccb427ae79d2","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2eff654d-7c74-4120-9e96-848fecc55e03
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2eff654d-7c74-4120-9e96-848fecc55e03"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a08e8a87-7638-42c3-828b-2a4c33a6194a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a08e8a87-7638-42c3-828b-2a4c33a6194a
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a08e8a87-7638-42c3-828b-2a4c33a6194a
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
correlation: qa-10c6a908-bc48-432e-8c81-fd7dd435def0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10c6a908-bc48-432e-8c81-fd7dd435def0
Content-Type: application/json

--- request body ---
{"handle":"qa-31b3de747fbc","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10c6a908-bc48-432e-8c81-fd7dd435def0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-10c6a908-bc48-432e-8c81-fd7dd435def0"}
```
