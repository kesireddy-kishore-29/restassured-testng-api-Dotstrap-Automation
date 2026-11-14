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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-495e71fb-5390-481c-9159-808d91c3f8c9` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-867d6953-c477-41e4-9309-132cd65a48b0` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-94939b60-b59c-4a41-803c-c76339418ebe` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-f3b47051-0e14-4bd8-a22f-a8d398e30cf8` |
| 5 | `POST /v1/auth/token` | 200 | 34 | `qa-543f8803-c013-4e7a-8a00-cfc9428869a0` |
| 6 | `GET /v1/admin/stats` | 200 | 17 | `qa-9f051648-6014-4b57-8a53-59a018cd8c93` |
| 7 | `POST /v1/auth/token` | 200 | 22 | `qa-f9fa88f9-4528-406c-84ec-b451c5f4a029` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-73c69118-fa7f-4d21-8913-607952a59ee4` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-1374ba78-03d0-48c5-84d5-c00b30c9b285` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-b3c81ce2-1a7b-41b7-9c42-ed67a1c303fb` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-c52ed016-9c38-4118-80d6-753164e2be54` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-495e71fb-5390-481c-9159-808d91c3f8c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-495e71fb-5390-481c-9159-808d91c3f8c9
Content-Type: application/json

--- request body ---
{"handle":"qa-21824a8ba190","displayName":"QA 21824a8ba190","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-495e71fb-5390-481c-9159-808d91c3f8c9
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
Location: /v1/accounts/qa-21824a8ba190
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e156f3a3-2043-4818-9ebd-196847c5fcb1","handle":"qa-21824a8ba190","displayName":"QA 21824a8ba190","region":"eu","role":"user","createdAt":"2026-11-11T09:34:39.357323159Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-867d6953-c477-41e4-9309-132cd65a48b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-867d6953-c477-41e4-9309-132cd65a48b0
Content-Type: application/json

--- request body ---
{"handle":"qa-a7f2277c2fa4","displayName":"QA a7f2277c2fa4","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-867d6953-c477-41e4-9309-132cd65a48b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 6
Location: /v1/accounts/qa-a7f2277c2fa4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_005787e8-f3f6-4ca4-823a-bb2e698f8b49","handle":"qa-a7f2277c2fa4","displayName":"QA a7f2277c2fa4","region":"eu","role":"user","createdAt":"2026-11-11T09:34:39.378719089Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-94939b60-b59c-4a41-803c-c76339418ebe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94939b60-b59c-4a41-803c-c76339418ebe
Content-Type: application/json

--- request body ---
{"handle":"qa-21824a8ba190","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-94939b60-b59c-4a41-803c-c76339418ebe
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e156f3a3-2043-4818-9ebd-196847c5fcb1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f3b47051-0e14-4bd8-a22f-a8d398e30cf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3b47051-0e14-4bd8-a22f-a8d398e30cf8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a7f2277c2fa4","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3b47051-0e14-4bd8-a22f-a8d398e30cf8
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
Location: /v1/conversations/cnv_e68bdc40-0eca-4495-b488-f484e3a1d736
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e68bdc40-0eca-4495-b488-f484e3a1d736","subject":"Error contract","status":"open","region":"eu","participants":["qa-21824a8ba190","qa-a7f2277c2fa4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:39.426617675Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-543f8803-c013-4e7a-8a00-cfc9428869a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-543f8803-c013-4e7a-8a00-cfc9428869a0
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 34 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-543f8803-c013-4e7a-8a00-cfc9428869a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8ad86787-1190-4323-8d78-029e79959a77"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-9f051648-6014-4b57-8a53-59a018cd8c93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f051648-6014-4b57-8a53-59a018cd8c93
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f051648-6014-4b57-8a53-59a018cd8c93
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
correlation: qa-f9fa88f9-4528-406c-84ec-b451c5f4a029

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9fa88f9-4528-406c-84ec-b451c5f4a029
Content-Type: application/json

--- request body ---
{"handle":"qa-a7f2277c2fa4","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9fa88f9-4528-406c-84ec-b451c5f4a029
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_005787e8-f3f6-4ca4-823a-bb2e698f8b49"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-73c69118-fa7f-4d21-8913-607952a59ee4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73c69118-fa7f-4d21-8913-607952a59ee4
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-73c69118-fa7f-4d21-8913-607952a59ee4
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
correlation: qa-1374ba78-03d0-48c5-84d5-c00b30c9b285

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1374ba78-03d0-48c5-84d5-c00b30c9b285
Content-Type: application/json

--- request body ---
{"handle":"qa-a7f2277c2fa4","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1374ba78-03d0-48c5-84d5-c00b30c9b285
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1374ba78-03d0-48c5-84d5-c00b30c9b285"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b3c81ce2-1a7b-41b7-9c42-ed67a1c303fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3c81ce2-1a7b-41b7-9c42-ed67a1c303fb
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b3c81ce2-1a7b-41b7-9c42-ed67a1c303fb
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
correlation: qa-c52ed016-9c38-4118-80d6-753164e2be54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c52ed016-9c38-4118-80d6-753164e2be54
Content-Type: application/json

--- request body ---
{"handle":"qa-21824a8ba190","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c52ed016-9c38-4118-80d6-753164e2be54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c52ed016-9c38-4118-80d6-753164e2be54"}
```
