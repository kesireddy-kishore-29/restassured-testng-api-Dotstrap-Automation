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
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-17a12f39-bbbb-4d62-b53f-ebcec45faa29` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-5fd0fc0d-6991-4b9e-861b-2b6542e68f47` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-467c5873-767d-42ed-b54f-7a6e79af2af7` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-889f627b-680b-421b-a30a-3652d12698b2` |
| 5 | `GET /v1/conversations/{id}` | 503 | 11 | `qa-89fc81a4-9c7d-47b6-a812-a7225f85bede` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-611807c5-ae16-463c-ae26-8491f7149bf2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-371c9597-5890-4feb-9244-85a6d17f9a8f` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-9e102c75-9e56-4ce1-adac-735cdf9ddc07` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-36813120-a4cb-493a-94fa-1352c6695dcc` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-ccfcbc49-308e-4601-9454-80294790a04d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-17a12f39-bbbb-4d62-b53f-ebcec45faa29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17a12f39-bbbb-4d62-b53f-ebcec45faa29
Content-Type: application/json

--- request body ---
{"handle":"qa-be04298576f2","displayName":"QA be04298576f2","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-17a12f39-bbbb-4d62-b53f-ebcec45faa29
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Location: /v1/accounts/qa-be04298576f2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3be6aabe-ef54-4952-a844-be849e5d6a80","handle":"qa-be04298576f2","displayName":"QA be04298576f2","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.682261189Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5fd0fc0d-6991-4b9e-861b-2b6542e68f47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fd0fc0d-6991-4b9e-861b-2b6542e68f47
Content-Type: application/json

--- request body ---
{"handle":"qa-c7021b2b634e","displayName":"QA c7021b2b634e","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fd0fc0d-6991-4b9e-861b-2b6542e68f47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Location: /v1/accounts/qa-c7021b2b634e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_67900d6a-9e03-4043-8dbe-ac9305fd98c6","handle":"qa-c7021b2b634e","displayName":"QA c7021b2b634e","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.713546435Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-467c5873-767d-42ed-b54f-7a6e79af2af7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-467c5873-767d-42ed-b54f-7a6e79af2af7
Content-Type: application/json

--- request body ---
{"handle":"qa-be04298576f2","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-467c5873-767d-42ed-b54f-7a6e79af2af7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3be6aabe-ef54-4952-a844-be849e5d6a80"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-889f627b-680b-421b-a30a-3652d12698b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-889f627b-680b-421b-a30a-3652d12698b2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c7021b2b634e","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-889f627b-680b-421b-a30a-3652d12698b2
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
Location: /v1/conversations/cnv_3050a394-562f-48b0-bf5c-8bf97738166c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3050a394-562f-48b0-bf5c-8bf97738166c","subject":"Error contract","status":"open","region":"eu","participants":["qa-be04298576f2","qa-c7021b2b634e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.778682335Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_3050a394-562f-48b0-bf5c-8bf97738166c
correlation: qa-89fc81a4-9c7d-47b6-a812-a7225f85bede

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 03538c39-f9ee-42bf-99ff-c7deb0ff79ec
X-Correlation-Id: qa-89fc81a4-9c7d-47b6-a812-a7225f85bede
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89fc81a4-9c7d-47b6-a812-a7225f85bede
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_3050a394-562f-48b0-bf5c-8bf97738166c","correlationId":"qa-89fc81a4-9c7d-47b6-a812-a7225f85bede"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-611807c5-ae16-463c-ae26-8491f7149bf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-611807c5-ae16-463c-ae26-8491f7149bf2
Content-Type: application/json

--- request body ---
{"handle":"qa-c7021b2b634e","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-611807c5-ae16-463c-ae26-8491f7149bf2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_67900d6a-9e03-4043-8dbe-ac9305fd98c6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-371c9597-5890-4feb-9244-85a6d17f9a8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-371c9597-5890-4feb-9244-85a6d17f9a8f
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-371c9597-5890-4feb-9244-85a6d17f9a8f
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
correlation: qa-9e102c75-9e56-4ce1-adac-735cdf9ddc07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e102c75-9e56-4ce1-adac-735cdf9ddc07
Content-Type: application/json

--- request body ---
{"handle":"qa-c7021b2b634e","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e102c75-9e56-4ce1-adac-735cdf9ddc07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9e102c75-9e56-4ce1-adac-735cdf9ddc07"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-36813120-a4cb-493a-94fa-1352c6695dcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36813120-a4cb-493a-94fa-1352c6695dcc
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-36813120-a4cb-493a-94fa-1352c6695dcc
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
correlation: qa-ccfcbc49-308e-4601-9454-80294790a04d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccfcbc49-308e-4601-9454-80294790a04d
Content-Type: application/json

--- request body ---
{"handle":"qa-be04298576f2","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccfcbc49-308e-4601-9454-80294790a04d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ccfcbc49-308e-4601-9454-80294790a04d"}
```
