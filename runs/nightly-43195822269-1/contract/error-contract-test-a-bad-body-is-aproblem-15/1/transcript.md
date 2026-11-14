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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-262b73c5-0150-4456-99bd-5d1a55623a3b` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-464afdee-c278-4057-b296-4519e55f1a43` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-18899eba-5eb9-4014-b71c-ac55cc07d494` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-d7c8648b-613f-4d18-917b-0ec2e42e5d25` |
| 5 | `POST /v1/credits/purchases` | 400 | 8 | `qa-1f29f626-8a40-4614-b37f-ed80ec32a875` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-8e867ca8-07a3-4eea-9331-77e6f05ab501` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-74b0df18-d3a1-44c3-aa1a-96bcb1e2e617` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-29f3b49a-1ae9-4cfa-8ecf-761e2fae6207` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-2b6013c5-d582-4aae-9540-16fbff647f0b` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-df6510f9-540e-4935-a576-ae5ba3475607` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-262b73c5-0150-4456-99bd-5d1a55623a3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-262b73c5-0150-4456-99bd-5d1a55623a3b
Content-Type: application/json

--- request body ---
{"handle":"qa-fbefe336534f","displayName":"QA fbefe336534f","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-262b73c5-0150-4456-99bd-5d1a55623a3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 8
Location: /v1/accounts/qa-fbefe336534f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4e416c4b-d15a-4a7b-a3f0-51a070ea46a4","handle":"qa-fbefe336534f","displayName":"QA fbefe336534f","region":"eu","role":"user","createdAt":"2026-11-12T09:56:32.061680381Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-464afdee-c278-4057-b296-4519e55f1a43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-464afdee-c278-4057-b296-4519e55f1a43
Content-Type: application/json

--- request body ---
{"handle":"qa-b7c3eec284c9","displayName":"QA b7c3eec284c9","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-464afdee-c278-4057-b296-4519e55f1a43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 8
Location: /v1/accounts/qa-b7c3eec284c9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e83fdc65-f1b8-43db-b9bc-066d04ae244a","handle":"qa-b7c3eec284c9","displayName":"QA b7c3eec284c9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:32.096758219Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-18899eba-5eb9-4014-b71c-ac55cc07d494

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18899eba-5eb9-4014-b71c-ac55cc07d494
Content-Type: application/json

--- request body ---
{"handle":"qa-fbefe336534f","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-18899eba-5eb9-4014-b71c-ac55cc07d494
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4e416c4b-d15a-4a7b-a3f0-51a070ea46a4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d7c8648b-613f-4d18-917b-0ec2e42e5d25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7c8648b-613f-4d18-917b-0ec2e42e5d25
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b7c3eec284c9","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7c8648b-613f-4d18-917b-0ec2e42e5d25
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
Location: /v1/conversations/cnv_c6fb7cbd-eebf-406b-ba4d-0342be9c7ec8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c6fb7cbd-eebf-406b-ba4d-0342be9c7ec8","subject":"Error contract","status":"open","region":"eu","participants":["qa-fbefe336534f","qa-b7c3eec284c9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:32.150249160Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1f29f626-8a40-4614-b37f-ed80ec32a875

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5560caf6769d4c489db68fa4b40596bb
X-Correlation-Id: qa-1f29f626-8a40-4614-b37f-ed80ec32a875
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f29f626-8a40-4614-b37f-ed80ec32a875
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-1f29f626-8a40-4614-b37f-ed80ec32a875"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8e867ca8-07a3-4eea-9331-77e6f05ab501

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e867ca8-07a3-4eea-9331-77e6f05ab501
Content-Type: application/json

--- request body ---
{"handle":"qa-b7c3eec284c9","password":"****"}

--- response: 200 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e867ca8-07a3-4eea-9331-77e6f05ab501
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e83fdc65-f1b8-43db-b9bc-066d04ae244a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-74b0df18-d3a1-44c3-aa1a-96bcb1e2e617

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74b0df18-d3a1-44c3-aa1a-96bcb1e2e617
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-74b0df18-d3a1-44c3-aa1a-96bcb1e2e617
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
correlation: qa-29f3b49a-1ae9-4cfa-8ecf-761e2fae6207

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29f3b49a-1ae9-4cfa-8ecf-761e2fae6207
Content-Type: application/json

--- request body ---
{"handle":"qa-b7c3eec284c9","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29f3b49a-1ae9-4cfa-8ecf-761e2fae6207
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-29f3b49a-1ae9-4cfa-8ecf-761e2fae6207"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b6013c5-d582-4aae-9540-16fbff647f0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b6013c5-d582-4aae-9540-16fbff647f0b
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b6013c5-d582-4aae-9540-16fbff647f0b
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
correlation: qa-df6510f9-540e-4935-a576-ae5ba3475607

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df6510f9-540e-4935-a576-ae5ba3475607
Content-Type: application/json

--- request body ---
{"handle":"qa-fbefe336534f","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df6510f9-540e-4935-a576-ae5ba3475607
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-df6510f9-540e-4935-a576-ae5ba3475607"}
```
