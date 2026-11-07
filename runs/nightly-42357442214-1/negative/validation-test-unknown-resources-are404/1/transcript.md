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
| 1 | `POST /v1/accounts` | 201 | 332 | `qa-ff3838aa-d406-4a6c-97f5-efe17e856929` |
| 2 | `POST /v1/auth/token` | 200 | 30 | `qa-29506cf4-96bf-480d-bb0e-0b7e1d5d53e9` |
| 3 | `GET /v1/conversations/{id}` | 404 | 80 | `qa-96976812-0cb5-4783-9848-8265918049e4` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 13 | `qa-01996463-495b-44be-b4d1-528f5408bfea` |
| 5 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-d0748276-449d-4c20-9dc6-9ea6b8076d28` |
| 6 | `POST /v1/auth/token` | 401 | 13 | `qa-749a0e61-7a4a-4c67-b111-d4e046d7ede1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ff3838aa-d406-4a6c-97f5-efe17e856929

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff3838aa-d406-4a6c-97f5-efe17e856929
Content-Type: application/json

--- request body ---
{"handle":"qa-845e8b85db30","displayName":"QA 845e8b85db30","password":"****","region":"eu"}

--- response: 201 in 332 ms ---
Date: Sat, 07 Nov 2026 08:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff3838aa-d406-4a6c-97f5-efe17e856929
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
Location: /v1/accounts/qa-845e8b85db30
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88c8a04e-8647-452b-8419-ad1e669eed6b","handle":"qa-845e8b85db30","displayName":"QA 845e8b85db30","region":"eu","role":"user","createdAt":"2026-11-07T08:54:55.298229502Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-29506cf4-96bf-480d-bb0e-0b7e1d5d53e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29506cf4-96bf-480d-bb0e-0b7e1d5d53e9
Content-Type: application/json

--- request body ---
{"handle":"qa-845e8b85db30","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 07 Nov 2026 08:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-29506cf4-96bf-480d-bb0e-0b7e1d5d53e9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_88c8a04e-8647-452b-8419-ad1e669eed6b"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-96976812-0cb5-4783-9848-8265918049e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96976812-0cb5-4783-9848-8265918049e4
Content-Type: application/json

--- response: 404 in 80 ms ---
Date: Sat, 07 Nov 2026 08:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96976812-0cb5-4783-9848-8265918049e4
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-96976812-0cb5-4783-9848-8265918049e4"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-01996463-495b-44be-b4d1-528f5408bfea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01996463-495b-44be-b4d1-528f5408bfea
Content-Type: application/json

--- response: 404 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01996463-495b-44be-b4d1-528f5408bfea
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-01996463-495b-44be-b4d1-528f5408bfea"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d0748276-449d-4c20-9dc6-9ea6b8076d28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0748276-449d-4c20-9dc6-9ea6b8076d28
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d0748276-449d-4c20-9dc6-9ea6b8076d28
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
correlation: qa-749a0e61-7a4a-4c67-b111-d4e046d7ede1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-749a0e61-7a4a-4c67-b111-d4e046d7ede1
Content-Type: application/json

--- request body ---
{"handle":"qa-845e8b85db30","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-749a0e61-7a4a-4c67-b111-d4e046d7ede1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-749a0e61-7a4a-4c67-b111-d4e046d7ede1"}
```
