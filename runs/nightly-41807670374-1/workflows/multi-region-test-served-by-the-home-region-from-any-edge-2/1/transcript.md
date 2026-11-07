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
| 1 | `POST /v1/accounts` | 201 | 504 | `qa-cad9ba49-7f1f-4d25-8949-df61c7f6612d` |
| 2 | `POST /v1/auth/token` | 200 | 106 | `qa-b9700844-1a04-4d8d-b122-52233467f913` |
| 3 | `GET /v1/accounts/me` | 200 | 103 | `qa-5d5610f8-36bd-4f8a-af30-7d0d86d9e1b3` |
| 4 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-0c9e9272-5bfd-4650-9daa-620d1456f23f` |
| 5 | `POST /v1/auth/token` | 401 | 33 | `qa-a6652df3-5cbe-4797-81fb-aec9c374b1f7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cad9ba49-7f1f-4d25-8949-df61c7f6612d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cad9ba49-7f1f-4d25-8949-df61c7f6612d
Content-Type: application/json

--- request body ---
{"handle":"qa-89e10a1b1a09","displayName":"QA 89e10a1b1a09","password":"****","region":"us"}

--- response: 201 in 504 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-cad9ba49-7f1f-4d25-8949-df61c7f6612d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-89e10a1b1a09
X-Served-Region: us
Content-Length: 181

{"id":"acc_9eb1ef1a-d1bc-493c-9c74-8705149c9d81","handle":"qa-89e10a1b1a09","displayName":"QA 89e10a1b1a09","region":"us","role":"user","createdAt":"2026-11-04T09:28:13.975829772Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b9700844-1a04-4d8d-b122-52233467f913

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9700844-1a04-4d8d-b122-52233467f913
Content-Type: application/json

--- request body ---
{"handle":"qa-89e10a1b1a09","password":"****"}

--- response: 200 in 106 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9700844-1a04-4d8d-b122-52233467f913
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9eb1ef1a-d1bc-493c-9c74-8705149c9d81"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d5610f8-36bd-4f8a-af30-7d0d86d9e1b3

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-5d5610f8-36bd-4f8a-af30-7d0d86d9e1b3
Content-Type: application/json

--- response: 200 in 103 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d5610f8-36bd-4f8a-af30-7d0d86d9e1b3
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

{"id":"acc_9eb1ef1a-d1bc-493c-9c74-8705149c9d81","handle":"qa-89e10a1b1a09","displayName":"QA 89e10a1b1a09","region":"us","role":"user","createdAt":"2026-11-04T09:28:13.975829772Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c9e9272-5bfd-4650-9daa-620d1456f23f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c9e9272-5bfd-4650-9daa-620d1456f23f
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c9e9272-5bfd-4650-9daa-620d1456f23f
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
correlation: qa-a6652df3-5cbe-4797-81fb-aec9c374b1f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6652df3-5cbe-4797-81fb-aec9c374b1f7
Content-Type: application/json

--- request body ---
{"handle":"qa-89e10a1b1a09","password":"****"}

--- response: 401 in 33 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6652df3-5cbe-4797-81fb-aec9c374b1f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a6652df3-5cbe-4797-81fb-aec9c374b1f7"}
```
