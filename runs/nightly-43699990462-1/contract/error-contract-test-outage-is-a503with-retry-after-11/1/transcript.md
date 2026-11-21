# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-d3e094a1-d3f5-4889-bd22-999d8841693a` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-5433ee19-69d2-49dc-926f-245a05af93fe` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-2da75a40-5a43-4e76-ae3d-1c2cd6703be8` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-074e77b8-f5b2-4ba9-9cba-234a2c55f3b5` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 67 | `qa-e22e4cee-b6ab-421f-bda5-cb6649ee6fa4` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-e42d350f-ed7a-46ae-9912-458788a6e538` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-85b78424-8e40-4794-baad-5ac5d5be1dc5` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-712dfc10-16da-4236-8eea-0ef969eb8280` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-9c760c4f-7e33-415a-bc28-35415624410f` |
| 10 | `POST /v1/auth/token` | 401 | 35 | `qa-71c70998-bec1-44e6-949c-83138cc10e7f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d3e094a1-d3f5-4889-bd22-999d8841693a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3e094a1-d3f5-4889-bd22-999d8841693a
Content-Type: application/json

--- request body ---
{"handle":"qa-b563204a5619","displayName":"QA b563204a5619","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3e094a1-d3f5-4889-bd22-999d8841693a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Location: /v1/accounts/qa-b563204a5619
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d22ca283-658f-4de7-ae68-0008ad588a0c","handle":"qa-b563204a5619","displayName":"QA b563204a5619","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.932490154Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5433ee19-69d2-49dc-926f-245a05af93fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5433ee19-69d2-49dc-926f-245a05af93fe
Content-Type: application/json

--- request body ---
{"handle":"qa-9a3ff20e0594","displayName":"QA 9a3ff20e0594","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-5433ee19-69d2-49dc-926f-245a05af93fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Location: /v1/accounts/qa-9a3ff20e0594
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0557d0c6-d1c9-4c35-8201-a740fb78871b","handle":"qa-9a3ff20e0594","displayName":"QA 9a3ff20e0594","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.962551085Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2da75a40-5a43-4e76-ae3d-1c2cd6703be8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2da75a40-5a43-4e76-ae3d-1c2cd6703be8
Content-Type: application/json

--- request body ---
{"handle":"qa-b563204a5619","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2da75a40-5a43-4e76-ae3d-1c2cd6703be8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d22ca283-658f-4de7-ae68-0008ad588a0c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-074e77b8-f5b2-4ba9-9cba-234a2c55f3b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-074e77b8-f5b2-4ba9-9cba-234a2c55f3b5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9a3ff20e0594","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-074e77b8-f5b2-4ba9-9cba-234a2c55f3b5
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
Location: /v1/conversations/cnv_862fd875-d6c2-47aa-a522-f46a5fd53814
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_862fd875-d6c2-47aa-a522-f46a5fd53814","subject":"Error contract","status":"open","region":"eu","participants":["qa-b563204a5619","qa-9a3ff20e0594"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.018323215Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_862fd875-d6c2-47aa-a522-f46a5fd53814/read
correlation: qa-e22e4cee-b6ab-421f-bda5-cb6649ee6fa4

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 94a5775d-664f-4138-b1ae-60e80ad44fde
X-Correlation-Id: qa-e22e4cee-b6ab-421f-bda5-cb6649ee6fa4
Content-Type: application/json

--- response: 503 in 67 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e22e4cee-b6ab-421f-bda5-cb6649ee6fa4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_862fd875-d6c2-47aa-a522-f46a5fd53814/read","correlationId":"qa-e22e4cee-b6ab-421f-bda5-cb6649ee6fa4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e42d350f-ed7a-46ae-9912-458788a6e538

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e42d350f-ed7a-46ae-9912-458788a6e538
Content-Type: application/json

--- request body ---
{"handle":"qa-9a3ff20e0594","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e42d350f-ed7a-46ae-9912-458788a6e538
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0557d0c6-d1c9-4c35-8201-a740fb78871b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-85b78424-8e40-4794-baad-5ac5d5be1dc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85b78424-8e40-4794-baad-5ac5d5be1dc5
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-85b78424-8e40-4794-baad-5ac5d5be1dc5
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
correlation: qa-712dfc10-16da-4236-8eea-0ef969eb8280

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-712dfc10-16da-4236-8eea-0ef969eb8280
Content-Type: application/json

--- request body ---
{"handle":"qa-9a3ff20e0594","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-712dfc10-16da-4236-8eea-0ef969eb8280
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-712dfc10-16da-4236-8eea-0ef969eb8280"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9c760c4f-7e33-415a-bc28-35415624410f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c760c4f-7e33-415a-bc28-35415624410f
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9c760c4f-7e33-415a-bc28-35415624410f
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
correlation: qa-71c70998-bec1-44e6-949c-83138cc10e7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71c70998-bec1-44e6-949c-83138cc10e7f
Content-Type: application/json

--- request body ---
{"handle":"qa-b563204a5619","password":"****"}

--- response: 401 in 35 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71c70998-bec1-44e6-949c-83138cc10e7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71c70998-bec1-44e6-949c-83138cc10e7f"}
```
