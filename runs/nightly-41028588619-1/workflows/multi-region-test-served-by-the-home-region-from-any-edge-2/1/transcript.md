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
| 1 | `POST /v1/accounts` | 201 | 551 | `qa-f6e98617-9614-4046-9cfa-a05057085eef` |
| 2 | `POST /v1/auth/token` | 200 | 96 | `qa-8df79c91-e651-407a-950d-1ad2b8a6a03f` |
| 3 | `GET /v1/accounts/me` | 200 | 68 | `qa-a7f04e36-5638-42c0-8208-1742e5923c20` |
| 4 | `DELETE /v1/accounts/me` | 204 | 44 | `qa-0dd1e97c-cc82-4fb7-bd8f-c581c1a16580` |
| 5 | `POST /v1/auth/token` | 401 | 38 | `qa-487bbf1d-e9ef-4e1d-8c9d-a6b440d89b3c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f6e98617-9614-4046-9cfa-a05057085eef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6e98617-9614-4046-9cfa-a05057085eef
Content-Type: application/json

--- request body ---
{"handle":"qa-ce1dbad0855d","displayName":"QA ce1dbad0855d","password":"****","region":"us"}

--- response: 201 in 551 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6e98617-9614-4046-9cfa-a05057085eef
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
Location: /v1/accounts/qa-ce1dbad0855d
X-Served-Region: us
Content-Length: 181

{"id":"acc_7cfa1c99-a7ca-4ce1-a62f-1888626a2a6a","handle":"qa-ce1dbad0855d","displayName":"QA ce1dbad0855d","region":"us","role":"user","createdAt":"2026-10-30T08:46:02.675103386Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8df79c91-e651-407a-950d-1ad2b8a6a03f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8df79c91-e651-407a-950d-1ad2b8a6a03f
Content-Type: application/json

--- request body ---
{"handle":"qa-ce1dbad0855d","password":"****"}

--- response: 200 in 96 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8df79c91-e651-407a-950d-1ad2b8a6a03f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7cfa1c99-a7ca-4ce1-a62f-1888626a2a6a"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7f04e36-5638-42c0-8208-1742e5923c20

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-a7f04e36-5638-42c0-8208-1742e5923c20
Content-Type: application/json

--- response: 200 in 68 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7f04e36-5638-42c0-8208-1742e5923c20
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

{"id":"acc_7cfa1c99-a7ca-4ce1-a62f-1888626a2a6a","handle":"qa-ce1dbad0855d","displayName":"QA ce1dbad0855d","region":"us","role":"user","createdAt":"2026-10-30T08:46:02.675103386Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0dd1e97c-cc82-4fb7-bd8f-c581c1a16580

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dd1e97c-cc82-4fb7-bd8f-c581c1a16580
Content-Type: application/json

--- response: 204 in 44 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0dd1e97c-cc82-4fb7-bd8f-c581c1a16580
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
correlation: qa-487bbf1d-e9ef-4e1d-8c9d-a6b440d89b3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-487bbf1d-e9ef-4e1d-8c9d-a6b440d89b3c
Content-Type: application/json

--- request body ---
{"handle":"qa-ce1dbad0855d","password":"****"}

--- response: 401 in 38 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-487bbf1d-e9ef-4e1d-8c9d-a6b440d89b3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-487bbf1d-e9ef-4e1d-8c9d-a6b440d89b3c"}
```
