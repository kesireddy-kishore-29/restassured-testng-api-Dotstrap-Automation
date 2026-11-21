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
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-c25a5b86-51aa-4f91-8305-0b2e670551db` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-1d531eaa-fd81-48c8-a2b8-e50994f29e44` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-da1248b0-0726-44d0-b576-f2492778cd2d` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-c1740dd1-e3b6-4260-8792-cb8de9c1b740` |
| 5 | `GET /v1/conversations` | 503 | 31 | `qa-66b96118-2015-4416-b3a3-9a99721c2b1a` |
| 6 | `POST /v1/auth/token` | 200 | 45 | `qa-72659171-6164-42ce-92b7-94ab4a5def4b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-a0d4420f-67b9-4f76-8cfa-0ba5f8908668` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-ac123b64-9d98-4a94-adce-b631c45b5087` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-649949b1-6354-47f4-9b0c-bffe644d9cd5` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-2529228d-65e3-49d2-90f2-a393f33d9e10` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c25a5b86-51aa-4f91-8305-0b2e670551db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c25a5b86-51aa-4f91-8305-0b2e670551db
Content-Type: application/json

--- request body ---
{"handle":"qa-6a7ee2eac30b","displayName":"QA 6a7ee2eac30b","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-c25a5b86-51aa-4f91-8305-0b2e670551db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 7
Location: /v1/accounts/qa-6a7ee2eac30b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f6eb6c9d-c650-435c-808d-ac55ba43b3f6","handle":"qa-6a7ee2eac30b","displayName":"QA 6a7ee2eac30b","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.419816115Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1d531eaa-fd81-48c8-a2b8-e50994f29e44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d531eaa-fd81-48c8-a2b8-e50994f29e44
Content-Type: application/json

--- request body ---
{"handle":"qa-5e4834a6306e","displayName":"QA 5e4834a6306e","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d531eaa-fd81-48c8-a2b8-e50994f29e44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 7
Location: /v1/accounts/qa-5e4834a6306e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_167d9c54-f185-4a95-8d76-b728b5a8be84","handle":"qa-5e4834a6306e","displayName":"QA 5e4834a6306e","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.489902021Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-da1248b0-0726-44d0-b576-f2492778cd2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da1248b0-0726-44d0-b576-f2492778cd2d
Content-Type: application/json

--- request body ---
{"handle":"qa-6a7ee2eac30b","password":"****"}

--- response: 200 in 46 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-da1248b0-0726-44d0-b576-f2492778cd2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f6eb6c9d-c650-435c-808d-ac55ba43b3f6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c1740dd1-e3b6-4260-8792-cb8de9c1b740

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1740dd1-e3b6-4260-8792-cb8de9c1b740
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5e4834a6306e","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1740dd1-e3b6-4260-8792-cb8de9c1b740
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
Location: /v1/conversations/cnv_84e3685d-8999-4167-949f-6f62cca3807a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_84e3685d-8999-4167-949f-6f62cca3807a","subject":"Error contract","status":"open","region":"eu","participants":["qa-6a7ee2eac30b","qa-5e4834a6306e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:25.581482715Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-66b96118-2015-4416-b3a3-9a99721c2b1a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: bacdf1d8-1806-47c1-b555-7f7cb4212ac5
X-Correlation-Id: qa-66b96118-2015-4416-b3a3-9a99721c2b1a
Content-Type: application/json

--- response: 503 in 31 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66b96118-2015-4416-b3a3-9a99721c2b1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-66b96118-2015-4416-b3a3-9a99721c2b1a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-72659171-6164-42ce-92b7-94ab4a5def4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72659171-6164-42ce-92b7-94ab4a5def4b
Content-Type: application/json

--- request body ---
{"handle":"qa-5e4834a6306e","password":"****"}

--- response: 200 in 45 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-72659171-6164-42ce-92b7-94ab4a5def4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_167d9c54-f185-4a95-8d76-b728b5a8be84"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a0d4420f-67b9-4f76-8cfa-0ba5f8908668

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0d4420f-67b9-4f76-8cfa-0ba5f8908668
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a0d4420f-67b9-4f76-8cfa-0ba5f8908668
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
correlation: qa-ac123b64-9d98-4a94-adce-b631c45b5087

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac123b64-9d98-4a94-adce-b631c45b5087
Content-Type: application/json

--- request body ---
{"handle":"qa-5e4834a6306e","password":"****"}

--- response: 401 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac123b64-9d98-4a94-adce-b631c45b5087
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ac123b64-9d98-4a94-adce-b631c45b5087"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-649949b1-6354-47f4-9b0c-bffe644d9cd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-649949b1-6354-47f4-9b0c-bffe644d9cd5
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-649949b1-6354-47f4-9b0c-bffe644d9cd5
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
correlation: qa-2529228d-65e3-49d2-90f2-a393f33d9e10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2529228d-65e3-49d2-90f2-a393f33d9e10
Content-Type: application/json

--- request body ---
{"handle":"qa-6a7ee2eac30b","password":"****"}

--- response: 401 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2529228d-65e3-49d2-90f2-a393f33d9e10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2529228d-65e3-49d2-90f2-a393f33d9e10"}
```
