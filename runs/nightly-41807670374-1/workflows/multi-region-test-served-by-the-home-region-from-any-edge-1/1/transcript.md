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
| 1 | `POST /v1/accounts` | 201 | 503 | `qa-97729570-e4c3-4e61-8d4f-ded71d24d780` |
| 2 | `POST /v1/auth/token` | 200 | 127 | `qa-3a03ebef-112f-4aa9-9851-f34d74bff3be` |
| 3 | `GET /v1/accounts/me` | 200 | 119 | `qa-49001b1f-c850-43d5-8c60-1236feff4792` |
| 4 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-8f7c6eba-10e8-47a4-b5d4-16f0b961d9ca` |
| 5 | `POST /v1/auth/token` | 401 | 66 | `qa-496e0105-0b9e-4ed0-a044-901a910c66f6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-97729570-e4c3-4e61-8d4f-ded71d24d780

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97729570-e4c3-4e61-8d4f-ded71d24d780
Content-Type: application/json

--- request body ---
{"handle":"qa-1811283625d6","displayName":"QA 1811283625d6","password":"****","region":"eu"}

--- response: 201 in 503 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-97729570-e4c3-4e61-8d4f-ded71d24d780
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
Location: /v1/accounts/qa-1811283625d6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b76761d3-b5f2-4d9d-ae24-88f132744edb","handle":"qa-1811283625d6","displayName":"QA 1811283625d6","region":"eu","role":"user","createdAt":"2026-11-04T09:28:13.965033928Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3a03ebef-112f-4aa9-9851-f34d74bff3be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a03ebef-112f-4aa9-9851-f34d74bff3be
Content-Type: application/json

--- request body ---
{"handle":"qa-1811283625d6","password":"****"}

--- response: 200 in 127 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a03ebef-112f-4aa9-9851-f34d74bff3be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b76761d3-b5f2-4d9d-ae24-88f132744edb"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-49001b1f-c850-43d5-8c60-1236feff4792

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-49001b1f-c850-43d5-8c60-1236feff4792
Content-Type: application/json

--- response: 200 in 119 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-49001b1f-c850-43d5-8c60-1236feff4792
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

{"id":"acc_b76761d3-b5f2-4d9d-ae24-88f132744edb","handle":"qa-1811283625d6","displayName":"QA 1811283625d6","region":"eu","role":"user","createdAt":"2026-11-04T09:28:13.965033928Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8f7c6eba-10e8-47a4-b5d4-16f0b961d9ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f7c6eba-10e8-47a4-b5d4-16f0b961d9ca
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8f7c6eba-10e8-47a4-b5d4-16f0b961d9ca
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
correlation: qa-496e0105-0b9e-4ed0-a044-901a910c66f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-496e0105-0b9e-4ed0-a044-901a910c66f6
Content-Type: application/json

--- request body ---
{"handle":"qa-1811283625d6","password":"****"}

--- response: 401 in 66 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-496e0105-0b9e-4ed0-a044-901a910c66f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-496e0105-0b9e-4ed0-a044-901a910c66f6"}
```
