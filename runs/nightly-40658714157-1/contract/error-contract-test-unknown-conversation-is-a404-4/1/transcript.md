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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-cb7b3b90-681b-491c-898b-040bb2d7d5ee` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-ebca3280-d86d-431d-89cf-1a1961a1817e` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 14 | `qa-1a241f1c-586f-4c68-a464-ab8ecd2c505c` |
| 4 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-5874b6a0-50c9-40ba-89cb-81eddb92f061` |
| 5 | `POST /v1/auth/token` | 401 | 3 | `qa-8b1896a0-8f07-4e95-9031-76c00e4582b6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cb7b3b90-681b-491c-898b-040bb2d7d5ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb7b3b90-681b-491c-898b-040bb2d7d5ee
Content-Type: application/json

--- request body ---
{"handle":"qa-ca94c3d3f62b","displayName":"QA ca94c3d3f62b","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb7b3b90-681b-491c-898b-040bb2d7d5ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 7
Location: /v1/accounts/qa-ca94c3d3f62b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aa99169b-b4e1-4a00-ba0f-53c4ceb2206f","handle":"qa-ca94c3d3f62b","displayName":"QA ca94c3d3f62b","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.726779952Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ebca3280-d86d-431d-89cf-1a1961a1817e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebca3280-d86d-431d-89cf-1a1961a1817e
Content-Type: application/json

--- request body ---
{"handle":"qa-ca94c3d3f62b","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebca3280-d86d-431d-89cf-1a1961a1817e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aa99169b-b4e1-4a00-ba0f-53c4ceb2206f"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-1a241f1c-586f-4c68-a464-ab8ecd2c505c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a241f1c-586f-4c68-a464-ab8ecd2c505c
Content-Type: application/json

--- response: 404 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a241f1c-586f-4c68-a464-ab8ecd2c505c
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-1a241f1c-586f-4c68-a464-ab8ecd2c505c"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5874b6a0-50c9-40ba-89cb-81eddb92f061

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5874b6a0-50c9-40ba-89cb-81eddb92f061
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5874b6a0-50c9-40ba-89cb-81eddb92f061
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
correlation: qa-8b1896a0-8f07-4e95-9031-76c00e4582b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b1896a0-8f07-4e95-9031-76c00e4582b6
Content-Type: application/json

--- request body ---
{"handle":"qa-ca94c3d3f62b","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b1896a0-8f07-4e95-9031-76c00e4582b6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8b1896a0-8f07-4e95-9031-76c00e4582b6"}
```
