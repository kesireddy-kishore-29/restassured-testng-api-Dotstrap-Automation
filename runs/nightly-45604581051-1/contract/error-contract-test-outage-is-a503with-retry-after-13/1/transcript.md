# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-77ca36e9-bb12-4d31-b827-3611b7f38c50` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-39d0a986-055f-49c6-9aa3-24101ae4af85` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-a6d38d31-7a88-42a6-8f19-69ab2729909b` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-dee4ba7a-3d39-4540-9f59-58eb6f01a34f` |
| 5 | `GET /v1/credits/balance` | 503 | 13 | `qa-bac980ee-c43c-46a5-bb1c-86ea85adf685` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-91235f22-ee33-435b-9c70-a94157166864` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-de5c1896-c9ef-4f35-9bc6-4732b0761ae7` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-a48904e7-204d-4837-bde7-4769a54ee600` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-e700e340-f55f-4d78-95db-3643142f68a2` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-e982d6cc-65af-45b5-8238-c88108bd5409` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-77ca36e9-bb12-4d31-b827-3611b7f38c50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77ca36e9-bb12-4d31-b827-3611b7f38c50
Content-Type: application/json

--- request body ---
{"handle":"qa-966d94dd69ca","displayName":"QA 966d94dd69ca","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-77ca36e9-bb12-4d31-b827-3611b7f38c50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 8
Location: /v1/accounts/qa-966d94dd69ca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_912d4211-43ee-4fef-82ee-bb6a3f32cb46","handle":"qa-966d94dd69ca","displayName":"QA 966d94dd69ca","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.249526863Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-39d0a986-055f-49c6-9aa3-24101ae4af85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39d0a986-055f-49c6-9aa3-24101ae4af85
Content-Type: application/json

--- request body ---
{"handle":"qa-d9820f3d33c2","displayName":"QA d9820f3d33c2","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-39d0a986-055f-49c6-9aa3-24101ae4af85
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 8
Location: /v1/accounts/qa-d9820f3d33c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_24eb1a76-3504-4432-ba0c-3200bd57d78c","handle":"qa-d9820f3d33c2","displayName":"QA d9820f3d33c2","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.304604702Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a6d38d31-7a88-42a6-8f19-69ab2729909b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6d38d31-7a88-42a6-8f19-69ab2729909b
Content-Type: application/json

--- request body ---
{"handle":"qa-966d94dd69ca","password":"****"}

--- response: 200 in 38 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6d38d31-7a88-42a6-8f19-69ab2729909b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_912d4211-43ee-4fef-82ee-bb6a3f32cb46"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-dee4ba7a-3d39-4540-9f59-58eb6f01a34f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dee4ba7a-3d39-4540-9f59-58eb6f01a34f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d9820f3d33c2","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-dee4ba7a-3d39-4540-9f59-58eb6f01a34f
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
Location: /v1/conversations/cnv_0760125c-9dce-411a-aa36-5712010aa4c3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0760125c-9dce-411a-aa36-5712010aa4c3","subject":"Error contract","status":"open","region":"eu","participants":["qa-966d94dd69ca","qa-d9820f3d33c2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.375826950Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-bac980ee-c43c-46a5-bb1c-86ea85adf685

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c38c0597-ab5d-4f6b-9bb8-44756ba3750a
X-Correlation-Id: qa-bac980ee-c43c-46a5-bb1c-86ea85adf685
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bac980ee-c43c-46a5-bb1c-86ea85adf685
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-bac980ee-c43c-46a5-bb1c-86ea85adf685"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-91235f22-ee33-435b-9c70-a94157166864

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91235f22-ee33-435b-9c70-a94157166864
Content-Type: application/json

--- request body ---
{"handle":"qa-d9820f3d33c2","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-91235f22-ee33-435b-9c70-a94157166864
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24eb1a76-3504-4432-ba0c-3200bd57d78c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-de5c1896-c9ef-4f35-9bc6-4732b0761ae7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de5c1896-c9ef-4f35-9bc6-4732b0761ae7
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-de5c1896-c9ef-4f35-9bc6-4732b0761ae7
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
correlation: qa-a48904e7-204d-4837-bde7-4769a54ee600

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a48904e7-204d-4837-bde7-4769a54ee600
Content-Type: application/json

--- request body ---
{"handle":"qa-d9820f3d33c2","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a48904e7-204d-4837-bde7-4769a54ee600
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a48904e7-204d-4837-bde7-4769a54ee600"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e700e340-f55f-4d78-95db-3643142f68a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e700e340-f55f-4d78-95db-3643142f68a2
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e700e340-f55f-4d78-95db-3643142f68a2
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
correlation: qa-e982d6cc-65af-45b5-8238-c88108bd5409

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e982d6cc-65af-45b5-8238-c88108bd5409
Content-Type: application/json

--- request body ---
{"handle":"qa-966d94dd69ca","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e982d6cc-65af-45b5-8238-c88108bd5409
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e982d6cc-65af-45b5-8238-c88108bd5409"}
```
