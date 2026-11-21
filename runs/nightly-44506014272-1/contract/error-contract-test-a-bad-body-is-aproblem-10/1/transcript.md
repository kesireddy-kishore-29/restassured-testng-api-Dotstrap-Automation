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
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-6b44385d-8ce1-4ea4-943a-0d83454fc6d0` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-21a93c61-121b-4fed-837a-46c5c5d37b7c` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-04f54518-87ca-479b-9235-d7cc6fcd36ad` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-0a30f54f-4c5b-4911-ae3a-1c73eafb3de5` |
| 5 | `POST /v1/conversations` | 415 | 12 | `qa-159ab5b5-43d6-4dd1-a624-aace7a6812e3` |
| 6 | `POST /v1/auth/token` | 200 | 68 | `qa-4f0a4a2c-05ee-4b75-994f-4802a3062158` |
| 7 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-e8796a10-52ff-44fa-984c-af7db632f356` |
| 8 | `POST /v1/auth/token` | 401 | 41 | `qa-9b0e61c9-71b1-4a61-952d-54bd44650c4e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-684213c2-16a3-4937-bde2-b092eeaaaafa` |
| 10 | `POST /v1/auth/token` | 401 | 76 | `qa-eedc228a-6c6a-40bb-ba2b-5955eabec3f0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6b44385d-8ce1-4ea4-943a-0d83454fc6d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b44385d-8ce1-4ea4-943a-0d83454fc6d0
Content-Type: application/json

--- request body ---
{"handle":"qa-42f64a1fe8d9","displayName":"QA 42f64a1fe8d9","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b44385d-8ce1-4ea4-943a-0d83454fc6d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 7
Location: /v1/accounts/qa-42f64a1fe8d9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_10156ac7-d43d-459c-8d31-f782403dd4d0","handle":"qa-42f64a1fe8d9","displayName":"QA 42f64a1fe8d9","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.094873762Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-21a93c61-121b-4fed-837a-46c5c5d37b7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21a93c61-121b-4fed-837a-46c5c5d37b7c
Content-Type: application/json

--- request body ---
{"handle":"qa-e4901d8c9d96","displayName":"QA e4901d8c9d96","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-21a93c61-121b-4fed-837a-46c5c5d37b7c
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
Location: /v1/accounts/qa-e4901d8c9d96
X-Served-Region: eu
Content-Length: 181

{"id":"acc_80d8b898-c4b3-4aa7-8d5e-2152158c52a2","handle":"qa-e4901d8c9d96","displayName":"QA e4901d8c9d96","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.145491752Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-04f54518-87ca-479b-9235-d7cc6fcd36ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04f54518-87ca-479b-9235-d7cc6fcd36ad
Content-Type: application/json

--- request body ---
{"handle":"qa-42f64a1fe8d9","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-04f54518-87ca-479b-9235-d7cc6fcd36ad
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_10156ac7-d43d-459c-8d31-f782403dd4d0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0a30f54f-4c5b-4911-ae3a-1c73eafb3de5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a30f54f-4c5b-4911-ae3a-1c73eafb3de5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e4901d8c9d96","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a30f54f-4c5b-4911-ae3a-1c73eafb3de5
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
Location: /v1/conversations/cnv_bf0f9531-691d-4134-a6e6-524788a1cad0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bf0f9531-691d-4134-a6e6-524788a1cad0","subject":"Error contract","status":"open","region":"eu","participants":["qa-42f64a1fe8d9","qa-e4901d8c9d96"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:26.236242326Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-159ab5b5-43d6-4dd1-a624-aace7a6812e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-159ab5b5-43d6-4dd1-a624-aace7a6812e3
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-159ab5b5-43d6-4dd1-a624-aace7a6812e3
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-159ab5b5-43d6-4dd1-a624-aace7a6812e3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4f0a4a2c-05ee-4b75-994f-4802a3062158

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f0a4a2c-05ee-4b75-994f-4802a3062158
Content-Type: application/json

--- request body ---
{"handle":"qa-e4901d8c9d96","password":"****"}

--- response: 200 in 68 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f0a4a2c-05ee-4b75-994f-4802a3062158
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_80d8b898-c4b3-4aa7-8d5e-2152158c52a2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e8796a10-52ff-44fa-984c-af7db632f356

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8796a10-52ff-44fa-984c-af7db632f356
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e8796a10-52ff-44fa-984c-af7db632f356
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
correlation: qa-9b0e61c9-71b1-4a61-952d-54bd44650c4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b0e61c9-71b1-4a61-952d-54bd44650c4e
Content-Type: application/json

--- request body ---
{"handle":"qa-e4901d8c9d96","password":"****"}

--- response: 401 in 41 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b0e61c9-71b1-4a61-952d-54bd44650c4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9b0e61c9-71b1-4a61-952d-54bd44650c4e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-684213c2-16a3-4937-bde2-b092eeaaaafa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-684213c2-16a3-4937-bde2-b092eeaaaafa
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-684213c2-16a3-4937-bde2-b092eeaaaafa
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
correlation: qa-eedc228a-6c6a-40bb-ba2b-5955eabec3f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eedc228a-6c6a-40bb-ba2b-5955eabec3f0
Content-Type: application/json

--- request body ---
{"handle":"qa-42f64a1fe8d9","password":"****"}

--- response: 401 in 76 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eedc228a-6c6a-40bb-ba2b-5955eabec3f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eedc228a-6c6a-40bb-ba2b-5955eabec3f0"}
```
