# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-eb80131d-3f66-4160-a698-dae27235070f` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-9f309859-a8a0-441b-884c-d9191e7cd6d5` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-9e0d4aec-042e-484d-9922-bc55a694ef6b` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-48074209-1599-46c7-be93-3716592f73ce` |
| 5 | `GET /v1/conversations/{id}` | 503 | 14 | `qa-20a46282-2883-4b4e-bff7-46bc2ac07c4b` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-84cbda9f-5e02-49ac-8cfe-69f58313f646` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-10a337c2-7f44-46b1-9e6b-b922e91ca6c3` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-1b517e06-7a29-42c2-8c94-daf84aa38007` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-44d02873-651b-46e6-be9b-d02b7cf10364` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-d0113909-510a-4726-a3fa-b2d0c821d7dd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eb80131d-3f66-4160-a698-dae27235070f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb80131d-3f66-4160-a698-dae27235070f
Content-Type: application/json

--- request body ---
{"handle":"qa-625c1058df3e","displayName":"QA 625c1058df3e","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb80131d-3f66-4160-a698-dae27235070f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Location: /v1/accounts/qa-625c1058df3e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88e346cc-0aee-4a5c-9b77-80a3e2668899","handle":"qa-625c1058df3e","displayName":"QA 625c1058df3e","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.798076937Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9f309859-a8a0-441b-884c-d9191e7cd6d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f309859-a8a0-441b-884c-d9191e7cd6d5
Content-Type: application/json

--- request body ---
{"handle":"qa-565e9fe87769","displayName":"QA 565e9fe87769","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f309859-a8a0-441b-884c-d9191e7cd6d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Location: /v1/accounts/qa-565e9fe87769
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d5279f42-a1f3-4c9d-9432-0c86ce628d08","handle":"qa-565e9fe87769","displayName":"QA 565e9fe87769","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.848355736Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9e0d4aec-042e-484d-9922-bc55a694ef6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e0d4aec-042e-484d-9922-bc55a694ef6b
Content-Type: application/json

--- request body ---
{"handle":"qa-625c1058df3e","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e0d4aec-042e-484d-9922-bc55a694ef6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_88e346cc-0aee-4a5c-9b77-80a3e2668899"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-48074209-1599-46c7-be93-3716592f73ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48074209-1599-46c7-be93-3716592f73ce
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-565e9fe87769","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-48074209-1599-46c7-be93-3716592f73ce
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
Location: /v1/conversations/cnv_a5df8534-42dc-472a-a8f0-e28d401d7047
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a5df8534-42dc-472a-a8f0-e28d401d7047","subject":"Error contract","status":"open","region":"eu","participants":["qa-625c1058df3e","qa-565e9fe87769"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.902990443Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_a5df8534-42dc-472a-a8f0-e28d401d7047
correlation: qa-20a46282-2883-4b4e-bff7-46bc2ac07c4b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 55cb4648-6533-45cc-9d88-fe2f68faf097
X-Correlation-Id: qa-20a46282-2883-4b4e-bff7-46bc2ac07c4b
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20a46282-2883-4b4e-bff7-46bc2ac07c4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_a5df8534-42dc-472a-a8f0-e28d401d7047","correlationId":"qa-20a46282-2883-4b4e-bff7-46bc2ac07c4b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-84cbda9f-5e02-49ac-8cfe-69f58313f646

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84cbda9f-5e02-49ac-8cfe-69f58313f646
Content-Type: application/json

--- request body ---
{"handle":"qa-565e9fe87769","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-84cbda9f-5e02-49ac-8cfe-69f58313f646
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d5279f42-a1f3-4c9d-9432-0c86ce628d08"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-10a337c2-7f44-46b1-9e6b-b922e91ca6c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10a337c2-7f44-46b1-9e6b-b922e91ca6c3
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-10a337c2-7f44-46b1-9e6b-b922e91ca6c3
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
correlation: qa-1b517e06-7a29-42c2-8c94-daf84aa38007

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b517e06-7a29-42c2-8c94-daf84aa38007
Content-Type: application/json

--- request body ---
{"handle":"qa-565e9fe87769","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b517e06-7a29-42c2-8c94-daf84aa38007
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1b517e06-7a29-42c2-8c94-daf84aa38007"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-44d02873-651b-46e6-be9b-d02b7cf10364

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44d02873-651b-46e6-be9b-d02b7cf10364
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-44d02873-651b-46e6-be9b-d02b7cf10364
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
correlation: qa-d0113909-510a-4726-a3fa-b2d0c821d7dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0113909-510a-4726-a3fa-b2d0c821d7dd
Content-Type: application/json

--- request body ---
{"handle":"qa-625c1058df3e","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0113909-510a-4726-a3fa-b2d0c821d7dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d0113909-510a-4726-a3fa-b2d0c821d7dd"}
```
