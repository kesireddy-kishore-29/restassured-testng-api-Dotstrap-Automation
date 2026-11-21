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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-95885f9d-d60f-4a84-9c40-a8f229f160b0` |
| 2 | `POST /v1/auth/token` | 200 | 27 | `qa-1101ed64-2b34-47c3-bf72-bf6bb31dd1d3` |
| 3 | `GET /v1/accounts/me` | 200 | 9 | `qa-3d7dbece-3ad2-4e86-ac5d-573faace4cd1` |
| 4 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-8067c4ba-1ab0-44e3-98c8-b7d3d1e67b57` |
| 5 | `POST /v1/auth/token` | 401 | 19 | `qa-d96d13e3-2420-4879-9bac-4737dc8c09df` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-95885f9d-d60f-4a84-9c40-a8f229f160b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95885f9d-d60f-4a84-9c40-a8f229f160b0
Content-Type: application/json

--- request body ---
{"handle":"qa-ef555090398f","displayName":"QA ef555090398f","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-95885f9d-d60f-4a84-9c40-a8f229f160b0
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
Location: /v1/accounts/qa-ef555090398f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_827649d7-b7ff-4e4c-93b3-e54100aa18f6","handle":"qa-ef555090398f","displayName":"QA ef555090398f","region":"eu","role":"user","createdAt":"2026-11-15T09:36:16.328121088Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1101ed64-2b34-47c3-bf72-bf6bb31dd1d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1101ed64-2b34-47c3-bf72-bf6bb31dd1d3
Content-Type: application/json

--- request body ---
{"handle":"qa-ef555090398f","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-1101ed64-2b34-47c3-bf72-bf6bb31dd1d3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_827649d7-b7ff-4e4c-93b3-e54100aa18f6"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d7dbece-3ad2-4e86-ac5d-573faace4cd1

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-3d7dbece-3ad2-4e86-ac5d-573faace4cd1
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d7dbece-3ad2-4e86-ac5d-573faace4cd1
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

{"id":"acc_827649d7-b7ff-4e4c-93b3-e54100aa18f6","handle":"qa-ef555090398f","displayName":"QA ef555090398f","region":"eu","role":"user","createdAt":"2026-11-15T09:36:16.328121088Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8067c4ba-1ab0-44e3-98c8-b7d3d1e67b57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8067c4ba-1ab0-44e3-98c8-b7d3d1e67b57
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8067c4ba-1ab0-44e3-98c8-b7d3d1e67b57
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
correlation: qa-d96d13e3-2420-4879-9bac-4737dc8c09df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d96d13e3-2420-4879-9bac-4737dc8c09df
Content-Type: application/json

--- request body ---
{"handle":"qa-ef555090398f","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d96d13e3-2420-4879-9bac-4737dc8c09df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d96d13e3-2420-4879-9bac-4737dc8c09df"}
```
