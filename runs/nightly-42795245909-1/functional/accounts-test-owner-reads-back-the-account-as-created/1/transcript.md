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
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-806568a7-ba4f-46c7-90d8-e43eee387865` |
| 2 | `POST /v1/auth/token` | 200 | 8 | `qa-1681545a-23c4-4aaa-aa2b-acb68aace845` |
| 3 | `GET /v1/accounts/me` | 200 | 4 | `qa-4765fc63-b644-4720-b027-7012a8d28a2b` |
| 4 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-6f9f5188-78ee-45e7-9d3e-2441f42a54da` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-85c66897-7f0c-4ec2-9435-10e3dfd7ba9e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-806568a7-ba4f-46c7-90d8-e43eee387865

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-806568a7-ba4f-46c7-90d8-e43eee387865
Content-Type: application/json

--- request body ---
{"handle":"qa-e16d228b132a","displayName":"QA e16d228b132a","password":"****","region":"in"}

--- response: 201 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-806568a7-ba4f-46c7-90d8-e43eee387865
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-e16d228b132a
X-Served-Region: in
Content-Length: 181

{"id":"acc_12848771-eb16-49fa-9aae-6ea70c8d2482","handle":"qa-e16d228b132a","displayName":"QA e16d228b132a","region":"in","role":"user","createdAt":"2026-11-10T09:59:38.159328749Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1681545a-23c4-4aaa-aa2b-acb68aace845

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1681545a-23c4-4aaa-aa2b-acb68aace845
Content-Type: application/json

--- request body ---
{"handle":"qa-e16d228b132a","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-1681545a-23c4-4aaa-aa2b-acb68aace845
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12848771-eb16-49fa-9aae-6ea70c8d2482"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-4765fc63-b644-4720-b027-7012a8d28a2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4765fc63-b644-4720-b027-7012a8d28a2b
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-4765fc63-b644-4720-b027-7012a8d28a2b
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

{"id":"acc_12848771-eb16-49fa-9aae-6ea70c8d2482","handle":"qa-e16d228b132a","displayName":"QA e16d228b132a","region":"in","role":"user","createdAt":"2026-11-10T09:59:38.159328749Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f9f5188-78ee-45e7-9d3e-2441f42a54da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f9f5188-78ee-45e7-9d3e-2441f42a54da
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f9f5188-78ee-45e7-9d3e-2441f42a54da
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
correlation: qa-85c66897-7f0c-4ec2-9435-10e3dfd7ba9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85c66897-7f0c-4ec2-9435-10e3dfd7ba9e
Content-Type: application/json

--- request body ---
{"handle":"qa-e16d228b132a","password":"****"}

--- response: 401 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85c66897-7f0c-4ec2-9435-10e3dfd7ba9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-85c66897-7f0c-4ec2-9435-10e3dfd7ba9e"}
```
