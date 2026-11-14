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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-1d4a26ad-2f60-4cbf-a797-e1940c16eaaa` |
| 2 | `POST /v1/auth/token` | 200 | 27 | `qa-931a6b66-4eb5-446f-97a5-d0a2d3a8a4a9` |
| 3 | `GET /v1/accounts/me` | error | 818 | `qa-b079842c-fc8f-4bf5-9455-4667cfe553da` |
| 4 | `GET /v1/accounts/me` | error | 805 | `qa-1ab42834-314d-41ae-9653-addaccbbfc50` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-cdd3f66e-29bd-4f4d-83a2-844f29f9eb87` |
| 6 | `POST /v1/auth/token` | 401 | 6 | `qa-dc8261c2-016b-4133-8d7c-828409b5f020` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1d4a26ad-2f60-4cbf-a797-e1940c16eaaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d4a26ad-2f60-4cbf-a797-e1940c16eaaa
Content-Type: application/json

--- request body ---
{"handle":"qa-cca059662d7e","displayName":"QA cca059662d7e","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d4a26ad-2f60-4cbf-a797-e1940c16eaaa
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
Location: /v1/accounts/qa-cca059662d7e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_057670de-69d6-4d38-b54a-00bb4503bd59","handle":"qa-cca059662d7e","displayName":"QA cca059662d7e","region":"eu","role":"user","createdAt":"2026-11-09T09:55:59.666521272Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-931a6b66-4eb5-446f-97a5-d0a2d3a8a4a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-931a6b66-4eb5-446f-97a5-d0a2d3a8a4a9
Content-Type: application/json

--- request body ---
{"handle":"qa-cca059662d7e","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-931a6b66-4eb5-446f-97a5-d0a2d3a8a4a9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_057670de-69d6-4d38-b54a-00bb4503bd59"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-b079842c-fc8f-4bf5-9455-4667cfe553da

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 00bb82df-11cf-46cf-b90b-bee160e3f987
X-Correlation-Id: qa-b079842c-fc8f-4bf5-9455-4667cfe553da
Content-Type: application/json

--- response: none in 818 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-1ab42834-314d-41ae-9653-addaccbbfc50

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 00bb82df-11cf-46cf-b90b-bee160e3f987
X-Correlation-Id: qa-1ab42834-314d-41ae-9653-addaccbbfc50
Content-Type: application/json

--- response: none in 805 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cdd3f66e-29bd-4f4d-83a2-844f29f9eb87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdd3f66e-29bd-4f4d-83a2-844f29f9eb87
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cdd3f66e-29bd-4f4d-83a2-844f29f9eb87
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
correlation: qa-dc8261c2-016b-4133-8d7c-828409b5f020

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc8261c2-016b-4133-8d7c-828409b5f020
Content-Type: application/json

--- request body ---
{"handle":"qa-cca059662d7e","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc8261c2-016b-4133-8d7c-828409b5f020
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dc8261c2-016b-4133-8d7c-828409b5f020"}
```
