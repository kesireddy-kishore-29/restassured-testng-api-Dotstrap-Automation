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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-d1185648-6423-47f0-9a48-ef23c236e0e7` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-6673bd57-f0ed-48ad-8e63-67c107c03d08` |
| 3 | `GET /v1/accounts/me` | 200 | 11 | `qa-3a865c9d-77f9-4b2d-88d0-d7bb0253ad89` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-d843b6ce-2110-40f7-abf4-17fa06eeeee0` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-cb4e8b7c-ea8a-48ec-85fb-a151ceeccb43` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d1185648-6423-47f0-9a48-ef23c236e0e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1185648-6423-47f0-9a48-ef23c236e0e7
Content-Type: application/json

--- request body ---
{"handle":"qa-6cf7d346c85f","displayName":"QA 6cf7d346c85f","password":"****","region":"in"}

--- response: 201 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1185648-6423-47f0-9a48-ef23c236e0e7
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
Location: /v1/accounts/qa-6cf7d346c85f
X-Served-Region: in
Content-Length: 181

{"id":"acc_d11f3d91-80b0-49b7-a2ed-753f1e38aa96","handle":"qa-6cf7d346c85f","displayName":"QA 6cf7d346c85f","region":"in","role":"user","createdAt":"2026-11-09T09:56:00.008561868Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6673bd57-f0ed-48ad-8e63-67c107c03d08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6673bd57-f0ed-48ad-8e63-67c107c03d08
Content-Type: application/json

--- request body ---
{"handle":"qa-6cf7d346c85f","password":"****"}

--- response: 200 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6673bd57-f0ed-48ad-8e63-67c107c03d08
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d11f3d91-80b0-49b7-a2ed-753f1e38aa96"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a865c9d-77f9-4b2d-88d0-d7bb0253ad89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a865c9d-77f9-4b2d-88d0-d7bb0253ad89
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a865c9d-77f9-4b2d-88d0-d7bb0253ad89
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

{"id":"acc_d11f3d91-80b0-49b7-a2ed-753f1e38aa96","handle":"qa-6cf7d346c85f","displayName":"QA 6cf7d346c85f","region":"in","role":"user","createdAt":"2026-11-09T09:56:00.008561868Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d843b6ce-2110-40f7-abf4-17fa06eeeee0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d843b6ce-2110-40f7-abf4-17fa06eeeee0
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d843b6ce-2110-40f7-abf4-17fa06eeeee0
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
correlation: qa-cb4e8b7c-ea8a-48ec-85fb-a151ceeccb43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb4e8b7c-ea8a-48ec-85fb-a151ceeccb43
Content-Type: application/json

--- request body ---
{"handle":"qa-6cf7d346c85f","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb4e8b7c-ea8a-48ec-85fb-a151ceeccb43
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cb4e8b7c-ea8a-48ec-85fb-a151ceeccb43"}
```
