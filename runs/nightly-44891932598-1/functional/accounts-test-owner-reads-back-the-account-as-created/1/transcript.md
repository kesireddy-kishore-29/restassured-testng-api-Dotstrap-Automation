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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-68bcce36-666c-4516-9e93-cd399f473a78` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-a882f80e-565f-44f4-b565-cd7eff5ac65e` |
| 3 | `GET /v1/accounts/me` | 200 | 4 | `qa-12cb3dd6-5202-47e7-81f7-6231e5a80664` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-1e0f8ccd-c590-4755-b3c0-618c9c52bd91` |
| 5 | `POST /v1/auth/token` | 401 | 14 | `qa-211df7fb-e2c4-4aa7-99a4-10f7c08fa525` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-68bcce36-666c-4516-9e93-cd399f473a78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68bcce36-666c-4516-9e93-cd399f473a78
Content-Type: application/json

--- request body ---
{"handle":"qa-4d06b26f4f99","displayName":"QA 4d06b26f4f99","password":"****","region":"in"}

--- response: 201 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-68bcce36-666c-4516-9e93-cd399f473a78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-4d06b26f4f99
X-Served-Region: in
Content-Length: 181

{"id":"acc_1b99a52a-fcef-4ff8-8716-da7accf58418","handle":"qa-4d06b26f4f99","displayName":"QA 4d06b26f4f99","region":"in","role":"user","createdAt":"2026-11-21T09:57:10.275256367Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a882f80e-565f-44f4-b565-cd7eff5ac65e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a882f80e-565f-44f4-b565-cd7eff5ac65e
Content-Type: application/json

--- request body ---
{"handle":"qa-4d06b26f4f99","password":"****"}

--- response: 200 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a882f80e-565f-44f4-b565-cd7eff5ac65e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b99a52a-fcef-4ff8-8716-da7accf58418"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-12cb3dd6-5202-47e7-81f7-6231e5a80664

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12cb3dd6-5202-47e7-81f7-6231e5a80664
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-12cb3dd6-5202-47e7-81f7-6231e5a80664
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

{"id":"acc_1b99a52a-fcef-4ff8-8716-da7accf58418","handle":"qa-4d06b26f4f99","displayName":"QA 4d06b26f4f99","region":"in","role":"user","createdAt":"2026-11-21T09:57:10.275256367Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1e0f8ccd-c590-4755-b3c0-618c9c52bd91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e0f8ccd-c590-4755-b3c0-618c9c52bd91
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1e0f8ccd-c590-4755-b3c0-618c9c52bd91
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
correlation: qa-211df7fb-e2c4-4aa7-99a4-10f7c08fa525

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-211df7fb-e2c4-4aa7-99a4-10f7c08fa525
Content-Type: application/json

--- request body ---
{"handle":"qa-4d06b26f4f99","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-211df7fb-e2c4-4aa7-99a4-10f7c08fa525
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-211df7fb-e2c4-4aa7-99a4-10f7c08fa525"}
```
