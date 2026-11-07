# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-9537cae5-d9e2-45f9-9c1a-450bd543a452` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-8cc5c8a9-7dd3-4646-9ad5-f4b25d827298` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-dbaea1f3-4849-4f24-b67e-bde61042b5b9` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-6bc30725-db35-4f78-8f8d-2599c9e1b82f` |
| 5 | `GET /v1/credits/balance` | 503 | 25 | `qa-c7cfcfdc-7ee4-4385-b631-9046ea73690d` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-a5b5d8c7-f41a-413d-9f73-51835a26109a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-8e20b949-e0fd-4fd7-a696-6153adcdedc9` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-5303f95b-c02c-4f68-99e9-432e027c52d7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-6de7f145-b938-4a3a-a2d3-2129a68affc4` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-3ca59513-21a9-4c78-b8f5-6ea23206ad62` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9537cae5-d9e2-45f9-9c1a-450bd543a452

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9537cae5-d9e2-45f9-9c1a-450bd543a452
Content-Type: application/json

--- request body ---
{"handle":"qa-14c7e2733b15","displayName":"QA 14c7e2733b15","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-9537cae5-d9e2-45f9-9c1a-450bd543a452
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 7
Location: /v1/accounts/qa-14c7e2733b15
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39a9dea6-95de-4df0-8429-73c7fd7a2986","handle":"qa-14c7e2733b15","displayName":"QA 14c7e2733b15","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.468533427Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8cc5c8a9-7dd3-4646-9ad5-f4b25d827298

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cc5c8a9-7dd3-4646-9ad5-f4b25d827298
Content-Type: application/json

--- request body ---
{"handle":"qa-082a5447782b","displayName":"QA 082a5447782b","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cc5c8a9-7dd3-4646-9ad5-f4b25d827298
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 7
Location: /v1/accounts/qa-082a5447782b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72105161-64b7-4f2a-a25b-354c1cbf0eca","handle":"qa-082a5447782b","displayName":"QA 082a5447782b","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.509035182Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dbaea1f3-4849-4f24-b67e-bde61042b5b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbaea1f3-4849-4f24-b67e-bde61042b5b9
Content-Type: application/json

--- request body ---
{"handle":"qa-14c7e2733b15","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbaea1f3-4849-4f24-b67e-bde61042b5b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_39a9dea6-95de-4df0-8429-73c7fd7a2986"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6bc30725-db35-4f78-8f8d-2599c9e1b82f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bc30725-db35-4f78-8f8d-2599c9e1b82f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-082a5447782b","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bc30725-db35-4f78-8f8d-2599c9e1b82f
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
Location: /v1/conversations/cnv_bca324bd-a8a5-4f28-809d-c334c30940a4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bca324bd-a8a5-4f28-809d-c334c30940a4","subject":"Error contract","status":"open","region":"eu","participants":["qa-14c7e2733b15","qa-082a5447782b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.604230179Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-c7cfcfdc-7ee4-4385-b631-9046ea73690d

--- request headers ---
Accept: application/json
X-Fault-Key: 92f74bcd-2396-45f3-b582-b53a08eb7a67
X-Fault: unavailable-once
X-Correlation-Id: qa-c7cfcfdc-7ee4-4385-b631-9046ea73690d
Content-Type: application/json

--- response: 503 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7cfcfdc-7ee4-4385-b631-9046ea73690d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-c7cfcfdc-7ee4-4385-b631-9046ea73690d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a5b5d8c7-f41a-413d-9f73-51835a26109a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5b5d8c7-f41a-413d-9f73-51835a26109a
Content-Type: application/json

--- request body ---
{"handle":"qa-082a5447782b","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5b5d8c7-f41a-413d-9f73-51835a26109a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72105161-64b7-4f2a-a25b-354c1cbf0eca"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e20b949-e0fd-4fd7-a696-6153adcdedc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e20b949-e0fd-4fd7-a696-6153adcdedc9
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e20b949-e0fd-4fd7-a696-6153adcdedc9
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
correlation: qa-5303f95b-c02c-4f68-99e9-432e027c52d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5303f95b-c02c-4f68-99e9-432e027c52d7
Content-Type: application/json

--- request body ---
{"handle":"qa-082a5447782b","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5303f95b-c02c-4f68-99e9-432e027c52d7
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5303f95b-c02c-4f68-99e9-432e027c52d7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6de7f145-b938-4a3a-a2d3-2129a68affc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6de7f145-b938-4a3a-a2d3-2129a68affc4
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6de7f145-b938-4a3a-a2d3-2129a68affc4
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
correlation: qa-3ca59513-21a9-4c78-b8f5-6ea23206ad62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ca59513-21a9-4c78-b8f5-6ea23206ad62
Content-Type: application/json

--- request body ---
{"handle":"qa-14c7e2733b15","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ca59513-21a9-4c78-b8f5-6ea23206ad62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3ca59513-21a9-4c78-b8f5-6ea23206ad62"}
```
