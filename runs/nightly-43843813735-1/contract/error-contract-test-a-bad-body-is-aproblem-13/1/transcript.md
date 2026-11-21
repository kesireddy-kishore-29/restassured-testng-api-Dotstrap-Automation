# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-0aa8c011-eddf-47d8-86fb-6877829bcd3a` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-50bb0356-676a-4273-8aac-78001363e491` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-6a3b7f66-dd11-4192-bbef-9fae3cf93c76` |
| 4 | `POST /v1/conversations` | 201 | 39 | `qa-c08f6786-5e63-40a5-8f21-f2fa23bf82aa` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 26 | `qa-9aac76e1-f940-44d7-b30e-a23475c3ed93` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-67c67e47-e095-4242-b454-cf9c16967372` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-70134831-cfc5-4b43-bd38-688701d30e2d` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-62b2581a-8fe9-4dba-a986-06bc9dc128e3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-28513377-f61d-4d7a-84bd-9091807ec67f` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-942c8b62-2af0-4921-88bf-0ff6727f2f10` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0aa8c011-eddf-47d8-86fb-6877829bcd3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0aa8c011-eddf-47d8-86fb-6877829bcd3a
Content-Type: application/json

--- request body ---
{"handle":"qa-78f8be51f319","displayName":"QA 78f8be51f319","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-0aa8c011-eddf-47d8-86fb-6877829bcd3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 7
Location: /v1/accounts/qa-78f8be51f319
X-Served-Region: eu
Content-Length: 181

{"id":"acc_051062cc-3ed1-47d2-a701-72309b340830","handle":"qa-78f8be51f319","displayName":"QA 78f8be51f319","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.070948994Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-50bb0356-676a-4273-8aac-78001363e491

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50bb0356-676a-4273-8aac-78001363e491
Content-Type: application/json

--- request body ---
{"handle":"qa-5be5fd6b0d22","displayName":"QA 5be5fd6b0d22","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-50bb0356-676a-4273-8aac-78001363e491
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 7
Location: /v1/accounts/qa-5be5fd6b0d22
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bc97fe84-1701-4860-8c05-56f278fd25c7","handle":"qa-5be5fd6b0d22","displayName":"QA 5be5fd6b0d22","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.112916537Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6a3b7f66-dd11-4192-bbef-9fae3cf93c76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a3b7f66-dd11-4192-bbef-9fae3cf93c76
Content-Type: application/json

--- request body ---
{"handle":"qa-78f8be51f319","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a3b7f66-dd11-4192-bbef-9fae3cf93c76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_051062cc-3ed1-47d2-a701-72309b340830"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c08f6786-5e63-40a5-8f21-f2fa23bf82aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c08f6786-5e63-40a5-8f21-f2fa23bf82aa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5be5fd6b0d22","subject":"Error contract","message":"Hi"}

--- response: 201 in 39 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c08f6786-5e63-40a5-8f21-f2fa23bf82aa
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
Location: /v1/conversations/cnv_a5a92261-2a28-4b96-92c0-fbfe0fd8eb58
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a5a92261-2a28-4b96-92c0-fbfe0fd8eb58","subject":"Error contract","status":"open","region":"eu","participants":["qa-78f8be51f319","qa-5be5fd6b0d22"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.217304042Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_a5a92261-2a28-4b96-92c0-fbfe0fd8eb58/messages
correlation: qa-9aac76e1-f940-44d7-b30e-a23475c3ed93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9aac76e1-f940-44d7-b30e-a23475c3ed93
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 26 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9aac76e1-f940-44d7-b30e-a23475c3ed93
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_a5a92261-2a28-4b96-92c0-fbfe0fd8eb58/messages","correlationId":"qa-9aac76e1-f940-44d7-b30e-a23475c3ed93"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-67c67e47-e095-4242-b454-cf9c16967372

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67c67e47-e095-4242-b454-cf9c16967372
Content-Type: application/json

--- request body ---
{"handle":"qa-5be5fd6b0d22","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-67c67e47-e095-4242-b454-cf9c16967372
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bc97fe84-1701-4860-8c05-56f278fd25c7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70134831-cfc5-4b43-bd38-688701d30e2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70134831-cfc5-4b43-bd38-688701d30e2d
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70134831-cfc5-4b43-bd38-688701d30e2d
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
correlation: qa-62b2581a-8fe9-4dba-a986-06bc9dc128e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62b2581a-8fe9-4dba-a986-06bc9dc128e3
Content-Type: application/json

--- request body ---
{"handle":"qa-5be5fd6b0d22","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62b2581a-8fe9-4dba-a986-06bc9dc128e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-62b2581a-8fe9-4dba-a986-06bc9dc128e3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-28513377-f61d-4d7a-84bd-9091807ec67f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28513377-f61d-4d7a-84bd-9091807ec67f
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-28513377-f61d-4d7a-84bd-9091807ec67f
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
correlation: qa-942c8b62-2af0-4921-88bf-0ff6727f2f10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-942c8b62-2af0-4921-88bf-0ff6727f2f10
Content-Type: application/json

--- request body ---
{"handle":"qa-78f8be51f319","password":"****"}

--- response: 401 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-942c8b62-2af0-4921-88bf-0ff6727f2f10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-942c8b62-2af0-4921-88bf-0ff6727f2f10"}
```
