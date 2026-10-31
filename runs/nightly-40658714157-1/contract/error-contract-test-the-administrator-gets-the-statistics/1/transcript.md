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
| 1 | `POST /v1/accounts` | 201 | 7 | `qa-c6d4b643-0d75-4663-9e8a-8d1beccdc921` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-81754a60-b7be-4f0a-acb0-58566a074258` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-5fcb73e1-0be4-4fcb-b865-533361aa3a30` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-b93a858a-150b-4258-a82b-1bda83448fe2` |
| 5 | `POST /v1/auth/token` | 200 | 20 | `qa-ea94b2ea-3e7f-4c99-97ce-f58689e14ac0` |
| 6 | `GET /v1/admin/stats` | 200 | 8 | `qa-b093becb-06bf-486e-bc70-78d0f0e2f9e4` |
| 7 | `POST /v1/auth/token` | 200 | 9 | `qa-497d6a5d-129e-48d9-a3b6-4d0071d52058` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-bf1ffaae-1192-4f3a-9d8e-3a8d1292ec35` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-2fdb8094-f3b5-455d-9d7f-8f2d2aa520b5` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-a4aee1dd-80a5-48f7-a3d2-2c7b8869b200` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-5b08468d-901a-4bd3-ac41-711f1363829f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c6d4b643-0d75-4663-9e8a-8d1beccdc921

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6d4b643-0d75-4663-9e8a-8d1beccdc921
Content-Type: application/json

--- request body ---
{"handle":"qa-1d220cd75506","displayName":"QA 1d220cd75506","password":"****","region":"eu"}

--- response: 201 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6d4b643-0d75-4663-9e8a-8d1beccdc921
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 8
Location: /v1/accounts/qa-1d220cd75506
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9bfdcf49-a9e0-4b2f-b963-21dc7aa49509","handle":"qa-1d220cd75506","displayName":"QA 1d220cd75506","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.550594793Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-81754a60-b7be-4f0a-acb0-58566a074258

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81754a60-b7be-4f0a-acb0-58566a074258
Content-Type: application/json

--- request body ---
{"handle":"qa-e58f50c06b00","displayName":"QA e58f50c06b00","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-81754a60-b7be-4f0a-acb0-58566a074258
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 8
Location: /v1/accounts/qa-e58f50c06b00
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b59e7281-7479-4c2d-b484-399c0395ac38","handle":"qa-e58f50c06b00","displayName":"QA e58f50c06b00","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.562825462Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5fcb73e1-0be4-4fcb-b865-533361aa3a30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fcb73e1-0be4-4fcb-b865-533361aa3a30
Content-Type: application/json

--- request body ---
{"handle":"qa-1d220cd75506","password":"****"}

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fcb73e1-0be4-4fcb-b865-533361aa3a30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9bfdcf49-a9e0-4b2f-b963-21dc7aa49509"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b93a858a-150b-4258-a82b-1bda83448fe2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b93a858a-150b-4258-a82b-1bda83448fe2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e58f50c06b00","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b93a858a-150b-4258-a82b-1bda83448fe2
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
Location: /v1/conversations/cnv_4e447487-4af5-4561-83ed-f340cde46bdf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4e447487-4af5-4561-83ed-f340cde46bdf","subject":"Error contract","status":"open","region":"eu","participants":["qa-1d220cd75506","qa-e58f50c06b00"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:53.604604167Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ea94b2ea-3e7f-4c99-97ce-f58689e14ac0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea94b2ea-3e7f-4c99-97ce-f58689e14ac0
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea94b2ea-3e7f-4c99-97ce-f58689e14ac0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d56c8b74-9db4-4418-a2df-156d347e1635"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-b093becb-06bf-486e-bc70-78d0f0e2f9e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b093becb-06bf-486e-bc70-78d0f0e2f9e4
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b093becb-06bf-486e-bc70-78d0f0e2f9e4
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
correlation: qa-497d6a5d-129e-48d9-a3b6-4d0071d52058

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-497d6a5d-129e-48d9-a3b6-4d0071d52058
Content-Type: application/json

--- request body ---
{"handle":"qa-e58f50c06b00","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-497d6a5d-129e-48d9-a3b6-4d0071d52058
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b59e7281-7479-4c2d-b484-399c0395ac38"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bf1ffaae-1192-4f3a-9d8e-3a8d1292ec35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf1ffaae-1192-4f3a-9d8e-3a8d1292ec35
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bf1ffaae-1192-4f3a-9d8e-3a8d1292ec35
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
correlation: qa-2fdb8094-f3b5-455d-9d7f-8f2d2aa520b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fdb8094-f3b5-455d-9d7f-8f2d2aa520b5
Content-Type: application/json

--- request body ---
{"handle":"qa-e58f50c06b00","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fdb8094-f3b5-455d-9d7f-8f2d2aa520b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2fdb8094-f3b5-455d-9d7f-8f2d2aa520b5"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a4aee1dd-80a5-48f7-a3d2-2c7b8869b200

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4aee1dd-80a5-48f7-a3d2-2c7b8869b200
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a4aee1dd-80a5-48f7-a3d2-2c7b8869b200
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
correlation: qa-5b08468d-901a-4bd3-ac41-711f1363829f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b08468d-901a-4bd3-ac41-711f1363829f
Content-Type: application/json

--- request body ---
{"handle":"qa-1d220cd75506","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b08468d-901a-4bd3-ac41-711f1363829f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b08468d-901a-4bd3-ac41-711f1363829f"}
```
