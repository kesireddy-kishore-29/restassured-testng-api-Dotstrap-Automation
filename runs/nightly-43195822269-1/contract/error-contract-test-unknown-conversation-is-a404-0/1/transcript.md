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
| 1 | `POST /v1/accounts` | 201 | 4 | `qa-7e94b52a-6ab1-456f-be8d-cae3e3bbf58a` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-d2a56637-d2d0-45bb-bca1-c2d93e1172bc` |
| 3 | `GET /v1/conversations/{id}` | 404 | 7 | `qa-ada0f963-301c-4b16-8cb5-d22c6c015ff3` |
| 4 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-f8617494-9241-4edc-8e02-10856c9bad80` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-796e1e2f-0e94-48db-91f4-e92a5ab0b442` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7e94b52a-6ab1-456f-be8d-cae3e3bbf58a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e94b52a-6ab1-456f-be8d-cae3e3bbf58a
Content-Type: application/json

--- request body ---
{"handle":"qa-662c29d2e069","displayName":"QA 662c29d2e069","password":"****","region":"eu"}

--- response: 201 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e94b52a-6ab1-456f-be8d-cae3e3bbf58a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 7
Location: /v1/accounts/qa-662c29d2e069
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3fadf2ab-18f6-45b0-bc57-c7a18fecdb08","handle":"qa-662c29d2e069","displayName":"QA 662c29d2e069","region":"eu","role":"user","createdAt":"2026-11-12T09:56:32.426722413Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d2a56637-d2d0-45bb-bca1-c2d93e1172bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2a56637-d2d0-45bb-bca1-c2d93e1172bc
Content-Type: application/json

--- request body ---
{"handle":"qa-662c29d2e069","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2a56637-d2d0-45bb-bca1-c2d93e1172bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3fadf2ab-18f6-45b0-bc57-c7a18fecdb08"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-ada0f963-301c-4b16-8cb5-d22c6c015ff3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ada0f963-301c-4b16-8cb5-d22c6c015ff3
Content-Type: application/json

--- response: 404 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ada0f963-301c-4b16-8cb5-d22c6c015ff3
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-ada0f963-301c-4b16-8cb5-d22c6c015ff3"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f8617494-9241-4edc-8e02-10856c9bad80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8617494-9241-4edc-8e02-10856c9bad80
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f8617494-9241-4edc-8e02-10856c9bad80
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
correlation: qa-796e1e2f-0e94-48db-91f4-e92a5ab0b442

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-796e1e2f-0e94-48db-91f4-e92a5ab0b442
Content-Type: application/json

--- request body ---
{"handle":"qa-662c29d2e069","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-796e1e2f-0e94-48db-91f4-e92a5ab0b442
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-796e1e2f-0e94-48db-91f4-e92a5ab0b442"}
```
