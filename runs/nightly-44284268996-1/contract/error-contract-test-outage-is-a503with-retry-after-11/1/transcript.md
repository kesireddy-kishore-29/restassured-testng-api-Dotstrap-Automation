# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-c658ba73-b019-487d-93d4-1a47dbae24cb` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-8df836cf-5ce5-4a56-b70c-cb0d2fd5f34e` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-164a95ea-520b-4030-b8e5-c3992955ad20` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-ec73b2d3-3349-45fc-b194-3ebbb7aa5d4b` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 17 | `qa-c6539941-4320-4f28-b48d-2e6e3e96351c` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-ca40d9fd-f51d-439a-9803-ba7961fb4eb5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-06b6f147-b4d2-4189-8ddd-8527e6fabf99` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-33073721-92ac-4fa0-b693-04e6a2e9424f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-8bfbfd90-00c0-4739-bce7-09aa4b59e8fb` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-5c56a532-0c3d-4b44-8143-31bc5c6b2825` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c658ba73-b019-487d-93d4-1a47dbae24cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c658ba73-b019-487d-93d4-1a47dbae24cb
Content-Type: application/json

--- request body ---
{"handle":"qa-fbd53f1f62f1","displayName":"QA fbd53f1f62f1","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c658ba73-b019-487d-93d4-1a47dbae24cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Location: /v1/accounts/qa-fbd53f1f62f1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dd177083-8ebe-47cb-a307-1551f52e61a4","handle":"qa-fbd53f1f62f1","displayName":"QA fbd53f1f62f1","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.190960573Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8df836cf-5ce5-4a56-b70c-cb0d2fd5f34e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8df836cf-5ce5-4a56-b70c-cb0d2fd5f34e
Content-Type: application/json

--- request body ---
{"handle":"qa-751d5f46c9e6","displayName":"QA 751d5f46c9e6","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8df836cf-5ce5-4a56-b70c-cb0d2fd5f34e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Location: /v1/accounts/qa-751d5f46c9e6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_19e6983e-fa31-4659-b5c6-cbea7e88de98","handle":"qa-751d5f46c9e6","displayName":"QA 751d5f46c9e6","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.224296469Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-164a95ea-520b-4030-b8e5-c3992955ad20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-164a95ea-520b-4030-b8e5-c3992955ad20
Content-Type: application/json

--- request body ---
{"handle":"qa-fbd53f1f62f1","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-164a95ea-520b-4030-b8e5-c3992955ad20
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dd177083-8ebe-47cb-a307-1551f52e61a4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ec73b2d3-3349-45fc-b194-3ebbb7aa5d4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec73b2d3-3349-45fc-b194-3ebbb7aa5d4b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-751d5f46c9e6","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec73b2d3-3349-45fc-b194-3ebbb7aa5d4b
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
Location: /v1/conversations/cnv_784b1817-a337-4bfc-8bd1-ec50e027112c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_784b1817-a337-4bfc-8bd1-ec50e027112c","subject":"Error contract","status":"open","region":"eu","participants":["qa-fbd53f1f62f1","qa-751d5f46c9e6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.292570217Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_784b1817-a337-4bfc-8bd1-ec50e027112c/read
correlation: qa-c6539941-4320-4f28-b48d-2e6e3e96351c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 7432e6cf-f091-4b5e-ba2b-cc512bde49ea
X-Correlation-Id: qa-c6539941-4320-4f28-b48d-2e6e3e96351c
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c6539941-4320-4f28-b48d-2e6e3e96351c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_784b1817-a337-4bfc-8bd1-ec50e027112c/read","correlationId":"qa-c6539941-4320-4f28-b48d-2e6e3e96351c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ca40d9fd-f51d-439a-9803-ba7961fb4eb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca40d9fd-f51d-439a-9803-ba7961fb4eb5
Content-Type: application/json

--- request body ---
{"handle":"qa-751d5f46c9e6","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca40d9fd-f51d-439a-9803-ba7961fb4eb5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19e6983e-fa31-4659-b5c6-cbea7e88de98"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-06b6f147-b4d2-4189-8ddd-8527e6fabf99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06b6f147-b4d2-4189-8ddd-8527e6fabf99
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-06b6f147-b4d2-4189-8ddd-8527e6fabf99
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
correlation: qa-33073721-92ac-4fa0-b693-04e6a2e9424f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33073721-92ac-4fa0-b693-04e6a2e9424f
Content-Type: application/json

--- request body ---
{"handle":"qa-751d5f46c9e6","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33073721-92ac-4fa0-b693-04e6a2e9424f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-33073721-92ac-4fa0-b693-04e6a2e9424f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8bfbfd90-00c0-4739-bce7-09aa4b59e8fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bfbfd90-00c0-4739-bce7-09aa4b59e8fb
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8bfbfd90-00c0-4739-bce7-09aa4b59e8fb
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
correlation: qa-5c56a532-0c3d-4b44-8143-31bc5c6b2825

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c56a532-0c3d-4b44-8143-31bc5c6b2825
Content-Type: application/json

--- request body ---
{"handle":"qa-fbd53f1f62f1","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c56a532-0c3d-4b44-8143-31bc5c6b2825
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5c56a532-0c3d-4b44-8143-31bc5c6b2825"}
```
