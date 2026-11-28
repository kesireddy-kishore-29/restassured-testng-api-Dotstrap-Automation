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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-737717c6-3bac-48f0-a9ac-e72a5f8ac169` |
| 2 | `POST /v1/auth/token` | 200 | 13 | `qa-8248cd50-aa0f-4a4d-b1e1-96db128eeda4` |
| 3 | `GET /v1/accounts/me` | 200 | 10 | `qa-cea87d48-01b3-437b-93e5-2c2852e7368d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-d0058ee8-e4de-4640-bce3-8b4c81a3e225` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-2fb096a0-0ed3-4e26-bfa0-509d1bbe5dbe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-737717c6-3bac-48f0-a9ac-e72a5f8ac169

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-737717c6-3bac-48f0-a9ac-e72a5f8ac169
Content-Type: application/json

--- request body ---
{"handle":"qa-1514861d27d6","displayName":"QA 1514861d27d6","password":"****","region":"in"}

--- response: 201 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-737717c6-3bac-48f0-a9ac-e72a5f8ac169
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-1514861d27d6
X-Served-Region: in
Content-Length: 181

{"id":"acc_2eaf28ec-6c01-4afa-b94a-33941fe3e5e7","handle":"qa-1514861d27d6","displayName":"QA 1514861d27d6","region":"in","role":"user","createdAt":"2026-11-19T10:29:15.937087683Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8248cd50-aa0f-4a4d-b1e1-96db128eeda4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8248cd50-aa0f-4a4d-b1e1-96db128eeda4
Content-Type: application/json

--- request body ---
{"handle":"qa-1514861d27d6","password":"****"}

--- response: 200 in 13 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-8248cd50-aa0f-4a4d-b1e1-96db128eeda4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2eaf28ec-6c01-4afa-b94a-33941fe3e5e7"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-cea87d48-01b3-437b-93e5-2c2852e7368d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cea87d48-01b3-437b-93e5-2c2852e7368d
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-cea87d48-01b3-437b-93e5-2c2852e7368d
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

{"id":"acc_2eaf28ec-6c01-4afa-b94a-33941fe3e5e7","handle":"qa-1514861d27d6","displayName":"QA 1514861d27d6","region":"in","role":"user","createdAt":"2026-11-19T10:29:15.937087683Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d0058ee8-e4de-4640-bce3-8b4c81a3e225

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0058ee8-e4de-4640-bce3-8b4c81a3e225
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d0058ee8-e4de-4640-bce3-8b4c81a3e225
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
correlation: qa-2fb096a0-0ed3-4e26-bfa0-509d1bbe5dbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fb096a0-0ed3-4e26-bfa0-509d1bbe5dbe
Content-Type: application/json

--- request body ---
{"handle":"qa-1514861d27d6","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fb096a0-0ed3-4e26-bfa0-509d1bbe5dbe
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2fb096a0-0ed3-4e26-bfa0-509d1bbe5dbe"}
```
