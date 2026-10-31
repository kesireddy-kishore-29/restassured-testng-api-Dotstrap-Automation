# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-c52a0d73-6793-4faa-8970-315649ffc9c1` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-da1470df-6031-4943-b118-97f8aa308ab1` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-ec2d56a9-a4b2-4a62-a1ba-b90dd6849575` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-1315ddfe-e4c5-4be5-bcc7-f8608409825c` |
| 5 | `GET /v1/admin/stats` | 503 | 11 | `qa-76fc5c3a-497d-422a-af2e-b7bb10f3716a` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-a4d74869-ae4a-49a9-8ebc-e7ef45ddd941` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-c5695722-b32f-4d9a-b88e-f1064703574d` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-9f20dfd1-4e45-44d4-84f3-1f8a21067f62` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-5723747e-b643-4cc0-a77d-7d028d22f3f9` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-a1c268bd-bbb6-4a62-aea4-668c3e7c809f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c52a0d73-6793-4faa-8970-315649ffc9c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c52a0d73-6793-4faa-8970-315649ffc9c1
Content-Type: application/json

--- request body ---
{"handle":"qa-0ecab8774112","displayName":"QA 0ecab8774112","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c52a0d73-6793-4faa-8970-315649ffc9c1
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
Location: /v1/accounts/qa-0ecab8774112
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c0214615-c157-4311-ae83-c8cf99ff5a18","handle":"qa-0ecab8774112","displayName":"QA 0ecab8774112","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.963979744Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-da1470df-6031-4943-b118-97f8aa308ab1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da1470df-6031-4943-b118-97f8aa308ab1
Content-Type: application/json

--- request body ---
{"handle":"qa-604107ba52f8","displayName":"QA 604107ba52f8","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-da1470df-6031-4943-b118-97f8aa308ab1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 7
Location: /v1/accounts/qa-604107ba52f8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4693d0d8-86c0-4df2-a04c-fc4b95746392","handle":"qa-604107ba52f8","displayName":"QA 604107ba52f8","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.982097194Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ec2d56a9-a4b2-4a62-a1ba-b90dd6849575

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec2d56a9-a4b2-4a62-a1ba-b90dd6849575
Content-Type: application/json

--- request body ---
{"handle":"qa-0ecab8774112","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec2d56a9-a4b2-4a62-a1ba-b90dd6849575
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c0214615-c157-4311-ae83-c8cf99ff5a18"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1315ddfe-e4c5-4be5-bcc7-f8608409825c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1315ddfe-e4c5-4be5-bcc7-f8608409825c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-604107ba52f8","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1315ddfe-e4c5-4be5-bcc7-f8608409825c
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
Location: /v1/conversations/cnv_46a9d97a-cf3d-4826-a015-b276e3f4e239
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_46a9d97a-cf3d-4826-a015-b276e3f4e239","subject":"Error contract","status":"open","region":"eu","participants":["qa-0ecab8774112","qa-604107ba52f8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:04.053645417Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-76fc5c3a-497d-422a-af2e-b7bb10f3716a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 73ba01ee-f245-42f7-afdf-323540c33d3e
X-Correlation-Id: qa-76fc5c3a-497d-422a-af2e-b7bb10f3716a
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76fc5c3a-497d-422a-af2e-b7bb10f3716a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-76fc5c3a-497d-422a-af2e-b7bb10f3716a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a4d74869-ae4a-49a9-8ebc-e7ef45ddd941

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4d74869-ae4a-49a9-8ebc-e7ef45ddd941
Content-Type: application/json

--- request body ---
{"handle":"qa-604107ba52f8","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4d74869-ae4a-49a9-8ebc-e7ef45ddd941
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4693d0d8-86c0-4df2-a04c-fc4b95746392"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c5695722-b32f-4d9a-b88e-f1064703574d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5695722-b32f-4d9a-b88e-f1064703574d
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c5695722-b32f-4d9a-b88e-f1064703574d
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
correlation: qa-9f20dfd1-4e45-44d4-84f3-1f8a21067f62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f20dfd1-4e45-44d4-84f3-1f8a21067f62
Content-Type: application/json

--- request body ---
{"handle":"qa-604107ba52f8","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f20dfd1-4e45-44d4-84f3-1f8a21067f62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9f20dfd1-4e45-44d4-84f3-1f8a21067f62"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5723747e-b643-4cc0-a77d-7d028d22f3f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5723747e-b643-4cc0-a77d-7d028d22f3f9
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5723747e-b643-4cc0-a77d-7d028d22f3f9
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
correlation: qa-a1c268bd-bbb6-4a62-aea4-668c3e7c809f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1c268bd-bbb6-4a62-aea4-668c3e7c809f
Content-Type: application/json

--- request body ---
{"handle":"qa-0ecab8774112","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1c268bd-bbb6-4a62-aea4-668c3e7c809f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1c268bd-bbb6-4a62-aea4-668c3e7c809f"}
```
