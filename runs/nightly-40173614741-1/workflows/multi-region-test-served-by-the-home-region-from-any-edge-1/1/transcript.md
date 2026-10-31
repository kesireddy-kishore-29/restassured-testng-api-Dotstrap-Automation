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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-aafb3cbf-3569-4e89-9542-e1c5705840a5` |
| 2 | `POST /v1/auth/token` | 200 | 35 | `qa-685ea8d4-f884-4631-86df-5a7ab460fc3c` |
| 3 | `GET /v1/accounts/me` | 200 | 14 | `qa-db259cfe-7b01-4cb5-9a40-9efae4ca20c5` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-be0527b4-6785-4eb5-bfbb-0be4eb983a34` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-beb528bd-4b1a-4a1d-b9cb-977a83c5f31f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aafb3cbf-3569-4e89-9542-e1c5705840a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aafb3cbf-3569-4e89-9542-e1c5705840a5
Content-Type: application/json

--- request body ---
{"handle":"qa-93e05e9fe051","displayName":"QA 93e05e9fe051","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-aafb3cbf-3569-4e89-9542-e1c5705840a5
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
Location: /v1/accounts/qa-93e05e9fe051
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0099708e-503c-4860-87d1-c787ad819c6f","handle":"qa-93e05e9fe051","displayName":"QA 93e05e9fe051","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.852715801Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-685ea8d4-f884-4631-86df-5a7ab460fc3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-685ea8d4-f884-4631-86df-5a7ab460fc3c
Content-Type: application/json

--- request body ---
{"handle":"qa-93e05e9fe051","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-685ea8d4-f884-4631-86df-5a7ab460fc3c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0099708e-503c-4860-87d1-c787ad819c6f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-db259cfe-7b01-4cb5-9a40-9efae4ca20c5

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-db259cfe-7b01-4cb5-9a40-9efae4ca20c5
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-db259cfe-7b01-4cb5-9a40-9efae4ca20c5
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

{"id":"acc_0099708e-503c-4860-87d1-c787ad819c6f","handle":"qa-93e05e9fe051","displayName":"QA 93e05e9fe051","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.852715801Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-be0527b4-6785-4eb5-bfbb-0be4eb983a34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be0527b4-6785-4eb5-bfbb-0be4eb983a34
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-be0527b4-6785-4eb5-bfbb-0be4eb983a34
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
correlation: qa-beb528bd-4b1a-4a1d-b9cb-977a83c5f31f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-beb528bd-4b1a-4a1d-b9cb-977a83c5f31f
Content-Type: application/json

--- request body ---
{"handle":"qa-93e05e9fe051","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-beb528bd-4b1a-4a1d-b9cb-977a83c5f31f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-beb528bd-4b1a-4a1d-b9cb-977a83c5f31f"}
```
