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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-f6bb06ca-1ed3-48b5-8b20-21d01c1d0c30` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-50ffa300-b10f-45aa-9748-29b7b896b010` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-bb3d0adb-027f-45bb-92a0-877d9c942b38` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-0156f468-bf28-43fc-9b71-4806080fc385` |
| 5 | `POST /v1/conversations` | 422 | 15 | `qa-34ccd387-16b4-4fec-bb04-bf6dcdf5b4cb` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-3c1f5342-1823-4cbc-9678-d717f051ec92` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-7a688fe2-a1bf-4965-90e4-da56d6ff3aff` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-9f10c2a9-9828-4054-9c3e-5f7e5737382c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-bcf602fc-12fe-4f74-96ce-b07e042c51a7` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-c9fd5a5f-a2b8-4c1e-b7d3-dd880b8bba45` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f6bb06ca-1ed3-48b5-8b20-21d01c1d0c30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6bb06ca-1ed3-48b5-8b20-21d01c1d0c30
Content-Type: application/json

--- request body ---
{"handle":"qa-49f409fa7f07","displayName":"QA 49f409fa7f07","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6bb06ca-1ed3-48b5-8b20-21d01c1d0c30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 7
Location: /v1/accounts/qa-49f409fa7f07
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc46df67-4e4b-427a-8582-e1382dfc6ba4","handle":"qa-49f409fa7f07","displayName":"QA 49f409fa7f07","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.564354965Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-50ffa300-b10f-45aa-9748-29b7b896b010

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50ffa300-b10f-45aa-9748-29b7b896b010
Content-Type: application/json

--- request body ---
{"handle":"qa-1f6565d664ce","displayName":"QA 1f6565d664ce","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-50ffa300-b10f-45aa-9748-29b7b896b010
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 7
Location: /v1/accounts/qa-1f6565d664ce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_977ce086-3319-4572-b9cf-0e07a28986cb","handle":"qa-1f6565d664ce","displayName":"QA 1f6565d664ce","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.620312327Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bb3d0adb-027f-45bb-92a0-877d9c942b38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb3d0adb-027f-45bb-92a0-877d9c942b38
Content-Type: application/json

--- request body ---
{"handle":"qa-49f409fa7f07","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb3d0adb-027f-45bb-92a0-877d9c942b38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc46df67-4e4b-427a-8582-e1382dfc6ba4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0156f468-bf28-43fc-9b71-4806080fc385

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0156f468-bf28-43fc-9b71-4806080fc385
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1f6565d664ce","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0156f468-bf28-43fc-9b71-4806080fc385
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
Location: /v1/conversations/cnv_232e99d0-8c37-46ba-975d-b3df9a94926a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_232e99d0-8c37-46ba-975d-b3df9a94926a","subject":"Error contract","status":"open","region":"eu","participants":["qa-49f409fa7f07","qa-1f6565d664ce"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:00.703523384Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-34ccd387-16b4-4fec-bb04-bf6dcdf5b4cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34ccd387-16b4-4fec-bb04-bf6dcdf5b4cb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1f6565d664ce","subject":" ","message":"Hi"}

--- response: 422 in 15 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34ccd387-16b4-4fec-bb04-bf6dcdf5b4cb
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-34ccd387-16b4-4fec-bb04-bf6dcdf5b4cb","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3c1f5342-1823-4cbc-9678-d717f051ec92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c1f5342-1823-4cbc-9678-d717f051ec92
Content-Type: application/json

--- request body ---
{"handle":"qa-1f6565d664ce","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c1f5342-1823-4cbc-9678-d717f051ec92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_977ce086-3319-4572-b9cf-0e07a28986cb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a688fe2-a1bf-4965-90e4-da56d6ff3aff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a688fe2-a1bf-4965-90e4-da56d6ff3aff
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a688fe2-a1bf-4965-90e4-da56d6ff3aff
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
correlation: qa-9f10c2a9-9828-4054-9c3e-5f7e5737382c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f10c2a9-9828-4054-9c3e-5f7e5737382c
Content-Type: application/json

--- request body ---
{"handle":"qa-1f6565d664ce","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f10c2a9-9828-4054-9c3e-5f7e5737382c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9f10c2a9-9828-4054-9c3e-5f7e5737382c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bcf602fc-12fe-4f74-96ce-b07e042c51a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcf602fc-12fe-4f74-96ce-b07e042c51a7
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bcf602fc-12fe-4f74-96ce-b07e042c51a7
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
correlation: qa-c9fd5a5f-a2b8-4c1e-b7d3-dd880b8bba45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9fd5a5f-a2b8-4c1e-b7d3-dd880b8bba45
Content-Type: application/json

--- request body ---
{"handle":"qa-49f409fa7f07","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9fd5a5f-a2b8-4c1e-b7d3-dd880b8bba45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c9fd5a5f-a2b8-4c1e-b7d3-dd880b8bba45"}
```
