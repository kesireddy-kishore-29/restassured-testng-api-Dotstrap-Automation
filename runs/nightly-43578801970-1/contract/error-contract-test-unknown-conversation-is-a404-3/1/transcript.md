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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-22af8c8e-d91e-4c9e-9b3f-2224b8f659e1` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-8f8560b3-11cf-4508-b16c-fa9d6a84172b` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 15 | `qa-f5fd39fd-92d0-459b-96cf-df7964b8dfc0` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-60a326bc-1cd7-4316-9b8f-4b43465afc2b` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-800371c7-1834-44b4-94ec-5ad6bf83d6ad` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-22af8c8e-d91e-4c9e-9b3f-2224b8f659e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22af8c8e-d91e-4c9e-9b3f-2224b8f659e1
Content-Type: application/json

--- request body ---
{"handle":"qa-900bd19c4aa0","displayName":"QA 900bd19c4aa0","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-22af8c8e-d91e-4c9e-9b3f-2224b8f659e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 6
Location: /v1/accounts/qa-900bd19c4aa0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bc78c393-dc3f-48da-ac1a-b868d0033915","handle":"qa-900bd19c4aa0","displayName":"QA 900bd19c4aa0","region":"eu","role":"user","createdAt":"2026-11-14T09:05:13.035127022Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8f8560b3-11cf-4508-b16c-fa9d6a84172b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f8560b3-11cf-4508-b16c-fa9d6a84172b
Content-Type: application/json

--- request body ---
{"handle":"qa-900bd19c4aa0","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f8560b3-11cf-4508-b16c-fa9d6a84172b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bc78c393-dc3f-48da-ac1a-b868d0033915"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-f5fd39fd-92d0-459b-96cf-df7964b8dfc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5fd39fd-92d0-459b-96cf-df7964b8dfc0
Content-Type: application/json

--- response: 404 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5fd39fd-92d0-459b-96cf-df7964b8dfc0
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-f5fd39fd-92d0-459b-96cf-df7964b8dfc0"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-60a326bc-1cd7-4316-9b8f-4b43465afc2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60a326bc-1cd7-4316-9b8f-4b43465afc2b
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-60a326bc-1cd7-4316-9b8f-4b43465afc2b
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
correlation: qa-800371c7-1834-44b4-94ec-5ad6bf83d6ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-800371c7-1834-44b4-94ec-5ad6bf83d6ad
Content-Type: application/json

--- request body ---
{"handle":"qa-900bd19c4aa0","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-800371c7-1834-44b4-94ec-5ad6bf83d6ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-800371c7-1834-44b4-94ec-5ad6bf83d6ad"}
```
