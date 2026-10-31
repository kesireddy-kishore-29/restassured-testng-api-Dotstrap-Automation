# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 91 | `qa-4cb3a10c-1819-44e4-ad6d-3ae186be641b` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-25c48da1-3155-4ee6-b1f0-d998311bbf36` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-a648e00d-1dc6-4cc7-9b5d-9bceabc811c1` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-91fb9061-14aa-48ee-bb20-9799286ed951` |
| 5 | `POST /v1/conversations` | 503 | 25 | `qa-5a1b3b3d-4c6d-4c74-ad39-218578563022` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-e3dc28e7-a173-464e-9e16-b7ed2f02a2db` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-0b1c5fe8-9b18-4447-b69b-209ab598bc7b` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-c34535d8-b9c0-4e21-9cda-e1d9cd19a575` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-1474a299-53e0-45bc-8e48-eccb603c4a45` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-30647e41-e08f-454e-a148-9c6d308a178f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4cb3a10c-1819-44e4-ad6d-3ae186be641b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cb3a10c-1819-44e4-ad6d-3ae186be641b
Content-Type: application/json

--- request body ---
{"handle":"qa-deef47ab24c0","displayName":"QA deef47ab24c0","password":"****","region":"eu"}

--- response: 201 in 91 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cb3a10c-1819-44e4-ad6d-3ae186be641b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Location: /v1/accounts/qa-deef47ab24c0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1c0814d4-80a4-470e-adf3-7013d91269ef","handle":"qa-deef47ab24c0","displayName":"QA deef47ab24c0","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.484338212Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-25c48da1-3155-4ee6-b1f0-d998311bbf36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25c48da1-3155-4ee6-b1f0-d998311bbf36
Content-Type: application/json

--- request body ---
{"handle":"qa-2d41b7d8d5cc","displayName":"QA 2d41b7d8d5cc","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-25c48da1-3155-4ee6-b1f0-d998311bbf36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 7
Location: /v1/accounts/qa-2d41b7d8d5cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e980d061-eade-481d-901e-51afe9087dbf","handle":"qa-2d41b7d8d5cc","displayName":"QA 2d41b7d8d5cc","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.554465455Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a648e00d-1dc6-4cc7-9b5d-9bceabc811c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a648e00d-1dc6-4cc7-9b5d-9bceabc811c1
Content-Type: application/json

--- request body ---
{"handle":"qa-deef47ab24c0","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-a648e00d-1dc6-4cc7-9b5d-9bceabc811c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1c0814d4-80a4-470e-adf3-7013d91269ef"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-91fb9061-14aa-48ee-bb20-9799286ed951

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91fb9061-14aa-48ee-bb20-9799286ed951
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2d41b7d8d5cc","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-91fb9061-14aa-48ee-bb20-9799286ed951
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
Location: /v1/conversations/cnv_dd38607a-f28e-451b-a986-f01c9843715c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_dd38607a-f28e-451b-a986-f01c9843715c","subject":"Error contract","status":"open","region":"eu","participants":["qa-deef47ab24c0","qa-2d41b7d8d5cc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:45.667755008Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-5a1b3b3d-4c6d-4c74-ad39-218578563022

--- request headers ---
Accept: application/json
X-Fault-Key: d84743fb-4eaa-4dbd-9765-328abb5e4f6e
X-Fault: unavailable-once
X-Correlation-Id: qa-5a1b3b3d-4c6d-4c74-ad39-218578563022
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-deef47ab24c0","subject":"Probe","message":"Hi"}

--- response: 503 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a1b3b3d-4c6d-4c74-ad39-218578563022
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-5a1b3b3d-4c6d-4c74-ad39-218578563022"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e3dc28e7-a173-464e-9e16-b7ed2f02a2db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3dc28e7-a173-464e-9e16-b7ed2f02a2db
Content-Type: application/json

--- request body ---
{"handle":"qa-2d41b7d8d5cc","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3dc28e7-a173-464e-9e16-b7ed2f02a2db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e980d061-eade-481d-901e-51afe9087dbf"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b1c5fe8-9b18-4447-b69b-209ab598bc7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b1c5fe8-9b18-4447-b69b-209ab598bc7b
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b1c5fe8-9b18-4447-b69b-209ab598bc7b
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
correlation: qa-c34535d8-b9c0-4e21-9cda-e1d9cd19a575

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c34535d8-b9c0-4e21-9cda-e1d9cd19a575
Content-Type: application/json

--- request body ---
{"handle":"qa-2d41b7d8d5cc","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c34535d8-b9c0-4e21-9cda-e1d9cd19a575
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c34535d8-b9c0-4e21-9cda-e1d9cd19a575"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1474a299-53e0-45bc-8e48-eccb603c4a45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1474a299-53e0-45bc-8e48-eccb603c4a45
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1474a299-53e0-45bc-8e48-eccb603c4a45
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
correlation: qa-30647e41-e08f-454e-a148-9c6d308a178f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30647e41-e08f-454e-a148-9c6d308a178f
Content-Type: application/json

--- request body ---
{"handle":"qa-deef47ab24c0","password":"****"}

--- response: 401 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30647e41-e08f-454e-a148-9c6d308a178f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-30647e41-e08f-454e-a148-9c6d308a178f"}
```
