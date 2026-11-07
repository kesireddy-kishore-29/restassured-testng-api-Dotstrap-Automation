# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 412 | `qa-9ba34dba-0e02-4c63-b778-ed6db0c1e59b` |
| 2 | `POST /v1/auth/token` | 200 | 115 | `qa-8deb770d-dd42-4df9-bf05-867c5d89a9f1` |
| 3 | `GET /v1/admin/stats` | 403 | 37 | `qa-155287c5-fa4b-411b-ac99-7f2e1f2985d7` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-ac7df4fd-0d43-4c1d-8ec8-7417276aac7d` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-6a12a620-d4fa-4aba-a8b3-03f2825b386a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9ba34dba-0e02-4c63-b778-ed6db0c1e59b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ba34dba-0e02-4c63-b778-ed6db0c1e59b
Content-Type: application/json

--- request body ---
{"handle":"qa-f7950b6a6480","displayName":"QA f7950b6a6480","password":"****","region":"eu"}

--- response: 201 in 412 ms ---
Date: Tue, 03 Nov 2026 09:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ba34dba-0e02-4c63-b778-ed6db0c1e59b
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
Location: /v1/accounts/qa-f7950b6a6480
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6c26d780-c884-46e4-a6e4-474f43a5eb7e","handle":"qa-f7950b6a6480","displayName":"QA f7950b6a6480","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.192769449Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8deb770d-dd42-4df9-bf05-867c5d89a9f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8deb770d-dd42-4df9-bf05-867c5d89a9f1
Content-Type: application/json

--- request body ---
{"handle":"qa-f7950b6a6480","password":"****"}

--- response: 200 in 115 ms ---
Date: Tue, 03 Nov 2026 09:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-8deb770d-dd42-4df9-bf05-867c5d89a9f1
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6c26d780-c884-46e4-a6e4-474f43a5eb7e"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-155287c5-fa4b-411b-ac99-7f2e1f2985d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-155287c5-fa4b-411b-ac99-7f2e1f2985d7
Content-Type: application/json

--- response: 403 in 37 ms ---
Date: Tue, 03 Nov 2026 09:41:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-155287c5-fa4b-411b-ac99-7f2e1f2985d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-155287c5-fa4b-411b-ac99-7f2e1f2985d7"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ac7df4fd-0d43-4c1d-8ec8-7417276aac7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac7df4fd-0d43-4c1d-8ec8-7417276aac7d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ac7df4fd-0d43-4c1d-8ec8-7417276aac7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-6a12a620-d4fa-4aba-a8b3-03f2825b386a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a12a620-d4fa-4aba-a8b3-03f2825b386a
Content-Type: application/json

--- request body ---
{"handle":"qa-f7950b6a6480","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a12a620-d4fa-4aba-a8b3-03f2825b386a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6a12a620-d4fa-4aba-a8b3-03f2825b386a"}
```
