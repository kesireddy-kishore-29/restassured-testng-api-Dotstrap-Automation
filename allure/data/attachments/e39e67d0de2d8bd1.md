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
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-f4dd343d-1aa9-46fe-993e-7618f2a5287b` |
| 2 | `POST /v1/accounts` | 201 | 7 | `qa-c4a108b5-4e18-4711-accc-454cac0ecaf6` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-842e9494-84fe-48bd-8a9e-fcf80c89cd3f` |
| 4 | `POST /v1/conversations` | 201 | 5 | `qa-961d8d3b-f174-4e82-9fed-99e260b150fc` |
| 5 | `POST /v1/auth/token` | 200 | 12 | `qa-f2ac5702-b125-4fb7-aa63-fefe145013ac` |
| 6 | `GET /v1/admin/stats` | 200 | 23 | `qa-a5e1c719-c3bc-4cf7-ab91-d82cf94df7a7` |
| 7 | `POST /v1/auth/token` | 200 | 11 | `qa-4d07d2fe-0d57-47a3-a87c-b7d1fee2bd34` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-de85f5c3-6d02-4654-b7c3-2b54c47246b2` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-d8f7e688-9e42-4158-9996-44cf56178fc5` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-9f04817a-c1aa-414c-ba1a-5862cc5a75b2` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-7e92f930-4508-4e75-b422-26cb3903fb40` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f4dd343d-1aa9-46fe-993e-7618f2a5287b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4dd343d-1aa9-46fe-993e-7618f2a5287b
Content-Type: application/json

--- request body ---
{"handle":"qa-28d42dca4153","displayName":"QA 28d42dca4153","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4dd343d-1aa9-46fe-993e-7618f2a5287b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 7
Location: /v1/accounts/qa-28d42dca4153
X-Served-Region: eu
Content-Length: 181

{"id":"acc_604bcfdc-81ff-4aa9-bcc3-c7360a4248e3","handle":"qa-28d42dca4153","displayName":"QA 28d42dca4153","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.668499789Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c4a108b5-4e18-4711-accc-454cac0ecaf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4a108b5-4e18-4711-accc-454cac0ecaf6
Content-Type: application/json

--- request body ---
{"handle":"qa-fc3f7ceeb3c4","displayName":"QA fc3f7ceeb3c4","password":"****","region":"eu"}

--- response: 201 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4a108b5-4e18-4711-accc-454cac0ecaf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 7
Location: /v1/accounts/qa-fc3f7ceeb3c4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f49a0e32-8137-4933-995c-6cb46431f6ee","handle":"qa-fc3f7ceeb3c4","displayName":"QA fc3f7ceeb3c4","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.682352518Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-842e9494-84fe-48bd-8a9e-fcf80c89cd3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-842e9494-84fe-48bd-8a9e-fcf80c89cd3f
Content-Type: application/json

--- request body ---
{"handle":"qa-28d42dca4153","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-842e9494-84fe-48bd-8a9e-fcf80c89cd3f
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_604bcfdc-81ff-4aa9-bcc3-c7360a4248e3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-961d8d3b-f174-4e82-9fed-99e260b150fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-961d8d3b-f174-4e82-9fed-99e260b150fc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fc3f7ceeb3c4","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-961d8d3b-f174-4e82-9fed-99e260b150fc
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
Location: /v1/conversations/cnv_f391a36f-694e-4266-bc42-0c6b27327707
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f391a36f-694e-4266-bc42-0c6b27327707","subject":"Error contract","status":"open","region":"eu","participants":["qa-28d42dca4153","qa-fc3f7ceeb3c4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.718226308Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f2ac5702-b125-4fb7-aa63-fefe145013ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2ac5702-b125-4fb7-aa63-fefe145013ac
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2ac5702-b125-4fb7-aa63-fefe145013ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c3ca40c4-e346-4705-a5d0-5e0949f6b2fa"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-a5e1c719-c3bc-4cf7-ab91-d82cf94df7a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5e1c719-c3bc-4cf7-ab91-d82cf94df7a7
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5e1c719-c3bc-4cf7-ab91-d82cf94df7a7
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

{"accounts":10,"conversations":4,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-4d07d2fe-0d57-47a3-a87c-b7d1fee2bd34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d07d2fe-0d57-47a3-a87c-b7d1fee2bd34
Content-Type: application/json

--- request body ---
{"handle":"qa-fc3f7ceeb3c4","password":"****"}

--- response: 200 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d07d2fe-0d57-47a3-a87c-b7d1fee2bd34
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f49a0e32-8137-4933-995c-6cb46431f6ee"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-de85f5c3-6d02-4654-b7c3-2b54c47246b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de85f5c3-6d02-4654-b7c3-2b54c47246b2
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-de85f5c3-6d02-4654-b7c3-2b54c47246b2
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
correlation: qa-d8f7e688-9e42-4158-9996-44cf56178fc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8f7e688-9e42-4158-9996-44cf56178fc5
Content-Type: application/json

--- request body ---
{"handle":"qa-fc3f7ceeb3c4","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d8f7e688-9e42-4158-9996-44cf56178fc5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d8f7e688-9e42-4158-9996-44cf56178fc5"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9f04817a-c1aa-414c-ba1a-5862cc5a75b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f04817a-c1aa-414c-ba1a-5862cc5a75b2
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9f04817a-c1aa-414c-ba1a-5862cc5a75b2
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
correlation: qa-7e92f930-4508-4e75-b422-26cb3903fb40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e92f930-4508-4e75-b422-26cb3903fb40
Content-Type: application/json

--- request body ---
{"handle":"qa-28d42dca4153","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e92f930-4508-4e75-b422-26cb3903fb40
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e92f930-4508-4e75-b422-26cb3903fb40"}
```
