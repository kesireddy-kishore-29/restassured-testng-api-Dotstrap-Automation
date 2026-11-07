# Transcript: The administrator gets the service statistics

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#theAdministratorGetsTheStatistics` |
| Features | FEAT-AUTHZ-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-4673ef3b-4fce-41c8-b799-285f15eb5dde` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-12324094-5ab2-40b5-830a-f7461a457058` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-c9f4fc81-909c-4253-9143-75833023f513` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-1601629f-4516-4b41-9e32-8c8a768189f7` |
| 5 | `POST /v1/auth/token` | 200 | 55 | `qa-9deae4bd-e9a5-44d4-b3a2-b64725157b11` |
| 6 | `GET /v1/admin/stats` | 200 | 22 | `qa-17b1dd04-8b28-46e2-a249-41f4301fa510` |
| 7 | `POST /v1/auth/token` | 200 | 20 | `qa-d7ca696b-d2f1-4de9-8b02-5c37ea8a9b1f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-2318f85a-a3de-4ca8-a7a8-672aa1ba3f1f` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-af032c89-3909-4c99-aeda-e52a38d4ac5f` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-719ce302-f455-4633-8e12-b13bfdbf6ece` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-a2b401a9-a409-4158-a1dd-de259227ace6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4673ef3b-4fce-41c8-b799-285f15eb5dde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4673ef3b-4fce-41c8-b799-285f15eb5dde
Content-Type: application/json

--- request body ---
{"handle":"qa-93c244e76083","displayName":"QA 93c244e76083","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-4673ef3b-4fce-41c8-b799-285f15eb5dde
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 7
Location: /v1/accounts/qa-93c244e76083
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cdd44f5a-4fc0-4be5-b8ea-e3c47cc7a803","handle":"qa-93c244e76083","displayName":"QA 93c244e76083","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.275491723Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-12324094-5ab2-40b5-830a-f7461a457058

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12324094-5ab2-40b5-830a-f7461a457058
Content-Type: application/json

--- request body ---
{"handle":"qa-8dbf2b703435","displayName":"QA 8dbf2b703435","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-12324094-5ab2-40b5-830a-f7461a457058
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 6
Location: /v1/accounts/qa-8dbf2b703435
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ed48b269-d355-4b4c-9cbf-38ddb5b8e459","handle":"qa-8dbf2b703435","displayName":"QA 8dbf2b703435","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.307907578Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c9f4fc81-909c-4253-9143-75833023f513

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9f4fc81-909c-4253-9143-75833023f513
Content-Type: application/json

--- request body ---
{"handle":"qa-93c244e76083","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9f4fc81-909c-4253-9143-75833023f513
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cdd44f5a-4fc0-4be5-b8ea-e3c47cc7a803"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1601629f-4516-4b41-9e32-8c8a768189f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1601629f-4516-4b41-9e32-8c8a768189f7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8dbf2b703435","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-1601629f-4516-4b41-9e32-8c8a768189f7
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
Location: /v1/conversations/cnv_84919b72-0e44-44f7-b6c2-0d9649d3fccc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_84919b72-0e44-44f7-b6c2-0d9649d3fccc","subject":"Error contract","status":"open","region":"eu","participants":["qa-93c244e76083","qa-8dbf2b703435"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.359216162Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9deae4bd-e9a5-44d4-b3a2-b64725157b11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9deae4bd-e9a5-44d4-b3a2-b64725157b11
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 55 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-9deae4bd-e9a5-44d4-b3a2-b64725157b11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9600090f-4f01-4915-8d32-b082e076d352"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-17b1dd04-8b28-46e2-a249-41f4301fa510

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17b1dd04-8b28-46e2-a249-41f4301fa510
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-17b1dd04-8b28-46e2-a249-41f4301fa510
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
Content-Length: 47

{"accounts":10,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-d7ca696b-d2f1-4de9-8b02-5c37ea8a9b1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7ca696b-d2f1-4de9-8b02-5c37ea8a9b1f
Content-Type: application/json

--- request body ---
{"handle":"qa-8dbf2b703435","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7ca696b-d2f1-4de9-8b02-5c37ea8a9b1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ed48b269-d355-4b4c-9cbf-38ddb5b8e459"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2318f85a-a3de-4ca8-a7a8-672aa1ba3f1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2318f85a-a3de-4ca8-a7a8-672aa1ba3f1f
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2318f85a-a3de-4ca8-a7a8-672aa1ba3f1f
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-af032c89-3909-4c99-aeda-e52a38d4ac5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af032c89-3909-4c99-aeda-e52a38d4ac5f
Content-Type: application/json

--- request body ---
{"handle":"qa-8dbf2b703435","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af032c89-3909-4c99-aeda-e52a38d4ac5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-af032c89-3909-4c99-aeda-e52a38d4ac5f"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-719ce302-f455-4633-8e12-b13bfdbf6ece

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-719ce302-f455-4633-8e12-b13bfdbf6ece
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-719ce302-f455-4633-8e12-b13bfdbf6ece
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-a2b401a9-a409-4158-a1dd-de259227ace6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2b401a9-a409-4158-a1dd-de259227ace6
Content-Type: application/json

--- request body ---
{"handle":"qa-93c244e76083","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2b401a9-a409-4158-a1dd-de259227ace6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a2b401a9-a409-4158-a1dd-de259227ace6"}
```
