# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-23a934bd-a55a-44f9-87e4-6f4b7b87ef34` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-dcc91fa4-650c-4c13-a526-145415e2bbd2` |
| 3 | `POST /v1/accounts` | 201 | 8 | `qa-578ab5ef-8aa1-43d9-b765-7a1b4fc77e05` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-3481413b-0646-4853-93d3-8a50bf45a341` |
| 5 | `POST /v1/conversations` | 201 | 13 | `qa-5002f39d-3bc4-4f66-8a92-99f120f7b644` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-5f3668d5-4c3c-4347-85af-e92820d328b9` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 10 | `qa-34d7173e-6fcf-4f45-a8e1-e91161fbed5a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-760fe42b-9490-457d-ae3f-d3217e275473` |
| 9 | `POST /v1/auth/token` | 401 | 14 | `qa-43036ac9-e6b1-4145-b599-11cd53f83cf1` |
| 10 | `POST /v1/auth/token` | 200 | 27 | `qa-42e20693-5b26-4563-8bd8-9f6e7881fde8` |
| 11 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-f75ebd2a-bd40-4e56-b49d-864f3d4ad862` |
| 12 | `POST /v1/auth/token` | 401 | 29 | `qa-9a81f485-6c1f-40e1-aba7-c814c1edf31b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-9530b488-34db-424f-a7c8-8d983812d2e9` |
| 14 | `POST /v1/auth/token` | 401 | 29 | `qa-15e9bf8a-d5ea-46ad-b685-b47cc6f72709` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-23a934bd-a55a-44f9-87e4-6f4b7b87ef34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23a934bd-a55a-44f9-87e4-6f4b7b87ef34
Content-Type: application/json

--- request body ---
{"handle":"qa-096021f976a1","displayName":"QA 096021f976a1","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-23a934bd-a55a-44f9-87e4-6f4b7b87ef34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Location: /v1/accounts/qa-096021f976a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ebc7e91-c546-488f-8022-2cfeb4a0494c","handle":"qa-096021f976a1","displayName":"QA 096021f976a1","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.266566535Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dcc91fa4-650c-4c13-a526-145415e2bbd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcc91fa4-650c-4c13-a526-145415e2bbd2
Content-Type: application/json

--- request body ---
{"handle":"qa-5b04bfac30ba","displayName":"QA 5b04bfac30ba","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcc91fa4-650c-4c13-a526-145415e2bbd2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-5b04bfac30ba
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dda735ca-0bf4-4f3b-90ac-1aded7caebeb","handle":"qa-5b04bfac30ba","displayName":"QA 5b04bfac30ba","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.306443184Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-578ab5ef-8aa1-43d9-b765-7a1b4fc77e05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-578ab5ef-8aa1-43d9-b765-7a1b4fc77e05
Content-Type: application/json

--- request body ---
{"handle":"qa-5f302e99ec88","displayName":"QA 5f302e99ec88","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-578ab5ef-8aa1-43d9-b765-7a1b4fc77e05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Location: /v1/accounts/qa-5f302e99ec88
X-Served-Region: eu
Content-Length: 181

{"id":"acc_520a13ca-65bf-4727-8bc8-167ca1d48f4e","handle":"qa-5f302e99ec88","displayName":"QA 5f302e99ec88","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.323585800Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-3481413b-0646-4853-93d3-8a50bf45a341

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3481413b-0646-4853-93d3-8a50bf45a341
Content-Type: application/json

--- request body ---
{"handle":"qa-096021f976a1","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3481413b-0646-4853-93d3-8a50bf45a341
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ebc7e91-c546-488f-8022-2cfeb4a0494c"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-5002f39d-3bc4-4f66-8a92-99f120f7b644

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5002f39d-3bc4-4f66-8a92-99f120f7b644
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5b04bfac30ba","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-5002f39d-3bc4-4f66-8a92-99f120f7b644
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
Location: /v1/conversations/cnv_b479050b-8b47-4e98-a0d0-4b3c5ef7b8d5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b479050b-8b47-4e98-a0d0-4b3c5ef7b8d5","subject":"Error contract","status":"open","region":"eu","participants":["qa-096021f976a1","qa-5b04bfac30ba"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:08.375024069Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5f3668d5-4c3c-4347-85af-e92820d328b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f3668d5-4c3c-4347-85af-e92820d328b9
Content-Type: application/json

--- request body ---
{"handle":"qa-5f302e99ec88","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f3668d5-4c3c-4347-85af-e92820d328b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_520a13ca-65bf-4727-8bc8-167ca1d48f4e"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_b479050b-8b47-4e98-a0d0-4b3c5ef7b8d5/messages
correlation: qa-34d7173e-6fcf-4f45-a8e1-e91161fbed5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34d7173e-6fcf-4f45-a8e1-e91161fbed5a
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34d7173e-6fcf-4f45-a8e1-e91161fbed5a
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_b479050b-8b47-4e98-a0d0-4b3c5ef7b8d5/messages","correlationId":"qa-34d7173e-6fcf-4f45-a8e1-e91161fbed5a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-760fe42b-9490-457d-ae3f-d3217e275473

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-760fe42b-9490-457d-ae3f-d3217e275473
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-760fe42b-9490-457d-ae3f-d3217e275473
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-43036ac9-e6b1-4145-b599-11cd53f83cf1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43036ac9-e6b1-4145-b599-11cd53f83cf1
Content-Type: application/json

--- request body ---
{"handle":"qa-5f302e99ec88","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43036ac9-e6b1-4145-b599-11cd53f83cf1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-43036ac9-e6b1-4145-b599-11cd53f83cf1"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-42e20693-5b26-4563-8bd8-9f6e7881fde8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42e20693-5b26-4563-8bd8-9f6e7881fde8
Content-Type: application/json

--- request body ---
{"handle":"qa-5b04bfac30ba","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-42e20693-5b26-4563-8bd8-9f6e7881fde8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dda735ca-0bf4-4f3b-90ac-1aded7caebeb"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f75ebd2a-bd40-4e56-b49d-864f3d4ad862

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f75ebd2a-bd40-4e56-b49d-864f3d4ad862
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f75ebd2a-bd40-4e56-b49d-864f3d4ad862
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-9a81f485-6c1f-40e1-aba7-c814c1edf31b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a81f485-6c1f-40e1-aba7-c814c1edf31b
Content-Type: application/json

--- request body ---
{"handle":"qa-5b04bfac30ba","password":"****"}

--- response: 401 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a81f485-6c1f-40e1-aba7-c814c1edf31b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9a81f485-6c1f-40e1-aba7-c814c1edf31b"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9530b488-34db-424f-a7c8-8d983812d2e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9530b488-34db-424f-a7c8-8d983812d2e9
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9530b488-34db-424f-a7c8-8d983812d2e9
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-15e9bf8a-d5ea-46ad-b685-b47cc6f72709

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15e9bf8a-d5ea-46ad-b685-b47cc6f72709
Content-Type: application/json

--- request body ---
{"handle":"qa-096021f976a1","password":"****"}

--- response: 401 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15e9bf8a-d5ea-46ad-b685-b47cc6f72709
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-15e9bf8a-d5ea-46ad-b685-b47cc6f72709"}
```
