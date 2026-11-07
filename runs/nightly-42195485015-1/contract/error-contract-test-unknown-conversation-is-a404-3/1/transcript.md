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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-1e6969b1-6d41-4237-8593-f64254f5e05d` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-5092c9cc-99e8-4f1f-8e4b-5230d09d82b9` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 14 | `qa-10d8c9f1-9da6-403c-832d-d85dd7f1e058` |
| 4 | `DELETE /v1/accounts/me` | 204 | 43 | `qa-0f19ab94-cb89-47ec-b15e-ef727ad31c1e` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-37c432b0-8c58-46d5-8b45-2d1020004222` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1e6969b1-6d41-4237-8593-f64254f5e05d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e6969b1-6d41-4237-8593-f64254f5e05d
Content-Type: application/json

--- request body ---
{"handle":"qa-7658c6f20ba4","displayName":"QA 7658c6f20ba4","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e6969b1-6d41-4237-8593-f64254f5e05d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 5
Location: /v1/accounts/qa-7658c6f20ba4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d91000ec-8600-43c0-a92e-7088cf084fb5","handle":"qa-7658c6f20ba4","displayName":"QA 7658c6f20ba4","region":"eu","role":"user","createdAt":"2026-11-06T09:30:35.153514938Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5092c9cc-99e8-4f1f-8e4b-5230d09d82b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5092c9cc-99e8-4f1f-8e4b-5230d09d82b9
Content-Type: application/json

--- request body ---
{"handle":"qa-7658c6f20ba4","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5092c9cc-99e8-4f1f-8e4b-5230d09d82b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d91000ec-8600-43c0-a92e-7088cf084fb5"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-10d8c9f1-9da6-403c-832d-d85dd7f1e058

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10d8c9f1-9da6-403c-832d-d85dd7f1e058
Content-Type: application/json

--- response: 404 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10d8c9f1-9da6-403c-832d-d85dd7f1e058
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-10d8c9f1-9da6-403c-832d-d85dd7f1e058"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f19ab94-cb89-47ec-b15e-ef727ad31c1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f19ab94-cb89-47ec-b15e-ef727ad31c1e
Content-Type: application/json

--- response: 204 in 43 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f19ab94-cb89-47ec-b15e-ef727ad31c1e
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
correlation: qa-37c432b0-8c58-46d5-8b45-2d1020004222

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37c432b0-8c58-46d5-8b45-2d1020004222
Content-Type: application/json

--- request body ---
{"handle":"qa-7658c6f20ba4","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37c432b0-8c58-46d5-8b45-2d1020004222
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-37c432b0-8c58-46d5-8b45-2d1020004222"}
```
