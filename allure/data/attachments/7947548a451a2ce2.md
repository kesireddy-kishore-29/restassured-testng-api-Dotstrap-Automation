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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-79f5552b-ae76-41d8-a3ba-8bdedad27ab8` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-b16b2124-3b19-451f-a4e3-cf53f431bc33` |
| 3 | `GET /v1/accounts/me` | 200 | 7 | `qa-c38cf776-3a44-44f8-ab2e-1e4edef21d63` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-a92126de-8365-4636-a2c2-bcf98417870c` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-4d2a453a-0fc7-47b0-b48a-cb89f4aee8e3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-79f5552b-ae76-41d8-a3ba-8bdedad27ab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79f5552b-ae76-41d8-a3ba-8bdedad27ab8
Content-Type: application/json

--- request body ---
{"handle":"qa-a01bfaa6a58f","displayName":"QA a01bfaa6a58f","password":"****","region":"in"}

--- response: 201 in 24 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-79f5552b-ae76-41d8-a3ba-8bdedad27ab8
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
Location: /v1/accounts/qa-a01bfaa6a58f
X-Served-Region: in
Content-Length: 181

{"id":"acc_d62123a1-034d-4bf5-b288-1540806fb552","handle":"qa-a01bfaa6a58f","displayName":"QA a01bfaa6a58f","region":"in","role":"user","createdAt":"2026-11-07T08:55:04.413727500Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b16b2124-3b19-451f-a4e3-cf53f431bc33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b16b2124-3b19-451f-a4e3-cf53f431bc33
Content-Type: application/json

--- request body ---
{"handle":"qa-a01bfaa6a58f","password":"****"}

--- response: 200 in 15 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b16b2124-3b19-451f-a4e3-cf53f431bc33
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d62123a1-034d-4bf5-b288-1540806fb552"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-c38cf776-3a44-44f8-ab2e-1e4edef21d63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c38cf776-3a44-44f8-ab2e-1e4edef21d63
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c38cf776-3a44-44f8-ab2e-1e4edef21d63
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

{"id":"acc_d62123a1-034d-4bf5-b288-1540806fb552","handle":"qa-a01bfaa6a58f","displayName":"QA a01bfaa6a58f","region":"in","role":"user","createdAt":"2026-11-07T08:55:04.413727500Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a92126de-8365-4636-a2c2-bcf98417870c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a92126de-8365-4636-a2c2-bcf98417870c
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a92126de-8365-4636-a2c2-bcf98417870c
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
correlation: qa-4d2a453a-0fc7-47b0-b48a-cb89f4aee8e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d2a453a-0fc7-47b0-b48a-cb89f4aee8e3
Content-Type: application/json

--- request body ---
{"handle":"qa-a01bfaa6a58f","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d2a453a-0fc7-47b0-b48a-cb89f4aee8e3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4d2a453a-0fc7-47b0-b48a-cb89f4aee8e3"}
```
