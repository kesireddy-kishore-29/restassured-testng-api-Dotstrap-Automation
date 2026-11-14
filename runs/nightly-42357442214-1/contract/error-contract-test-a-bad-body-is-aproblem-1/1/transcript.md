# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-725c3859-b9dc-43ac-93f0-411aa126c05b` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-796f9f41-07f6-4653-b3be-9d94e3b486e8` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-a6543f5e-b8fc-4685-b9bd-538f131ceab0` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-4b531c35-f4cc-4406-9e77-9578a640c7f1` |
| 5 | `POST /v1/auth/token` | 415 | 38 | `qa-1089da31-e13c-4334-84d7-eaf3db6629ab` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-82b773c4-dfdb-42a3-80d5-e50f7609f8c8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-69db3726-ebf8-461e-a4b4-bf9fe6f4aa76` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-b03c7f22-baaa-4513-aabb-ed4d6a3313d0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-bceaade4-4491-4559-bbe6-2171f5b649a0` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-5d31054a-01b5-4220-bf7d-a660e9fe92b4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-725c3859-b9dc-43ac-93f0-411aa126c05b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-725c3859-b9dc-43ac-93f0-411aa126c05b
Content-Type: application/json

--- request body ---
{"handle":"qa-fe256cb3a112","displayName":"QA fe256cb3a112","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-725c3859-b9dc-43ac-93f0-411aa126c05b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-fe256cb3a112
X-Served-Region: eu
Content-Length: 181

{"id":"acc_03686a00-56e2-4ec1-825f-6c4744404613","handle":"qa-fe256cb3a112","displayName":"QA fe256cb3a112","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.125426319Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-796f9f41-07f6-4653-b3be-9d94e3b486e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-796f9f41-07f6-4653-b3be-9d94e3b486e8
Content-Type: application/json

--- request body ---
{"handle":"qa-92409a0702f2","displayName":"QA 92409a0702f2","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-796f9f41-07f6-4653-b3be-9d94e3b486e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Location: /v1/accounts/qa-92409a0702f2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b89714d9-11ec-4150-b9db-11b6bfe1a1ea","handle":"qa-92409a0702f2","displayName":"QA 92409a0702f2","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.148224364Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a6543f5e-b8fc-4685-b9bd-538f131ceab0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6543f5e-b8fc-4685-b9bd-538f131ceab0
Content-Type: application/json

--- request body ---
{"handle":"qa-fe256cb3a112","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6543f5e-b8fc-4685-b9bd-538f131ceab0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_03686a00-56e2-4ec1-825f-6c4744404613"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4b531c35-f4cc-4406-9e77-9578a640c7f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b531c35-f4cc-4406-9e77-9578a640c7f1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-92409a0702f2","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b531c35-f4cc-4406-9e77-9578a640c7f1
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
Location: /v1/conversations/cnv_38aee83c-3b5d-4512-aa98-1500c8ba59c9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_38aee83c-3b5d-4512-aa98-1500c8ba59c9","subject":"Error contract","status":"open","region":"eu","participants":["qa-fe256cb3a112","qa-92409a0702f2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:57.217079546Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-1089da31-e13c-4334-84d7-eaf3db6629ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1089da31-e13c-4334-84d7-eaf3db6629ab
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 38 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1089da31-e13c-4334-84d7-eaf3db6629ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-1089da31-e13c-4334-84d7-eaf3db6629ab"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-82b773c4-dfdb-42a3-80d5-e50f7609f8c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82b773c4-dfdb-42a3-80d5-e50f7609f8c8
Content-Type: application/json

--- request body ---
{"handle":"qa-92409a0702f2","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-82b773c4-dfdb-42a3-80d5-e50f7609f8c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b89714d9-11ec-4150-b9db-11b6bfe1a1ea"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-69db3726-ebf8-461e-a4b4-bf9fe6f4aa76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69db3726-ebf8-461e-a4b4-bf9fe6f4aa76
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-69db3726-ebf8-461e-a4b4-bf9fe6f4aa76
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
correlation: qa-b03c7f22-baaa-4513-aabb-ed4d6a3313d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b03c7f22-baaa-4513-aabb-ed4d6a3313d0
Content-Type: application/json

--- request body ---
{"handle":"qa-92409a0702f2","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b03c7f22-baaa-4513-aabb-ed4d6a3313d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b03c7f22-baaa-4513-aabb-ed4d6a3313d0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bceaade4-4491-4559-bbe6-2171f5b649a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bceaade4-4491-4559-bbe6-2171f5b649a0
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bceaade4-4491-4559-bbe6-2171f5b649a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5d31054a-01b5-4220-bf7d-a660e9fe92b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d31054a-01b5-4220-bf7d-a660e9fe92b4
Content-Type: application/json

--- request body ---
{"handle":"qa-fe256cb3a112","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5d31054a-01b5-4220-bf7d-a660e9fe92b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5d31054a-01b5-4220-bf7d-a660e9fe92b4"}
```
