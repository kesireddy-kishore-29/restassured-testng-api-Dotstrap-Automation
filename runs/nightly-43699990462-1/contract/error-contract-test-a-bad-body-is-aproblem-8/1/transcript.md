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
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-6d7740ac-f365-4eea-9ff8-cbc09c1ccb7f` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-c08f9d5d-c2ad-4938-9b07-959d9cab5808` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-d30afbca-5029-4923-af1b-43844951b1b1` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-3de3e56f-5451-4ce3-9eb5-e74a99064765` |
| 5 | `PATCH /v1/accounts/me` | 422 | 16 | `qa-8af544fc-35ff-4b98-abe6-3b6047d6d2fd` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-cdaed7cf-7d90-4fb7-86e7-a53aee87128e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 82 | `qa-2e95723d-a337-4f31-a5a0-d25298fcc99a` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-c68af0a9-e29e-44f7-9d8b-1080f3741dd8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-f99cd77f-f70d-401f-9584-6938789c1405` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-7da4bcf1-af99-4434-8f23-96a53ff7b3f1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6d7740ac-f365-4eea-9ff8-cbc09c1ccb7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d7740ac-f365-4eea-9ff8-cbc09c1ccb7f
Content-Type: application/json

--- request body ---
{"handle":"qa-7529bdd32512","displayName":"QA 7529bdd32512","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d7740ac-f365-4eea-9ff8-cbc09c1ccb7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Location: /v1/accounts/qa-7529bdd32512
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b79f8c2b-ce48-4f97-9a7e-fcd7fc9f8792","handle":"qa-7529bdd32512","displayName":"QA 7529bdd32512","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.759667060Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c08f9d5d-c2ad-4938-9b07-959d9cab5808

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c08f9d5d-c2ad-4938-9b07-959d9cab5808
Content-Type: application/json

--- request body ---
{"handle":"qa-42a96640957b","displayName":"QA 42a96640957b","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-c08f9d5d-c2ad-4938-9b07-959d9cab5808
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Location: /v1/accounts/qa-42a96640957b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ccead2a-3c37-4c0f-aa84-61d296b3093c","handle":"qa-42a96640957b","displayName":"QA 42a96640957b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.787741095Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d30afbca-5029-4923-af1b-43844951b1b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d30afbca-5029-4923-af1b-43844951b1b1
Content-Type: application/json

--- request body ---
{"handle":"qa-7529bdd32512","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-d30afbca-5029-4923-af1b-43844951b1b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b79f8c2b-ce48-4f97-9a7e-fcd7fc9f8792"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3de3e56f-5451-4ce3-9eb5-e74a99064765

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3de3e56f-5451-4ce3-9eb5-e74a99064765
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-42a96640957b","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-3de3e56f-5451-4ce3-9eb5-e74a99064765
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
Location: /v1/conversations/cnv_b7b0a8bb-c41b-4eb7-9f56-c3ef9c65833d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b7b0a8bb-c41b-4eb7-9f56-c3ef9c65833d","subject":"Error contract","status":"open","region":"eu","participants":["qa-7529bdd32512","qa-42a96640957b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.855628328Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-8af544fc-35ff-4b98-abe6-3b6047d6d2fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8af544fc-35ff-4b98-abe6-3b6047d6d2fd
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8af544fc-35ff-4b98-abe6-3b6047d6d2fd
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-8af544fc-35ff-4b98-abe6-3b6047d6d2fd","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cdaed7cf-7d90-4fb7-86e7-a53aee87128e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdaed7cf-7d90-4fb7-86e7-a53aee87128e
Content-Type: application/json

--- request body ---
{"handle":"qa-42a96640957b","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdaed7cf-7d90-4fb7-86e7-a53aee87128e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ccead2a-3c37-4c0f-aa84-61d296b3093c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e95723d-a337-4f31-a5a0-d25298fcc99a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e95723d-a337-4f31-a5a0-d25298fcc99a
Content-Type: application/json

--- response: 204 in 82 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e95723d-a337-4f31-a5a0-d25298fcc99a
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
correlation: qa-c68af0a9-e29e-44f7-9d8b-1080f3741dd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c68af0a9-e29e-44f7-9d8b-1080f3741dd8
Content-Type: application/json

--- request body ---
{"handle":"qa-42a96640957b","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c68af0a9-e29e-44f7-9d8b-1080f3741dd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c68af0a9-e29e-44f7-9d8b-1080f3741dd8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f99cd77f-f70d-401f-9584-6938789c1405

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f99cd77f-f70d-401f-9584-6938789c1405
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f99cd77f-f70d-401f-9584-6938789c1405
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
correlation: qa-7da4bcf1-af99-4434-8f23-96a53ff7b3f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7da4bcf1-af99-4434-8f23-96a53ff7b3f1
Content-Type: application/json

--- request body ---
{"handle":"qa-7529bdd32512","password":"****"}

--- response: 401 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7da4bcf1-af99-4434-8f23-96a53ff7b3f1
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7da4bcf1-af99-4434-8f23-96a53ff7b3f1"}
```
