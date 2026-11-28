# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 54 | `qa-abff4484-8df6-4662-a6d7-a54dfe4b60ca` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-cba209c6-7136-44b7-b3e3-8580082c8c88` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-388933f9-a6b6-4368-b108-1e0b98bcd814` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-f71bc12e-7fa5-47e1-b799-d819d07c10de` |
| 5 | `POST /v1/accounts` | 503 | 10 | `qa-b8f3a7e1-54b3-4052-a1b8-2a2e75fbe854` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-06941d9d-3d2f-4302-9e33-8378e3fc3a31` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-3a832424-9e59-4b77-9e8d-073b47bf45a8` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-90ffe972-bf76-450e-960e-55f23f78049a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-e9f86b56-e070-4042-aa73-b2f6aa8c9b6f` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-e0ca56de-ef8e-4562-867c-34bd168b31e5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-abff4484-8df6-4662-a6d7-a54dfe4b60ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abff4484-8df6-4662-a6d7-a54dfe4b60ca
Content-Type: application/json

--- request body ---
{"handle":"qa-a464e8f0a6f2","displayName":"QA a464e8f0a6f2","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-abff4484-8df6-4662-a6d7-a54dfe4b60ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Location: /v1/accounts/qa-a464e8f0a6f2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_daa8a02f-45b2-4767-b8ce-7b0186a2f96d","handle":"qa-a464e8f0a6f2","displayName":"QA a464e8f0a6f2","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.220927443Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cba209c6-7136-44b7-b3e3-8580082c8c88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cba209c6-7136-44b7-b3e3-8580082c8c88
Content-Type: application/json

--- request body ---
{"handle":"qa-ab5e7359fb9b","displayName":"QA ab5e7359fb9b","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-cba209c6-7136-44b7-b3e3-8580082c8c88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Location: /v1/accounts/qa-ab5e7359fb9b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c80da718-0e62-408c-bc3b-c8b179e66605","handle":"qa-ab5e7359fb9b","displayName":"QA ab5e7359fb9b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.268113375Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-388933f9-a6b6-4368-b108-1e0b98bcd814

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-388933f9-a6b6-4368-b108-1e0b98bcd814
Content-Type: application/json

--- request body ---
{"handle":"qa-a464e8f0a6f2","password":"****"}

--- response: 200 in 34 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-388933f9-a6b6-4368-b108-1e0b98bcd814
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_daa8a02f-45b2-4767-b8ce-7b0186a2f96d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f71bc12e-7fa5-47e1-b799-d819d07c10de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f71bc12e-7fa5-47e1-b799-d819d07c10de
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ab5e7359fb9b","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f71bc12e-7fa5-47e1-b799-d819d07c10de
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
Location: /v1/conversations/cnv_a48468ac-e968-4497-8510-20916f49690e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a48468ac-e968-4497-8510-20916f49690e","subject":"Error contract","status":"open","region":"eu","participants":["qa-a464e8f0a6f2","qa-ab5e7359fb9b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.347203628Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-b8f3a7e1-54b3-4052-a1b8-2a2e75fbe854

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 4ba94207-40c0-4bd5-a326-5b95c6d5d607
X-Correlation-Id: qa-b8f3a7e1-54b3-4052-a1b8-2a2e75fbe854
Content-Type: application/json

--- request body ---
{"handle":"qa-bb76ade54e3e","displayName":"QA bb76ade54e3e","password":"****","region":"eu"}

--- response: 503 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8f3a7e1-54b3-4052-a1b8-2a2e75fbe854
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-b8f3a7e1-54b3-4052-a1b8-2a2e75fbe854"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-06941d9d-3d2f-4302-9e33-8378e3fc3a31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06941d9d-3d2f-4302-9e33-8378e3fc3a31
Content-Type: application/json

--- request body ---
{"handle":"qa-ab5e7359fb9b","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-06941d9d-3d2f-4302-9e33-8378e3fc3a31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c80da718-0e62-408c-bc3b-c8b179e66605"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3a832424-9e59-4b77-9e8d-073b47bf45a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a832424-9e59-4b77-9e8d-073b47bf45a8
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3a832424-9e59-4b77-9e8d-073b47bf45a8
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
correlation: qa-90ffe972-bf76-450e-960e-55f23f78049a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90ffe972-bf76-450e-960e-55f23f78049a
Content-Type: application/json

--- request body ---
{"handle":"qa-ab5e7359fb9b","password":"****"}

--- response: 401 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90ffe972-bf76-450e-960e-55f23f78049a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-90ffe972-bf76-450e-960e-55f23f78049a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e9f86b56-e070-4042-aa73-b2f6aa8c9b6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9f86b56-e070-4042-aa73-b2f6aa8c9b6f
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e9f86b56-e070-4042-aa73-b2f6aa8c9b6f
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
correlation: qa-e0ca56de-ef8e-4562-867c-34bd168b31e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0ca56de-ef8e-4562-867c-34bd168b31e5
Content-Type: application/json

--- request body ---
{"handle":"qa-a464e8f0a6f2","password":"****"}

--- response: 401 in 30 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0ca56de-ef8e-4562-867c-34bd168b31e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e0ca56de-ef8e-4562-867c-34bd168b31e5"}
```
