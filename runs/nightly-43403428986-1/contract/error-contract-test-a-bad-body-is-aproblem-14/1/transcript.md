# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-6dc7b768-45de-43b7-b810-86a58dc42d24` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-2fa58ce4-f44f-42fe-b009-4297d70fbd02` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-f30a3819-182d-48b9-bd95-12a2cce943ff` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-4063e1ef-02dc-4e1d-9b87-fc009549266f` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 28 | `qa-28b94739-46f0-4480-9f25-ff599c539ec5` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-457200e7-bd55-425f-9541-87abe09f80db` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-b40e31cf-c277-44ec-a206-74d6b6250f23` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-54bfe099-7656-489d-94a8-66efbfd89537` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-666b4be4-8779-4e7a-b7af-5e78ad19818b` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-65d73a9a-0638-4f83-85e7-4c710079f5fa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6dc7b768-45de-43b7-b810-86a58dc42d24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dc7b768-45de-43b7-b810-86a58dc42d24
Content-Type: application/json

--- request body ---
{"handle":"qa-b4bd59075de9","displayName":"QA b4bd59075de9","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dc7b768-45de-43b7-b810-86a58dc42d24
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
Location: /v1/accounts/qa-b4bd59075de9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e60e0c09-12a5-4585-a238-6f947ffeb5cf","handle":"qa-b4bd59075de9","displayName":"QA b4bd59075de9","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.078993401Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2fa58ce4-f44f-42fe-b009-4297d70fbd02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fa58ce4-f44f-42fe-b009-4297d70fbd02
Content-Type: application/json

--- request body ---
{"handle":"qa-86e0f0db4a54","displayName":"QA 86e0f0db4a54","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fa58ce4-f44f-42fe-b009-4297d70fbd02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Location: /v1/accounts/qa-86e0f0db4a54
X-Served-Region: eu
Content-Length: 181

{"id":"acc_341dfa24-7e34-431e-a806-f1e3aa0d3c1f","handle":"qa-86e0f0db4a54","displayName":"QA 86e0f0db4a54","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.107546729Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f30a3819-182d-48b9-bd95-12a2cce943ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f30a3819-182d-48b9-bd95-12a2cce943ff
Content-Type: application/json

--- request body ---
{"handle":"qa-b4bd59075de9","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-f30a3819-182d-48b9-bd95-12a2cce943ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e60e0c09-12a5-4585-a238-6f947ffeb5cf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4063e1ef-02dc-4e1d-9b87-fc009549266f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4063e1ef-02dc-4e1d-9b87-fc009549266f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-86e0f0db4a54","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-4063e1ef-02dc-4e1d-9b87-fc009549266f
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
Location: /v1/conversations/cnv_fcf837e4-a0a9-4014-98a0-1ef414620ecd
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fcf837e4-a0a9-4014-98a0-1ef414620ecd","subject":"Error contract","status":"open","region":"eu","participants":["qa-b4bd59075de9","qa-86e0f0db4a54"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:08.166110098Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_fcf837e4-a0a9-4014-98a0-1ef414620ecd/messages
correlation: qa-28b94739-46f0-4480-9f25-ff599c539ec5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28b94739-46f0-4480-9f25-ff599c539ec5
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 28 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-28b94739-46f0-4480-9f25-ff599c539ec5
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_fcf837e4-a0a9-4014-98a0-1ef414620ecd/messages","correlationId":"qa-28b94739-46f0-4480-9f25-ff599c539ec5","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-457200e7-bd55-425f-9541-87abe09f80db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-457200e7-bd55-425f-9541-87abe09f80db
Content-Type: application/json

--- request body ---
{"handle":"qa-86e0f0db4a54","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-457200e7-bd55-425f-9541-87abe09f80db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_341dfa24-7e34-431e-a806-f1e3aa0d3c1f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b40e31cf-c277-44ec-a206-74d6b6250f23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b40e31cf-c277-44ec-a206-74d6b6250f23
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b40e31cf-c277-44ec-a206-74d6b6250f23
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
correlation: qa-54bfe099-7656-489d-94a8-66efbfd89537

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54bfe099-7656-489d-94a8-66efbfd89537
Content-Type: application/json

--- request body ---
{"handle":"qa-86e0f0db4a54","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54bfe099-7656-489d-94a8-66efbfd89537
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-54bfe099-7656-489d-94a8-66efbfd89537"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-666b4be4-8779-4e7a-b7af-5e78ad19818b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-666b4be4-8779-4e7a-b7af-5e78ad19818b
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-666b4be4-8779-4e7a-b7af-5e78ad19818b
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
correlation: qa-65d73a9a-0638-4f83-85e7-4c710079f5fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65d73a9a-0638-4f83-85e7-4c710079f5fa
Content-Type: application/json

--- request body ---
{"handle":"qa-b4bd59075de9","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65d73a9a-0638-4f83-85e7-4c710079f5fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-65d73a9a-0638-4f83-85e7-4c710079f5fa"}
```
