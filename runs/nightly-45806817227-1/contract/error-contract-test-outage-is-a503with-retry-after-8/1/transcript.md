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
| 1 | `POST /v1/accounts` | 201 | 55 | `qa-1f24d910-c969-4566-a435-94fc404b0a64` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-43ec55f8-aa7c-4efa-b4ba-798e18323db1` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-59ba28f8-3bdd-4084-9a94-8af32073e230` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-f5c9631c-5e0a-493a-a4e8-bcb9c4fe41d8` |
| 5 | `GET /v1/conversations/{id}` | 503 | 21 | `qa-573a88f5-c734-4007-a568-6aea3aff40b5` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-dfdf82cf-a1a4-4d5f-b477-8088331bd078` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-fb5ada84-9430-44bc-9035-9a509e7d6644` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-7ac62f50-f321-401c-984a-813cc28f48c4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-842c17b7-f96b-47ca-b561-a49c282a4c3e` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-22db907d-0446-4ebd-a2c4-77716d02abda` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1f24d910-c969-4566-a435-94fc404b0a64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f24d910-c969-4566-a435-94fc404b0a64
Content-Type: application/json

--- request body ---
{"handle":"qa-67dd2a2269b5","displayName":"QA 67dd2a2269b5","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f24d910-c969-4566-a435-94fc404b0a64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 7
Location: /v1/accounts/qa-67dd2a2269b5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d45e226-b924-4934-aac3-5af644563c34","handle":"qa-67dd2a2269b5","displayName":"QA 67dd2a2269b5","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.849798002Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-43ec55f8-aa7c-4efa-b4ba-798e18323db1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43ec55f8-aa7c-4efa-b4ba-798e18323db1
Content-Type: application/json

--- request body ---
{"handle":"qa-4195307bf66a","displayName":"QA 4195307bf66a","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-43ec55f8-aa7c-4efa-b4ba-798e18323db1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 7
Location: /v1/accounts/qa-4195307bf66a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_699832fe-4355-49d0-aa7f-9d4e157a3324","handle":"qa-4195307bf66a","displayName":"QA 4195307bf66a","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.908782270Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-59ba28f8-3bdd-4084-9a94-8af32073e230

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59ba28f8-3bdd-4084-9a94-8af32073e230
Content-Type: application/json

--- request body ---
{"handle":"qa-67dd2a2269b5","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-59ba28f8-3bdd-4084-9a94-8af32073e230
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d45e226-b924-4934-aac3-5af644563c34"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f5c9631c-5e0a-493a-a4e8-bcb9c4fe41d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5c9631c-5e0a-493a-a4e8-bcb9c4fe41d8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4195307bf66a","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5c9631c-5e0a-493a-a4e8-bcb9c4fe41d8
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
Location: /v1/conversations/cnv_673d0720-c466-4dba-a5ba-660cbf9f45f7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_673d0720-c466-4dba-a5ba-660cbf9f45f7","subject":"Error contract","status":"open","region":"eu","participants":["qa-67dd2a2269b5","qa-4195307bf66a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:46.003700355Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_673d0720-c466-4dba-a5ba-660cbf9f45f7
correlation: qa-573a88f5-c734-4007-a568-6aea3aff40b5

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 337a07d9-1af0-4fe2-9037-b3863355557d
X-Correlation-Id: qa-573a88f5-c734-4007-a568-6aea3aff40b5
Content-Type: application/json

--- response: 503 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-573a88f5-c734-4007-a568-6aea3aff40b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_673d0720-c466-4dba-a5ba-660cbf9f45f7","correlationId":"qa-573a88f5-c734-4007-a568-6aea3aff40b5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dfdf82cf-a1a4-4d5f-b477-8088331bd078

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfdf82cf-a1a4-4d5f-b477-8088331bd078
Content-Type: application/json

--- request body ---
{"handle":"qa-4195307bf66a","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfdf82cf-a1a4-4d5f-b477-8088331bd078
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_699832fe-4355-49d0-aa7f-9d4e157a3324"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fb5ada84-9430-44bc-9035-9a509e7d6644

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb5ada84-9430-44bc-9035-9a509e7d6644
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fb5ada84-9430-44bc-9035-9a509e7d6644
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
correlation: qa-7ac62f50-f321-401c-984a-813cc28f48c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ac62f50-f321-401c-984a-813cc28f48c4
Content-Type: application/json

--- request body ---
{"handle":"qa-4195307bf66a","password":"****"}

--- response: 401 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ac62f50-f321-401c-984a-813cc28f48c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7ac62f50-f321-401c-984a-813cc28f48c4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-842c17b7-f96b-47ca-b561-a49c282a4c3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-842c17b7-f96b-47ca-b561-a49c282a4c3e
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-842c17b7-f96b-47ca-b561-a49c282a4c3e
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
correlation: qa-22db907d-0446-4ebd-a2c4-77716d02abda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22db907d-0446-4ebd-a2c4-77716d02abda
Content-Type: application/json

--- request body ---
{"handle":"qa-67dd2a2269b5","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22db907d-0446-4ebd-a2c4-77716d02abda
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22db907d-0446-4ebd-a2c4-77716d02abda"}
```
