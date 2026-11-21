# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-9b5d3f01-ffa4-41b7-8d76-09a59322a45e` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-242567fe-5524-4946-b70f-e64c6a3ab0fb` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-dccc3534-c179-404d-aac6-67689200a95a` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-c5dc6ca3-68f8-4191-b24e-c989ca8a5fcc` |
| 5 | `PATCH /v1/accounts/me` | 400 | 15 | `qa-05bd7dd8-f433-433e-ae97-e4037c7674ca` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-e84a2404-e5aa-4631-aad0-cb525e03fc36` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-1a25c657-8f49-4e9b-aada-a90f8eb5d7c2` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-f1c1c396-8566-41e2-bc19-184a72a1908b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-4aca89bc-ae62-4c09-91ff-cf5dabb0252c` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-a4655dc4-886f-4834-b572-8548217ecde1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9b5d3f01-ffa4-41b7-8d76-09a59322a45e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b5d3f01-ffa4-41b7-8d76-09a59322a45e
Content-Type: application/json

--- request body ---
{"handle":"qa-4a6caef63f1e","displayName":"QA 4a6caef63f1e","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b5d3f01-ffa4-41b7-8d76-09a59322a45e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Location: /v1/accounts/qa-4a6caef63f1e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_868a7d30-f315-453d-b6fb-046341baf2ce","handle":"qa-4a6caef63f1e","displayName":"QA 4a6caef63f1e","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.926618825Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-242567fe-5524-4946-b70f-e64c6a3ab0fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-242567fe-5524-4946-b70f-e64c6a3ab0fb
Content-Type: application/json

--- request body ---
{"handle":"qa-1dbc37e499dc","displayName":"QA 1dbc37e499dc","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-242567fe-5524-4946-b70f-e64c6a3ab0fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Location: /v1/accounts/qa-1dbc37e499dc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_584fa6a0-f470-47c3-9088-57f37b91f45c","handle":"qa-1dbc37e499dc","displayName":"QA 1dbc37e499dc","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.997887967Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dccc3534-c179-404d-aac6-67689200a95a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dccc3534-c179-404d-aac6-67689200a95a
Content-Type: application/json

--- request body ---
{"handle":"qa-4a6caef63f1e","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-dccc3534-c179-404d-aac6-67689200a95a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_868a7d30-f315-453d-b6fb-046341baf2ce"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c5dc6ca3-68f8-4191-b24e-c989ca8a5fcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5dc6ca3-68f8-4191-b24e-c989ca8a5fcc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1dbc37e499dc","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5dc6ca3-68f8-4191-b24e-c989ca8a5fcc
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
Location: /v1/conversations/cnv_9167dd6d-0c93-49a1-9721-4e16f9598643
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9167dd6d-0c93-49a1-9721-4e16f9598643","subject":"Error contract","status":"open","region":"eu","participants":["qa-4a6caef63f1e","qa-1dbc37e499dc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.053642843Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-05bd7dd8-f433-433e-ae97-e4037c7674ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05bd7dd8-f433-433e-ae97-e4037c7674ca
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05bd7dd8-f433-433e-ae97-e4037c7674ca
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-05bd7dd8-f433-433e-ae97-e4037c7674ca"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e84a2404-e5aa-4631-aad0-cb525e03fc36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e84a2404-e5aa-4631-aad0-cb525e03fc36
Content-Type: application/json

--- request body ---
{"handle":"qa-1dbc37e499dc","password":"****"}

--- response: 200 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-e84a2404-e5aa-4631-aad0-cb525e03fc36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_584fa6a0-f470-47c3-9088-57f37b91f45c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1a25c657-8f49-4e9b-aada-a90f8eb5d7c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a25c657-8f49-4e9b-aada-a90f8eb5d7c2
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1a25c657-8f49-4e9b-aada-a90f8eb5d7c2
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
correlation: qa-f1c1c396-8566-41e2-bc19-184a72a1908b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1c1c396-8566-41e2-bc19-184a72a1908b
Content-Type: application/json

--- request body ---
{"handle":"qa-1dbc37e499dc","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1c1c396-8566-41e2-bc19-184a72a1908b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f1c1c396-8566-41e2-bc19-184a72a1908b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4aca89bc-ae62-4c09-91ff-cf5dabb0252c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aca89bc-ae62-4c09-91ff-cf5dabb0252c
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4aca89bc-ae62-4c09-91ff-cf5dabb0252c
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
correlation: qa-a4655dc4-886f-4834-b572-8548217ecde1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4655dc4-886f-4834-b572-8548217ecde1
Content-Type: application/json

--- request body ---
{"handle":"qa-4a6caef63f1e","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4655dc4-886f-4834-b572-8548217ecde1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4655dc4-886f-4834-b572-8548217ecde1"}
```
