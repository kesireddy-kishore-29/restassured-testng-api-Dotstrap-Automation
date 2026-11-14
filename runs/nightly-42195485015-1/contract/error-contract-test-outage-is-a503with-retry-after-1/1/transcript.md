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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-d653c83a-bde6-4399-a0ed-4ec6a73eded9` |
| 2 | `POST /v1/accounts` | 201 | 50 | `qa-107352f8-9cef-47b7-b22b-2b372415612f` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-7e9e650c-ed32-4abb-acbc-436934859231` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-f3881a2d-d609-40f3-984c-32ae58b592db` |
| 5 | `POST /v1/accounts` | 503 | 18 | `qa-3983448e-54bd-424e-910d-0f41a1e1cde0` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-01f92eb0-bb5a-4998-879c-d58166188983` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-7235a74e-43a4-463f-837a-df6cb1be9155` |
| 8 | `POST /v1/auth/token` | 401 | 79 | `qa-f9fdfa9c-441f-46f3-acdb-5d492f53ad31` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-ff53c159-183d-42e1-8d94-3f91c895a785` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-065dd7c1-8546-43e0-bde0-0f2f67df1514` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d653c83a-bde6-4399-a0ed-4ec6a73eded9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d653c83a-bde6-4399-a0ed-4ec6a73eded9
Content-Type: application/json

--- request body ---
{"handle":"qa-8d6eff371369","displayName":"QA 8d6eff371369","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d653c83a-bde6-4399-a0ed-4ec6a73eded9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Location: /v1/accounts/qa-8d6eff371369
X-Served-Region: eu
Content-Length: 181

{"id":"acc_38883cc7-5739-4d10-81d2-2a4080623589","handle":"qa-8d6eff371369","displayName":"QA 8d6eff371369","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.197616791Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-107352f8-9cef-47b7-b22b-2b372415612f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-107352f8-9cef-47b7-b22b-2b372415612f
Content-Type: application/json

--- request body ---
{"handle":"qa-9dcfe228ae8c","displayName":"QA 9dcfe228ae8c","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-107352f8-9cef-47b7-b22b-2b372415612f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Location: /v1/accounts/qa-9dcfe228ae8c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0bb6a7e2-ae85-43e5-9387-0106130207b1","handle":"qa-9dcfe228ae8c","displayName":"QA 9dcfe228ae8c","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.281789202Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7e9e650c-ed32-4abb-acbc-436934859231

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e9e650c-ed32-4abb-acbc-436934859231
Content-Type: application/json

--- request body ---
{"handle":"qa-8d6eff371369","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e9e650c-ed32-4abb-acbc-436934859231
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_38883cc7-5739-4d10-81d2-2a4080623589"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f3881a2d-d609-40f3-984c-32ae58b592db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3881a2d-d609-40f3-984c-32ae58b592db
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9dcfe228ae8c","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3881a2d-d609-40f3-984c-32ae58b592db
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
Location: /v1/conversations/cnv_fd718aad-4d6a-400a-ad52-4cad5beb1d70
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fd718aad-4d6a-400a-ad52-4cad5beb1d70","subject":"Error contract","status":"open","region":"eu","participants":["qa-8d6eff371369","qa-9dcfe228ae8c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.391043896Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-3983448e-54bd-424e-910d-0f41a1e1cde0

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 91ca2104-7a52-4c68-b733-4783cfa76c47
X-Correlation-Id: qa-3983448e-54bd-424e-910d-0f41a1e1cde0
Content-Type: application/json

--- request body ---
{"handle":"qa-1ae397e3cde5","displayName":"QA 1ae397e3cde5","password":"****","region":"eu"}

--- response: 503 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3983448e-54bd-424e-910d-0f41a1e1cde0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-3983448e-54bd-424e-910d-0f41a1e1cde0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-01f92eb0-bb5a-4998-879c-d58166188983

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01f92eb0-bb5a-4998-879c-d58166188983
Content-Type: application/json

--- request body ---
{"handle":"qa-9dcfe228ae8c","password":"****"}

--- response: 200 in 57 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-01f92eb0-bb5a-4998-879c-d58166188983
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bb6a7e2-ae85-43e5-9387-0106130207b1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7235a74e-43a4-463f-837a-df6cb1be9155

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7235a74e-43a4-463f-837a-df6cb1be9155
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7235a74e-43a4-463f-837a-df6cb1be9155
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
correlation: qa-f9fdfa9c-441f-46f3-acdb-5d492f53ad31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9fdfa9c-441f-46f3-acdb-5d492f53ad31
Content-Type: application/json

--- request body ---
{"handle":"qa-9dcfe228ae8c","password":"****"}

--- response: 401 in 79 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9fdfa9c-441f-46f3-acdb-5d492f53ad31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f9fdfa9c-441f-46f3-acdb-5d492f53ad31"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff53c159-183d-42e1-8d94-3f91c895a785

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff53c159-183d-42e1-8d94-3f91c895a785
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff53c159-183d-42e1-8d94-3f91c895a785
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
correlation: qa-065dd7c1-8546-43e0-bde0-0f2f67df1514

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-065dd7c1-8546-43e0-bde0-0f2f67df1514
Content-Type: application/json

--- request body ---
{"handle":"qa-8d6eff371369","password":"****"}

--- response: 401 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-065dd7c1-8546-43e0-bde0-0f2f67df1514
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-065dd7c1-8546-43e0-bde0-0f2f67df1514"}
```
