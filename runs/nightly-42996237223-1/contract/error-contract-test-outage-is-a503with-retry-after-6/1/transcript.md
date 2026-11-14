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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-cd217cab-85c6-4cfe-9344-7f1b725a6f65` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-05113f4b-8578-4460-8da8-accb10f1d4f8` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-25420f3c-33ba-4f13-945e-baa7b6a4114b` |
| 4 | `POST /v1/conversations` | 201 | 43 | `qa-8ba296db-d3f8-46ec-9fd1-f000036c95cf` |
| 5 | `POST /v1/conversations` | 503 | 18 | `qa-a3df8bcf-f8dd-49f0-bddd-94052b7e2e9b` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-949d5803-3e96-4253-8560-d47c621bfc8f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-e5e596a0-d2fe-46bf-8e7c-207bc76e6e86` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-e469727c-7652-47b6-9139-c8a5ff1be16f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-e4b93df7-f694-4820-9d88-591968629ded` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-61bdf9ea-13eb-4a37-b987-50a117258e4a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cd217cab-85c6-4cfe-9344-7f1b725a6f65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd217cab-85c6-4cfe-9344-7f1b725a6f65
Content-Type: application/json

--- request body ---
{"handle":"qa-e029f6a0916b","displayName":"QA e029f6a0916b","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd217cab-85c6-4cfe-9344-7f1b725a6f65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Location: /v1/accounts/qa-e029f6a0916b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d189b26f-77fd-4c76-961d-198109172a20","handle":"qa-e029f6a0916b","displayName":"QA e029f6a0916b","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.618576906Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-05113f4b-8578-4460-8da8-accb10f1d4f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05113f4b-8578-4460-8da8-accb10f1d4f8
Content-Type: application/json

--- request body ---
{"handle":"qa-0f6ea633ed44","displayName":"QA 0f6ea633ed44","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-05113f4b-8578-4460-8da8-accb10f1d4f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-0f6ea633ed44
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8d3e05e9-377c-482b-afda-87c0b38ead2f","handle":"qa-0f6ea633ed44","displayName":"QA 0f6ea633ed44","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.678474511Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-25420f3c-33ba-4f13-945e-baa7b6a4114b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25420f3c-33ba-4f13-945e-baa7b6a4114b
Content-Type: application/json

--- request body ---
{"handle":"qa-e029f6a0916b","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-25420f3c-33ba-4f13-945e-baa7b6a4114b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d189b26f-77fd-4c76-961d-198109172a20"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8ba296db-d3f8-46ec-9fd1-f000036c95cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ba296db-d3f8-46ec-9fd1-f000036c95cf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0f6ea633ed44","subject":"Error contract","message":"Hi"}

--- response: 201 in 43 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ba296db-d3f8-46ec-9fd1-f000036c95cf
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
Location: /v1/conversations/cnv_fa812492-6381-4946-81cf-8df84578410d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fa812492-6381-4946-81cf-8df84578410d","subject":"Error contract","status":"open","region":"eu","participants":["qa-e029f6a0916b","qa-0f6ea633ed44"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:37.806984556Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a3df8bcf-f8dd-49f0-bddd-94052b7e2e9b

--- request headers ---
Accept: application/json
X-Fault-Key: 3a5b5874-fe88-471c-b47a-1e9c38a4114a
X-Fault: unavailable-once
X-Correlation-Id: qa-a3df8bcf-f8dd-49f0-bddd-94052b7e2e9b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e029f6a0916b","subject":"Probe","message":"Hi"}

--- response: 503 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a3df8bcf-f8dd-49f0-bddd-94052b7e2e9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-a3df8bcf-f8dd-49f0-bddd-94052b7e2e9b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-949d5803-3e96-4253-8560-d47c621bfc8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-949d5803-3e96-4253-8560-d47c621bfc8f
Content-Type: application/json

--- request body ---
{"handle":"qa-0f6ea633ed44","password":"****"}

--- response: 200 in 38 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-949d5803-3e96-4253-8560-d47c621bfc8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d3e05e9-377c-482b-afda-87c0b38ead2f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e5e596a0-d2fe-46bf-8e7c-207bc76e6e86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5e596a0-d2fe-46bf-8e7c-207bc76e6e86
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e5e596a0-d2fe-46bf-8e7c-207bc76e6e86
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
correlation: qa-e469727c-7652-47b6-9139-c8a5ff1be16f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e469727c-7652-47b6-9139-c8a5ff1be16f
Content-Type: application/json

--- request body ---
{"handle":"qa-0f6ea633ed44","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e469727c-7652-47b6-9139-c8a5ff1be16f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e469727c-7652-47b6-9139-c8a5ff1be16f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e4b93df7-f694-4820-9d88-591968629ded

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4b93df7-f694-4820-9d88-591968629ded
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e4b93df7-f694-4820-9d88-591968629ded
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
correlation: qa-61bdf9ea-13eb-4a37-b987-50a117258e4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61bdf9ea-13eb-4a37-b987-50a117258e4a
Content-Type: application/json

--- request body ---
{"handle":"qa-e029f6a0916b","password":"****"}

--- response: 401 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61bdf9ea-13eb-4a37-b987-50a117258e4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61bdf9ea-13eb-4a37-b987-50a117258e4a"}
```
