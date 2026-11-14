# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-6728dfda-c426-46af-91fc-3442c06d8a36` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-122f8cbb-a2b3-482a-b7f1-aced0732e446` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-88bc97ee-d438-46a5-afa0-ba35f4b5c88b` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-cad32699-c58b-4aaf-a049-76e1ed9baada` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 49 | `qa-6c94f45b-fe5e-4962-bd05-79a4c34c4fac` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-66691b3e-36d4-4ad2-a6d2-22f2084ff322` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-f7f9863d-3502-47d3-9f0e-7743738ff32b` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-ad34cd8c-b0a6-4413-ba20-dd1fd364bd5d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-944aa24a-4adc-400a-b2a0-170981e8f2d3` |
| 10 | `POST /v1/auth/token` | 401 | 47 | `qa-db2ebb02-5b63-4e08-b96e-59d5888220f7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6728dfda-c426-46af-91fc-3442c06d8a36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6728dfda-c426-46af-91fc-3442c06d8a36
Content-Type: application/json

--- request body ---
{"handle":"qa-983196cb7e08","displayName":"QA 983196cb7e08","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-6728dfda-c426-46af-91fc-3442c06d8a36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 7
Location: /v1/accounts/qa-983196cb7e08
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e2793d19-ab1d-4936-8bee-fd0abb8e097f","handle":"qa-983196cb7e08","displayName":"QA 983196cb7e08","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.366367714Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-122f8cbb-a2b3-482a-b7f1-aced0732e446

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-122f8cbb-a2b3-482a-b7f1-aced0732e446
Content-Type: application/json

--- request body ---
{"handle":"qa-927dd4b3445a","displayName":"QA 927dd4b3445a","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-122f8cbb-a2b3-482a-b7f1-aced0732e446
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 7
Location: /v1/accounts/qa-927dd4b3445a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5399c365-48f7-44eb-b684-492ddf47fc8c","handle":"qa-927dd4b3445a","displayName":"QA 927dd4b3445a","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.436019663Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-88bc97ee-d438-46a5-afa0-ba35f4b5c88b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88bc97ee-d438-46a5-afa0-ba35f4b5c88b
Content-Type: application/json

--- request body ---
{"handle":"qa-983196cb7e08","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-88bc97ee-d438-46a5-afa0-ba35f4b5c88b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e2793d19-ab1d-4936-8bee-fd0abb8e097f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cad32699-c58b-4aaf-a049-76e1ed9baada

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cad32699-c58b-4aaf-a049-76e1ed9baada
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-927dd4b3445a","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-cad32699-c58b-4aaf-a049-76e1ed9baada
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
Location: /v1/conversations/cnv_64af16d4-92d1-4861-98a1-e9cd146102b0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_64af16d4-92d1-4861-98a1-e9cd146102b0","subject":"Error contract","status":"open","region":"eu","participants":["qa-983196cb7e08","qa-927dd4b3445a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.507706288Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_64af16d4-92d1-4861-98a1-e9cd146102b0/close
correlation: qa-6c94f45b-fe5e-4962-bd05-79a4c34c4fac

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b8879adc-15fb-4eb7-a021-57e1bc8323c1
X-Correlation-Id: qa-6c94f45b-fe5e-4962-bd05-79a4c34c4fac
Content-Type: application/json

--- response: 503 in 49 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c94f45b-fe5e-4962-bd05-79a4c34c4fac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_64af16d4-92d1-4861-98a1-e9cd146102b0/close","correlationId":"qa-6c94f45b-fe5e-4962-bd05-79a4c34c4fac"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-66691b3e-36d4-4ad2-a6d2-22f2084ff322

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66691b3e-36d4-4ad2-a6d2-22f2084ff322
Content-Type: application/json

--- request body ---
{"handle":"qa-927dd4b3445a","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-66691b3e-36d4-4ad2-a6d2-22f2084ff322
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5399c365-48f7-44eb-b684-492ddf47fc8c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f7f9863d-3502-47d3-9f0e-7743738ff32b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7f9863d-3502-47d3-9f0e-7743738ff32b
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f7f9863d-3502-47d3-9f0e-7743738ff32b
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
correlation: qa-ad34cd8c-b0a6-4413-ba20-dd1fd364bd5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad34cd8c-b0a6-4413-ba20-dd1fd364bd5d
Content-Type: application/json

--- request body ---
{"handle":"qa-927dd4b3445a","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad34cd8c-b0a6-4413-ba20-dd1fd364bd5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad34cd8c-b0a6-4413-ba20-dd1fd364bd5d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-944aa24a-4adc-400a-b2a0-170981e8f2d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-944aa24a-4adc-400a-b2a0-170981e8f2d3
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-944aa24a-4adc-400a-b2a0-170981e8f2d3
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
correlation: qa-db2ebb02-5b63-4e08-b96e-59d5888220f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db2ebb02-5b63-4e08-b96e-59d5888220f7
Content-Type: application/json

--- request body ---
{"handle":"qa-983196cb7e08","password":"****"}

--- response: 401 in 47 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db2ebb02-5b63-4e08-b96e-59d5888220f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db2ebb02-5b63-4e08-b96e-59d5888220f7"}
```
