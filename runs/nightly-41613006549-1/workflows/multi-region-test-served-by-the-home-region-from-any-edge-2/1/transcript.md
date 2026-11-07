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
| 1 | `POST /v1/accounts` | 201 | 298 | `qa-34597247-f896-4d26-b839-4d274d9ff4a9` |
| 2 | `POST /v1/auth/token` | 200 | 77 | `qa-35a7a91f-afc3-40fe-a344-d0d9c08f6e77` |
| 3 | `GET /v1/accounts/me` | 200 | 56 | `qa-00518b4d-c6ce-4e3b-bcb6-5de9063db6cc` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-57ba2cf4-59ee-4476-9d42-c7897a3aa4b9` |
| 5 | `POST /v1/auth/token` | 401 | 25 | `qa-8bb6c318-cf62-4afe-921c-6d440b25e19e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-34597247-f896-4d26-b839-4d274d9ff4a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34597247-f896-4d26-b839-4d274d9ff4a9
Content-Type: application/json

--- request body ---
{"handle":"qa-3207e0aff022","displayName":"QA 3207e0aff022","password":"****","region":"us"}

--- response: 201 in 298 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-34597247-f896-4d26-b839-4d274d9ff4a9
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
Location: /v1/accounts/qa-3207e0aff022
X-Served-Region: us
Content-Length: 181

{"id":"acc_fbd1524a-0047-4912-942c-29a8ed93430a","handle":"qa-3207e0aff022","displayName":"QA 3207e0aff022","region":"us","role":"user","createdAt":"2026-11-03T09:41:33.461344171Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-35a7a91f-afc3-40fe-a344-d0d9c08f6e77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35a7a91f-afc3-40fe-a344-d0d9c08f6e77
Content-Type: application/json

--- request body ---
{"handle":"qa-3207e0aff022","password":"****"}

--- response: 200 in 77 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-35a7a91f-afc3-40fe-a344-d0d9c08f6e77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fbd1524a-0047-4912-942c-29a8ed93430a"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-00518b4d-c6ce-4e3b-bcb6-5de9063db6cc

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-00518b4d-c6ce-4e3b-bcb6-5de9063db6cc
Content-Type: application/json

--- response: 200 in 56 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-00518b4d-c6ce-4e3b-bcb6-5de9063db6cc
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

{"id":"acc_fbd1524a-0047-4912-942c-29a8ed93430a","handle":"qa-3207e0aff022","displayName":"QA 3207e0aff022","region":"us","role":"user","createdAt":"2026-11-03T09:41:33.461344171Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-57ba2cf4-59ee-4476-9d42-c7897a3aa4b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57ba2cf4-59ee-4476-9d42-c7897a3aa4b9
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-57ba2cf4-59ee-4476-9d42-c7897a3aa4b9
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
correlation: qa-8bb6c318-cf62-4afe-921c-6d440b25e19e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bb6c318-cf62-4afe-921c-6d440b25e19e
Content-Type: application/json

--- request body ---
{"handle":"qa-3207e0aff022","password":"****"}

--- response: 401 in 25 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bb6c318-cf62-4afe-921c-6d440b25e19e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8bb6c318-cf62-4afe-921c-6d440b25e19e"}
```
