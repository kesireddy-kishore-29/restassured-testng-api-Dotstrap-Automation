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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-279c2485-d6cd-45f0-8aeb-868150465c16` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-0b2b9a64-60e5-4e9d-acda-5f252619a59e` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-50e9c7ab-c684-4c59-b076-4c62faebbc4d` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-ef32ed1e-10d6-4558-badf-b8d68fde73b9` |
| 5 | `GET /v1/conversations/{id}` | 503 | 23 | `qa-44da1fa6-de29-4186-8fae-521fd8e40a87` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-7d363095-c4fa-452e-8a29-e3a16809594a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-467fc637-23dd-4a7a-92d7-6a5d27b74884` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-0c49b57f-809e-40e1-a6d8-9b3b05dee95d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-3c89dee0-1255-4aeb-9bd3-a051b0b478c1` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-1271c842-1a9e-4892-b896-a687c4cb8a44` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-279c2485-d6cd-45f0-8aeb-868150465c16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-279c2485-d6cd-45f0-8aeb-868150465c16
Content-Type: application/json

--- request body ---
{"handle":"qa-03d52689c47e","displayName":"QA 03d52689c47e","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-279c2485-d6cd-45f0-8aeb-868150465c16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 7
Location: /v1/accounts/qa-03d52689c47e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b93f67e-ca39-4d2c-a0d1-5bcf7a338134","handle":"qa-03d52689c47e","displayName":"QA 03d52689c47e","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.127886864Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0b2b9a64-60e5-4e9d-acda-5f252619a59e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b2b9a64-60e5-4e9d-acda-5f252619a59e
Content-Type: application/json

--- request body ---
{"handle":"qa-fdeef9f41e60","displayName":"QA fdeef9f41e60","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b2b9a64-60e5-4e9d-acda-5f252619a59e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 7
Location: /v1/accounts/qa-fdeef9f41e60
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ac54077f-b72e-4f22-8ffb-181c69b0b00f","handle":"qa-fdeef9f41e60","displayName":"QA fdeef9f41e60","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.176178985Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-50e9c7ab-c684-4c59-b076-4c62faebbc4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50e9c7ab-c684-4c59-b076-4c62faebbc4d
Content-Type: application/json

--- request body ---
{"handle":"qa-03d52689c47e","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-50e9c7ab-c684-4c59-b076-4c62faebbc4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b93f67e-ca39-4d2c-a0d1-5bcf7a338134"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ef32ed1e-10d6-4558-badf-b8d68fde73b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef32ed1e-10d6-4558-badf-b8d68fde73b9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fdeef9f41e60","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef32ed1e-10d6-4558-badf-b8d68fde73b9
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
Location: /v1/conversations/cnv_8a44398f-f4d1-41c9-8f03-4c90f4c420ed
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8a44398f-f4d1-41c9-8f03-4c90f4c420ed","subject":"Error contract","status":"open","region":"eu","participants":["qa-03d52689c47e","qa-fdeef9f41e60"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.292366654Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_8a44398f-f4d1-41c9-8f03-4c90f4c420ed
correlation: qa-44da1fa6-de29-4186-8fae-521fd8e40a87

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 7e3bf943-0073-4c2d-8e38-2e00189352c4
X-Correlation-Id: qa-44da1fa6-de29-4186-8fae-521fd8e40a87
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44da1fa6-de29-4186-8fae-521fd8e40a87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_8a44398f-f4d1-41c9-8f03-4c90f4c420ed","correlationId":"qa-44da1fa6-de29-4186-8fae-521fd8e40a87"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7d363095-c4fa-452e-8a29-e3a16809594a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d363095-c4fa-452e-8a29-e3a16809594a
Content-Type: application/json

--- request body ---
{"handle":"qa-fdeef9f41e60","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d363095-c4fa-452e-8a29-e3a16809594a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ac54077f-b72e-4f22-8ffb-181c69b0b00f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-467fc637-23dd-4a7a-92d7-6a5d27b74884

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-467fc637-23dd-4a7a-92d7-6a5d27b74884
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-467fc637-23dd-4a7a-92d7-6a5d27b74884
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
correlation: qa-0c49b57f-809e-40e1-a6d8-9b3b05dee95d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c49b57f-809e-40e1-a6d8-9b3b05dee95d
Content-Type: application/json

--- request body ---
{"handle":"qa-fdeef9f41e60","password":"****"}

--- response: 401 in 30 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c49b57f-809e-40e1-a6d8-9b3b05dee95d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0c49b57f-809e-40e1-a6d8-9b3b05dee95d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3c89dee0-1255-4aeb-9bd3-a051b0b478c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c89dee0-1255-4aeb-9bd3-a051b0b478c1
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3c89dee0-1255-4aeb-9bd3-a051b0b478c1
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
correlation: qa-1271c842-1a9e-4892-b896-a687c4cb8a44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1271c842-1a9e-4892-b896-a687c4cb8a44
Content-Type: application/json

--- request body ---
{"handle":"qa-03d52689c47e","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1271c842-1a9e-4892-b896-a687c4cb8a44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1271c842-1a9e-4892-b896-a687c4cb8a44"}
```
