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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-6e5bb8bb-aeb2-4cc4-822a-2610b93f2531` |
| 2 | `POST /v1/auth/token` | 200 | 32 | `qa-c43e8160-5983-4673-8cbc-63618466d342` |
| 3 | `GET /v1/accounts/me` | 200 | 13 | `qa-a09f613b-fc01-4906-ad88-435b94171534` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-70ee0998-928c-421c-a927-c5fae6c1c0fb` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-a136169d-aeca-4d13-810f-9eca75a66b95` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6e5bb8bb-aeb2-4cc4-822a-2610b93f2531

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e5bb8bb-aeb2-4cc4-822a-2610b93f2531
Content-Type: application/json

--- request body ---
{"handle":"qa-03d7aff0358c","displayName":"QA 03d7aff0358c","password":"****","region":"in"}

--- response: 201 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e5bb8bb-aeb2-4cc4-822a-2610b93f2531
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
Location: /v1/accounts/qa-03d7aff0358c
X-Served-Region: in
Content-Length: 181

{"id":"acc_ef388592-0ece-43ba-bedf-07d96e5a35ae","handle":"qa-03d7aff0358c","displayName":"QA 03d7aff0358c","region":"in","role":"user","createdAt":"2026-11-12T09:56:38.036693030Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c43e8160-5983-4673-8cbc-63618466d342

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c43e8160-5983-4673-8cbc-63618466d342
Content-Type: application/json

--- request body ---
{"handle":"qa-03d7aff0358c","password":"****"}

--- response: 200 in 32 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c43e8160-5983-4673-8cbc-63618466d342
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ef388592-0ece-43ba-bedf-07d96e5a35ae"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-a09f613b-fc01-4906-ad88-435b94171534

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-a09f613b-fc01-4906-ad88-435b94171534
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a09f613b-fc01-4906-ad88-435b94171534
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

{"id":"acc_ef388592-0ece-43ba-bedf-07d96e5a35ae","handle":"qa-03d7aff0358c","displayName":"QA 03d7aff0358c","region":"in","role":"user","createdAt":"2026-11-12T09:56:38.036693030Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70ee0998-928c-421c-a927-c5fae6c1c0fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70ee0998-928c-421c-a927-c5fae6c1c0fb
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70ee0998-928c-421c-a927-c5fae6c1c0fb
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
correlation: qa-a136169d-aeca-4d13-810f-9eca75a66b95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a136169d-aeca-4d13-810f-9eca75a66b95
Content-Type: application/json

--- request body ---
{"handle":"qa-03d7aff0358c","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a136169d-aeca-4d13-810f-9eca75a66b95
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a136169d-aeca-4d13-810f-9eca75a66b95"}
```
