# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-8bc70951-6b37-441d-9349-0a1562b1ad45` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-50d80f20-6a3f-4e4f-95d7-48f91cf9177e` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-086946b3-11c0-47f3-8e8e-923bd373298c` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-72c674e8-c3d4-4452-9b13-5355f073e58d` |
| 5 | `GET /v1/credits/ledger` | 503 | 9 | `qa-cdfd16f3-e8e7-4945-8d26-0c54388d0ed5` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-881cce1f-f465-43c9-b8b9-7a3890f42e37` |
| 7 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-a2c3301c-2db4-49d9-9533-89bde9ce142a` |
| 8 | `POST /v1/auth/token` | 401 | 3 | `qa-be4dd123-e942-4ffe-af61-0379932c1210` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-ef5b493d-b5a0-49a6-aa70-7a9a23a9c2d1` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-8d80c7ac-fc2a-4f7c-a6b2-f9665e062cfb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8bc70951-6b37-441d-9349-0a1562b1ad45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bc70951-6b37-441d-9349-0a1562b1ad45
Content-Type: application/json

--- request body ---
{"handle":"qa-2eab46faa803","displayName":"QA 2eab46faa803","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bc70951-6b37-441d-9349-0a1562b1ad45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 7
Location: /v1/accounts/qa-2eab46faa803
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b2a9aa22-513f-4fc8-9fdb-aec80928d4c8","handle":"qa-2eab46faa803","displayName":"QA 2eab46faa803","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.440524895Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-50d80f20-6a3f-4e4f-95d7-48f91cf9177e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50d80f20-6a3f-4e4f-95d7-48f91cf9177e
Content-Type: application/json

--- request body ---
{"handle":"qa-c883df68f156","displayName":"QA c883df68f156","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-50d80f20-6a3f-4e4f-95d7-48f91cf9177e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 7
Location: /v1/accounts/qa-c883df68f156
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f8926007-f5d2-404b-b87f-e65764d9162a","handle":"qa-c883df68f156","displayName":"QA c883df68f156","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.479294402Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-086946b3-11c0-47f3-8e8e-923bd373298c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-086946b3-11c0-47f3-8e8e-923bd373298c
Content-Type: application/json

--- request body ---
{"handle":"qa-2eab46faa803","password":"****"}

--- response: 200 in 46 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-086946b3-11c0-47f3-8e8e-923bd373298c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b2a9aa22-513f-4fc8-9fdb-aec80928d4c8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-72c674e8-c3d4-4452-9b13-5355f073e58d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72c674e8-c3d4-4452-9b13-5355f073e58d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c883df68f156","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-72c674e8-c3d4-4452-9b13-5355f073e58d
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
Location: /v1/conversations/cnv_f50225a8-27a3-44eb-8e68-b717db6d1cf4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f50225a8-27a3-44eb-8e68-b717db6d1cf4","subject":"Error contract","status":"open","region":"eu","participants":["qa-2eab46faa803","qa-c883df68f156"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.556411230Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-cdfd16f3-e8e7-4945-8d26-0c54388d0ed5

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b0ecf0fe-9bbc-4ccb-856c-4d25eff9ece0
X-Correlation-Id: qa-cdfd16f3-e8e7-4945-8d26-0c54388d0ed5
Content-Type: application/json

--- response: 503 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cdfd16f3-e8e7-4945-8d26-0c54388d0ed5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-cdfd16f3-e8e7-4945-8d26-0c54388d0ed5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-881cce1f-f465-43c9-b8b9-7a3890f42e37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-881cce1f-f465-43c9-b8b9-7a3890f42e37
Content-Type: application/json

--- request body ---
{"handle":"qa-c883df68f156","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-881cce1f-f465-43c9-b8b9-7a3890f42e37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f8926007-f5d2-404b-b87f-e65764d9162a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a2c3301c-2db4-49d9-9533-89bde9ce142a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2c3301c-2db4-49d9-9533-89bde9ce142a
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a2c3301c-2db4-49d9-9533-89bde9ce142a
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
correlation: qa-be4dd123-e942-4ffe-af61-0379932c1210

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be4dd123-e942-4ffe-af61-0379932c1210
Content-Type: application/json

--- request body ---
{"handle":"qa-c883df68f156","password":"****"}

--- response: 401 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be4dd123-e942-4ffe-af61-0379932c1210
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-be4dd123-e942-4ffe-af61-0379932c1210"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef5b493d-b5a0-49a6-aa70-7a9a23a9c2d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef5b493d-b5a0-49a6-aa70-7a9a23a9c2d1
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef5b493d-b5a0-49a6-aa70-7a9a23a9c2d1
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
correlation: qa-8d80c7ac-fc2a-4f7c-a6b2-f9665e062cfb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d80c7ac-fc2a-4f7c-a6b2-f9665e062cfb
Content-Type: application/json

--- request body ---
{"handle":"qa-2eab46faa803","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d80c7ac-fc2a-4f7c-a6b2-f9665e062cfb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8d80c7ac-fc2a-4f7c-a6b2-f9665e062cfb"}
```
