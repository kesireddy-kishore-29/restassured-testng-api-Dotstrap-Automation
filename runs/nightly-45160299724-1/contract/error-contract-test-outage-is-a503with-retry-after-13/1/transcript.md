# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-b9d508c5-63a9-4db4-9b69-27e07d8f3580` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-ba4df474-9cac-4662-90cc-e1f9c6edfb7b` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-86c998f4-1133-4dbd-a99a-a1912bd2d2a9` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-460894fd-c6ab-4717-879c-9268d3f4d828` |
| 5 | `GET /v1/credits/balance` | 503 | 11 | `qa-737ffa0b-1497-4099-aea0-692477e583b1` |
| 6 | `POST /v1/auth/token` | 200 | 45 | `qa-1c9229bb-646e-475c-961b-3630c0754309` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-e463340e-d37f-4d37-b8d4-906b0243266d` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-a82ce506-307c-480b-b756-8508501ba9ab` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-87739c3f-d158-400e-8aab-addeaa9ff23a` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-f21886da-1fe3-4a22-9cd4-f8f7fd143e00` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b9d508c5-63a9-4db4-9b69-27e07d8f3580

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9d508c5-63a9-4db4-9b69-27e07d8f3580
Content-Type: application/json

--- request body ---
{"handle":"qa-9a69f56fa9ef","displayName":"QA 9a69f56fa9ef","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9d508c5-63a9-4db4-9b69-27e07d8f3580
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
Location: /v1/accounts/qa-9a69f56fa9ef
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72141cb4-b520-40d6-8871-256fedff360c","handle":"qa-9a69f56fa9ef","displayName":"QA 9a69f56fa9ef","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.762394681Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ba4df474-9cac-4662-90cc-e1f9c6edfb7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba4df474-9cac-4662-90cc-e1f9c6edfb7b
Content-Type: application/json

--- request body ---
{"handle":"qa-68a0e4a7b522","displayName":"QA 68a0e4a7b522","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba4df474-9cac-4662-90cc-e1f9c6edfb7b
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
Location: /v1/accounts/qa-68a0e4a7b522
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3267076e-c2a4-4daf-895a-6ab3875ccc32","handle":"qa-68a0e4a7b522","displayName":"QA 68a0e4a7b522","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.800630700Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-86c998f4-1133-4dbd-a99a-a1912bd2d2a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86c998f4-1133-4dbd-a99a-a1912bd2d2a9
Content-Type: application/json

--- request body ---
{"handle":"qa-9a69f56fa9ef","password":"****"}

--- response: 200 in 35 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-86c998f4-1133-4dbd-a99a-a1912bd2d2a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72141cb4-b520-40d6-8871-256fedff360c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-460894fd-c6ab-4717-879c-9268d3f4d828

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-460894fd-c6ab-4717-879c-9268d3f4d828
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-68a0e4a7b522","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-460894fd-c6ab-4717-879c-9268d3f4d828
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
Location: /v1/conversations/cnv_07018b43-4904-4f53-880d-ec7e249d6ce2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_07018b43-4904-4f53-880d-ec7e249d6ce2","subject":"Error contract","status":"open","region":"eu","participants":["qa-9a69f56fa9ef","qa-68a0e4a7b522"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.875011598Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-737ffa0b-1497-4099-aea0-692477e583b1

--- request headers ---
Accept: application/json
X-Fault-Key: 624d605d-dbff-4eaf-97cb-0b6202663e53
X-Fault: unavailable-once
X-Correlation-Id: qa-737ffa0b-1497-4099-aea0-692477e583b1
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-737ffa0b-1497-4099-aea0-692477e583b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-737ffa0b-1497-4099-aea0-692477e583b1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1c9229bb-646e-475c-961b-3630c0754309

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c9229bb-646e-475c-961b-3630c0754309
Content-Type: application/json

--- request body ---
{"handle":"qa-68a0e4a7b522","password":"****"}

--- response: 200 in 45 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c9229bb-646e-475c-961b-3630c0754309
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3267076e-c2a4-4daf-895a-6ab3875ccc32"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e463340e-d37f-4d37-b8d4-906b0243266d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e463340e-d37f-4d37-b8d4-906b0243266d
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e463340e-d37f-4d37-b8d4-906b0243266d
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
correlation: qa-a82ce506-307c-480b-b756-8508501ba9ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a82ce506-307c-480b-b756-8508501ba9ab
Content-Type: application/json

--- request body ---
{"handle":"qa-68a0e4a7b522","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a82ce506-307c-480b-b756-8508501ba9ab
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a82ce506-307c-480b-b756-8508501ba9ab"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-87739c3f-d158-400e-8aab-addeaa9ff23a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87739c3f-d158-400e-8aab-addeaa9ff23a
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-87739c3f-d158-400e-8aab-addeaa9ff23a
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
correlation: qa-f21886da-1fe3-4a22-9cd4-f8f7fd143e00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f21886da-1fe3-4a22-9cd4-f8f7fd143e00
Content-Type: application/json

--- request body ---
{"handle":"qa-9a69f56fa9ef","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f21886da-1fe3-4a22-9cd4-f8f7fd143e00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f21886da-1fe3-4a22-9cd4-f8f7fd143e00"}
```
