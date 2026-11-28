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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-5ac0c89d-86b8-43d9-ba85-12f3634aa203` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-dafdcca0-a9b1-42fb-be14-eb6cf800f6d3` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-5e04da17-ca64-40e7-b033-f38f32146328` |
| 4 | `POST /v1/conversations` | 201 | 33 | `qa-6167ba5e-10d2-4451-a4b7-39a1e77cf908` |
| 5 | `GET /v1/credits/ledger` | 503 | 30 | `qa-91f3208b-e641-42a2-a5c7-67e7819525da` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-375a0cb2-d547-4f8c-a5cd-9ca64b3a09e9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-e98ed11b-d7e8-489d-a30d-5a893b9fc5f1` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-81c36b52-9fe0-4f5f-a660-1573892c8835` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-f9693d96-b2fe-4295-9e57-9409b6ce74c2` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-74cd367f-d3bd-4d08-a8cf-667689b89c97` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5ac0c89d-86b8-43d9-ba85-12f3634aa203

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ac0c89d-86b8-43d9-ba85-12f3634aa203
Content-Type: application/json

--- request body ---
{"handle":"qa-0c502d50a4fc","displayName":"QA 0c502d50a4fc","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ac0c89d-86b8-43d9-ba85-12f3634aa203
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
Location: /v1/accounts/qa-0c502d50a4fc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bf42726c-126a-4b01-aa80-9120f51bdb5e","handle":"qa-0c502d50a4fc","displayName":"QA 0c502d50a4fc","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.467173423Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dafdcca0-a9b1-42fb-be14-eb6cf800f6d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dafdcca0-a9b1-42fb-be14-eb6cf800f6d3
Content-Type: application/json

--- request body ---
{"handle":"qa-3d88a2ef1d48","displayName":"QA 3d88a2ef1d48","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-dafdcca0-a9b1-42fb-be14-eb6cf800f6d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 7
Location: /v1/accounts/qa-3d88a2ef1d48
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5047f1ec-83db-42e4-b227-952db1ce3add","handle":"qa-3d88a2ef1d48","displayName":"QA 3d88a2ef1d48","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.500373576Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5e04da17-ca64-40e7-b033-f38f32146328

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e04da17-ca64-40e7-b033-f38f32146328
Content-Type: application/json

--- request body ---
{"handle":"qa-0c502d50a4fc","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e04da17-ca64-40e7-b033-f38f32146328
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bf42726c-126a-4b01-aa80-9120f51bdb5e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6167ba5e-10d2-4451-a4b7-39a1e77cf908

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6167ba5e-10d2-4451-a4b7-39a1e77cf908
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3d88a2ef1d48","subject":"Error contract","message":"Hi"}

--- response: 201 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6167ba5e-10d2-4451-a4b7-39a1e77cf908
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
Location: /v1/conversations/cnv_1648f79c-eb17-4b24-b99d-22c843fd5f67
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1648f79c-eb17-4b24-b99d-22c843fd5f67","subject":"Error contract","status":"open","region":"eu","participants":["qa-0c502d50a4fc","qa-3d88a2ef1d48"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.576132777Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-91f3208b-e641-42a2-a5c7-67e7819525da

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f74a5297-d617-454c-9807-a1ec1c636c4f
X-Correlation-Id: qa-91f3208b-e641-42a2-a5c7-67e7819525da
Content-Type: application/json

--- response: 503 in 30 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91f3208b-e641-42a2-a5c7-67e7819525da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-91f3208b-e641-42a2-a5c7-67e7819525da"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-375a0cb2-d547-4f8c-a5cd-9ca64b3a09e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-375a0cb2-d547-4f8c-a5cd-9ca64b3a09e9
Content-Type: application/json

--- request body ---
{"handle":"qa-3d88a2ef1d48","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-375a0cb2-d547-4f8c-a5cd-9ca64b3a09e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5047f1ec-83db-42e4-b227-952db1ce3add"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e98ed11b-d7e8-489d-a30d-5a893b9fc5f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e98ed11b-d7e8-489d-a30d-5a893b9fc5f1
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e98ed11b-d7e8-489d-a30d-5a893b9fc5f1
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
correlation: qa-81c36b52-9fe0-4f5f-a660-1573892c8835

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81c36b52-9fe0-4f5f-a660-1573892c8835
Content-Type: application/json

--- request body ---
{"handle":"qa-3d88a2ef1d48","password":"****"}

--- response: 401 in 21 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81c36b52-9fe0-4f5f-a660-1573892c8835
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-81c36b52-9fe0-4f5f-a660-1573892c8835"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f9693d96-b2fe-4295-9e57-9409b6ce74c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9693d96-b2fe-4295-9e57-9409b6ce74c2
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f9693d96-b2fe-4295-9e57-9409b6ce74c2
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
correlation: qa-74cd367f-d3bd-4d08-a8cf-667689b89c97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74cd367f-d3bd-4d08-a8cf-667689b89c97
Content-Type: application/json

--- request body ---
{"handle":"qa-0c502d50a4fc","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74cd367f-d3bd-4d08-a8cf-667689b89c97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-74cd367f-d3bd-4d08-a8cf-667689b89c97"}
```
