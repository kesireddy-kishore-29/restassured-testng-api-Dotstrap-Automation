# Transcript: Requests are served by the home region, whichever edge they arrive at [US, in]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[2]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 398 | `qa-7061f4c1-ca04-4318-910c-17dee043fde8` |
| 2 | `POST /v1/auth/token` | 200 | 60 | `qa-53eb9162-6a9e-401b-a043-cca843c3133e` |
| 3 | `GET /v1/accounts/me` | 200 | 55 | `qa-52760496-3a34-4f8e-b474-1b32024b5d8c` |
| 4 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-21a279f1-47d7-4b60-be39-27664279bfd6` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-a39e58e9-a9ce-463b-a5d5-b694fd3a9866` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7061f4c1-ca04-4318-910c-17dee043fde8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7061f4c1-ca04-4318-910c-17dee043fde8
Content-Type: application/json

--- request body ---
{"handle":"qa-337f1a7d40b1","displayName":"QA 337f1a7d40b1","password":"****","region":"us"}

--- response: 201 in 398 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7061f4c1-ca04-4318-910c-17dee043fde8
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
Location: /v1/accounts/qa-337f1a7d40b1
X-Served-Region: us
Content-Length: 181

{"id":"acc_292f9433-12f7-4ac9-9467-63f40046ce94","handle":"qa-337f1a7d40b1","displayName":"QA 337f1a7d40b1","region":"us","role":"user","createdAt":"2026-11-23T10:55:04.105678500Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-53eb9162-6a9e-401b-a043-cca843c3133e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53eb9162-6a9e-401b-a043-cca843c3133e
Content-Type: application/json

--- request body ---
{"handle":"qa-337f1a7d40b1","password":"****"}

--- response: 200 in 60 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-53eb9162-6a9e-401b-a043-cca843c3133e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_292f9433-12f7-4ac9-9467-63f40046ce94"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-52760496-3a34-4f8e-b474-1b32024b5d8c

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-52760496-3a34-4f8e-b474-1b32024b5d8c
Content-Type: application/json

--- response: 200 in 55 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-52760496-3a34-4f8e-b474-1b32024b5d8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: in
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 181

{"id":"acc_292f9433-12f7-4ac9-9467-63f40046ce94","handle":"qa-337f1a7d40b1","displayName":"QA 337f1a7d40b1","region":"us","role":"user","createdAt":"2026-11-23T10:55:04.105678500Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21a279f1-47d7-4b60-be39-27664279bfd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21a279f1-47d7-4b60-be39-27664279bfd6
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21a279f1-47d7-4b60-be39-27664279bfd6
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
X-Served-Region: us
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a39e58e9-a9ce-463b-a5d5-b694fd3a9866

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a39e58e9-a9ce-463b-a5d5-b694fd3a9866
Content-Type: application/json

--- request body ---
{"handle":"qa-337f1a7d40b1","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a39e58e9-a9ce-463b-a5d5-b694fd3a9866
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a39e58e9-a9ce-463b-a5d5-b694fd3a9866"}
```
