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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-aaef87a1-024c-4cb8-b00e-13253ef5ae4c` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-93592446-dbcb-497b-a556-361e32d943cd` |
| 3 | `GET /v1/accounts/me` | 200 | 14 | `qa-b5c265bd-41b3-459c-a04b-fef74872cf6e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-00cd0b9f-15d9-4069-ba4b-07a60e45a0a3` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-715491fd-def8-42de-b695-7d3563c5c027` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aaef87a1-024c-4cb8-b00e-13253ef5ae4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaef87a1-024c-4cb8-b00e-13253ef5ae4c
Content-Type: application/json

--- request body ---
{"handle":"qa-e02fbec1777b","displayName":"QA e02fbec1777b","password":"****","region":"in"}

--- response: 201 in 27 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-aaef87a1-024c-4cb8-b00e-13253ef5ae4c
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
Location: /v1/accounts/qa-e02fbec1777b
X-Served-Region: in
Content-Length: 181

{"id":"acc_89596710-e97e-4d26-9e62-a29d9549ebdd","handle":"qa-e02fbec1777b","displayName":"QA e02fbec1777b","region":"in","role":"user","createdAt":"2026-11-09T09:56:00.582034979Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-93592446-dbcb-497b-a556-361e32d943cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93592446-dbcb-497b-a556-361e32d943cd
Content-Type: application/json

--- request body ---
{"handle":"qa-e02fbec1777b","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-93592446-dbcb-497b-a556-361e32d943cd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_89596710-e97e-4d26-9e62-a29d9549ebdd"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5c265bd-41b3-459c-a04b-fef74872cf6e

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-b5c265bd-41b3-459c-a04b-fef74872cf6e
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5c265bd-41b3-459c-a04b-fef74872cf6e
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

{"id":"acc_89596710-e97e-4d26-9e62-a29d9549ebdd","handle":"qa-e02fbec1777b","displayName":"QA e02fbec1777b","region":"in","role":"user","createdAt":"2026-11-09T09:56:00.582034979Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-00cd0b9f-15d9-4069-ba4b-07a60e45a0a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00cd0b9f-15d9-4069-ba4b-07a60e45a0a3
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-00cd0b9f-15d9-4069-ba4b-07a60e45a0a3
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
correlation: qa-715491fd-def8-42de-b695-7d3563c5c027

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-715491fd-def8-42de-b695-7d3563c5c027
Content-Type: application/json

--- request body ---
{"handle":"qa-e02fbec1777b","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-715491fd-def8-42de-b695-7d3563c5c027
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-715491fd-def8-42de-b695-7d3563c5c027"}
```
