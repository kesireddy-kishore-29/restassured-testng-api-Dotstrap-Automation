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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-e6eebbc4-2a93-429c-ac42-4dd0d0286454` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-6eb2f81a-4233-4215-8a38-eec9cf6f3f0c` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-8a68a3cd-87ce-4a99-823d-0fdfeb9bf1bc` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-0d2cf6e9-4858-44a9-82a0-af0dd805f536` |
| 5 | `POST /v1/auth/token` | 200 | 10 | `qa-43cbf475-06af-43ef-a20b-458890a2049f` |
| 6 | `GET /v1/admin/stats` | 200 | 17 | `qa-559a7c83-ede5-4d0c-817e-2ac8bec8359d` |
| 7 | `POST /v1/auth/token` | 200 | 9 | `qa-88aa7f10-b2e0-493a-a994-2c709c622926` |
| 8 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-b4e40e40-c973-4670-86e3-bb1146c35051` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-c7d9a305-2020-46dc-876f-9ada9de0ed0e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-586bfd59-a921-4e2d-98c9-68ddeb65af6b` |
| 11 | `POST /v1/auth/token` | 401 | 2 | `qa-d54441b1-4d90-4367-914e-42e7190e1660` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e6eebbc4-2a93-429c-ac42-4dd0d0286454

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6eebbc4-2a93-429c-ac42-4dd0d0286454
Content-Type: application/json

--- request body ---
{"handle":"qa-952ae6b51b24","displayName":"QA 952ae6b51b24","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6eebbc4-2a93-429c-ac42-4dd0d0286454
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Location: /v1/accounts/qa-952ae6b51b24
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20132878-9882-49b2-894a-6ec8f9b0ae6a","handle":"qa-952ae6b51b24","displayName":"QA 952ae6b51b24","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.922429819Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6eb2f81a-4233-4215-8a38-eec9cf6f3f0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eb2f81a-4233-4215-8a38-eec9cf6f3f0c
Content-Type: application/json

--- request body ---
{"handle":"qa-172b5f369040","displayName":"QA 172b5f369040","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6eb2f81a-4233-4215-8a38-eec9cf6f3f0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 7
Location: /v1/accounts/qa-172b5f369040
X-Served-Region: eu
Content-Length: 181

{"id":"acc_64bb8fc2-0a12-4423-894a-2159055e2a09","handle":"qa-172b5f369040","displayName":"QA 172b5f369040","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.933976605Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8a68a3cd-87ce-4a99-823d-0fdfeb9bf1bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a68a3cd-87ce-4a99-823d-0fdfeb9bf1bc
Content-Type: application/json

--- request body ---
{"handle":"qa-952ae6b51b24","password":"****"}

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a68a3cd-87ce-4a99-823d-0fdfeb9bf1bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20132878-9882-49b2-894a-6ec8f9b0ae6a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0d2cf6e9-4858-44a9-82a0-af0dd805f536

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d2cf6e9-4858-44a9-82a0-af0dd805f536
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-172b5f369040","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d2cf6e9-4858-44a9-82a0-af0dd805f536
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
Location: /v1/conversations/cnv_5c25fa52-d73f-4973-90d1-e31892ca72a6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5c25fa52-d73f-4973-90d1-e31892ca72a6","subject":"Error contract","status":"open","region":"eu","participants":["qa-952ae6b51b24","qa-172b5f369040"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.965553860Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-43cbf475-06af-43ef-a20b-458890a2049f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43cbf475-06af-43ef-a20b-458890a2049f
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-43cbf475-06af-43ef-a20b-458890a2049f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f6e28685-d347-42a8-8d59-69da0587a81c"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-559a7c83-ede5-4d0c-817e-2ac8bec8359d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-559a7c83-ede5-4d0c-817e-2ac8bec8359d
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-559a7c83-ede5-4d0c-817e-2ac8bec8359d
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

{"accounts":11,"conversations":5,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-88aa7f10-b2e0-493a-a994-2c709c622926

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88aa7f10-b2e0-493a-a994-2c709c622926
Content-Type: application/json

--- request body ---
{"handle":"qa-172b5f369040","password":"****"}

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-88aa7f10-b2e0-493a-a994-2c709c622926
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64bb8fc2-0a12-4423-894a-2159055e2a09"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b4e40e40-c973-4670-86e3-bb1146c35051

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4e40e40-c973-4670-86e3-bb1146c35051
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b4e40e40-c973-4670-86e3-bb1146c35051
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
correlation: qa-c7d9a305-2020-46dc-876f-9ada9de0ed0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7d9a305-2020-46dc-876f-9ada9de0ed0e
Content-Type: application/json

--- request body ---
{"handle":"qa-172b5f369040","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7d9a305-2020-46dc-876f-9ada9de0ed0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c7d9a305-2020-46dc-876f-9ada9de0ed0e"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-586bfd59-a921-4e2d-98c9-68ddeb65af6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-586bfd59-a921-4e2d-98c9-68ddeb65af6b
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-586bfd59-a921-4e2d-98c9-68ddeb65af6b
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
correlation: qa-d54441b1-4d90-4367-914e-42e7190e1660

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d54441b1-4d90-4367-914e-42e7190e1660
Content-Type: application/json

--- request body ---
{"handle":"qa-952ae6b51b24","password":"****"}

--- response: 401 in 2 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d54441b1-4d90-4367-914e-42e7190e1660
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d54441b1-4d90-4367-914e-42e7190e1660"}
```
