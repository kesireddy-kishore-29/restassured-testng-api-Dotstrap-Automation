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
| 1 | `POST /v1/accounts` | 201 | 374 | `qa-e3ea76ca-f107-4130-a97b-0702e5ae735f` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-84d77745-989e-4e30-9289-1166f6add805` |
| 3 | `GET /v1/accounts/me` | 200 | 70 | `qa-96378817-bc9a-447c-a919-db7846ce47dd` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-5c4b1aa8-e63f-4fba-af19-aaeb78c00d14` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-80b7b7bd-e94b-4cc7-8e19-335c19b64201` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e3ea76ca-f107-4130-a97b-0702e5ae735f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3ea76ca-f107-4130-a97b-0702e5ae735f
Content-Type: application/json

--- request body ---
{"handle":"qa-548d26c51f8c","displayName":"QA 548d26c51f8c","password":"****","region":"eu"}

--- response: 201 in 374 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3ea76ca-f107-4130-a97b-0702e5ae735f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-548d26c51f8c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1ac84c1d-91f9-4a97-98c2-41c80436c20e","handle":"qa-548d26c51f8c","displayName":"QA 548d26c51f8c","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.250215025Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-84d77745-989e-4e30-9289-1166f6add805

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84d77745-989e-4e30-9289-1166f6add805
Content-Type: application/json

--- request body ---
{"handle":"qa-548d26c51f8c","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-84d77745-989e-4e30-9289-1166f6add805
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1ac84c1d-91f9-4a97-98c2-41c80436c20e"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-96378817-bc9a-447c-a919-db7846ce47dd

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-96378817-bc9a-447c-a919-db7846ce47dd
Content-Type: application/json

--- response: 200 in 70 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-96378817-bc9a-447c-a919-db7846ce47dd
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

{"id":"acc_1ac84c1d-91f9-4a97-98c2-41c80436c20e","handle":"qa-548d26c51f8c","displayName":"QA 548d26c51f8c","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.250215025Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5c4b1aa8-e63f-4fba-af19-aaeb78c00d14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c4b1aa8-e63f-4fba-af19-aaeb78c00d14
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5c4b1aa8-e63f-4fba-af19-aaeb78c00d14
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
correlation: qa-80b7b7bd-e94b-4cc7-8e19-335c19b64201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80b7b7bd-e94b-4cc7-8e19-335c19b64201
Content-Type: application/json

--- request body ---
{"handle":"qa-548d26c51f8c","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80b7b7bd-e94b-4cc7-8e19-335c19b64201
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-80b7b7bd-e94b-4cc7-8e19-335c19b64201"}
```
