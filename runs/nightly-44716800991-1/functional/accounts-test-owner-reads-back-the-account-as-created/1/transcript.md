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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-cb72d148-0fa0-4de7-98f9-a19a8cc78fc7` |
| 2 | `POST /v1/auth/token` | 200 | 13 | `qa-e4f60ee8-8dc4-4ad0-ac00-0a163d45dfa4` |
| 3 | `GET /v1/accounts/me` | 200 | 8 | `qa-845576c9-54c8-45cc-93a7-e5c5d750f47e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-24c94269-5c39-4353-94b0-743b6df0c784` |
| 5 | `POST /v1/auth/token` | 401 | 17 | `qa-ed20ad05-2ef7-438c-9ac7-d1ee625ecde6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cb72d148-0fa0-4de7-98f9-a19a8cc78fc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb72d148-0fa0-4de7-98f9-a19a8cc78fc7
Content-Type: application/json

--- request body ---
{"handle":"qa-bca7f9ee2aa8","displayName":"QA bca7f9ee2aa8","password":"****","region":"in"}

--- response: 201 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb72d148-0fa0-4de7-98f9-a19a8cc78fc7
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
Location: /v1/accounts/qa-bca7f9ee2aa8
X-Served-Region: in
Content-Length: 181

{"id":"acc_0c1cdb0f-7e3e-4e64-9cd7-dd661f711257","handle":"qa-bca7f9ee2aa8","displayName":"QA bca7f9ee2aa8","region":"in","role":"user","createdAt":"2026-11-20T10:10:01.462346272Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e4f60ee8-8dc4-4ad0-ac00-0a163d45dfa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4f60ee8-8dc4-4ad0-ac00-0a163d45dfa4
Content-Type: application/json

--- request body ---
{"handle":"qa-bca7f9ee2aa8","password":"****"}

--- response: 200 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4f60ee8-8dc4-4ad0-ac00-0a163d45dfa4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0c1cdb0f-7e3e-4e64-9cd7-dd661f711257"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-845576c9-54c8-45cc-93a7-e5c5d750f47e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-845576c9-54c8-45cc-93a7-e5c5d750f47e
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-845576c9-54c8-45cc-93a7-e5c5d750f47e
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

{"id":"acc_0c1cdb0f-7e3e-4e64-9cd7-dd661f711257","handle":"qa-bca7f9ee2aa8","displayName":"QA bca7f9ee2aa8","region":"in","role":"user","createdAt":"2026-11-20T10:10:01.462346272Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-24c94269-5c39-4353-94b0-743b6df0c784

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24c94269-5c39-4353-94b0-743b6df0c784
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-24c94269-5c39-4353-94b0-743b6df0c784
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
correlation: qa-ed20ad05-2ef7-438c-9ac7-d1ee625ecde6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed20ad05-2ef7-438c-9ac7-d1ee625ecde6
Content-Type: application/json

--- request body ---
{"handle":"qa-bca7f9ee2aa8","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed20ad05-2ef7-438c-9ac7-d1ee625ecde6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ed20ad05-2ef7-438c-9ac7-d1ee625ecde6"}
```
