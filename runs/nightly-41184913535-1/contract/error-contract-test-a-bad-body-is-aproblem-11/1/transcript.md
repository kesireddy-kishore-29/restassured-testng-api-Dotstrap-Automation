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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-7e18dd77-9f01-4695-8ed6-1c1802a5c898` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-2c82c33d-1ae7-48e5-8c79-2ced2f6c3811` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-97ed4c87-a22b-4e29-ad40-6a002e104f0c` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-3574f9a1-3c37-48f4-91e9-6fa58cc9252a` |
| 5 | `POST /v1/conversations` | 422 | 25 | `qa-01195b8c-828a-4e0e-b29c-418e2c3d3ae2` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-b7866491-a773-414f-a1de-4990b4db0067` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-ac4abbf2-6389-44a6-ad12-67efe3d863be` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-d01aeb0c-c395-426e-97f8-c657a42bedc1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-2e0abcbd-d336-474f-8929-52f2df48591f` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-9422f3a0-63b1-476a-8450-27ce1fa58991` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7e18dd77-9f01-4695-8ed6-1c1802a5c898

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e18dd77-9f01-4695-8ed6-1c1802a5c898
Content-Type: application/json

--- request body ---
{"handle":"qa-e921fdd30282","displayName":"QA e921fdd30282","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e18dd77-9f01-4695-8ed6-1c1802a5c898
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 7
Location: /v1/accounts/qa-e921fdd30282
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eb506d5c-87ee-4cfe-bb01-015b75028ede","handle":"qa-e921fdd30282","displayName":"QA e921fdd30282","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.741443930Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2c82c33d-1ae7-48e5-8c79-2ced2f6c3811

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c82c33d-1ae7-48e5-8c79-2ced2f6c3811
Content-Type: application/json

--- request body ---
{"handle":"qa-b8679e6ae269","displayName":"QA b8679e6ae269","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c82c33d-1ae7-48e5-8c79-2ced2f6c3811
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
Location: /v1/accounts/qa-b8679e6ae269
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7740c940-56a9-4d3a-8844-5de46ff8de7c","handle":"qa-b8679e6ae269","displayName":"QA b8679e6ae269","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.787393990Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-97ed4c87-a22b-4e29-ad40-6a002e104f0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97ed4c87-a22b-4e29-ad40-6a002e104f0c
Content-Type: application/json

--- request body ---
{"handle":"qa-e921fdd30282","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-97ed4c87-a22b-4e29-ad40-6a002e104f0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb506d5c-87ee-4cfe-bb01-015b75028ede"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3574f9a1-3c37-48f4-91e9-6fa58cc9252a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3574f9a1-3c37-48f4-91e9-6fa58cc9252a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b8679e6ae269","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3574f9a1-3c37-48f4-91e9-6fa58cc9252a
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
Location: /v1/conversations/cnv_e9ae3861-af7b-4507-8871-6c096df0a0a3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e9ae3861-af7b-4507-8871-6c096df0a0a3","subject":"Error contract","status":"open","region":"eu","participants":["qa-e921fdd30282","qa-b8679e6ae269"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.877575174Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-01195b8c-828a-4e0e-b29c-418e2c3d3ae2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01195b8c-828a-4e0e-b29c-418e2c3d3ae2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b8679e6ae269","subject":" ","message":"Hi"}

--- response: 422 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01195b8c-828a-4e0e-b29c-418e2c3d3ae2
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-01195b8c-828a-4e0e-b29c-418e2c3d3ae2","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b7866491-a773-414f-a1de-4990b4db0067

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7866491-a773-414f-a1de-4990b4db0067
Content-Type: application/json

--- request body ---
{"handle":"qa-b8679e6ae269","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7866491-a773-414f-a1de-4990b4db0067
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7740c940-56a9-4d3a-8844-5de46ff8de7c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ac4abbf2-6389-44a6-ad12-67efe3d863be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac4abbf2-6389-44a6-ad12-67efe3d863be
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ac4abbf2-6389-44a6-ad12-67efe3d863be
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
correlation: qa-d01aeb0c-c395-426e-97f8-c657a42bedc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d01aeb0c-c395-426e-97f8-c657a42bedc1
Content-Type: application/json

--- request body ---
{"handle":"qa-b8679e6ae269","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d01aeb0c-c395-426e-97f8-c657a42bedc1
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d01aeb0c-c395-426e-97f8-c657a42bedc1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e0abcbd-d336-474f-8929-52f2df48591f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e0abcbd-d336-474f-8929-52f2df48591f
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e0abcbd-d336-474f-8929-52f2df48591f
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
correlation: qa-9422f3a0-63b1-476a-8450-27ce1fa58991

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9422f3a0-63b1-476a-8450-27ce1fa58991
Content-Type: application/json

--- request body ---
{"handle":"qa-e921fdd30282","password":"****"}

--- response: 401 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9422f3a0-63b1-476a-8450-27ce1fa58991
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9422f3a0-63b1-476a-8450-27ce1fa58991"}
```
