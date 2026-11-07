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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-9334339f-c560-436c-87c7-d6f795a7440f` |
| 2 | `POST /v1/auth/token` | 200 | 31 | `qa-85da307b-a3ab-4386-84b1-ceaf0a8d6083` |
| 3 | `GET /v1/accounts/me` | 200 | 15 | `qa-623443b3-3f10-4be3-88c8-573a8e97afd6` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-83ce8c93-9cea-48bf-bbf5-b7655e592d57` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-6bc1ba00-4a8f-4a85-b842-ea7a0efd04ae` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9334339f-c560-436c-87c7-d6f795a7440f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9334339f-c560-436c-87c7-d6f795a7440f
Content-Type: application/json

--- request body ---
{"handle":"qa-249fd5ac710d","displayName":"QA 249fd5ac710d","password":"****","region":"in"}

--- response: 201 in 28 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9334339f-c560-436c-87c7-d6f795a7440f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-249fd5ac710d
X-Served-Region: in
Content-Length: 181

{"id":"acc_9e682b0d-5e09-4e24-8bc0-9afc3ff62c00","handle":"qa-249fd5ac710d","displayName":"QA 249fd5ac710d","region":"in","role":"user","createdAt":"2026-11-07T08:55:04.449650326Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-85da307b-a3ab-4386-84b1-ceaf0a8d6083

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85da307b-a3ab-4386-84b1-ceaf0a8d6083
Content-Type: application/json

--- request body ---
{"handle":"qa-249fd5ac710d","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-85da307b-a3ab-4386-84b1-ceaf0a8d6083
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e682b0d-5e09-4e24-8bc0-9afc3ff62c00"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-623443b3-3f10-4be3-88c8-573a8e97afd6

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-623443b3-3f10-4be3-88c8-573a8e97afd6
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-623443b3-3f10-4be3-88c8-573a8e97afd6
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

{"id":"acc_9e682b0d-5e09-4e24-8bc0-9afc3ff62c00","handle":"qa-249fd5ac710d","displayName":"QA 249fd5ac710d","region":"in","role":"user","createdAt":"2026-11-07T08:55:04.449650326Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-83ce8c93-9cea-48bf-bbf5-b7655e592d57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83ce8c93-9cea-48bf-bbf5-b7655e592d57
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-83ce8c93-9cea-48bf-bbf5-b7655e592d57
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
correlation: qa-6bc1ba00-4a8f-4a85-b842-ea7a0efd04ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bc1ba00-4a8f-4a85-b842-ea7a0efd04ae
Content-Type: application/json

--- request body ---
{"handle":"qa-249fd5ac710d","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6bc1ba00-4a8f-4a85-b842-ea7a0efd04ae
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6bc1ba00-4a8f-4a85-b842-ea7a0efd04ae"}
```
