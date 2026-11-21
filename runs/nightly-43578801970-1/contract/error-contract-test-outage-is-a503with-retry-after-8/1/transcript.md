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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-89511611-ae77-4574-a7e3-4522629fd711` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-d5fb3fca-fa67-44ef-9953-98298dce1366` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-4ce75163-2d7d-45f2-a155-80f056712f35` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-32b94152-00de-4e38-b39b-3c3225ffb8b3` |
| 5 | `GET /v1/conversations/{id}` | 503 | 13 | `qa-a298f915-79b0-421f-a308-91f48257e87f` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-a15dc32c-a410-4c41-ab9f-8e9dd7d795c7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-33a526a3-379a-4c44-86d3-840390e26ceb` |
| 8 | `POST /v1/auth/token` | 401 | 29 | `qa-9f868726-2756-4a48-8efe-8752869af5d9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-a379861d-2d8f-40ca-9746-1fceb6390f86` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-53bb9df8-3861-40b8-9c73-fe4fb908e50f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-89511611-ae77-4574-a7e3-4522629fd711

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89511611-ae77-4574-a7e3-4522629fd711
Content-Type: application/json

--- request body ---
{"handle":"qa-ee39e20187e2","displayName":"QA ee39e20187e2","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-89511611-ae77-4574-a7e3-4522629fd711
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Location: /v1/accounts/qa-ee39e20187e2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cf6b1e9e-d434-4da4-a8eb-e42f07d4cf75","handle":"qa-ee39e20187e2","displayName":"QA ee39e20187e2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.864344761Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d5fb3fca-fa67-44ef-9953-98298dce1366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5fb3fca-fa67-44ef-9953-98298dce1366
Content-Type: application/json

--- request body ---
{"handle":"qa-b48d3e191e83","displayName":"QA b48d3e191e83","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5fb3fca-fa67-44ef-9953-98298dce1366
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Location: /v1/accounts/qa-b48d3e191e83
X-Served-Region: eu
Content-Length: 181

{"id":"acc_576cf9e6-a596-4e95-b612-67d1da97cd42","handle":"qa-b48d3e191e83","displayName":"QA b48d3e191e83","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.929712316Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4ce75163-2d7d-45f2-a155-80f056712f35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ce75163-2d7d-45f2-a155-80f056712f35
Content-Type: application/json

--- request body ---
{"handle":"qa-ee39e20187e2","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ce75163-2d7d-45f2-a155-80f056712f35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cf6b1e9e-d434-4da4-a8eb-e42f07d4cf75"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-32b94152-00de-4e38-b39b-3c3225ffb8b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32b94152-00de-4e38-b39b-3c3225ffb8b3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b48d3e191e83","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-32b94152-00de-4e38-b39b-3c3225ffb8b3
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
Location: /v1/conversations/cnv_ee56ff75-160f-49f6-9831-0607811f4b00
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ee56ff75-160f-49f6-9831-0607811f4b00","subject":"Error contract","status":"open","region":"eu","participants":["qa-ee39e20187e2","qa-b48d3e191e83"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.007004653Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_ee56ff75-160f-49f6-9831-0607811f4b00
correlation: qa-a298f915-79b0-421f-a308-91f48257e87f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 987a082e-317d-4064-b212-5c7535174797
X-Correlation-Id: qa-a298f915-79b0-421f-a308-91f48257e87f
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a298f915-79b0-421f-a308-91f48257e87f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_ee56ff75-160f-49f6-9831-0607811f4b00","correlationId":"qa-a298f915-79b0-421f-a308-91f48257e87f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a15dc32c-a410-4c41-ab9f-8e9dd7d795c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a15dc32c-a410-4c41-ab9f-8e9dd7d795c7
Content-Type: application/json

--- request body ---
{"handle":"qa-b48d3e191e83","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-a15dc32c-a410-4c41-ab9f-8e9dd7d795c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_576cf9e6-a596-4e95-b612-67d1da97cd42"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-33a526a3-379a-4c44-86d3-840390e26ceb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33a526a3-379a-4c44-86d3-840390e26ceb
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-33a526a3-379a-4c44-86d3-840390e26ceb
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
correlation: qa-9f868726-2756-4a48-8efe-8752869af5d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f868726-2756-4a48-8efe-8752869af5d9
Content-Type: application/json

--- request body ---
{"handle":"qa-b48d3e191e83","password":"****"}

--- response: 401 in 29 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f868726-2756-4a48-8efe-8752869af5d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9f868726-2756-4a48-8efe-8752869af5d9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a379861d-2d8f-40ca-9746-1fceb6390f86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a379861d-2d8f-40ca-9746-1fceb6390f86
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a379861d-2d8f-40ca-9746-1fceb6390f86
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
correlation: qa-53bb9df8-3861-40b8-9c73-fe4fb908e50f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53bb9df8-3861-40b8-9c73-fe4fb908e50f
Content-Type: application/json

--- request body ---
{"handle":"qa-ee39e20187e2","password":"****"}

--- response: 401 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53bb9df8-3861-40b8-9c73-fe4fb908e50f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-53bb9df8-3861-40b8-9c73-fe4fb908e50f"}
```
