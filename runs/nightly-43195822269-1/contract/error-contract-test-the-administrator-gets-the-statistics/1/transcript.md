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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-11aea6cd-6c17-449d-8f13-06a43dddbde8` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-549044f9-57a5-49cc-aa1f-65d09c28719f` |
| 3 | `POST /v1/auth/token` | 200 | 9 | `qa-a23f92eb-f465-49f5-be51-ea57b42fa210` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-3d2c7561-1d6b-417b-8c31-a4cdc1b35d40` |
| 5 | `POST /v1/auth/token` | 200 | 9 | `qa-dbfa1d8d-feaa-47e2-a4b8-e657e100a92a` |
| 6 | `GET /v1/admin/stats` | 200 | 18 | `qa-7648d5eb-d845-49e9-9762-0bee7a4b2f04` |
| 7 | `POST /v1/auth/token` | 200 | 9 | `qa-0364a532-1a38-4c30-9ecb-fbe37728d8d9` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-b116f6b3-441f-475f-94a6-0175c1396bd2` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-f95d420c-6ec9-414b-9b67-acb0bf0931dd` |
| 10 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-03b1d37b-d5a8-4da3-8bb5-ada839ffc269` |
| 11 | `POST /v1/auth/token` | 401 | 26 | `qa-ccbf2ae4-fc38-4f6b-a751-1c95c8712c0c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-11aea6cd-6c17-449d-8f13-06a43dddbde8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11aea6cd-6c17-449d-8f13-06a43dddbde8
Content-Type: application/json

--- request body ---
{"handle":"qa-375f476f1148","displayName":"QA 375f476f1148","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-11aea6cd-6c17-449d-8f13-06a43dddbde8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 7
Location: /v1/accounts/qa-375f476f1148
X-Served-Region: eu
Content-Length: 181

{"id":"acc_47cbef28-5834-4c8d-bec4-fffdc86fd7af","handle":"qa-375f476f1148","displayName":"QA 375f476f1148","region":"eu","role":"user","createdAt":"2026-11-12T09:56:32.297275849Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-549044f9-57a5-49cc-aa1f-65d09c28719f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-549044f9-57a5-49cc-aa1f-65d09c28719f
Content-Type: application/json

--- request body ---
{"handle":"qa-5ead4b5ce881","displayName":"QA 5ead4b5ce881","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-549044f9-57a5-49cc-aa1f-65d09c28719f
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
Location: /v1/accounts/qa-5ead4b5ce881
X-Served-Region: eu
Content-Length: 181

{"id":"acc_57aaea21-5524-4333-bea0-c0d10d572b26","handle":"qa-5ead4b5ce881","displayName":"QA 5ead4b5ce881","region":"eu","role":"user","createdAt":"2026-11-12T09:56:32.311817979Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a23f92eb-f465-49f5-be51-ea57b42fa210

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a23f92eb-f465-49f5-be51-ea57b42fa210
Content-Type: application/json

--- request body ---
{"handle":"qa-375f476f1148","password":"****"}

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a23f92eb-f465-49f5-be51-ea57b42fa210
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_47cbef28-5834-4c8d-bec4-fffdc86fd7af"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3d2c7561-1d6b-417b-8c31-a4cdc1b35d40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d2c7561-1d6b-417b-8c31-a4cdc1b35d40
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5ead4b5ce881","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d2c7561-1d6b-417b-8c31-a4cdc1b35d40
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
Location: /v1/conversations/cnv_a7c25e83-6623-44ea-93b4-7b2e7c2fc79a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a7c25e83-6623-44ea-93b4-7b2e7c2fc79a","subject":"Error contract","status":"open","region":"eu","participants":["qa-375f476f1148","qa-5ead4b5ce881"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:32.343500570Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-dbfa1d8d-feaa-47e2-a4b8-e657e100a92a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbfa1d8d-feaa-47e2-a4b8-e657e100a92a
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbfa1d8d-feaa-47e2-a4b8-e657e100a92a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c0edd5c0-7693-4b23-8ce3-378c90545ccb"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-7648d5eb-d845-49e9-9762-0bee7a4b2f04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7648d5eb-d845-49e9-9762-0bee7a4b2f04
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-7648d5eb-d845-49e9-9762-0bee7a4b2f04
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

{"accounts":7,"conversations":3,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-0364a532-1a38-4c30-9ecb-fbe37728d8d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0364a532-1a38-4c30-9ecb-fbe37728d8d9
Content-Type: application/json

--- request body ---
{"handle":"qa-5ead4b5ce881","password":"****"}

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-0364a532-1a38-4c30-9ecb-fbe37728d8d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_57aaea21-5524-4333-bea0-c0d10d572b26"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b116f6b3-441f-475f-94a6-0175c1396bd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b116f6b3-441f-475f-94a6-0175c1396bd2
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b116f6b3-441f-475f-94a6-0175c1396bd2
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
correlation: qa-f95d420c-6ec9-414b-9b67-acb0bf0931dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f95d420c-6ec9-414b-9b67-acb0bf0931dd
Content-Type: application/json

--- request body ---
{"handle":"qa-5ead4b5ce881","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f95d420c-6ec9-414b-9b67-acb0bf0931dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f95d420c-6ec9-414b-9b67-acb0bf0931dd"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-03b1d37b-d5a8-4da3-8bb5-ada839ffc269

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03b1d37b-d5a8-4da3-8bb5-ada839ffc269
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-03b1d37b-d5a8-4da3-8bb5-ada839ffc269
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
correlation: qa-ccbf2ae4-fc38-4f6b-a751-1c95c8712c0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccbf2ae4-fc38-4f6b-a751-1c95c8712c0c
Content-Type: application/json

--- request body ---
{"handle":"qa-375f476f1148","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccbf2ae4-fc38-4f6b-a751-1c95c8712c0c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ccbf2ae4-fc38-4f6b-a751-1c95c8712c0c"}
```
