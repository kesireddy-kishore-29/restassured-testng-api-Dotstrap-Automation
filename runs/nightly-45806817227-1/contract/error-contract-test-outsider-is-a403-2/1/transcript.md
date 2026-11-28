# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-ae1aef6f-bac4-4098-9f09-053c97e2e55a` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-873b2437-65d2-4e35-97cd-9ffcdb101ffd` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-a774049e-4500-40ea-86e0-b55233a14977` |
| 4 | `POST /v1/auth/token` | 200 | 30 | `qa-d06c02e0-d19d-486d-99d2-28e49bae97d7` |
| 5 | `POST /v1/conversations` | 201 | 6 | `qa-ce1e46c4-1a15-45c9-bfb4-a89093a6c116` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-04478e83-b5c3-4746-9dd3-f63e950eb5ab` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 15 | `qa-477f092b-a232-403d-a136-111a549e5a86` |
| 8 | `DELETE /v1/accounts/me` | 204 | 69 | `qa-f8496e5d-425d-42f8-832a-533a55a6a73e` |
| 9 | `POST /v1/auth/token` | 401 | 40 | `qa-92c30414-acdf-4229-876f-214350505dba` |
| 10 | `POST /v1/auth/token` | 200 | 45 | `qa-9d6f95f0-193c-45a3-9221-109d6f354179` |
| 11 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-8b62da2f-8871-41fc-be92-8afa5463d28d` |
| 12 | `POST /v1/auth/token` | 401 | 28 | `qa-54f4374c-5a06-446c-8d54-75d651c0f9fd` |
| 13 | `DELETE /v1/accounts/me` | 204 | 64 | `qa-7c0090fc-d586-43d5-be37-5c6705e80c80` |
| 14 | `POST /v1/auth/token` | 401 | 22 | `qa-eeac1ed4-f904-4fbf-bfed-f51b29d14034` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ae1aef6f-bac4-4098-9f09-053c97e2e55a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae1aef6f-bac4-4098-9f09-053c97e2e55a
Content-Type: application/json

--- request body ---
{"handle":"qa-7e00721e5dab","displayName":"QA 7e00721e5dab","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae1aef6f-bac4-4098-9f09-053c97e2e55a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Location: /v1/accounts/qa-7e00721e5dab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_debeb423-23d4-4946-b377-25e95b5d8ad5","handle":"qa-7e00721e5dab","displayName":"QA 7e00721e5dab","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.893979098Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-873b2437-65d2-4e35-97cd-9ffcdb101ffd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-873b2437-65d2-4e35-97cd-9ffcdb101ffd
Content-Type: application/json

--- request body ---
{"handle":"qa-a3953320da33","displayName":"QA a3953320da33","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-873b2437-65d2-4e35-97cd-9ffcdb101ffd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Location: /v1/accounts/qa-a3953320da33
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1ced6d4c-0f28-47cf-b161-1a0173f11138","handle":"qa-a3953320da33","displayName":"QA a3953320da33","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.931138107Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-a774049e-4500-40ea-86e0-b55233a14977

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a774049e-4500-40ea-86e0-b55233a14977
Content-Type: application/json

--- request body ---
{"handle":"qa-521808c719f0","displayName":"QA 521808c719f0","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-a774049e-4500-40ea-86e0-b55233a14977
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
Location: /v1/accounts/qa-521808c719f0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_607a835a-2a5f-4a36-bff4-0e850734cbf4","handle":"qa-521808c719f0","displayName":"QA 521808c719f0","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.975305172Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d06c02e0-d19d-486d-99d2-28e49bae97d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d06c02e0-d19d-486d-99d2-28e49bae97d7
Content-Type: application/json

--- request body ---
{"handle":"qa-7e00721e5dab","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-d06c02e0-d19d-486d-99d2-28e49bae97d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_debeb423-23d4-4946-b377-25e95b5d8ad5"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ce1e46c4-1a15-45c9-bfb4-a89093a6c116

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce1e46c4-1a15-45c9-bfb4-a89093a6c116
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a3953320da33","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce1e46c4-1a15-45c9-bfb4-a89093a6c116
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
Location: /v1/conversations/cnv_8846723a-7ee1-4118-8c93-693acc8f9708
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8846723a-7ee1-4118-8c93-693acc8f9708","subject":"Error contract","status":"open","region":"eu","participants":["qa-7e00721e5dab","qa-a3953320da33"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:44.047287268Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-04478e83-b5c3-4746-9dd3-f63e950eb5ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04478e83-b5c3-4746-9dd3-f63e950eb5ab
Content-Type: application/json

--- request body ---
{"handle":"qa-521808c719f0","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-04478e83-b5c3-4746-9dd3-f63e950eb5ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_607a835a-2a5f-4a36-bff4-0e850734cbf4"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_8846723a-7ee1-4118-8c93-693acc8f9708/messages
correlation: qa-477f092b-a232-403d-a136-111a549e5a86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-477f092b-a232-403d-a136-111a549e5a86
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-477f092b-a232-403d-a136-111a549e5a86
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_8846723a-7ee1-4118-8c93-693acc8f9708/messages","correlationId":"qa-477f092b-a232-403d-a136-111a549e5a86"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f8496e5d-425d-42f8-832a-533a55a6a73e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8496e5d-425d-42f8-832a-533a55a6a73e
Content-Type: application/json

--- response: 204 in 69 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f8496e5d-425d-42f8-832a-533a55a6a73e
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-92c30414-acdf-4229-876f-214350505dba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92c30414-acdf-4229-876f-214350505dba
Content-Type: application/json

--- request body ---
{"handle":"qa-521808c719f0","password":"****"}

--- response: 401 in 40 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92c30414-acdf-4229-876f-214350505dba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-92c30414-acdf-4229-876f-214350505dba"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9d6f95f0-193c-45a3-9221-109d6f354179

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d6f95f0-193c-45a3-9221-109d6f354179
Content-Type: application/json

--- request body ---
{"handle":"qa-a3953320da33","password":"****"}

--- response: 200 in 45 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d6f95f0-193c-45a3-9221-109d6f354179
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1ced6d4c-0f28-47cf-b161-1a0173f11138"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b62da2f-8871-41fc-be92-8afa5463d28d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b62da2f-8871-41fc-be92-8afa5463d28d
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b62da2f-8871-41fc-be92-8afa5463d28d
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-54f4374c-5a06-446c-8d54-75d651c0f9fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54f4374c-5a06-446c-8d54-75d651c0f9fd
Content-Type: application/json

--- request body ---
{"handle":"qa-a3953320da33","password":"****"}

--- response: 401 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54f4374c-5a06-446c-8d54-75d651c0f9fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-54f4374c-5a06-446c-8d54-75d651c0f9fd"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7c0090fc-d586-43d5-be37-5c6705e80c80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c0090fc-d586-43d5-be37-5c6705e80c80
Content-Type: application/json

--- response: 204 in 64 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7c0090fc-d586-43d5-be37-5c6705e80c80
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-eeac1ed4-f904-4fbf-bfed-f51b29d14034

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eeac1ed4-f904-4fbf-bfed-f51b29d14034
Content-Type: application/json

--- request body ---
{"handle":"qa-7e00721e5dab","password":"****"}

--- response: 401 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eeac1ed4-f904-4fbf-bfed-f51b29d14034
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eeac1ed4-f904-4fbf-bfed-f51b29d14034"}
```
