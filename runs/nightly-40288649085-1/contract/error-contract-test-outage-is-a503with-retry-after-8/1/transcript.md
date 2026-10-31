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
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-7fa53c69-168f-4f76-846b-c1a47fc1ae74` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-6b52ce60-f855-45c3-9968-1236fbb10ad7` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-a94fdbcc-e018-4405-b76d-7c7ae6ed6c18` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-43528a23-2ea2-47a0-a569-925131ebd9cc` |
| 5 | `GET /v1/conversations/{id}` | 503 | 14 | `qa-8ef085af-0f89-498e-b849-0ae8d63e5b7c` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-168373da-1f26-4e4a-a2f8-247cd247b7d5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-1413c09c-86f1-45e6-a81d-58b955d3d98d` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-bcceccac-d4a7-4d4d-83d6-e9ae54fcd4eb` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-06c5c451-10ce-497b-b81d-3ce84914963f` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-08d3ce02-2473-4b80-9755-d2b98570b90d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7fa53c69-168f-4f76-846b-c1a47fc1ae74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fa53c69-168f-4f76-846b-c1a47fc1ae74
Content-Type: application/json

--- request body ---
{"handle":"qa-fd9db431ee1e","displayName":"QA fd9db431ee1e","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fa53c69-168f-4f76-846b-c1a47fc1ae74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Location: /v1/accounts/qa-fd9db431ee1e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5b2afcec-1f9b-4e5c-b175-d74369545eaa","handle":"qa-fd9db431ee1e","displayName":"QA fd9db431ee1e","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.942223172Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6b52ce60-f855-45c3-9968-1236fbb10ad7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b52ce60-f855-45c3-9968-1236fbb10ad7
Content-Type: application/json

--- request body ---
{"handle":"qa-66cd9fdb4905","displayName":"QA 66cd9fdb4905","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b52ce60-f855-45c3-9968-1236fbb10ad7
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
Location: /v1/accounts/qa-66cd9fdb4905
X-Served-Region: eu
Content-Length: 181

{"id":"acc_64229dc5-c90c-4c46-a51f-99cefefb1597","handle":"qa-66cd9fdb4905","displayName":"QA 66cd9fdb4905","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.977000695Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a94fdbcc-e018-4405-b76d-7c7ae6ed6c18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a94fdbcc-e018-4405-b76d-7c7ae6ed6c18
Content-Type: application/json

--- request body ---
{"handle":"qa-fd9db431ee1e","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-a94fdbcc-e018-4405-b76d-7c7ae6ed6c18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5b2afcec-1f9b-4e5c-b175-d74369545eaa"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-43528a23-2ea2-47a0-a569-925131ebd9cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43528a23-2ea2-47a0-a569-925131ebd9cc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-66cd9fdb4905","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-43528a23-2ea2-47a0-a569-925131ebd9cc
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
Location: /v1/conversations/cnv_cdf7175c-82f6-4237-9b5e-79d9358773e8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cdf7175c-82f6-4237-9b5e-79d9358773e8","subject":"Error contract","status":"open","region":"eu","participants":["qa-fd9db431ee1e","qa-66cd9fdb4905"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.039113512Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_cdf7175c-82f6-4237-9b5e-79d9358773e8
correlation: qa-8ef085af-0f89-498e-b849-0ae8d63e5b7c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 834ef62b-5745-4bf7-923a-62011bab35a2
X-Correlation-Id: qa-8ef085af-0f89-498e-b849-0ae8d63e5b7c
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ef085af-0f89-498e-b849-0ae8d63e5b7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_cdf7175c-82f6-4237-9b5e-79d9358773e8","correlationId":"qa-8ef085af-0f89-498e-b849-0ae8d63e5b7c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-168373da-1f26-4e4a-a2f8-247cd247b7d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-168373da-1f26-4e4a-a2f8-247cd247b7d5
Content-Type: application/json

--- request body ---
{"handle":"qa-66cd9fdb4905","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-168373da-1f26-4e4a-a2f8-247cd247b7d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64229dc5-c90c-4c46-a51f-99cefefb1597"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1413c09c-86f1-45e6-a81d-58b955d3d98d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1413c09c-86f1-45e6-a81d-58b955d3d98d
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1413c09c-86f1-45e6-a81d-58b955d3d98d
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
correlation: qa-bcceccac-d4a7-4d4d-83d6-e9ae54fcd4eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcceccac-d4a7-4d4d-83d6-e9ae54fcd4eb
Content-Type: application/json

--- request body ---
{"handle":"qa-66cd9fdb4905","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bcceccac-d4a7-4d4d-83d6-e9ae54fcd4eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bcceccac-d4a7-4d4d-83d6-e9ae54fcd4eb"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-06c5c451-10ce-497b-b81d-3ce84914963f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06c5c451-10ce-497b-b81d-3ce84914963f
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-06c5c451-10ce-497b-b81d-3ce84914963f
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
correlation: qa-08d3ce02-2473-4b80-9755-d2b98570b90d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08d3ce02-2473-4b80-9755-d2b98570b90d
Content-Type: application/json

--- request body ---
{"handle":"qa-fd9db431ee1e","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08d3ce02-2473-4b80-9755-d2b98570b90d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-08d3ce02-2473-4b80-9755-d2b98570b90d"}
```
