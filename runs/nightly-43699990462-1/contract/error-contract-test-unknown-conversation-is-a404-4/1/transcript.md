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
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-f1c4d676-3434-4cf6-892b-bb33a0af1d1b` |
| 2 | `POST /v1/auth/token` | 200 | 5 | `qa-0b2f889a-f37c-4189-ba72-2e96cd79f354` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 2 | `qa-7fcb01ad-0b22-4fdc-8898-795023ccd5db` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-0202d059-fc8d-4b75-a068-786e7a98b659` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-2e21bad7-b5da-4495-ad64-594ec8beb564` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f1c4d676-3434-4cf6-892b-bb33a0af1d1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1c4d676-3434-4cf6-892b-bb33a0af1d1b
Content-Type: application/json

--- request body ---
{"handle":"qa-643f6811f90f","displayName":"QA 643f6811f90f","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1c4d676-3434-4cf6-892b-bb33a0af1d1b
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
Location: /v1/accounts/qa-643f6811f90f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f649bd6b-0e05-451b-800f-9bb21dcdc0c2","handle":"qa-643f6811f90f","displayName":"QA 643f6811f90f","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.982666597Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0b2f889a-f37c-4189-ba72-2e96cd79f354

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b2f889a-f37c-4189-ba72-2e96cd79f354
Content-Type: application/json

--- request body ---
{"handle":"qa-643f6811f90f","password":"****"}

--- response: 200 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b2f889a-f37c-4189-ba72-2e96cd79f354
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f649bd6b-0e05-451b-800f-9bb21dcdc0c2"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-7fcb01ad-0b22-4fdc-8898-795023ccd5db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fcb01ad-0b22-4fdc-8898-795023ccd5db
Content-Type: application/json

--- response: 404 in 2 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7fcb01ad-0b22-4fdc-8898-795023ccd5db
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-7fcb01ad-0b22-4fdc-8898-795023ccd5db"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0202d059-fc8d-4b75-a068-786e7a98b659

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0202d059-fc8d-4b75-a068-786e7a98b659
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0202d059-fc8d-4b75-a068-786e7a98b659
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
correlation: qa-2e21bad7-b5da-4495-ad64-594ec8beb564

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e21bad7-b5da-4495-ad64-594ec8beb564
Content-Type: application/json

--- request body ---
{"handle":"qa-643f6811f90f","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e21bad7-b5da-4495-ad64-594ec8beb564
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2e21bad7-b5da-4495-ad64-594ec8beb564"}
```
