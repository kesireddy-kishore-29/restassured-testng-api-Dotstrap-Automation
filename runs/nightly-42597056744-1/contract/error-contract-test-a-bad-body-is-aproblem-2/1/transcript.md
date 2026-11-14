# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-3e97dc7e-64fa-4219-91e3-81862d96e5c3` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-95aaf510-bd42-42ec-96f8-ca0c6c79bb0e` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-34f771f4-d77f-4bc6-a235-9128a27e5b25` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-5609dda3-61c9-4695-acc3-32877af83c44` |
| 5 | `POST /v1/auth/token` | 422 | 39 | `qa-2dc25fac-a06c-49ad-a028-7f1159e34663` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-a83c879a-ae6e-4243-9f0c-90824fb13f2d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-f04a680e-edb6-4cd2-b019-4ee92ebb07e0` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-8528c092-22c2-45b7-9ab5-1ee79965d828` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-4ac15a3d-934e-4609-a956-d2479566357c` |
| 10 | `POST /v1/auth/token` | 401 | 41 | `qa-67eafac4-e9ff-41e1-944c-6f576f791c64` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3e97dc7e-64fa-4219-91e3-81862d96e5c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e97dc7e-64fa-4219-91e3-81862d96e5c3
Content-Type: application/json

--- request body ---
{"handle":"qa-f872076288b0","displayName":"QA f872076288b0","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e97dc7e-64fa-4219-91e3-81862d96e5c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-f872076288b0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b8b229b-ebee-49ab-9636-ce20315bc2ca","handle":"qa-f872076288b0","displayName":"QA f872076288b0","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.858942335Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-95aaf510-bd42-42ec-96f8-ca0c6c79bb0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95aaf510-bd42-42ec-96f8-ca0c6c79bb0e
Content-Type: application/json

--- request body ---
{"handle":"qa-e3efe4a0208f","displayName":"QA e3efe4a0208f","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-95aaf510-bd42-42ec-96f8-ca0c6c79bb0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-e3efe4a0208f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0838e2f1-a149-4063-8873-1513871990db","handle":"qa-e3efe4a0208f","displayName":"QA e3efe4a0208f","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.899094250Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-34f771f4-d77f-4bc6-a235-9128a27e5b25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34f771f4-d77f-4bc6-a235-9128a27e5b25
Content-Type: application/json

--- request body ---
{"handle":"qa-f872076288b0","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-34f771f4-d77f-4bc6-a235-9128a27e5b25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b8b229b-ebee-49ab-9636-ce20315bc2ca"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5609dda3-61c9-4695-acc3-32877af83c44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5609dda3-61c9-4695-acc3-32877af83c44
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e3efe4a0208f","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5609dda3-61c9-4695-acc3-32877af83c44
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
Location: /v1/conversations/cnv_99b786c8-4eca-4932-83c1-896d53ef806c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_99b786c8-4eca-4932-83c1-896d53ef806c","subject":"Error contract","status":"open","region":"eu","participants":["qa-f872076288b0","qa-e3efe4a0208f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:01.978047707Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2dc25fac-a06c-49ad-a028-7f1159e34663

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dc25fac-a06c-49ad-a028-7f1159e34663
Content-Type: application/json

--- request body ---
{"handle":"qa-f872076288b0","password":"****","ttlSeconds":0}

--- response: 422 in 39 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2dc25fac-a06c-49ad-a028-7f1159e34663
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 10
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-2dc25fac-a06c-49ad-a028-7f1159e34663","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a83c879a-ae6e-4243-9f0c-90824fb13f2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a83c879a-ae6e-4243-9f0c-90824fb13f2d
Content-Type: application/json

--- request body ---
{"handle":"qa-e3efe4a0208f","password":"****"}

--- response: 200 in 49 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a83c879a-ae6e-4243-9f0c-90824fb13f2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0838e2f1-a149-4063-8873-1513871990db"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f04a680e-edb6-4cd2-b019-4ee92ebb07e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f04a680e-edb6-4cd2-b019-4ee92ebb07e0
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f04a680e-edb6-4cd2-b019-4ee92ebb07e0
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
correlation: qa-8528c092-22c2-45b7-9ab5-1ee79965d828

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8528c092-22c2-45b7-9ab5-1ee79965d828
Content-Type: application/json

--- request body ---
{"handle":"qa-e3efe4a0208f","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8528c092-22c2-45b7-9ab5-1ee79965d828
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8528c092-22c2-45b7-9ab5-1ee79965d828"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4ac15a3d-934e-4609-a956-d2479566357c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ac15a3d-934e-4609-a956-d2479566357c
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4ac15a3d-934e-4609-a956-d2479566357c
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
correlation: qa-67eafac4-e9ff-41e1-944c-6f576f791c64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67eafac4-e9ff-41e1-944c-6f576f791c64
Content-Type: application/json

--- request body ---
{"handle":"qa-f872076288b0","password":"****"}

--- response: 401 in 41 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67eafac4-e9ff-41e1-944c-6f576f791c64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67eafac4-e9ff-41e1-944c-6f576f791c64"}
```
