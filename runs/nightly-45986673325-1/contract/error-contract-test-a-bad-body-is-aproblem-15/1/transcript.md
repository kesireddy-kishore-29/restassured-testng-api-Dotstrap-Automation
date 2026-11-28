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
| 1 | `POST /v1/accounts` | 201 | 59 | `qa-2dfab310-5c1c-4121-a94f-eb5bf2d9dff1` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-fbae4106-2a11-4897-a65d-80a5664f09be` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-09559bde-51b8-488e-814a-c7013fa13347` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-7192eb3c-1ad4-416d-a2bc-c51087153805` |
| 5 | `POST /v1/credits/purchases` | 400 | 14 | `qa-6de44cec-71d2-4049-bd7e-d444ebc323ca` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-032b754c-370b-490c-9bab-7e1aebfac472` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-99c8ac41-9840-451b-9f86-a1717f387611` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-7d1f1719-3311-4b8a-9730-81b8deae54f9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-c1de610c-7cae-431e-9893-7fb4c9556da3` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-fb875b6f-773a-4168-801c-28454978452b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2dfab310-5c1c-4121-a94f-eb5bf2d9dff1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dfab310-5c1c-4121-a94f-eb5bf2d9dff1
Content-Type: application/json

--- request body ---
{"handle":"qa-2c91971f751f","displayName":"QA 2c91971f751f","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dfab310-5c1c-4121-a94f-eb5bf2d9dff1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 7
Location: /v1/accounts/qa-2c91971f751f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a7e69166-4f9e-4532-afa0-71c948ff6c40","handle":"qa-2c91971f751f","displayName":"QA 2c91971f751f","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.839682795Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fbae4106-2a11-4897-a65d-80a5664f09be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbae4106-2a11-4897-a65d-80a5664f09be
Content-Type: application/json

--- request body ---
{"handle":"qa-f07d04d0c20d","displayName":"QA f07d04d0c20d","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbae4106-2a11-4897-a65d-80a5664f09be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 6
Location: /v1/accounts/qa-f07d04d0c20d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28dc8dc2-b314-4188-970b-2ac21b282e58","handle":"qa-f07d04d0c20d","displayName":"QA f07d04d0c20d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.921094548Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-09559bde-51b8-488e-814a-c7013fa13347

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09559bde-51b8-488e-814a-c7013fa13347
Content-Type: application/json

--- request body ---
{"handle":"qa-2c91971f751f","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-09559bde-51b8-488e-814a-c7013fa13347
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7e69166-4f9e-4532-afa0-71c948ff6c40"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7192eb3c-1ad4-416d-a2bc-c51087153805

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7192eb3c-1ad4-416d-a2bc-c51087153805
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f07d04d0c20d","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-7192eb3c-1ad4-416d-a2bc-c51087153805
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
Location: /v1/conversations/cnv_bf051474-4e97-4222-bb27-7e92e8617ac5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bf051474-4e97-4222-bb27-7e92e8617ac5","subject":"Error contract","status":"open","region":"eu","participants":["qa-2c91971f751f","qa-f07d04d0c20d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T11:00:00.002306451Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6de44cec-71d2-4049-bd7e-d444ebc323ca

--- request headers ---
Accept: application/json
Idempotency-Key: qa-af647637202a4c2ca84b048ed7be7c30
X-Correlation-Id: qa-6de44cec-71d2-4049-bd7e-d444ebc323ca
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 14 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6de44cec-71d2-4049-bd7e-d444ebc323ca
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-6de44cec-71d2-4049-bd7e-d444ebc323ca"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-032b754c-370b-490c-9bab-7e1aebfac472

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-032b754c-370b-490c-9bab-7e1aebfac472
Content-Type: application/json

--- request body ---
{"handle":"qa-f07d04d0c20d","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-032b754c-370b-490c-9bab-7e1aebfac472
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28dc8dc2-b314-4188-970b-2ac21b282e58"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-99c8ac41-9840-451b-9f86-a1717f387611

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99c8ac41-9840-451b-9f86-a1717f387611
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-99c8ac41-9840-451b-9f86-a1717f387611
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
correlation: qa-7d1f1719-3311-4b8a-9730-81b8deae54f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d1f1719-3311-4b8a-9730-81b8deae54f9
Content-Type: application/json

--- request body ---
{"handle":"qa-f07d04d0c20d","password":"****"}

--- response: 401 in 26 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d1f1719-3311-4b8a-9730-81b8deae54f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7d1f1719-3311-4b8a-9730-81b8deae54f9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c1de610c-7cae-431e-9893-7fb4c9556da3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1de610c-7cae-431e-9893-7fb4c9556da3
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c1de610c-7cae-431e-9893-7fb4c9556da3
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
correlation: qa-fb875b6f-773a-4168-801c-28454978452b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb875b6f-773a-4168-801c-28454978452b
Content-Type: application/json

--- request body ---
{"handle":"qa-2c91971f751f","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb875b6f-773a-4168-801c-28454978452b
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fb875b6f-773a-4168-801c-28454978452b"}
```
