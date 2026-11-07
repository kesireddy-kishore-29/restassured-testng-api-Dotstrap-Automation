# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-8d6c224b-3941-4270-a8b1-b1dcb30c56d3` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-9ad009b4-6168-4dc5-a196-e69c7616a0d7` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-776bc730-a636-4cb4-b2d9-f6807e43c0e8` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-0d5e7860-9f05-4425-8cad-984349bea533` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 15 | `qa-081a046e-daf7-46a8-b132-5dfc5e4286a3` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-b34212a3-14f9-4cac-a28e-96fb74bae3d7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-36dbe967-1cd2-47f5-846a-2cda12980f8f` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-80a91d41-8cdc-4234-bc15-59b7a269f095` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-f0b78cb9-ab2b-4183-ba8e-dd04f6218eea` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-36fefa23-cc8a-4be8-a037-aabaa519bf1f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8d6c224b-3941-4270-a8b1-b1dcb30c56d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d6c224b-3941-4270-a8b1-b1dcb30c56d3
Content-Type: application/json

--- request body ---
{"handle":"qa-9ef3bf3aadae","displayName":"QA 9ef3bf3aadae","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d6c224b-3941-4270-a8b1-b1dcb30c56d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 8
Location: /v1/accounts/qa-9ef3bf3aadae
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f3b123cc-420d-43db-8bf5-20c4ea0bfb87","handle":"qa-9ef3bf3aadae","displayName":"QA 9ef3bf3aadae","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.127180289Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9ad009b4-6168-4dc5-a196-e69c7616a0d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ad009b4-6168-4dc5-a196-e69c7616a0d7
Content-Type: application/json

--- request body ---
{"handle":"qa-090d64f49079","displayName":"QA 090d64f49079","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ad009b4-6168-4dc5-a196-e69c7616a0d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Location: /v1/accounts/qa-090d64f49079
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b63601d7-24fd-4d6d-a5d9-bd6c7864587a","handle":"qa-090d64f49079","displayName":"QA 090d64f49079","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.174207312Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-776bc730-a636-4cb4-b2d9-f6807e43c0e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-776bc730-a636-4cb4-b2d9-f6807e43c0e8
Content-Type: application/json

--- request body ---
{"handle":"qa-9ef3bf3aadae","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-776bc730-a636-4cb4-b2d9-f6807e43c0e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3b123cc-420d-43db-8bf5-20c4ea0bfb87"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0d5e7860-9f05-4425-8cad-984349bea533

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d5e7860-9f05-4425-8cad-984349bea533
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-090d64f49079","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d5e7860-9f05-4425-8cad-984349bea533
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
Location: /v1/conversations/cnv_76b06579-33bf-4a74-b588-2ba9cc6c2ac3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_76b06579-33bf-4a74-b588-2ba9cc6c2ac3","subject":"Error contract","status":"open","region":"eu","participants":["qa-9ef3bf3aadae","qa-090d64f49079"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:03.252049203Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_76b06579-33bf-4a74-b588-2ba9cc6c2ac3/messages
correlation: qa-081a046e-daf7-46a8-b132-5dfc5e4286a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-081a046e-daf7-46a8-b132-5dfc5e4286a3
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-081a046e-daf7-46a8-b132-5dfc5e4286a3
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_76b06579-33bf-4a74-b588-2ba9cc6c2ac3/messages","correlationId":"qa-081a046e-daf7-46a8-b132-5dfc5e4286a3","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b34212a3-14f9-4cac-a28e-96fb74bae3d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b34212a3-14f9-4cac-a28e-96fb74bae3d7
Content-Type: application/json

--- request body ---
{"handle":"qa-090d64f49079","password":"****"}

--- response: 200 in 30 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b34212a3-14f9-4cac-a28e-96fb74bae3d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b63601d7-24fd-4d6d-a5d9-bd6c7864587a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-36dbe967-1cd2-47f5-846a-2cda12980f8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36dbe967-1cd2-47f5-846a-2cda12980f8f
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-36dbe967-1cd2-47f5-846a-2cda12980f8f
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
correlation: qa-80a91d41-8cdc-4234-bc15-59b7a269f095

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80a91d41-8cdc-4234-bc15-59b7a269f095
Content-Type: application/json

--- request body ---
{"handle":"qa-090d64f49079","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80a91d41-8cdc-4234-bc15-59b7a269f095
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-80a91d41-8cdc-4234-bc15-59b7a269f095"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f0b78cb9-ab2b-4183-ba8e-dd04f6218eea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0b78cb9-ab2b-4183-ba8e-dd04f6218eea
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f0b78cb9-ab2b-4183-ba8e-dd04f6218eea
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
correlation: qa-36fefa23-cc8a-4be8-a037-aabaa519bf1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36fefa23-cc8a-4be8-a037-aabaa519bf1f
Content-Type: application/json

--- request body ---
{"handle":"qa-9ef3bf3aadae","password":"****"}

--- response: 401 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-36fefa23-cc8a-4be8-a037-aabaa519bf1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-36fefa23-cc8a-4be8-a037-aabaa519bf1f"}
```
