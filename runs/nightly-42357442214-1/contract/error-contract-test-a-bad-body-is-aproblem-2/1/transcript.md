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
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-af2bc6d8-f768-4e00-bd84-7ab4b6d93e17` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-1b5d0097-78da-44d5-ac51-26828bf1861c` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-195fbf2b-6a25-4bae-b7fe-9dfbba016ade` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-c35222c5-6a5e-4850-9e58-d6ea2029c32c` |
| 5 | `POST /v1/auth/token` | 422 | 37 | `qa-09ac9b70-d8b6-4bc0-bde1-0f39d8d77267` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-a0fb5bc0-4dea-4bee-9bcc-13b61190710c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b29b54bc-af69-46b0-ab7b-c8c20c8e6a33` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-20fd4b01-dd71-4b89-9235-b85f32e7d9e8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-dba67bd4-5fcd-4f11-a95f-e1730508afab` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-ac11c621-e03d-4bc2-bf04-9387f4833968` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-af2bc6d8-f768-4e00-bd84-7ab4b6d93e17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af2bc6d8-f768-4e00-bd84-7ab4b6d93e17
Content-Type: application/json

--- request body ---
{"handle":"qa-ea1badba39b9","displayName":"QA ea1badba39b9","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-af2bc6d8-f768-4e00-bd84-7ab4b6d93e17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Location: /v1/accounts/qa-ea1badba39b9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_25ab4e2a-e6e2-466d-a7e7-1999f7de4a46","handle":"qa-ea1badba39b9","displayName":"QA ea1badba39b9","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.133673902Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1b5d0097-78da-44d5-ac51-26828bf1861c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b5d0097-78da-44d5-ac51-26828bf1861c
Content-Type: application/json

--- request body ---
{"handle":"qa-a7fd68755991","displayName":"QA a7fd68755991","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b5d0097-78da-44d5-ac51-26828bf1861c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Location: /v1/accounts/qa-a7fd68755991
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d784b037-7f9a-495d-8ef3-5dcd949538f3","handle":"qa-a7fd68755991","displayName":"QA a7fd68755991","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.191692426Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-195fbf2b-6a25-4bae-b7fe-9dfbba016ade

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-195fbf2b-6a25-4bae-b7fe-9dfbba016ade
Content-Type: application/json

--- request body ---
{"handle":"qa-ea1badba39b9","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-195fbf2b-6a25-4bae-b7fe-9dfbba016ade
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_25ab4e2a-e6e2-466d-a7e7-1999f7de4a46"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c35222c5-6a5e-4850-9e58-d6ea2029c32c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c35222c5-6a5e-4850-9e58-d6ea2029c32c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a7fd68755991","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c35222c5-6a5e-4850-9e58-d6ea2029c32c
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
Location: /v1/conversations/cnv_ae475aeb-a650-46a6-92fb-60887eb07931
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ae475aeb-a650-46a6-92fb-60887eb07931","subject":"Error contract","status":"open","region":"eu","participants":["qa-ea1badba39b9","qa-a7fd68755991"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:57.281046484Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-09ac9b70-d8b6-4bc0-bde1-0f39d8d77267

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09ac9b70-d8b6-4bc0-bde1-0f39d8d77267
Content-Type: application/json

--- request body ---
{"handle":"qa-ea1badba39b9","password":"****","ttlSeconds":0}

--- response: 422 in 37 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09ac9b70-d8b6-4bc0-bde1-0f39d8d77267
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-09ac9b70-d8b6-4bc0-bde1-0f39d8d77267","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a0fb5bc0-4dea-4bee-9bcc-13b61190710c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0fb5bc0-4dea-4bee-9bcc-13b61190710c
Content-Type: application/json

--- request body ---
{"handle":"qa-a7fd68755991","password":"****"}

--- response: 200 in 49 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0fb5bc0-4dea-4bee-9bcc-13b61190710c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d784b037-7f9a-495d-8ef3-5dcd949538f3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b29b54bc-af69-46b0-ab7b-c8c20c8e6a33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b29b54bc-af69-46b0-ab7b-c8c20c8e6a33
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b29b54bc-af69-46b0-ab7b-c8c20c8e6a33
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
correlation: qa-20fd4b01-dd71-4b89-9235-b85f32e7d9e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20fd4b01-dd71-4b89-9235-b85f32e7d9e8
Content-Type: application/json

--- request body ---
{"handle":"qa-a7fd68755991","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20fd4b01-dd71-4b89-9235-b85f32e7d9e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-20fd4b01-dd71-4b89-9235-b85f32e7d9e8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dba67bd4-5fcd-4f11-a95f-e1730508afab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dba67bd4-5fcd-4f11-a95f-e1730508afab
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dba67bd4-5fcd-4f11-a95f-e1730508afab
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
correlation: qa-ac11c621-e03d-4bc2-bf04-9387f4833968

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac11c621-e03d-4bc2-bf04-9387f4833968
Content-Type: application/json

--- request body ---
{"handle":"qa-ea1badba39b9","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac11c621-e03d-4bc2-bf04-9387f4833968
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ac11c621-e03d-4bc2-bf04-9387f4833968"}
```
