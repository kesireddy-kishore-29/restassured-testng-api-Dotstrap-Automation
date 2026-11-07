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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-f214350e-95b6-488e-8941-f4ec668ee88b` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-3775f39e-ec8b-4d22-aa32-e9ee7a5c4f1a` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-686c6c60-ec8f-4c65-8f94-71b8b4c9fa8f` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-e6321c6f-773f-49c0-85fb-d793df2911f6` |
| 5 | `GET /v1/credits/balance` | 503 | 11 | `qa-9d6b1994-439d-41f1-a081-d5b8517d1cd0` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-af2142fe-5cf8-4adf-a5c1-e5e14510e90d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-d922bf45-5b72-461b-bb83-5604529d4bbd` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-0b9714da-fa4d-45af-8d92-ff0684e2fa5a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-20934acb-c49d-41d2-ba2d-ad4eefd0370d` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-cfc73435-65e7-46d0-ae6b-64ec55f55c83` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f214350e-95b6-488e-8941-f4ec668ee88b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f214350e-95b6-488e-8941-f4ec668ee88b
Content-Type: application/json

--- request body ---
{"handle":"qa-d7d3a569010f","displayName":"QA d7d3a569010f","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f214350e-95b6-488e-8941-f4ec668ee88b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 8
Location: /v1/accounts/qa-d7d3a569010f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f9a3fbb3-01e8-4364-93b3-78e971777d1e","handle":"qa-d7d3a569010f","displayName":"QA d7d3a569010f","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.200991117Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3775f39e-ec8b-4d22-aa32-e9ee7a5c4f1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3775f39e-ec8b-4d22-aa32-e9ee7a5c4f1a
Content-Type: application/json

--- request body ---
{"handle":"qa-f813a8c28bb2","displayName":"QA f813a8c28bb2","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-3775f39e-ec8b-4d22-aa32-e9ee7a5c4f1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 8
Location: /v1/accounts/qa-f813a8c28bb2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c2b0647c-b555-413a-8138-42114f21c6c9","handle":"qa-f813a8c28bb2","displayName":"QA f813a8c28bb2","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.238557156Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-686c6c60-ec8f-4c65-8f94-71b8b4c9fa8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-686c6c60-ec8f-4c65-8f94-71b8b4c9fa8f
Content-Type: application/json

--- request body ---
{"handle":"qa-d7d3a569010f","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-686c6c60-ec8f-4c65-8f94-71b8b4c9fa8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f9a3fbb3-01e8-4364-93b3-78e971777d1e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e6321c6f-773f-49c0-85fb-d793df2911f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6321c6f-773f-49c0-85fb-d793df2911f6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f813a8c28bb2","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6321c6f-773f-49c0-85fb-d793df2911f6
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
Location: /v1/conversations/cnv_5651cfed-80cc-4f89-be3c-f49c9bc51d31
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5651cfed-80cc-4f89-be3c-f49c9bc51d31","subject":"Error contract","status":"open","region":"eu","participants":["qa-d7d3a569010f","qa-f813a8c28bb2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:37.286975550Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-9d6b1994-439d-41f1-a081-d5b8517d1cd0

--- request headers ---
Accept: application/json
X-Fault-Key: 87671714-db2f-4dac-b11f-0a5f8b690eb3
X-Fault: unavailable-once
X-Correlation-Id: qa-9d6b1994-439d-41f1-a081-d5b8517d1cd0
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d6b1994-439d-41f1-a081-d5b8517d1cd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-9d6b1994-439d-41f1-a081-d5b8517d1cd0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-af2142fe-5cf8-4adf-a5c1-e5e14510e90d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af2142fe-5cf8-4adf-a5c1-e5e14510e90d
Content-Type: application/json

--- request body ---
{"handle":"qa-f813a8c28bb2","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-af2142fe-5cf8-4adf-a5c1-e5e14510e90d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c2b0647c-b555-413a-8138-42114f21c6c9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d922bf45-5b72-461b-bb83-5604529d4bbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d922bf45-5b72-461b-bb83-5604529d4bbd
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d922bf45-5b72-461b-bb83-5604529d4bbd
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
correlation: qa-0b9714da-fa4d-45af-8d92-ff0684e2fa5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b9714da-fa4d-45af-8d92-ff0684e2fa5a
Content-Type: application/json

--- request body ---
{"handle":"qa-f813a8c28bb2","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b9714da-fa4d-45af-8d92-ff0684e2fa5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0b9714da-fa4d-45af-8d92-ff0684e2fa5a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-20934acb-c49d-41d2-ba2d-ad4eefd0370d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20934acb-c49d-41d2-ba2d-ad4eefd0370d
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-20934acb-c49d-41d2-ba2d-ad4eefd0370d
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
correlation: qa-cfc73435-65e7-46d0-ae6b-64ec55f55c83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfc73435-65e7-46d0-ae6b-64ec55f55c83
Content-Type: application/json

--- request body ---
{"handle":"qa-d7d3a569010f","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cfc73435-65e7-46d0-ae6b-64ec55f55c83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cfc73435-65e7-46d0-ae6b-64ec55f55c83"}
```
