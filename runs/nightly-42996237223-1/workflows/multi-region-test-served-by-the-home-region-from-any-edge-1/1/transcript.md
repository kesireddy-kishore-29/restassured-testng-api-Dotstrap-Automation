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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-d35dfd94-cc8c-4a8b-8f41-5923e98f7ff1` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-1f86a1e5-fc9c-43a9-a063-19092cd350fe` |
| 3 | `GET /v1/accounts/me` | 200 | 5 | `qa-d781800a-9de0-458b-be41-ca0c38c0ecd9` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-0fbc5743-c94f-4902-a1cf-4c0be1689ad5` |
| 5 | `POST /v1/auth/token` | 401 | 16 | `qa-84955676-6ee3-47d6-a358-03705b9f5a34` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d35dfd94-cc8c-4a8b-8f41-5923e98f7ff1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d35dfd94-cc8c-4a8b-8f41-5923e98f7ff1
Content-Type: application/json

--- request body ---
{"handle":"qa-03be119af5a1","displayName":"QA 03be119af5a1","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-d35dfd94-cc8c-4a8b-8f41-5923e98f7ff1
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
Location: /v1/accounts/qa-03be119af5a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1c7c15c3-bfb4-4abd-b359-dde38a63590a","handle":"qa-03be119af5a1","displayName":"QA 03be119af5a1","region":"eu","role":"user","createdAt":"2026-11-11T09:34:23.905080120Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1f86a1e5-fc9c-43a9-a063-19092cd350fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f86a1e5-fc9c-43a9-a063-19092cd350fe
Content-Type: application/json

--- request body ---
{"handle":"qa-03be119af5a1","password":"****"}

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f86a1e5-fc9c-43a9-a063-19092cd350fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1c7c15c3-bfb4-4abd-b359-dde38a63590a"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d781800a-9de0-458b-be41-ca0c38c0ecd9

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-d781800a-9de0-458b-be41-ca0c38c0ecd9
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-d781800a-9de0-458b-be41-ca0c38c0ecd9
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

{"id":"acc_1c7c15c3-bfb4-4abd-b359-dde38a63590a","handle":"qa-03be119af5a1","displayName":"QA 03be119af5a1","region":"eu","role":"user","createdAt":"2026-11-11T09:34:23.905080120Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0fbc5743-c94f-4902-a1cf-4c0be1689ad5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fbc5743-c94f-4902-a1cf-4c0be1689ad5
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0fbc5743-c94f-4902-a1cf-4c0be1689ad5
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
correlation: qa-84955676-6ee3-47d6-a358-03705b9f5a34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84955676-6ee3-47d6-a358-03705b9f5a34
Content-Type: application/json

--- request body ---
{"handle":"qa-03be119af5a1","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84955676-6ee3-47d6-a358-03705b9f5a34
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-84955676-6ee3-47d6-a358-03705b9f5a34"}
```
