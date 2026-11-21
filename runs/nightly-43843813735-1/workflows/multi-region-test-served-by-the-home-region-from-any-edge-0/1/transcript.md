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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-b32d634a-10a9-4f78-bc2c-420465798a12` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-226362d3-e6ea-4bc3-863a-41fafed42797` |
| 3 | `GET /v1/accounts/me` | 200 | 6 | `qa-009ed58c-b176-4c75-933a-582c40a1aa9f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-aa4e70d2-72f2-4147-a042-fa2d38ea499f` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-eecf6cda-5bb6-4c85-97fd-4739df4b56e9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b32d634a-10a9-4f78-bc2c-420465798a12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b32d634a-10a9-4f78-bc2c-420465798a12
Content-Type: application/json

--- request body ---
{"handle":"qa-0613d3888bd5","displayName":"QA 0613d3888bd5","password":"****","region":"in"}

--- response: 201 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-b32d634a-10a9-4f78-bc2c-420465798a12
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
Location: /v1/accounts/qa-0613d3888bd5
X-Served-Region: in
Content-Length: 181

{"id":"acc_20ff486b-e282-4aa1-aa99-d92f3d97895f","handle":"qa-0613d3888bd5","displayName":"QA 0613d3888bd5","region":"in","role":"user","createdAt":"2026-11-16T09:53:55.434584943Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-226362d3-e6ea-4bc3-863a-41fafed42797

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-226362d3-e6ea-4bc3-863a-41fafed42797
Content-Type: application/json

--- request body ---
{"handle":"qa-0613d3888bd5","password":"****"}

--- response: 200 in 43 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-226362d3-e6ea-4bc3-863a-41fafed42797
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20ff486b-e282-4aa1-aa99-d92f3d97895f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-009ed58c-b176-4c75-933a-582c40a1aa9f

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-009ed58c-b176-4c75-933a-582c40a1aa9f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-009ed58c-b176-4c75-933a-582c40a1aa9f
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

{"id":"acc_20ff486b-e282-4aa1-aa99-d92f3d97895f","handle":"qa-0613d3888bd5","displayName":"QA 0613d3888bd5","region":"in","role":"user","createdAt":"2026-11-16T09:53:55.434584943Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa4e70d2-72f2-4147-a042-fa2d38ea499f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa4e70d2-72f2-4147-a042-fa2d38ea499f
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa4e70d2-72f2-4147-a042-fa2d38ea499f
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
correlation: qa-eecf6cda-5bb6-4c85-97fd-4739df4b56e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eecf6cda-5bb6-4c85-97fd-4739df4b56e9
Content-Type: application/json

--- request body ---
{"handle":"qa-0613d3888bd5","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eecf6cda-5bb6-4c85-97fd-4739df4b56e9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eecf6cda-5bb6-4c85-97fd-4739df4b56e9"}
```
