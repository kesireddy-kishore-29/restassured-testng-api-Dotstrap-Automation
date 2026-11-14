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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-0065b89f-d4a4-4c43-9c3a-abb477ac9b4c` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-a32ce63c-d70f-4605-a7ff-a55afd1506aa` |
| 3 | `POST /v1/auth/token` | 200 | 61 | `qa-40e5d332-2608-4248-ae84-e9e8e267e3f1` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-9019e4fc-1be5-451f-ab27-d093c0db8d65` |
| 5 | `POST /v1/credits/purchases` | 400 | 8 | `qa-a2f4ad4f-90de-46f4-88ee-0c1c66fd24e1` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-41eb7a34-8953-4d3e-b45b-6eb9b85bbc9e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-e4d1e698-afdf-472c-866c-d5a33d0dd2d5` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-b94f3afe-aaed-47bc-9219-d08c302a27a0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-b8455e46-6a34-45fb-b161-856e244f470f` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-ddc9a50a-db6c-498a-8540-f96f28f61722` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0065b89f-d4a4-4c43-9c3a-abb477ac9b4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0065b89f-d4a4-4c43-9c3a-abb477ac9b4c
Content-Type: application/json

--- request body ---
{"handle":"qa-57637902c20a","displayName":"QA 57637902c20a","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-0065b89f-d4a4-4c43-9c3a-abb477ac9b4c
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
Location: /v1/accounts/qa-57637902c20a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_45457d7a-5830-4ca3-b9db-7ff6e08852f9","handle":"qa-57637902c20a","displayName":"QA 57637902c20a","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.860456379Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a32ce63c-d70f-4605-a7ff-a55afd1506aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a32ce63c-d70f-4605-a7ff-a55afd1506aa
Content-Type: application/json

--- request body ---
{"handle":"qa-6d7eb7da9c26","displayName":"QA 6d7eb7da9c26","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a32ce63c-d70f-4605-a7ff-a55afd1506aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 7
Location: /v1/accounts/qa-6d7eb7da9c26
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d498019-b260-4558-89c6-4b39526755c2","handle":"qa-6d7eb7da9c26","displayName":"QA 6d7eb7da9c26","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.901389007Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-40e5d332-2608-4248-ae84-e9e8e267e3f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40e5d332-2608-4248-ae84-e9e8e267e3f1
Content-Type: application/json

--- request body ---
{"handle":"qa-57637902c20a","password":"****"}

--- response: 200 in 61 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-40e5d332-2608-4248-ae84-e9e8e267e3f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_45457d7a-5830-4ca3-b9db-7ff6e08852f9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9019e4fc-1be5-451f-ab27-d093c0db8d65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9019e4fc-1be5-451f-ab27-d093c0db8d65
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6d7eb7da9c26","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-9019e4fc-1be5-451f-ab27-d093c0db8d65
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
Location: /v1/conversations/cnv_542a2859-5db4-4e34-8743-83ee73bcdd9d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_542a2859-5db4-4e34-8743-83ee73bcdd9d","subject":"Error contract","status":"open","region":"eu","participants":["qa-57637902c20a","qa-6d7eb7da9c26"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:39.008985019Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a2f4ad4f-90de-46f4-88ee-0c1c66fd24e1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f96c022ac0284ef494427df3ce77027d
X-Correlation-Id: qa-a2f4ad4f-90de-46f4-88ee-0c1c66fd24e1
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2f4ad4f-90de-46f4-88ee-0c1c66fd24e1
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-a2f4ad4f-90de-46f4-88ee-0c1c66fd24e1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-41eb7a34-8953-4d3e-b45b-6eb9b85bbc9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41eb7a34-8953-4d3e-b45b-6eb9b85bbc9e
Content-Type: application/json

--- request body ---
{"handle":"qa-6d7eb7da9c26","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-41eb7a34-8953-4d3e-b45b-6eb9b85bbc9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d498019-b260-4558-89c6-4b39526755c2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e4d1e698-afdf-472c-866c-d5a33d0dd2d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4d1e698-afdf-472c-866c-d5a33d0dd2d5
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e4d1e698-afdf-472c-866c-d5a33d0dd2d5
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
correlation: qa-b94f3afe-aaed-47bc-9219-d08c302a27a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b94f3afe-aaed-47bc-9219-d08c302a27a0
Content-Type: application/json

--- request body ---
{"handle":"qa-6d7eb7da9c26","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b94f3afe-aaed-47bc-9219-d08c302a27a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b94f3afe-aaed-47bc-9219-d08c302a27a0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b8455e46-6a34-45fb-b161-856e244f470f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8455e46-6a34-45fb-b161-856e244f470f
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b8455e46-6a34-45fb-b161-856e244f470f
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
correlation: qa-ddc9a50a-db6c-498a-8540-f96f28f61722

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddc9a50a-db6c-498a-8540-f96f28f61722
Content-Type: application/json

--- request body ---
{"handle":"qa-57637902c20a","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddc9a50a-db6c-498a-8540-f96f28f61722
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ddc9a50a-db6c-498a-8540-f96f28f61722"}
```
