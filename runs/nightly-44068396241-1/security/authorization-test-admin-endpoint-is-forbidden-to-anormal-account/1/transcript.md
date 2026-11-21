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
| 1 | `POST /v1/accounts` | 201 | 278 | `qa-d90e65bf-4ca0-4438-a86e-f9aa979e4c8a` |
| 2 | `POST /v1/auth/token` | 200 | 56 | `qa-70d74fba-d44b-4ffd-815b-0ea7c959c769` |
| 3 | `GET /v1/admin/stats` | 403 | 25 | `qa-5f1ffb6d-8f69-4c0b-b764-6846725a4435` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-4ce14dff-e948-49b4-818e-5714e5e83e80` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-91171882-670a-478e-80d2-775f3a63b6c6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d90e65bf-4ca0-4438-a86e-f9aa979e4c8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d90e65bf-4ca0-4438-a86e-f9aa979e4c8a
Content-Type: application/json

--- request body ---
{"handle":"qa-181cb972a29c","displayName":"QA 181cb972a29c","password":"****","region":"eu"}

--- response: 201 in 278 ms ---
Date: Tue, 17 Nov 2026 10:50:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-d90e65bf-4ca0-4438-a86e-f9aa979e4c8a
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
Location: /v1/accounts/qa-181cb972a29c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ad57487f-31bc-4513-86b4-33f91a5edbd4","handle":"qa-181cb972a29c","displayName":"QA 181cb972a29c","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.638218775Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-70d74fba-d44b-4ffd-815b-0ea7c959c769

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70d74fba-d44b-4ffd-815b-0ea7c959c769
Content-Type: application/json

--- request body ---
{"handle":"qa-181cb972a29c","password":"****"}

--- response: 200 in 56 ms ---
Date: Tue, 17 Nov 2026 10:50:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-70d74fba-d44b-4ffd-815b-0ea7c959c769
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ad57487f-31bc-4513-86b4-33f91a5edbd4"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-5f1ffb6d-8f69-4c0b-b764-6846725a4435

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f1ffb6d-8f69-4c0b-b764-6846725a4435
Content-Type: application/json

--- response: 403 in 25 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f1ffb6d-8f69-4c0b-b764-6846725a4435
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-5f1ffb6d-8f69-4c0b-b764-6846725a4435"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4ce14dff-e948-49b4-818e-5714e5e83e80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ce14dff-e948-49b4-818e-5714e5e83e80
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4ce14dff-e948-49b4-818e-5714e5e83e80
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
correlation: qa-91171882-670a-478e-80d2-775f3a63b6c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91171882-670a-478e-80d2-775f3a63b6c6
Content-Type: application/json

--- request body ---
{"handle":"qa-181cb972a29c","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91171882-670a-478e-80d2-775f3a63b6c6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-91171882-670a-478e-80d2-775f3a63b6c6"}
```
