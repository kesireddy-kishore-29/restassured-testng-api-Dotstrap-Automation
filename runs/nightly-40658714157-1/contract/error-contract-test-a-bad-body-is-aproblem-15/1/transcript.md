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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-34f16dc8-51f3-414f-a4a8-6874e9f765ad` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-add29788-e1c1-4904-900a-2721f9c549e4` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-4a9331d8-2220-4239-8681-2e8417a8b1c6` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-5642bb98-0222-43f7-8203-4c7679c20cf9` |
| 5 | `POST /v1/credits/purchases` | 400 | 11 | `qa-a8a6cf8b-048a-4b83-b363-d66f773d6771` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-fd24b66a-6ca6-4b33-b6f4-7051d96099b5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-7c95b5c6-4b1d-4ba4-b935-591a8fbb02b4` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-d9e488af-b6cd-48c9-a1d1-6b1517e4116d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-833c15d2-97d1-42ef-9236-3906c6c134ea` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-722c3be8-0f89-41b0-b67a-1adf7ff00238` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-34f16dc8-51f3-414f-a4a8-6874e9f765ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34f16dc8-51f3-414f-a4a8-6874e9f765ad
Content-Type: application/json

--- request body ---
{"handle":"qa-1f08abad897d","displayName":"QA 1f08abad897d","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-34f16dc8-51f3-414f-a4a8-6874e9f765ad
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
Location: /v1/accounts/qa-1f08abad897d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc0aecd1-76f6-486d-b19f-e204be69c825","handle":"qa-1f08abad897d","displayName":"QA 1f08abad897d","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.149885767Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-add29788-e1c1-4904-900a-2721f9c549e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-add29788-e1c1-4904-900a-2721f9c549e4
Content-Type: application/json

--- request body ---
{"handle":"qa-60e004c46fcc","displayName":"QA 60e004c46fcc","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-add29788-e1c1-4904-900a-2721f9c549e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 8
Location: /v1/accounts/qa-60e004c46fcc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_065fd53d-0c03-43c5-b665-9274bbc454f9","handle":"qa-60e004c46fcc","displayName":"QA 60e004c46fcc","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.186813205Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4a9331d8-2220-4239-8681-2e8417a8b1c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a9331d8-2220-4239-8681-2e8417a8b1c6
Content-Type: application/json

--- request body ---
{"handle":"qa-1f08abad897d","password":"****"}

--- response: 200 in 35 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a9331d8-2220-4239-8681-2e8417a8b1c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fc0aecd1-76f6-486d-b19f-e204be69c825"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5642bb98-0222-43f7-8203-4c7679c20cf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5642bb98-0222-43f7-8203-4c7679c20cf9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-60e004c46fcc","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5642bb98-0222-43f7-8203-4c7679c20cf9
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
Location: /v1/conversations/cnv_6a64df76-84d7-4096-a963-5dadf732042b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6a64df76-84d7-4096-a963-5dadf732042b","subject":"Error contract","status":"open","region":"eu","participants":["qa-1f08abad897d","qa-60e004c46fcc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:53.261042429Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a8a6cf8b-048a-4b83-b363-d66f773d6771

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3b2f430b0981428b9f3572780e9d561e
X-Correlation-Id: qa-a8a6cf8b-048a-4b83-b363-d66f773d6771
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8a6cf8b-048a-4b83-b363-d66f773d6771
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-a8a6cf8b-048a-4b83-b363-d66f773d6771"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fd24b66a-6ca6-4b33-b6f4-7051d96099b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd24b66a-6ca6-4b33-b6f4-7051d96099b5
Content-Type: application/json

--- request body ---
{"handle":"qa-60e004c46fcc","password":"****"}

--- response: 200 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd24b66a-6ca6-4b33-b6f4-7051d96099b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_065fd53d-0c03-43c5-b665-9274bbc454f9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7c95b5c6-4b1d-4ba4-b935-591a8fbb02b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c95b5c6-4b1d-4ba4-b935-591a8fbb02b4
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7c95b5c6-4b1d-4ba4-b935-591a8fbb02b4
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
correlation: qa-d9e488af-b6cd-48c9-a1d1-6b1517e4116d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9e488af-b6cd-48c9-a1d1-6b1517e4116d
Content-Type: application/json

--- request body ---
{"handle":"qa-60e004c46fcc","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9e488af-b6cd-48c9-a1d1-6b1517e4116d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d9e488af-b6cd-48c9-a1d1-6b1517e4116d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-833c15d2-97d1-42ef-9236-3906c6c134ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-833c15d2-97d1-42ef-9236-3906c6c134ea
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-833c15d2-97d1-42ef-9236-3906c6c134ea
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
correlation: qa-722c3be8-0f89-41b0-b67a-1adf7ff00238

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-722c3be8-0f89-41b0-b67a-1adf7ff00238
Content-Type: application/json

--- request body ---
{"handle":"qa-1f08abad897d","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-722c3be8-0f89-41b0-b67a-1adf7ff00238
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-722c3be8-0f89-41b0-b67a-1adf7ff00238"}
```
