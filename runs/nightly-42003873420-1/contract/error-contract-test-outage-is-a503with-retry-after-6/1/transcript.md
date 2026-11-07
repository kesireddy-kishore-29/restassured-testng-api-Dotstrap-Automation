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
| 1 | `POST /v1/accounts` | 201 | 56 | `qa-c0e9bf80-d6a5-4e90-b273-4902975526b9` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-68695092-f510-4103-9047-f1d6c099d740` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-b82713fd-8b2b-4c27-9730-720c9277dfcc` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-6a377a4c-9bfb-462d-a0b7-7953f65fb01b` |
| 5 | `POST /v1/conversations` | 503 | 19 | `qa-1f127485-13e2-4703-94af-9d61fc93d93e` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-7322fb8a-dab1-4461-95ee-75e896c43338` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-80f7c35b-d087-4953-8a46-b676339f2731` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-a4c11c90-b1ac-4ed8-ab52-c64082ef0dad` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-c5a164d6-3e6e-4b5e-98bd-69adb29dfe98` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-bf7acc2f-a9ed-4bf7-a33a-2a5de91f959b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c0e9bf80-d6a5-4e90-b273-4902975526b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0e9bf80-d6a5-4e90-b273-4902975526b9
Content-Type: application/json

--- request body ---
{"handle":"qa-ffd4fcd6a6b6","displayName":"QA ffd4fcd6a6b6","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0e9bf80-d6a5-4e90-b273-4902975526b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Location: /v1/accounts/qa-ffd4fcd6a6b6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ad39607a-5b7e-4f97-a2b8-fe12d502ef5c","handle":"qa-ffd4fcd6a6b6","displayName":"QA ffd4fcd6a6b6","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.499077429Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-68695092-f510-4103-9047-f1d6c099d740

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68695092-f510-4103-9047-f1d6c099d740
Content-Type: application/json

--- request body ---
{"handle":"qa-7ee1e0fb43e4","displayName":"QA 7ee1e0fb43e4","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-68695092-f510-4103-9047-f1d6c099d740
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 7
Location: /v1/accounts/qa-7ee1e0fb43e4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e6edfed6-39e4-4f84-8713-0ff13e77d783","handle":"qa-7ee1e0fb43e4","displayName":"QA 7ee1e0fb43e4","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.573987178Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b82713fd-8b2b-4c27-9730-720c9277dfcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b82713fd-8b2b-4c27-9730-720c9277dfcc
Content-Type: application/json

--- request body ---
{"handle":"qa-ffd4fcd6a6b6","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-b82713fd-8b2b-4c27-9730-720c9277dfcc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ad39607a-5b7e-4f97-a2b8-fe12d502ef5c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6a377a4c-9bfb-462d-a0b7-7953f65fb01b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a377a4c-9bfb-462d-a0b7-7953f65fb01b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7ee1e0fb43e4","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a377a4c-9bfb-462d-a0b7-7953f65fb01b
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
Location: /v1/conversations/cnv_31bb45b6-cba7-4909-b904-3a3d88566bcf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_31bb45b6-cba7-4909-b904-3a3d88566bcf","subject":"Error contract","status":"open","region":"eu","participants":["qa-ffd4fcd6a6b6","qa-7ee1e0fb43e4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:55.663768826Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-1f127485-13e2-4703-94af-9d61fc93d93e

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f1ab58b5-8563-45e4-9e03-ae7f2fcc79c1
X-Correlation-Id: qa-1f127485-13e2-4703-94af-9d61fc93d93e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ffd4fcd6a6b6","subject":"Probe","message":"Hi"}

--- response: 503 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f127485-13e2-4703-94af-9d61fc93d93e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-1f127485-13e2-4703-94af-9d61fc93d93e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7322fb8a-dab1-4461-95ee-75e896c43338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7322fb8a-dab1-4461-95ee-75e896c43338
Content-Type: application/json

--- request body ---
{"handle":"qa-7ee1e0fb43e4","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-7322fb8a-dab1-4461-95ee-75e896c43338
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6edfed6-39e4-4f84-8713-0ff13e77d783"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-80f7c35b-d087-4953-8a46-b676339f2731

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80f7c35b-d087-4953-8a46-b676339f2731
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-80f7c35b-d087-4953-8a46-b676339f2731
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
correlation: qa-a4c11c90-b1ac-4ed8-ab52-c64082ef0dad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4c11c90-b1ac-4ed8-ab52-c64082ef0dad
Content-Type: application/json

--- request body ---
{"handle":"qa-7ee1e0fb43e4","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4c11c90-b1ac-4ed8-ab52-c64082ef0dad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4c11c90-b1ac-4ed8-ab52-c64082ef0dad"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c5a164d6-3e6e-4b5e-98bd-69adb29dfe98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5a164d6-3e6e-4b5e-98bd-69adb29dfe98
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c5a164d6-3e6e-4b5e-98bd-69adb29dfe98
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
correlation: qa-bf7acc2f-a9ed-4bf7-a33a-2a5de91f959b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf7acc2f-a9ed-4bf7-a33a-2a5de91f959b
Content-Type: application/json

--- request body ---
{"handle":"qa-ffd4fcd6a6b6","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf7acc2f-a9ed-4bf7-a33a-2a5de91f959b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf7acc2f-a9ed-4bf7-a33a-2a5de91f959b"}
```
