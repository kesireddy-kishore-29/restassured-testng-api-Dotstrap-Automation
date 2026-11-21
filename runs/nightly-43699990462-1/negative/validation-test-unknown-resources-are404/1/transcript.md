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
| 1 | `POST /v1/accounts` | 201 | 373 | `qa-e636d698-1967-4b55-bc07-41a57c7f1698` |
| 2 | `POST /v1/auth/token` | 200 | 47 | `qa-7042cf80-b582-4db2-adbd-84a79fd16af2` |
| 3 | `GET /v1/conversations/{id}` | 404 | 55 | `qa-31232f62-0052-4d61-89f5-1f0dbde723fe` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 29 | `qa-4c6d4123-6937-468e-a205-3b968cc8cc94` |
| 5 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-ba771bb3-6bbc-425a-9931-57026007c836` |
| 6 | `POST /v1/auth/token` | 401 | 9 | `qa-e10a7498-c92d-42e3-9c9f-8912c1105bae` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e636d698-1967-4b55-bc07-41a57c7f1698

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e636d698-1967-4b55-bc07-41a57c7f1698
Content-Type: application/json

--- request body ---
{"handle":"qa-f0826f79c7fa","displayName":"QA f0826f79c7fa","password":"****","region":"eu"}

--- response: 201 in 373 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-e636d698-1967-4b55-bc07-41a57c7f1698
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
Location: /v1/accounts/qa-f0826f79c7fa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c7f3dc42-fd8c-4708-abd3-12e0fe7c402d","handle":"qa-f0826f79c7fa","displayName":"QA f0826f79c7fa","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.495829708Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7042cf80-b582-4db2-adbd-84a79fd16af2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7042cf80-b582-4db2-adbd-84a79fd16af2
Content-Type: application/json

--- request body ---
{"handle":"qa-f0826f79c7fa","password":"****"}

--- response: 200 in 47 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7042cf80-b582-4db2-adbd-84a79fd16af2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c7f3dc42-fd8c-4708-abd3-12e0fe7c402d"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-31232f62-0052-4d61-89f5-1f0dbde723fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31232f62-0052-4d61-89f5-1f0dbde723fe
Content-Type: application/json

--- response: 404 in 55 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31232f62-0052-4d61-89f5-1f0dbde723fe
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-31232f62-0052-4d61-89f5-1f0dbde723fe"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-4c6d4123-6937-468e-a205-3b968cc8cc94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c6d4123-6937-468e-a205-3b968cc8cc94
Content-Type: application/json

--- response: 404 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c6d4123-6937-468e-a205-3b968cc8cc94
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-4c6d4123-6937-468e-a205-3b968cc8cc94"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ba771bb3-6bbc-425a-9931-57026007c836

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba771bb3-6bbc-425a-9931-57026007c836
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ba771bb3-6bbc-425a-9931-57026007c836
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
correlation: qa-e10a7498-c92d-42e3-9c9f-8912c1105bae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e10a7498-c92d-42e3-9c9f-8912c1105bae
Content-Type: application/json

--- request body ---
{"handle":"qa-f0826f79c7fa","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e10a7498-c92d-42e3-9c9f-8912c1105bae
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e10a7498-c92d-42e3-9c9f-8912c1105bae"}
```
