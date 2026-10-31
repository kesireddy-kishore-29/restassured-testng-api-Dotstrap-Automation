# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 495 | `qa-8fce15a1-48bb-4d61-808f-48f5d17fa0e4` |
| 2 | `POST /v1/accounts` | 201 | 92 | `qa-e1c89e90-8a6e-4e68-8712-a401a38a2ed4` |
| 3 | `POST /v1/auth/token` | 200 | 117 | `qa-b26e2a44-e1fc-4643-9775-4a3f3ce66432` |
| 4 | `POST /v1/conversations` | 201 | 65 | `qa-d0e6210b-7f8a-43f3-b3ee-ed3d9a72d9d4` |
| 5 | `PATCH /v1/accounts/me` | 503 | 25 | `qa-20cafd03-3558-44be-b8e8-888073cba4d8` |
| 6 | `POST /v1/auth/token` | 200 | 58 | `qa-3fd903b5-3648-427b-8a8b-ac89b3f28c99` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-cfab82d9-17fc-4635-abb9-a7d50aa07b74` |
| 8 | `POST /v1/auth/token` | 401 | 29 | `qa-a136458e-1460-4a34-ad6c-bf9ccceba4ec` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-3e119343-1561-47ba-983b-00d86c68c216` |
| 10 | `POST /v1/auth/token` | 401 | 66 | `qa-d864e9c9-a8b0-41e1-8c52-d632a1c7ed8a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8fce15a1-48bb-4d61-808f-48f5d17fa0e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fce15a1-48bb-4d61-808f-48f5d17fa0e4
Content-Type: application/json

--- request body ---
{"handle":"qa-da989db28509","displayName":"QA da989db28509","password":"****","region":"eu"}

--- response: 201 in 495 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fce15a1-48bb-4d61-808f-48f5d17fa0e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-da989db28509
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92087202-a162-446a-a94f-2dd41750895c","handle":"qa-da989db28509","displayName":"QA da989db28509","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.633340185Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e1c89e90-8a6e-4e68-8712-a401a38a2ed4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1c89e90-8a6e-4e68-8712-a401a38a2ed4
Content-Type: application/json

--- request body ---
{"handle":"qa-cb11ea8788d9","displayName":"QA cb11ea8788d9","password":"****","region":"eu"}

--- response: 201 in 92 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1c89e90-8a6e-4e68-8712-a401a38a2ed4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Location: /v1/accounts/qa-cb11ea8788d9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bcd642c8-056e-4abd-a385-794c9fa67793","handle":"qa-cb11ea8788d9","displayName":"QA cb11ea8788d9","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.158299235Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b26e2a44-e1fc-4643-9775-4a3f3ce66432

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b26e2a44-e1fc-4643-9775-4a3f3ce66432
Content-Type: application/json

--- request body ---
{"handle":"qa-da989db28509","password":"****"}

--- response: 200 in 117 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-b26e2a44-e1fc-4643-9775-4a3f3ce66432
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_92087202-a162-446a-a94f-2dd41750895c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d0e6210b-7f8a-43f3-b3ee-ed3d9a72d9d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0e6210b-7f8a-43f3-b3ee-ed3d9a72d9d4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cb11ea8788d9","subject":"Error contract","message":"Hi"}

--- response: 201 in 65 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0e6210b-7f8a-43f3-b3ee-ed3d9a72d9d4
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
Location: /v1/conversations/cnv_50131e73-5ddd-48eb-a08e-c554038e3d49
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_50131e73-5ddd-48eb-a08e-c554038e3d49","subject":"Error contract","status":"open","region":"eu","participants":["qa-da989db28509","qa-cb11ea8788d9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.461613705Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-20cafd03-3558-44be-b8e8-888073cba4d8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 0749ef2a-1888-4265-823e-6d189c872434
X-Correlation-Id: qa-20cafd03-3558-44be-b8e8-888073cba4d8
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 25 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20cafd03-3558-44be-b8e8-888073cba4d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-20cafd03-3558-44be-b8e8-888073cba4d8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3fd903b5-3648-427b-8a8b-ac89b3f28c99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fd903b5-3648-427b-8a8b-ac89b3f28c99
Content-Type: application/json

--- request body ---
{"handle":"qa-cb11ea8788d9","password":"****"}

--- response: 200 in 58 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fd903b5-3648-427b-8a8b-ac89b3f28c99
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bcd642c8-056e-4abd-a385-794c9fa67793"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cfab82d9-17fc-4635-abb9-a7d50aa07b74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfab82d9-17fc-4635-abb9-a7d50aa07b74
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cfab82d9-17fc-4635-abb9-a7d50aa07b74
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
correlation: qa-a136458e-1460-4a34-ad6c-bf9ccceba4ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a136458e-1460-4a34-ad6c-bf9ccceba4ec
Content-Type: application/json

--- request body ---
{"handle":"qa-cb11ea8788d9","password":"****"}

--- response: 401 in 29 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a136458e-1460-4a34-ad6c-bf9ccceba4ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a136458e-1460-4a34-ad6c-bf9ccceba4ec"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3e119343-1561-47ba-983b-00d86c68c216

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e119343-1561-47ba-983b-00d86c68c216
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3e119343-1561-47ba-983b-00d86c68c216
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
correlation: qa-d864e9c9-a8b0-41e1-8c52-d632a1c7ed8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d864e9c9-a8b0-41e1-8c52-d632a1c7ed8a
Content-Type: application/json

--- request body ---
{"handle":"qa-da989db28509","password":"****"}

--- response: 401 in 66 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d864e9c9-a8b0-41e1-8c52-d632a1c7ed8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d864e9c9-a8b0-41e1-8c52-d632a1c7ed8a"}
```
