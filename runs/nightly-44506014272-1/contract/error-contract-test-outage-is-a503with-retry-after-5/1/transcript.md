# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-fc9fb319-6963-4d2a-b240-e92922c87953` |
| 2 | `POST /v1/accounts` | 201 | 72 | `qa-92b9dc6c-e07c-47ff-93e1-fc636987bf63` |
| 3 | `POST /v1/auth/token` | 200 | 57 | `qa-78149f4c-070c-46be-96bf-fe7fe39cf28d` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-731ecf41-79b3-409d-b79a-d7a8a5f73b05` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 34 | `qa-102d4f45-45d1-4963-a78e-77e697cfb1cb` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-2cd1b991-b58a-4227-b764-1f199736f0be` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-b659dd27-2c98-48bb-af84-c81335847857` |
| 8 | `POST /v1/auth/token` | 401 | 33 | `qa-98c426f9-936d-4b9b-94e0-85e235a4c203` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-3b9fa6fa-cb52-4391-812d-818df207dd9a` |
| 10 | `POST /v1/auth/token` | 401 | 43 | `qa-4936c968-78f6-4e12-bcf2-d622e3bab491` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fc9fb319-6963-4d2a-b240-e92922c87953

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc9fb319-6963-4d2a-b240-e92922c87953
Content-Type: application/json

--- request body ---
{"handle":"qa-6d407571f302","displayName":"QA 6d407571f302","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc9fb319-6963-4d2a-b240-e92922c87953
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 7
Location: /v1/accounts/qa-6d407571f302
X-Served-Region: eu
Content-Length: 181

{"id":"acc_23d134ba-8bd0-431b-9859-33ca67a37a91","handle":"qa-6d407571f302","displayName":"QA 6d407571f302","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.304117595Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-92b9dc6c-e07c-47ff-93e1-fc636987bf63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92b9dc6c-e07c-47ff-93e1-fc636987bf63
Content-Type: application/json

--- request body ---
{"handle":"qa-981926dffe15","displayName":"QA 981926dffe15","password":"****","region":"eu"}

--- response: 201 in 72 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-92b9dc6c-e07c-47ff-93e1-fc636987bf63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 7
Location: /v1/accounts/qa-981926dffe15
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c5af4765-a6d5-43e0-bf81-81a551480ab4","handle":"qa-981926dffe15","displayName":"QA 981926dffe15","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.414369651Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-78149f4c-070c-46be-96bf-fe7fe39cf28d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78149f4c-070c-46be-96bf-fe7fe39cf28d
Content-Type: application/json

--- request body ---
{"handle":"qa-6d407571f302","password":"****"}

--- response: 200 in 57 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-78149f4c-070c-46be-96bf-fe7fe39cf28d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23d134ba-8bd0-431b-9859-33ca67a37a91"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-731ecf41-79b3-409d-b79a-d7a8a5f73b05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-731ecf41-79b3-409d-b79a-d7a8a5f73b05
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-981926dffe15","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-731ecf41-79b3-409d-b79a-d7a8a5f73b05
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
Location: /v1/conversations/cnv_421e04da-93b8-4b78-899b-3ef6c7c1075e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_421e04da-93b8-4b78-899b-3ef6c7c1075e","subject":"Error contract","status":"open","region":"eu","participants":["qa-6d407571f302","qa-981926dffe15"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:25.543698271Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-6d407571f302
correlation: qa-102d4f45-45d1-4963-a78e-77e697cfb1cb

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 5e1c3ef3-c46e-4ebd-bcf8-1bd3c55dbfe3
X-Correlation-Id: qa-102d4f45-45d1-4963-a78e-77e697cfb1cb
Content-Type: application/json

--- response: 503 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-102d4f45-45d1-4963-a78e-77e697cfb1cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-6d407571f302","correlationId":"qa-102d4f45-45d1-4963-a78e-77e697cfb1cb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2cd1b991-b58a-4227-b764-1f199736f0be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cd1b991-b58a-4227-b764-1f199736f0be
Content-Type: application/json

--- request body ---
{"handle":"qa-981926dffe15","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cd1b991-b58a-4227-b764-1f199736f0be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c5af4765-a6d5-43e0-bf81-81a551480ab4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b659dd27-2c98-48bb-af84-c81335847857

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b659dd27-2c98-48bb-af84-c81335847857
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b659dd27-2c98-48bb-af84-c81335847857
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
correlation: qa-98c426f9-936d-4b9b-94e0-85e235a4c203

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98c426f9-936d-4b9b-94e0-85e235a4c203
Content-Type: application/json

--- request body ---
{"handle":"qa-981926dffe15","password":"****"}

--- response: 401 in 33 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98c426f9-936d-4b9b-94e0-85e235a4c203
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-98c426f9-936d-4b9b-94e0-85e235a4c203"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b9fa6fa-cb52-4391-812d-818df207dd9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b9fa6fa-cb52-4391-812d-818df207dd9a
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b9fa6fa-cb52-4391-812d-818df207dd9a
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
correlation: qa-4936c968-78f6-4e12-bcf2-d622e3bab491

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4936c968-78f6-4e12-bcf2-d622e3bab491
Content-Type: application/json

--- request body ---
{"handle":"qa-6d407571f302","password":"****"}

--- response: 401 in 43 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4936c968-78f6-4e12-bcf2-d622e3bab491
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4936c968-78f6-4e12-bcf2-d622e3bab491"}
```
