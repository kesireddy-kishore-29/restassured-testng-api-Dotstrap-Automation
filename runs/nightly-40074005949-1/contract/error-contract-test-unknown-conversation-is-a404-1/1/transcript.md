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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-32c1a88c-7312-42ab-a0ed-e6fba23fe649` |
| 2 | `POST /v1/auth/token` | 200 | 36 | `qa-740906f9-7371-40ea-9b59-db578aa53200` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 7 | `qa-0108e2a8-d3a2-4696-983f-ff354a363233` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-e91b4116-d457-430f-9d2d-1850723881bb` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-e07df500-b63a-4055-a422-2b536e6b9e1e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-32c1a88c-7312-42ab-a0ed-e6fba23fe649

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32c1a88c-7312-42ab-a0ed-e6fba23fe649
Content-Type: application/json

--- request body ---
{"handle":"qa-2a2ee24c9cd9","displayName":"QA 2a2ee24c9cd9","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-32c1a88c-7312-42ab-a0ed-e6fba23fe649
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
Location: /v1/accounts/qa-2a2ee24c9cd9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_06c2aa54-5361-4af3-8f10-4f97cd2337df","handle":"qa-2a2ee24c9cd9","displayName":"QA 2a2ee24c9cd9","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.265761846Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-740906f9-7371-40ea-9b59-db578aa53200

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-740906f9-7371-40ea-9b59-db578aa53200
Content-Type: application/json

--- request body ---
{"handle":"qa-2a2ee24c9cd9","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-740906f9-7371-40ea-9b59-db578aa53200
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_06c2aa54-5361-4af3-8f10-4f97cd2337df"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-0108e2a8-d3a2-4696-983f-ff354a363233

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0108e2a8-d3a2-4696-983f-ff354a363233
Content-Type: application/json

--- response: 404 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0108e2a8-d3a2-4696-983f-ff354a363233
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-0108e2a8-d3a2-4696-983f-ff354a363233"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e91b4116-d457-430f-9d2d-1850723881bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e91b4116-d457-430f-9d2d-1850723881bb
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e91b4116-d457-430f-9d2d-1850723881bb
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
correlation: qa-e07df500-b63a-4055-a422-2b536e6b9e1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e07df500-b63a-4055-a422-2b536e6b9e1e
Content-Type: application/json

--- request body ---
{"handle":"qa-2a2ee24c9cd9","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e07df500-b63a-4055-a422-2b536e6b9e1e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e07df500-b63a-4055-a422-2b536e6b9e1e"}
```
