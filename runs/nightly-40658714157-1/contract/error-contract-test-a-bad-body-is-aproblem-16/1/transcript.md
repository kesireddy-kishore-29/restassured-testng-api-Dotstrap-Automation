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
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-c846128e-b384-4473-b137-4199a56b8de7` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-604fbdad-83fc-475b-bffb-5f6dbcae5488` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-c39e2301-199f-4057-a551-c2ebeda1a2ec` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-416efd50-928a-405d-bca8-0558ce17cc22` |
| 5 | `POST /v1/credits/purchases` | 415 | 4 | `qa-1e87f017-4ba7-4875-bfa5-2d249942e758` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-4bed7548-f60a-44b3-b5ea-18795a47e2c3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-d7a5c97a-e3b4-4d50-a009-10db8e926cd3` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-c48c9086-2e33-4f43-ba4e-adaa6a6da6a1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-c694ec04-612a-448b-90bf-e09df91f4ae7` |
| 10 | `POST /v1/auth/token` | 401 | 2 | `qa-94158079-7321-4d59-be24-f95828d1d21d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c846128e-b384-4473-b137-4199a56b8de7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c846128e-b384-4473-b137-4199a56b8de7
Content-Type: application/json

--- request body ---
{"handle":"qa-e1e271aa0a4b","displayName":"QA e1e271aa0a4b","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c846128e-b384-4473-b137-4199a56b8de7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 8
Location: /v1/accounts/qa-e1e271aa0a4b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8baf275b-b736-42ac-b488-efb98f954aba","handle":"qa-e1e271aa0a4b","displayName":"QA e1e271aa0a4b","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.356462496Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-604fbdad-83fc-475b-bffb-5f6dbcae5488

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-604fbdad-83fc-475b-bffb-5f6dbcae5488
Content-Type: application/json

--- request body ---
{"handle":"qa-242b13a2b0f0","displayName":"QA 242b13a2b0f0","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-604fbdad-83fc-475b-bffb-5f6dbcae5488
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 8
Location: /v1/accounts/qa-242b13a2b0f0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a964146f-e3d8-48db-8e3d-cf0ecf8e9ca2","handle":"qa-242b13a2b0f0","displayName":"QA 242b13a2b0f0","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.386995708Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c39e2301-199f-4057-a551-c2ebeda1a2ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c39e2301-199f-4057-a551-c2ebeda1a2ec
Content-Type: application/json

--- request body ---
{"handle":"qa-e1e271aa0a4b","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c39e2301-199f-4057-a551-c2ebeda1a2ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8baf275b-b736-42ac-b488-efb98f954aba"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-416efd50-928a-405d-bca8-0558ce17cc22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-416efd50-928a-405d-bca8-0558ce17cc22
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-242b13a2b0f0","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-416efd50-928a-405d-bca8-0558ce17cc22
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
Location: /v1/conversations/cnv_1a2f5f11-9040-4526-b3ee-ee9c6cd235c1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1a2f5f11-9040-4526-b3ee-ee9c6cd235c1","subject":"Error contract","status":"open","region":"eu","participants":["qa-e1e271aa0a4b","qa-242b13a2b0f0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:53.431030255Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1e87f017-4ba7-4875-bfa5-2d249942e758

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ac90c72570854af7ba326d58f5378409
X-Correlation-Id: qa-1e87f017-4ba7-4875-bfa5-2d249942e758
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e87f017-4ba7-4875-bfa5-2d249942e758
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-1e87f017-4ba7-4875-bfa5-2d249942e758"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4bed7548-f60a-44b3-b5ea-18795a47e2c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bed7548-f60a-44b3-b5ea-18795a47e2c3
Content-Type: application/json

--- request body ---
{"handle":"qa-242b13a2b0f0","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bed7548-f60a-44b3-b5ea-18795a47e2c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a964146f-e3d8-48db-8e3d-cf0ecf8e9ca2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d7a5c97a-e3b4-4d50-a009-10db8e926cd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7a5c97a-e3b4-4d50-a009-10db8e926cd3
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d7a5c97a-e3b4-4d50-a009-10db8e926cd3
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
correlation: qa-c48c9086-2e33-4f43-ba4e-adaa6a6da6a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c48c9086-2e33-4f43-ba4e-adaa6a6da6a1
Content-Type: application/json

--- request body ---
{"handle":"qa-242b13a2b0f0","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c48c9086-2e33-4f43-ba4e-adaa6a6da6a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c48c9086-2e33-4f43-ba4e-adaa6a6da6a1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c694ec04-612a-448b-90bf-e09df91f4ae7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c694ec04-612a-448b-90bf-e09df91f4ae7
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c694ec04-612a-448b-90bf-e09df91f4ae7
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
correlation: qa-94158079-7321-4d59-be24-f95828d1d21d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94158079-7321-4d59-be24-f95828d1d21d
Content-Type: application/json

--- request body ---
{"handle":"qa-e1e271aa0a4b","password":"****"}

--- response: 401 in 2 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94158079-7321-4d59-be24-f95828d1d21d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-94158079-7321-4d59-be24-f95828d1d21d"}
```
