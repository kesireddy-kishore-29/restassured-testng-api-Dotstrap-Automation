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
| 1 | `POST /v1/accounts` | 201 | 497 | `qa-9d2c676d-9d85-488d-948c-d834deb525ae` |
| 2 | `POST /v1/auth/token` | 200 | 79 | `qa-0cd4ab88-4cb3-4ad7-95d3-64c8aba3c187` |
| 3 | `GET /v1/conversations/{id}` | 404 | 71 | `qa-fbba81a7-a225-4fcf-9d1d-434f1623bf5d` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 29 | `qa-058d1a1c-e039-46c6-83d0-a9d56990da9c` |
| 5 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-3708bc12-5a2f-4111-b511-75a8ad7b1f81` |
| 6 | `POST /v1/auth/token` | 401 | 11 | `qa-0ee1f413-3422-4dbe-9c41-d5aace5eee8a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9d2c676d-9d85-488d-948c-d834deb525ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d2c676d-9d85-488d-948c-d834deb525ae
Content-Type: application/json

--- request body ---
{"handle":"qa-db4a377e929d","displayName":"QA db4a377e929d","password":"****","region":"eu"}

--- response: 201 in 497 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d2c676d-9d85-488d-948c-d834deb525ae
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
Location: /v1/accounts/qa-db4a377e929d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_13db5929-2ead-40f8-8917-375679edc689","handle":"qa-db4a377e929d","displayName":"QA db4a377e929d","region":"eu","role":"user","createdAt":"2026-11-04T09:28:13.342233243Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0cd4ab88-4cb3-4ad7-95d3-64c8aba3c187

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cd4ab88-4cb3-4ad7-95d3-64c8aba3c187
Content-Type: application/json

--- request body ---
{"handle":"qa-db4a377e929d","password":"****"}

--- response: 200 in 79 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cd4ab88-4cb3-4ad7-95d3-64c8aba3c187
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_13db5929-2ead-40f8-8917-375679edc689"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-fbba81a7-a225-4fcf-9d1d-434f1623bf5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbba81a7-a225-4fcf-9d1d-434f1623bf5d
Content-Type: application/json

--- response: 404 in 71 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fbba81a7-a225-4fcf-9d1d-434f1623bf5d
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-fbba81a7-a225-4fcf-9d1d-434f1623bf5d"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-058d1a1c-e039-46c6-83d0-a9d56990da9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-058d1a1c-e039-46c6-83d0-a9d56990da9c
Content-Type: application/json

--- response: 404 in 29 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-058d1a1c-e039-46c6-83d0-a9d56990da9c
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-058d1a1c-e039-46c6-83d0-a9d56990da9c"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3708bc12-5a2f-4111-b511-75a8ad7b1f81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3708bc12-5a2f-4111-b511-75a8ad7b1f81
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3708bc12-5a2f-4111-b511-75a8ad7b1f81
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
correlation: qa-0ee1f413-3422-4dbe-9c41-d5aace5eee8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ee1f413-3422-4dbe-9c41-d5aace5eee8a
Content-Type: application/json

--- request body ---
{"handle":"qa-db4a377e929d","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ee1f413-3422-4dbe-9c41-d5aace5eee8a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0ee1f413-3422-4dbe-9c41-d5aace5eee8a"}
```
