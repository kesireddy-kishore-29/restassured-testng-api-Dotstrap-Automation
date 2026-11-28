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
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-a757c22d-fa6c-4ce3-8218-e2ec0924d877` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-005dadc5-2f80-44a7-a2b9-e6cb4ff03f28` |
| 3 | `POST /v1/auth/token` | 200 | 7 | `qa-55e1e35f-6443-45b1-bf9c-b986a2bd56f0` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-7fcce373-cdf3-47d2-8042-877c95464237` |
| 5 | `GET /v1/admin/stats` | 503 | 6 | `qa-b0a50018-7a95-409e-9b28-fe6ba207d7da` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-0ff1490d-e499-40b7-a4d9-004f7152a9e6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-2f58b7ff-6057-45c9-8e14-22d714130a83` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-496da62b-e44e-469d-b20a-cd521be5de2a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-96f23b9d-18dc-43ce-916c-6b08d9af21eb` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-bcce25b1-9f6e-47b9-b7f5-3ee2ab212e35` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a757c22d-fa6c-4ce3-8218-e2ec0924d877

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a757c22d-fa6c-4ce3-8218-e2ec0924d877
Content-Type: application/json

--- request body ---
{"handle":"qa-f27d1f5d1846","displayName":"QA f27d1f5d1846","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-a757c22d-fa6c-4ce3-8218-e2ec0924d877
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 7
Location: /v1/accounts/qa-f27d1f5d1846
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0217224f-3f3f-4f84-b9e5-d6a4bd608fa3","handle":"qa-f27d1f5d1846","displayName":"QA f27d1f5d1846","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.836030524Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-005dadc5-2f80-44a7-a2b9-e6cb4ff03f28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-005dadc5-2f80-44a7-a2b9-e6cb4ff03f28
Content-Type: application/json

--- request body ---
{"handle":"qa-9fdd21df1a4c","displayName":"QA 9fdd21df1a4c","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-005dadc5-2f80-44a7-a2b9-e6cb4ff03f28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 7
Location: /v1/accounts/qa-9fdd21df1a4c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_60e88171-7ab2-4709-9cdd-8a95087a56c4","handle":"qa-9fdd21df1a4c","displayName":"QA 9fdd21df1a4c","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.881846999Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-55e1e35f-6443-45b1-bf9c-b986a2bd56f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55e1e35f-6443-45b1-bf9c-b986a2bd56f0
Content-Type: application/json

--- request body ---
{"handle":"qa-f27d1f5d1846","password":"****"}

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-55e1e35f-6443-45b1-bf9c-b986a2bd56f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0217224f-3f3f-4f84-b9e5-d6a4bd608fa3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7fcce373-cdf3-47d2-8042-877c95464237

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fcce373-cdf3-47d2-8042-877c95464237
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9fdd21df1a4c","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fcce373-cdf3-47d2-8042-877c95464237
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
Location: /v1/conversations/cnv_9e6b330a-3bd0-40fb-a84e-1ea3ca526c75
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9e6b330a-3bd0-40fb-a84e-1ea3ca526c75","subject":"Error contract","status":"open","region":"eu","participants":["qa-f27d1f5d1846","qa-9fdd21df1a4c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.921574982Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-b0a50018-7a95-409e-9b28-fe6ba207d7da

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 5a3506bc-83ab-4bd9-ba9b-6ed6e48c3e41
X-Correlation-Id: qa-b0a50018-7a95-409e-9b28-fe6ba207d7da
Content-Type: application/json

--- response: 503 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0a50018-7a95-409e-9b28-fe6ba207d7da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-b0a50018-7a95-409e-9b28-fe6ba207d7da"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0ff1490d-e499-40b7-a4d9-004f7152a9e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ff1490d-e499-40b7-a4d9-004f7152a9e6
Content-Type: application/json

--- request body ---
{"handle":"qa-9fdd21df1a4c","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ff1490d-e499-40b7-a4d9-004f7152a9e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_60e88171-7ab2-4709-9cdd-8a95087a56c4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2f58b7ff-6057-45c9-8e14-22d714130a83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f58b7ff-6057-45c9-8e14-22d714130a83
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2f58b7ff-6057-45c9-8e14-22d714130a83
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
correlation: qa-496da62b-e44e-469d-b20a-cd521be5de2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-496da62b-e44e-469d-b20a-cd521be5de2a
Content-Type: application/json

--- request body ---
{"handle":"qa-9fdd21df1a4c","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-496da62b-e44e-469d-b20a-cd521be5de2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-496da62b-e44e-469d-b20a-cd521be5de2a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-96f23b9d-18dc-43ce-916c-6b08d9af21eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96f23b9d-18dc-43ce-916c-6b08d9af21eb
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-96f23b9d-18dc-43ce-916c-6b08d9af21eb
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
correlation: qa-bcce25b1-9f6e-47b9-b7f5-3ee2ab212e35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcce25b1-9f6e-47b9-b7f5-3ee2ab212e35
Content-Type: application/json

--- request body ---
{"handle":"qa-f27d1f5d1846","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bcce25b1-9f6e-47b9-b7f5-3ee2ab212e35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bcce25b1-9f6e-47b9-b7f5-3ee2ab212e35"}
```
