# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 382 | `qa-2b8ec8d3-d821-438b-b2cd-df1976c24d99` |
| 2 | `POST /v1/accounts` | 201 | 64 | `qa-4aba236a-71b6-4057-8260-dd204db3960e` |
| 3 | `POST /v1/auth/token` | 200 | 76 | `qa-83148d6d-d120-4201-9788-26e392c3e3d5` |
| 4 | `POST /v1/conversations` | 201 | 50 | `qa-c5c35c4e-bcdc-4159-af1b-e96e2a8039d8` |
| 5 | `PATCH /v1/accounts/me` | 503 | 29 | `qa-8558539e-2637-4511-87f5-02a057686285` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-1e4b044c-46a9-410c-b7ac-c931e894278d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-f6121e82-320c-4eed-a7a5-d562e210b3ac` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-8448a0a4-d40e-42a3-9319-9fdde505fc45` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-9dc1ccf7-91ba-411a-b42f-bc2a58ed17bb` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-07dd8c1c-c0c5-40be-addb-bb13869fae25` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2b8ec8d3-d821-438b-b2cd-df1976c24d99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b8ec8d3-d821-438b-b2cd-df1976c24d99
Content-Type: application/json

--- request body ---
{"handle":"qa-e9a2b7af60a6","displayName":"QA e9a2b7af60a6","password":"****","region":"eu"}

--- response: 201 in 382 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b8ec8d3-d821-438b-b2cd-df1976c24d99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-e9a2b7af60a6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e57c404f-321d-4b49-a6df-aea3459c7a25","handle":"qa-e9a2b7af60a6","displayName":"QA e9a2b7af60a6","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.633076937Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4aba236a-71b6-4057-8260-dd204db3960e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aba236a-71b6-4057-8260-dd204db3960e
Content-Type: application/json

--- request body ---
{"handle":"qa-24ca7ad2625f","displayName":"QA 24ca7ad2625f","password":"****","region":"eu"}

--- response: 201 in 64 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-4aba236a-71b6-4057-8260-dd204db3960e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-24ca7ad2625f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_62ee56c2-f6d1-47de-9ab4-9d7f3dc1eb78","handle":"qa-24ca7ad2625f","displayName":"QA 24ca7ad2625f","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.979886922Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-83148d6d-d120-4201-9788-26e392c3e3d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83148d6d-d120-4201-9788-26e392c3e3d5
Content-Type: application/json

--- request body ---
{"handle":"qa-e9a2b7af60a6","password":"****"}

--- response: 200 in 76 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-83148d6d-d120-4201-9788-26e392c3e3d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e57c404f-321d-4b49-a6df-aea3459c7a25"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c5c35c4e-bcdc-4159-af1b-e96e2a8039d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5c35c4e-bcdc-4159-af1b-e96e2a8039d8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-24ca7ad2625f","subject":"Error contract","message":"Hi"}

--- response: 201 in 50 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5c35c4e-bcdc-4159-af1b-e96e2a8039d8
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
Location: /v1/conversations/cnv_6eb42b6a-adce-4da1-b628-6623f7cd1524
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6eb42b6a-adce-4da1-b628-6623f7cd1524","subject":"Error contract","status":"open","region":"eu","participants":["qa-e9a2b7af60a6","qa-24ca7ad2625f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:35.187452901Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-8558539e-2637-4511-87f5-02a057686285

--- request headers ---
Accept: application/json
X-Fault-Key: d65510f2-feb4-4981-be8d-98246707a814
X-Fault: unavailable-once
X-Correlation-Id: qa-8558539e-2637-4511-87f5-02a057686285
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 29 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8558539e-2637-4511-87f5-02a057686285
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-8558539e-2637-4511-87f5-02a057686285"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1e4b044c-46a9-410c-b7ac-c931e894278d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e4b044c-46a9-410c-b7ac-c931e894278d
Content-Type: application/json

--- request body ---
{"handle":"qa-24ca7ad2625f","password":"****"}

--- response: 200 in 49 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e4b044c-46a9-410c-b7ac-c931e894278d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_62ee56c2-f6d1-47de-9ab4-9d7f3dc1eb78"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f6121e82-320c-4eed-a7a5-d562e210b3ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6121e82-320c-4eed-a7a5-d562e210b3ac
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f6121e82-320c-4eed-a7a5-d562e210b3ac
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
correlation: qa-8448a0a4-d40e-42a3-9319-9fdde505fc45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8448a0a4-d40e-42a3-9319-9fdde505fc45
Content-Type: application/json

--- request body ---
{"handle":"qa-24ca7ad2625f","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8448a0a4-d40e-42a3-9319-9fdde505fc45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8448a0a4-d40e-42a3-9319-9fdde505fc45"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9dc1ccf7-91ba-411a-b42f-bc2a58ed17bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dc1ccf7-91ba-411a-b42f-bc2a58ed17bb
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9dc1ccf7-91ba-411a-b42f-bc2a58ed17bb
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
correlation: qa-07dd8c1c-c0c5-40be-addb-bb13869fae25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07dd8c1c-c0c5-40be-addb-bb13869fae25
Content-Type: application/json

--- request body ---
{"handle":"qa-e9a2b7af60a6","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07dd8c1c-c0c5-40be-addb-bb13869fae25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-07dd8c1c-c0c5-40be-addb-bb13869fae25"}
```
