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
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-6368e2ec-6677-45dd-8177-7a0a6f1b5329` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-2db8c697-2cf5-4b1c-844d-69125d1ce4b5` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-189a7be1-fe67-427a-a6a4-d363a7f4b235` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-c284a107-29fb-4f91-83ae-ab116eec4e0d` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 17 | `qa-8a8ab6a0-baf0-470d-b0e1-799fdcd7cb87` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-0200d886-ccfa-410a-b71f-1ff2adea5c43` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-68c0f002-82a2-42ae-b812-9e2d319af40a` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-0574d153-4fb5-44fe-910f-3936c4bf540e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-323fe9f7-a71d-447f-8247-2c791db93f0c` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-b5312378-2a05-48f8-b2d5-766fc40ccd35` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6368e2ec-6677-45dd-8177-7a0a6f1b5329

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6368e2ec-6677-45dd-8177-7a0a6f1b5329
Content-Type: application/json

--- request body ---
{"handle":"qa-d3b57b6d0e44","displayName":"QA d3b57b6d0e44","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6368e2ec-6677-45dd-8177-7a0a6f1b5329
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Location: /v1/accounts/qa-d3b57b6d0e44
X-Served-Region: eu
Content-Length: 181

{"id":"acc_159f76f9-eac0-4dd8-908b-2709b6ff198f","handle":"qa-d3b57b6d0e44","displayName":"QA d3b57b6d0e44","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.117095788Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2db8c697-2cf5-4b1c-844d-69125d1ce4b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2db8c697-2cf5-4b1c-844d-69125d1ce4b5
Content-Type: application/json

--- request body ---
{"handle":"qa-63d4fcc4ef99","displayName":"QA 63d4fcc4ef99","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2db8c697-2cf5-4b1c-844d-69125d1ce4b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Location: /v1/accounts/qa-63d4fcc4ef99
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d649f3e-c6ca-4e0f-85fe-8b8bca7d68cb","handle":"qa-63d4fcc4ef99","displayName":"QA 63d4fcc4ef99","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.160783374Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-189a7be1-fe67-427a-a6a4-d363a7f4b235

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-189a7be1-fe67-427a-a6a4-d363a7f4b235
Content-Type: application/json

--- request body ---
{"handle":"qa-d3b57b6d0e44","password":"****"}

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-189a7be1-fe67-427a-a6a4-d363a7f4b235
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_159f76f9-eac0-4dd8-908b-2709b6ff198f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c284a107-29fb-4f91-83ae-ab116eec4e0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c284a107-29fb-4f91-83ae-ab116eec4e0d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-63d4fcc4ef99","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-c284a107-29fb-4f91-83ae-ab116eec4e0d
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
Location: /v1/conversations/cnv_6afcff7a-d2e0-449c-8c45-5754a917f0b4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6afcff7a-d2e0-449c-8c45-5754a917f0b4","subject":"Error contract","status":"open","region":"eu","participants":["qa-d3b57b6d0e44","qa-63d4fcc4ef99"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.208348481Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_6afcff7a-d2e0-449c-8c45-5754a917f0b4/read
correlation: qa-8a8ab6a0-baf0-470d-b0e1-799fdcd7cb87

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 35cb40ec-d751-49a0-8f59-f0f23105b9c6
X-Correlation-Id: qa-8a8ab6a0-baf0-470d-b0e1-799fdcd7cb87
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a8ab6a0-baf0-470d-b0e1-799fdcd7cb87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_6afcff7a-d2e0-449c-8c45-5754a917f0b4/read","correlationId":"qa-8a8ab6a0-baf0-470d-b0e1-799fdcd7cb87"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0200d886-ccfa-410a-b71f-1ff2adea5c43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0200d886-ccfa-410a-b71f-1ff2adea5c43
Content-Type: application/json

--- request body ---
{"handle":"qa-63d4fcc4ef99","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-0200d886-ccfa-410a-b71f-1ff2adea5c43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d649f3e-c6ca-4e0f-85fe-8b8bca7d68cb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-68c0f002-82a2-42ae-b812-9e2d319af40a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68c0f002-82a2-42ae-b812-9e2d319af40a
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-68c0f002-82a2-42ae-b812-9e2d319af40a
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
correlation: qa-0574d153-4fb5-44fe-910f-3936c4bf540e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0574d153-4fb5-44fe-910f-3936c4bf540e
Content-Type: application/json

--- request body ---
{"handle":"qa-63d4fcc4ef99","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0574d153-4fb5-44fe-910f-3936c4bf540e
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0574d153-4fb5-44fe-910f-3936c4bf540e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-323fe9f7-a71d-447f-8247-2c791db93f0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-323fe9f7-a71d-447f-8247-2c791db93f0c
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-323fe9f7-a71d-447f-8247-2c791db93f0c
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
correlation: qa-b5312378-2a05-48f8-b2d5-766fc40ccd35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5312378-2a05-48f8-b2d5-766fc40ccd35
Content-Type: application/json

--- request body ---
{"handle":"qa-d3b57b6d0e44","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5312378-2a05-48f8-b2d5-766fc40ccd35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b5312378-2a05-48f8-b2d5-766fc40ccd35"}
```
