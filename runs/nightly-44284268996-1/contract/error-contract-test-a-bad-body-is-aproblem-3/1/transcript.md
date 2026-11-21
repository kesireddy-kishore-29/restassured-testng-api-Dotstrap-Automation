# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-01177e9b-9646-42a5-a981-ac1eb6193a5a` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-2015fb7f-71c9-4142-a5c1-e8624664e2b2` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-19c982dc-034c-4412-98a9-997a8cb3e7fa` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-5e53873a-b7f2-4960-8749-da3fceddb1a9` |
| 5 | `POST /v1/accounts` | 400 | 17 | `qa-90d8568a-9a42-42fa-b001-3fb2d6712c74` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-23034dc4-f5cd-4294-89ce-e8d91e4fc66a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-38af4480-a903-4da1-8bed-8ace2d347370` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-61807eea-c70f-416e-b853-e64563d3387b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-d8746db7-39eb-4613-8a09-4e249f9e728e` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-676e6d7f-7198-407a-bf65-6259918b3060` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-01177e9b-9646-42a5-a981-ac1eb6193a5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01177e9b-9646-42a5-a981-ac1eb6193a5a
Content-Type: application/json

--- request body ---
{"handle":"qa-c42c8879711f","displayName":"QA c42c8879711f","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-01177e9b-9646-42a5-a981-ac1eb6193a5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-c42c8879711f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_791981dc-64d0-4795-a8c0-5f2f9d45dfb2","handle":"qa-c42c8879711f","displayName":"QA c42c8879711f","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.502159292Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2015fb7f-71c9-4142-a5c1-e8624664e2b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2015fb7f-71c9-4142-a5c1-e8624664e2b2
Content-Type: application/json

--- request body ---
{"handle":"qa-0a25e29e2863","displayName":"QA 0a25e29e2863","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-2015fb7f-71c9-4142-a5c1-e8624664e2b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-0a25e29e2863
X-Served-Region: eu
Content-Length: 181

{"id":"acc_11f49c0a-2455-465d-9071-298ada43d1cc","handle":"qa-0a25e29e2863","displayName":"QA 0a25e29e2863","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.543647027Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-19c982dc-034c-4412-98a9-997a8cb3e7fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19c982dc-034c-4412-98a9-997a8cb3e7fa
Content-Type: application/json

--- request body ---
{"handle":"qa-c42c8879711f","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-19c982dc-034c-4412-98a9-997a8cb3e7fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_791981dc-64d0-4795-a8c0-5f2f9d45dfb2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5e53873a-b7f2-4960-8749-da3fceddb1a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e53873a-b7f2-4960-8749-da3fceddb1a9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0a25e29e2863","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e53873a-b7f2-4960-8749-da3fceddb1a9
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
Location: /v1/conversations/cnv_91626724-0aa9-4c22-978d-6a8f654dcf41
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_91626724-0aa9-4c22-978d-6a8f654dcf41","subject":"Error contract","status":"open","region":"eu","participants":["qa-c42c8879711f","qa-0a25e29e2863"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.601294305Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-90d8568a-9a42-42fa-b001-3fb2d6712c74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90d8568a-9a42-42fa-b001-3fb2d6712c74
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90d8568a-9a42-42fa-b001-3fb2d6712c74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-90d8568a-9a42-42fa-b001-3fb2d6712c74"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-23034dc4-f5cd-4294-89ce-e8d91e4fc66a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23034dc4-f5cd-4294-89ce-e8d91e4fc66a
Content-Type: application/json

--- request body ---
{"handle":"qa-0a25e29e2863","password":"****"}

--- response: 200 in 39 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-23034dc4-f5cd-4294-89ce-e8d91e4fc66a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11f49c0a-2455-465d-9071-298ada43d1cc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-38af4480-a903-4da1-8bed-8ace2d347370

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38af4480-a903-4da1-8bed-8ace2d347370
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-38af4480-a903-4da1-8bed-8ace2d347370
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
correlation: qa-61807eea-c70f-416e-b853-e64563d3387b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61807eea-c70f-416e-b853-e64563d3387b
Content-Type: application/json

--- request body ---
{"handle":"qa-0a25e29e2863","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61807eea-c70f-416e-b853-e64563d3387b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61807eea-c70f-416e-b853-e64563d3387b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d8746db7-39eb-4613-8a09-4e249f9e728e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8746db7-39eb-4613-8a09-4e249f9e728e
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d8746db7-39eb-4613-8a09-4e249f9e728e
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
correlation: qa-676e6d7f-7198-407a-bf65-6259918b3060

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-676e6d7f-7198-407a-bf65-6259918b3060
Content-Type: application/json

--- request body ---
{"handle":"qa-c42c8879711f","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-676e6d7f-7198-407a-bf65-6259918b3060
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-676e6d7f-7198-407a-bf65-6259918b3060"}
```
