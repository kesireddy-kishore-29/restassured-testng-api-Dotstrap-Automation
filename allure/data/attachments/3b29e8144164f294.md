# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 56 | `qa-92dd9b2e-2068-4438-a3c6-8b0afa60f4bf` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-c222cbe0-d4da-4e28-85a4-dc36a4c95e44` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-b0ddd913-3bd7-4562-b0fa-1f990c41e990` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-186b6bc0-d586-4a96-8aca-dfe5949b7251` |
| 5 | `POST /v1/auth/token` | 400 | 33 | `qa-de030c06-912c-4273-88c5-73f01f6cd7e4` |
| 6 | `POST /v1/auth/token` | 200 | 53 | `qa-d66c1a04-7099-4be5-8c14-8c3b6bc6a1ef` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b42754bc-0a67-4444-91c3-8ab1f12f69b6` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-0230256b-e39e-4f4e-866e-73708c14be8e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-0be5ac72-e919-4047-be75-d15b403895b1` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-3485100c-3a5b-41db-a9cf-2e8fd51258b8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-92dd9b2e-2068-4438-a3c6-8b0afa60f4bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92dd9b2e-2068-4438-a3c6-8b0afa60f4bf
Content-Type: application/json

--- request body ---
{"handle":"qa-b3db46b22616","displayName":"QA b3db46b22616","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-92dd9b2e-2068-4438-a3c6-8b0afa60f4bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-b3db46b22616
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c9b13bd4-df3b-4f79-a9d1-380897810eb2","handle":"qa-b3db46b22616","displayName":"QA b3db46b22616","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.151959623Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c222cbe0-d4da-4e28-85a4-dc36a4c95e44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c222cbe0-d4da-4e28-85a4-dc36a4c95e44
Content-Type: application/json

--- request body ---
{"handle":"qa-17716ee4f5f8","displayName":"QA 17716ee4f5f8","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c222cbe0-d4da-4e28-85a4-dc36a4c95e44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Location: /v1/accounts/qa-17716ee4f5f8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b4822b03-1699-422e-ba21-847e0ea04890","handle":"qa-17716ee4f5f8","displayName":"QA 17716ee4f5f8","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.189727162Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b0ddd913-3bd7-4562-b0fa-1f990c41e990

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0ddd913-3bd7-4562-b0fa-1f990c41e990
Content-Type: application/json

--- request body ---
{"handle":"qa-b3db46b22616","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0ddd913-3bd7-4562-b0fa-1f990c41e990
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c9b13bd4-df3b-4f79-a9d1-380897810eb2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-186b6bc0-d586-4a96-8aca-dfe5949b7251

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-186b6bc0-d586-4a96-8aca-dfe5949b7251
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-17716ee4f5f8","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-186b6bc0-d586-4a96-8aca-dfe5949b7251
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
Location: /v1/conversations/cnv_763724d3-7cd1-4bfc-826e-1cd28f946157
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_763724d3-7cd1-4bfc-826e-1cd28f946157","subject":"Error contract","status":"open","region":"eu","participants":["qa-b3db46b22616","qa-17716ee4f5f8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:57.266145373Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-de030c06-912c-4273-88c5-73f01f6cd7e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de030c06-912c-4273-88c5-73f01f6cd7e4
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 33 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de030c06-912c-4273-88c5-73f01f6cd7e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-de030c06-912c-4273-88c5-73f01f6cd7e4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d66c1a04-7099-4be5-8c14-8c3b6bc6a1ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d66c1a04-7099-4be5-8c14-8c3b6bc6a1ef
Content-Type: application/json

--- request body ---
{"handle":"qa-17716ee4f5f8","password":"****"}

--- response: 200 in 53 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d66c1a04-7099-4be5-8c14-8c3b6bc6a1ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b4822b03-1699-422e-ba21-847e0ea04890"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b42754bc-0a67-4444-91c3-8ab1f12f69b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b42754bc-0a67-4444-91c3-8ab1f12f69b6
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b42754bc-0a67-4444-91c3-8ab1f12f69b6
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
correlation: qa-0230256b-e39e-4f4e-866e-73708c14be8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0230256b-e39e-4f4e-866e-73708c14be8e
Content-Type: application/json

--- request body ---
{"handle":"qa-17716ee4f5f8","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0230256b-e39e-4f4e-866e-73708c14be8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0230256b-e39e-4f4e-866e-73708c14be8e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0be5ac72-e919-4047-be75-d15b403895b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0be5ac72-e919-4047-be75-d15b403895b1
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0be5ac72-e919-4047-be75-d15b403895b1
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
correlation: qa-3485100c-3a5b-41db-a9cf-2e8fd51258b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3485100c-3a5b-41db-a9cf-2e8fd51258b8
Content-Type: application/json

--- request body ---
{"handle":"qa-b3db46b22616","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3485100c-3a5b-41db-a9cf-2e8fd51258b8
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3485100c-3a5b-41db-a9cf-2e8fd51258b8"}
```
