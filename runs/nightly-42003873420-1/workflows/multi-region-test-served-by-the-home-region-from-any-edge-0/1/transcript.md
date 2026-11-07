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
| 1 | `POST /v1/accounts` | 201 | 518 | `qa-d49f5239-7b7c-4bb4-a623-2d7ec9406451` |
| 2 | `POST /v1/auth/token` | 200 | 107 | `qa-c32b00fb-67c3-4331-a985-7f049109bafe` |
| 3 | `GET /v1/accounts/me` | 200 | 100 | `qa-fb47e8bf-6199-47ee-a04e-e74c03520acc` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-715176c1-e080-4b6a-8984-814e60ff0147` |
| 5 | `POST /v1/auth/token` | 401 | 35 | `qa-6c6cff72-9b08-4d3d-8a76-ec06328f9aa6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d49f5239-7b7c-4bb4-a623-2d7ec9406451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d49f5239-7b7c-4bb4-a623-2d7ec9406451
Content-Type: application/json

--- request body ---
{"handle":"qa-c4b6c1f91f72","displayName":"QA c4b6c1f91f72","password":"****","region":"in"}

--- response: 201 in 518 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d49f5239-7b7c-4bb4-a623-2d7ec9406451
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-c4b6c1f91f72
X-Served-Region: in
Content-Length: 181

{"id":"acc_65c372be-0a88-40e4-b18b-3d74ae6d2525","handle":"qa-c4b6c1f91f72","displayName":"QA c4b6c1f91f72","region":"in","role":"user","createdAt":"2026-11-05T09:37:56.223827536Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c32b00fb-67c3-4331-a985-7f049109bafe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c32b00fb-67c3-4331-a985-7f049109bafe
Content-Type: application/json

--- request body ---
{"handle":"qa-c4b6c1f91f72","password":"****"}

--- response: 200 in 107 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-c32b00fb-67c3-4331-a985-7f049109bafe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65c372be-0a88-40e4-b18b-3d74ae6d2525"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-fb47e8bf-6199-47ee-a04e-e74c03520acc

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-fb47e8bf-6199-47ee-a04e-e74c03520acc
Content-Type: application/json

--- response: 200 in 100 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb47e8bf-6199-47ee-a04e-e74c03520acc
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

{"id":"acc_65c372be-0a88-40e4-b18b-3d74ae6d2525","handle":"qa-c4b6c1f91f72","displayName":"QA c4b6c1f91f72","region":"in","role":"user","createdAt":"2026-11-05T09:37:56.223827536Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-715176c1-e080-4b6a-8984-814e60ff0147

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-715176c1-e080-4b6a-8984-814e60ff0147
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-715176c1-e080-4b6a-8984-814e60ff0147
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
correlation: qa-6c6cff72-9b08-4d3d-8a76-ec06328f9aa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c6cff72-9b08-4d3d-8a76-ec06328f9aa6
Content-Type: application/json

--- request body ---
{"handle":"qa-c4b6c1f91f72","password":"****"}

--- response: 401 in 35 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c6cff72-9b08-4d3d-8a76-ec06328f9aa6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6c6cff72-9b08-4d3d-8a76-ec06328f9aa6"}
```
