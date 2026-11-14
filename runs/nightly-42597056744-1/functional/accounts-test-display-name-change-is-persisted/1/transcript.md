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
| 1 | `POST /v1/accounts` | 201 | 495 | `qa-69d6366b-976e-4e9b-a87d-bcd0174259a1` |
| 2 | `POST /v1/auth/token` | 200 | 75 | `qa-17c91872-28cd-434c-9867-eddae80680a6` |
| 3 | `PATCH /v1/accounts/me` | 200 | 47 | `qa-ffa75136-4e64-462d-ab4c-b420e5210843` |
| 4 | `GET /v1/accounts/me` | 200 | 16 | `qa-36bf8998-1892-4a16-adcc-fa9c418bb1a8` |
| 5 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-5ec47a28-55dd-4ac8-a9fe-f78be952dbf1` |
| 6 | `POST /v1/auth/token` | 401 | 24 | `qa-81ef67f9-b9db-4954-adfb-a54a6b2aea87` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-69d6366b-976e-4e9b-a87d-bcd0174259a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69d6366b-976e-4e9b-a87d-bcd0174259a1
Content-Type: application/json

--- request body ---
{"handle":"qa-15fbc4dc3ad4","displayName":"QA 15fbc4dc3ad4","password":"****","region":"eu"}

--- response: 201 in 495 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-69d6366b-976e-4e9b-a87d-bcd0174259a1
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
Location: /v1/accounts/qa-15fbc4dc3ad4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1601911a-ffca-4002-81e3-11dbfc2f8c74","handle":"qa-15fbc4dc3ad4","displayName":"QA 15fbc4dc3ad4","region":"eu","role":"user","createdAt":"2026-11-09T09:55:58.925497728Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-17c91872-28cd-434c-9867-eddae80680a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17c91872-28cd-434c-9867-eddae80680a6
Content-Type: application/json

--- request body ---
{"handle":"qa-15fbc4dc3ad4","password":"****"}

--- response: 200 in 75 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-17c91872-28cd-434c-9867-eddae80680a6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1601911a-ffca-4002-81e3-11dbfc2f8c74"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-ffa75136-4e64-462d-ab4c-b420e5210843

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffa75136-4e64-462d-ab4c-b420e5210843
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 47 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffa75136-4e64-462d-ab4c-b420e5210843
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

{"id":"acc_1601911a-ffca-4002-81e3-11dbfc2f8c74","handle":"qa-15fbc4dc3ad4","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-09T09:55:58.925497728Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-36bf8998-1892-4a16-adcc-fa9c418bb1a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36bf8998-1892-4a16-adcc-fa9c418bb1a8
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-36bf8998-1892-4a16-adcc-fa9c418bb1a8
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

{"id":"acc_1601911a-ffca-4002-81e3-11dbfc2f8c74","handle":"qa-15fbc4dc3ad4","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-09T09:55:58.925497728Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5ec47a28-55dd-4ac8-a9fe-f78be952dbf1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ec47a28-55dd-4ac8-a9fe-f78be952dbf1
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5ec47a28-55dd-4ac8-a9fe-f78be952dbf1
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
correlation: qa-81ef67f9-b9db-4954-adfb-a54a6b2aea87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81ef67f9-b9db-4954-adfb-a54a6b2aea87
Content-Type: application/json

--- request body ---
{"handle":"qa-15fbc4dc3ad4","password":"****"}

--- response: 401 in 24 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81ef67f9-b9db-4954-adfb-a54a6b2aea87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-81ef67f9-b9db-4954-adfb-a54a6b2aea87"}
```
