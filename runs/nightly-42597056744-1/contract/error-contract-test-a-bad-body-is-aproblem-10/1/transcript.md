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
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-ab893a33-be2b-4227-a0e4-014ca3a76ae8` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-97a572c9-8e8b-45e4-8880-5e41d77d840e` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-93f4df7e-99ba-442c-8863-82c32f650c51` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-7c2ec614-cd6c-4904-9083-9a6fa8a15feb` |
| 5 | `POST /v1/conversations` | 415 | 12 | `qa-20b4f68b-54f9-4ab8-a093-2b5cd9a4b6b1` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-3b378159-13a8-4c51-9ad4-10e4cb77ef61` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-7a667abf-7d30-4036-a029-b9fda4deafef` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-033a6bcb-ef34-4571-b09a-a16046450472` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-304620d7-e9f5-486b-9f39-423545e96813` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-ae8b04e3-9029-4326-bd21-55ea77efbcab` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ab893a33-be2b-4227-a0e4-014ca3a76ae8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab893a33-be2b-4227-a0e4-014ca3a76ae8
Content-Type: application/json

--- request body ---
{"handle":"qa-a398b6b10200","displayName":"QA a398b6b10200","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab893a33-be2b-4227-a0e4-014ca3a76ae8
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
Location: /v1/accounts/qa-a398b6b10200
X-Served-Region: eu
Content-Length: 181

{"id":"acc_22373e8a-8256-4c5e-82d1-855fa4ac8ab0","handle":"qa-a398b6b10200","displayName":"QA a398b6b10200","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.312831140Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-97a572c9-8e8b-45e4-8880-5e41d77d840e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97a572c9-8e8b-45e4-8880-5e41d77d840e
Content-Type: application/json

--- request body ---
{"handle":"qa-35cf4dce13c5","displayName":"QA 35cf4dce13c5","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-97a572c9-8e8b-45e4-8880-5e41d77d840e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Location: /v1/accounts/qa-35cf4dce13c5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8ed524b9-c3b8-425f-bf0e-5546f81ce8d1","handle":"qa-35cf4dce13c5","displayName":"QA 35cf4dce13c5","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.337259995Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-93f4df7e-99ba-442c-8863-82c32f650c51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93f4df7e-99ba-442c-8863-82c32f650c51
Content-Type: application/json

--- request body ---
{"handle":"qa-a398b6b10200","password":"****"}

--- response: 200 in 41 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-93f4df7e-99ba-442c-8863-82c32f650c51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22373e8a-8256-4c5e-82d1-855fa4ac8ab0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7c2ec614-cd6c-4904-9083-9a6fa8a15feb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c2ec614-cd6c-4904-9083-9a6fa8a15feb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-35cf4dce13c5","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c2ec614-cd6c-4904-9083-9a6fa8a15feb
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
Location: /v1/conversations/cnv_2ae2ac41-e069-4292-b90a-288d1e015ec2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2ae2ac41-e069-4292-b90a-288d1e015ec2","subject":"Error contract","status":"open","region":"eu","participants":["qa-a398b6b10200","qa-35cf4dce13c5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.394964615Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-20b4f68b-54f9-4ab8-a093-2b5cd9a4b6b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20b4f68b-54f9-4ab8-a093-2b5cd9a4b6b1
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20b4f68b-54f9-4ab8-a093-2b5cd9a4b6b1
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-20b4f68b-54f9-4ab8-a093-2b5cd9a4b6b1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3b378159-13a8-4c51-9ad4-10e4cb77ef61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b378159-13a8-4c51-9ad4-10e4cb77ef61
Content-Type: application/json

--- request body ---
{"handle":"qa-35cf4dce13c5","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b378159-13a8-4c51-9ad4-10e4cb77ef61
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8ed524b9-c3b8-425f-bf0e-5546f81ce8d1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a667abf-7d30-4036-a029-b9fda4deafef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a667abf-7d30-4036-a029-b9fda4deafef
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a667abf-7d30-4036-a029-b9fda4deafef
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
correlation: qa-033a6bcb-ef34-4571-b09a-a16046450472

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-033a6bcb-ef34-4571-b09a-a16046450472
Content-Type: application/json

--- request body ---
{"handle":"qa-35cf4dce13c5","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-033a6bcb-ef34-4571-b09a-a16046450472
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-033a6bcb-ef34-4571-b09a-a16046450472"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-304620d7-e9f5-486b-9f39-423545e96813

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-304620d7-e9f5-486b-9f39-423545e96813
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-304620d7-e9f5-486b-9f39-423545e96813
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
correlation: qa-ae8b04e3-9029-4326-bd21-55ea77efbcab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae8b04e3-9029-4326-bd21-55ea77efbcab
Content-Type: application/json

--- request body ---
{"handle":"qa-a398b6b10200","password":"****"}

--- response: 401 in 30 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae8b04e3-9029-4326-bd21-55ea77efbcab
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ae8b04e3-9029-4326-bd21-55ea77efbcab"}
```
