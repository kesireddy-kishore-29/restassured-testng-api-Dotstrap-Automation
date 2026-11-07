# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-061a46aa-c7d0-45de-9360-c7f285f785dd` |
| 2 | `POST /v1/auth/token` | 200 | 34 | `qa-fcd0d12a-4eb9-46f5-a653-72df9550a3a8` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 17 | `qa-45c301a6-c354-4e4a-9db5-360ebf1cb5b1` |
| 4 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-f4aff707-310b-441a-8aa9-7482a01d2444` |
| 5 | `POST /v1/auth/token` | 401 | 16 | `qa-61f24a81-446c-4f42-be0b-dde914c9a27f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-061a46aa-c7d0-45de-9360-c7f285f785dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-061a46aa-c7d0-45de-9360-c7f285f785dd
Content-Type: application/json

--- request body ---
{"handle":"qa-ad6356e4b72f","displayName":"QA ad6356e4b72f","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-061a46aa-c7d0-45de-9360-c7f285f785dd
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
Location: /v1/accounts/qa-ad6356e4b72f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30ffa8e6-2e9c-40c8-9c08-422a424f95cb","handle":"qa-ad6356e4b72f","displayName":"QA ad6356e4b72f","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.143275933Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fcd0d12a-4eb9-46f5-a653-72df9550a3a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcd0d12a-4eb9-46f5-a653-72df9550a3a8
Content-Type: application/json

--- request body ---
{"handle":"qa-ad6356e4b72f","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcd0d12a-4eb9-46f5-a653-72df9550a3a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30ffa8e6-2e9c-40c8-9c08-422a424f95cb"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-45c301a6-c354-4e4a-9db5-360ebf1cb5b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45c301a6-c354-4e4a-9db5-360ebf1cb5b1
Content-Type: application/json

--- response: 404 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-45c301a6-c354-4e4a-9db5-360ebf1cb5b1
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-45c301a6-c354-4e4a-9db5-360ebf1cb5b1"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f4aff707-310b-441a-8aa9-7482a01d2444

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4aff707-310b-441a-8aa9-7482a01d2444
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f4aff707-310b-441a-8aa9-7482a01d2444
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
correlation: qa-61f24a81-446c-4f42-be0b-dde914c9a27f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61f24a81-446c-4f42-be0b-dde914c9a27f
Content-Type: application/json

--- request body ---
{"handle":"qa-ad6356e4b72f","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61f24a81-446c-4f42-be0b-dde914c9a27f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61f24a81-446c-4f42-be0b-dde914c9a27f"}
```
