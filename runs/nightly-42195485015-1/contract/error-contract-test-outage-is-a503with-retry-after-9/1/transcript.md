# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-4d03e66a-ae7b-40c6-910b-8f28afb93528` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-cd5d62be-ddd8-4fcc-a424-50fc37508ecc` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-bd191fd6-99c3-498e-9633-fe5ab02a4056` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-35e69413-8df0-4c42-956b-f55b98bc41c4` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 22 | `qa-211b8f61-38d4-40a7-aa20-da22c3c81c71` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-3867c3dd-1ffc-47be-b21a-75ac8262e3db` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-1c6446c7-9c25-44d8-ba0e-b958cbb6cbec` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-f4fc8b46-94b9-451b-8292-6867cd42d667` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-103fd917-6ff7-4be6-b0e9-fb2a024d2491` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-5161785d-c3b2-494b-94f0-4df6f434d900` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4d03e66a-ae7b-40c6-910b-8f28afb93528

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d03e66a-ae7b-40c6-910b-8f28afb93528
Content-Type: application/json

--- request body ---
{"handle":"qa-695b89b2baf8","displayName":"QA 695b89b2baf8","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d03e66a-ae7b-40c6-910b-8f28afb93528
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 7
Location: /v1/accounts/qa-695b89b2baf8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_82863e0f-70ec-4782-a948-3f5aa76463c9","handle":"qa-695b89b2baf8","displayName":"QA 695b89b2baf8","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.634055929Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cd5d62be-ddd8-4fcc-a424-50fc37508ecc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd5d62be-ddd8-4fcc-a424-50fc37508ecc
Content-Type: application/json

--- request body ---
{"handle":"qa-dd226bbcd9e3","displayName":"QA dd226bbcd9e3","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd5d62be-ddd8-4fcc-a424-50fc37508ecc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 7
Location: /v1/accounts/qa-dd226bbcd9e3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_08e0a6b7-2e88-4beb-9132-9c546114050d","handle":"qa-dd226bbcd9e3","displayName":"QA dd226bbcd9e3","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.692068312Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bd191fd6-99c3-498e-9633-fe5ab02a4056

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd191fd6-99c3-498e-9633-fe5ab02a4056
Content-Type: application/json

--- request body ---
{"handle":"qa-695b89b2baf8","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd191fd6-99c3-498e-9633-fe5ab02a4056
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_82863e0f-70ec-4782-a948-3f5aa76463c9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-35e69413-8df0-4c42-956b-f55b98bc41c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35e69413-8df0-4c42-956b-f55b98bc41c4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dd226bbcd9e3","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-35e69413-8df0-4c42-956b-f55b98bc41c4
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
Location: /v1/conversations/cnv_1123d301-d5c0-4877-b6d6-31b650f0af79
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1123d301-d5c0-4877-b6d6-31b650f0af79","subject":"Error contract","status":"open","region":"eu","participants":["qa-695b89b2baf8","qa-dd226bbcd9e3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.791277063Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_1123d301-d5c0-4877-b6d6-31b650f0af79/messages
correlation: qa-211b8f61-38d4-40a7-aa20-da22c3c81c71

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d94c6384-fbf6-44d8-9559-621da8799471
X-Correlation-Id: qa-211b8f61-38d4-40a7-aa20-da22c3c81c71
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-211b8f61-38d4-40a7-aa20-da22c3c81c71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_1123d301-d5c0-4877-b6d6-31b650f0af79/messages","correlationId":"qa-211b8f61-38d4-40a7-aa20-da22c3c81c71"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3867c3dd-1ffc-47be-b21a-75ac8262e3db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3867c3dd-1ffc-47be-b21a-75ac8262e3db
Content-Type: application/json

--- request body ---
{"handle":"qa-dd226bbcd9e3","password":"****"}

--- response: 200 in 40 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-3867c3dd-1ffc-47be-b21a-75ac8262e3db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_08e0a6b7-2e88-4beb-9132-9c546114050d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1c6446c7-9c25-44d8-ba0e-b958cbb6cbec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c6446c7-9c25-44d8-ba0e-b958cbb6cbec
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1c6446c7-9c25-44d8-ba0e-b958cbb6cbec
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
correlation: qa-f4fc8b46-94b9-451b-8292-6867cd42d667

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4fc8b46-94b9-451b-8292-6867cd42d667
Content-Type: application/json

--- request body ---
{"handle":"qa-dd226bbcd9e3","password":"****"}

--- response: 401 in 23 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4fc8b46-94b9-451b-8292-6867cd42d667
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f4fc8b46-94b9-451b-8292-6867cd42d667"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-103fd917-6ff7-4be6-b0e9-fb2a024d2491

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-103fd917-6ff7-4be6-b0e9-fb2a024d2491
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-103fd917-6ff7-4be6-b0e9-fb2a024d2491
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
correlation: qa-5161785d-c3b2-494b-94f0-4df6f434d900

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5161785d-c3b2-494b-94f0-4df6f434d900
Content-Type: application/json

--- request body ---
{"handle":"qa-695b89b2baf8","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5161785d-c3b2-494b-94f0-4df6f434d900
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5161785d-c3b2-494b-94f0-4df6f434d900"}
```
