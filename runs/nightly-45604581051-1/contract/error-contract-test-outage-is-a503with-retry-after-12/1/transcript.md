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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-362078d0-b32a-4e63-9f3c-9dae2bf2c784` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-bd67d519-62e6-497a-9d3c-5ec599b5f69a` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-ed674cad-2417-4adf-bf5c-645acfb765a8` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-e1be195a-ff52-4cad-b433-8dd6dead6a03` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 5 | `qa-c3eb0bac-6373-4cee-b2d6-3288634a33a8` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-2689533c-c004-4298-8f60-36255cda203d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-9038329b-5e19-4990-ad44-09fa9137d2bf` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-81b3194a-cb24-439e-9d77-b822dc226628` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-0b82b4af-57cd-4dfe-943c-c6e476a0c606` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-743153ad-d6d9-4cf5-8d48-26bb2588dd66` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-362078d0-b32a-4e63-9f3c-9dae2bf2c784

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-362078d0-b32a-4e63-9f3c-9dae2bf2c784
Content-Type: application/json

--- request body ---
{"handle":"qa-df3302a67268","displayName":"QA df3302a67268","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-362078d0-b32a-4e63-9f3c-9dae2bf2c784
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 8
Location: /v1/accounts/qa-df3302a67268
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9db0688-904c-441c-9be9-cfcd1cacdc8e","handle":"qa-df3302a67268","displayName":"QA df3302a67268","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.146418840Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bd67d519-62e6-497a-9d3c-5ec599b5f69a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd67d519-62e6-497a-9d3c-5ec599b5f69a
Content-Type: application/json

--- request body ---
{"handle":"qa-296df147cc7c","displayName":"QA 296df147cc7c","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd67d519-62e6-497a-9d3c-5ec599b5f69a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 8
Location: /v1/accounts/qa-296df147cc7c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_60237ff0-49c1-420f-b703-fe03b34bbf24","handle":"qa-296df147cc7c","displayName":"QA 296df147cc7c","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.161467109Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ed674cad-2417-4adf-bf5c-645acfb765a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed674cad-2417-4adf-bf5c-645acfb765a8
Content-Type: application/json

--- request body ---
{"handle":"qa-df3302a67268","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed674cad-2417-4adf-bf5c-645acfb765a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9db0688-904c-441c-9be9-cfcd1cacdc8e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e1be195a-ff52-4cad-b433-8dd6dead6a03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1be195a-ff52-4cad-b433-8dd6dead6a03
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-296df147cc7c","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1be195a-ff52-4cad-b433-8dd6dead6a03
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
Location: /v1/conversations/cnv_3977b63f-76ba-4b73-8908-bd4bcc10c564
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3977b63f-76ba-4b73-8908-bd4bcc10c564","subject":"Error contract","status":"open","region":"eu","participants":["qa-df3302a67268","qa-296df147cc7c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.206110872Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_3977b63f-76ba-4b73-8908-bd4bcc10c564/close
correlation: qa-c3eb0bac-6373-4cee-b2d6-3288634a33a8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f681c03e-6d5d-49ca-9966-ca564d7ba6c2
X-Correlation-Id: qa-c3eb0bac-6373-4cee-b2d6-3288634a33a8
Content-Type: application/json

--- response: 503 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3eb0bac-6373-4cee-b2d6-3288634a33a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_3977b63f-76ba-4b73-8908-bd4bcc10c564/close","correlationId":"qa-c3eb0bac-6373-4cee-b2d6-3288634a33a8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2689533c-c004-4298-8f60-36255cda203d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2689533c-c004-4298-8f60-36255cda203d
Content-Type: application/json

--- request body ---
{"handle":"qa-296df147cc7c","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2689533c-c004-4298-8f60-36255cda203d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_60237ff0-49c1-420f-b703-fe03b34bbf24"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9038329b-5e19-4990-ad44-09fa9137d2bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9038329b-5e19-4990-ad44-09fa9137d2bf
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9038329b-5e19-4990-ad44-09fa9137d2bf
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
correlation: qa-81b3194a-cb24-439e-9d77-b822dc226628

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81b3194a-cb24-439e-9d77-b822dc226628
Content-Type: application/json

--- request body ---
{"handle":"qa-296df147cc7c","password":"****"}

--- response: 401 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81b3194a-cb24-439e-9d77-b822dc226628
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-81b3194a-cb24-439e-9d77-b822dc226628"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b82b4af-57cd-4dfe-943c-c6e476a0c606

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b82b4af-57cd-4dfe-943c-c6e476a0c606
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b82b4af-57cd-4dfe-943c-c6e476a0c606
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
correlation: qa-743153ad-d6d9-4cf5-8d48-26bb2588dd66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-743153ad-d6d9-4cf5-8d48-26bb2588dd66
Content-Type: application/json

--- request body ---
{"handle":"qa-df3302a67268","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-743153ad-d6d9-4cf5-8d48-26bb2588dd66
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-743153ad-d6d9-4cf5-8d48-26bb2588dd66"}
```
