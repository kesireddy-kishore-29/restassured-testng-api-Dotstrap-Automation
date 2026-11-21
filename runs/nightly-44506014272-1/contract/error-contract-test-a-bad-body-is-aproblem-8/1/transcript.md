# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-07374cc8-130d-43d4-bebd-377590cd99d4` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-98103b97-ea39-427a-98d3-3690fe4a8daa` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-0c12678e-aaef-464c-bdec-7deaff3c9d8a` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-403f6aa3-2656-48a3-af17-24e2868f751f` |
| 5 | `PATCH /v1/accounts/me` | 422 | 28 | `qa-564b5597-ca0e-40f6-a32f-f0e06bb714af` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-b801c093-eaac-4361-8883-9d8bdbe01057` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-b1d64da0-d30d-4e73-a558-ee6cae121384` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-f5981d9d-bc7e-425d-aa33-d0fc0502f7e1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-0108de8c-8709-4ecb-8f28-bd90d47e10af` |
| 10 | `POST /v1/auth/token` | 401 | 51 | `qa-0c53ee66-6cc8-480c-9b93-1feaa428c2af` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-07374cc8-130d-43d4-bebd-377590cd99d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07374cc8-130d-43d4-bebd-377590cd99d4
Content-Type: application/json

--- request body ---
{"handle":"qa-12aec1902231","displayName":"QA 12aec1902231","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-07374cc8-130d-43d4-bebd-377590cd99d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 7
Location: /v1/accounts/qa-12aec1902231
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f094979a-d41c-4775-862e-b6f2a12241d1","handle":"qa-12aec1902231","displayName":"QA 12aec1902231","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.854548671Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-98103b97-ea39-427a-98d3-3690fe4a8daa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98103b97-ea39-427a-98d3-3690fe4a8daa
Content-Type: application/json

--- request body ---
{"handle":"qa-a53dbcc5c603","displayName":"QA a53dbcc5c603","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-98103b97-ea39-427a-98d3-3690fe4a8daa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 7
Location: /v1/accounts/qa-a53dbcc5c603
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9ba7be9f-a4a7-46ec-8ceb-7390abba8f71","handle":"qa-a53dbcc5c603","displayName":"QA a53dbcc5c603","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.935146966Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0c12678e-aaef-464c-bdec-7deaff3c9d8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c12678e-aaef-464c-bdec-7deaff3c9d8a
Content-Type: application/json

--- request body ---
{"handle":"qa-12aec1902231","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c12678e-aaef-464c-bdec-7deaff3c9d8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f094979a-d41c-4775-862e-b6f2a12241d1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-403f6aa3-2656-48a3-af17-24e2868f751f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-403f6aa3-2656-48a3-af17-24e2868f751f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a53dbcc5c603","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-403f6aa3-2656-48a3-af17-24e2868f751f
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
Location: /v1/conversations/cnv_29554a22-eed8-472c-9f87-8df63759874a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_29554a22-eed8-472c-9f87-8df63759874a","subject":"Error contract","status":"open","region":"eu","participants":["qa-12aec1902231","qa-a53dbcc5c603"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:26.038824956Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-564b5597-ca0e-40f6-a32f-f0e06bb714af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-564b5597-ca0e-40f6-a32f-f0e06bb714af
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-564b5597-ca0e-40f6-a32f-f0e06bb714af
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-564b5597-ca0e-40f6-a32f-f0e06bb714af","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b801c093-eaac-4361-8883-9d8bdbe01057

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b801c093-eaac-4361-8883-9d8bdbe01057
Content-Type: application/json

--- request body ---
{"handle":"qa-a53dbcc5c603","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-b801c093-eaac-4361-8883-9d8bdbe01057
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9ba7be9f-a4a7-46ec-8ceb-7390abba8f71"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b1d64da0-d30d-4e73-a558-ee6cae121384

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1d64da0-d30d-4e73-a558-ee6cae121384
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b1d64da0-d30d-4e73-a558-ee6cae121384
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
correlation: qa-f5981d9d-bc7e-425d-aa33-d0fc0502f7e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5981d9d-bc7e-425d-aa33-d0fc0502f7e1
Content-Type: application/json

--- request body ---
{"handle":"qa-a53dbcc5c603","password":"****"}

--- response: 401 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5981d9d-bc7e-425d-aa33-d0fc0502f7e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f5981d9d-bc7e-425d-aa33-d0fc0502f7e1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0108de8c-8709-4ecb-8f28-bd90d47e10af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0108de8c-8709-4ecb-8f28-bd90d47e10af
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0108de8c-8709-4ecb-8f28-bd90d47e10af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-0c53ee66-6cc8-480c-9b93-1feaa428c2af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c53ee66-6cc8-480c-9b93-1feaa428c2af
Content-Type: application/json

--- request body ---
{"handle":"qa-12aec1902231","password":"****"}

--- response: 401 in 51 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c53ee66-6cc8-480c-9b93-1feaa428c2af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0c53ee66-6cc8-480c-9b93-1feaa428c2af"}
```
