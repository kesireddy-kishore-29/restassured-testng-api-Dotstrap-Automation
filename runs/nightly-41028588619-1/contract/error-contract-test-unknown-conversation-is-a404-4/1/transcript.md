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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-bccd4681-39f1-4cdf-96f3-ecbf8ca60fef` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-c928d0ab-1f29-4559-945b-dc67cf4c963e` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 10 | `qa-e5c27dd9-37bf-436a-b421-3d897cc496f6` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-576be6cc-7078-45a2-9ce7-ea620c4054e0` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-965d67a0-9de9-42f4-9b13-bb90fda9e9ae` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bccd4681-39f1-4cdf-96f3-ecbf8ca60fef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bccd4681-39f1-4cdf-96f3-ecbf8ca60fef
Content-Type: application/json

--- request body ---
{"handle":"qa-d36f0f0a4e48","displayName":"QA d36f0f0a4e48","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-bccd4681-39f1-4cdf-96f3-ecbf8ca60fef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 5
Location: /v1/accounts/qa-d36f0f0a4e48
X-Served-Region: eu
Content-Length: 181

{"id":"acc_10ac6c78-9091-4103-b2a4-fd0fd9843482","handle":"qa-d36f0f0a4e48","displayName":"QA d36f0f0a4e48","region":"eu","role":"user","createdAt":"2026-10-30T08:46:06.374724664Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c928d0ab-1f29-4559-945b-dc67cf4c963e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c928d0ab-1f29-4559-945b-dc67cf4c963e
Content-Type: application/json

--- request body ---
{"handle":"qa-d36f0f0a4e48","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-c928d0ab-1f29-4559-945b-dc67cf4c963e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_10ac6c78-9091-4103-b2a4-fd0fd9843482"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-e5c27dd9-37bf-436a-b421-3d897cc496f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5c27dd9-37bf-436a-b421-3d897cc496f6
Content-Type: application/json

--- response: 404 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5c27dd9-37bf-436a-b421-3d897cc496f6
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-e5c27dd9-37bf-436a-b421-3d897cc496f6"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-576be6cc-7078-45a2-9ce7-ea620c4054e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-576be6cc-7078-45a2-9ce7-ea620c4054e0
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-576be6cc-7078-45a2-9ce7-ea620c4054e0
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
correlation: qa-965d67a0-9de9-42f4-9b13-bb90fda9e9ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-965d67a0-9de9-42f4-9b13-bb90fda9e9ae
Content-Type: application/json

--- request body ---
{"handle":"qa-d36f0f0a4e48","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-965d67a0-9de9-42f4-9b13-bb90fda9e9ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-965d67a0-9de9-42f4-9b13-bb90fda9e9ae"}
```
