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
| 1 | `POST /v1/accounts` | 201 | 5 | `qa-e2f192d7-aa0f-4be9-95f7-d7722cf80a50` |
| 2 | `POST /v1/auth/token` | 200 | 24 | `qa-b186b3b3-2ea0-4f10-8096-53d6fb032698` |
| 3 | `GET /v1/conversations/{id}` | 404 | 7 | `qa-ecc99988-b0a4-47de-b2b8-1d5641b8d7c3` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-94f1a7ae-7e67-477c-8d6f-94b35d42a52c` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-ded87892-0e41-4ccf-bc1b-8c0b1ee83c8f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e2f192d7-aa0f-4be9-95f7-d7722cf80a50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2f192d7-aa0f-4be9-95f7-d7722cf80a50
Content-Type: application/json

--- request body ---
{"handle":"qa-2c5bf21c9370","displayName":"QA 2c5bf21c9370","password":"****","region":"eu"}

--- response: 201 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2f192d7-aa0f-4be9-95f7-d7722cf80a50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 7
Location: /v1/accounts/qa-2c5bf21c9370
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bc99e1b9-bc9c-411f-99a5-f3374cf95753","handle":"qa-2c5bf21c9370","displayName":"QA 2c5bf21c9370","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.898897900Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b186b3b3-2ea0-4f10-8096-53d6fb032698

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b186b3b3-2ea0-4f10-8096-53d6fb032698
Content-Type: application/json

--- request body ---
{"handle":"qa-2c5bf21c9370","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b186b3b3-2ea0-4f10-8096-53d6fb032698
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bc99e1b9-bc9c-411f-99a5-f3374cf95753"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-ecc99988-b0a4-47de-b2b8-1d5641b8d7c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecc99988-b0a4-47de-b2b8-1d5641b8d7c3
Content-Type: application/json

--- response: 404 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ecc99988-b0a4-47de-b2b8-1d5641b8d7c3
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-ecc99988-b0a4-47de-b2b8-1d5641b8d7c3"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-94f1a7ae-7e67-477c-8d6f-94b35d42a52c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94f1a7ae-7e67-477c-8d6f-94b35d42a52c
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-94f1a7ae-7e67-477c-8d6f-94b35d42a52c
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
correlation: qa-ded87892-0e41-4ccf-bc1b-8c0b1ee83c8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ded87892-0e41-4ccf-bc1b-8c0b1ee83c8f
Content-Type: application/json

--- request body ---
{"handle":"qa-2c5bf21c9370","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ded87892-0e41-4ccf-bc1b-8c0b1ee83c8f
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ded87892-0e41-4ccf-bc1b-8c0b1ee83c8f"}
```
