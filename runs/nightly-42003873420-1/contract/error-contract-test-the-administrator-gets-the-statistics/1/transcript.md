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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-27ad1820-1f70-4ac4-b8be-1521cccd86e4` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-241eb27b-dcf5-47ab-aa4f-766747214710` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-7d3d7600-37e6-45d8-9242-fc4ffc7e4b95` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-25a5ce91-61c4-46b7-9aca-5bae33891eb2` |
| 5 | `POST /v1/auth/token` | 200 | 27 | `qa-f2ebe071-d43b-4976-8834-9dc592d093fc` |
| 6 | `GET /v1/admin/stats` | 200 | 6 | `qa-aced4ecf-1490-4568-a7bd-8393e704c8e1` |
| 7 | `POST /v1/auth/token` | 200 | 19 | `qa-edba809b-6264-4705-894f-6702cae51980` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-6cd0e946-004e-4ed7-bddc-81b54584fcbe` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-a3e0b56b-d115-4244-9627-b29609df44c0` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-0417d4d3-a736-4d0a-a635-9965bc3bc98c` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-b3ba912d-0454-4dce-9f8e-1b8a462ba828` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-27ad1820-1f70-4ac4-b8be-1521cccd86e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27ad1820-1f70-4ac4-b8be-1521cccd86e4
Content-Type: application/json

--- request body ---
{"handle":"qa-de07ce078b67","displayName":"QA de07ce078b67","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-27ad1820-1f70-4ac4-b8be-1521cccd86e4
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
Location: /v1/accounts/qa-de07ce078b67
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7a6814bb-cbad-4a8b-ba1c-378f3fb65b99","handle":"qa-de07ce078b67","displayName":"QA de07ce078b67","region":"eu","role":"user","createdAt":"2026-11-05T09:37:57.350801422Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-241eb27b-dcf5-47ab-aa4f-766747214710

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-241eb27b-dcf5-47ab-aa4f-766747214710
Content-Type: application/json

--- request body ---
{"handle":"qa-8897888e4514","displayName":"QA 8897888e4514","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-241eb27b-dcf5-47ab-aa4f-766747214710
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
Location: /v1/accounts/qa-8897888e4514
X-Served-Region: eu
Content-Length: 181

{"id":"acc_de6116a6-cec4-4640-8e50-e9971bbfd8e1","handle":"qa-8897888e4514","displayName":"QA 8897888e4514","region":"eu","role":"user","createdAt":"2026-11-05T09:37:57.366931634Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7d3d7600-37e6-45d8-9242-fc4ffc7e4b95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d3d7600-37e6-45d8-9242-fc4ffc7e4b95
Content-Type: application/json

--- request body ---
{"handle":"qa-de07ce078b67","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d3d7600-37e6-45d8-9242-fc4ffc7e4b95
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a6814bb-cbad-4a8b-ba1c-378f3fb65b99"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-25a5ce91-61c4-46b7-9aca-5bae33891eb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25a5ce91-61c4-46b7-9aca-5bae33891eb2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8897888e4514","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-25a5ce91-61c4-46b7-9aca-5bae33891eb2
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
Location: /v1/conversations/cnv_445f9bd5-b9ce-42a9-8649-406040ad705f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_445f9bd5-b9ce-42a9-8649-406040ad705f","subject":"Error contract","status":"open","region":"eu","participants":["qa-de07ce078b67","qa-8897888e4514"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:57.440125847Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f2ebe071-d43b-4976-8834-9dc592d093fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2ebe071-d43b-4976-8834-9dc592d093fc
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2ebe071-d43b-4976-8834-9dc592d093fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_739f1609-e6ca-4815-994f-bd6358ae4d6a"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-aced4ecf-1490-4568-a7bd-8393e704c8e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aced4ecf-1490-4568-a7bd-8393e704c8e1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-aced4ecf-1490-4568-a7bd-8393e704c8e1
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

{"accounts":8,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-edba809b-6264-4705-894f-6702cae51980

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edba809b-6264-4705-894f-6702cae51980
Content-Type: application/json

--- request body ---
{"handle":"qa-8897888e4514","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-edba809b-6264-4705-894f-6702cae51980
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_de6116a6-cec4-4640-8e50-e9971bbfd8e1"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6cd0e946-004e-4ed7-bddc-81b54584fcbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cd0e946-004e-4ed7-bddc-81b54584fcbe
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6cd0e946-004e-4ed7-bddc-81b54584fcbe
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
correlation: qa-a3e0b56b-d115-4244-9627-b29609df44c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3e0b56b-d115-4244-9627-b29609df44c0
Content-Type: application/json

--- request body ---
{"handle":"qa-8897888e4514","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a3e0b56b-d115-4244-9627-b29609df44c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a3e0b56b-d115-4244-9627-b29609df44c0"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0417d4d3-a736-4d0a-a635-9965bc3bc98c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0417d4d3-a736-4d0a-a635-9965bc3bc98c
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0417d4d3-a736-4d0a-a635-9965bc3bc98c
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
correlation: qa-b3ba912d-0454-4dce-9f8e-1b8a462ba828

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3ba912d-0454-4dce-9f8e-1b8a462ba828
Content-Type: application/json

--- request body ---
{"handle":"qa-de07ce078b67","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b3ba912d-0454-4dce-9f8e-1b8a462ba828
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b3ba912d-0454-4dce-9f8e-1b8a462ba828"}
```
