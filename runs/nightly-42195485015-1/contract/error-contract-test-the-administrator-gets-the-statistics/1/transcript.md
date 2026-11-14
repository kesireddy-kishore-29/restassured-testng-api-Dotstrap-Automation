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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-ed45736e-5841-4641-991f-d364046bcdb3` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-096212b8-21a9-42c7-8059-a5b66fa0f743` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-8ebbfc45-ea57-46cf-82da-1b0e8b6ff2de` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-6d64be7e-2d09-4d2c-a513-1c1a765e5729` |
| 5 | `POST /v1/auth/token` | 200 | 21 | `qa-19bb90c1-87f9-4910-97dd-85301ee04c7d` |
| 6 | `GET /v1/admin/stats` | 200 | 16 | `qa-b128d265-f036-4a38-a1fe-61074b660cc4` |
| 7 | `POST /v1/auth/token` | 200 | 30 | `qa-a2de8626-6d40-494a-b034-d48da4c0266f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-63b0e9e4-83fa-41b0-aa9c-42694a5338c0` |
| 9 | `POST /v1/auth/token` | 401 | 21 | `qa-b7d0db61-6850-4976-96a8-645af7160b14` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-af0cf4c8-8972-4bf6-bc4a-865f981fcab8` |
| 11 | `POST /v1/auth/token` | 401 | 22 | `qa-4761b84e-7b26-4544-b13b-4ded92a46cba` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ed45736e-5841-4641-991f-d364046bcdb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed45736e-5841-4641-991f-d364046bcdb3
Content-Type: application/json

--- request body ---
{"handle":"qa-45d089948ea6","displayName":"QA 45d089948ea6","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed45736e-5841-4641-991f-d364046bcdb3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 6
Location: /v1/accounts/qa-45d089948ea6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_68efedc1-1458-45ca-803b-4e290de797d5","handle":"qa-45d089948ea6","displayName":"QA 45d089948ea6","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.954873677Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-096212b8-21a9-42c7-8059-a5b66fa0f743

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-096212b8-21a9-42c7-8059-a5b66fa0f743
Content-Type: application/json

--- request body ---
{"handle":"qa-d63f846a0b3f","displayName":"QA d63f846a0b3f","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-096212b8-21a9-42c7-8059-a5b66fa0f743
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 6
Location: /v1/accounts/qa-d63f846a0b3f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_94d0a910-b4df-4d7b-a1dc-9bc989a28cc6","handle":"qa-d63f846a0b3f","displayName":"QA d63f846a0b3f","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.983630137Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8ebbfc45-ea57-46cf-82da-1b0e8b6ff2de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ebbfc45-ea57-46cf-82da-1b0e8b6ff2de
Content-Type: application/json

--- request body ---
{"handle":"qa-45d089948ea6","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ebbfc45-ea57-46cf-82da-1b0e8b6ff2de
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68efedc1-1458-45ca-803b-4e290de797d5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6d64be7e-2d09-4d2c-a513-1c1a765e5729

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d64be7e-2d09-4d2c-a513-1c1a765e5729
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d63f846a0b3f","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d64be7e-2d09-4d2c-a513-1c1a765e5729
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
Location: /v1/conversations/cnv_5a00aff3-7051-4475-8693-37cc52395e99
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5a00aff3-7051-4475-8693-37cc52395e99","subject":"Error contract","status":"open","region":"eu","participants":["qa-45d089948ea6","qa-d63f846a0b3f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:35.033171565Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-19bb90c1-87f9-4910-97dd-85301ee04c7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19bb90c1-87f9-4910-97dd-85301ee04c7d
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-19bb90c1-87f9-4910-97dd-85301ee04c7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f645b034-9a79-406b-9535-ca7a4b5003cf"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-b128d265-f036-4a38-a1fe-61074b660cc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b128d265-f036-4a38-a1fe-61074b660cc4
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b128d265-f036-4a38-a1fe-61074b660cc4
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
correlation: qa-a2de8626-6d40-494a-b034-d48da4c0266f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2de8626-6d40-494a-b034-d48da4c0266f
Content-Type: application/json

--- request body ---
{"handle":"qa-d63f846a0b3f","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2de8626-6d40-494a-b034-d48da4c0266f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_94d0a910-b4df-4d7b-a1dc-9bc989a28cc6"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-63b0e9e4-83fa-41b0-aa9c-42694a5338c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63b0e9e4-83fa-41b0-aa9c-42694a5338c0
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-63b0e9e4-83fa-41b0-aa9c-42694a5338c0
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
correlation: qa-b7d0db61-6850-4976-96a8-645af7160b14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7d0db61-6850-4976-96a8-645af7160b14
Content-Type: application/json

--- request body ---
{"handle":"qa-d63f846a0b3f","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7d0db61-6850-4976-96a8-645af7160b14
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b7d0db61-6850-4976-96a8-645af7160b14"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-af0cf4c8-8972-4bf6-bc4a-865f981fcab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af0cf4c8-8972-4bf6-bc4a-865f981fcab8
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-af0cf4c8-8972-4bf6-bc4a-865f981fcab8
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
correlation: qa-4761b84e-7b26-4544-b13b-4ded92a46cba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4761b84e-7b26-4544-b13b-4ded92a46cba
Content-Type: application/json

--- request body ---
{"handle":"qa-45d089948ea6","password":"****"}

--- response: 401 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4761b84e-7b26-4544-b13b-4ded92a46cba
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4761b84e-7b26-4544-b13b-4ded92a46cba"}
```
