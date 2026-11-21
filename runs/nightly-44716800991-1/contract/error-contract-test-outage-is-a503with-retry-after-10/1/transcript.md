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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-6735849e-00b8-4820-92ea-2121e86dc588` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-f57182a1-8c55-4274-91a8-d5897e6ad638` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-85734c17-1054-4d45-bfd4-8ab853cbf07d` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-6583f519-3a3b-47e5-b67b-814cd1512b66` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 24 | `qa-5937d6df-a2b7-4303-8301-36d0366f1c00` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-76f7cc75-d1d7-4c36-bc69-2d5e6d3fae57` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-d489fce0-1d1d-46ce-9e4c-5b048ada1117` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-089a9c41-16ac-42a0-993b-6bdeacf9d6ca` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-08131780-e66a-4fbf-81b7-07e58b9072cc` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-848491f7-ae0e-4d12-821e-a16ed1b1cbb6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6735849e-00b8-4820-92ea-2121e86dc588

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6735849e-00b8-4820-92ea-2121e86dc588
Content-Type: application/json

--- request body ---
{"handle":"qa-32417dd45a01","displayName":"QA 32417dd45a01","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6735849e-00b8-4820-92ea-2121e86dc588
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 7
Location: /v1/accounts/qa-32417dd45a01
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1806a82d-b7a2-4060-9b7c-081e528123a6","handle":"qa-32417dd45a01","displayName":"QA 32417dd45a01","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.774921047Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f57182a1-8c55-4274-91a8-d5897e6ad638

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f57182a1-8c55-4274-91a8-d5897e6ad638
Content-Type: application/json

--- request body ---
{"handle":"qa-5b55ca0840cc","displayName":"QA 5b55ca0840cc","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f57182a1-8c55-4274-91a8-d5897e6ad638
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 7
Location: /v1/accounts/qa-5b55ca0840cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fff70520-4808-4f6b-a9af-55966100df4b","handle":"qa-5b55ca0840cc","displayName":"QA 5b55ca0840cc","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.799466444Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-85734c17-1054-4d45-bfd4-8ab853cbf07d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85734c17-1054-4d45-bfd4-8ab853cbf07d
Content-Type: application/json

--- request body ---
{"handle":"qa-32417dd45a01","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-85734c17-1054-4d45-bfd4-8ab853cbf07d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1806a82d-b7a2-4060-9b7c-081e528123a6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6583f519-3a3b-47e5-b67b-814cd1512b66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6583f519-3a3b-47e5-b67b-814cd1512b66
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5b55ca0840cc","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6583f519-3a3b-47e5-b67b-814cd1512b66
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
Location: /v1/conversations/cnv_21f6255a-6dbc-4210-87d9-3b8f1cb8fb2a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_21f6255a-6dbc-4210-87d9-3b8f1cb8fb2a","subject":"Error contract","status":"open","region":"eu","participants":["qa-32417dd45a01","qa-5b55ca0840cc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.901322591Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_21f6255a-6dbc-4210-87d9-3b8f1cb8fb2a/messages
correlation: qa-5937d6df-a2b7-4303-8301-36d0366f1c00

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 5647ad08-9631-4f11-bd1e-b3cb4d8f7e46
X-Correlation-Id: qa-5937d6df-a2b7-4303-8301-36d0366f1c00
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5937d6df-a2b7-4303-8301-36d0366f1c00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_21f6255a-6dbc-4210-87d9-3b8f1cb8fb2a/messages","correlationId":"qa-5937d6df-a2b7-4303-8301-36d0366f1c00"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-76f7cc75-d1d7-4c36-bc69-2d5e6d3fae57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76f7cc75-d1d7-4c36-bc69-2d5e6d3fae57
Content-Type: application/json

--- request body ---
{"handle":"qa-5b55ca0840cc","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-76f7cc75-d1d7-4c36-bc69-2d5e6d3fae57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fff70520-4808-4f6b-a9af-55966100df4b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d489fce0-1d1d-46ce-9e4c-5b048ada1117

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d489fce0-1d1d-46ce-9e4c-5b048ada1117
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d489fce0-1d1d-46ce-9e4c-5b048ada1117
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
correlation: qa-089a9c41-16ac-42a0-993b-6bdeacf9d6ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-089a9c41-16ac-42a0-993b-6bdeacf9d6ca
Content-Type: application/json

--- request body ---
{"handle":"qa-5b55ca0840cc","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-089a9c41-16ac-42a0-993b-6bdeacf9d6ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-089a9c41-16ac-42a0-993b-6bdeacf9d6ca"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-08131780-e66a-4fbf-81b7-07e58b9072cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08131780-e66a-4fbf-81b7-07e58b9072cc
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-08131780-e66a-4fbf-81b7-07e58b9072cc
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
correlation: qa-848491f7-ae0e-4d12-821e-a16ed1b1cbb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-848491f7-ae0e-4d12-821e-a16ed1b1cbb6
Content-Type: application/json

--- request body ---
{"handle":"qa-32417dd45a01","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-848491f7-ae0e-4d12-821e-a16ed1b1cbb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-848491f7-ae0e-4d12-821e-a16ed1b1cbb6"}
```
