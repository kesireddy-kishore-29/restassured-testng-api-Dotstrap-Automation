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
| 1 | `POST /v1/accounts` | 201 | 389 | `qa-bcf8fbff-e14f-4405-9ab6-bb3b8ac140d8` |
| 2 | `POST /v1/auth/token` | 200 | 54 | `qa-b230ea01-a12e-484f-8f8c-9cdea714343b` |
| 3 | `GET /v1/conversations/{id}` | 404 | 49 | `qa-1a5dda2e-42be-49f3-b82a-a9cdd9a6723f` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 28 | `qa-2a46b02d-236e-4152-afb7-010d98ebf0d0` |
| 5 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-656248e1-51ac-42fa-ad80-00ae94b4f861` |
| 6 | `POST /v1/auth/token` | 401 | 13 | `qa-3a5ddaf5-b015-492e-a588-0c178e07ff70` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bcf8fbff-e14f-4405-9ab6-bb3b8ac140d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcf8fbff-e14f-4405-9ab6-bb3b8ac140d8
Content-Type: application/json

--- request body ---
{"handle":"qa-ca286b5e9430","displayName":"QA ca286b5e9430","password":"****","region":"eu"}

--- response: 201 in 389 ms ---
Date: Mon, 09 Nov 2026 09:55:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcf8fbff-e14f-4405-9ab6-bb3b8ac140d8
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
Location: /v1/accounts/qa-ca286b5e9430
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c343ccf7-7492-4259-9f0c-806275e6a0fd","handle":"qa-ca286b5e9430","displayName":"QA ca286b5e9430","region":"eu","role":"user","createdAt":"2026-11-09T09:55:55.523672495Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b230ea01-a12e-484f-8f8c-9cdea714343b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b230ea01-a12e-484f-8f8c-9cdea714343b
Content-Type: application/json

--- request body ---
{"handle":"qa-ca286b5e9430","password":"****"}

--- response: 200 in 54 ms ---
Date: Mon, 09 Nov 2026 09:55:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-b230ea01-a12e-484f-8f8c-9cdea714343b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c343ccf7-7492-4259-9f0c-806275e6a0fd"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-1a5dda2e-42be-49f3-b82a-a9cdd9a6723f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a5dda2e-42be-49f3-b82a-a9cdd9a6723f
Content-Type: application/json

--- response: 404 in 49 ms ---
Date: Mon, 09 Nov 2026 09:55:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a5dda2e-42be-49f3-b82a-a9cdd9a6723f
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-1a5dda2e-42be-49f3-b82a-a9cdd9a6723f"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-2a46b02d-236e-4152-afb7-010d98ebf0d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a46b02d-236e-4152-afb7-010d98ebf0d0
Content-Type: application/json

--- response: 404 in 28 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a46b02d-236e-4152-afb7-010d98ebf0d0
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-2a46b02d-236e-4152-afb7-010d98ebf0d0"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-656248e1-51ac-42fa-ad80-00ae94b4f861

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-656248e1-51ac-42fa-ad80-00ae94b4f861
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-656248e1-51ac-42fa-ad80-00ae94b4f861
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
correlation: qa-3a5ddaf5-b015-492e-a588-0c178e07ff70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a5ddaf5-b015-492e-a588-0c178e07ff70
Content-Type: application/json

--- request body ---
{"handle":"qa-ca286b5e9430","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a5ddaf5-b015-492e-a588-0c178e07ff70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3a5ddaf5-b015-492e-a588-0c178e07ff70"}
```
