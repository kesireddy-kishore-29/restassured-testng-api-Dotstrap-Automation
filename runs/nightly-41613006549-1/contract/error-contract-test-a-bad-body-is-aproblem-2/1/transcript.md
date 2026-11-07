# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 383 | `qa-1df9114c-d2d8-42af-8b84-555cfb5ed86c` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-4633c473-cd6a-49ca-a6af-375330eb2287` |
| 3 | `POST /v1/auth/token` | 200 | 49 | `qa-424bf63f-f753-4a0a-8b4e-34a30e97c74d` |
| 4 | `POST /v1/conversations` | 201 | 47 | `qa-479b06f4-c339-4bd8-bb78-721700c30b7e` |
| 5 | `POST /v1/auth/token` | 422 | 64 | `qa-f7bc30f2-dde0-4bdd-914c-3a83cd8464b3` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-62324693-f5bf-4756-a789-3167da620ade` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-334db039-70d2-4b2b-a4de-be0c54f13e16` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-d9cf8ff6-8962-44a1-b5c5-4e6e3b62d443` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-4bbefe0f-45b4-416f-a8cb-529c09c14d93` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-dafcafc5-74c9-458f-b35b-fb18a914d48c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1df9114c-d2d8-42af-8b84-555cfb5ed86c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1df9114c-d2d8-42af-8b84-555cfb5ed86c
Content-Type: application/json

--- request body ---
{"handle":"qa-a56fa9be34d7","displayName":"QA a56fa9be34d7","password":"****","region":"eu"}

--- response: 201 in 383 ms ---
Date: Tue, 03 Nov 2026 09:41:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-1df9114c-d2d8-42af-8b84-555cfb5ed86c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-a56fa9be34d7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ae20ffed-a7ab-4627-87b4-a8e2c84418df","handle":"qa-a56fa9be34d7","displayName":"QA a56fa9be34d7","region":"eu","role":"user","createdAt":"2026-11-03T09:41:30.839951155Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4633c473-cd6a-49ca-a6af-375330eb2287

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4633c473-cd6a-49ca-a6af-375330eb2287
Content-Type: application/json

--- request body ---
{"handle":"qa-ba5305d8205a","displayName":"QA ba5305d8205a","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4633c473-cd6a-49ca-a6af-375330eb2287
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-ba5305d8205a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7238cc1-4079-4116-bb14-2187562143bd","handle":"qa-ba5305d8205a","displayName":"QA ba5305d8205a","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.223270603Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-424bf63f-f753-4a0a-8b4e-34a30e97c74d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-424bf63f-f753-4a0a-8b4e-34a30e97c74d
Content-Type: application/json

--- request body ---
{"handle":"qa-a56fa9be34d7","password":"****"}

--- response: 200 in 49 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-424bf63f-f753-4a0a-8b4e-34a30e97c74d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ae20ffed-a7ab-4627-87b4-a8e2c84418df"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-479b06f4-c339-4bd8-bb78-721700c30b7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-479b06f4-c339-4bd8-bb78-721700c30b7e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ba5305d8205a","subject":"Error contract","message":"Hi"}

--- response: 201 in 47 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-479b06f4-c339-4bd8-bb78-721700c30b7e
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
Location: /v1/conversations/cnv_de398d93-32d5-42ed-87ec-972d48101f3a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_de398d93-32d5-42ed-87ec-972d48101f3a","subject":"Error contract","status":"open","region":"eu","participants":["qa-a56fa9be34d7","qa-ba5305d8205a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:31.405501479Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f7bc30f2-dde0-4bdd-914c-3a83cd8464b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7bc30f2-dde0-4bdd-914c-3a83cd8464b3
Content-Type: application/json

--- request body ---
{"handle":"qa-a56fa9be34d7","password":"****","ttlSeconds":0}

--- response: 422 in 64 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7bc30f2-dde0-4bdd-914c-3a83cd8464b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 10
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-f7bc30f2-dde0-4bdd-914c-3a83cd8464b3","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-62324693-f5bf-4756-a789-3167da620ade

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62324693-f5bf-4756-a789-3167da620ade
Content-Type: application/json

--- request body ---
{"handle":"qa-ba5305d8205a","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-62324693-f5bf-4756-a789-3167da620ade
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7238cc1-4079-4116-bb14-2187562143bd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-334db039-70d2-4b2b-a4de-be0c54f13e16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-334db039-70d2-4b2b-a4de-be0c54f13e16
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-334db039-70d2-4b2b-a4de-be0c54f13e16
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
correlation: qa-d9cf8ff6-8962-44a1-b5c5-4e6e3b62d443

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9cf8ff6-8962-44a1-b5c5-4e6e3b62d443
Content-Type: application/json

--- request body ---
{"handle":"qa-ba5305d8205a","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9cf8ff6-8962-44a1-b5c5-4e6e3b62d443
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d9cf8ff6-8962-44a1-b5c5-4e6e3b62d443"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4bbefe0f-45b4-416f-a8cb-529c09c14d93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bbefe0f-45b4-416f-a8cb-529c09c14d93
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4bbefe0f-45b4-416f-a8cb-529c09c14d93
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
correlation: qa-dafcafc5-74c9-458f-b35b-fb18a914d48c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dafcafc5-74c9-458f-b35b-fb18a914d48c
Content-Type: application/json

--- request body ---
{"handle":"qa-a56fa9be34d7","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dafcafc5-74c9-458f-b35b-fb18a914d48c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dafcafc5-74c9-458f-b35b-fb18a914d48c"}
```
