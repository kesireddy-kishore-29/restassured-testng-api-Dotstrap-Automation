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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-31a7bcaa-1078-4ac5-8702-0391684db3ec` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-e7ea468d-ed0e-41a8-8b63-83d7166202ab` |
| 3 | `GET /v1/accounts/me` | 200 | 10 | `qa-c7f25693-d4bf-452d-b3f9-64b2c8a0452a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-ad73b41e-a522-43be-814a-724a064187d8` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-69582305-4700-4d51-8ff4-c30ae183c9f5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-31a7bcaa-1078-4ac5-8702-0391684db3ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31a7bcaa-1078-4ac5-8702-0391684db3ec
Content-Type: application/json

--- request body ---
{"handle":"qa-73482293b85c","displayName":"QA 73482293b85c","password":"****","region":"in"}

--- response: 201 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-31a7bcaa-1078-4ac5-8702-0391684db3ec
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
Location: /v1/accounts/qa-73482293b85c
X-Served-Region: in
Content-Length: 181

{"id":"acc_6a935fe2-9f15-421f-a7cf-6e04ce8e6b98","handle":"qa-73482293b85c","displayName":"QA 73482293b85c","region":"in","role":"user","createdAt":"2026-11-12T09:56:36.338834279Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e7ea468d-ed0e-41a8-8b63-83d7166202ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7ea468d-ed0e-41a8-8b63-83d7166202ab
Content-Type: application/json

--- request body ---
{"handle":"qa-73482293b85c","password":"****"}

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7ea468d-ed0e-41a8-8b63-83d7166202ab
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6a935fe2-9f15-421f-a7cf-6e04ce8e6b98"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-c7f25693-d4bf-452d-b3f9-64b2c8a0452a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7f25693-d4bf-452d-b3f9-64b2c8a0452a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7f25693-d4bf-452d-b3f9-64b2c8a0452a
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

{"id":"acc_6a935fe2-9f15-421f-a7cf-6e04ce8e6b98","handle":"qa-73482293b85c","displayName":"QA 73482293b85c","region":"in","role":"user","createdAt":"2026-11-12T09:56:36.338834279Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ad73b41e-a522-43be-814a-724a064187d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad73b41e-a522-43be-814a-724a064187d8
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ad73b41e-a522-43be-814a-724a064187d8
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
correlation: qa-69582305-4700-4d51-8ff4-c30ae183c9f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69582305-4700-4d51-8ff4-c30ae183c9f5
Content-Type: application/json

--- request body ---
{"handle":"qa-73482293b85c","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69582305-4700-4d51-8ff4-c30ae183c9f5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-69582305-4700-4d51-8ff4-c30ae183c9f5"}
```
