# Transcript: Requests are served by the home region, whichever edge they arrive at [US, in]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[2]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-40b4db3a-c5e8-414c-8e50-af913288e23d` |
| 2 | `POST /v1/auth/token` | 200 | 13 | `qa-2da0126a-7d86-4f60-865a-c34ebec7916a` |
| 3 | `GET /v1/accounts/me` | 200 | 12 | `qa-c21bd571-9d0f-4929-9daa-1873a57069b8` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-a3664e99-9ef2-444b-af91-bab4884f0a07` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-9dd5f551-03a1-4841-86ec-1634904a7460` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-40b4db3a-c5e8-414c-8e50-af913288e23d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40b4db3a-c5e8-414c-8e50-af913288e23d
Content-Type: application/json

--- request body ---
{"handle":"qa-b59b3142cc7a","displayName":"QA b59b3142cc7a","password":"****","region":"us"}

--- response: 201 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-40b4db3a-c5e8-414c-8e50-af913288e23d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-b59b3142cc7a
X-Served-Region: us
Content-Length: 181

{"id":"acc_22584607-471c-4045-b44a-b1897a9398b9","handle":"qa-b59b3142cc7a","displayName":"QA b59b3142cc7a","region":"us","role":"user","createdAt":"2026-10-28T08:42:55.719164013Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2da0126a-7d86-4f60-865a-c34ebec7916a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2da0126a-7d86-4f60-865a-c34ebec7916a
Content-Type: application/json

--- request body ---
{"handle":"qa-b59b3142cc7a","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-2da0126a-7d86-4f60-865a-c34ebec7916a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22584607-471c-4045-b44a-b1897a9398b9"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-c21bd571-9d0f-4929-9daa-1873a57069b8

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-c21bd571-9d0f-4929-9daa-1873a57069b8
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-c21bd571-9d0f-4929-9daa-1873a57069b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: in
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 181

{"id":"acc_22584607-471c-4045-b44a-b1897a9398b9","handle":"qa-b59b3142cc7a","displayName":"QA b59b3142cc7a","region":"us","role":"user","createdAt":"2026-10-28T08:42:55.719164013Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a3664e99-9ef2-444b-af91-bab4884f0a07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3664e99-9ef2-444b-af91-bab4884f0a07
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a3664e99-9ef2-444b-af91-bab4884f0a07
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
X-Served-Region: us
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9dd5f551-03a1-4841-86ec-1634904a7460

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dd5f551-03a1-4841-86ec-1634904a7460
Content-Type: application/json

--- request body ---
{"handle":"qa-b59b3142cc7a","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9dd5f551-03a1-4841-86ec-1634904a7460
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9dd5f551-03a1-4841-86ec-1634904a7460"}
```
