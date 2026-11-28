# Transcript: A new display name is stored and returned

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#displayNameChangeIsPersisted` |
| Features | FEAT-ACCT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 450 | `qa-3411a6f5-6714-4bbe-99aa-266bf606b304` |
| 2 | `POST /v1/auth/token` | 200 | 76 | `qa-afb04c97-3d08-4f08-8a2b-d0312fcbbfa6` |
| 3 | `PATCH /v1/accounts/me` | 200 | 49 | `qa-44aec45e-81af-4823-be57-9666cafcebde` |
| 4 | `GET /v1/accounts/me` | 200 | 11 | `qa-eaa40505-90ad-4c5c-a57e-53fc7a7a8245` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-34a079b2-a2cd-44e0-8c7d-ed6f8f56092e` |
| 6 | `POST /v1/auth/token` | 401 | 39 | `qa-1cf18301-c098-45fa-8118-847dc13c7307` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3411a6f5-6714-4bbe-99aa-266bf606b304

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3411a6f5-6714-4bbe-99aa-266bf606b304
Content-Type: application/json

--- request body ---
{"handle":"qa-36f56aecb2f6","displayName":"QA 36f56aecb2f6","password":"****","region":"eu"}

--- response: 201 in 450 ms ---
Date: Tue, 24 Nov 2026 12:38:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3411a6f5-6714-4bbe-99aa-266bf606b304
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-36f56aecb2f6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_138f0355-3732-4ac8-998a-e2eb48b6e914","handle":"qa-36f56aecb2f6","displayName":"QA 36f56aecb2f6","region":"eu","role":"user","createdAt":"2026-11-24T12:38:04.027248696Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-afb04c97-3d08-4f08-8a2b-d0312fcbbfa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afb04c97-3d08-4f08-8a2b-d0312fcbbfa6
Content-Type: application/json

--- request body ---
{"handle":"qa-36f56aecb2f6","password":"****"}

--- response: 200 in 76 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-afb04c97-3d08-4f08-8a2b-d0312fcbbfa6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_138f0355-3732-4ac8-998a-e2eb48b6e914"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-44aec45e-81af-4823-be57-9666cafcebde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44aec45e-81af-4823-be57-9666cafcebde
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 49 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-44aec45e-81af-4823-be57-9666cafcebde
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
Content-Length: 179

{"id":"acc_138f0355-3732-4ac8-998a-e2eb48b6e914","handle":"qa-36f56aecb2f6","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-24T12:38:04.027248696Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-eaa40505-90ad-4c5c-a57e-53fc7a7a8245

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaa40505-90ad-4c5c-a57e-53fc7a7a8245
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaa40505-90ad-4c5c-a57e-53fc7a7a8245
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
Content-Length: 179

{"id":"acc_138f0355-3732-4ac8-998a-e2eb48b6e914","handle":"qa-36f56aecb2f6","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-24T12:38:04.027248696Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-34a079b2-a2cd-44e0-8c7d-ed6f8f56092e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34a079b2-a2cd-44e0-8c7d-ed6f8f56092e
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-34a079b2-a2cd-44e0-8c7d-ed6f8f56092e
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
correlation: qa-1cf18301-c098-45fa-8118-847dc13c7307

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cf18301-c098-45fa-8118-847dc13c7307
Content-Type: application/json

--- request body ---
{"handle":"qa-36f56aecb2f6","password":"****"}

--- response: 401 in 39 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1cf18301-c098-45fa-8118-847dc13c7307
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1cf18301-c098-45fa-8118-847dc13c7307"}
```
