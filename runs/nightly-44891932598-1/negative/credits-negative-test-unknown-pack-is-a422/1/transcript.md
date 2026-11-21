# Transcript: An unknown credit pack is a 422 on packId

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#unknownPackIsA422` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-5ae9ad86-7d53-4697-ba70-5f9b01fb2334` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-723f2229-5bc6-49f3-b571-cdae30709e8f` |
| 3 | `POST /v1/credits/purchases` | 422 | 16 | `qa-3b360b2d-b9c0-488a-b19b-d029609cd802` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-fccf74be-46eb-4471-bfbe-656f8c6c2207` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-8f3624dc-0c14-477a-8460-b8e9802cffda` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5ae9ad86-7d53-4697-ba70-5f9b01fb2334

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ae9ad86-7d53-4697-ba70-5f9b01fb2334
Content-Type: application/json

--- request body ---
{"handle":"qa-c95238811ef5","displayName":"QA c95238811ef5","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ae9ad86-7d53-4697-ba70-5f9b01fb2334
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
Location: /v1/accounts/qa-c95238811ef5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b20a2530-332b-43f3-9007-a32e694513a8","handle":"qa-c95238811ef5","displayName":"QA c95238811ef5","region":"eu","role":"user","createdAt":"2026-11-21T09:56:59.960501928Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-723f2229-5bc6-49f3-b571-cdae30709e8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-723f2229-5bc6-49f3-b571-cdae30709e8f
Content-Type: application/json

--- request body ---
{"handle":"qa-c95238811ef5","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-723f2229-5bc6-49f3-b571-cdae30709e8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b20a2530-332b-43f3-9007-a32e694513a8"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3b360b2d-b9c0-488a-b19b-d029609cd802

--- request headers ---
Accept: application/json
Idempotency-Key: qa-afb2e03f7d644337ab86c1d8fd600253
X-Correlation-Id: qa-3b360b2d-b9c0-488a-b19b-d029609cd802
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b360b2d-b9c0-488a-b19b-d029609cd802
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-3b360b2d-b9c0-488a-b19b-d029609cd802","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fccf74be-46eb-4471-bfbe-656f8c6c2207

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fccf74be-46eb-4471-bfbe-656f8c6c2207
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fccf74be-46eb-4471-bfbe-656f8c6c2207
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
correlation: qa-8f3624dc-0c14-477a-8460-b8e9802cffda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f3624dc-0c14-477a-8460-b8e9802cffda
Content-Type: application/json

--- request body ---
{"handle":"qa-c95238811ef5","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f3624dc-0c14-477a-8460-b8e9802cffda
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f3624dc-0c14-477a-8460-b8e9802cffda"}
```
