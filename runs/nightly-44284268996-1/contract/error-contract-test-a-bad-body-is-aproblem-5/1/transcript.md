# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-26b22db1-a810-41ad-97b9-e5a1a2e150a8` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-e72ffa11-e78f-4210-ac77-28e457f3d22c` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-ec256dc2-ecd8-4701-a523-782d8689f9ef` |
| 4 | `POST /v1/conversations` | 201 | 32 | `qa-6654dd6d-2b5b-4b47-8758-b71cdbb313e8` |
| 5 | `POST /v1/accounts` | 422 | 19 | `qa-94636c88-d23f-4990-95b3-e7db130ce69e` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-bd7c8b11-951d-4550-8ac6-9ac8c8484439` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-8a06a6e2-d8af-4904-a9b6-ec88c5d36e45` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-3e7697b4-30db-4ae9-80b7-f8d58d45b180` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-3f3e936b-68c2-4963-b883-e60cf9788dc3` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-8bd0e44e-7b05-46d3-9153-54569dc6d1f4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-26b22db1-a810-41ad-97b9-e5a1a2e150a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26b22db1-a810-41ad-97b9-e5a1a2e150a8
Content-Type: application/json

--- request body ---
{"handle":"qa-d0b116bab52d","displayName":"QA d0b116bab52d","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-26b22db1-a810-41ad-97b9-e5a1a2e150a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Location: /v1/accounts/qa-d0b116bab52d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5615c179-5b22-4292-8ef6-eb5dcd3a4783","handle":"qa-d0b116bab52d","displayName":"QA d0b116bab52d","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.689316154Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e72ffa11-e78f-4210-ac77-28e457f3d22c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e72ffa11-e78f-4210-ac77-28e457f3d22c
Content-Type: application/json

--- request body ---
{"handle":"qa-bc593e88658d","displayName":"QA bc593e88658d","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-e72ffa11-e78f-4210-ac77-28e457f3d22c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Location: /v1/accounts/qa-bc593e88658d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_23b187fb-6802-42da-8713-467b74fe3329","handle":"qa-bc593e88658d","displayName":"QA bc593e88658d","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.738245554Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ec256dc2-ecd8-4701-a523-782d8689f9ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec256dc2-ecd8-4701-a523-782d8689f9ef
Content-Type: application/json

--- request body ---
{"handle":"qa-d0b116bab52d","password":"****"}

--- response: 200 in 32 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec256dc2-ecd8-4701-a523-782d8689f9ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5615c179-5b22-4292-8ef6-eb5dcd3a4783"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6654dd6d-2b5b-4b47-8758-b71cdbb313e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6654dd6d-2b5b-4b47-8758-b71cdbb313e8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bc593e88658d","subject":"Error contract","message":"Hi"}

--- response: 201 in 32 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-6654dd6d-2b5b-4b47-8758-b71cdbb313e8
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
Location: /v1/conversations/cnv_56dda061-7b38-40cc-aa44-c91e1f0882bb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_56dda061-7b38-40cc-aa44-c91e1f0882bb","subject":"Error contract","status":"open","region":"eu","participants":["qa-d0b116bab52d","qa-bc593e88658d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:51.837419634Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-94636c88-d23f-4990-95b3-e7db130ce69e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94636c88-d23f-4990-95b3-e7db130ce69e
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94636c88-d23f-4990-95b3-e7db130ce69e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-94636c88-d23f-4990-95b3-e7db130ce69e","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bd7c8b11-951d-4550-8ac6-9ac8c8484439

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd7c8b11-951d-4550-8ac6-9ac8c8484439
Content-Type: application/json

--- request body ---
{"handle":"qa-bc593e88658d","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd7c8b11-951d-4550-8ac6-9ac8c8484439
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23b187fb-6802-42da-8713-467b74fe3329"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8a06a6e2-d8af-4904-a9b6-ec88c5d36e45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a06a6e2-d8af-4904-a9b6-ec88c5d36e45
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8a06a6e2-d8af-4904-a9b6-ec88c5d36e45
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
correlation: qa-3e7697b4-30db-4ae9-80b7-f8d58d45b180

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e7697b4-30db-4ae9-80b7-f8d58d45b180
Content-Type: application/json

--- request body ---
{"handle":"qa-bc593e88658d","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e7697b4-30db-4ae9-80b7-f8d58d45b180
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3e7697b4-30db-4ae9-80b7-f8d58d45b180"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f3e936b-68c2-4963-b883-e60cf9788dc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f3e936b-68c2-4963-b883-e60cf9788dc3
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3f3e936b-68c2-4963-b883-e60cf9788dc3
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8bd0e44e-7b05-46d3-9153-54569dc6d1f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bd0e44e-7b05-46d3-9153-54569dc6d1f4
Content-Type: application/json

--- request body ---
{"handle":"qa-d0b116bab52d","password":"****"}

--- response: 401 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bd0e44e-7b05-46d3-9153-54569dc6d1f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8bd0e44e-7b05-46d3-9153-54569dc6d1f4"}
```
