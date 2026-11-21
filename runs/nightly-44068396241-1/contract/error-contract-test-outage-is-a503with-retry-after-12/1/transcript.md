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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-d013de9f-187f-42a2-8044-c25a6b93ad50` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-e5e5a928-7111-43ca-a286-539ea495cabf` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-654b7c71-9089-410b-8895-f2df1072f6dd` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-fbb256ff-a3b2-4060-a86a-29d59d9b1971` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 20 | `qa-6dcac79c-40bd-466f-87fe-ffb8eb3e2045` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-0d22bb3d-8911-44fe-b404-a7991f9241d3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-1154269e-d51b-4973-8e9a-1ef1d897c903` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-b8a80c99-6944-4eb3-a65a-48e6a7127498` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-672049c3-b209-4ea5-9923-738164431f51` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-587b650a-0696-4c58-b10d-e120c576716f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d013de9f-187f-42a2-8044-c25a6b93ad50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d013de9f-187f-42a2-8044-c25a6b93ad50
Content-Type: application/json

--- request body ---
{"handle":"qa-28060c0b3e1e","displayName":"QA 28060c0b3e1e","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-d013de9f-187f-42a2-8044-c25a6b93ad50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 8
Location: /v1/accounts/qa-28060c0b3e1e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_731741f6-2853-4670-8271-86ca013373e1","handle":"qa-28060c0b3e1e","displayName":"QA 28060c0b3e1e","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.682703996Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e5e5a928-7111-43ca-a286-539ea495cabf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5e5a928-7111-43ca-a286-539ea495cabf
Content-Type: application/json

--- request body ---
{"handle":"qa-496998dbaf5b","displayName":"QA 496998dbaf5b","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5e5a928-7111-43ca-a286-539ea495cabf
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
Location: /v1/accounts/qa-496998dbaf5b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5dc46c72-3fde-425e-9779-c0b0f56b06d9","handle":"qa-496998dbaf5b","displayName":"QA 496998dbaf5b","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.722287666Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-654b7c71-9089-410b-8895-f2df1072f6dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-654b7c71-9089-410b-8895-f2df1072f6dd
Content-Type: application/json

--- request body ---
{"handle":"qa-28060c0b3e1e","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-654b7c71-9089-410b-8895-f2df1072f6dd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_731741f6-2853-4670-8271-86ca013373e1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fbb256ff-a3b2-4060-a86a-29d59d9b1971

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbb256ff-a3b2-4060-a86a-29d59d9b1971
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-496998dbaf5b","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbb256ff-a3b2-4060-a86a-29d59d9b1971
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
Location: /v1/conversations/cnv_c83bc3c1-a019-4e6e-adac-dcd7758c73e2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c83bc3c1-a019-4e6e-adac-dcd7758c73e2","subject":"Error contract","status":"open","region":"eu","participants":["qa-28060c0b3e1e","qa-496998dbaf5b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.782873293Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_c83bc3c1-a019-4e6e-adac-dcd7758c73e2/close
correlation: qa-6dcac79c-40bd-466f-87fe-ffb8eb3e2045

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 8c23b7fd-5725-4cae-91e2-0d7b4db76350
X-Correlation-Id: qa-6dcac79c-40bd-466f-87fe-ffb8eb3e2045
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6dcac79c-40bd-466f-87fe-ffb8eb3e2045
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_c83bc3c1-a019-4e6e-adac-dcd7758c73e2/close","correlationId":"qa-6dcac79c-40bd-466f-87fe-ffb8eb3e2045"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0d22bb3d-8911-44fe-b404-a7991f9241d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d22bb3d-8911-44fe-b404-a7991f9241d3
Content-Type: application/json

--- request body ---
{"handle":"qa-496998dbaf5b","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d22bb3d-8911-44fe-b404-a7991f9241d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5dc46c72-3fde-425e-9779-c0b0f56b06d9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1154269e-d51b-4973-8e9a-1ef1d897c903

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1154269e-d51b-4973-8e9a-1ef1d897c903
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1154269e-d51b-4973-8e9a-1ef1d897c903
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
correlation: qa-b8a80c99-6944-4eb3-a65a-48e6a7127498

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8a80c99-6944-4eb3-a65a-48e6a7127498
Content-Type: application/json

--- request body ---
{"handle":"qa-496998dbaf5b","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8a80c99-6944-4eb3-a65a-48e6a7127498
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b8a80c99-6944-4eb3-a65a-48e6a7127498"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-672049c3-b209-4ea5-9923-738164431f51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-672049c3-b209-4ea5-9923-738164431f51
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-672049c3-b209-4ea5-9923-738164431f51
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
correlation: qa-587b650a-0696-4c58-b10d-e120c576716f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-587b650a-0696-4c58-b10d-e120c576716f
Content-Type: application/json

--- request body ---
{"handle":"qa-28060c0b3e1e","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-587b650a-0696-4c58-b10d-e120c576716f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-587b650a-0696-4c58-b10d-e120c576716f"}
```
