# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 59 | `qa-ab701151-a163-4f55-b2ea-aba29da9433d` |
| 2 | `POST /v1/accounts` | 201 | 63 | `qa-16cc5b21-4926-4830-b4c4-5c42cd076423` |
| 3 | `POST /v1/auth/token` | 200 | 112 | `qa-e3929813-50ce-4e1d-be20-928d259a2f16` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-be978db1-df84-4517-85db-f3bf44ccf1e5` |
| 5 | `POST /v1/credits/purchases` | 503 | 16 | `qa-fd45d8fb-8509-4d3f-8b56-d2867e0e59d4` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-ec651bd5-3a97-4169-bc6b-d844e08bdb10` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-f5dd043f-8b19-4e8f-a9fb-8071b206f668` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-3378b595-f96c-41a2-87af-ab2cbb4e7c43` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-916c4d6b-ead7-43e4-b9a4-905f494219f0` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-c7672ca4-bf69-4016-8d5b-50795a7da814` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ab701151-a163-4f55-b2ea-aba29da9433d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab701151-a163-4f55-b2ea-aba29da9433d
Content-Type: application/json

--- request body ---
{"handle":"qa-2a7ae8eeead4","displayName":"QA 2a7ae8eeead4","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab701151-a163-4f55-b2ea-aba29da9433d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 6
Location: /v1/accounts/qa-2a7ae8eeead4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6cb5060b-7ae8-4791-b6ab-62b13c5bf790","handle":"qa-2a7ae8eeead4","displayName":"QA 2a7ae8eeead4","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.922876047Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-16cc5b21-4926-4830-b4c4-5c42cd076423

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16cc5b21-4926-4830-b4c4-5c42cd076423
Content-Type: application/json

--- request body ---
{"handle":"qa-dd06f8954cb3","displayName":"QA dd06f8954cb3","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-16cc5b21-4926-4830-b4c4-5c42cd076423
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 6
Location: /v1/accounts/qa-dd06f8954cb3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a756f139-1780-42d4-ad3d-15abe744db56","handle":"qa-dd06f8954cb3","displayName":"QA dd06f8954cb3","region":"eu","role":"user","createdAt":"2026-11-19T10:29:27.013393664Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e3929813-50ce-4e1d-be20-928d259a2f16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3929813-50ce-4e1d-be20-928d259a2f16
Content-Type: application/json

--- request body ---
{"handle":"qa-2a7ae8eeead4","password":"****"}

--- response: 200 in 112 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3929813-50ce-4e1d-be20-928d259a2f16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6cb5060b-7ae8-4791-b6ab-62b13c5bf790"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-be978db1-df84-4517-85db-f3bf44ccf1e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be978db1-df84-4517-85db-f3bf44ccf1e5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dd06f8954cb3","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-be978db1-df84-4517-85db-f3bf44ccf1e5
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
Location: /v1/conversations/cnv_12dd97f5-e3f1-43e1-8665-180cccb50c15
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_12dd97f5-e3f1-43e1-8665-180cccb50c15","subject":"Error contract","status":"open","region":"eu","participants":["qa-2a7ae8eeead4","qa-dd06f8954cb3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:27.214189191Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fd45d8fb-8509-4d3f-8b56-d2867e0e59d4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3515048cd4f442458b3c57fa37a5fbb7
X-Fault: unavailable-once
X-Fault-Key: a175dc4e-079a-41e5-98ed-d3a6cdbd5c32
X-Correlation-Id: qa-fd45d8fb-8509-4d3f-8b56-d2867e0e59d4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd45d8fb-8509-4d3f-8b56-d2867e0e59d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-fd45d8fb-8509-4d3f-8b56-d2867e0e59d4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ec651bd5-3a97-4169-bc6b-d844e08bdb10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec651bd5-3a97-4169-bc6b-d844e08bdb10
Content-Type: application/json

--- request body ---
{"handle":"qa-dd06f8954cb3","password":"****"}

--- response: 200 in 40 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec651bd5-3a97-4169-bc6b-d844e08bdb10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a756f139-1780-42d4-ad3d-15abe744db56"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f5dd043f-8b19-4e8f-a9fb-8071b206f668

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5dd043f-8b19-4e8f-a9fb-8071b206f668
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f5dd043f-8b19-4e8f-a9fb-8071b206f668
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
correlation: qa-3378b595-f96c-41a2-87af-ab2cbb4e7c43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3378b595-f96c-41a2-87af-ab2cbb4e7c43
Content-Type: application/json

--- request body ---
{"handle":"qa-dd06f8954cb3","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3378b595-f96c-41a2-87af-ab2cbb4e7c43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3378b595-f96c-41a2-87af-ab2cbb4e7c43"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-916c4d6b-ead7-43e4-b9a4-905f494219f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-916c4d6b-ead7-43e4-b9a4-905f494219f0
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-916c4d6b-ead7-43e4-b9a4-905f494219f0
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
correlation: qa-c7672ca4-bf69-4016-8d5b-50795a7da814

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7672ca4-bf69-4016-8d5b-50795a7da814
Content-Type: application/json

--- request body ---
{"handle":"qa-2a7ae8eeead4","password":"****"}

--- response: 401 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7672ca4-bf69-4016-8d5b-50795a7da814
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c7672ca4-bf69-4016-8d5b-50795a7da814"}
```
