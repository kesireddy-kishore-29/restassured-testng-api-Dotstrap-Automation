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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-99c98291-3a58-49ca-a959-9656e4f24b00` |
| 2 | `POST /v1/auth/token` | 200 | 29 | `qa-b3d93b93-96d2-498f-a8c3-69aa2d6f6891` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 37 | `qa-e6fa8221-7e27-4019-b84f-8838a612a71a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-bce8ede6-8cbf-4b0e-9877-3743ff0f24d4` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-19d5fa14-0a48-40a8-8e56-72e9369d2a6d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-99c98291-3a58-49ca-a959-9656e4f24b00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99c98291-3a58-49ca-a959-9656e4f24b00
Content-Type: application/json

--- request body ---
{"handle":"qa-f13ea8071294","displayName":"QA f13ea8071294","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-99c98291-3a58-49ca-a959-9656e4f24b00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 6
Location: /v1/accounts/qa-f13ea8071294
X-Served-Region: eu
Content-Length: 181

{"id":"acc_13454c89-0f05-456a-b68c-8e46b18050ec","handle":"qa-f13ea8071294","displayName":"QA f13ea8071294","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.785394084Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b3d93b93-96d2-498f-a8c3-69aa2d6f6891

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3d93b93-96d2-498f-a8c3-69aa2d6f6891
Content-Type: application/json

--- request body ---
{"handle":"qa-f13ea8071294","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3d93b93-96d2-498f-a8c3-69aa2d6f6891
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_13454c89-0f05-456a-b68c-8e46b18050ec"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-e6fa8221-7e27-4019-b84f-8838a612a71a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6fa8221-7e27-4019-b84f-8838a612a71a
Content-Type: application/json

--- response: 404 in 37 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e6fa8221-7e27-4019-b84f-8838a612a71a
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-e6fa8221-7e27-4019-b84f-8838a612a71a"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bce8ede6-8cbf-4b0e-9877-3743ff0f24d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bce8ede6-8cbf-4b0e-9877-3743ff0f24d4
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bce8ede6-8cbf-4b0e-9877-3743ff0f24d4
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
correlation: qa-19d5fa14-0a48-40a8-8e56-72e9369d2a6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19d5fa14-0a48-40a8-8e56-72e9369d2a6d
Content-Type: application/json

--- request body ---
{"handle":"qa-f13ea8071294","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19d5fa14-0a48-40a8-8e56-72e9369d2a6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-19d5fa14-0a48-40a8-8e56-72e9369d2a6d"}
```
