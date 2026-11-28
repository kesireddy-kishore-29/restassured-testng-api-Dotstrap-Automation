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
| 1 | `POST /v1/accounts` | 201 | 305 | `qa-a2248e18-2021-4fd3-bd2a-85603fec361a` |
| 2 | `POST /v1/auth/token` | 200 | 40 | `qa-9121e55b-0176-4581-922f-c2e9b2e86d11` |
| 3 | `GET /v1/accounts/me` | 200 | 57 | `qa-b0a1a311-4070-4332-af1b-a27723c329dc` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-d02c2f9b-e3f7-461a-bdc3-28ef739ef6d4` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-1e54fb76-7c08-4aec-9c24-76c862dea431` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a2248e18-2021-4fd3-bd2a-85603fec361a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2248e18-2021-4fd3-bd2a-85603fec361a
Content-Type: application/json

--- request body ---
{"handle":"qa-ee364d11972a","displayName":"QA ee364d11972a","password":"****","region":"us"}

--- response: 201 in 305 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2248e18-2021-4fd3-bd2a-85603fec361a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-ee364d11972a
X-Served-Region: us
Content-Length: 181

{"id":"acc_80faa599-c359-43bc-bd90-d616c2cac521","handle":"qa-ee364d11972a","displayName":"QA ee364d11972a","region":"us","role":"user","createdAt":"2026-11-26T11:02:31.637954184Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9121e55b-0176-4581-922f-c2e9b2e86d11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9121e55b-0176-4581-922f-c2e9b2e86d11
Content-Type: application/json

--- request body ---
{"handle":"qa-ee364d11972a","password":"****"}

--- response: 200 in 40 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-9121e55b-0176-4581-922f-c2e9b2e86d11
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_80faa599-c359-43bc-bd90-d616c2cac521"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0a1a311-4070-4332-af1b-a27723c329dc

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-b0a1a311-4070-4332-af1b-a27723c329dc
Content-Type: application/json

--- response: 200 in 57 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0a1a311-4070-4332-af1b-a27723c329dc
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

{"id":"acc_80faa599-c359-43bc-bd90-d616c2cac521","handle":"qa-ee364d11972a","displayName":"QA ee364d11972a","region":"us","role":"user","createdAt":"2026-11-26T11:02:31.637954184Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d02c2f9b-e3f7-461a-bdc3-28ef739ef6d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d02c2f9b-e3f7-461a-bdc3-28ef739ef6d4
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d02c2f9b-e3f7-461a-bdc3-28ef739ef6d4
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
correlation: qa-1e54fb76-7c08-4aec-9c24-76c862dea431

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e54fb76-7c08-4aec-9c24-76c862dea431
Content-Type: application/json

--- request body ---
{"handle":"qa-ee364d11972a","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e54fb76-7c08-4aec-9c24-76c862dea431
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1e54fb76-7c08-4aec-9c24-76c862dea431"}
```
