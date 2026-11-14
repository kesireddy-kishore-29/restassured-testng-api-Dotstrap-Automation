# Transcript: A slow server cannot hang the client

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#clientTimeoutIsEnforcedWithinItsBudget` |
| Features | FEAT-RES-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-1030556b-069c-4dd8-a2ec-f30828f5c87c` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-f7f39d1c-445d-4514-8b70-dd3dc0fb76fb` |
| 3 | `GET /v1/accounts/me` | error | 811 | `qa-946d46d5-aec7-4fd2-a6e3-91d0aa96c93f` |
| 4 | `GET /v1/accounts/me` | error | 805 | `qa-462ba787-74c4-4d52-a28d-aa5c6fd02da7` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-1f782dcf-104e-4ede-924c-8eecf12a9b06` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-95697933-88b4-491c-a015-87870eefc59c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1030556b-069c-4dd8-a2ec-f30828f5c87c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1030556b-069c-4dd8-a2ec-f30828f5c87c
Content-Type: application/json

--- request body ---
{"handle":"qa-60ba8b2a9594","displayName":"QA 60ba8b2a9594","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-1030556b-069c-4dd8-a2ec-f30828f5c87c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-60ba8b2a9594
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d48beb4b-3d2a-4d74-9e78-8724fd7ec934","handle":"qa-60ba8b2a9594","displayName":"QA 60ba8b2a9594","region":"eu","role":"user","createdAt":"2026-11-08T09:09:12.735442842Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f7f39d1c-445d-4514-8b70-dd3dc0fb76fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7f39d1c-445d-4514-8b70-dd3dc0fb76fb
Content-Type: application/json

--- request body ---
{"handle":"qa-60ba8b2a9594","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7f39d1c-445d-4514-8b70-dd3dc0fb76fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d48beb4b-3d2a-4d74-9e78-8724fd7ec934"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-946d46d5-aec7-4fd2-a6e3-91d0aa96c93f

--- request headers ---
Accept: application/json
X-Fault-Key: 904c3218-69ee-40fe-a882-8978e4824355
X-Fault: latency=4000
X-Correlation-Id: qa-946d46d5-aec7-4fd2-a6e3-91d0aa96c93f
Content-Type: application/json

--- response: none in 811 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-462ba787-74c4-4d52-a28d-aa5c6fd02da7

--- request headers ---
Accept: application/json
X-Fault-Key: 904c3218-69ee-40fe-a882-8978e4824355
X-Fault: latency=4000
X-Correlation-Id: qa-462ba787-74c4-4d52-a28d-aa5c6fd02da7
Content-Type: application/json

--- response: none in 805 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1f782dcf-104e-4ede-924c-8eecf12a9b06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f782dcf-104e-4ede-924c-8eecf12a9b06
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1f782dcf-104e-4ede-924c-8eecf12a9b06
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-95697933-88b4-491c-a015-87870eefc59c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95697933-88b4-491c-a015-87870eefc59c
Content-Type: application/json

--- request body ---
{"handle":"qa-60ba8b2a9594","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95697933-88b4-491c-a015-87870eefc59c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-95697933-88b4-491c-a015-87870eefc59c"}
```
