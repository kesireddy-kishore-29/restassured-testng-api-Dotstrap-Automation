# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-bd83796a-624f-4d77-a2ad-a616fb609824` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-10331cbd-8d40-41ae-bfc8-f45546fddd25` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-8c1114f9-da9d-4f2f-a5a3-58556efdad9a` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-8f608740-714e-4fcd-bf83-cf8e0d1b731c` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 17 | `qa-c2827985-b542-4a02-bbc6-b75062474867` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-adb56763-10b8-43b7-b900-acdcd7c5b2a1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-bcace2c8-7941-45bb-bce8-5895db0fb8d8` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-d4858cf5-8c3f-4c28-99a2-acc49f94205e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-bb7d6184-4a27-443c-a524-bb3d98d58ed5` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-cbf38645-0c7f-4920-b77d-056ef9d6e43b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bd83796a-624f-4d77-a2ad-a616fb609824

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd83796a-624f-4d77-a2ad-a616fb609824
Content-Type: application/json

--- request body ---
{"handle":"qa-b889e8f1189b","displayName":"QA b889e8f1189b","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd83796a-624f-4d77-a2ad-a616fb609824
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Location: /v1/accounts/qa-b889e8f1189b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ef714289-17d6-4cce-b130-bc0ec4c8975c","handle":"qa-b889e8f1189b","displayName":"QA b889e8f1189b","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.155283030Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-10331cbd-8d40-41ae-bfc8-f45546fddd25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10331cbd-8d40-41ae-bfc8-f45546fddd25
Content-Type: application/json

--- request body ---
{"handle":"qa-cc31f0ba4d17","displayName":"QA cc31f0ba4d17","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-10331cbd-8d40-41ae-bfc8-f45546fddd25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Location: /v1/accounts/qa-cc31f0ba4d17
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2e1fa5c8-999e-46d6-927c-5dc20c59d6ec","handle":"qa-cc31f0ba4d17","displayName":"QA cc31f0ba4d17","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.183974965Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8c1114f9-da9d-4f2f-a5a3-58556efdad9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c1114f9-da9d-4f2f-a5a3-58556efdad9a
Content-Type: application/json

--- request body ---
{"handle":"qa-b889e8f1189b","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c1114f9-da9d-4f2f-a5a3-58556efdad9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ef714289-17d6-4cce-b130-bc0ec4c8975c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8f608740-714e-4fcd-bf83-cf8e0d1b731c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f608740-714e-4fcd-bf83-cf8e0d1b731c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cc31f0ba4d17","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f608740-714e-4fcd-bf83-cf8e0d1b731c
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
Location: /v1/conversations/cnv_b398d268-04db-42bf-9d29-810f5451c889
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b398d268-04db-42bf-9d29-810f5451c889","subject":"Error contract","status":"open","region":"eu","participants":["qa-b889e8f1189b","qa-cc31f0ba4d17"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:37.260082245Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_b398d268-04db-42bf-9d29-810f5451c889/close
correlation: qa-c2827985-b542-4a02-bbc6-b75062474867

--- request headers ---
Accept: application/json
X-Fault-Key: a786e7eb-6e97-4780-bf52-be1dbcba4a9d
X-Fault: unavailable-once
X-Correlation-Id: qa-c2827985-b542-4a02-bbc6-b75062474867
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2827985-b542-4a02-bbc6-b75062474867
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_b398d268-04db-42bf-9d29-810f5451c889/close","correlationId":"qa-c2827985-b542-4a02-bbc6-b75062474867"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-adb56763-10b8-43b7-b900-acdcd7c5b2a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adb56763-10b8-43b7-b900-acdcd7c5b2a1
Content-Type: application/json

--- request body ---
{"handle":"qa-cc31f0ba4d17","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-adb56763-10b8-43b7-b900-acdcd7c5b2a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2e1fa5c8-999e-46d6-927c-5dc20c59d6ec"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bcace2c8-7941-45bb-bce8-5895db0fb8d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcace2c8-7941-45bb-bce8-5895db0fb8d8
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bcace2c8-7941-45bb-bce8-5895db0fb8d8
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
correlation: qa-d4858cf5-8c3f-4c28-99a2-acc49f94205e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4858cf5-8c3f-4c28-99a2-acc49f94205e
Content-Type: application/json

--- request body ---
{"handle":"qa-cc31f0ba4d17","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4858cf5-8c3f-4c28-99a2-acc49f94205e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d4858cf5-8c3f-4c28-99a2-acc49f94205e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bb7d6184-4a27-443c-a524-bb3d98d58ed5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb7d6184-4a27-443c-a524-bb3d98d58ed5
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bb7d6184-4a27-443c-a524-bb3d98d58ed5
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
correlation: qa-cbf38645-0c7f-4920-b77d-056ef9d6e43b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbf38645-0c7f-4920-b77d-056ef9d6e43b
Content-Type: application/json

--- request body ---
{"handle":"qa-b889e8f1189b","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cbf38645-0c7f-4920-b77d-056ef9d6e43b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cbf38645-0c7f-4920-b77d-056ef9d6e43b"}
```
