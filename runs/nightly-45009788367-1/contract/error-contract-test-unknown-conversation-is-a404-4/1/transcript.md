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
| 1 | `POST /v1/accounts` | 201 | 6 | `qa-2c20b266-26aa-44b7-b308-5efb52a7d13d` |
| 2 | `POST /v1/auth/token` | 200 | 6 | `qa-53850c3e-d5d3-474c-ad3a-d3d76ae63eef` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 2 | `qa-09891a1b-07d3-4b61-8cb8-cc8d28a809e4` |
| 4 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-384a0580-3348-4d54-b76b-33c684f90a22` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-62a31fdb-27a4-4be7-8e3e-244c0d4a6521` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2c20b266-26aa-44b7-b308-5efb52a7d13d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c20b266-26aa-44b7-b308-5efb52a7d13d
Content-Type: application/json

--- request body ---
{"handle":"qa-f1070e6060b2","displayName":"QA f1070e6060b2","password":"****","region":"eu"}

--- response: 201 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c20b266-26aa-44b7-b308-5efb52a7d13d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 7
Location: /v1/accounts/qa-f1070e6060b2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_38a8e649-49f6-4b82-93cd-64f9b6d5eca5","handle":"qa-f1070e6060b2","displayName":"QA f1070e6060b2","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.740872121Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-53850c3e-d5d3-474c-ad3a-d3d76ae63eef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53850c3e-d5d3-474c-ad3a-d3d76ae63eef
Content-Type: application/json

--- request body ---
{"handle":"qa-f1070e6060b2","password":"****"}

--- response: 200 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-53850c3e-d5d3-474c-ad3a-d3d76ae63eef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_38a8e649-49f6-4b82-93cd-64f9b6d5eca5"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-09891a1b-07d3-4b61-8cb8-cc8d28a809e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09891a1b-07d3-4b61-8cb8-cc8d28a809e4
Content-Type: application/json

--- response: 404 in 2 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09891a1b-07d3-4b61-8cb8-cc8d28a809e4
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-09891a1b-07d3-4b61-8cb8-cc8d28a809e4"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-384a0580-3348-4d54-b76b-33c684f90a22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-384a0580-3348-4d54-b76b-33c684f90a22
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-384a0580-3348-4d54-b76b-33c684f90a22
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
correlation: qa-62a31fdb-27a4-4be7-8e3e-244c0d4a6521

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62a31fdb-27a4-4be7-8e3e-244c0d4a6521
Content-Type: application/json

--- request body ---
{"handle":"qa-f1070e6060b2","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62a31fdb-27a4-4be7-8e3e-244c0d4a6521
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-62a31fdb-27a4-4be7-8e3e-244c0d4a6521"}
```
