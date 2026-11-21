# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-d2786c92-80af-40d3-bb18-d634b84dc706` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-cee15e12-6de2-4e07-8d99-3f77d3421d0f` |
| 3 | `GET /v1/conversations/{id}` | 404 | 13 | `qa-83158c67-462c-427e-b8dc-854063e50fd8` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-85b5d2b4-7c8b-4faa-a2f5-28420e65899e` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-5ddc9149-47e9-4b5f-b205-14d124cd1139` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d2786c92-80af-40d3-bb18-d634b84dc706

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2786c92-80af-40d3-bb18-d634b84dc706
Content-Type: application/json

--- request body ---
{"handle":"qa-c0501ca6db4b","displayName":"QA c0501ca6db4b","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2786c92-80af-40d3-bb18-d634b84dc706
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 7
Location: /v1/accounts/qa-c0501ca6db4b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7c041cf0-27c8-4bca-abbd-44edca798d32","handle":"qa-c0501ca6db4b","displayName":"QA c0501ca6db4b","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.811083855Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cee15e12-6de2-4e07-8d99-3f77d3421d0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cee15e12-6de2-4e07-8d99-3f77d3421d0f
Content-Type: application/json

--- request body ---
{"handle":"qa-c0501ca6db4b","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-cee15e12-6de2-4e07-8d99-3f77d3421d0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7c041cf0-27c8-4bca-abbd-44edca798d32"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-83158c67-462c-427e-b8dc-854063e50fd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83158c67-462c-427e-b8dc-854063e50fd8
Content-Type: application/json

--- response: 404 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83158c67-462c-427e-b8dc-854063e50fd8
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-83158c67-462c-427e-b8dc-854063e50fd8"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-85b5d2b4-7c8b-4faa-a2f5-28420e65899e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85b5d2b4-7c8b-4faa-a2f5-28420e65899e
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-85b5d2b4-7c8b-4faa-a2f5-28420e65899e
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
correlation: qa-5ddc9149-47e9-4b5f-b205-14d124cd1139

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ddc9149-47e9-4b5f-b205-14d124cd1139
Content-Type: application/json

--- request body ---
{"handle":"qa-c0501ca6db4b","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ddc9149-47e9-4b5f-b205-14d124cd1139
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5ddc9149-47e9-4b5f-b205-14d124cd1139"}
```
