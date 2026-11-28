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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-2f00b099-577c-4148-a9bd-15e525c4acc8` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-844b9a49-8e8d-48fe-9e8b-a2968b94af79` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-d13e0517-4c44-44c3-9e6c-e0a964732ae8` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-378cc691-f504-41b8-a5a2-d033fe69394a` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 50 | `qa-95610402-0814-4bdb-b0aa-ccce807bc0b7` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-2768cc04-1c01-483c-a275-61fb46502228` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-a396fe55-9caa-4514-96c6-8351403852f0` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-b122d0d6-c158-4c54-b77f-9780465a0c9f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-6b59e17d-5c62-4043-8e4b-d74ae870d2ab` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-575be4d3-d1df-47df-aefd-40e46a569e06` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2f00b099-577c-4148-a9bd-15e525c4acc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f00b099-577c-4148-a9bd-15e525c4acc8
Content-Type: application/json

--- request body ---
{"handle":"qa-9c8c1aac67ee","displayName":"QA 9c8c1aac67ee","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f00b099-577c-4148-a9bd-15e525c4acc8
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
Location: /v1/accounts/qa-9c8c1aac67ee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_acb958f8-1747-49a9-8aae-b50a3e1be038","handle":"qa-9c8c1aac67ee","displayName":"QA 9c8c1aac67ee","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.482844631Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-844b9a49-8e8d-48fe-9e8b-a2968b94af79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-844b9a49-8e8d-48fe-9e8b-a2968b94af79
Content-Type: application/json

--- request body ---
{"handle":"qa-a390a3623fb0","displayName":"QA a390a3623fb0","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-844b9a49-8e8d-48fe-9e8b-a2968b94af79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 6
Location: /v1/accounts/qa-a390a3623fb0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eac55c37-278d-4ec3-9cb3-72d8feb5ea1d","handle":"qa-a390a3623fb0","displayName":"QA a390a3623fb0","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.529909112Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d13e0517-4c44-44c3-9e6c-e0a964732ae8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d13e0517-4c44-44c3-9e6c-e0a964732ae8
Content-Type: application/json

--- request body ---
{"handle":"qa-9c8c1aac67ee","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d13e0517-4c44-44c3-9e6c-e0a964732ae8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_acb958f8-1747-49a9-8aae-b50a3e1be038"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-378cc691-f504-41b8-a5a2-d033fe69394a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-378cc691-f504-41b8-a5a2-d033fe69394a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a390a3623fb0","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-378cc691-f504-41b8-a5a2-d033fe69394a
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
Location: /v1/conversations/cnv_c758d7db-d7c9-4bb6-86e3-cfa31845c6a0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c758d7db-d7c9-4bb6-86e3-cfa31845c6a0","subject":"Error contract","status":"open","region":"eu","participants":["qa-9c8c1aac67ee","qa-a390a3623fb0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:03.614228677Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_c758d7db-d7c9-4bb6-86e3-cfa31845c6a0/messages
correlation: qa-95610402-0814-4bdb-b0aa-ccce807bc0b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95610402-0814-4bdb-b0aa-ccce807bc0b7
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 50 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95610402-0814-4bdb-b0aa-ccce807bc0b7
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_c758d7db-d7c9-4bb6-86e3-cfa31845c6a0/messages","correlationId":"qa-95610402-0814-4bdb-b0aa-ccce807bc0b7","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2768cc04-1c01-483c-a275-61fb46502228

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2768cc04-1c01-483c-a275-61fb46502228
Content-Type: application/json

--- request body ---
{"handle":"qa-a390a3623fb0","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2768cc04-1c01-483c-a275-61fb46502228
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eac55c37-278d-4ec3-9cb3-72d8feb5ea1d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a396fe55-9caa-4514-96c6-8351403852f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a396fe55-9caa-4514-96c6-8351403852f0
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a396fe55-9caa-4514-96c6-8351403852f0
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
correlation: qa-b122d0d6-c158-4c54-b77f-9780465a0c9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b122d0d6-c158-4c54-b77f-9780465a0c9f
Content-Type: application/json

--- request body ---
{"handle":"qa-a390a3623fb0","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b122d0d6-c158-4c54-b77f-9780465a0c9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b122d0d6-c158-4c54-b77f-9780465a0c9f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6b59e17d-5c62-4043-8e4b-d74ae870d2ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b59e17d-5c62-4043-8e4b-d74ae870d2ab
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6b59e17d-5c62-4043-8e4b-d74ae870d2ab
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
correlation: qa-575be4d3-d1df-47df-aefd-40e46a569e06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-575be4d3-d1df-47df-aefd-40e46a569e06
Content-Type: application/json

--- request body ---
{"handle":"qa-9c8c1aac67ee","password":"****"}

--- response: 401 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-575be4d3-d1df-47df-aefd-40e46a569e06
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-575be4d3-d1df-47df-aefd-40e46a569e06"}
```
