# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-661f57fa-f0e0-49e9-821a-eb1c64e340e9` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-d8848cbc-886c-4212-83e2-b8cb6c2c1620` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-f2b5c2f7-980e-40f3-b4b1-887f59950b9a` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-f9c5ff55-544c-416a-9beb-552eef1a7ea5` |
| 5 | `GET /v1/admin/stats` | 503 | 23 | `qa-d53a5e4e-e120-4ca5-8cb8-13f054c73cbc` |
| 6 | `POST /v1/auth/token` | 200 | 6 | `qa-a59ad7a4-27a8-489e-ab99-72fd40a0a9cb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-2b6b5f41-0d84-4454-9904-4abd61c46e06` |
| 8 | `POST /v1/auth/token` | 401 | 3 | `qa-f6719038-653c-4fd1-9c20-a844cec2d1a8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-a6ee4ed4-ad73-43c7-a944-651be7a8b180` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-7609b6f8-8546-43d8-99ec-4377e5aa0d39` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-661f57fa-f0e0-49e9-821a-eb1c64e340e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-661f57fa-f0e0-49e9-821a-eb1c64e340e9
Content-Type: application/json

--- request body ---
{"handle":"qa-30d79ca4b9d4","displayName":"QA 30d79ca4b9d4","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-661f57fa-f0e0-49e9-821a-eb1c64e340e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 7
Location: /v1/accounts/qa-30d79ca4b9d4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2f054d0d-c23f-4396-b3ec-b5a430784fcc","handle":"qa-30d79ca4b9d4","displayName":"QA 30d79ca4b9d4","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.557074744Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d8848cbc-886c-4212-83e2-b8cb6c2c1620

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8848cbc-886c-4212-83e2-b8cb6c2c1620
Content-Type: application/json

--- request body ---
{"handle":"qa-46bab7144d6e","displayName":"QA 46bab7144d6e","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8848cbc-886c-4212-83e2-b8cb6c2c1620
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 7
Location: /v1/accounts/qa-46bab7144d6e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f38582b-2522-4591-8fdf-2373a02c9e70","handle":"qa-46bab7144d6e","displayName":"QA 46bab7144d6e","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.598770612Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f2b5c2f7-980e-40f3-b4b1-887f59950b9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2b5c2f7-980e-40f3-b4b1-887f59950b9a
Content-Type: application/json

--- request body ---
{"handle":"qa-30d79ca4b9d4","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2b5c2f7-980e-40f3-b4b1-887f59950b9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2f054d0d-c23f-4396-b3ec-b5a430784fcc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f9c5ff55-544c-416a-9beb-552eef1a7ea5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9c5ff55-544c-416a-9beb-552eef1a7ea5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-46bab7144d6e","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9c5ff55-544c-416a-9beb-552eef1a7ea5
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
Location: /v1/conversations/cnv_4bd59e74-30bd-4f93-ac75-93a93de34ea8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4bd59e74-30bd-4f93-ac75-93a93de34ea8","subject":"Error contract","status":"open","region":"eu","participants":["qa-30d79ca4b9d4","qa-46bab7144d6e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.647841517Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-d53a5e4e-e120-4ca5-8cb8-13f054c73cbc

--- request headers ---
Accept: application/json
X-Fault-Key: dbb1bee8-f218-426e-b58b-38c7d1883dcf
X-Fault: unavailable-once
X-Correlation-Id: qa-d53a5e4e-e120-4ca5-8cb8-13f054c73cbc
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d53a5e4e-e120-4ca5-8cb8-13f054c73cbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-d53a5e4e-e120-4ca5-8cb8-13f054c73cbc"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a59ad7a4-27a8-489e-ab99-72fd40a0a9cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a59ad7a4-27a8-489e-ab99-72fd40a0a9cb
Content-Type: application/json

--- request body ---
{"handle":"qa-46bab7144d6e","password":"****"}

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a59ad7a4-27a8-489e-ab99-72fd40a0a9cb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f38582b-2522-4591-8fdf-2373a02c9e70"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b6b5f41-0d84-4454-9904-4abd61c46e06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b6b5f41-0d84-4454-9904-4abd61c46e06
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b6b5f41-0d84-4454-9904-4abd61c46e06
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
correlation: qa-f6719038-653c-4fd1-9c20-a844cec2d1a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6719038-653c-4fd1-9c20-a844cec2d1a8
Content-Type: application/json

--- request body ---
{"handle":"qa-46bab7144d6e","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6719038-653c-4fd1-9c20-a844cec2d1a8
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f6719038-653c-4fd1-9c20-a844cec2d1a8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a6ee4ed4-ad73-43c7-a944-651be7a8b180

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6ee4ed4-ad73-43c7-a944-651be7a8b180
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a6ee4ed4-ad73-43c7-a944-651be7a8b180
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
correlation: qa-7609b6f8-8546-43d8-99ec-4377e5aa0d39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7609b6f8-8546-43d8-99ec-4377e5aa0d39
Content-Type: application/json

--- request body ---
{"handle":"qa-30d79ca4b9d4","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7609b6f8-8546-43d8-99ec-4377e5aa0d39
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7609b6f8-8546-43d8-99ec-4377e5aa0d39"}
```
