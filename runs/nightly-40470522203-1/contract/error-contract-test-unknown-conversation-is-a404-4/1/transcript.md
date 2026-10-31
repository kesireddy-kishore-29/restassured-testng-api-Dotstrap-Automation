# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-f657f925-bee1-49ac-818c-5399df7ca738` |
| 2 | `POST /v1/auth/token` | 200 | 8 | `qa-b7867cd8-d42b-4ee8-86db-bcc4e28ca2c7` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 7 | `qa-e5d509f2-7871-4e55-9e6a-c934e7ffc32f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-2908c611-71df-4666-9927-197779e14121` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-ce0d5115-0c3f-4a58-b2ef-73fc88651ef9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f657f925-bee1-49ac-818c-5399df7ca738

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f657f925-bee1-49ac-818c-5399df7ca738
Content-Type: application/json

--- request body ---
{"handle":"qa-91bc772edb52","displayName":"QA 91bc772edb52","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-f657f925-bee1-49ac-818c-5399df7ca738
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 5
Location: /v1/accounts/qa-91bc772edb52
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f67b88-b814-423c-abc9-7c9d226639c6","handle":"qa-91bc772edb52","displayName":"QA 91bc772edb52","region":"eu","role":"user","createdAt":"2026-10-27T08:00:36.481444520Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b7867cd8-d42b-4ee8-86db-bcc4e28ca2c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7867cd8-d42b-4ee8-86db-bcc4e28ca2c7
Content-Type: application/json

--- request body ---
{"handle":"qa-91bc772edb52","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7867cd8-d42b-4ee8-86db-bcc4e28ca2c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d0f67b88-b814-423c-abc9-7c9d226639c6"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-e5d509f2-7871-4e55-9e6a-c934e7ffc32f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5d509f2-7871-4e55-9e6a-c934e7ffc32f
Content-Type: application/json

--- response: 404 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5d509f2-7871-4e55-9e6a-c934e7ffc32f
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-e5d509f2-7871-4e55-9e6a-c934e7ffc32f"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2908c611-71df-4666-9927-197779e14121

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2908c611-71df-4666-9927-197779e14121
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2908c611-71df-4666-9927-197779e14121
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
correlation: qa-ce0d5115-0c3f-4a58-b2ef-73fc88651ef9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce0d5115-0c3f-4a58-b2ef-73fc88651ef9
Content-Type: application/json

--- request body ---
{"handle":"qa-91bc772edb52","password":"****"}

--- response: 401 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce0d5115-0c3f-4a58-b2ef-73fc88651ef9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce0d5115-0c3f-4a58-b2ef-73fc88651ef9"}
```
