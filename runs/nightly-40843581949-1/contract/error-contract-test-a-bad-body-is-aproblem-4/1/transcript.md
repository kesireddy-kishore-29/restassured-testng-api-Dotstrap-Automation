# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 58 | `qa-70616fef-0299-49a5-b886-249a750f2b92` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-17b22f53-18d5-4ab6-a5f1-7e9c737b0906` |
| 3 | `POST /v1/auth/token` | 200 | 67 | `qa-f3006fa4-8d5c-486f-aadc-ed77652f649c` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-64611c8b-8223-4f87-bd99-f1e5275a3ef1` |
| 5 | `POST /v1/accounts` | 415 | 17 | `qa-11b14fd1-7320-4a28-8fba-7979bdcb3889` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-2c3dcbfa-4696-4b2a-b236-124f93342ad5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-c69570fa-9997-40a5-b36e-be7a2c9dfbc5` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-65038d5c-3663-4588-b8a0-7b435ae89c58` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-d14cb971-ae56-45bc-944e-64a03c396321` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-203585b1-6218-45eb-85b6-6077dd68dba0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-70616fef-0299-49a5-b886-249a750f2b92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70616fef-0299-49a5-b886-249a750f2b92
Content-Type: application/json

--- request body ---
{"handle":"qa-e249fa3a5ade","displayName":"QA e249fa3a5ade","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-70616fef-0299-49a5-b886-249a750f2b92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Location: /v1/accounts/qa-e249fa3a5ade
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd935dd-2053-43b0-b1d1-8dbde692a886","handle":"qa-e249fa3a5ade","displayName":"QA e249fa3a5ade","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.775904080Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-17b22f53-18d5-4ab6-a5f1-7e9c737b0906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17b22f53-18d5-4ab6-a5f1-7e9c737b0906
Content-Type: application/json

--- request body ---
{"handle":"qa-6ad2b1f3871d","displayName":"QA 6ad2b1f3871d","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-17b22f53-18d5-4ab6-a5f1-7e9c737b0906
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Location: /v1/accounts/qa-6ad2b1f3871d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0fc52511-dfae-42eb-bb5a-0aea6ac2d2f0","handle":"qa-6ad2b1f3871d","displayName":"QA 6ad2b1f3871d","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.830085643Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f3006fa4-8d5c-486f-aadc-ed77652f649c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3006fa4-8d5c-486f-aadc-ed77652f649c
Content-Type: application/json

--- request body ---
{"handle":"qa-e249fa3a5ade","password":"****"}

--- response: 200 in 67 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3006fa4-8d5c-486f-aadc-ed77652f649c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4cd935dd-2053-43b0-b1d1-8dbde692a886"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-64611c8b-8223-4f87-bd99-f1e5275a3ef1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64611c8b-8223-4f87-bd99-f1e5275a3ef1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6ad2b1f3871d","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-64611c8b-8223-4f87-bd99-f1e5275a3ef1
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
Location: /v1/conversations/cnv_4a62bb15-e172-4c1c-af30-523342aab18e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4a62bb15-e172-4c1c-af30-523342aab18e","subject":"Error contract","status":"open","region":"eu","participants":["qa-e249fa3a5ade","qa-6ad2b1f3871d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:59.974760015Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-11b14fd1-7320-4a28-8fba-7979bdcb3889

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11b14fd1-7320-4a28-8fba-7979bdcb3889
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 17 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11b14fd1-7320-4a28-8fba-7979bdcb3889
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-11b14fd1-7320-4a28-8fba-7979bdcb3889"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2c3dcbfa-4696-4b2a-b236-124f93342ad5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c3dcbfa-4696-4b2a-b236-124f93342ad5
Content-Type: application/json

--- request body ---
{"handle":"qa-6ad2b1f3871d","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c3dcbfa-4696-4b2a-b236-124f93342ad5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0fc52511-dfae-42eb-bb5a-0aea6ac2d2f0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c69570fa-9997-40a5-b36e-be7a2c9dfbc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c69570fa-9997-40a5-b36e-be7a2c9dfbc5
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c69570fa-9997-40a5-b36e-be7a2c9dfbc5
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
correlation: qa-65038d5c-3663-4588-b8a0-7b435ae89c58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65038d5c-3663-4588-b8a0-7b435ae89c58
Content-Type: application/json

--- request body ---
{"handle":"qa-6ad2b1f3871d","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65038d5c-3663-4588-b8a0-7b435ae89c58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-65038d5c-3663-4588-b8a0-7b435ae89c58"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d14cb971-ae56-45bc-944e-64a03c396321

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d14cb971-ae56-45bc-944e-64a03c396321
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d14cb971-ae56-45bc-944e-64a03c396321
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
correlation: qa-203585b1-6218-45eb-85b6-6077dd68dba0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-203585b1-6218-45eb-85b6-6077dd68dba0
Content-Type: application/json

--- request body ---
{"handle":"qa-e249fa3a5ade","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-203585b1-6218-45eb-85b6-6077dd68dba0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-203585b1-6218-45eb-85b6-6077dd68dba0"}
```
