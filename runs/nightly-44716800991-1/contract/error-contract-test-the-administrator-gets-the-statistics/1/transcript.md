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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-c5401dfe-c33c-4995-a372-caf438c8e45e` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-20d91cfe-5004-4c02-8c7f-abb476baf073` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-466f4e81-ed3b-451a-8c76-2d86371ee381` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-f454d3a1-8eb3-44fc-8341-cf7388458b66` |
| 5 | `POST /v1/auth/token` | 200 | 32 | `qa-7700af30-65e1-4d8b-8b0f-a6fb4bfb07eb` |
| 6 | `GET /v1/admin/stats` | 200 | 8 | `qa-bcb4c81c-c902-4960-a034-a0d11775e428` |
| 7 | `POST /v1/auth/token` | 200 | 20 | `qa-469c7194-6e47-4eb5-9c12-ce5a908cbdee` |
| 8 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-ca4289ad-45ea-4bee-8a84-4e4b58bd53ef` |
| 9 | `POST /v1/auth/token` | 401 | 4 | `qa-c3d62f0d-44c1-4fa7-ad04-c9845727323b` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-b9e2ad8a-70a5-4d35-8f02-23c76e1db621` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-1c1225e0-8c7e-4c40-a6d8-1b59432636b3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c5401dfe-c33c-4995-a372-caf438c8e45e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5401dfe-c33c-4995-a372-caf438c8e45e
Content-Type: application/json

--- request body ---
{"handle":"qa-d686bb8791b3","displayName":"QA d686bb8791b3","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5401dfe-c33c-4995-a372-caf438c8e45e
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
Location: /v1/accounts/qa-d686bb8791b3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_07424743-faa5-4f40-8ddf-f8e454104ca9","handle":"qa-d686bb8791b3","displayName":"QA d686bb8791b3","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.114020028Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-20d91cfe-5004-4c02-8c7f-abb476baf073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20d91cfe-5004-4c02-8c7f-abb476baf073
Content-Type: application/json

--- request body ---
{"handle":"qa-c1eb6f6a1f3b","displayName":"QA c1eb6f6a1f3b","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-20d91cfe-5004-4c02-8c7f-abb476baf073
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
Location: /v1/accounts/qa-c1eb6f6a1f3b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f65c533-e7ad-4b46-bf20-1b1c2a31013e","handle":"qa-c1eb6f6a1f3b","displayName":"QA c1eb6f6a1f3b","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.134937665Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-466f4e81-ed3b-451a-8c76-2d86371ee381

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-466f4e81-ed3b-451a-8c76-2d86371ee381
Content-Type: application/json

--- request body ---
{"handle":"qa-d686bb8791b3","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-466f4e81-ed3b-451a-8c76-2d86371ee381
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_07424743-faa5-4f40-8ddf-f8e454104ca9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f454d3a1-8eb3-44fc-8341-cf7388458b66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f454d3a1-8eb3-44fc-8341-cf7388458b66
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c1eb6f6a1f3b","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f454d3a1-8eb3-44fc-8341-cf7388458b66
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
Location: /v1/conversations/cnv_21d58c24-042c-482d-b325-f939de35fdc7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_21d58c24-042c-482d-b325-f939de35fdc7","subject":"Error contract","status":"open","region":"eu","participants":["qa-d686bb8791b3","qa-c1eb6f6a1f3b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:04.194057797Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-7700af30-65e1-4d8b-8b0f-a6fb4bfb07eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7700af30-65e1-4d8b-8b0f-a6fb4bfb07eb
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7700af30-65e1-4d8b-8b0f-a6fb4bfb07eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a50bb19e-23e8-4c8e-936d-194f7d83f7c3"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-bcb4c81c-c902-4960-a034-a0d11775e428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcb4c81c-c902-4960-a034-a0d11775e428
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcb4c81c-c902-4960-a034-a0d11775e428
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
correlation: qa-469c7194-6e47-4eb5-9c12-ce5a908cbdee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-469c7194-6e47-4eb5-9c12-ce5a908cbdee
Content-Type: application/json

--- request body ---
{"handle":"qa-c1eb6f6a1f3b","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-469c7194-6e47-4eb5-9c12-ce5a908cbdee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f65c533-e7ad-4b46-bf20-1b1c2a31013e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca4289ad-45ea-4bee-8a84-4e4b58bd53ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca4289ad-45ea-4bee-8a84-4e4b58bd53ef
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca4289ad-45ea-4bee-8a84-4e4b58bd53ef
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
correlation: qa-c3d62f0d-44c1-4fa7-ad04-c9845727323b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3d62f0d-44c1-4fa7-ad04-c9845727323b
Content-Type: application/json

--- request body ---
{"handle":"qa-c1eb6f6a1f3b","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3d62f0d-44c1-4fa7-ad04-c9845727323b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c3d62f0d-44c1-4fa7-ad04-c9845727323b"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b9e2ad8a-70a5-4d35-8f02-23c76e1db621

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9e2ad8a-70a5-4d35-8f02-23c76e1db621
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b9e2ad8a-70a5-4d35-8f02-23c76e1db621
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
correlation: qa-1c1225e0-8c7e-4c40-a6d8-1b59432636b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c1225e0-8c7e-4c40-a6d8-1b59432636b3
Content-Type: application/json

--- request body ---
{"handle":"qa-d686bb8791b3","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c1225e0-8c7e-4c40-a6d8-1b59432636b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1c1225e0-8c7e-4c40-a6d8-1b59432636b3"}
```
