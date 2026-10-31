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
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-46d3c919-38e3-4854-9e90-229e075d9a37` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-1aa0c7dc-1688-459a-9dfd-677debf2d11d` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 36 | `qa-210bbf36-7c37-440b-8dd0-4f5be1436dca` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-f0bb5827-283e-4dac-926c-beaea1674ad6` |
| 5 | `POST /v1/auth/token` | 401 | 16 | `qa-a9e9a0e5-fc85-4ab2-b296-402b79e75b5c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-46d3c919-38e3-4854-9e90-229e075d9a37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46d3c919-38e3-4854-9e90-229e075d9a37
Content-Type: application/json

--- request body ---
{"handle":"qa-bbbae52134ee","displayName":"QA bbbae52134ee","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-46d3c919-38e3-4854-9e90-229e075d9a37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 6
Location: /v1/accounts/qa-bbbae52134ee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_41d9fbd9-1575-4fc3-a3a7-71843b3f3c1c","handle":"qa-bbbae52134ee","displayName":"QA bbbae52134ee","region":"eu","role":"user","createdAt":"2026-10-27T08:00:36.173490580Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1aa0c7dc-1688-459a-9dfd-677debf2d11d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1aa0c7dc-1688-459a-9dfd-677debf2d11d
Content-Type: application/json

--- request body ---
{"handle":"qa-bbbae52134ee","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1aa0c7dc-1688-459a-9dfd-677debf2d11d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_41d9fbd9-1575-4fc3-a3a7-71843b3f3c1c"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-210bbf36-7c37-440b-8dd0-4f5be1436dca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-210bbf36-7c37-440b-8dd0-4f5be1436dca
Content-Type: application/json

--- response: 404 in 36 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-210bbf36-7c37-440b-8dd0-4f5be1436dca
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-210bbf36-7c37-440b-8dd0-4f5be1436dca"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f0bb5827-283e-4dac-926c-beaea1674ad6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0bb5827-283e-4dac-926c-beaea1674ad6
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f0bb5827-283e-4dac-926c-beaea1674ad6
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
correlation: qa-a9e9a0e5-fc85-4ab2-b296-402b79e75b5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9e9a0e5-fc85-4ab2-b296-402b79e75b5c
Content-Type: application/json

--- request body ---
{"handle":"qa-bbbae52134ee","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9e9a0e5-fc85-4ab2-b296-402b79e75b5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a9e9a0e5-fc85-4ab2-b296-402b79e75b5c"}
```
