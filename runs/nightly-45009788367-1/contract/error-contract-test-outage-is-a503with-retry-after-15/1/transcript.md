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
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-d5c8f42f-2c26-40c0-bb1f-ea8cb271ce30` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-72baa98f-1ee0-4dba-ab4e-8ab6fca19c77` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-705c781d-e1ae-4370-bf5f-a552cab372c0` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-b09661f3-b152-4a89-8855-7a282c423da2` |
| 5 | `POST /v1/credits/purchases` | 503 | 12 | `qa-67aeeefb-d0a3-48ad-8859-caa6543e2fae` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-3644a3c8-1536-4fd5-a0d5-5164406eb3fc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-608bddca-d2cf-4962-88d4-bd60466af113` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-6f5592be-3d48-4dc0-b683-3cfba1f908d3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-602ea6aa-cb4d-4325-ad27-ed92e131afdd` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-37d23105-5ddb-435b-ac41-7283bbd744c7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d5c8f42f-2c26-40c0-bb1f-ea8cb271ce30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5c8f42f-2c26-40c0-bb1f-ea8cb271ce30
Content-Type: application/json

--- request body ---
{"handle":"qa-547716920b1b","displayName":"QA 547716920b1b","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5c8f42f-2c26-40c0-bb1f-ea8cb271ce30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 8
Location: /v1/accounts/qa-547716920b1b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_33707e3e-32b6-40de-a4f2-df081a6d13d8","handle":"qa-547716920b1b","displayName":"QA 547716920b1b","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.075588618Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-72baa98f-1ee0-4dba-ab4e-8ab6fca19c77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72baa98f-1ee0-4dba-ab4e-8ab6fca19c77
Content-Type: application/json

--- request body ---
{"handle":"qa-1e390e978d07","displayName":"QA 1e390e978d07","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-72baa98f-1ee0-4dba-ab4e-8ab6fca19c77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 8
Location: /v1/accounts/qa-1e390e978d07
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aea6c22a-0776-4bc2-bf36-0264a43e557d","handle":"qa-1e390e978d07","displayName":"QA 1e390e978d07","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.108912916Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-705c781d-e1ae-4370-bf5f-a552cab372c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-705c781d-e1ae-4370-bf5f-a552cab372c0
Content-Type: application/json

--- request body ---
{"handle":"qa-547716920b1b","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-705c781d-e1ae-4370-bf5f-a552cab372c0
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_33707e3e-32b6-40de-a4f2-df081a6d13d8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b09661f3-b152-4a89-8855-7a282c423da2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b09661f3-b152-4a89-8855-7a282c423da2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1e390e978d07","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-b09661f3-b152-4a89-8855-7a282c423da2
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
Location: /v1/conversations/cnv_882c9088-2068-4c1f-9607-ad15c786f1d5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_882c9088-2068-4c1f-9607-ad15c786f1d5","subject":"Error contract","status":"open","region":"eu","participants":["qa-547716920b1b","qa-1e390e978d07"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:42.145060880Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-67aeeefb-d0a3-48ad-8859-caa6543e2fae

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2a7e91df601b4a4f88c768c5c5c5dc96
X-Fault: unavailable-once
X-Fault-Key: 4ec0352f-9940-4761-9c0d-da69fe23dc9f
X-Correlation-Id: qa-67aeeefb-d0a3-48ad-8859-caa6543e2fae
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67aeeefb-d0a3-48ad-8859-caa6543e2fae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-67aeeefb-d0a3-48ad-8859-caa6543e2fae"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3644a3c8-1536-4fd5-a0d5-5164406eb3fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3644a3c8-1536-4fd5-a0d5-5164406eb3fc
Content-Type: application/json

--- request body ---
{"handle":"qa-1e390e978d07","password":"****"}

--- response: 200 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-3644a3c8-1536-4fd5-a0d5-5164406eb3fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aea6c22a-0776-4bc2-bf36-0264a43e557d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-608bddca-d2cf-4962-88d4-bd60466af113

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-608bddca-d2cf-4962-88d4-bd60466af113
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-608bddca-d2cf-4962-88d4-bd60466af113
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
correlation: qa-6f5592be-3d48-4dc0-b683-3cfba1f908d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f5592be-3d48-4dc0-b683-3cfba1f908d3
Content-Type: application/json

--- request body ---
{"handle":"qa-1e390e978d07","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f5592be-3d48-4dc0-b683-3cfba1f908d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6f5592be-3d48-4dc0-b683-3cfba1f908d3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-602ea6aa-cb4d-4325-ad27-ed92e131afdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-602ea6aa-cb4d-4325-ad27-ed92e131afdd
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-602ea6aa-cb4d-4325-ad27-ed92e131afdd
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
correlation: qa-37d23105-5ddb-435b-ac41-7283bbd744c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37d23105-5ddb-435b-ac41-7283bbd744c7
Content-Type: application/json

--- request body ---
{"handle":"qa-547716920b1b","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37d23105-5ddb-435b-ac41-7283bbd744c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-37d23105-5ddb-435b-ac41-7283bbd744c7"}
```
