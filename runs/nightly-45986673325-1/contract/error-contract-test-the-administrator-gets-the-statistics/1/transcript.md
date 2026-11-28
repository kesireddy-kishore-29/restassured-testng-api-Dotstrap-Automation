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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-08580e75-7205-45d9-8965-62edbe237386` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-3c87f5ff-5a77-45b0-bffd-c64e50ec1d3e` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-37042676-6ea5-4cf7-b7f2-b0564999e755` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-9c2b4803-65f0-447f-a8d7-05335555ef8e` |
| 5 | `POST /v1/auth/token` | 200 | 65 | `qa-aa355e77-87a1-4d00-a222-0fece4a10fcd` |
| 6 | `GET /v1/admin/stats` | 200 | 15 | `qa-5a591066-47be-4fd0-becd-5aaf6d38c5d3` |
| 7 | `POST /v1/auth/token` | 200 | 27 | `qa-0fcbe4fe-ebd8-48ac-86f1-c5f29cb60c33` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-67208deb-8cfd-4b22-a623-c54efc2a59cc` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-699e0af2-3a44-48c2-b1bf-2695ed685063` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-84804f2a-68e6-4775-8cc5-c571f0ab3017` |
| 11 | `POST /v1/auth/token` | 401 | 11 | `qa-f92e8f08-46eb-44ae-886b-4fbae4d1ae38` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-08580e75-7205-45d9-8965-62edbe237386

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08580e75-7205-45d9-8965-62edbe237386
Content-Type: application/json

--- request body ---
{"handle":"qa-1a0c692fa18e","displayName":"QA 1a0c692fa18e","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-08580e75-7205-45d9-8965-62edbe237386
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 6
Location: /v1/accounts/qa-1a0c692fa18e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bc36ec97-356a-4ac7-bbb0-ee5f9f6f8149","handle":"qa-1a0c692fa18e","displayName":"QA 1a0c692fa18e","region":"eu","role":"user","createdAt":"2026-11-27T11:00:00.454764969Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3c87f5ff-5a77-45b0-bffd-c64e50ec1d3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c87f5ff-5a77-45b0-bffd-c64e50ec1d3e
Content-Type: application/json

--- request body ---
{"handle":"qa-ee7ac23ea6b0","displayName":"QA ee7ac23ea6b0","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c87f5ff-5a77-45b0-bffd-c64e50ec1d3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 6
Location: /v1/accounts/qa-ee7ac23ea6b0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0b12332b-2ef0-4893-8286-c89ae7480ac4","handle":"qa-ee7ac23ea6b0","displayName":"QA ee7ac23ea6b0","region":"eu","role":"user","createdAt":"2026-11-27T11:00:00.482497740Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-37042676-6ea5-4cf7-b7f2-b0564999e755

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37042676-6ea5-4cf7-b7f2-b0564999e755
Content-Type: application/json

--- request body ---
{"handle":"qa-1a0c692fa18e","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-37042676-6ea5-4cf7-b7f2-b0564999e755
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bc36ec97-356a-4ac7-bbb0-ee5f9f6f8149"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9c2b4803-65f0-447f-a8d7-05335555ef8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c2b4803-65f0-447f-a8d7-05335555ef8e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ee7ac23ea6b0","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c2b4803-65f0-447f-a8d7-05335555ef8e
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
Location: /v1/conversations/cnv_919a426a-2f94-4433-9c29-c72fc62a31b2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_919a426a-2f94-4433-9c29-c72fc62a31b2","subject":"Error contract","status":"open","region":"eu","participants":["qa-1a0c692fa18e","qa-ee7ac23ea6b0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T11:00:00.526776411Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-aa355e77-87a1-4d00-a222-0fece4a10fcd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa355e77-87a1-4d00-a222-0fece4a10fcd
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 65 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa355e77-87a1-4d00-a222-0fece4a10fcd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a5a742c-8834-4c35-a368-ce6eb99e283c"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-5a591066-47be-4fd0-becd-5aaf6d38c5d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a591066-47be-4fd0-becd-5aaf6d38c5d3
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a591066-47be-4fd0-becd-5aaf6d38c5d3
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

{"accounts":9,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-0fcbe4fe-ebd8-48ac-86f1-c5f29cb60c33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fcbe4fe-ebd8-48ac-86f1-c5f29cb60c33
Content-Type: application/json

--- request body ---
{"handle":"qa-ee7ac23ea6b0","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fcbe4fe-ebd8-48ac-86f1-c5f29cb60c33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0b12332b-2ef0-4893-8286-c89ae7480ac4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-67208deb-8cfd-4b22-a623-c54efc2a59cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67208deb-8cfd-4b22-a623-c54efc2a59cc
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-67208deb-8cfd-4b22-a623-c54efc2a59cc
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
correlation: qa-699e0af2-3a44-48c2-b1bf-2695ed685063

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-699e0af2-3a44-48c2-b1bf-2695ed685063
Content-Type: application/json

--- request body ---
{"handle":"qa-ee7ac23ea6b0","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-699e0af2-3a44-48c2-b1bf-2695ed685063
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-699e0af2-3a44-48c2-b1bf-2695ed685063"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-84804f2a-68e6-4775-8cc5-c571f0ab3017

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84804f2a-68e6-4775-8cc5-c571f0ab3017
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-84804f2a-68e6-4775-8cc5-c571f0ab3017
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
correlation: qa-f92e8f08-46eb-44ae-886b-4fbae4d1ae38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f92e8f08-46eb-44ae-886b-4fbae4d1ae38
Content-Type: application/json

--- request body ---
{"handle":"qa-1a0c692fa18e","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f92e8f08-46eb-44ae-886b-4fbae4d1ae38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f92e8f08-46eb-44ae-886b-4fbae4d1ae38"}
```
