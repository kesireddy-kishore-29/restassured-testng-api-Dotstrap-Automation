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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-4cde344b-7cc4-426d-996f-e813f5986c47` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-626fa42f-4ea7-466d-9754-d2a9912373fd` |
| 3 | `GET /v1/conversations/{id}` | 404 | 15 | `qa-21dd715a-bf8e-4027-9182-b207f0a2c4bc` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-672ec2c9-813d-4f17-880c-02661c621a40` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-69088156-5762-4551-a3f7-bb75d09b7a92` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4cde344b-7cc4-426d-996f-e813f5986c47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cde344b-7cc4-426d-996f-e813f5986c47
Content-Type: application/json

--- request body ---
{"handle":"qa-c12c25718c28","displayName":"QA c12c25718c28","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cde344b-7cc4-426d-996f-e813f5986c47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 5
Location: /v1/accounts/qa-c12c25718c28
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2260566a-1b7b-4cf4-8a8d-f5f1a16b2b18","handle":"qa-c12c25718c28","displayName":"QA c12c25718c28","region":"eu","role":"user","createdAt":"2026-11-21T09:57:13.179047058Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-626fa42f-4ea7-466d-9754-d2a9912373fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-626fa42f-4ea7-466d-9754-d2a9912373fd
Content-Type: application/json

--- request body ---
{"handle":"qa-c12c25718c28","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-626fa42f-4ea7-466d-9754-d2a9912373fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2260566a-1b7b-4cf4-8a8d-f5f1a16b2b18"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-21dd715a-bf8e-4027-9182-b207f0a2c4bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21dd715a-bf8e-4027-9182-b207f0a2c4bc
Content-Type: application/json

--- response: 404 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-21dd715a-bf8e-4027-9182-b207f0a2c4bc
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-21dd715a-bf8e-4027-9182-b207f0a2c4bc"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-672ec2c9-813d-4f17-880c-02661c621a40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-672ec2c9-813d-4f17-880c-02661c621a40
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-672ec2c9-813d-4f17-880c-02661c621a40
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
correlation: qa-69088156-5762-4551-a3f7-bb75d09b7a92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69088156-5762-4551-a3f7-bb75d09b7a92
Content-Type: application/json

--- request body ---
{"handle":"qa-c12c25718c28","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69088156-5762-4551-a3f7-bb75d09b7a92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-69088156-5762-4551-a3f7-bb75d09b7a92"}
```
