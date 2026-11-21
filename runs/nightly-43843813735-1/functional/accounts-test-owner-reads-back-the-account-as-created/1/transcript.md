# Transcript: The owner reads back exactly what was created

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#ownerReadsBackTheAccountAsCreated` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-c3532476-a19c-4db3-b556-b8f58cb568cd` |
| 2 | `POST /v1/auth/token` | 200 | 13 | `qa-81a2b025-bae2-43f0-b5ed-a0ce99559241` |
| 3 | `GET /v1/accounts/me` | 200 | 12 | `qa-3c5ef9e8-acfa-45ed-9cea-f721bf60d509` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-b2f684ed-b4d3-43c1-9b13-182b2f314138` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-31fe8bf1-f3d9-4ab6-9e0b-b6c82fd6d1e0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c3532476-a19c-4db3-b556-b8f58cb568cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3532476-a19c-4db3-b556-b8f58cb568cd
Content-Type: application/json

--- request body ---
{"handle":"qa-b0e9da79f00d","displayName":"QA b0e9da79f00d","password":"****","region":"in"}

--- response: 201 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3532476-a19c-4db3-b556-b8f58cb568cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-b0e9da79f00d
X-Served-Region: in
Content-Length: 181

{"id":"acc_5ed4ff2b-7d3d-41a0-90e9-33a462812947","handle":"qa-b0e9da79f00d","displayName":"QA b0e9da79f00d","region":"in","role":"user","createdAt":"2026-11-16T09:53:52.827087904Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-81a2b025-bae2-43f0-b5ed-a0ce99559241

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81a2b025-bae2-43f0-b5ed-a0ce99559241
Content-Type: application/json

--- request body ---
{"handle":"qa-b0e9da79f00d","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-81a2b025-bae2-43f0-b5ed-a0ce99559241
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ed4ff2b-7d3d-41a0-90e9-33a462812947"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-3c5ef9e8-acfa-45ed-9cea-f721bf60d509

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c5ef9e8-acfa-45ed-9cea-f721bf60d509
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c5ef9e8-acfa-45ed-9cea-f721bf60d509
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
X-Served-Region: in
Content-Length: 181

{"id":"acc_5ed4ff2b-7d3d-41a0-90e9-33a462812947","handle":"qa-b0e9da79f00d","displayName":"QA b0e9da79f00d","region":"in","role":"user","createdAt":"2026-11-16T09:53:52.827087904Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b2f684ed-b4d3-43c1-9b13-182b2f314138

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2f684ed-b4d3-43c1-9b13-182b2f314138
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b2f684ed-b4d3-43c1-9b13-182b2f314138
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
X-Served-Region: in
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-31fe8bf1-f3d9-4ab6-9e0b-b6c82fd6d1e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31fe8bf1-f3d9-4ab6-9e0b-b6c82fd6d1e0
Content-Type: application/json

--- request body ---
{"handle":"qa-b0e9da79f00d","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31fe8bf1-f3d9-4ab6-9e0b-b6c82fd6d1e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-31fe8bf1-f3d9-4ab6-9e0b-b6c82fd6d1e0"}
```
