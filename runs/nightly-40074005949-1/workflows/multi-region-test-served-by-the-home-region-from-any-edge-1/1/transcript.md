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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-9c9c937f-0c88-4939-95df-3b6251857318` |
| 2 | `POST /v1/auth/token` | 200 | 28 | `qa-1162d74b-f8e0-4763-95f2-e8a6dfee93a5` |
| 3 | `GET /v1/accounts/me` | 200 | 22 | `qa-ca20e1bb-bef5-4235-a6be-3a6ac8b3e681` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-50ca34da-807d-46f1-b989-035428392694` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-8e61403f-0c09-49a8-a5f2-e463cfd7015c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9c9c937f-0c88-4939-95df-3b6251857318

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c9c937f-0c88-4939-95df-3b6251857318
Content-Type: application/json

--- request body ---
{"handle":"qa-7de5bc496134","displayName":"QA 7de5bc496134","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c9c937f-0c88-4939-95df-3b6251857318
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
Location: /v1/accounts/qa-7de5bc496134
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d8b552f8-a12c-4912-9e16-d5364e5f4027","handle":"qa-7de5bc496134","displayName":"QA 7de5bc496134","region":"eu","role":"user","createdAt":"2026-10-24T07:25:36.260744592Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1162d74b-f8e0-4763-95f2-e8a6dfee93a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1162d74b-f8e0-4763-95f2-e8a6dfee93a5
Content-Type: application/json

--- request body ---
{"handle":"qa-7de5bc496134","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1162d74b-f8e0-4763-95f2-e8a6dfee93a5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d8b552f8-a12c-4912-9e16-d5364e5f4027"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ca20e1bb-bef5-4235-a6be-3a6ac8b3e681

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-ca20e1bb-bef5-4235-a6be-3a6ac8b3e681
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca20e1bb-bef5-4235-a6be-3a6ac8b3e681
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

{"id":"acc_d8b552f8-a12c-4912-9e16-d5364e5f4027","handle":"qa-7de5bc496134","displayName":"QA 7de5bc496134","region":"eu","role":"user","createdAt":"2026-10-24T07:25:36.260744592Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-50ca34da-807d-46f1-b989-035428392694

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50ca34da-807d-46f1-b989-035428392694
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-50ca34da-807d-46f1-b989-035428392694
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
correlation: qa-8e61403f-0c09-49a8-a5f2-e463cfd7015c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e61403f-0c09-49a8-a5f2-e463cfd7015c
Content-Type: application/json

--- request body ---
{"handle":"qa-7de5bc496134","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e61403f-0c09-49a8-a5f2-e463cfd7015c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8e61403f-0c09-49a8-a5f2-e463cfd7015c"}
```
