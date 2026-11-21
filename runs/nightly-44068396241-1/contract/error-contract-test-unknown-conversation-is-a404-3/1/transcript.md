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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-94c486b0-b150-4550-991a-45e39a73e8be` |
| 2 | `POST /v1/auth/token` | 200 | 7 | `qa-6f17d98b-8f94-420e-810b-c65f862535ad` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 10 | `qa-b3d519f9-368e-4234-a338-e1782174f8a7` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-fa90533b-e286-4f65-9290-6e7bbfd9dce0` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-c543c64e-c834-4f13-a293-35d9fd4fb65a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-94c486b0-b150-4550-991a-45e39a73e8be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94c486b0-b150-4550-991a-45e39a73e8be
Content-Type: application/json

--- request body ---
{"handle":"qa-f9684d9bc924","displayName":"QA f9684d9bc924","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-94c486b0-b150-4550-991a-45e39a73e8be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Location: /v1/accounts/qa-f9684d9bc924
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bd99ffa5-dcff-4b85-8fa6-2c569ac4a22c","handle":"qa-f9684d9bc924","displayName":"QA f9684d9bc924","region":"eu","role":"user","createdAt":"2026-11-17T10:50:20.314560791Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6f17d98b-8f94-420e-810b-c65f862535ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f17d98b-8f94-420e-810b-c65f862535ad
Content-Type: application/json

--- request body ---
{"handle":"qa-f9684d9bc924","password":"****"}

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f17d98b-8f94-420e-810b-c65f862535ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bd99ffa5-dcff-4b85-8fa6-2c569ac4a22c"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-b3d519f9-368e-4234-a338-e1782174f8a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3d519f9-368e-4234-a338-e1782174f8a7
Content-Type: application/json

--- response: 404 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b3d519f9-368e-4234-a338-e1782174f8a7
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-b3d519f9-368e-4234-a338-e1782174f8a7"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa90533b-e286-4f65-9290-6e7bbfd9dce0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa90533b-e286-4f65-9290-6e7bbfd9dce0
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa90533b-e286-4f65-9290-6e7bbfd9dce0
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
correlation: qa-c543c64e-c834-4f13-a293-35d9fd4fb65a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c543c64e-c834-4f13-a293-35d9fd4fb65a
Content-Type: application/json

--- request body ---
{"handle":"qa-f9684d9bc924","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c543c64e-c834-4f13-a293-35d9fd4fb65a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c543c64e-c834-4f13-a293-35d9fd4fb65a"}
```
