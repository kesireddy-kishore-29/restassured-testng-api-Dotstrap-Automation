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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-e7746ad7-9588-4a36-a561-7e97add9606d` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-7f8f1994-70b2-46b1-b9b4-4ed4599869a9` |
| 3 | `GET /v1/accounts/me` | 200 | 7 | `qa-10ddb8f6-3440-400d-8ca5-fcc7f33ce80b` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-8d0ab47e-a7ee-4141-8403-f398099bbcdd` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-af5eb08b-de4d-4f67-a70f-8f6d1d98a485` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e7746ad7-9588-4a36-a561-7e97add9606d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7746ad7-9588-4a36-a561-7e97add9606d
Content-Type: application/json

--- request body ---
{"handle":"qa-b2bf4b81aac7","displayName":"QA b2bf4b81aac7","password":"****","region":"in"}

--- response: 201 in 23 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7746ad7-9588-4a36-a561-7e97add9606d
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
Location: /v1/accounts/qa-b2bf4b81aac7
X-Served-Region: in
Content-Length: 181

{"id":"acc_2cdad363-b7c7-442e-a27c-3a54f27bafe3","handle":"qa-b2bf4b81aac7","displayName":"QA b2bf4b81aac7","region":"in","role":"user","createdAt":"2026-11-27T10:59:46.912375117Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7f8f1994-70b2-46b1-b9b4-4ed4599869a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f8f1994-70b2-46b1-b9b4-4ed4599869a9
Content-Type: application/json

--- request body ---
{"handle":"qa-b2bf4b81aac7","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f8f1994-70b2-46b1-b9b4-4ed4599869a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2cdad363-b7c7-442e-a27c-3a54f27bafe3"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-10ddb8f6-3440-400d-8ca5-fcc7f33ce80b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10ddb8f6-3440-400d-8ca5-fcc7f33ce80b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-10ddb8f6-3440-400d-8ca5-fcc7f33ce80b
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

{"id":"acc_2cdad363-b7c7-442e-a27c-3a54f27bafe3","handle":"qa-b2bf4b81aac7","displayName":"QA b2bf4b81aac7","region":"in","role":"user","createdAt":"2026-11-27T10:59:46.912375117Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8d0ab47e-a7ee-4141-8403-f398099bbcdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d0ab47e-a7ee-4141-8403-f398099bbcdd
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8d0ab47e-a7ee-4141-8403-f398099bbcdd
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
correlation: qa-af5eb08b-de4d-4f67-a70f-8f6d1d98a485

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af5eb08b-de4d-4f67-a70f-8f6d1d98a485
Content-Type: application/json

--- request body ---
{"handle":"qa-b2bf4b81aac7","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af5eb08b-de4d-4f67-a70f-8f6d1d98a485
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-af5eb08b-de4d-4f67-a70f-8f6d1d98a485"}
```
