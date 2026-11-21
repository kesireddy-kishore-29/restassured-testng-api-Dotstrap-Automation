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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-3ec821f0-8001-4720-afb3-b760fc6ae71d` |
| 2 | `POST /v1/auth/token` | 200 | 24 | `qa-799557c6-7e3e-43bf-8cf8-82d64f0bd5bd` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 17 | `qa-2a7bb1e0-4c41-4ad5-b436-0337c2202609` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-513b5851-b907-4691-81d4-7cdf9e38a236` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-afb4a2af-54bf-4aa7-96e3-f78d5b2e8a7d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3ec821f0-8001-4720-afb3-b760fc6ae71d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ec821f0-8001-4720-afb3-b760fc6ae71d
Content-Type: application/json

--- request body ---
{"handle":"qa-bbdb8111334d","displayName":"QA bbdb8111334d","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ec821f0-8001-4720-afb3-b760fc6ae71d
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
Location: /v1/accounts/qa-bbdb8111334d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_406f419d-6f08-4b5b-b554-4fc30f5eccef","handle":"qa-bbdb8111334d","displayName":"QA bbdb8111334d","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.816533388Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-799557c6-7e3e-43bf-8cf8-82d64f0bd5bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-799557c6-7e3e-43bf-8cf8-82d64f0bd5bd
Content-Type: application/json

--- request body ---
{"handle":"qa-bbdb8111334d","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-799557c6-7e3e-43bf-8cf8-82d64f0bd5bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_406f419d-6f08-4b5b-b554-4fc30f5eccef"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-2a7bb1e0-4c41-4ad5-b436-0337c2202609

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a7bb1e0-4c41-4ad5-b436-0337c2202609
Content-Type: application/json

--- response: 404 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a7bb1e0-4c41-4ad5-b436-0337c2202609
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-2a7bb1e0-4c41-4ad5-b436-0337c2202609"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-513b5851-b907-4691-81d4-7cdf9e38a236

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-513b5851-b907-4691-81d4-7cdf9e38a236
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-513b5851-b907-4691-81d4-7cdf9e38a236
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
correlation: qa-afb4a2af-54bf-4aa7-96e3-f78d5b2e8a7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afb4a2af-54bf-4aa7-96e3-f78d5b2e8a7d
Content-Type: application/json

--- request body ---
{"handle":"qa-bbdb8111334d","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-afb4a2af-54bf-4aa7-96e3-f78d5b2e8a7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-afb4a2af-54bf-4aa7-96e3-f78d5b2e8a7d"}
```
