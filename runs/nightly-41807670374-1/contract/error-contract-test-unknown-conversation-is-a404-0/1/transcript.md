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
| 1 | `POST /v1/accounts` | 201 | 5 | `qa-492e9578-7afc-47b2-b1a8-4094ab61aea8` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-6bd485f1-09d0-4c55-9c21-0f6f8a572c66` |
| 3 | `GET /v1/conversations/{id}` | 404 | 5 | `qa-df8a5980-b0eb-438e-9db6-2842b1f2076d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-7ebd7211-651a-450a-b874-26b34f7c8d91` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-8c3641c6-fb82-4c5c-9310-dc3dac03d831` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-492e9578-7afc-47b2-b1a8-4094ab61aea8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-492e9578-7afc-47b2-b1a8-4094ab61aea8
Content-Type: application/json

--- request body ---
{"handle":"qa-009e09e80732","displayName":"QA 009e09e80732","password":"****","region":"eu"}

--- response: 201 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-492e9578-7afc-47b2-b1a8-4094ab61aea8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 8
Location: /v1/accounts/qa-009e09e80732
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f39978c4-336a-4db4-a166-580c9033dbae","handle":"qa-009e09e80732","displayName":"QA 009e09e80732","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.734345691Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6bd485f1-09d0-4c55-9c21-0f6f8a572c66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bd485f1-09d0-4c55-9c21-0f6f8a572c66
Content-Type: application/json

--- request body ---
{"handle":"qa-009e09e80732","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bd485f1-09d0-4c55-9c21-0f6f8a572c66
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f39978c4-336a-4db4-a166-580c9033dbae"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-df8a5980-b0eb-438e-9db6-2842b1f2076d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df8a5980-b0eb-438e-9db6-2842b1f2076d
Content-Type: application/json

--- response: 404 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df8a5980-b0eb-438e-9db6-2842b1f2076d
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-df8a5980-b0eb-438e-9db6-2842b1f2076d"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7ebd7211-651a-450a-b874-26b34f7c8d91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ebd7211-651a-450a-b874-26b34f7c8d91
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7ebd7211-651a-450a-b874-26b34f7c8d91
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
correlation: qa-8c3641c6-fb82-4c5c-9310-dc3dac03d831

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c3641c6-fb82-4c5c-9310-dc3dac03d831
Content-Type: application/json

--- request body ---
{"handle":"qa-009e09e80732","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c3641c6-fb82-4c5c-9310-dc3dac03d831
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c3641c6-fb82-4c5c-9310-dc3dac03d831"}
```
