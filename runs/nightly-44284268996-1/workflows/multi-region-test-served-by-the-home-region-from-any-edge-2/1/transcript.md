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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-d439ea02-02c4-4235-84fe-44299ce522c0` |
| 2 | `POST /v1/auth/token` | 200 | 13 | `qa-b9f04951-c58d-49db-97ce-5e14fc902d5c` |
| 3 | `GET /v1/accounts/me` | 200 | 11 | `qa-c48e4b4e-433f-4bdc-9c30-01d1a304fcbf` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-4e9fa52f-f997-4980-aaf1-e780cc82fbad` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-8d7f00c4-e7b6-42e7-968a-cfdc324bd36e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d439ea02-02c4-4235-84fe-44299ce522c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d439ea02-02c4-4235-84fe-44299ce522c0
Content-Type: application/json

--- request body ---
{"handle":"qa-078a9d2efb8d","displayName":"QA 078a9d2efb8d","password":"****","region":"us"}

--- response: 201 in 24 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-d439ea02-02c4-4235-84fe-44299ce522c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-078a9d2efb8d
X-Served-Region: us
Content-Length: 181

{"id":"acc_bc7e0e52-6858-4bd0-827a-442e48e80c83","handle":"qa-078a9d2efb8d","displayName":"QA 078a9d2efb8d","region":"us","role":"user","createdAt":"2026-11-18T10:19:40.550354717Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b9f04951-c58d-49db-97ce-5e14fc902d5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9f04951-c58d-49db-97ce-5e14fc902d5c
Content-Type: application/json

--- request body ---
{"handle":"qa-078a9d2efb8d","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9f04951-c58d-49db-97ce-5e14fc902d5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bc7e0e52-6858-4bd0-827a-442e48e80c83"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-c48e4b4e-433f-4bdc-9c30-01d1a304fcbf

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-c48e4b4e-433f-4bdc-9c30-01d1a304fcbf
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-c48e4b4e-433f-4bdc-9c30-01d1a304fcbf
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

{"id":"acc_bc7e0e52-6858-4bd0-827a-442e48e80c83","handle":"qa-078a9d2efb8d","displayName":"QA 078a9d2efb8d","region":"us","role":"user","createdAt":"2026-11-18T10:19:40.550354717Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4e9fa52f-f997-4980-aaf1-e780cc82fbad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e9fa52f-f997-4980-aaf1-e780cc82fbad
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4e9fa52f-f997-4980-aaf1-e780cc82fbad
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
correlation: qa-8d7f00c4-e7b6-42e7-968a-cfdc324bd36e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d7f00c4-e7b6-42e7-968a-cfdc324bd36e
Content-Type: application/json

--- request body ---
{"handle":"qa-078a9d2efb8d","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d7f00c4-e7b6-42e7-968a-cfdc324bd36e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8d7f00c4-e7b6-42e7-968a-cfdc324bd36e"}
```
