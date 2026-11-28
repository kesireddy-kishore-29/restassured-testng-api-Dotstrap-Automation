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
| 1 | `POST /v1/accounts` | 201 | 457 | `qa-44485f78-d48d-4674-91d8-6d3eb5999d86` |
| 2 | `POST /v1/auth/token` | 200 | 49 | `qa-a24a7b33-fd58-476e-ae2d-89651cd4383b` |
| 3 | `GET /v1/accounts/me` | 200 | 55 | `qa-f79704e2-aaa6-41ca-8eb4-09d587fe1fac` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-7a89e94e-9652-4312-b1b8-5e350a508e25` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-fc690306-150b-46cc-8bb7-3e5d37edff31` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-44485f78-d48d-4674-91d8-6d3eb5999d86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44485f78-d48d-4674-91d8-6d3eb5999d86
Content-Type: application/json

--- request body ---
{"handle":"qa-0df538e1ceec","displayName":"QA 0df538e1ceec","password":"****","region":"in"}

--- response: 201 in 457 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-44485f78-d48d-4674-91d8-6d3eb5999d86
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
Location: /v1/accounts/qa-0df538e1ceec
X-Served-Region: in
Content-Length: 181

{"id":"acc_40220b5d-2858-45fa-97d4-9831463ac97b","handle":"qa-0df538e1ceec","displayName":"QA 0df538e1ceec","region":"in","role":"user","createdAt":"2026-11-27T10:59:52.017655460Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a24a7b33-fd58-476e-ae2d-89651cd4383b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a24a7b33-fd58-476e-ae2d-89651cd4383b
Content-Type: application/json

--- request body ---
{"handle":"qa-0df538e1ceec","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a24a7b33-fd58-476e-ae2d-89651cd4383b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_40220b5d-2858-45fa-97d4-9831463ac97b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-f79704e2-aaa6-41ca-8eb4-09d587fe1fac

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-f79704e2-aaa6-41ca-8eb4-09d587fe1fac
Content-Type: application/json

--- response: 200 in 55 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f79704e2-aaa6-41ca-8eb4-09d587fe1fac
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

{"id":"acc_40220b5d-2858-45fa-97d4-9831463ac97b","handle":"qa-0df538e1ceec","displayName":"QA 0df538e1ceec","region":"in","role":"user","createdAt":"2026-11-27T10:59:52.017655460Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a89e94e-9652-4312-b1b8-5e350a508e25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a89e94e-9652-4312-b1b8-5e350a508e25
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a89e94e-9652-4312-b1b8-5e350a508e25
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
correlation: qa-fc690306-150b-46cc-8bb7-3e5d37edff31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc690306-150b-46cc-8bb7-3e5d37edff31
Content-Type: application/json

--- request body ---
{"handle":"qa-0df538e1ceec","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc690306-150b-46cc-8bb7-3e5d37edff31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fc690306-150b-46cc-8bb7-3e5d37edff31"}
```
