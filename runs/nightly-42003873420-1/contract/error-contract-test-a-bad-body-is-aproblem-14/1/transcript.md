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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-c8b7546a-1089-427d-9475-670964920ab8` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-d0af0aaa-2faf-4aca-90d7-7bef94d7804a` |
| 3 | `POST /v1/auth/token` | 200 | 109 | `qa-04f9586c-797b-41a2-bd0b-e874329ae0e0` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-39df78a7-41c5-4ee5-80b2-aa5662163839` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 24 | `qa-f980e532-512a-413e-8bfb-75e17fe5a090` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-7fb4cbbf-f53a-4f45-9925-1279edf482a3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-b66ad2cd-a514-4ed8-95c6-b265a0f9fbdd` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-529e9ffb-4a84-4532-a148-05b32a208113` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-2a10adfe-af39-420a-9b48-4a6b90846ab9` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-37762dfb-c2de-4fa9-bd76-b57ceb84e42f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c8b7546a-1089-427d-9475-670964920ab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8b7546a-1089-427d-9475-670964920ab8
Content-Type: application/json

--- request body ---
{"handle":"qa-5f82b620ae1b","displayName":"QA 5f82b620ae1b","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8b7546a-1089-427d-9475-670964920ab8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 6
Location: /v1/accounts/qa-5f82b620ae1b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7ff0db4c-7a3b-4a33-8ed5-4b58a3562f6e","handle":"qa-5f82b620ae1b","displayName":"QA 5f82b620ae1b","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.705434329Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d0af0aaa-2faf-4aca-90d7-7bef94d7804a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0af0aaa-2faf-4aca-90d7-7bef94d7804a
Content-Type: application/json

--- request body ---
{"handle":"qa-0c2146defe55","displayName":"QA 0c2146defe55","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0af0aaa-2faf-4aca-90d7-7bef94d7804a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 6
Location: /v1/accounts/qa-0c2146defe55
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ae838b1a-943c-42bc-9cdd-75ab76e5781e","handle":"qa-0c2146defe55","displayName":"QA 0c2146defe55","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.753649042Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-04f9586c-797b-41a2-bd0b-e874329ae0e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04f9586c-797b-41a2-bd0b-e874329ae0e0
Content-Type: application/json

--- request body ---
{"handle":"qa-5f82b620ae1b","password":"****"}

--- response: 200 in 109 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-04f9586c-797b-41a2-bd0b-e874329ae0e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7ff0db4c-7a3b-4a33-8ed5-4b58a3562f6e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-39df78a7-41c5-4ee5-80b2-aa5662163839

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39df78a7-41c5-4ee5-80b2-aa5662163839
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0c2146defe55","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-39df78a7-41c5-4ee5-80b2-aa5662163839
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
Location: /v1/conversations/cnv_ccd63f7f-1d39-470c-bec1-f5a0935fca62
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ccd63f7f-1d39-470c-bec1-f5a0935fca62","subject":"Error contract","status":"open","region":"eu","participants":["qa-5f82b620ae1b","qa-0c2146defe55"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.905355687Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ccd63f7f-1d39-470c-bec1-f5a0935fca62/messages
correlation: qa-f980e532-512a-413e-8bfb-75e17fe5a090

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f980e532-512a-413e-8bfb-75e17fe5a090
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f980e532-512a-413e-8bfb-75e17fe5a090
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_ccd63f7f-1d39-470c-bec1-f5a0935fca62/messages","correlationId":"qa-f980e532-512a-413e-8bfb-75e17fe5a090","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7fb4cbbf-f53a-4f45-9925-1279edf482a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fb4cbbf-f53a-4f45-9925-1279edf482a3
Content-Type: application/json

--- request body ---
{"handle":"qa-0c2146defe55","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fb4cbbf-f53a-4f45-9925-1279edf482a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ae838b1a-943c-42bc-9cdd-75ab76e5781e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b66ad2cd-a514-4ed8-95c6-b265a0f9fbdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b66ad2cd-a514-4ed8-95c6-b265a0f9fbdd
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b66ad2cd-a514-4ed8-95c6-b265a0f9fbdd
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
correlation: qa-529e9ffb-4a84-4532-a148-05b32a208113

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-529e9ffb-4a84-4532-a148-05b32a208113
Content-Type: application/json

--- request body ---
{"handle":"qa-0c2146defe55","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-529e9ffb-4a84-4532-a148-05b32a208113
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-529e9ffb-4a84-4532-a148-05b32a208113"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2a10adfe-af39-420a-9b48-4a6b90846ab9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a10adfe-af39-420a-9b48-4a6b90846ab9
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2a10adfe-af39-420a-9b48-4a6b90846ab9
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
correlation: qa-37762dfb-c2de-4fa9-bd76-b57ceb84e42f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37762dfb-c2de-4fa9-bd76-b57ceb84e42f
Content-Type: application/json

--- request body ---
{"handle":"qa-5f82b620ae1b","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37762dfb-c2de-4fa9-bd76-b57ceb84e42f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-37762dfb-c2de-4fa9-bd76-b57ceb84e42f"}
```
