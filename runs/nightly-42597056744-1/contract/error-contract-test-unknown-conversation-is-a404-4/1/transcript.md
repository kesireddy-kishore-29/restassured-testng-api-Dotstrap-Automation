# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 5 | `qa-a6e54387-0bd6-4d83-b1c7-93aefc980a08` |
| 2 | `POST /v1/auth/token` | 200 | 5 | `qa-192a5d6f-0564-4e6d-9eda-bac0178844c5` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 3 | `qa-efa5b309-9548-4815-ac15-517cb94b2412` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-d04b9427-2d2b-444f-950e-b6d435a42c15` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-f0801954-eeb9-4d01-864a-6b5f3388c1e0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a6e54387-0bd6-4d83-b1c7-93aefc980a08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6e54387-0bd6-4d83-b1c7-93aefc980a08
Content-Type: application/json

--- request body ---
{"handle":"qa-4bac4ddafc78","displayName":"QA 4bac4ddafc78","password":"****","region":"eu"}

--- response: 201 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6e54387-0bd6-4d83-b1c7-93aefc980a08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 7
Location: /v1/accounts/qa-4bac4ddafc78
X-Served-Region: eu
Content-Length: 181

{"id":"acc_decdd1ca-6d82-4e8d-865b-493046c1e50f","handle":"qa-4bac4ddafc78","displayName":"QA 4bac4ddafc78","region":"eu","role":"user","createdAt":"2026-11-09T09:56:04.231478276Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-192a5d6f-0564-4e6d-9eda-bac0178844c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-192a5d6f-0564-4e6d-9eda-bac0178844c5
Content-Type: application/json

--- request body ---
{"handle":"qa-4bac4ddafc78","password":"****"}

--- response: 200 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-192a5d6f-0564-4e6d-9eda-bac0178844c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_decdd1ca-6d82-4e8d-865b-493046c1e50f"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-efa5b309-9548-4815-ac15-517cb94b2412

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efa5b309-9548-4815-ac15-517cb94b2412
Content-Type: application/json

--- response: 404 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-efa5b309-9548-4815-ac15-517cb94b2412
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-efa5b309-9548-4815-ac15-517cb94b2412"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d04b9427-2d2b-444f-950e-b6d435a42c15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d04b9427-2d2b-444f-950e-b6d435a42c15
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d04b9427-2d2b-444f-950e-b6d435a42c15
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
correlation: qa-f0801954-eeb9-4d01-864a-6b5f3388c1e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0801954-eeb9-4d01-864a-6b5f3388c1e0
Content-Type: application/json

--- request body ---
{"handle":"qa-4bac4ddafc78","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0801954-eeb9-4d01-864a-6b5f3388c1e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f0801954-eeb9-4d01-864a-6b5f3388c1e0"}
```
