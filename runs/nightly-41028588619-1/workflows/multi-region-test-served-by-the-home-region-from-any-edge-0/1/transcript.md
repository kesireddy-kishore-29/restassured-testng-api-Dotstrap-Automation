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
| 1 | `POST /v1/accounts` | 201 | 521 | `qa-936cf982-a0fc-4886-afae-88580438fb8a` |
| 2 | `POST /v1/auth/token` | 200 | 108 | `qa-5e876eab-70d6-4584-86cc-8b200ee24363` |
| 3 | `GET /v1/accounts/me` | 200 | 64 | `qa-4709af1a-a1ce-431b-959f-c31ad4f2de1e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-c236b579-14a6-451d-b411-8bc3828b07de` |
| 5 | `POST /v1/auth/token` | 401 | 35 | `qa-04d54e2e-b0ef-457c-b913-84ce376b0698` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-936cf982-a0fc-4886-afae-88580438fb8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-936cf982-a0fc-4886-afae-88580438fb8a
Content-Type: application/json

--- request body ---
{"handle":"qa-2f7ae785a6e6","displayName":"QA 2f7ae785a6e6","password":"****","region":"in"}

--- response: 201 in 521 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-936cf982-a0fc-4886-afae-88580438fb8a
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
Location: /v1/accounts/qa-2f7ae785a6e6
X-Served-Region: in
Content-Length: 181

{"id":"acc_5f820c0a-5a2c-442b-80f1-b81c57d55777","handle":"qa-2f7ae785a6e6","displayName":"QA 2f7ae785a6e6","region":"in","role":"user","createdAt":"2026-10-30T08:46:02.555317046Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5e876eab-70d6-4584-86cc-8b200ee24363

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e876eab-70d6-4584-86cc-8b200ee24363
Content-Type: application/json

--- request body ---
{"handle":"qa-2f7ae785a6e6","password":"****"}

--- response: 200 in 108 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e876eab-70d6-4584-86cc-8b200ee24363
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5f820c0a-5a2c-442b-80f1-b81c57d55777"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-4709af1a-a1ce-431b-959f-c31ad4f2de1e

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-4709af1a-a1ce-431b-959f-c31ad4f2de1e
Content-Type: application/json

--- response: 200 in 64 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4709af1a-a1ce-431b-959f-c31ad4f2de1e
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

{"id":"acc_5f820c0a-5a2c-442b-80f1-b81c57d55777","handle":"qa-2f7ae785a6e6","displayName":"QA 2f7ae785a6e6","region":"in","role":"user","createdAt":"2026-10-30T08:46:02.555317046Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c236b579-14a6-451d-b411-8bc3828b07de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c236b579-14a6-451d-b411-8bc3828b07de
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c236b579-14a6-451d-b411-8bc3828b07de
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
correlation: qa-04d54e2e-b0ef-457c-b913-84ce376b0698

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04d54e2e-b0ef-457c-b913-84ce376b0698
Content-Type: application/json

--- request body ---
{"handle":"qa-2f7ae785a6e6","password":"****"}

--- response: 401 in 35 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04d54e2e-b0ef-457c-b913-84ce376b0698
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-04d54e2e-b0ef-457c-b913-84ce376b0698"}
```
