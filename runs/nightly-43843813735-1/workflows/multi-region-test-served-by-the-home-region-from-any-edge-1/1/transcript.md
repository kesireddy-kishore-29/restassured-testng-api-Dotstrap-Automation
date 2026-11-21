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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-f20028cc-d7d8-4ce4-9a94-5dbdc6d37fa7` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-e1d52932-6cf5-4d6d-94db-c60b7243c483` |
| 3 | `GET /v1/accounts/me` | 200 | 12 | `qa-25f7b3a0-4849-4dc0-af05-fda78baecfac` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-6f33886f-13d5-4a23-ac84-06ef27af104d` |
| 5 | `POST /v1/auth/token` | 401 | 20 | `qa-82db386d-5098-4aed-b67a-52fb36b151b0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f20028cc-d7d8-4ce4-9a94-5dbdc6d37fa7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f20028cc-d7d8-4ce4-9a94-5dbdc6d37fa7
Content-Type: application/json

--- request body ---
{"handle":"qa-97918a47a740","displayName":"QA 97918a47a740","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-f20028cc-d7d8-4ce4-9a94-5dbdc6d37fa7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-97918a47a740
X-Served-Region: eu
Content-Length: 181

{"id":"acc_21e0fa5c-6e0d-4dd0-85cf-10aeb3f65b81","handle":"qa-97918a47a740","displayName":"QA 97918a47a740","region":"eu","role":"user","createdAt":"2026-11-16T09:53:55.445881368Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e1d52932-6cf5-4d6d-94db-c60b7243c483

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1d52932-6cf5-4d6d-94db-c60b7243c483
Content-Type: application/json

--- request body ---
{"handle":"qa-97918a47a740","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1d52932-6cf5-4d6d-94db-c60b7243c483
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21e0fa5c-6e0d-4dd0-85cf-10aeb3f65b81"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-25f7b3a0-4849-4dc0-af05-fda78baecfac

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-25f7b3a0-4849-4dc0-af05-fda78baecfac
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-25f7b3a0-4849-4dc0-af05-fda78baecfac
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

{"id":"acc_21e0fa5c-6e0d-4dd0-85cf-10aeb3f65b81","handle":"qa-97918a47a740","displayName":"QA 97918a47a740","region":"eu","role":"user","createdAt":"2026-11-16T09:53:55.445881368Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f33886f-13d5-4a23-ac84-06ef27af104d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f33886f-13d5-4a23-ac84-06ef27af104d
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f33886f-13d5-4a23-ac84-06ef27af104d
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
correlation: qa-82db386d-5098-4aed-b67a-52fb36b151b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82db386d-5098-4aed-b67a-52fb36b151b0
Content-Type: application/json

--- request body ---
{"handle":"qa-97918a47a740","password":"****"}

--- response: 401 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82db386d-5098-4aed-b67a-52fb36b151b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-82db386d-5098-4aed-b67a-52fb36b151b0"}
```
