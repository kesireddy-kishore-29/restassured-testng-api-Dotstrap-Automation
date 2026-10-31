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
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-f88ede3d-8093-4877-bf9d-423a8cff3858` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-9667f243-80d9-452c-b923-07fdedf6bfa5` |
| 3 | `POST /v1/auth/token` | 200 | 57 | `qa-4eaf0708-b88a-484f-937f-a0bc331bddab` |
| 4 | `POST /v1/conversations` | 201 | 5 | `qa-6557e822-1bb9-42c9-84ac-7a7c8a9fd371` |
| 5 | `POST /v1/conversations` | 415 | 16 | `qa-42062ba6-b0a6-4564-9c1e-1a0fd3df4a12` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-10943115-ce37-4565-ab36-d9e6fffb705e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-385c4078-7379-499c-84fe-78ce9ad1a858` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-6b7f558b-b2a0-44e5-98c7-60630e3a2a5f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-44c21ead-da9c-41c7-85e3-55fc03d9f6e4` |
| 10 | `POST /v1/auth/token` | 401 | 38 | `qa-e5c579a6-cfb7-48ca-91bf-46245e42eb2e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f88ede3d-8093-4877-bf9d-423a8cff3858

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f88ede3d-8093-4877-bf9d-423a8cff3858
Content-Type: application/json

--- request body ---
{"handle":"qa-68d2635a0409","displayName":"QA 68d2635a0409","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f88ede3d-8093-4877-bf9d-423a8cff3858
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
Location: /v1/accounts/qa-68d2635a0409
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4383c1a3-eff5-4d1a-bd21-d273d03853ba","handle":"qa-68d2635a0409","displayName":"QA 68d2635a0409","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.134875511Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9667f243-80d9-452c-b923-07fdedf6bfa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9667f243-80d9-452c-b923-07fdedf6bfa5
Content-Type: application/json

--- request body ---
{"handle":"qa-9b7f1b0e5ba7","displayName":"QA 9b7f1b0e5ba7","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-9667f243-80d9-452c-b923-07fdedf6bfa5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 7
Location: /v1/accounts/qa-9b7f1b0e5ba7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_01691172-fdd5-4edc-a6c7-e2afae46dfd6","handle":"qa-9b7f1b0e5ba7","displayName":"QA 9b7f1b0e5ba7","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.207614608Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4eaf0708-b88a-484f-937f-a0bc331bddab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4eaf0708-b88a-484f-937f-a0bc331bddab
Content-Type: application/json

--- request body ---
{"handle":"qa-68d2635a0409","password":"****"}

--- response: 200 in 57 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-4eaf0708-b88a-484f-937f-a0bc331bddab
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4383c1a3-eff5-4d1a-bd21-d273d03853ba"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6557e822-1bb9-42c9-84ac-7a7c8a9fd371

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6557e822-1bb9-42c9-84ac-7a7c8a9fd371
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9b7f1b0e5ba7","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-6557e822-1bb9-42c9-84ac-7a7c8a9fd371
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
Location: /v1/conversations/cnv_d9ed2f1b-dda2-4754-bed2-607f655b6c55
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d9ed2f1b-dda2-4754-bed2-607f655b6c55","subject":"Error contract","status":"open","region":"eu","participants":["qa-68d2635a0409","qa-9b7f1b0e5ba7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.331576994Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-42062ba6-b0a6-4564-9c1e-1a0fd3df4a12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42062ba6-b0a6-4564-9c1e-1a0fd3df4a12
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42062ba6-b0a6-4564-9c1e-1a0fd3df4a12
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-42062ba6-b0a6-4564-9c1e-1a0fd3df4a12"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-10943115-ce37-4565-ab36-d9e6fffb705e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10943115-ce37-4565-ab36-d9e6fffb705e
Content-Type: application/json

--- request body ---
{"handle":"qa-9b7f1b0e5ba7","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-10943115-ce37-4565-ab36-d9e6fffb705e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_01691172-fdd5-4edc-a6c7-e2afae46dfd6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-385c4078-7379-499c-84fe-78ce9ad1a858

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-385c4078-7379-499c-84fe-78ce9ad1a858
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-385c4078-7379-499c-84fe-78ce9ad1a858
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
correlation: qa-6b7f558b-b2a0-44e5-98c7-60630e3a2a5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b7f558b-b2a0-44e5-98c7-60630e3a2a5f
Content-Type: application/json

--- request body ---
{"handle":"qa-9b7f1b0e5ba7","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b7f558b-b2a0-44e5-98c7-60630e3a2a5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b7f558b-b2a0-44e5-98c7-60630e3a2a5f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-44c21ead-da9c-41c7-85e3-55fc03d9f6e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44c21ead-da9c-41c7-85e3-55fc03d9f6e4
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-44c21ead-da9c-41c7-85e3-55fc03d9f6e4
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
correlation: qa-e5c579a6-cfb7-48ca-91bf-46245e42eb2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5c579a6-cfb7-48ca-91bf-46245e42eb2e
Content-Type: application/json

--- request body ---
{"handle":"qa-68d2635a0409","password":"****"}

--- response: 401 in 38 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5c579a6-cfb7-48ca-91bf-46245e42eb2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e5c579a6-cfb7-48ca-91bf-46245e42eb2e"}
```
