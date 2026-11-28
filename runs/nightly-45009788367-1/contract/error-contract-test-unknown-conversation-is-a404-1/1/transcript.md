# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-de82f3d5-aaee-401b-9759-4691afa77a3d` |
| 2 | `POST /v1/auth/token` | 200 | 8 | `qa-5873824d-84b4-4540-acbc-c1223bef68cb` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 7 | `qa-7c07350b-f5bc-4390-b466-5e5aa147564c` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-b119533d-d81a-4ca2-8c1c-6fc10581a630` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-e2cf882a-20ca-4edb-8579-c5ac363190ef` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-de82f3d5-aaee-401b-9759-4691afa77a3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de82f3d5-aaee-401b-9759-4691afa77a3d
Content-Type: application/json

--- request body ---
{"handle":"qa-4d419ef98a5d","displayName":"QA 4d419ef98a5d","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-de82f3d5-aaee-401b-9759-4691afa77a3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 7
Location: /v1/accounts/qa-4d419ef98a5d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0caee15e-46b5-4e54-aa24-ac48abb5a26b","handle":"qa-4d419ef98a5d","displayName":"QA 4d419ef98a5d","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.634054595Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5873824d-84b4-4540-acbc-c1223bef68cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5873824d-84b4-4540-acbc-c1223bef68cb
Content-Type: application/json

--- request body ---
{"handle":"qa-4d419ef98a5d","password":"****"}

--- response: 200 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-5873824d-84b4-4540-acbc-c1223bef68cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0caee15e-46b5-4e54-aa24-ac48abb5a26b"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-7c07350b-f5bc-4390-b466-5e5aa147564c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c07350b-f5bc-4390-b466-5e5aa147564c
Content-Type: application/json

--- response: 404 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c07350b-f5bc-4390-b466-5e5aa147564c
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-7c07350b-f5bc-4390-b466-5e5aa147564c"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b119533d-d81a-4ca2-8c1c-6fc10581a630

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b119533d-d81a-4ca2-8c1c-6fc10581a630
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b119533d-d81a-4ca2-8c1c-6fc10581a630
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
correlation: qa-e2cf882a-20ca-4edb-8579-c5ac363190ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2cf882a-20ca-4edb-8579-c5ac363190ef
Content-Type: application/json

--- request body ---
{"handle":"qa-4d419ef98a5d","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2cf882a-20ca-4edb-8579-c5ac363190ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e2cf882a-20ca-4edb-8579-c5ac363190ef"}
```
