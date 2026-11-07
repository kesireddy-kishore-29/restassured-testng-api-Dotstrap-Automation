# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 387 | `qa-e6057b2d-3913-42ad-a8bf-4e51a7072c40` |
| 2 | `POST /v1/auth/token` | 200 | 35 | `qa-f789462a-0f0f-4dfe-a744-e0518bba4afe` |
| 3 | `GET /v1/admin/stats` | 403 | 40 | `qa-0b6a2647-8bf3-462e-8916-de49050985fa` |
| 4 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-c9c11b0b-5e63-49fb-895b-73418d82a1d3` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-9ca70516-cf42-45b3-bc1d-9c5f0cb4fb62` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e6057b2d-3913-42ad-a8bf-4e51a7072c40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6057b2d-3913-42ad-a8bf-4e51a7072c40
Content-Type: application/json

--- request body ---
{"handle":"qa-8525e918b33b","displayName":"QA 8525e918b33b","password":"****","region":"eu"}

--- response: 201 in 387 ms ---
Date: Wed, 04 Nov 2026 09:28:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6057b2d-3913-42ad-a8bf-4e51a7072c40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-8525e918b33b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ce4e887a-2cf6-43e4-b4bb-91f038170825","handle":"qa-8525e918b33b","displayName":"QA 8525e918b33b","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.271693030Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f789462a-0f0f-4dfe-a744-e0518bba4afe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f789462a-0f0f-4dfe-a744-e0518bba4afe
Content-Type: application/json

--- request body ---
{"handle":"qa-8525e918b33b","password":"****"}

--- response: 200 in 35 ms ---
Date: Wed, 04 Nov 2026 09:28:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-f789462a-0f0f-4dfe-a744-e0518bba4afe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce4e887a-2cf6-43e4-b4bb-91f038170825"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-0b6a2647-8bf3-462e-8916-de49050985fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b6a2647-8bf3-462e-8916-de49050985fa
Content-Type: application/json

--- response: 403 in 40 ms ---
Date: Wed, 04 Nov 2026 09:28:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b6a2647-8bf3-462e-8916-de49050985fa
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
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-0b6a2647-8bf3-462e-8916-de49050985fa"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c9c11b0b-5e63-49fb-895b-73418d82a1d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9c11b0b-5e63-49fb-895b-73418d82a1d3
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c9c11b0b-5e63-49fb-895b-73418d82a1d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9ca70516-cf42-45b3-bc1d-9c5f0cb4fb62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ca70516-cf42-45b3-bc1d-9c5f0cb4fb62
Content-Type: application/json

--- request body ---
{"handle":"qa-8525e918b33b","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ca70516-cf42-45b3-bc1d-9c5f0cb4fb62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9ca70516-cf42-45b3-bc1d-9c5f0cb4fb62"}
```
