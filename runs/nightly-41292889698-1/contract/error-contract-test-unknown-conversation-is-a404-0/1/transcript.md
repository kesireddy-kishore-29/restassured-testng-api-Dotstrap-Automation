# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 6 | `qa-81432dfb-e99a-4977-b5f1-64099f531360` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-324e2409-c057-4644-bf02-c6c559aeafd2` |
| 3 | `GET /v1/conversations/{id}` | 404 | 16 | `qa-84978d8a-de8f-4090-a2e2-76b5347a9c0c` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-e8f5f01e-77c7-455b-a35d-5de30bf8f3bb` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-c90367e3-4041-4549-8958-1d8f6abe289e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-81432dfb-e99a-4977-b5f1-64099f531360

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81432dfb-e99a-4977-b5f1-64099f531360
Content-Type: application/json

--- request body ---
{"handle":"qa-d38da69bde87","displayName":"QA d38da69bde87","password":"****","region":"eu"}

--- response: 201 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-81432dfb-e99a-4977-b5f1-64099f531360
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 6
Location: /v1/accounts/qa-d38da69bde87
X-Served-Region: eu
Content-Length: 181

{"id":"acc_56f33737-87c3-4055-9965-0c466810329c","handle":"qa-d38da69bde87","displayName":"QA d38da69bde87","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.309838383Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-324e2409-c057-4644-bf02-c6c559aeafd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-324e2409-c057-4644-bf02-c6c559aeafd2
Content-Type: application/json

--- request body ---
{"handle":"qa-d38da69bde87","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-324e2409-c057-4644-bf02-c6c559aeafd2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_56f33737-87c3-4055-9965-0c466810329c"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-84978d8a-de8f-4090-a2e2-76b5347a9c0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84978d8a-de8f-4090-a2e2-76b5347a9c0c
Content-Type: application/json

--- response: 404 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84978d8a-de8f-4090-a2e2-76b5347a9c0c
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-84978d8a-de8f-4090-a2e2-76b5347a9c0c"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e8f5f01e-77c7-455b-a35d-5de30bf8f3bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8f5f01e-77c7-455b-a35d-5de30bf8f3bb
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e8f5f01e-77c7-455b-a35d-5de30bf8f3bb
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
correlation: qa-c90367e3-4041-4549-8958-1d8f6abe289e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c90367e3-4041-4549-8958-1d8f6abe289e
Content-Type: application/json

--- request body ---
{"handle":"qa-d38da69bde87","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c90367e3-4041-4549-8958-1d8f6abe289e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c90367e3-4041-4549-8958-1d8f6abe289e"}
```
