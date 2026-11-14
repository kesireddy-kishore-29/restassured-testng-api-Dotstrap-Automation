# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-17c209b2-e976-4c8b-b119-b18323697b39` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-844587e4-6549-4da4-9a4e-572b58ff7c5f` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-5dc21c9f-0451-4a13-9c64-e6f35fdefe1a` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-2d8fa548-51ac-4aa1-903d-dd08130eaafb` |
| 5 | `PATCH /v1/accounts/me` | 422 | 14 | `qa-c940499c-93a1-419c-ae54-413cc7c84720` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-e30ba423-0299-49b3-9e52-5ea8cf7f970c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-e3f18920-66a1-4cd2-aaa6-a4a995687903` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-6baa00be-e28d-4174-834b-db99cc06cc2c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-a98485e9-94be-4370-a599-59eb69bee918` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-649b7635-6491-4a2c-a368-5082967a706b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-17c209b2-e976-4c8b-b119-b18323697b39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17c209b2-e976-4c8b-b119-b18323697b39
Content-Type: application/json

--- request body ---
{"handle":"qa-cb2452108458","displayName":"QA cb2452108458","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-17c209b2-e976-4c8b-b119-b18323697b39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 7
Location: /v1/accounts/qa-cb2452108458
X-Served-Region: eu
Content-Length: 181

{"id":"acc_643ed689-53d9-4a7a-8770-a957b0b282f5","handle":"qa-cb2452108458","displayName":"QA cb2452108458","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.182905507Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-844587e4-6549-4da4-9a4e-572b58ff7c5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-844587e4-6549-4da4-9a4e-572b58ff7c5f
Content-Type: application/json

--- request body ---
{"handle":"qa-74e73f950a7b","displayName":"QA 74e73f950a7b","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-844587e4-6549-4da4-9a4e-572b58ff7c5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 7
Location: /v1/accounts/qa-74e73f950a7b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f482481-3575-4575-a3b0-554291418666","handle":"qa-74e73f950a7b","displayName":"QA 74e73f950a7b","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.202282056Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5dc21c9f-0451-4a13-9c64-e6f35fdefe1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dc21c9f-0451-4a13-9c64-e6f35fdefe1a
Content-Type: application/json

--- request body ---
{"handle":"qa-cb2452108458","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dc21c9f-0451-4a13-9c64-e6f35fdefe1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_643ed689-53d9-4a7a-8770-a957b0b282f5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2d8fa548-51ac-4aa1-903d-dd08130eaafb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d8fa548-51ac-4aa1-903d-dd08130eaafb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-74e73f950a7b","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d8fa548-51ac-4aa1-903d-dd08130eaafb
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
Location: /v1/conversations/cnv_7f79fdc2-46ac-42f0-9fa4-f8083c82717a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7f79fdc2-46ac-42f0-9fa4-f8083c82717a","subject":"Error contract","status":"open","region":"eu","participants":["qa-cb2452108458","qa-74e73f950a7b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.274326349Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-c940499c-93a1-419c-ae54-413cc7c84720

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c940499c-93a1-419c-ae54-413cc7c84720
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c940499c-93a1-419c-ae54-413cc7c84720
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-c940499c-93a1-419c-ae54-413cc7c84720","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e30ba423-0299-49b3-9e52-5ea8cf7f970c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e30ba423-0299-49b3-9e52-5ea8cf7f970c
Content-Type: application/json

--- request body ---
{"handle":"qa-74e73f950a7b","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-e30ba423-0299-49b3-9e52-5ea8cf7f970c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f482481-3575-4575-a3b0-554291418666"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3f18920-66a1-4cd2-aaa6-a4a995687903

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3f18920-66a1-4cd2-aaa6-a4a995687903
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3f18920-66a1-4cd2-aaa6-a4a995687903
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
correlation: qa-6baa00be-e28d-4174-834b-db99cc06cc2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6baa00be-e28d-4174-834b-db99cc06cc2c
Content-Type: application/json

--- request body ---
{"handle":"qa-74e73f950a7b","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6baa00be-e28d-4174-834b-db99cc06cc2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6baa00be-e28d-4174-834b-db99cc06cc2c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a98485e9-94be-4370-a599-59eb69bee918

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a98485e9-94be-4370-a599-59eb69bee918
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a98485e9-94be-4370-a599-59eb69bee918
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
correlation: qa-649b7635-6491-4a2c-a368-5082967a706b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-649b7635-6491-4a2c-a368-5082967a706b
Content-Type: application/json

--- request body ---
{"handle":"qa-cb2452108458","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-649b7635-6491-4a2c-a368-5082967a706b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-649b7635-6491-4a2c-a368-5082967a706b"}
```
