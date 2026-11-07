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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-769d91e1-3980-4b3f-a792-04e661634b02` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-d9ed1398-4a64-4417-a70a-1a2004a08a8b` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-4bc43d74-a11f-4089-ba7e-f6518aa93c56` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-2c32cb8d-f5bb-4174-ad67-e84f91073f19` |
| 5 | `POST /v1/conversations` | 503 | 15 | `qa-9cd50060-d701-429b-a46e-62aabe524f21` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-247ac367-f649-4887-a405-b46281db462b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-15748a3c-4c36-46e6-ae2c-552c8ad0e80b` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-90317627-3eaf-43c6-9703-4749c2289860` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-55352341-3358-477e-a049-794b108b88f0` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-ff29f6db-aa9a-4f33-9f70-083fd67b1afe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-769d91e1-3980-4b3f-a792-04e661634b02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-769d91e1-3980-4b3f-a792-04e661634b02
Content-Type: application/json

--- request body ---
{"handle":"qa-c5d9aef1222f","displayName":"QA c5d9aef1222f","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-769d91e1-3980-4b3f-a792-04e661634b02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 9
Location: /v1/accounts/qa-c5d9aef1222f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c8151d48-d21d-488d-9994-37f4ebb1ef03","handle":"qa-c5d9aef1222f","displayName":"QA c5d9aef1222f","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.359974852Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d9ed1398-4a64-4417-a70a-1a2004a08a8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9ed1398-4a64-4417-a70a-1a2004a08a8b
Content-Type: application/json

--- request body ---
{"handle":"qa-f060559ba02e","displayName":"QA f060559ba02e","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9ed1398-4a64-4417-a70a-1a2004a08a8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 9
Location: /v1/accounts/qa-f060559ba02e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9c621e7e-a678-4667-8f33-f98116bd84f8","handle":"qa-f060559ba02e","displayName":"QA f060559ba02e","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.385727769Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4bc43d74-a11f-4089-ba7e-f6518aa93c56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bc43d74-a11f-4089-ba7e-f6518aa93c56
Content-Type: application/json

--- request body ---
{"handle":"qa-c5d9aef1222f","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bc43d74-a11f-4089-ba7e-f6518aa93c56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c8151d48-d21d-488d-9994-37f4ebb1ef03"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2c32cb8d-f5bb-4174-ad67-e84f91073f19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c32cb8d-f5bb-4174-ad67-e84f91073f19
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f060559ba02e","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c32cb8d-f5bb-4174-ad67-e84f91073f19
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
Location: /v1/conversations/cnv_d2a77430-65da-49c5-a6b8-34120ed217f1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d2a77430-65da-49c5-a6b8-34120ed217f1","subject":"Error contract","status":"open","region":"eu","participants":["qa-c5d9aef1222f","qa-f060559ba02e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.454093761Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9cd50060-d701-429b-a46e-62aabe524f21

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 81a2956b-d4f1-4638-b90b-6739b47e52a3
X-Correlation-Id: qa-9cd50060-d701-429b-a46e-62aabe524f21
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c5d9aef1222f","subject":"Probe","message":"Hi"}

--- response: 503 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9cd50060-d701-429b-a46e-62aabe524f21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-9cd50060-d701-429b-a46e-62aabe524f21"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-247ac367-f649-4887-a405-b46281db462b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-247ac367-f649-4887-a405-b46281db462b
Content-Type: application/json

--- request body ---
{"handle":"qa-f060559ba02e","password":"****"}

--- response: 200 in 38 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-247ac367-f649-4887-a405-b46281db462b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9c621e7e-a678-4667-8f33-f98116bd84f8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-15748a3c-4c36-46e6-ae2c-552c8ad0e80b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15748a3c-4c36-46e6-ae2c-552c8ad0e80b
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-15748a3c-4c36-46e6-ae2c-552c8ad0e80b
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
correlation: qa-90317627-3eaf-43c6-9703-4749c2289860

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90317627-3eaf-43c6-9703-4749c2289860
Content-Type: application/json

--- request body ---
{"handle":"qa-f060559ba02e","password":"****"}

--- response: 401 in 25 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90317627-3eaf-43c6-9703-4749c2289860
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-90317627-3eaf-43c6-9703-4749c2289860"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-55352341-3358-477e-a049-794b108b88f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55352341-3358-477e-a049-794b108b88f0
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-55352341-3358-477e-a049-794b108b88f0
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
correlation: qa-ff29f6db-aa9a-4f33-9f70-083fd67b1afe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff29f6db-aa9a-4f33-9f70-083fd67b1afe
Content-Type: application/json

--- request body ---
{"handle":"qa-c5d9aef1222f","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff29f6db-aa9a-4f33-9f70-083fd67b1afe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ff29f6db-aa9a-4f33-9f70-083fd67b1afe"}
```
