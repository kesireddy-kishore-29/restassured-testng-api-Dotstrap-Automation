# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-8f437d2a-aba4-4ec0-ad1e-cbec094c2629` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-d199119e-5a9b-4abf-8585-7b41da91075b` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-a01dd58a-8a14-4ad0-a904-89ff2919707c` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-35d8e153-00ac-4ef2-8048-6d97415fb28c` |
| 5 | `POST /v1/credits/purchases` | 400 | 6 | `qa-115eaccd-0469-4c52-b854-681aaac332f6` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-af64174e-468f-4e87-a9c5-8104ccfecf92` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-b884cb6b-122c-4772-a13c-35deff2f6ca6` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-b7477f76-7334-4275-a95a-ed18f6546c4b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-0f18b2c7-e76e-4bcb-b76f-73c0b94c65d7` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-6035e7b5-3fac-4722-bbd0-fadba2b41c51` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8f437d2a-aba4-4ec0-ad1e-cbec094c2629

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f437d2a-aba4-4ec0-ad1e-cbec094c2629
Content-Type: application/json

--- request body ---
{"handle":"qa-02074c1d3f8f","displayName":"QA 02074c1d3f8f","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f437d2a-aba4-4ec0-ad1e-cbec094c2629
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
Location: /v1/accounts/qa-02074c1d3f8f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a60fc8c-4393-435c-8513-f25caae9d930","handle":"qa-02074c1d3f8f","displayName":"QA 02074c1d3f8f","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.276391619Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d199119e-5a9b-4abf-8585-7b41da91075b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d199119e-5a9b-4abf-8585-7b41da91075b
Content-Type: application/json

--- request body ---
{"handle":"qa-84d78f520fd2","displayName":"QA 84d78f520fd2","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d199119e-5a9b-4abf-8585-7b41da91075b
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
Location: /v1/accounts/qa-84d78f520fd2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f9323607-95a1-4789-a4c0-b2a2b084aeb5","handle":"qa-84d78f520fd2","displayName":"QA 84d78f520fd2","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.304647138Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a01dd58a-8a14-4ad0-a904-89ff2919707c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a01dd58a-8a14-4ad0-a904-89ff2919707c
Content-Type: application/json

--- request body ---
{"handle":"qa-02074c1d3f8f","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a01dd58a-8a14-4ad0-a904-89ff2919707c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a60fc8c-4393-435c-8513-f25caae9d930"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-35d8e153-00ac-4ef2-8048-6d97415fb28c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35d8e153-00ac-4ef2-8048-6d97415fb28c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-84d78f520fd2","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-35d8e153-00ac-4ef2-8048-6d97415fb28c
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
Location: /v1/conversations/cnv_104a4236-0d5a-4fd7-9ff9-ab8c6f4b1213
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_104a4236-0d5a-4fd7-9ff9-ab8c6f4b1213","subject":"Error contract","status":"open","region":"eu","participants":["qa-02074c1d3f8f","qa-84d78f520fd2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:03.347267164Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-115eaccd-0469-4c52-b854-681aaac332f6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fe757e106b734d6d9de10e6837924a86
X-Correlation-Id: qa-115eaccd-0469-4c52-b854-681aaac332f6
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-115eaccd-0469-4c52-b854-681aaac332f6
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-115eaccd-0469-4c52-b854-681aaac332f6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-af64174e-468f-4e87-a9c5-8104ccfecf92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af64174e-468f-4e87-a9c5-8104ccfecf92
Content-Type: application/json

--- request body ---
{"handle":"qa-84d78f520fd2","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-af64174e-468f-4e87-a9c5-8104ccfecf92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f9323607-95a1-4789-a4c0-b2a2b084aeb5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b884cb6b-122c-4772-a13c-35deff2f6ca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b884cb6b-122c-4772-a13c-35deff2f6ca6
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b884cb6b-122c-4772-a13c-35deff2f6ca6
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
correlation: qa-b7477f76-7334-4275-a95a-ed18f6546c4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7477f76-7334-4275-a95a-ed18f6546c4b
Content-Type: application/json

--- request body ---
{"handle":"qa-84d78f520fd2","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7477f76-7334-4275-a95a-ed18f6546c4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b7477f76-7334-4275-a95a-ed18f6546c4b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f18b2c7-e76e-4bcb-b76f-73c0b94c65d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f18b2c7-e76e-4bcb-b76f-73c0b94c65d7
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f18b2c7-e76e-4bcb-b76f-73c0b94c65d7
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
correlation: qa-6035e7b5-3fac-4722-bbd0-fadba2b41c51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6035e7b5-3fac-4722-bbd0-fadba2b41c51
Content-Type: application/json

--- request body ---
{"handle":"qa-02074c1d3f8f","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6035e7b5-3fac-4722-bbd0-fadba2b41c51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6035e7b5-3fac-4722-bbd0-fadba2b41c51"}
```
