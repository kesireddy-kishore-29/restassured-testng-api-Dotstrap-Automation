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
| 1 | `POST /v1/accounts` | 201 | 385 | `qa-a763a3ab-276e-4c23-abb5-94e1672d3e65` |
| 2 | `POST /v1/auth/token` | 200 | 55 | `qa-84c4cfc1-6f05-4747-bbbd-c40ef177b99d` |
| 3 | `GET /v1/accounts/me` | 200 | 33 | `qa-96d453a6-1cef-47bd-9120-d3b492b2c5e6` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-795e1e4a-034c-43d9-922d-24e4c9292480` |
| 5 | `POST /v1/auth/token` | 401 | 32 | `qa-1490e2fe-b9ae-4f23-8b87-12a48dec3959` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a763a3ab-276e-4c23-abb5-94e1672d3e65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a763a3ab-276e-4c23-abb5-94e1672d3e65
Content-Type: application/json

--- request body ---
{"handle":"qa-d04148dea7c6","displayName":"QA d04148dea7c6","password":"****","region":"in"}

--- response: 201 in 385 ms ---
Date: Mon, 02 Nov 2026 09:38:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-a763a3ab-276e-4c23-abb5-94e1672d3e65
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
Location: /v1/accounts/qa-d04148dea7c6
X-Served-Region: in
Content-Length: 181

{"id":"acc_1b0e73a5-20b0-4db3-9c32-dbab77a6a381","handle":"qa-d04148dea7c6","displayName":"QA d04148dea7c6","region":"in","role":"user","createdAt":"2026-11-02T09:38:48.636607578Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-84c4cfc1-6f05-4747-bbbd-c40ef177b99d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84c4cfc1-6f05-4747-bbbd-c40ef177b99d
Content-Type: application/json

--- request body ---
{"handle":"qa-d04148dea7c6","password":"****"}

--- response: 200 in 55 ms ---
Date: Mon, 02 Nov 2026 09:38:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-84c4cfc1-6f05-4747-bbbd-c40ef177b99d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b0e73a5-20b0-4db3-9c32-dbab77a6a381"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-96d453a6-1cef-47bd-9120-d3b492b2c5e6

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-96d453a6-1cef-47bd-9120-d3b492b2c5e6
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-96d453a6-1cef-47bd-9120-d3b492b2c5e6
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

{"id":"acc_1b0e73a5-20b0-4db3-9c32-dbab77a6a381","handle":"qa-d04148dea7c6","displayName":"QA d04148dea7c6","region":"in","role":"user","createdAt":"2026-11-02T09:38:48.636607578Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-795e1e4a-034c-43d9-922d-24e4c9292480

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-795e1e4a-034c-43d9-922d-24e4c9292480
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-795e1e4a-034c-43d9-922d-24e4c9292480
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
correlation: qa-1490e2fe-b9ae-4f23-8b87-12a48dec3959

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1490e2fe-b9ae-4f23-8b87-12a48dec3959
Content-Type: application/json

--- request body ---
{"handle":"qa-d04148dea7c6","password":"****"}

--- response: 401 in 32 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1490e2fe-b9ae-4f23-8b87-12a48dec3959
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1490e2fe-b9ae-4f23-8b87-12a48dec3959"}
```
