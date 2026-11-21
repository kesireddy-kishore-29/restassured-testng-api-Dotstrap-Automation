# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-8a0ca859-e3ba-4129-a0ab-436c1429e25d` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-7788a25d-eb67-4ba0-89e9-8e3c59b0ea8d` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-08951c2d-18c2-45b4-83bb-8a7d97eb9c47` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-f082f812-5493-4491-9533-6ed3d37b7a9d` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 18 | `qa-959a410d-14ed-4879-a0bd-2312e6dd0a69` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-74159246-8f95-45fb-802a-de82ad50f45d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 59 | `qa-bddcb6a1-83fd-465f-b76a-cbeddb0040c9` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-f1bf013f-5ddc-49f8-b457-48dfb8344317` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-379076cc-abac-4cfa-8dc2-1de93926e31e` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-d2d30874-be3b-467c-a5ce-88c384261bb4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8a0ca859-e3ba-4129-a0ab-436c1429e25d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a0ca859-e3ba-4129-a0ab-436c1429e25d
Content-Type: application/json

--- request body ---
{"handle":"qa-04c42a0e2a1b","displayName":"QA 04c42a0e2a1b","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a0ca859-e3ba-4129-a0ab-436c1429e25d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 6
Location: /v1/accounts/qa-04c42a0e2a1b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e2b03415-d63a-4522-a8e6-1fcf9859c01e","handle":"qa-04c42a0e2a1b","displayName":"QA 04c42a0e2a1b","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.316129517Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7788a25d-eb67-4ba0-89e9-8e3c59b0ea8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7788a25d-eb67-4ba0-89e9-8e3c59b0ea8d
Content-Type: application/json

--- request body ---
{"handle":"qa-82ebabd0a31d","displayName":"QA 82ebabd0a31d","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7788a25d-eb67-4ba0-89e9-8e3c59b0ea8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 6
Location: /v1/accounts/qa-82ebabd0a31d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e2eecbf5-aa7f-4911-998c-e66f5f6b824e","handle":"qa-82ebabd0a31d","displayName":"QA 82ebabd0a31d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.352196133Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-08951c2d-18c2-45b4-83bb-8a7d97eb9c47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08951c2d-18c2-45b4-83bb-8a7d97eb9c47
Content-Type: application/json

--- request body ---
{"handle":"qa-04c42a0e2a1b","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-08951c2d-18c2-45b4-83bb-8a7d97eb9c47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e2b03415-d63a-4522-a8e6-1fcf9859c01e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f082f812-5493-4491-9533-6ed3d37b7a9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f082f812-5493-4491-9533-6ed3d37b7a9d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-82ebabd0a31d","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f082f812-5493-4491-9533-6ed3d37b7a9d
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
Location: /v1/conversations/cnv_cd3ac29b-eed0-4650-af2a-8df11362624c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cd3ac29b-eed0-4650-af2a-8df11362624c","subject":"Error contract","status":"open","region":"eu","participants":["qa-04c42a0e2a1b","qa-82ebabd0a31d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:03.444546598Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_cd3ac29b-eed0-4650-af2a-8df11362624c/messages
correlation: qa-959a410d-14ed-4879-a0bd-2312e6dd0a69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-959a410d-14ed-4879-a0bd-2312e6dd0a69
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-959a410d-14ed-4879-a0bd-2312e6dd0a69
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_cd3ac29b-eed0-4650-af2a-8df11362624c/messages","correlationId":"qa-959a410d-14ed-4879-a0bd-2312e6dd0a69"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-74159246-8f95-45fb-802a-de82ad50f45d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74159246-8f95-45fb-802a-de82ad50f45d
Content-Type: application/json

--- request body ---
{"handle":"qa-82ebabd0a31d","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-74159246-8f95-45fb-802a-de82ad50f45d
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e2eecbf5-aa7f-4911-998c-e66f5f6b824e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bddcb6a1-83fd-465f-b76a-cbeddb0040c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bddcb6a1-83fd-465f-b76a-cbeddb0040c9
Content-Type: application/json

--- response: 204 in 59 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bddcb6a1-83fd-465f-b76a-cbeddb0040c9
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
correlation: qa-f1bf013f-5ddc-49f8-b457-48dfb8344317

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1bf013f-5ddc-49f8-b457-48dfb8344317
Content-Type: application/json

--- request body ---
{"handle":"qa-82ebabd0a31d","password":"****"}

--- response: 401 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1bf013f-5ddc-49f8-b457-48dfb8344317
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f1bf013f-5ddc-49f8-b457-48dfb8344317"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-379076cc-abac-4cfa-8dc2-1de93926e31e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-379076cc-abac-4cfa-8dc2-1de93926e31e
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-379076cc-abac-4cfa-8dc2-1de93926e31e
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
correlation: qa-d2d30874-be3b-467c-a5ce-88c384261bb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2d30874-be3b-467c-a5ce-88c384261bb4
Content-Type: application/json

--- request body ---
{"handle":"qa-04c42a0e2a1b","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2d30874-be3b-467c-a5ce-88c384261bb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d2d30874-be3b-467c-a5ce-88c384261bb4"}
```
