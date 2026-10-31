# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-6164003d-df09-4589-825c-b10fdf024b71` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-5cf87472-1ecf-4d95-a016-dbf6eebfaf7e` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 8 | `qa-53ad893d-5e44-4175-9d80-ffe70558c5a6` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-714407ec-3031-433a-94b2-0b90d21176bc` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-ef12a61e-3701-4b38-8bef-29ce64287d5f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6164003d-df09-4589-825c-b10fdf024b71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6164003d-df09-4589-825c-b10fdf024b71
Content-Type: application/json

--- request body ---
{"handle":"qa-fa7976dc7a0f","displayName":"QA fa7976dc7a0f","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-6164003d-df09-4589-825c-b10fdf024b71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 8
Location: /v1/accounts/qa-fa7976dc7a0f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3ba58ec9-d5bd-4780-80a4-993bbcb6944a","handle":"qa-fa7976dc7a0f","displayName":"QA fa7976dc7a0f","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.597888713Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5cf87472-1ecf-4d95-a016-dbf6eebfaf7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cf87472-1ecf-4d95-a016-dbf6eebfaf7e
Content-Type: application/json

--- request body ---
{"handle":"qa-fa7976dc7a0f","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cf87472-1ecf-4d95-a016-dbf6eebfaf7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ba58ec9-d5bd-4780-80a4-993bbcb6944a"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-53ad893d-5e44-4175-9d80-ffe70558c5a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53ad893d-5e44-4175-9d80-ffe70558c5a6
Content-Type: application/json

--- response: 404 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53ad893d-5e44-4175-9d80-ffe70558c5a6
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
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-53ad893d-5e44-4175-9d80-ffe70558c5a6"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-714407ec-3031-433a-94b2-0b90d21176bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-714407ec-3031-433a-94b2-0b90d21176bc
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-714407ec-3031-433a-94b2-0b90d21176bc
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ef12a61e-3701-4b38-8bef-29ce64287d5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef12a61e-3701-4b38-8bef-29ce64287d5f
Content-Type: application/json

--- request body ---
{"handle":"qa-fa7976dc7a0f","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef12a61e-3701-4b38-8bef-29ce64287d5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ef12a61e-3701-4b38-8bef-29ce64287d5f"}
```
