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
| 1 | `POST /v1/accounts` | 201 | 435 | `qa-43c6d618-4445-4c6f-a134-2564c949d140` |
| 2 | `POST /v1/auth/token` | 200 | 83 | `qa-bc28aa5c-8537-450c-b2bf-782d7a291dd5` |
| 3 | `PATCH /v1/accounts/me` | 200 | 54 | `qa-2a0bf335-c6e8-421a-b22c-810efcc01747` |
| 4 | `GET /v1/accounts/me` | 200 | 24 | `qa-46f7c749-9c75-4cac-9e6e-47e4c5558d7a` |
| 5 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-8c3354b0-0d72-443c-a90a-409c553ecee1` |
| 6 | `POST /v1/auth/token` | 401 | 21 | `qa-aab1c5b2-50a1-42f6-bb78-1dff3a24670f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-43c6d618-4445-4c6f-a134-2564c949d140

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43c6d618-4445-4c6f-a134-2564c949d140
Content-Type: application/json

--- request body ---
{"handle":"qa-a02f301530f7","displayName":"QA a02f301530f7","password":"****","region":"eu"}

--- response: 201 in 435 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-43c6d618-4445-4c6f-a134-2564c949d140
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
Location: /v1/accounts/qa-a02f301530f7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d280099d-f416-479f-ab0d-37a78ee9aef6","handle":"qa-a02f301530f7","displayName":"QA a02f301530f7","region":"eu","role":"user","createdAt":"2026-11-04T09:28:14.074451428Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bc28aa5c-8537-450c-b2bf-782d7a291dd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc28aa5c-8537-450c-b2bf-782d7a291dd5
Content-Type: application/json

--- request body ---
{"handle":"qa-a02f301530f7","password":"****"}

--- response: 200 in 83 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc28aa5c-8537-450c-b2bf-782d7a291dd5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d280099d-f416-479f-ab0d-37a78ee9aef6"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-2a0bf335-c6e8-421a-b22c-810efcc01747

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a0bf335-c6e8-421a-b22c-810efcc01747
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 54 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a0bf335-c6e8-421a-b22c-810efcc01747
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

{"id":"acc_d280099d-f416-479f-ab0d-37a78ee9aef6","handle":"qa-a02f301530f7","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-04T09:28:14.074451428Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-46f7c749-9c75-4cac-9e6e-47e4c5558d7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46f7c749-9c75-4cac-9e6e-47e4c5558d7a
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-46f7c749-9c75-4cac-9e6e-47e4c5558d7a
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

{"id":"acc_d280099d-f416-479f-ab0d-37a78ee9aef6","handle":"qa-a02f301530f7","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-04T09:28:14.074451428Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8c3354b0-0d72-443c-a90a-409c553ecee1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c3354b0-0d72-443c-a90a-409c553ecee1
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8c3354b0-0d72-443c-a90a-409c553ecee1
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
correlation: qa-aab1c5b2-50a1-42f6-bb78-1dff3a24670f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aab1c5b2-50a1-42f6-bb78-1dff3a24670f
Content-Type: application/json

--- request body ---
{"handle":"qa-a02f301530f7","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aab1c5b2-50a1-42f6-bb78-1dff3a24670f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aab1c5b2-50a1-42f6-bb78-1dff3a24670f"}
```
