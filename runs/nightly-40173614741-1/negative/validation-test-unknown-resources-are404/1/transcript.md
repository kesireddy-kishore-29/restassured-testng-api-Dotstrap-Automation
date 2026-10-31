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
| 1 | `POST /v1/accounts` | 201 | 493 | `qa-4c1215dd-520b-45d1-8d24-cc01d580cd66` |
| 2 | `POST /v1/auth/token` | 200 | 96 | `qa-f32d11a8-df40-4ccb-8852-45874cbcf539` |
| 3 | `GET /v1/conversations/{id}` | 404 | 131 | `qa-47cc9019-0bf3-47c3-958e-bcd639370d5d` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 39 | `qa-5ba36d6d-6def-4486-b1b8-8fcf454ce545` |
| 5 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-50d033b2-1960-4c81-8091-f3d0f32c4c5a` |
| 6 | `POST /v1/auth/token` | 401 | 14 | `qa-fa5dc1cf-8180-491e-bc9f-b8ee1f753fb0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4c1215dd-520b-45d1-8d24-cc01d580cd66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c1215dd-520b-45d1-8d24-cc01d580cd66
Content-Type: application/json

--- request body ---
{"handle":"qa-cdfc26910d4c","displayName":"QA cdfc26910d4c","password":"****","region":"eu"}

--- response: 201 in 493 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c1215dd-520b-45d1-8d24-cc01d580cd66
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
Location: /v1/accounts/qa-cdfc26910d4c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1c284605-5a3b-4ed8-a90e-72149bef458f","handle":"qa-cdfc26910d4c","displayName":"QA cdfc26910d4c","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.263748039Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f32d11a8-df40-4ccb-8852-45874cbcf539

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f32d11a8-df40-4ccb-8852-45874cbcf539
Content-Type: application/json

--- request body ---
{"handle":"qa-cdfc26910d4c","password":"****"}

--- response: 200 in 96 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f32d11a8-df40-4ccb-8852-45874cbcf539
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1c284605-5a3b-4ed8-a90e-72149bef458f"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-47cc9019-0bf3-47c3-958e-bcd639370d5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47cc9019-0bf3-47c3-958e-bcd639370d5d
Content-Type: application/json

--- response: 404 in 131 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47cc9019-0bf3-47c3-958e-bcd639370d5d
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-47cc9019-0bf3-47c3-958e-bcd639370d5d"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-5ba36d6d-6def-4486-b1b8-8fcf454ce545

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ba36d6d-6def-4486-b1b8-8fcf454ce545
Content-Type: application/json

--- response: 404 in 39 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ba36d6d-6def-4486-b1b8-8fcf454ce545
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-5ba36d6d-6def-4486-b1b8-8fcf454ce545"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-50d033b2-1960-4c81-8091-f3d0f32c4c5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50d033b2-1960-4c81-8091-f3d0f32c4c5a
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-50d033b2-1960-4c81-8091-f3d0f32c4c5a
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
correlation: qa-fa5dc1cf-8180-491e-bc9f-b8ee1f753fb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa5dc1cf-8180-491e-bc9f-b8ee1f753fb0
Content-Type: application/json

--- request body ---
{"handle":"qa-cdfc26910d4c","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa5dc1cf-8180-491e-bc9f-b8ee1f753fb0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fa5dc1cf-8180-491e-bc9f-b8ee1f753fb0"}
```
