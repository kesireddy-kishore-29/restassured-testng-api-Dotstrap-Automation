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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-d75c6f3e-a298-4520-8c8f-762ac153d1ad` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-909c8fab-8d7b-4619-bb1f-74961ed5de63` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-065509bb-970a-49b3-a20a-0a93d5797577` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-ceea4475-3d02-4cc1-ac93-77c23b913569` |
| 5 | `PATCH /v1/accounts/me` | 503 | 13 | `qa-1593c024-3ece-409f-91c3-2a9ff5a26b62` |
| 6 | `POST /v1/auth/token` | 200 | 48 | `qa-c7b12693-1819-4037-8a80-e8b0631c6a00` |
| 7 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-de91f456-ad14-421c-8ff6-9798ae1c6c23` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-c35047d7-ee3c-420c-bb6d-b9308d1bb998` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-99973bc5-2f6c-4830-8f94-cadeb7d0fc9c` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-a4e7d4c2-6d40-4bb3-b136-f16a3e992a3f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d75c6f3e-a298-4520-8c8f-762ac153d1ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d75c6f3e-a298-4520-8c8f-762ac153d1ad
Content-Type: application/json

--- request body ---
{"handle":"qa-c1eaa18a7e7a","displayName":"QA c1eaa18a7e7a","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d75c6f3e-a298-4520-8c8f-762ac153d1ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Location: /v1/accounts/qa-c1eaa18a7e7a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_571d2eaf-85cd-46ee-8644-50786eab24fa","handle":"qa-c1eaa18a7e7a","displayName":"QA c1eaa18a7e7a","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.904079800Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-909c8fab-8d7b-4619-bb1f-74961ed5de63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-909c8fab-8d7b-4619-bb1f-74961ed5de63
Content-Type: application/json

--- request body ---
{"handle":"qa-751933b71a0e","displayName":"QA 751933b71a0e","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-909c8fab-8d7b-4619-bb1f-74961ed5de63
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
Location: /v1/accounts/qa-751933b71a0e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_777aa214-b028-49af-8a1d-03ae7d36b8fd","handle":"qa-751933b71a0e","displayName":"QA 751933b71a0e","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.934561641Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-065509bb-970a-49b3-a20a-0a93d5797577

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-065509bb-970a-49b3-a20a-0a93d5797577
Content-Type: application/json

--- request body ---
{"handle":"qa-c1eaa18a7e7a","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-065509bb-970a-49b3-a20a-0a93d5797577
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_571d2eaf-85cd-46ee-8644-50786eab24fa"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ceea4475-3d02-4cc1-ac93-77c23b913569

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ceea4475-3d02-4cc1-ac93-77c23b913569
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-751933b71a0e","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ceea4475-3d02-4cc1-ac93-77c23b913569
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
Location: /v1/conversations/cnv_53f16d89-1b2d-4ac8-8869-41aca28e94d7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_53f16d89-1b2d-4ac8-8869-41aca28e94d7","subject":"Error contract","status":"open","region":"eu","participants":["qa-c1eaa18a7e7a","qa-751933b71a0e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:52.020195385Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-1593c024-3ece-409f-91c3-2a9ff5a26b62

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: ff4e2af6-95b3-4a6d-bc74-08a6fdbda216
X-Correlation-Id: qa-1593c024-3ece-409f-91c3-2a9ff5a26b62
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1593c024-3ece-409f-91c3-2a9ff5a26b62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-1593c024-3ece-409f-91c3-2a9ff5a26b62"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c7b12693-1819-4037-8a80-e8b0631c6a00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7b12693-1819-4037-8a80-e8b0631c6a00
Content-Type: application/json

--- request body ---
{"handle":"qa-751933b71a0e","password":"****"}

--- response: 200 in 48 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7b12693-1819-4037-8a80-e8b0631c6a00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_777aa214-b028-49af-8a1d-03ae7d36b8fd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-de91f456-ad14-421c-8ff6-9798ae1c6c23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de91f456-ad14-421c-8ff6-9798ae1c6c23
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-de91f456-ad14-421c-8ff6-9798ae1c6c23
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
correlation: qa-c35047d7-ee3c-420c-bb6d-b9308d1bb998

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c35047d7-ee3c-420c-bb6d-b9308d1bb998
Content-Type: application/json

--- request body ---
{"handle":"qa-751933b71a0e","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c35047d7-ee3c-420c-bb6d-b9308d1bb998
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c35047d7-ee3c-420c-bb6d-b9308d1bb998"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-99973bc5-2f6c-4830-8f94-cadeb7d0fc9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99973bc5-2f6c-4830-8f94-cadeb7d0fc9c
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-99973bc5-2f6c-4830-8f94-cadeb7d0fc9c
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
correlation: qa-a4e7d4c2-6d40-4bb3-b136-f16a3e992a3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4e7d4c2-6d40-4bb3-b136-f16a3e992a3f
Content-Type: application/json

--- request body ---
{"handle":"qa-c1eaa18a7e7a","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4e7d4c2-6d40-4bb3-b136-f16a3e992a3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4e7d4c2-6d40-4bb3-b136-f16a3e992a3f"}
```
