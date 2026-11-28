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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-253500ec-a1cc-4988-8861-028c9643402f` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-db0f190a-0b98-4f99-b06f-3852fcb8c7a5` |
| 3 | `GET /v1/conversations/{id}` | 404 | 14 | `qa-fad0e70e-3df5-4878-bcb9-d188a7177c51` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 13 | `qa-610afb0c-59d2-4300-af5a-c19f5b1f8d92` |
| 5 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-56ec7e44-3630-4e4f-ad58-c739d5a60d82` |
| 6 | `POST /v1/auth/token` | 401 | 20 | `qa-d519644a-ee92-4f42-996f-205e24365498` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-253500ec-a1cc-4988-8861-028c9643402f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-253500ec-a1cc-4988-8861-028c9643402f
Content-Type: application/json

--- request body ---
{"handle":"qa-33c88f96d965","displayName":"QA 33c88f96d965","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-253500ec-a1cc-4988-8861-028c9643402f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Location: /v1/accounts/qa-33c88f96d965
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f38fdaf0-bd83-4b63-9587-ea0ce3436ed7","handle":"qa-33c88f96d965","displayName":"QA 33c88f96d965","region":"eu","role":"user","createdAt":"2026-11-25T11:28:07.125041489Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-db0f190a-0b98-4f99-b06f-3852fcb8c7a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db0f190a-0b98-4f99-b06f-3852fcb8c7a5
Content-Type: application/json

--- request body ---
{"handle":"qa-33c88f96d965","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-db0f190a-0b98-4f99-b06f-3852fcb8c7a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f38fdaf0-bd83-4b63-9587-ea0ce3436ed7"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-fad0e70e-3df5-4878-bcb9-d188a7177c51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fad0e70e-3df5-4878-bcb9-d188a7177c51
Content-Type: application/json

--- response: 404 in 14 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fad0e70e-3df5-4878-bcb9-d188a7177c51
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-fad0e70e-3df5-4878-bcb9-d188a7177c51"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-610afb0c-59d2-4300-af5a-c19f5b1f8d92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-610afb0c-59d2-4300-af5a-c19f5b1f8d92
Content-Type: application/json

--- response: 404 in 13 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-610afb0c-59d2-4300-af5a-c19f5b1f8d92
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-610afb0c-59d2-4300-af5a-c19f5b1f8d92"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-56ec7e44-3630-4e4f-ad58-c739d5a60d82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56ec7e44-3630-4e4f-ad58-c739d5a60d82
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-56ec7e44-3630-4e4f-ad58-c739d5a60d82
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
correlation: qa-d519644a-ee92-4f42-996f-205e24365498

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d519644a-ee92-4f42-996f-205e24365498
Content-Type: application/json

--- request body ---
{"handle":"qa-33c88f96d965","password":"****"}

--- response: 401 in 20 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d519644a-ee92-4f42-996f-205e24365498
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d519644a-ee92-4f42-996f-205e24365498"}
```
