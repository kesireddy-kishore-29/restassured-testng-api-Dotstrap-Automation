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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-856d00c4-3d1a-40b5-a72c-65b7489c7259` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-7927c2d5-1d9f-4d53-8cc0-3b17933ed7ed` |
| 3 | `GET /v1/accounts/me` | 200 | 5 | `qa-a5e4083e-1fa6-46d5-9769-4e41834c9b8b` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-96012bbf-0297-47a9-83e6-ea0a6a7381fe` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-90a189dc-cf13-439a-a9e2-19eb75dc8185` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-856d00c4-3d1a-40b5-a72c-65b7489c7259

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-856d00c4-3d1a-40b5-a72c-65b7489c7259
Content-Type: application/json

--- request body ---
{"handle":"qa-48f086f26eaa","displayName":"QA 48f086f26eaa","password":"****","region":"in"}

--- response: 201 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-856d00c4-3d1a-40b5-a72c-65b7489c7259
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-48f086f26eaa
X-Served-Region: in
Content-Length: 181

{"id":"acc_1cd67317-7dbf-48b9-8218-421c88459661","handle":"qa-48f086f26eaa","displayName":"QA 48f086f26eaa","region":"in","role":"user","createdAt":"2026-11-14T09:05:14.523077323Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7927c2d5-1d9f-4d53-8cc0-3b17933ed7ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7927c2d5-1d9f-4d53-8cc0-3b17933ed7ed
Content-Type: application/json

--- request body ---
{"handle":"qa-48f086f26eaa","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-7927c2d5-1d9f-4d53-8cc0-3b17933ed7ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1cd67317-7dbf-48b9-8218-421c88459661"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-a5e4083e-1fa6-46d5-9769-4e41834c9b8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5e4083e-1fa6-46d5-9769-4e41834c9b8b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5e4083e-1fa6-46d5-9769-4e41834c9b8b
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

{"id":"acc_1cd67317-7dbf-48b9-8218-421c88459661","handle":"qa-48f086f26eaa","displayName":"QA 48f086f26eaa","region":"in","role":"user","createdAt":"2026-11-14T09:05:14.523077323Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-96012bbf-0297-47a9-83e6-ea0a6a7381fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96012bbf-0297-47a9-83e6-ea0a6a7381fe
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-96012bbf-0297-47a9-83e6-ea0a6a7381fe
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
correlation: qa-90a189dc-cf13-439a-a9e2-19eb75dc8185

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90a189dc-cf13-439a-a9e2-19eb75dc8185
Content-Type: application/json

--- request body ---
{"handle":"qa-48f086f26eaa","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90a189dc-cf13-439a-a9e2-19eb75dc8185
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-90a189dc-cf13-439a-a9e2-19eb75dc8185"}
```
