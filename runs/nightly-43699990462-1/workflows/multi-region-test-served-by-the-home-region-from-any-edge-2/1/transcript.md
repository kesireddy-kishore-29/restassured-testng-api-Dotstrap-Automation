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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-2a34fc79-da16-40ba-9b12-9adc4e32f3c6` |
| 2 | `POST /v1/auth/token` | 200 | 40 | `qa-888cf85e-b2ce-4bab-a960-86a9b96c16d6` |
| 3 | `GET /v1/accounts/me` | 200 | 23 | `qa-83bde872-d47c-4a20-90dd-259bb1b8be93` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-0b4a6731-7a49-44f3-8539-0cf65df3a2c7` |
| 5 | `POST /v1/auth/token` | 401 | 19 | `qa-190fa2ae-d682-41cc-a3ca-13b81da0d3b6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2a34fc79-da16-40ba-9b12-9adc4e32f3c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a34fc79-da16-40ba-9b12-9adc4e32f3c6
Content-Type: application/json

--- request body ---
{"handle":"qa-79764b4d01fc","displayName":"QA 79764b4d01fc","password":"****","region":"us"}

--- response: 201 in 31 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a34fc79-da16-40ba-9b12-9adc4e32f3c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-79764b4d01fc
X-Served-Region: us
Content-Length: 181

{"id":"acc_469a3e05-ae97-4dba-a089-4ebac4a38bc3","handle":"qa-79764b4d01fc","displayName":"QA 79764b4d01fc","region":"us","role":"user","createdAt":"2026-11-15T09:36:16.325138916Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-888cf85e-b2ce-4bab-a960-86a9b96c16d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-888cf85e-b2ce-4bab-a960-86a9b96c16d6
Content-Type: application/json

--- request body ---
{"handle":"qa-79764b4d01fc","password":"****"}

--- response: 200 in 40 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-888cf85e-b2ce-4bab-a960-86a9b96c16d6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_469a3e05-ae97-4dba-a089-4ebac4a38bc3"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-83bde872-d47c-4a20-90dd-259bb1b8be93

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-83bde872-d47c-4a20-90dd-259bb1b8be93
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-83bde872-d47c-4a20-90dd-259bb1b8be93
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

{"id":"acc_469a3e05-ae97-4dba-a089-4ebac4a38bc3","handle":"qa-79764b4d01fc","displayName":"QA 79764b4d01fc","region":"us","role":"user","createdAt":"2026-11-15T09:36:16.325138916Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b4a6731-7a49-44f3-8539-0cf65df3a2c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b4a6731-7a49-44f3-8539-0cf65df3a2c7
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b4a6731-7a49-44f3-8539-0cf65df3a2c7
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
correlation: qa-190fa2ae-d682-41cc-a3ca-13b81da0d3b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-190fa2ae-d682-41cc-a3ca-13b81da0d3b6
Content-Type: application/json

--- request body ---
{"handle":"qa-79764b4d01fc","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-190fa2ae-d682-41cc-a3ca-13b81da0d3b6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-190fa2ae-d682-41cc-a3ca-13b81da0d3b6"}
```
