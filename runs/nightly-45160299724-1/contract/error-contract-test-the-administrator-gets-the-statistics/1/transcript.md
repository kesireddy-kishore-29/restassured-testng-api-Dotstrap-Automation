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
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-74889908-3f23-40fa-9ceb-d69ac09f9132` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-3d58dc08-d922-4ccc-92c1-dde72eff55ac` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-6819e667-19ec-4350-9171-66c1262f4058` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-8517937a-1276-4fad-a91f-da5e0673834a` |
| 5 | `POST /v1/auth/token` | 200 | 25 | `qa-7daafa49-eac0-4d14-8248-1b76847a08e3` |
| 6 | `GET /v1/admin/stats` | 200 | 11 | `qa-358b8c63-7a02-47da-aac6-4f74a6a9cc78` |
| 7 | `POST /v1/auth/token` | 200 | 11 | `qa-cb3169d2-d175-40da-b7cc-bc336aa7ff28` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-135b5c67-3c5a-407a-a2c8-787791df4a55` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-d1ac2beb-9f05-49a8-87c8-3b7a7ddc1909` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-3d8a3648-5686-4b64-9bf9-79e944afc948` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-52df2357-2714-4c96-bcdf-74aef551fd9d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-74889908-3f23-40fa-9ceb-d69ac09f9132

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74889908-3f23-40fa-9ceb-d69ac09f9132
Content-Type: application/json

--- request body ---
{"handle":"qa-52b804ee83bf","displayName":"QA 52b804ee83bf","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-74889908-3f23-40fa-9ceb-d69ac09f9132
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 7
Location: /v1/accounts/qa-52b804ee83bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e87637d5-4f71-44ec-9427-3bef72f42993","handle":"qa-52b804ee83bf","displayName":"QA 52b804ee83bf","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.372663759Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3d58dc08-d922-4ccc-92c1-dde72eff55ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d58dc08-d922-4ccc-92c1-dde72eff55ac
Content-Type: application/json

--- request body ---
{"handle":"qa-3dcdb525c1e5","displayName":"QA 3dcdb525c1e5","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d58dc08-d922-4ccc-92c1-dde72eff55ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 7
Location: /v1/accounts/qa-3dcdb525c1e5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_63399831-86e4-482d-989b-2288a7acd709","handle":"qa-3dcdb525c1e5","displayName":"QA 3dcdb525c1e5","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.394623784Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6819e667-19ec-4350-9171-66c1262f4058

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6819e667-19ec-4350-9171-66c1262f4058
Content-Type: application/json

--- request body ---
{"handle":"qa-52b804ee83bf","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6819e667-19ec-4350-9171-66c1262f4058
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e87637d5-4f71-44ec-9427-3bef72f42993"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8517937a-1276-4fad-a91f-da5e0673834a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8517937a-1276-4fad-a91f-da5e0673834a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3dcdb525c1e5","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-8517937a-1276-4fad-a91f-da5e0673834a
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
Location: /v1/conversations/cnv_6519e6f4-9351-4eb0-9592-5062cca83f73
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6519e6f4-9351-4eb0-9592-5062cca83f73","subject":"Error contract","status":"open","region":"eu","participants":["qa-52b804ee83bf","qa-3dcdb525c1e5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:55:00.440544627Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-7daafa49-eac0-4d14-8248-1b76847a08e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7daafa49-eac0-4d14-8248-1b76847a08e3
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-7daafa49-eac0-4d14-8248-1b76847a08e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_85c68f5c-1e60-40ed-ba5c-8c2ffab5142d"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-358b8c63-7a02-47da-aac6-4f74a6a9cc78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-358b8c63-7a02-47da-aac6-4f74a6a9cc78
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-358b8c63-7a02-47da-aac6-4f74a6a9cc78
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

{"accounts":10,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-cb3169d2-d175-40da-b7cc-bc336aa7ff28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb3169d2-d175-40da-b7cc-bc336aa7ff28
Content-Type: application/json

--- request body ---
{"handle":"qa-3dcdb525c1e5","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb3169d2-d175-40da-b7cc-bc336aa7ff28
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_63399831-86e4-482d-989b-2288a7acd709"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-135b5c67-3c5a-407a-a2c8-787791df4a55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-135b5c67-3c5a-407a-a2c8-787791df4a55
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-135b5c67-3c5a-407a-a2c8-787791df4a55
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
correlation: qa-d1ac2beb-9f05-49a8-87c8-3b7a7ddc1909

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1ac2beb-9f05-49a8-87c8-3b7a7ddc1909
Content-Type: application/json

--- request body ---
{"handle":"qa-3dcdb525c1e5","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1ac2beb-9f05-49a8-87c8-3b7a7ddc1909
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d1ac2beb-9f05-49a8-87c8-3b7a7ddc1909"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3d8a3648-5686-4b64-9bf9-79e944afc948

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d8a3648-5686-4b64-9bf9-79e944afc948
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3d8a3648-5686-4b64-9bf9-79e944afc948
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
correlation: qa-52df2357-2714-4c96-bcdf-74aef551fd9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52df2357-2714-4c96-bcdf-74aef551fd9d
Content-Type: application/json

--- request body ---
{"handle":"qa-52b804ee83bf","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52df2357-2714-4c96-bcdf-74aef551fd9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-52df2357-2714-4c96-bcdf-74aef551fd9d"}
```
