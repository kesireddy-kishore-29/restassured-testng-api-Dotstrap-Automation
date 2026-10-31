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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-d353ca9e-8cd2-4015-82a2-91267d485b47` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-a32b9d0e-4c39-448b-a069-770fac2242a6` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-d10ffe04-1c2c-4c24-b650-120ca602ff5d` |
| 4 | `POST /v1/conversations` | 201 | 57 | `qa-a93831c9-a624-4a65-ba50-532b1ba841c7` |
| 5 | `POST /v1/conversations` | 503 | 11 | `qa-2bf29c4b-5676-4e75-a1fb-13d0ffcafba9` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-41f8ee30-cce8-4b6f-98a7-55d48253db3a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-6f494c74-9bfd-4004-b6bf-ed65020ab61f` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-59a616fe-ef30-4b88-b839-ae5272fe39d5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-6a8e8a55-bb89-48b4-9ba7-754ba73b8835` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-d39fda00-ede9-40ba-84d5-af3cb60f221c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d353ca9e-8cd2-4015-82a2-91267d485b47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d353ca9e-8cd2-4015-82a2-91267d485b47
Content-Type: application/json

--- request body ---
{"handle":"qa-a88132bcdef2","displayName":"QA a88132bcdef2","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d353ca9e-8cd2-4015-82a2-91267d485b47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 9
Location: /v1/accounts/qa-a88132bcdef2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_edeeeaf8-c765-4198-8e1f-a572c9df6110","handle":"qa-a88132bcdef2","displayName":"QA a88132bcdef2","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.355852760Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a32b9d0e-4c39-448b-a069-770fac2242a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a32b9d0e-4c39-448b-a069-770fac2242a6
Content-Type: application/json

--- request body ---
{"handle":"qa-e5cfa9fe819f","displayName":"QA e5cfa9fe819f","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a32b9d0e-4c39-448b-a069-770fac2242a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 9
Location: /v1/accounts/qa-e5cfa9fe819f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d70f10d1-ff45-4fb7-9347-1c5fe1ebf411","handle":"qa-e5cfa9fe819f","displayName":"QA e5cfa9fe819f","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.381445765Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d10ffe04-1c2c-4c24-b650-120ca602ff5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d10ffe04-1c2c-4c24-b650-120ca602ff5d
Content-Type: application/json

--- request body ---
{"handle":"qa-a88132bcdef2","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d10ffe04-1c2c-4c24-b650-120ca602ff5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_edeeeaf8-c765-4198-8e1f-a572c9df6110"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a93831c9-a624-4a65-ba50-532b1ba841c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a93831c9-a624-4a65-ba50-532b1ba841c7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e5cfa9fe819f","subject":"Error contract","message":"Hi"}

--- response: 201 in 57 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a93831c9-a624-4a65-ba50-532b1ba841c7
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
Location: /v1/conversations/cnv_53feb4ed-3391-4d7f-b059-e24d7a410251
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_53feb4ed-3391-4d7f-b059-e24d7a410251","subject":"Error contract","status":"open","region":"eu","participants":["qa-a88132bcdef2","qa-e5cfa9fe819f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.462215965Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-2bf29c4b-5676-4e75-a1fb-13d0ffcafba9

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: fb703ce6-83a9-4d12-955a-f02d79bbc9f4
X-Correlation-Id: qa-2bf29c4b-5676-4e75-a1fb-13d0ffcafba9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a88132bcdef2","subject":"Probe","message":"Hi"}

--- response: 503 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bf29c4b-5676-4e75-a1fb-13d0ffcafba9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-2bf29c4b-5676-4e75-a1fb-13d0ffcafba9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-41f8ee30-cce8-4b6f-98a7-55d48253db3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41f8ee30-cce8-4b6f-98a7-55d48253db3a
Content-Type: application/json

--- request body ---
{"handle":"qa-e5cfa9fe819f","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-41f8ee30-cce8-4b6f-98a7-55d48253db3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d70f10d1-ff45-4fb7-9347-1c5fe1ebf411"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f494c74-9bfd-4004-b6bf-ed65020ab61f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f494c74-9bfd-4004-b6bf-ed65020ab61f
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f494c74-9bfd-4004-b6bf-ed65020ab61f
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
correlation: qa-59a616fe-ef30-4b88-b839-ae5272fe39d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59a616fe-ef30-4b88-b839-ae5272fe39d5
Content-Type: application/json

--- request body ---
{"handle":"qa-e5cfa9fe819f","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59a616fe-ef30-4b88-b839-ae5272fe39d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-59a616fe-ef30-4b88-b839-ae5272fe39d5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6a8e8a55-bb89-48b4-9ba7-754ba73b8835

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a8e8a55-bb89-48b4-9ba7-754ba73b8835
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6a8e8a55-bb89-48b4-9ba7-754ba73b8835
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
correlation: qa-d39fda00-ede9-40ba-84d5-af3cb60f221c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d39fda00-ede9-40ba-84d5-af3cb60f221c
Content-Type: application/json

--- request body ---
{"handle":"qa-a88132bcdef2","password":"****"}

--- response: 401 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d39fda00-ede9-40ba-84d5-af3cb60f221c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d39fda00-ede9-40ba-84d5-af3cb60f221c"}
```
