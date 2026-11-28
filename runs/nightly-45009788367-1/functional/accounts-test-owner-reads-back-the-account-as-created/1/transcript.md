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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-32ce57f4-eea1-4786-9d89-e97a322ae087` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-08d3d887-784e-4ee4-bd2a-a36680ff6774` |
| 3 | `GET /v1/accounts/me` | 200 | 12 | `qa-81e0ffe0-e605-4527-8772-ddf906812e18` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-980f60c0-3482-43fa-bc14-087d1c55ead3` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-53d8d287-7cea-4ec7-90e1-735b62bf0eba` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-32ce57f4-eea1-4786-9d89-e97a322ae087

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32ce57f4-eea1-4786-9d89-e97a322ae087
Content-Type: application/json

--- request body ---
{"handle":"qa-36aec9f284e2","displayName":"QA 36aec9f284e2","password":"****","region":"in"}

--- response: 201 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-32ce57f4-eea1-4786-9d89-e97a322ae087
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
Location: /v1/accounts/qa-36aec9f284e2
X-Served-Region: in
Content-Length: 181

{"id":"acc_73e62268-80d3-40f4-a1e1-c2a0fb273610","handle":"qa-36aec9f284e2","displayName":"QA 36aec9f284e2","region":"in","role":"user","createdAt":"2026-11-22T09:54:55.070953246Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-08d3d887-784e-4ee4-bd2a-a36680ff6774

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08d3d887-784e-4ee4-bd2a-a36680ff6774
Content-Type: application/json

--- request body ---
{"handle":"qa-36aec9f284e2","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-08d3d887-784e-4ee4-bd2a-a36680ff6774
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_73e62268-80d3-40f4-a1e1-c2a0fb273610"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-81e0ffe0-e605-4527-8772-ddf906812e18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81e0ffe0-e605-4527-8772-ddf906812e18
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-81e0ffe0-e605-4527-8772-ddf906812e18
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

{"id":"acc_73e62268-80d3-40f4-a1e1-c2a0fb273610","handle":"qa-36aec9f284e2","displayName":"QA 36aec9f284e2","region":"in","role":"user","createdAt":"2026-11-22T09:54:55.070953246Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-980f60c0-3482-43fa-bc14-087d1c55ead3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-980f60c0-3482-43fa-bc14-087d1c55ead3
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-980f60c0-3482-43fa-bc14-087d1c55ead3
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
correlation: qa-53d8d287-7cea-4ec7-90e1-735b62bf0eba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53d8d287-7cea-4ec7-90e1-735b62bf0eba
Content-Type: application/json

--- request body ---
{"handle":"qa-36aec9f284e2","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53d8d287-7cea-4ec7-90e1-735b62bf0eba
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-53d8d287-7cea-4ec7-90e1-735b62bf0eba"}
```
