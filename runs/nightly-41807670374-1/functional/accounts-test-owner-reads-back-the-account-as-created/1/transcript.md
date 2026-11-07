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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-82d08db3-5c5a-4636-8987-c7919e2fda1d` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-7494d911-9f22-4ca4-99cf-43a2edb03b89` |
| 3 | `GET /v1/accounts/me` | 200 | 9 | `qa-92eb9db0-1f93-407c-b336-62b92be278e6` |
| 4 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-32ea96d0-e3a3-4de7-8ada-ad9e5c458766` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-22c45e5d-f453-4600-9a4d-ce839ae599bf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-82d08db3-5c5a-4636-8987-c7919e2fda1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82d08db3-5c5a-4636-8987-c7919e2fda1d
Content-Type: application/json

--- request body ---
{"handle":"qa-cae0f885616c","displayName":"QA cae0f885616c","password":"****","region":"in"}

--- response: 201 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-82d08db3-5c5a-4636-8987-c7919e2fda1d
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
Location: /v1/accounts/qa-cae0f885616c
X-Served-Region: in
Content-Length: 181

{"id":"acc_86fb6b3a-b9bb-4209-8e81-82b2541c27bd","handle":"qa-cae0f885616c","displayName":"QA cae0f885616c","region":"in","role":"user","createdAt":"2026-11-04T09:28:15.238731551Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7494d911-9f22-4ca4-99cf-43a2edb03b89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7494d911-9f22-4ca4-99cf-43a2edb03b89
Content-Type: application/json

--- request body ---
{"handle":"qa-cae0f885616c","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-7494d911-9f22-4ca4-99cf-43a2edb03b89
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_86fb6b3a-b9bb-4209-8e81-82b2541c27bd"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-92eb9db0-1f93-407c-b336-62b92be278e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92eb9db0-1f93-407c-b336-62b92be278e6
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-92eb9db0-1f93-407c-b336-62b92be278e6
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

{"id":"acc_86fb6b3a-b9bb-4209-8e81-82b2541c27bd","handle":"qa-cae0f885616c","displayName":"QA cae0f885616c","region":"in","role":"user","createdAt":"2026-11-04T09:28:15.238731551Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-32ea96d0-e3a3-4de7-8ada-ad9e5c458766

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32ea96d0-e3a3-4de7-8ada-ad9e5c458766
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-32ea96d0-e3a3-4de7-8ada-ad9e5c458766
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
correlation: qa-22c45e5d-f453-4600-9a4d-ce839ae599bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22c45e5d-f453-4600-9a4d-ce839ae599bf
Content-Type: application/json

--- request body ---
{"handle":"qa-cae0f885616c","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22c45e5d-f453-4600-9a4d-ce839ae599bf
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22c45e5d-f453-4600-9a4d-ce839ae599bf"}
```
