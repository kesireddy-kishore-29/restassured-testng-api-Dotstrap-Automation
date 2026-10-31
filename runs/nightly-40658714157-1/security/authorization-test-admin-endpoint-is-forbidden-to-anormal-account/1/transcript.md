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
| 1 | `POST /v1/accounts` | 201 | 456 | `qa-71b43d7b-840b-47bb-bea4-cec10d09534c` |
| 2 | `POST /v1/auth/token` | 200 | 57 | `qa-e27713ea-bd7a-48f9-ba92-6cc4a8cd14a5` |
| 3 | `GET /v1/admin/stats` | 403 | 53 | `qa-eab4491e-d7b5-4d67-a5b8-99abd0a8092f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-209cb930-db52-4c38-b18f-a34d9411885f` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-68367efb-7ece-441c-937a-f22c401e4161` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-71b43d7b-840b-47bb-bea4-cec10d09534c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71b43d7b-840b-47bb-bea4-cec10d09534c
Content-Type: application/json

--- request body ---
{"handle":"qa-8c3e2cf02576","displayName":"QA 8c3e2cf02576","password":"****","region":"eu"}

--- response: 201 in 456 ms ---
Date: Wed, 28 Oct 2026 08:42:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-71b43d7b-840b-47bb-bea4-cec10d09534c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-8c3e2cf02576
X-Served-Region: eu
Content-Length: 181

{"id":"acc_98d4e8e8-2d20-48b2-9f4d-0affcb40ff74","handle":"qa-8c3e2cf02576","displayName":"QA 8c3e2cf02576","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.814803197Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e27713ea-bd7a-48f9-ba92-6cc4a8cd14a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e27713ea-bd7a-48f9-ba92-6cc4a8cd14a5
Content-Type: application/json

--- request body ---
{"handle":"qa-8c3e2cf02576","password":"****"}

--- response: 200 in 57 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e27713ea-bd7a-48f9-ba92-6cc4a8cd14a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_98d4e8e8-2d20-48b2-9f4d-0affcb40ff74"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-eab4491e-d7b5-4d67-a5b8-99abd0a8092f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eab4491e-d7b5-4d67-a5b8-99abd0a8092f
Content-Type: application/json

--- response: 403 in 53 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eab4491e-d7b5-4d67-a5b8-99abd0a8092f
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-eab4491e-d7b5-4d67-a5b8-99abd0a8092f"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-209cb930-db52-4c38-b18f-a34d9411885f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-209cb930-db52-4c38-b18f-a34d9411885f
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-209cb930-db52-4c38-b18f-a34d9411885f
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
correlation: qa-68367efb-7ece-441c-937a-f22c401e4161

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68367efb-7ece-441c-937a-f22c401e4161
Content-Type: application/json

--- request body ---
{"handle":"qa-8c3e2cf02576","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68367efb-7ece-441c-937a-f22c401e4161
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-68367efb-7ece-441c-937a-f22c401e4161"}
```
