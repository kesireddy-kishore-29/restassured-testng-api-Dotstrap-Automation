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
| 1 | `POST /v1/accounts` | 201 | 79 | `qa-1538fbbc-8661-414d-9a26-45f8bca4e57d` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-25f5c0e7-d786-4402-9bf4-58479c097acb` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-76ff0e40-6d32-4427-a106-37c978ced843` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-568a4438-11f5-4009-8110-2e806a4f1fc9` |
| 5 | `POST /v1/credits/purchases` | 503 | 18 | `qa-9f8a825e-8403-4d28-9f5b-fa20930be61e` |
| 6 | `POST /v1/auth/token` | 200 | 50 | `qa-732933bd-3a44-4383-86d2-8918215db97f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-ab7b9ae2-6313-4577-b68a-270b341c9b0f` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-e1bbcdfa-e751-404c-96fb-192c279b65d6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-29e8a96d-b590-4c31-aeea-e4d4db084025` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-065df1f8-9bcb-4659-a033-7d8a42170ea7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1538fbbc-8661-414d-9a26-45f8bca4e57d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1538fbbc-8661-414d-9a26-45f8bca4e57d
Content-Type: application/json

--- request body ---
{"handle":"qa-1e4a76b5cb16","displayName":"QA 1e4a76b5cb16","password":"****","region":"eu"}

--- response: 201 in 79 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1538fbbc-8661-414d-9a26-45f8bca4e57d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 6
Location: /v1/accounts/qa-1e4a76b5cb16
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92f526e3-bb67-45ae-a7ed-90dbc0357590","handle":"qa-1e4a76b5cb16","displayName":"QA 1e4a76b5cb16","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.417828950Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-25f5c0e7-d786-4402-9bf4-58479c097acb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25f5c0e7-d786-4402-9bf4-58479c097acb
Content-Type: application/json

--- request body ---
{"handle":"qa-38a0ce4a5da3","displayName":"QA 38a0ce4a5da3","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-25f5c0e7-d786-4402-9bf4-58479c097acb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 6
Location: /v1/accounts/qa-38a0ce4a5da3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f849ec5e-759b-4650-a38e-178cb7f169dc","handle":"qa-38a0ce4a5da3","displayName":"QA 38a0ce4a5da3","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.449983243Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-76ff0e40-6d32-4427-a106-37c978ced843

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76ff0e40-6d32-4427-a106-37c978ced843
Content-Type: application/json

--- request body ---
{"handle":"qa-1e4a76b5cb16","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-76ff0e40-6d32-4427-a106-37c978ced843
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_92f526e3-bb67-45ae-a7ed-90dbc0357590"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-568a4438-11f5-4009-8110-2e806a4f1fc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-568a4438-11f5-4009-8110-2e806a4f1fc9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-38a0ce4a5da3","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-568a4438-11f5-4009-8110-2e806a4f1fc9
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
Location: /v1/conversations/cnv_dd0cd7d1-56fb-4825-b4a5-0598e1ce92e5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_dd0cd7d1-56fb-4825-b4a5-0598e1ce92e5","subject":"Error contract","status":"open","region":"eu","participants":["qa-1e4a76b5cb16","qa-38a0ce4a5da3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:03.519866668Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9f8a825e-8403-4d28-9f5b-fa20930be61e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4366a617d1a6409f83474fd5025b860a
X-Fault-Key: 776877b9-dcfe-4d96-81d5-b03d7e2dd678
X-Fault: unavailable-once
X-Correlation-Id: qa-9f8a825e-8403-4d28-9f5b-fa20930be61e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f8a825e-8403-4d28-9f5b-fa20930be61e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-9f8a825e-8403-4d28-9f5b-fa20930be61e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-732933bd-3a44-4383-86d2-8918215db97f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-732933bd-3a44-4383-86d2-8918215db97f
Content-Type: application/json

--- request body ---
{"handle":"qa-38a0ce4a5da3","password":"****"}

--- response: 200 in 50 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-732933bd-3a44-4383-86d2-8918215db97f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f849ec5e-759b-4650-a38e-178cb7f169dc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ab7b9ae2-6313-4577-b68a-270b341c9b0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab7b9ae2-6313-4577-b68a-270b341c9b0f
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ab7b9ae2-6313-4577-b68a-270b341c9b0f
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
correlation: qa-e1bbcdfa-e751-404c-96fb-192c279b65d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1bbcdfa-e751-404c-96fb-192c279b65d6
Content-Type: application/json

--- request body ---
{"handle":"qa-38a0ce4a5da3","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1bbcdfa-e751-404c-96fb-192c279b65d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e1bbcdfa-e751-404c-96fb-192c279b65d6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-29e8a96d-b590-4c31-aeea-e4d4db084025

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29e8a96d-b590-4c31-aeea-e4d4db084025
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-29e8a96d-b590-4c31-aeea-e4d4db084025
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
correlation: qa-065df1f8-9bcb-4659-a033-7d8a42170ea7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-065df1f8-9bcb-4659-a033-7d8a42170ea7
Content-Type: application/json

--- request body ---
{"handle":"qa-1e4a76b5cb16","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-065df1f8-9bcb-4659-a033-7d8a42170ea7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-065df1f8-9bcb-4659-a033-7d8a42170ea7"}
```
