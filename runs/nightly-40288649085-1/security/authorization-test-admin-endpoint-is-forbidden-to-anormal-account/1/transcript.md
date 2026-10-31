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
| 1 | `POST /v1/accounts` | 201 | 400 | `qa-bd59013a-4d54-4c57-8173-a4f409967355` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-11feae8c-6512-4cad-bb29-e02f52e51fc7` |
| 3 | `GET /v1/admin/stats` | 403 | 20 | `qa-79dee993-f28a-4ef0-8eec-197c7bc1692d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-81b87c96-ded7-4e61-ad5e-d13b87cb11ee` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-4cc1bf40-3202-46c6-b412-a8371ea36d1e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bd59013a-4d54-4c57-8173-a4f409967355

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd59013a-4d54-4c57-8173-a4f409967355
Content-Type: application/json

--- request body ---
{"handle":"qa-8c486ba4603b","displayName":"QA 8c486ba4603b","password":"****","region":"eu"}

--- response: 201 in 400 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd59013a-4d54-4c57-8173-a4f409967355
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-8c486ba4603b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bdb85e17-2b70-4005-94df-5e8be02f7dca","handle":"qa-8c486ba4603b","displayName":"QA 8c486ba4603b","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.422249295Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-11feae8c-6512-4cad-bb29-e02f52e51fc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11feae8c-6512-4cad-bb29-e02f52e51fc7
Content-Type: application/json

--- request body ---
{"handle":"qa-8c486ba4603b","password":"****"}

--- response: 200 in 43 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-11feae8c-6512-4cad-bb29-e02f52e51fc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bdb85e17-2b70-4005-94df-5e8be02f7dca"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-79dee993-f28a-4ef0-8eec-197c7bc1692d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79dee993-f28a-4ef0-8eec-197c7bc1692d
Content-Type: application/json

--- response: 403 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-79dee993-f28a-4ef0-8eec-197c7bc1692d
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-79dee993-f28a-4ef0-8eec-197c7bc1692d"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81b87c96-ded7-4e61-ad5e-d13b87cb11ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81b87c96-ded7-4e61-ad5e-d13b87cb11ee
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81b87c96-ded7-4e61-ad5e-d13b87cb11ee
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
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4cc1bf40-3202-46c6-b412-a8371ea36d1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cc1bf40-3202-46c6-b412-a8371ea36d1e
Content-Type: application/json

--- request body ---
{"handle":"qa-8c486ba4603b","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4cc1bf40-3202-46c6-b412-a8371ea36d1e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4cc1bf40-3202-46c6-b412-a8371ea36d1e"}
```
