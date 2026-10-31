# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 368 | `qa-3cdebec8-3382-4ff4-b172-ee5cebd7974e` |
| 2 | `POST /v1/auth/token` | 200 | 44 | `qa-6a204f7c-2e5c-493a-9dc2-b0e7589cb229` |
| 3 | `GET /v1/conversations/{id}` | 404 | 76 | `qa-27f7b0bd-77aa-4e5d-b938-f9df304d42bd` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 23 | `qa-1c80b1c9-b2a3-43f6-a7a3-41f03cec3a15` |
| 5 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-cd620b8f-405f-479c-a55b-311c1ad31790` |
| 6 | `POST /v1/auth/token` | 401 | 10 | `qa-5cdc2de0-fc66-407e-9a05-c123091bd40b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3cdebec8-3382-4ff4-b172-ee5cebd7974e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cdebec8-3382-4ff4-b172-ee5cebd7974e
Content-Type: application/json

--- request body ---
{"handle":"qa-c9afcc24c660","displayName":"QA c9afcc24c660","password":"****","region":"eu"}

--- response: 201 in 368 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cdebec8-3382-4ff4-b172-ee5cebd7974e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-c9afcc24c660
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d51c794-ea8b-4856-ada2-7e1a96ca539f","handle":"qa-c9afcc24c660","displayName":"QA c9afcc24c660","region":"eu","role":"user","createdAt":"2026-10-28T08:42:58.435526404Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6a204f7c-2e5c-493a-9dc2-b0e7589cb229

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a204f7c-2e5c-493a-9dc2-b0e7589cb229
Content-Type: application/json

--- request body ---
{"handle":"qa-c9afcc24c660","password":"****"}

--- response: 200 in 44 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a204f7c-2e5c-493a-9dc2-b0e7589cb229
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d51c794-ea8b-4856-ada2-7e1a96ca539f"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-27f7b0bd-77aa-4e5d-b938-f9df304d42bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27f7b0bd-77aa-4e5d-b938-f9df304d42bd
Content-Type: application/json

--- response: 404 in 76 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27f7b0bd-77aa-4e5d-b938-f9df304d42bd
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-27f7b0bd-77aa-4e5d-b938-f9df304d42bd"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-1c80b1c9-b2a3-43f6-a7a3-41f03cec3a15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c80b1c9-b2a3-43f6-a7a3-41f03cec3a15
Content-Type: application/json

--- response: 404 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c80b1c9-b2a3-43f6-a7a3-41f03cec3a15
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-1c80b1c9-b2a3-43f6-a7a3-41f03cec3a15"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd620b8f-405f-479c-a55b-311c1ad31790

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd620b8f-405f-479c-a55b-311c1ad31790
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd620b8f-405f-479c-a55b-311c1ad31790
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5cdc2de0-fc66-407e-9a05-c123091bd40b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cdc2de0-fc66-407e-9a05-c123091bd40b
Content-Type: application/json

--- request body ---
{"handle":"qa-c9afcc24c660","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5cdc2de0-fc66-407e-9a05-c123091bd40b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5cdc2de0-fc66-407e-9a05-c123091bd40b"}
```
