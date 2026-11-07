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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-98239248-b93e-4fd9-9f61-02da43f84184` |
| 2 | `POST /v1/accounts` | 201 | 10 | `qa-c234b5aa-2090-4547-a702-102f4683dc07` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-e34504f8-719f-401e-b913-209e9f03607b` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-c8a78284-3077-428e-9bd5-850f072666f4` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 9 | `qa-7b324de8-c804-4db9-8586-0b896f6db3b3` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-ecd48809-1f68-45c3-8aea-530b0e84330c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-fb0489e8-94da-4fec-97b6-30b230107313` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-6925d6df-1920-4bda-8ff6-25b5952d979e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-52cad8a3-90e5-4e7b-880e-f0a68b779d76` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-8b8ce7d2-0d7e-479d-9b85-3e9bf0cca65b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-98239248-b93e-4fd9-9f61-02da43f84184

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98239248-b93e-4fd9-9f61-02da43f84184
Content-Type: application/json

--- request body ---
{"handle":"qa-e0e3a0272004","displayName":"QA e0e3a0272004","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-98239248-b93e-4fd9-9f61-02da43f84184
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Location: /v1/accounts/qa-e0e3a0272004
X-Served-Region: eu
Content-Length: 181

{"id":"acc_90813769-c351-4fac-b0b8-242450ce7186","handle":"qa-e0e3a0272004","displayName":"QA e0e3a0272004","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.200212534Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c234b5aa-2090-4547-a702-102f4683dc07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c234b5aa-2090-4547-a702-102f4683dc07
Content-Type: application/json

--- request body ---
{"handle":"qa-c2cb8c733c49","displayName":"QA c2cb8c733c49","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c234b5aa-2090-4547-a702-102f4683dc07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 8
Location: /v1/accounts/qa-c2cb8c733c49
X-Served-Region: eu
Content-Length: 181

{"id":"acc_82782469-22b8-497b-b6ce-a8a6d372c860","handle":"qa-c2cb8c733c49","displayName":"QA c2cb8c733c49","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.225837540Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e34504f8-719f-401e-b913-209e9f03607b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e34504f8-719f-401e-b913-209e9f03607b
Content-Type: application/json

--- request body ---
{"handle":"qa-e0e3a0272004","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e34504f8-719f-401e-b913-209e9f03607b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_90813769-c351-4fac-b0b8-242450ce7186"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c8a78284-3077-428e-9bd5-850f072666f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8a78284-3077-428e-9bd5-850f072666f4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c2cb8c733c49","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8a78284-3077-428e-9bd5-850f072666f4
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
Location: /v1/conversations/cnv_551645a6-caf9-4d8a-9360-b4821a2f7cc5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_551645a6-caf9-4d8a-9360-b4821a2f7cc5","subject":"Error contract","status":"open","region":"eu","participants":["qa-e0e3a0272004","qa-c2cb8c733c49"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:37.294902431Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_551645a6-caf9-4d8a-9360-b4821a2f7cc5/messages
correlation: qa-7b324de8-c804-4db9-8586-0b896f6db3b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b324de8-c804-4db9-8586-0b896f6db3b3
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b324de8-c804-4db9-8586-0b896f6db3b3
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_551645a6-caf9-4d8a-9360-b4821a2f7cc5/messages","correlationId":"qa-7b324de8-c804-4db9-8586-0b896f6db3b3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ecd48809-1f68-45c3-8aea-530b0e84330c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecd48809-1f68-45c3-8aea-530b0e84330c
Content-Type: application/json

--- request body ---
{"handle":"qa-c2cb8c733c49","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecd48809-1f68-45c3-8aea-530b0e84330c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_82782469-22b8-497b-b6ce-a8a6d372c860"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fb0489e8-94da-4fec-97b6-30b230107313

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb0489e8-94da-4fec-97b6-30b230107313
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fb0489e8-94da-4fec-97b6-30b230107313
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
correlation: qa-6925d6df-1920-4bda-8ff6-25b5952d979e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6925d6df-1920-4bda-8ff6-25b5952d979e
Content-Type: application/json

--- request body ---
{"handle":"qa-c2cb8c733c49","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6925d6df-1920-4bda-8ff6-25b5952d979e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6925d6df-1920-4bda-8ff6-25b5952d979e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-52cad8a3-90e5-4e7b-880e-f0a68b779d76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52cad8a3-90e5-4e7b-880e-f0a68b779d76
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-52cad8a3-90e5-4e7b-880e-f0a68b779d76
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
correlation: qa-8b8ce7d2-0d7e-479d-9b85-3e9bf0cca65b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b8ce7d2-0d7e-479d-9b85-3e9bf0cca65b
Content-Type: application/json

--- request body ---
{"handle":"qa-e0e3a0272004","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b8ce7d2-0d7e-479d-9b85-3e9bf0cca65b
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8b8ce7d2-0d7e-479d-9b85-3e9bf0cca65b"}
```
