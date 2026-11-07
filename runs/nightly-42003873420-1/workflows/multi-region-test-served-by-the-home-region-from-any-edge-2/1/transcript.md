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
| 1 | `POST /v1/accounts` | 201 | 517 | `qa-aaef71af-b7ce-40a9-95da-9e9f4d846ab6` |
| 2 | `POST /v1/auth/token` | 200 | 85 | `qa-f2086277-02a3-4e8e-a46f-e5710a1033b1` |
| 3 | `GET /v1/accounts/me` | 200 | 103 | `qa-06321d09-bbbf-4038-9583-58943a2f5394` |
| 4 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-57df547e-3216-4225-a0c6-7cf495c5a34e` |
| 5 | `POST /v1/auth/token` | 401 | 47 | `qa-f18fd420-6a01-4a06-bcee-3e493fee04f2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aaef71af-b7ce-40a9-95da-9e9f4d846ab6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaef71af-b7ce-40a9-95da-9e9f4d846ab6
Content-Type: application/json

--- request body ---
{"handle":"qa-b186d210e89d","displayName":"QA b186d210e89d","password":"****","region":"us"}

--- response: 201 in 517 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-aaef71af-b7ce-40a9-95da-9e9f4d846ab6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-b186d210e89d
X-Served-Region: us
Content-Length: 181

{"id":"acc_a71ea111-a55b-4a2b-8418-a355a3fb0a66","handle":"qa-b186d210e89d","displayName":"QA b186d210e89d","region":"us","role":"user","createdAt":"2026-11-05T09:37:56.216955044Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f2086277-02a3-4e8e-a46f-e5710a1033b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2086277-02a3-4e8e-a46f-e5710a1033b1
Content-Type: application/json

--- request body ---
{"handle":"qa-b186d210e89d","password":"****"}

--- response: 200 in 85 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2086277-02a3-4e8e-a46f-e5710a1033b1
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a71ea111-a55b-4a2b-8418-a355a3fb0a66"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-06321d09-bbbf-4038-9583-58943a2f5394

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-06321d09-bbbf-4038-9583-58943a2f5394
Content-Type: application/json

--- response: 200 in 103 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-06321d09-bbbf-4038-9583-58943a2f5394
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

{"id":"acc_a71ea111-a55b-4a2b-8418-a355a3fb0a66","handle":"qa-b186d210e89d","displayName":"QA b186d210e89d","region":"us","role":"user","createdAt":"2026-11-05T09:37:56.216955044Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-57df547e-3216-4225-a0c6-7cf495c5a34e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57df547e-3216-4225-a0c6-7cf495c5a34e
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-57df547e-3216-4225-a0c6-7cf495c5a34e
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
correlation: qa-f18fd420-6a01-4a06-bcee-3e493fee04f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f18fd420-6a01-4a06-bcee-3e493fee04f2
Content-Type: application/json

--- request body ---
{"handle":"qa-b186d210e89d","password":"****"}

--- response: 401 in 47 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f18fd420-6a01-4a06-bcee-3e493fee04f2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f18fd420-6a01-4a06-bcee-3e493fee04f2"}
```
