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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-82887ec3-556a-4731-bcb0-57fb21ec8dd8` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-022f1254-e507-4d3f-9f3b-1e0ce1ab7e64` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-828353fb-a7a5-4d47-9984-d227dfd5e94f` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-79813109-4707-4253-a560-264e9d7969ec` |
| 5 | `POST /v1/auth/token` | 503 | 20 | `qa-4fe3e00a-8d88-4cce-95ce-3891a7d65fb0` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-43d074ee-97de-4ffb-b620-011943b2e336` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-c5166947-da62-498f-81cc-28452afb36da` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-bd060b46-dab7-4ba6-83b7-e26615138d0f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-de387455-f317-4311-9201-67334c0987ae` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-32f4a64e-b514-42a2-ad91-237467f53328` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-82887ec3-556a-4731-bcb0-57fb21ec8dd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82887ec3-556a-4731-bcb0-57fb21ec8dd8
Content-Type: application/json

--- request body ---
{"handle":"qa-34f9d74f253e","displayName":"QA 34f9d74f253e","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-82887ec3-556a-4731-bcb0-57fb21ec8dd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-34f9d74f253e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_19222c49-0ffa-425b-a0bb-69ef67213cfe","handle":"qa-34f9d74f253e","displayName":"QA 34f9d74f253e","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.626267504Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-022f1254-e507-4d3f-9f3b-1e0ce1ab7e64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-022f1254-e507-4d3f-9f3b-1e0ce1ab7e64
Content-Type: application/json

--- request body ---
{"handle":"qa-c186298b566a","displayName":"QA c186298b566a","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-022f1254-e507-4d3f-9f3b-1e0ce1ab7e64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-c186298b566a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_afa56eba-3aa0-487c-8fc8-2754b3581312","handle":"qa-c186298b566a","displayName":"QA c186298b566a","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.664275228Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-828353fb-a7a5-4d47-9984-d227dfd5e94f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-828353fb-a7a5-4d47-9984-d227dfd5e94f
Content-Type: application/json

--- request body ---
{"handle":"qa-34f9d74f253e","password":"****"}

--- response: 200 in 45 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-828353fb-a7a5-4d47-9984-d227dfd5e94f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19222c49-0ffa-425b-a0bb-69ef67213cfe"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-79813109-4707-4253-a560-264e9d7969ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79813109-4707-4253-a560-264e9d7969ec
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c186298b566a","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-79813109-4707-4253-a560-264e9d7969ec
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
Location: /v1/conversations/cnv_f62a0dc3-80d0-4077-94ea-2ce0b9f8dfc4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f62a0dc3-80d0-4077-94ea-2ce0b9f8dfc4","subject":"Error contract","status":"open","region":"eu","participants":["qa-34f9d74f253e","qa-c186298b566a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.773865626Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4fe3e00a-8d88-4cce-95ce-3891a7d65fb0

--- request headers ---
Accept: application/json
X-Fault-Key: 45f5b127-9c02-44a6-b1d2-5c465f2ea2ff
X-Fault: unavailable-once
X-Correlation-Id: qa-4fe3e00a-8d88-4cce-95ce-3891a7d65fb0
Content-Type: application/json

--- request body ---
{"handle":"qa-34f9d74f253e","password":"****"}

--- response: 503 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4fe3e00a-8d88-4cce-95ce-3891a7d65fb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-4fe3e00a-8d88-4cce-95ce-3891a7d65fb0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-43d074ee-97de-4ffb-b620-011943b2e336

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43d074ee-97de-4ffb-b620-011943b2e336
Content-Type: application/json

--- request body ---
{"handle":"qa-c186298b566a","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-43d074ee-97de-4ffb-b620-011943b2e336
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_afa56eba-3aa0-487c-8fc8-2754b3581312"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c5166947-da62-498f-81cc-28452afb36da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5166947-da62-498f-81cc-28452afb36da
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c5166947-da62-498f-81cc-28452afb36da
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
correlation: qa-bd060b46-dab7-4ba6-83b7-e26615138d0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd060b46-dab7-4ba6-83b7-e26615138d0f
Content-Type: application/json

--- request body ---
{"handle":"qa-c186298b566a","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd060b46-dab7-4ba6-83b7-e26615138d0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bd060b46-dab7-4ba6-83b7-e26615138d0f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-de387455-f317-4311-9201-67334c0987ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de387455-f317-4311-9201-67334c0987ae
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-de387455-f317-4311-9201-67334c0987ae
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
correlation: qa-32f4a64e-b514-42a2-ad91-237467f53328

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32f4a64e-b514-42a2-ad91-237467f53328
Content-Type: application/json

--- request body ---
{"handle":"qa-34f9d74f253e","password":"****"}

--- response: 401 in 30 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32f4a64e-b514-42a2-ad91-237467f53328
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-32f4a64e-b514-42a2-ad91-237467f53328"}
```
