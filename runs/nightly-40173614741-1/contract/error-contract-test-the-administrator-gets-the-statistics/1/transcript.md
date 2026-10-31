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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-b9703582-a310-4c55-a287-1cdefa599564` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-3c9448b4-96bd-4868-8c92-8a93f0f57aa2` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-c051b5a5-e154-4f18-88aa-3f20d73726bd` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-d37c8539-8336-4c79-9c20-fe3045a50cd7` |
| 5 | `POST /v1/auth/token` | 200 | 21 | `qa-59fa9a63-fa5f-4c76-8a48-7cdac6d751a8` |
| 6 | `GET /v1/admin/stats` | 200 | 21 | `qa-efefd5fc-378f-4251-9387-b1f054840c4a` |
| 7 | `POST /v1/auth/token` | 200 | 12 | `qa-1d11b4dd-ae82-454a-83fa-21446a34cc5e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-70b22dbb-3122-4ec5-81a6-ea527fb6e685` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-3b3aa9a7-fc83-4de9-9eeb-c15b6abeed11` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-fb3b9db4-6e04-4409-88e6-3591c4ab8e68` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-1f9025ea-08c7-4b1c-accc-221f912ee624` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b9703582-a310-4c55-a287-1cdefa599564

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9703582-a310-4c55-a287-1cdefa599564
Content-Type: application/json

--- request body ---
{"handle":"qa-9cbe4ca8b717","displayName":"QA 9cbe4ca8b717","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9703582-a310-4c55-a287-1cdefa599564
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
Location: /v1/accounts/qa-9cbe4ca8b717
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2836abee-4a6a-45ad-a2b9-6860de248d8c","handle":"qa-9cbe4ca8b717","displayName":"QA 9cbe4ca8b717","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.350713974Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3c9448b4-96bd-4868-8c92-8a93f0f57aa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c9448b4-96bd-4868-8c92-8a93f0f57aa2
Content-Type: application/json

--- request body ---
{"handle":"qa-26b877761d8f","displayName":"QA 26b877761d8f","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c9448b4-96bd-4868-8c92-8a93f0f57aa2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 6
Location: /v1/accounts/qa-26b877761d8f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0958ee9f-347a-4b8e-959b-47ee76cf2618","handle":"qa-26b877761d8f","displayName":"QA 26b877761d8f","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.378120416Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c051b5a5-e154-4f18-88aa-3f20d73726bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c051b5a5-e154-4f18-88aa-3f20d73726bd
Content-Type: application/json

--- request body ---
{"handle":"qa-9cbe4ca8b717","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-c051b5a5-e154-4f18-88aa-3f20d73726bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2836abee-4a6a-45ad-a2b9-6860de248d8c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d37c8539-8336-4c79-9c20-fe3045a50cd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d37c8539-8336-4c79-9c20-fe3045a50cd7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-26b877761d8f","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-d37c8539-8336-4c79-9c20-fe3045a50cd7
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
Location: /v1/conversations/cnv_deb0b26a-e1cb-4db6-be23-9c04fb6ad5f3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_deb0b26a-e1cb-4db6-be23-9c04fb6ad5f3","subject":"Error contract","status":"open","region":"eu","participants":["qa-9cbe4ca8b717","qa-26b877761d8f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:27.422087089Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-59fa9a63-fa5f-4c76-8a48-7cdac6d751a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59fa9a63-fa5f-4c76-8a48-7cdac6d751a8
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-59fa9a63-fa5f-4c76-8a48-7cdac6d751a8
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b2e4d9e3-9c6b-48c6-89d2-823147baff5c"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-efefd5fc-378f-4251-9387-b1f054840c4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efefd5fc-378f-4251-9387-b1f054840c4a
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-efefd5fc-378f-4251-9387-b1f054840c4a
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
correlation: qa-1d11b4dd-ae82-454a-83fa-21446a34cc5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d11b4dd-ae82-454a-83fa-21446a34cc5e
Content-Type: application/json

--- request body ---
{"handle":"qa-26b877761d8f","password":"****"}

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d11b4dd-ae82-454a-83fa-21446a34cc5e
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0958ee9f-347a-4b8e-959b-47ee76cf2618"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70b22dbb-3122-4ec5-81a6-ea527fb6e685

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70b22dbb-3122-4ec5-81a6-ea527fb6e685
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70b22dbb-3122-4ec5-81a6-ea527fb6e685
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
correlation: qa-3b3aa9a7-fc83-4de9-9eeb-c15b6abeed11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b3aa9a7-fc83-4de9-9eeb-c15b6abeed11
Content-Type: application/json

--- request body ---
{"handle":"qa-26b877761d8f","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b3aa9a7-fc83-4de9-9eeb-c15b6abeed11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3b3aa9a7-fc83-4de9-9eeb-c15b6abeed11"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fb3b9db4-6e04-4409-88e6-3591c4ab8e68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb3b9db4-6e04-4409-88e6-3591c4ab8e68
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fb3b9db4-6e04-4409-88e6-3591c4ab8e68
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
correlation: qa-1f9025ea-08c7-4b1c-accc-221f912ee624

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f9025ea-08c7-4b1c-accc-221f912ee624
Content-Type: application/json

--- request body ---
{"handle":"qa-9cbe4ca8b717","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f9025ea-08c7-4b1c-accc-221f912ee624
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f9025ea-08c7-4b1c-accc-221f912ee624"}
```
