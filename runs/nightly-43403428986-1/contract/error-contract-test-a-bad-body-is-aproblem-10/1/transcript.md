# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-39cbf95c-9cbf-4ec2-9825-e1cda045f200` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-e14c3c9c-fa1e-4879-b2a1-1a564333c986` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-7358aa58-5b3f-41f0-a61d-db1748665d75` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-c4957d42-f657-43c0-a8f4-08f6a81f7edd` |
| 5 | `POST /v1/conversations` | 415 | 12 | `qa-a7031794-8240-4042-9b9e-0ae743aa2cfe` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-b8a60303-2f24-4fdb-b742-e0f70b743ea7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-0cab9356-3d20-443d-977d-2d8678cb70fe` |
| 8 | `POST /v1/auth/token` | 401 | 29 | `qa-81f3b919-547f-4df7-9e83-8b16c83883da` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-14400fba-3553-413e-b9fa-15df4c2c308b` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-2e7e3257-36a8-4988-af24-07dc6f08c337` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-39cbf95c-9cbf-4ec2-9825-e1cda045f200

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39cbf95c-9cbf-4ec2-9825-e1cda045f200
Content-Type: application/json

--- request body ---
{"handle":"qa-fe0cfbc77954","displayName":"QA fe0cfbc77954","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-39cbf95c-9cbf-4ec2-9825-e1cda045f200
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
Location: /v1/accounts/qa-fe0cfbc77954
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6e5cff7-fa4b-4ec5-bb12-55f49164c924","handle":"qa-fe0cfbc77954","displayName":"QA fe0cfbc77954","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.623951437Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e14c3c9c-fa1e-4879-b2a1-1a564333c986

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e14c3c9c-fa1e-4879-b2a1-1a564333c986
Content-Type: application/json

--- request body ---
{"handle":"qa-b0f62fe475be","displayName":"QA b0f62fe475be","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e14c3c9c-fa1e-4879-b2a1-1a564333c986
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
Location: /v1/accounts/qa-b0f62fe475be
X-Served-Region: eu
Content-Length: 181

{"id":"acc_47b69e66-aaa0-4417-a193-aace8b56ff7b","handle":"qa-b0f62fe475be","displayName":"QA b0f62fe475be","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.655250932Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7358aa58-5b3f-41f0-a61d-db1748665d75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7358aa58-5b3f-41f0-a61d-db1748665d75
Content-Type: application/json

--- request body ---
{"handle":"qa-fe0cfbc77954","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-7358aa58-5b3f-41f0-a61d-db1748665d75
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c6e5cff7-fa4b-4ec5-bb12-55f49164c924"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c4957d42-f657-43c0-a8f4-08f6a81f7edd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4957d42-f657-43c0-a8f4-08f6a81f7edd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b0f62fe475be","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4957d42-f657-43c0-a8f4-08f6a81f7edd
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
Location: /v1/conversations/cnv_88d83d81-5140-49d3-961c-ec0f8887ff67
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_88d83d81-5140-49d3-961c-ec0f8887ff67","subject":"Error contract","status":"open","region":"eu","participants":["qa-fe0cfbc77954","qa-b0f62fe475be"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.725276961Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a7031794-8240-4042-9b9e-0ae743aa2cfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7031794-8240-4042-9b9e-0ae743aa2cfe
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7031794-8240-4042-9b9e-0ae743aa2cfe
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-a7031794-8240-4042-9b9e-0ae743aa2cfe"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b8a60303-2f24-4fdb-b742-e0f70b743ea7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8a60303-2f24-4fdb-b742-e0f70b743ea7
Content-Type: application/json

--- request body ---
{"handle":"qa-b0f62fe475be","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8a60303-2f24-4fdb-b742-e0f70b743ea7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_47b69e66-aaa0-4417-a193-aace8b56ff7b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0cab9356-3d20-443d-977d-2d8678cb70fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cab9356-3d20-443d-977d-2d8678cb70fe
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0cab9356-3d20-443d-977d-2d8678cb70fe
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
correlation: qa-81f3b919-547f-4df7-9e83-8b16c83883da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81f3b919-547f-4df7-9e83-8b16c83883da
Content-Type: application/json

--- request body ---
{"handle":"qa-b0f62fe475be","password":"****"}

--- response: 401 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81f3b919-547f-4df7-9e83-8b16c83883da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-81f3b919-547f-4df7-9e83-8b16c83883da"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-14400fba-3553-413e-b9fa-15df4c2c308b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14400fba-3553-413e-b9fa-15df4c2c308b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-14400fba-3553-413e-b9fa-15df4c2c308b
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
correlation: qa-2e7e3257-36a8-4988-af24-07dc6f08c337

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e7e3257-36a8-4988-af24-07dc6f08c337
Content-Type: application/json

--- request body ---
{"handle":"qa-fe0cfbc77954","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e7e3257-36a8-4988-af24-07dc6f08c337
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2e7e3257-36a8-4988-af24-07dc6f08c337"}
```
