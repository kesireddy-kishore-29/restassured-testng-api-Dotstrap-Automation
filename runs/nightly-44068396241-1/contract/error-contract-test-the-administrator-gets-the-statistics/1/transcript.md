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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-8c6d6cb4-517f-42d5-a9c4-f1f7c78ddc3d` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-8359aa01-55ec-4314-8fc3-26a6b5fb821b` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-83ecb57f-f2ea-4733-a74b-59ebf03d1027` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-ddc580aa-0ff0-4109-9bf9-841ca2cd8722` |
| 5 | `POST /v1/auth/token` | 200 | 22 | `qa-32981a13-4d48-4912-af98-de42c3259c87` |
| 6 | `GET /v1/admin/stats` | 200 | 19 | `qa-84467da9-dd43-4e18-8e57-ef455b0b7db8` |
| 7 | `POST /v1/auth/token` | 200 | 13 | `qa-fb7b245e-1b83-44d4-a69f-e608cd13bc3f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-998c21bd-5323-46c8-965f-e79832a653c3` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-c8a2b954-add5-4cc0-a886-ebf6b3a8d8e9` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-31e0101e-f821-48a6-975c-794ab709207b` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-f39525da-33b6-4216-8691-823c6245a09c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8c6d6cb4-517f-42d5-a9c4-f1f7c78ddc3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c6d6cb4-517f-42d5-a9c4-f1f7c78ddc3d
Content-Type: application/json

--- request body ---
{"handle":"qa-c571886330ed","displayName":"QA c571886330ed","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c6d6cb4-517f-42d5-a9c4-f1f7c78ddc3d
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
Location: /v1/accounts/qa-c571886330ed
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aab1bc9e-e625-4802-8bdf-b82a2266db8a","handle":"qa-c571886330ed","displayName":"QA c571886330ed","region":"eu","role":"user","createdAt":"2026-11-17T10:50:20.198761537Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8359aa01-55ec-4314-8fc3-26a6b5fb821b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8359aa01-55ec-4314-8fc3-26a6b5fb821b
Content-Type: application/json

--- request body ---
{"handle":"qa-6fe6dcde0a58","displayName":"QA 6fe6dcde0a58","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-8359aa01-55ec-4314-8fc3-26a6b5fb821b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 7
Location: /v1/accounts/qa-6fe6dcde0a58
X-Served-Region: eu
Content-Length: 181

{"id":"acc_979570e9-2b42-43fe-a7c5-1f6755655442","handle":"qa-6fe6dcde0a58","displayName":"QA 6fe6dcde0a58","region":"eu","role":"user","createdAt":"2026-11-17T10:50:20.221070364Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-83ecb57f-f2ea-4733-a74b-59ebf03d1027

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83ecb57f-f2ea-4733-a74b-59ebf03d1027
Content-Type: application/json

--- request body ---
{"handle":"qa-c571886330ed","password":"****"}

--- response: 200 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-83ecb57f-f2ea-4733-a74b-59ebf03d1027
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aab1bc9e-e625-4802-8bdf-b82a2266db8a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ddc580aa-0ff0-4109-9bf9-841ca2cd8722

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddc580aa-0ff0-4109-9bf9-841ca2cd8722
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6fe6dcde0a58","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddc580aa-0ff0-4109-9bf9-841ca2cd8722
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
Location: /v1/conversations/cnv_476a1e99-abda-43cf-8b7b-f6f988996d64
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_476a1e99-abda-43cf-8b7b-f6f988996d64","subject":"Error contract","status":"open","region":"eu","participants":["qa-c571886330ed","qa-6fe6dcde0a58"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:20.259285325Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-32981a13-4d48-4912-af98-de42c3259c87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32981a13-4d48-4912-af98-de42c3259c87
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-32981a13-4d48-4912-af98-de42c3259c87
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_137939ff-541c-4510-a496-d3de1338d4aa"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-84467da9-dd43-4e18-8e57-ef455b0b7db8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84467da9-dd43-4e18-8e57-ef455b0b7db8
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-84467da9-dd43-4e18-8e57-ef455b0b7db8
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
Content-Length: 46

{"accounts":7,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-fb7b245e-1b83-44d4-a69f-e608cd13bc3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb7b245e-1b83-44d4-a69f-e608cd13bc3f
Content-Type: application/json

--- request body ---
{"handle":"qa-6fe6dcde0a58","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb7b245e-1b83-44d4-a69f-e608cd13bc3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_979570e9-2b42-43fe-a7c5-1f6755655442"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-998c21bd-5323-46c8-965f-e79832a653c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-998c21bd-5323-46c8-965f-e79832a653c3
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-998c21bd-5323-46c8-965f-e79832a653c3
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
correlation: qa-c8a2b954-add5-4cc0-a886-ebf6b3a8d8e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8a2b954-add5-4cc0-a886-ebf6b3a8d8e9
Content-Type: application/json

--- request body ---
{"handle":"qa-6fe6dcde0a58","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8a2b954-add5-4cc0-a886-ebf6b3a8d8e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c8a2b954-add5-4cc0-a886-ebf6b3a8d8e9"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-31e0101e-f821-48a6-975c-794ab709207b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31e0101e-f821-48a6-975c-794ab709207b
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-31e0101e-f821-48a6-975c-794ab709207b
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
correlation: qa-f39525da-33b6-4216-8691-823c6245a09c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f39525da-33b6-4216-8691-823c6245a09c
Content-Type: application/json

--- request body ---
{"handle":"qa-c571886330ed","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f39525da-33b6-4216-8691-823c6245a09c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f39525da-33b6-4216-8691-823c6245a09c"}
```
