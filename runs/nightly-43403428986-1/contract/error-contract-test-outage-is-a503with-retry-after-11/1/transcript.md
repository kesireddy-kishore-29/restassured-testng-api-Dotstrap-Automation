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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-839f1432-1bed-4351-89fe-a1954036aa25` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-ee252f44-9820-4c2c-86ec-a8a685013147` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-fbdd6f61-29c8-4f39-a874-193171a5a171` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-e520ffa1-f9c2-4d11-92c0-382fa4fb919b` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 10 | `qa-7b99f040-ee6d-498f-9992-a54f84cf636b` |
| 6 | `POST /v1/auth/token` | 200 | 7 | `qa-f8294ef0-9756-410c-9f24-ff82aa7c90d2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-986f5c10-301a-416a-955b-3ebc1be89e31` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-c34e3539-cea1-49e6-91dc-1b04b7568c86` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-497a79c3-c42b-483f-bee7-c33e3bcdf8fd` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-f3eec5d4-d032-4ca0-a2ac-9b4ae76b6d84` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-839f1432-1bed-4351-89fe-a1954036aa25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-839f1432-1bed-4351-89fe-a1954036aa25
Content-Type: application/json

--- request body ---
{"handle":"qa-ee98263b876f","displayName":"QA ee98263b876f","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-839f1432-1bed-4351-89fe-a1954036aa25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 8
Location: /v1/accounts/qa-ee98263b876f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_19df8231-2fe2-45eb-9ab0-a8b2e7a04f16","handle":"qa-ee98263b876f","displayName":"QA ee98263b876f","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.599702153Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ee252f44-9820-4c2c-86ec-a8a685013147

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee252f44-9820-4c2c-86ec-a8a685013147
Content-Type: application/json

--- request body ---
{"handle":"qa-e2a2c0e2184f","displayName":"QA e2a2c0e2184f","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee252f44-9820-4c2c-86ec-a8a685013147
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Location: /v1/accounts/qa-e2a2c0e2184f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0310e48b-1b8d-449e-ad3e-c8ad951319ec","handle":"qa-e2a2c0e2184f","displayName":"QA e2a2c0e2184f","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.639011586Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fbdd6f61-29c8-4f39-a874-193171a5a171

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbdd6f61-29c8-4f39-a874-193171a5a171
Content-Type: application/json

--- request body ---
{"handle":"qa-ee98263b876f","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbdd6f61-29c8-4f39-a874-193171a5a171
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19df8231-2fe2-45eb-9ab0-a8b2e7a04f16"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e520ffa1-f9c2-4d11-92c0-382fa4fb919b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e520ffa1-f9c2-4d11-92c0-382fa4fb919b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e2a2c0e2184f","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e520ffa1-f9c2-4d11-92c0-382fa4fb919b
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
Location: /v1/conversations/cnv_3f3c5449-dd41-43fb-9489-ee6241e72065
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3f3c5449-dd41-43fb-9489-ee6241e72065","subject":"Error contract","status":"open","region":"eu","participants":["qa-ee98263b876f","qa-e2a2c0e2184f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.677655787Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_3f3c5449-dd41-43fb-9489-ee6241e72065/read
correlation: qa-7b99f040-ee6d-498f-9992-a54f84cf636b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 65e907be-7758-4479-bc1c-8e3564174f94
X-Correlation-Id: qa-7b99f040-ee6d-498f-9992-a54f84cf636b
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b99f040-ee6d-498f-9992-a54f84cf636b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_3f3c5449-dd41-43fb-9489-ee6241e72065/read","correlationId":"qa-7b99f040-ee6d-498f-9992-a54f84cf636b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f8294ef0-9756-410c-9f24-ff82aa7c90d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8294ef0-9756-410c-9f24-ff82aa7c90d2
Content-Type: application/json

--- request body ---
{"handle":"qa-e2a2c0e2184f","password":"****"}

--- response: 200 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8294ef0-9756-410c-9f24-ff82aa7c90d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0310e48b-1b8d-449e-ad3e-c8ad951319ec"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-986f5c10-301a-416a-955b-3ebc1be89e31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-986f5c10-301a-416a-955b-3ebc1be89e31
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-986f5c10-301a-416a-955b-3ebc1be89e31
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
correlation: qa-c34e3539-cea1-49e6-91dc-1b04b7568c86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c34e3539-cea1-49e6-91dc-1b04b7568c86
Content-Type: application/json

--- request body ---
{"handle":"qa-e2a2c0e2184f","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c34e3539-cea1-49e6-91dc-1b04b7568c86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c34e3539-cea1-49e6-91dc-1b04b7568c86"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-497a79c3-c42b-483f-bee7-c33e3bcdf8fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-497a79c3-c42b-483f-bee7-c33e3bcdf8fd
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-497a79c3-c42b-483f-bee7-c33e3bcdf8fd
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
correlation: qa-f3eec5d4-d032-4ca0-a2ac-9b4ae76b6d84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3eec5d4-d032-4ca0-a2ac-9b4ae76b6d84
Content-Type: application/json

--- request body ---
{"handle":"qa-ee98263b876f","password":"****"}

--- response: 401 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3eec5d4-d032-4ca0-a2ac-9b4ae76b6d84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f3eec5d4-d032-4ca0-a2ac-9b4ae76b6d84"}
```
