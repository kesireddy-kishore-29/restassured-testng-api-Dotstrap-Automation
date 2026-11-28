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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-1b69218d-c2d5-42e2-a99d-8d8e1406dec4` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-4d535aef-be6a-4194-a404-511266fa17f2` |
| 3 | `POST /v1/auth/token` | 200 | 60 | `qa-3a360297-6e09-463d-ab46-2369ae9114bb` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-4d24a618-6252-4d7e-9110-0d5a520efa7d` |
| 5 | `POST /v1/accounts` | 422 | 30 | `qa-c65e9c22-66af-4dc7-835d-c6a2f9f1df88` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-58ab7d59-1863-4e32-83ff-0cd33abd6ef8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-8835e784-617e-490c-9ae5-9e0b9484f3fd` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-a564c2a6-01f3-428e-8172-878067b6c3e8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-153f72aa-b7e3-45ff-bc22-86ca233a12f2` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-2504739a-cacf-48f9-b2a4-d5351c721304` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1b69218d-c2d5-42e2-a99d-8d8e1406dec4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b69218d-c2d5-42e2-a99d-8d8e1406dec4
Content-Type: application/json

--- request body ---
{"handle":"qa-08ce69549744","displayName":"QA 08ce69549744","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b69218d-c2d5-42e2-a99d-8d8e1406dec4
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
Location: /v1/accounts/qa-08ce69549744
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c51ec556-b211-4a79-9d80-dccc64de776e","handle":"qa-08ce69549744","displayName":"QA 08ce69549744","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.141557935Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4d535aef-be6a-4194-a404-511266fa17f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d535aef-be6a-4194-a404-511266fa17f2
Content-Type: application/json

--- request body ---
{"handle":"qa-a17d98590ea0","displayName":"QA a17d98590ea0","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d535aef-be6a-4194-a404-511266fa17f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Location: /v1/accounts/qa-a17d98590ea0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_26308efa-290e-41a3-a98a-eadc4793611c","handle":"qa-a17d98590ea0","displayName":"QA a17d98590ea0","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.182662875Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3a360297-6e09-463d-ab46-2369ae9114bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a360297-6e09-463d-ab46-2369ae9114bb
Content-Type: application/json

--- request body ---
{"handle":"qa-08ce69549744","password":"****"}

--- response: 200 in 60 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a360297-6e09-463d-ab46-2369ae9114bb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c51ec556-b211-4a79-9d80-dccc64de776e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4d24a618-6252-4d7e-9110-0d5a520efa7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d24a618-6252-4d7e-9110-0d5a520efa7d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a17d98590ea0","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d24a618-6252-4d7e-9110-0d5a520efa7d
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
Location: /v1/conversations/cnv_27b3c5da-ee45-46d9-a067-2cf61f27fcf2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_27b3c5da-ee45-46d9-a067-2cf61f27fcf2","subject":"Error contract","status":"open","region":"eu","participants":["qa-08ce69549744","qa-a17d98590ea0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.324973467Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-c65e9c22-66af-4dc7-835d-c6a2f9f1df88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c65e9c22-66af-4dc7-835d-c6a2f9f1df88
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c65e9c22-66af-4dc7-835d-c6a2f9f1df88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 7
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-c65e9c22-66af-4dc7-835d-c6a2f9f1df88","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-58ab7d59-1863-4e32-83ff-0cd33abd6ef8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58ab7d59-1863-4e32-83ff-0cd33abd6ef8
Content-Type: application/json

--- request body ---
{"handle":"qa-a17d98590ea0","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-58ab7d59-1863-4e32-83ff-0cd33abd6ef8
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_26308efa-290e-41a3-a98a-eadc4793611c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8835e784-617e-490c-9ae5-9e0b9484f3fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8835e784-617e-490c-9ae5-9e0b9484f3fd
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8835e784-617e-490c-9ae5-9e0b9484f3fd
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
correlation: qa-a564c2a6-01f3-428e-8172-878067b6c3e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a564c2a6-01f3-428e-8172-878067b6c3e8
Content-Type: application/json

--- request body ---
{"handle":"qa-a17d98590ea0","password":"****"}

--- response: 401 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a564c2a6-01f3-428e-8172-878067b6c3e8
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a564c2a6-01f3-428e-8172-878067b6c3e8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-153f72aa-b7e3-45ff-bc22-86ca233a12f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-153f72aa-b7e3-45ff-bc22-86ca233a12f2
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-153f72aa-b7e3-45ff-bc22-86ca233a12f2
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
correlation: qa-2504739a-cacf-48f9-b2a4-d5351c721304

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2504739a-cacf-48f9-b2a4-d5351c721304
Content-Type: application/json

--- request body ---
{"handle":"qa-08ce69549744","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2504739a-cacf-48f9-b2a4-d5351c721304
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2504739a-cacf-48f9-b2a4-d5351c721304"}
```
