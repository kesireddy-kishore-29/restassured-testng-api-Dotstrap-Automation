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
| 1 | `POST /v1/accounts` | 201 | 250 | `qa-75a6f4d2-05cb-4dd7-a974-0c958a5bd714` |
| 2 | `POST /v1/auth/token` | 200 | 44 | `qa-5ad73557-424b-4028-9be6-ac996079dd50` |
| 3 | `GET /v1/accounts/me` | 200 | 43 | `qa-78efb6b5-85a1-4254-b094-831a5e06995a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-2cdc7f67-8392-4b9c-b8d0-7a8450eeccbe` |
| 5 | `POST /v1/auth/token` | 401 | 21 | `qa-8e01e550-ab4d-41a3-9c22-6b4878fb862a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-75a6f4d2-05cb-4dd7-a974-0c958a5bd714

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75a6f4d2-05cb-4dd7-a974-0c958a5bd714
Content-Type: application/json

--- request body ---
{"handle":"qa-bd0d85b29419","displayName":"QA bd0d85b29419","password":"****","region":"in"}

--- response: 201 in 250 ms ---
Date: Sat, 31 Oct 2026 08:31:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-75a6f4d2-05cb-4dd7-a974-0c958a5bd714
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
Location: /v1/accounts/qa-bd0d85b29419
X-Served-Region: in
Content-Length: 181

{"id":"acc_4ddc4aea-0b5d-4dec-a981-dc7f7f221025","handle":"qa-bd0d85b29419","displayName":"QA bd0d85b29419","region":"in","role":"user","createdAt":"2026-10-31T08:31:23.872432530Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5ad73557-424b-4028-9be6-ac996079dd50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ad73557-424b-4028-9be6-ac996079dd50
Content-Type: application/json

--- request body ---
{"handle":"qa-bd0d85b29419","password":"****"}

--- response: 200 in 44 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ad73557-424b-4028-9be6-ac996079dd50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ddc4aea-0b5d-4dec-a981-dc7f7f221025"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-78efb6b5-85a1-4254-b094-831a5e06995a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78efb6b5-85a1-4254-b094-831a5e06995a
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-78efb6b5-85a1-4254-b094-831a5e06995a
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

{"id":"acc_4ddc4aea-0b5d-4dec-a981-dc7f7f221025","handle":"qa-bd0d85b29419","displayName":"QA bd0d85b29419","region":"in","role":"user","createdAt":"2026-10-31T08:31:23.872432530Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2cdc7f67-8392-4b9c-b8d0-7a8450eeccbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cdc7f67-8392-4b9c-b8d0-7a8450eeccbe
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2cdc7f67-8392-4b9c-b8d0-7a8450eeccbe
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
correlation: qa-8e01e550-ab4d-41a3-9c22-6b4878fb862a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e01e550-ab4d-41a3-9c22-6b4878fb862a
Content-Type: application/json

--- request body ---
{"handle":"qa-bd0d85b29419","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e01e550-ab4d-41a3-9c22-6b4878fb862a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8e01e550-ab4d-41a3-9c22-6b4878fb862a"}
```
