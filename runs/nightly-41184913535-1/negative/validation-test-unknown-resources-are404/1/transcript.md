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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-18e161d0-7d64-41c8-b053-66170ff4754c` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-d8f7d66c-1d85-4721-89b2-41643f3fb5a7` |
| 3 | `GET /v1/conversations/{id}` | 404 | 20 | `qa-80045d46-57d5-47ab-936b-63476d58c82a` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 31 | `qa-27fe2313-97a0-47d0-b595-e6a8d4d12d4c` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-4278e2f3-497a-4bb4-8a45-80411de8c4b6` |
| 6 | `POST /v1/auth/token` | 401 | 12 | `qa-3d2c17dc-b75a-4798-a318-7a5dc72d1270` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-18e161d0-7d64-41c8-b053-66170ff4754c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18e161d0-7d64-41c8-b053-66170ff4754c
Content-Type: application/json

--- request body ---
{"handle":"qa-cc932d6379a5","displayName":"QA cc932d6379a5","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-18e161d0-7d64-41c8-b053-66170ff4754c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Location: /v1/accounts/qa-cc932d6379a5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8e9be7de-885a-47cb-aefe-1cd53eb99f0a","handle":"qa-cc932d6379a5","displayName":"QA cc932d6379a5","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.838241380Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d8f7d66c-1d85-4721-89b2-41643f3fb5a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8f7d66c-1d85-4721-89b2-41643f3fb5a7
Content-Type: application/json

--- request body ---
{"handle":"qa-cc932d6379a5","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8f7d66c-1d85-4721-89b2-41643f3fb5a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e9be7de-885a-47cb-aefe-1cd53eb99f0a"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-80045d46-57d5-47ab-936b-63476d58c82a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80045d46-57d5-47ab-936b-63476d58c82a
Content-Type: application/json

--- response: 404 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80045d46-57d5-47ab-936b-63476d58c82a
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-80045d46-57d5-47ab-936b-63476d58c82a"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-27fe2313-97a0-47d0-b595-e6a8d4d12d4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27fe2313-97a0-47d0-b595-e6a8d4d12d4c
Content-Type: application/json

--- response: 404 in 31 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27fe2313-97a0-47d0-b595-e6a8d4d12d4c
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-27fe2313-97a0-47d0-b595-e6a8d4d12d4c"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4278e2f3-497a-4bb4-8a45-80411de8c4b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4278e2f3-497a-4bb4-8a45-80411de8c4b6
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4278e2f3-497a-4bb4-8a45-80411de8c4b6
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
correlation: qa-3d2c17dc-b75a-4798-a318-7a5dc72d1270

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d2c17dc-b75a-4798-a318-7a5dc72d1270
Content-Type: application/json

--- request body ---
{"handle":"qa-cc932d6379a5","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d2c17dc-b75a-4798-a318-7a5dc72d1270
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d2c17dc-b75a-4798-a318-7a5dc72d1270"}
```
