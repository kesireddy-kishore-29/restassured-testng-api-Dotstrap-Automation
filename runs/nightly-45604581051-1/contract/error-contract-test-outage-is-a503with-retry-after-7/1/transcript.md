# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-32e9a82c-d606-4d7e-a2d7-64b00748c241` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-5ceae768-e0d7-44eb-af50-9e3fd2642bfe` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-23a73a84-73f0-413d-8917-690a1ff06a1c` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-4cefd45d-2290-4aae-8482-ea0f2ca9129f` |
| 5 | `GET /v1/conversations` | 503 | 13 | `qa-42ac5f52-6ac1-41ba-a468-56124e86827a` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-36dc804f-8847-4f11-9da3-cd09efac7687` |
| 7 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-55fb7d9c-32e7-4456-a504-cf278c69aff8` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-6d08b582-719f-43cb-8c6e-a201b9ea12c4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-99b9a900-e823-4d1c-b736-9e3f7905bbdc` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-cae71e8a-40e2-4958-a6b6-1a2673f393ee` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-32e9a82c-d606-4d7e-a2d7-64b00748c241

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32e9a82c-d606-4d7e-a2d7-64b00748c241
Content-Type: application/json

--- request body ---
{"handle":"qa-27bc7b0e9f66","displayName":"QA 27bc7b0e9f66","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-32e9a82c-d606-4d7e-a2d7-64b00748c241
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Location: /v1/accounts/qa-27bc7b0e9f66
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c96e5fb4-e090-4ff2-b326-b7e4d8ec2922","handle":"qa-27bc7b0e9f66","displayName":"QA 27bc7b0e9f66","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.438184178Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5ceae768-e0d7-44eb-af50-9e3fd2642bfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ceae768-e0d7-44eb-af50-9e3fd2642bfe
Content-Type: application/json

--- request body ---
{"handle":"qa-b4c00549fb36","displayName":"QA b4c00549fb36","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ceae768-e0d7-44eb-af50-9e3fd2642bfe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Location: /v1/accounts/qa-b4c00549fb36
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e3e14d85-449a-43c6-9707-5ae186a2fa6e","handle":"qa-b4c00549fb36","displayName":"QA b4c00549fb36","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.526488932Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-23a73a84-73f0-413d-8917-690a1ff06a1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23a73a84-73f0-413d-8917-690a1ff06a1c
Content-Type: application/json

--- request body ---
{"handle":"qa-27bc7b0e9f66","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-23a73a84-73f0-413d-8917-690a1ff06a1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c96e5fb4-e090-4ff2-b326-b7e4d8ec2922"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4cefd45d-2290-4aae-8482-ea0f2ca9129f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cefd45d-2290-4aae-8482-ea0f2ca9129f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b4c00549fb36","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cefd45d-2290-4aae-8482-ea0f2ca9129f
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
Location: /v1/conversations/cnv_5ef2c6d9-5c75-4962-9bc9-a7813bf6d89b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5ef2c6d9-5c75-4962-9bc9-a7813bf6d89b","subject":"Error contract","status":"open","region":"eu","participants":["qa-27bc7b0e9f66","qa-b4c00549fb36"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:58.570674110Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-42ac5f52-6ac1-41ba-a468-56124e86827a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 5087ad5a-9797-4426-9a6a-ae7dbd8909fc
X-Correlation-Id: qa-42ac5f52-6ac1-41ba-a468-56124e86827a
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42ac5f52-6ac1-41ba-a468-56124e86827a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-42ac5f52-6ac1-41ba-a468-56124e86827a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-36dc804f-8847-4f11-9da3-cd09efac7687

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36dc804f-8847-4f11-9da3-cd09efac7687
Content-Type: application/json

--- request body ---
{"handle":"qa-b4c00549fb36","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-36dc804f-8847-4f11-9da3-cd09efac7687
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e3e14d85-449a-43c6-9707-5ae186a2fa6e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-55fb7d9c-32e7-4456-a504-cf278c69aff8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55fb7d9c-32e7-4456-a504-cf278c69aff8
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-55fb7d9c-32e7-4456-a504-cf278c69aff8
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
correlation: qa-6d08b582-719f-43cb-8c6e-a201b9ea12c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d08b582-719f-43cb-8c6e-a201b9ea12c4
Content-Type: application/json

--- request body ---
{"handle":"qa-b4c00549fb36","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d08b582-719f-43cb-8c6e-a201b9ea12c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6d08b582-719f-43cb-8c6e-a201b9ea12c4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-99b9a900-e823-4d1c-b736-9e3f7905bbdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99b9a900-e823-4d1c-b736-9e3f7905bbdc
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-99b9a900-e823-4d1c-b736-9e3f7905bbdc
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
correlation: qa-cae71e8a-40e2-4958-a6b6-1a2673f393ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cae71e8a-40e2-4958-a6b6-1a2673f393ee
Content-Type: application/json

--- request body ---
{"handle":"qa-27bc7b0e9f66","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cae71e8a-40e2-4958-a6b6-1a2673f393ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cae71e8a-40e2-4958-a6b6-1a2673f393ee"}
```
