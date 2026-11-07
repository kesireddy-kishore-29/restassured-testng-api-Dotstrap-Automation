# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-cfcd2a49-2755-4d95-a3df-4ed6633bf25e` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-48fbb878-4f5d-4a0d-b792-7ea236116cef` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-fa66cc6e-71d3-4602-bb96-46d7ee7b5cc3` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-370057ba-614a-4e6f-8999-2d432d0f589c` |
| 5 | `GET /v1/conversations/{id}` | 503 | 13 | `qa-011ba218-7d3d-4434-807d-ece6da032114` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-857a6902-655e-48d1-923a-0794eb914ee6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-153fcfc8-7794-465b-85f4-c0b6d3caccd0` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-fbf9deff-c10b-4382-abc6-e035008be19e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-79bae27f-5d7c-4df4-b98e-67f99f62d276` |
| 10 | `POST /v1/auth/token` | 401 | 32 | `qa-4e74bfa4-e7cf-4bcc-ad32-e6a689e01878` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cfcd2a49-2755-4d95-a3df-4ed6633bf25e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfcd2a49-2755-4d95-a3df-4ed6633bf25e
Content-Type: application/json

--- request body ---
{"handle":"qa-ea752e163e7c","displayName":"QA ea752e163e7c","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfcd2a49-2755-4d95-a3df-4ed6633bf25e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Location: /v1/accounts/qa-ea752e163e7c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ee7162a5-fbc4-4729-baf1-a395259b15cd","handle":"qa-ea752e163e7c","displayName":"QA ea752e163e7c","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.766276146Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-48fbb878-4f5d-4a0d-b792-7ea236116cef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48fbb878-4f5d-4a0d-b792-7ea236116cef
Content-Type: application/json

--- request body ---
{"handle":"qa-e60f5fe35637","displayName":"QA e60f5fe35637","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-48fbb878-4f5d-4a0d-b792-7ea236116cef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Location: /v1/accounts/qa-e60f5fe35637
X-Served-Region: eu
Content-Length: 181

{"id":"acc_750735c8-d63e-48b7-bee3-bf1bc5db23d6","handle":"qa-e60f5fe35637","displayName":"QA e60f5fe35637","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.797992395Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fa66cc6e-71d3-4602-bb96-46d7ee7b5cc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa66cc6e-71d3-4602-bb96-46d7ee7b5cc3
Content-Type: application/json

--- request body ---
{"handle":"qa-ea752e163e7c","password":"****"}

--- response: 200 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa66cc6e-71d3-4602-bb96-46d7ee7b5cc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ee7162a5-fbc4-4729-baf1-a395259b15cd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-370057ba-614a-4e6f-8999-2d432d0f589c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-370057ba-614a-4e6f-8999-2d432d0f589c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e60f5fe35637","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-370057ba-614a-4e6f-8999-2d432d0f589c
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
Location: /v1/conversations/cnv_1ea11ce4-f8d5-45f4-953f-5616ca031776
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1ea11ce4-f8d5-45f4-953f-5616ca031776","subject":"Error contract","status":"open","region":"eu","participants":["qa-ea752e163e7c","qa-e60f5fe35637"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:58.836435571Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_1ea11ce4-f8d5-45f4-953f-5616ca031776
correlation: qa-011ba218-7d3d-4434-807d-ece6da032114

--- request headers ---
Accept: application/json
X-Fault-Key: a7b8648b-3404-4470-aed6-794236c278e5
X-Fault: unavailable-once
X-Correlation-Id: qa-011ba218-7d3d-4434-807d-ece6da032114
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-011ba218-7d3d-4434-807d-ece6da032114
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_1ea11ce4-f8d5-45f4-953f-5616ca031776","correlationId":"qa-011ba218-7d3d-4434-807d-ece6da032114"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-857a6902-655e-48d1-923a-0794eb914ee6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-857a6902-655e-48d1-923a-0794eb914ee6
Content-Type: application/json

--- request body ---
{"handle":"qa-e60f5fe35637","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-857a6902-655e-48d1-923a-0794eb914ee6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_750735c8-d63e-48b7-bee3-bf1bc5db23d6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-153fcfc8-7794-465b-85f4-c0b6d3caccd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-153fcfc8-7794-465b-85f4-c0b6d3caccd0
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-153fcfc8-7794-465b-85f4-c0b6d3caccd0
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
correlation: qa-fbf9deff-c10b-4382-abc6-e035008be19e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbf9deff-c10b-4382-abc6-e035008be19e
Content-Type: application/json

--- request body ---
{"handle":"qa-e60f5fe35637","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fbf9deff-c10b-4382-abc6-e035008be19e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fbf9deff-c10b-4382-abc6-e035008be19e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-79bae27f-5d7c-4df4-b98e-67f99f62d276

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79bae27f-5d7c-4df4-b98e-67f99f62d276
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-79bae27f-5d7c-4df4-b98e-67f99f62d276
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
correlation: qa-4e74bfa4-e7cf-4bcc-ad32-e6a689e01878

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e74bfa4-e7cf-4bcc-ad32-e6a689e01878
Content-Type: application/json

--- request body ---
{"handle":"qa-ea752e163e7c","password":"****"}

--- response: 401 in 32 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e74bfa4-e7cf-4bcc-ad32-e6a689e01878
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4e74bfa4-e7cf-4bcc-ad32-e6a689e01878"}
```
