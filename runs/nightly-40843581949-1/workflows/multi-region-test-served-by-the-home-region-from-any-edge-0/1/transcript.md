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
| 1 | `POST /v1/accounts` | 201 | 487 | `qa-a9570b6a-71ea-45b2-bf43-9aeccac8efd4` |
| 2 | `POST /v1/auth/token` | 200 | 93 | `qa-5c69fa75-2a10-4ccb-a626-882ae10ea7b3` |
| 3 | `GET /v1/accounts/me` | 200 | 60 | `qa-64018b9b-a804-4d8f-83dd-072ac15b76d2` |
| 4 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-40c35ff4-162c-4016-b8a9-8438abd67092` |
| 5 | `POST /v1/auth/token` | 401 | 56 | `qa-7684bf94-2f63-4c5c-b0ec-fed3c6b32897` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a9570b6a-71ea-45b2-bf43-9aeccac8efd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9570b6a-71ea-45b2-bf43-9aeccac8efd4
Content-Type: application/json

--- request body ---
{"handle":"qa-c743508de2e1","displayName":"QA c743508de2e1","password":"****","region":"in"}

--- response: 201 in 487 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9570b6a-71ea-45b2-bf43-9aeccac8efd4
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
Location: /v1/accounts/qa-c743508de2e1
X-Served-Region: in
Content-Length: 181

{"id":"acc_3dbef68f-b65c-4bbe-9d86-eafd4502a293","handle":"qa-c743508de2e1","displayName":"QA c743508de2e1","region":"in","role":"user","createdAt":"2026-10-29T08:38:57.223185666Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5c69fa75-2a10-4ccb-a626-882ae10ea7b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c69fa75-2a10-4ccb-a626-882ae10ea7b3
Content-Type: application/json

--- request body ---
{"handle":"qa-c743508de2e1","password":"****"}

--- response: 200 in 93 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c69fa75-2a10-4ccb-a626-882ae10ea7b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3dbef68f-b65c-4bbe-9d86-eafd4502a293"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-64018b9b-a804-4d8f-83dd-072ac15b76d2

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-64018b9b-a804-4d8f-83dd-072ac15b76d2
Content-Type: application/json

--- response: 200 in 60 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-64018b9b-a804-4d8f-83dd-072ac15b76d2
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

{"id":"acc_3dbef68f-b65c-4bbe-9d86-eafd4502a293","handle":"qa-c743508de2e1","displayName":"QA c743508de2e1","region":"in","role":"user","createdAt":"2026-10-29T08:38:57.223185666Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-40c35ff4-162c-4016-b8a9-8438abd67092

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40c35ff4-162c-4016-b8a9-8438abd67092
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-40c35ff4-162c-4016-b8a9-8438abd67092
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
correlation: qa-7684bf94-2f63-4c5c-b0ec-fed3c6b32897

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7684bf94-2f63-4c5c-b0ec-fed3c6b32897
Content-Type: application/json

--- request body ---
{"handle":"qa-c743508de2e1","password":"****"}

--- response: 401 in 56 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7684bf94-2f63-4c5c-b0ec-fed3c6b32897
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7684bf94-2f63-4c5c-b0ec-fed3c6b32897"}
```
