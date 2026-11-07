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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-75865151-887c-4b0a-bb36-29c4d6b0fac0` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-731fa2d1-9a5f-4159-8d32-7d11e445c7ec` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 20 | `qa-a49d6f1f-e339-43cd-b6b2-a3d22efc72fb` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-16ea0346-d0da-4a02-908c-a3bbab968a8d` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-ef406820-24fc-48d8-b92a-5c73aa48c2d8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-75865151-887c-4b0a-bb36-29c4d6b0fac0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75865151-887c-4b0a-bb36-29c4d6b0fac0
Content-Type: application/json

--- request body ---
{"handle":"qa-75f55dfb769a","displayName":"QA 75f55dfb769a","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-75865151-887c-4b0a-bb36-29c4d6b0fac0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 7
Location: /v1/accounts/qa-75f55dfb769a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c9c42ad9-3351-448d-958b-b51957355480","handle":"qa-75f55dfb769a","displayName":"QA 75f55dfb769a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.951890134Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-731fa2d1-9a5f-4159-8d32-7d11e445c7ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-731fa2d1-9a5f-4159-8d32-7d11e445c7ec
Content-Type: application/json

--- request body ---
{"handle":"qa-75f55dfb769a","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-731fa2d1-9a5f-4159-8d32-7d11e445c7ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c9c42ad9-3351-448d-958b-b51957355480"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-a49d6f1f-e339-43cd-b6b2-a3d22efc72fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a49d6f1f-e339-43cd-b6b2-a3d22efc72fb
Content-Type: application/json

--- response: 404 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a49d6f1f-e339-43cd-b6b2-a3d22efc72fb
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-a49d6f1f-e339-43cd-b6b2-a3d22efc72fb"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-16ea0346-d0da-4a02-908c-a3bbab968a8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16ea0346-d0da-4a02-908c-a3bbab968a8d
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-16ea0346-d0da-4a02-908c-a3bbab968a8d
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
correlation: qa-ef406820-24fc-48d8-b92a-5c73aa48c2d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef406820-24fc-48d8-b92a-5c73aa48c2d8
Content-Type: application/json

--- request body ---
{"handle":"qa-75f55dfb769a","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef406820-24fc-48d8-b92a-5c73aa48c2d8
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ef406820-24fc-48d8-b92a-5c73aa48c2d8"}
```
