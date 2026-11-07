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
| 1 | `POST /v1/accounts` | 201 | 338 | `qa-e248f3f2-ba62-478d-bea2-ed317c9ca89f` |
| 2 | `POST /v1/auth/token` | 200 | 56 | `qa-8c61b4a0-1702-4516-b48c-1f7ce7cf0665` |
| 3 | `PATCH /v1/accounts/me` | 200 | 40 | `qa-c275b122-3efa-449c-987a-d334be39b7ea` |
| 4 | `GET /v1/accounts/me` | 200 | 13 | `qa-b85b36f2-49fb-419e-af86-2cdd4e8451ec` |
| 5 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-88071387-ae28-4889-b6c5-22e51767a6c8` |
| 6 | `POST /v1/auth/token` | 401 | 22 | `qa-920645c5-3643-4158-9080-203f4e492a73` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e248f3f2-ba62-478d-bea2-ed317c9ca89f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e248f3f2-ba62-478d-bea2-ed317c9ca89f
Content-Type: application/json

--- request body ---
{"handle":"qa-b45e96e6f139","displayName":"QA b45e96e6f139","password":"****","region":"eu"}

--- response: 201 in 338 ms ---
Date: Mon, 02 Nov 2026 09:39:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e248f3f2-ba62-478d-bea2-ed317c9ca89f
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
Location: /v1/accounts/qa-b45e96e6f139
X-Served-Region: eu
Content-Length: 181

{"id":"acc_75942c50-064e-4d53-9327-67782fdc26e8","handle":"qa-b45e96e6f139","displayName":"QA b45e96e6f139","region":"eu","role":"user","createdAt":"2026-11-02T09:39:10.480966685Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8c61b4a0-1702-4516-b48c-1f7ce7cf0665

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c61b4a0-1702-4516-b48c-1f7ce7cf0665
Content-Type: application/json

--- request body ---
{"handle":"qa-b45e96e6f139","password":"****"}

--- response: 200 in 56 ms ---
Date: Mon, 02 Nov 2026 09:39:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c61b4a0-1702-4516-b48c-1f7ce7cf0665
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_75942c50-064e-4d53-9327-67782fdc26e8"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-c275b122-3efa-449c-987a-d334be39b7ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c275b122-3efa-449c-987a-d334be39b7ea
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 40 ms ---
Date: Mon, 02 Nov 2026 09:39:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c275b122-3efa-449c-987a-d334be39b7ea
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

{"id":"acc_75942c50-064e-4d53-9327-67782fdc26e8","handle":"qa-b45e96e6f139","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-02T09:39:10.480966685Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-b85b36f2-49fb-419e-af86-2cdd4e8451ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b85b36f2-49fb-419e-af86-2cdd4e8451ec
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-b85b36f2-49fb-419e-af86-2cdd4e8451ec
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

{"id":"acc_75942c50-064e-4d53-9327-67782fdc26e8","handle":"qa-b45e96e6f139","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-02T09:39:10.480966685Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-88071387-ae28-4889-b6c5-22e51767a6c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88071387-ae28-4889-b6c5-22e51767a6c8
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-88071387-ae28-4889-b6c5-22e51767a6c8
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
correlation: qa-920645c5-3643-4158-9080-203f4e492a73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-920645c5-3643-4158-9080-203f4e492a73
Content-Type: application/json

--- request body ---
{"handle":"qa-b45e96e6f139","password":"****"}

--- response: 401 in 22 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-920645c5-3643-4158-9080-203f4e492a73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-920645c5-3643-4158-9080-203f4e492a73"}
```
