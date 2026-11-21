# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-480f63c6-58bb-4b60-a932-c9f79d9ca577` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-e8eafdf9-eb92-4cd3-846a-a81b2d8b1a60` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-db1e6290-51a4-476d-8215-424d8348351e` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-e755bfb4-c5b3-48e3-8949-3cb354eb4640` |
| 5 | `POST /v1/credits/purchases` | 400 | 8 | `qa-d5b457b6-e527-443d-9aae-cad3c86b3fab` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-8b2e101c-ae7e-4771-86de-e5638ccfa41d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-3439b99a-f879-415a-9136-3adcf4d2247a` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-5dc13f01-4188-43a3-9b79-39f126739291` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-1fbb8b9f-ef51-435b-902f-36de5c64e5a5` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-75eea3b0-57b3-4a5d-92bc-4dde6328344c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-480f63c6-58bb-4b60-a932-c9f79d9ca577

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-480f63c6-58bb-4b60-a932-c9f79d9ca577
Content-Type: application/json

--- request body ---
{"handle":"qa-d85aba598d4c","displayName":"QA d85aba598d4c","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-480f63c6-58bb-4b60-a932-c9f79d9ca577
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 7
Location: /v1/accounts/qa-d85aba598d4c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5352b2fa-d4e7-4ab5-a14b-e37f42f699fd","handle":"qa-d85aba598d4c","displayName":"QA d85aba598d4c","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.262479472Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e8eafdf9-eb92-4cd3-846a-a81b2d8b1a60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8eafdf9-eb92-4cd3-846a-a81b2d8b1a60
Content-Type: application/json

--- request body ---
{"handle":"qa-85ee8c6f631c","displayName":"QA 85ee8c6f631c","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8eafdf9-eb92-4cd3-846a-a81b2d8b1a60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 7
Location: /v1/accounts/qa-85ee8c6f631c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1d3a21f5-ad67-4f00-8f43-7c79b8153a79","handle":"qa-85ee8c6f631c","displayName":"QA 85ee8c6f631c","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.298347726Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-db1e6290-51a4-476d-8215-424d8348351e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db1e6290-51a4-476d-8215-424d8348351e
Content-Type: application/json

--- request body ---
{"handle":"qa-d85aba598d4c","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-db1e6290-51a4-476d-8215-424d8348351e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5352b2fa-d4e7-4ab5-a14b-e37f42f699fd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e755bfb4-c5b3-48e3-8949-3cb354eb4640

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e755bfb4-c5b3-48e3-8949-3cb354eb4640
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-85ee8c6f631c","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-e755bfb4-c5b3-48e3-8949-3cb354eb4640
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
Location: /v1/conversations/cnv_187ed44a-46a3-47b7-870d-11ee4e0a10e4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_187ed44a-46a3-47b7-870d-11ee4e0a10e4","subject":"Error contract","status":"open","region":"eu","participants":["qa-d85aba598d4c","qa-85ee8c6f631c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.357310704Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d5b457b6-e527-443d-9aae-cad3c86b3fab

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3968510559814c3c976777e823166343
X-Correlation-Id: qa-d5b457b6-e527-443d-9aae-cad3c86b3fab
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5b457b6-e527-443d-9aae-cad3c86b3fab
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-d5b457b6-e527-443d-9aae-cad3c86b3fab"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8b2e101c-ae7e-4771-86de-e5638ccfa41d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b2e101c-ae7e-4771-86de-e5638ccfa41d
Content-Type: application/json

--- request body ---
{"handle":"qa-85ee8c6f631c","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b2e101c-ae7e-4771-86de-e5638ccfa41d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1d3a21f5-ad67-4f00-8f43-7c79b8153a79"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3439b99a-f879-415a-9136-3adcf4d2247a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3439b99a-f879-415a-9136-3adcf4d2247a
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3439b99a-f879-415a-9136-3adcf4d2247a
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
correlation: qa-5dc13f01-4188-43a3-9b79-39f126739291

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dc13f01-4188-43a3-9b79-39f126739291
Content-Type: application/json

--- request body ---
{"handle":"qa-85ee8c6f631c","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5dc13f01-4188-43a3-9b79-39f126739291
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5dc13f01-4188-43a3-9b79-39f126739291"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1fbb8b9f-ef51-435b-902f-36de5c64e5a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fbb8b9f-ef51-435b-902f-36de5c64e5a5
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1fbb8b9f-ef51-435b-902f-36de5c64e5a5
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
correlation: qa-75eea3b0-57b3-4a5d-92bc-4dde6328344c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75eea3b0-57b3-4a5d-92bc-4dde6328344c
Content-Type: application/json

--- request body ---
{"handle":"qa-d85aba598d4c","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75eea3b0-57b3-4a5d-92bc-4dde6328344c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-75eea3b0-57b3-4a5d-92bc-4dde6328344c"}
```
