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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-41049942-fc61-4701-9c32-e5016c85e33a` |
| 2 | `POST /v1/auth/token` | 200 | 13 | `qa-b369b165-afa7-4460-84f0-ef326f8f9ad6` |
| 3 | `GET /v1/accounts/me` | 200 | 15 | `qa-ecb2dd67-5a2e-4263-be4a-c9227e5d66d2` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-0150f983-32e5-47c8-8e72-95f84728d1de` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-c482b722-bad8-478a-9360-23521c682341` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-41049942-fc61-4701-9c32-e5016c85e33a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41049942-fc61-4701-9c32-e5016c85e33a
Content-Type: application/json

--- request body ---
{"handle":"qa-54122c7d2bd4","displayName":"QA 54122c7d2bd4","password":"****","region":"in"}

--- response: 201 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-41049942-fc61-4701-9c32-e5016c85e33a
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
Location: /v1/accounts/qa-54122c7d2bd4
X-Served-Region: in
Content-Length: 181

{"id":"acc_656d4c23-7a41-436b-a200-32ea25f02258","handle":"qa-54122c7d2bd4","displayName":"QA 54122c7d2bd4","region":"in","role":"user","createdAt":"2026-11-13T09:42:07.951330485Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b369b165-afa7-4460-84f0-ef326f8f9ad6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b369b165-afa7-4460-84f0-ef326f8f9ad6
Content-Type: application/json

--- request body ---
{"handle":"qa-54122c7d2bd4","password":"****"}

--- response: 200 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b369b165-afa7-4460-84f0-ef326f8f9ad6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_656d4c23-7a41-436b-a200-32ea25f02258"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ecb2dd67-5a2e-4263-be4a-c9227e5d66d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecb2dd67-5a2e-4263-be4a-c9227e5d66d2
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecb2dd67-5a2e-4263-be4a-c9227e5d66d2
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

{"id":"acc_656d4c23-7a41-436b-a200-32ea25f02258","handle":"qa-54122c7d2bd4","displayName":"QA 54122c7d2bd4","region":"in","role":"user","createdAt":"2026-11-13T09:42:07.951330485Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0150f983-32e5-47c8-8e72-95f84728d1de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0150f983-32e5-47c8-8e72-95f84728d1de
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0150f983-32e5-47c8-8e72-95f84728d1de
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
correlation: qa-c482b722-bad8-478a-9360-23521c682341

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c482b722-bad8-478a-9360-23521c682341
Content-Type: application/json

--- request body ---
{"handle":"qa-54122c7d2bd4","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c482b722-bad8-478a-9360-23521c682341
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c482b722-bad8-478a-9360-23521c682341"}
```
