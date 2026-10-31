# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-6d7e982d-8bef-4cf0-b626-7d5e737c874e` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-5cdb0b16-7b6a-4bdd-b58e-f68bb4ce7f35` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-42058e23-1448-4c99-ba54-f1c577c00e57` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-d24f3b96-0ad9-416f-8087-4a45d17446f6` |
| 5 | `PATCH /v1/accounts/me` | 422 | 8 | `qa-77f9f40b-7171-452a-ac20-b95edaf36274` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-d859eaa6-b3bd-4d7a-b59c-a6ab34c0e024` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-cb2d5c21-ab6a-440f-b35e-5b2d432cf91e` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-a1dbcf3a-20de-4a3d-a50c-58ca0c915119` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-4db456c8-01ce-4eb8-8a63-873e708054c1` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-94a65ed3-af7d-4e0c-bd06-a1c54d2c9cfd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6d7e982d-8bef-4cf0-b626-7d5e737c874e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d7e982d-8bef-4cf0-b626-7d5e737c874e
Content-Type: application/json

--- request body ---
{"handle":"qa-5f22ffb959d1","displayName":"QA 5f22ffb959d1","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d7e982d-8bef-4cf0-b626-7d5e737c874e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Location: /v1/accounts/qa-5f22ffb959d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e61ec909-a340-4f90-8bb4-450817db4aa4","handle":"qa-5f22ffb959d1","displayName":"QA 5f22ffb959d1","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.074132964Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5cdb0b16-7b6a-4bdd-b58e-f68bb4ce7f35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cdb0b16-7b6a-4bdd-b58e-f68bb4ce7f35
Content-Type: application/json

--- request body ---
{"handle":"qa-69992df2568c","displayName":"QA 69992df2568c","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cdb0b16-7b6a-4bdd-b58e-f68bb4ce7f35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Location: /v1/accounts/qa-69992df2568c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4fe9d5e2-b532-4922-b591-6109cf0635c9","handle":"qa-69992df2568c","displayName":"QA 69992df2568c","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.087725165Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-42058e23-1448-4c99-ba54-f1c577c00e57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42058e23-1448-4c99-ba54-f1c577c00e57
Content-Type: application/json

--- request body ---
{"handle":"qa-5f22ffb959d1","password":"****"}

--- response: 200 in 31 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-42058e23-1448-4c99-ba54-f1c577c00e57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e61ec909-a340-4f90-8bb4-450817db4aa4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d24f3b96-0ad9-416f-8087-4a45d17446f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d24f3b96-0ad9-416f-8087-4a45d17446f6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-69992df2568c","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d24f3b96-0ad9-416f-8087-4a45d17446f6
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
Location: /v1/conversations/cnv_373ba600-7af2-46b7-aa0d-40dfd3205401
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_373ba600-7af2-46b7-aa0d-40dfd3205401","subject":"Error contract","status":"open","region":"eu","participants":["qa-5f22ffb959d1","qa-69992df2568c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.163109290Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-77f9f40b-7171-452a-ac20-b95edaf36274

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77f9f40b-7171-452a-ac20-b95edaf36274
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77f9f40b-7171-452a-ac20-b95edaf36274
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-77f9f40b-7171-452a-ac20-b95edaf36274","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d859eaa6-b3bd-4d7a-b59c-a6ab34c0e024

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d859eaa6-b3bd-4d7a-b59c-a6ab34c0e024
Content-Type: application/json

--- request body ---
{"handle":"qa-69992df2568c","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d859eaa6-b3bd-4d7a-b59c-a6ab34c0e024
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4fe9d5e2-b532-4922-b591-6109cf0635c9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cb2d5c21-ab6a-440f-b35e-5b2d432cf91e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb2d5c21-ab6a-440f-b35e-5b2d432cf91e
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cb2d5c21-ab6a-440f-b35e-5b2d432cf91e
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
correlation: qa-a1dbcf3a-20de-4a3d-a50c-58ca0c915119

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1dbcf3a-20de-4a3d-a50c-58ca0c915119
Content-Type: application/json

--- request body ---
{"handle":"qa-69992df2568c","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1dbcf3a-20de-4a3d-a50c-58ca0c915119
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1dbcf3a-20de-4a3d-a50c-58ca0c915119"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4db456c8-01ce-4eb8-8a63-873e708054c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4db456c8-01ce-4eb8-8a63-873e708054c1
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4db456c8-01ce-4eb8-8a63-873e708054c1
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
correlation: qa-94a65ed3-af7d-4e0c-bd06-a1c54d2c9cfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94a65ed3-af7d-4e0c-bd06-a1c54d2c9cfd
Content-Type: application/json

--- request body ---
{"handle":"qa-5f22ffb959d1","password":"****"}

--- response: 401 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94a65ed3-af7d-4e0c-bd06-a1c54d2c9cfd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-94a65ed3-af7d-4e0c-bd06-a1c54d2c9cfd"}
```
