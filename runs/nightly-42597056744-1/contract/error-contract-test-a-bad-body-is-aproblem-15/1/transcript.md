# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-fd8a910d-739e-4f01-9158-54e7ecf5997f` |
| 2 | `POST /v1/accounts` | 201 | 10 | `qa-e7d25cd4-9355-454e-9aae-9905a1925d98` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-29496b1a-552b-42dc-9335-8192e5d988c6` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-7875799d-6dfa-4b53-b2f2-4871dfd02fce` |
| 5 | `POST /v1/credits/purchases` | 400 | 31 | `qa-0b5b6c29-e105-4d5f-ac68-2cfe3b0c0216` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-63ce6090-73a2-4e24-ad77-5ae41ca5f7ed` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-65647c76-3fce-48cb-a396-d7d024b9a497` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-866b839c-37d2-4f25-a98d-9624a311815f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-81179a6d-2d9e-47eb-bdcf-fcf184d9e863` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-25178ee6-ae6c-4723-9022-218c02acd62f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fd8a910d-739e-4f01-9158-54e7ecf5997f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd8a910d-739e-4f01-9158-54e7ecf5997f
Content-Type: application/json

--- request body ---
{"handle":"qa-114fb3fa8516","displayName":"QA 114fb3fa8516","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd8a910d-739e-4f01-9158-54e7ecf5997f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 8
Location: /v1/accounts/qa-114fb3fa8516
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cd6d7b18-e7d3-4ddf-a28c-ee1bf2ede00f","handle":"qa-114fb3fa8516","displayName":"QA 114fb3fa8516","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.667416556Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e7d25cd4-9355-454e-9aae-9905a1925d98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7d25cd4-9355-454e-9aae-9905a1925d98
Content-Type: application/json

--- request body ---
{"handle":"qa-f12eec03c5d9","displayName":"QA f12eec03c5d9","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7d25cd4-9355-454e-9aae-9905a1925d98
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
Location: /v1/accounts/qa-f12eec03c5d9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_64be7b84-9513-4da9-baa2-7071c6dd7bdf","handle":"qa-f12eec03c5d9","displayName":"QA f12eec03c5d9","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.686464447Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-29496b1a-552b-42dc-9335-8192e5d988c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29496b1a-552b-42dc-9335-8192e5d988c6
Content-Type: application/json

--- request body ---
{"handle":"qa-114fb3fa8516","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-29496b1a-552b-42dc-9335-8192e5d988c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd6d7b18-e7d3-4ddf-a28c-ee1bf2ede00f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7875799d-6dfa-4b53-b2f2-4871dfd02fce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7875799d-6dfa-4b53-b2f2-4871dfd02fce
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f12eec03c5d9","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7875799d-6dfa-4b53-b2f2-4871dfd02fce
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
Location: /v1/conversations/cnv_1f831522-3593-4389-9f91-adffa73890f5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1f831522-3593-4389-9f91-adffa73890f5","subject":"Error contract","status":"open","region":"eu","participants":["qa-114fb3fa8516","qa-f12eec03c5d9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.724996309Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0b5b6c29-e105-4d5f-ac68-2cfe3b0c0216

--- request headers ---
Accept: application/json
Idempotency-Key: qa-efc7a166309e4c22b28ded62ed40952a
X-Correlation-Id: qa-0b5b6c29-e105-4d5f-ac68-2cfe3b0c0216
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 31 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b5b6c29-e105-4d5f-ac68-2cfe3b0c0216
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-0b5b6c29-e105-4d5f-ac68-2cfe3b0c0216"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-63ce6090-73a2-4e24-ad77-5ae41ca5f7ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63ce6090-73a2-4e24-ad77-5ae41ca5f7ed
Content-Type: application/json

--- request body ---
{"handle":"qa-f12eec03c5d9","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-63ce6090-73a2-4e24-ad77-5ae41ca5f7ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64be7b84-9513-4da9-baa2-7071c6dd7bdf"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-65647c76-3fce-48cb-a396-d7d024b9a497

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65647c76-3fce-48cb-a396-d7d024b9a497
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-65647c76-3fce-48cb-a396-d7d024b9a497
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
correlation: qa-866b839c-37d2-4f25-a98d-9624a311815f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-866b839c-37d2-4f25-a98d-9624a311815f
Content-Type: application/json

--- request body ---
{"handle":"qa-f12eec03c5d9","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-866b839c-37d2-4f25-a98d-9624a311815f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-866b839c-37d2-4f25-a98d-9624a311815f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81179a6d-2d9e-47eb-bdcf-fcf184d9e863

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81179a6d-2d9e-47eb-bdcf-fcf184d9e863
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81179a6d-2d9e-47eb-bdcf-fcf184d9e863
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
correlation: qa-25178ee6-ae6c-4723-9022-218c02acd62f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25178ee6-ae6c-4723-9022-218c02acd62f
Content-Type: application/json

--- request body ---
{"handle":"qa-114fb3fa8516","password":"****"}

--- response: 401 in 26 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25178ee6-ae6c-4723-9022-218c02acd62f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-25178ee6-ae6c-4723-9022-218c02acd62f"}
```
