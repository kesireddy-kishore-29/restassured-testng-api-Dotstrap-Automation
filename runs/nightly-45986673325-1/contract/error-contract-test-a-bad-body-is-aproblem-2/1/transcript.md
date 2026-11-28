# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 59 | `qa-9b662daa-3d04-4633-ab62-7083a743b6b5` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-a38dd31c-5489-4080-acc2-21568c7ac458` |
| 3 | `POST /v1/auth/token` | 200 | 56 | `qa-05f8cfec-8308-4041-b6ba-eeaa741bb623` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-4baa2357-7a9d-4a33-820d-80f95417ca76` |
| 5 | `POST /v1/auth/token` | 422 | 49 | `qa-2e744a75-aa53-41eb-acf5-0f209504807f` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-e8067b57-7fe1-43d6-904f-7daa95ec59b4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-9cad29ee-a307-46ab-876c-286ba494eabe` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-783991b9-6d20-48cd-a238-e45abd7ed17e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-eadb57c0-988d-42ac-a2a6-7d0cd6f55da4` |
| 10 | `POST /v1/auth/token` | 401 | 60 | `qa-fdf5d374-78f7-40e6-a6f6-a24984f6c61e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9b662daa-3d04-4633-ab62-7083a743b6b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b662daa-3d04-4633-ab62-7083a743b6b5
Content-Type: application/json

--- request body ---
{"handle":"qa-b9e56ac88e04","displayName":"QA b9e56ac88e04","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b662daa-3d04-4633-ab62-7083a743b6b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Location: /v1/accounts/qa-b9e56ac88e04
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d52aad37-8c61-4624-bf90-5e70061229a1","handle":"qa-b9e56ac88e04","displayName":"QA b9e56ac88e04","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.009850862Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a38dd31c-5489-4080-acc2-21568c7ac458

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a38dd31c-5489-4080-acc2-21568c7ac458
Content-Type: application/json

--- request body ---
{"handle":"qa-ede9db17e3a2","displayName":"QA ede9db17e3a2","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a38dd31c-5489-4080-acc2-21568c7ac458
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Location: /v1/accounts/qa-ede9db17e3a2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_516a930f-1dc1-4549-9259-eb7ea187d3f6","handle":"qa-ede9db17e3a2","displayName":"QA ede9db17e3a2","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.069486965Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-05f8cfec-8308-4041-b6ba-eeaa741bb623

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05f8cfec-8308-4041-b6ba-eeaa741bb623
Content-Type: application/json

--- request body ---
{"handle":"qa-b9e56ac88e04","password":"****"}

--- response: 200 in 56 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-05f8cfec-8308-4041-b6ba-eeaa741bb623
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d52aad37-8c61-4624-bf90-5e70061229a1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4baa2357-7a9d-4a33-820d-80f95417ca76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4baa2357-7a9d-4a33-820d-80f95417ca76
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ede9db17e3a2","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4baa2357-7a9d-4a33-820d-80f95417ca76
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
Location: /v1/conversations/cnv_db1e7c6e-465f-41e7-84bf-e6f32fe8b9a5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_db1e7c6e-465f-41e7-84bf-e6f32fe8b9a5","subject":"Error contract","status":"open","region":"eu","participants":["qa-b9e56ac88e04","qa-ede9db17e3a2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:57.204308807Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2e744a75-aa53-41eb-acf5-0f209504807f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e744a75-aa53-41eb-acf5-0f209504807f
Content-Type: application/json

--- request body ---
{"handle":"qa-b9e56ac88e04","password":"****","ttlSeconds":0}

--- response: 422 in 49 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e744a75-aa53-41eb-acf5-0f209504807f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-2e744a75-aa53-41eb-acf5-0f209504807f","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e8067b57-7fe1-43d6-904f-7daa95ec59b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8067b57-7fe1-43d6-904f-7daa95ec59b4
Content-Type: application/json

--- request body ---
{"handle":"qa-ede9db17e3a2","password":"****"}

--- response: 200 in 46 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8067b57-7fe1-43d6-904f-7daa95ec59b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_516a930f-1dc1-4549-9259-eb7ea187d3f6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9cad29ee-a307-46ab-876c-286ba494eabe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cad29ee-a307-46ab-876c-286ba494eabe
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9cad29ee-a307-46ab-876c-286ba494eabe
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
correlation: qa-783991b9-6d20-48cd-a238-e45abd7ed17e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-783991b9-6d20-48cd-a238-e45abd7ed17e
Content-Type: application/json

--- request body ---
{"handle":"qa-ede9db17e3a2","password":"****"}

--- response: 401 in 23 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-783991b9-6d20-48cd-a238-e45abd7ed17e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-783991b9-6d20-48cd-a238-e45abd7ed17e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eadb57c0-988d-42ac-a2a6-7d0cd6f55da4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eadb57c0-988d-42ac-a2a6-7d0cd6f55da4
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eadb57c0-988d-42ac-a2a6-7d0cd6f55da4
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
correlation: qa-fdf5d374-78f7-40e6-a6f6-a24984f6c61e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdf5d374-78f7-40e6-a6f6-a24984f6c61e
Content-Type: application/json

--- request body ---
{"handle":"qa-b9e56ac88e04","password":"****"}

--- response: 401 in 60 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fdf5d374-78f7-40e6-a6f6-a24984f6c61e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fdf5d374-78f7-40e6-a6f6-a24984f6c61e"}
```
