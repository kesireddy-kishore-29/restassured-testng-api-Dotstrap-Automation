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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-0d80c2a4-ead0-453b-b5ba-3dbcc3765384` |
| 2 | `POST /v1/auth/token` | 200 | 32 | `qa-4a4b41f6-706e-438f-9c32-dc30ad154a4b` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 12 | `qa-d0c747f9-f036-4067-bb1c-848ba4d29c02` |
| 4 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-b1a35a1e-48f0-4fe5-bcf4-1763fb087160` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-daa8c648-edfd-4155-8b6c-205b96254ce0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0d80c2a4-ead0-453b-b5ba-3dbcc3765384

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d80c2a4-ead0-453b-b5ba-3dbcc3765384
Content-Type: application/json

--- request body ---
{"handle":"qa-5d5972565205","displayName":"QA 5d5972565205","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d80c2a4-ead0-453b-b5ba-3dbcc3765384
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
Location: /v1/accounts/qa-5d5972565205
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3633959b-6ed7-4cab-8c15-ed446b092225","handle":"qa-5d5972565205","displayName":"QA 5d5972565205","region":"eu","role":"user","createdAt":"2026-11-26T11:02:47.319076425Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4a4b41f6-706e-438f-9c32-dc30ad154a4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a4b41f6-706e-438f-9c32-dc30ad154a4b
Content-Type: application/json

--- request body ---
{"handle":"qa-5d5972565205","password":"****"}

--- response: 200 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a4b41f6-706e-438f-9c32-dc30ad154a4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3633959b-6ed7-4cab-8c15-ed446b092225"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-d0c747f9-f036-4067-bb1c-848ba4d29c02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0c747f9-f036-4067-bb1c-848ba4d29c02
Content-Type: application/json

--- response: 404 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0c747f9-f036-4067-bb1c-848ba4d29c02
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-d0c747f9-f036-4067-bb1c-848ba4d29c02"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b1a35a1e-48f0-4fe5-bcf4-1763fb087160

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1a35a1e-48f0-4fe5-bcf4-1763fb087160
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b1a35a1e-48f0-4fe5-bcf4-1763fb087160
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
correlation: qa-daa8c648-edfd-4155-8b6c-205b96254ce0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daa8c648-edfd-4155-8b6c-205b96254ce0
Content-Type: application/json

--- request body ---
{"handle":"qa-5d5972565205","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-daa8c648-edfd-4155-8b6c-205b96254ce0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-daa8c648-edfd-4155-8b6c-205b96254ce0"}
```
