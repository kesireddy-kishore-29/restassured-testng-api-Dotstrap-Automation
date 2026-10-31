# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 519 | `qa-7dfb6aae-dd0e-4456-9fdd-f6c28eb890ec` |
| 2 | `POST /v1/accounts` | 201 | 128 | `qa-de6e4a3a-ea69-4fb2-94e1-7152eaeabcef` |
| 3 | `POST /v1/auth/token` | 200 | 71 | `qa-110b3d8b-ed90-4d06-8c13-f2000040c95f` |
| 4 | `POST /v1/conversations` | 201 | 66 | `qa-973722d6-8517-48b2-aa6e-b083d737ab0e` |
| 5 | `POST /v1/auth/token` | 400 | 40 | `qa-2e9b6de8-3f9a-4e1d-ab07-513dc01b6b5e` |
| 6 | `POST /v1/auth/token` | 200 | 52 | `qa-952dbd9d-870b-4c17-9038-c348166f7f4a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 44 | `qa-ce5d54b0-94ae-4b50-989e-cdf8517ce1e6` |
| 8 | `POST /v1/auth/token` | 401 | 34 | `qa-57a8364e-395e-4ed6-9df2-a2959f51d80f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-2804a4ed-f3b3-40b6-9084-26e71c5d9b03` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-e38e4072-36de-42bb-bfc0-44e2fb5a0c93` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7dfb6aae-dd0e-4456-9fdd-f6c28eb890ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dfb6aae-dd0e-4456-9fdd-f6c28eb890ec
Content-Type: application/json

--- request body ---
{"handle":"qa-7702f1b580de","displayName":"QA 7702f1b580de","password":"****","region":"eu"}

--- response: 201 in 519 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dfb6aae-dd0e-4456-9fdd-f6c28eb890ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-7702f1b580de
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6bb1192-abf0-46c7-8f72-1fa4e3237326","handle":"qa-7702f1b580de","displayName":"QA 7702f1b580de","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.368050833Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-de6e4a3a-ea69-4fb2-94e1-7152eaeabcef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de6e4a3a-ea69-4fb2-94e1-7152eaeabcef
Content-Type: application/json

--- request body ---
{"handle":"qa-25321a7ac93e","displayName":"QA 25321a7ac93e","password":"****","region":"eu"}

--- response: 201 in 128 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-de6e4a3a-ea69-4fb2-94e1-7152eaeabcef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-25321a7ac93e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_15b2ebdb-d506-435b-8196-299b845c3fa5","handle":"qa-25321a7ac93e","displayName":"QA 25321a7ac93e","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.885901894Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-110b3d8b-ed90-4d06-8c13-f2000040c95f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-110b3d8b-ed90-4d06-8c13-f2000040c95f
Content-Type: application/json

--- request body ---
{"handle":"qa-7702f1b580de","password":"****"}

--- response: 200 in 71 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-110b3d8b-ed90-4d06-8c13-f2000040c95f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c6bb1192-abf0-46c7-8f72-1fa4e3237326"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-973722d6-8517-48b2-aa6e-b083d737ab0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-973722d6-8517-48b2-aa6e-b083d737ab0e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-25321a7ac93e","subject":"Error contract","message":"Hi"}

--- response: 201 in 66 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-973722d6-8517-48b2-aa6e-b083d737ab0e
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
Location: /v1/conversations/cnv_95425525-8ac2-4589-87c6-dc17ff4f72ff
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_95425525-8ac2-4589-87c6-dc17ff4f72ff","subject":"Error contract","status":"open","region":"eu","participants":["qa-7702f1b580de","qa-25321a7ac93e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:02.200992873Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2e9b6de8-3f9a-4e1d-ab07-513dc01b6b5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e9b6de8-3f9a-4e1d-ab07-513dc01b6b5e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 40 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e9b6de8-3f9a-4e1d-ab07-513dc01b6b5e
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
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-2e9b6de8-3f9a-4e1d-ab07-513dc01b6b5e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-952dbd9d-870b-4c17-9038-c348166f7f4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-952dbd9d-870b-4c17-9038-c348166f7f4a
Content-Type: application/json

--- request body ---
{"handle":"qa-25321a7ac93e","password":"****"}

--- response: 200 in 52 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-952dbd9d-870b-4c17-9038-c348166f7f4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_15b2ebdb-d506-435b-8196-299b845c3fa5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce5d54b0-94ae-4b50-989e-cdf8517ce1e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce5d54b0-94ae-4b50-989e-cdf8517ce1e6
Content-Type: application/json

--- response: 204 in 44 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce5d54b0-94ae-4b50-989e-cdf8517ce1e6
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
correlation: qa-57a8364e-395e-4ed6-9df2-a2959f51d80f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57a8364e-395e-4ed6-9df2-a2959f51d80f
Content-Type: application/json

--- request body ---
{"handle":"qa-25321a7ac93e","password":"****"}

--- response: 401 in 34 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57a8364e-395e-4ed6-9df2-a2959f51d80f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-57a8364e-395e-4ed6-9df2-a2959f51d80f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2804a4ed-f3b3-40b6-9084-26e71c5d9b03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2804a4ed-f3b3-40b6-9084-26e71c5d9b03
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2804a4ed-f3b3-40b6-9084-26e71c5d9b03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e38e4072-36de-42bb-bfc0-44e2fb5a0c93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e38e4072-36de-42bb-bfc0-44e2fb5a0c93
Content-Type: application/json

--- request body ---
{"handle":"qa-7702f1b580de","password":"****"}

--- response: 401 in 25 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e38e4072-36de-42bb-bfc0-44e2fb5a0c93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e38e4072-36de-42bb-bfc0-44e2fb5a0c93"}
```
