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
| 1 | `POST /v1/accounts` | 201 | 351 | `qa-273473cf-dfe4-40af-b2af-c5fabd3d5d93` |
| 2 | `POST /v1/auth/token` | 200 | 40 | `qa-eee97bb9-6af0-42e6-8213-6dee6723a4b2` |
| 3 | `GET /v1/accounts/me` | 200 | 49 | `qa-ec67aa45-a1f2-485a-a869-3b94a45e3652` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-018e1150-b99d-433e-bddc-097a1085c68c` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-592cbba7-763a-4381-9233-df923f9e0172` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-273473cf-dfe4-40af-b2af-c5fabd3d5d93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-273473cf-dfe4-40af-b2af-c5fabd3d5d93
Content-Type: application/json

--- request body ---
{"handle":"qa-f69381579194","displayName":"QA f69381579194","password":"****","region":"in"}

--- response: 201 in 351 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-273473cf-dfe4-40af-b2af-c5fabd3d5d93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-f69381579194
X-Served-Region: in
Content-Length: 181

{"id":"acc_6052a1a0-bda6-4303-a9d4-d74d39721dce","handle":"qa-f69381579194","displayName":"QA f69381579194","region":"in","role":"user","createdAt":"2026-11-21T09:57:05.837126253Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-eee97bb9-6af0-42e6-8213-6dee6723a4b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eee97bb9-6af0-42e6-8213-6dee6723a4b2
Content-Type: application/json

--- request body ---
{"handle":"qa-f69381579194","password":"****"}

--- response: 200 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-eee97bb9-6af0-42e6-8213-6dee6723a4b2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6052a1a0-bda6-4303-a9d4-d74d39721dce"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ec67aa45-a1f2-485a-a869-3b94a45e3652

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-ec67aa45-a1f2-485a-a869-3b94a45e3652
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec67aa45-a1f2-485a-a869-3b94a45e3652
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

{"id":"acc_6052a1a0-bda6-4303-a9d4-d74d39721dce","handle":"qa-f69381579194","displayName":"QA f69381579194","region":"in","role":"user","createdAt":"2026-11-21T09:57:05.837126253Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-018e1150-b99d-433e-bddc-097a1085c68c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-018e1150-b99d-433e-bddc-097a1085c68c
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-018e1150-b99d-433e-bddc-097a1085c68c
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
correlation: qa-592cbba7-763a-4381-9233-df923f9e0172

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-592cbba7-763a-4381-9233-df923f9e0172
Content-Type: application/json

--- request body ---
{"handle":"qa-f69381579194","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-592cbba7-763a-4381-9233-df923f9e0172
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-592cbba7-763a-4381-9233-df923f9e0172"}
```
