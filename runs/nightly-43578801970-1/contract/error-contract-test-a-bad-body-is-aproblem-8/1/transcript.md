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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-0cb735e0-4f33-4f99-aa7a-949cd33a7da9` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-c9ed57af-a771-4f33-9302-1aef06e3b007` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-32ed0194-c5a9-42cb-a589-e4ac49e4359d` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-9dca4e03-f86d-4763-8ae2-809257eed72e` |
| 5 | `PATCH /v1/accounts/me` | 422 | 21 | `qa-f140d7cd-9ce8-481d-aea2-aaa1379109ec` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-c28e2145-31d6-45eb-9029-dc88f404fc31` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-d70df30e-efc5-4759-9acf-0b3badccbd7c` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-ef43beed-31e7-4cc4-b5b8-5c416bea8628` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-072a08cf-c4c1-4240-9fb5-076a1fa44bc3` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-1b93668e-9ed1-464d-99cd-1b0da0f53c87` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0cb735e0-4f33-4f99-aa7a-949cd33a7da9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cb735e0-4f33-4f99-aa7a-949cd33a7da9
Content-Type: application/json

--- request body ---
{"handle":"qa-5a0058e0494f","displayName":"QA 5a0058e0494f","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cb735e0-4f33-4f99-aa7a-949cd33a7da9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Location: /v1/accounts/qa-5a0058e0494f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9399749-3572-4e1c-a3c2-1dbaca2cbb0d","handle":"qa-5a0058e0494f","displayName":"QA 5a0058e0494f","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.783470218Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c9ed57af-a771-4f33-9302-1aef06e3b007

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9ed57af-a771-4f33-9302-1aef06e3b007
Content-Type: application/json

--- request body ---
{"handle":"qa-c8812e78e775","displayName":"QA c8812e78e775","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9ed57af-a771-4f33-9302-1aef06e3b007
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Location: /v1/accounts/qa-c8812e78e775
X-Served-Region: eu
Content-Length: 181

{"id":"acc_43ae9fcd-2dbd-4fc1-858a-90f75ba04da7","handle":"qa-c8812e78e775","displayName":"QA c8812e78e775","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.823552625Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-32ed0194-c5a9-42cb-a589-e4ac49e4359d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32ed0194-c5a9-42cb-a589-e4ac49e4359d
Content-Type: application/json

--- request body ---
{"handle":"qa-5a0058e0494f","password":"****"}

--- response: 200 in 53 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-32ed0194-c5a9-42cb-a589-e4ac49e4359d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a9399749-3572-4e1c-a3c2-1dbaca2cbb0d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9dca4e03-f86d-4763-8ae2-809257eed72e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dca4e03-f86d-4763-8ae2-809257eed72e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c8812e78e775","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dca4e03-f86d-4763-8ae2-809257eed72e
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
Location: /v1/conversations/cnv_f3c62383-5585-4ce9-907d-c0aad9f125c7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f3c62383-5585-4ce9-907d-c0aad9f125c7","subject":"Error contract","status":"open","region":"eu","participants":["qa-5a0058e0494f","qa-c8812e78e775"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:11.926402092Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-f140d7cd-9ce8-481d-aea2-aaa1379109ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f140d7cd-9ce8-481d-aea2-aaa1379109ec
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f140d7cd-9ce8-481d-aea2-aaa1379109ec
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-f140d7cd-9ce8-481d-aea2-aaa1379109ec","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c28e2145-31d6-45eb-9029-dc88f404fc31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c28e2145-31d6-45eb-9029-dc88f404fc31
Content-Type: application/json

--- request body ---
{"handle":"qa-c8812e78e775","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-c28e2145-31d6-45eb-9029-dc88f404fc31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_43ae9fcd-2dbd-4fc1-858a-90f75ba04da7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d70df30e-efc5-4759-9acf-0b3badccbd7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d70df30e-efc5-4759-9acf-0b3badccbd7c
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d70df30e-efc5-4759-9acf-0b3badccbd7c
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
correlation: qa-ef43beed-31e7-4cc4-b5b8-5c416bea8628

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef43beed-31e7-4cc4-b5b8-5c416bea8628
Content-Type: application/json

--- request body ---
{"handle":"qa-c8812e78e775","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef43beed-31e7-4cc4-b5b8-5c416bea8628
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ef43beed-31e7-4cc4-b5b8-5c416bea8628"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-072a08cf-c4c1-4240-9fb5-076a1fa44bc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-072a08cf-c4c1-4240-9fb5-076a1fa44bc3
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-072a08cf-c4c1-4240-9fb5-076a1fa44bc3
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
correlation: qa-1b93668e-9ed1-464d-99cd-1b0da0f53c87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b93668e-9ed1-464d-99cd-1b0da0f53c87
Content-Type: application/json

--- request body ---
{"handle":"qa-5a0058e0494f","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b93668e-9ed1-464d-99cd-1b0da0f53c87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1b93668e-9ed1-464d-99cd-1b0da0f53c87"}
```
