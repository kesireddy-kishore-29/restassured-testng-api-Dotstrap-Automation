# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-9de97e26-18d7-4c0d-ad81-783a7d7ef74e` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-f5808893-8abf-4fbe-8b98-0c8bed75dd74` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-f7489430-f034-4462-ad7e-235401abd33f` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-a112f719-698e-4c23-ab0a-86a2500af5d1` |
| 5 | `GET /v1/conversations/{id}` | 503 | 26 | `qa-af6cef01-03e4-4524-b5e7-2a00f1ae22bd` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-34e5e3a6-60ae-4873-88db-b62e7a07d0cb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 70 | `qa-04156ac0-ff14-47f1-b9d2-9cf5694626e7` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-2effa0e9-b7b3-4dfd-8ed0-0d62b3cb2cf8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-f0b1a00e-2fc8-420b-8f75-9e97b2e72e37` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-45d41a0c-1ae3-4b7c-a615-a3ac72d055a5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9de97e26-18d7-4c0d-ad81-783a7d7ef74e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9de97e26-18d7-4c0d-ad81-783a7d7ef74e
Content-Type: application/json

--- request body ---
{"handle":"qa-2fe015f21e1c","displayName":"QA 2fe015f21e1c","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-9de97e26-18d7-4c0d-ad81-783a7d7ef74e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 7
Location: /v1/accounts/qa-2fe015f21e1c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8066d7ec-e448-41cc-9192-d44c5975b509","handle":"qa-2fe015f21e1c","displayName":"QA 2fe015f21e1c","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.923064050Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f5808893-8abf-4fbe-8b98-0c8bed75dd74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5808893-8abf-4fbe-8b98-0c8bed75dd74
Content-Type: application/json

--- request body ---
{"handle":"qa-95823225a7ff","displayName":"QA 95823225a7ff","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5808893-8abf-4fbe-8b98-0c8bed75dd74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 7
Location: /v1/accounts/qa-95823225a7ff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_85c33c53-dee7-4aa0-939b-e14756379911","handle":"qa-95823225a7ff","displayName":"QA 95823225a7ff","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.983133191Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f7489430-f034-4462-ad7e-235401abd33f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7489430-f034-4462-ad7e-235401abd33f
Content-Type: application/json

--- request body ---
{"handle":"qa-2fe015f21e1c","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7489430-f034-4462-ad7e-235401abd33f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8066d7ec-e448-41cc-9192-d44c5975b509"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a112f719-698e-4c23-ab0a-86a2500af5d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a112f719-698e-4c23-ab0a-86a2500af5d1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-95823225a7ff","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-a112f719-698e-4c23-ab0a-86a2500af5d1
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
Location: /v1/conversations/cnv_5bb5746d-f8f2-4999-81b9-35c24d977371
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5bb5746d-f8f2-4999-81b9-35c24d977371","subject":"Error contract","status":"open","region":"eu","participants":["qa-2fe015f21e1c","qa-95823225a7ff"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:26.091555644Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_5bb5746d-f8f2-4999-81b9-35c24d977371
correlation: qa-af6cef01-03e4-4524-b5e7-2a00f1ae22bd

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 4d669f3d-166b-4e15-96d8-73552c4ffac7
X-Correlation-Id: qa-af6cef01-03e4-4524-b5e7-2a00f1ae22bd
Content-Type: application/json

--- response: 503 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af6cef01-03e4-4524-b5e7-2a00f1ae22bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_5bb5746d-f8f2-4999-81b9-35c24d977371","correlationId":"qa-af6cef01-03e4-4524-b5e7-2a00f1ae22bd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-34e5e3a6-60ae-4873-88db-b62e7a07d0cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34e5e3a6-60ae-4873-88db-b62e7a07d0cb
Content-Type: application/json

--- request body ---
{"handle":"qa-95823225a7ff","password":"****"}

--- response: 200 in 41 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-34e5e3a6-60ae-4873-88db-b62e7a07d0cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_85c33c53-dee7-4aa0-939b-e14756379911"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-04156ac0-ff14-47f1-b9d2-9cf5694626e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04156ac0-ff14-47f1-b9d2-9cf5694626e7
Content-Type: application/json

--- response: 204 in 70 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-04156ac0-ff14-47f1-b9d2-9cf5694626e7
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
correlation: qa-2effa0e9-b7b3-4dfd-8ed0-0d62b3cb2cf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2effa0e9-b7b3-4dfd-8ed0-0d62b3cb2cf8
Content-Type: application/json

--- request body ---
{"handle":"qa-95823225a7ff","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2effa0e9-b7b3-4dfd-8ed0-0d62b3cb2cf8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2effa0e9-b7b3-4dfd-8ed0-0d62b3cb2cf8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f0b1a00e-2fc8-420b-8f75-9e97b2e72e37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0b1a00e-2fc8-420b-8f75-9e97b2e72e37
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f0b1a00e-2fc8-420b-8f75-9e97b2e72e37
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
correlation: qa-45d41a0c-1ae3-4b7c-a615-a3ac72d055a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45d41a0c-1ae3-4b7c-a615-a3ac72d055a5
Content-Type: application/json

--- request body ---
{"handle":"qa-2fe015f21e1c","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-45d41a0c-1ae3-4b7c-a615-a3ac72d055a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-45d41a0c-1ae3-4b7c-a615-a3ac72d055a5"}
```
