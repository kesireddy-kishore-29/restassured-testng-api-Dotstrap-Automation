# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-6f551149-7234-40da-8566-3f9b0312bb6b` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-b9704a2b-a0c1-4cf8-963f-23589be69bad` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-08b3324f-20a3-4c52-a446-e6cba63a7ae3` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-ade4dafd-40fd-43bb-a885-7d95e6648ab9` |
| 5 | `GET /v1/admin/stats` | 503 | 4 | `qa-5151c06e-f081-4c63-a5b7-01ea2218a382` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-7d2e8c00-65ed-4a5b-a6e1-e267744b9c91` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-0b3a988a-15f6-48bf-923b-bb588c55aa24` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-67525f75-a1e2-49c5-8bf9-bff76fc7976d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-e5c07e22-347d-497f-9df6-3fae422a6528` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-db5a1601-66bd-475f-9e35-b4133c48ee6d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6f551149-7234-40da-8566-3f9b0312bb6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f551149-7234-40da-8566-3f9b0312bb6b
Content-Type: application/json

--- request body ---
{"handle":"qa-9bfa921e9e2f","displayName":"QA 9bfa921e9e2f","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f551149-7234-40da-8566-3f9b0312bb6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 7
Location: /v1/accounts/qa-9bfa921e9e2f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fcca908d-30ed-4308-9d9a-7860b1dde2a4","handle":"qa-9bfa921e9e2f","displayName":"QA 9bfa921e9e2f","region":"eu","role":"user","createdAt":"2026-11-17T10:50:20.020194464Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b9704a2b-a0c1-4cf8-963f-23589be69bad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9704a2b-a0c1-4cf8-963f-23589be69bad
Content-Type: application/json

--- request body ---
{"handle":"qa-15e016a9e6b4","displayName":"QA 15e016a9e6b4","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9704a2b-a0c1-4cf8-963f-23589be69bad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 7
Location: /v1/accounts/qa-15e016a9e6b4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9f3e2be-e135-459a-830f-5ba95cf37f68","handle":"qa-15e016a9e6b4","displayName":"QA 15e016a9e6b4","region":"eu","role":"user","createdAt":"2026-11-17T10:50:20.056293438Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-08b3324f-20a3-4c52-a446-e6cba63a7ae3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08b3324f-20a3-4c52-a446-e6cba63a7ae3
Content-Type: application/json

--- request body ---
{"handle":"qa-9bfa921e9e2f","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-08b3324f-20a3-4c52-a446-e6cba63a7ae3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fcca908d-30ed-4308-9d9a-7860b1dde2a4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ade4dafd-40fd-43bb-a885-7d95e6648ab9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ade4dafd-40fd-43bb-a885-7d95e6648ab9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-15e016a9e6b4","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-ade4dafd-40fd-43bb-a885-7d95e6648ab9
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
Location: /v1/conversations/cnv_9813b342-1155-4274-8583-7388902c78e3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9813b342-1155-4274-8583-7388902c78e3","subject":"Error contract","status":"open","region":"eu","participants":["qa-9bfa921e9e2f","qa-15e016a9e6b4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:20.094210264Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-5151c06e-f081-4c63-a5b7-01ea2218a382

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 730051c0-e7c9-462c-93ae-79ceaedad4c0
X-Correlation-Id: qa-5151c06e-f081-4c63-a5b7-01ea2218a382
Content-Type: application/json

--- response: 503 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5151c06e-f081-4c63-a5b7-01ea2218a382
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-5151c06e-f081-4c63-a5b7-01ea2218a382"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7d2e8c00-65ed-4a5b-a6e1-e267744b9c91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d2e8c00-65ed-4a5b-a6e1-e267744b9c91
Content-Type: application/json

--- request body ---
{"handle":"qa-15e016a9e6b4","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d2e8c00-65ed-4a5b-a6e1-e267744b9c91
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9f3e2be-e135-459a-830f-5ba95cf37f68"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b3a988a-15f6-48bf-923b-bb588c55aa24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b3a988a-15f6-48bf-923b-bb588c55aa24
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b3a988a-15f6-48bf-923b-bb588c55aa24
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-67525f75-a1e2-49c5-8bf9-bff76fc7976d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67525f75-a1e2-49c5-8bf9-bff76fc7976d
Content-Type: application/json

--- request body ---
{"handle":"qa-15e016a9e6b4","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67525f75-a1e2-49c5-8bf9-bff76fc7976d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67525f75-a1e2-49c5-8bf9-bff76fc7976d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e5c07e22-347d-497f-9df6-3fae422a6528

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5c07e22-347d-497f-9df6-3fae422a6528
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e5c07e22-347d-497f-9df6-3fae422a6528
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-db5a1601-66bd-475f-9e35-b4133c48ee6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db5a1601-66bd-475f-9e35-b4133c48ee6d
Content-Type: application/json

--- request body ---
{"handle":"qa-9bfa921e9e2f","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db5a1601-66bd-475f-9e35-b4133c48ee6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db5a1601-66bd-475f-9e35-b4133c48ee6d"}
```
