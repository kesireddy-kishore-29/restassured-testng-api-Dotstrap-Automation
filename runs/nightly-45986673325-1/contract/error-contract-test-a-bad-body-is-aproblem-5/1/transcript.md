# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 71 | `qa-c3674718-9a91-4216-a7d2-5c465c1def30` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-ba9dc04c-8d8b-45ce-82ba-52a54a7f4094` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-a7c4c0ab-094b-4fe8-8d49-9e86e007fe9d` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-bb3512fe-db04-41cd-82e6-202c2d5e3eea` |
| 5 | `POST /v1/accounts` | 422 | 12 | `qa-9b72b679-6f8e-457e-9e76-a4bb8af9defb` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-2419417d-bd21-4fdf-b416-3f40906e28bc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-a5cac8d4-2009-40a6-923a-28678069e47e` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-570a600f-e65b-445e-b0a4-69eb1449d0a5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-d1000db3-061a-4aac-ac84-432446cf458e` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-97723c44-5b26-40c9-a077-5359010645b4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c3674718-9a91-4216-a7d2-5c465c1def30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3674718-9a91-4216-a7d2-5c465c1def30
Content-Type: application/json

--- request body ---
{"handle":"qa-b5395c90df05","displayName":"QA b5395c90df05","password":"****","region":"eu"}

--- response: 201 in 71 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3674718-9a91-4216-a7d2-5c465c1def30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Location: /v1/accounts/qa-b5395c90df05
X-Served-Region: eu
Content-Length: 181

{"id":"acc_58aec7e3-2920-4bb8-b6ba-b7d371513b64","handle":"qa-b5395c90df05","displayName":"QA b5395c90df05","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.590827068Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ba9dc04c-8d8b-45ce-82ba-52a54a7f4094

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba9dc04c-8d8b-45ce-82ba-52a54a7f4094
Content-Type: application/json

--- request body ---
{"handle":"qa-8785173d7d8a","displayName":"QA 8785173d7d8a","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba9dc04c-8d8b-45ce-82ba-52a54a7f4094
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-8785173d7d8a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dcb77954-d1f9-4ab9-ab6c-8cdb46bfb3d5","handle":"qa-8785173d7d8a","displayName":"QA 8785173d7d8a","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.666116258Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a7c4c0ab-094b-4fe8-8d49-9e86e007fe9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7c4c0ab-094b-4fe8-8d49-9e86e007fe9d
Content-Type: application/json

--- request body ---
{"handle":"qa-b5395c90df05","password":"****"}

--- response: 200 in 50 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7c4c0ab-094b-4fe8-8d49-9e86e007fe9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_58aec7e3-2920-4bb8-b6ba-b7d371513b64"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bb3512fe-db04-41cd-82e6-202c2d5e3eea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb3512fe-db04-41cd-82e6-202c2d5e3eea
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8785173d7d8a","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb3512fe-db04-41cd-82e6-202c2d5e3eea
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
Location: /v1/conversations/cnv_906ce9a6-ed1e-42ca-8abd-0c4fa8c75b62
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_906ce9a6-ed1e-42ca-8abd-0c4fa8c75b62","subject":"Error contract","status":"open","region":"eu","participants":["qa-b5395c90df05","qa-8785173d7d8a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:58.781487792Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-9b72b679-6f8e-457e-9e76-a4bb8af9defb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b72b679-6f8e-457e-9e76-a4bb8af9defb
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b72b679-6f8e-457e-9e76-a4bb8af9defb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-9b72b679-6f8e-457e-9e76-a4bb8af9defb","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2419417d-bd21-4fdf-b416-3f40906e28bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2419417d-bd21-4fdf-b416-3f40906e28bc
Content-Type: application/json

--- request body ---
{"handle":"qa-8785173d7d8a","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2419417d-bd21-4fdf-b416-3f40906e28bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dcb77954-d1f9-4ab9-ab6c-8cdb46bfb3d5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a5cac8d4-2009-40a6-923a-28678069e47e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5cac8d4-2009-40a6-923a-28678069e47e
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a5cac8d4-2009-40a6-923a-28678069e47e
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
correlation: qa-570a600f-e65b-445e-b0a4-69eb1449d0a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-570a600f-e65b-445e-b0a4-69eb1449d0a5
Content-Type: application/json

--- request body ---
{"handle":"qa-8785173d7d8a","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-570a600f-e65b-445e-b0a4-69eb1449d0a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-570a600f-e65b-445e-b0a4-69eb1449d0a5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d1000db3-061a-4aac-ac84-432446cf458e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1000db3-061a-4aac-ac84-432446cf458e
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d1000db3-061a-4aac-ac84-432446cf458e
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
correlation: qa-97723c44-5b26-40c9-a077-5359010645b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97723c44-5b26-40c9-a077-5359010645b4
Content-Type: application/json

--- request body ---
{"handle":"qa-b5395c90df05","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-97723c44-5b26-40c9-a077-5359010645b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-97723c44-5b26-40c9-a077-5359010645b4"}
```
