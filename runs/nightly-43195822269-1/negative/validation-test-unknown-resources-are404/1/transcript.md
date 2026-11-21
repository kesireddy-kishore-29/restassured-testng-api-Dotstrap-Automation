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
| 1 | `POST /v1/accounts` | 201 | 501 | `qa-0e6e339f-51af-4ece-b90b-8b698f47bfb9` |
| 2 | `POST /v1/auth/token` | 200 | 65 | `qa-9f0ac378-d9cf-47e3-8409-def4f2135dec` |
| 3 | `GET /v1/conversations/{id}` | 404 | 59 | `qa-1d46402e-bc4d-4d50-9a9b-460574fbdfb8` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 40 | `qa-ba78917a-a712-4214-8ad9-ce05cfaf05fd` |
| 5 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-60c1772f-e511-45f8-8ba5-db5de9a68f29` |
| 6 | `POST /v1/auth/token` | 401 | 20 | `qa-ebd3d521-79f1-46b7-9ce4-cd5d2d1310dc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0e6e339f-51af-4ece-b90b-8b698f47bfb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e6e339f-51af-4ece-b90b-8b698f47bfb9
Content-Type: application/json

--- request body ---
{"handle":"qa-8c36e4e31891","displayName":"QA 8c36e4e31891","password":"****","region":"eu"}

--- response: 201 in 501 ms ---
Date: Thu, 12 Nov 2026 09:56:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e6e339f-51af-4ece-b90b-8b698f47bfb9
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
Location: /v1/accounts/qa-8c36e4e31891
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e1c6372-6482-41a9-ba45-ae060b683384","handle":"qa-8c36e4e31891","displayName":"QA 8c36e4e31891","region":"eu","role":"user","createdAt":"2026-11-12T09:56:40.725557644Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9f0ac378-d9cf-47e3-8409-def4f2135dec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f0ac378-d9cf-47e3-8409-def4f2135dec
Content-Type: application/json

--- request body ---
{"handle":"qa-8c36e4e31891","password":"****"}

--- response: 200 in 65 ms ---
Date: Thu, 12 Nov 2026 09:56:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f0ac378-d9cf-47e3-8409-def4f2135dec
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e1c6372-6482-41a9-ba45-ae060b683384"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-1d46402e-bc4d-4d50-9a9b-460574fbdfb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d46402e-bc4d-4d50-9a9b-460574fbdfb8
Content-Type: application/json

--- response: 404 in 59 ms ---
Date: Thu, 12 Nov 2026 09:56:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d46402e-bc4d-4d50-9a9b-460574fbdfb8
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-1d46402e-bc4d-4d50-9a9b-460574fbdfb8"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-ba78917a-a712-4214-8ad9-ce05cfaf05fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba78917a-a712-4214-8ad9-ce05cfaf05fd
Content-Type: application/json

--- response: 404 in 40 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba78917a-a712-4214-8ad9-ce05cfaf05fd
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-ba78917a-a712-4214-8ad9-ce05cfaf05fd"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-60c1772f-e511-45f8-8ba5-db5de9a68f29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60c1772f-e511-45f8-8ba5-db5de9a68f29
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-60c1772f-e511-45f8-8ba5-db5de9a68f29
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
correlation: qa-ebd3d521-79f1-46b7-9ce4-cd5d2d1310dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebd3d521-79f1-46b7-9ce4-cd5d2d1310dc
Content-Type: application/json

--- request body ---
{"handle":"qa-8c36e4e31891","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ebd3d521-79f1-46b7-9ce4-cd5d2d1310dc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ebd3d521-79f1-46b7-9ce4-cd5d2d1310dc"}
```
