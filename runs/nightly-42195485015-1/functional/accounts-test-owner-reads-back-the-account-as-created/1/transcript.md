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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-488aa532-f13f-4eb3-9223-8ce4148ba903` |
| 2 | `POST /v1/auth/token` | 200 | 27 | `qa-c8e7a630-aa4c-4116-b1f5-8bd49f67036d` |
| 3 | `GET /v1/accounts/me` | 200 | 8 | `qa-ef6d1722-0d43-4504-83ea-339903b31d86` |
| 4 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-71971083-3b29-4b6d-97f7-317fef80be91` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-18701e06-559f-4a2a-87e1-d6aed3ce9c93` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-488aa532-f13f-4eb3-9223-8ce4148ba903

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-488aa532-f13f-4eb3-9223-8ce4148ba903
Content-Type: application/json

--- request body ---
{"handle":"qa-932d150388ac","displayName":"QA 932d150388ac","password":"****","region":"in"}

--- response: 201 in 27 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-488aa532-f13f-4eb3-9223-8ce4148ba903
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
Location: /v1/accounts/qa-932d150388ac
X-Served-Region: in
Content-Length: 181

{"id":"acc_5f0e5dd1-a5d7-4dbe-9003-50d4cedf7551","handle":"qa-932d150388ac","displayName":"QA 932d150388ac","region":"in","role":"user","createdAt":"2026-11-06T09:30:33.211329679Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c8e7a630-aa4c-4116-b1f5-8bd49f67036d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8e7a630-aa4c-4116-b1f5-8bd49f67036d
Content-Type: application/json

--- request body ---
{"handle":"qa-932d150388ac","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8e7a630-aa4c-4116-b1f5-8bd49f67036d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5f0e5dd1-a5d7-4dbe-9003-50d4cedf7551"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef6d1722-0d43-4504-83ea-339903b31d86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef6d1722-0d43-4504-83ea-339903b31d86
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef6d1722-0d43-4504-83ea-339903b31d86
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

{"id":"acc_5f0e5dd1-a5d7-4dbe-9003-50d4cedf7551","handle":"qa-932d150388ac","displayName":"QA 932d150388ac","region":"in","role":"user","createdAt":"2026-11-06T09:30:33.211329679Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-71971083-3b29-4b6d-97f7-317fef80be91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71971083-3b29-4b6d-97f7-317fef80be91
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-71971083-3b29-4b6d-97f7-317fef80be91
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
correlation: qa-18701e06-559f-4a2a-87e1-d6aed3ce9c93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18701e06-559f-4a2a-87e1-d6aed3ce9c93
Content-Type: application/json

--- request body ---
{"handle":"qa-932d150388ac","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18701e06-559f-4a2a-87e1-d6aed3ce9c93
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-18701e06-559f-4a2a-87e1-d6aed3ce9c93"}
```
