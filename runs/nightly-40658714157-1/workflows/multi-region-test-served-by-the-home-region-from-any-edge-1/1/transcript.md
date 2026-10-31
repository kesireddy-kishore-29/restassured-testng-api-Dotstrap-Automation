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
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-aa173d6e-9c9f-4023-bdee-ec799de21511` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-01b9ed00-b297-4d18-a132-1e2879999b6d` |
| 3 | `GET /v1/accounts/me` | 200 | 15 | `qa-bb00d76b-1c3e-4705-be6b-c754ba90ebb0` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-8d67cb70-a793-485c-8c8c-0b3e00d12210` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-f4ba94d8-3a0d-4396-8024-b7eba3f92588` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aa173d6e-9c9f-4023-bdee-ec799de21511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa173d6e-9c9f-4023-bdee-ec799de21511
Content-Type: application/json

--- request body ---
{"handle":"qa-f0792938d2bb","displayName":"QA f0792938d2bb","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa173d6e-9c9f-4023-bdee-ec799de21511
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-f0792938d2bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a77b3835-cbbc-45c4-9d9d-921cd7bd6b3a","handle":"qa-f0792938d2bb","displayName":"QA f0792938d2bb","region":"eu","role":"user","createdAt":"2026-10-28T08:42:55.716352875Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-01b9ed00-b297-4d18-a132-1e2879999b6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01b9ed00-b297-4d18-a132-1e2879999b6d
Content-Type: application/json

--- request body ---
{"handle":"qa-f0792938d2bb","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-01b9ed00-b297-4d18-a132-1e2879999b6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a77b3835-cbbc-45c4-9d9d-921cd7bd6b3a"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb00d76b-1c3e-4705-be6b-c754ba90ebb0

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-bb00d76b-1c3e-4705-be6b-c754ba90ebb0
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb00d76b-1c3e-4705-be6b-c754ba90ebb0
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

{"id":"acc_a77b3835-cbbc-45c4-9d9d-921cd7bd6b3a","handle":"qa-f0792938d2bb","displayName":"QA f0792938d2bb","region":"eu","role":"user","createdAt":"2026-10-28T08:42:55.716352875Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8d67cb70-a793-485c-8c8c-0b3e00d12210

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d67cb70-a793-485c-8c8c-0b3e00d12210
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8d67cb70-a793-485c-8c8c-0b3e00d12210
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
correlation: qa-f4ba94d8-3a0d-4396-8024-b7eba3f92588

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4ba94d8-3a0d-4396-8024-b7eba3f92588
Content-Type: application/json

--- request body ---
{"handle":"qa-f0792938d2bb","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4ba94d8-3a0d-4396-8024-b7eba3f92588
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f4ba94d8-3a0d-4396-8024-b7eba3f92588"}
```
