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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-0361df6c-c43d-4141-a13c-91636cf835b3` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-705a5e59-0045-4aee-a395-cbaa7654bd2a` |
| 3 | `GET /v1/conversations/{id}` | 404 | 13 | `qa-3668f102-9e44-4f95-add0-3eb2585dc73b` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-7026edcd-30fd-4d5a-8ceb-587eb8057e8c` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-a4fe45d4-37a7-4171-b743-2f4ef4419db2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0361df6c-c43d-4141-a13c-91636cf835b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0361df6c-c43d-4141-a13c-91636cf835b3
Content-Type: application/json

--- request body ---
{"handle":"qa-c266b5491ae7","displayName":"QA c266b5491ae7","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0361df6c-c43d-4141-a13c-91636cf835b3
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
Location: /v1/accounts/qa-c266b5491ae7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d7c1a0dc-5cad-472f-9135-a32d7957eaf5","handle":"qa-c266b5491ae7","displayName":"QA c266b5491ae7","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.838580042Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-705a5e59-0045-4aee-a395-cbaa7654bd2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-705a5e59-0045-4aee-a395-cbaa7654bd2a
Content-Type: application/json

--- request body ---
{"handle":"qa-c266b5491ae7","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-705a5e59-0045-4aee-a395-cbaa7654bd2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d7c1a0dc-5cad-472f-9135-a32d7957eaf5"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-3668f102-9e44-4f95-add0-3eb2585dc73b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3668f102-9e44-4f95-add0-3eb2585dc73b
Content-Type: application/json

--- response: 404 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3668f102-9e44-4f95-add0-3eb2585dc73b
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-3668f102-9e44-4f95-add0-3eb2585dc73b"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7026edcd-30fd-4d5a-8ceb-587eb8057e8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7026edcd-30fd-4d5a-8ceb-587eb8057e8c
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7026edcd-30fd-4d5a-8ceb-587eb8057e8c
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
correlation: qa-a4fe45d4-37a7-4171-b743-2f4ef4419db2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4fe45d4-37a7-4171-b743-2f4ef4419db2
Content-Type: application/json

--- request body ---
{"handle":"qa-c266b5491ae7","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4fe45d4-37a7-4171-b743-2f4ef4419db2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4fe45d4-37a7-4171-b743-2f4ef4419db2"}
```
