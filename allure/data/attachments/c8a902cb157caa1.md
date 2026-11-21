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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-bc58f683-75a9-4f07-bcd1-a0a9c464f86a` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-75e6985b-5e35-4641-b934-b1840265e18c` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-e325c296-4002-42ca-a713-bff9d1c8a04d` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-f822ffd4-a3ab-4149-b200-8e011a3d428f` |
| 5 | `POST /v1/auth/token` | 200 | 23 | `qa-3c4428b1-cc67-42ea-9bed-4914de0d8ba0` |
| 6 | `GET /v1/admin/stats` | 200 | 18 | `qa-16a91ab8-0359-4897-aef6-5e65cdbe8f7b` |
| 7 | `POST /v1/auth/token` | 200 | 35 | `qa-a6191cb2-c8f0-4a54-ab08-a391117173f8` |
| 8 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-d29895a5-83c4-42a1-8f5b-6433ba1d8d52` |
| 9 | `POST /v1/auth/token` | 401 | 14 | `qa-285ab78f-fbba-4102-b7e9-f87683a4c5cd` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-3ff994bc-6439-48c2-91b7-e77db2d0fb82` |
| 11 | `POST /v1/auth/token` | 401 | 17 | `qa-cbcbe734-1c2a-4f23-b4ff-dc0ec79228f0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bc58f683-75a9-4f07-bcd1-a0a9c464f86a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc58f683-75a9-4f07-bcd1-a0a9c464f86a
Content-Type: application/json

--- request body ---
{"handle":"qa-9d393aa461ac","displayName":"QA 9d393aa461ac","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc58f683-75a9-4f07-bcd1-a0a9c464f86a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 6
Location: /v1/accounts/qa-9d393aa461ac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_df5f2ae9-3844-448c-8edf-e7fb68d1896d","handle":"qa-9d393aa461ac","displayName":"QA 9d393aa461ac","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.894520321Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-75e6985b-5e35-4641-b934-b1840265e18c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75e6985b-5e35-4641-b934-b1840265e18c
Content-Type: application/json

--- request body ---
{"handle":"qa-15468e1dc58d","displayName":"QA 15468e1dc58d","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-75e6985b-5e35-4641-b934-b1840265e18c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 5
Location: /v1/accounts/qa-15468e1dc58d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_365407c9-c1d9-4590-b7e9-fb31ddd23700","handle":"qa-15468e1dc58d","displayName":"QA 15468e1dc58d","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.938331575Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e325c296-4002-42ca-a713-bff9d1c8a04d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e325c296-4002-42ca-a713-bff9d1c8a04d
Content-Type: application/json

--- request body ---
{"handle":"qa-9d393aa461ac","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e325c296-4002-42ca-a713-bff9d1c8a04d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_df5f2ae9-3844-448c-8edf-e7fb68d1896d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f822ffd4-a3ab-4149-b200-8e011a3d428f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f822ffd4-a3ab-4149-b200-8e011a3d428f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-15468e1dc58d","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-f822ffd4-a3ab-4149-b200-8e011a3d428f
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
Location: /v1/conversations/cnv_44a64761-2bc3-495f-aad3-e95262ff3441
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_44a64761-2bc3-495f-aad3-e95262ff3441","subject":"Error contract","status":"open","region":"eu","participants":["qa-9d393aa461ac","qa-15468e1dc58d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:12.999645450Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-3c4428b1-cc67-42ea-9bed-4914de0d8ba0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c4428b1-cc67-42ea-9bed-4914de0d8ba0
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c4428b1-cc67-42ea-9bed-4914de0d8ba0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_991a192c-895b-4114-b06a-c6ee3f5c71b4"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-16a91ab8-0359-4897-aef6-5e65cdbe8f7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16a91ab8-0359-4897-aef6-5e65cdbe8f7b
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-16a91ab8-0359-4897-aef6-5e65cdbe8f7b
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
correlation: qa-a6191cb2-c8f0-4a54-ab08-a391117173f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6191cb2-c8f0-4a54-ab08-a391117173f8
Content-Type: application/json

--- request body ---
{"handle":"qa-15468e1dc58d","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6191cb2-c8f0-4a54-ab08-a391117173f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_365407c9-c1d9-4590-b7e9-fb31ddd23700"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d29895a5-83c4-42a1-8f5b-6433ba1d8d52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d29895a5-83c4-42a1-8f5b-6433ba1d8d52
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d29895a5-83c4-42a1-8f5b-6433ba1d8d52
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
correlation: qa-285ab78f-fbba-4102-b7e9-f87683a4c5cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-285ab78f-fbba-4102-b7e9-f87683a4c5cd
Content-Type: application/json

--- request body ---
{"handle":"qa-15468e1dc58d","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-285ab78f-fbba-4102-b7e9-f87683a4c5cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-285ab78f-fbba-4102-b7e9-f87683a4c5cd"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3ff994bc-6439-48c2-91b7-e77db2d0fb82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ff994bc-6439-48c2-91b7-e77db2d0fb82
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3ff994bc-6439-48c2-91b7-e77db2d0fb82
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
correlation: qa-cbcbe734-1c2a-4f23-b4ff-dc0ec79228f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbcbe734-1c2a-4f23-b4ff-dc0ec79228f0
Content-Type: application/json

--- request body ---
{"handle":"qa-9d393aa461ac","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cbcbe734-1c2a-4f23-b4ff-dc0ec79228f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cbcbe734-1c2a-4f23-b4ff-dc0ec79228f0"}
```
