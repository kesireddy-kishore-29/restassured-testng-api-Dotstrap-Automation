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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-f93a3c0a-d49c-4ef5-8356-2f399837e2d8` |
| 2 | `POST /v1/auth/token` | 200 | 54 | `qa-70047856-73ab-4468-b677-7301f0a4d095` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 15 | `qa-7d263025-867c-40dc-9186-ddd9cfe61584` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-6e8c2133-b98b-444e-ab91-8857b91e62dc` |
| 5 | `POST /v1/auth/token` | 401 | 14 | `qa-86838f9e-cf55-4da0-81c4-10f3ffaed8c8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f93a3c0a-d49c-4ef5-8356-2f399837e2d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f93a3c0a-d49c-4ef5-8356-2f399837e2d8
Content-Type: application/json

--- request body ---
{"handle":"qa-b64750ffbcfe","displayName":"QA b64750ffbcfe","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-f93a3c0a-d49c-4ef5-8356-2f399837e2d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 6
Location: /v1/accounts/qa-b64750ffbcfe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_97acb8ef-2c06-4998-9f21-e5333dc3c269","handle":"qa-b64750ffbcfe","displayName":"QA b64750ffbcfe","region":"eu","role":"user","createdAt":"2026-11-11T09:34:39.459385270Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-70047856-73ab-4468-b677-7301f0a4d095

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70047856-73ab-4468-b677-7301f0a4d095
Content-Type: application/json

--- request body ---
{"handle":"qa-b64750ffbcfe","password":"****"}

--- response: 200 in 54 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-70047856-73ab-4468-b677-7301f0a4d095
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_97acb8ef-2c06-4998-9f21-e5333dc3c269"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-7d263025-867c-40dc-9186-ddd9cfe61584

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d263025-867c-40dc-9186-ddd9cfe61584
Content-Type: application/json

--- response: 404 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d263025-867c-40dc-9186-ddd9cfe61584
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-7d263025-867c-40dc-9186-ddd9cfe61584"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6e8c2133-b98b-444e-ab91-8857b91e62dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e8c2133-b98b-444e-ab91-8857b91e62dc
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6e8c2133-b98b-444e-ab91-8857b91e62dc
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
correlation: qa-86838f9e-cf55-4da0-81c4-10f3ffaed8c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86838f9e-cf55-4da0-81c4-10f3ffaed8c8
Content-Type: application/json

--- request body ---
{"handle":"qa-b64750ffbcfe","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-86838f9e-cf55-4da0-81c4-10f3ffaed8c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-86838f9e-cf55-4da0-81c4-10f3ffaed8c8"}
```
