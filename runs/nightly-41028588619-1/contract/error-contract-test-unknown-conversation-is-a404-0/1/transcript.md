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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-1cef7a45-9ff5-4da5-bdf1-bdfd43042a6e` |
| 2 | `POST /v1/auth/token` | 200 | 30 | `qa-33e55d6e-6cb6-43e6-bf20-a6cdc97fcfd7` |
| 3 | `GET /v1/conversations/{id}` | 404 | 12 | `qa-4ef760d8-af4f-496e-830d-61a3e1caee37` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-95fadd50-a49a-4b62-b454-ba2221e6316f` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-803fecd9-1e87-432a-9abe-66931deb838d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1cef7a45-9ff5-4da5-bdf1-bdfd43042a6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cef7a45-9ff5-4da5-bdf1-bdfd43042a6e
Content-Type: application/json

--- request body ---
{"handle":"qa-71e11df3ca79","displayName":"QA 71e11df3ca79","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cef7a45-9ff5-4da5-bdf1-bdfd43042a6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 6
Location: /v1/accounts/qa-71e11df3ca79
X-Served-Region: eu
Content-Length: 181

{"id":"acc_57c5ff74-0647-48e2-b3d0-558dde53b982","handle":"qa-71e11df3ca79","displayName":"QA 71e11df3ca79","region":"eu","role":"user","createdAt":"2026-10-30T08:46:06.132069500Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-33e55d6e-6cb6-43e6-bf20-a6cdc97fcfd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33e55d6e-6cb6-43e6-bf20-a6cdc97fcfd7
Content-Type: application/json

--- request body ---
{"handle":"qa-71e11df3ca79","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-33e55d6e-6cb6-43e6-bf20-a6cdc97fcfd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_57c5ff74-0647-48e2-b3d0-558dde53b982"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-4ef760d8-af4f-496e-830d-61a3e1caee37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ef760d8-af4f-496e-830d-61a3e1caee37
Content-Type: application/json

--- response: 404 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ef760d8-af4f-496e-830d-61a3e1caee37
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-4ef760d8-af4f-496e-830d-61a3e1caee37"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-95fadd50-a49a-4b62-b454-ba2221e6316f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95fadd50-a49a-4b62-b454-ba2221e6316f
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-95fadd50-a49a-4b62-b454-ba2221e6316f
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
correlation: qa-803fecd9-1e87-432a-9abe-66931deb838d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-803fecd9-1e87-432a-9abe-66931deb838d
Content-Type: application/json

--- request body ---
{"handle":"qa-71e11df3ca79","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-803fecd9-1e87-432a-9abe-66931deb838d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-803fecd9-1e87-432a-9abe-66931deb838d"}
```
