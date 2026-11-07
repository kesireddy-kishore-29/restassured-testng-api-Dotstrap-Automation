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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-a0694d03-7845-41c1-8525-c11730ee8a2a` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-0121603e-5561-4ec8-b4db-c251e542122f` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-8140ee28-e3ad-4a83-a8ae-1bd80db567a7` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-76cb4e00-1357-467f-85b6-fe90de00b1a5` |
| 5 | `POST /v1/conversations` | 422 | 13 | `qa-2324aa6b-3a03-4278-b1c8-1ad07e53bba7` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-d51ebb66-288d-40c5-a277-f4c4d671afbe` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-42d54463-20c3-4fe5-a220-999d06c91ce0` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-eec8fe05-2caf-4e55-8983-33b3cdbf466d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-7cb8c939-e95c-4dee-94a5-c82b44efc541` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-f85d4e1f-e744-401e-a9f7-15b0060d45e0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a0694d03-7845-41c1-8525-c11730ee8a2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0694d03-7845-41c1-8525-c11730ee8a2a
Content-Type: application/json

--- request body ---
{"handle":"qa-8e4ffd400d04","displayName":"QA 8e4ffd400d04","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0694d03-7845-41c1-8525-c11730ee8a2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Location: /v1/accounts/qa-8e4ffd400d04
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d5004124-a7bb-4ff6-8101-9eb091e29c42","handle":"qa-8e4ffd400d04","displayName":"QA 8e4ffd400d04","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.002457939Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0121603e-5561-4ec8-b4db-c251e542122f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0121603e-5561-4ec8-b4db-c251e542122f
Content-Type: application/json

--- request body ---
{"handle":"qa-9b6d98814f73","displayName":"QA 9b6d98814f73","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0121603e-5561-4ec8-b4db-c251e542122f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 8
Location: /v1/accounts/qa-9b6d98814f73
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7911b5f6-09e5-4d2c-a6f8-1a210c539907","handle":"qa-9b6d98814f73","displayName":"QA 9b6d98814f73","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.021633408Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8140ee28-e3ad-4a83-a8ae-1bd80db567a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8140ee28-e3ad-4a83-a8ae-1bd80db567a7
Content-Type: application/json

--- request body ---
{"handle":"qa-8e4ffd400d04","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8140ee28-e3ad-4a83-a8ae-1bd80db567a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d5004124-a7bb-4ff6-8101-9eb091e29c42"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-76cb4e00-1357-467f-85b6-fe90de00b1a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76cb4e00-1357-467f-85b6-fe90de00b1a5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9b6d98814f73","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-76cb4e00-1357-467f-85b6-fe90de00b1a5
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
Location: /v1/conversations/cnv_70f3e1bc-e4b7-41b5-960e-a8a2b3108c45
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_70f3e1bc-e4b7-41b5-960e-a8a2b3108c45","subject":"Error contract","status":"open","region":"eu","participants":["qa-8e4ffd400d04","qa-9b6d98814f73"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.098326579Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-2324aa6b-3a03-4278-b1c8-1ad07e53bba7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2324aa6b-3a03-4278-b1c8-1ad07e53bba7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9b6d98814f73","subject":" ","message":"Hi"}

--- response: 422 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2324aa6b-3a03-4278-b1c8-1ad07e53bba7
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-2324aa6b-3a03-4278-b1c8-1ad07e53bba7","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d51ebb66-288d-40c5-a277-f4c4d671afbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d51ebb66-288d-40c5-a277-f4c4d671afbe
Content-Type: application/json

--- request body ---
{"handle":"qa-9b6d98814f73","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d51ebb66-288d-40c5-a277-f4c4d671afbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7911b5f6-09e5-4d2c-a6f8-1a210c539907"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-42d54463-20c3-4fe5-a220-999d06c91ce0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42d54463-20c3-4fe5-a220-999d06c91ce0
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-42d54463-20c3-4fe5-a220-999d06c91ce0
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
correlation: qa-eec8fe05-2caf-4e55-8983-33b3cdbf466d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eec8fe05-2caf-4e55-8983-33b3cdbf466d
Content-Type: application/json

--- request body ---
{"handle":"qa-9b6d98814f73","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eec8fe05-2caf-4e55-8983-33b3cdbf466d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eec8fe05-2caf-4e55-8983-33b3cdbf466d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7cb8c939-e95c-4dee-94a5-c82b44efc541

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cb8c939-e95c-4dee-94a5-c82b44efc541
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7cb8c939-e95c-4dee-94a5-c82b44efc541
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
correlation: qa-f85d4e1f-e744-401e-a9f7-15b0060d45e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f85d4e1f-e744-401e-a9f7-15b0060d45e0
Content-Type: application/json

--- request body ---
{"handle":"qa-8e4ffd400d04","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f85d4e1f-e744-401e-a9f7-15b0060d45e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f85d4e1f-e744-401e-a9f7-15b0060d45e0"}
```
