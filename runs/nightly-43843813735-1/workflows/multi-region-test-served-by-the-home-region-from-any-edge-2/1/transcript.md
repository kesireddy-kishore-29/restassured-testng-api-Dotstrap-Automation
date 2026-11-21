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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-13964c83-55a0-468c-b69d-a2493c93b10c` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-5846a6f4-24ad-49d3-9857-a2efa3637584` |
| 3 | `GET /v1/accounts/me` | 200 | 6 | `qa-bf268f8b-b252-43cf-ac7d-ebd5a8062e19` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-c407f91c-bbde-4f26-879e-639d015c893a` |
| 5 | `POST /v1/auth/token` | 401 | 18 | `qa-b93647b3-1cf1-411b-b355-1d4734610ca2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-13964c83-55a0-468c-b69d-a2493c93b10c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13964c83-55a0-468c-b69d-a2493c93b10c
Content-Type: application/json

--- request body ---
{"handle":"qa-7ef9d3a36462","displayName":"QA 7ef9d3a36462","password":"****","region":"us"}

--- response: 201 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-13964c83-55a0-468c-b69d-a2493c93b10c
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
Location: /v1/accounts/qa-7ef9d3a36462
X-Served-Region: us
Content-Length: 181

{"id":"acc_7b27660b-89d2-4052-8ce4-78f199a826ec","handle":"qa-7ef9d3a36462","displayName":"QA 7ef9d3a36462","region":"us","role":"user","createdAt":"2026-11-16T09:53:55.438223896Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5846a6f4-24ad-49d3-9857-a2efa3637584

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5846a6f4-24ad-49d3-9857-a2efa3637584
Content-Type: application/json

--- request body ---
{"handle":"qa-7ef9d3a36462","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-5846a6f4-24ad-49d3-9857-a2efa3637584
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7b27660b-89d2-4052-8ce4-78f199a826ec"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf268f8b-b252-43cf-ac7d-ebd5a8062e19

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-bf268f8b-b252-43cf-ac7d-ebd5a8062e19
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf268f8b-b252-43cf-ac7d-ebd5a8062e19
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

{"id":"acc_7b27660b-89d2-4052-8ce4-78f199a826ec","handle":"qa-7ef9d3a36462","displayName":"QA 7ef9d3a36462","region":"us","role":"user","createdAt":"2026-11-16T09:53:55.438223896Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c407f91c-bbde-4f26-879e-639d015c893a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c407f91c-bbde-4f26-879e-639d015c893a
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c407f91c-bbde-4f26-879e-639d015c893a
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
correlation: qa-b93647b3-1cf1-411b-b355-1d4734610ca2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b93647b3-1cf1-411b-b355-1d4734610ca2
Content-Type: application/json

--- request body ---
{"handle":"qa-7ef9d3a36462","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b93647b3-1cf1-411b-b355-1d4734610ca2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b93647b3-1cf1-411b-b355-1d4734610ca2"}
```
