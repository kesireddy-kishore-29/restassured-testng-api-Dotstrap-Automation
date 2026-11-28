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
| 1 | `POST /v1/accounts` | 201 | 467 | `qa-7eeb9659-03b7-4015-b588-aaf2e308a2c8` |
| 2 | `POST /v1/auth/token` | 200 | 73 | `qa-383c0f86-85c3-4299-a640-61cbea3c78b3` |
| 3 | `GET /v1/accounts/me` | 200 | 71 | `qa-586fec83-b2b0-42eb-bae1-276b590a006e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-3caf16b4-792f-4042-9111-bf5dfc7fa0d1` |
| 5 | `POST /v1/auth/token` | 401 | 19 | `qa-435e9586-7052-4aac-9a79-82ad6c2f652c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7eeb9659-03b7-4015-b588-aaf2e308a2c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7eeb9659-03b7-4015-b588-aaf2e308a2c8
Content-Type: application/json

--- request body ---
{"handle":"qa-eef87f299a23","displayName":"QA eef87f299a23","password":"****","region":"in"}

--- response: 201 in 467 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-7eeb9659-03b7-4015-b588-aaf2e308a2c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 11
Location: /v1/accounts/qa-eef87f299a23
X-Served-Region: in
Content-Length: 181

{"id":"acc_6d52f677-7b8a-43be-b139-0280b8b343cb","handle":"qa-eef87f299a23","displayName":"QA eef87f299a23","region":"in","role":"user","createdAt":"2026-11-25T11:27:53.380682364Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-383c0f86-85c3-4299-a640-61cbea3c78b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-383c0f86-85c3-4299-a640-61cbea3c78b3
Content-Type: application/json

--- request body ---
{"handle":"qa-eef87f299a23","password":"****"}

--- response: 200 in 73 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-383c0f86-85c3-4299-a640-61cbea3c78b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d52f677-7b8a-43be-b139-0280b8b343cb"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-586fec83-b2b0-42eb-bae1-276b590a006e

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-586fec83-b2b0-42eb-bae1-276b590a006e
Content-Type: application/json

--- response: 200 in 71 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-586fec83-b2b0-42eb-bae1-276b590a006e
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

{"id":"acc_6d52f677-7b8a-43be-b139-0280b8b343cb","handle":"qa-eef87f299a23","displayName":"QA eef87f299a23","region":"in","role":"user","createdAt":"2026-11-25T11:27:53.380682364Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3caf16b4-792f-4042-9111-bf5dfc7fa0d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3caf16b4-792f-4042-9111-bf5dfc7fa0d1
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3caf16b4-792f-4042-9111-bf5dfc7fa0d1
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
correlation: qa-435e9586-7052-4aac-9a79-82ad6c2f652c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-435e9586-7052-4aac-9a79-82ad6c2f652c
Content-Type: application/json

--- request body ---
{"handle":"qa-eef87f299a23","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-435e9586-7052-4aac-9a79-82ad6c2f652c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-435e9586-7052-4aac-9a79-82ad6c2f652c"}
```
