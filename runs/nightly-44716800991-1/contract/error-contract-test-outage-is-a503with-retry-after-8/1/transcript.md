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
| 1 | `POST /v1/accounts` | 201 | 72 | `qa-d302f15f-20a7-47a3-8100-9a43c44b20a2` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-ca12b89c-fa51-4875-bd86-1e2d82198697` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-6dcbd3f6-636c-4d25-9dbf-ce73b55e909a` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-1fbe62e2-d40e-482c-ae2d-895de8133f61` |
| 5 | `GET /v1/conversations/{id}` | 503 | 26 | `qa-2f3afecc-dbcc-4032-83e4-43585c4a53b5` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-7038f755-c37b-476c-b8c6-c882bf8cf73f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-9f3a7182-be9a-4da5-aa6c-3214a8db4cd3` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-5f10f1f2-4bd5-4e8e-9966-455fed1d30e1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-6bac9801-7c62-4162-b44f-f8dc08138183` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-bea14bae-8574-4fe1-9c89-952d70f68c4c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d302f15f-20a7-47a3-8100-9a43c44b20a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d302f15f-20a7-47a3-8100-9a43c44b20a2
Content-Type: application/json

--- request body ---
{"handle":"qa-8e00e5850a75","displayName":"QA 8e00e5850a75","password":"****","region":"eu"}

--- response: 201 in 72 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d302f15f-20a7-47a3-8100-9a43c44b20a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 7
Location: /v1/accounts/qa-8e00e5850a75
X-Served-Region: eu
Content-Length: 181

{"id":"acc_afd0e033-f269-4990-a3e8-a28aabf03fca","handle":"qa-8e00e5850a75","displayName":"QA 8e00e5850a75","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.720875033Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ca12b89c-fa51-4875-bd86-1e2d82198697

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca12b89c-fa51-4875-bd86-1e2d82198697
Content-Type: application/json

--- request body ---
{"handle":"qa-27b2233ee9e5","displayName":"QA 27b2233ee9e5","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca12b89c-fa51-4875-bd86-1e2d82198697
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
Location: /v1/accounts/qa-27b2233ee9e5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_18659976-4de4-47a7-80d1-8c192849b8ba","handle":"qa-27b2233ee9e5","displayName":"QA 27b2233ee9e5","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.759197453Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6dcbd3f6-636c-4d25-9dbf-ce73b55e909a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dcbd3f6-636c-4d25-9dbf-ce73b55e909a
Content-Type: application/json

--- request body ---
{"handle":"qa-8e00e5850a75","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dcbd3f6-636c-4d25-9dbf-ce73b55e909a
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_afd0e033-f269-4990-a3e8-a28aabf03fca"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1fbe62e2-d40e-482c-ae2d-895de8133f61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fbe62e2-d40e-482c-ae2d-895de8133f61
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-27b2233ee9e5","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fbe62e2-d40e-482c-ae2d-895de8133f61
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
Location: /v1/conversations/cnv_7c949e50-b787-4c49-b1b5-fab1e4fe94df
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7c949e50-b787-4c49-b1b5-fab1e4fe94df","subject":"Error contract","status":"open","region":"eu","participants":["qa-8e00e5850a75","qa-27b2233ee9e5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.838655734Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_7c949e50-b787-4c49-b1b5-fab1e4fe94df
correlation: qa-2f3afecc-dbcc-4032-83e4-43585c4a53b5

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b3ff14fc-238d-4fa3-80ba-5e315fd6f4b2
X-Correlation-Id: qa-2f3afecc-dbcc-4032-83e4-43585c4a53b5
Content-Type: application/json

--- response: 503 in 26 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f3afecc-dbcc-4032-83e4-43585c4a53b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_7c949e50-b787-4c49-b1b5-fab1e4fe94df","correlationId":"qa-2f3afecc-dbcc-4032-83e4-43585c4a53b5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7038f755-c37b-476c-b8c6-c882bf8cf73f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7038f755-c37b-476c-b8c6-c882bf8cf73f
Content-Type: application/json

--- request body ---
{"handle":"qa-27b2233ee9e5","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7038f755-c37b-476c-b8c6-c882bf8cf73f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18659976-4de4-47a7-80d1-8c192849b8ba"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9f3a7182-be9a-4da5-aa6c-3214a8db4cd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f3a7182-be9a-4da5-aa6c-3214a8db4cd3
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9f3a7182-be9a-4da5-aa6c-3214a8db4cd3
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
correlation: qa-5f10f1f2-4bd5-4e8e-9966-455fed1d30e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f10f1f2-4bd5-4e8e-9966-455fed1d30e1
Content-Type: application/json

--- request body ---
{"handle":"qa-27b2233ee9e5","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f10f1f2-4bd5-4e8e-9966-455fed1d30e1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5f10f1f2-4bd5-4e8e-9966-455fed1d30e1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6bac9801-7c62-4162-b44f-f8dc08138183

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bac9801-7c62-4162-b44f-f8dc08138183
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6bac9801-7c62-4162-b44f-f8dc08138183
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
correlation: qa-bea14bae-8574-4fe1-9c89-952d70f68c4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bea14bae-8574-4fe1-9c89-952d70f68c4c
Content-Type: application/json

--- request body ---
{"handle":"qa-8e00e5850a75","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bea14bae-8574-4fe1-9c89-952d70f68c4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bea14bae-8574-4fe1-9c89-952d70f68c4c"}
```
