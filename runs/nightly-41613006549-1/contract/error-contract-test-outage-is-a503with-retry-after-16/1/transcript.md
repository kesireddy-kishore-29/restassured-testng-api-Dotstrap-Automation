# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 7 | `qa-b335b9db-0e28-40fd-a32e-dbb936632276` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-08837e64-4892-47a9-b8d1-317415ce5cf4` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-a0d710bb-b02c-4c87-bba4-e7cdb09f5101` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-a8118961-5740-4a1e-80bc-e699bdc3f8db` |
| 5 | `GET /v1/admin/stats` | 503 | 27 | `qa-62666be5-6cce-461b-a9b4-83f1b55e664a` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-70d94ec6-eec1-4139-824a-0a717250d0cd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-9921ec23-ee15-4c16-be54-1046f8927946` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-eaa4c815-5cff-40ef-8a7f-1e6d6211b286` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-24bf46d4-908a-4bbf-b074-83b09f263e1e` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-583dbec1-dd6d-4e23-866e-984bb5138c83` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b335b9db-0e28-40fd-a32e-dbb936632276

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b335b9db-0e28-40fd-a32e-dbb936632276
Content-Type: application/json

--- request body ---
{"handle":"qa-743c5fa8c476","displayName":"QA 743c5fa8c476","password":"****","region":"eu"}

--- response: 201 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b335b9db-0e28-40fd-a32e-dbb936632276
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 8
Location: /v1/accounts/qa-743c5fa8c476
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2675debb-0d6e-4f27-9509-8fdd3ecbd51f","handle":"qa-743c5fa8c476","displayName":"QA 743c5fa8c476","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.382924555Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-08837e64-4892-47a9-b8d1-317415ce5cf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08837e64-4892-47a9-b8d1-317415ce5cf4
Content-Type: application/json

--- request body ---
{"handle":"qa-5aa1e5b2815b","displayName":"QA 5aa1e5b2815b","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-08837e64-4892-47a9-b8d1-317415ce5cf4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 8
Location: /v1/accounts/qa-5aa1e5b2815b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_37712985-7aad-4d44-a00f-6e8812698fc3","handle":"qa-5aa1e5b2815b","displayName":"QA 5aa1e5b2815b","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.414968939Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a0d710bb-b02c-4c87-bba4-e7cdb09f5101

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0d710bb-b02c-4c87-bba4-e7cdb09f5101
Content-Type: application/json

--- request body ---
{"handle":"qa-743c5fa8c476","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0d710bb-b02c-4c87-bba4-e7cdb09f5101
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2675debb-0d6e-4f27-9509-8fdd3ecbd51f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a8118961-5740-4a1e-80bc-e699bdc3f8db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8118961-5740-4a1e-80bc-e699bdc3f8db
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5aa1e5b2815b","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8118961-5740-4a1e-80bc-e699bdc3f8db
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
Location: /v1/conversations/cnv_c5f3c216-a835-4fa0-b497-2a18c6604e84
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c5f3c216-a835-4fa0-b497-2a18c6604e84","subject":"Error contract","status":"open","region":"eu","participants":["qa-743c5fa8c476","qa-5aa1e5b2815b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:33.470092802Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-62666be5-6cce-461b-a9b4-83f1b55e664a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 524af063-caba-48f4-903a-b27bdef7b20b
X-Correlation-Id: qa-62666be5-6cce-461b-a9b4-83f1b55e664a
Content-Type: application/json

--- response: 503 in 27 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62666be5-6cce-461b-a9b4-83f1b55e664a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-62666be5-6cce-461b-a9b4-83f1b55e664a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-70d94ec6-eec1-4139-824a-0a717250d0cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70d94ec6-eec1-4139-824a-0a717250d0cd
Content-Type: application/json

--- request body ---
{"handle":"qa-5aa1e5b2815b","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-70d94ec6-eec1-4139-824a-0a717250d0cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_37712985-7aad-4d44-a00f-6e8812698fc3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9921ec23-ee15-4c16-be54-1046f8927946

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9921ec23-ee15-4c16-be54-1046f8927946
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9921ec23-ee15-4c16-be54-1046f8927946
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
correlation: qa-eaa4c815-5cff-40ef-8a7f-1e6d6211b286

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaa4c815-5cff-40ef-8a7f-1e6d6211b286
Content-Type: application/json

--- request body ---
{"handle":"qa-5aa1e5b2815b","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eaa4c815-5cff-40ef-8a7f-1e6d6211b286
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eaa4c815-5cff-40ef-8a7f-1e6d6211b286"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-24bf46d4-908a-4bbf-b074-83b09f263e1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24bf46d4-908a-4bbf-b074-83b09f263e1e
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-24bf46d4-908a-4bbf-b074-83b09f263e1e
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
correlation: qa-583dbec1-dd6d-4e23-866e-984bb5138c83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-583dbec1-dd6d-4e23-866e-984bb5138c83
Content-Type: application/json

--- request body ---
{"handle":"qa-743c5fa8c476","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-583dbec1-dd6d-4e23-866e-984bb5138c83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-583dbec1-dd6d-4e23-866e-984bb5138c83"}
```
