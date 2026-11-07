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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-d600ddcd-27d6-440a-8130-a3f8781ee332` |
| 2 | `POST /v1/accounts` | 201 | 50 | `qa-98b34d6a-9d8f-49a2-9654-70f622b1f462` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-cd7b3e64-74d1-431e-9697-aed775b1ee94` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-6285db55-d886-46c8-9ec9-3a10fd5df0c0` |
| 5 | `POST /v1/credits/purchases` | 503 | 9 | `qa-eac2b89f-c827-41d4-99ec-7562871b9f13` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-50f05859-bda6-48c9-ae3c-03b8cc408a49` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-eed240d2-b773-40b2-b979-cf8f8dc532ca` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-9f7da258-d084-4594-ada7-4d1a0537a2de` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-e466c12a-4868-4711-aee8-a08d20563967` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-9be2d496-4ecb-43cc-bc68-1498ff61afbf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d600ddcd-27d6-440a-8130-a3f8781ee332

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d600ddcd-27d6-440a-8130-a3f8781ee332
Content-Type: application/json

--- request body ---
{"handle":"qa-f9f169f8a00d","displayName":"QA f9f169f8a00d","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d600ddcd-27d6-440a-8130-a3f8781ee332
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 8
Location: /v1/accounts/qa-f9f169f8a00d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a8b6876-373d-4068-a8f1-a99a6891c4fc","handle":"qa-f9f169f8a00d","displayName":"QA f9f169f8a00d","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.287267972Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-98b34d6a-9d8f-49a2-9654-70f622b1f462

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98b34d6a-9d8f-49a2-9654-70f622b1f462
Content-Type: application/json

--- request body ---
{"handle":"qa-5b3c24f44f79","displayName":"QA 5b3c24f44f79","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-98b34d6a-9d8f-49a2-9654-70f622b1f462
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 8
Location: /v1/accounts/qa-5b3c24f44f79
X-Served-Region: eu
Content-Length: 181

{"id":"acc_44ffd90d-bdf5-422c-991b-9b188605f327","handle":"qa-5b3c24f44f79","displayName":"QA 5b3c24f44f79","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.359980984Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cd7b3e64-74d1-431e-9697-aed775b1ee94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd7b3e64-74d1-431e-9697-aed775b1ee94
Content-Type: application/json

--- request body ---
{"handle":"qa-f9f169f8a00d","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd7b3e64-74d1-431e-9697-aed775b1ee94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a8b6876-373d-4068-a8f1-a99a6891c4fc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6285db55-d886-46c8-9ec9-3a10fd5df0c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6285db55-d886-46c8-9ec9-3a10fd5df0c0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5b3c24f44f79","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6285db55-d886-46c8-9ec9-3a10fd5df0c0
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
Location: /v1/conversations/cnv_213ad0d2-d7bf-42d0-a79a-949d30f016d7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_213ad0d2-d7bf-42d0-a79a-949d30f016d7","subject":"Error contract","status":"open","region":"eu","participants":["qa-f9f169f8a00d","qa-5b3c24f44f79"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:37.424580207Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-eac2b89f-c827-41d4-99ec-7562871b9f13

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e7b0d5d4-678c-42dc-9277-17ba256f0bc0
Idempotency-Key: qa-b17ef9a5d70b40e293b703db8ea64088
X-Correlation-Id: qa-eac2b89f-c827-41d4-99ec-7562871b9f13
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eac2b89f-c827-41d4-99ec-7562871b9f13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-eac2b89f-c827-41d4-99ec-7562871b9f13"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-50f05859-bda6-48c9-ae3c-03b8cc408a49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50f05859-bda6-48c9-ae3c-03b8cc408a49
Content-Type: application/json

--- request body ---
{"handle":"qa-5b3c24f44f79","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-50f05859-bda6-48c9-ae3c-03b8cc408a49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_44ffd90d-bdf5-422c-991b-9b188605f327"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eed240d2-b773-40b2-b979-cf8f8dc532ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eed240d2-b773-40b2-b979-cf8f8dc532ca
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eed240d2-b773-40b2-b979-cf8f8dc532ca
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
correlation: qa-9f7da258-d084-4594-ada7-4d1a0537a2de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f7da258-d084-4594-ada7-4d1a0537a2de
Content-Type: application/json

--- request body ---
{"handle":"qa-5b3c24f44f79","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f7da258-d084-4594-ada7-4d1a0537a2de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9f7da258-d084-4594-ada7-4d1a0537a2de"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e466c12a-4868-4711-aee8-a08d20563967

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e466c12a-4868-4711-aee8-a08d20563967
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e466c12a-4868-4711-aee8-a08d20563967
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
correlation: qa-9be2d496-4ecb-43cc-bc68-1498ff61afbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9be2d496-4ecb-43cc-bc68-1498ff61afbf
Content-Type: application/json

--- request body ---
{"handle":"qa-f9f169f8a00d","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9be2d496-4ecb-43cc-bc68-1498ff61afbf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9be2d496-4ecb-43cc-bc68-1498ff61afbf"}
```
