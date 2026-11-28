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
| 1 | `POST /v1/accounts` | 201 | 499 | `qa-18cbc3f3-2d78-4e09-836b-86702d8ba924` |
| 2 | `POST /v1/auth/token` | 200 | 63 | `qa-ddd310c5-b3aa-434f-a0ae-df68667f6127` |
| 3 | `GET /v1/accounts/me` | 200 | 78 | `qa-43544c8c-fb1e-468f-b56c-26910900e962` |
| 4 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-3c01725e-9fc5-4fc8-8c06-035b77b19fbe` |
| 5 | `POST /v1/auth/token` | 401 | 25 | `qa-c078605c-6c2b-4f76-a0c3-00e13e98dff8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-18cbc3f3-2d78-4e09-836b-86702d8ba924

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18cbc3f3-2d78-4e09-836b-86702d8ba924
Content-Type: application/json

--- request body ---
{"handle":"qa-47eaaf7c5cab","displayName":"QA 47eaaf7c5cab","password":"****","region":"in"}

--- response: 201 in 499 ms ---
Date: Sat, 28 Nov 2026 10:37:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-18cbc3f3-2d78-4e09-836b-86702d8ba924
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-47eaaf7c5cab
X-Served-Region: in
Content-Length: 181

{"id":"acc_01a0418c-55c1-4531-9d7b-64bfd4f535a5","handle":"qa-47eaaf7c5cab","displayName":"QA 47eaaf7c5cab","region":"in","role":"user","createdAt":"2026-11-28T10:37:19.384557196Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ddd310c5-b3aa-434f-a0ae-df68667f6127

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddd310c5-b3aa-434f-a0ae-df68667f6127
Content-Type: application/json

--- request body ---
{"handle":"qa-47eaaf7c5cab","password":"****"}

--- response: 200 in 63 ms ---
Date: Sat, 28 Nov 2026 10:37:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddd310c5-b3aa-434f-a0ae-df68667f6127
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_01a0418c-55c1-4531-9d7b-64bfd4f535a5"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-43544c8c-fb1e-468f-b56c-26910900e962

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-43544c8c-fb1e-468f-b56c-26910900e962
Content-Type: application/json

--- response: 200 in 78 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-43544c8c-fb1e-468f-b56c-26910900e962
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

{"id":"acc_01a0418c-55c1-4531-9d7b-64bfd4f535a5","handle":"qa-47eaaf7c5cab","displayName":"QA 47eaaf7c5cab","region":"in","role":"user","createdAt":"2026-11-28T10:37:19.384557196Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3c01725e-9fc5-4fc8-8c06-035b77b19fbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c01725e-9fc5-4fc8-8c06-035b77b19fbe
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3c01725e-9fc5-4fc8-8c06-035b77b19fbe
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
correlation: qa-c078605c-6c2b-4f76-a0c3-00e13e98dff8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c078605c-6c2b-4f76-a0c3-00e13e98dff8
Content-Type: application/json

--- request body ---
{"handle":"qa-47eaaf7c5cab","password":"****"}

--- response: 401 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c078605c-6c2b-4f76-a0c3-00e13e98dff8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c078605c-6c2b-4f76-a0c3-00e13e98dff8"}
```
