# Transcript: Requests are served by the home region, whichever edge they arrive at [IN, eu]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[0]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 492 | `qa-2598f99e-8620-425c-a97a-08c4a899779b` |
| 2 | `POST /v1/auth/token` | 200 | 24 | `qa-80d41dc8-b28b-4759-bf8d-b5f015013140` |
| 3 | `GET /v1/accounts/me` | 200 | 59 | `qa-5b9af8b9-b5db-486f-a2cc-2b6cc865adb4` |
| 4 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-6a06a725-bdb4-4299-88b8-817c52043a53` |
| 5 | `POST /v1/auth/token` | 401 | 30 | `qa-cea6a2fe-10e7-40fd-ad23-399237b20f48` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2598f99e-8620-425c-a97a-08c4a899779b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2598f99e-8620-425c-a97a-08c4a899779b
Content-Type: application/json

--- request body ---
{"handle":"qa-b20bc21b1210","displayName":"QA b20bc21b1210","password":"****","region":"in"}

--- response: 201 in 492 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-2598f99e-8620-425c-a97a-08c4a899779b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 11
Location: /v1/accounts/qa-b20bc21b1210
X-Served-Region: in
Content-Length: 181

{"id":"acc_e775161c-2174-4212-8de1-00386273635d","handle":"qa-b20bc21b1210","displayName":"QA b20bc21b1210","region":"in","role":"user","createdAt":"2026-11-22T09:54:48.397688893Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-80d41dc8-b28b-4759-bf8d-b5f015013140

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80d41dc8-b28b-4759-bf8d-b5f015013140
Content-Type: application/json

--- request body ---
{"handle":"qa-b20bc21b1210","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-80d41dc8-b28b-4759-bf8d-b5f015013140
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e775161c-2174-4212-8de1-00386273635d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b9af8b9-b5db-486f-a2cc-2b6cc865adb4

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-5b9af8b9-b5db-486f-a2cc-2b6cc865adb4
Content-Type: application/json

--- response: 200 in 59 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b9af8b9-b5db-486f-a2cc-2b6cc865adb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: eu
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 181

{"id":"acc_e775161c-2174-4212-8de1-00386273635d","handle":"qa-b20bc21b1210","displayName":"QA b20bc21b1210","region":"in","role":"user","createdAt":"2026-11-22T09:54:48.397688893Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6a06a725-bdb4-4299-88b8-817c52043a53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a06a725-bdb4-4299-88b8-817c52043a53
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6a06a725-bdb4-4299-88b8-817c52043a53
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
correlation: qa-cea6a2fe-10e7-40fd-ad23-399237b20f48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cea6a2fe-10e7-40fd-ad23-399237b20f48
Content-Type: application/json

--- request body ---
{"handle":"qa-b20bc21b1210","password":"****"}

--- response: 401 in 30 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cea6a2fe-10e7-40fd-ad23-399237b20f48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cea6a2fe-10e7-40fd-ad23-399237b20f48"}
```
