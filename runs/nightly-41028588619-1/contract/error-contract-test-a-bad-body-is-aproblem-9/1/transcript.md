# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 73 | `qa-5dc7b522-7d87-4e70-85b5-4b89234a22e6` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-6f96dd15-f9a1-49a5-aa9a-36035e17aab9` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-57b081b0-8f05-4f92-8aba-608ed253a2b2` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-6ee1547a-1ffd-4c9e-94d9-a92dd654a80e` |
| 5 | `POST /v1/conversations` | 400 | 15 | `qa-263c064d-40f1-428e-8fda-e1c9b777283b` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-da9a38f9-4de6-4de7-9ca4-e9e390c52103` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-cc444836-e1c7-4eea-b9a6-49828310db05` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-02343da5-973d-4243-a527-ae0aa6b56a90` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-38eeaa9a-291b-4513-864c-4ea66d232e2a` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-3ead3c87-a49e-42c9-b734-f722ae995e89` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5dc7b522-7d87-4e70-85b5-4b89234a22e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dc7b522-7d87-4e70-85b5-4b89234a22e6
Content-Type: application/json

--- request body ---
{"handle":"qa-e1bbc291f5d7","displayName":"QA e1bbc291f5d7","password":"****","region":"eu"}

--- response: 201 in 73 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dc7b522-7d87-4e70-85b5-4b89234a22e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 7
Location: /v1/accounts/qa-e1bbc291f5d7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_278a6362-644f-49f3-8640-899ffb416137","handle":"qa-e1bbc291f5d7","displayName":"QA e1bbc291f5d7","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.540039647Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6f96dd15-f9a1-49a5-aa9a-36035e17aab9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f96dd15-f9a1-49a5-aa9a-36035e17aab9
Content-Type: application/json

--- request body ---
{"handle":"qa-67bd11f68d1e","displayName":"QA 67bd11f68d1e","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f96dd15-f9a1-49a5-aa9a-36035e17aab9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 7
Location: /v1/accounts/qa-67bd11f68d1e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2a05dbbb-7064-4f00-8a5b-fc474ebba68d","handle":"qa-67bd11f68d1e","displayName":"QA 67bd11f68d1e","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.574219705Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-57b081b0-8f05-4f92-8aba-608ed253a2b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57b081b0-8f05-4f92-8aba-608ed253a2b2
Content-Type: application/json

--- request body ---
{"handle":"qa-e1bbc291f5d7","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-57b081b0-8f05-4f92-8aba-608ed253a2b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_278a6362-644f-49f3-8640-899ffb416137"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6ee1547a-1ffd-4c9e-94d9-a92dd654a80e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ee1547a-1ffd-4c9e-94d9-a92dd654a80e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-67bd11f68d1e","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ee1547a-1ffd-4c9e-94d9-a92dd654a80e
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
Location: /v1/conversations/cnv_bc604072-6e3a-40b1-ba78-5c0266e47463
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bc604072-6e3a-40b1-ba78-5c0266e47463","subject":"Error contract","status":"open","region":"eu","participants":["qa-e1bbc291f5d7","qa-67bd11f68d1e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.654035901Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-263c064d-40f1-428e-8fda-e1c9b777283b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-263c064d-40f1-428e-8fda-e1c9b777283b
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-263c064d-40f1-428e-8fda-e1c9b777283b
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-263c064d-40f1-428e-8fda-e1c9b777283b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-da9a38f9-4de6-4de7-9ca4-e9e390c52103

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da9a38f9-4de6-4de7-9ca4-e9e390c52103
Content-Type: application/json

--- request body ---
{"handle":"qa-67bd11f68d1e","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-da9a38f9-4de6-4de7-9ca4-e9e390c52103
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2a05dbbb-7064-4f00-8a5b-fc474ebba68d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc444836-e1c7-4eea-b9a6-49828310db05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc444836-e1c7-4eea-b9a6-49828310db05
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc444836-e1c7-4eea-b9a6-49828310db05
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
correlation: qa-02343da5-973d-4243-a527-ae0aa6b56a90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02343da5-973d-4243-a527-ae0aa6b56a90
Content-Type: application/json

--- request body ---
{"handle":"qa-67bd11f68d1e","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02343da5-973d-4243-a527-ae0aa6b56a90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-02343da5-973d-4243-a527-ae0aa6b56a90"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-38eeaa9a-291b-4513-864c-4ea66d232e2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38eeaa9a-291b-4513-864c-4ea66d232e2a
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-38eeaa9a-291b-4513-864c-4ea66d232e2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3ead3c87-a49e-42c9-b734-f722ae995e89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ead3c87-a49e-42c9-b734-f722ae995e89
Content-Type: application/json

--- request body ---
{"handle":"qa-e1bbc291f5d7","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ead3c87-a49e-42c9-b734-f722ae995e89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3ead3c87-a49e-42c9-b734-f722ae995e89"}
```
