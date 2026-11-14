# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-9c3a5825-5bcc-437b-8f08-0c7a32d57edf` |
| 2 | `POST /v1/auth/token` | 200 | 24 | `qa-c09db54d-71c0-4d14-8ddc-ea62e3fb0b25` |
| 3 | `GET /v1/conversations/{id}` | 404 | 23 | `qa-db77d5af-75a2-42b0-aefd-b6aa5759eb6f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-6f131706-419e-4765-88af-1a68fca05565` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-fe25465c-f260-4479-aba8-3456bb328c2d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9c3a5825-5bcc-437b-8f08-0c7a32d57edf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c3a5825-5bcc-437b-8f08-0c7a32d57edf
Content-Type: application/json

--- request body ---
{"handle":"qa-b1a3d71e2487","displayName":"QA b1a3d71e2487","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c3a5825-5bcc-437b-8f08-0c7a32d57edf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 6
Location: /v1/accounts/qa-b1a3d71e2487
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b24730f3-8449-4bf8-b9be-9bd59ea71d40","handle":"qa-b1a3d71e2487","displayName":"QA b1a3d71e2487","region":"eu","role":"user","createdAt":"2026-11-11T09:34:39.472208719Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c09db54d-71c0-4d14-8ddc-ea62e3fb0b25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c09db54d-71c0-4d14-8ddc-ea62e3fb0b25
Content-Type: application/json

--- request body ---
{"handle":"qa-b1a3d71e2487","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-c09db54d-71c0-4d14-8ddc-ea62e3fb0b25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b24730f3-8449-4bf8-b9be-9bd59ea71d40"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-db77d5af-75a2-42b0-aefd-b6aa5759eb6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db77d5af-75a2-42b0-aefd-b6aa5759eb6f
Content-Type: application/json

--- response: 404 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db77d5af-75a2-42b0-aefd-b6aa5759eb6f
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-db77d5af-75a2-42b0-aefd-b6aa5759eb6f"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f131706-419e-4765-88af-1a68fca05565

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f131706-419e-4765-88af-1a68fca05565
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f131706-419e-4765-88af-1a68fca05565
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
correlation: qa-fe25465c-f260-4479-aba8-3456bb328c2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe25465c-f260-4479-aba8-3456bb328c2d
Content-Type: application/json

--- request body ---
{"handle":"qa-b1a3d71e2487","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe25465c-f260-4479-aba8-3456bb328c2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fe25465c-f260-4479-aba8-3456bb328c2d"}
```
