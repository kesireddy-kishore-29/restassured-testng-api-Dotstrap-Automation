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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-dc8ac887-fbeb-4cf1-91d6-dae552bb5b46` |
| 2 | `POST /v1/accounts` | 201 | 59 | `qa-08034fb0-aeb8-489f-ab7a-28d710f37c1b` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-22ea85b6-c152-4030-b6c2-46c55b3c8366` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-8a4b2cd0-3244-4f70-be6f-6a3e2cc881df` |
| 5 | `POST /v1/credits/purchases` | 400 | 20 | `qa-a3a6c4a1-4fa3-4333-bded-064f47cd67c9` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-c083b245-e27b-44b9-8413-1c0b759760e8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-cac44e56-92da-4949-81f1-55606740125f` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-d604ddf4-afc4-4826-a9e7-391f5ceba07e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-28e0b579-1c64-4c18-aa5b-67bd040feb10` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-729bef96-7f2d-478e-92d8-266bcdd2f3cc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dc8ac887-fbeb-4cf1-91d6-dae552bb5b46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc8ac887-fbeb-4cf1-91d6-dae552bb5b46
Content-Type: application/json

--- request body ---
{"handle":"qa-10dfced3ab4d","displayName":"QA 10dfced3ab4d","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc8ac887-fbeb-4cf1-91d6-dae552bb5b46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 6
Location: /v1/accounts/qa-10dfced3ab4d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0ab7e938-70ee-4e66-a08a-0a051c9cb07d","handle":"qa-10dfced3ab4d","displayName":"QA 10dfced3ab4d","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.375809702Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-08034fb0-aeb8-489f-ab7a-28d710f37c1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08034fb0-aeb8-489f-ab7a-28d710f37c1b
Content-Type: application/json

--- request body ---
{"handle":"qa-cd04aefcb01e","displayName":"QA cd04aefcb01e","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-08034fb0-aeb8-489f-ab7a-28d710f37c1b
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
Location: /v1/accounts/qa-cd04aefcb01e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f03d22aa-9610-4d26-82fa-2a2b6845e90a","handle":"qa-cd04aefcb01e","displayName":"QA cd04aefcb01e","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.434112686Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-22ea85b6-c152-4030-b6c2-46c55b3c8366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22ea85b6-c152-4030-b6c2-46c55b3c8366
Content-Type: application/json

--- request body ---
{"handle":"qa-10dfced3ab4d","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-22ea85b6-c152-4030-b6c2-46c55b3c8366
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0ab7e938-70ee-4e66-a08a-0a051c9cb07d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8a4b2cd0-3244-4f70-be6f-6a3e2cc881df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a4b2cd0-3244-4f70-be6f-6a3e2cc881df
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cd04aefcb01e","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a4b2cd0-3244-4f70-be6f-6a3e2cc881df
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
Location: /v1/conversations/cnv_248c47f4-f281-41e5-8091-53aef544f5fe
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_248c47f4-f281-41e5-8091-53aef544f5fe","subject":"Error contract","status":"open","region":"eu","participants":["qa-10dfced3ab4d","qa-cd04aefcb01e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:34.541277002Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a3a6c4a1-4fa3-4333-bded-064f47cd67c9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-72b241a3a97b408abe46f6dd4b2c704e
X-Correlation-Id: qa-a3a6c4a1-4fa3-4333-bded-064f47cd67c9
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a3a6c4a1-4fa3-4333-bded-064f47cd67c9
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-a3a6c4a1-4fa3-4333-bded-064f47cd67c9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c083b245-e27b-44b9-8413-1c0b759760e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c083b245-e27b-44b9-8413-1c0b759760e8
Content-Type: application/json

--- request body ---
{"handle":"qa-cd04aefcb01e","password":"****"}

--- response: 200 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c083b245-e27b-44b9-8413-1c0b759760e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f03d22aa-9610-4d26-82fa-2a2b6845e90a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cac44e56-92da-4949-81f1-55606740125f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cac44e56-92da-4949-81f1-55606740125f
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cac44e56-92da-4949-81f1-55606740125f
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
correlation: qa-d604ddf4-afc4-4826-a9e7-391f5ceba07e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d604ddf4-afc4-4826-a9e7-391f5ceba07e
Content-Type: application/json

--- request body ---
{"handle":"qa-cd04aefcb01e","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d604ddf4-afc4-4826-a9e7-391f5ceba07e
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d604ddf4-afc4-4826-a9e7-391f5ceba07e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-28e0b579-1c64-4c18-aa5b-67bd040feb10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28e0b579-1c64-4c18-aa5b-67bd040feb10
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-28e0b579-1c64-4c18-aa5b-67bd040feb10
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
correlation: qa-729bef96-7f2d-478e-92d8-266bcdd2f3cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-729bef96-7f2d-478e-92d8-266bcdd2f3cc
Content-Type: application/json

--- request body ---
{"handle":"qa-10dfced3ab4d","password":"****"}

--- response: 401 in 26 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-729bef96-7f2d-478e-92d8-266bcdd2f3cc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-729bef96-7f2d-478e-92d8-266bcdd2f3cc"}
```
