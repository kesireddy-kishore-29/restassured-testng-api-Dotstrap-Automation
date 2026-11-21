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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-0bab1db8-96d6-4500-8627-b4d10a66e11d` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-ec19a939-617d-49d4-a6db-65b1661ce4a4` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-cd36de88-19e1-4ea6-a489-09bea38b3098` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-0e8f48cc-1499-4520-b8e8-ab6e2582494d` |
| 5 | `POST /v1/credits/purchases` | 415 | 13 | `qa-2fc40a41-0344-406f-9888-d17e7471408c` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-5079914f-d4e2-42bd-a75d-7f1e3ac75875` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-b788d9dd-f2bd-4dcc-9b1c-cf88d91af7a5` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-48d6d836-7a27-4fca-b824-befac5fa5849` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-df3d72b5-e446-461a-916d-5ffac26f9f8d` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-917d8128-d96d-4930-8f5d-ae3d7169f5d8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0bab1db8-96d6-4500-8627-b4d10a66e11d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bab1db8-96d6-4500-8627-b4d10a66e11d
Content-Type: application/json

--- request body ---
{"handle":"qa-6fd6de0f9e39","displayName":"QA 6fd6de0f9e39","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bab1db8-96d6-4500-8627-b4d10a66e11d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 6
Location: /v1/accounts/qa-6fd6de0f9e39
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8e33d09-4f9f-42de-8d41-75994bf6bc5d","handle":"qa-6fd6de0f9e39","displayName":"QA 6fd6de0f9e39","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.740596871Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ec19a939-617d-49d4-a6db-65b1661ce4a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec19a939-617d-49d4-a6db-65b1661ce4a4
Content-Type: application/json

--- request body ---
{"handle":"qa-461321fadf24","displayName":"QA 461321fadf24","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec19a939-617d-49d4-a6db-65b1661ce4a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 6
Location: /v1/accounts/qa-461321fadf24
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5ee2d5bf-91a3-41dd-86ac-5f18f7e9481d","handle":"qa-461321fadf24","displayName":"QA 461321fadf24","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.772135375Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cd36de88-19e1-4ea6-a489-09bea38b3098

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd36de88-19e1-4ea6-a489-09bea38b3098
Content-Type: application/json

--- request body ---
{"handle":"qa-6fd6de0f9e39","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd36de88-19e1-4ea6-a489-09bea38b3098
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a8e33d09-4f9f-42de-8d41-75994bf6bc5d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0e8f48cc-1499-4520-b8e8-ab6e2582494d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e8f48cc-1499-4520-b8e8-ab6e2582494d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-461321fadf24","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e8f48cc-1499-4520-b8e8-ab6e2582494d
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
Location: /v1/conversations/cnv_ae53d049-bd2e-4f14-b019-38327ab201bf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ae53d049-bd2e-4f14-b019-38327ab201bf","subject":"Error contract","status":"open","region":"eu","participants":["qa-6fd6de0f9e39","qa-461321fadf24"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:12.826149764Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2fc40a41-0344-406f-9888-d17e7471408c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ae4cb491caa840a2a965d99db11815e8
X-Correlation-Id: qa-2fc40a41-0344-406f-9888-d17e7471408c
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fc40a41-0344-406f-9888-d17e7471408c
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-2fc40a41-0344-406f-9888-d17e7471408c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5079914f-d4e2-42bd-a75d-7f1e3ac75875

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5079914f-d4e2-42bd-a75d-7f1e3ac75875
Content-Type: application/json

--- request body ---
{"handle":"qa-461321fadf24","password":"****"}

--- response: 200 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5079914f-d4e2-42bd-a75d-7f1e3ac75875
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ee2d5bf-91a3-41dd-86ac-5f18f7e9481d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b788d9dd-f2bd-4dcc-9b1c-cf88d91af7a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b788d9dd-f2bd-4dcc-9b1c-cf88d91af7a5
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b788d9dd-f2bd-4dcc-9b1c-cf88d91af7a5
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
correlation: qa-48d6d836-7a27-4fca-b824-befac5fa5849

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48d6d836-7a27-4fca-b824-befac5fa5849
Content-Type: application/json

--- request body ---
{"handle":"qa-461321fadf24","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48d6d836-7a27-4fca-b824-befac5fa5849
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-48d6d836-7a27-4fca-b824-befac5fa5849"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-df3d72b5-e446-461a-916d-5ffac26f9f8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df3d72b5-e446-461a-916d-5ffac26f9f8d
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-df3d72b5-e446-461a-916d-5ffac26f9f8d
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
correlation: qa-917d8128-d96d-4930-8f5d-ae3d7169f5d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-917d8128-d96d-4930-8f5d-ae3d7169f5d8
Content-Type: application/json

--- request body ---
{"handle":"qa-6fd6de0f9e39","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-917d8128-d96d-4930-8f5d-ae3d7169f5d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-917d8128-d96d-4930-8f5d-ae3d7169f5d8"}
```
