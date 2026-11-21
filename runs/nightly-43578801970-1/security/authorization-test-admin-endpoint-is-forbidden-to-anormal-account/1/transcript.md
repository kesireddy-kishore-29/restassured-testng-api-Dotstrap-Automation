# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 422 | `qa-6f1767df-ff23-42e5-a05f-0f4a4955f47c` |
| 2 | `POST /v1/auth/token` | 200 | 59 | `qa-24935fe8-419f-483b-b6f2-280f9eaea65c` |
| 3 | `GET /v1/admin/stats` | 403 | 42 | `qa-ddf4a6b0-6f5d-42c0-8296-4a9009f5b6aa` |
| 4 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-41783db8-24ba-4e29-9933-3dd83a4488e3` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-62c878d3-391a-49c7-aa3e-c2ec9b541cc7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6f1767df-ff23-42e5-a05f-0f4a4955f47c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f1767df-ff23-42e5-a05f-0f4a4955f47c
Content-Type: application/json

--- request body ---
{"handle":"qa-345b80495c24","displayName":"QA 345b80495c24","password":"****","region":"eu"}

--- response: 201 in 422 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f1767df-ff23-42e5-a05f-0f4a4955f47c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-345b80495c24
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f6356e0b-ff30-4eca-88f2-bbd6d9986894","handle":"qa-345b80495c24","displayName":"QA 345b80495c24","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.182783148Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-24935fe8-419f-483b-b6f2-280f9eaea65c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24935fe8-419f-483b-b6f2-280f9eaea65c
Content-Type: application/json

--- request body ---
{"handle":"qa-345b80495c24","password":"****"}

--- response: 200 in 59 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-24935fe8-419f-483b-b6f2-280f9eaea65c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f6356e0b-ff30-4eca-88f2-bbd6d9986894"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-ddf4a6b0-6f5d-42c0-8296-4a9009f5b6aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddf4a6b0-6f5d-42c0-8296-4a9009f5b6aa
Content-Type: application/json

--- response: 403 in 42 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddf4a6b0-6f5d-42c0-8296-4a9009f5b6aa
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
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-ddf4a6b0-6f5d-42c0-8296-4a9009f5b6aa"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-41783db8-24ba-4e29-9933-3dd83a4488e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41783db8-24ba-4e29-9933-3dd83a4488e3
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-41783db8-24ba-4e29-9933-3dd83a4488e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-62c878d3-391a-49c7-aa3e-c2ec9b541cc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62c878d3-391a-49c7-aa3e-c2ec9b541cc7
Content-Type: application/json

--- request body ---
{"handle":"qa-345b80495c24","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62c878d3-391a-49c7-aa3e-c2ec9b541cc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-62c878d3-391a-49c7-aa3e-c2ec9b541cc7"}
```
