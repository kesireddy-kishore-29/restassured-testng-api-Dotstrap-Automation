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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-bc4e9695-d0e5-4917-823c-9cc8b81879f8` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-0e92421f-30c6-4a15-981e-cbb7e5c4f2b7` |
| 3 | `GET /v1/conversations/{id}` | 404 | 42 | `qa-093adf0b-4126-45af-bc04-6ad1682ef4f0` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 33 | `qa-0579b736-75df-4536-9c11-aa81ce97f6db` |
| 5 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-0f73a11b-cb65-41fb-aaf1-416e2248f2d0` |
| 6 | `POST /v1/auth/token` | 401 | 24 | `qa-0fbcf314-73af-48f1-a0ae-443e358d1d6d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bc4e9695-d0e5-4917-823c-9cc8b81879f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc4e9695-d0e5-4917-823c-9cc8b81879f8
Content-Type: application/json

--- request body ---
{"handle":"qa-fc6c4347e02f","displayName":"QA fc6c4347e02f","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc4e9695-d0e5-4917-823c-9cc8b81879f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Location: /v1/accounts/qa-fc6c4347e02f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_90bd1a5a-74ba-4ad8-a219-0a9f16aa9a97","handle":"qa-fc6c4347e02f","displayName":"QA fc6c4347e02f","region":"eu","role":"user","createdAt":"2026-11-22T09:54:51.285673917Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0e92421f-30c6-4a15-981e-cbb7e5c4f2b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e92421f-30c6-4a15-981e-cbb7e5c4f2b7
Content-Type: application/json

--- request body ---
{"handle":"qa-fc6c4347e02f","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e92421f-30c6-4a15-981e-cbb7e5c4f2b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_90bd1a5a-74ba-4ad8-a219-0a9f16aa9a97"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-093adf0b-4126-45af-bc04-6ad1682ef4f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-093adf0b-4126-45af-bc04-6ad1682ef4f0
Content-Type: application/json

--- response: 404 in 42 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-093adf0b-4126-45af-bc04-6ad1682ef4f0
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-093adf0b-4126-45af-bc04-6ad1682ef4f0"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-0579b736-75df-4536-9c11-aa81ce97f6db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0579b736-75df-4536-9c11-aa81ce97f6db
Content-Type: application/json

--- response: 404 in 33 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0579b736-75df-4536-9c11-aa81ce97f6db
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-0579b736-75df-4536-9c11-aa81ce97f6db"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f73a11b-cb65-41fb-aaf1-416e2248f2d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f73a11b-cb65-41fb-aaf1-416e2248f2d0
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f73a11b-cb65-41fb-aaf1-416e2248f2d0
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
correlation: qa-0fbcf314-73af-48f1-a0ae-443e358d1d6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fbcf314-73af-48f1-a0ae-443e358d1d6d
Content-Type: application/json

--- request body ---
{"handle":"qa-fc6c4347e02f","password":"****"}

--- response: 401 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0fbcf314-73af-48f1-a0ae-443e358d1d6d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0fbcf314-73af-48f1-a0ae-443e358d1d6d"}
```
