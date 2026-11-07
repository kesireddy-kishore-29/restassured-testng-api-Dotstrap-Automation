# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-c41c8d93-21d1-4f19-86d0-bebde2b17f97` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-4e1d77c1-fd35-44ee-8e20-a4c263ec5480` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-572f506b-bf93-4b16-92d5-4efa65b603f1` |
| 4 | `POST /v1/conversations` | 201 | 5 | `qa-34594fa2-1396-44d1-8e8c-b28d63651339` |
| 5 | `POST /v1/conversations` | 422 | 14 | `qa-adf6c24a-6e56-4b0a-87b3-6c4c052e4de7` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-113ec681-3c69-4f93-95df-d8601c3b70d1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-22f7154c-68f0-4dc5-8293-3683d37ee913` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-7e472304-f38b-4f4d-8405-a2fa2be92e5b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-c7de44ef-8883-4f0f-9ef3-e8297b311841` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-94ba5d50-afb4-40f6-b00a-2af50e922b30` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c41c8d93-21d1-4f19-86d0-bebde2b17f97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c41c8d93-21d1-4f19-86d0-bebde2b17f97
Content-Type: application/json

--- request body ---
{"handle":"qa-3ca540b913db","displayName":"QA 3ca540b913db","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c41c8d93-21d1-4f19-86d0-bebde2b17f97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 9
Location: /v1/accounts/qa-3ca540b913db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28de9166-2b6d-47f4-a714-21573063a22d","handle":"qa-3ca540b913db","displayName":"QA 3ca540b913db","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.857829121Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4e1d77c1-fd35-44ee-8e20-a4c263ec5480

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e1d77c1-fd35-44ee-8e20-a4c263ec5480
Content-Type: application/json

--- request body ---
{"handle":"qa-950dfb592d8b","displayName":"QA 950dfb592d8b","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e1d77c1-fd35-44ee-8e20-a4c263ec5480
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 9
Location: /v1/accounts/qa-950dfb592d8b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5974b373-b2f4-4a93-9380-9eafb4a25b6c","handle":"qa-950dfb592d8b","displayName":"QA 950dfb592d8b","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.895916910Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-572f506b-bf93-4b16-92d5-4efa65b603f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-572f506b-bf93-4b16-92d5-4efa65b603f1
Content-Type: application/json

--- request body ---
{"handle":"qa-3ca540b913db","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-572f506b-bf93-4b16-92d5-4efa65b603f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28de9166-2b6d-47f4-a714-21573063a22d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-34594fa2-1396-44d1-8e8c-b28d63651339

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34594fa2-1396-44d1-8e8c-b28d63651339
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-950dfb592d8b","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-34594fa2-1396-44d1-8e8c-b28d63651339
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
Location: /v1/conversations/cnv_3307be40-482c-45e1-9d98-6e78e184a131
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3307be40-482c-45e1-9d98-6e78e184a131","subject":"Error contract","status":"open","region":"eu","participants":["qa-3ca540b913db","qa-950dfb592d8b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.954268314Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-adf6c24a-6e56-4b0a-87b3-6c4c052e4de7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adf6c24a-6e56-4b0a-87b3-6c4c052e4de7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-950dfb592d8b","subject":" ","message":"Hi"}

--- response: 422 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-adf6c24a-6e56-4b0a-87b3-6c4c052e4de7
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-adf6c24a-6e56-4b0a-87b3-6c4c052e4de7","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-113ec681-3c69-4f93-95df-d8601c3b70d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-113ec681-3c69-4f93-95df-d8601c3b70d1
Content-Type: application/json

--- request body ---
{"handle":"qa-950dfb592d8b","password":"****"}

--- response: 200 in 32 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-113ec681-3c69-4f93-95df-d8601c3b70d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5974b373-b2f4-4a93-9380-9eafb4a25b6c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-22f7154c-68f0-4dc5-8293-3683d37ee913

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22f7154c-68f0-4dc5-8293-3683d37ee913
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-22f7154c-68f0-4dc5-8293-3683d37ee913
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
correlation: qa-7e472304-f38b-4f4d-8405-a2fa2be92e5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e472304-f38b-4f4d-8405-a2fa2be92e5b
Content-Type: application/json

--- request body ---
{"handle":"qa-950dfb592d8b","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e472304-f38b-4f4d-8405-a2fa2be92e5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e472304-f38b-4f4d-8405-a2fa2be92e5b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c7de44ef-8883-4f0f-9ef3-e8297b311841

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7de44ef-8883-4f0f-9ef3-e8297b311841
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c7de44ef-8883-4f0f-9ef3-e8297b311841
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
correlation: qa-94ba5d50-afb4-40f6-b00a-2af50e922b30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94ba5d50-afb4-40f6-b00a-2af50e922b30
Content-Type: application/json

--- request body ---
{"handle":"qa-3ca540b913db","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94ba5d50-afb4-40f6-b00a-2af50e922b30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-94ba5d50-afb4-40f6-b00a-2af50e922b30"}
```
