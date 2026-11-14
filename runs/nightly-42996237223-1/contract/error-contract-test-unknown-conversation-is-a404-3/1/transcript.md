# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-c549dbfb-d60f-4f11-ac24-95cfe2f3ae88` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-b6c92dde-40b9-43d2-ae05-5d35869a7958` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 5 | `qa-191ed9d3-40ef-4e5b-aa95-6b6d3daadacc` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-c3f13c23-43c5-4a1e-bd78-03260ec81d1d` |
| 5 | `POST /v1/auth/token` | 401 | 16 | `qa-9f5f265e-e8ce-4aea-8209-28b6edf512a5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c549dbfb-d60f-4f11-ac24-95cfe2f3ae88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c549dbfb-d60f-4f11-ac24-95cfe2f3ae88
Content-Type: application/json

--- request body ---
{"handle":"qa-9f6b122dd40b","displayName":"QA 9f6b122dd40b","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-c549dbfb-d60f-4f11-ac24-95cfe2f3ae88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 6
Location: /v1/accounts/qa-9f6b122dd40b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_63f2e103-fec1-4723-9b5a-d97f21f3f5b8","handle":"qa-9f6b122dd40b","displayName":"QA 9f6b122dd40b","region":"eu","role":"user","createdAt":"2026-11-11T09:34:39.467451058Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b6c92dde-40b9-43d2-ae05-5d35869a7958

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6c92dde-40b9-43d2-ae05-5d35869a7958
Content-Type: application/json

--- request body ---
{"handle":"qa-9f6b122dd40b","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6c92dde-40b9-43d2-ae05-5d35869a7958
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_63f2e103-fec1-4723-9b5a-d97f21f3f5b8"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-191ed9d3-40ef-4e5b-aa95-6b6d3daadacc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-191ed9d3-40ef-4e5b-aa95-6b6d3daadacc
Content-Type: application/json

--- response: 404 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-191ed9d3-40ef-4e5b-aa95-6b6d3daadacc
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
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-191ed9d3-40ef-4e5b-aa95-6b6d3daadacc"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c3f13c23-43c5-4a1e-bd78-03260ec81d1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3f13c23-43c5-4a1e-bd78-03260ec81d1d
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c3f13c23-43c5-4a1e-bd78-03260ec81d1d
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
correlation: qa-9f5f265e-e8ce-4aea-8209-28b6edf512a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f5f265e-e8ce-4aea-8209-28b6edf512a5
Content-Type: application/json

--- request body ---
{"handle":"qa-9f6b122dd40b","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f5f265e-e8ce-4aea-8209-28b6edf512a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9f5f265e-e8ce-4aea-8209-28b6edf512a5"}
```
