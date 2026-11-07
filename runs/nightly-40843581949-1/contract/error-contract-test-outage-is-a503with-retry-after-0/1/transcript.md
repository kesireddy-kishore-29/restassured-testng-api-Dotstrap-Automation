# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 501 | `qa-19716fb3-771f-4df5-90f8-ce48aed88b54` |
| 2 | `POST /v1/accounts` | 201 | 80 | `qa-f30b5cbf-3630-42b2-8ada-7c3c5410663b` |
| 3 | `POST /v1/auth/token` | 200 | 85 | `qa-c21a8760-6f3a-44a7-a35e-c23ed7b280f1` |
| 4 | `POST /v1/conversations` | 201 | 91 | `qa-eb5f0919-8e07-41d1-bb83-df0df66a55b5` |
| 5 | `POST /v1/auth/token` | 503 | 12 | `qa-a2db8d10-e4fc-45ce-a2cc-fe4e79a31eb8` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-0ab222d7-7fd9-4b7a-9591-cf3fe973410e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-ed144996-8d6d-4ff3-a2e8-3650c4bab007` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-4f87dce6-9440-4de9-9af5-03aabff5fa8e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 44 | `qa-e3cd5925-98bb-4de8-9586-f1653fb6d0ee` |
| 10 | `POST /v1/auth/token` | 401 | 43 | `qa-5e129a38-ac39-4256-bcec-4ec5ce45ecea` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-19716fb3-771f-4df5-90f8-ce48aed88b54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19716fb3-771f-4df5-90f8-ce48aed88b54
Content-Type: application/json

--- request body ---
{"handle":"qa-53c067beff56","displayName":"QA 53c067beff56","password":"****","region":"eu"}

--- response: 201 in 501 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-19716fb3-771f-4df5-90f8-ce48aed88b54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-53c067beff56
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88d8d769-9c2a-482d-9ef8-a0872489abcc","handle":"qa-53c067beff56","displayName":"QA 53c067beff56","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.652750360Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f30b5cbf-3630-42b2-8ada-7c3c5410663b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f30b5cbf-3630-42b2-8ada-7c3c5410663b
Content-Type: application/json

--- request body ---
{"handle":"qa-d076c8f69c5f","displayName":"QA d076c8f69c5f","password":"****","region":"eu"}

--- response: 201 in 80 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f30b5cbf-3630-42b2-8ada-7c3c5410663b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-d076c8f69c5f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d0377e6-ee77-4d33-bf28-1cd3cb3e1954","handle":"qa-d076c8f69c5f","displayName":"QA d076c8f69c5f","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.140710608Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c21a8760-6f3a-44a7-a35e-c23ed7b280f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c21a8760-6f3a-44a7-a35e-c23ed7b280f1
Content-Type: application/json

--- request body ---
{"handle":"qa-53c067beff56","password":"****"}

--- response: 200 in 85 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c21a8760-6f3a-44a7-a35e-c23ed7b280f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_88d8d769-9c2a-482d-9ef8-a0872489abcc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-eb5f0919-8e07-41d1-bb83-df0df66a55b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb5f0919-8e07-41d1-bb83-df0df66a55b5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d076c8f69c5f","subject":"Error contract","message":"Hi"}

--- response: 201 in 91 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb5f0919-8e07-41d1-bb83-df0df66a55b5
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
Location: /v1/conversations/cnv_37a86f09-f46f-4601-a105-708f480e8890
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_37a86f09-f46f-4601-a105-708f480e8890","subject":"Error contract","status":"open","region":"eu","participants":["qa-53c067beff56","qa-d076c8f69c5f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.472077233Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a2db8d10-e4fc-45ce-a2cc-fe4e79a31eb8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b112a0e1-8d2b-43ed-bfeb-9c42ba6af69f
X-Correlation-Id: qa-a2db8d10-e4fc-45ce-a2cc-fe4e79a31eb8
Content-Type: application/json

--- request body ---
{"handle":"qa-53c067beff56","password":"****"}

--- response: 503 in 12 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2db8d10-e4fc-45ce-a2cc-fe4e79a31eb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-a2db8d10-e4fc-45ce-a2cc-fe4e79a31eb8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0ab222d7-7fd9-4b7a-9591-cf3fe973410e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ab222d7-7fd9-4b7a-9591-cf3fe973410e
Content-Type: application/json

--- request body ---
{"handle":"qa-d076c8f69c5f","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ab222d7-7fd9-4b7a-9591-cf3fe973410e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d0377e6-ee77-4d33-bf28-1cd3cb3e1954"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ed144996-8d6d-4ff3-a2e8-3650c4bab007

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed144996-8d6d-4ff3-a2e8-3650c4bab007
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ed144996-8d6d-4ff3-a2e8-3650c4bab007
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
correlation: qa-4f87dce6-9440-4de9-9af5-03aabff5fa8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f87dce6-9440-4de9-9af5-03aabff5fa8e
Content-Type: application/json

--- request body ---
{"handle":"qa-d076c8f69c5f","password":"****"}

--- response: 401 in 28 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f87dce6-9440-4de9-9af5-03aabff5fa8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f87dce6-9440-4de9-9af5-03aabff5fa8e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3cd5925-98bb-4de8-9586-f1653fb6d0ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3cd5925-98bb-4de8-9586-f1653fb6d0ee
Content-Type: application/json

--- response: 204 in 44 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3cd5925-98bb-4de8-9586-f1653fb6d0ee
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
correlation: qa-5e129a38-ac39-4256-bcec-4ec5ce45ecea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e129a38-ac39-4256-bcec-4ec5ce45ecea
Content-Type: application/json

--- request body ---
{"handle":"qa-53c067beff56","password":"****"}

--- response: 401 in 43 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e129a38-ac39-4256-bcec-4ec5ce45ecea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5e129a38-ac39-4256-bcec-4ec5ce45ecea"}
```
