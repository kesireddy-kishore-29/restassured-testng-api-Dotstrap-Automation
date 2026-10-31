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
| 1 | `POST /v1/accounts` | 201 | 332 | `qa-03db2366-6b6f-4738-a59b-ca954efd6071` |
| 2 | `POST /v1/auth/token` | 200 | 40 | `qa-aa7193e0-ba81-430b-bbe8-4396946dd887` |
| 3 | `GET /v1/accounts/me` | 200 | 34 | `qa-2d2bd71e-f5a7-432b-8071-e6470bd7ca82` |
| 4 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-adb77ba0-a7d7-4609-ab79-618cd53ca462` |
| 5 | `POST /v1/auth/token` | 401 | 27 | `qa-57846077-2e73-4072-b45f-3125d01ae3e3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-03db2366-6b6f-4738-a59b-ca954efd6071

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03db2366-6b6f-4738-a59b-ca954efd6071
Content-Type: application/json

--- request body ---
{"handle":"qa-419708789bff","displayName":"QA 419708789bff","password":"****","region":"in"}

--- response: 201 in 332 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-03db2366-6b6f-4738-a59b-ca954efd6071
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
Location: /v1/accounts/qa-419708789bff
X-Served-Region: in
Content-Length: 181

{"id":"acc_5015f18b-0d29-41af-afde-de358810402f","handle":"qa-419708789bff","displayName":"QA 419708789bff","region":"in","role":"user","createdAt":"2026-10-28T08:42:52.331458780Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-aa7193e0-ba81-430b-bbe8-4396946dd887

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa7193e0-ba81-430b-bbe8-4396946dd887
Content-Type: application/json

--- request body ---
{"handle":"qa-419708789bff","password":"****"}

--- response: 200 in 40 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa7193e0-ba81-430b-bbe8-4396946dd887
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5015f18b-0d29-41af-afde-de358810402f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d2bd71e-f5a7-432b-8071-e6470bd7ca82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d2bd71e-f5a7-432b-8071-e6470bd7ca82
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d2bd71e-f5a7-432b-8071-e6470bd7ca82
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

{"id":"acc_5015f18b-0d29-41af-afde-de358810402f","handle":"qa-419708789bff","displayName":"QA 419708789bff","region":"in","role":"user","createdAt":"2026-10-28T08:42:52.331458780Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-adb77ba0-a7d7-4609-ab79-618cd53ca462

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adb77ba0-a7d7-4609-ab79-618cd53ca462
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-adb77ba0-a7d7-4609-ab79-618cd53ca462
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
correlation: qa-57846077-2e73-4072-b45f-3125d01ae3e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57846077-2e73-4072-b45f-3125d01ae3e3
Content-Type: application/json

--- request body ---
{"handle":"qa-419708789bff","password":"****"}

--- response: 401 in 27 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57846077-2e73-4072-b45f-3125d01ae3e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-57846077-2e73-4072-b45f-3125d01ae3e3"}
```
