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
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-6f213ac9-5f54-4fbc-8a3c-8c26d2b9ed06` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-d1fb5b12-4117-4408-ad37-be4cf9c7474a` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 2 | `qa-0beebc2d-6cc7-4376-9992-bd36693d9799` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-f2a9d59a-0c32-4cf1-9d7d-8db413453126` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-37e01d39-8084-4734-a6c9-a189e11af231` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6f213ac9-5f54-4fbc-8a3c-8c26d2b9ed06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f213ac9-5f54-4fbc-8a3c-8c26d2b9ed06
Content-Type: application/json

--- request body ---
{"handle":"qa-7b9059e074e1","displayName":"QA 7b9059e074e1","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f213ac9-5f54-4fbc-8a3c-8c26d2b9ed06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 8
Location: /v1/accounts/qa-7b9059e074e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b4834491-0999-4235-b21a-203753112763","handle":"qa-7b9059e074e1","displayName":"QA 7b9059e074e1","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.849977270Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d1fb5b12-4117-4408-ad37-be4cf9c7474a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1fb5b12-4117-4408-ad37-be4cf9c7474a
Content-Type: application/json

--- request body ---
{"handle":"qa-7b9059e074e1","password":"****"}

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1fb5b12-4117-4408-ad37-be4cf9c7474a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b4834491-0999-4235-b21a-203753112763"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-0beebc2d-6cc7-4376-9992-bd36693d9799

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0beebc2d-6cc7-4376-9992-bd36693d9799
Content-Type: application/json

--- response: 404 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0beebc2d-6cc7-4376-9992-bd36693d9799
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-0beebc2d-6cc7-4376-9992-bd36693d9799"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f2a9d59a-0c32-4cf1-9d7d-8db413453126

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2a9d59a-0c32-4cf1-9d7d-8db413453126
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f2a9d59a-0c32-4cf1-9d7d-8db413453126
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
correlation: qa-37e01d39-8084-4734-a6c9-a189e11af231

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37e01d39-8084-4734-a6c9-a189e11af231
Content-Type: application/json

--- request body ---
{"handle":"qa-7b9059e074e1","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37e01d39-8084-4734-a6c9-a189e11af231
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-37e01d39-8084-4734-a6c9-a189e11af231"}
```
