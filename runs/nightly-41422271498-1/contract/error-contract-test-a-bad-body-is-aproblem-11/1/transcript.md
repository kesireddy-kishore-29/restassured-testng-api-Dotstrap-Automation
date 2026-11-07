# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 48 | `qa-cc959ecc-36bc-4214-a3f4-83d85de1e342` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-9b36f6d5-8855-4c3c-bddb-3d8f7cac0087` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-d88be79d-18fe-4828-94a6-2e1381f63b5f` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-cb439b24-e921-4ce8-b973-bccf20de2a9b` |
| 5 | `POST /v1/conversations` | 422 | 11 | `qa-2a8f2a1e-8639-4c72-bedd-f4cf5bb9360a` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-017f92b9-0c6a-4cea-b77f-9012f41cacd1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-fb3c4b55-d1c6-4793-bfa3-8496b00b79b0` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-00be77f9-1939-4ead-9a21-5b2805507759` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-c816eca1-1874-45fa-8a52-0f1bf398a3b7` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-9026751a-a675-4237-a950-6c187dbad47d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cc959ecc-36bc-4214-a3f4-83d85de1e342

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc959ecc-36bc-4214-a3f4-83d85de1e342
Content-Type: application/json

--- request body ---
{"handle":"qa-a7b441beee96","displayName":"QA a7b441beee96","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc959ecc-36bc-4214-a3f4-83d85de1e342
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Location: /v1/accounts/qa-a7b441beee96
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d35972cf-2c31-45a6-9af1-3b02fc564152","handle":"qa-a7b441beee96","displayName":"QA a7b441beee96","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.858114347Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9b36f6d5-8855-4c3c-bddb-3d8f7cac0087

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b36f6d5-8855-4c3c-bddb-3d8f7cac0087
Content-Type: application/json

--- request body ---
{"handle":"qa-8e00a33a819c","displayName":"QA 8e00a33a819c","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b36f6d5-8855-4c3c-bddb-3d8f7cac0087
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Location: /v1/accounts/qa-8e00a33a819c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c41aeadb-b521-4095-be0f-3d710a4daeab","handle":"qa-8e00a33a819c","displayName":"QA 8e00a33a819c","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.913903551Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d88be79d-18fe-4828-94a6-2e1381f63b5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d88be79d-18fe-4828-94a6-2e1381f63b5f
Content-Type: application/json

--- request body ---
{"handle":"qa-a7b441beee96","password":"****"}

--- response: 200 in 34 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d88be79d-18fe-4828-94a6-2e1381f63b5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d35972cf-2c31-45a6-9af1-3b02fc564152"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cb439b24-e921-4ce8-b973-bccf20de2a9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb439b24-e921-4ce8-b973-bccf20de2a9b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8e00a33a819c","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb439b24-e921-4ce8-b973-bccf20de2a9b
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
Location: /v1/conversations/cnv_0f34a8b6-0468-4c4e-9f31-d5b2c4766a6d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0f34a8b6-0468-4c4e-9f31-d5b2c4766a6d","subject":"Error contract","status":"open","region":"eu","participants":["qa-a7b441beee96","qa-8e00a33a819c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.986893407Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-2a8f2a1e-8639-4c72-bedd-f4cf5bb9360a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a8f2a1e-8639-4c72-bedd-f4cf5bb9360a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8e00a33a819c","subject":" ","message":"Hi"}

--- response: 422 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a8f2a1e-8639-4c72-bedd-f4cf5bb9360a
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-2a8f2a1e-8639-4c72-bedd-f4cf5bb9360a","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-017f92b9-0c6a-4cea-b77f-9012f41cacd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-017f92b9-0c6a-4cea-b77f-9012f41cacd1
Content-Type: application/json

--- request body ---
{"handle":"qa-8e00a33a819c","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-017f92b9-0c6a-4cea-b77f-9012f41cacd1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c41aeadb-b521-4095-be0f-3d710a4daeab"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fb3c4b55-d1c6-4793-bfa3-8496b00b79b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb3c4b55-d1c6-4793-bfa3-8496b00b79b0
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fb3c4b55-d1c6-4793-bfa3-8496b00b79b0
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
correlation: qa-00be77f9-1939-4ead-9a21-5b2805507759

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00be77f9-1939-4ead-9a21-5b2805507759
Content-Type: application/json

--- request body ---
{"handle":"qa-8e00a33a819c","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00be77f9-1939-4ead-9a21-5b2805507759
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-00be77f9-1939-4ead-9a21-5b2805507759"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c816eca1-1874-45fa-8a52-0f1bf398a3b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c816eca1-1874-45fa-8a52-0f1bf398a3b7
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c816eca1-1874-45fa-8a52-0f1bf398a3b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9026751a-a675-4237-a950-6c187dbad47d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9026751a-a675-4237-a950-6c187dbad47d
Content-Type: application/json

--- request body ---
{"handle":"qa-a7b441beee96","password":"****"}

--- response: 401 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9026751a-a675-4237-a950-6c187dbad47d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9026751a-a675-4237-a950-6c187dbad47d"}
```
