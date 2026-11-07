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
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-da7b7bad-42a0-4122-b71e-90e38c547ee4` |
| 2 | `POST /v1/auth/token` | 200 | 58 | `qa-80fe90b9-a679-4d23-9996-ba4bb3542893` |
| 3 | `GET /v1/conversations/{id}` | 404 | 17 | `qa-66a7d352-ae5e-4ba1-8456-3bf8fa3b5bb6` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-00a7a17d-4e99-45f4-b11e-bf183256ca2e` |
| 5 | `POST /v1/auth/token` | 401 | 20 | `qa-f95a8775-f0e7-4179-9df3-603431aa4817` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-da7b7bad-42a0-4122-b71e-90e38c547ee4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da7b7bad-42a0-4122-b71e-90e38c547ee4
Content-Type: application/json

--- request body ---
{"handle":"qa-f95fc4088140","displayName":"QA f95fc4088140","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-da7b7bad-42a0-4122-b71e-90e38c547ee4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 5
Location: /v1/accounts/qa-f95fc4088140
X-Served-Region: eu
Content-Length: 181

{"id":"acc_438c75d0-a465-4a78-b2d6-bf4ba40ecac7","handle":"qa-f95fc4088140","displayName":"QA f95fc4088140","region":"eu","role":"user","createdAt":"2026-11-06T09:30:35.149911903Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-80fe90b9-a679-4d23-9996-ba4bb3542893

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80fe90b9-a679-4d23-9996-ba4bb3542893
Content-Type: application/json

--- request body ---
{"handle":"qa-f95fc4088140","password":"****"}

--- response: 200 in 58 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-80fe90b9-a679-4d23-9996-ba4bb3542893
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_438c75d0-a465-4a78-b2d6-bf4ba40ecac7"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-66a7d352-ae5e-4ba1-8456-3bf8fa3b5bb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66a7d352-ae5e-4ba1-8456-3bf8fa3b5bb6
Content-Type: application/json

--- response: 404 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66a7d352-ae5e-4ba1-8456-3bf8fa3b5bb6
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-66a7d352-ae5e-4ba1-8456-3bf8fa3b5bb6"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-00a7a17d-4e99-45f4-b11e-bf183256ca2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00a7a17d-4e99-45f4-b11e-bf183256ca2e
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-00a7a17d-4e99-45f4-b11e-bf183256ca2e
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
correlation: qa-f95a8775-f0e7-4179-9df3-603431aa4817

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f95a8775-f0e7-4179-9df3-603431aa4817
Content-Type: application/json

--- request body ---
{"handle":"qa-f95fc4088140","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f95a8775-f0e7-4179-9df3-603431aa4817
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f95a8775-f0e7-4179-9df3-603431aa4817"}
```
