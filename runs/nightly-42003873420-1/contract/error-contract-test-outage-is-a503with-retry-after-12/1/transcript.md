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
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-a49cb71e-0436-47d9-95ab-37b2a46c8604` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-e5699026-f09d-4461-a7eb-ed7c31dff5d6` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-cbf4a1ed-d8b2-4ca1-8e5c-ed646d6b9342` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-a5bdd67f-1c64-4122-9918-4c39186d2b74` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 19 | `qa-8dc47f88-6057-4bef-b09f-5222f1c15b0b` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-fcbdf77c-b444-47e9-a7fc-cc070225922f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-26aab4ce-97d5-452d-a1a6-f12602fcf47a` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-99b72c03-d21e-4fc4-9ce8-59dd1a41d750` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-b16d5795-48e7-4e12-893a-51c3ce73f93e` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-65bed97d-7f9d-4952-b010-4b31affa3aef` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a49cb71e-0436-47d9-95ab-37b2a46c8604

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a49cb71e-0436-47d9-95ab-37b2a46c8604
Content-Type: application/json

--- request body ---
{"handle":"qa-69d5905bb451","displayName":"QA 69d5905bb451","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a49cb71e-0436-47d9-95ab-37b2a46c8604
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Location: /v1/accounts/qa-69d5905bb451
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cd0d54b2-68fd-4085-88ab-534c80c1429f","handle":"qa-69d5905bb451","displayName":"QA 69d5905bb451","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.484254212Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e5699026-f09d-4461-a7eb-ed7c31dff5d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5699026-f09d-4461-a7eb-ed7c31dff5d6
Content-Type: application/json

--- request body ---
{"handle":"qa-3ac38678e0d3","displayName":"QA 3ac38678e0d3","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5699026-f09d-4461-a7eb-ed7c31dff5d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 7
Location: /v1/accounts/qa-3ac38678e0d3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_426db648-8b0f-4ea1-894b-bdcaece6f76f","handle":"qa-3ac38678e0d3","displayName":"QA 3ac38678e0d3","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.541770830Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cbf4a1ed-d8b2-4ca1-8e5c-ed646d6b9342

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbf4a1ed-d8b2-4ca1-8e5c-ed646d6b9342
Content-Type: application/json

--- request body ---
{"handle":"qa-69d5905bb451","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbf4a1ed-d8b2-4ca1-8e5c-ed646d6b9342
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd0d54b2-68fd-4085-88ab-534c80c1429f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a5bdd67f-1c64-4122-9918-4c39186d2b74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5bdd67f-1c64-4122-9918-4c39186d2b74
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3ac38678e0d3","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5bdd67f-1c64-4122-9918-4c39186d2b74
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
Location: /v1/conversations/cnv_b056b32d-5e08-4660-9304-100de302a655
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b056b32d-5e08-4660-9304-100de302a655","subject":"Error contract","status":"open","region":"eu","participants":["qa-69d5905bb451","qa-3ac38678e0d3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.617342875Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_b056b32d-5e08-4660-9304-100de302a655/close
correlation: qa-8dc47f88-6057-4bef-b09f-5222f1c15b0b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: eca3ef78-b7ca-4a9c-8b42-5091889e277d
X-Correlation-Id: qa-8dc47f88-6057-4bef-b09f-5222f1c15b0b
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8dc47f88-6057-4bef-b09f-5222f1c15b0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_b056b32d-5e08-4660-9304-100de302a655/close","correlationId":"qa-8dc47f88-6057-4bef-b09f-5222f1c15b0b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fcbdf77c-b444-47e9-a7fc-cc070225922f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcbdf77c-b444-47e9-a7fc-cc070225922f
Content-Type: application/json

--- request body ---
{"handle":"qa-3ac38678e0d3","password":"****"}

--- response: 200 in 49 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcbdf77c-b444-47e9-a7fc-cc070225922f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_426db648-8b0f-4ea1-894b-bdcaece6f76f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26aab4ce-97d5-452d-a1a6-f12602fcf47a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26aab4ce-97d5-452d-a1a6-f12602fcf47a
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26aab4ce-97d5-452d-a1a6-f12602fcf47a
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
correlation: qa-99b72c03-d21e-4fc4-9ce8-59dd1a41d750

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99b72c03-d21e-4fc4-9ce8-59dd1a41d750
Content-Type: application/json

--- request body ---
{"handle":"qa-3ac38678e0d3","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99b72c03-d21e-4fc4-9ce8-59dd1a41d750
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-99b72c03-d21e-4fc4-9ce8-59dd1a41d750"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b16d5795-48e7-4e12-893a-51c3ce73f93e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b16d5795-48e7-4e12-893a-51c3ce73f93e
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b16d5795-48e7-4e12-893a-51c3ce73f93e
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
correlation: qa-65bed97d-7f9d-4952-b010-4b31affa3aef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65bed97d-7f9d-4952-b010-4b31affa3aef
Content-Type: application/json

--- request body ---
{"handle":"qa-69d5905bb451","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65bed97d-7f9d-4952-b010-4b31affa3aef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-65bed97d-7f9d-4952-b010-4b31affa3aef"}
```
