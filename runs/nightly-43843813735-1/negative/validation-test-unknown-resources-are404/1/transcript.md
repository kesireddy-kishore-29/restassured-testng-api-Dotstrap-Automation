# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 451 | `qa-24a90a5f-6733-45b4-a51b-9ef03c94363e` |
| 2 | `POST /v1/auth/token` | 200 | 31 | `qa-c5f902f0-d2c3-4ff7-89aa-c880fb3402a6` |
| 3 | `GET /v1/conversations/{id}` | 404 | 57 | `qa-c6ee9584-04a3-46ff-a77b-490620cc75a9` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 14 | `qa-c26db8e9-21b7-48ab-83d8-1417c212acbd` |
| 5 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-f118eb08-1d59-4d86-a344-84a8cfada024` |
| 6 | `POST /v1/auth/token` | 401 | 26 | `qa-8af1f9d4-e957-4f8e-919c-865892e0958b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-24a90a5f-6733-45b4-a51b-9ef03c94363e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24a90a5f-6733-45b4-a51b-9ef03c94363e
Content-Type: application/json

--- request body ---
{"handle":"qa-161fae6986a0","displayName":"QA 161fae6986a0","password":"****","region":"eu"}

--- response: 201 in 451 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-24a90a5f-6733-45b4-a51b-9ef03c94363e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-161fae6986a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_95ef5dbf-60d4-4e7e-8948-a1a001dd8f57","handle":"qa-161fae6986a0","displayName":"QA 161fae6986a0","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.652088116Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c5f902f0-d2c3-4ff7-89aa-c880fb3402a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5f902f0-d2c3-4ff7-89aa-c880fb3402a6
Content-Type: application/json

--- request body ---
{"handle":"qa-161fae6986a0","password":"****"}

--- response: 200 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5f902f0-d2c3-4ff7-89aa-c880fb3402a6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_95ef5dbf-60d4-4e7e-8948-a1a001dd8f57"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-c6ee9584-04a3-46ff-a77b-490620cc75a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6ee9584-04a3-46ff-a77b-490620cc75a9
Content-Type: application/json

--- response: 404 in 57 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c6ee9584-04a3-46ff-a77b-490620cc75a9
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-c6ee9584-04a3-46ff-a77b-490620cc75a9"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-c26db8e9-21b7-48ab-83d8-1417c212acbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c26db8e9-21b7-48ab-83d8-1417c212acbd
Content-Type: application/json

--- response: 404 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c26db8e9-21b7-48ab-83d8-1417c212acbd
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-c26db8e9-21b7-48ab-83d8-1417c212acbd"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f118eb08-1d59-4d86-a344-84a8cfada024

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f118eb08-1d59-4d86-a344-84a8cfada024
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f118eb08-1d59-4d86-a344-84a8cfada024
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8af1f9d4-e957-4f8e-919c-865892e0958b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8af1f9d4-e957-4f8e-919c-865892e0958b
Content-Type: application/json

--- request body ---
{"handle":"qa-161fae6986a0","password":"****"}

--- response: 401 in 26 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8af1f9d4-e957-4f8e-919c-865892e0958b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8af1f9d4-e957-4f8e-919c-865892e0958b"}
```
