# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-5ce01cfc-6aa9-4b31-be0a-9836f2212800` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-ccb892b4-830d-4db9-96aa-dae290f55583` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-92d06844-b8fb-4f9e-a18e-a4cdd4a85bac` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-94acaa9d-ca59-443e-a04b-1e4cc0eeb1fb` |
| 5 | `POST /v1/conversations` | 422 | 28 | `qa-7ea40bd0-792e-49a1-8dc9-70329bc8eb4c` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-8ad2e2ad-93f0-40ee-bd21-def26f52860a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-5fd66d05-4417-4585-9a96-8a6d08b5f1b7` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-1738d0d0-cd16-4a31-965f-4de24962388c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-6d272431-9983-43b3-99e8-5dd46b9e8ab5` |
| 10 | `POST /v1/auth/token` | 401 | 3 | `qa-e20f234c-70ca-4c3d-bbc3-c228710c80ee` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5ce01cfc-6aa9-4b31-be0a-9836f2212800

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ce01cfc-6aa9-4b31-be0a-9836f2212800
Content-Type: application/json

--- request body ---
{"handle":"qa-f2093ddb5e3b","displayName":"QA f2093ddb5e3b","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ce01cfc-6aa9-4b31-be0a-9836f2212800
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Location: /v1/accounts/qa-f2093ddb5e3b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_94b82bc4-6109-4ae2-9ccd-7a7e4428e339","handle":"qa-f2093ddb5e3b","displayName":"QA f2093ddb5e3b","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.339458245Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ccb892b4-830d-4db9-96aa-dae290f55583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccb892b4-830d-4db9-96aa-dae290f55583
Content-Type: application/json

--- request body ---
{"handle":"qa-2aec891751ce","displayName":"QA 2aec891751ce","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccb892b4-830d-4db9-96aa-dae290f55583
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 7
Location: /v1/accounts/qa-2aec891751ce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20f5185c-c712-44fe-9bdb-351ceb83a6f5","handle":"qa-2aec891751ce","displayName":"QA 2aec891751ce","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.389539470Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-92d06844-b8fb-4f9e-a18e-a4cdd4a85bac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92d06844-b8fb-4f9e-a18e-a4cdd4a85bac
Content-Type: application/json

--- request body ---
{"handle":"qa-f2093ddb5e3b","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-92d06844-b8fb-4f9e-a18e-a4cdd4a85bac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_94b82bc4-6109-4ae2-9ccd-7a7e4428e339"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-94acaa9d-ca59-443e-a04b-1e4cc0eeb1fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94acaa9d-ca59-443e-a04b-1e4cc0eeb1fb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2aec891751ce","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-94acaa9d-ca59-443e-a04b-1e4cc0eeb1fb
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
Location: /v1/conversations/cnv_24cf6455-1445-4b05-85a7-941c2aa61874
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_24cf6455-1445-4b05-85a7-941c2aa61874","subject":"Error contract","status":"open","region":"eu","participants":["qa-f2093ddb5e3b","qa-2aec891751ce"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.455115198Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-7ea40bd0-792e-49a1-8dc9-70329bc8eb4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ea40bd0-792e-49a1-8dc9-70329bc8eb4c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2aec891751ce","subject":" ","message":"Hi"}

--- response: 422 in 28 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ea40bd0-792e-49a1-8dc9-70329bc8eb4c
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-7ea40bd0-792e-49a1-8dc9-70329bc8eb4c","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8ad2e2ad-93f0-40ee-bd21-def26f52860a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ad2e2ad-93f0-40ee-bd21-def26f52860a
Content-Type: application/json

--- request body ---
{"handle":"qa-2aec891751ce","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ad2e2ad-93f0-40ee-bd21-def26f52860a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20f5185c-c712-44fe-9bdb-351ceb83a6f5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5fd66d05-4417-4585-9a96-8a6d08b5f1b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fd66d05-4417-4585-9a96-8a6d08b5f1b7
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5fd66d05-4417-4585-9a96-8a6d08b5f1b7
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
correlation: qa-1738d0d0-cd16-4a31-965f-4de24962388c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1738d0d0-cd16-4a31-965f-4de24962388c
Content-Type: application/json

--- request body ---
{"handle":"qa-2aec891751ce","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1738d0d0-cd16-4a31-965f-4de24962388c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1738d0d0-cd16-4a31-965f-4de24962388c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d272431-9983-43b3-99e8-5dd46b9e8ab5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d272431-9983-43b3-99e8-5dd46b9e8ab5
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d272431-9983-43b3-99e8-5dd46b9e8ab5
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
correlation: qa-e20f234c-70ca-4c3d-bbc3-c228710c80ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e20f234c-70ca-4c3d-bbc3-c228710c80ee
Content-Type: application/json

--- request body ---
{"handle":"qa-f2093ddb5e3b","password":"****"}

--- response: 401 in 3 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e20f234c-70ca-4c3d-bbc3-c228710c80ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e20f234c-70ca-4c3d-bbc3-c228710c80ee"}
```
