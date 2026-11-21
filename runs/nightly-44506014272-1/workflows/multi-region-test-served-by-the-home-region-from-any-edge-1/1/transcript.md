# Transcript: Requests are served by the home region, whichever edge they arrive at [EU, us]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[1]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 501 | `qa-f7fec97f-9323-402e-93f1-c7033bb3f910` |
| 2 | `POST /v1/auth/token` | 200 | 80 | `qa-ddf3933e-7b57-4552-9aed-243b0579c334` |
| 3 | `GET /v1/accounts/me` | 200 | 57 | `qa-d07c7870-539a-43b6-b9c0-1f4655cae5d5` |
| 4 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-461544f8-d293-4565-a006-4c5dd7970840` |
| 5 | `POST /v1/auth/token` | 401 | 26 | `qa-d63907c7-bae6-45c2-af31-9913c084df0e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f7fec97f-9323-402e-93f1-c7033bb3f910

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7fec97f-9323-402e-93f1-c7033bb3f910
Content-Type: application/json

--- request body ---
{"handle":"qa-ef0b71a05a19","displayName":"QA ef0b71a05a19","password":"****","region":"eu"}

--- response: 201 in 501 ms ---
Date: Thu, 19 Nov 2026 10:29:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7fec97f-9323-402e-93f1-c7033bb3f910
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-ef0b71a05a19
X-Served-Region: eu
Content-Length: 181

{"id":"acc_87c27df6-b465-44d9-8520-c66fb9e8bb57","handle":"qa-ef0b71a05a19","displayName":"QA ef0b71a05a19","region":"eu","role":"user","createdAt":"2026-11-19T10:29:44.344320379Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ddf3933e-7b57-4552-9aed-243b0579c334

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddf3933e-7b57-4552-9aed-243b0579c334
Content-Type: application/json

--- request body ---
{"handle":"qa-ef0b71a05a19","password":"****"}

--- response: 200 in 80 ms ---
Date: Thu, 19 Nov 2026 10:29:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddf3933e-7b57-4552-9aed-243b0579c334
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_87c27df6-b465-44d9-8520-c66fb9e8bb57"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d07c7870-539a-43b6-b9c0-1f4655cae5d5

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-d07c7870-539a-43b6-b9c0-1f4655cae5d5
Content-Type: application/json

--- response: 200 in 57 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d07c7870-539a-43b6-b9c0-1f4655cae5d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: us
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_87c27df6-b465-44d9-8520-c66fb9e8bb57","handle":"qa-ef0b71a05a19","displayName":"QA ef0b71a05a19","region":"eu","role":"user","createdAt":"2026-11-19T10:29:44.344320379Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-461544f8-d293-4565-a006-4c5dd7970840

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-461544f8-d293-4565-a006-4c5dd7970840
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-461544f8-d293-4565-a006-4c5dd7970840
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
X-Served-Region: eu
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-d63907c7-bae6-45c2-af31-9913c084df0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d63907c7-bae6-45c2-af31-9913c084df0e
Content-Type: application/json

--- request body ---
{"handle":"qa-ef0b71a05a19","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d63907c7-bae6-45c2-af31-9913c084df0e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d63907c7-bae6-45c2-af31-9913c084df0e"}
```
