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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-93c1be80-49ec-4ff5-a191-6cb82fc208ef` |
| 2 | `POST /v1/auth/token` | 200 | 32 | `qa-e3e2e8ee-7f01-4f2f-b47c-d580a2be7e43` |
| 3 | `GET /v1/accounts/me` | 200 | 13 | `qa-e11c56df-d6a4-4e72-a7c0-85770e310fb4` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-cd89119a-73be-468f-8cb1-c54a9080a70d` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-43d14712-f3cb-455c-96db-aed93fec5e5e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-93c1be80-49ec-4ff5-a191-6cb82fc208ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93c1be80-49ec-4ff5-a191-6cb82fc208ef
Content-Type: application/json

--- request body ---
{"handle":"qa-f78b60513895","displayName":"QA f78b60513895","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-93c1be80-49ec-4ff5-a191-6cb82fc208ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-f78b60513895
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a361376d-2c70-4fc4-9fb2-81e5578917ea","handle":"qa-f78b60513895","displayName":"QA f78b60513895","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.405538329Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e3e2e8ee-7f01-4f2f-b47c-d580a2be7e43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3e2e8ee-7f01-4f2f-b47c-d580a2be7e43
Content-Type: application/json

--- request body ---
{"handle":"qa-f78b60513895","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3e2e8ee-7f01-4f2f-b47c-d580a2be7e43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a361376d-2c70-4fc4-9fb2-81e5578917ea"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-e11c56df-d6a4-4e72-a7c0-85770e310fb4

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-e11c56df-d6a4-4e72-a7c0-85770e310fb4
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e11c56df-d6a4-4e72-a7c0-85770e310fb4
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

{"id":"acc_a361376d-2c70-4fc4-9fb2-81e5578917ea","handle":"qa-f78b60513895","displayName":"QA f78b60513895","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.405538329Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd89119a-73be-468f-8cb1-c54a9080a70d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd89119a-73be-468f-8cb1-c54a9080a70d
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd89119a-73be-468f-8cb1-c54a9080a70d
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
correlation: qa-43d14712-f3cb-455c-96db-aed93fec5e5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43d14712-f3cb-455c-96db-aed93fec5e5e
Content-Type: application/json

--- request body ---
{"handle":"qa-f78b60513895","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43d14712-f3cb-455c-96db-aed93fec5e5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-43d14712-f3cb-455c-96db-aed93fec5e5e"}
```
