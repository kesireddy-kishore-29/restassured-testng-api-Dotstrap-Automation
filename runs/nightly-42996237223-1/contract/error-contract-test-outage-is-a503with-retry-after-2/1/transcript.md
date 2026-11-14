# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 60 | `qa-019c3d9f-23fd-4271-b949-86ee9eb40d94` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-73b008fb-da0c-4030-b358-4512301e756d` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-626c5712-6118-494b-b407-89b31c1b227a` |
| 4 | `POST /v1/conversations` | 201 | 36 | `qa-df332e93-03f7-45f0-8f2c-51c0260f2b14` |
| 5 | `GET /v1/accounts/me` | 503 | 19 | `qa-6d96a14d-d114-4fa3-aaf9-7a93653fdab0` |
| 6 | `POST /v1/auth/token` | 200 | 55 | `qa-6270e1d5-9f4c-497b-b6fe-7a51958415df` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-440d69f5-e374-4c71-b243-f3a0a7cb883a` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-8214b880-0983-48f2-b7a4-9bea976074e4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-01e2d05b-6a64-46f0-9f25-64fc5b72cd75` |
| 10 | `POST /v1/auth/token` | 401 | 52 | `qa-0f17e11a-1c61-4bbe-a36f-f46bc4c79a8f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-019c3d9f-23fd-4271-b949-86ee9eb40d94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-019c3d9f-23fd-4271-b949-86ee9eb40d94
Content-Type: application/json

--- request body ---
{"handle":"qa-14ce9a2b5de0","displayName":"QA 14ce9a2b5de0","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-019c3d9f-23fd-4271-b949-86ee9eb40d94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Location: /v1/accounts/qa-14ce9a2b5de0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3a1dad7e-2f3f-4557-acd0-ffc813130948","handle":"qa-14ce9a2b5de0","displayName":"QA 14ce9a2b5de0","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.054959436Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-73b008fb-da0c-4030-b358-4512301e756d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73b008fb-da0c-4030-b358-4512301e756d
Content-Type: application/json

--- request body ---
{"handle":"qa-8788638b2827","displayName":"QA 8788638b2827","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-73b008fb-da0c-4030-b358-4512301e756d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Location: /v1/accounts/qa-8788638b2827
X-Served-Region: eu
Content-Length: 181

{"id":"acc_db8da14c-a868-4783-a760-b55d54a0849c","handle":"qa-8788638b2827","displayName":"QA 8788638b2827","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.103741856Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-626c5712-6118-494b-b407-89b31c1b227a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-626c5712-6118-494b-b407-89b31c1b227a
Content-Type: application/json

--- request body ---
{"handle":"qa-14ce9a2b5de0","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-626c5712-6118-494b-b407-89b31c1b227a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a1dad7e-2f3f-4557-acd0-ffc813130948"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-df332e93-03f7-45f0-8f2c-51c0260f2b14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df332e93-03f7-45f0-8f2c-51c0260f2b14
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8788638b2827","subject":"Error contract","message":"Hi"}

--- response: 201 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-df332e93-03f7-45f0-8f2c-51c0260f2b14
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
Location: /v1/conversations/cnv_3cd260f5-fe07-48a0-b6e4-63503d62ae8f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3cd260f5-fe07-48a0-b6e4-63503d62ae8f","subject":"Error contract","status":"open","region":"eu","participants":["qa-14ce9a2b5de0","qa-8788638b2827"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:36.231777860Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-6d96a14d-d114-4fa3-aaf9-7a93653fdab0

--- request headers ---
Accept: application/json
X-Fault-Key: a62fdd13-832c-4c13-88ef-28c4a4fa0a15
X-Fault: unavailable-once
X-Correlation-Id: qa-6d96a14d-d114-4fa3-aaf9-7a93653fdab0
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d96a14d-d114-4fa3-aaf9-7a93653fdab0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-6d96a14d-d114-4fa3-aaf9-7a93653fdab0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6270e1d5-9f4c-497b-b6fe-7a51958415df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6270e1d5-9f4c-497b-b6fe-7a51958415df
Content-Type: application/json

--- request body ---
{"handle":"qa-8788638b2827","password":"****"}

--- response: 200 in 55 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6270e1d5-9f4c-497b-b6fe-7a51958415df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_db8da14c-a868-4783-a760-b55d54a0849c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-440d69f5-e374-4c71-b243-f3a0a7cb883a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-440d69f5-e374-4c71-b243-f3a0a7cb883a
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-440d69f5-e374-4c71-b243-f3a0a7cb883a
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
correlation: qa-8214b880-0983-48f2-b7a4-9bea976074e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8214b880-0983-48f2-b7a4-9bea976074e4
Content-Type: application/json

--- request body ---
{"handle":"qa-8788638b2827","password":"****"}

--- response: 401 in 31 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8214b880-0983-48f2-b7a4-9bea976074e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8214b880-0983-48f2-b7a4-9bea976074e4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-01e2d05b-6a64-46f0-9f25-64fc5b72cd75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01e2d05b-6a64-46f0-9f25-64fc5b72cd75
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-01e2d05b-6a64-46f0-9f25-64fc5b72cd75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-0f17e11a-1c61-4bbe-a36f-f46bc4c79a8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f17e11a-1c61-4bbe-a36f-f46bc4c79a8f
Content-Type: application/json

--- request body ---
{"handle":"qa-14ce9a2b5de0","password":"****"}

--- response: 401 in 52 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f17e11a-1c61-4bbe-a36f-f46bc4c79a8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f17e11a-1c61-4bbe-a36f-f46bc4c79a8f"}
```
