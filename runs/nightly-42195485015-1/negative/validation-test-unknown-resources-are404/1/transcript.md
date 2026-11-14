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
| 1 | `POST /v1/accounts` | 201 | 422 | `qa-34e530b6-f3a0-4f8e-9e0e-03294dfb8f11` |
| 2 | `POST /v1/auth/token` | 200 | 52 | `qa-a8cab93a-5e68-4c31-a470-cabb1002e2e4` |
| 3 | `GET /v1/conversations/{id}` | 404 | 55 | `qa-3fc12446-d7d7-4d8d-a429-bb958fbf8bc5` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 13 | `qa-5dd6a631-9763-4d84-9606-98cba069c2d8` |
| 5 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-cf6ab7a6-b5c3-407e-abc0-10bc0c5934fa` |
| 6 | `POST /v1/auth/token` | 401 | 12 | `qa-1bce2478-0afc-4fc6-a6e9-f3c63830d0b5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-34e530b6-f3a0-4f8e-9e0e-03294dfb8f11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34e530b6-f3a0-4f8e-9e0e-03294dfb8f11
Content-Type: application/json

--- request body ---
{"handle":"qa-ef279646eaa4","displayName":"QA ef279646eaa4","password":"****","region":"eu"}

--- response: 201 in 422 ms ---
Date: Fri, 06 Nov 2026 09:30:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-34e530b6-f3a0-4f8e-9e0e-03294dfb8f11
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
Location: /v1/accounts/qa-ef279646eaa4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e51f09b5-0285-45fc-8f40-f73bc75f52be","handle":"qa-ef279646eaa4","displayName":"QA ef279646eaa4","region":"eu","role":"user","createdAt":"2026-11-06T09:30:28.194034870Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a8cab93a-5e68-4c31-a470-cabb1002e2e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8cab93a-5e68-4c31-a470-cabb1002e2e4
Content-Type: application/json

--- request body ---
{"handle":"qa-ef279646eaa4","password":"****"}

--- response: 200 in 52 ms ---
Date: Fri, 06 Nov 2026 09:30:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8cab93a-5e68-4c31-a470-cabb1002e2e4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e51f09b5-0285-45fc-8f40-f73bc75f52be"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-3fc12446-d7d7-4d8d-a429-bb958fbf8bc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fc12446-d7d7-4d8d-a429-bb958fbf8bc5
Content-Type: application/json

--- response: 404 in 55 ms ---
Date: Fri, 06 Nov 2026 09:30:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3fc12446-d7d7-4d8d-a429-bb958fbf8bc5
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-3fc12446-d7d7-4d8d-a429-bb958fbf8bc5"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-5dd6a631-9763-4d84-9606-98cba069c2d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dd6a631-9763-4d84-9606-98cba069c2d8
Content-Type: application/json

--- response: 404 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5dd6a631-9763-4d84-9606-98cba069c2d8
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-5dd6a631-9763-4d84-9606-98cba069c2d8"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf6ab7a6-b5c3-407e-abc0-10bc0c5934fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf6ab7a6-b5c3-407e-abc0-10bc0c5934fa
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf6ab7a6-b5c3-407e-abc0-10bc0c5934fa
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
correlation: qa-1bce2478-0afc-4fc6-a6e9-f3c63830d0b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bce2478-0afc-4fc6-a6e9-f3c63830d0b5
Content-Type: application/json

--- request body ---
{"handle":"qa-ef279646eaa4","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1bce2478-0afc-4fc6-a6e9-f3c63830d0b5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1bce2478-0afc-4fc6-a6e9-f3c63830d0b5"}
```
