# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-2d97fa87-5924-40f0-98da-cb863d46793f` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-9fa9e22a-d9f3-4bfc-90a2-2e89a958408b` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-9851624a-0c60-4eb2-8791-d81aa5c64193` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-583fe862-4a55-461b-b750-07f611f48caa` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 26 | `qa-00e35f88-c34b-447c-99be-dcb87af88250` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-8f699751-f854-4ba5-bff2-feeac197d5dc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-8f027fd7-0eeb-4b25-9f67-043a58717561` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-47002491-e9b2-4abf-8eae-c03e151c6202` |
| 9 | `DELETE /v1/accounts/me` | 204 | 48 | `qa-a4b121b2-9824-4996-8278-5590e1e37297` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-49533ddf-1ccd-411e-86d5-e74eec6ededb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2d97fa87-5924-40f0-98da-cb863d46793f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d97fa87-5924-40f0-98da-cb863d46793f
Content-Type: application/json

--- request body ---
{"handle":"qa-8b6bed07018e","displayName":"QA 8b6bed07018e","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d97fa87-5924-40f0-98da-cb863d46793f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Location: /v1/accounts/qa-8b6bed07018e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_37ae97d3-0e56-495a-b1d6-a1ac843d6ca7","handle":"qa-8b6bed07018e","displayName":"QA 8b6bed07018e","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.416356168Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9fa9e22a-d9f3-4bfc-90a2-2e89a958408b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fa9e22a-d9f3-4bfc-90a2-2e89a958408b
Content-Type: application/json

--- request body ---
{"handle":"qa-f1294fcc77ec","displayName":"QA f1294fcc77ec","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fa9e22a-d9f3-4bfc-90a2-2e89a958408b
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
Location: /v1/accounts/qa-f1294fcc77ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5385f3a5-da67-4c79-8686-60afa1673bbd","handle":"qa-f1294fcc77ec","displayName":"QA f1294fcc77ec","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.446495747Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9851624a-0c60-4eb2-8791-d81aa5c64193

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9851624a-0c60-4eb2-8791-d81aa5c64193
Content-Type: application/json

--- request body ---
{"handle":"qa-8b6bed07018e","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-9851624a-0c60-4eb2-8791-d81aa5c64193
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_37ae97d3-0e56-495a-b1d6-a1ac843d6ca7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-583fe862-4a55-461b-b750-07f611f48caa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-583fe862-4a55-461b-b750-07f611f48caa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f1294fcc77ec","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-583fe862-4a55-461b-b750-07f611f48caa
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
Location: /v1/conversations/cnv_5f561483-3d3f-4572-b115-e71619374e92
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5f561483-3d3f-4572-b115-e71619374e92","subject":"Error contract","status":"open","region":"eu","participants":["qa-8b6bed07018e","qa-f1294fcc77ec"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.518285399Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5f561483-3d3f-4572-b115-e71619374e92/messages
correlation: qa-00e35f88-c34b-447c-99be-dcb87af88250

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 8ca47a1f-eb62-46ac-924b-dee1c16fdc8a
X-Correlation-Id: qa-00e35f88-c34b-447c-99be-dcb87af88250
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 26 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00e35f88-c34b-447c-99be-dcb87af88250
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_5f561483-3d3f-4572-b115-e71619374e92/messages","correlationId":"qa-00e35f88-c34b-447c-99be-dcb87af88250"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8f699751-f854-4ba5-bff2-feeac197d5dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f699751-f854-4ba5-bff2-feeac197d5dc
Content-Type: application/json

--- request body ---
{"handle":"qa-f1294fcc77ec","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f699751-f854-4ba5-bff2-feeac197d5dc
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5385f3a5-da67-4c79-8686-60afa1673bbd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8f027fd7-0eeb-4b25-9f67-043a58717561

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f027fd7-0eeb-4b25-9f67-043a58717561
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8f027fd7-0eeb-4b25-9f67-043a58717561
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
correlation: qa-47002491-e9b2-4abf-8eae-c03e151c6202

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47002491-e9b2-4abf-8eae-c03e151c6202
Content-Type: application/json

--- request body ---
{"handle":"qa-f1294fcc77ec","password":"****"}

--- response: 401 in 26 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47002491-e9b2-4abf-8eae-c03e151c6202
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-47002491-e9b2-4abf-8eae-c03e151c6202"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a4b121b2-9824-4996-8278-5590e1e37297

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4b121b2-9824-4996-8278-5590e1e37297
Content-Type: application/json

--- response: 204 in 48 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a4b121b2-9824-4996-8278-5590e1e37297
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
correlation: qa-49533ddf-1ccd-411e-86d5-e74eec6ededb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49533ddf-1ccd-411e-86d5-e74eec6ededb
Content-Type: application/json

--- request body ---
{"handle":"qa-8b6bed07018e","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49533ddf-1ccd-411e-86d5-e74eec6ededb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-49533ddf-1ccd-411e-86d5-e74eec6ededb"}
```
