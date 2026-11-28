# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-4bcc442f-01e7-42d9-89a3-412e3ba00e7a` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-f7a0420d-debd-4f1c-b4fa-63c0f5c65d43` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-662f0c6e-9757-483d-a5a5-4eae1e32384e` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-abcad996-0a72-4986-9cfd-1f232eb5c520` |
| 5 | `POST /v1/credits/purchases` | 415 | 6 | `qa-5e7f8f2f-1a90-447d-a4e1-233be15d0684` |
| 6 | `POST /v1/auth/token` | 200 | 5 | `qa-2077ad3b-e68b-4b11-87b8-b3e310b67e27` |
| 7 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-01731d33-90ec-4056-9e3e-920212ac06a8` |
| 8 | `POST /v1/auth/token` | 401 | 2 | `qa-acd92e71-000b-4de2-b63d-c56b368bf80a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-2d27b82d-efce-4d32-83ac-2ed2f5cd7749` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-ebbfdd82-35a1-4df1-a78c-30efc9b028e1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4bcc442f-01e7-42d9-89a3-412e3ba00e7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bcc442f-01e7-42d9-89a3-412e3ba00e7a
Content-Type: application/json

--- request body ---
{"handle":"qa-dccca0e229f6","displayName":"QA dccca0e229f6","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bcc442f-01e7-42d9-89a3-412e3ba00e7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 7
Location: /v1/accounts/qa-dccca0e229f6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2fc5b7a4-aac6-4006-9049-5899a870ecd3","handle":"qa-dccca0e229f6","displayName":"QA dccca0e229f6","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.519407043Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f7a0420d-debd-4f1c-b4fa-63c0f5c65d43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7a0420d-debd-4f1c-b4fa-63c0f5c65d43
Content-Type: application/json

--- request body ---
{"handle":"qa-82db8c9d3998","displayName":"QA 82db8c9d3998","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7a0420d-debd-4f1c-b4fa-63c0f5c65d43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 7
Location: /v1/accounts/qa-82db8c9d3998
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5f6dad6b-bf06-4055-abcc-1098c1f65172","handle":"qa-82db8c9d3998","displayName":"QA 82db8c9d3998","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.555073497Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-662f0c6e-9757-483d-a5a5-4eae1e32384e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-662f0c6e-9757-483d-a5a5-4eae1e32384e
Content-Type: application/json

--- request body ---
{"handle":"qa-dccca0e229f6","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-662f0c6e-9757-483d-a5a5-4eae1e32384e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fc5b7a4-aac6-4006-9049-5899a870ecd3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-abcad996-0a72-4986-9cfd-1f232eb5c520

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abcad996-0a72-4986-9cfd-1f232eb5c520
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-82db8c9d3998","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-abcad996-0a72-4986-9cfd-1f232eb5c520
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
Location: /v1/conversations/cnv_9b279540-eaa1-40f2-9f4a-e8c1208d9232
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9b279540-eaa1-40f2-9f4a-e8c1208d9232","subject":"Error contract","status":"open","region":"eu","participants":["qa-dccca0e229f6","qa-82db8c9d3998"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.606101533Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5e7f8f2f-1a90-447d-a4e1-233be15d0684

--- request headers ---
Accept: application/json
Idempotency-Key: qa-112d61bca69749899dff5d3890289d3e
X-Correlation-Id: qa-5e7f8f2f-1a90-447d-a4e1-233be15d0684
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e7f8f2f-1a90-447d-a4e1-233be15d0684
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-5e7f8f2f-1a90-447d-a4e1-233be15d0684"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2077ad3b-e68b-4b11-87b8-b3e310b67e27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2077ad3b-e68b-4b11-87b8-b3e310b67e27
Content-Type: application/json

--- request body ---
{"handle":"qa-82db8c9d3998","password":"****"}

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2077ad3b-e68b-4b11-87b8-b3e310b67e27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5f6dad6b-bf06-4055-abcc-1098c1f65172"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-01731d33-90ec-4056-9e3e-920212ac06a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01731d33-90ec-4056-9e3e-920212ac06a8
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-01731d33-90ec-4056-9e3e-920212ac06a8
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
correlation: qa-acd92e71-000b-4de2-b63d-c56b368bf80a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acd92e71-000b-4de2-b63d-c56b368bf80a
Content-Type: application/json

--- request body ---
{"handle":"qa-82db8c9d3998","password":"****"}

--- response: 401 in 2 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-acd92e71-000b-4de2-b63d-c56b368bf80a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-acd92e71-000b-4de2-b63d-c56b368bf80a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d27b82d-efce-4d32-83ac-2ed2f5cd7749

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d27b82d-efce-4d32-83ac-2ed2f5cd7749
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d27b82d-efce-4d32-83ac-2ed2f5cd7749
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
correlation: qa-ebbfdd82-35a1-4df1-a78c-30efc9b028e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebbfdd82-35a1-4df1-a78c-30efc9b028e1
Content-Type: application/json

--- request body ---
{"handle":"qa-dccca0e229f6","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ebbfdd82-35a1-4df1-a78c-30efc9b028e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ebbfdd82-35a1-4df1-a78c-30efc9b028e1"}
```
