# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-e48f7b23-8d36-4f89-a548-3a07be3074c8` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-5cad3ecb-0577-408b-8b90-915b44efc387` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-6e7e387e-d6ed-46b2-962b-057c14599dfc` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-dd2f9219-f17a-434c-b4a7-0bc3debae19c` |
| 5 | `GET /v1/conversations` | 503 | 18 | `qa-112615cd-3a90-4b15-a9c9-8339024c1a9e` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-8afe3f43-9964-4872-9585-bd536c591025` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-3a971f3b-6786-47a0-b476-53298fc78da3` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-347614d0-2a8a-47f1-ba86-4031cbabb62a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-8ad0ccb2-feea-42da-99cf-4621568816de` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-430f9449-fdce-462e-a1f1-8cf3ef4feddd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e48f7b23-8d36-4f89-a548-3a07be3074c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e48f7b23-8d36-4f89-a548-3a07be3074c8
Content-Type: application/json

--- request body ---
{"handle":"qa-e95f002d1255","displayName":"QA e95f002d1255","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e48f7b23-8d36-4f89-a548-3a07be3074c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 9
Location: /v1/accounts/qa-e95f002d1255
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9871fbe7-4b3e-4547-b423-61c473f4881e","handle":"qa-e95f002d1255","displayName":"QA e95f002d1255","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.337343404Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5cad3ecb-0577-408b-8b90-915b44efc387

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cad3ecb-0577-408b-8b90-915b44efc387
Content-Type: application/json

--- request body ---
{"handle":"qa-ff193ecf7871","displayName":"QA ff193ecf7871","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cad3ecb-0577-408b-8b90-915b44efc387
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 9
Location: /v1/accounts/qa-ff193ecf7871
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4b4836fd-9c02-43e0-9448-c7b9ed910b40","handle":"qa-ff193ecf7871","displayName":"QA ff193ecf7871","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.398148242Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6e7e387e-d6ed-46b2-962b-057c14599dfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e7e387e-d6ed-46b2-962b-057c14599dfc
Content-Type: application/json

--- request body ---
{"handle":"qa-e95f002d1255","password":"****"}

--- response: 200 in 47 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e7e387e-d6ed-46b2-962b-057c14599dfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9871fbe7-4b3e-4547-b423-61c473f4881e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-dd2f9219-f17a-434c-b4a7-0bc3debae19c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd2f9219-f17a-434c-b4a7-0bc3debae19c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ff193ecf7871","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd2f9219-f17a-434c-b4a7-0bc3debae19c
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
Location: /v1/conversations/cnv_bcc59fa5-f7ee-4d1b-9665-688414934158
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bcc59fa5-f7ee-4d1b-9665-688414934158","subject":"Error contract","status":"open","region":"eu","participants":["qa-e95f002d1255","qa-ff193ecf7871"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.495578876Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-112615cd-3a90-4b15-a9c9-8339024c1a9e

--- request headers ---
Accept: application/json
X-Fault-Key: 72698050-ec40-4a95-91a6-8c9225a8d4e7
X-Fault: unavailable-once
X-Correlation-Id: qa-112615cd-3a90-4b15-a9c9-8339024c1a9e
Content-Type: application/json

--- response: 503 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-112615cd-3a90-4b15-a9c9-8339024c1a9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-112615cd-3a90-4b15-a9c9-8339024c1a9e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8afe3f43-9964-4872-9585-bd536c591025

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8afe3f43-9964-4872-9585-bd536c591025
Content-Type: application/json

--- request body ---
{"handle":"qa-ff193ecf7871","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8afe3f43-9964-4872-9585-bd536c591025
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4b4836fd-9c02-43e0-9448-c7b9ed910b40"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3a971f3b-6786-47a0-b476-53298fc78da3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a971f3b-6786-47a0-b476-53298fc78da3
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3a971f3b-6786-47a0-b476-53298fc78da3
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
correlation: qa-347614d0-2a8a-47f1-ba86-4031cbabb62a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-347614d0-2a8a-47f1-ba86-4031cbabb62a
Content-Type: application/json

--- request body ---
{"handle":"qa-ff193ecf7871","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-347614d0-2a8a-47f1-ba86-4031cbabb62a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-347614d0-2a8a-47f1-ba86-4031cbabb62a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ad0ccb2-feea-42da-99cf-4621568816de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ad0ccb2-feea-42da-99cf-4621568816de
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ad0ccb2-feea-42da-99cf-4621568816de
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
correlation: qa-430f9449-fdce-462e-a1f1-8cf3ef4feddd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-430f9449-fdce-462e-a1f1-8cf3ef4feddd
Content-Type: application/json

--- request body ---
{"handle":"qa-e95f002d1255","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-430f9449-fdce-462e-a1f1-8cf3ef4feddd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-430f9449-fdce-462e-a1f1-8cf3ef4feddd"}
```
