# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-48317e8b-c59d-4b6c-be6d-80ca1465c02f` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-37b35e49-779e-4fa8-8bea-c65c515700df` |
| 3 | `POST /v1/accounts` | 201 | 54 | `qa-e3f39016-7478-4f78-87e3-6855e81dbe12` |
| 4 | `POST /v1/auth/token` | 200 | 28 | `qa-1f2e3450-678b-47f9-a25b-ffaa8c84fe08` |
| 5 | `POST /v1/conversations` | 201 | 6 | `qa-b120d8cf-c606-4648-a64e-8ffbb7a5916f` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-8698ef2d-16c5-4215-aed0-3f4b863cf970` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 24 | `qa-e542d633-cad1-401e-b695-e97fc471e61e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-a18a6f51-23ef-4e08-8f25-755a4110c5b8` |
| 9 | `POST /v1/auth/token` | 401 | 18 | `qa-749b6520-1d43-43dc-ae53-3e570160bdc6` |
| 10 | `POST /v1/auth/token` | 200 | 19 | `qa-86a885c2-4ece-4bba-ac68-e8a651839b2f` |
| 11 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-f8e810b9-65c5-4f33-bf32-7461e6daaa7c` |
| 12 | `POST /v1/auth/token` | 401 | 28 | `qa-ae9b6862-c7fc-4665-8adc-01d550cabd61` |
| 13 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-cb4a4493-38d8-4e10-8a10-266a90d8d269` |
| 14 | `POST /v1/auth/token` | 401 | 17 | `qa-4b20f296-42d7-43bf-a01e-8891493689d3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-48317e8b-c59d-4b6c-be6d-80ca1465c02f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48317e8b-c59d-4b6c-be6d-80ca1465c02f
Content-Type: application/json

--- request body ---
{"handle":"qa-7228af778011","displayName":"QA 7228af778011","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-48317e8b-c59d-4b6c-be6d-80ca1465c02f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 9
Location: /v1/accounts/qa-7228af778011
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a367b0dc-2ea5-4f48-97b7-b4521061e222","handle":"qa-7228af778011","displayName":"QA 7228af778011","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.379367101Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-37b35e49-779e-4fa8-8bea-c65c515700df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37b35e49-779e-4fa8-8bea-c65c515700df
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c242641cff","displayName":"QA c9c242641cff","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-37b35e49-779e-4fa8-8bea-c65c515700df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 9
Location: /v1/accounts/qa-c9c242641cff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7658c45b-9396-4f29-b4e9-2ad54500be41","handle":"qa-c9c242641cff","displayName":"QA c9c242641cff","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.411772362Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-e3f39016-7478-4f78-87e3-6855e81dbe12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3f39016-7478-4f78-87e3-6855e81dbe12
Content-Type: application/json

--- request body ---
{"handle":"qa-5cbe5ad01cd7","displayName":"QA 5cbe5ad01cd7","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3f39016-7478-4f78-87e3-6855e81dbe12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 9
Location: /v1/accounts/qa-5cbe5ad01cd7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0b76a172-26d3-4136-89fb-fc68d18a5c01","handle":"qa-5cbe5ad01cd7","displayName":"QA 5cbe5ad01cd7","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.464802047Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-1f2e3450-678b-47f9-a25b-ffaa8c84fe08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f2e3450-678b-47f9-a25b-ffaa8c84fe08
Content-Type: application/json

--- request body ---
{"handle":"qa-7228af778011","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f2e3450-678b-47f9-a25b-ffaa8c84fe08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a367b0dc-2ea5-4f48-97b7-b4521061e222"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-b120d8cf-c606-4648-a64e-8ffbb7a5916f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b120d8cf-c606-4648-a64e-8ffbb7a5916f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c9c242641cff","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-b120d8cf-c606-4648-a64e-8ffbb7a5916f
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
Location: /v1/conversations/cnv_4b3b684f-2da3-4482-b5f3-788552ef1efb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4b3b684f-2da3-4482-b5f3-788552ef1efb","subject":"Error contract","status":"open","region":"eu","participants":["qa-7228af778011","qa-c9c242641cff"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.530043990Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8698ef2d-16c5-4215-aed0-3f4b863cf970

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8698ef2d-16c5-4215-aed0-3f4b863cf970
Content-Type: application/json

--- request body ---
{"handle":"qa-5cbe5ad01cd7","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-8698ef2d-16c5-4215-aed0-3f4b863cf970
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0b76a172-26d3-4136-89fb-fc68d18a5c01"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_4b3b684f-2da3-4482-b5f3-788552ef1efb/close
correlation: qa-e542d633-cad1-401e-b695-e97fc471e61e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e542d633-cad1-401e-b695-e97fc471e61e
Content-Type: application/json

--- response: 403 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e542d633-cad1-401e-b695-e97fc471e61e
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4b3b684f-2da3-4482-b5f3-788552ef1efb/close","correlationId":"qa-e542d633-cad1-401e-b695-e97fc471e61e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a18a6f51-23ef-4e08-8f25-755a4110c5b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a18a6f51-23ef-4e08-8f25-755a4110c5b8
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a18a6f51-23ef-4e08-8f25-755a4110c5b8
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-749b6520-1d43-43dc-ae53-3e570160bdc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-749b6520-1d43-43dc-ae53-3e570160bdc6
Content-Type: application/json

--- request body ---
{"handle":"qa-5cbe5ad01cd7","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-749b6520-1d43-43dc-ae53-3e570160bdc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-749b6520-1d43-43dc-ae53-3e570160bdc6"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-86a885c2-4ece-4bba-ac68-e8a651839b2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86a885c2-4ece-4bba-ac68-e8a651839b2f
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c242641cff","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-86a885c2-4ece-4bba-ac68-e8a651839b2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7658c45b-9396-4f29-b4e9-2ad54500be41"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f8e810b9-65c5-4f33-bf32-7461e6daaa7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8e810b9-65c5-4f33-bf32-7461e6daaa7c
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f8e810b9-65c5-4f33-bf32-7461e6daaa7c
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-ae9b6862-c7fc-4665-8adc-01d550cabd61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae9b6862-c7fc-4665-8adc-01d550cabd61
Content-Type: application/json

--- request body ---
{"handle":"qa-c9c242641cff","password":"****"}

--- response: 401 in 28 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae9b6862-c7fc-4665-8adc-01d550cabd61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ae9b6862-c7fc-4665-8adc-01d550cabd61"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cb4a4493-38d8-4e10-8a10-266a90d8d269

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb4a4493-38d8-4e10-8a10-266a90d8d269
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cb4a4493-38d8-4e10-8a10-266a90d8d269
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-4b20f296-42d7-43bf-a01e-8891493689d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b20f296-42d7-43bf-a01e-8891493689d3
Content-Type: application/json

--- request body ---
{"handle":"qa-7228af778011","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b20f296-42d7-43bf-a01e-8891493689d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4b20f296-42d7-43bf-a01e-8891493689d3"}
```
