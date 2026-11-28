# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-ef286fdd-f7a5-40a7-9880-44d2fc96b67d` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-b485e6d9-2b74-4838-bc24-8bdc3601a1d8` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-e8ac6fcf-e186-4241-a3bc-bc0ccd2bb9ea` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-9fc36582-9dd9-4916-bfca-4765e22b6c67` |
| 5 | `PATCH /v1/accounts/me` | 422 | 18 | `qa-ed30c61b-549f-4b9e-9203-1f658b8942e6` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-11bf4658-abe6-49c3-8422-66ca61dae591` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-29bf90c6-3f50-410a-845f-ef8dff219c98` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-40af4f3e-44b6-43e3-aad8-8286a2285a7c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-e73e9c89-d87a-46b6-901e-aae02782720b` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-c3b2ee24-f624-4c95-bc90-2ec8b343fbfe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ef286fdd-f7a5-40a7-9880-44d2fc96b67d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef286fdd-f7a5-40a7-9880-44d2fc96b67d
Content-Type: application/json

--- request body ---
{"handle":"qa-30ea62be7ee4","displayName":"QA 30ea62be7ee4","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef286fdd-f7a5-40a7-9880-44d2fc96b67d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Location: /v1/accounts/qa-30ea62be7ee4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_12c8c98c-c1ab-4466-a850-d1efe3bee596","handle":"qa-30ea62be7ee4","displayName":"QA 30ea62be7ee4","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.893401878Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b485e6d9-2b74-4838-bc24-8bdc3601a1d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b485e6d9-2b74-4838-bc24-8bdc3601a1d8
Content-Type: application/json

--- request body ---
{"handle":"qa-0526640ecf16","displayName":"QA 0526640ecf16","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-b485e6d9-2b74-4838-bc24-8bdc3601a1d8
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
Location: /v1/accounts/qa-0526640ecf16
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cae90556-275f-4b09-8b58-76896fec9bdb","handle":"qa-0526640ecf16","displayName":"QA 0526640ecf16","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.929339489Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e8ac6fcf-e186-4241-a3bc-bc0ccd2bb9ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8ac6fcf-e186-4241-a3bc-bc0ccd2bb9ea
Content-Type: application/json

--- request body ---
{"handle":"qa-30ea62be7ee4","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8ac6fcf-e186-4241-a3bc-bc0ccd2bb9ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12c8c98c-c1ab-4466-a850-d1efe3bee596"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9fc36582-9dd9-4916-bfca-4765e22b6c67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fc36582-9dd9-4916-bfca-4765e22b6c67
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0526640ecf16","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fc36582-9dd9-4916-bfca-4765e22b6c67
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
Location: /v1/conversations/cnv_9888427d-3bd5-4d41-b246-1854182394a7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9888427d-3bd5-4d41-b246-1854182394a7","subject":"Error contract","status":"open","region":"eu","participants":["qa-30ea62be7ee4","qa-0526640ecf16"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:58.996552843Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-ed30c61b-549f-4b9e-9203-1f658b8942e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed30c61b-549f-4b9e-9203-1f658b8942e6
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed30c61b-549f-4b9e-9203-1f658b8942e6
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-ed30c61b-549f-4b9e-9203-1f658b8942e6","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-11bf4658-abe6-49c3-8422-66ca61dae591

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11bf4658-abe6-49c3-8422-66ca61dae591
Content-Type: application/json

--- request body ---
{"handle":"qa-0526640ecf16","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-11bf4658-abe6-49c3-8422-66ca61dae591
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cae90556-275f-4b09-8b58-76896fec9bdb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-29bf90c6-3f50-410a-845f-ef8dff219c98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29bf90c6-3f50-410a-845f-ef8dff219c98
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-29bf90c6-3f50-410a-845f-ef8dff219c98
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
correlation: qa-40af4f3e-44b6-43e3-aad8-8286a2285a7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40af4f3e-44b6-43e3-aad8-8286a2285a7c
Content-Type: application/json

--- request body ---
{"handle":"qa-0526640ecf16","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40af4f3e-44b6-43e3-aad8-8286a2285a7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-40af4f3e-44b6-43e3-aad8-8286a2285a7c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e73e9c89-d87a-46b6-901e-aae02782720b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e73e9c89-d87a-46b6-901e-aae02782720b
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e73e9c89-d87a-46b6-901e-aae02782720b
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
correlation: qa-c3b2ee24-f624-4c95-bc90-2ec8b343fbfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3b2ee24-f624-4c95-bc90-2ec8b343fbfe
Content-Type: application/json

--- request body ---
{"handle":"qa-30ea62be7ee4","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3b2ee24-f624-4c95-bc90-2ec8b343fbfe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c3b2ee24-f624-4c95-bc90-2ec8b343fbfe"}
```
