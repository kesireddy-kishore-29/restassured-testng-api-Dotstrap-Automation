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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-a04dfc42-45fe-43f2-a75d-83fbd611f799` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-0ef41937-3b1e-4ea0-a14c-e6df25a37359` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-31e19171-a8ab-4df9-ac81-67da0afe1a00` |
| 4 | `POST /v1/conversations` | 201 | 59 | `qa-f5f867dd-0c98-4d98-bdeb-3e4435ed5c83` |
| 5 | `POST /v1/credits/purchases` | 503 | 38 | `qa-f3aa3fc9-bd4a-4f43-ba5d-f7ff4791d4b2` |
| 6 | `POST /v1/auth/token` | 200 | 77 | `qa-f02340c5-cab1-4254-8b80-8bcc73a4ffe7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-4f9353bb-92df-4c12-91ba-3f067ed8ab80` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-bce9cb0c-e21b-41d5-a9e3-1e653909846a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-b5ffa9ed-43db-421c-a88f-8089b37b9f0c` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-0a596637-8406-4628-b234-9c9ef6f7cc99` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a04dfc42-45fe-43f2-a75d-83fbd611f799

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a04dfc42-45fe-43f2-a75d-83fbd611f799
Content-Type: application/json

--- request body ---
{"handle":"qa-d28a0843552c","displayName":"QA d28a0843552c","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a04dfc42-45fe-43f2-a75d-83fbd611f799
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Location: /v1/accounts/qa-d28a0843552c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b017a150-e6fa-41c6-a832-8c6bc25433a5","handle":"qa-d28a0843552c","displayName":"QA d28a0843552c","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.001224880Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0ef41937-3b1e-4ea0-a14c-e6df25a37359

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ef41937-3b1e-4ea0-a14c-e6df25a37359
Content-Type: application/json

--- request body ---
{"handle":"qa-a9c2d8c0a23c","displayName":"QA a9c2d8c0a23c","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ef41937-3b1e-4ea0-a14c-e6df25a37359
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 7
Location: /v1/accounts/qa-a9c2d8c0a23c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b4893cba-f933-45c7-9f11-ec5e8b7219bb","handle":"qa-a9c2d8c0a23c","displayName":"QA a9c2d8c0a23c","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.049106889Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-31e19171-a8ab-4df9-ac81-67da0afe1a00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31e19171-a8ab-4df9-ac81-67da0afe1a00
Content-Type: application/json

--- request body ---
{"handle":"qa-d28a0843552c","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-31e19171-a8ab-4df9-ac81-67da0afe1a00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b017a150-e6fa-41c6-a832-8c6bc25433a5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f5f867dd-0c98-4d98-bdeb-3e4435ed5c83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5f867dd-0c98-4d98-bdeb-3e4435ed5c83
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a9c2d8c0a23c","subject":"Error contract","message":"Hi"}

--- response: 201 in 59 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5f867dd-0c98-4d98-bdeb-3e4435ed5c83
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
Location: /v1/conversations/cnv_c11c3ec2-9f33-476a-af4c-2f4c18ef9209
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c11c3ec2-9f33-476a-af4c-2f4c18ef9209","subject":"Error contract","status":"open","region":"eu","participants":["qa-d28a0843552c","qa-a9c2d8c0a23c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:05.166130382Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f3aa3fc9-bd4a-4f43-ba5d-f7ff4791d4b2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6876032e54074d928c0806db1397f8b1
X-Fault: unavailable-once
X-Fault-Key: ff5ab77a-2099-42ed-b9e1-1cda8abdbd8c
X-Correlation-Id: qa-f3aa3fc9-bd4a-4f43-ba5d-f7ff4791d4b2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 38 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3aa3fc9-bd4a-4f43-ba5d-f7ff4791d4b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-f3aa3fc9-bd4a-4f43-ba5d-f7ff4791d4b2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f02340c5-cab1-4254-8b80-8bcc73a4ffe7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f02340c5-cab1-4254-8b80-8bcc73a4ffe7
Content-Type: application/json

--- request body ---
{"handle":"qa-a9c2d8c0a23c","password":"****"}

--- response: 200 in 77 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f02340c5-cab1-4254-8b80-8bcc73a4ffe7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b4893cba-f933-45c7-9f11-ec5e8b7219bb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f9353bb-92df-4c12-91ba-3f067ed8ab80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f9353bb-92df-4c12-91ba-3f067ed8ab80
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f9353bb-92df-4c12-91ba-3f067ed8ab80
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
correlation: qa-bce9cb0c-e21b-41d5-a9e3-1e653909846a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bce9cb0c-e21b-41d5-a9e3-1e653909846a
Content-Type: application/json

--- request body ---
{"handle":"qa-a9c2d8c0a23c","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bce9cb0c-e21b-41d5-a9e3-1e653909846a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bce9cb0c-e21b-41d5-a9e3-1e653909846a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b5ffa9ed-43db-421c-a88f-8089b37b9f0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5ffa9ed-43db-421c-a88f-8089b37b9f0c
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b5ffa9ed-43db-421c-a88f-8089b37b9f0c
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
correlation: qa-0a596637-8406-4628-b234-9c9ef6f7cc99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a596637-8406-4628-b234-9c9ef6f7cc99
Content-Type: application/json

--- request body ---
{"handle":"qa-d28a0843552c","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a596637-8406-4628-b234-9c9ef6f7cc99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0a596637-8406-4628-b234-9c9ef6f7cc99"}
```
