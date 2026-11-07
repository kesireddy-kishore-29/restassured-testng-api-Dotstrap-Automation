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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-76fa898b-9aac-460f-8305-bff0544d95fd` |
| 2 | `POST /v1/accounts` | 201 | 72 | `qa-943a014e-16a7-43d9-9944-881a243df27b` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-2b7c5744-e372-4994-972e-aebddc14825c` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-aff67e2b-4b52-4465-b5d8-d361746cd9eb` |
| 5 | `POST /v1/credits/purchases` | 503 | 11 | `qa-1864ccb7-2897-4ec5-a065-e558816453a2` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-afa097e2-b900-4616-918b-5e6d7caf2aa0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-1e385aec-fc94-4ec9-abaa-7df5de9ce3ff` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-24202ddc-1ebf-453f-83cc-7f5b191efb92` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-b39c846f-d0ca-4503-8f73-2bae90eb7505` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-acc224f6-0dc0-48e9-860f-8f0702a44bdd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-76fa898b-9aac-460f-8305-bff0544d95fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76fa898b-9aac-460f-8305-bff0544d95fd
Content-Type: application/json

--- request body ---
{"handle":"qa-c7173bd3e322","displayName":"QA c7173bd3e322","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-76fa898b-9aac-460f-8305-bff0544d95fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 7
Location: /v1/accounts/qa-c7173bd3e322
X-Served-Region: eu
Content-Length: 181

{"id":"acc_27ad9232-5e93-4973-a02c-b92cbf482e28","handle":"qa-c7173bd3e322","displayName":"QA c7173bd3e322","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.051688382Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-943a014e-16a7-43d9-9944-881a243df27b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-943a014e-16a7-43d9-9944-881a243df27b
Content-Type: application/json

--- request body ---
{"handle":"qa-ed9ee9fe6269","displayName":"QA ed9ee9fe6269","password":"****","region":"eu"}

--- response: 201 in 72 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-943a014e-16a7-43d9-9944-881a243df27b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 7
Location: /v1/accounts/qa-ed9ee9fe6269
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f0241c64-8395-4011-9285-6153ef0420b3","handle":"qa-ed9ee9fe6269","displayName":"QA ed9ee9fe6269","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.146610692Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2b7c5744-e372-4994-972e-aebddc14825c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b7c5744-e372-4994-972e-aebddc14825c
Content-Type: application/json

--- request body ---
{"handle":"qa-c7173bd3e322","password":"****"}

--- response: 200 in 12 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b7c5744-e372-4994-972e-aebddc14825c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_27ad9232-5e93-4973-a02c-b92cbf482e28"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-aff67e2b-4b52-4465-b5d8-d361746cd9eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aff67e2b-4b52-4465-b5d8-d361746cd9eb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ed9ee9fe6269","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-aff67e2b-4b52-4465-b5d8-d361746cd9eb
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
Location: /v1/conversations/cnv_c132b7ff-8b17-4ca9-a10f-bc7ba0708e82
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c132b7ff-8b17-4ca9-a10f-bc7ba0708e82","subject":"Error contract","status":"open","region":"eu","participants":["qa-c7173bd3e322","qa-ed9ee9fe6269"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:01.191442563Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1864ccb7-2897-4ec5-a065-e558816453a2

--- request headers ---
Accept: application/json
X-Fault-Key: 60da1f62-5a82-42ab-9ecb-886b7d1f3ef7
X-Fault: unavailable-once
Idempotency-Key: qa-319343afbde84575bbff5ecc63042e64
X-Correlation-Id: qa-1864ccb7-2897-4ec5-a065-e558816453a2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1864ccb7-2897-4ec5-a065-e558816453a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-1864ccb7-2897-4ec5-a065-e558816453a2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-afa097e2-b900-4616-918b-5e6d7caf2aa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afa097e2-b900-4616-918b-5e6d7caf2aa0
Content-Type: application/json

--- request body ---
{"handle":"qa-ed9ee9fe6269","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-afa097e2-b900-4616-918b-5e6d7caf2aa0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f0241c64-8395-4011-9285-6153ef0420b3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1e385aec-fc94-4ec9-abaa-7df5de9ce3ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e385aec-fc94-4ec9-abaa-7df5de9ce3ff
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1e385aec-fc94-4ec9-abaa-7df5de9ce3ff
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
correlation: qa-24202ddc-1ebf-453f-83cc-7f5b191efb92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24202ddc-1ebf-453f-83cc-7f5b191efb92
Content-Type: application/json

--- request body ---
{"handle":"qa-ed9ee9fe6269","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-24202ddc-1ebf-453f-83cc-7f5b191efb92
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-24202ddc-1ebf-453f-83cc-7f5b191efb92"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b39c846f-d0ca-4503-8f73-2bae90eb7505

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b39c846f-d0ca-4503-8f73-2bae90eb7505
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b39c846f-d0ca-4503-8f73-2bae90eb7505
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
correlation: qa-acc224f6-0dc0-48e9-860f-8f0702a44bdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acc224f6-0dc0-48e9-860f-8f0702a44bdd
Content-Type: application/json

--- request body ---
{"handle":"qa-c7173bd3e322","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-acc224f6-0dc0-48e9-860f-8f0702a44bdd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-acc224f6-0dc0-48e9-860f-8f0702a44bdd"}
```
