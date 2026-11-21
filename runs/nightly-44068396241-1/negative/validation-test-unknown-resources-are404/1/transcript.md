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
| 1 | `POST /v1/accounts` | 201 | 296 | `qa-754aac7d-6ee3-44f3-862c-5db789dd7c43` |
| 2 | `POST /v1/auth/token` | 200 | 54 | `qa-f9383554-3664-4fc7-aef7-0584f8847ab4` |
| 3 | `GET /v1/conversations/{id}` | 404 | 67 | `qa-fcc06a72-d5c1-4da3-a317-7182c29bdba2` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 19 | `qa-94f16ef2-f2a2-4cf2-bcb3-302da1b0546b` |
| 5 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-b83ff5f7-e194-4b6c-83f6-d6c9a3f37e59` |
| 6 | `POST /v1/auth/token` | 401 | 20 | `qa-efb121cb-ceb5-4607-b28e-b338481ac2f0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-754aac7d-6ee3-44f3-862c-5db789dd7c43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-754aac7d-6ee3-44f3-862c-5db789dd7c43
Content-Type: application/json

--- request body ---
{"handle":"qa-53fdf587a9d3","displayName":"QA 53fdf587a9d3","password":"****","region":"eu"}

--- response: 201 in 296 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-754aac7d-6ee3-44f3-862c-5db789dd7c43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-53fdf587a9d3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_afa0d0c6-a972-41a6-bd13-099bccbe1715","handle":"qa-53fdf587a9d3","displayName":"QA 53fdf587a9d3","region":"eu","role":"user","createdAt":"2026-11-17T10:50:10.508460216Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f9383554-3664-4fc7-aef7-0584f8847ab4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9383554-3664-4fc7-aef7-0584f8847ab4
Content-Type: application/json

--- request body ---
{"handle":"qa-53fdf587a9d3","password":"****"}

--- response: 200 in 54 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9383554-3664-4fc7-aef7-0584f8847ab4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_afa0d0c6-a972-41a6-bd13-099bccbe1715"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-fcc06a72-d5c1-4da3-a317-7182c29bdba2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcc06a72-d5c1-4da3-a317-7182c29bdba2
Content-Type: application/json

--- response: 404 in 67 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fcc06a72-d5c1-4da3-a317-7182c29bdba2
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-fcc06a72-d5c1-4da3-a317-7182c29bdba2"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-94f16ef2-f2a2-4cf2-bcb3-302da1b0546b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94f16ef2-f2a2-4cf2-bcb3-302da1b0546b
Content-Type: application/json

--- response: 404 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94f16ef2-f2a2-4cf2-bcb3-302da1b0546b
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-94f16ef2-f2a2-4cf2-bcb3-302da1b0546b"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b83ff5f7-e194-4b6c-83f6-d6c9a3f37e59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b83ff5f7-e194-4b6c-83f6-d6c9a3f37e59
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b83ff5f7-e194-4b6c-83f6-d6c9a3f37e59
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
correlation: qa-efb121cb-ceb5-4607-b28e-b338481ac2f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efb121cb-ceb5-4607-b28e-b338481ac2f0
Content-Type: application/json

--- request body ---
{"handle":"qa-53fdf587a9d3","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-efb121cb-ceb5-4607-b28e-b338481ac2f0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-efb121cb-ceb5-4607-b28e-b338481ac2f0"}
```
