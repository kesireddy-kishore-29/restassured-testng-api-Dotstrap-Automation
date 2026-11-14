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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-c39353f6-4c32-460a-b298-5b1ae325c6dc` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-ff30b3ac-9ba0-48a1-b758-37e30d608fb7` |
| 3 | `GET /v1/accounts/me` | 200 | 8 | `qa-4afa5970-7c9a-451e-945d-04fc627a904a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-2100f2ad-d5bf-4db6-b862-7f781810dbe1` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-db69b94e-9ca0-43a2-b2e1-22c6833f85d6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c39353f6-4c32-460a-b298-5b1ae325c6dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c39353f6-4c32-460a-b298-5b1ae325c6dc
Content-Type: application/json

--- request body ---
{"handle":"qa-991268d66e37","displayName":"QA 991268d66e37","password":"****","region":"in"}

--- response: 201 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c39353f6-4c32-460a-b298-5b1ae325c6dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-991268d66e37
X-Served-Region: in
Content-Length: 181

{"id":"acc_6d1ed477-af00-4bc8-9f40-f5470afbbe3c","handle":"qa-991268d66e37","displayName":"QA 991268d66e37","region":"in","role":"user","createdAt":"2026-11-05T09:37:52.517482795Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ff30b3ac-9ba0-48a1-b758-37e30d608fb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff30b3ac-9ba0-48a1-b758-37e30d608fb7
Content-Type: application/json

--- request body ---
{"handle":"qa-991268d66e37","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff30b3ac-9ba0-48a1-b758-37e30d608fb7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d1ed477-af00-4bc8-9f40-f5470afbbe3c"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-4afa5970-7c9a-451e-945d-04fc627a904a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4afa5970-7c9a-451e-945d-04fc627a904a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4afa5970-7c9a-451e-945d-04fc627a904a
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

{"id":"acc_6d1ed477-af00-4bc8-9f40-f5470afbbe3c","handle":"qa-991268d66e37","displayName":"QA 991268d66e37","region":"in","role":"user","createdAt":"2026-11-05T09:37:52.517482795Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2100f2ad-d5bf-4db6-b862-7f781810dbe1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2100f2ad-d5bf-4db6-b862-7f781810dbe1
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2100f2ad-d5bf-4db6-b862-7f781810dbe1
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
correlation: qa-db69b94e-9ca0-43a2-b2e1-22c6833f85d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db69b94e-9ca0-43a2-b2e1-22c6833f85d6
Content-Type: application/json

--- request body ---
{"handle":"qa-991268d66e37","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db69b94e-9ca0-43a2-b2e1-22c6833f85d6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db69b94e-9ca0-43a2-b2e1-22c6833f85d6"}
```
