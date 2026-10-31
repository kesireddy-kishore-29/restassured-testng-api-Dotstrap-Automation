# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-12743fd6-abd0-4500-bed6-adaaf529287c` |
| 2 | `POST /v1/accounts` | 201 | 57 | `qa-f212ea82-3801-445d-a903-c2a063f87133` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-ebaabd09-20fd-4be0-b860-64e98659af33` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-abfd49ae-13e7-4049-9bde-73f6603e0c49` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 24 | `qa-a973acbf-9331-422a-8d64-903e1ed1e38d` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-0fa98179-b300-428f-a91d-c422849b7252` |
| 7 | `DELETE /v1/accounts/me` | 204 | 47 | `qa-532d0b2b-2717-4e48-9251-d367741e806f` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-1aa42267-dd84-4865-94bb-e45efe198739` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-e61c812c-389c-4552-aa53-7792106b3ac5` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-4b570eb2-1e56-4951-a83d-242fbeba8d16` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-12743fd6-abd0-4500-bed6-adaaf529287c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12743fd6-abd0-4500-bed6-adaaf529287c
Content-Type: application/json

--- request body ---
{"handle":"qa-2106d357313a","displayName":"QA 2106d357313a","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-12743fd6-abd0-4500-bed6-adaaf529287c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 7
Location: /v1/accounts/qa-2106d357313a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c13ae1a0-30a0-4a1e-92dc-a20dae4cfb50","handle":"qa-2106d357313a","displayName":"QA 2106d357313a","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.076782716Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f212ea82-3801-445d-a903-c2a063f87133

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f212ea82-3801-445d-a903-c2a063f87133
Content-Type: application/json

--- request body ---
{"handle":"qa-85fd44616d34","displayName":"QA 85fd44616d34","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f212ea82-3801-445d-a903-c2a063f87133
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 7
Location: /v1/accounts/qa-85fd44616d34
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2c977033-f58b-446f-a169-336243e29bcc","handle":"qa-85fd44616d34","displayName":"QA 85fd44616d34","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.205997558Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ebaabd09-20fd-4be0-b860-64e98659af33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebaabd09-20fd-4be0-b860-64e98659af33
Content-Type: application/json

--- request body ---
{"handle":"qa-2106d357313a","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebaabd09-20fd-4be0-b860-64e98659af33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c13ae1a0-30a0-4a1e-92dc-a20dae4cfb50"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-abfd49ae-13e7-4049-9bde-73f6603e0c49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abfd49ae-13e7-4049-9bde-73f6603e0c49
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-85fd44616d34","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-abfd49ae-13e7-4049-9bde-73f6603e0c49
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
Location: /v1/conversations/cnv_7354ea76-e429-4595-9b75-e79c525c5198
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7354ea76-e429-4595-9b75-e79c525c5198","subject":"Error contract","status":"open","region":"eu","participants":["qa-2106d357313a","qa-85fd44616d34"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:05.300617870Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_7354ea76-e429-4595-9b75-e79c525c5198/messages
correlation: qa-a973acbf-9331-422a-8d64-903e1ed1e38d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a973acbf-9331-422a-8d64-903e1ed1e38d
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 24 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a973acbf-9331-422a-8d64-903e1ed1e38d
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_7354ea76-e429-4595-9b75-e79c525c5198/messages","correlationId":"qa-a973acbf-9331-422a-8d64-903e1ed1e38d","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0fa98179-b300-428f-a91d-c422849b7252

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fa98179-b300-428f-a91d-c422849b7252
Content-Type: application/json

--- request body ---
{"handle":"qa-85fd44616d34","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fa98179-b300-428f-a91d-c422849b7252
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2c977033-f58b-446f-a169-336243e29bcc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-532d0b2b-2717-4e48-9251-d367741e806f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-532d0b2b-2717-4e48-9251-d367741e806f
Content-Type: application/json

--- response: 204 in 47 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-532d0b2b-2717-4e48-9251-d367741e806f
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
correlation: qa-1aa42267-dd84-4865-94bb-e45efe198739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1aa42267-dd84-4865-94bb-e45efe198739
Content-Type: application/json

--- request body ---
{"handle":"qa-85fd44616d34","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1aa42267-dd84-4865-94bb-e45efe198739
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1aa42267-dd84-4865-94bb-e45efe198739"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e61c812c-389c-4552-aa53-7792106b3ac5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e61c812c-389c-4552-aa53-7792106b3ac5
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e61c812c-389c-4552-aa53-7792106b3ac5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-4b570eb2-1e56-4951-a83d-242fbeba8d16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b570eb2-1e56-4951-a83d-242fbeba8d16
Content-Type: application/json

--- request body ---
{"handle":"qa-2106d357313a","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b570eb2-1e56-4951-a83d-242fbeba8d16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4b570eb2-1e56-4951-a83d-242fbeba8d16"}
```
