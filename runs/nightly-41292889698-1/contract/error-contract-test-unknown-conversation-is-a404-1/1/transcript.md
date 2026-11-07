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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-e4de19c8-37cf-492d-b211-ee65543ec0bb` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-87fcb710-3f81-48ad-850c-c2fcbe06c423` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 32 | `qa-453f3713-711d-45dd-bb7a-74bf5b5a22c7` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-9a460e99-ac03-4df5-9d52-996b3f184086` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-12334d6d-03f1-49c1-99a5-c7fcfe04aea8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e4de19c8-37cf-492d-b211-ee65543ec0bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4de19c8-37cf-492d-b211-ee65543ec0bb
Content-Type: application/json

--- request body ---
{"handle":"qa-aca38307eca7","displayName":"QA aca38307eca7","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4de19c8-37cf-492d-b211-ee65543ec0bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 6
Location: /v1/accounts/qa-aca38307eca7
X-Served-Region: eu
Content-Length: 178

{"id":"acc_ee2a2d2d-2739-4365-be39-e6b5d7321d1b","handle":"qa-aca38307eca7","displayName":"QA aca38307eca7","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.320383Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-87fcb710-3f81-48ad-850c-c2fcbe06c423

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87fcb710-3f81-48ad-850c-c2fcbe06c423
Content-Type: application/json

--- request body ---
{"handle":"qa-aca38307eca7","password":"****"}

--- response: 200 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-87fcb710-3f81-48ad-850c-c2fcbe06c423
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ee2a2d2d-2739-4365-be39-e6b5d7321d1b"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-453f3713-711d-45dd-bb7a-74bf5b5a22c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-453f3713-711d-45dd-bb7a-74bf5b5a22c7
Content-Type: application/json

--- response: 404 in 32 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-453f3713-711d-45dd-bb7a-74bf5b5a22c7
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-453f3713-711d-45dd-bb7a-74bf5b5a22c7"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9a460e99-ac03-4df5-9d52-996b3f184086

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a460e99-ac03-4df5-9d52-996b3f184086
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9a460e99-ac03-4df5-9d52-996b3f184086
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
correlation: qa-12334d6d-03f1-49c1-99a5-c7fcfe04aea8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12334d6d-03f1-49c1-99a5-c7fcfe04aea8
Content-Type: application/json

--- request body ---
{"handle":"qa-aca38307eca7","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12334d6d-03f1-49c1-99a5-c7fcfe04aea8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12334d6d-03f1-49c1-99a5-c7fcfe04aea8"}
```
