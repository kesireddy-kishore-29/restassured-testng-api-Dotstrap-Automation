# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-8a151bd7-71a8-48bc-9b9c-298e1e2214b7` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-34eb0633-f631-4f22-8da4-32c1b2d35328` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-ff6aa55f-d487-474b-b320-645f3fea5261` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-8be16de5-05f0-4ab7-839a-581161722293` |
| 5 | `POST /v1/conversations` | 400 | 6 | `qa-03136f0b-38f6-43bf-a588-db2e8fa24b3d` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-25b8f832-39d7-44f0-8a7d-639f67acfbf4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-4dd97bc4-baf6-42a4-9a3e-f3179323cbff` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-72736020-05a2-423c-9e84-92b283113584` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-f230ccea-b185-4dfe-aec2-aa328a810898` |
| 10 | `POST /v1/auth/token` | 401 | 38 | `qa-e4682668-eaf4-4d96-a496-a479ad0c8b4e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8a151bd7-71a8-48bc-9b9c-298e1e2214b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a151bd7-71a8-48bc-9b9c-298e1e2214b7
Content-Type: application/json

--- request body ---
{"handle":"qa-9bdd31b72185","displayName":"QA 9bdd31b72185","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a151bd7-71a8-48bc-9b9c-298e1e2214b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Location: /v1/accounts/qa-9bdd31b72185
X-Served-Region: eu
Content-Length: 181

{"id":"acc_98713233-59c4-4ef1-8689-cfa45b86fddd","handle":"qa-9bdd31b72185","displayName":"QA 9bdd31b72185","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.761535191Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-34eb0633-f631-4f22-8da4-32c1b2d35328

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34eb0633-f631-4f22-8da4-32c1b2d35328
Content-Type: application/json

--- request body ---
{"handle":"qa-4f061fac8a66","displayName":"QA 4f061fac8a66","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-34eb0633-f631-4f22-8da4-32c1b2d35328
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
Location: /v1/accounts/qa-4f061fac8a66
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ded08c5e-9b32-4011-90d1-e1e84c40dc1a","handle":"qa-4f061fac8a66","displayName":"QA 4f061fac8a66","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.806372310Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ff6aa55f-d487-474b-b320-645f3fea5261

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff6aa55f-d487-474b-b320-645f3fea5261
Content-Type: application/json

--- request body ---
{"handle":"qa-9bdd31b72185","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff6aa55f-d487-474b-b320-645f3fea5261
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_98713233-59c4-4ef1-8689-cfa45b86fddd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8be16de5-05f0-4ab7-839a-581161722293

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8be16de5-05f0-4ab7-839a-581161722293
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4f061fac8a66","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-8be16de5-05f0-4ab7-839a-581161722293
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
Location: /v1/conversations/cnv_39a6f70f-2f36-4fad-b70d-134176d23342
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_39a6f70f-2f36-4fad-b70d-134176d23342","subject":"Error contract","status":"open","region":"eu","participants":["qa-9bdd31b72185","qa-4f061fac8a66"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.844751934Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-03136f0b-38f6-43bf-a588-db2e8fa24b3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03136f0b-38f6-43bf-a588-db2e8fa24b3d
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03136f0b-38f6-43bf-a588-db2e8fa24b3d
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-03136f0b-38f6-43bf-a588-db2e8fa24b3d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-25b8f832-39d7-44f0-8a7d-639f67acfbf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25b8f832-39d7-44f0-8a7d-639f67acfbf4
Content-Type: application/json

--- request body ---
{"handle":"qa-4f061fac8a66","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-25b8f832-39d7-44f0-8a7d-639f67acfbf4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ded08c5e-9b32-4011-90d1-e1e84c40dc1a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4dd97bc4-baf6-42a4-9a3e-f3179323cbff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dd97bc4-baf6-42a4-9a3e-f3179323cbff
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4dd97bc4-baf6-42a4-9a3e-f3179323cbff
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
correlation: qa-72736020-05a2-423c-9e84-92b283113584

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72736020-05a2-423c-9e84-92b283113584
Content-Type: application/json

--- request body ---
{"handle":"qa-4f061fac8a66","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-72736020-05a2-423c-9e84-92b283113584
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-72736020-05a2-423c-9e84-92b283113584"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f230ccea-b185-4dfe-aec2-aa328a810898

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f230ccea-b185-4dfe-aec2-aa328a810898
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f230ccea-b185-4dfe-aec2-aa328a810898
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e4682668-eaf4-4d96-a496-a479ad0c8b4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4682668-eaf4-4d96-a496-a479ad0c8b4e
Content-Type: application/json

--- request body ---
{"handle":"qa-9bdd31b72185","password":"****"}

--- response: 401 in 38 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4682668-eaf4-4d96-a496-a479ad0c8b4e
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e4682668-eaf4-4d96-a496-a479ad0c8b4e"}
```
