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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-49336ec0-9694-4c40-afec-9ea7c46ffce8` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-6bd2056a-f947-4853-a94f-3efe7376d9ed` |
| 3 | `POST /v1/auth/token` | 200 | 57 | `qa-65d34aa9-79cf-4686-8928-9e65aee12e48` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-7674e99d-a8b2-4857-9cc5-d5f5d48752ab` |
| 5 | `GET /v1/conversations/{id}` | 503 | 16 | `qa-22753339-496a-4fde-91a8-e3021cc31514` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-b5574ddb-7b65-40b6-ab2f-7430041828cc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-2ec94842-b115-42c3-a330-c51425978472` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-b35b4be9-1797-442c-aad2-0c29b296fd69` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-f8fb1527-2f3b-4cdc-87a3-00aec679adb4` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-7b50160b-16fb-471e-a253-a87efca55ec8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-49336ec0-9694-4c40-afec-9ea7c46ffce8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49336ec0-9694-4c40-afec-9ea7c46ffce8
Content-Type: application/json

--- request body ---
{"handle":"qa-d351daa61697","displayName":"QA d351daa61697","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-49336ec0-9694-4c40-afec-9ea7c46ffce8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Location: /v1/accounts/qa-d351daa61697
X-Served-Region: eu
Content-Length: 181

{"id":"acc_58abf0b5-b87d-429a-a568-ecab68017975","handle":"qa-d351daa61697","displayName":"QA d351daa61697","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.956563462Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6bd2056a-f947-4853-a94f-3efe7376d9ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bd2056a-f947-4853-a94f-3efe7376d9ed
Content-Type: application/json

--- request body ---
{"handle":"qa-0c625d464bce","displayName":"QA 0c625d464bce","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bd2056a-f947-4853-a94f-3efe7376d9ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Location: /v1/accounts/qa-0c625d464bce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7b55a599-db5b-4879-83bc-77fd5424410b","handle":"qa-0c625d464bce","displayName":"QA 0c625d464bce","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.997695633Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-65d34aa9-79cf-4686-8928-9e65aee12e48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65d34aa9-79cf-4686-8928-9e65aee12e48
Content-Type: application/json

--- request body ---
{"handle":"qa-d351daa61697","password":"****"}

--- response: 200 in 57 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-65d34aa9-79cf-4686-8928-9e65aee12e48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_58abf0b5-b87d-429a-a568-ecab68017975"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7674e99d-a8b2-4857-9cc5-d5f5d48752ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7674e99d-a8b2-4857-9cc5-d5f5d48752ab
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0c625d464bce","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-7674e99d-a8b2-4857-9cc5-d5f5d48752ab
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
Location: /v1/conversations/cnv_d9dbce27-e326-4289-b7ea-9af30db54306
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d9dbce27-e326-4289-b7ea-9af30db54306","subject":"Error contract","status":"open","region":"eu","participants":["qa-d351daa61697","qa-0c625d464bce"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.119157751Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_d9dbce27-e326-4289-b7ea-9af30db54306
correlation: qa-22753339-496a-4fde-91a8-e3021cc31514

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 7cf33c1a-346a-41ba-a3ca-0a1a17510d86
X-Correlation-Id: qa-22753339-496a-4fde-91a8-e3021cc31514
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22753339-496a-4fde-91a8-e3021cc31514
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_d9dbce27-e326-4289-b7ea-9af30db54306","correlationId":"qa-22753339-496a-4fde-91a8-e3021cc31514"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b5574ddb-7b65-40b6-ab2f-7430041828cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5574ddb-7b65-40b6-ab2f-7430041828cc
Content-Type: application/json

--- request body ---
{"handle":"qa-0c625d464bce","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5574ddb-7b65-40b6-ab2f-7430041828cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7b55a599-db5b-4879-83bc-77fd5424410b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2ec94842-b115-42c3-a330-c51425978472

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ec94842-b115-42c3-a330-c51425978472
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2ec94842-b115-42c3-a330-c51425978472
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
correlation: qa-b35b4be9-1797-442c-aad2-0c29b296fd69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b35b4be9-1797-442c-aad2-0c29b296fd69
Content-Type: application/json

--- request body ---
{"handle":"qa-0c625d464bce","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b35b4be9-1797-442c-aad2-0c29b296fd69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b35b4be9-1797-442c-aad2-0c29b296fd69"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f8fb1527-2f3b-4cdc-87a3-00aec679adb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8fb1527-2f3b-4cdc-87a3-00aec679adb4
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f8fb1527-2f3b-4cdc-87a3-00aec679adb4
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
correlation: qa-7b50160b-16fb-471e-a253-a87efca55ec8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b50160b-16fb-471e-a253-a87efca55ec8
Content-Type: application/json

--- request body ---
{"handle":"qa-d351daa61697","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b50160b-16fb-471e-a253-a87efca55ec8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7b50160b-16fb-471e-a253-a87efca55ec8"}
```
